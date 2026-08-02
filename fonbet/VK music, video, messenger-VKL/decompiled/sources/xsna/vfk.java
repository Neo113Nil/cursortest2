package xsna;

import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vk.friends.requests.impl.allrequests.presentation.FriendRequestsTabFragment;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.posting.crop_editor.presentation.base.fragment.CropEditorFragment;
import com.vk.profile.community.members.impl.ui.d;
import com.vk.superapp.api.dto.app.catalog.SectionButton;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkMerchantInfo;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Triple;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.an20;
import xsna.bi10;
import xsna.cp20;
import xsna.ij20;
import xsna.kyu;
import xsna.lbv;
import xsna.u8m;
import xsna.v1j;
import xsna.x7a;
import xsna.ytm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vfk implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vfk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, xsna.wr90] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Photos photos = null;
        boolean z = true;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = CropEditorFragment.W;
                ((CropEditorFragment) obj2).getFeature().C((ofk) obj);
                break;
            case 1:
                cfm cfmVar = (cfm) obj2;
                u8m u8mVar = (u8m) obj;
                cfmVar.getClass();
                if (!epx.f(u8mVar, u8m.w0.b) && !epx.f(u8mVar, u8m.h.b)) {
                    z = false;
                }
                efm efmVar = cfmVar.e;
                if (efmVar != null) {
                    efmVar.o(z);
                }
                cfmVar.z(u8mVar);
                break;
            case 2:
                alm almVar = (alm) obj2;
                DialogTheme dialogTheme = (DialogTheme) obj;
                almVar.h.onNext(dialogTheme);
                almVar.e.onNext(dialogTheme);
                break;
            case 3:
                ((fum) obj2).O(new ytm.d0((Set) obj));
                break;
            case 4:
                break;
            case 5:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                wr90 wr90Var = (wr90) ref$ObjectRef.element;
                VkMerchantInfo vkMerchantInfo = wr90Var.e;
                ref$ObjectRef.element = new wr90(wr90Var.a, wr90Var.b, wr90Var.c, wr90Var.d, new VkMerchantInfo(vkMerchantInfo.b, (String) obj, vkMerchantInfo.d, vkMerchantInfo.e), wr90Var.f, wr90Var.g, wr90Var.h, wr90Var.i, wr90Var.j, wr90Var.k, wr90Var.l);
                break;
            case 6:
                ((Float) obj).floatValue();
                break;
            case 7:
                g1p g1pVar = (g1p) obj2;
                SessionRoomId.Room room = g1pVar.g1;
                if (room != null) {
                    a2j a2jVar = g1pVar.f1;
                    if (a2jVar != null) {
                        a2jVar.C(new v1j.o(room));
                    }
                    g1pVar.tn();
                }
                break;
            case 8:
                break;
            case 9:
                vkq vkqVar = (vkq) obj2;
                List list = (List) obj;
                itz0 itz0Var = vkqVar.a;
                UserId userId = vkqVar.g;
                boolean z2 = vkqVar.i;
                ArrayList arrayList = new ArrayList(z2 ? 1 : list.size() + 1);
                cn o = ((b25) itz0Var.b).o();
                UserId userId2 = o.a;
                String str = o.b;
                String str2 = o.c;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(new t39(userId2, str, str2, o.j, false, userId.equals(userId2)));
                if (z2) {
                    arrayList.add(asz.b);
                } else {
                    List<Group> list2 = list;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                    for (Group group : list2) {
                        arrayList2.add(new t39(fkq0.e(group.c), group.d, group.e, group.n0, true, userId.equals(fkq0.e(group.c))));
                    }
                    arrayList.addAll(arrayList2);
                }
                break;
            case 10:
                FriendRequestsTabFragment friendRequestsTabFragment = (FriendRequestsTabFragment) obj2;
                UserProfile userProfile = (UserProfile) obj;
                int i2 = FriendRequestsTabFragment.X0;
                ((NewsFeedBridgeComponent) j6i.b(m7m.f(friendRequestsTabFragment), NewsFeedBridgeComponent.class)).Ad().s0(friendRequestsTabFragment.kn(), userProfile.c, null, userProfile.J);
                break;
            case 11:
                att attVar = (att) obj2;
                PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) j5g.a0((List) obj);
                if (photosPhotoDto != null) {
                    attVar.getClass();
                    boolean z3 = false;
                    Owner owner = new Owner(photosPhotoDto.q(), null, null, null, null, null, null, null, null, null, null, null, null, false, false, z3, false, null, 0, null, null, false, 4194302, null);
                    photos = new Photos(9, photosPhotoDto.getId(), photosPhotoDto.q().b, owner, photosPhotoDto.k(), new ArrayList(), 1, null, pwu.b(owner), new ArrayList(), new NewsEntryWithAttachments.Cut(-1, -1, 1.0f, z3, 8, 0 == true ? 1 : 0), new NewsEntry.TrackData(null, 0, 0L, false, false, null, null, 0, 255, null));
                }
                break;
            case 12:
                Throwable th = (Throwable) obj;
                qcy<Object>[] qcyVarArr2 = GoodFragment.U0;
                cvk.w(j03.g(((GoodFragment) obj2).getActivity(), th, R.string.error), false);
                com.vk.metrics.eventtracking.b.a.a(th);
                break;
            case 13:
                break;
            case 14:
                kyu.c cVar = (kyu.c) obj2;
                k8r0 k8r0Var = cVar.o;
                SectionButton sectionButton = ((x7a.b) cVar.getItem()).g.d;
                k8r0Var.f(sectionButton != null ? sectionButton.c : null, ((x7a.b) cVar.getItem()).g.b.b, ((x7a.b) cVar.getItem()).e, null);
                break;
            case 15:
                ((cbv) obj2).p.onNext(lbv.e.a);
                break;
            case 16:
                z5w z5wVar = (z5w) obj2;
                z5wVar.b.a(z5wVar.a.a);
                break;
            case 17:
                int i3 = ImSelectContactsFragment.v0;
                ((ImSelectContactsFragment) obj2).eo();
                break;
            case 18:
                break;
            case 19:
                String str3 = (String) obj;
                yks0 yks0Var = ((i8z) obj2).k;
                if (yks0Var != null) {
                    yks0Var.b = str3;
                }
                break;
            case 20:
                break;
            case 21:
                ((mi00) obj2).b.c();
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                List list3 = (List) obj;
                list3.add(0, bi10.f.a);
                if (((sg10) obj2).a.g.a()) {
                    list3.add(1, bi10.a.a);
                }
                break;
            case 25:
                j220 j220Var = (j220) obj2;
                g47 g47Var = (g47) obj;
                g47Var.b(tci.l(j220Var));
                g47Var.a(tci.k(j220Var));
                g47Var.d(new d.a(j220Var));
                break;
            case 26:
                SuperAppAnimationConfig superAppAnimationConfig = (SuperAppAnimationConfig) obj2;
                k720 k720Var = k720.a;
                k720.Z(superAppAnimationConfig, (Triple) obj);
                break;
            case 27:
                ((ij20.a) obj).l(((ve20) obj2).d);
                break;
            case 28:
                an20 an20Var = (an20) obj2;
                ((zak0) an20Var.b).setValue((an20.a) an20Var.a.get((String) obj));
                break;
            default:
                vo20 vo20Var = (vo20) obj2;
                io.reactivex.rxjava3.subjects.f<cp20> fVar = vo20Var.p;
                if (((Boolean) obj).booleanValue()) {
                    cp20.b bVar = cp20.b.a;
                    if (vo20Var.r) {
                        fVar.onNext(bVar);
                    }
                } else {
                    cp20.a aVar = cp20.a.a;
                    if (vo20Var.r) {
                        fVar.onNext(aVar);
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
