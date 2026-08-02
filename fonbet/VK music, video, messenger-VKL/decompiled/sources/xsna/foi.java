package xsna;

import android.view.View;
import android.widget.TextView;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.ecomm.configureitemlist.ConfigureItemListFragment;
import com.vk.ecomm.products_multipicker.api.di.ProductsMultipickerComponent;
import com.vk.friends.groupinvite.api.di.InviteFriendsComponent;
import com.vk.im.ui.components.contacts.c;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vk.mediapicker.api.di.MediaPickerComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragment;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.superapp.vksteps.VkStepsBridgeDelegatesFactory;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import kotlin.collections.EmptyList;
import xsna.bhg0;
import xsna.g8i;
import xsna.m5u;
import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class foi implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ foi(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction invoke$lambda$41;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((wh50) obj).setValue(0);
                return s3q0.a;
            case 1:
                int i2 = ConfigureItemListFragment.S;
                return ((ProductsMultipickerComponent) m7m.d((ConfigureItemListFragment) obj).a(fpf0.a(ProductsMultipickerComponent.class))).a();
            case 2:
                com.vk.im.ui.components.contacts.c cVar = (com.vk.im.ui.components.contacts.c) obj;
                cVar.Y0().d();
                c.b bVar = cVar.A;
                String str = bVar.a;
                bVar.a = "";
                bVar.b = EmptyList.b;
                cVar.Z0(str);
                return s3q0.a;
            case 3:
                return new VkImAvatar(((hgm) obj).d, null, 6, 0);
            case 4:
                return (TextView) ((View) ((l6p) obj).b.getValue()).findViewById(R.id.collapsed_transition_text);
            case 5:
                return (NewsfeedOptionalAdsComponent) ((k7m) m7m.f((mqp) obj)).mo408a(fpf0.a(NewsfeedOptionalAdsComponent.class));
            case 6:
                coq coqVar = (coq) obj;
                mo60 mo60Var = coqVar.a;
                return new hv50(mo60Var.X, mo60Var.Y, ((NewsFeedComponent) coqVar.c.getValue()).cc());
            case 7:
                int i3 = FriendsFragment.q0;
                return ((InviteFriendsComponent) m7m.d((FriendsFragment) obj).mo408a(fpf0.a(InviteFriendsComponent.class))).d();
            case 8:
                mss mssVar = (mss) obj;
                return new m060(mssVar.a, mssVar.c, mssVar.d, (g2r0) mssVar.o.getValue(), (sgg) mssVar.m.getValue(), (t7k0) mssVar.n.getValue(), mssVar.e, (nts) mssVar.j.getValue(), mssVar.i);
            case 9:
                ((z5u) obj).l.invoke(m5u.e.b);
                return s3q0.a;
            case 10:
                ((xlu) obj).d.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setInterpolator(qq2.e).setDuration(180L).withLayer().start();
                return s3q0.a;
            case 11:
                invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41((HandleInvocationsFromAdViewer) obj);
                return invoke$lambda$41;
            case 12:
                return "    hangedMarker = " + ((g8i.a) obj).d;
            case 13:
                return (ucg0) ((com.vk.im.video.g) obj).g0.getValue();
            case 14:
                int i4 = ImSelectContactsFragment.v0;
                ((ImSelectContactsFragment) obj).mo2getContext();
                return Boolean.FALSE;
            case 15:
                return ((l4y) obj).n(VkStepsBridgeDelegatesFactory.DelegateType.GET_STEPS_GF);
            case 16:
                return ((r6y) obj).l;
            case 17:
                return Boolean.valueOf(((i8z) obj).p);
            case 18:
                return "state: " + ((zrz.a) obj) + " checkExpirationAndLaunchNetworkLoadIfExpired called";
            case 19:
                int i5 = LocalMediaPickerFragment.d0;
                return ((MediaPickerComponent) m7m.d((LocalMediaPickerFragment) obj).mo408a(fpf0.a(MediaPickerComponent.class))).Be();
            case 20:
                ((n310) obj).j.a(bhg0.c.a);
                return s3q0.a;
            case 21:
                return ((com.vk.newsfeed.posting.market_picker.presentation.base.view.f) obj).c;
            case 22:
                return ((SearchUiComponent) ((k7m) m7m.f((n620) obj)).a(fpf0.a(SearchUiComponent.class))).lf();
            case 23:
                ((vb20) obj).a.Y0();
                return s3q0.a;
            case 24:
                return (fp20) obj;
            case 25:
                gzs<s3q0> gzsVar = ((com.vk.core.ui.bottomsheet.actionsheet.a) obj).c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 26:
                ((kz20) obj).e.Ff("episode_bottom_sheet");
                return s3q0.a;
            case 27:
                ((zf20) obj).invoke();
                return s3q0.a;
            case 28:
                return new wng0(-16777216, e3m.d(R.attr.im_msg_part_story_corner_radius, ((xt30) obj).t())).mutate();
            default:
                return (xx30) ((rw30) obj).A.m.getValue();
        }
    }
}
