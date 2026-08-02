package xsna;

import android.content.Context;
import androidx.credentials.CreatePasswordRequest;
import androidx.credentials.CredentialManager;
import androidx.credentials.exceptions.CreateCredentialException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.xwu0;

/* compiled from: VkGoogleCredentialsManager.kt */
@b6l(c = "com.vk.auth.credentials.VkGoogleCredentialsManager$Saver$saveCredentials$1", f = "VkGoogleCredentialsManager.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class ywu0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<Throwable, s3q0> $failListener;
    final /* synthetic */ String $password;
    final /* synthetic */ gzs<s3q0> $successListener;
    final /* synthetic */ String $username;
    int label;
    final /* synthetic */ xwu0 this$0;
    final /* synthetic */ xwu0.b this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ywu0(xwu0 xwu0Var, xwu0.b bVar, String str, String str2, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar, spj<? super ywu0> spjVar) {
        super(2, spjVar);
        this.this$0 = xwu0Var;
        this.this$1 = bVar;
        this.$username = str;
        this.$password = str2;
        this.$successListener = gzsVar;
        this.$failListener = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ywu0(this.this$0, this.this$1, this.$username, this.$password, this.$successListener, this.$failListener, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ywu0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                CredentialManager credentialManager = (CredentialManager) this.this$0.a.getValue();
                Context context = this.this$1.a;
                CreatePasswordRequest createPasswordRequest = new CreatePasswordRequest(this.$username, this.$password, null, false, false, 28, null);
                this.label = 1;
                if (credentialManager.createCredential(context, createPasswordRequest, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            par0.a.getClass();
            par0.a("Smart lock: credential save finished with success");
            this.$successListener.invoke();
        } catch (CreateCredentialException e) {
            this.$failListener.invoke(e);
        }
        return s3q0.a;
    }
}
