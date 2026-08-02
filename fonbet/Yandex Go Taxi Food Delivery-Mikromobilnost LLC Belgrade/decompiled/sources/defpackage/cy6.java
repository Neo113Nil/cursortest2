package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcy6;", "Ln96;", "Lc6z;", "Companion", "by6", "ay6", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class cy6 extends n96 implements c6z {
    public static final by6 Companion = new by6();
    public static final i3y[] f = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new r66(6))};
    public static final cy6 g = new cy6(0);
    public final boolean b;
    public final String c;
    public final String d;
    public final Map e;

    public /* synthetic */ cy6(int i, String str, String str2, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 8) == 0) {
            this.e = b.f();
        } else {
            this.e = map;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.n96
    public final boolean b() {
        String str;
        String str2;
        return (!getB() || (str = this.c) == null || str.length() == 0 || (str2 = this.d) == null || str2.length() == 0 || d6z.Y(this, str2).length() == 0) ? false : true;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.e;
    }

    public cy6() {
        this(0);
    }

    public cy6(int i) {
        Map f2 = b.f();
        this.b = false;
        this.c = "";
        this.d = "";
        this.e = f2;
    }
}
