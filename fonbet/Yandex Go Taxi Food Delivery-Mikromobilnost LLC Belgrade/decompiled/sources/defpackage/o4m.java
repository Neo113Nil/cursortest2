package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.transfer_requirement.card_state.DoneButtonAction;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class o4m {
    public final String a;
    public final boolean b;
    public final String c;
    public final Drawable d;
    public final DoneButtonAction e;

    public o4m(String str, boolean z, String str2, Drawable drawable, DoneButtonAction doneButtonAction) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = drawable;
        this.e = doneButtonAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4m)) {
            return false;
        }
        o4m o4mVar = (o4m) obj;
        return jl40.l(this.a, o4mVar.a) && this.b == o4mVar.b && jl40.l(this.c, o4mVar.c) && jl40.l(this.d, o4mVar.d) && this.e == o4mVar.e;
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        Drawable drawable = this.d;
        return this.e.hashCode() + ((hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder l = oo31.l("DoneButtonUiState(text=", this.a, ", isLoading=", ", errorText=", this.b);
        l.append(this.c);
        l.append(", shadow=");
        l.append(this.d);
        l.append(", action=");
        l.append(this.e);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
