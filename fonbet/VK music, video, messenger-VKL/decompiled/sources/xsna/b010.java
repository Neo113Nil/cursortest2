package xsna;

import android.text.TextPaint;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.configuration.MusicSearchCatalogConfiguration;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.view.components.picture.VkImage;
import com.vk.ecomm.orders.impl.order.presentation.OrderFragment;
import com.vk.libvideo.api.di.VideoApiHelperComponent;
import com.vk.music.bottomsheets.promo.di.MusicBottomSheetComponentImpl;
import com.vk.music.player.MusicPlaybackQueueComponentImpl;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.common.delegates.OnMediaAudioComponentProvider;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.pushes.receivers.NotificationActionsReceiver;
import com.vk.toggle.features.MusicFeatures;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.fu80;
import xsna.go4;
import xsna.lr50;
import xsna.s1c0;
import xsna.tr20;
import xsna.wrk;
import xsna.xn50;
import xsna.z8w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class b010 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b010(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (VkImage) ((c010) obj).findViewById(R.id.iv_info_badge);
            case 1:
                pr20 pr20Var = (pr20) obj;
                tr20.e eVar = tr20.e.b;
                pr20Var.getClass();
                xn50.a.c(pr20Var, eVar);
                return s3q0.a;
            case 2:
                hk30 hk30Var = (hk30) obj;
                TextPaint textPaint = new TextPaint();
                textPaint.setColor(dhr0.t.c(R.attr.vk_ui_text_secondary));
                com.vk.typography.b.c(textPaint, hk30Var.a, FontFamily.REGULAR, Float.valueOf(hk30Var.b.b(R.dimen.vkim_msg_part_empty)), TextSizeUnit.PX);
                return textPaint;
            case 3:
                z8w.a aVar = ((com.vk.im.ui.components.msg_list.a) obj).A.h;
                if (aVar != null) {
                    return aVar.a();
                }
                return null;
            case 4:
                ym30 ym30Var = ((vm30) obj).t0;
                if (ym30Var != null) {
                    ym30Var.C0();
                }
                return s3q0.a;
            case 5:
                return ((ClipsCoauthorsComponent) ((k7m) m7m.f((qu30) obj)).mo408a(fpf0.a(ClipsCoauthorsComponent.class))).Fc();
            case 6:
                kz30 kz30Var = (kz30) obj;
                return new d38(kz30Var.b, kz30Var.f.f().d, kz30Var.e, kz30Var.g);
            case 7:
                return new h5e0(((MusicBottomSheetComponentImpl) obj).a);
            case 8:
                return new ze40(((te40) obj).a);
            case 9:
                String string = ((MusicOfflineCatalogRootVh) obj).h.getString("key_url");
                if (string != null && drm0.D(string, "kids_section", false)) {
                    eqy<bek0> eqyVar = com.vk.toggle.d.a;
                    z = com.vk.toggle.b.A.a(MusicFeatures.AUDIO_NEW_KIDS_DOWNLOADED_SECTION);
                }
                return Boolean.valueOf(z);
            case 10:
                qcy<Object>[] qcyVarArr = MusicPlaybackQueueComponentImpl.f;
                nwy nwyVar = ((MusicPlaybackQueueComponentImpl) obj).c;
                qcy<Object> qcyVar = MusicPlaybackQueueComponentImpl.f[2];
                return new rxa0((yxa0) nwyVar.c());
            case 11:
                zf40 zf40Var = ((MusicSearchCatalogConfiguration) obj).F;
                return Boolean.valueOf(zf40Var != null ? zf40Var.c() : false);
            case 12:
                lr50 lr50Var = (lr50) obj;
                cjx cjxVar = lr50Var.J;
                return new lr50.f(cjxVar != null ? cjxVar : null, lr50Var.R, lr50Var.G);
            case 13:
                ((u1h) obj).invoke();
                return s3q0.a;
            case 14:
                return ((NewsFeedComponent) ((k7m) m7m.f((p860) obj)).a(fpf0.a(NewsFeedComponent.class))).Vb();
            case 15:
                NewsfeedFragment newsfeedFragment = (NewsfeedFragment) obj;
                qcy<Object>[] qcyVarArr2 = NewsfeedFragment.J0;
                s1c0.a aVar2 = new s1c0.a();
                aVar2.b = true;
                aVar2.a = true;
                aVar2.w = true;
                aVar2.q = true;
                sf2 sf2Var = new sf2();
                sf2Var.b = newsfeedFragment.b0.get();
                aVar2.s = sf2Var.a();
                aVar2.r = true;
                aVar2.C = true;
                aVar2.E = ((Boolean) newsfeedFragment.N.getValue()).booleanValue();
                int i2 = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                aVar2.J = false;
                return aVar2.a();
            case 16:
                NotificationActionsReceiver notificationActionsReceiver = (NotificationActionsReceiver) obj;
                int i3 = NotificationActionsReceiver.a;
                wrk.a aVar3 = wrk.a;
                return ((VideoApiHelperComponent) ((k7m) (aVar3 != null ? aVar3 : null).d.a(notificationActionsReceiver)).a(fpf0.a(VideoApiHelperComponent.class))).N4();
            case 17:
                ((rtg0) obj).invoke(Boolean.FALSE);
                return s3q0.a;
            case 18:
                OnMediaAudioComponentProvider onMediaAudioComponentProvider = (OnMediaAudioComponentProvider) obj;
                return new osj0(onMediaAudioComponentProvider.f(), new fck0(new go4.a(2, false), new fu80.a(onMediaAudioComponentProvider.a(), true), 4));
            case 19:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 20:
                return ((NewsFeedComponent) ((k7m) m7m.f((vp80) obj)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 21:
                qcy<Object>[] qcyVarArr3 = OrderFragment.Y;
                return ((BridgeComponent) ((OrderFragment) obj).S.getValue()).O();
            case 22:
                ((wn90) obj).b = null;
                return s3q0.a;
            case 23:
                return PhotoEditorView.c((PhotoEditorView) obj);
            case 24:
                xfb0 xfb0Var = (xfb0) obj;
                return Integer.valueOf(znk0.A(xfb0Var, (SerialDescriptor[]) xfb0Var.j.getValue()));
            case 25:
                return ((xzb0) obj).w;
            case 26:
                return ((y8c0) obj).b;
            case 27:
                return ((PostingFragment) obj).R;
            case 28:
                com.vk.newsfeed.impl.items.posting.item.modals.b bVar = (com.vk.newsfeed.impl.items.posting.item.modals.b) obj;
                bVar.b.d7(null, bVar.a.h);
                return s3q0.a;
            default:
                PostsFromNotificationsFragment postsFromNotificationsFragment = (PostsFromNotificationsFragment) obj;
                qcy<Object>[] qcyVarArr4 = PostsFromNotificationsFragment.p0;
                return postsFromNotificationsFragment;
        }
    }
}
