package xsna;

import android.content.Context;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.h;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkExtraPaymentOptions;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkOrderDescription;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import kotlin.Result;
import org.json.JSONObject;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart;
import xsna.bbv0;
import xsna.dhd;
import xsna.ij20;
import xsna.q2j;
import xsna.qv4;
import xsna.ttf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ak implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ak(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object failure;
        CharSequence parseTurnServers$lambda$1;
        boolean z = true;
        switch (this.b) {
            case 0:
                return (String) ((h2q) obj).c.getValue();
            case 1:
                try {
                    fg4 fg4Var = (fg4) j5g.Y((List) obj);
                    failure = AudioBook.zb(new AudioBook(new JSONObject(fg4Var.s)), null, fg4Var.m, 4128767);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                return new Result(failure);
            case 2:
                return Long.valueOf((long) (((qv4.b) obj).f * r0.e));
            case 3:
                return fwx0.c().a((CharSequence) obj);
            case 4:
                return Boolean.valueOf(!(((ib50) obj).a.J instanceof DownloadingState.Downloading));
            case 5:
                qgi0.r((tgi0) obj, "cart_community_delivery_types");
                return s3q0.a;
            case 6:
                L.i((Throwable) obj);
                return s3q0.a;
            case 7:
                return h.b.a;
            case 8:
                String str = ((ixw) obj).c;
                if (str.length() != 0) {
                    bbv0.g.getClass();
                    VkPayCheckoutConfig vkPayCheckoutConfig = bbv0.a.f().b;
                    VkExtraPaymentOptions vkExtraPaymentOptions = vkPayCheckoutConfig.e;
                    if (vkExtraPaymentOptions.c instanceof VkOrderDescription.NoDescription) {
                        bbv0.a.f().b = new VkPayCheckoutConfig(vkPayCheckoutConfig.b, vkPayCheckoutConfig.c, vkPayCheckoutConfig.d, new VkExtraPaymentOptions(vkExtraPaymentOptions.b, new VkOrderDescription.Description(str, null, 2, null), vkExtraPaymentOptions.d, vkExtraPaymentOptions.e), vkPayCheckoutConfig.f, vkPayCheckoutConfig.g, vkPayCheckoutConfig.h, vkPayCheckoutConfig.i, vkPayCheckoutConfig.j, vkPayCheckoutConfig.k, vkPayCheckoutConfig.l);
                    }
                }
                return s3q0.a;
            case 9:
                Optional optional = (Optional) obj;
                return !optional.isPresent() ? dhd.b.a : (dhd) ((Pair) optional.get()).i();
            case 10:
                return s3q0.a;
            case 11:
                return ttf.k.a.b;
            case 12:
                return Integer.valueOf(an10.b(sa30.E(((Float) obj).floatValue(), new k9x(0, 1, 1), new k9x(0, 100, 1))));
            case 13:
                qgi0.r((tgi0) obj, "communities_catalog_top_bar_search_voice_icon");
                return s3q0.a;
            case 14:
                cvk.w("error", false);
                return s3q0.a;
            case 15:
                return Boolean.valueOf(((CommunityProfileState) obj).r);
            case 16:
                return Boolean.valueOf(((vzh) obj).r);
            case 17:
                ((uzh0) obj).b();
                return s3q0.a;
            case 18:
                return ((q2j.h) obj).g;
            case 19:
                parseTurnServers$lambda$1 = ConversationStart.parseTurnServers$lambda$1((PeerConnection.IceServer) obj);
                return parseTurnServers$lambda$1;
            case 20:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_receive_msgs_disable, (Context) obj);
            case 21:
                return new b0l0(((dt9) obj).a);
            case 22:
                EducationState educationState = (EducationState) obj;
                if ((educationState.d != null || educationState.b() != null || educationState.h != null) && (educationState.d == null || educationState.b() == null)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                g620.q(0);
                return s3q0.a;
            case 24:
                ((ij20.a) obj).l(true);
                return s3q0.a;
            case 25:
                L.i((Throwable) obj);
                return s3q0.a;
            case 26:
                return ((sew) obj).a;
            case 27:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 28:
                List list = (List) obj;
                return new uxy((int[]) list.get(0), (int[]) list.get(1));
            default:
                return CatalogSectionState.a((CatalogSectionState) obj, null, false, false, null, null, false, null, null, null, null, 8175);
        }
    }

    public /* synthetic */ ak(Object obj, int i) {
        this.b = i;
    }
}
