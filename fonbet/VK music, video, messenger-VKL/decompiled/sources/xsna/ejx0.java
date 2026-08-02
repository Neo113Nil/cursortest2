package xsna;

import android.content.Context;
import xsna.dh6;

/* compiled from: WebViewNavigatableBottomSheet.kt */
/* loaded from: classes2.dex */
public final class ejx0 {
    public final Context a;
    public final String b;
    public final String c;
    public final f98 d;
    public dw20 f;
    public final c e = new c();
    public final a g = new a();
    public final bpn0 h = new bpn0(new clt0(this, 8));

    /* compiled from: WebViewNavigatableBottomSheet.kt */
    public final class a implements fcn {
        public a() {
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            dw20 dw20Var = ejx0.this.f;
            if (dw20Var != null) {
                dw20Var.hide();
            }
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return false;
        }
    }

    /* compiled from: WebViewNavigatableBottomSheet.kt */
    public static final class b implements iz20 {
        public b() {
        }

        @Override // xsna.iz20
        public final void n(dw20 dw20Var) {
            ejx0 ejx0Var = ejx0.this;
            Object obj = ejx0Var.a;
            a aVar = ejx0Var.g;
            if (obj instanceof ey50) {
                ((ey50) obj).Y().S(aVar);
            }
        }
    }

    public ejx0(Context context, String str, String str2, f98 f98Var) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = f98Var;
    }

    /* compiled from: WebViewNavigatableBottomSheet.kt */
    public static final class c implements dh6.a {
        @Override // xsna.dh6.a
        public final void a() {
        }

        @Override // xsna.dh6.a
        public final void b() {
        }
    }
}
