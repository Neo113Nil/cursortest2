package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vk.libvideo.api.promo.stats.a;
import com.vk.libvideo.impl.di.VkVideoBackgroundViewStatDelegateComponentImpl;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.newsfeed.impl.fragments.VideoBottomSheetTreeCommentsFragment;
import com.vk.newsfeed.impl.fragments.VideoPostViewFragment;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.a;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.b4;
import xsna.ihw0;
import xsna.jew0;
import xsna.l5v0;
import xsna.r6p0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class wrl0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wrl0(Context context, VkImAvatar vkImAvatar) {
        this.b = 24;
        this.c = vkImAvatar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object parcelable;
        View findViewById;
        View findViewById2;
        int i = this.b;
        int i2 = 3;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((yrl0) obj2).j;
            case 1:
                return ((StoryViewerComponent) ((k7m) m7m.c(((jzl0) obj2).a)).a(fpf0.a(StoryViewerComponent.class))).l9();
            case 2:
                v4m0 v4m0Var = (v4m0) obj2;
                o1l0 o1l0Var = v4m0Var.f;
                if (o1l0Var != null) {
                    ((kdl0) o1l0Var).a(v4m0Var);
                }
                return s3q0.a;
            case 3:
                int i3 = hem0.y1;
                Dialog dialog = ((hem0) obj2).s;
                if (dialog != null) {
                    return dialog.getWindow();
                }
                return null;
            case 4:
                ((com.vk.stories.design.view.stats.tabs.stickers.mvi.c) obj2).c.invoke(a.c.C1814c.b);
                return s3q0.a;
            case 5:
                Bundle requireArguments = ((zkn0) obj2).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("arg_credentials", VkAuthCredentials.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("arg_credentials");
                    if (!(parcelable2 instanceof VkAuthCredentials)) {
                        parcelable2 = null;
                    }
                    obj = (VkAuthCredentials) parcelable2;
                }
                VkAuthCredentials vkAuthCredentials = (VkAuthCredentials) obj;
                return vkAuthCredentials == null ? new VkAuthCredentials("", null) : vkAuthCredentials;
            case 6:
                RecyclerView.Adapter adapter = ((RecyclerView) obj2).getAdapter();
                com.vk.libvideo.bottomsheet.about.delegate.c cVar = adapter instanceof com.vk.libvideo.bottomsheet.about.delegate.c ? (com.vk.libvideo.bottomsheet.about.delegate.c) adapter : null;
                return cVar != null ? cVar.h.f : EmptyList.b;
            case 7:
                xgo0 xgo0Var = (xgo0) obj2;
                return Boolean.valueOf(((vak0) xgo0Var.a).getFloatValue() < ((vak0) xgo0Var.b).getFloatValue());
            case 8:
                ToolbarRedesignVh toolbarRedesignVh = (ToolbarRedesignVh) obj2;
                return new k3p0(toolbarRedesignVh.b(), toolbarRedesignVh.c, toolbarRedesignVh.k, new y3l0(toolbarRedesignVh, 11), new c9m0(toolbarRedesignVh, i2), new ece0(toolbarRedesignVh, 14), new in60(toolbarRedesignVh, 27), new n7b0(toolbarRedesignVh, 18));
            case 9:
                ((r4p0) obj2).invoke(2);
                return Boolean.TRUE;
            case 10:
                r6p0.a aVar = (r6p0.a) obj2;
                View view = aVar.b;
                view.getViewTreeObserver().addOnScrollChangedListener(aVar);
                view.getViewTreeObserver().addOnGlobalFocusChangeListener(aVar);
                view.getViewTreeObserver().addOnWindowFocusChangeListener(aVar);
                return s3q0.a;
            case 11:
                wp80.d((AppCompatActivity) obj2);
                return s3q0.a;
            case 12:
                com.vk.clips.design.view.component.video.preview.b bVar = (com.vk.clips.design.view.component.video.preview.b) obj2;
                bVar.f = false;
                if (bVar.g) {
                    com.vk.clips.design.view.component.video.preview.b.b(bVar);
                }
                return s3q0.a;
            case 13:
                int i4 = VideoBottomSheetTreeCommentsFragment.l1;
                return ((BridgeComponent) m7m.d((VideoBottomSheetTreeCommentsFragment) obj2).a(fpf0.a(BridgeComponent.class))).s();
            case 14:
                ((CatalogPaginatedListViewHolder) obj2).s();
                return s3q0.a;
            case 15:
                FragmentImpl fragmentImpl = ((acs0) obj2).a;
                wts0 vj = ((com.vk.libvideo.miniplayer.dialog.a) fragmentImpl).vj(fragmentImpl);
                if (vj != null) {
                    vj.V9();
                }
                return s3q0.a;
            case 16:
                ((kfs0) obj2).k.d(b4.i.a);
                return s3q0.a;
            case 17:
                return ((AuthBridgeComponent) ((k7m) m7m.c((nts0) obj2)).a(fpf0.a(AuthBridgeComponent.class))).s().c();
            case 18:
                VideoMinimizableDiscoveryFragment.b bVar2 = ((VideoMinimizableDiscoveryFragment) obj2).U;
                return (bVar2 != null ? bVar2 : null).b.g.f;
            case 19:
                int i5 = VideoPostViewFragment.W0;
                return ((AttachmentMappersComponent) m7m.d((VideoPostViewFragment) obj2).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
            case 20:
                return (DonutPriceComponent) j6i.b(m7m.c(((com.vk.newsfeed.common.recycler.holders.i) obj2).itemView), DonutPriceComponent.class);
            case 21:
                ggu0 ggu0Var = (ggu0) obj2;
                return new ddr0(ggu0Var.s(), ggu0Var.e, ggu0Var.d, ggu0Var.r, new prq0(ggu0Var, 20), ggu0Var.c);
            case 22:
                com.vk.auth.ui.consent.b bVar3 = (com.vk.auth.ui.consent.b) obj2;
                Dialog dialog2 = bVar3.s;
                if (dialog2 != null && (findViewById2 = dialog2.findViewById(R.id.design_bottom_sheet)) != null && iah0.q() && bVar3.D) {
                    bVar3.Kn(findViewById2, 1.8f);
                }
                Dialog dialog3 = bVar3.s;
                com.google.android.material.bottomsheet.b bVar4 = dialog3 instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog3 : null;
                if (bVar4 != null && (findViewById = bVar4.findViewById(R.id.design_bottom_sheet)) != null) {
                    BottomSheetBehavior L = BottomSheetBehavior.L(findViewById);
                    if (L.M == 3) {
                        bVar3.Ln(findViewById);
                        findViewById.requestLayout();
                    } else {
                        bVar3.F = true;
                        L.D(new anu0(bVar3, L));
                    }
                }
                return s3q0.a;
            case 23:
                List<Class<? extends View>> list = VkFormField.C;
                return (ImageView) ((VkFormField) obj2).findViewById(R.id.vk_form_item_layout_right_extra_icon_button);
            case 24:
                return VkImAvatar.Y0((VkImAvatar) obj2);
            case 25:
                return "onUpdateLoaded: load update = ".concat(qjg.a((l5v0.a) obj2));
            case 26:
                VkVideoBackgroundViewStatDelegateComponentImpl vkVideoBackgroundViewStatDelegateComponentImpl = (VkVideoBackgroundViewStatDelegateComponentImpl) obj2;
                qcy<Object>[] qcyVarArr = VkVideoBackgroundViewStatDelegateComponentImpl.d;
                if (!fxc0.B().J().c()) {
                    return a.C1201a.a.getSTUB();
                }
                nwy nwyVar = vkVideoBackgroundViewStatDelegateComponentImpl.b;
                qcy<Object> qcyVar = VkVideoBackgroundViewStatDelegateComponentImpl.d[0];
                return new gzv0((sos0) nwyVar.c());
            case 27:
                ((kew0) obj2).a.onNext(jew0.a.a);
                return s3q0.a;
            case 28:
                return (TextView) ((bgw0) obj2).b().findViewById(R.id.call_by_link_button_start_call);
            default:
                ihw0.a aVar2 = ((ihw0) obj2).a;
                return (Fragment) aVar2.c.invoke(aVar2.a);
        }
    }

    public /* synthetic */ wrl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
