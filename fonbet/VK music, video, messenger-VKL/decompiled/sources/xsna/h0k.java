package xsna;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.a;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.dto.music.MusicTrack;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoState;
import java.util.ArrayList;
import xsna.fm70;
import xsna.mmh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class h0k implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h0k(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0181, code lost:
    
        if (r6.Qb(r4) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a0, code lost:
    
        if (r6.Qb(r4) == false) goto L65;
     */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        CatalogBadge Qb;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((i0k) obj4).d((bn50) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                t110.c((String) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                nk40 nk40Var = (nk40) obj4;
                MusicTrack musicTrack = (MusicTrack) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                UIBlockBadge Rb = uIBlockList.Rb();
                CatalogBadge catalogBadge = null;
                if (Rb != null && (Qb = Rb.Qb()) != null) {
                    Integer g = cqm0.g(Qb.getText());
                    int intValue = g != null ? g.intValue() - 1 : 0;
                    if (intValue > 0) {
                        catalogBadge = new CatalogBadge(String.valueOf(intValue), Qb.getType());
                    }
                }
                ArrayList<UIBlock> Sb = uIBlockList.Sb();
                nk40Var.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : Sb) {
                    UIBlock uIBlock = (UIBlock) obj5;
                    if (uIBlock instanceof UIBlockMusicTrack) {
                        UIBlockMusicTrack uIBlockMusicTrack = (UIBlockMusicTrack) uIBlock;
                        if (!epx.f(uIBlockMusicTrack.Rb().Fb(), musicTrack.Fb())) {
                            break;
                        }
                        z = true;
                    } else {
                        if (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryTrack) {
                            UIBlockSearchHistory.UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack = (UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlock;
                            if (!epx.f(uIBlockSearchHistoryTrack.Rb().Fb(), musicTrack.Fb())) {
                                break;
                            }
                            z = true;
                        }
                        z = false;
                    }
                    if (!z) {
                        arrayList.add(obj5);
                    }
                }
                UIBlockList uIBlockList2 = new UIBlockList(uIBlockList, arrayList);
                UIBlockBadge Rb2 = uIBlockList2.Rb();
                if (Rb2 != null) {
                    Rb2.Rb(catalogBadge);
                    break;
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((fm70) obj4).B((fm70.a.b) obj3, (androidx.compose.runtime.a) obj, ne7.I(65));
                break;
            case 4:
                PodcastEpisodeFragment podcastEpisodeFragment = (PodcastEpisodeFragment) obj4;
                FragmentActivity fragmentActivity = (FragmentActivity) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i2 = PodcastEpisodeFragment.u0;
                if (aVar.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1949974872, intValue2, -1, "com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment.onLoadFailed.<anonymous>.<anonymous> (PodcastEpisodeFragment.kt:289)");
                    }
                    KidsModeRestrictionRenderer.Source source = KidsModeRestrictionRenderer.Source.ADULT_CONTENT;
                    boolean y = aVar.y(podcastEpisodeFragment) | aVar.y(fragmentActivity);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new com.vk.movika.sdk.base.logic.interactor.c(22, podcastEpisodeFragment, fragmentActivity);
                        aVar.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean y2 = aVar.y(podcastEpisodeFragment);
                    Object x2 = aVar.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new acd(podcastEpisodeFragment);
                        aVar.R(x2);
                    }
                    KidsModeRestrictionRenderer.b.a(source, gzsVar, (gzs) ((fcy) x2), (KidsModeRestrictionRenderer) podcastEpisodeFragment.p0.getValue(), aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                fmh0.a((mmh0.c) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((bdn0) obj4).l6((jdj0) obj3, (androidx.compose.runtime.a) obj, ne7.I(9));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((ddo0) obj4).a((Drawable) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 8:
                ((Integer) obj2).getClass();
                com.vk.profile.design.view.profileheader.b.p((UserProfileBaseInfoState.VerifyInfo) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.video.videocell.a.c((VideoCellViewState.b) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ h0k(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
