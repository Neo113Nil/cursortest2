package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lafp;", "", "Companion", "yep", "zep", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class afp {
    public static final zep Companion = new zep();
    public final FavoriteAddress a;

    public /* synthetic */ afp(int i, FavoriteAddress favoriteAddress) {
        if ((i & 1) != 0) {
            this.a = favoriteAddress;
            return;
        }
        this.a = new FavoriteAddress(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303);
    }

    /* renamed from: a, reason: from getter */
    public final FavoriteAddress getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afp) && jl40.l(this.a, ((afp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Response(address=" + this.a + Extension.C_BRAKE;
    }

    public afp() {
        this.a = new FavoriteAddress(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303);
    }
}
