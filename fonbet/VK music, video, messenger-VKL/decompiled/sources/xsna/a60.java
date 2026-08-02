package xsna;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.Attachment;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.ecomm.cart.impl.cart.a;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageColumn;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.bridge.b;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import xsna.it80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a60 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ a60(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                L.j(th, "Offline:ActionSynchronizerInteractorImpl", "Error deleting synced actions.");
                com.vk.metrics.eventtracking.b.a.a(th);
                return s3q0.a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return brm0.y(((nex0) obj).a, "#peer_id", "&hash");
            case 3:
                Throwable th2 = (Throwable) obj;
                h03.b(th2);
                L.i(th2);
                return s3q0.a;
            case 4:
                return s3q0.a;
            case 5:
                L.i((Throwable) obj);
                return s3q0.a;
            case 6:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case 7:
                Integer num = (Integer) obj;
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.i, new Object[]{gq.d(num, "[Blockstore] save success, stored bytes = ")});
                }
                return s3q0.a;
            case 8:
                int i = BonusCatalogFragment.f0;
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 9:
                FragmentManager fragmentManager = (FragmentManager) obj;
                if (com.vk.voip.ui.c.b.L() == null) {
                    L.A("CallNavigation", "Call info is null");
                    return s3q0.a;
                }
                int i2 = CallParticipantsFragment.W;
                if (fragmentManager.H("CallSettingsFragment") != null) {
                    L.A("CallNavigation", "Settings already visible");
                    return s3q0.a;
                }
                new CallParticipantsFragment().Td(fragmentManager, "CallSettingsFragment");
                return s3q0.a;
            case 10:
                return a.d.a;
            case 11:
                return ((ChannelMessageColumn) obj).getKey();
            case 12:
                return ca3.b((Attachment) obj);
            case 13:
                VkImage vkImage = new VkImage((Context) obj, null, 6, 0);
                vkImage.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                return vkImage;
            case 14:
                L.e("CLIPS_NPS", "poll is ready; " + ((ExternalNpsCondition) obj));
                return s3q0.a;
            case 15:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (((SdkVideoFile) obj2).v3()) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 16:
                Throwable th3 = (Throwable) obj;
                if (th3 instanceof VKApiExecutionException) {
                    j03.a.getClass();
                    j03.k((VKApiExecutionException) th3);
                } else {
                    cvk.u(R.string.live_network_error_description, false);
                }
                return s3q0.a;
            case 17:
                return new b.a((StickerStockItem) obj, GiftData.d);
            case 18:
                qgi0.r((tgi0) obj, "ad_banner_label");
                return s3q0.a;
            case 19:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 20:
                qgi0.r((tgi0) obj, "community_top_bar_manage_icon");
                return s3q0.a;
            case 21:
                x8j x8jVar = (x8j) obj;
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return new rbj(5, x8jVar.c, x8jVar.a, SortOrder.BY_NAME, x8jVar.d, false, "ContactsListComponent", x8jVar.e);
            case 22:
                xck xckVar = (xck) obj;
                return new zck(xckVar.b, xckVar.c, xckVar.d, xckVar.e, xckVar.i);
            case 23:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_receive_msgs_enable, (Context) obj);
            case 24:
                return s3q0.a;
            case 25:
                return Boolean.valueOf(!((Set) obj).isEmpty());
            case 26:
                return ((ka80) obj).c.e;
            case 27:
                it80.b.getClass();
                return it80.a.a();
            case 28:
                return (List) obj;
            default:
                qgi0.n((tgi0) obj, 0);
                return s3q0.a;
        }
    }
}
