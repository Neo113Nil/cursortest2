package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.g;
import com.bumptech.glide.load.resource.bitmap.h;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes10.dex */
public final class b06 implements rtj0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public b06(Resources resources, rtj0 rtj0Var) {
        this.a = 0;
        this.c = resources;
        this.b = rtj0Var;
    }

    @Override // defpackage.rtj0
    public final otj0 a(Object obj, int i, int i2, mg70 mg70Var) {
        boolean z;
        h hVar;
        kjo kjoVar;
        switch (this.a) {
            case 0:
                otj0 a = ((rtj0) this.b).a(obj, i, i2, mg70Var);
                Resources resources = (Resources) this.c;
                if (a == null) {
                    return null;
                }
                return new h16(resources, a);
            case 1:
                otj0 c = ((utj0) this.b).c((Uri) obj, mg70Var);
                if (c == null) {
                    return null;
                }
                return qbm.a((b16) this.c, (Drawable) ((pgt) c).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof h) {
                    hVar = (h) inputStream;
                    z = false;
                } else {
                    z = true;
                    hVar = new h(inputStream, (g63) this.c);
                }
                ArrayDeque arrayDeque = kjo.c;
                synchronized (arrayDeque) {
                    kjoVar = (kjo) arrayDeque.poll();
                }
                if (kjoVar == null) {
                    kjoVar = new kjo();
                }
                kjo kjoVar2 = kjoVar;
                kjoVar2.a = hVar;
                mw00 mw00Var = new mw00(kjoVar2);
                hhs0 hhs0Var = new hhs0(9, hVar, kjoVar2);
                try {
                    g gVar = (g) this.b;
                    h16 a2 = gVar.a(new r1s(mw00Var, gVar.d, gVar.c), i, i2, mg70Var, hhs0Var);
                    kjoVar2.b = null;
                    kjoVar2.a = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(kjoVar2);
                    }
                    if (z) {
                        hVar.c();
                    }
                    return a2;
                } catch (Throwable th) {
                    kjoVar2.b = null;
                    kjoVar2.a = null;
                    ArrayDeque arrayDeque2 = kjo.c;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(kjoVar2);
                        if (!z) {
                            throw th;
                        }
                        hVar.c();
                        throw th;
                    }
                }
        }
    }

    @Override // defpackage.rtj0
    public final boolean b(Object obj, mg70 mg70Var) {
        switch (this.a) {
            case 0:
                return ((rtj0) this.b).b(obj, mg70Var);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    public /* synthetic */ b06(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
