package com.yandex.go.ultima_mode.profile.mvp;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse;", "response", "", "isUltimaModeManuallyDisabled", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lzgf0;", "<anonymous>", "(Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse;ZLru/yandex/taxi/theme/ThemeType;)Lzgf0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ultima_mode.profile.mvp.ProfileUltimaModeViewPresenter$uiStateFlow$1", f = "ProfileUltimaModeViewPresenter.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ProfileUltimaModeViewPresenter$uiStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUltimaModeViewPresenter$uiStateFlow$1(a aVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ProfileUltimaModeViewPresenter$uiStateFlow$1 profileUltimaModeViewPresenter$uiStateFlow$1 = new ProfileUltimaModeViewPresenter$uiStateFlow$1(this.this$0, (Continuation) obj4);
        profileUltimaModeViewPresenter$uiStateFlow$1.L$0 = (UltimaModeResponse) obj;
        profileUltimaModeViewPresenter$uiStateFlow$1.Z$0 = booleanValue;
        return profileUltimaModeViewPresenter$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UltimaModeResponse ultimaModeResponse = (UltimaModeResponse) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        com.yandex.go.ultima_mode.profile.state.a aVar = this.this$0.z;
        this.L$0 = null;
        this.Z$0 = z;
        this.label = 1;
        Object a = aVar.a(ultimaModeResponse, z, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
