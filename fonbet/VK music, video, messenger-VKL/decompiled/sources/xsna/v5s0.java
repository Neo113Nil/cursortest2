package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ebs0;
import xsna.t5s0;
import xsna.u5s0;

/* compiled from: VideoBlockEventHandler.kt */
/* loaded from: classes.dex */
public abstract class v5s0<Event extends u5s0, ReturnAction extends t5s0> {
    public final g7s0 a;
    public final kbj0 b;
    public final x4o c;

    /* compiled from: VideoBlockEventHandler.kt */
    public static final class a {
        public final g7s0 a;
        public final kbj0 b;
        public final x4o c;

        public a(g7s0 g7s0Var, kbj0 kbj0Var, x4o x4oVar) {
            this.a = g7s0Var;
            this.b = kbj0Var;
            this.c = x4oVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Dependencies(videoBridge=" + this.a + ", sharingBridge=" + this.b + ", donutVideoActionHandler=" + this.c + ')';
        }
    }

    /* compiled from: VideoBlockEventHandler.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.base.VideoBlockEventHandler$EventsEffect$1$1", f = "VideoBlockEventHandler.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes16.dex */
    public static final class b extends SuspendLambda implements wzs<Event, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ izs<ReturnAction, s3q0> $onReturnAction;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ v5s0<Event, ReturnAction> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(v5s0<Event, ReturnAction> v5s0Var, Context context, izs<? super ReturnAction, s3q0> izsVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.this$0 = v5s0Var;
            this.$context = context;
            this.$onReturnAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(this.this$0, this.$context, this.$onReturnAction, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(Object obj, spj<? super s3q0> spjVar) {
            return ((b) create((u5s0) obj, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            u5s0 u5s0Var = (u5s0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (u5s0Var instanceof u5s0.d) {
                v5s0<Event, ReturnAction> v5s0Var = this.this$0;
                Context context = this.$context;
                u5s0.d dVar = (u5s0.d) u5s0Var;
                ydt0 Y = v5s0Var.a.Y();
                VideoFile videoFile = dVar.b;
                VideoFile videoFile2 = dVar.b;
                String str = dVar.c;
                SearchStatsLoggingInfo searchStatsLoggingInfo = new SearchStatsLoggingInfo(null, 0, SchemeStat$EventItem.Type.VIDEO, 0L, str == null ? videoFile2.r() : str, MobileOfficialAppsCoreNavStat$EventScreen.CATALOG, null, false, false, 459, null);
                if (str == null) {
                    str = videoFile2.r();
                }
                Y.k(context, videoFile, (r43 & 4) != 0 ? null : null, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : str, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : searchStatsLoggingInfo, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
            } else if (u5s0Var instanceof u5s0.g) {
                kbj0.u(this.this$0.b, this.$context, null, false, false, null, null, 60);
            } else if (u5s0Var instanceof u5s0.c) {
                v5s0<Event, ReturnAction> v5s0Var2 = this.this$0;
                Context context2 = this.$context;
                v5s0Var2.getClass();
                Activity h = e3m.h(context2);
                if (h != null) {
                    kz20 kz20Var = new kz20(ebs0.a.a.getSTUB());
                    kz20Var.g = null;
                    kz20Var.d(h);
                }
            } else if (u5s0Var instanceof u5s0.f) {
                v5s0<Event, ReturnAction> v5s0Var3 = this.this$0;
                Context context3 = this.$context;
                v5s0Var3.getClass();
                Activity h2 = e3m.h(context3);
                if (h2 != null) {
                    v5s0Var3.a.Y().i(h2, null, new VideoFeedDialogParams.Discover(null, null, null, true, null, null, 0L, false, null, null, 880, null));
                }
            } else if (u5s0Var instanceof u5s0.e) {
                v5s0<Event, ReturnAction> v5s0Var4 = this.this$0;
                Context context4 = this.$context;
                v5s0Var4.getClass();
                Activity h3 = e3m.h(context4);
                if (h3 != null) {
                    v5s0Var4.a.Y().A(h3, (r27 & 2) != 0 ? null : null, null, (r27 & 8) == 0, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? false : false, (r27 & 128) == 0, (r27 & 256) != 0 ? false : false, (r27 & 512) != 0 ? null : Boolean.TRUE, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null);
                }
            } else {
                if (u5s0Var instanceof u5s0.a) {
                    this.this$0.getClass();
                    throw null;
                }
                if (u5s0Var instanceof u5s0.b) {
                    this.this$0.c.a(null, this.$context, null);
                } else {
                    if (!(u5s0Var instanceof u5s0.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    v5s0<Event, ReturnAction> v5s0Var5 = this.this$0;
                    Context context5 = this.$context;
                    u5s0.h hVar = (u5s0.h) u5s0Var;
                    izs<ReturnAction, s3q0> izsVar = this.$onReturnAction;
                    g7s0 g7s0Var = v5s0Var5.a;
                    VideoFile videoFile3 = hVar.b;
                    g7s0Var.m0(context5, videoFile3, videoFile3.r(), hVar.b.r(), new x4a(12, izsVar, hVar), new qum0(3, izsVar, hVar));
                }
            }
            return s3q0.a;
        }
    }

    public v5s0(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
    }

    public final void a(ksr ksrVar, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1480129393);
        if ((i & 6) == 0) {
            i2 = (M.J(ksrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1480129393, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.base.VideoBlockEventHandler.EventsEffect (VideoBlockEventHandler.kt:46)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b());
            boolean y = ((i2 & 896) == 256) | M.y(context) | ((i2 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new b(this, context, izsVar, null);
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
            s.l(new o37(i, 4, this, ksrVar, izsVar));
        }
    }
}
