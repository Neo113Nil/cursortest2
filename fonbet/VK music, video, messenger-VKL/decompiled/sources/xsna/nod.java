package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.dto.common.id.UserId;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsCtaInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class nod implements lod {
    public final qod a;

    public nod(qod qodVar) {
        this.a = qodVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.lod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UserId userId, ClipInvolvementActionButton clipInvolvementActionButton, ContinuationImpl continuationImpl) {
        mod modVar;
        int i;
        if (continuationImpl instanceof mod) {
            modVar = (mod) continuationImpl;
            int i2 = modVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                modVar.label = i2 - Integer.MIN_VALUE;
                Object obj = modVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = modVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                kotlin.a.a(obj);
                io.reactivex.rxjava3.core.x<Boolean> a = this.a.a(userId, clipInvolvementActionButton);
                modVar.L$0 = null;
                modVar.L$1 = null;
                modVar.label = 1;
                Object f = sd9.f(a, modVar);
                return f == coroutineSingletons ? coroutineSingletons : f;
            }
        }
        modVar = new mod(this, continuationImpl);
        Object obj2 = modVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = modVar.label;
        if (i == 0) {
        }
    }

    @Override // xsna.lod
    public final Object b(UserId userId, ocf ocfVar) {
        return sd9.g(this.a.b(fkq0.a(userId)), q230.FIRST_OR_DEFAULT, ocfVar);
    }
}
