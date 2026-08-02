package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* compiled from: GifFrameLoader.java */
/* loaded from: classes12.dex */
public final class kyt {
    public final gpk0 a;
    public final Handler b;
    public final ArrayList c;
    public final y7g0 d;
    public final tc7 e;
    public boolean f;
    public boolean g;
    public i7g0<Bitmap> h;
    public a i;
    public boolean j;
    public a k;
    public Bitmap l;
    public clp0<Bitmap> m;
    public a n;
    public int o;
    public int p;
    public int q;

    /* compiled from: GifFrameLoader.java */
    public static class a extends qok<Bitmap> {
        public final Handler e;
        public final int f;
        public final long g;
        public Bitmap h;

        public a(Handler handler, int i, long j) {
            this.e = handler;
            this.f = i;
            this.g = j;
        }

        @Override // xsna.u3o0
        public final void f() {
            this.h = null;
        }

        @Override // xsna.u3o0
        public final void g(@NonNull Object obj) {
            this.h = (Bitmap) obj;
            Handler handler = this.e;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.g);
        }
    }

    /* compiled from: GifFrameLoader.java */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader.java */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            kyt kytVar = kyt.this;
            if (i == 1) {
                kytVar.b((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            kytVar.d.c((a) message.obj);
            return false;
        }
    }

    public kyt(com.bumptech.glide.a aVar, gpk0 gpk0Var, int i, int i2, y3q0 y3q0Var, Bitmap bitmap) {
        tc7 tc7Var = aVar.b;
        com.bumptech.glide.c cVar = aVar.d;
        Context baseContext = cVar.getBaseContext();
        nr2.r(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        y7g0 b2 = com.bumptech.glide.a.a(baseContext).f.b(baseContext);
        Context baseContext2 = cVar.getBaseContext();
        nr2.r(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        y7g0 b3 = com.bumptech.glide.a.a(baseContext2).f.b(baseContext2);
        b3.getClass();
        i7g0<Bitmap> a2 = new i7g0(b3.b, b3, b3.c).a(y7g0.l).a(((d8g0) ((d8g0) new d8g0().g(bbn.a).t()).p()).j(i, i2));
        this.c = new ArrayList();
        this.d = b2;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.e = tc7Var;
        this.b = handler;
        this.h = a2;
        this.a = gpk0Var;
        c(y3q0Var, bitmap);
    }

    public final void a() {
        int i;
        if (!this.f || this.g) {
            return;
        }
        a aVar = this.n;
        if (aVar != null) {
            this.n = null;
            b(aVar);
            return;
        }
        this.g = true;
        gpk0 gpk0Var = this.a;
        int i2 = gpk0Var.l.c;
        long uptimeMillis = SystemClock.uptimeMillis() + ((i2 <= 0 || (i = gpk0Var.k) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((jyt) r2.e.get(i)).i);
        gpk0Var.a();
        this.k = new a(this.b, gpk0Var.k, uptimeMillis);
        this.h.a(new d8g0().o(new qp70(Double.valueOf(Math.random())))).z(gpk0Var).y(this.k, null, u3q.a);
    }

    public final void b(a aVar) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f) {
            this.n = aVar;
            return;
        }
        if (aVar.h != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.c(bitmap);
                this.l = null;
            }
            a aVar2 = this.i;
            this.i = aVar;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).a();
            }
            if (aVar2 != null) {
                handler.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(clp0<Bitmap> clp0Var, Bitmap bitmap) {
        nr2.r(clp0Var, "Argument must not be null");
        this.m = clp0Var;
        nr2.r(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.h = this.h.a(new d8g0().s(clp0Var));
        this.o = s2r0.c(bitmap);
        this.p = bitmap.getWidth();
        this.q = bitmap.getHeight();
    }
}
