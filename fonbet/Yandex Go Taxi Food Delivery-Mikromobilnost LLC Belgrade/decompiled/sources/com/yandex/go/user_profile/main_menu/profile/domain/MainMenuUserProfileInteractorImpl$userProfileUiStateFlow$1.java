package com.yandex.go.user_profile.main_menu.profile.domain;

import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment;
import defpackage.fl3;
import defpackage.hl3;
import defpackage.p600;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class MainMenuUserProfileInteractorImpl$userProfileUiStateFlow$1 extends AdaptedFunctionReference implements zls {
    public MainMenuUserProfileInteractorImpl$userProfileUiStateFlow$1(c cVar) {
        super(3, cVar, c.class, "createAppearanceCriteria", "createAppearanceCriteria(Lru/yandex/taxi/am/AuthStatus;Lcom/yandex/go/user_profile/fullscreen/models/UserProfileExperiment;)Lcom/yandex/go/user_profile/main_menu/profile/domain/MainMenuUserProfileInteractorImpl$AppearanceCriteria;", 4);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((c) this.receiver).getClass();
        return new p600(((hl3) obj) instanceof fl3, ((UserProfileExperiment) obj2).i());
    }
}
