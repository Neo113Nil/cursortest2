package xsna;

import androidx.credentials.provider.CredentialEntry;
import com.vk.api.generated.account.dto.AccountSetPrivacyKeyDto;
import com.vk.dto.common.id.UserId;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsEditSdkPrivacyHandlerVk.kt */
/* loaded from: classes16.dex */
public final class mvd implements otc {
    public final xqu a;
    public final bs b;
    public final gxh c;

    public mvd(xqu xquVar, bs bsVar, gxh gxhVar) {
        this.a = xquVar;
        this.b = bsVar;
        this.c = gxhVar;
    }

    @Override // xsna.otc
    public final s3q0 a() {
        return s3q0.a;
    }

    @Override // xsna.otc
    public final Object b(qsc qscVar) {
        Object p = evj.p(yfb.A(bs.n(this.b, AccountSetPrivacyKeyDto.CLOSED_PROFILE, Collections.singletonList(CredentialEntry.FALSE_STRING), null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)), qscVar);
        return p == CoroutineSingletons.COROUTINE_SUSPENDED ? p : s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // xsna.otc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(UserId userId, ContinuationImpl continuationImpl) {
        lvd lvdVar;
        int i;
        xy2 o;
        UserId userId2;
        if (continuationImpl instanceof lvd) {
            lvdVar = (lvd) continuationImpl;
            int i2 = lvdVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lvdVar.label = i2 - Integer.MIN_VALUE;
                Object obj = lvdVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lvdVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    o = this.a.o(userId, (r30 & 2) != 0 ? null : null, (r30 & 4) != 0 ? null : null, (r30 & 8) != 0 ? null : null, (r30 & 16) != 0 ? null : new Integer(0), (r30 & 32) != 0 ? null : null, (r30 & 256) != 0 ? null : null, (r30 & 134217728) != 0 ? null : null, (r31 & 4) != 0 ? null : null, (r32 & 64) != 0 ? null : null, (r32 & 256) != 0 ? null : null, (r32 & 512) != 0 ? null : null, (4194304 & r32) != 0 ? null : null, (r32 & 8388608) != 0 ? null : null);
                    iz2 A = yfb.A(o);
                    lvdVar.L$0 = userId;
                    lvdVar.label = 1;
                    if (evj.p(A, lvdVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    userId2 = userId;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    userId2 = (UserId) lvdVar.L$0;
                    kotlin.a.a(obj);
                }
                this.c.G0(userId2);
                return s3q0.a;
            }
        }
        lvdVar = new lvd(this, continuationImpl);
        Object obj2 = lvdVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lvdVar.label;
        if (i != 0) {
        }
        this.c.G0(userId2);
        return s3q0.a;
    }
}
