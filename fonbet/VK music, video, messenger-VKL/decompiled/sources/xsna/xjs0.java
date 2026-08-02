package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoScreenSource;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a5o;
import xsna.vjs0;

/* compiled from: VideoEvent.kt */
/* loaded from: classes.dex */
public final class xjs0 {
    public final hdt0 a;
    public final x4o b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: VideoEvent.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.VideoEventHandler$HandleVideoEvents$1$1", f = "VideoEvent.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes16.dex */
    public static final class a<T> extends SuspendLambda implements wzs<T, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ xjs0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, xjs0 xjs0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$context = context;
            this.this$0 = xjs0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$context, this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(Object obj, spj<? super s3q0> spjVar) {
            return ((a) create((vjs0) obj, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RestrictionButton restrictionButton;
            vjs0 vjs0Var = (vjs0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (vjs0Var instanceof vjs0.c) {
                ydt0 Y = fxc0.B().Y();
                vjs0.c cVar = (vjs0.c) vjs0Var;
                VideoFile videoFile = cVar.b;
                VideoFile videoFile2 = cVar.b;
                String str = cVar.c;
                SearchStatsLoggingInfo searchStatsLoggingInfo = new SearchStatsLoggingInfo(null, 0, SchemeStat$EventItem.Type.VIDEO, 0L, str == null ? videoFile2.r() : str, MobileOfficialAppsCoreNavStat$EventScreen.CATALOG, null, false, false, 459, null);
                if (str == null) {
                    str = videoFile2.r();
                }
                Y.k(this.$context, videoFile, (r43 & 4) != 0 ? null : null, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : str, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : searchStatsLoggingInfo, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : cVar.d);
            } else if (vjs0Var instanceof vjs0.b) {
                ydt0 Y2 = fxc0.B().Y();
                Context context = this.$context;
                vjs0.b bVar = (vjs0.b) vjs0Var;
                VideoFile videoFile3 = bVar.b;
                String str2 = bVar.d;
                SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.SEARCH_AUTHOR;
                String str3 = bVar.c;
                if (str3 == null) {
                    str3 = bVar.b.r();
                }
                ydt0.f(Y2, context, videoFile3, str2, new SearchStatsLoggingInfo(null, 0, type, 0L, str3, MobileOfficialAppsCoreNavStat$EventScreen.CATALOG, null, false, false, 459, null), null, 16);
            } else if (vjs0Var instanceof vjs0.d) {
                hdt0 hdt0Var = this.this$0.a;
                Context context2 = this.$context;
                vjs0.d dVar = (vjs0.d) vjs0Var;
                VideoFile videoFile4 = dVar.b;
                VideoRestriction O = videoFile4.O();
                hdt0Var.a(context2, videoFile4, (O == null || (restrictionButton = O.e) == null) ? null : restrictionButton.b, dVar.c, dVar.d);
            } else {
                if (!(vjs0Var instanceof vjs0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                vjs0.a aVar = (vjs0.a) vjs0Var;
                this.this$0.b.a(aVar.b, this.$context, new a5o(new a5o.a(DonutVideoScreenSource.VK_VIDEO.h(), aVar.c.h()), 1));
            }
            return s3q0.a;
        }
    }

    public xjs0(hdt0 hdt0Var, x4o x4oVar) {
        this.a = hdt0Var;
        this.b = x4oVar;
    }

    public final <T extends vjs0> void a(ksr<? extends T> ksrVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1747456269);
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
                androidx.compose.runtime.b.f(-1747456269, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.VideoEventHandler.HandleVideoEvents (VideoEvent.kt:66)");
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
            s.l(new ao1(this, ksrVar, i, 5));
        }
    }
}
