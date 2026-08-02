package xsna;

import android.app.ProgressDialog;
import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.all.ModalPostAllReactionsFragment;
import com.vk.profile.user.impl.ui.ModalUserProfileFragment;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.by40;
import xsna.cqc0;
import xsna.df50;
import xsna.dn90;
import xsna.k840;
import xsna.kdk0;
import xsna.nii0;
import xsna.qr60;
import xsna.qy40;
import xsna.sg60;
import xsna.tj50;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mi10 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mi10(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        RecyclerView recyclerView;
        int i = this.b;
        boolean z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ProgressDialog progressDialog = (ProgressDialog) obj2;
                int i2 = MasksWrap.e0;
                L.g("MasksWrap", (Throwable) obj);
                cvk.u(R.string.error, false);
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                break;
            case 1:
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj2;
                long currentTimeMillis = System.currentTimeMillis();
                L.e("MlEnhanceDebug", "Download result image time: " + (currentTimeMillis - ref$LongRef.element));
                ref$LongRef.element = currentTimeMillis;
                break;
            case 2:
                int i3 = ModalPostAllReactionsFragment.Z;
                ((ModalPostAllReactionsFragment) obj2).ho();
                break;
            case 3:
                int i4 = ModalUserProfileFragment.C0;
                ((ModalUserProfileFragment) obj2).a0();
                break;
            case 4:
                kw8 kw8Var = (kw8) obj;
                androidx.compose.ui.graphics.a a = androidx.compose.ui.graphics.b.a();
                androidx.compose.ui.graphics.d.a(a, ((r5j0) obj2).a(kw8Var.b.d(), kw8Var.b.getLayoutDirection(), kw8Var));
                break;
            case 5:
                rw40 rw40Var = (rw40) obj2;
                rw40Var.T(new by40.f0(z));
                rw40Var.w.b(qy40.a.b.b);
                rw40Var.x.b(MusicHapticEvent.ERROR);
                break;
            case 6:
                UserId userId = (UserId) obj2;
                bn40.g("AudioFollowOwner", (BaseBoolIntDto) obj);
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new v490(userId, true));
                break;
            case 7:
                df50.a.b bVar = (df50.a.b) obj;
                bf50 bf50Var = ((ve50) obj2).i1;
                (bf50Var != null ? bf50Var : null).a(bVar);
                break;
            case 8:
                qo50 qo50Var = (qo50) obj2;
                VkGroupHeader vkGroupHeader = new VkGroupHeader(((ViewGroup) obj).getContext());
                vkGroupHeader.setSize(VkGroupHeader.Size.Large);
                vkGroupHeader.setBackgroundResource(R.drawable.music_selectable_bg);
                vkGroupHeader.setOnClickListener(new mo3(qo50Var, 11));
                qo50Var.k = vkGroupHeader;
                qo50Var.Hn();
                break;
            case 9:
                sg60.a aVar = (sg60.a) obj2;
                aVar.a();
                sg60.this.e(new uf60(qr60.a.b.a));
                break;
            case 10:
                tj50.a aVar2 = (tj50.a) obj;
                xmz xmzVar = new xmz((f330) obj2);
                ao8 ao8Var = ao8.d;
                break;
            case 11:
                ((bn90) obj2).T(new dn90.b.a((Throwable) obj));
                break;
            case 12:
                Playlist playlist = ((h7b0) obj2).c;
                playlist.t = true;
                playlist.g = (PlaylistLink) ((Pair) obj).j();
                break;
            case 13:
                com.vk.newsfeed.impl.presenters.b bVar2 = (com.vk.newsfeed.impl.presenters.b) obj2;
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) j5g.a0((List) obj);
                if (usersUserFullDto != null) {
                    bVar2.P.getClass();
                    break;
                }
                break;
            case 14:
                break;
            case 15:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "PostingToolbar");
                qgi0.h(tgi0Var, ((dpc0) obj2).a);
                break;
            case 16:
                cqc0.c cVar = (cqc0.c) obj;
                bwt0.p0(cVar.e, true);
                bwt0.p0(cVar.a(), false);
                bwt0.p0((ModalSettingsPrivacyOption) cVar.l.getValue(), false);
                PhotoStackView photoStackView = cVar.f;
                List H0 = j5g.H0((List) obj2, 3);
                ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
                Iterator it = H0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UserProfile) it.next()).h);
                }
                PhotoStackView.b bVar3 = PhotoStackView.M;
                photoStackView.r(-1, arrayList);
                break;
            case 17:
                pvc0.this.f.a.f(new vxf0());
                break;
            case 18:
                int i5 = ProfileFriendsFragment.k0;
                zwd0 zwd0Var = (zwd0) ((ProfileFriendsFragment) obj2).S;
                if (zwd0Var != null) {
                    zwd0Var.Z7();
                }
                break;
            case 19:
                break;
            case 20:
                SearchDocumentsListFragment searchDocumentsListFragment = (SearchDocumentsListFragment) obj2;
                String str = (String) obj;
                int i6 = SearchDocumentsListFragment.h0;
                wun wunVar = searchDocumentsListFragment.S;
                if (wunVar != null) {
                    wunVar.clear();
                }
                searchDocumentsListFragment.io(0);
                wun wunVar2 = searchDocumentsListFragment.S;
                if (wunVar2 != null) {
                    wunVar2.T0(wunVar2.k);
                }
                VkRecyclerPaginatedView vkRecyclerPaginatedView = searchDocumentsListFragment.T;
                if (vkRecyclerPaginatedView != null && (recyclerView = vkRecyclerPaginatedView.getRecyclerView()) != null) {
                    recyclerView.scrollToPosition(0);
                }
                if (TextUtils.isEmpty(str) || TextUtils.getTrimmedLength(str) == 0) {
                    com.vk.lists.c cVar2 = searchDocumentsListFragment.X;
                    if (cVar2 != null) {
                        cVar2.v();
                    }
                    com.vk.lists.c cVar3 = searchDocumentsListFragment.Y;
                    if (cVar3 != null) {
                        cVar3.b(searchDocumentsListFragment.T, true, false, 0L, null);
                    }
                } else {
                    com.vk.lists.c cVar4 = searchDocumentsListFragment.Y;
                    if (cVar4 != null) {
                        cVar4.v();
                    }
                    com.vk.lists.c cVar5 = searchDocumentsListFragment.X;
                    if (cVar5 != null) {
                        cVar5.b(searchDocumentsListFragment.T, true, false, 0L, null);
                    }
                    com.vk.lists.c cVar6 = searchDocumentsListFragment.X;
                    if (cVar6 != null) {
                        cVar6.r(true);
                    }
                    com.vk.lists.c cVar7 = searchDocumentsListFragment.X;
                    if (cVar7 != null) {
                        cVar7.p(false);
                    }
                }
                break;
            case 21:
                bth0 bth0Var = (bth0) obj2;
                int intValue = ((Integer) obj).intValue();
                VideoSearchFiltersImpl videoSearchFiltersImpl = bth0Var.v;
                videoSearchFiltersImpl.i = bth0Var.w[intValue];
                videoSearchFiltersImpl.m = ((ecr) bth0Var.u.c.a.get(intValue)).getType();
                bth0Var.Q4();
                break;
            case 22:
                xii0 xii0Var = (xii0) obj2;
                L.i((Throwable) obj);
                xii0Var.e.invoke(new nii0.e(EmptyList.b, xii0Var.c.invoke()));
                break;
            case 23:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.r(tgi0Var2, "mvi_catalog_short_video_card_test_tag");
                bgi0.e(tgi0Var2, ((ShortVideoListView.e) obj2).i);
                break;
            case 24:
                xn50.a.c((odk0) obj2, new kdk0.a((RequestUserProfile) obj));
                break;
            case 25:
                ViewGroup viewGroup = (ViewGroup) obj;
                int i7 = b8l0.p;
                break;
            case 26:
                dw20 dw20Var = ((lal0) obj2).b;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                break;
            case 27:
                etj etjVar = ((ncl0) obj2).d;
                etjVar.getClass();
                n2i0.a(etjVar.b, hf8.a, new Intent("com.vkontakte.android.STICKERS_NUM_UPDATES"));
                break;
            case 28:
                s4m0 s4m0Var = ((n4m0) obj2).n;
                if (s4m0Var != null) {
                    s4m0Var.k();
                }
                break;
            default:
                ((Ref$FloatRef) obj2).element = ((Float) obj).floatValue();
                break;
        }
        return s3q0.a;
    }
}
