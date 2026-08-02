package com.yandex.div.core.view2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.core.view2.drawable.NoOpDrawable;
import com.yandex.div2.DivContainer;
import defpackage.cpl;
import defpackage.i2k;
import defpackage.j2k;
import defpackage.k2k;
import defpackage.kql;
import defpackage.l2k;
import defpackage.m2k;
import defpackage.m3k;
import defpackage.n2k;
import defpackage.o2k;
import defpackage.p2k;
import defpackage.q2k;
import defpackage.r2k;
import defpackage.rvo;
import defpackage.s2k;
import defpackage.t2k;
import defpackage.tje;
import defpackage.u2k;
import defpackage.uml;
import defpackage.v2k;
import defpackage.vml;
import defpackage.vt31;
import defpackage.w2k;
import defpackage.w511;
import defpackage.x2k;
import defpackage.y2k;
import defpackage.yt31;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public final class f extends kql {
    public final Context a;
    public final vt31 b;
    public final vml c;
    public yt31 d;

    public f(Context context, vt31 vt31Var, vml vmlVar, yt31 yt31Var, com.yandex.div.internal.viewpool.optimization.a aVar) {
        this.a = context;
        this.b = vt31Var;
        this.c = vmlVar;
        String str = yt31Var.a;
        if (str != null) {
            yt31 yt31Var2 = (yt31) tje.Y(EmptyCoroutineContext.a, new DivViewCreator$viewPreCreationProfile$1$1(aVar, str, null));
            if (yt31Var2 != null) {
                yt31Var = yt31Var2;
            }
        }
        this.d = yt31Var;
        vt31Var.c("DIV2.TEXT_VIEW", new cpl(0, this), yt31Var.b.a);
        vt31Var.c("DIV2.IMAGE_VIEW", new cpl(17, this), yt31Var.c.a);
        vt31Var.c("DIV2.IMAGE_GIF_VIEW", new cpl(1, this), yt31Var.d.a);
        vt31Var.c("DIV2.OVERLAP_CONTAINER_VIEW", new cpl(2, this), yt31Var.e.a);
        vt31Var.c("DIV2.LINEAR_CONTAINER_VIEW", new cpl(3, this), yt31Var.f.a);
        vt31Var.c("DIV2.WRAP_CONTAINER_VIEW", new cpl(4, this), yt31Var.g.a);
        vt31Var.c("DIV2.GRID_VIEW", new cpl(5, this), yt31Var.h.a);
        vt31Var.c("DIV2.GALLERY_VIEW", new cpl(6, this), yt31Var.i.a);
        vt31Var.c("DIV2.PAGER_VIEW", new cpl(7, this), yt31Var.j.a);
        vt31Var.c("DIV2.TAB_VIEW", new cpl(8, this), yt31Var.k.a);
        vt31Var.c("DIV2.STATE", new cpl(9, this), yt31Var.l.a);
        vt31Var.c("DIV2.CUSTOM", new cpl(10, this), yt31Var.m.a);
        vt31Var.c("DIV2.INDICATOR", new cpl(11, this), yt31Var.n.a);
        vt31Var.c("DIV2.SLIDER", new cpl(12, this), yt31Var.o.a);
        vt31Var.c("DIV2.INPUT", new cpl(13, this), yt31Var.p.a);
        vt31Var.c("DIV2.SELECT", new cpl(14, this), yt31Var.q.a);
        vt31Var.c("DIV2.VIDEO", new cpl(15, this), yt31Var.r.a);
        vt31Var.c("DIV2.SWITCH", new cpl(16, this), yt31Var.s.a);
    }

    @Override // defpackage.kql
    public final Object f(m2k m2kVar, rvo rvoVar) {
        ViewGroup viewGroup = (ViewGroup) a(m2kVar, rvoVar);
        Iterable iterable = m2kVar.c.y;
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            viewGroup.addView(o((m3k) it.next(), rvoVar));
        }
        return viewGroup;
    }

    @Override // defpackage.kql
    public final Object i(s2k s2kVar, rvo rvoVar) {
        return new DivSeparatorView(this.a, null, 0, 6, null);
    }

    public final View o(m3k m3kVar, rvo rvoVar) {
        if (!((Boolean) this.c.n(m3kVar, rvoVar)).booleanValue()) {
            return new Space(this.a);
        }
        View view = (View) n(m3kVar, rvoVar);
        view.setBackground(NoOpDrawable.INSTANCE);
        return view;
    }

    @Override // defpackage.kql
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final View a(m3k m3kVar, rvo rvoVar) {
        String str;
        if (m3kVar instanceof i2k) {
            DivContainer divContainer = ((i2k) m3kVar).c;
            str = uml.j(divContainer, rvoVar) ? "DIV2.WRAP_CONTAINER_VIEW" : divContainer.I.a(rvoVar) == DivContainer.Orientation.OVERLAP ? "DIV2.OVERLAP_CONTAINER_VIEW" : "DIV2.LINEAR_CONTAINER_VIEW";
        } else if (m3kVar instanceof j2k) {
            str = "DIV2.CUSTOM";
        } else if (m3kVar instanceof k2k) {
            str = "DIV2.GALLERY_VIEW";
        } else if (m3kVar instanceof l2k) {
            str = "DIV2.IMAGE_GIF_VIEW";
        } else if (m3kVar instanceof m2k) {
            str = "DIV2.GRID_VIEW";
        } else if (m3kVar instanceof n2k) {
            str = "DIV2.IMAGE_VIEW";
        } else if (m3kVar instanceof o2k) {
            str = "DIV2.INDICATOR";
        } else if (m3kVar instanceof p2k) {
            str = "DIV2.INPUT";
        } else if (m3kVar instanceof q2k) {
            str = "DIV2.PAGER_VIEW";
        } else if (m3kVar instanceof r2k) {
            str = "DIV2.SELECT";
        } else if (m3kVar instanceof t2k) {
            str = "DIV2.SLIDER";
        } else if (m3kVar instanceof v2k) {
            str = "DIV2.SWITCH";
        } else if (m3kVar instanceof u2k) {
            str = "DIV2.STATE";
        } else if (m3kVar instanceof w2k) {
            str = "DIV2.TAB_VIEW";
        } else if (m3kVar instanceof x2k) {
            str = "DIV2.TEXT_VIEW";
        } else if (m3kVar instanceof y2k) {
            str = "DIV2.VIDEO";
        } else {
            if (!(m3kVar instanceof s2k)) {
                w511.b();
                return null;
            }
            str = "";
        }
        return this.b.b(str);
    }
}
