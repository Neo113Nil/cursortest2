package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.ads.core.domain.AndroidTestDataInfo;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.avatar.api.VKAvatarView;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.donut.privacy.levels.PrivacyEditDonutLevelsFragment;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.tags.Tag;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.ecomm.storefront.impl.albums.presentation.fragment.StorefrontAlbumsArgs;
import com.vk.ecomm.storefront.impl.albums.presentation.fragment.StorefrontAlbumsFragment;
import com.vk.im.ui.views.ReplyView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.overlaymenu.launcher.OverlayMenuActivity;
import com.vk.posting.di.PostingComponent;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.storycamera.screen.StoryGalleryActivity;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;
import com.vk.superapp.vkpay.checkout.feature.success.Status;
import com.vk.superapp.vkpay.checkout.feature.success.states.ButtonAction;
import com.vk.superapp.vkpay.checkout.feature.success.states.StatusActionStyle;
import com.vk.superapp.vkpay.checkout.feature.success.states.SuccessState;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bcp0;
import xsna.kku0;
import xsna.vim0;
import xsna.x6i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hk70 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hk70(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        String string;
        Object obj;
        Object parcelable;
        AndroidTestDataInfo initialize$lambda$220$lambda$40;
        Photo photo;
        List<Tag> list;
        int i = this.b;
        boolean z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ik70 ik70Var = (ik70) obj2;
                ik70Var.b = null;
                ik70Var.h.invoke("video_notifications_subscription");
                return s3q0.a;
            case 1:
                FragmentActivity activity = ((xz70) obj2).a.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 2:
                OverlayMenuActivity overlayMenuActivity = (OverlayMenuActivity) obj2;
                int i2 = OverlayMenuActivity.m;
                overlayMenuActivity.getWindow().getDecorView().postDelayed(new hod(overlayMenuActivity, 8), overlayMenuActivity.getResources().getInteger(R.integer.vk_bottom_sheet_slide_out_duration));
                return s3q0.a;
            case 3:
                cs90 cs90Var = (cs90) obj2;
                VkTransactionInfo vkTransactionInfo = cs90Var.l.a;
                int i3 = vkTransactionInfo.b;
                String str2 = sua.i(i3, ',') + (char) 8201 + vkTransactionInfo.d.h();
                as90 as90Var = cs90Var.e;
                Context mo2getContext = as90Var.mo2getContext();
                String str3 = "";
                if (mo2getContext == null || (str = mo2getContext.getString(R.string.vk_pay_checkout_success_title)) == null) {
                    str = "";
                }
                StatusActionStyle statusActionStyle = StatusActionStyle.PRIMARY;
                Context mo2getContext2 = as90Var.mo2getContext();
                if (mo2getContext2 != null && (string = mo2getContext2.getString(R.string.vk_pay_checkout_transaction_done)) != null) {
                    str3 = string;
                }
                kku0.a.a(cs90Var.i, new Status(new SuccessState(str2, str), new ButtonAction(statusActionStyle, str3, new com.vk.movika.sdk.base.model.props.c(27))));
                return s3q0.a;
            case 4:
                return enj.c(R.drawable.vk_icon_user_tag_outline_28, dhr0.t.c(R.attr.vk_ui_icon_accent), ((View) obj2).getContext());
            case 5:
                MusicTrack musicTrack = ((bhb0) obj2).z;
                return (epx.f(musicTrack != null ? jnj.a(musicTrack.V) : null, "kids_section") ? MusicPlaybackLaunchContext.w : MusicPlaybackLaunchContext.v).Eb(128);
            case 6:
                return ((hpb0) obj2).g(R.id.poll_background_description);
            case 7:
                return (CartComponent) ((k7m) m7m.f((xzb0) obj2)).a(fpf0.a(CartComponent.class));
            case 8:
                com.vk.newsfeed.impl.items.posting.item.modals.b bVar = (com.vk.newsfeed.impl.items.posting.item.modals.b) obj2;
                bVar.b.w5(true, bVar.a.h);
                return s3q0.a;
            case 9:
                return ((PostingComponent) ((k7m) m7m.f((ylc0) obj2)).mo408a(fpf0.a(PostingComponent.class))).H6().x();
            case 10:
                qcy<Object>[] qcyVarArr = PrivacyEditDonutLevelsFragment.T;
                Bundle requireArguments = ((PrivacyEditDonutLevelsFragment) obj2).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("donut_level", DonutLevel.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("donut_level");
                    obj = (DonutLevel) (parcelable2 instanceof DonutLevel ? parcelable2 : null);
                }
                return (DonutLevel) obj;
            case 11:
                return ((SharingComponent) ((rkd0) obj2).i.getValue()).F2();
            case 12:
                return ((ModerationComponent) m7m.d((com.vk.ecomm.product_list.presentation.a) obj2).mo408a(fpf0.a(ModerationComponent.class))).bd();
            case 13:
                StringBuilder sb = new StringBuilder("PromotedStickersRepositoryImpl promotedStickersObservable != null ");
                Iterable iterable = (Iterable) ((Ref$ObjectRef) obj2).element;
                ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((StickerItem) it.next()).b));
                }
                sb.append(arrayList);
                return sb.toString();
            case 14:
                int i4 = ReplyView.k;
                return new tz30(((ReplyView) obj2).getContext());
            case 15:
                ClassLoader classLoader = ((szg0) obj2).a;
                Method method = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent").getMethod("getSupportedWindowFeatures", null);
                if (Modifier.isPublic(method.getModifiers())) {
                    if (method.getReturnType().equals(classLoader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures"))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 16:
                r5h0 r5h0Var = (r5h0) obj2;
                if (k9q0.q(r5h0Var.b) && k9q0.q(r5h0Var.a)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                x6i0.g gVar = ((x6i0) obj2).g;
                return new bzb0((gVar != null ? gVar : null).a.getContext());
            case 18:
                initialize$lambda$220$lambda$40 = ServiceProvider.initialize$lambda$220$lambda$40((ServicesRegistry) obj2);
                return initialize$lambda$220$lambda$40;
            case 19:
                return (VKAvatarView) ((com.vk.sharing.core.view.f) obj2).findViewById(R.id.user_avatar);
            case 20:
                PhotoAttachment photoAttachment = (PhotoAttachment) ((cvj0) obj2).C;
                return (photoAttachment == null || (photo = photoAttachment.l) == null || (list = photo.x) == null) ? EmptyList.b : list;
            case 21:
                return ((eck0) obj2).q();
            case 22:
                return (o0r0) ((sbl0) obj2).j.invoke();
            case 23:
                StorefrontAlbumsFragment storefrontAlbumsFragment = (StorefrontAlbumsFragment) obj2;
                qcy<Object>[] qcyVarArr2 = StorefrontAlbumsFragment.R;
                return new ikl0(((StorefrontAlbumsArgs) storefrontAlbumsFragment.N.getValue()).b, storefrontAlbumsFragment, (wjl0) storefrontAlbumsFragment.O.getValue());
            case 24:
                WeakReference<View> weakReference = StoryGalleryActivity.F;
                return ((StoriesComponent) ((k7m) m7m.f((StoryGalleryActivity) obj2)).a(fpf0.a(StoriesComponent.class))).L2();
            case 25:
                p5m0 p5m0Var = (p5m0) obj2;
                dw20 dw20Var = p5m0Var.e;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                p5m0Var.e = null;
                return s3q0.a;
            case 26:
                ((wim0) obj2).c.fo(vim0.a.b);
                return s3q0.a;
            case 27:
                int i5 = SuperAppFragment.o0;
                return ((VkHealthPermissionsComponent) m7m.d((SuperAppFragment) obj2).a(fpf0.a(VkHealthPermissionsComponent.class))).Wb();
            case 28:
                bcp0.a aVar = bcp0.w;
                return ((AuthBridgeComponent) m7m.d((bcp0) obj2).a(fpf0.a(AuthBridgeComponent.class))).s();
            default:
                ((ioq0) obj2).w.b();
                return s3q0.a;
        }
    }
}
