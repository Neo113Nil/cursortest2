package xsna;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ebs0;
import xsna.h7u0;
import xsna.xqs0;

/* compiled from: VideoLargeListEventHandler.kt */
/* loaded from: classes.dex */
public final class yqs0 {
    public final g7s0 a;
    public final kbj0 b;
    public final x4o c;

    /* compiled from: VideoLargeListEventHandler.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.VideoLargeListEventHandler$HandleEvent$1$1", f = "VideoLargeListEventHandler.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes16.dex */
    public static final class a extends SuspendLambda implements wzs<xqs0, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ izs<wqs0, s3q0> $onAction;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Context context, izs<? super wqs0, s3q0> izsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$context = context;
            this.$onAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = yqs0.this.new a(this.$context, this.$onAction, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(xqs0 xqs0Var, spj<? super s3q0> spjVar) {
            return ((a) create(xqs0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            xqs0 xqs0Var = (xqs0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (xqs0Var instanceof xqs0.e) {
                yqs0 yqs0Var = yqs0.this;
                Context context = this.$context;
                xqs0.e eVar = (xqs0.e) xqs0Var;
                ydt0 Y = yqs0Var.a.Y();
                VideoFile videoFile = eVar.b;
                VideoFile videoFile2 = eVar.b;
                Y.k(context, videoFile, (r43 & 4) != 0 ? null : null, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : videoFile2.r(), true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : new SearchStatsLoggingInfo(null, 0, SchemeStat$EventItem.Type.VIDEO, 0L, videoFile2.r(), MobileOfficialAppsCoreNavStat$EventScreen.CATALOG, null, false, false, 459, null), (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
            } else if (xqs0Var instanceof xqs0.h) {
                kbj0.u(yqs0.this.b, this.$context, ((xqs0.h) xqs0Var).b, false, false, null, null, 60);
            } else if (xqs0Var instanceof xqs0.c) {
                xqs0.c cVar = (xqs0.c) xqs0Var;
                ydt0.f(yqs0.this.a.Y(), this.$context, cVar.b, cVar.c, new SearchStatsLoggingInfo(null, 0, SchemeStat$EventItem.Type.SEARCH_AUTHOR, 0L, cVar.b.r(), MobileOfficialAppsCoreNavStat$EventScreen.CATALOG, null, false, false, 459, null), null, 16);
            } else if (xqs0Var instanceof xqs0.d) {
                yqs0 yqs0Var2 = yqs0.this;
                Context context2 = this.$context;
                xqs0.d dVar = (xqs0.d) xqs0Var;
                yqs0Var2.getClass();
                Activity h = e3m.h(context2);
                if (h != null) {
                    kz20 kz20Var = new kz20(ebs0.a.a.getSTUB());
                    kz20Var.g = dVar.b;
                    kz20Var.d(h);
                }
            } else if (xqs0Var instanceof xqs0.g) {
                yqs0 yqs0Var3 = yqs0.this;
                Context context3 = this.$context;
                xqs0.g gVar = (xqs0.g) xqs0Var;
                yqs0Var3.getClass();
                Activity h2 = e3m.h(context3);
                if (h2 != null) {
                    yqs0Var3.a.Y().i(h2, gVar.b, new VideoFeedDialogParams.Discover(gVar.c, null, null, true, null, null, 0L, false, null, null, 880, null));
                }
            } else {
                if (xqs0Var instanceof xqs0.f) {
                    yqs0 yqs0Var4 = yqs0.this;
                    Context context4 = this.$context;
                    xqs0.f fVar = (xqs0.f) xqs0Var;
                    yqs0Var4.getClass();
                    Activity h3 = e3m.h(context4);
                    if (h3 != null) {
                        ydt0 Y2 = yqs0Var4.a.Y();
                        String str = fVar.b;
                        Y2.A(h3, (r27 & 2) != 0 ? null : null, null, (r27 & 8) == 0, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : str, (r27 & 64) != 0 ? false : str != null, (r27 & 128) == 0, (r27 & 256) != 0 ? false : false, (r27 & 512) != 0 ? null : Boolean.TRUE, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null);
                    }
                } else if (xqs0Var instanceof xqs0.a) {
                    yqs0 yqs0Var5 = yqs0.this;
                    Context context5 = this.$context;
                    xqs0.a aVar = (xqs0.a) xqs0Var;
                    yqs0Var5.getClass();
                    if (aVar.b.j0()) {
                        bfs0.d(context5, 0, null, new q34(yqs0Var5, context5, aVar), 14);
                    } else {
                        yqs0Var5.a.l0(context5, aVar.b, aVar.c, aVar.d);
                    }
                } else if (xqs0Var instanceof xqs0.b) {
                    xqs0.b bVar = (xqs0.b) xqs0Var;
                    yqs0.this.c.a(bVar.c, this.$context, bVar.b);
                } else {
                    if (!(xqs0Var instanceof xqs0.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yqs0 yqs0Var6 = yqs0.this;
                    Context context6 = this.$context;
                    xqs0.i iVar = (xqs0.i) xqs0Var;
                    izs<wqs0, s3q0> izsVar = this.$onAction;
                    yqs0Var6.getClass();
                    VideoRestriction O = iVar.b.O();
                    if (O != null) {
                        RestrictionButton restrictionButton = O.e;
                        String str2 = restrictionButton != null ? restrictionButton.c : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = O.b;
                        String str4 = O.c;
                        TypedValue typedValue = krv0.a;
                        if (epx.f(krv0.i(context6), Boolean.TRUE)) {
                            lpj lpjVar = context6 instanceof lpj ? (lpj) context6 : null;
                            Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                            dhr0.a.getClass();
                            int i = dhr0.u().c;
                            if (valueOf == null || valueOf.intValue() != i) {
                                context6 = new l7s(context6, dhr0.u().c);
                            }
                        }
                        int i2 = h7u0.p;
                        h7u0.a c = h7u0.b.c(context6);
                        c.h0(str3);
                        c.a.f = str4;
                        c.d0(str2, new zqs0(iVar, izsVar));
                        c.W(R.string.close, null);
                        c.m();
                    }
                }
            }
            return s3q0.a;
        }
    }

    public yqs0(g7s0 g7s0Var, kbj0 kbj0Var, x4o x4oVar) {
        this.a = g7s0Var;
        this.b = kbj0Var;
        this.c = x4oVar;
    }

    public final void a(ksr ksrVar, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2039776257);
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
                androidx.compose.runtime.b.f(-2039776257, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.largelist.VideoLargeListEventHandler.HandleEvent (VideoLargeListEventHandler.kt:39)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b());
            boolean y = ((i2 & 896) == 256) | M.y(context) | ((i2 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new a(context, izsVar, null);
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
            s.l(new owl(this, ksrVar, izsVar, i));
        }
    }
}
