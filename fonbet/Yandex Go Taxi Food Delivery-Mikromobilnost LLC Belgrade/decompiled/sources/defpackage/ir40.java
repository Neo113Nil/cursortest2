package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lir40;", "Lxn11;", "Lc6z;", "Companion", "a", "fr40", "er40", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ir40 implements xn11, c6z {
    public static final fr40 Companion = new fr40();
    public static final i3y[] j = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ah40(12)), null, null, null, null, null, null};
    public static final ir40 k = new ir40(0);
    public final boolean b;
    public final Map c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final a h;
    public final a i;

    public /* synthetic */ ir40(int i, boolean z, Map map, Integer num, Integer num2, Integer num3, Integer num4, a aVar, a aVar2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = num3;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = num4;
        }
        if ((i & 64) == 0) {
            this.h = new a(0);
        } else {
            this.h = aVar;
        }
        if ((i & 128) == 0) {
            this.i = new a(0);
        } else {
            this.i = aVar2;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getJ() {
        return this.c;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lir40$a;", "", "Companion", "gr40", "hr40", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class a {
        public static final hr40 Companion = new hr40();
        public final String a;
        public final String b;
        public final long c;
        public final String d;

        public /* synthetic */ a(int i, long j, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            this.c = (i & 4) == 0 ? 0L : j;
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
        }

        public a(int i) {
            this.a = "";
            this.b = "";
            this.c = 0L;
            this.d = "";
        }

        public a() {
            this(0);
        }
    }

    public ir40() {
        this(0);
    }

    public ir40(int i) {
        Map f = b.f();
        a aVar = new a(0);
        a aVar2 = new a(0);
        this.b = false;
        this.c = f;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = aVar;
        this.i = aVar2;
    }
}
