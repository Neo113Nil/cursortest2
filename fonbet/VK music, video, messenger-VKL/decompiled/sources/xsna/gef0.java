package xsna;

import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.newsfeed.common.presentation.model.items.RecommendationsCarouselItemUiDto;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RecommendedPlaylistExtendedHolder.kt */
/* loaded from: classes4.dex */
public final class gef0 extends vif0<Playlist> {
    public final def0 n;
    public final gtl0 o;
    public final f550 p;
    public final wzb0 q;

    public gef0(def0 def0Var, gtl0 gtl0Var) {
        super(gtl0Var.itemView, gtl0Var.l);
        this.n = def0Var;
        this.o = gtl0Var;
        this.p = new f550(this, 21);
        this.q = new wzb0(this, 7);
    }

    @Override // xsna.vif0
    public final void i6(Playlist playlist) {
        RecommendationsCarouselItemUiDto.b bVar;
        Playlist playlist2 = playlist;
        Context context = this.itemView.getContext();
        def0 def0Var = this.n;
        def0Var.getClass();
        String str = playlist2.h;
        if (str == null) {
            str = "";
        }
        RecommendationsCarouselItemUiDto.c cVar = new RecommendationsCarouselItemUiDto.c(str, null, null, 30);
        String str2 = playlist2.i;
        if (str2 == null) {
            str2 = "";
        }
        Thumb thumb = playlist2.m;
        if (thumb != null) {
            SparseArray<Uri> sparseArray = thumb.e;
            u4q0 u4q0Var = zik0.a;
            List Q0 = j5g.Q0(new yik0(sparseArray));
            ArrayList arrayList = new ArrayList(c5g.u(Q0, 10));
            int i = 0;
            for (Object obj : Q0) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                arrayList.add(new ImageSize(((Uri) obj).toString(), i, i, null, (char) 0, false, 56, null));
                i = i2;
            }
            bVar = new RecommendationsCarouselItemUiDto.b(new Image(arrayList), null);
        } else {
            bVar = null;
        }
        String Ib = playlist2.Ib();
        u2b0 u2b0Var = def0Var.a;
        RecommendationsCarouselItemUiDto recommendationsCarouselItemUiDto = new RecommendationsCarouselItemUiDto(cVar, str2, bVar, null, new RecommendationsCarouselItemUiDto.ActionButtonData(context.getString(R.string.music_playlist_carousel_play), null, Integer.valueOf((u2b0Var.m0().h() && epx.f(Ib, u2b0Var.x0().Kb())) ? R.drawable.vk_icon_pause_16 : R.drawable.vk_icon_play_16), RecommendationsCarouselItemUiDto.ActionButtonData.ActionState.NONE, 2));
        f550 f550Var = this.p;
        gtl0 gtl0Var = this.o;
        gtl0Var.q6(f550Var);
        gtl0Var.s6(this.q);
        gtl0Var.V5(recommendationsCarouselItemUiDto);
    }
}
