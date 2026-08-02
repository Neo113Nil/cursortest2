package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.eatskit.dto.GeoPointSource;

@gsq0
/* loaded from: classes5.dex */
public final class l0t {
    public static final k0t Companion = new k0t();
    public static final i3y[] o = {a.b(LazyThreadSafetyMode.PUBLICATION, new sss(4)), null, null, null, null, null, null, null, null, null, null};
    public final GeoPointSource a;
    public final Double b;
    public final Double c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    public l0t(f0t f0tVar, GeoPointSource geoPointSource) {
        Double valueOf = f0tVar != null ? Double.valueOf(f0tVar.a) : null;
        Double valueOf2 = f0tVar != null ? Double.valueOf(f0tVar.b) : null;
        String str = f0tVar != null ? f0tVar.c : null;
        String str2 = (f0tVar == null || (str2 = f0tVar.d) == null) ? "" : str2;
        String str3 = f0tVar != null ? f0tVar.e : null;
        String str4 = f0tVar != null ? f0tVar.f : null;
        String str5 = f0tVar != null ? f0tVar.g : null;
        String str6 = f0tVar != null ? f0tVar.h : null;
        String str7 = f0tVar != null ? f0tVar.i : null;
        String str8 = f0tVar != null ? f0tVar.j : null;
        String str9 = f0tVar != null ? f0tVar.k : null;
        String str10 = f0tVar != null ? f0tVar.l : null;
        String str11 = f0tVar != null ? f0tVar.m : null;
        this.a = geoPointSource;
        this.b = valueOf;
        this.c = valueOf2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = str11;
    }

    public /* synthetic */ l0t(int i, GeoPointSource geoPointSource, Double d, Double d2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (6 != (i & 6)) {
            qje.Z(i, 6, j0t.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = geoPointSource;
        }
        this.b = d;
        this.c = d2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str6;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str7;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str8;
        }
        this.l = null;
        this.m = null;
        this.n = null;
    }
}
