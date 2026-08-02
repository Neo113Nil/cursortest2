package xsna;

import com.vk.audience.api.domain.tracking.AudienceResearchTrackerCodes;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DzenArticleMediascopeTracker.kt */
@b6l(c = "com.vk.dzenarticle.impl.ui.tracking.DzenArticleMediascopeTracker$start$1", f = "DzenArticleMediascopeTracker.kt", l = {33, 34, 36, 37}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class rro extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $articleId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ uro this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rro(uro uroVar, String str, spj<? super rro> spjVar) {
        super(2, spjVar);
        this.this$0 = uroVar;
        this.$articleId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        rro rroVar = new rro(this.this$0, this.$articleId, spjVar);
        rroVar.L$0 = obj;
        return rroVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rro) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (xsna.s3q0.a == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (xsna.qsl.b(ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, r8) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r9 != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
    
        if (xsna.qsl.b(1000, r8) == r1) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.L$0 = yvjVar;
            this.label = 1;
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    kotlin.a.a(obj);
                    uro uroVar = this.this$0;
                    this.L$0 = yvjVar;
                    this.label = 4;
                    uroVar.getClass();
                    Object a = uro.a(AudienceResearchTrackerCodes.DZEN_ARTICLE_PING, this);
                    if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.a.a(obj);
            if (!zvj.f(yvjVar)) {
                return s3q0.a;
            }
            this.L$0 = yvjVar;
            this.label = 3;
        } else {
            kotlin.a.a(obj);
        }
        uro uroVar2 = this.this$0;
        this.L$0 = yvjVar;
        this.label = 2;
        uroVar2.getClass();
        Object a2 = uro.a(AudienceResearchTrackerCodes.DZEN_ARTICLE_START, this);
        if (a2 != obj2) {
            a2 = s3q0.a;
        }
    }
}
