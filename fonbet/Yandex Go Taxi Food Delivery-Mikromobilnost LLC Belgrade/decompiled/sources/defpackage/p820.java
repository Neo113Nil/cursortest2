package defpackage;

import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;

/* loaded from: classes9.dex */
public final class p820 {
    public final zzs a;
    public final String b;
    public final String c;
    public final z7l0 d;
    public final long e;
    public final q0t f;
    public final String g;
    public final o820 h;
    public final yu21 i;
    public final GeoPointAcquisitionType j;
    public String k;
    public final boolean l;

    public p820(zzs zzsVar, String str, String str2, z7l0 z7l0Var, long j, String str3, o820 o820Var, yu21 yu21Var, GeoPointAcquisitionType geoPointAcquisitionType, boolean z, int i) {
        q0t q0tVar = new q0t(0);
        String str4 = (i & 64) != 0 ? null : str3;
        o820 o820Var2 = (i & 128) != 0 ? null : o820Var;
        yu21 yu21Var2 = (i & 256) != 0 ? yu21.c : yu21Var;
        GeoPointAcquisitionType geoPointAcquisitionType2 = (i & 512) != 0 ? GeoPointAcquisitionType.DEFAULT : geoPointAcquisitionType;
        boolean z2 = (i & 2048) == 0 ? z : false;
        this.a = zzsVar;
        this.b = str;
        this.c = str2;
        this.d = z7l0Var;
        this.e = j;
        this.f = q0tVar;
        this.g = str4;
        this.h = o820Var2;
        this.i = yu21Var2;
        this.j = geoPointAcquisitionType2;
        this.k = null;
        this.l = z2;
    }
}
