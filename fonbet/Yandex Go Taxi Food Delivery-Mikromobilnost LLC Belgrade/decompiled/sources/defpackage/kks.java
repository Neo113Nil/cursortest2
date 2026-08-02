package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.yandex.taxi.address.experiment.NextButtonShowStrategy;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkks;", "Lvn11;", "Lc6z;", "Companion", "jks", "iks", "sourcedestination"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class kks implements vn11, c6z {
    public static final jks Companion = new jks();
    public static final i3y[] n;
    public static final kks o;
    public final boolean b;
    public final boolean c;
    public final Map d;
    public final mv0 e;
    public final mv0 f;
    public final String g;
    public final String h;
    public final String i;
    public final NextButtonShowStrategy j;
    public final String k;
    public final String l;
    public final boolean m;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        n = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new j8s(23)), null, null, null, null, null, a.b(lazyThreadSafetyMode, new j8s(24)), null, null, null};
        o = new kks(0);
    }

    public /* synthetic */ kks(int i, boolean z, boolean z2, Map map, mv0 mv0Var, mv0 mv0Var2, String str, String str2, String str3, NextButtonShowStrategy nextButtonShowStrategy, String str4, String str5, boolean z3) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 4) == 0) {
            this.d = b.f();
        } else {
            this.d = map;
        }
        if ((i & 8) == 0) {
            this.e = new mv0(0);
        } else {
            this.e = mv0Var;
        }
        if ((i & 16) == 0) {
            this.f = new mv0(0);
        } else {
            this.f = mv0Var2;
        }
        if ((i & 32) == 0) {
            this.g = "";
        } else {
            this.g = str;
        }
        if ((i & 64) == 0) {
            this.h = "";
        } else {
            this.h = str2;
        }
        if ((i & 128) == 0) {
            this.i = "";
        } else {
            this.i = str3;
        }
        if ((i & 256) == 0) {
            this.j = NextButtonShowStrategy.NONE;
        } else {
            this.j = nextButtonShowStrategy;
        }
        if ((i & 512) == 0) {
            this.k = "";
        } else {
            this.k = str4;
        }
        if ((i & 1024) == 0) {
            this.l = "";
        } else {
            this.l = str5;
        }
        if ((i & 2048) == 0) {
            this.m = false;
        } else {
            this.m = z3;
        }
    }

    public final boolean a() {
        return this.b && !this.e.a() && !this.f.a() && d6z.Z(this, this.g) && d6z.Z(this, this.h) && d6z.Z(this, this.i);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.d;
    }

    public kks() {
        this(0);
    }

    public kks(int i) {
        Map f = b.f();
        mv0 mv0Var = new mv0(0);
        mv0 mv0Var2 = new mv0(0);
        NextButtonShowStrategy nextButtonShowStrategy = NextButtonShowStrategy.NONE;
        this.b = false;
        this.c = false;
        this.d = f;
        this.e = mv0Var;
        this.f = mv0Var2;
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = nextButtonShowStrategy;
        this.k = "";
        this.l = "";
        this.m = false;
    }
}
