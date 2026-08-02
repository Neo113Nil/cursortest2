package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.scooters.data.model.SessionOfferType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lm1r0;", "", "Companion", "k1r0", "l1r0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class m1r0 {
    public static final l1r0 Companion = new l1r0();
    public static final i3y[] f;
    public final p1r0 a;
    public final String b;
    public final List c;
    public final String d;
    public final SessionOfferType e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new iwq0(7)), null, a.b(lazyThreadSafetyMode, new iwq0(8))};
    }

    public /* synthetic */ m1r0(int i, p1r0 p1r0Var, String str, List list, String str2, SessionOfferType sessionOfferType) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = p1r0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = sessionOfferType;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final List getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final p1r0 getA() {
        return this.a;
    }

    /* renamed from: e, reason: from getter */
    public final SessionOfferType getE() {
        return this.e;
    }

    public m1r0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
