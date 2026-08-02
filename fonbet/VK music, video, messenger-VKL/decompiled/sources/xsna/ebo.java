package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoScreenSource;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a5o;
import xsna.cbo;

/* compiled from: DownloadedEvent.kt */
/* loaded from: classes.dex */
public final class ebo {
    public final x4o a;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: DownloadedEvent.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.downloaded.DownloadedSliderEventHandler$HandleVideoEvents$1$1", f = "DownloadedEvent.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes16.dex */
    public static final class a<T> extends SuspendLambda implements wzs<T, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ebo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ebo eboVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$context = context;
            this.this$0 = eboVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$context, this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(Object obj, spj<? super s3q0> spjVar) {
            return ((a) create((cbo) obj, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            cbo cboVar = (cbo) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (cboVar instanceof cbo.b) {
                fxc0.B().Y().D(this.$context, true);
            } else if (cboVar instanceof cbo.d) {
                Activity h = e3m.h(this.$context);
                if (h == null) {
                    return s3q0.a;
                }
                cbo.d dVar = (cbo.d) cboVar;
                fxc0.B().Y().i(h, dVar.b, new VideoFeedDialogParams.OfflineVideos(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.OFFLINE), null, new SearchStatsLoggingInfo(null, 0, SchemeStat$EventItem.Type.VIDEO, 0L, null, MobileOfficialAppsCoreNavStat$EventScreen.CATALOG, null, false, false, 459, null), dVar.c));
            } else if (cboVar instanceof cbo.e) {
                Activity h2 = e3m.h(this.$context);
                if (h2 == null) {
                    return s3q0.a;
                }
                cbo.e eVar = (cbo.e) cboVar;
                fxc0.B().u0().c(eVar.b, h2, eVar.c, eVar.d);
            } else if (cboVar instanceof cbo.c) {
                fxc0.B().u0().a(this.$context, ((cbo.c) cboVar).c);
            } else {
                if (!(cboVar instanceof cbo.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cbo.a aVar = (cbo.a) cboVar;
                this.this$0.a.a(aVar.b, this.$context, new a5o(new a5o.a(DonutVideoScreenSource.VK_VIDEO.h(), aVar.c.h()), 1));
            }
            return s3q0.a;
        }
    }

    public ebo(x4o x4oVar) {
        this.a = x4oVar;
    }

    public final <T extends cbo> void a(ksr<? extends T> ksrVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-918645688);
        if ((i & 6) == 0) {
            i2 = (M.J(ksrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-918645688, i2, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.DownloadedSliderEventHandler.HandleVideoEvents (DownloadedEvent.kt:64)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b());
            boolean y = M.y(context) | ((i2 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new a(context, this, null);
                M.R(x);
            }
            c1q.a(ksrVar, (wzs) x, M, i2 & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new t41(this, ksrVar, i, 4));
        }
    }
}
