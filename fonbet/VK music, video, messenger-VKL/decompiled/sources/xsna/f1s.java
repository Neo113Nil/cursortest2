package xsna;

import android.widget.ImageView;
import com.vk.api.generated.places.dto.PlacesCategoryDto;
import com.vk.api.generated.places.dto.PlacesPlaceWithDistanceDto;
import com.vk.api.generated.places.dto.PlacesSearchResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.wall.dto.WallGetSubscriptionsResponseDto;
import com.vk.auth.modal.qrwithcode.c;
import com.vk.clips.design.view.QRSharingView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.Attachment;
import com.vk.log.L;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import com.vk.voip.dto.call_member.CallMember;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.FwdMessagesAttachment;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.bfz;
import xsna.dd9;
import xsna.hd20;
import xsna.it80;
import xsna.pdg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class f1s implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ f1s(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 1:
                return ((JSONObject) obj).getJSONArray("response");
            case 2:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.p);
            case 3:
                return new pdg0.b(obj);
            case 4:
                return jgp.b;
            case 5:
                return Integer.valueOf(((Boolean) obj).booleanValue() ? R.string.music_kids_talkback_player_remove_track_from_favorite : R.string.music_kids_talkback_player_add_track_to_favorite);
            case 6:
                return new bfz.a.C2608a((l7p) obj);
            case 7:
                qgi0.r((tgi0) obj, "geo_picker_search_input");
                return s3q0.a;
            case 8:
                return hd20.b.a;
            case 9:
                CallMember callMember = ((kiu) obj).a;
                return new zp20(callMember.f, po20.d(callMember.r));
            case 10:
                return kz30.b0((FwdMessagesAttachment) ((Attachment) obj));
            case 11:
                L.i((Throwable) obj);
                return s3q0.a;
            case 12:
                VkImage vkImage = (VkImage) obj;
                vkImage.setScaleType(ImageView.ScaleType.CENTER);
                vkImage.setCornerRadius(cn70.b(6));
                return s3q0.a;
            case 13:
                qgi0.r((tgi0) obj, "MusicPickerToolbarBackButton");
                return s3q0.a;
            case 14:
                return Integer.valueOf(((WallGetSubscriptionsResponseDto) obj).getCount());
            case 15:
                String r2 = ((UsersUserFullDto) j5g.Y((List) obj)).r2();
                return r2 == null ? "" : r2;
            case 16:
                PlacesSearchResponseDto placesSearchResponseDto = (PlacesSearchResponseDto) obj;
                List<PlacesPlaceWithDistanceDto> d = placesSearchResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (PlacesPlaceWithDistanceDto placesPlaceWithDistanceDto : d) {
                    int id = placesPlaceWithDistanceDto.e().getId();
                    String title = placesPlaceWithDistanceDto.e().getTitle();
                    String d2 = placesPlaceWithDistanceDto.e().d();
                    PlacesCategoryDto f = placesPlaceWithDistanceDto.e().f();
                    arrayList.add(new PostingPlaceDto(id, title, d2, f != null ? f.getTitle() : null));
                }
                return new Pair(arrayList, Integer.valueOf(placesSearchResponseDto.getCount()));
            case 17:
                ((Integer) obj).getClass();
                return 1;
            case 18:
                return Float.valueOf(((l3b0) obj).f);
            case 19:
                qgi0.r((tgi0) obj, "pollEditorCloseButton");
                return s3q0.a;
            case 20:
                L.i((Throwable) obj);
                return s3q0.a;
            case 21:
                qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
                qgi0.r((tgi0) obj, "toolbar_back_tag");
                return s3q0.a;
            case 22:
                return String.valueOf(((Set) obj).size());
            case 23:
                int i = QRSharingView.g;
                ((List) obj).toString();
                return s3q0.a;
            case 24:
                return Boolean.valueOf(!(((com.vk.auth.modal.qrwithcode.c) obj) instanceof c.C0407c));
            case 25:
                return Boolean.FALSE;
            case 26:
                return Boolean.valueOf(((dd9.a) obj) instanceof dd9.a.g);
            case 27:
                qgi0.r((tgi0) obj, "search_database_item_check");
                return s3q0.a;
            case 28:
                qgi0.r((tgi0) obj, "TEST_TAG_TITLE");
                return s3q0.a;
            default:
                it80.b.getClass();
                return it80.a.a();
        }
    }

    public /* synthetic */ f1s(Object obj, int i) {
        this.b = i;
    }
}
