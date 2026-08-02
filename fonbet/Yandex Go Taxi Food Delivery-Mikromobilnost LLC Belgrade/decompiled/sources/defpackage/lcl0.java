package defpackage;

import android.graphics.Color;
import android.view.View;
import androidx.core.view.b;
import androidx.recyclerview.widget.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class lcl0 extends ncl0 {
    public final sgu0 O;
    public final n0 P;
    public final ListItemComponent Q;
    public final ArrayList R;
    public final o8g0 S;
    public final /* synthetic */ pcl0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lcl0(pcl0 pcl0Var, View view, s sVar, final mcl0 mcl0Var, sgu0 sgu0Var) {
        super(view);
        this.T = pcl0Var;
        this.O = sgu0Var;
        final int i = 1;
        this.P = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        int i2 = h7h0.route_stop_item_title;
        WeakHashMap weakHashMap = b.a;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(view, i2));
        this.Q = listItemComponent;
        this.R = new ArrayList();
        this.S = new o8g0(pcl0Var, view, false);
        final Object[] objArr = 0 == true ? 1 : 0;
        listItemComponent.setOnClickListener(new View.OnClickListener() { // from class: kcl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = objArr;
                lcl0 lcl0Var = this;
                mcl0 mcl0Var2 = mcl0Var;
                switch (i3) {
                    case 0:
                        if (mcl0Var2.f == 0) {
                            lcl0Var.N.g(Integer.valueOf(lcl0Var.F()));
                            break;
                        }
                        break;
                    default:
                        if (mcl0Var2.f == 0) {
                            lcl0Var.P.g(Integer.valueOf(lcl0Var.F()));
                            break;
                        }
                        break;
                }
            }
        });
        View inflateTrailView = listItemComponent.inflateTrailView(sjh0.route_stop_trail_icons);
        View view2 = (View) rp31.d(inflateTrailView, h7h0.stop_reorder);
        View view3 = (View) rp31.d(inflateTrailView, h7h0.stop_delete);
        listItemComponent.setTrailView(inflateTrailView);
        view2.setOnTouchListener(new rh2(4, sVar, this));
        view3.setOnClickListener(new View.OnClickListener() { // from class: kcl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                int i3 = i;
                lcl0 lcl0Var = this;
                mcl0 mcl0Var2 = mcl0Var;
                switch (i3) {
                    case 0:
                        if (mcl0Var2.f == 0) {
                            lcl0Var.N.g(Integer.valueOf(lcl0Var.F()));
                            break;
                        }
                        break;
                    default:
                        if (mcl0Var2.f == 0) {
                            lcl0Var.P.g(Integer.valueOf(lcl0Var.F()));
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.ncl0
    public final void W(zfu0 zfu0Var) {
        String h = zfu0Var.h();
        ListItemComponent listItemComponent = this.Q;
        listItemComponent.setTitle(h);
        listItemComponent.setSubtitle(zfu0Var.g());
        String h2 = zfu0Var.h();
        String g = zfu0Var.g();
        String format = String.format(listItemComponent.getResources().getString(kyh0.list_item_position_description), Arrays.copyOf(new Object[]{Integer.valueOf(G() + 1), Integer.valueOf(this.T.h())}, 2));
        String obj = h2 != null ? h2.toString() : null;
        if (obj == null) {
            obj = "";
        }
        listItemComponent.setContentDescription((g == null || evu0.J(g)) ? String.format("%s, %s", Arrays.copyOf(new Object[]{obj, format}, 2)) : String.format("%s, %s, %s", Arrays.copyOf(new Object[]{obj, g, format}, 3)));
    }

    @Override // defpackage.ncl0
    public final void X(final int i, boolean z) {
        sgu0 sgu0Var = this.O;
        ListItemComponent listItemComponent = this.Q;
        if (i == -1) {
            listItemComponent.setLeadImage(((ugu0) sgu0Var).a(-1));
            listItemComponent.setDividers(DividerPosition.NONE, DividerType.ICON);
        } else {
            listItemComponent.setLeadImage(((ugu0) sgu0Var).a(i));
            listItemComponent.setDividers(DividerPosition.BOTTOM, DividerType.ICON);
        }
        if (z) {
            int c = c.c(xng0.bgMain, listItemComponent);
            listItemComponent.setBackgroundColor(Color.argb((int) (Color.alpha(c) * 0.5f), Color.red(c), Color.green(c), Color.blue(c)));
        } else {
            listItemComponent.setBackground(vng.t(dzg0.component_default_list_item_bg, listItemComponent.getContext()));
        }
        ArrayList arrayList = this.R;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b.m(((Number) it.next()).intValue(), listItemComponent);
        }
        arrayList.clear();
        final int i2 = 1;
        if (i != 1) {
            final int i3 = 0;
            arrayList.add(Integer.valueOf(a0(kyh0.reorder_action_set_first, new pi(this) { // from class: jcl0
                public final /* synthetic */ lcl0 b;

                {
                    this.b = this;
                }

                @Override // defpackage.pi
                public final boolean o(View view, hi hiVar) {
                    int i4 = i3;
                    int i5 = i;
                    lcl0 lcl0Var = this.b;
                    switch (i4) {
                        case 0:
                            o8g0 o8g0Var = lcl0Var.S;
                            pcl0 pcl0Var = (pcl0) o8g0Var.b;
                            o8g0Var.g(pcl0.f(pcl0Var, i5), pcl0Var.i());
                            break;
                        case 1:
                            o8g0 o8g0Var2 = lcl0Var.S;
                            int f = pcl0.f((pcl0) o8g0Var2.b, i5);
                            o8g0Var2.g(f, f - 1);
                            break;
                        case 2:
                            o8g0 o8g0Var3 = lcl0Var.S;
                            int f2 = pcl0.f((pcl0) o8g0Var3.b, i5);
                            o8g0Var3.g(f2, f2 + 1);
                            break;
                        case 3:
                            o8g0 o8g0Var4 = lcl0Var.S;
                            pcl0 pcl0Var2 = (pcl0) o8g0Var4.b;
                            o8g0Var4.g(pcl0.f(pcl0Var2, i5), pcl0Var2.i() + (pcl0Var2.h() - 1));
                            break;
                        default:
                            o8g0 o8g0Var5 = lcl0Var.S;
                            pcl0 pcl0Var3 = (pcl0) o8g0Var5.b;
                            int f3 = pcl0.f(pcl0Var3, i5);
                            View view2 = (View) o8g0Var5.a;
                            view2.announceForAccessibility(view2.getResources().getString(kyh0.remove_stop_result, Integer.valueOf(f3 + 1), Integer.valueOf(pcl0Var3.h())));
                            ((mdl0) pcl0Var3.b).c(f3);
                            pcl0Var3.notifyDataSetChanged();
                            break;
                    }
                    return false;
                }
            })));
            arrayList.add(Integer.valueOf(a0(kyh0.reorder_action_move_above, new pi(this) { // from class: jcl0
                public final /* synthetic */ lcl0 b;

                {
                    this.b = this;
                }

                @Override // defpackage.pi
                public final boolean o(View view, hi hiVar) {
                    int i4 = i2;
                    int i5 = i;
                    lcl0 lcl0Var = this.b;
                    switch (i4) {
                        case 0:
                            o8g0 o8g0Var = lcl0Var.S;
                            pcl0 pcl0Var = (pcl0) o8g0Var.b;
                            o8g0Var.g(pcl0.f(pcl0Var, i5), pcl0Var.i());
                            break;
                        case 1:
                            o8g0 o8g0Var2 = lcl0Var.S;
                            int f = pcl0.f((pcl0) o8g0Var2.b, i5);
                            o8g0Var2.g(f, f - 1);
                            break;
                        case 2:
                            o8g0 o8g0Var3 = lcl0Var.S;
                            int f2 = pcl0.f((pcl0) o8g0Var3.b, i5);
                            o8g0Var3.g(f2, f2 + 1);
                            break;
                        case 3:
                            o8g0 o8g0Var4 = lcl0Var.S;
                            pcl0 pcl0Var2 = (pcl0) o8g0Var4.b;
                            o8g0Var4.g(pcl0.f(pcl0Var2, i5), pcl0Var2.i() + (pcl0Var2.h() - 1));
                            break;
                        default:
                            o8g0 o8g0Var5 = lcl0Var.S;
                            pcl0 pcl0Var3 = (pcl0) o8g0Var5.b;
                            int f3 = pcl0.f(pcl0Var3, i5);
                            View view2 = (View) o8g0Var5.a;
                            view2.announceForAccessibility(view2.getResources().getString(kyh0.remove_stop_result, Integer.valueOf(f3 + 1), Integer.valueOf(pcl0Var3.h())));
                            ((mdl0) pcl0Var3.b).c(f3);
                            pcl0Var3.notifyDataSetChanged();
                            break;
                    }
                    return false;
                }
            })));
        }
        if (i != -1) {
            final int i4 = 2;
            arrayList.add(Integer.valueOf(a0(kyh0.reorder_action_move_below, new pi(this) { // from class: jcl0
                public final /* synthetic */ lcl0 b;

                {
                    this.b = this;
                }

                @Override // defpackage.pi
                public final boolean o(View view, hi hiVar) {
                    int i42 = i4;
                    int i5 = i;
                    lcl0 lcl0Var = this.b;
                    switch (i42) {
                        case 0:
                            o8g0 o8g0Var = lcl0Var.S;
                            pcl0 pcl0Var = (pcl0) o8g0Var.b;
                            o8g0Var.g(pcl0.f(pcl0Var, i5), pcl0Var.i());
                            break;
                        case 1:
                            o8g0 o8g0Var2 = lcl0Var.S;
                            int f = pcl0.f((pcl0) o8g0Var2.b, i5);
                            o8g0Var2.g(f, f - 1);
                            break;
                        case 2:
                            o8g0 o8g0Var3 = lcl0Var.S;
                            int f2 = pcl0.f((pcl0) o8g0Var3.b, i5);
                            o8g0Var3.g(f2, f2 + 1);
                            break;
                        case 3:
                            o8g0 o8g0Var4 = lcl0Var.S;
                            pcl0 pcl0Var2 = (pcl0) o8g0Var4.b;
                            o8g0Var4.g(pcl0.f(pcl0Var2, i5), pcl0Var2.i() + (pcl0Var2.h() - 1));
                            break;
                        default:
                            o8g0 o8g0Var5 = lcl0Var.S;
                            pcl0 pcl0Var3 = (pcl0) o8g0Var5.b;
                            int f3 = pcl0.f(pcl0Var3, i5);
                            View view2 = (View) o8g0Var5.a;
                            view2.announceForAccessibility(view2.getResources().getString(kyh0.remove_stop_result, Integer.valueOf(f3 + 1), Integer.valueOf(pcl0Var3.h())));
                            ((mdl0) pcl0Var3.b).c(f3);
                            pcl0Var3.notifyDataSetChanged();
                            break;
                    }
                    return false;
                }
            })));
            final int i5 = 3;
            arrayList.add(Integer.valueOf(a0(kyh0.reorder_action_set_last, new pi(this) { // from class: jcl0
                public final /* synthetic */ lcl0 b;

                {
                    this.b = this;
                }

                @Override // defpackage.pi
                public final boolean o(View view, hi hiVar) {
                    int i42 = i5;
                    int i52 = i;
                    lcl0 lcl0Var = this.b;
                    switch (i42) {
                        case 0:
                            o8g0 o8g0Var = lcl0Var.S;
                            pcl0 pcl0Var = (pcl0) o8g0Var.b;
                            o8g0Var.g(pcl0.f(pcl0Var, i52), pcl0Var.i());
                            break;
                        case 1:
                            o8g0 o8g0Var2 = lcl0Var.S;
                            int f = pcl0.f((pcl0) o8g0Var2.b, i52);
                            o8g0Var2.g(f, f - 1);
                            break;
                        case 2:
                            o8g0 o8g0Var3 = lcl0Var.S;
                            int f2 = pcl0.f((pcl0) o8g0Var3.b, i52);
                            o8g0Var3.g(f2, f2 + 1);
                            break;
                        case 3:
                            o8g0 o8g0Var4 = lcl0Var.S;
                            pcl0 pcl0Var2 = (pcl0) o8g0Var4.b;
                            o8g0Var4.g(pcl0.f(pcl0Var2, i52), pcl0Var2.i() + (pcl0Var2.h() - 1));
                            break;
                        default:
                            o8g0 o8g0Var5 = lcl0Var.S;
                            pcl0 pcl0Var3 = (pcl0) o8g0Var5.b;
                            int f3 = pcl0.f(pcl0Var3, i52);
                            View view2 = (View) o8g0Var5.a;
                            view2.announceForAccessibility(view2.getResources().getString(kyh0.remove_stop_result, Integer.valueOf(f3 + 1), Integer.valueOf(pcl0Var3.h())));
                            ((mdl0) pcl0Var3.b).c(f3);
                            pcl0Var3.notifyDataSetChanged();
                            break;
                    }
                    return false;
                }
            })));
        }
        final int i6 = 4;
        arrayList.add(Integer.valueOf(a0(kyh0.remove_stop_content_description, new pi(this) { // from class: jcl0
            public final /* synthetic */ lcl0 b;

            {
                this.b = this;
            }

            @Override // defpackage.pi
            public final boolean o(View view, hi hiVar) {
                int i42 = i6;
                int i52 = i;
                lcl0 lcl0Var = this.b;
                switch (i42) {
                    case 0:
                        o8g0 o8g0Var = lcl0Var.S;
                        pcl0 pcl0Var = (pcl0) o8g0Var.b;
                        o8g0Var.g(pcl0.f(pcl0Var, i52), pcl0Var.i());
                        break;
                    case 1:
                        o8g0 o8g0Var2 = lcl0Var.S;
                        int f = pcl0.f((pcl0) o8g0Var2.b, i52);
                        o8g0Var2.g(f, f - 1);
                        break;
                    case 2:
                        o8g0 o8g0Var3 = lcl0Var.S;
                        int f2 = pcl0.f((pcl0) o8g0Var3.b, i52);
                        o8g0Var3.g(f2, f2 + 1);
                        break;
                    case 3:
                        o8g0 o8g0Var4 = lcl0Var.S;
                        pcl0 pcl0Var2 = (pcl0) o8g0Var4.b;
                        o8g0Var4.g(pcl0.f(pcl0Var2, i52), pcl0Var2.i() + (pcl0Var2.h() - 1));
                        break;
                    default:
                        o8g0 o8g0Var5 = lcl0Var.S;
                        pcl0 pcl0Var3 = (pcl0) o8g0Var5.b;
                        int f3 = pcl0.f(pcl0Var3, i52);
                        View view2 = (View) o8g0Var5.a;
                        view2.announceForAccessibility(view2.getResources().getString(kyh0.remove_stop_result, Integer.valueOf(f3 + 1), Integer.valueOf(pcl0Var3.h())));
                        ((mdl0) pcl0Var3.b).c(f3);
                        pcl0Var3.notifyDataSetChanged();
                        break;
                }
                return false;
            }
        })));
    }

    @Override // defpackage.ncl0
    public final tpr Y() {
        return this.P;
    }

    @Override // defpackage.ncl0
    public final boolean Z() {
        return true;
    }

    public final int a0(int i, pi piVar) {
        ListItemComponent listItemComponent = this.Q;
        return b.a(listItemComponent, listItemComponent.getResources().getString(i), piVar);
    }
}
