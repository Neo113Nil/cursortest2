package xsna;

import android.hardware.SensorManager;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.im.reactions.impl.set_reaction.SetReactionViewHolderDelegate;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.stickyplayer.StickyMusicPlayerBottomSheet;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.qrcode.QRTypes$SmsQrAction;
import com.vk.restriction.di.VideoRestrictionManagerComponent;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$VideoEventSource;
import com.vk.superapp.vkpay.checkout.data.model.GooglePay;
import com.vk.video.growth.api.data.VideoGrowthAppStore;
import com.vk.video.growth.api.data.VideoGrowthType;
import com.vk.video.profile.presentation.a;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ejd0;
import xsna.ofe0.f;
import xsna.v6j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class akd0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ akd0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((bkd0) obj).n.invoke(ejd0.b.d.b);
                return s3q0.a;
            case 1:
                gzs<s3q0> gzsVar = ((ctd0) obj).f;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 2:
                com.vk.lists.c cVar = ((ProfileFriendsFragment) obj).b0;
                (cVar != null ? cVar : null).p(false);
                return s3q0.a;
            case 3:
                SensorManager sensorManager = (SensorManager) ((i9e0) obj).c.getValue();
                if (sensorManager != null) {
                    return sensorManager.getDefaultSensor(8);
                }
                return null;
            case 4:
                qcy<Object>[] qcyVarArr = PublishFragment.Q;
                ((PublishFragment) obj).kn().getSupportFragmentManager().f("DescriptionResult.MODAL_RESULT_REQUEST_KEY");
                return s3q0.a;
            case 5:
                return ((ofe0) obj).new f();
            case 6:
                QRTypes$SmsQrAction.a aVar = (QRTypes$SmsQrAction.a) obj;
                ArrayList arrayList = new ArrayList();
                QRTypes$SmsQrAction.b bVar = aVar.a;
                if (bVar != null) {
                    arrayList.add(bVar);
                }
                QRTypes$SmsQrAction.b bVar2 = aVar.b;
                if (bVar2 != null) {
                    arrayList.add(bVar2);
                }
                return arrayList;
            case 7:
                ((k9b) obj).invoke();
                return s3q0.a;
            case 8:
                return ((NarrativeComponent) ((k7m) m7m.f((s8i0) obj)).a(fpf0.a(NarrativeComponent.class))).n4();
            case 9:
                v6j0.c cVar2 = v6j0.p1;
                return ((VideoShareComponent) m7m.d((v6j0) obj).a(fpf0.a(VideoShareComponent.class))).S();
            case 10:
                return ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_apps_list_divider);
            case 11:
                int i2 = StickyMusicPlayerBottomSheet.c0;
                return (PlayerUIComponent) ((k7m) m7m.c((StickyMusicPlayerBottomSheet) obj)).a(fpf0.a(PlayerUIComponent.class));
            case 12:
                n3n0 n3n0Var = (n3n0) obj;
                ez20 ez20Var = n3n0Var.h;
                if (ez20Var != null) {
                    ez20Var.Qc("SuggestStartInterestsDialog");
                }
                n3n0Var.h = null;
                return s3q0.a;
            case 13:
                return (ImageView) ((ViewStub) ((yoo0) obj).itemView.findViewById(R.id.vkim_icon_image_view)).inflate();
            case 14:
                ctp0 ctp0Var = (ctp0) obj;
                ctp0Var.c.b(ctp0Var.a(), MobileOfficialAppsVideoStat$VideoEventSource.SWIPE);
                return s3q0.a;
            case 15:
                return (dw20) ((Ref$ObjectRef) obj).element;
            case 16:
                return (NewsFeedComponent) ((k7m) m7m.f((mxq0) obj)).a(fpf0.a(NewsFeedComponent.class));
            case 17:
                b9s0 b9s0Var = (b9s0) obj;
                return new qca((Map) b9s0Var.n0.getValue(), b9s0Var.D.a.invoke());
            case 18:
                VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) obj;
                int i3 = VideoCatalogRootVh.M0;
                vtk0.d().d(videoCatalogRootVh.R(), videoCatalogRootVh.f0.n);
                return s3q0.a;
            case 19:
                String[] strArr = VideoCommentsTreeInPlayerFragment.c0;
                return new gcg(((VideoMinimizablePlayerComponent) m7m.d((VideoCommentsTreeInPlayerFragment) obj).a(fpf0.a(VideoMinimizablePlayerComponent.class))).b3());
            case 20:
                return ((ros0) obj).a.a(VideoGrowthType.BOTTOM_SHEET);
            case 21:
                ((cys0) obj).b0.invoke(a.p.b);
                return s3q0.a;
            case 22:
                ImageSize Cb = ((Image) obj).Cb(ImageScreenSize.BIG.h(), true, false);
                if (Cb != null) {
                    return Cb.d.d;
                }
                return null;
            case 23:
                uqt0 uqt0Var = (uqt0) obj;
                if (!uqt0Var.h) {
                    uqt0Var.h = true;
                    uqt0Var.a();
                }
                return s3q0.a;
            case 24:
                tau0 tau0Var = (tau0) obj;
                return new w5u0(tau0Var.a, (String) tau0Var.i.getValue(), new stg0(tau0Var, 27));
            case 25:
                return ((VideoRestrictionManagerComponent) ((k7m) m7m.f((com.vk.catalog2.common.ui.mvp.configuration.a) obj)).a(fpf0.a(VideoRestrictionManagerComponent.class))).n2();
            case 26:
                ((gbv0) obj).a(GooglePay.c);
                return s3q0.a;
            case 27:
                ((PopupWindow) obj).dismiss();
                return s3q0.a;
            case 28:
                VkTopBarVh vkTopBarVh = (VkTopBarVh) obj;
                UIBlockList uIBlockList = vkTopBarVh.q;
                if (uIBlockList != null) {
                    vkTopBarVh.d.c(uIBlockList, vkTopBarVh.b());
                }
                return s3q0.a;
            default:
                j0w0 j0w0Var = (j0w0) obj;
                f0w0 f0w0Var = (f0w0) j0w0Var.d.getValue();
                EnumMap<VideoGrowthAppStore, String> enumMap = new EnumMap<>((Class<VideoGrowthAppStore>) VideoGrowthAppStore.class);
                VideoGrowthAppStore videoGrowthAppStore = VideoGrowthAppStore.GOOGLE;
                String str = f0w0Var != null ? f0w0Var.g : null;
                if (str == null) {
                    str = "";
                }
                enumMap.put((EnumMap<VideoGrowthAppStore, String>) videoGrowthAppStore, (VideoGrowthAppStore) str);
                VideoGrowthAppStore videoGrowthAppStore2 = VideoGrowthAppStore.HUAWEI;
                String str2 = f0w0Var != null ? f0w0Var.h : null;
                if (str2 == null) {
                    str2 = "";
                }
                enumMap.put((EnumMap<VideoGrowthAppStore, String>) videoGrowthAppStore2, (VideoGrowthAppStore) str2);
                VideoGrowthAppStore videoGrowthAppStore3 = VideoGrowthAppStore.RUSTORE;
                String str3 = f0w0Var != null ? f0w0Var.i : null;
                if (str3 == null) {
                    str3 = "";
                }
                enumMap.put((EnumMap<VideoGrowthAppStore, String>) videoGrowthAppStore3, (VideoGrowthAppStore) str3);
                VideoGrowthAppStore videoGrowthAppStore4 = VideoGrowthAppStore.SAMSUNG;
                String str4 = f0w0Var != null ? f0w0Var.j : null;
                if (str4 == null) {
                    str4 = "";
                }
                enumMap.put((EnumMap<VideoGrowthAppStore, String>) videoGrowthAppStore4, (VideoGrowthAppStore) str4);
                VideoGrowthAppStore videoGrowthAppStore5 = VideoGrowthAppStore.XIAOMI;
                String str5 = f0w0Var != null ? f0w0Var.k : null;
                if (str5 == null) {
                    str5 = "";
                }
                enumMap.put((EnumMap<VideoGrowthAppStore, String>) videoGrowthAppStore5, (VideoGrowthAppStore) str5);
                zos0 c = j0w0Var.b.c(enumMap);
                VideoGrowthAppStore videoGrowthAppStore6 = c.a;
                String str6 = c.b;
                String str7 = f0w0Var != null ? f0w0Var.c : null;
                String str8 = str7 == null ? "" : str7;
                String str9 = f0w0Var != null ? f0w0Var.d : null;
                String str10 = str9 == null ? "" : str9;
                String str11 = f0w0Var != null ? f0w0Var.e : null;
                String str12 = str11 == null ? "" : str11;
                String str13 = f0w0Var != null ? f0w0Var.f : null;
                return new k0w0(str8, str10, str12, str13 == null ? "" : str13, dy2.i("com.vk.vkvideo"), str6, videoGrowthAppStore6);
        }
    }

    public /* synthetic */ akd0(v1f0 v1f0Var, FrameLayout frameLayout, k9b k9bVar, SetReactionViewHolderDelegate setReactionViewHolderDelegate) {
        this.b = 7;
        this.c = k9bVar;
    }
}
