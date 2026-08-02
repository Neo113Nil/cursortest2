package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.ok.android.commons.http.Http;

/* compiled from: CommunityProfileLoadFeatureDelegate.kt */
@b6l(c = "com.vk.profile.community.impl.ui.profile.featuredelegates.CommunityProfileLoadFeatureDelegate$createAdditionalFields$textFields$1", f = "CommunityProfileLoadFeatureDelegate.kt", l = {291, 292, 293, 294, 295, 296, 297, 298, 299, 301, Http.StatusCode.SEE_OTHER}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class drh extends RestrictedSuspendLambda implements wzs<ali0<? super String>, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ arh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drh(arh arhVar, spj<? super drh> spjVar) {
        super(2, spjVar);
        this.this$0 = arhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        drh drhVar = new drh(this.this$0, spjVar);
        drhVar.L$0 = obj;
        return drhVar;
    }

    @Override // xsna.wzs
    public final Object invoke(ali0<? super String> ali0Var, spj<? super s3q0> spjVar) {
        return ((drh) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00fe, code lost:
    
        if (r0.a("is_don", r3) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0100, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00dd, code lost:
    
        if (r0.a("primary_block", r3) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cd, code lost:
    
        if (r0.a("channel_info", r3) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00be, code lost:
    
        if (r0.a("is_golden_marked_business", r3) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
    
        if (r0.a("is_confirmed_business", r3) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        if (r0.a("a_plus_mark", r3) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r0.a("channel_block", r3) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r0.a("channel_button", r3) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
    
        if (r0.a("content_sections_data", r3) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0064, code lost:
    
        if (r0.a("tabs", r3) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0054, code lost:
    
        if (r0.a("is_nft_photo", r3) == r1) goto L51;
     */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ali0 ali0Var = (ali0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.a.a(obj);
                this.L$0 = ali0Var;
                this.label = 1;
                break;
            case 1:
                kotlin.a.a(obj);
                this.L$0 = ali0Var;
                this.label = 2;
                break;
            case 2:
                kotlin.a.a(obj);
                this.L$0 = ali0Var;
                this.label = 3;
                break;
            case 3:
                kotlin.a.a(obj);
                this.L$0 = ali0Var;
                this.label = 4;
                break;
            case 4:
                kotlin.a.a(obj);
                this.L$0 = ali0Var;
                this.label = 5;
                break;
            case 5:
                kotlin.a.a(obj);
                this.L$0 = ali0Var;
                this.label = 6;
                break;
            case 6:
                kotlin.a.a(obj);
                this.L$0 = ali0Var;
                this.label = 7;
                break;
            case 7:
                kotlin.a.a(obj);
                this.L$0 = ali0Var;
                this.label = 8;
                break;
            case 8:
                kotlin.a.a(obj);
                this.L$0 = ali0Var;
                this.label = 9;
                break;
            case 9:
                kotlin.a.a(obj);
                this.L$0 = ali0Var;
                this.label = 10;
                break;
            case 10:
                kotlin.a.a(obj);
                if (((Boolean) this.this$0.s.getValue()).booleanValue()) {
                    this.L$0 = null;
                    this.label = 11;
                    break;
                }
                return s3q0.a;
            case 11:
                kotlin.a.a(obj);
                return s3q0.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
