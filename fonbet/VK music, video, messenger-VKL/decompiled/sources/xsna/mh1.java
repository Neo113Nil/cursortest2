package xsna;

import com.vk.dto.articles.Article;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastPage;
import com.vk.dto.stickers.bonus.StickerStockItemDiscount;
import com.vk.dto.stickers.bonus.StickerStockItemDiscounts;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.mk7;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mh1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mh1(com.vk.lists.c cVar, boolean z, mk7 mk7Var) {
        this.b = 1;
        this.c = cVar;
        this.d = z;
        this.e = mk7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        PodcastPage podcastPage;
        ArrayList<MusicTrack> arrayList;
        switch (this.b) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) this.c;
                oh1 oh1Var = (oh1) this.e;
                VKList vKList = (VKList) obj;
                cVar.s(vKList.j());
                String j = vKList.j();
                cVar.r((j == null || j.length() == 0 || epx.f(vKList.j(), "0")) ? false : true);
                xn50.a.c(oh1Var.e, new a.q(vKList, this.d));
                break;
            case 1:
                com.vk.lists.c cVar2 = (com.vk.lists.c) this.c;
                mk7.a aVar = ((mk7) this.e).o;
                StickerStockItemDiscounts stickerStockItemDiscounts = (StickerStockItemDiscounts) obj;
                String str = stickerStockItemDiscounts.c;
                List<StickerStockItemDiscount> list = stickerStockItemDiscounts.b;
                cVar2.s(str);
                if (this.d) {
                    aVar.J0(list);
                } else {
                    aVar.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(aVar.h);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new lk7((StickerStockItemDiscount) it.next(), false));
                    }
                    aVar.setItems(arrayList2);
                }
                break;
            case 2:
                com.vk.music.podcast.impl.ui.episode.b bVar = (com.vk.music.podcast.impl.ui.episode.b) this.e;
                com.vk.lists.c cVar3 = (com.vk.lists.c) this.c;
                VKList vKList2 = (VKList) obj;
                if (!this.d && (podcastPage = bVar.e) != null && (arrayList = podcastPage.c) != null) {
                    arrayList.addAll(vKList2);
                }
                PodcastEpisodeFragment podcastEpisodeFragment = bVar.b;
                ((zkb0) podcastEpisodeFragment.r0.getValue()).n0(vKList2);
                podcastEpisodeFragment.s0.addAll(vKList2);
                cVar3.q(cVar3.k() + cVar3.i());
                cVar3.r(vKList2.size() == 30);
                break;
            default:
                tmq0 tmq0Var = (tmq0) this.c;
                fq3 fq3Var = (fq3) this.e;
                VKList vKList3 = (VKList) ((it80) obj).a;
                if (vKList3 == null) {
                    vKList3 = new VKList();
                }
                boolean z = this.d;
                if (z && vKList3.isEmpty()) {
                    wmq0.B(tmq0Var, fq3Var, CommunityProfileContentItem.State.EMPTY, null, 4);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    List<Article> list2 = fq3Var.j;
                    if (list2 != null) {
                        arrayList3.addAll(list2);
                    }
                    arrayList3.addAll(vKList3);
                    fq3 i = fq3.i(fq3Var, arrayList3, myc0.f(vKList3.j()) && !vKList3.isEmpty(), vKList3.j(), z ? CommunityProfileContentItem.State.LOADED : fq3Var.o, z ? fq3Var.p : CommunityProfileContentItem.State.LOADED, 1844);
                    izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = tmq0Var.h;
                    (izsVar != null ? izsVar : null).invoke(new b.c(i));
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ mh1(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.c = obj;
        this.e = obj2;
        this.d = z;
    }

    public /* synthetic */ mh1(boolean z, com.vk.music.podcast.impl.ui.episode.b bVar, com.vk.lists.c cVar) {
        this.b = 2;
        this.d = z;
        this.e = bVar;
        this.c = cVar;
    }
}
