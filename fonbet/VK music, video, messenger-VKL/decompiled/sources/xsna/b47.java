package xsna;

import android.os.Bundle;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.feature.news.model.UIBlockFeed;
import com.vk.channels.api.Channel;
import com.vk.clips.sdk.shared.item.ads.AdsItemPatch;
import com.vk.dto.common.Attachment;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchChannelsCatalogRootVh;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.storycamera.picker.ui.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.player.OneVideoPlayer;
import xsna.cri;
import xsna.dt1;
import xsna.mq50;
import xsna.pb60;
import xsna.q630;
import xsna.wk50;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class b47 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b47(Attachment attachment, pb60.a aVar) {
        this.b = 7;
        this.c = attachment;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Iterable singletonList;
        switch (this.b) {
            case 0:
                ((wk50.a) this.c).b(new AdsItemPatch.a.C0646a((cut0) obj, (cut0) obj2));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((v0r) this.c).e(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                q7r q7rVar = (q7r) this.c;
                OneVideoPlayer.State state = (OneVideoPlayer.State) obj;
                OneVideoPlayer.State state2 = (OneVideoPlayer.State) obj2;
                mkm0 mkm0Var = q7rVar.i0;
                if (mkm0Var.getCurrentStory() != null && mkm0Var.getCurrentStory().Rb()) {
                    mq50 mq50Var = q7rVar.t0;
                    mq50.a aVar = mq50Var.b;
                    cjx cjxVar = mq50Var.a;
                    if (cjxVar != null) {
                        if (state == OneVideoPlayer.State.BUFFERING && state2 == OneVideoPlayer.State.PLAYING) {
                            cjxVar.s(aVar);
                        } else if (state2 == OneVideoPlayer.State.PLAYING) {
                            cjxVar.s(aVar);
                            cjxVar.k();
                        } else if (state2 == OneVideoPlayer.State.PAUSED) {
                            cjxVar.l();
                            cjxVar.a();
                        } else if (state2 == OneVideoPlayer.State.ENDED) {
                            cjxVar.g();
                            cjxVar.a();
                        }
                    }
                }
                return s3q0.a;
            case 3:
                ((GlobalSearchChannelsCatalogRootVh) this.c).m.b.f.a(new j3a(((Long) obj).longValue(), ((Channel) obj2).o));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((lqv) this.c).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((tl20) this.c).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                ub50 ub50Var = (ub50) this.c;
                ((Integer) obj).intValue();
                MusicTrack musicTrack = (MusicTrack) obj2;
                u2b0 u2b0Var = ub50Var.m;
                return Boolean.valueOf(musicTrack.equals(u2b0Var != null ? u2b0Var.b() : null));
            case 7:
                Attachment attachment = (Attachment) this.c;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                ArrayList arrayList2 = new ArrayList();
                for (UIBlock uIBlock : arrayList) {
                    if (uIBlock.e.i()) {
                        UIBlockFeed uIBlockFeed = (UIBlockFeed) uIBlock;
                        u1c0 u1c0Var = uIBlockFeed.y;
                        NewsEntry newsEntry = u1c0Var.a;
                        boolean z = newsEntry instanceof Post;
                        boolean z2 = false;
                        boolean z3 = z && ((Post) newsEntry).M6(attachment);
                        Post post = z ? (Post) newsEntry : null;
                        Post post2 = post != null ? post.D : null;
                        if (post2 != null && post2.Eb(attachment)) {
                            z2 = true;
                        }
                        if (z3 || z2) {
                            if (z3) {
                                ((Post) newsEntry).Kb(attachment);
                            } else if (post2 != null) {
                                post2.Kb(attachment);
                            }
                            singletonList = ((u1c0Var instanceof r74) && epx.f(((r74) u1c0Var).q, attachment)) ? EmptyList.b : Collections.singletonList(uIBlockFeed);
                        } else {
                            singletonList = Collections.singletonList(uIBlock);
                        }
                    } else {
                        singletonList = Collections.singletonList(uIBlock);
                    }
                    g5g.y(singletonList, arrayList2);
                }
                return new UIBlockList(uIBlockList, arrayList2);
            case 8:
                StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) this.c;
                xn50.a.c(storyMediaPickerFragment, new a.d((MediaStoreEntry) obj, storyMediaPickerFragment.c0.getCurrentList(), storyMediaPickerFragment.ho(), (Bundle) obj2));
                return s3q0.a;
            case 9:
                xqq0 xqq0Var = (xqq0) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1026265747, intValue, -1, "com.vk.profile.user.impl.ui.adapter.holders.lego.UserProfileLegoCustomBadgeViewHolder.Content.<anonymous> (UserProfileLegoCustomBadgeViewHolder.kt:39)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 m = hr80.m(q630.a.a, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, m);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar3);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    aVar2.K(1564380550);
                    Iterator it = ((List) ((zak0) xqq0Var.o).getValue()).iterator();
                    while (it.hasNext()) {
                        xqq0Var.s6((UserProfileAdapterItem.j.b.a) it.next(), aVar2, 0);
                    }
                    if (gp.d(aVar2)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                ftq0.a((a280) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                ((ihs0) this.c).eo(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 12:
                ((Integer) obj2).getClass();
                x8u0.h((b78) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                return vox0.B((vox0) this.c, (androidx.compose.runtime.a) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ b47(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ b47(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }

    public /* synthetic */ b47(xqq0 xqq0Var) {
        this.b = 9;
        this.c = xqq0Var;
    }
}
