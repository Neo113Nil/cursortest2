package defpackage;

import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.contacts.SelectedFrom;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lbgq0;", "", "Companion", "agq0", "zfq0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class bgq0 {
    public static final agq0 Companion = new agq0();
    public static final i3y[] e = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new w0q0(28)), null};
    public static final bgq0 f;
    public final String a;
    public final String b;
    public final SelectedFrom c;
    public final String d;

    static {
        String str = "";
        f = new bgq0(str, str, SelectedFrom.MANUAL, 8);
    }

    public /* synthetic */ bgq0(int i, String str, String str2, SelectedFrom selectedFrom, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = SelectedFrom.STANDALONE;
        } else {
            this.c = selectedFrom;
        }
        if ((i & 8) == 0) {
            this.d = UUID.randomUUID().toString();
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgq0)) {
            return false;
        }
        bgq0 bgq0Var = (bgq0) obj;
        return jl40.l(this.a, bgq0Var.a) && jl40.l(this.b, bgq0Var.b) && this.c == bgq0Var.c && jl40.l(this.d, bgq0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SelectedContact(name=", this.a, ", phone=", this.b, ", from=");
        v.append(this.c);
        v.append(", id=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bgq0() {
        this((String) null, (String) (0 == true ? 1 : 0), (SelectedFrom) (0 == true ? 1 : 0), 15);
    }

    public bgq0(String str, String str2, SelectedFrom selectedFrom, String str3) {
        this.a = str;
        this.b = str2;
        this.c = selectedFrom;
        this.d = str3;
    }

    public /* synthetic */ bgq0(String str, String str2, SelectedFrom selectedFrom, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? SelectedFrom.STANDALONE : selectedFrom, UUID.randomUUID().toString());
    }
}
