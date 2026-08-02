package com.samsung.android.sdk.samsungpay.v2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.samsung.android.sdk.samsungpay.v2.ISPartnerAppDeathDetector;
import java.util.Objects;

/* loaded from: classes11.dex */
public abstract class ServiceHelper {
    private Context a;
    private c b;
    protected com.samsung.android.sdk.samsungpay.v2.b f;
    private String c = "";
    private IBinder d = null;
    private String e = "";
    private long g = 0;
    private ServiceConnection h = new ServiceConnection() { // from class: com.samsung.android.sdk.samsungpay.v2.ServiceHelper.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (ServiceHelper.this.f.d()) {
                Log.e("SPAYSDK:ServiceHelper", "service timeouted");
            } else {
                Log.i("SPAYSDK:ServiceHelper", "service connected : " + iBinder.toString());
                ServiceHelper.this.l(iBinder);
                ServiceHelper.this.b.c(iBinder);
            }
            ServiceHelper.this.f.f();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.i("SPAYSDK:ServiceHelper", "service disconnected");
            ServiceHelper.this.k();
            ServiceHelper.this.f.f();
            ServiceHelper.this.b.b();
        }
    };

    public enum BindingResult {
        EXIST_BINDER,
        BINDING_SERVICE,
        BINDING_SERVICE_ALREADY,
        CANNOT_BIND,
        DISCONNECTED_SERVICE
    }

    public class a extends com.samsung.android.sdk.samsungpay.v2.b {
        public a(long j) {
            super(j);
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.b
        public void g() {
            if (d()) {
                Log.i("SPAYSDK:ServiceHelper", "Samsung Pay bind timeout and max retry is reached. Quit");
                ServiceHelper.this.b.a(BindingResult.CANNOT_BIND);
            } else {
                Log.i("SPAYSDK:ServiceHelper", "Samsung Pay bind timeout. Binder not available. trying again.");
                BindingResult c = ServiceHelper.this.c();
                ServiceHelper serviceHelper = ServiceHelper.this;
                serviceHelper.d(serviceHelper.b, c);
            }
        }
    }

    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BindingResult.values().length];
            a = iArr;
            try {
                iArr[BindingResult.BINDING_SERVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[BindingResult.BINDING_SERVICE_ALREADY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[BindingResult.CANNOT_BIND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[BindingResult.EXIST_BINDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface c {
        void a(BindingResult bindingResult);

        void b();

        void c(IBinder iBinder);
    }

    public ServiceHelper(Context context) {
        h(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized BindingResult c() {
        boolean j = j();
        com.samsung.android.sdk.samsungpay.v2.b bVar = this.f;
        if (j) {
            bVar.f();
            return BindingResult.EXIST_BINDER;
        }
        if (bVar.e()) {
            return BindingResult.BINDING_SERVICE_ALREADY;
        }
        if (i()) {
            return BindingResult.CANNOT_BIND;
        }
        Intent intent = new Intent(this.e);
        intent.setPackage(this.c);
        ISPartnerAppDeathDetector.Stub stub = new ISPartnerAppDeathDetector.Stub() { // from class: com.samsung.android.sdk.samsungpay.v2.ServiceHelper.3
        };
        Bundle bundle = new Bundle();
        bundle.putBinder("deathDetectorBinder", stub);
        intent.putExtras(bundle);
        if (this.f.h()) {
            if (this.a.bindService(intent, this.h, 65)) {
                Objects.toString(this.a);
                return BindingResult.BINDING_SERVICE;
            }
            this.f.f();
        }
        return BindingResult.CANNOT_BIND;
    }

    private boolean i() {
        return "".equals(this.e);
    }

    public void d(c cVar, BindingResult bindingResult) {
        int i = b.a[bindingResult.ordinal()];
        if (i != 1) {
            if (i == 2) {
                Log.i("SPAYSDK:ServiceHelper", "request to bind already");
                return;
            }
            if (i == 3) {
                Log.e("SPAYSDK:ServiceHelper", "pay app service is not available");
                cVar.a(bindingResult);
            } else if (i != 4) {
                Log.e("SPAYSDK:ServiceHelper", "must not come into here.");
                cVar.a(bindingResult);
            } else {
                Log.i("SPAYSDK:ServiceHelper", "exist binder.");
                cVar.c(g());
            }
        }
    }

    public void e(c cVar, String str) {
        this.b = cVar;
        this.e = str;
        this.f = new a(this.g);
        d(this.b, c());
    }

    public Context f() {
        return this.a;
    }

    public IBinder g() {
        return this.d;
    }

    public void h(Context context) {
        this.a = context.getApplicationContext();
        this.c = "com.samsung.android.spay";
    }

    public synchronized boolean j() {
        IBinder g = g();
        if (g != null && g.isBinderAlive()) {
            return true;
        }
        k();
        return false;
    }

    public void k() {
        this.d = null;
    }

    public void l(IBinder iBinder) {
        this.d = iBinder;
    }

    public synchronized void m() {
        if (j()) {
            Objects.toString(this.a);
            try {
                this.a.unbindService(this.h);
            } catch (Exception e) {
                Log.e("SPAYSDK:ServiceHelper", "unbindService - e : " + e.getMessage());
            }
        }
        k();
    }
}
