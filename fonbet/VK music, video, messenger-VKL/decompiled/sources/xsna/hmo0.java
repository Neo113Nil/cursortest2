package xsna;

import android.content.Context;
import android.graphics.Typeface;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stories.model.TextBackgroundInfo;
import com.vkontakte.android.R;

/* compiled from: TextStickerFontStyles.java */
/* loaded from: classes15.dex */
public final class hmo0 {
    public static final float a = iah0.a(12);
    public static final float b = iah0.a(80);
    public static final t5s[] c = {new e(), new d(), new f(), new h(), new k(), new b(), new a(), new i(), new j(), new l()};
    public static final e d = new e();

    /* compiled from: TextStickerFontStyles.java */
    public static class a extends m {
        public a() {
            this.e = g.a.a();
            this.b = new dco0();
            cco0 cco0Var = new cco0();
            this.c = cco0Var;
            this.a = new ix5[]{this.b, cco0Var};
            hmo0.a(this);
        }

        @Override // xsna.hmo0.c
        public final String i() {
            return "BarrelsLightItalic";
        }

        @Override // xsna.hmo0.m
        public final int j() {
            return R.drawable.vk_icon_font_tt_barrels_italic;
        }
    }

    /* compiled from: TextStickerFontStyles.java */
    public static class b extends m {
        public b() {
            this.e = g.b.a();
            this.b = new dco0();
            cco0 cco0Var = new cco0();
            this.c = cco0Var;
            this.a = new ix5[]{this.b, cco0Var};
            hmo0.a(this);
        }

        @Override // xsna.hmo0.c
        public final String i() {
            return "BarrelsRegular";
        }

        @Override // xsna.hmo0.m
        public final int j() {
            return R.drawable.vk_icon_font_tt_barrels;
        }
    }

    /* compiled from: TextStickerFontStyles.java */
    public static abstract class c implements t5s {
        public ix5[] a;
        public dco0 b;
        public cco0 c;
        public float d;
        public Typeface e;
        public float f;
        public final float g = iah0.a(1);
        public final float h = iah0.a(7);
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public float q;
        public float r;
        public boolean s;
        public float t;
        public float u;

        @Override // xsna.t5s
        public final float a() {
            return hmo0.a * 1.0f;
        }

        @Override // xsna.b7l0
        public final void b(imo0 imo0Var) {
            imo0Var.a = this.e;
            float f = this.d;
            imo0Var.d = (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            imo0Var.e = this.f;
            b5j0 b5j0Var = imo0Var.l;
            float f2 = this.g;
            float b = (int) u11.b(this.h, f2, f, f2);
            b5j0Var.a = b;
            if (b > 25.0f) {
                b5j0Var.a = 25.0f;
            }
            TextBackgroundInfo textBackgroundInfo = imo0Var.k;
            float f3 = this.t;
            textBackgroundInfo.j = u11.b(this.u, f3, f, f3);
            textBackgroundInfo.h = this.s;
            if (textBackgroundInfo.a == TextBackgroundInfo.Outline.LINE) {
                textBackgroundInfo.b = (int) (((this.m - r2) * f) + this.i);
                textBackgroundInfo.c = (int) (((this.n - r2) * f) + this.j);
                textBackgroundInfo.d = (int) (((this.o - r2) * f) + this.k);
                textBackgroundInfo.e = (int) (((this.p - r2) * f) + this.l);
                float f4 = this.q;
                textBackgroundInfo.g = u11.b(this.r, f4, f, f4);
            }
            imo0Var.m = i();
        }

        @Override // xsna.t5s
        public final ix5[] c() {
            return this.a;
        }

        @Override // xsna.t5s
        public final float d() {
            return hmo0.b * 1.0f;
        }

        @Override // xsna.t5s
        public final void e(float f) {
            this.d = f;
        }

        @Override // xsna.t5s
        public final Typeface f() {
            return this.e;
        }

        @Override // xsna.t5s
        public final ix5 g(ix5 ix5Var) {
            if (ix5Var == null) {
                return this.a[0];
            }
            for (ix5 ix5Var2 : this.a) {
                if (ix5Var2.equals(ix5Var)) {
                    return ix5Var2;
                }
            }
            ix5 ix5Var3 = ix5Var instanceof dco0 ? this.b : this.c;
            return ix5Var3 == null ? this.a[0] : ix5Var3;
        }

        public abstract String i();
    }

    /* compiled from: TextStickerFontStyles.java */
    public static class d extends m {
        public d() {
            this.e = g.e.a();
            this.b = new dco0();
            cco0 cco0Var = new cco0();
            this.c = cco0Var;
            this.a = new ix5[]{this.b, cco0Var};
            hmo0.a(this);
        }

        @Override // xsna.hmo0.c
        public final String i() {
            return "CommonsBoldItalic";
        }

        @Override // xsna.hmo0.m
        public final int j() {
            return R.drawable.vk_icon_font_tt_commons_bold_italic;
        }
    }

    /* compiled from: TextStickerFontStyles.java */
    public static class e extends m {
        public e() {
            this.e = g.d.a();
            this.b = new dco0();
            cco0 cco0Var = new cco0();
            this.c = cco0Var;
            this.a = new ix5[]{this.b, cco0Var};
            hmo0.a(this);
        }

        @Override // xsna.hmo0.c
        public final String i() {
            return "CommonsMedium";
        }

        @Override // xsna.hmo0.m
        public final int j() {
            return R.drawable.vk_icon_font_tt_commons;
        }
    }

    /* compiled from: TextStickerFontStyles.java */
    public static class f extends m {
        public f() {
            this.e = g.f.a();
            this.b = new dco0();
            cco0 cco0Var = new cco0();
            this.c = cco0Var;
            this.a = new ix5[]{this.b, cco0Var};
            hmo0.a(this);
        }

        @Override // xsna.hmo0.c
        public final String i() {
            return "FirsDemiBold";
        }

        @Override // xsna.hmo0.m
        public final int j() {
            return R.drawable.vk_icon_font_tt_firs_demibold_32h;
        }
    }

    /* compiled from: TextStickerFontStyles.java */
    public static class g {
        public static final a a = new a("fonts/TT_Barrels_Light_Italic.ttf");
        public static final a b = new a("fonts/TT_Barrels_Regular.ttf");
        public static final a c = new a("fonts/TT_Lovelies_Script.ttf");
        public static final a d = new a("fonts/TT_Commons_Medium.ttf");
        public static final a e = new a("fonts/TT_Commons_Bold_Italic.ttf");
        public static final a f = new a("fonts/TT_Firs_Neue_DemiBold.ttf");
        public static final a g = new a("fonts/TT_Knickerbockers_Grotesk.ttf");
        public static final a h = new a("fonts/TT_Knickerbockers_Script.ttf");
        public static final a i = new a("fonts/TT_Rounds_Neue_Medium.ttf");
        public static final a j = new a("fonts/TT_Phobos_Regular.ttf");

        /* compiled from: TextStickerFontStyles.java */
        public static class a {
            public final String a;
            public Typeface b;

            public a(String str) {
                this.a = str;
            }

            public final Typeface a() {
                if (this.b == null) {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    this.b = Typeface.createFromAsset(context.getAssets(), this.a);
                }
                return this.b;
            }
        }
    }

    /* compiled from: TextStickerFontStyles.java */
    public static class h extends m {
        public h() {
            this.e = g.g.a();
            this.b = new dco0();
            cco0 cco0Var = new cco0();
            this.c = cco0Var;
            this.a = new ix5[]{this.b, cco0Var};
            hmo0.a(this);
        }

        @Override // xsna.hmo0.c
        public final String i() {
            return "KnickerbockersGrotesk";
        }

        @Override // xsna.hmo0.m
        public final int j() {
            return R.drawable.vk_icon_font_tt_knickerbockers_grotesk_32h;
        }
    }

    /* compiled from: TextStickerFontStyles.java */
    public static class i extends m {
        public i() {
            this.e = g.h.a();
            this.b = new dco0();
            cco0 cco0Var = new cco0();
            this.c = cco0Var;
            this.a = new ix5[]{this.b, cco0Var};
            hmo0.a(this);
        }

        @Override // xsna.hmo0.c
        public final String i() {
            return "KnickerbockersTrialScript";
        }

        @Override // xsna.hmo0.m
        public final int j() {
            return R.drawable.vk_icon_font_tt_knickerbockers_script_32h;
        }
    }

    /* compiled from: TextStickerFontStyles.java */
    public static class j extends m {
        public j() {
            this.e = g.c.a();
            this.b = new dco0();
            cco0 cco0Var = new cco0();
            this.c = cco0Var;
            this.a = new ix5[]{this.b, cco0Var};
            hmo0.a(this);
        }

        @Override // xsna.hmo0.c
        public final String i() {
            return "LoveliesScript";
        }

        @Override // xsna.hmo0.m
        public final int j() {
            return R.drawable.vk_icon_font_tt_lovelies;
        }
    }

    /* compiled from: TextStickerFontStyles.java */
    public static class k extends m {
        public k() {
            this.e = g.j.a();
            this.b = new dco0();
            cco0 cco0Var = new cco0();
            this.c = cco0Var;
            this.a = new ix5[]{this.b, cco0Var};
            hmo0.a(this);
        }

        @Override // xsna.hmo0.c
        public final String i() {
            return "PhobosRegular";
        }

        @Override // xsna.hmo0.m
        public final int j() {
            return R.drawable.vk_icon_font_tt_phobos_32h;
        }
    }

    /* compiled from: TextStickerFontStyles.java */
    public static class l extends m {
        public l() {
            this.e = g.i.a();
            this.b = new dco0();
            cco0 cco0Var = new cco0();
            this.c = cco0Var;
            this.a = new ix5[]{this.b, cco0Var};
            hmo0.a(this);
        }

        @Override // xsna.hmo0.c
        public final String i() {
            return "RoundsNeueMedium";
        }

        @Override // xsna.hmo0.m
        public final int j() {
            return R.drawable.vk_icon_font_tt_rounds_medium_up_32h;
        }
    }

    /* compiled from: TextStickerFontStyles.java */
    public static abstract class m extends c {
        public abstract int j();
    }

    public static void a(m mVar) {
        mVar.f = 0.9f;
        float f2 = 5;
        mVar.i = iah0.a(f2);
        float f3 = 3;
        mVar.j = iah0.a(f3);
        mVar.k = iah0.a(f2);
        mVar.l = iah0.a(f3);
        float f4 = 28;
        mVar.m = iah0.a(f4);
        mVar.n = iah0.a(20);
        mVar.o = iah0.a(24);
        mVar.p = iah0.a(f4);
        mVar.s = true;
        float f5 = 12;
        mVar.q = iah0.a(f5);
        mVar.r = iah0.a(f5);
        mVar.t = iah0.a(1.7f);
        mVar.u = iah0.a(10.0f);
    }
}
