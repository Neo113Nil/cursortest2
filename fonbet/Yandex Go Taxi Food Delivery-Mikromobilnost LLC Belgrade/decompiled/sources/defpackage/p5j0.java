package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class p5j0 extends d95 {
    public final Context O;
    public final RequestManager P;
    public final Class Q;
    public final GlideContext R;
    public my01 S;
    public Object T;
    public ArrayList U;
    public p5j0 V;
    public p5j0 W;
    public final boolean Z = true;
    public boolean a0;
    public boolean b0;

    static {
    }

    public p5j0(Glide glide, RequestManager requestManager, Class cls, Context context) {
        this.P = requestManager;
        this.Q = cls;
        this.O = context;
        this.S = requestManager.getDefaultTransitionOptions(cls);
        this.R = glide.getGlideContext();
        Iterator<i7j0> it = requestManager.getDefaultRequestListeners().iterator();
        while (it.hasNext()) {
            A(it.next());
        }
        a(requestManager.getDefaultRequestOptions());
    }

    public final p5j0 A(i7j0 i7j0Var) {
        if (this.L) {
            return clone().A(i7j0Var);
        }
        if (i7j0Var != null) {
            if (this.U == null) {
                this.U = new ArrayList();
            }
            this.U.add(i7j0Var);
        }
        s();
        return this;
    }

    @Override // defpackage.d95
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final p5j0 a(d95 d95Var) {
        z2a1.d(d95Var);
        return (p5j0) super.a(d95Var);
    }

    public final p5j0 C(p5j0 p5j0Var) {
        PackageInfo packageInfo;
        Context context = this.O;
        p5j0 p5j0Var2 = (p5j0) p5j0Var.w(context.getTheme());
        ConcurrentHashMap concurrentHashMap = i13.a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = i13.a;
        khx khxVar = (khx) concurrentHashMap2.get(packageName);
        if (khxVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                packageInfo = null;
            }
            lp60 lp60Var = new lp60(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            khx khxVar2 = (khx) concurrentHashMap2.putIfAbsent(packageName, lp60Var);
            khxVar = khxVar2 == null ? lp60Var : khxVar2;
        }
        return (p5j0) p5j0Var2.u(new yb2(context.getResources().getConfiguration().uiMode & 48, khxVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e5j0 D(Object obj, iax0 iax0Var, i7j0 i7j0Var, s5j0 s5j0Var, my01 my01Var, Priority priority, int i, int i2, d95 d95Var, Executor executor) {
        s5j0 s5j0Var2;
        s5j0 s5j0Var3;
        d95 d95Var2;
        a aVar;
        Priority priority2;
        if (this.W != null) {
            s5j0Var3 = new y8o(obj, s5j0Var);
            s5j0Var2 = s5j0Var3;
        } else {
            s5j0Var2 = null;
            s5j0Var3 = s5j0Var;
        }
        p5j0 p5j0Var = this.V;
        if (p5j0Var == null) {
            Context context = this.O;
            GlideContext glideContext = this.R;
            d95Var2 = d95Var;
            aVar = new a(context, glideContext, obj, this.T, this.Q, d95Var2, i, i2, priority, iax0Var, i7j0Var, this.U, s5j0Var3, glideContext.getEngine(), my01Var.a, executor);
        } else {
            if (this.b0) {
                ny61.r("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
            my01 my01Var2 = p5j0Var.Z ? my01Var : p5j0Var.S;
            if (d95.j(p5j0Var.a, 8)) {
                priority2 = this.V.c;
            } else {
                int i3 = n5j0.b[priority.ordinal()];
                if (i3 == 1) {
                    priority2 = Priority.NORMAL;
                } else if (i3 == 2) {
                    priority2 = Priority.HIGH;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        vg10.g(this.c, "unknown priority: ");
                        return null;
                    }
                    priority2 = Priority.IMMEDIATE;
                }
            }
            Priority priority3 = priority2;
            p5j0 p5j0Var2 = this.V;
            int i4 = p5j0Var2.C;
            int i5 = p5j0Var2.B;
            if (pw21.m(i, i2)) {
                p5j0 p5j0Var3 = this.V;
                if (!pw21.m(p5j0Var3.C, p5j0Var3.B)) {
                    i4 = d95Var.C;
                    i5 = d95Var.B;
                }
            }
            int i6 = i5;
            int i7 = i4;
            r0z0 r0z0Var = new r0z0(obj, s5j0Var3);
            Context context2 = this.O;
            GlideContext glideContext2 = this.R;
            a aVar2 = new a(context2, glideContext2, obj, this.T, this.Q, d95Var, i, i2, priority, iax0Var, i7j0Var, this.U, r0z0Var, glideContext2.getEngine(), my01Var.a, executor);
            this.b0 = true;
            p5j0 p5j0Var4 = this.V;
            e5j0 D = p5j0Var4.D(obj, iax0Var, i7j0Var, r0z0Var, my01Var2, priority3, i7, i6, p5j0Var4, executor);
            this.b0 = false;
            r0z0Var.c = aVar2;
            r0z0Var.d = D;
            d95Var2 = d95Var;
            aVar = r0z0Var;
        }
        if (s5j0Var2 == null) {
            return aVar;
        }
        p5j0 p5j0Var5 = this.W;
        int i8 = p5j0Var5.C;
        int i9 = p5j0Var5.B;
        if (pw21.m(i, i2)) {
            p5j0 p5j0Var6 = this.W;
            if (!pw21.m(p5j0Var6.C, p5j0Var6.B)) {
                i8 = d95Var2.C;
                i9 = d95Var2.B;
            }
        }
        p5j0 p5j0Var7 = this.W;
        y8o y8oVar = s5j0Var2;
        e5j0 D2 = p5j0Var7.D(obj, iax0Var, i7j0Var, y8oVar, p5j0Var7.S, p5j0Var7.c, i8, i9, p5j0Var7, executor);
        y8oVar.c = aVar;
        y8oVar.d = D2;
        return y8oVar;
    }

    @Override // defpackage.d95
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final p5j0 clone() {
        p5j0 p5j0Var = (p5j0) super.clone();
        p5j0Var.S = p5j0Var.S.clone();
        if (p5j0Var.U != null) {
            p5j0Var.U = new ArrayList(p5j0Var.U);
        }
        p5j0 p5j0Var2 = p5j0Var.V;
        if (p5j0Var2 != null) {
            p5j0Var.V = p5j0Var2.clone();
        }
        p5j0 p5j0Var3 = p5j0Var.W;
        if (p5j0Var3 != null) {
            p5j0Var.W = p5j0Var3.clone();
        }
        return p5j0Var;
    }

    public final void F(iax0 iax0Var, o6j0 o6j0Var, d95 d95Var, Executor executor) {
        z2a1.d(iax0Var);
        if (!this.a0) {
            ny61.g("You must call #load() before calling #into()");
            return;
        }
        e5j0 D = D(new Object(), iax0Var, o6j0Var, null, this.S, d95Var.c, d95Var.C, d95Var.B, d95Var, executor);
        e5j0 request = iax0Var.getRequest();
        if (!D.d(request) || (!d95Var.A && request.b())) {
            RequestManager requestManager = this.P;
            requestManager.clear(iax0Var);
            iax0Var.setRequest(D);
            requestManager.track(iax0Var, D);
            return;
        }
        z2a1.e(request, "Argument must not be null");
        if (request.isRunning()) {
            return;
        }
        request.j();
    }

    public final void G(ImageView imageView) {
        d95 d95Var;
        pw21.a();
        z2a1.d(imageView);
        if (!d95.j(this.a, 2048) && this.F && imageView.getScaleType() != null) {
            switch (n5j0.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    d95Var = clone().l(DownsampleStrategy.c, new n69());
                    break;
                case 2:
                    d95Var = clone().l(DownsampleStrategy.b, new p69());
                    d95Var.M = true;
                    break;
                case 3:
                case 4:
                case 5:
                    d95Var = clone().l(DownsampleStrategy.a, new ndr());
                    d95Var.M = true;
                    break;
                case 6:
                    d95Var = clone().l(DownsampleStrategy.b, new p69());
                    d95Var.M = true;
                    break;
            }
            F(this.R.buildImageViewTarget(imageView, this.Q), null, d95Var, ph91.a);
        }
        d95Var = this;
        F(this.R.buildImageViewTarget(imageView, this.Q), null, d95Var, ph91.a);
    }

    public final p5j0 H(i7j0 i7j0Var) {
        if (this.L) {
            return clone().H(i7j0Var);
        }
        this.U = null;
        return A(i7j0Var);
    }

    public final p5j0 J(Uri uri) {
        p5j0 K = K(uri);
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? K : C(K);
    }

    public final p5j0 K(Object obj) {
        if (this.L) {
            return clone().K(obj);
        }
        this.T = obj;
        this.a0 = true;
        s();
        return this;
    }

    @Override // defpackage.d95
    public final boolean equals(Object obj) {
        if (!(obj instanceof p5j0)) {
            return false;
        }
        p5j0 p5j0Var = (p5j0) obj;
        return super.equals(p5j0Var) && Objects.equals(this.Q, p5j0Var.Q) && this.S.equals(p5j0Var.S) && Objects.equals(this.T, p5j0Var.T) && Objects.equals(this.U, p5j0Var.U) && Objects.equals(this.V, p5j0Var.V) && Objects.equals(this.W, p5j0Var.W) && this.Z == p5j0Var.Z && this.a0 == p5j0Var.a0;
    }

    @Override // defpackage.d95
    public final int hashCode() {
        return pw21.k(this.a0 ? 1 : 0, pw21.k(this.Z ? 1 : 0, pw21.l(pw21.l(pw21.l(pw21.l(pw21.l(pw21.l(pw21.l(super.hashCode(), this.Q), this.S), this.T), this.U), this.V), this.W), null)));
    }
}
