package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlinx.serialization.json.JsonElement;

/* compiled from: JsonTreeReader.kt */
@b6l(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class hby extends RestrictedSuspendLambda implements yzs<p9l<s3q0, JsonElement>, s3q0, spj<? super JsonElement>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jby this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hby(jby jbyVar, spj<? super hby> spjVar) {
        super(3, spjVar);
        this.this$0 = jbyVar;
    }

    @Override // xsna.yzs
    public final Object invoke(p9l<s3q0, JsonElement> p9lVar, s3q0 s3q0Var, spj<? super JsonElement> spjVar) {
        hby hbyVar = new hby(this.this$0, spjVar);
        hbyVar.L$0 = p9lVar;
        return hbyVar.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            p9l p9lVar = (p9l) this.L$0;
            byte x = this.this$0.a.x();
            if (x == 1) {
                return this.this$0.d(true);
            }
            if (x == 0) {
                return this.this$0.d(false);
            }
            if (x != 6) {
                if (x == 8) {
                    return this.this$0.c();
                }
                af.q(this.this$0.a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            jby jbyVar = this.this$0;
            this.label = 1;
            obj = jby.a(jbyVar, p9lVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return (JsonElement) obj;
    }
}
