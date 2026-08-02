package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.ye0;

/* compiled from: AutoPlayState.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.autoplay.AutoPlayStateKt$flow$1", f = "AutoPlayState.kt", l = {155}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class hi5 extends SuspendLambda implements wzs<zhd0<? super gi5>, spj<? super s3q0>, Object> {
    final /* synthetic */ yg5 $this_flow;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi5(yg5 yg5Var, spj<? super hi5> spjVar) {
        super(2, spjVar);
        this.$this_flow = yg5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        hi5 hi5Var = new hi5(this.$this_flow, spjVar);
        hi5Var.L$0 = obj;
        return hi5Var;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super gi5> zhd0Var, spj<? super s3q0> spjVar) {
        return ((hi5) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object, xsna.gi5] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zhd0 zhd0Var = (zhd0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ?? a2 = ii5.a(this.$this_flow);
            ref$ObjectRef.element = a2;
            zhd0Var.f(a2);
            yg5 yg5Var = this.$this_flow;
            a aVar = new a(ref$ObjectRef, yg5Var, zhd0Var);
            yg5Var.f0(aVar);
            ew3 ew3Var = new ew3(2, this.$this_flow, aVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (phd0.a(zhd0Var, ew3Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }

    /* compiled from: AutoPlayState.kt */
    public static final class a implements hnt0 {
        public final /* synthetic */ Ref$ObjectRef<gi5> b;
        public final /* synthetic */ yg5 c;
        public final /* synthetic */ zhd0<gi5> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ref$ObjectRef<gi5> ref$ObjectRef, yg5 yg5Var, zhd0<? super gi5> zhd0Var) {
            this.b = ref$ObjectRef;
            this.c = yg5Var;
            this.d = zhd0Var;
        }

        public static /* synthetic */ void c(a aVar) {
            aVar.b(ii5.b(aVar.b.element, aVar.c));
        }

        @Override // xsna.hnt0
        public final void E() {
            c(this);
        }

        @Override // xsna.hnt0
        public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
            b(gi5.a(this.b.element, null, Integer.valueOf(i), Integer.valueOf(i2), false, false, false, false, null, false, null, false, false, false, false, false, false, 0L, 0L, 0, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, null, null, false, 268435449));
        }

        @Override // xsna.hnt0
        public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
            c(this);
        }

        @Override // xsna.hnt0
        public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
            c(this);
        }

        @Override // xsna.hnt0
        public final void T0(VideoAutoPlay videoAutoPlay) {
            c(this);
        }

        @Override // xsna.hnt0
        public final void U0(one.video.player.tracks.b bVar) {
            b(gi5.a(this.b.element, null, null, null, false, false, false, false, null, false, null, false, false, false, false, false, false, 0L, 0L, 0, null, bVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, null, null, false, 267386879));
        }

        @Override // xsna.hnt0
        public final void U3(DownloadInfo downloadInfo) {
            c(this);
        }

        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
            c(this);
        }

        @Override // xsna.hnt0
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
            c(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(gi5 gi5Var) {
            this.b.element = gi5Var;
            zfb.a(gi5Var, this.d);
        }

        @Override // xsna.hnt0
        public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
            b(gi5.a(this.b.element, null, null, null, false, false, false, false, null, false, null, false, false, false, false, false, false, 0L, 0L, 0, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, aVar2, aVar, false, 167772159));
        }

        @Override // xsna.hnt0
        public final void h() {
            b(gi5.a(this.b.element, null, null, null, false, false, false, false, null, false, null, false, false, false, false, false, false, 0L, 0L, 0, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, null, null, true, 134217727));
        }

        @Override // xsna.hnt0
        public final void h3(yg5 yg5Var, int i, int i2) {
            c(this);
        }

        @Override // xsna.hnt0
        public final void j() {
            b(gi5.a(ii5.b(this.b.element, this.c), null, null, null, false, false, false, false, null, false, null, false, false, false, false, false, false, 0L, 0L, 0, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, null, null, false, 33554431));
        }

        @Override // xsna.hnt0
        public final void j4(VideoAutoPlay videoAutoPlay) {
            c(this);
        }

        @Override // xsna.hnt0
        public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
            b(gi5.a(ii5.b(this.b.element, this.c), null, null, null, false, false, false, false, null, false, null, false, false, false, false, false, false, 0L, 0L, 0, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, je0Var, aVar, false, 167772159));
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
            c(this);
        }

        @Override // xsna.hnt0
        public final void n2(yg5 yg5Var) {
            c(this);
        }

        @Override // xsna.hnt0
        public final void q(List<? extends SubtitleRenderItem> list) {
            b(gi5.a(this.b.element, null, null, null, false, false, false, false, null, false, null, false, false, false, false, false, false, 0L, 0L, 0, list, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, null, null, false, 267911167));
        }

        @Override // xsna.hnt0
        public final void r1(yg5 yg5Var) {
            c(this);
        }

        @Override // xsna.hnt0
        public final void z0(VideoAutoPlay videoAutoPlay, int i) {
            b(gi5.a(this.b.element, null, null, null, false, false, false, false, null, false, null, false, false, false, false, false, false, 0L, 0L, i, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, null, null, false, 268173311));
        }

        @Override // xsna.hnt0
        public final void c2() {
        }

        @Override // xsna.hnt0
        public final void t2() {
        }

        @Override // xsna.hnt0
        public final void u() {
        }

        @Override // xsna.hnt0
        public final void K2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void O(one.video.player.tracks.c cVar) {
        }

        @Override // xsna.hnt0
        public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
        }

        @Override // xsna.hnt0
        public final void S2(long j) {
        }

        @Override // xsna.hnt0
        public final void U(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void a(boolean z) {
        }

        @Override // xsna.hnt0
        public final void d4(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void l(x2s0 x2s0Var) {
        }

        @Override // xsna.hnt0
        public final void p0(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void x0(boolean z) {
        }

        @Override // xsna.hnt0
        public final void H(long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void N3(VideoAutoPlay videoAutoPlay, long j) {
        }
    }
}
