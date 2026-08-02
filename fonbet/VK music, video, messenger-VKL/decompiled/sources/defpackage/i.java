package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.ads.impl.di.AdsComponentImpl;
import com.vk.articles.ArticleFragment;
import com.vk.catalog2.feature.music.holders.view.CatalogErrorViewWithImage;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.clips.external.nps.impl.di.ClipsExternalNpsComponentImpl;
import com.vk.clips.favorites.api.params.ClipsFavoritesFolderRenamingParams;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerFragment;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFileModeration;
import com.vk.clips.viewer.edit.di.ClipsViewerEditSdkComponentBase;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.feed.view.subs.selector.ClipsAutoSubtitlesBottomSheet;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.clips.upload.ClipsEditorUploadParams;
import com.vk.ecomm.cart.impl.checkout.fragment.CheckoutFragment;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsScreenFragment;
import com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment;
import com.vk.im.chat.restriction.impl.di.ChatWriteRestrictionFeatureComponentImpl;
import com.vk.toggle.b;
import com.vk.toggle.features.SoccomFeatures;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.clips.ClipsUploadSdkUploaderComponentVkApp;
import io.reactivex.rxjava3.disposables.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.auc;
import xsna.awt0;
import xsna.az0;
import xsna.b11;
import xsna.bzd;
import xsna.c5g;
import xsna.d7d;
import xsna.e140;
import xsna.e4y;
import xsna.f4m;
import xsna.f4z;
import xsna.fpf0;
import xsna.gzs;
import xsna.i5s;
import xsna.ifq;
import xsna.inf;
import xsna.irk0;
import xsna.k3c;
import xsna.k7m;
import xsna.kd0;
import xsna.ld0;
import xsna.lg30;
import xsna.m7m;
import xsna.mzp0;
import xsna.nwy;
import xsna.o1d;
import xsna.og30;
import xsna.oob;
import xsna.or2;
import xsna.os9;
import xsna.qcy;
import xsna.qzd;
import xsna.r5;
import xsna.s0e;
import xsna.s3q0;
import xsna.tad;
import xsna.u86;
import xsna.uud;
import xsna.v2f;
import xsna.v2y0;
import xsna.va9;
import xsna.wgb;
import xsna.wrp;
import xsna.xt0;
import xsna.y440;
import xsna.y8g0;
import xsna.yds0;
import xsna.zy0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class i implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object parcelable;
        int a;
        FragmentManager supportFragmentManager;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                l0 l0Var = (l0) obj2;
                return new e4y(l0Var.L0(), l0Var.w0(), l0Var.f);
            case 1:
                int i2 = r5.k1;
                return (ModerationComponent) m7m.d((r5) obj2).mo408a(fpf0.a(ModerationComponent.class));
            case 2:
                int i3 = AbsFriendsFragment.l0;
                ((AbsFriendsFragment) obj2).so();
                return s3q0.a;
            case 3:
                kd0.a aVar = ((ld0) obj2).b;
                if (aVar != null) {
                    aVar.b();
                }
                return s3q0.a;
            case 4:
                AdsComponentImpl adsComponentImpl = (AdsComponentImpl) obj2;
                qcy<Object>[] qcyVarArr = AdsComponentImpl.g;
                xt0 Df = adsComponentImpl.Df();
                nwy nwyVar = adsComponentImpl.d;
                qcy<Object> qcyVar = AdsComponentImpl.g[2];
                return new og30(Df, (lg30) nwyVar.c());
            case 5:
                b11 b11Var = (b11) ((zy0) obj2).a.getValue();
                return new az0(b11Var.getRootContainer(), b11Var.d, b11Var.f, b11Var.g, b11Var.e, b11Var.h);
            case 6:
                return ((ArticleFragment) obj2).T;
            case 7:
                ((c) obj2).dispose();
                return s3q0.a;
            case 8:
                return u86.J((y440) obj2);
            case 9:
                qcy<Object>[] qcyVarArr2 = BookingRecordsScreenFragment.V;
                Bundle requireArguments = ((BookingRecordsScreenFragment) obj2).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("initParams", BookingScreenParams.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("initParams");
                    obj = (BookingScreenParams) (parcelable2 instanceof BookingScreenParams ? parcelable2 : null);
                }
                if (obj != null) {
                    return (BookingScreenParams) obj;
                }
                throw new IllegalStateException("Required value was null.");
            case 10:
                com.vk.voip.ui.settings.participants_view.c cVar = (com.vk.voip.ui.settings.participants_view.c) obj2;
                if (f4m.h(cVar.j)) {
                    cVar.a(new j.l(null));
                    cVar.c.scrollToPosition(0);
                }
                return s3q0.a;
            case 11:
                return ((or2) ((va9) obj2).b.invoke()).e();
            case 12:
                CameraUIView cameraUIView = (CameraUIView) obj2;
                float f = CameraUIView.w1;
                if (cameraUIView.getPositions().x().N != null) {
                    uud uudVar = cameraUIView.c0;
                    if (uudVar != null) {
                        LinearLayout linearLayout = uudVar.b;
                        a = y8g0.a(R.dimen.camera_message_duet_additional_margin_bottom) + awt0.m(linearLayout != null ? linearLayout : null);
                    } else {
                        a = y8g0.a(R.dimen.camera_message_padding_bottom);
                    }
                } else {
                    a = y8g0.a(R.dimen.camera_message_padding_bottom);
                }
                cameraUIView.s0 = a;
                return s3q0.a;
            case 13:
                gzs<s3q0> gzsVar = ((CatalogErrorViewWithImage) obj2).i;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 14:
                int i4 = ChannelFragment.a1;
                return ((ChannelFragment) obj2).requireContext();
            case 15:
                return i5s.a(new StringBuilder(), ((wgb) obj2).s, ": executeLoadNext: skip, no more history");
            case 16:
                oob oobVar = (oob) obj2;
                Activity activity = oobVar.k;
                View view = oobVar.r;
                return new e140(activity, LayoutInflater.from((view != null ? view : null).getContext()));
            case 17:
                ChatWriteRestrictionFeatureComponentImpl chatWriteRestrictionFeatureComponentImpl = (ChatWriteRestrictionFeatureComponentImpl) obj2;
                return new v2y0(chatWriteRestrictionFeatureComponentImpl.a.w7(), chatWriteRestrictionFeatureComponentImpl.b.g());
            case 18:
                CheckoutFragment checkoutFragment = (CheckoutFragment) obj2;
                int i5 = CheckoutFragment.T;
                Context requireContext = checkoutFragment.requireContext();
                mzp0 mzp0Var = checkoutFragment.J;
                f4z f4zVar = checkoutFragment.getFeature().h;
                SoccomFeatures soccomFeatures = SoccomFeatures.CHECKOUT_NEW_FLOW;
                soccomFeatures.getClass();
                return new k3c(checkoutFragment, requireContext, mzp0Var, f4zVar, b.A.a(soccomFeatures));
            case 19:
                return ((ClipsTemplatesEditorComponent) ((k7m) m7m.f((o1d) obj2)).a(fpf0.a(ClipsTemplatesEditorComponent.class))).l4();
            case 20:
                return ((tad) obj2).g;
            case 21:
                int i6 = d7d.$EnumSwitchMapping$0[((ClipVideoFileAdapter) obj2).m.K1.ordinal()];
                if (i6 == 1) {
                    return SdkVideoFileModeration.UNDEFINED;
                }
                if (i6 == 2) {
                    return SdkVideoFileModeration.NOT_MODERATED;
                }
                if (i6 == 3) {
                    return SdkVideoFileModeration.PENDING_MODERATION;
                }
                if (i6 == 4) {
                    return SdkVideoFileModeration.REJECTED;
                }
                if (i6 == 5) {
                    return SdkVideoFileModeration.APPROVED;
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                ((ClipsAutoSubtitlesBottomSheet) obj2).f.Ff("clips_autosubs_settings");
                return s3q0.a;
            case 23:
                bzd bzdVar = (bzd) obj2;
                os9 os9Var = bzdVar.e.m;
                ClipsEditorUploadParams clipsEditorUploadParams = bzdVar.b.c;
                return new qzd(clipsEditorUploadParams.b, (irk0) os9Var.c, wrp.a(clipsEditorUploadParams.u));
            case 24:
                return (FrameLayout) ((s0e) obj2).i().findViewById(R.id.change_author_btn_container);
            case 25:
                qcy<Object>[] qcyVarArr3 = ClipsExternalNpsComponentImpl.c;
                return new ifq(((ClipsExternalNpsComponentImpl) obj2).Q1());
            case 26:
                ClipsFavoritesFoldersPickerFragment clipsFavoritesFoldersPickerFragment = (ClipsFavoritesFoldersPickerFragment) obj2;
                ClipsFavoritesFoldersPickerFragment.a aVar2 = ClipsFavoritesFoldersPickerFragment.V;
                FragmentActivity kn = clipsFavoritesFoldersPickerFragment.kn();
                FragmentActivity fragmentActivity = kn != null ? kn : null;
                if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
                    clipsFavoritesFoldersPickerFragment.fo().e().b(new ClipsFavoritesFolderRenamingParams.CreateFolder(clipsFavoritesFoldersPickerFragment.go().J0(), clipsFavoritesFoldersPickerFragment.go().q(), false), clipsFavoritesFoldersPickerFragment.requireContext(), supportFragmentManager);
                }
                return s3q0.a;
            case 27:
                return new v2f(((ClipsUploadSdkUploaderComponentVkApp) obj2).d);
            case 28:
                List<yds0> list = ((inf) obj2).b;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Float.valueOf(((yds0) it.next()).i));
                }
                return arrayList;
            default:
                qcy<Object>[] qcyVarArr4 = ClipsViewerEditSdkComponentBase.b;
                return new auc(((ClipsViewerEditSdkComponentBase) obj2).Df());
        }
    }
}
