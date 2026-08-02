package xsna;

import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsBannerCompanionConfig;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsButtonToVideoConfig;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsFeedRecyclerPoolSettings;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsMarketAdHeaderClickConfig;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsMarketItemsShowTimeConfig;

/* compiled from: ClipsViewersExperiments.kt */
/* loaded from: classes.dex */
public interface yof {
    public static final a a = a.a;

    /* compiled from: ClipsViewersExperiments.kt */
    /* loaded from: classes17.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final yof STUB = new C4124a();

        /* compiled from: ClipsViewersExperiments.kt */
        /* renamed from: xsna.yof$a$a, reason: collision with other inner class name */
        public static final class C4124a implements yof {
            public final ClipsMarketItemsShowTimeConfig b;
            public final f2e c;
            public final ClipsBannerCompanionConfig d;
            public final ClipsBannerCompanionConfig e;
            public final maf f;
            public final lle g;
            public final mle h;
            public final wme i;
            public final ClipsFeedRecyclerPoolSettings j;
            public final lgd k;
            public final ClipsButtonToVideoConfig l;
            public final b6e m;
            public final y6e n;
            public final a6e o;
            public final ClipsMarketAdHeaderClickConfig p;

            public C4124a() {
                ClipsMarketItemsShowTimeConfig.VisibilityMode visibilityMode = ClipsMarketItemsShowTimeConfig.d;
                this.b = ClipsMarketItemsShowTimeConfig.e;
                this.c = f2e.a;
                ClipsBannerCompanionConfig clipsBannerCompanionConfig = ClipsBannerCompanionConfig.d;
                ClipsBannerCompanionConfig clipsBannerCompanionConfig2 = ClipsBannerCompanionConfig.d;
                this.d = clipsBannerCompanionConfig2;
                this.e = clipsBannerCompanionConfig2;
                this.f = maf.d;
                this.g = lle.c;
                this.h = mle.e;
                this.i = wme.c;
                ClipsFeedRecyclerPoolSettings.InflateMode inflateMode = ClipsFeedRecyclerPoolSettings.b;
                this.j = ClipsFeedRecyclerPoolSettings.c;
                this.k = lgd.e;
                ClipsButtonToVideoConfig clipsButtonToVideoConfig = ClipsButtonToVideoConfig.b;
                this.l = ClipsButtonToVideoConfig.b;
                this.m = b6e.c;
                this.n = y6e.c;
                this.o = a6e.d;
                ClipsMarketAdHeaderClickConfig clipsMarketAdHeaderClickConfig = ClipsMarketAdHeaderClickConfig.c;
                this.p = ClipsMarketAdHeaderClickConfig.c;
            }

            @Override // xsna.yof
            public final ClipsBannerCompanionConfig E() {
                return this.e;
            }

            @Override // xsna.yof
            public final maf J() {
                return this.f;
            }

            @Override // xsna.yof
            public final mle L() {
                return this.h;
            }

            @Override // xsna.yof
            public final a6e N() {
                return this.o;
            }

            @Override // xsna.yof
            public final y6e O() {
                return this.n;
            }

            @Override // xsna.yof
            public final ClipsButtonToVideoConfig P() {
                return this.l;
            }

            @Override // xsna.yof
            public final boolean Q() {
                return false;
            }

            @Override // xsna.yof
            public final lle W() {
                return this.g;
            }

            @Override // xsna.yof
            public final boolean Z() {
                return false;
            }

            @Override // xsna.yof
            public final ClipsMarketAdHeaderClickConfig b0() {
                return this.p;
            }

            @Override // xsna.yof
            public final boolean c() {
                return false;
            }

            @Override // xsna.yof
            public final f2e e() {
                return this.c;
            }

            @Override // xsna.yof
            public final lgd e0() {
                return this.k;
            }

            @Override // xsna.yof
            public final boolean g() {
                return false;
            }

            @Override // xsna.yof
            public final b6e g0() {
                return this.m;
            }

            @Override // xsna.yof
            public final ClipsFeedRecyclerPoolSettings h0() {
                return this.j;
            }

            @Override // xsna.yof
            public final ClipsBannerCompanionConfig m() {
                return this.d;
            }

            @Override // xsna.yof
            public final ClipsMarketItemsShowTimeConfig n() {
                return this.b;
            }

            @Override // xsna.yof
            public final boolean o() {
                return false;
            }

            @Override // xsna.yof
            public final wme t() {
                return this.i;
            }

            @Override // xsna.yof
            public final boolean v() {
                return false;
            }

            @Override // xsna.yof
            public final boolean y() {
                return false;
            }

            @Override // xsna.yof
            public final boolean z() {
                return false;
            }
        }

        public final yof getSTUB() {
            return STUB;
        }
    }

    ClipsBannerCompanionConfig E();

    maf J();

    mle L();

    a6e N();

    y6e O();

    ClipsButtonToVideoConfig P();

    boolean Q();

    lle W();

    boolean Z();

    ClipsMarketAdHeaderClickConfig b0();

    boolean c();

    f2e e();

    lgd e0();

    boolean g();

    b6e g0();

    ClipsFeedRecyclerPoolSettings h0();

    ClipsBannerCompanionConfig m();

    ClipsMarketItemsShowTimeConfig n();

    boolean o();

    f0f p();

    wme t();

    boolean v();

    boolean y();

    boolean z();
}
