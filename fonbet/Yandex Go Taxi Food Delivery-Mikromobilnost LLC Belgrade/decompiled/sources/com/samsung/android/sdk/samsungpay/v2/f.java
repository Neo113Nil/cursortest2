package com.samsung.android.sdk.samsungpay.v2;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.samsung.android.sdk.samsungpay.v2.ServiceHelper;
import com.samsung.android.sdk.samsungpay.v2.SpaySdk;
import defpackage.j7m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class f<T extends IInterface> extends ServiceHelper {
    private static HashMap<String, WeakReference<f>> u = new HashMap<>(5);
    private T i;
    private Queue<g> j;
    private d<T> k;
    private String l;
    private HandlerThread m;
    private Handler n;
    private final Queue<PartnerRequest> o;
    private Semaphore p;
    private Semaphore q;
    private final Object[] r;
    private ServiceHelper.c s;
    private Handler.Callback t;

    public class a implements ServiceHelper.c {
        public a() {
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.ServiceHelper.c
        public void a(ServiceHelper.BindingResult bindingResult) {
            synchronized (f.this.r) {
                while (!f.this.j.isEmpty()) {
                    try {
                        ((g) f.this.j.poll()).a(bindingResult);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            f.this.C();
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.ServiceHelper.c
        public void b() {
            Log.e("SPAYSDK:StubBase", "Service is disconnected");
            f.this.C();
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.ServiceHelper.c
        public void c(IBinder iBinder) {
            f.this.A();
            f.this.B(iBinder);
            synchronized (f.this.r) {
                while (!f.this.j.isEmpty()) {
                    try {
                        ((g) f.this.j.poll()).b(f.this.i);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public class b implements g {
        final /* synthetic */ PartnerRequest a;

        public b(PartnerRequest partnerRequest) {
            this.a = partnerRequest;
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.g
        public void a(ServiceHelper.BindingResult bindingResult) {
            this.a.e(ErrorType.BINDING_FAIL, -103, new Bundle());
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.g
        public void b(Object obj) {
            f.this.x(this.a);
        }
    }

    public static class c<T extends IInterface> {
        public f<T> a(Context context, String str, d<T> dVar) {
            WeakReference weakReference = (WeakReference) f.u.get(str);
            if (weakReference == null || weakReference.get() == null) {
                f<T> fVar = new f<>(context, str, dVar, null);
                f.u.put(str, new WeakReference(fVar));
                return fVar;
            }
            Log.i("SPAYSDK:StubBase", "Found stub reference of " + str);
            f<T> fVar2 = (f) weakReference.get();
            if (!TextUtils.equals(str, "com.samsung.android.spay.sdk.v2.service.AppToAppService")) {
                return fVar2;
            }
            synchronized (((f) fVar2).r) {
                try {
                    if (((f) fVar2).o.size() > 0) {
                        Log.i("SPAYSDK:StubBase", "Clear pending requests of " + str);
                        fVar2.y(false);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fVar2;
        }
    }

    public interface d<K extends IInterface> {
        K b(IBinder iBinder);
    }

    private f(Context context, String str, d<T> dVar) {
        super(context);
        this.i = null;
        this.j = new LinkedList();
        this.o = new LinkedList();
        this.p = new Semaphore(0);
        this.q = new Semaphore(0);
        this.r = new Object[0];
        this.s = new a();
        this.t = new j7m(3, this);
        this.l = str;
        this.k = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        synchronized (this.r) {
            try {
                if (this.m == null) {
                    HandlerThread handlerThread = new HandlerThread(this.l);
                    this.m = handlerThread;
                    handlerThread.start();
                    this.n = new Handler(this.m.getLooper(), this.t);
                    Log.i("SPAYSDK:StubBase", "createStub HandlerThread - " + this.m.getName());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public T B(IBinder iBinder) {
        synchronized (this.r) {
            try {
                if (iBinder == null) {
                    return null;
                }
                T b2 = this.k.b(iBinder);
                this.i = b2;
                return b2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        synchronized (this.r) {
            HandlerThread handlerThread = this.m;
            if (handlerThread != null) {
                handlerThread.getName();
                this.n.removeMessages(0);
                y(true);
                try {
                    this.m.quit();
                } catch (Exception e) {
                    Log.e("SPAYSDK:StubBase", "destroyHandlerThread - " + e.toString());
                }
                this.n = null;
                this.m = null;
            }
        }
    }

    private boolean F(int i) {
        synchronized (this.r) {
            try {
                Iterator<PartnerRequest> it = this.o.iterator();
                while (it.hasNext()) {
                    if (i == it.next().b) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean H(Message message) {
        PartnerRequest peek;
        boolean isEmpty;
        synchronized (this.r) {
            peek = this.o.peek();
        }
        if (peek == null) {
            return false;
        }
        this.p.release(100);
        this.p.drainPermits();
        peek.f(this);
        try {
            this.p.acquire();
            synchronized (this.r) {
                try {
                    if (!this.o.isEmpty() && this.o.peek() == peek) {
                        this.o.remove(peek);
                    }
                    isEmpty = this.o.isEmpty();
                    if (isEmpty) {
                        this.q.release(100);
                        this.q.drainPermits();
                    }
                } finally {
                }
            }
            if (isEmpty) {
                this.q.tryAcquire(5L, TimeUnit.SECONDS);
            }
            synchronized (this.r) {
                try {
                    if (this.o.isEmpty()) {
                        D();
                    } else {
                        this.n.sendEmptyMessage(0);
                    }
                } finally {
                }
            }
        } catch (InterruptedException e) {
            Log.e("SPAYSDK:StubBase", "onRequestHandler - " + e.toString());
        }
        return false;
    }

    private void K() {
        synchronized (this.r) {
            this.i = null;
        }
    }

    private boolean L(PartnerRequest partnerRequest, SpaySdk.SdkApiLevel sdkApiLevel) {
        if (partnerRequest.j && F(partnerRequest.b)) {
            partnerRequest.e(ErrorType.DUPLICATED_REQUEST, -105, null);
            return false;
        }
        e eVar = new e(f(), partnerRequest.l);
        int n = eVar.n(partnerRequest.m.c, sdkApiLevel, partnerRequest);
        Bundle bundle = new Bundle();
        bundle.putInt("errorReason", n);
        int e = eVar.e(n);
        boolean z = e == -99;
        boolean z2 = partnerRequest.i;
        boolean z3 = z2 && 2 != e;
        boolean z4 = !z2 && e == 0;
        if (z) {
            partnerRequest.e(ErrorType.PARTNER_INFO_INVALID, e, bundle);
            return false;
        }
        if (z3 || z4) {
            partnerRequest.e(ErrorType.SPAY_VALIDITY_FAIL, e, bundle);
            return false;
        }
        partnerRequest.n = eVar.i();
        Bundle data = partnerRequest.m.c.getData();
        String string = data.getString("PartnerServiceType");
        if (SpaySdk.ServiceType.WEB_PAYMENT.toString().equals(string) || SpaySdk.ServiceType.MOBILEWEB_PAYMENT.toString().equals(string)) {
            SpaySdk.SdkApiLevel a2 = SpaySdk.SdkApiLevel.a(data.getString("WEB_CHECKOUT_API_LEVEL", ""));
            if (partnerRequest.n.compareTo(a2) < 0) {
                partnerRequest.n = a2;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(PartnerRequest partnerRequest) {
        synchronized (this.r) {
            try {
                String str = partnerRequest.k;
                this.o.add(partnerRequest);
                if (this.n == null) {
                    A();
                }
                this.n.sendEmptyMessage(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void D() {
        C();
        K();
        m();
    }

    public T E() {
        return this.i;
    }

    public boolean G() {
        boolean z;
        synchronized (this.r) {
            z = this.i != null;
        }
        return z;
    }

    public void I() {
        this.p.release();
    }

    public void J(PartnerRequest partnerRequest, SpaySdk.SdkApiLevel sdkApiLevel) {
        synchronized (this.r) {
            try {
                String str = partnerRequest.k;
                if (L(partnerRequest, sdkApiLevel)) {
                    if (partnerRequest.i) {
                        z(new b(partnerRequest));
                    } else {
                        x(partnerRequest);
                    }
                    this.q.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void y(boolean z) {
        Queue<PartnerRequest> queue;
        synchronized (this.r) {
            try {
                if (this.o.size() > 0) {
                    this.o.size();
                    while (true) {
                        boolean isEmpty = this.o.isEmpty();
                        queue = this.o;
                        if (isEmpty) {
                            break;
                        }
                        PartnerRequest poll = queue.poll();
                        poll.o = true;
                        if (z) {
                            poll.e(ErrorType.SERVICE_DISCONNECTED, -1, null);
                        }
                    }
                    queue.clear();
                }
                this.p.release();
                this.q.release();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z(g gVar) {
        synchronized (this.r) {
            try {
                if (G()) {
                    gVar.b(this.i);
                    return;
                }
                if (j()) {
                    T B = B(g());
                    this.i = B;
                    if (B != null) {
                        gVar.b(B);
                        return;
                    }
                    Log.e("SPAYSDK:StubBase", "connectStub - bound stub is NULL. Retry to connect service");
                }
                this.j.add(gVar);
                e(this.s, this.l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ f(Context context, String str, d dVar, a aVar) {
        this(context, str, dVar);
    }
}
