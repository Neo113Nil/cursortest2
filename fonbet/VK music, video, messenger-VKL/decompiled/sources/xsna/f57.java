package xsna;

import android.view.View;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.database.dto.DatabaseCityDto;
import com.vk.api.generated.database.dto.DatabaseGetCitiesResponseDto;
import com.vk.api.generated.groups.dto.GroupsAddressDto;
import com.vk.api.generated.groups.dto.GroupsGetAddressesResponseDto;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.internal.data.FragmentNavigationControllerState;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.group.Group;
import com.vk.dto.music.Playlist;
import com.vk.feed.design.view.newsfeed.topbar.FeedTopBar;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.e;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.search.params.api.domain.model.education.EducationalInstitution;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.d;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.q2j;
import xsna.tre;
import xsna.u8m;
import xsna.vre;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class f57 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ f57(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<CommunityProfileContentItem> list;
        boolean z = false;
        r3 = false;
        r3 = false;
        boolean z2 = false;
        r3 = false;
        r3 = false;
        boolean z3 = false;
        z = false;
        switch (this.b) {
            case 0:
                return new String((byte[]) obj, emb.b);
            case 1:
                int i = BroadcastConfigFragment.U;
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 2:
                qgi0.r((tgi0) obj, "cart_community_verified");
                return s3q0.a;
            case 3:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (!jnj.b(((Playlist) obj2).O)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 4:
                Dialog dialog = ((e.c) obj).b;
                if (dialog.Gb() && !dialog.Jc()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                List<DatabaseCityDto> d = ((DatabaseGetCitiesResponseDto) obj).d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                for (DatabaseCityDto databaseCityDto : d) {
                    arrayList2.add(new uec(databaseCityDto.getId(), databaseCityDto.getTitle(), databaseCityDto.f(), databaseCityDto.d()));
                }
                return arrayList2;
            case 6:
                return Boolean.valueOf(((vre.b) obj).r instanceof tre.a);
            case 7:
                return Boolean.TRUE;
            case 8:
                return ahn.C((io.reactivex.rxjava3.core.q) obj);
            case 9:
                qgi0.r((tgi0) obj, "communities_catalog_top_bar_search_icon");
                return s3q0.a;
            case 10:
                List<GroupsAddressDto> d2 = ((GroupsGetAddressesResponseDto) obj).d();
                ArrayList arrayList3 = new ArrayList(c5g.u(d2, 10));
                Iterator<T> it = d2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(fz5.v((GroupsAddressDto) it.next()));
                }
                return arrayList3;
            case 11:
                qgi0.r((tgi0) obj, "priority_block_header_cart_items_btn");
                return s3q0.a;
            case 12:
                CommunityProfileContent communityProfileContent = (CommunityProfileContent) obj;
                if (communityProfileContent != null && (list = communityProfileContent.b) != null && list.isEmpty()) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 13:
                return s3q0.a;
            case 14:
                vzh vzhVar = (vzh) obj;
                if (vzhVar.l) {
                    yig0 yig0Var = vzhVar.y;
                    if ((yig0Var.a == null || yig0Var.d == null || yig0Var.c == null) && vzhVar.A == null) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 15:
                ((uzh0) obj).p();
                return s3q0.a;
            case 16:
                return p2j.k(((q2j.c) obj).h);
            case 17:
                int i2 = com.vk.channelrestrictions.b.h1;
                return Boolean.FALSE;
            case 18:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                LinkedHashMap linkedHashMap2 = DialogActionsListView.j;
                DialogActionsListView.b bVar = new DialogActionsListView.b();
                u8m.l0 l0Var = u8m.l0.b;
                bVar.b = l0Var;
                int i3 = 21;
                bVar.c = new wh6(i3);
                bVar.d = new x50(12);
                s3q0 s3q0Var = s3q0.a;
                linkedHashMap.put(l0Var, bVar);
                DialogActionsListView.b bVar2 = new DialogActionsListView.b();
                u8m.j0 j0Var = u8m.j0.b;
                bVar2.b = j0Var;
                int i4 = 18;
                bVar2.c = new g8(i4);
                int i5 = 19;
                bVar2.d = new dz(i5);
                linkedHashMap.put(j0Var, bVar2);
                DialogActionsListView.b bVar3 = new DialogActionsListView.b();
                u8m.i0 i0Var = u8m.i0.b;
                bVar3.b = i0Var;
                int i6 = 24;
                bVar3.c = new com.vk.movika.sdk.base.observable.i(i6);
                int i7 = 20;
                bVar3.d = new j60(i7);
                linkedHashMap.put(i0Var, bVar3);
                DialogActionsListView.b bVar4 = new DialogActionsListView.b();
                u8m.r0 r0Var = u8m.r0.b;
                bVar4.b = r0Var;
                int i8 = 23;
                bVar4.c = new md(i8);
                bVar4.d = new oj(i7);
                linkedHashMap.put(r0Var, bVar4);
                DialogActionsListView.b bVar5 = new DialogActionsListView.b();
                u8m.e eVar = u8m.e.b;
                bVar5.b = eVar;
                int i9 = 22;
                bVar5.c = new qt0(i9);
                bVar5.d = new e60(i6);
                linkedHashMap.put(eVar, bVar5);
                DialogActionsListView.b bVar6 = new DialogActionsListView.b();
                u8m.d dVar = u8m.d.b;
                bVar6.b = dVar;
                bVar6.c = new py(i7);
                bVar6.d = new ol(i7);
                linkedHashMap.put(dVar, bVar6);
                DialogActionsListView.b bVar7 = new DialogActionsListView.b();
                u8m.f fVar = u8m.f.b;
                bVar7.b = fVar;
                bVar7.c = new fj1(i7);
                bVar7.d = new pe1(i5);
                linkedHashMap.put(fVar, bVar7);
                DialogActionsListView.b bVar8 = new DialogActionsListView.b();
                u8m.i iVar = u8m.i.b;
                bVar8.b = iVar;
                bVar8.c = new nt(29);
                bVar8.d = new v7(i6);
                linkedHashMap.put(iVar, bVar8);
                DialogActionsListView.b bVar9 = new DialogActionsListView.b();
                u8m.a0 a0Var = u8m.a0.b;
                bVar9.b = a0Var;
                bVar9.c = new vt1(i4);
                bVar9.d = new gt(i4);
                linkedHashMap.put(a0Var, bVar9);
                DialogActionsListView.b bVar10 = new DialogActionsListView.b();
                u8m.a aVar = u8m.a.b;
                bVar10.b = aVar;
                bVar10.c = new nk(i4);
                bVar10.d = new x8m(z ? 1 : 0);
                linkedHashMap.put(aVar, bVar10);
                DialogActionsListView.b bVar11 = new DialogActionsListView.b();
                u8m.j jVar = u8m.j.b;
                bVar11.b = jVar;
                bVar11.c = new com.vk.movika.sdk.base.utils.b(i3);
                int i10 = 17;
                bVar11.d = new tb4(i10);
                linkedHashMap.put(jVar, bVar11);
                DialogActionsListView.b bVar12 = new DialogActionsListView.b();
                u8m.g gVar = u8m.g.b;
                bVar12.b = gVar;
                bVar12.c = new pl2(i8);
                bVar12.d = new zj(i8);
                linkedHashMap.put(gVar, bVar12);
                DialogActionsListView.b bVar13 = new DialogActionsListView.b();
                u8m.h hVar = u8m.h.b;
                bVar13.b = hVar;
                bVar13.c = new la2(i9);
                bVar13.d = new bz(i10);
                linkedHashMap.put(hVar, bVar13);
                DialogActionsListView.b bVar14 = new DialogActionsListView.b();
                u8m.w0 w0Var = u8m.w0.b;
                bVar14.b = w0Var;
                bVar14.c = new ht(i3);
                bVar14.d = new jt(i3);
                linkedHashMap.put(w0Var, bVar14);
                DialogActionsListView.b bVar15 = new DialogActionsListView.b();
                u8m.v0 v0Var = u8m.v0.b;
                bVar15.b = v0Var;
                bVar15.c = new wq3(i3);
                bVar15.d = new y40(25);
                linkedHashMap.put(v0Var, bVar15);
                DialogActionsListView.b bVar16 = new DialogActionsListView.b();
                u8m.k0 k0Var = u8m.k0.b;
                bVar16.b = k0Var;
                bVar16.c = new ci3(i8);
                bVar16.d = new pf(26);
                linkedHashMap.put(k0Var, bVar16);
                return s3q0.a;
            case 19:
                return Boolean.valueOf(!(((User) obj).z == 3));
            case 20:
                xr90 xr90Var = (xr90) obj;
                return new tr90(xr90Var.a, xr90Var.c, xr90Var.d, xr90Var.e, xr90Var.f);
            case 21:
                EducationState educationState = (EducationState) obj;
                EducationalInstitution b = educationState.b();
                return new d.a(b != null ? b.getTitle() : null, educationState.d != null);
            case 22:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 23:
                return v0u0.a((v0u0) obj, 0, 0, 0, 0, 31);
            case 24:
                Serializer.c<FragmentNavigationControllerState> cVar = FragmentNavigationControllerState.CREATOR;
                StringBuilder sb = new StringBuilder("\"");
                String canonicalName = ((FragmentEntry) obj).b.getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = "";
                }
                return ho8.a(sb, canonicalName, '\"');
            case 25:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 26:
                return Integer.valueOf(((Group) obj).s);
            case 27:
                return s3q0.a;
            case 28:
                return Long.valueOf(((Peer) obj).d);
            default:
                View view = (View) obj;
                FeedTopBar feedTopBar = view instanceof FeedTopBar ? (FeedTopBar) view : null;
                if (feedTopBar != null) {
                    return feedTopBar.getAfterExtraRect();
                }
                return null;
        }
    }

    public /* synthetic */ f57(Object obj, int i) {
        this.b = i;
    }
}
