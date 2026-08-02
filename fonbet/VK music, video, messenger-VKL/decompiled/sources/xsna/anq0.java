package xsna;

import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.profile.core.tabs.ui.clips.Clips;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.nm8;
import xsna.xaf;

/* compiled from: UserProfileContentClipsFeatureDelegate.kt */
@b6l(c = "com.vk.profile.user.impl.domain.contenttabs.items.UserProfileContentClipsFeatureDelegate$startUpdatesJob$1", f = "UserProfileContentClipsFeatureDelegate.kt", l = {330, 728}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class anq0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ymq0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anq0(ymq0 ymq0Var, spj<? super anq0> spjVar) {
        super(2, spjVar);
        this.this$0 = ymq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new anq0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((anq0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r5.b(r11) == r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a A[Catch: CancellationException -> 0x0161, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0161, blocks: (B:7:0x001d, B:27:0x0157, B:28:0x0041, B:31:0x0052, B:33:0x005a, B:43:0x015d, B:44:0x0160, B:49:0x002d, B:51:0x0035, B:9:0x0079, B:11:0x007d, B:13:0x0087, B:14:0x0152, B:15:0x00bf, B:17:0x00c7, B:18:0x00fc, B:20:0x0104, B:21:0x010f, B:23:0x0117, B:24:0x0140, B:26:0x0148), top: B:2:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0051  */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0076 -> B:8:0x0079). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o0b aVar;
        o0b o0bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            nm8 nm8Var = this.this$0.r;
            nm8Var.getClass();
            aVar = new nm8.a();
            this.L$0 = aVar;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            obj = aVar.a(this);
            if (obj == coroutineSingletons) {
            }
            o0bVar = aVar;
            if (((Boolean) obj).booleanValue()) {
            }
            return s3q0.a;
        }
        if (i == 1) {
            aVar = (o0b) this.L$0;
            kotlin.a.a(obj);
            o0bVar = aVar;
            if (((Boolean) obj).booleanValue()) {
            }
            return s3q0.a;
        }
        if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ymq0 ymq0Var = (ymq0) this.L$3;
        ui50 ui50Var = (ui50) this.L$2;
        xaf xafVar = (xaf) this.L$1;
        o0bVar = (o0b) this.L$0;
        kotlin.a.a(obj);
        try {
            Clips clips = ymq0Var.p;
            if (clips != null) {
                int i2 = 12;
                if (epx.f(xafVar, xaf.f.a)) {
                    clips = (Clips) new io.reactivex.rxjava3.internal.operators.single.d0(ymq0Var.m.h(ymq0Var.c.a(), ymq0.F(clips).p).l(new a0m0(new zyl0(clips, 10), 5)), new yu50(i2), null).c();
                } else if (epx.f(xafVar, xaf.d.a)) {
                    clips = (Clips) new io.reactivex.rxjava3.internal.operators.single.d0(((ClipsEntryPointsComponent) ymq0Var.n.e.getValue()).E6().a().l(new tuz(new lx60(16, ymq0Var, clips), 19)), new yu50(i2), null).c();
                } else if (epx.f(xafVar, xaf.e.a)) {
                    clips = (Clips) ymq0.D(ymq0Var, clips).c();
                } else if (epx.f(xafVar, xaf.c.a)) {
                    clips = (Clips) new io.reactivex.rxjava3.internal.operators.single.d0(ymq0Var.G(ymq0.F(clips)).l(new xq70(new qyi0(clips, i2), 20)), new yu50(i2), null).c();
                } else if (epx.f(xafVar, xaf.a.a)) {
                    clips = (Clips) ymq0.D(ymq0Var, clips).c();
                }
                ymq0.C(ymq0Var, clips);
                s3q0 s3q0Var = s3q0.a;
            }
            ui50Var.c(null);
            aVar = o0bVar;
            this.L$0 = aVar;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            obj = aVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            o0bVar = aVar;
            if (((Boolean) obj).booleanValue()) {
                xafVar = (xaf) o0bVar.next();
                ymq0Var = this.this$0;
                ui50Var = ymq0Var.q;
                this.L$0 = o0bVar;
                this.L$1 = xafVar;
                this.L$2 = ui50Var;
                this.L$3 = ymq0Var;
                this.I$0 = 0;
                this.label = 2;
            }
            return s3q0.a;
        } finally {
        }
    }
}
