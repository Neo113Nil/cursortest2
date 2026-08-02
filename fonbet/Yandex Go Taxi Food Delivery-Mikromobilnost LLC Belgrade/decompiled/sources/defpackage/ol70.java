package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class ol70 {
    public static final /* synthetic */ int e = 0;
    public final UiStateDrawableWrapper a;
    public final String b;
    public final qj70 c;
    public final boolean d;

    static {
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public ol70(UiStateDrawableWrapper uiStateDrawableWrapper, String str, qj70 qj70Var, boolean z) {
        this.a = uiStateDrawableWrapper;
        this.b = str;
        this.c = qj70Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol70)) {
            return false;
        }
        ol70 ol70Var = (ol70) obj;
        return jl40.l(this.a, ol70Var.a) && jl40.l(this.b, ol70Var.b) && jl40.l(this.c, ol70Var.c) && this.d == ol70Var.d;
    }

    public final int hashCode() {
        UiStateDrawableWrapper uiStateDrawableWrapper = this.a;
        int hashCode = (uiStateDrawableWrapper == null ? 0 : uiStateDrawableWrapper.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        qj70 qj70Var = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (qj70Var != null ? qj70Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ActionItem(drawableWrapper=" + this.a + ", title=" + this.b + ", action=" + this.c + ", isLoading=" + this.d + Extension.C_BRAKE;
    }
}
