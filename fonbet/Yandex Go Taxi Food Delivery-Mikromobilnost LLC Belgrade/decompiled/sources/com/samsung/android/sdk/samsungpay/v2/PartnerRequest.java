package com.samsung.android.sdk.samsungpay.v2;

import android.content.ActivityNotFoundException;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.samsung.android.sdk.samsungpay.v2.SpaySdk;
import defpackage.mbb;
import defpackage.ny61;
import defpackage.sd30;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class PartnerRequest {
    private static Handler r = new Handler(Looper.getMainLooper());
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object[] g;
    public SpaySdk m;
    private b p;
    private c q;
    private final String a = "SPAYSDK:PartnerRequest";
    public boolean i = true;
    public boolean j = false;
    public String k = "unknown";
    public boolean l = false;
    public SpaySdk.SdkApiLevel n = SpaySdk.SdkApiLevel.LEVEL_UNKNOWN;
    public boolean o = false;
    private PartnerRequestState h = PartnerRequestState.NONE;

    public enum PartnerRequestState {
        NONE,
        PROCESSING,
        SESSION
    }

    public static class a {
        private PartnerRequest a;

        public a(SpaySdk spaySdk, int i, Object obj) {
            PartnerRequest partnerRequest = new PartnerRequest(i, obj);
            this.a = partnerRequest;
            partnerRequest.m = spaySdk;
        }

        public a a(Object... objArr) {
            this.a.g = objArr;
            return this;
        }

        public PartnerRequest b() {
            return this.a;
        }

        public a c(boolean z) {
            this.a.i = z;
            return this;
        }

        public a d(b bVar) {
            this.a.p = bVar;
            return this;
        }

        public a e(c cVar) {
            this.a.q = cVar;
            return this;
        }

        public a f(String str) {
            this.a.k = str;
            return this;
        }

        public a g(Object obj) {
            this.a.c = obj;
            return this;
        }

        public a h(Object obj) {
            this.a.d = obj;
            return this;
        }
    }

    public interface b {
        void d(ErrorType errorType, int i, Bundle bundle);
    }

    public interface c {
        void a(IInterface iInterface, PartnerRequest partnerRequest) throws RemoteException, ActivityNotFoundException, PackageManager.NameNotFoundException;
    }

    public PartnerRequest(int i, Object obj) {
        this.b = i;
        this.f = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(ErrorType errorType, int i, Bundle bundle) {
        this.p.d(errorType, i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(f fVar) {
        try {
            IInterface E = fVar.E();
            if (E == null && this.i) {
                Log.e("SPAYSDK:PartnerRequest", "Can't execute request because Stub is null");
                throw new RemoteException();
            }
            j();
            this.q.a(E, this);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("SPAYSDK:PartnerRequest", "NameNotFoundException while executing request: " + e.toString());
            e(ErrorType.NAME_NOT_FOUND_EXCEPTION, -103, new Bundle());
            fVar.I();
        } catch (RemoteException e2) {
            Log.e("SPAYSDK:PartnerRequest", "RemoteException while executing request: " + e2.toString());
            e(ErrorType.REMOTE_EXCEPTION, -103, new Bundle());
            fVar.I();
        } catch (Exception unused) {
            Log.e("SPAYSDK:PartnerRequest", "Unknown exception while executing request: ");
            e(ErrorType.REMOTE_EXCEPTION, -103, new Bundle());
            fVar.I();
        }
    }

    private void i(ErrorType errorType, int i) {
        Log.e("SPAYSDK:PartnerRequest", this.k + " - error: " + errorType + Extension.FIX_SPACE + i);
    }

    private void j() {
        Bundle data = this.m.c.getData();
        if (data == null) {
            data = new Bundle();
            this.m.c.setData(data);
        }
        SpaySdk.SdkApiLevel sdkApiLevel = this.n;
        if (sdkApiLevel != SpaySdk.SdkApiLevel.LEVEL_UNKNOWN) {
            data.putString("PartnerSdkApiLevel", sdkApiLevel.b());
        } else {
            ny61.g("Api Level defined in manifest is empty");
        }
    }

    public void e(ErrorType errorType, int i, Bundle bundle) {
        i(errorType, i);
        if (this.p != null) {
            r.post(new mbb(this, errorType, i, bundle, 5));
            return;
        }
        Log.e("SPAYSDK:PartnerRequest", "No error catcher: errorType: " + errorType + " - errorCode: " + i);
    }

    public void f(f fVar) {
        if (this.q == null) {
            Log.e("SPAYSDK:PartnerRequest", "No request handler");
            return;
        }
        sd30 sd30Var = new sd30(27, this, fVar);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            sd30Var.run();
        } else {
            r.post(sd30Var);
        }
    }
}
