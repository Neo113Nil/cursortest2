package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.j;
import com.vk.dto.geo.GeoLocation;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.log.L;
import com.vk.stickers.keyboard.navigation.KeyboardNavigationVmojiPackItem;
import com.vk.webapp.fragments.GiftsCatalogFragment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.cos;
import xsna.f9j0;
import xsna.jke;
import xsna.l1j;
import xsna.m1j;
import xsna.n610;
import xsna.nxz;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tr0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ tr0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = true;
        z = true;
        int i = 0;
        switch (this.b) {
            case 0:
                tj50.a aVar = (tj50.a) obj;
                ds0 ds0Var = ds0.b;
                ao8 ao8Var = ao8.d;
                return new is0(aVar.a(ds0Var, ao8Var), aVar.a(es0.b, ao8Var), aVar.a(gs0.b, ao8Var), aVar.a(new d40(z ? 1 : 0), ao8Var), aVar.a(new ur0(0), ao8Var), aVar.a(new vr0(i), ao8Var), aVar.a(new sc(z ? 1 : 0), ao8Var), aVar.a(new tc(z ? 1 : 0), ao8Var), aVar.a(new wr0(i), ao8Var), aVar.a(new xr0(i), ao8Var), aVar.a(fs0.b, ao8Var), aVar.a(yr0.b, ao8Var), aVar.a(zr0.b, ao8Var), aVar.a(as0.b, ao8Var), aVar.a(bs0.b, ao8Var), aVar.a(cs0.b, ao8Var));
            case 1:
                qgi0.r((tgi0) obj, "CHAT_SETTINGS_TOP_BAR_DONE_BUTTON_TAG");
                return s3q0.a;
            case 2:
                return s3q0.a;
            case 3:
                zgd zgdVar = (zgd) obj;
                return new ahd(zgdVar.b, zgdVar.e, zgdVar.f, zgdVar.g, zgdVar.h, zgdVar.j);
            case 4:
                qgi0.r((tgi0) obj, "COMMON_GRID_TOOLBAR_TITLE_TEST_TAG");
                return s3q0.a;
            case 5:
                return j5g.v0(f9j0.b.a, (List) obj);
            case 6:
                tj50.a aVar2 = (tj50.a) obj;
                ur0 ur0Var = new ur0(9);
                ao8 ao8Var2 = ao8.d;
                return new jke.a(aVar2.a(ur0Var, ao8Var2), aVar2.a(new vr0(15), ao8Var2), aVar2.a(new sc(8), ao8Var2));
            case 7:
                L.i((Throwable) obj);
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((nov) obj) instanceof omv);
            case 9:
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    j03.a.getClass();
                    j03.k((VKApiExecutionException) th);
                } else {
                    cvk.u(R.string.live_network_error_description, false);
                }
                return s3q0.a;
            case 10:
                return new vb6(R.layout.vk_base_components_view_holder, (ViewGroup) obj);
            case 11:
                l1j.f.a aVar3 = ((l1j.f) obj).i;
                if (aVar3 instanceof l1j.f.a.c) {
                    return m1j.e.a.b.a;
                }
                if (aVar3 instanceof l1j.f.a.b) {
                    return new m1j.e.a.C3317a(R.string.voip_session_room_admin_move_participant_error);
                }
                if (aVar3 instanceof l1j.f.a.C3225a) {
                    return new m1j.e.a.C3317a(R.string.voip_session_room_admin_assign_participants_error);
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                return new l2j((ViewGroup) obj);
            case 13:
                return Integer.valueOf(com.vk.im.ui.components.contacts.b.j((qtd0) obj));
            case 14:
                View view = (View) obj;
                view.requestFocus();
                mhy.j(view);
                return s3q0.a;
            case 15:
                return iwl.b((DeliveryPoint) ((i5u0) obj).a);
            case 16:
                return aam.k((q9m) obj);
            case 17:
                androidx.media3.common.a aVar4 = (androidx.media3.common.a) obj;
                String str = aVar4.a;
                if (str == null) {
                    str = "";
                }
                return new one.video.player.tracks.b(str, fr10.c(aVar4));
            case 18:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 19:
                return cos.e.a;
            case 20:
                int i2 = GiftsCatalogFragment.c0;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_enabled", 1);
                return jSONObject;
            case 21:
                xgx0 xgx0Var = xgx0.a;
                String str2 = "HealthUtilsImpl loadHealthCommonClientConfig error: " + ((Throwable) obj).getMessage();
                xgx0Var.getClass();
                xgx0.a(str2);
                return s3q0.a;
            case 22:
                hfz hfzVar = (hfz) obj;
                if (!(hfzVar instanceof KeyboardNavigationVmojiPackItem) && !(hfzVar instanceof mgy)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                String str3 = nxz.q;
                return nxz.b.a((GeoLocation) obj);
            case 24:
                return Integer.valueOf(((j.a) obj).c);
            case 25:
                int i3 = MarketItemReviewsFragment.w0;
                qgi0.r((tgi0) obj, "toolbar_title");
                return s3q0.a;
            case 26:
                return n610.b.a;
            case 27:
                return Boolean.valueOf(((e430) obj).e);
            case 28:
                ((Integer) obj).getClass();
                int i4 = q830.c;
                return "?";
            default:
                qgi0.r((tgi0) obj, "movie_info_expand_collapse_button_text");
                return s3q0.a;
        }
    }

    public /* synthetic */ tr0(Object obj, int i) {
        this.b = i;
    }
}
