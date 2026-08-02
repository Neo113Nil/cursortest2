package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.timeline.FragmentActionsView;
import com.vk.clips.playlists.ui.modal.EmptyPlaylistBottomSheet;
import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$2;
import com.vk.dialogslist.api.list.DialogsListConfigToken;
import com.vk.dialogslist.impl.DialogsFragment;
import com.vk.friends.api.di.FeedFriendsComponent;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vk.im.ui.fragments.ImCreateChatFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.search.communities.map.api.di.SearchCommunitiesOnMapComponent;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVh;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.multiaccount.api.RelatedProfileComponent;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.EcosystemProfileView;
import com.vk.superapp.vkworkout.VkWorkoutBridgeDelegatesFactory;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import xsna.bex0;
import xsna.g8i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class maj implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ maj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        int i = this.b;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((oaj) obj).itemView.getContext().getString(R.string.vkim_contact_birthday);
            case 1:
                pul pulVar = (pul) obj;
                return ((k9g) ovi.a(pulVar, l9g.a)).d() ? ((double) f870.E(((l5g) ovi.a(pulVar, yfj.a)).a)) > 0.5d ? jlg0.d : jlg0.e : jlg0.f;
            case 2:
                Context context = ((hgm) obj).d;
                return new yri(context, e3m.f(R.attr.vk_ui_icon_accent_themed, context));
            case 3:
                int i3 = DialogsFragment.c0;
                Bundle arguments = ((DialogsFragment) obj).getArguments();
                DialogsListConfigToken dialogsListConfigToken = arguments != null ? (DialogsListConfigToken) arguments.getParcelable("custom_config_token") : null;
                if (dialogsListConfigToken != null) {
                    return dialogsListConfigToken;
                }
                return null;
            case 4:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                return s3q0.a;
            case 5:
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                return m7m.d((DiscoverMediaTabFragment2) obj);
            case 6:
                ((h3o) obj).s6();
                return s3q0.a;
            case 7:
                int i4 = EcosystemProfileView.m;
                return ((RelatedProfileComponent) ((k7m) m7m.c((EcosystemProfileView) obj)).a(fpf0.a(RelatedProfileComponent.class))).db();
            case 8:
                ((PhotoEditorView) obj).requestApplyInsets();
                return s3q0.a;
            case 9:
                l6p l6pVar = (l6p) obj;
                View inflate = l6pVar.a.inflate();
                inflate.setOnClickListener(new k6p(l6pVar, i2));
                return inflate;
            case 10:
                return (ClipsViewerAdapterComponent) ((k7m) m7m.f((EmptyPlaylistBottomSheet) obj)).a(fpf0.a(ClipsViewerAdapterComponent.class));
            case 11:
                return ((mqp) obj).e();
            case 12:
                return new FeatureScopesKt$createFeatureScope$scope$2.a((wzs) obj);
            case 13:
                int i5 = FragmentActionsView.g;
                return (RecyclerView) ((FragmentActionsView) obj).findViewById(R.id.timeline_fragment_actions_list);
            case 14:
                return (View) ((vhs) obj).a.get();
            case 15:
                int i6 = FriendsFragment.q0;
                return ((FeedFriendsComponent) m7m.d((FriendsFragment) obj).mo408a(fpf0.a(FeedFriendsComponent.class))).r6();
            case 16:
                mss mssVar = (mss) obj;
                return new uzb0(mssVar.a, mssVar.c, mssVar.d, (sgg) mssVar.m.getValue(), (g2r0) mssVar.o.getValue(), (t7k0) mssVar.n.getValue(), mssVar.e, (nts) mssVar.j.getValue(), (s1r0) mssVar.k.getValue(), mssVar.i);
            case 17:
                lat latVar = (lat) obj;
                mzp0 mzp0Var = latVar.g;
                if (mzp0Var == null) {
                    return null;
                }
                mzp0Var.d(latVar.c());
                return s3q0.a;
            case 18:
                return ((GeoPostsFragment) obj).Z;
            case 19:
                return ((SearchCommunitiesOnMapComponent) ((k7m) m7m.f((GlobalSearchGroupsCatalogRootVh) obj)).mo408a(fpf0.a(SearchCommunitiesOnMapComponent.class))).ma();
            case 20:
                s7u s7uVar = (s7u) obj;
                t7u t7uVar = s7uVar.m;
                if (t7uVar != null) {
                    s7uVar.l.b(t7uVar.b, t7uVar.c);
                }
                return s3q0.a;
            case 21:
                ((xlu) obj).h.setDisplayedChild(1);
                return s3q0.a;
            case 22:
                int i7 = ImCreateChatFragment.d0;
                ((ImCreateChatFragment) obj).requireContext();
                return Boolean.FALSE;
            case 23:
                return "    totalTimeMs = " + ((g8i.a) obj).c;
            case 24:
                com.vk.im.video.g gVar = (com.vk.im.video.g) obj;
                s290 s290Var = (s290) gVar.f0.getValue();
                AttachWithVideo attachWithVideo = gVar.q;
                return s290Var.a((attachWithVideo != null ? attachWithVideo : null).A().w2());
            case 25:
                bex0.a.a(((r2y) obj).a, JsApiMethodType.CALL_JOIN, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
                return s3q0.a;
            case 26:
                return ((l4y) obj).o(VkWorkoutBridgeDelegatesFactory.DelegateType.GET_WORKOUTS_HC);
            case 27:
                Context context2 = ((r6y) obj).l;
                if (context2 == null) {
                    return null;
                }
                while (true) {
                    z = context2 instanceof FragmentActivity;
                    if (!z && (context2 instanceof ContextWrapper)) {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                }
                return (FragmentActivity) (z ? (Activity) context2 : null);
            case 28:
                xwv0 xwv0Var = ((x7y) obj).d;
                return Boolean.valueOf(rl3.G(x7y.o, xwv0Var != null ? Long.valueOf(xwv0Var.getAppId()) : null));
            default:
                kz20 kz20Var = ((i8z) obj).j;
                return Boolean.valueOf((kz20Var == null || kz20Var.b()) ? false : true);
        }
    }
}
