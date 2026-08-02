package xsna;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes11.dex */
public final class oqx0 {
    public final g a;

    /* compiled from: WindowInsetsControllerCompat.java */
    public static class a extends g {
        public final Window a;
        public final oek0 b;

        public a(Window window, oek0 oek0Var) {
            this.a = window;
            this.b = oek0Var;
        }

        @Override // xsna.oqx0.g
        public final int a() {
            Object tag = this.a.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // xsna.oqx0.g
        public final void b(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    if (i2 == 1) {
                        i(4);
                    } else if (i2 == 2) {
                        i(2);
                    } else if (i2 == 8) {
                        this.b.a.a();
                    }
                }
            }
        }

        @Override // xsna.oqx0.g
        public final void g(int i) {
            this.a.getDecorView().setTag(356039078, Integer.valueOf(i));
            if (i == 0) {
                j(6144);
                return;
            }
            if (i == 1) {
                j(4096);
                i(2048);
            } else {
                if (i != 2) {
                    return;
                }
                j(2048);
                i(4096);
            }
        }

        @Override // xsna.oqx0.g
        public final void h(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    if (i2 == 1) {
                        j(4);
                        this.a.clearFlags(1024);
                    } else if (i2 == 2) {
                        j(2);
                    } else if (i2 == 8) {
                        this.b.a.b();
                    }
                }
            }
        }

        public final void i(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public final void j(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    public static class b extends a {
        @Override // xsna.oqx0.g
        public final boolean d() {
            return (this.a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // xsna.oqx0.g
        public final void f(boolean z) {
            if (!z) {
                j(8192);
                return;
            }
            Window window = this.a;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            i(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    public static class c extends b {
        @Override // xsna.oqx0.g
        public final boolean c() {
            return (this.a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // xsna.oqx0.g
        public final void e(boolean z) {
            if (!z) {
                j(16);
                return;
            }
            Window window = this.a;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            i(16);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    public static class e extends d {
        @Override // xsna.oqx0.d, xsna.oqx0.g
        @SuppressLint({"WrongConstant"})
        public final int a() {
            int systemBarsBehavior;
            systemBarsBehavior = this.a.getSystemBarsBehavior();
            return systemBarsBehavior;
        }

        @Override // xsna.oqx0.d, xsna.oqx0.g
        public final void g(int i) {
            this.a.setSystemBarsBehavior(i);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    public static class f extends e {
        @Override // xsna.oqx0.d, xsna.oqx0.g
        public final boolean c() {
            int systemBarsAppearance;
            systemBarsAppearance = this.a.getSystemBarsAppearance();
            return (systemBarsAppearance & 16) != 0;
        }

        @Override // xsna.oqx0.d, xsna.oqx0.g
        public final boolean d() {
            int systemBarsAppearance;
            systemBarsAppearance = this.a.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }

        @Override // xsna.oqx0.d, xsna.oqx0.g
        public final void e(boolean z) {
            this.a.setSystemBarsAppearance(z ? 16 : 0, 16);
        }

        @Override // xsna.oqx0.d, xsna.oqx0.g
        public final void f(boolean z) {
            this.a.setSystemBarsAppearance(z ? 8 : 0, 8);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    public static class g {
        public int a() {
            throw null;
        }

        public void b(int i) {
            throw null;
        }

        public boolean c() {
            throw null;
        }

        public boolean d() {
            throw null;
        }

        public void e(boolean z) {
            throw null;
        }

        public void f(boolean z) {
            throw null;
        }

        public void g(int i) {
            throw null;
        }

        public void h(int i) {
            throw null;
        }
    }

    @Deprecated
    public oqx0(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new f(windowInsetsController, new oek0(windowInsetsController));
        } else {
            this.a = new d(windowInsetsController, new oek0(windowInsetsController));
        }
    }

    @Deprecated
    public static oqx0 c(WindowInsetsController windowInsetsController) {
        return new oqx0(windowInsetsController);
    }

    public final void a(boolean z) {
        this.a.e(z);
    }

    public final void b(boolean z) {
        this.a.f(z);
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    public static class d extends g {
        public final WindowInsetsController a;
        public final oek0 b;
        public final Window c;

        public d(WindowInsetsController windowInsetsController, oek0 oek0Var) {
            new dpj0();
            this.a = windowInsetsController;
            this.b = oek0Var;
        }

        @Override // xsna.oqx0.g
        @SuppressLint({"WrongConstant"})
        public int a() {
            int systemBarsBehavior;
            Window window = this.c;
            if (window == null) {
                systemBarsBehavior = this.a.getSystemBarsBehavior();
                return systemBarsBehavior;
            }
            Object tag = window.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // xsna.oqx0.g
        public final void b(int i) {
            if ((i & 8) != 0) {
                this.b.a.a();
            }
            this.a.hide(i & (-9));
        }

        @Override // xsna.oqx0.g
        public boolean c() {
            return i(16, 16);
        }

        @Override // xsna.oqx0.g
        public boolean d() {
            return i(8192, 8);
        }

        @Override // xsna.oqx0.g
        public void e(boolean z) {
            Window window = this.c;
            if (window == null) {
                if (z) {
                    this.a.setSystemBarsAppearance(16, 16);
                    return;
                } else {
                    this.a.setSystemBarsAppearance(0, 16);
                    return;
                }
            }
            if (!z) {
                j(16);
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
            }
        }

        @Override // xsna.oqx0.g
        public void f(boolean z) {
            Window window = this.c;
            if (window == null) {
                if (z) {
                    this.a.setSystemBarsAppearance(8, 8);
                    return;
                } else {
                    this.a.setSystemBarsAppearance(0, 8);
                    return;
                }
            }
            if (!z) {
                j(8192);
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
        }

        @Override // xsna.oqx0.g
        public void g(int i) {
            Window window = this.c;
            if (window == null) {
                this.a.setSystemBarsBehavior(i);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i));
            if (i == 0) {
                j(6144);
                return;
            }
            if (i == 1) {
                j(4096);
                View decorView = this.c.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2048);
            } else {
                if (i != 2) {
                    return;
                }
                j(2048);
                View decorView2 = this.c.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 4096);
            }
        }

        @Override // xsna.oqx0.g
        public final void h(int i) {
            if ((i & 8) != 0) {
                this.b.a.b();
            }
            this.a.show(i & (-9));
        }

        public final boolean i(int i, int i2) {
            int systemBarsAppearance;
            Window window = this.c;
            if (window != null) {
                return (i & window.getDecorView().getSystemUiVisibility()) != 0;
            }
            this.a.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.a.getSystemBarsAppearance();
            return (systemBarsAppearance & i2) != 0;
        }

        public final void j(int i) {
            View decorView = this.c.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(Window window, oek0 oek0Var) {
            this(r0, oek0Var);
            WindowInsetsController insetsController;
            insetsController = window.getInsetsController();
            this.c = window;
        }
    }

    public oqx0(Window window, View view) {
        oek0 oek0Var = new oek0(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new f(window, oek0Var);
        } else if (i >= 30) {
            this.a = new d(window, oek0Var);
        } else {
            this.a = new c(window, oek0Var);
        }
    }
}
