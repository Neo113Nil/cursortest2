package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalLoopVh;
import com.vk.clips.design.view.hsl.HslRecyclerView;
import com.vk.clips.favorites.impl.ui.folders.content.d;
import com.vk.clips.playlists.folders.root.ClipsPlaylistsFoldersRootFragment;
import com.vk.clips.playlists.folders.root.g;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.comments.core.BoardComment;
import com.vk.dto.common.Peer;
import com.vk.dto.group.Group;
import com.vk.ecomm.market.good.linkedcontent.mvi2.ui.MarketLinkedContentFragment;
import com.vk.editor.filters.correction.entity.HslColorType;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.dialogs.c;
import com.vk.im.engine.models.reporters.DialogsFilterChangeSource;
import com.vk.im.engine.models.users.User;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.money.createtransfer.people.CreatePeopleTransferFragment;
import com.vk.profile.community.suggestions.impl.ui.suggestions.d;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.VkEcosystemProfileButtonView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.as30;
import xsna.bzx;
import xsna.d4e;
import xsna.ij20;
import xsna.j0j;
import xsna.l5n;
import xsna.ndw;
import xsna.osp;
import xsna.pdg0;
import xsna.tlo0;
import xsna.tte;
import xsna.xak;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class x2e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x2e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026a A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.vk.clips.playlists.a] */
    /* JADX WARN: Type inference failed for: r6v4, types: [xsna.wte] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ?? r4;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                com.vk.clips.favorites.impl.ui.folders.content.b bVar = (com.vk.clips.favorites.impl.ui.folders.content.b) obj2;
                d4e.a.c cVar = (d4e.a.c) obj;
                FavoriteFolderId favoriteFolderId = cVar.a;
                List<String> list = cVar.b;
                if (epx.f(favoriteFolderId, bVar.f.b())) {
                    bVar.T(new d.b(list));
                }
                return s3q0.a;
            case 1:
                ClipsPlaylistsFoldersRootFragment clipsPlaylistsFoldersRootFragment = (ClipsPlaylistsFoldersRootFragment) obj2;
                g.a.InterfaceC0628a interfaceC0628a = (g.a.InterfaceC0628a) obj;
                final com.vk.clips.playlists.folders.root.a aVar = (com.vk.clips.playlists.folders.root.a) clipsPlaylistsFoldersRootFragment.R.getValue(clipsPlaylistsFoldersRootFragment, ClipsPlaylistsFoldersRootFragment.T[0]);
                FragmentManager fragmentManager = aVar.e;
                Context context = aVar.a;
                if (interfaceC0628a.equals(g.a.InterfaceC0628a.C0629a.a)) {
                    dw20 dw20Var = aVar.h;
                    if (dw20Var != null) {
                        dw20Var.hide();
                    }
                    aVar.f.invoke();
                    aVar.h = null;
                    aVar.g = null;
                } else if (interfaceC0628a instanceof g.a.InterfaceC0628a.b) {
                    Activity h = e3m.h(context);
                    aVar.g = h != null ? rdi.p(h, new hd(aVar, 23)) : null;
                    aVar.h = new tte.a(context, aVar.c).d0(new com.vk.movika.sdk.base.ui.f(aVar, 24)).a0(new yce(aVar, 3)).H0(fragmentManager, "ClipsPlaylistsFoldersMviBottomSheet");
                } else {
                    if (!(interfaceC0628a instanceof g.a.InterfaceC0628a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dw20 dw20Var2 = aVar.h;
                    if (dw20Var2 != null) {
                        dw20Var2.hide();
                    }
                    aVar.d.a(context, ((g.a.InterfaceC0628a.c) interfaceC0628a).a, fragmentManager, new DialogInterface.OnDismissListener() { // from class: xsna.wte
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            com.vk.clips.playlists.folders.root.a.this.f.invoke();
                        }
                    });
                }
                return s3q0.a;
            case 2:
                zhh zhhVar = (zhh) obj2;
                Group group = (Group) obj;
                y0q y0qVar = (y0q) zhhVar.t;
                if (y0qVar != null) {
                    zih.a(zhhVar.E, y0qVar, new cyp(group, y0qVar), null, 12);
                }
                return s3q0.a;
            case 3:
                ((com.vk.profile.community.suggestions.impl.ui.suggestions.b) obj2).T(new d.b((Throwable) obj));
                return s3q0.a;
            case 4:
                ((i1j) obj2).e.invoke(j0j.g.b);
                return s3q0.a;
            case 5:
                ((vvr) obj2).h(1);
                return s3q0.a;
            case 6:
                CreatePeopleTransferFragment createPeopleTransferFragment = (CreatePeopleTransferFragment) obj2;
                int i2 = CreatePeopleTransferFragment.B0;
                Object obj3 = createPeopleTransferFragment.m0;
                ((h9k) (obj3 != null ? obj3 : null)).getClass();
                dw20 dw20Var3 = createPeopleTransferFragment.z0;
                if (dw20Var3 != null) {
                    dw20Var3.hide();
                }
                return s3q0.a;
            case 7:
                xak xakVar = (xak) obj2;
                String obj4 = ((pno0) obj).d().toString();
                if (!epx.f(xakVar.A.a, obj4)) {
                    xakVar.B0(new xak.d(obj4, null, false));
                    xakVar.C0();
                }
                return s3q0.a;
            case 8:
                wkm wkmVar = (wkm) ((alm) obj2).d.getValue();
                String str = ((fc80) obj).b;
                wkmVar.getClass();
                CopyOnWriteArraySet copyOnWriteArraySet = com.vk.im.engine.models.dialogs.c.b;
                return wkmVar.a(c.a.a(str));
            case 9:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, (com.vk.im.engine.models.dialogs.c) obj2, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -134217729, 2097151);
            case 10:
                return (User) ((wpp) ((pdg0.b) ((pdg0) obj2)).a).c.get(Long.valueOf(((Peer) obj).b));
            case 11:
                e4n e4nVar = (e4n) obj2;
                nn50 nn50Var = e4nVar.b;
                Throwable th = (Throwable) obj;
                if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1) {
                    com.vk.core.utils.newtork.b.a.getClass();
                    if (!com.vk.core.utils.newtork.b.d()) {
                        r4 = true;
                        String str2 = ((t4n) nn50Var.getCurrentState()).b.d;
                        boolean z = (str2 == null || str2.length() == 0) && ((t4n) nn50Var.getCurrentState()).b.b.a.isEmpty();
                        if (r4 != false && z) {
                            e4nVar.a(l5n.b.a.b);
                        }
                        return s3q0.a;
                    }
                }
                r4 = false;
                String str22 = ((t4n) nn50Var.getCurrentState()).b.d;
                if (str22 == null) {
                    if (r4 != false) {
                        e4nVar.a(l5n.b.a.b);
                    }
                    return s3q0.a;
                }
                if (r4 != false) {
                }
                return s3q0.a;
            case 12:
                f4m.E((VkEcosystemProfileButtonView) ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) obj2).h.getValue(), ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 13:
                Dialog dialog = (Dialog) ((r480) obj).c.c.get(((Dialog) obj2).Sb());
                return dialog != null ? Optional.of(dialog) : Optional.empty();
            case 14:
                vtm vtmVar = vtm.this;
                DialogsFilter dialogsFilter = DialogsFilter.BUSINESS_NOTIFY;
                DialogsFilterChangeSource dialogsFilterChangeSource = DialogsFilterChangeSource.LIST_EMPTY;
                xtm xtmVar = vtmVar.F;
                if (xtmVar != null) {
                    xtmVar.b(dialogsFilter, dialogsFilterChangeSource);
                }
                return s3q0.a;
            case 15:
                View view = (View) obj;
                bwt0.h(view, new com.vk.movika.sdk.base.ui.p(7, (osp.a) obj2, view));
                return s3q0.a;
            case 16:
                dw20 dw20Var4 = (dw20) ((Ref$ObjectRef) obj2).element;
                if (dw20Var4 != null) {
                    dw20Var4.dismiss();
                }
                return s3q0.a;
            case 17:
                bsq bsqVar = (bsq) obj2;
                io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar3 = bsqVar.Q;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                bsqVar.Q = cVar2;
                return s3q0.a;
            case 18:
                L.g("Error after search gif", (Throwable) obj);
                return ((fws) obj2).a.e;
            case 19:
                ((ij20.a) obj).l(((hwt) obj2).c);
                return s3q0.a;
            case 20:
                ((Integer) obj).intValue();
                RecyclerView recyclerView = ((HorizontalLoopVh) obj2).j;
                return new s8a((recyclerView != null ? recyclerView : null).getWidth(), 1, 1);
            case 21:
                HslColorType hslColorType = (HslColorType) obj2;
                int i3 = HslRecyclerView.e;
                return Boolean.valueOf(((wgv) obj).a == hslColorType);
            case 22:
                as30.a aVar2 = ((com.vk.im.video.e) obj2).h;
                (aVar2 != null ? aVar2 : null).c();
                return Boolean.TRUE;
            case 23:
                return new com.vk.im.design.view.pagination.pin.d(((com.vk.im.design.view.pagination.pin.c) obj2).j, (ViewGroup) obj);
            case 24:
                ((qdw) obj2).d.onNext(new ndw.a((Map) obj));
                return s3q0.a;
            case 25:
                ((wzx) obj2).c.invoke(bzx.e.b);
                return s3q0.a;
            case 26:
                hda hdaVar = (hda) obj;
                return jda.a(((k0z) obj2).b, hdaVar.a, hdaVar.b, false, false, 12);
            case 27:
                hi00 hi00Var = (hi00) obj2;
                ei00 ei00Var = (ei00) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Got new managed groups counter from cache " + ei00Var});
                }
                hi00Var.d.onNext(ei00Var);
                return s3q0.a;
            case 28:
                k110 k110Var = (k110) obj;
                ((e110) obj2).d.getClass();
                ListBuilder e = e43.e();
                tlo0.d b = hq.b(tlo0.Companion, R.plurals.market_item_comments_count, k110Var.f);
                Integer num = k110Var.n;
                e.add(new j010(null, new x010(b, num == null)));
                List<BoardComment> list2 = k110Var.d;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (BoardComment boardComment : list2) {
                    boardComment.y = k110Var.e;
                    int i4 = boardComment.b;
                    boardComment.t = num == null || i4 == num.intValue();
                    arrayList.add(boardComment.s ? new j010(Integer.valueOf(i4), new rvl(i4, boardComment.o, boardComment.t)) : new j010(Integer.valueOf(i4), boardComment));
                }
                e.addAll(arrayList);
                return e.g();
            default:
                MarketLinkedContentFragment marketLinkedContentFragment = (MarketLinkedContentFragment) obj2;
                qcy<Object>[] qcyVarArr = MarketLinkedContentFragment.R;
                return new r710(new k6k(marketLinkedContentFragment, 29), (gzs) obj, (g7s0) marketLinkedContentFragment.N.getValue(), (hc10) marketLinkedContentFragment.P.getValue());
        }
    }
}
