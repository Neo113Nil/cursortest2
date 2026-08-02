package xsna;

import androidx.annotation.Nullable;

/* compiled from: LiveDataUtils.java */
/* loaded from: classes.dex */
public final class xiz implements fr70<Object> {
    public Object b = null;
    public final /* synthetic */ r5o0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ cwx0 e;
    public final /* synthetic */ s120 f;

    /* compiled from: LiveDataUtils.java */
    public class a implements Runnable {
        public final /* synthetic */ Object b;

        public a(Object obj) {
            this.b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (xiz.this.d) {
                try {
                    Object apply = xiz.this.e.apply(this.b);
                    xiz xizVar = xiz.this;
                    Object obj = xizVar.b;
                    if (obj == null && apply != null) {
                        xizVar.b = apply;
                        xizVar.f.i(apply);
                    } else if (obj != null && !obj.equals(apply)) {
                        xiz xizVar2 = xiz.this;
                        xizVar2.b = apply;
                        xizVar2.f.i(apply);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public xiz(hwx0 hwx0Var, Object obj, cwx0 cwx0Var, s120 s120Var) {
        this.c = hwx0Var;
        this.d = obj;
        this.e = cwx0Var;
        this.f = s120Var;
    }

    @Override // xsna.fr70
    public final void a(@Nullable Object obj) {
        this.c.b(new a(obj));
    }
}
