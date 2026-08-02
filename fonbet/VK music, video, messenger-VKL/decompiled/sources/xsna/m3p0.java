package xsna;

import com.vk.catalog2.common.dto.api.style.SearchModeActionStyle;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode;

/* compiled from: ToolbarSearchDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class m3p0 {
    public final boolean a;
    public final pvh0 b;
    public final i0b0 c;
    public final ehm0 d;
    public final emh0 e;
    public final vpn0 f;
    public final g8n0 g;
    public final sxh0 h;
    public final ika i;
    public io.reactivex.rxjava3.disposables.c k;
    public a j = new a(0);
    public final io.reactivex.rxjava3.subjects.d<String> l = io.reactivex.rxjava3.subjects.d.N0();

    /* compiled from: ToolbarSearchDelegateImpl.kt */
    public static final class a {
        public final UIBlockActionSearchMode a;
        public final boolean b;
        public final tho0 c;
        public final boolean d;

        public a() {
            this(0);
        }

        public static a a(a aVar, UIBlockActionSearchMode uIBlockActionSearchMode, boolean z, tho0 tho0Var, boolean z2, int i) {
            if ((i & 1) != 0) {
                uIBlockActionSearchMode = aVar.a;
            }
            if ((i & 2) != 0) {
                z = aVar.b;
            }
            if ((i & 4) != 0) {
                tho0Var = aVar.c;
            }
            if ((i & 8) != 0) {
                z2 = aVar.d;
            }
            aVar.getClass();
            return new a(uIBlockActionSearchMode, z, tho0Var, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            UIBlockActionSearchMode uIBlockActionSearchMode = this.a;
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + qoy.b((uIBlockActionSearchMode == null ? 0 : uIBlockActionSearchMode.hashCode()) * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(currentSearchModeButton=");
            sb.append(this.a);
            sb.append(", isSearchExpanded=");
            sb.append(this.b);
            sb.append(", currentSearchQuery=");
            sb.append(this.c);
            sb.append(", shouldShowSearchIcon=");
            return defpackage.q0.a(sb, this.d, ')');
        }

        public a(UIBlockActionSearchMode uIBlockActionSearchMode, boolean z, tho0 tho0Var, boolean z2) {
            this.a = uIBlockActionSearchMode;
            this.b = z;
            this.c = tho0Var;
            this.d = z2;
        }

        public /* synthetic */ a(int i) {
            this(null, false, new tho0("", 0L, 6), false);
        }
    }

    public m3p0(boolean z, pvh0 pvh0Var, i0b0 i0b0Var, ehm0 ehm0Var, emh0 emh0Var, vpn0 vpn0Var, g8n0 g8n0Var, sxh0 sxh0Var, ika ikaVar) {
        this.a = z;
        this.b = pvh0Var;
        this.c = i0b0Var;
        this.d = ehm0Var;
        this.e = emh0Var;
        this.f = vpn0Var;
        this.g = g8n0Var;
        this.h = sxh0Var;
        this.i = ikaVar;
    }

    public final void a(UIBlockActionSearchMode uIBlockActionSearchMode) {
        a aVar = this.j;
        this.j = a.a(aVar, uIBlockActionSearchMode, false, null, c(uIBlockActionSearchMode, aVar.b), 6);
        if (uIBlockActionSearchMode != null) {
            b(uIBlockActionSearchMode);
        }
        this.e.invoke(this.j);
    }

    public final void b(UIBlockActionSearchMode uIBlockActionSearchMode) {
        if (this.a) {
            if (!((Boolean) this.b.invoke()).booleanValue() || uIBlockActionSearchMode.B.b == SearchModeActionStyle.Style.Expandable) {
                this.c.invoke(uIBlockActionSearchMode);
            }
        }
    }

    public final boolean c(UIBlockActionSearchMode uIBlockActionSearchMode, boolean z) {
        if (!this.a || z || uIBlockActionSearchMode == null) {
            return false;
        }
        return !((Boolean) this.b.invoke()).booleanValue() || uIBlockActionSearchMode.B.b == SearchModeActionStyle.Style.Expandable;
    }
}
