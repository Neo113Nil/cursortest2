package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.im.ui.views.image_zhukov.ZhukovLayout;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.g34;

/* compiled from: MsgPartBoxDocPreviewHolder.kt */
/* loaded from: classes2.dex */
public final class ko30 extends hr30<Attach, lo30> implements g34.a {
    public final f6y0 d;
    public Context e;
    public ZhukovLayout f;
    public TimeAndStatusView g;
    public g34 h;
    public lo30 i;
    public final itn j = new itn();

    public ko30(f6y0 f6y0Var) {
        this.d = f6y0Var;
    }

    @Override // xsna.g34.a
    public final void c(int i) {
        int g = this.j.g(i);
        if (g >= 0) {
            ZhukovLayout zhukovLayout = this.f;
            if (zhukovLayout == null) {
                zhukovLayout = null;
            }
            ((stn) zhukovLayout.a(g)).c(i);
        }
    }

    @Override // xsna.g34.a
    public final void e(int i, int i2, int i3) {
        int g = this.j.g(i);
        if (g >= 0) {
            ZhukovLayout zhukovLayout = this.f;
            if (zhukovLayout == null) {
                zhukovLayout = null;
            }
            ((stn) zhukovLayout.a(g)).e(i, i2, i3);
        }
    }

    @Override // xsna.g34.a
    public final void f(int i) {
        int g = this.j.g(i);
        if (g >= 0) {
            ZhukovLayout zhukovLayout = this.f;
            if (zhukovLayout == null) {
                zhukovLayout = null;
            }
            ((stn) zhukovLayout.a(g)).d(i);
        }
    }

    @Override // xsna.hr30
    public final View n(int i) {
        int g = this.j.g(i);
        ZhukovLayout zhukovLayout = this.f;
        if (zhukovLayout == null) {
            zhukovLayout = null;
        }
        return zhukovLayout.getChildAt(g);
    }

    @Override // xsna.hr30
    public final void p(lo30 lo30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        lo30 lo30Var2 = lo30Var;
        this.i = lo30Var2;
        this.h = lo30Var2.j;
        List<Attach> list = lo30Var2.g;
        if (list != null) {
            for (Attach attach : list) {
                g34 g34Var = this.h;
                if (g34Var != null) {
                    g34Var.a(attach.xb(), this);
                }
            }
        }
        jr30 jr30Var = lo30Var2.f;
        TimeAndStatusView timeAndStatusView = this.g;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        hr30.l(timeAndStatusView, jr30Var, true);
        Context context = this.e;
        if (context == null) {
            context = null;
        }
        int m0 = lo30Var2.m0(context);
        Context context2 = this.e;
        if (context2 == null) {
            context2 = null;
        }
        int g = lo30Var2.g(context2);
        Context context3 = this.e;
        int d = e3m.d(R.attr.im_msg_part_corner_radius_small, context3 != null ? context3 : null);
        itn itnVar = this.j;
        zuj zujVar = itnVar.f;
        zujVar.a = m0;
        zujVar.b = g;
        zujVar.c = d;
        itnVar.c = lo30Var2.e;
        itnVar.d = lo30Var2.h;
        itnVar.b = list;
        itnVar.e = pk30Var;
        ZhukovLayout zhukovLayout = itnVar.a;
        if (zhukovLayout != null) {
            zhukovLayout.c();
        }
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.e = viewGroup.getContext();
        View inflate = layoutInflater.inflate(R.layout.vkim_msg_part_box_doc, viewGroup, false);
        this.f = (ZhukovLayout) inflate.findViewById(R.id.zhukov);
        this.g = (TimeAndStatusView) inflate.findViewById(R.id.timeAndStatus);
        ZhukovLayout zhukovLayout = this.f;
        if (zhukovLayout == null) {
            zhukovLayout = null;
        }
        zhukovLayout.setPools(this.d);
        ZhukovLayout zhukovLayout2 = this.f;
        (zhukovLayout2 != null ? zhukovLayout2 : null).setAdapter(this.j);
        return inflate;
    }

    @Override // xsna.hr30
    public final void r() {
        List<? extends Attach> list;
        lo30 lo30Var = this.i;
        if (lo30Var != null && (list = lo30Var.g) != null) {
            for (Attach attach : list) {
                g34 g34Var = this.h;
                if (g34Var != null) {
                    g34Var.a(attach.xb(), null);
                }
            }
        }
        this.h = null;
        this.i = null;
    }

    @Override // xsna.hr30
    public final Collection<Integer> v(String str) {
        List<? extends Attach> list;
        File i1;
        lo30 lo30Var = this.i;
        if (lo30Var == null || (list = lo30Var.g) == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Attach attach = (Attach) obj;
            String str2 = null;
            ftx0 ftx0Var = attach instanceof ftx0 ? (ftx0) attach : null;
            if (ftx0Var != null && (i1 = ftx0Var.i1()) != null) {
                str2 = i1.getPath();
            }
            if (epx.f(str2, str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((Attach) it.next()).xb()));
        }
        return arrayList2;
    }
}
