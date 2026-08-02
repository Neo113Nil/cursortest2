package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.ae0;
import xsna.av20;
import xsna.dw20;
import xsna.mut0;
import xsna.rd0;

/* compiled from: AdChoiceAdapter.kt */
/* loaded from: classes14.dex */
public final class kd0 implements od0 {
    public final ld0 a;
    public z0n b;
    public final b c;

    /* compiled from: AdChoiceAdapter.kt */
    public static final class a {
        public a() {
        }

        public final void a(jd0 jd0Var) {
            b bVar = kd0.this.c;
            fvy0 fvy0Var = bVar.b;
            if (fvy0Var != null) {
                fvy0Var.a((b520) bVar.c.get((int) jd0Var.a));
            }
        }

        public final void b() {
            Object obj;
            fvy0 fvy0Var;
            b bVar = kd0.this.c;
            Iterator it = bVar.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((b520) obj).d == 1) {
                        break;
                    }
                }
            }
            b520 b520Var = (b520) obj;
            if (b520Var == null || (fvy0Var = bVar.b) == null) {
                return;
            }
            fvy0Var.a(b520Var);
        }
    }

    public kd0() {
        ld0 ld0Var = new ld0();
        this.a = ld0Var;
        ld0Var.b = new a();
        this.c = new b();
    }

    @Override // xsna.od0
    public final b a() {
        return this.c;
    }

    @Override // xsna.od0
    public final void b(boolean z) {
        this.a.a = z;
    }

    @Override // xsna.od0
    public final void c(cw50 cw50Var) {
        l0n l0nVar = cw50Var.k;
        if (l0nVar == null || l0nVar.a != 10) {
            this.b = null;
        } else {
            this.b = new z0n(j5g.g0(rl3.I(new String[]{cw50Var.o, cw50Var.l}), " ", null, null, 0, null, 62), l0nVar.c);
        }
    }

    /* compiled from: AdChoiceAdapter.kt */
    public final class b implements i620 {
        public fvy0 b;
        public final ArrayList c = new ArrayList();

        public b() {
        }

        @Override // xsna.i620
        public final a520 b() {
            return new a();
        }

        /* compiled from: AdChoiceAdapter.kt */
        public final class a implements a520 {
            public a() {
            }

            @Override // xsna.a520
            public final void a(fvy0 fvy0Var) {
                b.this.b = fvy0Var;
            }

            @Override // xsna.a520
            public final void b(b520 b520Var) {
                b.this.c.add(b520Var);
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.a520
            public final void c(Context context) {
                String str;
                String str2;
                b bVar = b.this;
                kd0 kd0Var = kd0.this;
                ld0 ld0Var = kd0Var.a;
                ArrayList arrayList = bVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        z0n z0nVar = kd0Var.b;
                        if (((Boolean) ld0Var.d.getValue()).booleanValue()) {
                            int i2 = 1;
                            ae0 ae0Var = new ae0(new ae0.a(context, arrayList2, z0nVar, new com.vk.movika.sdk.base.observable.p(ld0Var, i2), new defpackage.g(ld0Var, i2)));
                            Activity h = e3m.h(context);
                            FragmentActivity fragmentActivity = h instanceof FragmentActivity ? (FragmentActivity) h : null;
                            if (fragmentActivity == null) {
                                return;
                            }
                            ViewGroup viewGroup = (ViewGroup) fragmentActivity.getWindow().getDecorView();
                            ComposeView composeView = new ComposeView(context, null, 6);
                            composeView.setViewCompositionStrategy(mut0.a.a);
                            composeView.setContent(new jai(1297101859, new ud0(ae0Var, viewGroup, composeView, 0), true));
                            viewGroup.addView(composeView);
                            return;
                        }
                        int i3 = 3;
                        rd0 rd0Var = new rd0(context, ld0Var.a, arrayList2, z0nVar, new tb(ld0Var, i3), new defpackage.i(ld0Var, i3));
                        av20.a aVar = new av20.a();
                        aVar.d(R.layout.ad_choice_popup_item, LayoutInflater.from(context));
                        aVar.d = new sd0();
                        aVar.c(new pd0(rd0Var, 0));
                        av20 b = aVar.b();
                        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(new rd0.a((jd0) it2.next()));
                        }
                        b.setItems(arrayList3);
                        dw20.b bVar2 = new dw20.b(context, null);
                        if (z0nVar != null && (str2 = z0nVar.a) != null) {
                            bVar2.z0(8388611);
                            bVar2.B0(Integer.valueOf(iah0.a(10)));
                            bVar2.w0(str2);
                            bVar2.x0(Integer.valueOf(iah0.a(8)));
                            bVar2.A0(Integer.valueOf(R.style.VkUiTypography_FootnoteMedium));
                            bVar2.y0(e3m.f(R.attr.vk_ui_text_subhead, bVar2.c));
                        }
                        if (z0nVar != null && (str = z0nVar.b) != null) {
                            e.a aVar2 = bVar2.d;
                            aVar2.e0 = 8388611;
                            bVar2.s0(str);
                            aVar2.f0 = 0;
                            aVar2.d0 = Integer.valueOf(R.style.VkUiTypography_Footnote);
                            aVar2.g0 = Integer.valueOf(iah0.a(16));
                            bVar2.t0(e3m.f(R.attr.vk_ui_text_subhead, bVar2.c));
                        }
                        bVar2.a0(new defpackage.j(rd0Var, 4));
                        dw20.a.k(bVar2, b, 4);
                        bVar2.f0(new w8(rd0Var, 2));
                        rd0Var.d = bVar2.I0("menu_ad_choice");
                        ld0Var.c = rd0Var;
                        return;
                    }
                    Object next = it.next();
                    int i4 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    b520 b520Var = (b520) next;
                    jd0 jd0Var = b520Var.d == 0 ? new jd0(i, b520Var.a) : null;
                    if (jd0Var != null) {
                        arrayList2.add(jd0Var);
                    }
                    i = i4;
                }
            }

            @Override // xsna.a520
            public final void dismiss() {
                dw20 dw20Var;
                b bVar = b.this;
                bVar.c.clear();
                rd0 rd0Var = kd0.this.a.c;
                if (rd0Var == null || (dw20Var = rd0Var.d) == null) {
                    return;
                }
                dw20Var.dismiss();
            }

            @Override // xsna.a520
            public final void d(String str) {
            }
        }
    }
}
