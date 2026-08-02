package xsna;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ironsource.X3;
import com.vk.api.generated.groups.dto.GroupsGetAddressesResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.bridges.ImageViewer;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.clips.attachments.impl.publish.cta.donut.presentation.fragment.ClipCtaWithDonutFragment;
import com.vk.clips.design.view.correction.CorrectionsRecyclerView;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.playlists.ui.picker.f;
import com.vk.clips.viewer.impl.utils.ClipsUnauthorizedException;
import com.vk.common.links.LaunchContext;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.Group;
import com.vk.dto.hints.HintId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.im.ui.views.RestrictionVKEnhancedImageView;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.photos.root.albumdetails.presentation.d;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsFragment;
import com.vk.profile.community.suggestions.impl.ui.suggestions.f;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.gva;
import xsna.ky6;
import xsna.lbf;
import xsna.mtg;
import xsna.mwa;
import xsna.p29;
import xsna.tj50;
import xsna.xak;
import xsna.xcw0;
import xsna.xy1;
import xsna.z180;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class kf1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kf1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0530  */
    /* JADX WARN: Type inference failed for: r2v102, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v99, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ViewGroup viewGroup;
        List<VKApiExecutionException> v;
        VKApiExecutionException vKApiExecutionException;
        int i = this.b;
        int i2 = 2;
        int i3 = 15;
        int i4 = 5;
        VKApiExecutionException vKApiExecutionException2 = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((gg1) obj2).T(new d.m((PhotoAlbum) obj));
                return s3q0.a;
            case 1:
                ((zak0) ((us1) obj2).b).setValue(Boolean.FALSE);
                return s3q0.a;
            case 2:
                wo6 wo6Var = ((zo6) obj2).d;
                if (wo6Var != null) {
                    wo6Var.g0();
                }
                return s3q0.a;
            case 3:
                return new st6((mt6) obj2);
            case 4:
                q68 q68Var = (q68) obj2;
                ImageView imageView = q68Var.o;
                float f = 48;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f));
                layoutParams.gravity = 17;
                imageView.setLayoutParams(layoutParams);
                imageView.setImageDrawable((RLottieDrawable) obj);
                wro0 wro0Var = q68Var.l.n;
                wro0Var.getClass();
                int i5 = Preference.j().getInt("three_dots_animation_counter", 0);
                ky6.a aVar = (ky6.a) Preference.j().edit();
                aVar.putInt("three_dots_animation_counter", i5 + 1);
                aVar.a();
                wro0Var.a = true;
                return s3q0.a;
            case 5:
                ke8 ke8Var = (ke8) obj2;
                int i6 = BroadcastConfigFragment.U;
                me8 me8Var = (me8) ((it80) obj).a;
                ke8Var.a();
                ViewGroup viewGroup2 = ke8Var.f;
                if (!ke8Var.A) {
                    for (ViewParent parent = viewGroup2.getParent(); parent != null; parent = parent.getParent()) {
                        if (parent instanceof ViewGroup) {
                            ViewGroup viewGroup3 = (ViewGroup) parent;
                            if (viewGroup3.getLayoutParams().width != -2 && viewGroup3.getLayoutParams().height != -2) {
                                viewGroup = parent instanceof ViewGroup ? parent : null;
                                if (viewGroup != null) {
                                    viewGroup2 = viewGroup;
                                }
                                mk5 mk5Var = new mk5();
                                mk5Var.g(0);
                                mk5Var.excludeChildren((View) ke8Var.m, true);
                                mk5Var.excludeChildren((View) ke8Var.o, true);
                                mk5Var.excludeChildren((View) ke8Var.s, true);
                                zmp0.a(viewGroup2, mk5Var);
                            }
                        }
                    }
                    if (parent instanceof ViewGroup) {
                    }
                    if (viewGroup != null) {
                    }
                    mk5 mk5Var2 = new mk5();
                    mk5Var2.g(0);
                    mk5Var2.excludeChildren((View) ke8Var.m, true);
                    mk5Var2.excludeChildren((View) ke8Var.o, true);
                    mk5Var2.excludeChildren((View) ke8Var.s, true);
                    zmp0.a(viewGroup2, mk5Var2);
                }
                ke8Var.x.b(me8Var);
                ke8Var.A = false;
                return s3q0.a;
            case 6:
                p29.c cVar = (p29.c) obj;
                o29 o29Var = ((b29) obj2).i1;
                if (o29Var != null) {
                    View view = o29Var.f;
                    p29.d dVar = cVar.b;
                    bwt0.p0(view, dVar.a);
                    o29.a(o29Var.c, dVar.b, o29Var.d, true);
                    bwt0.p0(o29Var.g, cVar.c.a);
                    o29Var.e.setText(cVar.a.a);
                    View view2 = o29Var.n;
                    p29.e eVar = cVar.d;
                    bwt0.p0(view2, eVar.a);
                    o29.a(o29Var.h, eVar.b, o29Var.i, true);
                    o29.a(o29Var.j, eVar.c, o29Var.k, true);
                    o29.a(o29Var.l, eVar.d, o29Var.m, true);
                    o29.a(o29Var.o, cVar.e.a, o29Var.p, false);
                    o29.a(o29Var.q, cVar.f.a, o29Var.r, true);
                }
                return s3q0.a;
            case 7:
                ((a89) obj2).q(xcw0.c.a);
                return s3q0.a;
            case 8:
                ((jo9) obj2).b.a((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 9:
                oba obaVar = (oba) obj2;
                qcy<Object>[] qcyVarArr = oba.l1;
                if (((z180) obj) instanceof z180.b) {
                    obaVar.hide();
                }
                return s3q0.a;
            case 10:
                return new Pair(Integer.valueOf(((gva.a) obj2).a), (mwa.a) obj);
            case 11:
                Attach attach = (Attach) obj2;
                View view3 = (View) obj;
                RestrictionVKEnhancedImageView restrictionVKEnhancedImageView = view3 instanceof RestrictionVKEnhancedImageView ? (RestrictionVKEnhancedImageView) view3 : null;
                if (restrictionVKEnhancedImageView == null) {
                    return s3q0.a;
                }
                AttachImage attachImage = (AttachImage) attach;
                restrictionVKEnhancedImageView.setLocalImage(attachImage.r);
                restrictionVKEnhancedImageView.setRemoteImage(attachImage.q);
                ahn.e();
                if (ddg0.a.c(attachImage)) {
                    restrictionVKEnhancedImageView.setRestrictions(attachImage.v);
                } else {
                    restrictionVKEnhancedImageView.setRestrictions(null);
                }
                return s3q0.a;
            case 12:
                ((sgb) obj2).f.c((Throwable) obj, new com.vk.movika.sdk.base.ui.o0(i4));
                return s3q0.a;
            case 13:
                ((ftb) obj2).e.K();
                return s3q0.a;
            case 14:
                Throwable th = (Throwable) obj;
                xyb.C.a(th);
                if (((xyb) obj2).A != null) {
                    zk70.e(th);
                }
                return s3q0.a;
            case 15:
                ClickableSticker clickableSticker = (ClickableSticker) obj2;
                b.d dVar2 = (b.d) obj;
                if (clickableSticker != null) {
                    dVar2.b(clickableSticker.zb().zb(), "clickable_sticker");
                }
                return s3q0.a;
            case 16:
                ClipCtaWithDonutFragment clipCtaWithDonutFragment = (ClipCtaWithDonutFragment) obj2;
                mpc mpcVar = (mpc) obj;
                qcy<Object>[] qcyVarArr2 = ClipCtaWithDonutFragment.T;
                if (mpcVar.equals(jpc.a)) {
                    clipCtaWithDonutFragment.finish();
                } else if (mpcVar instanceof lpc) {
                    clipCtaWithDonutFragment.getParentFragmentManager().k0(yfb.b(new Pair(clipCtaWithDonutFragment.eo().f, ((lpc) mpcVar).a)), clipCtaWithDonutFragment.eo().g);
                    clipCtaWithDonutFragment.finish();
                } else {
                    if (!(mpcVar instanceof kpc)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((qdz) clipCtaWithDonutFragment.N.getValue()).e().d(clipCtaWithDonutFragment.requireContext(), Uri.parse(((kpc) mpcVar).a), LaunchContext.A, null);
                }
                return s3q0.a;
            case 17:
                bgd bgdVar = (bgd) obj2;
                String str = (String) obj;
                if (str.length() > 0) {
                    bgdVar.a = str;
                }
                return s3q0.a;
            case 18:
                ClipsEditorInputVideoItem clipsEditorInputVideoItem = (ClipsEditorInputVideoItem) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.e(clipsEditorInputVideoItem.b.getPath(), X3.i.b);
                w9yVar.d(Long.valueOf(clipsEditorInputVideoItem.c), "start_ms");
                w9yVar.d(Long.valueOf(clipsEditorInputVideoItem.d), "end_ms");
                w9yVar.g("mask", clipsEditorInputVideoItem.e);
                w9yVar.g("music", clipsEditorInputVideoItem.f);
                File file = clipsEditorInputVideoItem.g;
                w9yVar.e(file != null ? file.getPath() : null, "rev_file");
                w9yVar.e(clipsEditorInputVideoItem.h.name(), "transcoding_state");
                w9yVar.g("filter_info", clipsEditorInputVideoItem.i);
                w9yVar.b(Boolean.valueOf(clipsEditorInputVideoItem.j), "is_timer");
                w9yVar.e(Float.valueOf(clipsEditorInputVideoItem.k), "speed");
                w9yVar.g("transform", clipsEditorInputVideoItem.l);
                w9yVar.b(Boolean.valueOf(clipsEditorInputVideoItem.m), "photo");
                w9yVar.e(clipsEditorInputVideoItem.n.name(), "audio_effect");
                w9yVar.g("audio_config", clipsEditorInputVideoItem.o);
                w9yVar.g("video_config", clipsEditorInputVideoItem.p);
                w9yVar.g("location", clipsEditorInputVideoItem.q);
                w9yVar.g("volume", clipsEditorInputVideoItem.r);
                return s3q0.a;
            case 19:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj2;
                int i7 = ClipsFavoriteFolderContentListFragment.W;
                clipsFavoriteFolderContentListFragment.go(new np5(i2, (ClipsFavoriteFolderContentListViewState.g) obj, clipsFavoriteFolderContentListFragment));
                return s3q0.a;
            case 20:
                com.vk.clips.playlists.ui.picker.d dVar3 = (com.vk.clips.playlists.ui.picker.d) obj2;
                tj50.a aVar2 = (tj50.a) obj;
                i50 i50Var = new i50(dVar3, i3);
                ao8 ao8Var = ao8.d;
                return new f.a(aVar2.a(i50Var, ao8Var), aVar2.a(new t9e(dVar3, i2), ao8Var));
            case 21:
                ((hjf) obj2).b(new lbf.c.n.b((OrdData) obj));
                return s3q0.a;
            case 22:
                yp80 yp80Var = (yp80) obj2;
                Throwable th2 = (Throwable) obj;
                VKApiExecutionException vKApiExecutionException3 = th2 instanceof VKApiExecutionException ? (VKApiExecutionException) th2 : null;
                if (vKApiExecutionException3 == null || (v = vKApiExecutionException3.v()) == null || (vKApiExecutionException = v.get(0)) == null) {
                    Throwable cause = th2.getCause();
                    if (cause instanceof VKApiExecutionException) {
                        vKApiExecutionException2 = (VKApiExecutionException) cause;
                    }
                } else {
                    vKApiExecutionException2 = vKApiExecutionException;
                }
                yp80Var.onError((vKApiExecutionException2 == null || vKApiExecutionException2.s() != 15) ? th2 : new ClipsUnauthorizedException(th2));
                L.i(th2);
                return s3q0.a;
            case 23:
                ((trg) obj2).h = ((GroupsGetAddressesResponseDto) obj).getCount();
                return EmptyList.b;
            case 24:
                CommunityNotificationSettingsFragment.e.a aVar3 = (CommunityNotificationSettingsFragment.e.a) obj2;
                Throwable th3 = (Throwable) obj;
                if ((th3 instanceof VKApiExecutionException) && ((VKApiExecutionException) th3).J()) {
                    cvk.u(R.string.access_error, false);
                }
                ((VkCell) aVar3.itemView).setRight(aVar3.q6((CommunityNotificationSettingsFragment.e) aVar3.m));
                return s3q0.a;
            case 25:
                dsh dshVar = (dsh) obj2;
                VKList vKList = (VKList) obj;
                g5g.y(vKList, dshVar.f);
                dshVar.b = vKList.j();
                dshVar.a = vKList.size() + dshVar.a;
                dshVar.c = vKList.i();
                ImageViewer.c<Photo> cVar2 = dshVar.h;
                if (cVar2 != null) {
                    cVar2.c(vKList);
                }
                return s3q0.a;
            case 26:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d dVar4 = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) obj2;
                dVar4.T(new e.d(((Boolean) obj).booleanValue()));
                dVar4.T(new e.r(dVar4.l.a(HintId.GROUP_COMMUNITY_REVIEW_MANAGE_PIN_SUBSCRIPTION_ONBOARDING.getId())));
                return s3q0.a;
            case 27:
                CommunitySuggestionsFragment communitySuggestionsFragment = (CommunitySuggestionsFragment) obj2;
                com.vk.profile.community.suggestions.impl.ui.suggestions.f fVar = (com.vk.profile.community.suggestions.impl.ui.suggestions.f) obj;
                int i8 = CommunitySuggestionsFragment.X;
                if (fVar instanceof f.c) {
                    com.vk.profile.community.suggestions.impl.ui.suggestions.c cVar3 = communitySuggestionsFragment.R;
                    if (cVar3 == null) {
                        cVar3 = null;
                    }
                    f.c cVar4 = (f.c) fVar;
                    CommunitySuggestionsFragment communitySuggestionsFragment2 = cVar3.a;
                    if (cVar4.equals(f.c.a.a)) {
                        h3p0.b(communitySuggestionsFragment2);
                    } else if (cVar4 instanceof f.c.b) {
                        f.c.b bVar = (f.c.b) cVar4;
                        gd60.Z0(cVar3.b, communitySuggestionsFragment2.requireContext(), fkq0.e(bVar.a.c), null, bVar.b, 4);
                    } else {
                        if (!(cVar4 instanceof f.c.C1638c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f.c.C1638c c1638c = (f.c.C1638c) cVar4;
                        new mtg.a(communitySuggestionsFragment2.requireContext(), c1638c.a, c1638c.b, c1638c.c, ((LinksBridgeComponent) m7m.d(communitySuggestionsFragment2).a(fpf0.a(LinksBridgeComponent.class))).p().e()).I0(null);
                    }
                } else if (fVar instanceof f.a) {
                    f.a aVar4 = (f.a) fVar;
                    ((y2i) communitySuggestionsFragment.W.getValue()).b(aVar4.a, new h3i(communitySuggestionsFragment, aVar4), new xy1.b(aVar4.c));
                } else if (fVar instanceof f.b) {
                    f.b bVar2 = (f.b) fVar;
                    b7h b7hVar = (b7h) communitySuggestionsFragment.V.getValue();
                    Group group = bVar2.a;
                    String str2 = communitySuggestionsFragment.S;
                    b7hVar.a(group, str2 != null ? str2 : null, bVar2.b);
                } else {
                    if (!(fVar instanceof f.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.vk.profile.community.suggestions.impl.ui.suggestions.g gVar = communitySuggestionsFragment.Q;
                    (gVar != null ? gVar : null).g.notifyItemChanged(((f.d) fVar).a);
                }
                return s3q0.a;
            case 28:
                int intValue = ((Integer) obj).intValue();
                nwj nwjVar = ((CorrectionsRecyclerView) obj2).h;
                hg6<T> hg6Var = nwjVar.c;
                if (hg6Var != null) {
                    ListDataSet.ArrayListImpl<T> arrayListImpl = ((ListDataSet) hg6Var).d;
                    int i9 = 0;
                    while (i9 < arrayListImpl.size()) {
                        lwj lwjVar = (lwj) arrayListImpl.get(i9);
                        boolean z = i9 == intValue;
                        if (lwjVar.d != z) {
                            lwjVar.d = z;
                            if (!z) {
                                lwjVar.c = false;
                            }
                            nwjVar.c.d(i9);
                        }
                        s3q0 s3q0Var = s3q0.a;
                        i9++;
                    }
                }
                nwjVar.f.invoke(hg6Var.c(intValue));
                return s3q0.a;
            default:
                xak xakVar = (xak) obj2;
                gcp gcpVar = (gcp) obj;
                if (gcpVar.a) {
                    com.vk.registration.funnels.b.a.getClass();
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.VK_MAIL_CREATED, null, null, null, null, null, null, 254);
                    xakVar.z0(true);
                    return s3q0.a;
                }
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ERROR_VK_MAIL_CREATED, null, null, null, null, null, null, 254);
                xakVar.z0(false);
                qak qakVar = xakVar.D;
                String str3 = gcpVar.b;
                if (str3 == null || drm0.N(str3)) {
                    str3 = xakVar.b.getString(R.string.vk_auth_create_email_error_email_busy);
                }
                xakVar.A0(qak.a(qakVar, false, str3, false, 5));
                xakVar.D0(gcpVar.c);
                throw new xak.c();
        }
    }

    public /* synthetic */ kf1(qkc qkcVar, ClickableSticker clickableSticker) {
        this.b = 15;
        this.c = clickableSticker;
    }
}
