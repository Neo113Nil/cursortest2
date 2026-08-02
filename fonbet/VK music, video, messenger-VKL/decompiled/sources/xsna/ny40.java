package xsna;

import com.vk.api.generated.artist.dto.ArtistGetArtistPromoPromoTypesDto;
import com.vk.api.generated.artist.dto.ArtistGetArtistPromoResponseDto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: MusicPlayerRepository.kt */
/* loaded from: classes3.dex */
public final class ny40 {
    public final ix4 a;
    public final ne7 b;
    public Pair<lt3, ? extends io.reactivex.rxjava3.core.q<ArtistGetArtistPromoResponseDto>> c;

    public ny40() {
        this(0);
    }

    public static io.reactivex.rxjava3.core.q a(ny40 ny40Var, lt3 lt3Var, int i) {
        List singletonList = Collections.singletonList(ArtistGetArtistPromoPromoTypesDto.CONCERT);
        boolean z = (i & 4) != 0;
        Pair<lt3, ? extends io.reactivex.rxjava3.core.q<ArtistGetArtistPromoResponseDto>> pair = ny40Var.c;
        if (pair != null && epx.f(pair.i(), lt3Var)) {
            return pair.j();
        }
        ne7 ne7Var = ny40Var.b;
        ArrayList arrayList = lt3Var.a;
        List<String> list = lt3Var.b;
        ne7Var.getClass();
        tfx tfxVar = new tfx("artist.getArtistPromo", new yq(2), new io.reactivex.rxjava3.internal.operators.mixed.j(3));
        List list2 = singletonList;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ArtistGetArtistPromoPromoTypesDto) it.next()).i());
        }
        tfxVar.i("promo_types", arrayList2);
        tfxVar.j("with_relevant", z);
        tfxVar.i("main_artists", arrayList);
        if (list != null) {
            tfxVar.i("featured_artists", list);
        }
        io.reactivex.rxjava3.internal.operators.observable.k e = rsg0.y0(yfb.x(tfxVar), null, null, 3).e();
        ny40Var.c = new Pair<>(lt3Var, e);
        return e;
    }

    public ny40(int i) {
        ix4 ix4Var = new ix4();
        ne7 ne7Var = new ne7();
        this.a = ix4Var;
        this.b = ne7Var;
    }
}
