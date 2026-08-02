package defpackage;

import com.yandex.go.requirements.comment.summary.ui.v3.ui.model.ButtonUiState$LoadingState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class c47 {
    public final ButtonUiState$LoadingState a;
    public final String b;

    public c47(ButtonUiState$LoadingState buttonUiState$LoadingState, String str) {
        this.a = buttonUiState$LoadingState;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c47)) {
            return false;
        }
        c47 c47Var = (c47) obj;
        return this.a == c47Var.a && jl40.l(this.b, c47Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ButtonUiState(state=" + this.a + ", text=" + this.b + Extension.C_BRAKE;
    }
}
