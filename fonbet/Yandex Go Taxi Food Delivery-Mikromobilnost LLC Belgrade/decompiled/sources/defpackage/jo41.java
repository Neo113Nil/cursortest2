package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.AllowNewTabType;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class jo41 {
    public static final ho41 Companion = new ho41();
    public static final i3y[] k;
    public final String a;
    public final AllowNewTabType b;
    public final boolean c;
    public final lm41 d;
    public final Boolean e;
    public final Boolean f;
    public final ilk g;
    public final List h;
    public final ilk i;
    public final List j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{null, a.b(lazyThreadSafetyMode, new tn41(2)), null, null, null, null, null, a.b(lazyThreadSafetyMode, new tn41(4)), null, a.b(lazyThreadSafetyMode, new tn41(6))};
    }

    public /* synthetic */ jo41(int i, String str, AllowNewTabType allowNewTabType, boolean z, lm41 lm41Var, Boolean bool, Boolean bool2, ilk ilkVar, List list, ilk ilkVar2, List list2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, fo41.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = allowNewTabType;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = lm41Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = ilkVar;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = ilkVar2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo41)) {
            return false;
        }
        jo41 jo41Var = (jo41) obj;
        return jl40.l(this.a, jo41Var.a) && this.b == jo41Var.b && this.c == jo41Var.c && jl40.l(this.d, jo41Var.d) && jl40.l(this.e, jo41Var.e) && jl40.l(this.f, jo41Var.f) && jl40.l(this.g, jo41Var.g) && jl40.l(this.h, jo41Var.h) && jl40.l(this.i, jo41Var.i) && jl40.l(this.j, jo41Var.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        AllowNewTabType allowNewTabType = this.b;
        int e = unr0.e((hashCode + (allowNewTabType == null ? 0 : allowNewTabType.hashCode())) * 31, 31, this.c);
        lm41 lm41Var = this.d;
        int hashCode2 = (e + (lm41Var == null ? 0 : lm41Var.hashCode())) * 31;
        Boolean bool = this.e;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ilk ilkVar = this.g;
        int hashCode5 = (hashCode4 + (ilkVar == null ? 0 : ilkVar.hashCode())) * 31;
        List list = this.h;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        ilk ilkVar2 = this.i;
        int hashCode7 = (hashCode6 + (ilkVar2 == null ? 0 : ilkVar2.hashCode())) * 31;
        List list2 = this.j;
        return hashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "WebViewCustomProps(url=" + this.a + ", allowNewTabType=" + this.b + ", authRequired=" + this.c + ", colors=" + this.d + ", enableFullUrlLogging=" + this.e + ", enableHtmlSize=" + this.f + ", onErrorAction=" + this.g + ", onLoadCompleteList=" + this.h + ", onPageLoadStartedAction=" + this.i + ", onPostMessage=" + this.j + Extension.C_BRAKE;
    }
}
