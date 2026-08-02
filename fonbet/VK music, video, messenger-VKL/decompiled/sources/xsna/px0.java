package xsna;

import android.widget.TextView;
import com.vk.attachpicker.impl.fragment.AchievementsFragment;
import com.vk.auth.main.SignUpRouter;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.a;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.mytarget.di.AdsSdkComponentImpl;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.voip.ui.service.BaseVoipService;
import xsna.j9d0;
import xsna.lbf;
import xsna.mny;
import xsna.zrh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class px0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ px0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((qx0) obj).b.a(AdsItemViewEvent.a.b);
                break;
            case 1:
                nwy nwyVar = ((AdsSdkComponentImpl) obj).a;
                qcy<Object> qcyVar = AdsSdkComponentImpl.e[0];
                break;
            case 2:
                com.vk.catalog2.common.ui.mvp.auto.a aVar = (com.vk.catalog2.common.ui.mvp.auto.a) obj;
                aVar.b.setPlaybackState(com.vk.catalog2.common.ui.mvp.auto.a.e(aVar, null, 0L, false, null, 255));
                break;
            case 3:
                AchievementsFragment.a aVar2 = new AchievementsFragment.a();
                aVar2.j.putLong("peer_id", ((com.vk.attachpicker.impl.a) obj).W);
                break;
            case 4:
                lh9 lh9Var = ((u76) ((j96) obj).e.invoke()).w2().i;
                tam0 tam0Var = lh9Var.b.B0;
                if (tam0Var != null) {
                    vf6 vf6Var = lh9Var.c;
                    mny.a aVar3 = mny.a;
                    break;
                }
                break;
            case 5:
                SignUpRouter signUpRouter = ((com.vk.auth.verification.base.b) obj).n;
                SignUpRouter.a.a(signUpRouter != null ? signUpRouter : null, null, null, null, null, 15);
                break;
            case 6:
                break;
            case 7:
                int i2 = BasePhotoListFragment.l0;
                break;
            case 8:
                cr6 cr6Var = (cr6) obj;
                int i3 = cr6.D;
                TextView textView = (TextView) cr6Var.findViewById(cr6Var.getTitleViewId());
                textView.setImportantForAccessibility(2);
                break;
            case 9:
                boolean z = BaseVoipService.k;
                break;
            case 10:
                int i4 = BonusCatalogFragment.f0;
                ((BonusCatalogFragment) obj).finish();
                break;
            case 11:
                ((z89) obj).e(j9d0.i.a);
                break;
            case 12:
                ChannelFragment channelFragment = (ChannelFragment) obj;
                int i5 = ChannelFragment.a1;
                break;
            case 13:
                break;
            case 14:
                int i6 = ClipFeedListFragment.a2;
                ((ClipFeedListFragment) obj).vo().finish();
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                int i7 = ClipsEntryPointsFragment.i0;
                g620.f().a().i((lpj) obj, fpf0.a(ClipFeedTab.TopVideo.class), null);
                break;
            case 20:
                break;
            case 21:
                int i8 = ClipsPlaylistPickerFragment.V;
                break;
            case 22:
                String str = ClipsUploadFragmentImpl.a0;
                ((hjf) obj).b(lbf.b.g.b);
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                ((CommunitiesSearchTopBarVh) obj).b.invoke(a.e.a);
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                ((zrh) ((zrh.a) obj).m).h.invoke();
                break;
            default:
                mth mthVar = (mth) obj;
                mthVar.c.invoke(new d.j.h1(mthVar.a.a));
                break;
        }
        return s3q0.a;
    }
}
