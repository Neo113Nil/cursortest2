package defpackage;

import com.yandex.go.payments.data.model.response.ActionButton;
import com.yandex.go.payments.data.model.response.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class eao {
    public final String a;
    public final String b;
    public final String c;
    public final ActionButton d;

    static {
        b bVar = ActionButton.Companion;
    }

    public eao(String str, String str2, String str3, ActionButton actionButton) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = actionButton;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eao)) {
            return false;
        }
        eao eaoVar = (eao) obj;
        return jl40.l(this.a, eaoVar.a) && jl40.l(this.b, eaoVar.b) && jl40.l(this.c, eaoVar.c) && jl40.l(this.d, eaoVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + unr0.b(unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("ErrorUiState(iconTagStr=", this.a, ", title=", this.b, ", description=");
        v.append(this.c);
        v.append(", mainButton=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
