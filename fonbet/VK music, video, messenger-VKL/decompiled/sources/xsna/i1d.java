package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.shared.item.clip.viewstate.MainOverlayState;
import com.vk.clips.sdk.shared.item.common.description.DescriptionViewState;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.clips.tool.view.viewer.feed.list.nps.LazyNpsView;
import com.vk.core.view.components.text.VkText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.fm70;
import xsna.mih0;

/* compiled from: ClipItemMainOverlayRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class i1d {
    public final e1d a;
    public final u6d b;
    public MainOverlayState c;
    public MainOverlayState.i d;
    public final if00 e;
    public final com.vk.clips.sdk.shared.item.common.description.b f;
    public final ivm0 g;
    public final bv h;
    public final r16 i;
    public final bv j;
    public final j590 k;
    public final h0d l;
    public final qi50 m;

    public i1d(e1d e1dVar, u6d u6dVar, jlh0 jlh0Var, cjh0 cjh0Var) {
        this.a = e1dVar;
        this.b = u6dVar;
        this.e = new if00(e1dVar);
        p7 p7Var = new p7(this, 13);
        wf00 wf00Var = new wf00();
        this.f = new com.vk.clips.sdk.shared.item.common.description.b(e1dVar.m, e1dVar.c, p7Var, cjh0Var, null);
        this.g = new ivm0(e1dVar.h, e1dVar.i);
        this.h = new bv(e1dVar.p, jlh0Var, wf00Var, new q7(this, 8));
        this.i = new r16(e1dVar.u, u6dVar);
        this.j = new bv(e1dVar.q, jlh0Var, wf00Var, new tt0(this, 10));
        this.k = new j590(e1dVar.g, null);
        this.l = new h0d(e1dVar.o, u6dVar);
        this.m = new qi50(e1dVar.n);
    }

    public static boolean a(MainOverlayState.c cVar) {
        if (!(cVar instanceof MainOverlayState.c.b)) {
            return false;
        }
        ArrayList arrayList = ((MainOverlayState.c.b) cVar).a;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((mih0) it.next()) instanceof mih0.k) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(MainOverlayState.c cVar) {
        if (!(cVar instanceof MainOverlayState.c.b)) {
            return false;
        }
        ArrayList arrayList = ((MainOverlayState.c.b) cVar).a;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((mih0) it.next()) instanceof mih0.p) {
                return true;
            }
        }
        return false;
    }

    public static void c(RecyclerView recyclerView, MainOverlayState.c cVar) {
        if (cVar instanceof MainOverlayState.c.b) {
            recyclerView.setVisibility(0);
            ((gqc) recyclerView.getAdapter()).setItems(((MainOverlayState.c.b) cVar).a);
        } else {
            if (!(cVar instanceof MainOverlayState.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f4m.j(recyclerView);
        }
    }

    public final void d(MainOverlayState mainOverlayState) {
        fm70.a cVar;
        MainOverlayState.c cVar2;
        MainOverlayState.c cVar3;
        if (!(mainOverlayState instanceof MainOverlayState.i)) {
            this.c = mainOverlayState;
            return;
        }
        MainOverlayState.i iVar = (MainOverlayState.i) mainOverlayState;
        MainOverlayState.a aVar = iVar.k;
        String str = iVar.a;
        MainOverlayState.f fVar = iVar.f;
        DescriptionViewState descriptionViewState = iVar.e;
        MainOverlayState.g gVar = iVar.d;
        MainOverlayState.PublicationDateState publicationDateState = gVar.a;
        MainOverlayState mainOverlayState2 = this.c;
        if00 if00Var = this.e;
        if00Var.getClass();
        e1d e1dVar = if00Var.a;
        boolean z = mainOverlayState2 instanceof MainOverlayState.i;
        if (!epx.f(str, mainOverlayState2 != null ? mainOverlayState2.F() : null) || !z) {
            zmp0.b(e1dVar.b);
        } else if (z) {
            MainOverlayState.i iVar2 = (MainOverlayState.i) mainOverlayState2;
            if (gVar.equals(iVar2.d)) {
                boolean f = epx.f(descriptionViewState, iVar2.e);
                boolean f2 = epx.f(fVar, iVar2.f);
                boolean equals = aVar.equals(iVar2.k);
                if (!f || !equals || !f2 || !f2) {
                    zmp0.b(e1dVar.b);
                    zmp0.a(e1dVar.b, if00Var.b);
                }
            } else {
                zmp0.b(e1dVar.b);
            }
        }
        MainOverlayState mainOverlayState3 = this.c;
        boolean z2 = epx.f(str, mainOverlayState3 != null ? mainOverlayState3.F() : null) && (mainOverlayState3 instanceof MainOverlayState.i);
        MainOverlayState.h hVar = iVar.b;
        boolean z3 = hVar.c;
        boolean z4 = hVar.b;
        MainOverlayState.i iVar3 = this.d;
        boolean equals2 = hVar.equals(iVar3 != null ? iVar3.b : null);
        e1d e1dVar2 = this.a;
        if (!equals2) {
            ClipFeedSideControlsView clipFeedSideControlsView = e1dVar2.d;
            MainOverlayState.i iVar4 = this.d;
            MainOverlayState.h hVar2 = iVar4 != null ? iVar4.b : null;
            boolean z5 = hVar2 != null && z4 == hVar2.b;
            boolean z6 = hVar2 != null && z3 == hVar2.c;
            if (!z5 || !z6) {
                clipFeedSideControlsView.o(z4);
                clipFeedSideControlsView.Z3(z3);
            }
            clipFeedSideControlsView.k1(k15.z(hVar.a));
        }
        this.k.a(iVar.c, publicationDateState);
        MainOverlayState.i iVar5 = this.d;
        if (!gVar.equals(iVar5 != null ? iVar5.d : null)) {
            if (publicationDateState instanceof MainOverlayState.PublicationDateState.Visible) {
                MainOverlayState.PublicationDateState.Visible visible = (MainOverlayState.PublicationDateState.Visible) publicationDateState;
                if (visible.b == MainOverlayState.PublicationDateState.Visible.Alignment.Horizontal) {
                    VkText vkText = e1dVar2.j;
                    vkText.setVisibility(0);
                    vkText.setText(visible.a);
                }
            } else {
                if (!(publicationDateState instanceof MainOverlayState.PublicationDateState.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4m.j(e1dVar2.j);
            }
            this.g.a(gVar.b);
            e1dVar2.k.setVisibility(gVar.c ? 0 : 8);
        }
        this.f.a(descriptionViewState);
        MainOverlayState.i iVar6 = this.d;
        boolean f3 = epx.f(fVar, iVar6 != null ? iVar6.f : null);
        u6d u6dVar = this.b;
        if (!f3) {
            u6dVar.a(l4d.b);
            if (fVar instanceof MainOverlayState.f.a) {
                f4m.j(e1dVar2.l);
            } else {
                if (!(fVar instanceof MainOverlayState.f.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                e1dVar2.l.setVisibility(0);
            }
        }
        this.m.a(iVar.g, z2);
        this.l.a(iVar.h);
        MainOverlayState.c cVar4 = iVar.i;
        MainOverlayState.i iVar7 = this.d;
        if (!epx.f(cVar4, iVar7 != null ? iVar7.i : null)) {
            u6dVar.a(new f4d(cVar4 instanceof MainOverlayState.c.b));
            c(e1dVar2.e, cVar4);
        }
        MainOverlayState.c cVar5 = iVar.j;
        MainOverlayState.i iVar8 = this.d;
        if (!epx.f(cVar5, iVar8 != null ? iVar8.j : null)) {
            u6dVar.a(new g4d(cVar5 instanceof MainOverlayState.c.b));
            MainOverlayState.i iVar9 = this.d;
            if (iVar9 != null && (cVar3 = iVar9.j) != null && !b(cVar3) && b(cVar5)) {
                u6dVar.a(o4d.b);
            }
            MainOverlayState.i iVar10 = this.d;
            if (iVar10 != null && (cVar2 = iVar10.j) != null && !a(cVar2) && a(cVar5)) {
                u6dVar.a(c4d.b);
            }
            c(e1dVar2.f, cVar5);
        }
        MainOverlayState.i iVar11 = this.d;
        if (!aVar.equals(iVar11 != null ? iVar11.k : null)) {
            this.h.b(aVar.a, z2);
            this.j.b(aVar.b, z2);
        }
        List<SubtitleRenderItem> list = iVar.l;
        MainOverlayState.i iVar12 = this.d;
        if (!epx.f(list, iVar12 != null ? iVar12.l : null)) {
            e1dVar2.r.setRenderItems(list);
        }
        boolean z7 = iVar.m;
        MainOverlayState.i iVar13 = this.d;
        if (iVar13 == null || z7 != iVar13.m) {
            e1dVar2.s.setVisibility(z7 ? 0 : 8);
        }
        MainOverlayState.e eVar = iVar.n;
        MainOverlayState.i iVar14 = this.d;
        if (!epx.f(eVar, iVar14 != null ? iVar14.n : null)) {
            LazyNpsView lazyNpsView = e1dVar2.t;
            if (eVar instanceof MainOverlayState.e.b) {
                lazyNpsView.setVisibility(0);
                MainOverlayState.e.b bVar = (MainOverlayState.e.b) eVar;
                if (bVar instanceof MainOverlayState.e.b.a) {
                    MainOverlayState.e.b.a aVar2 = (MainOverlayState.e.b.a) eVar;
                    cVar = new fm70.a.b(z2, aVar2.a, aVar2.b, new za(this, 28));
                } else {
                    if (!(bVar instanceof MainOverlayState.e.b.C0664b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = new fm70.a.c(z2);
                }
                lazyNpsView.setState(cVar);
            } else {
                if (!(eVar instanceof MainOverlayState.e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                lazyNpsView.setState(new fm70.a.C2883a(z2));
                if (!z2) {
                    lazyNpsView.setVisibility(8);
                }
            }
        }
        this.i.a(iVar.o);
        this.c = mainOverlayState;
        this.d = iVar;
    }
}
