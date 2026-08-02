package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetUserSettingsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetUserSettingsSettingsIdsDto;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsUploadUserInfoInteractorImpl.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsUploadUserInfoInteractorImpl$canAttachProductForUser$2", f = "ClipsUploadUserInfoInteractorImpl.kt", l = {84, 72}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class vkf extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
    final /* synthetic */ UserId $groupId;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ykf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkf(ykf ykfVar, UserId userId, spj<? super vkf> spjVar) {
        super(2, spjVar);
        this.this$0 = ykfVar;
        this.$groupId = userId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new vkf(this.this$0, this.$groupId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
        return ((vkf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [xsna.ui50] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ykf ykfVar;
        wi50 wi50Var;
        UserId userId;
        int i;
        ui50 ui50Var;
        Throwable th;
        Boolean bool;
        Map map;
        UserId userId2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                kotlin.a.a(obj);
                ykfVar = this.this$0;
                wi50Var = ykfVar.f;
                UserId userId3 = this.$groupId;
                this.L$0 = wi50Var;
                this.L$1 = ykfVar;
                this.L$2 = userId3;
                this.I$0 = 0;
                this.label = 1;
                if (wi50Var.b(this) != coroutineSingletons) {
                    userId = userId3;
                    i = 0;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                userId2 = (UserId) this.L$2;
                map = (Map) this.L$1;
                ui50Var = (ui50) this.L$0;
                try {
                    kotlin.a.a(obj);
                    bool = Boolean.valueOf(epx.f(((ShortVideoGetUserSettingsResponseDto) obj).e(), Boolean.TRUE));
                    map.put(userId2, bool);
                    Boolean bool2 = bool;
                    ui50Var.c(null);
                    return bool2;
                } catch (Throwable th2) {
                    th = th2;
                    ui50Var.c(null);
                    throw th;
                }
            }
            i = this.I$0;
            userId = (UserId) this.L$2;
            ykfVar = (ykf) this.L$1;
            ?? r7 = (ui50) this.L$0;
            kotlin.a.a(obj);
            wi50Var = r7;
            HashMap<UserId, Boolean> hashMap = ykfVar.e;
            UserId c = userId == null ? ykfVar.a.c() : userId;
            bool = hashMap.get(c);
            if (bool != null) {
                ui50Var = wi50Var;
                Boolean bool22 = bool;
                ui50Var.c(null);
                return bool22;
            }
            iz2 A = yfb.A(mgj0.h((mgj0) ykfVar.c.getValue(), Collections.singletonList(ShortVideoGetUserSettingsSettingsIdsDto.CAN_ATTACH_PRODUCTS), userId != null ? fkq0.a(userId) : null, 4));
            this.L$0 = wi50Var;
            this.L$1 = hashMap;
            this.L$2 = c;
            this.L$3 = null;
            this.I$0 = i;
            this.I$1 = 0;
            this.I$2 = 0;
            this.I$3 = 0;
            this.label = 2;
            Object p = evj.p(A, this);
            if (p != coroutineSingletons) {
                ui50Var = wi50Var;
                obj = p;
                map = hashMap;
                userId2 = c;
                bool = Boolean.valueOf(epx.f(((ShortVideoGetUserSettingsResponseDto) obj).e(), Boolean.TRUE));
                map.put(userId2, bool);
                Boolean bool222 = bool;
                ui50Var.c(null);
                return bool222;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            ui50Var = wi50Var;
            th = th3;
            ui50Var.c(null);
            throw th;
        }
    }
}
