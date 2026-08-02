package defpackage;

import com.yandex.go.safety.center.safetycenter_web.ui.error.SafetyCenterWebErrorViewUiState$ButtonUiState$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes13.dex */
public final class pul0 {
    public final SafetyCenterWebErrorViewUiState$ButtonUiState$Type a;
    public final String b;
    public final UiStateDrawableWrapper c;

    public pul0(SafetyCenterWebErrorViewUiState$ButtonUiState$Type safetyCenterWebErrorViewUiState$ButtonUiState$Type, String str, UiStateDrawableWrapper uiStateDrawableWrapper) {
        this.a = safetyCenterWebErrorViewUiState$ButtonUiState$Type;
        this.b = str;
        this.c = uiStateDrawableWrapper;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pul0)) {
            return false;
        }
        pul0 pul0Var = (pul0) obj;
        return this.a == pul0Var.a && jl40.l(this.b, pul0Var.b) && jl40.l(this.c, pul0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        UiStateDrawableWrapper uiStateDrawableWrapper = this.c;
        return b + (uiStateDrawableWrapper == null ? 0 : uiStateDrawableWrapper.hashCode());
    }

    public final String toString() {
        return "ButtonUiState(type=" + this.a + ", title=" + this.b + ", icon=" + this.c + Extension.C_BRAKE;
    }
}
