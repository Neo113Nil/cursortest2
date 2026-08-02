package xsna;

/* compiled from: Savers.kt */
/* loaded from: classes11.dex */
public final class i2h0 {
    public static final fh9 a = new fh9(new r1d(7), new v4v(28));
    public static final fh9 b = new fh9(new rv4(0, 6), new nc90(11));
    public static final fh9 c = new fh9(new noi(0, 5), new irt(19));
    public static final fh9 d = new fh9(new tji(7), new q520(19));
    public static final fh9 e = new fh9(new hkb(8), new x620(20));
    public static final fh9 f = new fh9(new rc9(0, 3), new pey(25));
    public static final fh9 g = new fh9(new f07(0, 11), new u620(22));
    public static final fh9 h = new fh9(new uni(4), new kl60(16));
    public static final fh9 i = new fh9(new tg4(0, 5), new y510(20));
    public static final fh9 j = new fh9(new adf(0, 5), new d4r(27));
    public static final fh9 k = new fh9(new zh3(6), new av70(12));
    public static final fh9 l = new fh9(new uhd(7), new g2h0(0));
    public static final fh9 m = new fh9(new uki(3), new nyq(25));
    public static final fh9 n = new fh9(new z2(10), new acc0(6));
    public static final fh9 o = new fh9(new xpd(0, 7), new j6e0(3));
    public static final fh9 p = new fh9(new qg3(5), new f6w(21));
    public static final fh9 q = new fh9(new f21(5), new oey(23));
    public static final j2h0 r = new j2h0(b.b, a.b);
    public static final j2h0 s = new j2h0(new zos(25), new ac1(0, 4));
    public static final j2h0 t = new j2h0(new pyz(24), new j21(0, 12));
    public static final j2h0 u = new j2h0(new qcw(24), new t8c(6));
    public static final fh9 v = new fh9(new u8c(0, 4), new i0r(17));
    public static final fh9 w = new fh9(new twa(0, 6), new gz30(16));
    public static final j2h0 x = new j2h0(new j0r(28), new log(12));
    public static final j2h0 y = new j2h0(new ulz(23), new th5(0, 2));
    public static final j2h0 z = new j2h0(new ha40(11), new com.vk.movika.tools.controls.seekbar.o(7));
    public static final fh9 A = new fh9(new jue(3), new svz(24));
    public static final fh9 B = new fh9(new gre(5), new h2h0(0));
    public static final fh9 C = new fh9(new hre(4), new n1g0(1));
    public static final j2h0 D = new j2h0(new ye40(12), new kli(0, 6));
    public static final j2h0 E = new j2h0(new xsq(24), new w4b(5));
    public static final j2h0 F = new j2h0(new juz(25), new od1(5));

    /* compiled from: Savers.kt */
    public static final class a implements wzs<f2h0, l5g, Object> {
        public static final a b = new a();

        @Override // xsna.wzs
        public final Object invoke(f2h0 f2h0Var, l5g l5gVar) {
            long j = l5gVar.a;
            return j == 16 ? Boolean.FALSE : Integer.valueOf(f870.H(j));
        }
    }

    /* compiled from: Savers.kt */
    public static final class b implements izs<Object, l5g> {
        public static final b b = new b();

        @Override // xsna.izs
        public final l5g invoke(Object obj) {
            return epx.f(obj, Boolean.FALSE) ? new l5g(l5g.k) : new l5g(f870.c(((Integer) obj).intValue()));
        }
    }

    /* compiled from: Savers.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[dt2.values().length];
            try {
                iArr[dt2.Paragraph.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dt2.Span.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dt2.VerbatimTts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[dt2.Url.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[dt2.Link.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[dt2.Clickable.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[dt2.String.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T extends e2h0<Original, Saveable>, Original, Saveable> Object a(Original original, T t2, f2h0 f2h0Var) {
        Object i2;
        return (original == null || (i2 = t2.i(f2h0Var, original)) == null) ? Boolean.FALSE : i2;
    }
}
