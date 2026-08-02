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
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.g34;

/* compiled from: MsgPartBoxPhotoVideoHolder.kt */
/* loaded from: classes2.dex */
public final class mo30 extends hr30<Attach, no30> implements g34.a {
    public final f6y0 d;
    public Context e;
    public ZhukovLayout f;
    public TimeAndStatusView g;
    public dj0 h;
    public g34 i;
    public no30 j;

    public mo30(f6y0 f6y0Var) {
        this.d = f6y0Var;
    }

    @Override // xsna.g34.a
    public final void c(int i) {
        int s = s(i);
        if (s >= 0) {
            ZhukovLayout zhukovLayout = this.f;
            if (zhukovLayout == null) {
                zhukovLayout = null;
            }
            ((wr6) zhukovLayout.a(s)).c(i);
        }
    }

    @Override // xsna.g34.a
    public final void e(int i, int i2, int i3) {
        int s = s(i);
        if (s >= 0) {
            ZhukovLayout zhukovLayout = this.f;
            if (zhukovLayout == null) {
                zhukovLayout = null;
            }
            ((wr6) zhukovLayout.a(s)).e(i, i2, i3);
        }
    }

    @Override // xsna.g34.a
    public final void f(int i) {
        int s = s(i);
        if (s >= 0) {
            ZhukovLayout zhukovLayout = this.f;
            if (zhukovLayout == null) {
                zhukovLayout = null;
            }
            ((wr6) zhukovLayout.a(s)).d(i);
        }
    }

    @Override // xsna.hr30
    public final View n(int i) {
        int s = s(i);
        ZhukovLayout zhukovLayout = this.f;
        if (zhukovLayout == null) {
            zhukovLayout = null;
        }
        return zhukovLayout.getChildAt(s);
    }

    @Override // xsna.hr30
    public final void p(no30 no30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        no30 no30Var2 = no30Var;
        this.j = no30Var2;
        this.i = no30Var2.i;
        List<? extends Attach> list = no30Var2.g;
        if (list != null) {
            for (Attach attach : list) {
                g34 g34Var = this.i;
                if (g34Var != null) {
                    g34Var.a(attach.xb(), this);
                }
            }
        }
        dj0 dj0Var = this.h;
        if (dj0Var == null) {
            dj0Var = null;
        }
        Context context = this.e;
        if (context == null) {
            context = null;
        }
        f14 e = no30Var2.e(context);
        int i = e.a;
        int i2 = e.b;
        Context context2 = this.e;
        if (context2 == null) {
            context2 = null;
        }
        boolean z = false;
        int c = (no30Var2.m || no30Var2.n) ? 0 : no30Var2.c(context2);
        zuj zujVar = dj0Var.h;
        zujVar.a = i;
        zujVar.b = i2;
        zujVar.c = c;
        dj0Var.e = no30Var2.e;
        dj0Var.f = no30Var2.h;
        dj0Var.g = pk30Var;
        List<? extends Attach> H0 = j5g.H0(list, 10);
        if (dj0Var.c.size() == H0.size()) {
            Iterable g = e43.g(dj0Var.c);
            if (!(g instanceof Collection) || !((Collection) g).isEmpty()) {
                j9x it = g.iterator();
                while (it.d) {
                    int nextInt = it.nextInt();
                    if (!H0.get(nextInt).getClass().equals(dj0Var.c.get(nextInt).getClass()) || H0.get(nextInt).xb() != dj0Var.c.get(nextInt).xb()) {
                        break;
                    }
                }
            }
            z = true;
        }
        dj0Var.c = H0;
        if (z) {
            for (Map.Entry<Integer, wr6> entry : dj0Var.d.entrySet()) {
                entry.getValue().b(dj0Var.e, dj0Var.f, dj0Var.c.get(entry.getKey().intValue()), dj0Var.g);
            }
        } else {
            dj0Var.d.clear();
            ZhukovLayout zhukovLayout = dj0Var.a;
            if (zhukovLayout != null) {
                zhukovLayout.c();
            }
        }
        jr30 jr30Var = no30Var2.f;
        TimeAndStatusView timeAndStatusView = this.g;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, true);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.e = viewGroup.getContext();
        View inflate = layoutInflater.inflate(R.layout.vkim_msg_part_box_photovideo, viewGroup, false);
        ZhukovLayout zhukovLayout = (ZhukovLayout) inflate.findViewById(R.id.zhukov);
        this.f = zhukovLayout;
        zhukovLayout.setPools(this.d);
        this.g = (TimeAndStatusView) inflate.findViewById(R.id.timeAndStatus);
        Context context = this.e;
        if (context == null) {
            context = null;
        }
        dj0 dj0Var = new dj0(context);
        this.h = dj0Var;
        ZhukovLayout zhukovLayout2 = this.f;
        (zhukovLayout2 != null ? zhukovLayout2 : null).setAdapter(dj0Var);
        return inflate;
    }

    @Override // xsna.hr30
    public final void r() {
        List<? extends Attach> list;
        no30 no30Var = this.j;
        if (no30Var != null && (list = no30Var.g) != null) {
            for (Attach attach : list) {
                g34 g34Var = this.i;
                if (g34Var != null) {
                    g34Var.a(attach.xb(), null);
                }
            }
        }
        this.i = null;
        this.j = null;
    }

    public final int s(int i) {
        dj0 dj0Var = this.h;
        if (dj0Var == null) {
            dj0Var = null;
        }
        Iterator<? extends Attach> it = dj0Var.c.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().xb() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // xsna.hr30
    public final Collection<Integer> v(String str) {
        List<? extends Attach> list;
        File i1;
        no30 no30Var = this.j;
        if (no30Var == null || (list = no30Var.g) == null) {
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
