package xsna;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: WindowRecomposer.android.kt */
@b6l(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class vrx0 extends SuspendLambda implements wzs<lsr<? super Float>, spj<? super s3q0>, Object> {
    final /* synthetic */ Uri $animationScaleUri;
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ qta<s3q0> $channel;
    final /* synthetic */ wrx0 $contentObserver;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrx0(ContentResolver contentResolver, Uri uri, wrx0 wrx0Var, qta<s3q0> qtaVar, Context context, spj<? super vrx0> spjVar) {
        super(2, spjVar);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = wrx0Var;
        this.$channel = qtaVar;
        this.$applicationContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        vrx0 vrx0Var = new vrx0(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, spjVar);
        vrx0Var.L$0 = obj;
        return vrx0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super Float> lsrVar, spj<? super s3q0> spjVar) {
        return ((vrx0) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r4.emit(r5, r8) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0014, B:9:0x0047, B:15:0x0057, B:17:0x005f, B:25:0x002c, B:27:0x0041), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0081 -> B:8:0x0017). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lsr lsrVar;
        o0b<s3q0> it;
        lsr lsrVar2;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                lsrVar = (lsr) this.L$0;
                this.$resolver.registerContentObserver(this.$animationScaleUri, false, this.$contentObserver);
                it = this.$channel.iterator();
                this.L$0 = lsrVar;
                this.L$1 = it;
                this.label = 1;
                a = it.a(this);
                if (a != coroutineSingletons) {
                }
            } else if (i == 1) {
                it = (o0b) this.L$1;
                lsrVar2 = (lsr) this.L$0;
                kotlin.a.a(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (o0b) this.L$1;
                lsrVar2 = (lsr) this.L$0;
                kotlin.a.a(obj);
                lsrVar = lsrVar2;
                this.L$0 = lsrVar;
                this.L$1 = it;
                this.label = 1;
                a = it.a(this);
                if (a != coroutineSingletons) {
                    return coroutineSingletons;
                }
                lsrVar2 = lsrVar;
                obj = a;
                if (((Boolean) obj).booleanValue()) {
                    this.$resolver.unregisterContentObserver(this.$contentObserver);
                    return s3q0.a;
                }
                it.next();
                Context context = this.$applicationContext;
                ph50<Context, ttk0<Float>> ph50Var = xrx0.a;
                Float f = new Float(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                this.L$0 = lsrVar2;
                this.L$1 = it;
                this.label = 2;
            }
        } catch (Throwable th) {
            this.$resolver.unregisterContentObserver(this.$contentObserver);
            throw th;
        }
    }
}
