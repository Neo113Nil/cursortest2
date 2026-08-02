package com.yandex.go.user_profile.main_menu.profile.repository;

import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", ACSPConstants.STATUS, "", "experiment", "Lcom/yandex/go/user_profile/fullscreen/models/UserProfileExperiment;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.user_profile.main_menu.profile.repository.MainMenuUserProfileStatusRepository$getStatusNameFlow$1", f = "MainMenuUserProfileStatusRepository.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MainMenuUserProfileStatusRepository$getStatusNameFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainMenuUserProfileStatusRepository$getStatusNameFlow$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainMenuUserProfileStatusRepository$getStatusNameFlow$1 mainMenuUserProfileStatusRepository$getStatusNameFlow$1 = new MainMenuUserProfileStatusRepository$getStatusNameFlow$1(this.this$0, (Continuation) obj3);
        mainMenuUserProfileStatusRepository$getStatusNameFlow$1.L$0 = (String) obj;
        mainMenuUserProfileStatusRepository$getStatusNameFlow$1.L$1 = (UserProfileExperiment) obj2;
        return mainMenuUserProfileStatusRepository$getStatusNameFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        UserProfileExperiment userProfileExperiment = (UserProfileExperiment) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        FormattedText a = d.a(this.this$0, userProfileExperiment, str);
        if (a == null && (a = d.a(this.this$0, userProfileExperiment, "fallback_status")) == null) {
            a = FormattedText.c;
        }
        ru.yandex.taxi.widget.c cVar = this.this$0.c;
        Map map = userProfileExperiment.g;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 1;
        Object i2 = ru.yandex.taxi.widget.c.i(cVar, a, map, this, 28);
        return i2 == coroutineSingletons ? coroutineSingletons : i2;
    }
}
