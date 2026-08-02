package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcq60;", "Lbzx;", "Companion", "aq60", "bq60", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class cq60 implements bzx {
    public static final bq60 Companion = new bq60();
    public static final i3y[] o;
    public final uc4 a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Float[] e;
    public final cd70 f;
    public final List g;
    public final String h;
    public final Boolean i;
    public final o9u0 j;
    public final s5u0 k;
    public final w210 l;
    public Long m;
    public byx n;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new i3y[]{null, null, null, null, a.b(lazyThreadSafetyMode, new j660(23)), null, a.b(lazyThreadSafetyMode, new j660(24)), null, null, null, null, null};
    }

    public /* synthetic */ cq60(int i, uc4 uc4Var, Long l, Long l2, Long l3, Float[] fArr, cd70 cd70Var, List list, String str, Boolean bool, o9u0 o9u0Var, s5u0 s5u0Var, w210 w210Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = uc4Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = fArr;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = cd70Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = o9u0Var;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = s5u0Var;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = w210Var;
        }
        this.m = null;
    }

    @Override // defpackage.bzx
    /* renamed from: a, reason: from getter */
    public final Long getC() {
        return this.c;
    }

    @Override // defpackage.bzx
    /* renamed from: b, reason: from getter */
    public final Long getD() {
        return this.d;
    }

    @Override // defpackage.bzx
    /* renamed from: c, reason: from getter */
    public final Float[] getE() {
        return this.e;
    }

    @Override // defpackage.bzx
    /* renamed from: d, reason: from getter */
    public final uc4 getA() {
        return this.a;
    }

    @Override // defpackage.bzx
    /* renamed from: e, reason: from getter */
    public final Long getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!cq60.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        cq60 cq60Var = (cq60) obj;
        if (!jl40.l(this.b, cq60Var.b) || !jl40.l(this.c, cq60Var.c) || !jl40.l(this.d, cq60Var.d) || !jl40.l(this.i, cq60Var.i) || !jl40.l(this.m, cq60Var.m) || !jl40.l(this.a, cq60Var.a) || !Arrays.equals(this.e, cq60Var.e) || !jl40.l(this.f, cq60Var.f) || !jl40.l(this.g, cq60Var.g) || !jl40.l(this.h, cq60Var.h) || !jl40.l(this.j, cq60Var.j) || !jl40.l(this.k, cq60Var.k) || !jl40.l(this.l, cq60Var.l)) {
            return false;
        }
        byx byxVar = this.n;
        if (byxVar == null) {
            byxVar = null;
        }
        byx byxVar2 = cq60Var.n;
        return jl40.l(byxVar, byxVar2 != null ? byxVar2 : null);
    }

    @Override // defpackage.bzx
    /* renamed from: f, reason: from getter */
    public final Long getM() {
        return this.m;
    }

    public final int hashCode() {
        Long l = this.b;
        int hashCode = (l != null ? Long.hashCode(l.longValue()) : 0) * 31;
        Long l2 = this.c;
        int hashCode2 = (hashCode + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 31;
        Long l3 = this.d;
        int hashCode3 = (hashCode2 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 31;
        Boolean bool = this.i;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 31;
        Long l4 = this.m;
        int hashCode5 = (hashCode4 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 31;
        uc4 uc4Var = this.a;
        int hashCode6 = (hashCode5 + (uc4Var != null ? uc4Var.hashCode() : 0)) * 31;
        Float[] fArr = this.e;
        int hashCode7 = (hashCode6 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31;
        cd70 cd70Var = this.f;
        int hashCode8 = (hashCode7 + (cd70Var != null ? cd70Var.hashCode() : 0)) * 31;
        List list = this.g;
        int hashCode9 = (hashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.h;
        int hashCode10 = (hashCode9 + (str != null ? str.hashCode() : 0)) * 31;
        o9u0 o9u0Var = this.j;
        int hashCode11 = (hashCode10 + (o9u0Var != null ? o9u0Var.hashCode() : 0)) * 31;
        s5u0 s5u0Var = this.k;
        int hashCode12 = (hashCode11 + (s5u0Var != null ? s5u0Var.hashCode() : 0)) * 31;
        w210 w210Var = this.l;
        int hashCode13 = (hashCode12 + (w210Var != null ? w210Var.hashCode() : 0)) * 31;
        byx byxVar = this.n;
        if (byxVar == null) {
            byxVar = null;
        }
        return byxVar.hashCode() + hashCode13;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.e);
        StringBuilder sb = new StringBuilder("ObjectsResponse(bBox=");
        sb.append(this.a);
        sb.append(", cleanSec=");
        sb.append(this.b);
        sb.append(", throttleMs=");
        sb.append(this.c);
        sb.append(", validitySec=");
        sb.append(this.d);
        sb.append(", zooms=");
        sb.append(arrays);
        sb.append(", optimalView=");
        sb.append(this.f);
        sb.append(", features=");
        oyr.D(", selectedObjectId=", this.h, ", disableIntersectionCheck=", sb, this.g);
        sb.append(this.i);
        sb.append(", statusView=");
        sb.append(this.j);
        sb.append(", stateRequirementsFailed=");
        sb.append(this.k);
        sb.append(", masstransitExtra=");
        sb.append(this.l);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public cq60() {
        this(null, 4095);
    }

    public cq60(uc4 uc4Var, Long l, Long l2, Long l3, Float[] fArr, cd70 cd70Var, List list, String str, Boolean bool, o9u0 o9u0Var, s5u0 s5u0Var, w210 w210Var) {
        this.a = uc4Var;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = fArr;
        this.f = cd70Var;
        this.g = list;
        this.h = str;
        this.i = bool;
        this.j = o9u0Var;
        this.k = s5u0Var;
        this.l = w210Var;
    }

    public /* synthetic */ cq60(List list, int i) {
        this(null, null, null, null, null, null, (i & 64) != 0 ? null : list, null, null, null, null, null);
    }
}
