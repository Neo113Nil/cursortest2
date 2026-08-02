package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.vk.auth.api.models.AuthResult;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.BannerButton;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.superapp.api.states.VkAuthState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import xsna.c4r0;
import xsna.e8v0;
import xsna.px9;
import xsna.q4r;
import xsna.qvq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class z14 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z14(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                a24 a24Var = (a24) this.c;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) this.d;
                View view = (View) this.e;
                if (((Boolean) obj).booleanValue()) {
                    a24Var.c.a(vkOnboardingCampaign, VkOnboardingType.Tooltip, e8v0.j.b);
                } else {
                    view.performClick();
                }
                break;
            case 1:
                AuthResult authResult = (AuthResult) this.c;
                VkAuthState vkAuthState = (VkAuthState) this.d;
                String str = (String) this.e;
                xbu0 xbu0Var = (xbu0) obj;
                if (xbu0Var.f.isEmpty()) {
                    break;
                } else {
                    l55.a.getClass();
                    break;
                }
            case 2:
                Peer peer = (Peer) this.c;
                BannerButton.a aVar = (BannerButton.a) this.d;
                pk30 pk30Var = (pk30) this.e;
                if (aVar.equals(BannerButton.a.e.a)) {
                    if (pk30Var != null) {
                        pk30Var.G(peer);
                    }
                } else if (aVar.equals(BannerButton.a.d.a)) {
                    if (pk30Var != null) {
                        pk30Var.B(peer, false);
                    }
                } else if (aVar.equals(BannerButton.a.C1164a.a)) {
                    if (pk30Var != null) {
                        pk30Var.B(peer, true);
                    }
                } else if (aVar instanceof BannerButton.a.c) {
                    if (pk30Var != null) {
                        pk30Var.H(((BannerButton.a.c) aVar).a);
                    }
                } else if ((aVar instanceof BannerButton.a.b) && pk30Var != null) {
                    pk30Var.K(((BannerButton.a.b) aVar).a);
                }
                break;
            case 3:
                Uri uri = (Uri) this.c;
                Context context = (Context) this.d;
                yp80 yp80Var = (yp80) this.e;
                c4r0.a aVar2 = (c4r0.a) obj;
                String str2 = aVar2 != null ? aVar2.a : null;
                if (str2 == null || str2.equals(uri.toString())) {
                    yp80Var.U();
                } else {
                    com.vk.common.links.b.h(context, str2, aVar2.b, aVar2.c, null);
                    yp80Var.onSuccess();
                }
                break;
            case 4:
                mzp0 mzp0Var = (mzp0) this.c;
                izs izsVar = (izs) this.d;
                vw9 vw9Var = (vw9) this.e;
                wy9 wy9Var = (wy9) obj;
                ArrayList arrayList = wy9Var.a;
                boolean isEmpty = arrayList.isEmpty();
                if (!isEmpty && mzp0Var != null) {
                    mzp0Var.c(false);
                }
                if (mzp0Var != null) {
                    mzp0Var.k(!isEmpty ? "carts_list" : "empty_cart");
                }
                izsVar.invoke(Integer.valueOf(arrayList.size()));
                vw9Var.T(new px9.e.a(arrayList, wy9Var.b));
                break;
            case 5:
                break;
            case 6:
                l2r.b((q4r.a) this.c, (qvq.m.a) this.d, (l2r) this.e, (List) obj);
                break;
            default:
                Map map = (Map) this.c;
                wh50 wh50Var = (wh50) this.d;
                wh50 wh50Var2 = (wh50) this.e;
                aoj aojVar = (aoj) obj;
                for (Map.Entry entry : map.entrySet()) {
                    aojVar.a(new mjr((String) entry.getValue(), wh50Var, entry.getKey(), wh50Var2));
                }
                break;
        }
        return s3q0.a;
    }
}
