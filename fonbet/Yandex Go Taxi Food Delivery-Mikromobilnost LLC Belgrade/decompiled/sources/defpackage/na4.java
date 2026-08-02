package defpackage;

import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptySet;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lna4;", "Ln96;", "Lc6z;", "Companion", "ma4", "la4", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class na4 extends n96 implements c6z {
    public static final ma4 Companion = new ma4();
    public static final i3y[] h;
    public static final na4 i;
    public final boolean b;
    public final Map c;
    public final Set d;
    public final String e;
    public final String f;
    public final String g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, a.b(lazyThreadSafetyMode, new q03(11)), a.b(lazyThreadSafetyMode, new q03(12)), null, null, null};
        i = new na4(0);
    }

    public /* synthetic */ na4(int i2, boolean z, Map map, Set set, String str, String str2, String str3) {
        this.b = (i2 & 1) == 0 ? false : z;
        if ((i2 & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = EmptySet.a;
        } else {
            this.d = set;
        }
        if ((i2 & 8) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
        if ((i2 & 16) == 0) {
            this.f = "";
        } else {
            this.f = str2;
        }
        if ((i2 & 32) == 0) {
            this.g = "";
        } else {
            this.g = str3;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public na4() {
        this(0);
    }

    public na4(int i2) {
        Map f = b.f();
        this.b = false;
        this.c = f;
        this.d = EmptySet.a;
        this.e = "";
        this.f = "";
        this.g = "";
    }
}
