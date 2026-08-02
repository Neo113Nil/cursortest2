package com.yandex.go.user_profile.main_menu.log_out.domain;

import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment;
import com.yandex.go.user_profile.main_menu.profile.repository.logout.presentation.MainMenuLogOutUiState;
import defpackage.bms;
import defpackage.gl3;
import defpackage.hl3;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class MainMenuLogOutInteractorImpl$logOutStateFlow$2 extends AdaptedFunctionReference implements bms {
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        hl3 hl3Var = (hl3) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ((c) this.receiver).getClass();
        return (!((UserProfileExperiment) obj).i() || (hl3Var instanceof gl3)) ? MainMenuLogOutUiState.NONE : booleanValue ? MainMenuLogOutUiState.ENABLED : MainMenuLogOutUiState.DISABLED;
    }
}
