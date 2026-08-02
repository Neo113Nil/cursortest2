package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.ClickType;
import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl.b;
import com.vk.clips.viewer.impl.feed.wrapper.ui.transition.ClipsWrapperTransitionState;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.fragments.ContactsListFragmentRedesign;
import com.vk.im.ui.fragments.ImContactsListFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import kotlin.collections.EmptyList;
import xsna.egm;
import xsna.yjo.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class jpf implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jpf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v73, types: [xsna.xti0] */
    @Override // xsna.gzs
    public final Object invoke() {
        int b;
        NestedScrollView nestedScrollView;
        ExposedFunction invoke$lambda$20;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = ClipsViewersSdkComponentImpl.l;
                return ((ClipsViewersSdkComponentImpl) obj).new b();
            case 1:
                ((ouf) obj).g = ClipsWrapperTransitionState.SHOW_FINISHED;
                return s3q0.a;
            case 2:
                ((j8h) obj).q.getClass();
                return s3q0.a;
            case 3:
                int i2 = CommunityNotificationSettingsFragment.b0;
                ((CommunityNotificationSettingsFragment) obj).io();
                return s3q0.a;
            case 4:
                return (View) ((WeakReference) obj).get();
            case 5:
                return ((com.vk.profile.community.impl.ui.profile.f) obj).k.findViewById(R.id.community_avatar);
            case 6:
                int i3 = CommunityRepliesFragment.d0;
                return ((BridgeComponent) ((k7m) m7m.f((CommunityRepliesFragment) obj)).a(fpf0.a(BridgeComponent.class))).s().c();
            case 7:
                return ((AuthBridgeComponent) m7m.d(((o1i) obj).b).a(fpf0.a(AuthBridgeComponent.class))).s();
            case 8:
                ComposeHeaderIconShowAllBadgeVh composeHeaderIconShowAllBadgeVh = (ComposeHeaderIconShowAllBadgeVh) obj;
                int i4 = ComposeHeaderIconShowAllBadgeVh.A;
                if (!jjc.d().a()) {
                    int i5 = ComposeHeaderIconShowAllBadgeVh.A;
                    composeHeaderIconShowAllBadgeVh.b(ClickType.SHOW_ALL);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 9:
                com.vk.im.ui.components.contacts.b bVar = (com.vk.im.ui.components.contacts.b) obj;
                if (bVar.r.isEmpty()) {
                    return s3q0.a;
                }
                bVar.r = EmptyList.b;
                io.reactivex.rxjava3.subjects.d<s3q0> dVar = bVar.q;
                s3q0 s3q0Var2 = s3q0.a;
                dVar.onNext(s3q0Var2);
                bVar.o.onNext(bVar.i(bVar.d()));
                return s3q0Var2;
            case 10:
                Context context = ((ghl) obj).a.getContext();
                HashSet hashSet = iah0.a;
                return Boolean.valueOf(fnj.d(context));
            case 11:
                egm egmVar = (egm) obj;
                Context context2 = egmVar.d;
                boolean z = egmVar.c;
                VkImageSimple vkImageSimple = new VkImageSimple(context2, null, 6, 0);
                omw.d(vkImageSimple, R.drawable.vk_icon_error_circle_16, R.attr.vk_ui_stroke_negative);
                vkImageSimple.setScaleType(ImageView.ScaleType.FIT_CENTER);
                vkImageSimple.setContentDescription(null);
                egm.b bVar2 = egmVar.m;
                int i6 = (bVar2 != null ? bVar2 : null).i;
                if (z) {
                    b = (bVar2 != null ? bVar2 : null).i;
                } else {
                    b = cn70.b(16);
                }
                vkImageSimple.setLayoutParams(egm.W(egmVar, i6, b, z ? 0 : cn70.b(8), 0, z ? cn70.b(6) : 0, 0, 40));
                egmVar.b.addView(vkImageSimple);
                return vkImageSimple;
            case 12:
                vtm vtmVar = (vtm) obj;
                if (vtmVar.k.isEnabled()) {
                    awt0.i(vtmVar.l, new p5h(vtmVar, 10));
                }
                vtmVar.l.setVisibility(0);
                vtmVar.w.e(false);
                vtmVar.x.c(false);
                vtmVar.y.c(false);
                vtmVar.z.c(false);
                vtmVar.A.c(false);
                vtmVar.B.c(false);
                vtmVar.n.setVisibility(4);
                vtmVar.r.submitList(vtmVar.D.a);
                return s3q0.a;
            case 13:
                qcy<Object>[] qcyVarArr2 = DiscoverMediaTabFragment2.C0;
                return ((DiscoverMediaTabFragment2) obj).fo();
            case 14:
                return ((yjo) obj).new b();
            case 15:
                zop zopVar = (zop) obj;
                VkLoadingButton vkLoadingButton = zopVar.k;
                if (vkLoadingButton == null || (nestedScrollView = zopVar.m) == null) {
                    return null;
                }
                nestedScrollView.scrollTo(0, vkLoadingButton.getBottom());
                return s3q0.a;
            case 16:
                return ((MarketComponent) ((k7m) m7m.f((EntriesListPresenter) obj)).a(fpf0.a(MarketComponent.class))).U1();
            case 17:
                return ((NewsFeedComponent) ((k7m) m7m.c(((byq) obj).C)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 18:
                ?? r1 = ((iar) obj).g;
                return "stopWriting: compositeKey= " + (r1 != 0 ? r1 : null);
            case 19:
                return ((v3p) obj).getLogger();
            case 20:
                gpr gprVar = (gpr) obj;
                return new xor(gprVar.b, gprVar.c, gprVar.d);
            case 21:
                return new iv1((com.vk.folders.impl.configure.h) obj, 5);
            case 22:
                return ((FrescoImageView) obj).r;
            case 23:
                ((evs) obj).T(false);
                return s3q0.a;
            case 24:
                ((GalleryFragmentImpl) obj).A0 = null;
                return s3q0.a;
            case 25:
                invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20((HandleInvocationsFromAdViewer) obj);
                return invoke$lambda$20;
            case 26:
                return ((HorizontalListVh) obj).p.k;
            case 27:
                tjv tjvVar = (tjv) obj;
                long j = tjvVar.c;
                long j2 = tjvVar.e;
                long j3 = tjvVar.g;
                return new sjv(sni.c(tjvVar.a, tjvVar.b), sni.c(j, j2), sni.c(j2, tjvVar.f), sni.c(j, tjvVar.d), sni.c(j3, tjvVar.j), sni.c(j != 0 ? j : j3, tjvVar.i));
            case 28:
                ImContactsListFragment imContactsListFragment = (ImContactsListFragment) obj;
                ContactsListFactory contactsListFactory = imContactsListFragment.a0;
                if (contactsListFactory == null) {
                    contactsListFactory = null;
                }
                if (contactsListFactory.m()) {
                    imContactsListFragment.Q.getClass();
                    jbs jbsVar = new jbs(imContactsListFragment);
                    ContactsListFragmentRedesign.a aVar = new ContactsListFragmentRedesign.a();
                    ContactsListFactory contactsListFactory2 = ContactsListFactory.CONTACTS_LIST_VKAPP;
                    Bundle bundle = aVar.j;
                    bundle.putSerializable("factory", contactsListFactory2);
                    aVar.s(true);
                    aVar.y(R.attr.im_ic_back_toolbar);
                    bundle.putString("force_entry_point_for_new", null);
                    bundle.putString("force_entry_point_for_create_contact", "contact_list_vk_create_contact");
                    aVar.m(jbsVar);
                }
                return s3q0.a;
            default:
                return ((p7w) obj).b.c;
        }
    }
}
