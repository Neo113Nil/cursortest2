package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family;

import defpackage.ds31;
import defpackage.eu90;
import defpackage.ind0;
import defpackage.obp;
import defpackage.tje;
import defpackage.wap;
import defpackage.xvz;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class a {
    public final /* synthetic */ FamilyFragment a;

    public a(FamilyFragment familyFragment) {
        this.a = familyFragment;
    }

    public final void a(String str) {
        b viewModel;
        viewModel = this.a.getViewModel();
        wap wapVar = viewModel.z;
        if (wapVar != null) {
            ind0 a = viewModel.b.a.a();
            obp obpVar = viewModel.x;
            String uuid = a.a.toString();
            String str2 = wapVar.a;
            String str3 = wapVar.c;
            eu90 eu90Var = obpVar.b;
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", uuid, "url", str2);
            t.put("skipButtonText", str3);
            t.put("fail_reason", str);
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("FamilyInvite.Screen.WebView.Fail", t);
        }
        viewModel.W();
    }

    public final void b(String str, String str2, String str3) {
        b viewModel;
        viewModel = this.a.getViewModel();
        viewModel.getClass();
        tje.N(ds31.a(viewModel), null, null, new FamilyViewModel$onWebPageOpensNativeSharing$1(viewModel, str, str2, str3, null), 3);
    }
}
