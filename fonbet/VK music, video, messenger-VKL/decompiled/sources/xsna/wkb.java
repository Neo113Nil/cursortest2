package xsna;

import com.vk.api.generated.places.dto.PlacesCategoryDto;
import com.vk.api.generated.places.dto.PlacesPlaceWithDistanceDto;
import com.vk.api.generated.places.dto.PlacesSearchResponseDto;
import com.vk.newsfeed.posting.geo_picker.presentation.model.PickerPlaceDto;
import com.vk.newsfeed.posting.geo_picker.presentation.model.PlacesPage;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wkb implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ wkb(int i, String str) {
        this.d = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                int i = this.d;
                String str = this.c;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE audio_book_chapter SET downloading_state = ? WHERE chapter_id = ?");
                try {
                    V0.bindLong(1, i);
                    V0.D3(2, str);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            default:
                PlacesSearchResponseDto placesSearchResponseDto = (PlacesSearchResponseDto) obj;
                List<PlacesPlaceWithDistanceDto> d = placesSearchResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (PlacesPlaceWithDistanceDto placesPlaceWithDistanceDto : d) {
                    int id = placesPlaceWithDistanceDto.e().getId();
                    String title = placesPlaceWithDistanceDto.e().getTitle();
                    String d2 = placesPlaceWithDistanceDto.e().d();
                    PlacesCategoryDto f = placesPlaceWithDistanceDto.e().f();
                    arrayList.add(new PickerPlaceDto(id, title, d2, f != null ? f.getTitle() : null));
                }
                return new PlacesPage(this.c, arrayList, placesSearchResponseDto.getCount(), this.d);
        }
    }

    public /* synthetic */ wkb(String str, int i) {
        this.c = str;
        this.d = i;
    }
}
