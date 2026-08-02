package com.ybsdk.screens.initial;

import androidx.fragment.app.Fragment;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.screens.initial.InitialFragmentScreenParams;
import defpackage.kcs;
import defpackage.qoi0;
import defpackage.tc9;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a implements kcs {
    public final /* synthetic */ tc9 a;

    public a(Map map) {
        this.a = new tc9(map, 10);
    }

    public static FragmentScreen b(InitialFragmentScreenParams initialFragmentScreenParams) {
        return new FragmentScreen("InitialScreen", false, initialFragmentScreenParams, TransitionPolicyType.NONE, qoi0.a(InitialFragment.class), OpenScreenRequirement.WithoutRequirements.INSTANCE, 2, null);
    }

    public static /* synthetic */ FragmentScreen c(a aVar) {
        InitialFragmentScreenParams.Default r0 = new InitialFragmentScreenParams.Default(false, 1, null);
        aVar.getClass();
        return b(r0);
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        return this.a.a(str);
    }
}
