package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.masks.dto.MasksEffectDto;
import com.vk.api.generated.masks.dto.MasksMaskDto;
import com.vk.api.generated.places.dto.PlacesPlaceDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAudioDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoCompilationInfoDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoRecomFeedItemDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.sdk.shared.api.recom.ShortVideoMyTargetMapperTracker;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ClipsRecomFeedItemsToSdkMapper.kt */
/* loaded from: classes17.dex */
public interface g0f {

    /* compiled from: ClipsRecomFeedItemsToSdkMapper.kt */
    public static final class a {
        public final ArrayList a;
        public final eqe0 b;
        public final wrr c;

        public a(ArrayList arrayList, eqe0 eqe0Var, wrr wrrVar) {
            this.a = arrayList;
            this.b = eqe0Var;
            this.c = wrrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            eqe0 eqe0Var = this.b;
            int hashCode2 = (hashCode + (eqe0Var == null ? 0 : eqe0Var.a.hashCode())) * 31;
            wrr wrrVar = this.c;
            return hashCode2 + (wrrVar != null ? wrrVar.hashCode() : 0);
        }

        public final String toString() {
            return "Result(feedItems=" + this.a + ", questionnaires=" + this.b + ", floatingButton=" + this.c + ')';
        }
    }

    a a(List<? extends ShortVideoRecomFeedItemDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<ShortVideoAudioDto> list4, List<MasksEffectDto> list5, List<MasksMaskDto> list6, List<MarketMarketItemDto> list7, List<ShortVideoCompilationInfoDto> list8, List<PlacesPlaceDto> list9, ShortVideoMyTargetMapperTracker shortVideoMyTargetMapperTracker);
}
