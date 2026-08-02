package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.GestureDetector;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.draftslist.impl.ui.DraftsListFragment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.folders.api.di.FoldersComponent;
import com.vk.im.design.view.counter.ImVkCounter;
import com.vk.im.engine.di.ImConfigurationComponent;
import com.vk.im.engine.event.observer.coroutines.di.ImCoroutinesEventObserverComponent;
import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.fragments.ContactsListFragmentRedesign;
import com.vk.money.createtransfer.people.CreatePeopleTransferFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.sharing.core.picker.GroupPickerActivity;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.location.js.bridge.api.di.JsLocationDelegateComponent;
import com.vkontakte.android.R;
import xsna.jtm;
import xsna.s1c0;
import xsna.zjh;
import xsna.zrh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class akh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ akh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if ((r0 instanceof xsna.ptm) != false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v91, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Image image;
        Object obj;
        Object parcelable;
        ExposedFunction invoke$lambda$29;
        jtm jtmVar;
        int i = this.b;
        int i2 = 20;
        byte b = 0;
        ptm ptmVar = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ImageSize imageSize = (ImageSize) j5g.a0(((PhotoAlbum) obj2).u.b);
                if (imageSize == null || (image = imageSize.d) == null) {
                    return null;
                }
                return image.d;
            case 1:
                ((zrh) ((zrh.a) obj2).m).h.invoke();
                return s3q0.a;
            case 2:
                ((o1i) obj2).t();
                return s3q0.a;
            case 3:
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) obj2;
                aVar.j.getClass();
                u90 u90Var = aVar.l;
                ContactsListFragmentRedesign.a aVar2 = new ContactsListFragmentRedesign.a();
                ContactsListFactory contactsListFactory = ContactsListFactory.CONTACTS_LIST_VKAPP;
                Bundle bundle = aVar2.j;
                bundle.putSerializable("factory", contactsListFactory);
                aVar2.s(true);
                aVar2.y(R.attr.im_ic_back_toolbar);
                bundle.putString("force_entry_point_for_new", null);
                bundle.putString("force_entry_point_for_create_contact", "contact_list_vk_create_contact");
                aVar2.m(u90Var);
                return s3q0.a;
            case 4:
                cjj cjjVar = (cjj) obj2;
                final Context requireContext = cjjVar.requireContext();
                final UserId userId = cjjVar.h1;
                final long j = cjjVar.i1;
                final ujj ujjVar = cjjVar.j1;
                return up2.d(new xqf(new d14(11), 9), new wb0() { // from class: xsna.okj
                    @Override // xsna.izs
                    /* renamed from: j */
                    public final qj50 invoke(sj50 sj50Var) {
                        return new gkj(requireContext, userId, j, ujjVar, sj50Var);
                    }
                }, svj.b);
            case 5:
                int i3 = CreateAlbumFragment.Z;
                return (PhotosComponent) m7m.d((CreateAlbumFragment) obj2).a(fpf0.a(PhotosComponent.class));
            case 6:
                CreatePeopleTransferFragment createPeopleTransferFragment = (CreatePeopleTransferFragment) obj2;
                int i4 = CreatePeopleTransferFragment.B0;
                Object obj3 = createPeopleTransferFragment.m0;
                ((h9k) (obj3 != null ? obj3 : null)).f();
                dw20 dw20Var = createPeopleTransferFragment.z0;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 7:
                DeprecatedAttachActivity deprecatedAttachActivity = (DeprecatedAttachActivity) obj2;
                int i5 = deprecatedAttachActivity.v.a;
                return deprecatedAttachActivity.C0.b(deprecatedAttachActivity.u0, i5, i5, deprecatedAttachActivity.Z, false, false, false);
            case 8:
                return new ylm(((pdm) obj2).b);
            case 9:
                ImVkCounter imVkCounter = new ImVkCounter(((egm) obj2).d, 0);
                imVkCounter.setId(R.id.dialog_item_unread_messages_count);
                return imVkCounter;
            case 10:
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                return ((DiscoverMediaTabFragment2) obj2).getView();
            case 11:
                DraftsListFragment draftsListFragment = (DraftsListFragment) obj2;
                qcy<Object>[] qcyVarArr2 = DraftsListFragment.Q;
                NewsFeedComponent newsFeedComponent = (NewsFeedComponent) m7m.d(draftsListFragment).a(fpf0.a(NewsFeedComponent.class));
                Bundle requireArguments = draftsListFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("owner_id", UserId.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("owner_id");
                    obj = (UserId) (parcelable2 instanceof UserId ? parcelable2 : null);
                }
                return new DraftsListFragment.b(draftsListFragment, (UserId) obj, newsFeedComponent);
            case 12:
                Object obj4 = ((dpp) obj2).o;
                com.vk.auth.enterphone.a aVar3 = (com.vk.auth.enterphone.a) (obj4 != null ? obj4 : null);
                aVar3.getClass();
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SELECT_COUNTRY, null, null, null, null, null, null, 254);
                aVar3.e.c(AuthStatSender.Screen.PHONE, AuthStatSender.Status.DEFAULT, AuthStatSender.Element.CHOOSE_COUNTRY_BUTTON);
                cpp cppVar = (cpp) aVar3.a;
                if (cppVar != null) {
                    cppVar.rb();
                }
                return s3q0.a;
            case 13:
                return ((AudienceResearchComponent) ((k7m) m7m.f((EntriesListPresenter) obj2)).a(fpf0.a(AudienceResearchComponent.class))).Z2();
            case 14:
                ld20 ld20Var = ((kxp) obj2).a;
                SignUpRouter.a.a((SignUpRouter) ld20Var.b, null, null, null, ((SignUpDataHolder) ld20Var.c).I, 7);
                return s3q0.a;
            case 15:
                return (ucg0) ((bsq) obj2).S.getValue();
            case 16:
                kyr kyrVar = (kyr) obj2;
                return io.reactivex.rxjava3.core.q.m(kyrVar.b.getState(), kyrVar.c.b(kyrVar.a), new rx0(new oq2(b, 4), 22));
            case 17:
                return new com.vk.im.popup.b(((t1s) obj2).R());
            case 18:
                evs evsVar = (evs) obj2;
                got gotVar = new got(evsVar, evsVar.E.K, new c5f(evsVar, i2), (bmq) evsVar.X.getValue());
                GestureDetector gestureDetector = new GestureDetector(evsVar.w, gotVar);
                gestureDetector.setOnDoubleTapListener(gotVar);
                return gestureDetector;
            case 19:
                ((GalleryFragmentImpl) obj2).A0 = null;
                return s3q0.a;
            case 20:
                return Integer.valueOf(((mc90) obj2).k());
            case 21:
                qcy<Object>[] qcyVarArr3 = GeoPostsFragment.q0;
                s1c0.a aVar4 = new s1c0.a();
                aVar4.b = true;
                sf2 sf2Var = new sf2();
                sf2Var.b = ((GeoPostsFragment) obj2).h0.get();
                aVar4.s = sf2Var.a();
                aVar4.F = false;
                aVar4.G = MobileOfficialAppsConStoriesStat$ViewEntryPoint.PLACE_STORY_LIST;
                return aVar4.a();
            case 22:
                int i6 = GroupPickerActivity.G;
                return ((SharingComponent) ((GroupPickerActivity) obj2).D.getValue()).jc();
            case 23:
                invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29((HandleInvocationsFromAdViewer) obj2);
                return invoke$lambda$29;
            case 24:
                quv quvVar = (quv) obj2;
                return new itv(((StoryViewerComponent) ((k7m) m7m.c(quvVar)).a(fpf0.a(StoryViewerComponent.class))).l9(), quvVar.d, new q5f(quvVar, 27), new enh(quvVar, i2));
            case 25:
                return (ImCoroutinesEventObserverComponent) ((g8m) obj2).a(fpf0.a(ImCoroutinesEventObserverComponent.class));
            case 26:
                ImItemListFragment imItemListFragment = (ImItemListFragment) obj2;
                qcy<Object>[] qcyVarArr4 = ImItemListFragment.S;
                f1w b0 = ((ImConfigurationComponent) m7m.d(imItemListFragment).a(fpf0.a(ImConfigurationComponent.class))).b0();
                a2s R2 = ((FoldersComponent) m7m.d(imItemListFragment).a(fpf0.a(FoldersComponent.class))).R2();
                int h = b0.b().h();
                int d = b0.b().d();
                ?? r0 = imItemListFragment;
                while (true) {
                    if (r0 == 0) {
                        r0 = imItemListFragment.getActivity();
                        break;
                    } else if (!(r0 instanceof ptm)) {
                        r0 = r0.getParentFragment();
                    }
                }
                ptmVar = r0;
                ptm ptmVar2 = ptmVar;
                if (ptmVar2 == null || (jtmVar = ptmVar2.p2()) == null) {
                    jtm.a.getClass();
                    jtmVar = jtm.a.b;
                }
                return new r5w(h, d, jtmVar, new ImItemListFragment.b(), new ImItemListFragment.c(R2));
            case 27:
                ecw ecwVar = (ecw) obj2;
                ecwVar.a.requestFocus();
                ecwVar.d = false;
                return s3q0.a;
            case 28:
                r6y r6yVar = (r6y) obj2;
                com.vk.superapp.location.js.bridge.api.di.b k2 = ((JsLocationDelegateComponent) x6y.H().a(fpf0.a(JsLocationDelegateComponent.class))).k2();
                fvv0 M = r6yVar.M();
                fvv0 M2 = r6yVar.M();
                return k2.a(M, r6yVar, M2 != null ? M2.d() : null, new n1i(r6yVar, i2));
            default:
                com.vk.auth.main.e eVar = ((k3z) obj2).o;
                (eVar != null ? eVar : null).d();
                return s3q0.a;
        }
    }

    public /* synthetic */ akh(zjh.b bVar, PhotoAlbum photoAlbum) {
        this.b = 0;
        this.c = photoAlbum;
    }
}
