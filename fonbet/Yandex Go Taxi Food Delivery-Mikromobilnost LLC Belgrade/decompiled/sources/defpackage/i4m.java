package defpackage;

import com.yandex.go.transfer_requirement.card_state.DoneButtonAction;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class i4m implements j4m, h4m {
    public final boolean a;
    public final String b;
    public final DoneButtonAction c;

    public i4m(boolean z, String str, DoneButtonAction doneButtonAction) {
        this.a = z;
        this.b = str;
        this.c = doneButtonAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4m)) {
            return false;
        }
        i4m i4mVar = (i4m) obj;
        return this.a == i4mVar.a && jl40.l(this.b, i4mVar.b) && this.c == i4mVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = ly3.v("RequestError(isLoading=", ", errorText=", this.b, ", action=", this.a);
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
