package xsna;

import com.vk.voip.ui.share.link.pager_new.model.VoipShareLinkSheetButton;
import xsna.z1x0;

/* compiled from: VoipShareLinkSheetViewState.kt */
/* loaded from: classes7.dex */
public final class a2x0 implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: VoipShareLinkSheetViewState.kt */
    public static final class a implements fm50<z1x0.a> {
        public final yzt0<tlo0> a;
        public final yzt0<com.vk.voip.ui.share.link.pager.view.b> b;
        public final yzt0<VoipShareLinkSheetButton> c;
        public final yzt0<VoipShareLinkSheetButton> d;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(title=");
            sb.append(this.a);
            sb.append(", sharingDelegate=");
            sb.append(this.b);
            sb.append(", primaryButton=");
            sb.append(this.c);
            sb.append(", secondaryButton=");
            return tr.c(sb, this.d, ')');
        }
    }

    /* compiled from: VoipShareLinkSheetViewState.kt */
    public static final class b implements fm50<z1x0.b> {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 662196248;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public a2x0(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
