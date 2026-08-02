package xsna;

import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.nm8;
import xsna.xaf;

/* compiled from: CommunityProfileContentClipsFeatureDelegate.kt */
@b6l(c = "com.vk.profile.community.impl.ui.profile.featuredelegates.CommunityProfileContentClipsFeatureDelegate$startUpdatesJob$1", f = "CommunityProfileContentClipsFeatureDelegate.kt", l = {Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 756}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class egh extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ dgh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egh(dgh dghVar, spj<? super egh> spjVar) {
        super(2, spjVar);
        this.this$0 = dghVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new egh(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((egh) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r5.b(r9) == r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a A[Catch: CancellationException -> 0x00ec, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x00ec, blocks: (B:7:0x001d, B:27:0x00e2, B:28:0x0041, B:31:0x0052, B:33:0x005a, B:43:0x00e8, B:44:0x00eb, B:49:0x002d, B:51:0x0035, B:9:0x0079, B:11:0x007d, B:13:0x0085, B:14:0x00dd, B:15:0x0092, B:17:0x009a, B:18:0x00a5, B:20:0x00ad, B:21:0x00b8, B:23:0x00c0, B:24:0x00cb, B:26:0x00d3), top: B:2:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0051  */
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
            nm8 nm8Var = this.this$0.v;
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
        dgh dghVar = (dgh) this.L$3;
        ui50 ui50Var = (ui50) this.L$2;
        xaf xafVar = (xaf) this.L$1;
        o0bVar = (o0b) this.L$0;
        kotlin.a.a(obj);
        try {
            Clips clips = dghVar.l;
            if (clips != null) {
                if (epx.f(xafVar, xaf.f.a)) {
                    clips = (Clips) dgh.B(dghVar, clips).c();
                } else if (epx.f(xafVar, xaf.d.a)) {
                    clips = (Clips) dgh.C(dghVar, clips).c();
                } else if (epx.f(xafVar, xaf.e.a)) {
                    clips = (Clips) dgh.F(dghVar, clips).c();
                } else if (epx.f(xafVar, xaf.c.a)) {
                    clips = (Clips) dgh.D(dghVar, clips).c();
                } else if (epx.f(xafVar, xaf.a.a)) {
                    clips = (Clips) dgh.F(dghVar, clips).c();
                }
                dgh.E(dghVar, clips);
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
                dghVar = this.this$0;
                ui50Var = dghVar.u;
                this.L$0 = o0bVar;
                this.L$1 = xafVar;
                this.L$2 = ui50Var;
                this.L$3 = dghVar;
                this.I$0 = 0;
                this.label = 2;
            }
            return s3q0.a;
        } finally {
        }
    }
}
