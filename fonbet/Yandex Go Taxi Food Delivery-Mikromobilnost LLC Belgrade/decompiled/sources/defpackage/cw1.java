package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.persuggest.api.AlternativeActionType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcw1;", "", "Companion", "aw1", "bw1", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class cw1 {
    public static final bw1 Companion = new bw1();
    public static final i3y[] e = {a.b(LazyThreadSafetyMode.PUBLICATION, new ro1(12)), null, null, null};
    public final AlternativeActionType a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ cw1(int i, AlternativeActionType alternativeActionType, String str, String str2, String str3) {
        this.a = (i & 1) == 0 ? AlternativeActionType.ORGANIZATION_CARD : alternativeActionType;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public cw1() {
        this.a = AlternativeActionType.ORGANIZATION_CARD;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
