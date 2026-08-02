package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes5.dex */
public final class oar0 {
    public static final oar0 e;
    public final UiStateDrawableWrapper a;
    public final String b;
    public final List c;
    public final har0 d;

    static {
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
        e = new oar0(null, "", EmptyList.a, new har0("", n9r0.a));
    }

    public oar0(UiStateDrawableWrapper uiStateDrawableWrapper, String str, List list, har0 har0Var) {
        this.a = uiStateDrawableWrapper;
        this.b = str;
        this.c = list;
        this.d = har0Var;
    }

    public static oar0 a(oar0 oar0Var, UiStateDrawableWrapper uiStateDrawableWrapper, String str, List list, har0 har0Var, int i) {
        if ((i & 1) != 0) {
            uiStateDrawableWrapper = oar0Var.a;
        }
        if ((i & 2) != 0) {
            str = oar0Var.b;
        }
        if ((i & 4) != 0) {
            list = oar0Var.c;
        }
        if ((i & 8) != 0) {
            har0Var = oar0Var.d;
        }
        oar0Var.getClass();
        return new oar0(uiStateDrawableWrapper, str, list, har0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oar0)) {
            return false;
        }
        oar0 oar0Var = (oar0) obj;
        return jl40.l(this.a, oar0Var.a) && jl40.l(this.b, oar0Var.b) && jl40.l(this.c, oar0Var.c) && jl40.l(this.d, oar0Var.d);
    }

    public final int hashCode() {
        UiStateDrawableWrapper uiStateDrawableWrapper = this.a;
        return this.d.hashCode() + unr0.c(unr0.b((uiStateDrawableWrapper == null ? 0 : uiStateDrawableWrapper.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "SettingsModalUiState(icon=" + this.a + ", title=" + this.b + ", content=" + this.c + ", button=" + this.d + Extension.C_BRAKE;
    }
}
