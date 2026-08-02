package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ljmp;", "", "Companion", "hmp", "imp", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class jmp {
    public static final imp Companion = new imp();
    public static final i3y[] l;
    public final hqx a;
    public final bxu0 b;
    public final bxu0 c;
    public final List d;
    public final rl6 e;
    public final List f;
    public final List g;
    public final mmp h;
    public final List i;
    public final f0k j;
    public final MapObjectType k;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{null, null, null, a.b(lazyThreadSafetyMode, new thp(10)), null, a.b(lazyThreadSafetyMode, new thp(11)), a.b(lazyThreadSafetyMode, new thp(12)), null, a.b(lazyThreadSafetyMode, new thp(13)), null, a.b(lazyThreadSafetyMode, new thp(14))};
    }

    public /* synthetic */ jmp(int i, hqx hqxVar, bxu0 bxu0Var, bxu0 bxu0Var2, List list, rl6 rl6Var, List list2, List list3, mmp mmpVar, List list4, f0k f0kVar, MapObjectType mapObjectType) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = hqxVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bxu0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bxu0Var2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = rl6Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = mmpVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = f0kVar;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = mapObjectType;
        }
    }

    public static jmp a(jmp jmpVar) {
        hqx hqxVar = jmpVar.a;
        bxu0 bxu0Var = jmpVar.b;
        bxu0 bxu0Var2 = jmpVar.c;
        List list = jmpVar.d;
        List list2 = jmpVar.f;
        List list3 = jmpVar.g;
        mmp mmpVar = jmpVar.h;
        List list4 = jmpVar.i;
        f0k f0kVar = jmpVar.j;
        MapObjectType mapObjectType = jmpVar.k;
        jmpVar.getClass();
        return new jmp(hqxVar, bxu0Var, bxu0Var2, list, null, list2, list3, mmpVar, list4, f0kVar, mapObjectType);
    }

    /* renamed from: b, reason: from getter */
    public final mmp getH() {
        return this.h;
    }

    /* renamed from: c, reason: from getter */
    public final rl6 getE() {
        return this.e;
    }

    /* renamed from: d, reason: from getter */
    public final List getD() {
        return this.d;
    }

    /* renamed from: e, reason: from getter */
    public final f0k getJ() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmp)) {
            return false;
        }
        jmp jmpVar = (jmp) obj;
        return jl40.l(this.a, jmpVar.a) && jl40.l(this.b, jmpVar.b) && jl40.l(this.c, jmpVar.c) && jl40.l(this.d, jmpVar.d) && jl40.l(this.e, jmpVar.e) && jl40.l(this.f, jmpVar.f) && jl40.l(this.g, jmpVar.g) && jl40.l(this.h, jmpVar.h) && jl40.l(this.i, jmpVar.i) && jl40.l(this.j, jmpVar.j) && this.k == jmpVar.k;
    }

    /* renamed from: f, reason: from getter */
    public final List getG() {
        return this.g;
    }

    /* renamed from: g, reason: from getter */
    public final List getI() {
        return this.i;
    }

    /* renamed from: h, reason: from getter */
    public final List getF() {
        return this.f;
    }

    public final int hashCode() {
        hqx hqxVar = this.a;
        int hashCode = (hqxVar == null ? 0 : hqxVar.hashCode()) * 31;
        bxu0 bxu0Var = this.b;
        int hashCode2 = (hashCode + (bxu0Var == null ? 0 : bxu0Var.hashCode())) * 31;
        bxu0 bxu0Var2 = this.c;
        int hashCode3 = (hashCode2 + (bxu0Var2 == null ? 0 : bxu0Var2.hashCode())) * 31;
        List list = this.d;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        rl6 rl6Var = this.e;
        int hashCode5 = (hashCode4 + (rl6Var == null ? 0 : rl6Var.hashCode())) * 31;
        List list2 = this.f;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.g;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        mmp mmpVar = this.h;
        int hashCode8 = (hashCode7 + (mmpVar == null ? 0 : mmpVar.hashCode())) * 31;
        List list4 = this.i;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        f0k f0kVar = this.j;
        int hashCode10 = (hashCode9 + (f0kVar == null ? 0 : f0kVar.hashCode())) * 31;
        MapObjectType mapObjectType = this.k;
        return hashCode10 + (mapObjectType != null ? mapObjectType.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final bxu0 getC() {
        return this.c;
    }

    /* renamed from: j, reason: from getter */
    public final bxu0 getB() {
        return this.b;
    }

    /* renamed from: k, reason: from getter */
    public final MapObjectType getK() {
        return this.k;
    }

    public final String toString() {
        return "FeatureProperties(label=" + this.a + ", style=" + this.b + ", simplifiedStyle=" + this.c + ", bubbles=" + this.d + ", bubble=" + this.e + ", overlays=" + this.f + ", imageOverlays=" + this.g + ", behavior=" + this.h + ", options=" + this.i + ", displaySettings=" + this.j + ", type=" + this.k + Extension.C_BRAKE;
    }

    public jmp() {
        this(null, null, null, null, 2047);
    }

    public jmp(hqx hqxVar, bxu0 bxu0Var, bxu0 bxu0Var2, List list, rl6 rl6Var, List list2, List list3, mmp mmpVar, List list4, f0k f0kVar, MapObjectType mapObjectType) {
        this.a = hqxVar;
        this.b = bxu0Var;
        this.c = bxu0Var2;
        this.d = list;
        this.e = rl6Var;
        this.f = list2;
        this.g = list3;
        this.h = mmpVar;
        this.i = list4;
        this.j = f0kVar;
        this.k = mapObjectType;
    }

    public /* synthetic */ jmp(hqx hqxVar, bxu0 bxu0Var, f0k f0kVar, MapObjectType mapObjectType, int i) {
        this((i & 1) != 0 ? null : hqxVar, (i & 2) != 0 ? null : bxu0Var, null, null, null, null, null, null, null, (i & 512) != 0 ? null : f0kVar, (i & 1024) != 0 ? null : mapObjectType);
    }
}
