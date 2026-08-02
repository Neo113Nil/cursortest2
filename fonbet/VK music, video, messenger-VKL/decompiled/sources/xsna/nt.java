package xsna;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.widget.ImageView;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsGetCheckoutUrlResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.feature.music.holders.audiobook.AudioContentCardVh;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.ClipsGeoPickerState;
import com.vk.clips.upload.vk.impl.uploader.ClipsUploadException;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.music.MusicTrack;
import com.vk.external.miniapp.net.app.ProfileItem;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.media.MediaFilteringStrategy;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nt implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ nt(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                qgi0.r((tgi0) obj, "anonymousProfileTitle");
                return s3q0.a;
            case 1:
                WebImageSize e = ((ProfileItem) obj).c.e(fc3.o);
                if (e != null) {
                    return e.b;
                }
                return null;
            case 2:
                return ((lr3) obj).c;
            case 3:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 4:
                Throwable th = (Throwable) obj;
                Context context = e43.a;
                cvk.w(j03.g(context != null ? context : null, th, R.string.default_network_error), false);
                return s3q0.a;
            case 5:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM audio_reaction");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th2) {
                    V0.close();
                    throw th2;
                }
            case 6:
                cvk.u(R.string.common_network_error, false);
                return s3q0.a;
            case 7:
                tj50.a aVar = (tj50.a) obj;
                qn7 qn7Var = qn7.b;
                ao8 ao8Var = ao8.d;
                return new com.vk.ecomm.onlinebooking.impl.calendar.j(aVar.a(qn7Var, ao8Var), new com.vk.ecomm.onlinebooking.impl.calendar.k(aVar.a(com.vk.ecomm.onlinebooking.impl.calendar.f.b, ao8Var)), new com.vk.ecomm.onlinebooking.impl.calendar.l(aVar.a(com.vk.ecomm.onlinebooking.impl.calendar.g.b, ao8Var)), aVar.a(new v7(11), ao8Var), aVar.a(new db(14), ao8Var), aVar.a(new ot(8), ao8Var));
            case 8:
                return (qt7) obj;
            case 9:
                return va9.r;
            case 10:
                String url = ((MarketIntegrationsGetCheckoutUrlResponseDto) obj).getUrl();
                if (url != null) {
                    return url;
                }
                throw new IllegalStateException("getIntegrationCheckoutUrl returned null url");
            case 11:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (!jnj.b(((MusicTrack) obj2).V)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 12:
                return s3q0.a;
            case 13:
                ((Integer) obj).intValue();
                return s3q0.a;
            case 14:
                VkImage vkImage = new VkImage((Context) obj, null, 6, 0);
                vkImage.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                return vkImage;
            case 15:
                return s3q0.a;
            case 16:
                return io.reactivex.rxjava3.core.q.H(new ClipsUploadException(ClipsUploadException.Type.SHORT_VIDEO_API, (Throwable) obj));
            case 17:
                return (ClipsDraftVk) ClipsDraftVk.d.a(new JSONObject(((Cursor) obj).getString(0)));
            case 18:
                return io.reactivex.rxjava3.core.q.O(((FriendsGetFieldsResponseDto) obj).d());
            case 19:
                return ((ClipsGeoPickerState) obj).b;
            case 20:
                qgi0.r((tgi0) obj, "AUTHOR_AVATAR_TEST_TAG");
                return s3q0.a;
            case 21:
                return lqe.a((ShortVideoPlaylistFullDto) obj, true);
            case 22:
                return "-".concat((String) obj);
            case 23:
                Intent intent = (Intent) obj;
                intent.putExtra("video_min_length_ms", 1000L);
                intent.putExtra("video_max_length_ms", ynd.a);
                intent.putExtra("media_type", 333);
                intent.putExtra("video_filtering_mode", MediaFilteringStrategy.ANY_VIDEO_WITH_AUDIO);
                intent.putExtra("prevent_styling", true);
                intent.putExtra("single_mode", true);
                intent.putExtra("camera_enabled", false);
                return s3q0.a;
            case 24:
                ArrayList<UIBlock> Sb = ((UIBlockList) obj).Sb();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : Sb) {
                    if (((UIBlock) obj3).Cb() == CatalogDataType.DATA_TYPE_GROUPS_INVITES) {
                        arrayList2.add(obj3);
                    }
                }
                return Boolean.valueOf(j5g.M(arrayList2));
            case 25:
                return s3q0.a;
            case 26:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 27:
                x8j x8jVar = (x8j) obj;
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return new rbj(x8jVar.c, x8jVar.a, SortOrder.BY_NAME, x8jVar.d, false, x8jVar.e, 256);
            case 28:
                qgi0.c((tgi0) obj);
                return s3q0.a;
            default:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_change_theme, (Context) obj);
        }
    }

    public /* synthetic */ nt(AudioContentCardVh audioContentCardVh) {
        this.b = 4;
    }
}
