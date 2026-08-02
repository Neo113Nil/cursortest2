package xsna;

import android.view.View;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorCellVh;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.ShowcaseVideoAutoPlayViewHolder;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.market.order.CancellationInfo;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import xsna.nqd0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qsd0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qsd0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        yvj initialize$lambda$220$lambda$6;
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(new nqd0.a(((usd0) this.d).c));
                break;
            case 1:
                View view = (View) this.d;
                izs izsVar = (izs) this.c;
                cl40.a(view, MusicHapticEvent.RIGID);
                izsVar.invoke(new sx40.o0(PlayerContext.FULL));
                break;
            case 2:
                SearchAuthorCellVh searchAuthorCellVh = (SearchAuthorCellVh) this.c;
                VkCell vkCell = (VkCell) this.d;
                UIBlockSearchAuthor uIBlockSearchAuthor = searchAuthorCellVh.h;
                if (uIBlockSearchAuthor != null) {
                    searchAuthorCellVh.k.d(vkCell.getContext(), uIBlockSearchAuthor, true);
                }
                break;
            case 3:
                initialize$lambda$220$lambda$6 = ServiceProvider.initialize$lambda$220$lambda$6((UnityAdsModule) this.c, (ServicesRegistry) this.d);
                break;
            case 4:
                ShowcaseVideoAutoPlayViewHolder showcaseVideoAutoPlayViewHolder = (ShowcaseVideoAutoPlayViewHolder) this.c;
                VideoFile videoFile = (VideoFile) this.d;
                VKImageView vKImageView = showcaseVideoAutoPlayViewHolder.u;
                if (vKImageView == null) {
                    vKImageView = null;
                }
                ImageSize Cb = videoFile.getImage().Cb(ImageScreenSize.BIG.h(), true, false);
                vKImageView.s0(Cb != null ? Cb.d.d : null);
                break;
            case 5:
                ezp0 ezp0Var = (ezp0) this.c;
                ezp0Var.a.a.b().l(ezp0Var.c.f, ((CancellationInfo) this.d).b, LaunchContext.A, null, null);
                break;
            case 6:
                ((sct0) this.c).b.rebindParticipantView((ConversationParticipant) this.d);
                break;
            default:
                ((z3u0) this.c).n.invoke((StoryUserViewer) ((wh50) this.d).getValue());
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qsd0(View view, izs izsVar) {
        this.b = 1;
        this.d = view;
        this.c = izsVar;
    }
}
