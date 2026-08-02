package xsna;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.EditText;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.feature.search.holders.SearchSpellcheckVh;
import com.vk.clips.design.view.LoadProgressView;
import com.vk.common.links.LaunchContext;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.common.Image;
import com.vk.dto.common.data.VKList;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.ReactionUserProfile;
import com.vk.im.ui.fragments.ImSelectDonutContactsFragment;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.managed_groups.impl.list.ManagedGroupsListFragment;
import com.vk.managed_groups.impl.list.b;
import com.vk.music.playlist.display.domain.e;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.widget.CommunityWidgetPreviewFragment;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsViewState;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVh;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.acx;
import xsna.fmc0;
import xsna.fvz;
import xsna.gm50;
import xsna.h7u0;
import xsna.jw00;
import xsna.lsw;
import xsna.uxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class zqh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zqh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        z8m z8mVar;
        int i = 0;
        switch (this.b) {
            case 0:
                ((arh) this.c).h.invoke(new d.e((List) obj));
                return s3q0.a;
            case 1:
                com.vk.profile.community.suggestions.impl.ui.suggestions.g gVar = (com.vk.profile.community.suggestions.impl.ui.suggestions.g) this.c;
                CommunitySuggestionsViewState.a aVar = (CommunitySuggestionsViewState.a) obj;
                gm50.a.a(gVar, aVar.a, new oce(gVar, 9));
                gm50.a.a(gVar, aVar.b, new i4e(gVar, 15));
                gm50.a.a(gVar, aVar.c, new i4h(gVar, 5));
                gm50.a.a(gVar, aVar.d, new n3i(gVar, i));
                gm50.a.a(gVar, aVar.e, new com.vk.im.engine.internal.api_commands.messages.a(gVar, 29));
                return s3q0.a;
            case 2:
                CommunityWidgetPreviewFragment communityWidgetPreviewFragment = (CommunityWidgetPreviewFragment) this.c;
                int i2 = CommunityWidgetPreviewFragment.U;
                if (((BaseOkResponseDto) obj).i() == 1) {
                    communityWidgetPreviewFragment.io(-1);
                } else {
                    communityWidgetPreviewFragment.io(3);
                }
                return s3q0.a;
            case 3:
                final u1j u1jVar = (u1j) this.c;
                int i3 = h7u0.p;
                h7u0.a c = h7u0.b.c(u1jVar.t.requireContext());
                c.g0(R.string.voip_session_room_admin_room_close_all_dialog_title);
                c.U(R.string.voip_session_room_admin_room_close_all_dialog_description);
                c.c0(R.string.voip_session_room_admin_room_close_all_dialog_confirm, new au1(u1jVar, r3 ? 1 : 0));
                c.W(R.string.voip_session_room_admin_room_close_all_dialog_cancel, null);
                c.a0(new DialogInterface.OnDismissListener() { // from class: xsna.q1j
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        u1j.this.C = null;
                    }
                });
                u1jVar.C = c.m();
                return s3q0.a;
            case 4:
                dbk dbkVar = (dbk) this.c;
                int i4 = dbk.g1;
                dbkVar.hide();
                return s3q0.a;
            case 5:
                ((cpk) this.c).b.setVisibility(0);
                return s3q0.a;
            case 6:
                p0m p0mVar = (p0m) this.c;
                if ((((lsw.b) obj) instanceof lsw.b.a.C3287b) && p0mVar.c) {
                    p0mVar.b.invoke(Boolean.TRUE);
                    p0mVar.c = false;
                }
                return s3q0.a;
            case 7:
                t4m t4mVar = (t4m) this.c;
                VKList<ReactionUserProfile> vKList = (VKList) obj;
                for (ReactionUserProfile reactionUserProfile : vKList) {
                    boolean z = reactionUserProfile.j;
                    Bundle bundle = reactionUserProfile.s;
                    if (z) {
                        String string = bundle.getString("name_dat");
                        if (string == null) {
                            string = bundle.getString("first_name_dat");
                        }
                        if (string != null) {
                            t4mVar.g.add(string);
                        }
                    }
                    Image image = reactionUserProfile.O;
                    if (image != null) {
                        t4mVar.e.add(image);
                    }
                }
                t4mVar.f = Integer.valueOf(vKList.i());
                return s3q0.a;
            case 8:
                zam zamVar = ((xam) this.c).u;
                if (zamVar != null) {
                    com.vk.im.popup.a a = zamVar.a();
                    ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                    imFeatures.getClass();
                    a.b(new z5g0(R.string.vkim_msg_header_report_spam_progress_desc, 5, null, null, com.vk.toggle.b.A.a(imFeatures)), new cwg(zamVar, 8));
                }
                return s3q0.a;
            case 9:
                n0v0 n0v0Var = n0v0.a;
                cfm cfmVar = (cfm) this.c;
                dtk0 dtk0Var = cfmVar.K;
                c9m c9mVar = cfmVar.F;
                if (!cfmVar.E || cfmVar.G == null) {
                    efm efmVar = cfmVar.e;
                    if (efmVar != null) {
                        efmVar.z();
                    }
                } else {
                    efm efmVar2 = cfmVar.e;
                    if (efmVar2 != null) {
                        efmVar2.f();
                    }
                    z8m z8mVar2 = cfmVar.G;
                    if (z8mVar2 == null) {
                        if (!c9mVar.isVisible()) {
                            v8m.a = new Object();
                            g2v.c().getClass();
                            c9mVar.b(n0v0Var.a(cfmVar.G == null, dtk0Var.g, dtk0Var.b), new wi3(1, cfmVar, cfm.class, "handleDialogActionClick", "handleDialogActionClick(Lcom/vk/im/ui/components/common/DialogAction;)V", 0, 7));
                        } else if (c9mVar.isVisible()) {
                            c9mVar.a(true);
                        }
                    } else if (z8mVar2.isVisible()) {
                        z8m z8mVar3 = cfmVar.G;
                        if (z8mVar3 != null && z8mVar3.isVisible() && (z8mVar = cfmVar.G) != null) {
                            z8mVar.a(true);
                        }
                    } else {
                        v8m.a = new Object();
                        z8m z8mVar4 = cfmVar.G;
                        if (z8mVar4 != null) {
                            g2v.c().getClass();
                            z8mVar4.b(n0v0Var.a(cfmVar.G == null, dtk0Var.g, dtk0Var.b), new xd8(1, cfmVar, cfm.class, "handleDialogActionClick", "handleDialogActionClick(Lcom/vk/im/ui/components/common/DialogAction;)V", 0, 5));
                        }
                    }
                }
                return s3q0.a;
            case 10:
                com.vk.music.playlist.display.domain.b bVar = (com.vk.music.playlist.display.domain.b) this.c;
                hda hdaVar = (hda) obj;
                ArrayList arrayList = new ArrayList();
                for (UIBlock uIBlock : jda.a(bVar.o, hdaVar.a, hdaVar.b, false, false, 12)) {
                    if (uIBlock instanceof UIBlockList) {
                        Iterator<UIBlock> it = ((UIBlockList) uIBlock).y.iterator();
                        while (it.hasNext()) {
                            UIBlock next = it.next();
                            if (next instanceof UIBlockPlaceholder) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
                bVar.T(new e.a(arrayList));
                return s3q0.a;
            case 11:
                hfo hfoVar = (hfo) this.c;
                return DraftsListState.a((DraftsListState) obj, hfoVar.a, DraftsListState.LoadingState.IDLE, hfoVar.b, hfoVar.c, false, 33);
            case 12:
                bwt0.p0(((kzo) this.c).q, ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 13:
                Post post = (Post) this.c;
                u1c0 u1c0Var = (u1c0) obj;
                int i5 = u1c0Var.c;
                return Boolean.valueOf((i5 == 126 || i5 == 89 || i5 == 19 || i5 == 18) && u1c0Var.a == post);
            case 14:
                zbq zbqVar = (zbq) this.c;
                EditText editText = (EditText) obj;
                String str = zbqVar.a.a().h;
                editText.setText(str != null ? str : "");
                oa01.a(editText, new i4h(zbqVar, 17));
                return s3q0.a;
            case 15:
                ((vkq) this.c).h = (List) obj;
                return s3q0.a;
            case 16:
                ((p0s) this.c).f.compareAndSet(true, false);
                return s3q0.a;
            case 17:
                GlobalSearchGroupsCatalogRootVh globalSearchGroupsCatalogRootVh = (GlobalSearchGroupsCatalogRootVh) this.c;
                l3a l3aVar = (l3a) obj;
                if (!(l3aVar instanceof SearchSpellcheckVh.a.C0525a)) {
                    if (l3aVar instanceof SearchSpellcheckVh.a.b) {
                        GlobalSearchGroupsCatalogRootVh.n0(globalSearchGroupsCatalogRootVh, ((SearchSpellcheckVh.a.b) l3aVar).a, null, null, null, 28);
                    } else if (l3aVar instanceof xyh0) {
                        xyh0 xyh0Var = (xyh0) l3aVar;
                        com.vk.catalog2.common.ui.holders.search.b bVar2 = com.vk.catalog2.common.ui.holders.search.b.a;
                        String V = globalSearchGroupsCatalogRootVh.k0().V();
                        com.vk.catalog2.common.ui.holders.search.b.b(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP_SHOW_ALL, V != null ? V : "");
                        globalSearchGroupsCatalogRootVh.F.a(globalSearchGroupsCatalogRootVh.k0().V(), new com.vk.catalog2.common.ui.holders.b(14, globalSearchGroupsCatalogRootVh, xyh0Var));
                    }
                }
                return s3q0.a;
            case 18:
                ((amu) this.c).k(new uxd0.w((Throwable) obj));
                return s3q0.a;
            case 19:
                HorizontalPagerView.c cVar = (HorizontalPagerView.c) this.c;
                final boolean booleanValue = ((Boolean) obj).booleanValue();
                cVar.m(new izs() { // from class: com.vk.catalog.mvi.block.impl.pager.d
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        return HorizontalPagerView.State.a((HorizontalPagerView.State) obj2, null, null, 0, booleanValue, 31);
                    }
                });
                return s3q0.a;
            case 20:
                return Boolean.valueOf(((d5w) this.c).c.contains(((a5w) obj).t3()));
            case 21:
                pno0 pno0Var = (pno0) obj;
                com.vk.im.ui.components.contacts.a aVar2 = ((ImSelectDonutContactsFragment) this.c).X;
                (aVar2 != null ? aVar2 : null).a1(pno0Var.d());
                return s3q0.a;
            case 22:
                return VideoToolbarView.a.a((VideoToolbarView.a) obj, null, ((l8z) this.c).b, 11);
            case 23:
                ((whz) this.c).a(acx.q.a);
                return s3q0.a;
            case 24:
                gzs<s3q0> gzsVar = ((LoadProgressView) this.c).d;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 25:
                LocalMediaPickerFragmentOld localMediaPickerFragmentOld = (LocalMediaPickerFragmentOld) this.c;
                fvz.a aVar3 = (fvz.a) obj;
                int i6 = LocalMediaPickerFragmentOld.c0;
                efc0 fo = localMediaPickerFragmentOld.fo();
                if (fo != null) {
                    fo.j0(new fmc0.i.b(localMediaPickerFragmentOld.go(aVar3.d)));
                }
                efc0 fo2 = localMediaPickerFragmentOld.fo();
                if (fo2 != null) {
                    fo2.C(new PostingAction.Navigation.OpenLocalPhotoVideoViewer(aVar3.b.ba()));
                }
                return s3q0.a;
            case 26:
                ManagedGroupsListFragment managedGroupsListFragment = (ManagedGroupsListFragment) this.c;
                com.vk.managed_groups.impl.list.b bVar3 = (com.vk.managed_groups.impl.list.b) obj;
                int i7 = ManagedGroupsListFragment.X;
                if (!(bVar3 instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                b.a aVar4 = (b.a) bVar3;
                if (((com.vk.im.engine.models.c) managedGroupsListFragment.W.getValue()).i()) {
                    o0w b = g2v.c().b();
                    ManagedGroupsListFragment.fo(aVar4.a.d);
                    b.G(managedGroupsListFragment.requireContext(), aVar4.a);
                } else {
                    maz.c(xwk.d().e(), managedGroupsListFragment.requireContext(), "https://" + a0a.d + "/gim" + aVar4.a.d, LaunchContext.A, null, new com.vk.managed_groups.impl.list.d(managedGroupsListFragment, aVar4), 8);
                }
                return s3q0.a;
            case 27:
                awt0.r((am) obj, ((qt00) this.c).a.getContext());
                return s3q0.a;
            case 28:
                return Boolean.valueOf(((lw00) this.c).e(jw00.a.c));
            default:
                vz00 vz00Var = (vz00) this.c;
                vz00Var.F.setOverlayImage(null);
                vz00Var.F.setVisible(false);
                bwt0.p0(vz00Var.S, true);
                return s3q0.a;
        }
    }
}
