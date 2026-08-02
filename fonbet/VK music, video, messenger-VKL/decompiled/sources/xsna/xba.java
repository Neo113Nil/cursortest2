package xsna;

import android.util.LruCache;
import com.vk.catalog.mvi.section.api.CatalogPerformanceMetrics;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: CatalogPerformanceMetricsImpl.kt */
/* loaded from: classes16.dex */
public final class xba implements CatalogPerformanceMetrics {
    public final UiMeasuringScreen a;
    public final PerformanceScoreProduct b;
    public UUID c;
    public UUID d;
    public boolean e;
    public boolean f;
    public CatalogPerformanceMetrics.Mode g = CatalogPerformanceMetrics.Mode.REPO_MANAGED;

    /* compiled from: CatalogPerformanceMetricsImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogPerformanceMetrics.Mode.values().length];
            try {
                iArr[CatalogPerformanceMetrics.Mode.REPO_MANAGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogPerformanceMetrics.Mode.ACTOR_START_REPO_FINISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogPerformanceMetrics.Mode.ACTOR_START_ACTOR_FINISH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public xba(UiMeasuringScreen uiMeasuringScreen, PerformanceScoreProduct performanceScoreProduct) {
        this.a = uiMeasuringScreen;
        this.b = performanceScoreProduct;
    }

    @Override // com.vk.catalog.mvi.section.api.CatalogPerformanceMetrics
    public final void a() {
        j();
        if (this.e || this.f) {
            return;
        }
        UUID uuid = this.c;
        if (uuid != null) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            mzp0 e = rzp0.e(uuid);
            if (e != null) {
                e.a();
            }
        }
        this.e = true;
    }

    @Override // com.vk.catalog.mvi.section.api.CatalogPerformanceMetrics
    public final void b(CatalogPerformanceMetrics.Mode mode) {
        j();
        this.g = mode;
    }

    @Override // com.vk.catalog.mvi.section.api.CatalogPerformanceMetrics
    public final void c() {
        int i = a.$EnumSwitchMapping$0[this.g.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        j();
        if (this.f) {
            return;
        }
        UUID uuid = this.c;
        if (uuid != null) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            mzp0 e = rzp0.e(uuid);
            if (e != null) {
                e.c(false);
            }
        }
        this.f = true;
    }

    @Override // com.vk.catalog.mvi.section.api.CatalogPerformanceMetrics
    public final void d() {
        j();
        UUID uuid = this.c;
        if (uuid != null) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            mzp0 e = rzp0.e(uuid);
            if (e != null) {
                e.start();
            }
        }
    }

    @Override // com.vk.catalog.mvi.section.api.CatalogPerformanceMetrics
    public final void e() {
        UUID uuid = this.c;
        if (uuid != null) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            mzp0 e = rzp0.e(uuid);
            if (e != null) {
                e.g();
            }
        }
        UUID uuid2 = this.d;
        if (uuid2 != null) {
            zrd0 zrd0Var = zrd0.a;
            yw90 yw90Var = zrd0.e.get(uuid2);
            if (yw90Var != null) {
                yw90Var.stop();
            }
        }
    }

    @Override // com.vk.catalog.mvi.section.api.CatalogPerformanceMetrics
    public final void f() {
        int i = a.$EnumSwitchMapping$0[this.g.ordinal()];
        if (i == 1 || i == 2) {
            a();
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.vk.catalog.mvi.section.api.CatalogPerformanceMetrics
    public final void g(mri mriVar) {
        j();
        UUID uuid = this.c;
        if (uuid != null) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            mzp0 e = rzp0.e(uuid);
            if (e != null) {
                e.e(mriVar);
            }
        }
    }

    @Override // com.vk.catalog.mvi.section.api.CatalogPerformanceMetrics
    public final void h() {
        j();
        UUID uuid = this.c;
        if (uuid != null) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            mzp0 e = rzp0.e(uuid);
            if (e != null) {
                e.h();
            }
        }
    }

    @Override // com.vk.catalog.mvi.section.api.CatalogPerformanceMetrics
    public final void i() {
        UUID uuid = this.c;
        if (uuid != null) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            mzp0 e = rzp0.e(uuid);
            if (e != null) {
                e.d(null);
            }
        }
        UUID uuid2 = this.d;
        if (uuid2 != null) {
            zrd0 zrd0Var = zrd0.a;
            yw90 yw90Var = zrd0.e.get(uuid2);
            if (yw90Var != null) {
                yw90Var.a();
            }
        }
    }

    public final void j() {
        if (this.c == null || this.d == null) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair c = rzp0.c(this.a, "new_video_playlist", false, 60);
            UUID uuid = (UUID) c.d();
            mzp0 mzp0Var = (mzp0) c.g();
            this.c = uuid;
            mzp0Var.init();
            zrd0 zrd0Var = zrd0.a;
            Pair a2 = zrd0.a(this.b);
            UUID uuid2 = (UUID) a2.d();
            yw90 yw90Var = (yw90) a2.g();
            this.d = uuid2;
            yw90Var.init();
            this.e = false;
            this.f = false;
        }
    }
}
