package defpackage;

import com.yandex.go.due.data.api.dto.TimetableInfo;
import com.yandex.go.due_timetable.domain.model.LoadingState;
import java.util.Calendar;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final class g0n {
    public final String a;
    public final LoadingState b;
    public final mp60 c;
    public final cus0 d;
    public final cus0 e;
    public final Double f;
    public final Double g;
    public final Calendar h;
    public final Integer i;
    public final Integer j;
    public final TimetableInfo k;
    public final aof0 l;
    public final String m;
    public final wym n;

    public g0n(LoadingState loadingState, int i) {
        this(null, (i & 2) != 0 ? LoadingState.NON_BLOCKING_LOADING : loadingState, np60.b, null, null, null, null, null, null, null, null, new aof0(0), null, null);
    }

    public static g0n a(g0n g0nVar, String str, LoadingState loadingState, mp60 mp60Var, cus0 cus0Var, cus0 cus0Var2, Double d, Double d2, Calendar calendar, Integer num, Integer num2, TimetableInfo timetableInfo, aof0 aof0Var, String str2, wym wymVar, int i) {
        String str3 = (i & 1) != 0 ? g0nVar.a : str;
        LoadingState loadingState2 = (i & 2) != 0 ? g0nVar.b : loadingState;
        mp60 mp60Var2 = (i & 4) != 0 ? g0nVar.c : mp60Var;
        cus0 cus0Var3 = (i & 8) != 0 ? g0nVar.d : cus0Var;
        cus0 cus0Var4 = (i & 16) != 0 ? g0nVar.e : cus0Var2;
        Double d3 = (i & 32) != 0 ? g0nVar.f : d;
        Double d4 = (i & 64) != 0 ? g0nVar.g : d2;
        Calendar calendar2 = (i & 128) != 0 ? g0nVar.h : calendar;
        Integer num3 = (i & 256) != 0 ? g0nVar.i : num;
        Integer num4 = (i & 512) != 0 ? g0nVar.j : num2;
        TimetableInfo timetableInfo2 = (i & 1024) != 0 ? g0nVar.k : timetableInfo;
        aof0 aof0Var2 = (i & 2048) != 0 ? g0nVar.l : aof0Var;
        String str4 = (i & 4096) != 0 ? g0nVar.m : str2;
        wym wymVar2 = (i & 8192) != 0 ? g0nVar.n : wymVar;
        g0nVar.getClass();
        return new g0n(str3, loadingState2, mp60Var2, cus0Var3, cus0Var4, d3, d4, calendar2, num3, num4, timetableInfo2, aof0Var2, str4, wymVar2);
    }

    public final rsg b() {
        cus0 cus0Var = this.d;
        if (cus0Var != null) {
            int i = (int) (cus0Var.a >> 32);
            mp60 mp60Var = this.c;
            d6w n = y6i0.n(0, mp60Var.b);
            int i2 = n.a;
            if (i <= n.b && i2 <= i) {
                return (rsg) mp60Var.b(i);
            }
        }
        return null;
    }

    public final e8z0 c() {
        rsg b = b();
        xy40 xy40Var = b != null ? b.c : np60.b;
        cus0 cus0Var = this.d;
        if (cus0Var == null) {
            return null;
        }
        int i = (int) (cus0Var.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        d6w n = y6i0.n(0, xy40Var.b);
        int i2 = n.a;
        if (i > n.b || i2 > i) {
            return null;
        }
        return (e8z0) xy40Var.b(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0n)) {
            return false;
        }
        g0n g0nVar = (g0n) obj;
        return jl40.l(this.a, g0nVar.a) && this.b == g0nVar.b && jl40.l(this.c, g0nVar.c) && jl40.l(this.d, g0nVar.d) && jl40.l(this.e, g0nVar.e) && jl40.l(this.f, g0nVar.f) && jl40.l(this.g, g0nVar.g) && jl40.l(this.h, g0nVar.h) && jl40.l(this.i, g0nVar.i) && jl40.l(this.j, g0nVar.j) && jl40.l(this.k, g0nVar.k) && jl40.l(this.l, g0nVar.l) && jl40.l(this.m, g0nVar.m) && jl40.l(this.n, g0nVar.n);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        cus0 cus0Var = this.d;
        int hashCode2 = (hashCode + (cus0Var == null ? 0 : Long.hashCode(cus0Var.a))) * 31;
        cus0 cus0Var2 = this.e;
        int hashCode3 = (hashCode2 + (cus0Var2 == null ? 0 : Long.hashCode(cus0Var2.a))) * 31;
        Double d = this.f;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.g;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Calendar calendar = this.h;
        int hashCode6 = (hashCode5 + (calendar == null ? 0 : calendar.hashCode())) * 31;
        Integer num = this.i;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.j;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        TimetableInfo timetableInfo = this.k;
        int hashCode9 = (this.l.hashCode() + ((hashCode8 + (timetableInfo == null ? 0 : timetableInfo.hashCode())) * 31)) * 31;
        String str2 = this.m;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        wym wymVar = this.n;
        return hashCode10 + (wymVar != null ? wymVar.hashCode() : 0);
    }

    public g0n(String str, LoadingState loadingState, mp60 mp60Var, cus0 cus0Var, cus0 cus0Var2, Double d, Double d2, Calendar calendar, Integer num, Integer num2, TimetableInfo timetableInfo, aof0 aof0Var, String str2, wym wymVar) {
        this.a = str;
        this.b = loadingState;
        this.c = mp60Var;
        this.d = cus0Var;
        this.e = cus0Var2;
        this.f = d;
        this.g = d2;
        this.h = calendar;
        this.i = num;
        this.j = num2;
        this.k = timetableInfo;
        this.l = aof0Var;
        this.m = str2;
        this.n = wymVar;
    }
}
