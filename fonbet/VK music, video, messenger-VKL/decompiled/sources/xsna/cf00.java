package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.orders.impl.order.presentation.OrderFragment;
import com.vk.log.L;
import com.vk.mediapicker.api.di.MediaPickerComponent;
import com.vk.mediapicker.impl.presentation.fragment.MediaPickerFragment;
import com.vk.mvi.MviLazyViewContainer;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.domain.model.NewsfeedCustomFeedType;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.posting.presentation.video.search.SearchVideoPickerFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.StickerAttachment;
import java.io.Serializable;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.cqc0;
import xsna.ikv0;
import xsna.mk50;
import xsna.tr20;
import xsna.vm30;
import xsna.xn50;
import xsna.ydl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class cf00 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cf00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String, xsna.ikv0$d$a, xsna.x7g] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    @Override // xsna.gzs
    public final Object invoke() {
        View frameLayout;
        Object obj;
        Object obj2;
        Object serializable;
        Object parcelable;
        GetRequestPolicy initialize$lambda$220$lambda$123;
        Activity b;
        Window window;
        int i = this.b;
        int i2 = 7;
        int i3 = 6;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                df00 df00Var = (df00) obj3;
                w4u w4uVar = new w4u(df00Var, i2);
                View view = df00Var.f;
                wk wkVar = df00Var.e;
                if (wkVar != null) {
                    view.removeCallbacks(wkVar);
                }
                wk wkVar2 = new wk(w4uVar, 13);
                df00Var.e = wkVar2;
                view.postDelayed(wkVar2, 600L);
                return s3q0.a;
            case 1:
                return l710.a(((m710) obj3).getCurrentState());
            case 2:
                int i4 = MediaPickerFragment.Q;
                return ((MediaPickerComponent) m7m.d((MediaPickerFragment) obj3).mo408a(fpf0.a(MediaPickerComponent.class))).Be();
            case 3:
                xn50.a.c((pr20) obj3, tr20.e.b);
                q7n0.a().getCache().h(Collections.singletonList("universal_vkrun"));
                return s3q0.a;
            case 4:
                return Integer.valueOf(((w2w) obj3).I0().system().d());
            case 5:
                vm30 vm30Var = (vm30) obj3;
                vm30.g gVar = vm30Var.Q;
                int scrollState = vm30Var.u.getScrollState();
                vm30 vm30Var2 = vm30.this;
                if (scrollState == 0) {
                    vm30Var2.u.post(new qo4(vm30Var2, i2));
                    vm30Var2.s("scrollHelper");
                }
                return s3q0.a;
            case 6:
                return ((BridgeComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.a) obj3)).a(fpf0.a(BridgeComponent.class))).cb();
            case 7:
                MviLazyViewContainer mviLazyViewContainer = (MviLazyViewContainer) obj3;
                mk50 Fl = mviLazyViewContainer.Fl();
                Context context = mviLazyViewContainer.b;
                if (Fl instanceof mk50.c) {
                    frameLayout = ((mk50.c) Fl).a;
                } else if (Fl instanceof mk50.b) {
                    frameLayout = LayoutInflater.from(context).inflate(((mk50.b) Fl).a, (ViewGroup) null, false);
                } else {
                    if (!(Fl instanceof mk50.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    frameLayout = new FrameLayout(context);
                }
                mviLazyViewContainer.addView(frameLayout);
                return frameLayout;
            case 8:
                return ((BridgeComponent) ((k7m) m7m.f((ep50) obj3)).a(fpf0.a(BridgeComponent.class))).a0();
            case 9:
                ydl0.a aVar = ((ct50) obj3).b;
                if (aVar != null) {
                    aVar.onClose();
                }
                return s3q0.a;
            case 10:
                pkv0.f((ikv0.a) obj3);
                return s3q0.a;
            case 11:
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                Bundle requireArguments = ((NewsfeedCustomFragment2) obj3).requireArguments();
                String string = requireArguments.getString("title");
                String str = string == null ? "" : string;
                String string2 = requireArguments.getString("feed_id");
                String str2 = string2 == null ? "" : string2;
                String string3 = requireArguments.getString("ref", "unknown");
                String string4 = requireArguments.getString("track_code");
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 33) {
                    parcelable = requireArguments.getParcelable("discover_id", DiscoverId.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("discover_id");
                    if (!(parcelable2 instanceof DiscoverId)) {
                        parcelable2 = null;
                    }
                    obj = (DiscoverId) parcelable2;
                }
                DiscoverId discoverId = (DiscoverId) obj;
                if (discoverId == null) {
                    discoverId = DiscoverId.i;
                }
                DiscoverId discoverId2 = discoverId;
                boolean containsKey = requireArguments.containsKey("discover_id");
                boolean z = requireArguments.getBoolean("NewsfeedCustomFragmentWasCreated", false);
                boolean z2 = requireArguments.getBoolean("NewsfeedCustomFragmentWithPreload", false);
                boolean z3 = requireArguments.getBoolean("NewsfeedCustomFragmentShops", true);
                boolean z4 = requireArguments.getBoolean("show_in_lego_theme", false);
                if (i5 >= 33) {
                    serializable = requireArguments.getSerializable("feed_type", NewsfeedCustomFeedType.class);
                    obj2 = serializable;
                } else {
                    Serializable serializable2 = requireArguments.getSerializable("feed_type");
                    obj2 = (NewsfeedCustomFeedType) (serializable2 instanceof NewsfeedCustomFeedType ? serializable2 : 0);
                }
                NewsfeedCustomFeedType newsfeedCustomFeedType = (NewsfeedCustomFeedType) obj2;
                if (newsfeedCustomFeedType == null) {
                    newsfeedCustomFeedType = NewsfeedCustomFeedType.NONE;
                }
                return new ue60(str, str2, string3, string4, discoverId2, z, containsKey, z2, z3, z4, newsfeedCustomFeedType);
            case 12:
                jd80 jd80Var = (jd80) obj3;
                if (jd80Var.f) {
                    jd80Var.e.invoke();
                }
                return s3q0.a;
            case 13:
                OrderFragment orderFragment = (OrderFragment) obj3;
                qcy<Object>[] qcyVarArr2 = OrderFragment.Y;
                return new lx80(new qd80(new yd10(), ((CartComponent) orderFragment.N.getValue()).e8()), new bfm(orderFragment, 29));
            case 14:
                xdl xdlVar = ((PhotoEditorView) obj3).c.t;
                if (xdlVar == null) {
                    return null;
                }
                return xdlVar;
            case 15:
                PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) obj3;
                int i6 = PhotoFlowFragment.m0;
                return photoFlowFragment.fo().F4().c(photoFlowFragment.go());
            case 16:
                ((NewsFeedComponent) ((k7m) m7m.f((xzb0) obj3)).a(fpf0.a(NewsFeedComponent.class))).n0();
                return iuc0.b;
            case 17:
                return ((DonutPriceComponent) ((k7m) m7m.f((com.vk.newsfeed.impl.presenters.b) obj3)).a(fpf0.a(DonutPriceComponent.class))).kf();
            case 18:
                int i7 = PostingFragment.s0;
                return ((PostingFragment) obj3).requireContext();
            case 19:
                return new ctu(new k170((com.vk.newsfeed.impl.posting.settings.mvi.b) obj3, 12));
            case 20:
                ModalSettingsPrivacyOption modalSettingsPrivacyOption = new ModalSettingsPrivacyOption(((cqc0.c) obj3).a, null, 6);
                modalSettingsPrivacyOption.setTitle(R.string.newsfeed_newpost_for_best_friends);
                return modalSettingsPrivacyOption;
            case 21:
                qcy<Object>[] qcyVarArr3 = PostsFromNotificationsFragment.p0;
                Bundle requireArguments2 = ((PostsFromNotificationsFragment) obj3).requireArguments();
                String string5 = requireArguments2.getString("title");
                String str3 = string5 != null ? string5 : "";
                String string6 = requireArguments2.getString("ref");
                return new muc0(str3, requireArguments2.getString("arg_scroll_to"), string6 != null ? string6 : "unknown");
            case 22:
                ProfileMainPhotosFragment profileMainPhotosFragment = (ProfileMainPhotosFragment) obj3;
                int i8 = ProfileMainPhotosFragment.F0;
                return new dm1(((PhotosComponent) profileMainPhotosFragment.x0.getValue()).d3(), null, profileMainPhotosFragment.wo());
            case 23:
                int i9 = SearchVideoPickerFragment.U;
                z1h0 parentFragment = ((SearchVideoPickerFragment) obj3).getParentFragment();
                gia0 gia0Var = parentFragment instanceof gia0 ? (gia0) parentFragment : null;
                if (gia0Var != null) {
                    gia0Var.kh();
                }
                return s3q0.a;
            case 24:
                ((izs) ((zak0) ((u8i0) obj3).d).getValue()).invoke(Boolean.TRUE);
                return s3q0.a;
            case 25:
                initialize$lambda$220$lambda$123 = ServiceProvider.initialize$lambda$220$lambda$123((ServicesRegistry) obj3);
                return initialize$lambda$220$lambda$123;
            case 26:
                StickerAttachment.a aVar2 = StickerAttachment.k;
                ((kcl0) ((StickerAttachment) obj3).i.getValue()).getClass();
                return true;
            case 27:
                return ((hwl0) obj3).a;
            case 28:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj3;
                boolean z5 = wxl0.k;
                int i10 = (z5 && wxl0.l) ? R.string.new_avatar_post_and_story_published : z5 ? R.string.new_avatar_only_post_published : wxl0.l ? R.string.new_avatar_only_story_published : R.string.new_avatar_published;
                int a = iah0.a(40);
                try {
                    c63 c63Var = c63.a;
                    b = c63.b();
                } catch (Exception e) {
                    L.i(e);
                }
                if (b != null && (window = b.getWindow()) != null) {
                    dhr0.a.getClass();
                    Context E = dhr0.E();
                    ikv0.a aVar3 = new ikv0.a(E);
                    aVar3.t = new ikv0.c.C3058c(new eko(bitmapDrawable), (x7g) r11, new Size(a, a), 10);
                    aVar3.u = new ikv0.d(E.getString(i10), (String) r11, (ikv0.d.a) r11, i3);
                    aVar3.p(window);
                    return s3q0.a;
                }
                return s3q0.a;
            default:
                return ((NarrativeComponent) ((k7m) m7m.c(((com.vk.story.viewer.impl.presentation.stories.view.storyview.b) obj3).a)).a(fpf0.a(NarrativeComponent.class))).n4();
        }
    }
}
