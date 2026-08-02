package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lgww0;", "Lxn11;", "Lc6z;", "Companion", "a", "dww0", "cww0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class gww0 implements xn11, c6z {
    public static final dww0 Companion = new dww0();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlw0(8)), null, null, null};
    public final boolean b;
    public final Map c;
    public final a d;
    public final String e;
    public final String f;

    public /* synthetic */ gww0(int i, boolean z, Map map, a aVar, String str, String str2) {
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
            this.d = new a(0);
        } else {
            this.d = aVar;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str2;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getE() {
        return this.c;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgww0$a;", "", "Companion", "eww0", "fww0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final fww0 Companion = new fww0();
        public final int a;
        public final int b;

        public /* synthetic */ a(int i, int i2, int i3) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i3;
            }
        }

        public a(int i) {
            this.a = 0;
            this.b = 0;
        }

        public a() {
            this(0);
        }
    }

    public gww0() {
        this(0);
    }

    public gww0(int i) {
        Map f = b.f();
        a aVar = new a(0);
        this.b = false;
        this.c = f;
        this.d = aVar;
        this.e = "";
        this.f = "";
    }
}
