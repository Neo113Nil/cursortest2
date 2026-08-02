package xsna;

import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: ThreadsSubstitution.kt */
/* loaded from: classes.dex */
public final class l0n0 extends k0n0 {
    public static bbq f;
    public final int c;
    public final ExecutorService d;
    public final a e;

    /* compiled from: ThreadsSubstitution.kt */
    /* loaded from: classes17.dex */
    public final class a {
        public boolean a;
        public final LinkedHashSet b = new LinkedHashSet();
        public RunnableC3222a c;

        /* compiled from: ThreadsSubstitution.kt */
        /* renamed from: xsna.l0n0$a$a, reason: collision with other inner class name */
        public final class RunnableC3222a implements Runnable {
            public volatile boolean b;

            public RunnableC3222a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b = true;
            }
        }

        public a() {
        }

        public final void a(String str) {
            this.b.add(str);
            if (this.a) {
                return;
            }
            this.a = true;
            asu0.a.getClass();
            asu0.p().e(new cy3(9, this, l0n0.this), 0L, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    public l0n0(int i, ExecutorService executorService) {
        super(executorService);
        this.c = i;
        this.d = executorService;
        this.e = new a();
    }
}
