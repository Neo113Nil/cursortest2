package xsna;

import android.content.Context;
import android.widget.ImageView;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.screen.h.b;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.libverify.LibverifyPresenter;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.core.video.view.FirstPinnedTabLayout;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.friends.FriendsCatalogRootVh;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.ecomm.market.album.MarketEditAlbumFinishedFragment;
import com.vk.ecomm.market.api.filters.di.MarketProductFilterComponent;
import com.vk.im.chat.clips.decoration.impl.di.DialogClipsContextScopedImpl;
import com.vk.im.design.view.counter.ImVkCounter;
import com.vk.log.L;
import com.vk.movika.impl.di.MovikaComponentImpl;
import com.vk.music.fragment.impl.MusicCatalogFragment;
import com.vk.music.subscription.api.di.MusicSubscriptionComponent;
import com.vk.newsfeed.common.posting.listfriends.ListFriendsIconDrawable;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.fragment.DiscoverSearchFragment.c;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVh;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.design.view.multiaccount.avatar.VkProfileAvatarView;
import com.vk.superapp.vkworkout.VkWorkoutBridgeDelegatesFactory;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import ru.ok.android.utils.Logger;
import xsna.e3m;
import xsna.egm;
import xsna.g8i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ecm implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ecm(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x024b, code lost:
    
        if (r7 == false) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[LOOP:1: B:128:0x021c->B:143:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x025c  */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.vk.newsfeed.common.posting.listfriends.ListFriendsIconDrawable$IconSizes] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i;
        UIBlockCatalog uIBlockCatalog;
        FirstPinnedTabLayout firstPinnedTabLayout;
        Object[] objArr;
        Object[] objArr2;
        ExposedFunction invoke$lambda$37;
        int i2 = this.b;
        boolean z = true;
        boolean z2 = false;
        Object obj = this.c;
        switch (i2) {
            case 0:
                DialogClipsContextScopedImpl dialogClipsContextScopedImpl = (DialogClipsContextScopedImpl) obj;
                return new dcm(dialogClipsContextScopedImpl.a.getExperiments(), dialogClipsContextScopedImpl.b.b0(), dialogClipsContextScopedImpl.c.l(), dialogClipsContextScopedImpl.d.g(), dialogClipsContextScopedImpl.e.g());
            case 1:
                egm egmVar = (egm) obj;
                ImVkCounter imVkCounter = new ImVkCounter(egmVar.d, 0);
                imVkCounter.setId(R.id.dialog_item_extra_icon);
                imVkCounter.setImageScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imVkCounter.setRenderMode(ImVkCounter.DrawMode.IMAGE);
                imVkCounter.setSize(VkCounter.Size.Medium);
                imVkCounter.setContentDescription(null);
                egm.b bVar = egmVar.m;
                imVkCounter.setLayoutParams(egm.W(egmVar, (bVar != null ? bVar : null).g, (bVar != null ? bVar : null).g, (bVar != null ? bVar : 0).h, 0, 0, 0, 56));
                egmVar.b.addView(imVkCounter);
                return imVkCounter;
            case 2:
                DiscoverSearchFragment discoverSearchFragment = (DiscoverSearchFragment) obj;
                int i3 = DiscoverSearchFragment.s0;
                qcr a = ((MarketProductFilterComponent) m7m.d(discoverSearchFragment).mo408a(fpf0.a(MarketProductFilterComponent.class))).b4().a(discoverSearchFragment.requireContext(), discoverSearchFragment, discoverSearchFragment.Y, discoverSearchFragment.new c(), discoverSearchFragment.requireContext().getString(R.string.catalog_market_hint_category));
                hg1.a(a.d().subscribe(new wn(new l2k(discoverSearchFragment, 5), 22), new is1(new DiscoverSearchFragment.f(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 23)), discoverSearchFragment);
                return a;
            case 3:
                ((nfu) obj).getClass();
                throw null;
            case 4:
                return Float.valueOf(((klo) obj).a().I0(jlo.b));
            case 5:
                return (VkProfileAvatarView) ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) obj).c.findViewById(R.id.user_avatar);
            case 6:
                return ((com.vk.attachpicker.screen.h) obj).new b();
            case 7:
                ((xmp) obj).z.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.ALERT, "", "", "email_did_not_send_alert"));
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CLOSE_ALERT, arrayList, null, null, null, null, null, 252);
                return s3q0.a;
            case 8:
                return "File " + ((u7r) obj).a + " does not exist or it is not a file";
            case 9:
                FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = (FirstPinnedTabLayoutVh) obj;
                UIBlockCatalog uIBlockCatalog2 = firstPinnedTabLayoutVh.z;
                ViewPagerVh viewPagerVh = firstPinnedTabLayoutVh.b;
                if (uIBlockCatalog2 != null) {
                    Iterator<UIBlock> it = uIBlockCatalog2.A.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i4 = -1;
                        } else if (!epx.f(it.next().b, viewPagerVh.p)) {
                            i4++;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i4);
                    if (i4 <= 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        i = valueOf.intValue();
                        uIBlockCatalog = firstPinnedTabLayoutVh.z;
                        if (uIBlockCatalog != null) {
                            if (((Boolean) firstPinnedTabLayoutVh.o.getValue()).booleanValue()) {
                                ArrayList<UIBlock> arrayList2 = uIBlockCatalog.A;
                                if (arrayList2 == null || !arrayList2.isEmpty()) {
                                    for (UIBlock uIBlock : arrayList2) {
                                        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
                                        if (uIBlockList != null) {
                                            Regex regex = new Regex(".+/(vk)?video.*/discover");
                                            String str = uIBlockList.M;
                                            if (str != null ? regex.f(str) : false) {
                                                objArr = true;
                                                if (objArr == false) {
                                                    objArr2 = true;
                                                    break;
                                                }
                                            }
                                        }
                                        objArr = false;
                                        if (objArr == false) {
                                        }
                                    }
                                }
                                objArr2 = false;
                                break;
                            }
                            z = false;
                            z2 = z;
                        }
                        firstPinnedTabLayout = firstPinnedTabLayoutVh.p;
                        if (firstPinnedTabLayout == null) {
                            firstPinnedTabLayout = null;
                        }
                        DisableableViewPager disableableViewPager = viewPagerVh.o;
                        return new plr(firstPinnedTabLayout, disableableViewPager != null ? disableableViewPager : null, i, z2);
                    }
                }
                i = 0;
                uIBlockCatalog = firstPinnedTabLayoutVh.z;
                if (uIBlockCatalog != null) {
                }
                firstPinnedTabLayout = firstPinnedTabLayoutVh.p;
                if (firstPinnedTabLayout == null) {
                }
                DisableableViewPager disableableViewPager2 = viewPagerVh.o;
                return new plr(firstPinnedTabLayout, disableableViewPager2 != null ? disableableViewPager2 : null, i, z2);
            case 10:
                ((wh50) obj).setValue(Boolean.valueOf(!((Boolean) r5.getValue()).booleanValue()));
                return s3q0.a;
            case 11:
                return Boolean.valueOf(((FriendsCatalogRootVh) obj).m.b.b.c(false));
            case 12:
                int i5 = GalleryFragmentImpl.R0;
                ((j3t) ((GalleryFragmentImpl) obj).G0.getValue()).b = 0;
                return s3q0.a;
            case 13:
                return ((SearchParamsComponent) ((k7m) m7m.f((GlobalSearchGroupsCatalogRootVh) obj)).a(fpf0.a(SearchParamsComponent.class))).oa();
            case 14:
                invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37((HandleInvocationsFromAdViewer) obj);
                return invoke$lambda$37;
            case 15:
                return efz.b(((g8i.a) obj).c, "ms]", new StringBuilder("#doStopBgSync finished ["));
            case 16:
                return ((l4y) obj).o(VkWorkoutBridgeDelegatesFactory.DelegateType.GET_WORKOUT_PERMISSION_HC);
            case 17:
                return new f4y((r6y) obj);
            case 18:
                return Integer.valueOf(((mc90) obj).o());
            case 19:
                return ((fyy) obj).b.invoke();
            case 20:
                LibverifyPresenter libverifyPresenter = (LibverifyPresenter) obj;
                CheckPresenterInfo checkPresenterInfo = libverifyPresenter.x;
                if (checkPresenterInfo instanceof CheckPresenterInfo.Auth) {
                    com.vk.auth.main.b bVar2 = libverifyPresenter.d;
                    (bVar2 != null ? bVar2 : null).L0(libverifyPresenter.H);
                } else if (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) {
                    com.vk.auth.main.e eVar = libverifyPresenter.o;
                    (eVar != null ? eVar : null).d();
                } else if (checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth) {
                    com.vk.auth.main.e eVar2 = libverifyPresenter.o;
                    (eVar2 != null ? eVar2 : null).d();
                } else if (checkPresenterInfo instanceof CheckPresenterInfo.Validation) {
                    com.vk.auth.main.b bVar3 = libverifyPresenter.d;
                    (bVar3 != null ? bVar3 : null).K0(libverifyPresenter.I, ((CheckPresenterInfo.Validation) checkPresenterInfo).c);
                } else {
                    if (!(checkPresenterInfo instanceof CheckPresenterInfo.MethodSelectorAuth)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.vk.auth.main.e eVar3 = libverifyPresenter.o;
                    (eVar3 != null ? eVar3 : null).d();
                }
                return s3q0.a;
            case 21:
                return new ListFriendsIconDrawable(((com.vk.newsfeed.common.posting.listfriends.a) obj).d, (ListFriendsIconDrawable.IconSizes) r4, 6);
            case 22:
                com.vk.libvideo.live.impl.views.live.b bVar4 = (com.vk.libvideo.live.impl.views.live.b) obj;
                bVar4.pause();
                nnz nnzVar = bVar4.Z;
                if (nnzVar != null) {
                    yg5 yg5Var = nnzVar.f;
                    if (yg5Var != null) {
                        yg5Var.T(nnzVar.p);
                    }
                    c63 c63Var = c63.a;
                    c63.c(nnzVar.o);
                }
                return s3q0.a;
            case 23:
                return (o2i) obj;
            case 24:
                int i6 = MarketEditAlbumFinishedFragment.Q;
                return ((BridgeComponent) m7m.d((MarketEditAlbumFinishedFragment) obj).a(fpf0.a(BridgeComponent.class))).p().f();
            case 25:
                pz00 pz00Var = (pz00) obj;
                u1c0 J0 = pz00Var.J0();
                ol60 ol60Var = J0 != null ? J0.h : null;
                if (ol60Var instanceof py00) {
                    py00 py00Var = (py00) ol60Var;
                    if (py00Var.k) {
                        r530 r530Var = py00Var.i;
                        q530 q530Var = pz00Var.C;
                        if (epx.f(q530Var != null ? Boolean.valueOf(q530Var.b(r530Var.b, r530Var.c)) : null, Boolean.TRUE)) {
                            return s3q0.a;
                        }
                        pz00Var.onClick(pz00Var.E);
                        return s3q0.a;
                    }
                }
                return s3q0.a;
            case 26:
                return new fcx(((MovikaComponentImpl) obj).a.e2());
            case 27:
                Context t = ((xt30) obj).t();
                e3m.a aVar = e3m.a;
                return m33.a(R.drawable.vkim_msg_part_transparent_black_bg, t).mutate();
            case 28:
                f440 f440Var = ((y440) obj).S;
                if (f440Var != null) {
                    f440Var.L2();
                }
                return s3q0.a;
            default:
                int i7 = MusicCatalogFragment.W;
                return ((MusicSubscriptionComponent) m7m.d((MusicCatalogFragment) obj).a(fpf0.a(MusicSubscriptionComponent.class))).q1();
        }
    }
}
