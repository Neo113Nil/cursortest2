package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.stepsinstructions.model.LoadingState;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes6.dex */
public final class nau0 implements pbu0 {
    public final CharSequence a;
    public final CharSequence b;
    public final UiStateDrawableWrapper c;
    public final UiStateDrawableWrapper d;
    public final LoadingState e;
    public final boolean f;

    static {
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public nau0(CharSequence charSequence, CharSequence charSequence2, UiStateDrawableWrapper uiStateDrawableWrapper, UiStateDrawableWrapper uiStateDrawableWrapper2, LoadingState loadingState, boolean z) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = uiStateDrawableWrapper;
        this.d = uiStateDrawableWrapper2;
        this.e = loadingState;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nau0)) {
            return false;
        }
        nau0 nau0Var = (nau0) obj;
        return jl40.l(this.a, nau0Var.a) && jl40.l(this.b, nau0Var.b) && jl40.l(this.c, nau0Var.c) && jl40.l(this.d, nau0Var.d) && this.e == nau0Var.e && this.f == nau0Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        UiStateDrawableWrapper uiStateDrawableWrapper = this.c;
        int hashCode3 = (hashCode2 + (uiStateDrawableWrapper == null ? 0 : uiStateDrawableWrapper.hashCode())) * 31;
        UiStateDrawableWrapper uiStateDrawableWrapper2 = this.d;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((hashCode3 + (uiStateDrawableWrapper2 != null ? uiStateDrawableWrapper2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "StepState(title=", ", subtitle=", ", icon=");
        r.append(this.c);
        r.append(", image=");
        r.append(this.d);
        r.append(", loadingState=");
        r.append(this.e);
        r.append(", isLastStep=");
        r.append(this.f);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
