package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lkiv0;", "Ln96;", "Lc6z;", "Companion", "a", "fiv0", "eiv0", "tooltips"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class kiv0 extends n96 implements c6z {
    public static final fiv0 Companion = new fiv0();
    public static final i3y[] e;
    public static final kiv0 f;
    public final boolean b;
    public final Map c;
    public final Map d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new c3u0(27)), kotlin.a.b(lazyThreadSafetyMode, new c3u0(28))};
        f = new kiv0(0);
    }

    public /* synthetic */ kiv0(int i, boolean z, Map map, Map map2) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = b.f();
        } else {
            this.d = map2;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkiv0$a;", "", "Companion", "a", "giv0", "hiv0", "tooltips"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes6.dex */
    public static final class a {
        public static final hiv0 Companion = new hiv0();
        public final String a;
        public final String b;
        public final C0101a c;

        public /* synthetic */ a(int i, String str, String str2, C0101a c0101a) {
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
            if ((i & 4) == 0) {
                this.c = new C0101a(0);
            } else {
                this.c = c0101a;
            }
        }

        public static final /* synthetic */ void a(a aVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(aVar.a, "")) {
                yjdVar.o(serialDescriptor, 0, aVar.a);
            }
            if (yjdVar.F() || !jl40.l(aVar.b, "")) {
                yjdVar.o(serialDescriptor, 1, aVar.b);
            }
            if (!yjdVar.F() && jl40.l(aVar.c, new C0101a(0))) {
                return;
            }
            yjdVar.e(serialDescriptor, 2, iiv0.a, aVar.c);
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkiv0$a$a;", "", "Companion", "iiv0", "jiv0", "tooltips"}, k = 1, mv = {2, 4, 0}, xi = 48)
        /* renamed from: kiv0$a$a, reason: collision with other inner class name */
        public static final class C0101a {
            public static final jiv0 Companion = new jiv0();
            public final int a;
            public final Integer b;

            public /* synthetic */ C0101a(int i, int i2, Integer num) {
                this.a = (i & 1) == 0 ? 0 : i2;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = num;
                }
            }

            public C0101a(int i) {
                this.a = 0;
                this.b = null;
            }

            public C0101a() {
                this(0);
            }
        }

        public a() {
            C0101a c0101a = new C0101a(0);
            this.a = "";
            this.b = "";
            this.c = c0101a;
        }
    }

    public kiv0() {
        this(0);
    }

    public kiv0(int i) {
        Map f2 = b.f();
        Map f3 = b.f();
        this.b = false;
        this.c = f2;
        this.d = f3;
    }
}
