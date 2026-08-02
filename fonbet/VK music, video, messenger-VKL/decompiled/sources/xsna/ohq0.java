package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.android.billingclient.api.BillingClient;
import com.vk.api.generated.vmoji.dto.VmojiGetCharacterByIdResponseDto;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import xsna.e6w0;
import xsna.iyq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ohq0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ohq0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                rhq0 rhq0Var = (rhq0) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                b25 b25Var = rhq0Var.c;
                Resources resources = rhq0Var.b;
                boolean a = b25Var.a(extendedUserProfile.a.c);
                ArrayList arrayList = new ArrayList();
                ArrayList<String> arrayList2 = extendedUserProfile.t1;
                if ((arrayList2 == null || arrayList2.contains("friends")) && extendedUserProfile.b("friends") > 0) {
                    int b = extendedUserProfile.b("friends");
                    int b2 = extendedUserProfile.Z0.containsKey("mutual_friends") ? extendedUserProfile.b("mutual_friends") : 0;
                    String m = uqm0.m(b);
                    if (b2 > 0) {
                        StringBuilder b3 = ho8.b(m, " (");
                        b3.append(uqm0.k(b2, R.plurals.friends_mutual));
                        b3.append(')');
                        m = b3.toString();
                    }
                    y4m y4mVar = new y4m(R.drawable.vk_icon_user_outline_28, resources.getString(R.string.friends), m, "user_details_item_friends_test_tag", null, null, 224);
                    if (!bwd0.c(extendedUserProfile) || b2 > 0) {
                        y4mVar.k = new f0(8, rhq0Var, fragmentActivity);
                    }
                    arrayList.add(y4mVar);
                }
                if (extendedUserProfile.b(BillingClient.FeatureType.SUBSCRIPTIONS) > 0) {
                    arrayList.add(new y4m(R.drawable.vk_icon_users_outline_28, resources.getString(R.string.profile_subscriptions), uqm0.m(extendedUserProfile.b(BillingClient.FeatureType.SUBSCRIPTIONS)), "user_details_item_subscriptions_test_tag", !bwd0.c(extendedUserProfile) ? new u69(8, rhq0Var, fragmentActivity) : null, null, 224));
                }
                if (extendedUserProfile.b("groups") > 0) {
                    arrayList.add(new y4m(R.drawable.vk_icon_users_3_outline_28, resources.getString(R.string.profile_groups), uqm0.m(extendedUserProfile.b("groups")), "user_details_item_groups_test_tag", !bwd0.c(extendedUserProfile) ? new ir40(rhq0Var, fragmentActivity, extendedUserProfile, 3) : null, null, 224));
                }
                boolean d = fkq0.d(extendedUserProfile.a.c);
                boolean z = (extendedUserProfile.b1 && extendedUserProfile.b("wishes") > 0) || a;
                if (d && z) {
                    int b4 = extendedUserProfile.b("wishes");
                    arrayList.add(new y4m(R.drawable.vk_icon_list_like_outline_28, resources.getString(R.string.profile_wishlist), b4 > 0 ? uqm0.m(b4) : "", "user_details_item_wishlist_test_tag", new wop0(rhq0Var, fragmentActivity, extendedUserProfile, 1), null, 224));
                }
                if (!arrayList.isEmpty()) {
                    ((we6) arrayList.get(0)).j(3);
                }
                arrayList.isEmpty();
                break;
            case 1:
                hyq0 hyq0Var = (hyq0) this.c;
                izs izsVar = (izs) this.d;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    hyq0Var.T(iyq0.g.b);
                } else {
                    hyq0Var.T(iyq0.e.b);
                }
                if (izsVar != null) {
                    izsVar.invoke(bool);
                }
                break;
            case 2:
                k4v0 k4v0Var = (k4v0) this.c;
                MusicBaseVkMixInteractiveVh.b bVar = (MusicBaseVkMixInteractiveVh.b) this.d;
                UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) j5g.a0(k4v0Var.b.c());
                if (uIBlockActionOpenUrl != null) {
                    bVar.invoke(uIBlockActionOpenUrl);
                }
                break;
            default:
                m6w0 m6w0Var = (m6w0) this.c;
                e6w0 e6w0Var = (e6w0) this.d;
                final VmojiGetCharacterByIdResponseDto vmojiGetCharacterByIdResponseDto = (VmojiGetCharacterByIdResponseDto) obj;
                final y7w0 y7w0Var = m6w0Var.g;
                final VmojiProductModel vmojiProductModel = ((e6w0.s) e6w0Var).b;
                final l6w0 l6w0Var = new l6w0(m6w0Var, 0);
                View view = y7w0Var.a.getView();
                if (view != null) {
                    view.post(new Runnable() { // from class: xsna.x7w0
                        @Override // java.lang.Runnable
                        public final void run() {
                            msp0 msp0Var = new msp0();
                            Context context = y7w0.this.c;
                            l6w0 l6w0Var2 = l6w0Var;
                            VmojiProductModel vmojiProductModel2 = vmojiProductModel;
                            msp0Var.a(context, vmojiProductModel2, vmojiGetCharacterByIdResponseDto, new snj0(7, l6w0Var2, vmojiProductModel2));
                        }
                    });
                }
                break;
        }
        return s3q0.a;
    }
}
