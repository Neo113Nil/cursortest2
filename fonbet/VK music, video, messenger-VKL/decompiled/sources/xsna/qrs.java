package xsna;

import com.vk.api.generated.friends.dto.FriendsRecBlockInfoCardDto;
import com.vk.api.generated.friends.dto.FriendsRecBlockInfoCardTemplateDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FriendsRecBlockInfoCardDtoToInfoCardMapper.kt */
/* loaded from: classes3.dex */
public final class qrs {
    public static ProfilesRecommendations.InfoCard a(FriendsRecBlockInfoCardDto friendsRecBlockInfoCardDto) {
        ProfilesRecommendations.InfoCard.Template template;
        ProfilesRecommendations.InfoCard.Template template2;
        FriendsRecBlockInfoCardTemplateDto k = friendsRecBlockInfoCardDto.k();
        ArrayList arrayList = null;
        if (k != null) {
            int i = rrs.$EnumSwitchMapping$0[k.ordinal()];
            if (i == 1) {
                template2 = ProfilesRecommendations.InfoCard.Template.IMPORT_PHOTOS;
            } else if (i == 2) {
                template2 = ProfilesRecommendations.InfoCard.Template.DEFAULT;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                template2 = ProfilesRecommendations.InfoCard.Template.IMPORT;
            }
            template = template2;
        } else {
            template = null;
        }
        Integer i2 = friendsRecBlockInfoCardDto.i();
        int intValue = i2 != null ? i2.intValue() : -1;
        String title = friendsRecBlockInfoCardDto.getTitle();
        String j = friendsRecBlockInfoCardDto.j();
        List<String> e = friendsRecBlockInfoCardDto.e();
        String[] strArr = e != null ? (String[]) e.toArray(new String[0]) : null;
        String d = friendsRecBlockInfoCardDto.d();
        List<PhotosPhotoSizesDto> g = friendsRecBlockInfoCardDto.g();
        if (g != null) {
            List<PhotosPhotoSizesDto> list = g;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new vfa0().a((PhotosPhotoSizesDto) it.next()));
            }
        }
        ArrayList arrayList2 = arrayList;
        Integer f = friendsRecBlockInfoCardDto.f();
        int intValue2 = f != null ? f.intValue() : 0;
        String r = friendsRecBlockInfoCardDto.r();
        bpn0 bpn0Var = cqm0.a;
        if (r == null) {
            r = "";
        }
        return new ProfilesRecommendations.InfoCard(template, intValue, title, j, strArr, d, null, arrayList2, intValue2, null, r);
    }
}
