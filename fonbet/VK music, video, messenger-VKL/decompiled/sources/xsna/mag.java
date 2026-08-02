package xsna;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.articleeditor.api.di.ArticleComponent;
import com.vk.attachpicker.di.PhotoEditorComponentImpl;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.attachpicker.impl.fragment.GraffitiFragment;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.draftslist.impl.ui.DraftsListFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.gallerypicker.di.PhotoEditorComponent;
import com.vk.googleump.impl.di.GoogleUMPComponentImpl;
import com.vk.im.engine.di.ImCmdRxExecutorComponent;
import com.vk.im.engine.di.ImCommonCommandsFactoryComponent;
import com.vk.im.engine.di.ImConfigurationComponent;
import com.vk.im.engine.event.observer.rx.di.ImRxEventObserverComponent;
import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.postmodal.ModalPostCommonFragment;
import com.vk.newsfeed.impl.postmodal.comments.CommentsOutherFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.search.communities.map.api.di.SearchCommunitiesOnMapComponent;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.story.api.di.StoriesComponent;
import com.vk.superapp.api.states.VkAuthState;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.io.IOException;
import xsna.fzu0;
import xsna.l7v;
import xsna.odw;
import xsna.qfa0;
import xsna.zrh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mag implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mag(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        odw qdwVar;
        WebApiApplication v;
        fzu0 view;
        int i = 11;
        switch (this.b) {
            case 0:
                return ((NewsFeedComponent) ((k7m) m7m.f((nag) this.c)).a(fpf0.a(NewsFeedComponent.class))).G2();
            case 1:
                View view2 = (View) this.c;
                int i2 = CommentsOutherFragment.h0;
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (childAt.getId() != R.id.comments_outher_jump_to_end) {
                        bwt0.r0(iah0.f().widthPixels - ModalPostCommonFragment.a0, childAt);
                    }
                }
                return s3q0.a;
            case 2:
                return ((SearchCommunitiesOnMapComponent) ((k7m) m7m.f((CommunitiesCatalogRootVh) this.c)).mo408a(fpf0.a(SearchCommunitiesOnMapComponent.class))).ma();
            case 3:
                tmh tmhVar = ((vmh) this.c).a;
                dw20 dw20Var = tmhVar.g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                tmhVar.d.invoke(CommunityProfileAction.e.d.f.b);
                return s3q0.a;
            case 4:
                ((CommunityNotificationSettingsFragment) this.c).finish();
                return s3q0.a;
            case 5:
                return ((ArticleComponent) ((h7m) this.c).mo408a(fpf0.a(ArticleComponent.class))).d0();
            case 6:
                ((zrh) ((zrh.a) this.c).m).i.invoke();
                return s3q0.a;
            case 7:
                ((r4i) this.c).c.b();
                return s3q0.a;
            case 8:
                i1j i1jVar = (i1j) this.c;
                View findViewById = i1jVar.c.findViewById(R.id.voip_join_room_button);
                bwt0.i0(findViewById, new ozh(i1jVar, 4));
                return findViewById;
            case 9:
                CreateAlbumFragment createAlbumFragment = (CreateAlbumFragment) this.c;
                bpn0 bpn0Var = createAlbumFragment.U;
                int i4 = CreateAlbumFragment.Z;
                bpn0 bpn0Var2 = createAlbumFragment.R;
                return (qfa0.a) ((PhotosComponent) bpn0Var.getValue()).F4().c(!epx.f((UserId) bpn0Var2.getValue(), UserId.d) ? (UserId) bpn0Var2.getValue() : ((PhotosComponent) bpn0Var.getValue()).z8().b()).j.getValue();
            case 10:
                DeprecatedAttachActivity deprecatedAttachActivity = (DeprecatedAttachActivity) this.c;
                int i5 = DeprecatedAttachActivity.K0;
                deprecatedAttachActivity.getClass();
                GraffitiFragment graffitiFragment = new GraffitiFragment();
                Bundle bundle = new Bundle();
                String str = deprecatedAttachActivity.n0;
                if (str != null) {
                    bundle.putString("graffiti_avatar", str);
                }
                String str2 = deprecatedAttachActivity.o0;
                if (str2 != null) {
                    bundle.putString("graffiti_title", str2);
                }
                graffitiFragment.setArguments(bundle);
                return graffitiFragment;
            case 11:
                egm egmVar = (egm) this.c;
                VkEnhancedImageView vkEnhancedImageView = new VkEnhancedImageView(egmVar.d, null, 6, 0);
                vkEnhancedImageView.setId(R.id.dialog_item_status_icon);
                vkEnhancedImageView.setScaleType(ScaleType.CENTER_INSIDE);
                vkEnhancedImageView.setLayoutParams(egm.W(egmVar, cn70.b(20), cn70.b(20), cn70.b(2), cn70.b(1), 0, 0, 48));
                egmVar.b.addView(vkEnhancedImageView);
                return vkEnhancedImageView;
            case 12:
                ztm ztmVar = (ztm) this.c;
                boolean b = ztmVar.b();
                mxj mxjVar = ztmVar.c;
                if (b) {
                    ((jtm) mxjVar.invoke()).c();
                    ((jtm) mxjVar.invoke()).b(ztmVar.b);
                } else {
                    ztmVar.a();
                }
                return s3q0.a;
            case 13:
                DiscoverMediaTabFragment2 discoverMediaTabFragment2 = (DiscoverMediaTabFragment2) this.c;
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                return discoverMediaTabFragment2.ho();
            case 14:
                omo omoVar = (omo) this.c;
                int i6 = DiscoverSearchFragment.s0;
                omoVar.onDismiss();
                return s3q0.a;
            case 15:
                return "Can't allocate storage space: " + ((IOException) this.c);
            case 16:
                DraftsListFragment draftsListFragment = (DraftsListFragment) this.c;
                qcy<Object>[] qcyVarArr2 = DraftsListFragment.Q;
                return new eeo(new wcj(draftsListFragment, 8));
            case 17:
                ((nfu) this.c).getClass();
                throw null;
            case 18:
                return (TextView) ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) this.c).c.findViewById(R.id.user_info);
            case 19:
                lxp lxpVar = (lxp) this.c;
                mxp mxpVar = lxpVar.e;
                VkAuthState vkAuthState = lxpVar.d;
                mxpVar.getClass();
                vkAuthState.d.put("force_remove_link", String.valueOf(1));
                p66.j0(mxpVar, vkAuthState, null, null, null, 30);
                return s3q0.a;
            case 20:
                dsq dsqVar = (dsq) this.c;
                dsqVar.n.invoke(dsqVar.m);
                return s3q0.a;
            case 21:
                return "File " + ((u7r) this.c).a + " does not exist";
            case 22:
                return new acs(((ads) this.c).c);
            case 23:
                nwy nwyVar = ((PhotoEditorComponentImpl) ((k7m) m7m.f(GalleryFragmentImpl.this)).a(fpf0.a(PhotoEditorComponent.class))).c;
                qcy<Object> qcyVar = PhotoEditorComponentImpl.e[1];
                return (naa0) nwyVar.c();
            case 24:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) this.c;
                int i7 = GalleryFragmentImpl.R0;
                return ((StoriesComponent) ((k7m) m7m.f(galleryFragmentImpl)).a(fpf0.a(StoriesComponent.class))).F8();
            case 25:
                GeoPostsFragment geoPostsFragment = (GeoPostsFragment) this.c;
                qcy<Object>[] qcyVarArr3 = GeoPostsFragment.q0;
                return new dlt(new n1i(geoPostsFragment, i));
            case 26:
                taj0 taj0Var = (taj0) this.c;
                qcy<Object>[] qcyVarArr4 = GoogleUMPComponentImpl.b;
                return taj0Var;
            case 27:
                return new u6v(((l7v.a) this.c).a);
            case 28:
                ImItemListFragment imItemListFragment = (ImItemListFragment) this.c;
                qcy<Object>[] qcyVarArr5 = ImItemListFragment.S;
                xbw l = ((ImRxEventObserverComponent) m7m.d(imItemListFragment).a(fpf0.a(ImRxEventObserverComponent.class))).l();
                lzv g = ((ImCmdRxExecutorComponent) m7m.d(imItemListFragment).a(fpf0.a(ImCmdRxExecutorComponent.class))).g();
                f1w b0 = ((ImConfigurationComponent) m7m.d(imItemListFragment).a(fpf0.a(ImConfigurationComponent.class))).b0();
                mjg w7 = ((ImCommonCommandsFactoryComponent) m7m.d(imItemListFragment).mo408a(fpf0.a(ImCommonCommandsFactoryComponent.class))).w7();
                f9w b2 = e9w.b("ImItemList");
                int i8 = ((r5w) imItemListFragment.N.getValue()).b;
                esz f = ((r5w) imItemListFragment.N.getValue()).c.f();
                fai faiVar = new fai();
                l7w l7wVar = new l7w(l);
                nz8 nz8Var = new nz8(g, w7);
                g6w g6wVar = new g6w();
                xtz xtzVar = new xtz();
                v49 v49Var = new v49(g, w7);
                nuf0 nuf0Var = new nuf0();
                io.reactivex.rxjava3.subjects.f<b6w> fVar = l7wVar.b;
                tz tzVar = new tz(new cws(l7wVar, i), 22);
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                fVar.getClass();
                d6w d6wVar = new d6w(new io.reactivex.rxjava3.internal.operators.observable.s1(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(fVar, tzVar, kVar), io.reactivex.rxjava3.internal.functions.a.d, new q46(l7wVar, 3)), new do3(new com.vk.movika.sdk.base.observable.e0(23), 19)).U(new e40(new p2u(2), 17)).Y(l7wVar.c), new q5w(g, w7));
                zq3 zq3Var = new zq3(16);
                asu0 asu0Var = asu0.a;
                asu0Var.getClass();
                e7w e7wVar = new e7w(new zrz(nz8Var, xtzVar, v49Var, nuf0Var, g6wVar, d6wVar, zq3Var, asu0.w(), asu0Var.c(), i8, faiVar, new s101(), f, false));
                z5w z5wVar = new z5w((r5w) imItemListFragment.N.getValue(), e7wVar, new n8w(g, w7), new c5w(g, w7, asu0Var.c(), b2));
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                com.vk.ecomm.catalog.impl.geo.a aVar = new com.vk.ecomm.catalog.impl.geo.a(new k8w(l, new tum(a1wVar), e7wVar, b2));
                a1w a1wVar2 = q1w.a;
                if (a1wVar2 == null) {
                    a1wVar2 = null;
                }
                g8w g8wVar = new g8w(new dfz(a1wVar2, new d02()));
                a1w a1wVar3 = q1w.a;
                if (a1wVar3 == null) {
                    a1wVar3 = null;
                }
                tta ttaVar = new tta(a1wVar3, asu0Var);
                a1w a1wVar4 = q1w.a;
                a1w a1wVar5 = a1wVar4 != null ? a1wVar4 : null;
                mxv c = g2v.c();
                Peer q = a1wVar5.q();
                q.getClass();
                if (q.Ab(Peer.Type.GROUP)) {
                    odw.a.getClass();
                    qdwVar = odw.a.b;
                } else {
                    qdwVar = new qdw(a1wVar5, c.g());
                }
                return new s6w(b0.a(), new a6w(z5wVar, aVar, g8wVar, ttaVar, new r8w(qdwVar), (jsm) imItemListFragment.O.getValue()), ((ImReportersComponent) m7m.d(imItemListFragment).a(fpf0.a(ImReportersComponent.class))).K(), b2);
            default:
                g4y g4yVar = (g4y) this.c;
                fvv0 fvv0Var = g4yVar.b;
                if (fvv0Var != null && (v = fvv0Var.v()) != null) {
                    v.r = true;
                    fzu0.a aVar2 = g4yVar.c;
                    if (aVar2 != null && (view = aVar2.getView()) != null) {
                        view.G9(v);
                    }
                }
                return s3q0.a;
        }
    }
}
