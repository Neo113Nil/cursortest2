package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.unity3d.ads.core.domain.GetInitializationData;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.ads.yandex.impl.YandexAdFeatureImpl;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchInCommunityCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoAlbumVh;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.music.fragment.impl.MusicOfflineCatalogFragment;
import com.vk.newsfeed.impl.fragments.VideoBottomSheetTreeCommentsFragment;
import com.vk.newsfeed.impl.fragments.VideoPostViewFragment;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.posting.di.PostingComponent;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.jew0;
import xsna.s1c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pvh0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pvh0(Context context, VkImAvatar vkImAvatar) {
        this.b = 21;
        this.c = vkImAvatar;
    }

    /* JADX INFO: Infinite loop detected, blocks: 3, insns: 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v57, types: [T, xsna.bqu0] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        GetInitializationData initialize$lambda$220$lambda$100;
        int i = this.b;
        int i2 = 10;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((SearchInCommunityCatalogRootVh) obj).E.getClass();
                Object obj2 = EmptyList.b;
                if (obj2 != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : obj2) {
                        if (obj3 instanceof UIBlockVideo) {
                            arrayList.add(obj3);
                        }
                    }
                    obj2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        obj2.add(((UIBlockVideo) it.next()).B);
                    }
                }
                return obj2;
            case 1:
                initialize$lambda$220$lambda$100 = ServiceProvider.initialize$lambda$220$lambda$100((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$100;
            case 2:
                return (ViewGroup) ((com.vk.sharing.core.view.f) obj).findViewById(R.id.layout_sharing_footer_actions_container);
            case 3:
                return ((BridgeComponent) ((k7m) m7m.c((jfl0) obj)).a(fpf0.a(BridgeComponent.class))).Le().w();
            case 4:
                ((dv0) obj).run();
                return s3q0.a;
            case 5:
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                s1c0.a aVar = new s1c0.a();
                aVar.b = true;
                sf2 sf2Var = new sf2();
                sf2Var.b = ((SuggestedPostsFragment) obj).i0.get();
                aVar.s = sf2Var.a();
                aVar.D = true;
                return aVar.a();
            case 6:
                return Integer.valueOf(((SuperAppFragment) obj).g0);
            case 7:
                zan0 zan0Var = (zan0) obj;
                while (true) {
                    zan0Var.c("releasePreviousConnections", new rme0(zan0Var, i2));
                }
            case 8:
                com.vk.auth.main.b bVar = ((aln0) obj).d;
                if (bVar != null) {
                    return bVar;
                }
                return null;
            case 9:
                return Boolean.valueOf(((vak0) ((xgo0) obj).a).getFloatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 10:
                Boolean bool = (Boolean) ((ToolbarRedesignVh) obj).q.getValue();
                bool.getClass();
                return bool;
            case 11:
                new MusicOfflineCatalogFragment.a().k((AppCompatActivity) obj);
                return s3q0.a;
            case 12:
                com.vk.clips.design.view.component.video.preview.b bVar2 = (com.vk.clips.design.view.component.video.preview.b) obj;
                return new fot(bVar2.getContext(), new r9q0(bVar2), null);
            case 13:
                return new p0x(((ViewGroup) obj).getContext());
            case 14:
                return new i1t0(true, ((VideoAlbumVh) obj).e.J().Y1());
            case 15:
                int i3 = VideoBottomSheetTreeCommentsFragment.l1;
                return ((AttachmentMappersComponent) m7m.d((VideoBottomSheetTreeCommentsFragment) obj).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
            case 16:
                ((acs0) obj).a();
                return false;
            case 17:
                VideoMinimizableDiscoveryFragment.b bVar3 = ((VideoMinimizableDiscoveryFragment) obj).U;
                return (bVar3 != null ? bVar3 : null).b.h.a;
            case 18:
                int i4 = VideoPostViewFragment.W0;
                ((VideoPostViewFragment) obj).t2();
                return false;
            case 19:
                return new w3o(((DonutPriceComponent) ((com.vk.newsfeed.common.recycler.holders.i) obj).m0.getValue()).kf());
            case 20:
                List<Class<? extends View>> list = VkFormField.C;
                return (ImageButton) ((VkFormField) obj).findViewById(R.id.vk_form_item_layout_end_button);
            case 21:
                return VkImAvatar.X0((VkImAvatar) obj);
            case 22:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                ?? x = (superappUiRouterBridge != null ? superappUiRouterBridge : null).x(false);
                ref$ObjectRef.element = x;
                if (x != 0) {
                    x.show();
                }
                return s3q0.a;
            case 23:
                ((m1w0) obj).b.B(new NullPointerException("Failed to create WebView"));
                return s3q0.a;
            case 24:
                ((kew0) obj).a.onNext(jew0.b.a);
                return s3q0.a;
            case 25:
                return ((PostingComponent) ((k7m) m7m.f((y9x0) obj)).mo408a(fpf0.a(PostingComponent.class))).H6().f();
            case 26:
                int i5 = WriteBar.h0;
                return (ImageView) ((WriteBar) obj).findViewById(R.id.writebar_send);
            case 27:
                return ((c1y0) obj).b().getButtonSettings();
            default:
                return new e5y0(((YandexAdFeatureImpl) obj).b);
        }
    }

    public /* synthetic */ pvh0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
