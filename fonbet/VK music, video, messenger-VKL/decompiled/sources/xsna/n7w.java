package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicClipsSelectorCatalogRootVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.search.ModernSearchView;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.feed.settings.api.di.NewsfeedSettingsComponent;
import com.vk.feed.settings.impl.presentation.filtered.tab.NewsfeedFilterListFragment2;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.ui.attachmentspicker.PickVKPhotoFragmentNew;
import com.vk.profile.user.impl.ui.ModalUserProfileFragment;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import com.vk.settings.impl.presentation.base.fragment.setting.NotificationSettingFragment;
import com.vk.superapp.permission.js.bridge.api.di.JsPermissionDelegateComponent;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.voip.ui.notifications.incoming.d;
import com.vkontakte.android.LinkRedirActivity;
import com.vkontakte.android.R;
import java.util.List;
import xsna.bzx;
import xsna.i0c0;
import xsna.i560;
import xsna.i6w;
import xsna.ofe0.a;
import xsna.so20;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class n7w implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n7w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((p7w) obj).d.invoke(i6w.a.b);
                return s3q0.a;
            case 1:
                return new wi30(o25.a(), BuildInfo.a, (yk70) ((w9w) obj).b.getValue());
            case 2:
                return (IconCompat) ((d.a) obj).g.invoke();
            case 3:
                ((wzx) obj).c.invoke(bzx.g.b);
                return s3q0.a;
            case 4:
                r6y r6yVar = (r6y) obj;
                com.vk.superapp.permission.js.bridge.api.di.b A0 = ((JsPermissionDelegateComponent) x6y.H().a(fpf0.a(JsPermissionDelegateComponent.class))).A0();
                fvv0 M = r6yVar.M();
                return A0.a(M != null ? M.d() : null, new foi(r6yVar, 16), r6yVar);
            case 5:
                List<String> list = LinkRedirActivity.m;
                return ((NotificationsSettingsComponent) m7m.a((LinkRedirActivity) obj).a(fpf0.a(NotificationsSettingsComponent.class))).a();
            case 6:
                return new ocz((zcz) obj);
            case 7:
                dm20 dm20Var = (dm20) obj;
                fq60 fq60Var = (fq60) dm20Var.d.getValue();
                yo60.j.a aVar = yo60.j.a.a;
                gq60 gq60Var = dm20Var.e;
                fq60Var.getClass();
                fq60.c(aVar, gq60Var);
                return s3q0.a;
            case 8:
                drg drgVar = ((so20.a) obj).b;
                if (drgVar != null) {
                    drgVar.invoke();
                }
                return s3q0.a;
            case 9:
                return ((MiniPlayerControllersWrapper) obj).p;
            case 10:
                int i2 = ModalUserProfileFragment.C0;
                return new s0w0(e3m.a(R.dimen.profile_card_corner_radius, ((ModalUserProfileFragment) obj).requireContext()), false, true);
            case 11:
                MusicClipsSelectorCatalogRootVh musicClipsSelectorCatalogRootVh = (MusicClipsSelectorCatalogRootVh) obj;
                ModernSearchView modernSearchView = musicClipsSelectorCatalogRootVh.A.b.k;
                if (modernSearchView != null) {
                    modernSearchView.b(50L);
                }
                musicClipsSelectorCatalogRootVh.m.b.b.c(false);
                d3m.e(musicClipsSelectorCatalogRootVh.v.c, (r15 & 1) != 0 ? 300L : 300L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                return Boolean.TRUE;
            case 12:
                return (ViewGroup) ((jz50) obj).b.W.findViewById(R.id.audio_msg_recorder_container);
            case 13:
                return ((VideoRestrictedUserActionsComponent) ((k7m) m7m.f((i560.a) ((i560) obj).a.getValue())).a(fpf0.a(VideoRestrictedUserActionsComponent.class))).e2();
            case 14:
                return Boolean.valueOf(!((Boolean) ((gzs) obj).invoke()).booleanValue());
            case 15:
                int i3 = NewsfeedFilterListFragment2.X;
                return ((NewsfeedSettingsComponent) ((k7m) m7m.f((NewsfeedFilterListFragment2) obj)).a(fpf0.a(NewsfeedSettingsComponent.class))).Da();
            case 16:
                qcy<Object>[] qcyVarArr = NotificationSettingFragment.W;
                return ((NotificationSettingFragment) obj).requireArguments().getString("setting_title");
            case 17:
                OnlineBookingInternalComponent.a aVar2 = OnlineBookingInternalComponent.n;
                return new zq7(((OnlineBookingInternalComponent) obj).Ef());
            case 18:
                return (RecyclerView) ((dp90) obj).b().findViewById(R.id.past_call_details_calls_block_recycler);
            case 19:
                PickVKPhotoFragmentNew pickVKPhotoFragmentNew = (PickVKPhotoFragmentNew) obj;
                return new dm1(((PhotosComponent) pickVKPhotoFragmentNew.p0.getValue()).d3(), null, new xgv(pickVKPhotoFragmentNew, 21));
            case 20:
                ((e2b0) obj).f.getClass();
                return null;
            case 21:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                return s3q0.a;
            case 22:
                ((i0c0.a) obj).a();
                return s3q0.a;
            case 23:
                return (h3f0) obj;
            case 24:
                o7c0 o7c0Var = (o7c0) obj;
                o1l0 accessibilityListener = o7c0Var.getAccessibilityListener();
                if (accessibilityListener != null) {
                    ((kdl0) accessibilityListener).a(o7c0Var);
                }
                return s3q0.a;
            case 25:
                gzs gzsVar = (gzs) ((zak0) ((w8d0) obj).g).getValue();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 26:
                tad tadVar = new tad(((rid0) obj).a);
                tadVar.setId(View.generateViewId());
                tadVar.setTag("product_attaches_large_views_recycler");
                return tadVar;
            case 27:
                return new nkd0(((uld0) obj).d);
            case 28:
                return ((ofe0) obj).new a();
            default:
                int i4 = com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a.p1;
                return Integer.valueOf(((com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.b) obj).e);
        }
    }
}
