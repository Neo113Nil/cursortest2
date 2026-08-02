package xsna;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.clips.sdk.screens.feed.decorator.api.di.ClipsDecorationComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenFragment;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack.a;
import com.vk.friends.impl.followers.presentation.fragments.AllFollowersListFragment;
import com.vk.libvideo.api.di.OnboardingComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.storycamera.utils.CatalogModalBottomSheetFragment;
import com.vk.video.channel.common.di.VideoChannelComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.e6c;
import xsna.f0e.a;
import xsna.fb7;
import xsna.g73;
import xsna.gdn;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class im0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ im0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        String string;
        int i = 0;
        CatalogModalBottomSheetFragment.Content content = null;
        switch (this.b) {
            case 0:
                ams.a().a(((km0) this.c).c, true);
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((jm1) this.c).getContext().getResources().getConfiguration().orientation != 2);
            case 2:
                xp1 xp1Var = (xp1) this.c;
                int i2 = xp1.l1;
                return ((NewsFeedComponent) m7m.d(xp1Var).a(fpf0.a(NewsFeedComponent.class))).G2();
            case 3:
                AllFollowersListFragment allFollowersListFragment = (AllFollowersListFragment) this.c;
                int i3 = AllFollowersListFragment.c0;
                UserId userId = (UserId) allFollowersListFragment.requireArguments().getParcelable("uid");
                return userId == null ? UserId.d : userId;
            case 4:
                return new g73.b(((g73) this.c).a, null, null, 62);
            case 5:
                qx4 qx4Var = (qx4) this.c;
                return new tx4(qx4Var.d, qx4Var.e, new kt4(qx4Var, 1));
            case 6:
                ((f15) this.c).k.a.invoke(gdn.e.d.b);
                return s3q0.a;
            case 7:
                return ((OnboardingComponent) ((k7m) m7m.f(((com.vk.libvideo.autoplay.b) this.c).d)).a(fpf0.a(OnboardingComponent.class))).uc();
            case 8:
                AvatarAnimatedStack avatarAnimatedStack = (AvatarAnimatedStack) this.c;
                int i4 = AvatarAnimatedStack.q;
                return avatarAnimatedStack.new a();
            case 9:
                rjo0 rjo0Var = (rjo0) this.c;
                return Boolean.valueOf(rjo0Var != null ? ((Boolean) new qjo0(rjo0Var, 0).invoke()).booleanValue() : false);
            case 10:
                ((eb7) this.c).d.b(fb7.c.a);
                return s3q0.a;
            case 11:
                BookingServicesScreenFragment bookingServicesScreenFragment = (BookingServicesScreenFragment) this.c;
                qcy<Object>[] qcyVarArr = BookingServicesScreenFragment.S;
                mzp0 mzp0Var = bookingServicesScreenFragment.J;
                if (mzp0Var != null) {
                    mzp0Var.d(bookingServicesScreenFragment.getView());
                }
                return s3q0.a;
            case 12:
                v68 v68Var = (v68) this.c;
                View view = v68Var.l;
                View view2 = view == null ? null : view;
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                view2.getContext();
                e.b bVar = new e.b(view2, null, null, l, 6);
                bVar.w = R.layout.ds_internal_context_menu_item;
                dxb0 dxb0Var = v68Var.i;
                bVar.l = dxb0Var != null ? dxb0Var : null;
                return bVar.a();
            case 13:
                CatalogModalBottomSheetFragment catalogModalBottomSheetFragment = (CatalogModalBottomSheetFragment) this.c;
                int i5 = CatalogModalBottomSheetFragment.X;
                Bundle arguments = catalogModalBottomSheetFragment.getArguments();
                if (arguments != null && (string = arguments.getString("content_type_arg")) != null) {
                    CatalogModalBottomSheetFragment.Content.Companion.getClass();
                    CatalogModalBottomSheetFragment.Content[] values = CatalogModalBottomSheetFragment.Content.values();
                    int length = values.length;
                    while (true) {
                        if (i < length) {
                            CatalogModalBottomSheetFragment.Content content2 = values[i];
                            if (epx.f(content2.h(), string)) {
                                content = content2;
                            } else {
                                i++;
                            }
                        }
                    }
                    if (content == null) {
                        content = CatalogModalBottomSheetFragment.Content.STORY;
                    }
                    if (content != null) {
                        return content;
                    }
                }
                throw new IllegalStateException("Null content!");
            case 14:
                mbc mbcVar = (mbc) this.c;
                vyt0 vyt0Var = new vyt0(mbcVar.getViewModelStore(), mbcVar.getDefaultViewModelProviderFactory(), mbcVar.getDefaultViewModelCreationExtras());
                rfc a = fpf0.a(pbc.class);
                String h = a.h();
                if (h != null) {
                    return (pbc) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a);
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case 15:
                isc iscVar = (isc) this.c;
                qcy<Object>[] qcyVarArr2 = isc.t1;
                Bundle arguments2 = iscVar.getArguments();
                return Boolean.valueOf(arguments2 != null ? arguments2.getBoolean("force_dark", true) : true);
            case 16:
                ViewParent parent = ((c1d) this.c).a.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                }
                return s3q0.a;
            case 17:
                return ((ClipsViewerComponent) ((k7m) m7m.f((t7d) this.c)).a(fpf0.a(ClipsViewerComponent.class))).pe();
            case 18:
                PaginatedGridListVh paginatedGridListVh = ((ClipSearchRootVh) this.c).G;
                List O0 = paginatedGridListVh != null ? j5g.O0(paginatedGridListVh.h.d) : null;
                if (O0 == null) {
                    return EmptyList.b;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : O0) {
                    if (obj instanceof UIBlockVideo) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((UIBlockVideo) it.next()).B);
                }
                return arrayList2;
            case 19:
                return ((ClipsTemplatesEditorComponent) ((atd) this.c).g.getValue()).l5();
            case 20:
                f0e f0eVar = (f0e) this.c;
                h0e h0eVar = f0eVar.f;
                return new k9f((h0eVar != null ? h0eVar : null).a(), f0eVar.d, f0eVar.new a());
            case 21:
                ClipsOwnerSwipeFragment clipsOwnerSwipeFragment = (ClipsOwnerSwipeFragment) this.c;
                Object obj2 = ClipsOwnerSwipeFragment.k0;
                return ((VideoChannelComponent) m7m.d(clipsOwnerSwipeFragment).mo408a(fpf0.a(VideoChannelComponent.class))).h4();
            case 22:
                irk0 irk0Var = (irk0) ((defpackage.h) this.c).invoke();
                if (irk0Var != null) {
                    return new klf(irk0Var);
                }
                return null;
            case 23:
                kmf kmfVar = (kmf) this.c;
                int i6 = ClipsVideoAttachmentPickerFragment.W;
                return Integer.valueOf(((rmf) kmfVar.g.c).i);
            case 24:
                ClipsViewerComponentImpl clipsViewerComponentImpl = (ClipsViewerComponentImpl) this.c;
                qcy<Object>[] qcyVarArr3 = ClipsViewerComponentImpl.o0;
                return clipsViewerComponentImpl.Ff();
            case 25:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                int i7 = ClipsWrapperFragment.Q0;
                return (ClipsDecorationComponent) m7m.d(clipsWrapperFragment).mo408a(fpf0.a(ClipsDecorationComponent.class));
            case 26:
                return ((BridgeComponent) ((n0i) this.c).a.a(fpf0.a(BridgeComponent.class))).O().D();
            case 27:
                return Boolean.valueOf(o25.b(((com.vk.im.ui.components.contacts.c) this.c).k));
            case 28:
                ((zak0) ((rfj) this.c).g).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            default:
                cbk cbkVar = (cbk) this.c;
                ysg0.b.a(e6c.a.a);
                cbkVar.g.j("a6c");
                return s3q0.a;
        }
    }
}
