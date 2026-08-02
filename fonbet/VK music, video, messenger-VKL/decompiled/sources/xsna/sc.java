package xsna;

import android.media.ExifInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.ads.dto.AdsRetargetingHitDto;
import com.vk.api.generated.friends.dto.FriendsGetFriendsDeletionSuggestionsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.attachpicker.impl.fragment.video.VideoData;
import com.vk.dto.common.VideoAlbum;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import com.vk.superapp.core.api.models.VkGender;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c8x0;
import xsna.kve;
import xsna.nkq;
import xsna.tlo0;
import xsna.vre;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class sc implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ sc(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int intValue;
        char c = 1;
        VideoFile videoFile = null;
        Object[] objArr = 0;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((View) obj) instanceof RecyclerView);
            case 1:
                return Boolean.valueOf(((AdditionalSettingsState.Data) obj).m);
            case 2:
                VKList vKList = (VKList) obj;
                int i = AttachVideoFragment.F0;
                ArrayList arrayList = new ArrayList(c5g.u(vKList, 10));
                Iterator<T> it = vKList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new VideoData(videoFile, ((VideoAlbum) it.next()).d(), c == true ? 1 : 0, objArr == true ? 1 : 0));
                }
                return new VkPaginationList(arrayList, 0, false, 0, 14, null);
            case 3:
                L.i((Throwable) obj);
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((c8x0) obj) instanceof c8x0.d);
            case 5:
                return s3q0.a;
            case 6:
                zk70.e((Throwable) obj);
                return s3q0.a;
            case 7:
                qgi0.r((tgi0) obj, "checkout_form_field_caption");
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((ike) obj).d);
            case 9:
                int i2 = gne.j1;
                qgi0.r((tgi0) obj, "clips_not_interested_modal_card_subtitle_tag");
                return s3q0.a;
            case 10:
                Integer num = ((vre.b) obj).i;
                int intValue2 = num != null ? num.intValue() : 0;
                tlo0.a aVar = tlo0.Companion;
                Object[] objArr2 = {xpm0.a(intValue2)};
                aVar.getClass();
                return tlo0.a.a(R.plurals.clips_playlist_ui_clips, intValue2, objArr2);
            case 11:
                return kve.a.c.a;
            case 12:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).c);
            case 13:
                return (ExtendedCommunityProfile) ((ptk) obj).a;
            case 14:
                qgi0.r((tgi0) obj, "priority_block_ads_promotion_text_content");
                return s3q0.a;
            case 15:
                return s3q0.a;
            case 16:
                return new oco0(R.layout.vk_text_components_view_holder, (ViewGroup) obj);
            case 17:
                nvy.c((nvy) obj, 40, null, vhi.b, 6);
                return s3q0.a;
            case 18:
                return Integer.valueOf(com.vk.im.ui.components.contacts.b.j((qtd0) obj));
            case 19:
                qgi0.r((tgi0) obj, "successDescription");
                return s3q0.a;
            case 20:
                return s3q0.a;
            case 21:
                xgl0 xgl0Var = (xgl0) obj;
                frn0 system = xgl0Var.system();
                com.vk.im.engine.internal.storage.delegates.dialogs.b a = xgl0Var.b().a();
                hpm e = xgl0Var.b().e();
                DialogsCounters.Type type = DialogsCounters.Type.REQUESTS;
                com.vk.im.engine.models.dialogs.d b = a.b(type);
                if (b == null) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"CycleRefresh", "loadRequestsByCache: Type $" + type + " is missed in cache"});
                    }
                    return new xpp(null, true);
                }
                int d = system.d();
                List l2 = e43.l(MsgRequestStatus.ACCEPTED, MsgRequestStatus.REJECTED);
                e.getClass();
                if (l2.isEmpty()) {
                    intValue = 0;
                } else {
                    List list = l2;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Integer.valueOf(((MsgRequestStatus) it2.next()).j()));
                    }
                    intValue = fl3.J(e.b.b().d(air.b(')', "SELECT COUNT(1) FROM dialogs WHERE msg_request_status_pending IN (", j5g.g0(arrayList2, StringUtils.COMMA, null, null, 0, null, 62)), null)).intValue();
                }
                return new xpp(Integer.valueOf(b.b - intValue), b.c != d);
            case 22:
                return VkGender.UNDEFINED;
            case 23:
                return ((ExifInterface) obj).getAttribute("DateTime");
            case 24:
                return (nkq.a) obj;
            case 25:
                return s3q0.a;
            case 26:
                FriendsGetFriendsDeletionSuggestionsResponseDto friendsGetFriendsDeletionSuggestionsResponseDto = (FriendsGetFriendsDeletionSuggestionsResponseDto) obj;
                int count = friendsGetFriendsDeletionSuggestionsResponseDto.e().getCount();
                List<UsersUserFullDto> d2 = friendsGetFriendsDeletionSuggestionsResponseDto.e().d();
                List<UsersUserFullDto> d3 = friendsGetFriendsDeletionSuggestionsResponseDto.d();
                if (d3 == null) {
                    d3 = EmptyList.b;
                }
                return new hns(count, friendsGetFriendsDeletionSuggestionsResponseDto.f(), d2, d3);
            case 27:
                return Boolean.valueOf(epx.f(((AdsRetargetingHitDto) obj).d(), Boolean.TRUE));
            default:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.f);
        }
    }

    public /* synthetic */ sc(Object obj, int i) {
        this.b = i;
    }
}
