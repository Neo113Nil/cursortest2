package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Llii;", "Ln96;", "Lc6z;", "Companion", "kii", "jii", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class lii extends n96 implements c6z {
    public static final kii Companion = new kii();
    public static final i3y[] h;
    public static final lii i;
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, a.b(lazyThreadSafetyMode, new jgi(1)), null, null, null, a.b(lazyThreadSafetyMode, new jgi(2))};
        i = new lii(0);
    }

    public /* synthetic */ lii(int i2, boolean z, Map map, String str, String str2, String str3, List list) {
        this.b = (i2 & 1) == 0 ? false : z;
        if ((i2 & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i2 & 8) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i2 & 16) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i2 & 32) == 0) {
            this.g = EmptyList.a;
        } else {
            this.g = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lii)) {
            return false;
        }
        lii liiVar = (lii) obj;
        return this.b == liiVar.b && jl40.l(this.c, liiVar.c) && jl40.l(this.d, liiVar.d) && jl40.l(this.e, liiVar.e) && jl40.l(this.f, liiVar.f) && jl40.l(this.g, liiVar.g);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return this.g.hashCode() + unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder l = nnm.l("DeliveryPaymentPromoExperiment(enabled=", ", l10n=", ", titleKey=", this.c, this.b);
        g8e.D(l, this.d, ", subtitleKey=", this.e, ", imageTag=");
        return tse0.j(this.f, ", tariffs=", Extension.C_BRAKE, l, this.g);
    }

    public lii() {
        this(0);
    }

    public lii(int i2) {
        Map f = b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = null;
        this.f = "";
        this.g = EmptyList.a;
    }
}
