package xsna;

import androidx.viewpager2.widget.ViewPager2;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoTopshelfVh;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.bcp0;

/* compiled from: VideoTopshelfVh.kt */
@b6l(c = "com.vk.catalog2.common.ui.mvp.holder.video.VideoTopshelfVh$startIndicatorsAnimation$1", f = "VideoTopshelfVh.kt", l = {179, 182, 186}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class hlt0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isLive;
    float F$0;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VideoTopshelfVh this$0;

    /* compiled from: VideoTopshelfVh.kt */
    @b6l(c = "com.vk.catalog2.common.ui.mvp.holder.video.VideoTopshelfVh$startIndicatorsAnimation$1$1", f = "VideoTopshelfVh.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;
        final /* synthetic */ VideoTopshelfVh this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(VideoTopshelfVh videoTopshelfVh, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = videoTopshelfVh;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            VideoTopshelfVh videoTopshelfVh = this.this$0;
            ViewPager2 viewPager2 = videoTopshelfVh.e;
            if (viewPager2 == null) {
                viewPager2 = null;
            }
            viewPager2.e(videoTopshelfVh.f, false);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlt0(boolean z, VideoTopshelfVh videoTopshelfVh, spj<? super hlt0> spjVar) {
        super(2, spjVar);
        this.$isLive = z;
        this.this$0 = videoTopshelfVh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        hlt0 hlt0Var = new hlt0(this.$isLive, this.this$0, spjVar);
        hlt0Var.L$0 = obj;
        return hlt0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((hlt0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        r10 = r12.this$0;
        r13 = r7 / r10.l;
        r10.b(r13, r10.f);
        r10 = (long) (r8 / r12.this$0.l);
        r12.L$0 = r0;
        r12.J$0 = r8;
        r12.I$0 = r7;
        r12.I$1 = r2;
        r12.F$0 = r13;
        r12.label = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
    
        if (xsna.qsl.b(r10, r12) != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011d, code lost:
    
        if (xsna.myc0.k(r2, r9, r12) != r1) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd A[EDGE_INSN: B:39:0x00cd->B:40:0x00cd BREAK  A[LOOP:0: B:31:0x00b2->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f6 -> B:30:0x00b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x011d -> B:7:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        int i;
        int i2;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.a.a(obj);
            if (this.$isLive) {
                VideoTopshelfVh videoTopshelfVh = this.this$0;
                videoTopshelfVh.b(1.0f, videoTopshelfVh.f);
                return s3q0.a;
            }
        } else {
            if (i3 == 1) {
                i2 = this.I$1;
                i = this.I$0;
                j2 = this.J$0;
                kotlin.a.a(obj);
                while (true) {
                    if (!this.this$0.v) {
                    }
                }
                return coroutineSingletons;
            }
            if (i3 == 2) {
                i2 = this.I$1;
                i = this.I$0;
                j2 = this.J$0;
                kotlin.a.a(obj);
                if (i != i2) {
                    i++;
                    while (true) {
                        if (!this.this$0.v) {
                            break;
                        }
                        long j3 = this.this$0.m;
                        this.L$0 = yvjVar;
                        this.J$0 = j2;
                        this.I$0 = i;
                        this.I$1 = i2;
                        this.label = 1;
                        if (qsl.b(j3, this) == coroutineSingletons) {
                            break;
                        }
                    }
                    return coroutineSingletons;
                }
                j = j2;
                VideoTopshelfVh videoTopshelfVh2 = this.this$0;
                int i4 = videoTopshelfVh2.f;
                videoTopshelfVh2.f = i4 != videoTopshelfVh2.g - 1 ? 0 : i4 + 1;
                bdn bdnVar = bdn.a;
                ge00 ge00Var = ie00.a;
                a aVar = new a(videoTopshelfVh2, null);
                this.L$0 = yvjVar;
                this.J$0 = j;
                this.label = 3;
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
        }
        if (zvj.f(yvjVar)) {
            VideoTopshelfVh videoTopshelfVh3 = this.this$0;
            xcp0 xcp0Var = videoTopshelfVh3.i;
            j = ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS;
            if (xcp0Var != null) {
                int i5 = videoTopshelfVh3.f;
                bcp0.b bVar = xcp0Var.q;
                if (bVar != null) {
                    List<UIBlockTopshelf.TopshelfItem> list = bVar.a;
                    if (i5 >= 0 && i5 < list.size()) {
                        Map<String, String> g = list.get(i5).d.f.g();
                        if (g == null || g.isEmpty()) {
                            Long d = list.get(i5).d.a.d();
                            if (d != null) {
                                j = d.longValue();
                            }
                        } else {
                            Long d2 = list.get(i5).d.f.d();
                            if (d2 != null) {
                                j = d2.longValue();
                            }
                        }
                    }
                }
            }
            int i6 = this.this$0.l;
            if (i6 >= 0) {
                i2 = i6;
                j2 = j;
                i = 0;
                while (true) {
                    if (!this.this$0.v) {
                    }
                }
                return coroutineSingletons;
            }
            VideoTopshelfVh videoTopshelfVh22 = this.this$0;
            int i42 = videoTopshelfVh22.f;
            videoTopshelfVh22.f = i42 != videoTopshelfVh22.g - 1 ? 0 : i42 + 1;
            bdn bdnVar2 = bdn.a;
            ge00 ge00Var2 = ie00.a;
            a aVar2 = new a(videoTopshelfVh22, null);
            this.L$0 = yvjVar;
            this.J$0 = j;
            this.label = 3;
        }
        return s3q0.a;
    }
}
