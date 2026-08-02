package defpackage;

import com.yandex.go.dto.response.q1;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.masstransit.model.MtPositionOverMap;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkq30;", "", "Companion", "a", "gq30", "hq30", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class kq30 {
    public static final hq30 Companion = new hq30();
    public static final i3y[] i;
    public final String a;
    public final a b;
    public final wc30 c;
    public final q1 d;
    public final FormattedText e;
    public final MtPositionOverMap f;
    public final String g;
    public final Map h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new z530(8)), null, kotlin.a.b(lazyThreadSafetyMode, new z530(9))};
    }

    public /* synthetic */ kq30(int i2, String str, a aVar, wc30 wc30Var, q1 q1Var, FormattedText formattedText, MtPositionOverMap mtPositionOverMap, String str2, Map map) {
        this.a = (i2 & 1) == 0 ? "" : str;
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = aVar;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = wc30Var;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = q1Var;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = formattedText;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = mtPositionOverMap;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = map;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkq30$a;", "", "Companion", "iq30", "jq30", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final jq30 Companion = new jq30();
        public final String a;
        public final int b;

        public /* synthetic */ a(int i, String str, int i2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return qv10.i(this.b, "ShowPolicy(id=", this.a, ", maxShowCount=", Extension.C_BRAKE);
        }

        public a() {
            this.a = "";
            this.b = 0;
        }
    }

    public kq30() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }
}
