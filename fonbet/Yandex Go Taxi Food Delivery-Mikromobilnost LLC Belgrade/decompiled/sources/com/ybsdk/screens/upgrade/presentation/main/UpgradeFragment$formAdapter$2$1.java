package com.ybsdk.screens.upgrade.presentation.main;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity;
import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment;
import defpackage.qoi0;
import defpackage.tfl0;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class UpgradeFragment$formAdapter$2$1 extends FunctionReferenceImpl implements tls {
    public UpgradeFragment$formAdapter$2$1(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onFormFieldClicked", "onFormFieldClicked(Lcom/ybsdk/screens/upgrade/domain/entities/SimpleIdFormFieldEntity;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        tfl0 tfl0Var = ((a) this.receiver).H;
        TransitionPolicyType transitionPolicyType = TransitionPolicyType.POPUP;
        tfl0Var.h(new FragmentScreen("UpgradeEditScreen", false, new UpgradeEditFragment.UpgradeEditScreenParams((SimpleIdFormFieldEntity) obj), transitionPolicyType, qoi0.a(UpgradeEditFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null));
        return zy11.a;
    }
}
