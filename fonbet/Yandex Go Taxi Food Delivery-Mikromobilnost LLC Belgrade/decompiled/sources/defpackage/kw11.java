package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.persuggest.api.finalsuggest.UnavailabilityReasonCode;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkw11;", "", "Companion", "jw11", "iw11", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class kw11 {
    public static final jw11 Companion = new jw11();
    public static final i3y[] g = {null, null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new jg11(15))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final UnavailabilityReasonCode f;

    static {
        lw11 lw11Var = UnavailabilityReasonCode.Companion;
    }

    public /* synthetic */ kw11(int i, String str, String str2, String str3, String str4, String str5, UnavailabilityReasonCode unavailabilityReasonCode) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = unavailabilityReasonCode;
        }
    }

    public kw11() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
