package com.ybsdk.di.modules;

import androidx.fragment.app.FragmentActivity;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import defpackage.cu2;
import defpackage.eja1;
import defpackage.g3d0;
import defpackage.k3h;
import defpackage.mu31;
import defpackage.nbp0;
import defpackage.tje;
import defpackage.v0h;
import defpackage.x0h;
import defpackage.y0h;
import defpackage.zy11;
import kotlin.Result;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class d implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public d(cu2 cu2Var, mu31 mu31Var, FragmentActivity fragmentActivity) {
        this.a = 0;
        this.b = mu31Var;
        this.c = fragmentActivity;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        Object obj = this.b;
        Object obj2 = this.c;
        EmptyList emptyList = EmptyList.a;
        switch (i) {
            case 0:
                if (baseDeeplinkAction instanceof DeeplinkAction.SetAppIcon) {
                    ((DeeplinkAction.SetAppIcon) baseDeeplinkAction).getIconId();
                    if (Result.a(zy11.a) != null) {
                        tje.N(eja1.s(((mu31) obj).a), null, null, new DeeplinkModule$provideSetAppIconDelegate$1$1$1((FragmentActivity) obj2, null), 3);
                    }
                    break;
                }
                break;
            case 1:
                if (baseDeeplinkAction instanceof DeeplinkAction.ShowSnackbar) {
                    tje.N(eja1.s(((mu31) obj).a), null, null, new DeeplinkModule$provideSnackBarDeeplink$1$1((FragmentActivity) obj2, (DeeplinkAction.ShowSnackbar) baseDeeplinkAction, null), 3);
                    break;
                }
                break;
            default:
                g3d0 g3d0Var = (g3d0) obj2;
                if (baseDeeplinkAction instanceof DeeplinkAction.PlusHome) {
                    DeeplinkAction.PlusHome plusHome = (DeeplinkAction.PlusHome) baseDeeplinkAction;
                    if (!plusHome.getPresentModally()) {
                        plusHome.getDeeplink();
                        plusHome.getFitsSystemWindow();
                        break;
                    } else {
                        tje.N(((nbp0) obj).a, null, null, new DeeplinkModule$providePlusHomeDelegate$1$1(g3d0Var, plusHome, null), 3);
                        break;
                    }
                }
                break;
        }
        return new v0h(emptyList, null, 6);
    }

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
