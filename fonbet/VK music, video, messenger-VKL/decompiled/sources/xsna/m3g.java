package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dialogslist.impl.DialogsFragment;
import com.vk.documents.ui.fragments.DocumentsViewFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.friends.api.presentation.FriendsListType;
import com.vk.friends.api.presentation.FriendsSelectionType;
import com.vk.friends.impl.friends.presentation.fragment.FriendsSelectionFragment;
import com.vk.friends.impl.friends.presentation.fragment.PaginatedFriendsListFragment;
import com.vk.music.onboarding.impl.di.InternalOnboardingComponent;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$MediaPicker$Album$ReloadLocalAlbums;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragment;
import com.vk.socialgraph.init.GeoRequestFragmentContainer;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseArguments;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseFragment;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.sdk.api.ExternApiConfigProviderImpl;
import xsna.h0k0;
import xsna.k840;
import xsna.nzb;
import xsna.vrh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class m3g implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m3g(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        s3q0 clearSessionInfoAsync$lambda$0;
        FragmentImpl a;
        List<UserId> list;
        ExposedFunction invoke$lambda$45;
        int i = this.b;
        boolean z = true;
        byte b = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((n3g) obj).g = false;
                break;
            case 1:
                ((nzb.d) obj).invoke();
                break;
            case 2:
                ((y1h) obj).h.invoke();
                break;
            case 3:
                cch cchVar = (cch) obj;
                mre mreVar = cchVar.j;
                if (mreVar != null) {
                    mreVar.invoke(cchVar.g.b);
                }
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                com.vk.im.ui.components.contacts.c cVar = (com.vk.im.ui.components.contacts.c) obj;
                b25 b25Var = cVar.k;
                cau0 cau0Var = cVar.i.r().h;
                o25.b(b25Var);
                break;
            case 7:
                wh50 wh50Var = ((rfj) obj).e;
                ((zak0) wh50Var).setValue(Boolean.valueOf(true ^ ((Boolean) ((zak0) wh50Var).getValue()).booleanValue()));
                break;
            case 8:
                CoverChooseFragment coverChooseFragment = (CoverChooseFragment) obj;
                qcy<Object>[] qcyVarArr = CoverChooseFragment.P;
                Bundle requireArguments = coverChooseFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("arguments", CoverChooseArguments.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    ?? parcelable3 = requireArguments.getParcelable("arguments");
                    parcelable = (CoverChooseArguments) (parcelable3 instanceof CoverChooseArguments ? parcelable3 : null);
                }
                v0k v0kVar = new v0k((CoverChooseArguments) parcelable);
                l7m d = m7m.d(coverChooseFragment);
                CoverChooseFragmentInternalComponent.e.getClass();
                break;
            case 9:
                break;
            case 10:
                Iterator<plm> it = ((flm) obj).a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ?? next = it.next();
                        if (((plm) next).c().isEmpty()) {
                            r3 = next;
                        }
                    }
                }
                break;
            case 11:
                int i2 = DialogsFragment.c0;
                Bundle arguments = ((DialogsFragment) obj).getArguments();
                if (arguments == null || (r0 = (Peer) arguments.getParcelable("owner_id")) == null) {
                    break;
                }
                break;
            case 12:
                DocumentsViewFragment documentsViewFragment = (DocumentsViewFragment) obj;
                int i3 = DocumentsViewFragment.x0;
                if (documentsViewFragment.getActivity() != null) {
                    gvn.a(gvn.a, documentsViewFragment, 100, false, 0, 0, 60);
                    break;
                }
                break;
            case 13:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                ref$ObjectRef.element = null;
                break;
            case 14:
                break;
            case 15:
                clearSessionInfoAsync$lambda$0 = ExternApiConfigProviderImpl.clearSessionInfoAsync$lambda$0((ExternApiConfigProviderImpl) obj);
                break;
            case 16:
                vrh0.a aVar = ((zuq) obj).i;
                if (aVar != null) {
                    aVar.d();
                }
                break;
            case 17:
                FriendsFragment friendsFragment = (FriendsFragment) obj;
                ?? r0 = friendsFragment.h0;
                if (friendsFragment.W) {
                    gqs gqsVar = (gqs) r0.getValue();
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_ONLINE;
                    iqs iqsVar = new iqs(friendsFragment.V, com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen), mobileOfficialAppsCoreNavStat$EventScreen, FriendsListType.ONLINE, friendsFragment.a0);
                    FriendsSelectionType friendsSelectionType = FriendsSelectionType.SINGLE;
                    UserId[] userIdArr = friendsFragment.Y;
                    if (userIdArr == null || (list = rl3.u0(userIdArr)) == null) {
                        list = EmptyList.b;
                    }
                    a = gqsVar.b(iqsVar, friendsSelectionType, list);
                    if (a instanceof FriendsSelectionFragment) {
                        FriendsSelectionFragment friendsSelectionFragment = (FriendsSelectionFragment) a;
                        friendsSelectionFragment.r0 = friendsFragment.n0;
                        friendsSelectionFragment.u0 = friendsFragment.eo();
                        friendsSelectionFragment.v0 = true;
                    }
                } else {
                    gqs gqsVar2 = (gqs) r0.getValue();
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_ONLINE;
                    a = gqsVar2.a(new iqs(friendsFragment.V, com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen2), mobileOfficialAppsCoreNavStat$EventScreen2, FriendsListType.ONLINE, friendsFragment.a0));
                    if (a instanceof PaginatedFriendsListFragment) {
                        ((PaginatedFriendsListFragment) a).n0 = true;
                    }
                }
                break;
            case 18:
                xvy xvyVar = (xvy) obj;
                int d2 = xvyVar.j().d() - 1;
                xuy xuyVar = (xuy) j5g.k0(xvyVar.j().f());
                if (xuyVar != null && xuyVar.getIndex() < d2) {
                    z = false;
                }
                break;
            case 19:
                int i4 = GeoRequestFragmentContainer.Q;
                break;
            case 20:
                break;
            case 21:
                x7u x7uVar = (x7u) obj;
                u7u u7uVar = x7uVar.o;
                if (u7uVar != null) {
                    x7uVar.l.c(new f210(u7uVar.d, u7uVar.b, u7uVar.c, u7uVar.i.c.a.toString(), u7uVar.f, u7uVar.g, false));
                }
                break;
            case 22:
                invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45((HandleInvocationsFromAdViewer) obj);
                break;
            case 23:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                break;
            case 24:
                InternalOnboardingComponent internalOnboardingComponent = (InternalOnboardingComponent) obj;
                InternalOnboardingComponent.b bVar = internalOnboardingComponent.a;
                String canonicalName = bVar.a.getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = "";
                }
                String str = bVar.b;
                s750 s750Var = k840.a.e;
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                whz whzVar = (whz) obj;
                VkImageSimple vkImageSimple = (VkImageSimple) whzVar.getView().findViewById(R.id.watch_later_button);
                bwt0.i0(vkImageSimple, new zqh(whzVar, 23));
                bwt0.p0(vkImageSimple, whzVar.y);
                break;
            case 28:
                ((LocalMediaPickerFragment) obj).V.invoke(PostingAction$MediaPicker$Album$ReloadLocalAlbums.b);
                break;
            default:
                ((df00) obj).b(h0k0.g.a);
                break;
        }
        return s3q0.a;
    }
}
