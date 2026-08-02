package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.persuggest.api.finalsuggest.Type;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lah9;", "Layd;", "Companion", "zg9", "xg9", "yg9", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ah9 extends ayd {
    public static final yg9 Companion = new yg9();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(19))};
    public final List a;

    public ah9(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    @Override // defpackage.ayd
    public final Type a() {
        return Type.CHANGE_TO_UNWHITELISTED_TARIFF;
    }

    @Override // defpackage.ayd
    public final boolean b(xxd xxdVar) {
        if (xxdVar instanceof zg9) {
            return !this.a.contains(((zg9) xxdVar).a);
        }
        return false;
    }

    public final String toString() {
        return tse0.k("ChangeToUnwhitelistedTariffCondition(whitelist=", Extension.C_BRAKE, this.a);
    }

    public ah9() {
        this.a = EmptyList.a;
    }
}
