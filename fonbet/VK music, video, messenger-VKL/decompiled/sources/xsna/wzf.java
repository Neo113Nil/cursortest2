package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.auth.dto.AuthValidateEmailResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsInviteLinksDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGenericResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.auth.enteremail.binding.BindEnteredEmailArgs;
import com.vk.catalog2.common.ui.mvp.holder.friends.FriendsCatalogRootVh;
import com.vk.clips.design.view.editor.CorrectionView;
import com.vk.clips.playlists.ui.modal.EmptyPlaylistBottomSheet;
import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.clips.filters.FilterInfo;
import com.vk.dto.clips.filters.HslInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.masks.Mask;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.profile.Address;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.reviews.impl.allreviews.presentation.e;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.newsfeed.api.data.NewsfeedGetResponse;
import com.vk.newsfeed.impl.data.network.dto.mappers.NewsfeedItemMapper;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.ivm.a;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.community.details.api.invitelink.data.dto.CommunityInviteLink;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.aiq0;
import xsna.cse;
import xsna.eqe;
import xsna.f3t.b;
import xsna.jdt;
import xsna.qis0;
import xsna.qr60;
import xsna.tj50;
import xsna.vmu;
import xsna.wgv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class wzf implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wzf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        UserId userId;
        e2i e2iVar;
        HslInfo a;
        EditorState.b bVar;
        List<EditorState.b> list;
        char c = 1;
        Mask mask = null;
        switch (this.b) {
            case 0:
                bm01 bm01Var = (bm01) this.c;
                NewsfeedGenericResponseDto newsfeedGenericResponseDto = (NewsfeedGenericResponseDto) obj;
                NewsfeedGetResponse newsfeedGetResponse = new NewsfeedGetResponse(newsfeedGenericResponseDto.g());
                newsfeedGetResponse.isSmartNews = Boolean.valueOf(epx.f(newsfeedGenericResponseDto.d(), "top"));
                List<NewsfeedNewsfeedItemDto> f = newsfeedGenericResponseDto.f();
                ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                for (NewsfeedNewsfeedItemDto newsfeedNewsfeedItemDto : f) {
                    NewsfeedItemMapper newsfeedItemMapper = (NewsfeedItemMapper) bm01Var.b;
                    List<UsersUserFullDto> i = newsfeedGenericResponseDto.i();
                    List<GroupsGroupFullDto> e = newsfeedGenericResponseDto.e();
                    newsfeedItemMapper.getClass();
                    k2r0 k2r0Var = new k2r0();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<UsersUserFullDto> it = i.iterator();
                    while (it.hasNext()) {
                        Owner a2 = k2r0Var.a(it.next());
                        linkedHashMap.put(a2.b, a2);
                    }
                    Iterator<GroupsGroupFullDto> it2 = e.iterator();
                    while (it2.hasNext()) {
                        Owner a3 = equ.a(it2.next());
                        linkedHashMap.put(a3.b, a3);
                    }
                    arrayList.add(newsfeedItemMapper.a(newsfeedNewsfeedItemDto, linkedHashMap));
                }
                newsfeedGetResponse.addAll(arrayList);
                return newsfeedGetResponse;
            case 1:
                Address address = (Address) obj;
                CommunityAddressesFragment.g gVar = ((vqg) this.c).c.S;
                (gVar != null ? gVar : null).b(address);
                return s3q0.a;
            case 2:
                com.vk.profile.community.details.impl.invitelink.a aVar = (com.vk.profile.community.details.impl.invitelink.a) this.c;
                GroupsInviteLinksDto groupsInviteLinksDto = (GroupsInviteLinksDto) obj;
                Integer i2 = groupsInviteLinksDto.i();
                UserId g = groupsInviteLinksDto.g();
                UserId q = groupsInviteLinksDto.q();
                String url = groupsInviteLinksDto.getUrl();
                Long d = groupsInviteLinksDto.d();
                long longValue = d != null ? d.longValue() : 0L;
                Long f2 = groupsInviteLinksDto.f();
                long longValue2 = f2 != null ? f2.longValue() : 0L;
                Integer e2 = groupsInviteLinksDto.e();
                int intValue = e2 != null ? e2.intValue() : 0;
                Integer j = groupsInviteLinksDto.j();
                aVar.b.jo(new CommunityInviteLink(i2, g, q, url, longValue, longValue2, intValue, j != null ? j.intValue() : 0));
                return s3q0.a;
            case 3:
                ((dsh) this.c).i = true;
                return s3q0.a;
            case 4:
                ((mvh) this.c).t();
                return s3q0.a;
            case 5:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d dVar = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) this.c;
                dVar.T(new e.C1018e(((Boolean) obj).booleanValue(), dVar.l.a(HintId.GROUP_COMMUNITY_REVIEW_PIN_ONBOARDING.getId())));
                return s3q0.a;
            case 6:
                o1i o1iVar = (o1i) this.c;
                Bitmap bitmap = (Bitmap) obj;
                UserId c2 = ((b25) o1iVar.w.getValue()).c();
                UserProfile userProfile = o1iVar.c.a;
                if (bitmap == null || (str = userProfile.e) == null || (userId = userProfile.c) == null) {
                    e2iVar = null;
                } else {
                    StringBuilder sb = new StringBuilder("https://");
                    sb.append(a0a.d);
                    sb.append('/');
                    sb.append(fkq0.b(userId) ? "club" : "id");
                    sb.append(fkq0.a(userId).b);
                    Uri parse = Uri.parse(sb.toString());
                    e2iVar = new e2i(c2.b, "profile-" + userProfile.c.b, str, bitmap, parse);
                }
                if (e2iVar != null) {
                    Context context = o1iVar.q;
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, e2iVar.e);
                    intent.setPackage(context.getPackageName());
                    intent.addFlags(67108864);
                    String str2 = e2iVar.b;
                    zgj0 zgj0Var = new zgj0();
                    zgj0Var.a = context;
                    zgj0Var.b = str2;
                    String str3 = e2iVar.c;
                    zgj0Var.e = str3;
                    zgj0Var.f = str3;
                    zgj0Var.h = IconCompat.c(e2iVar.d);
                    zgj0Var.c = new Intent[]{intent};
                    PersistableBundle persistableBundle = new PersistableBundle();
                    long j2 = e2iVar.a;
                    persistableBundle.putLong("creator_user_id", j2);
                    zgj0Var.n = persistableBundle;
                    if (TextUtils.isEmpty(zgj0Var.e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr = zgj0Var.c;
                    if (intentArr == null || intentArr.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    ArrayList f3 = bhj0.f(context);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = f3.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        if (epx.f(((zgj0) next).b, str2)) {
                            arrayList2.add(next);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        zgj0 zgj0Var2 = (zgj0) it4.next();
                        zgj0 zgj0Var3 = new zgj0();
                        zgj0Var3.a = zgj0Var2.a;
                        zgj0Var3.b = zgj0Var2.b;
                        Intent[] intentArr2 = zgj0Var2.c;
                        zgj0Var3.c = (Intent[]) Arrays.copyOf(intentArr2, intentArr2.length);
                        zgj0Var3.d = zgj0Var2.d;
                        zgj0Var3.e = zgj0Var2.e;
                        zgj0Var3.f = zgj0Var2.f;
                        zgj0Var3.g = zgj0Var2.g;
                        zgj0Var3.h = zgj0Var2.h;
                        zgj0Var3.k = zgj0Var2.k;
                        zgj0Var3.l = zgj0Var2.l;
                        zgj0Var3.m = zgj0Var2.m;
                        j1a0[] j1a0VarArr = zgj0Var2.i;
                        if (j1a0VarArr != null) {
                            zgj0Var3.i = (j1a0[]) Arrays.copyOf(j1a0VarArr, j1a0VarArr.length);
                        }
                        if (zgj0Var2.j != null) {
                            zgj0Var3.j = new HashSet(zgj0Var2.j);
                        }
                        PersistableBundle persistableBundle2 = zgj0Var2.n;
                        if (persistableBundle2 != null) {
                            zgj0Var3.n = persistableBundle2;
                        }
                        PersistableBundle persistableBundle3 = new PersistableBundle();
                        persistableBundle3.putLong("creator_user_id", j2);
                        zgj0Var3.n = persistableBundle3;
                        if (TextUtils.isEmpty(zgj0Var3.e)) {
                            throw new IllegalArgumentException("Shortcut must have a non-empty label");
                        }
                        Intent[] intentArr3 = zgj0Var3.c;
                        if (intentArr3 == null || intentArr3.length == 0) {
                            throw new IllegalArgumentException("Shortcut must have an intent");
                        }
                        arrayList3.add(zgj0Var3);
                    }
                    List j3 = bhj0.j(arrayList3);
                    if (Build.VERSION.SDK_INT <= 29) {
                        Iterator it5 = new ArrayList(j3).iterator();
                        while (it5.hasNext()) {
                            zgj0 zgj0Var4 = (zgj0) it5.next();
                            if (!bhj0.a(context, zgj0Var4)) {
                                ((ArrayList) j3).remove(zgj0Var4);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it6 = ((ArrayList) j3).iterator();
                    while (it6.hasNext()) {
                        arrayList4.add(((zgj0) it6.next()).b());
                    }
                    if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList4)) {
                        bhj0.e(context).getClass();
                        Iterator it7 = ((ArrayList) bhj0.d(context)).iterator();
                        while (it7.hasNext()) {
                            ((ygj0) it7.next()).getClass();
                        }
                    }
                    bhj0.b(context, arrayList3);
                    bhj0.l(context, zgj0Var, null);
                }
                return s3q0.a;
            case 7:
                CorrectionView correctionView = (CorrectionView) this.c;
                wgv wgvVar = (wgv) obj;
                FilterInfo filterInfo = correctionView.x;
                if (filterInfo != null) {
                    switch (wgv.a.$EnumSwitchMapping$0[wgvVar.a.ordinal()]) {
                        case 1:
                            a = HslInfo.a(filterInfo.e, wgvVar.a(), null, null, null, null, null, null, null, 254);
                            break;
                        case 2:
                            a = HslInfo.a(filterInfo.e, null, wgvVar.a(), null, null, null, null, null, null, 253);
                            break;
                        case 3:
                            a = HslInfo.a(filterInfo.e, null, null, wgvVar.a(), null, null, null, null, null, 251);
                            break;
                        case 4:
                            a = HslInfo.a(filterInfo.e, null, null, null, wgvVar.a(), null, null, null, null, 247);
                            break;
                        case 5:
                            a = HslInfo.a(filterInfo.e, null, null, null, null, wgvVar.a(), null, null, null, 239);
                            break;
                        case 6:
                            a = HslInfo.a(filterInfo.e, null, null, null, null, null, wgvVar.a(), null, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                            break;
                        case 7:
                            a = HslInfo.a(filterInfo.e, null, null, null, null, null, null, wgvVar.a(), null, 191);
                            break;
                        case 8:
                            a = HslInfo.a(filterInfo.e, null, null, null, null, null, null, null, wgvVar.a(), 127);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    FilterInfo a4 = FilterInfo.a(filterInfo, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, a, 7);
                    qis0.a aVar2 = correctionView.w;
                    if (aVar2 != null) {
                        aVar2.a(a4);
                    }
                    correctionView.x = a4;
                }
                return s3q0.a;
            case 8:
                ((alm) this.c).g.i((DialogTheme) obj);
                return s3q0.a;
            case 9:
                w2w w2wVar = (w2w) this.c;
                pdm c3 = w2wVar.I0().b().c();
                dhl0<spm, Integer> dhl0Var = c3.k;
                List<rdm> b = c3.b();
                ArrayList arrayList5 = new ArrayList(c5g.u(b, 10));
                Iterator<T> it8 = b.iterator();
                while (it8.hasNext()) {
                    arrayList5.add(Integer.valueOf(((rdm) it8.next()).a));
                }
                Map<Integer, spm> e3 = dhl0Var.e(arrayList5);
                int a5 = cq.a(w2wVar);
                Integer f4 = w2wVar.I0().b().c().f();
                return new xpp(e3, (f4 != null ? f4.intValue() : -1) < a5);
            case 10:
                return ((tlo0) obj).a((Context) this.c);
            case 11:
                j170 j170Var = (j170) obj;
                return new i4n(new qr60.a.g(j170Var.a, j170Var.b, j170Var.d, j170Var.e, j170Var.f, null, (a9q0) this.c, 32));
            case 12:
                ((vak0) ((ffn) this.c).l).g(((Float) obj).floatValue());
                return s3q0.a;
            case 13:
                a.j jVar = (a.j) this.c;
                EditorState editorState = (EditorState) obj;
                List<EditorState.b> list2 = editorState.d;
                EditorState.b bVar2 = editorState.c;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(editorState.b);
                f5p id = jVar.a.getId();
                g5p g5pVar = jVar.a;
                linkedHashMap2.put(id, g5pVar);
                boolean z = jVar.c;
                if (z) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(bVar2.c);
                    linkedHashMap3.put(g5pVar.getId(), g5pVar);
                    bVar = new EditorState.b(bVar2.a, bVar2.b, linkedHashMap3);
                } else {
                    bVar = bVar2;
                }
                if (z) {
                    ArrayList arrayList6 = new ArrayList(list2);
                    Iterator it9 = arrayList6.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            if (epx.f((EditorState.b) it9.next(), bVar2)) {
                                r2 = r6;
                            } else {
                                r6++;
                            }
                        }
                    }
                    arrayList6.remove(r2);
                    arrayList6.add(r2, bVar);
                    list = arrayList6;
                } else {
                    list = list2;
                }
                return EditorState.a(editorState, null, linkedHashMap2, bVar, list, jVar.b, null, null, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
            case 14:
                ((fcp) this.c).H0((vbu0) obj);
                return s3q0.a;
            case 15:
                EmptyPlaylistBottomSheet emptyPlaylistBottomSheet = (EmptyPlaylistBottomSheet) this.c;
                cse.a.C2680a c2680a = (cse.a.C2680a) obj;
                hqe hqeVar = emptyPlaylistBottomSheet.i.f;
                if (hqeVar != null) {
                    ArrayList arrayList7 = c2680a.b;
                    ArrayList arrayList8 = new ArrayList(c5g.u(arrayList7, 10));
                    Iterator it10 = arrayList7.iterator();
                    while (it10.hasNext()) {
                        arrayList8.add(((ClipsViewerAdapterComponent) emptyPlaylistBottomSheet.o.getValue()).e0().c((VideoFile) it10.next()));
                    }
                    hqeVar.b(new eqe.e(arrayList8, null));
                }
                return s3q0.a;
            case 16:
                xmp xmpVar = (xmp) this.c;
                AuthValidateEmailResponseDto authValidateEmailResponseDto = (AuthValidateEmailResponseDto) obj;
                com.vk.auth.main.e eVar = xmpVar.o;
                com.vk.auth.main.e eVar2 = eVar != null ? eVar : null;
                String e4 = authValidateEmailResponseDto.e();
                String str4 = xmpVar.y;
                boolean z2 = xmpVar.x;
                Integer f5 = authValidateEmailResponseDto.f();
                Integer d2 = authValidateEmailResponseDto.d();
                eVar2.getClass();
                eVar2.c.s(new BindEnteredEmailArgs(e4, str4, z2, f5, d2));
                return s3q0.a;
            case 17:
                EntriesListPresenter entriesListPresenter = (EntriesListPresenter) this.c;
                UserId userId2 = (UserId) obj;
                g5g.D(entriesListPresenter.d, true, new dkg(userId2, 14));
                com.vk.lists.b<u1c0> bVar3 = entriesListPresenter.c;
                wqp wqpVar = new wqp(userId2, r6);
                bVar3.b();
                g5g.D(bVar3.d, true, wqpVar);
                bVar3.a();
                entriesListPresenter.Y();
                return s3q0.a;
            case 18:
                ((a4s) this.c).b.e2(new aiq0.g.b(((Boolean) obj).booleanValue(), false));
                return s3q0.a;
            case 19:
                FriendsCatalogRootVh friendsCatalogRootVh = (FriendsCatalogRootVh) this.c;
                friendsCatalogRootVh.m.b.getClass();
                cks cksVar = friendsCatalogRootVh.m.b.l;
                if (cksVar != null) {
                    ((LinkedHashMap) cksVar.c).clear();
                }
                return s3q0.a;
            case 20:
                FriendsFragment friendsFragment = (FriendsFragment) this.c;
                UserProfile userProfile2 = (UserProfile) obj;
                int i3 = FriendsFragment.q0;
                friendsFragment.getClass();
                Intent intent2 = new Intent();
                intent2.putExtra("uid", userProfile2.c);
                intent2.putExtra("name", userProfile2.e);
                intent2.putExtra("photo", userProfile2.h);
                intent2.putExtra("user", userProfile2);
                friendsFragment.Mf(-1, intent2);
                return s3q0.a;
            case 21:
                return ((f3t) this.c).new b((ViewGroup) obj);
            case 22:
                gdt gdtVar = (gdt) this.c;
                tj50.a aVar3 = (tj50.a) obj;
                hdt hdtVar = new hdt(1, gdtVar, gdt.class, "provideCatalogState", "provideCatalogState(Lcom/vk/games/presentation/catalog/mvi/GamesCatalogState;)Lcom/vk/games/presentation/catalog/mvi/viewstate/GamesCatalogRender$ViewState;", 0);
                ao8 ao8Var = ao8.d;
                return new jdt.a(aVar3.a(hdtVar, ao8Var), aVar3.a(new com.vk.movika.sdk.base.logic.interactor.f(26), ao8Var), aVar3.a(new tuq(5), ao8Var), aVar3.a(new idt(1, gdtVar, gdt.class, "provideCategoryState", "provideCategoryState(Lcom/vk/games/presentation/catalog/mvi/GamesCatalogState;)Lcom/vk/games/presentation/catalog/mvi/viewstate/GamesCatalogRender$ViewState;", 0), ao8Var), aVar3.a(new d4r(c == true ? 1 : 0), ao8Var));
            case 23:
                ((izs) this.c).invoke(new vmu.c((ha70) ((snv) obj)));
                return s3q0.a;
            case 24:
                ImSelectContactsFragment imSelectContactsFragment = (ImSelectContactsFragment) this.c;
                if (((Boolean) obj).booleanValue()) {
                    int i4 = ImSelectContactsFragment.v0;
                } else {
                    VkTopBar vkTopBar = imSelectContactsFragment.Q;
                    if (vkTopBar == null) {
                        vkTopBar = null;
                    }
                    mhy.d(vkTopBar);
                    utk0 utk0Var = imSelectContactsFragment.s0;
                    utk0Var.getClass();
                    utk0Var.i(null, "");
                }
                return s3q0.a;
            case 25:
                com.vk.im.engine.reporters.syncstate.a aVar4 = (com.vk.im.engine.reporters.syncstate.a) this.c;
                ((j8) aVar4.c).f(5000, (Set) obj, aVar4.a.p().a(aVar4.d), aVar4.e);
                return s3q0.a;
            case 26:
                ((cdz) this.c).b.invoke();
                return s3q0.a;
            case 27:
                return new e.a(((tj50.a) obj).a(new d0w((com.vk.ecomm.reviews.impl.allreviews.presentation.d) this.c, 6), ao8.d));
            case 28:
                return new l410((ViewGroup) obj, ((n310) this.c).i);
            default:
                MasksWrap masksWrap = (MasksWrap) this.c;
                int i5 = MasksWrap.e0;
                com.vk.content.design.view.camera.a.o(masksWrap);
                Mask selectedMask = masksWrap.getSelectedMask();
                if (selectedMask != null) {
                    mask = selectedMask.zb();
                    mask.w = false;
                }
                masksWrap.setSelectedMask(mask);
                return s3q0.a;
        }
    }
}
