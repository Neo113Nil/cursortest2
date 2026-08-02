package com.yandex.messaging.internal.view.timeline;

import android.content.Context;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.chip.ChipGroup;
import com.yandex.messaging.internal.entities.AiBotAction;
import com.yandex.messaging.internal.entities.Suggest;
import defpackage.acb;
import defpackage.ai91;
import defpackage.bcv0;
import defpackage.ce0;
import defpackage.e8m;
import defpackage.e9h0;
import defpackage.g62;
import defpackage.gvg0;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.iw10;
import defpackage.jwf;
import defpackage.kgx;
import defpackage.kjs0;
import defpackage.kse;
import defpackage.l8x;
import defpackage.lh00;
import defpackage.lj91;
import defpackage.lt0;
import defpackage.nhk0;
import defpackage.nka1;
import defpackage.nm1;
import defpackage.nw10;
import defpackage.ny61;
import defpackage.olh0;
import defpackage.oo31;
import defpackage.oyh0;
import defpackage.pj91;
import defpackage.pm1;
import defpackage.pm5;
import defpackage.pzt0;
import defpackage.qm1;
import defpackage.qoi0;
import defpackage.rbv0;
import defpackage.rm1;
import defpackage.rp3;
import defpackage.scc;
import defpackage.sls;
import defpackage.sm1;
import defpackage.tje;
import defpackage.tm1;
import defpackage.tu10;
import defpackage.zoy0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class a {
    public static final zoy0 i;
    public static final /* synthetic */ kgx[] j;
    public final View a;
    public final com.yandex.messaging.internal.view.timeline.overlay.b b;
    public final tm1 c;
    public final rm1 d;
    public final ViewGroup e;
    public final c0 f;
    public final ViewGroup g;
    public final rp3 h;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("overlaysObservationJob", 0, "getOverlaysObservationJob()Lkotlinx/coroutines/Job;", a.class);
        qoi0.a.getClass();
        j = new kgx[]{mutablePropertyReference1Impl};
        i = new zoy0();
    }

    public a(View view, pm5 pm5Var, com.yandex.messaging.internal.view.timeline.overlay.b bVar, tm1 tm1Var, iw10 iw10Var, jwf jwfVar, sls slsVar) {
        sm1 sm1Var = (sm1) jwfVar.N;
        this.a = view;
        this.b = bVar;
        this.c = tm1Var;
        this.h = new rp3();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.removeView(view);
        View f = oo31.f(viewGroup, olh0.msg_message_and_ai_bot_interactions_container, viewGroup, false);
        if (f == null) {
            ny61.t("null cannot be cast to non-null type android.widget.LinearLayout");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) f;
        linearLayout.addView(view, 0);
        ViewGroup viewGroup2 = (ViewGroup) linearLayout.findViewById(e9h0.actions_and_added_buttons_container);
        this.e = viewGroup2;
        this.d = new rm1(viewGroup2, slsVar, sm1Var, (kse) jwfVar.O, (h3y) jwfVar.E);
        ViewGroup viewGroup3 = (ViewGroup) linearLayout.findViewById(e9h0.ai_bot_suggests_container);
        this.g = viewGroup3;
        this.f = new c0(viewGroup3, (h3y) jwfVar.D, (kse) jwfVar.O, slsVar, iw10Var, sm1Var);
        viewGroup.addView(linearLayout);
        g62[] g62VarArr = (g62[]) pm5Var.b;
        for (int i2 = 0; i2 < 2; i2++) {
            g62VarArr[i2].a(linearLayout, view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(List list, ArrayList arrayList, List list2, List list3, tu10 tu10Var) {
        List list4;
        View view;
        boolean z;
        int i2;
        Size size;
        com.yandex.messaging.internal.view.timeline.overlay.b bVar;
        int i3;
        Integer num;
        rm1 rm1Var;
        com.yandex.messaging.internal.view.timeline.overlay.b bVar2;
        Size size2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int i4;
        int i5;
        List list5;
        com.yandex.messaging.internal.view.timeline.overlay.b bVar3;
        ViewGroup viewGroup3;
        View view2 = this.a;
        Context context = view2.getContext();
        int i6 = context.getResources().getDisplayMetrics().widthPixels;
        tm1 tm1Var = this.c;
        int min = Math.min((i6 - tm1Var.a) - tm1Var.b, context.getResources().getDimensionPixelSize(gvg0.timeline_message_max_width));
        c0 c0Var = this.f;
        lh00 lh00Var = c0Var.m;
        rp3 rp3Var = c0Var.k;
        i3y i3yVar = c0Var.f;
        i3y i3yVar2 = c0Var.h;
        ViewGroup viewGroup4 = c0Var.a;
        List list6 = list2;
        if (!((list6 == null || list6.isEmpty()) && ((list4 = list3) == null || list4.isEmpty())) && ((rbv0) c0Var.b.get()).c && (tu10Var.c == 0 || tu10Var.b)) {
            if (list2 == null || !(!list2.isEmpty())) {
                view = view2;
                i2 = 8;
                if (list3 == null || !(!list3.isEmpty())) {
                    z = true;
                } else {
                    ArrayList arrayList2 = c0Var.g;
                    List A0 = kotlin.collections.a.A0(list3, 100);
                    int size3 = A0.size() - ((ChipGroup) i3yVar.getValue()).getChildCount();
                    if (size3 > 0) {
                        for (int i7 = 0; i7 < size3; i7++) {
                            ChipGroup chipGroup = (ChipGroup) i3yVar.getValue();
                            View f = oo31.f(viewGroup4, olh0.msg_v_ai_bot_regular_suggest_item, viewGroup4, false);
                            if (f == null) {
                                ny61.t("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
                                return;
                            }
                            AppCompatTextView appCompatTextView = (AppCompatTextView) f;
                            arrayList2.add(appCompatTextView);
                            chipGroup.addView(appCompatTextView);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    boolean z2 = false;
                    int i8 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            scc.m();
                            throw null;
                        }
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) next;
                        if (i8 >= A0.size()) {
                            appCompatTextView2.setVisibility(8);
                        } else {
                            Suggest suggest = (Suggest) A0.get(i8);
                            bcv0 bcv0Var = new bcv0(appCompatTextView2, suggest, new lt0(c0Var, suggest, tu10Var, i8, 1), false);
                            appCompatTextView2.setVisibility(0);
                            bcv0Var.a();
                            String buttonId = suggest.getButtonId();
                            if (buttonId != null) {
                                lh00Var.a.put(buttonId, bcv0Var);
                                lh00Var.b.remove(buttonId);
                            }
                            z2 = true;
                        }
                        i8 = i9;
                    }
                    if (z2) {
                        viewGroup4.setVisibility(0);
                        ((ChipGroup) i3yVar.getValue()).setVisibility(0);
                        ((FrameLayout) i3yVar2.getValue()).setVisibility(8);
                        viewGroup4.measure(View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                        size = new Size(viewGroup4.getMeasuredWidth(), viewGroup4.getMeasuredHeight());
                    } else {
                        c0Var.a();
                        size = null;
                    }
                    pzt0 N = tje.N(nka1.c(pj91.f(viewGroup4)), null, null, new SuggestsUiDelegate$subscribeToRegularTranslations$1(c0Var, null), 3);
                    z = true;
                    kgx kgxVar = c0.n[1];
                    rp3Var.a(N);
                }
            } else {
                List A02 = kotlin.collections.a.A0(list2, 100);
                ArrayList arrayList3 = new ArrayList();
                int i10 = 0;
                for (Object obj : A02) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        scc.m();
                        throw null;
                    }
                    List list7 = (List) obj;
                    if (list7.isEmpty()) {
                        list7 = null;
                    }
                    List A03 = list7 != null ? kotlin.collections.a.A0(list7, 10) : null;
                    if (A03 != null) {
                        arrayList3.add(A03);
                    }
                    i10 = i11;
                }
                ArrayList arrayList4 = c0Var.i;
                if (!arrayList3.isEmpty() && !arrayList3.isEmpty()) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        if (((List) it2.next()).isEmpty()) {
                            arrayList4 = arrayList4;
                        } else {
                            Context context2 = viewGroup4.getContext();
                            ((FrameLayout) i3yVar2.getValue()).removeAllViews();
                            TableLayout tableLayout = new TableLayout(context2);
                            tableLayout.setLayoutParams(new TableLayout.LayoutParams(min, -2));
                            tableLayout.setShrinkAllColumns(true);
                            tableLayout.setStretchAllColumns(true);
                            int a = e8m.a(6);
                            arrayList4.clear();
                            Iterator it3 = arrayList3.iterator();
                            TableLayout tableLayout2 = tableLayout;
                            int i12 = 0;
                            while (it3.hasNext()) {
                                Object next2 = it3.next();
                                int i13 = i12 + 1;
                                if (i12 < 0) {
                                    scc.m();
                                    throw null;
                                }
                                List list8 = (List) next2;
                                LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(context2);
                                c0 c0Var2 = c0Var;
                                linearLayoutCompat.setOrientation(0);
                                View view3 = view2;
                                TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(min, -2);
                                if (i12 != 0) {
                                    layoutParams.setMargins(0, a, 0, 0);
                                }
                                linearLayoutCompat.setLayoutParams(layoutParams);
                                linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
                                ArrayList arrayList5 = new ArrayList();
                                arrayList4.add(arrayList5);
                                int i14 = 0;
                                for (Object obj2 : list8) {
                                    int i15 = i14 + 1;
                                    if (i14 < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    Suggest suggest2 = (Suggest) obj2;
                                    i3y i3yVar3 = i3yVar;
                                    ViewGroup frameLayout = new FrameLayout(context2);
                                    Context context3 = context2;
                                    int i16 = i14;
                                    LinearLayoutCompat.LayoutParams layoutParams2 = new LinearLayoutCompat.LayoutParams(0, -1);
                                    ((LinearLayout.LayoutParams) layoutParams2).weight = 1.0f;
                                    if (i16 != 0) {
                                        ((LinearLayout.LayoutParams) layoutParams2).leftMargin = a;
                                    }
                                    ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
                                    frameLayout.setLayoutParams(layoutParams2);
                                    linearLayoutCompat.addView(frameLayout);
                                    View inflate = LayoutInflater.from(context3).inflate(olh0.msg_v_ai_bot_layout_suggest_item, frameLayout, false);
                                    if (inflate == null) {
                                        ny61.t("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
                                        return;
                                    }
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) inflate;
                                    appCompatTextView3.setGravity(17);
                                    int i17 = a;
                                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                                    layoutParams3.gravity = 17;
                                    appCompatTextView3.setLayoutParams(layoutParams3);
                                    arrayList5.add(appCompatTextView3);
                                    ArrayList arrayList6 = arrayList5;
                                    i3y i3yVar4 = i3yVar2;
                                    TableLayout tableLayout3 = tableLayout2;
                                    c0 c0Var3 = c0Var2;
                                    ArrayList arrayList7 = arrayList4;
                                    bcv0 bcv0Var2 = new bcv0(appCompatTextView3, suggest2, new nhk0(c0Var3, suggest2, tu10Var, i16, i12), true);
                                    bcv0Var2.a();
                                    String buttonId2 = suggest2.getButtonId();
                                    if (buttonId2 != null) {
                                        lh00Var.a.put(buttonId2, bcv0Var2);
                                        lh00Var.b.remove(buttonId2);
                                    }
                                    frameLayout.addView(appCompatTextView3);
                                    tableLayout2 = tableLayout3;
                                    context2 = context3;
                                    i3yVar2 = i3yVar4;
                                    arrayList4 = arrayList7;
                                    i3yVar = i3yVar3;
                                    arrayList5 = arrayList6;
                                    a = i17;
                                    c0Var2 = c0Var3;
                                    i14 = i15;
                                }
                                c0Var = c0Var2;
                                tableLayout2.addView(linearLayoutCompat);
                                i12 = i13;
                                arrayList4 = arrayList4;
                                view2 = view3;
                            }
                            view = view2;
                            i3y i3yVar5 = i3yVar2;
                            i2 = 8;
                            ((FrameLayout) i3yVar5.getValue()).addView(tableLayout2);
                            viewGroup4.setVisibility(0);
                            ((FrameLayout) i3yVar5.getValue()).setVisibility(0);
                            ((ChipGroup) i3yVar.getValue()).setVisibility(8);
                            viewGroup4.measure(View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                            size = new Size(viewGroup4.getMeasuredWidth(), viewGroup4.getMeasuredHeight());
                            pzt0 N2 = tje.N(nka1.c(pj91.f(viewGroup4)), null, null, new SuggestsUiDelegate$subscribeToLayoutTranslations$1(c0Var, null), 3);
                            kgx kgxVar2 = c0.n[1];
                            rp3Var.a(N2);
                            z = true;
                        }
                    }
                }
                view = view2;
                i2 = 8;
                c0Var.a();
                c0Var.a();
                size = null;
                pzt0 N22 = tje.N(nka1.c(pj91.f(viewGroup4)), null, null, new SuggestsUiDelegate$subscribeToLayoutTranslations$1(c0Var, null), 3);
                kgx kgxVar22 = c0.n[1];
                rp3Var.a(N22);
                z = true;
            }
            bVar = this.b;
            if (size == null) {
                int width = size.getWidth();
                Integer valueOf = Integer.valueOf(width);
                size.getHeight();
                num = valueOf;
                i3 = b(min, width, bVar.d());
            } else {
                i3 = 0;
                num = null;
            }
            rm1Var = this.d;
            ViewGroup viewGroup5 = rm1Var.a;
            lh00 lh00Var2 = rm1Var.h;
            ViewGroup viewGroup6 = rm1Var.f;
            List list9 = list;
            boolean z3 = (list9 != null || list9.isEmpty()) ? z : false;
            boolean isEmpty = arrayList.isEmpty();
            if (((nm1) rm1Var.d.get()).c || (z3 && isEmpty)) {
                bVar2 = bVar;
                rm1Var.a();
            } else {
                if (z3) {
                    bVar2 = bVar;
                    viewGroup6.setVisibility(i2);
                    lh00Var2.a.clear();
                    lh00Var2.b.clear();
                    i4 = 0;
                } else {
                    acb acbVar = (acb) rm1Var.j.getValue();
                    List A04 = kotlin.collections.a.A0(list, 6);
                    int size4 = A04.size();
                    ArrayList arrayList8 = rm1Var.e;
                    int size5 = size4 - arrayList8.size();
                    if (size5 > 0) {
                        int i18 = 0;
                        while (i18 < size5) {
                            View f2 = oo31.f(viewGroup6, olh0.msg_v_ai_bot_action_img_only_item, viewGroup6, false);
                            if (f2 == null) {
                                ny61.t("null cannot be cast to non-null type android.view.View");
                                return;
                            }
                            arrayList8.add(new pm1((ImageView) f2.findViewById(e9h0.ai_bot_action_icon), f2));
                            viewGroup6.addView(f2);
                            i18++;
                            size5 = size5;
                        }
                    }
                    Iterator it4 = arrayList8.iterator();
                    int i19 = 0;
                    int i20 = 0;
                    while (it4.hasNext()) {
                        Object next3 = it4.next();
                        int i21 = i19 + 1;
                        if (i19 < 0) {
                            scc.m();
                            throw null;
                        }
                        pm1 pm1Var = (pm1) next3;
                        if (i19 >= A04.size()) {
                            pm1Var.a.setVisibility(8);
                            list5 = A04;
                            bVar3 = bVar;
                            viewGroup3 = viewGroup6;
                        } else {
                            AiBotAction aiBotAction = (AiBotAction) A04.get(i19);
                            list5 = A04;
                            bVar3 = bVar;
                            viewGroup3 = viewGroup6;
                            qm1 qm1Var = new qm1(pm1Var, aiBotAction, rm1Var, aiBotAction, tu10Var, acbVar, kotlin.collections.a.M(aiBotAction.getDirectives()));
                            View view4 = pm1Var.a;
                            if (qm1Var.a()) {
                                i20++;
                                String buttonId3 = aiBotAction.getButtonId();
                                lh00Var2.a.put(buttonId3, qm1Var);
                                lh00Var2.b.remove(buttonId3);
                                view4.setVisibility(0);
                            } else {
                                view4.setVisibility(8);
                            }
                        }
                        viewGroup6 = viewGroup3;
                        i19 = i21;
                        A04 = list5;
                        bVar = bVar3;
                    }
                    bVar2 = bVar;
                    ai91.e(viewGroup6, i20 > 0 ? z : false);
                    i4 = i20;
                }
                ViewGroup viewGroup7 = rm1Var.g;
                if (isEmpty) {
                    viewGroup7.setVisibility(8);
                    i5 = 0;
                } else {
                    i5 = arrayList.size();
                    boolean z4 = i4 + i5 >= 4 ? z : false;
                    viewGroup7.removeAllViews();
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        nw10 nw10Var = (nw10) it5.next();
                        if (z4) {
                            nw10Var.b.setVisibility(8);
                        } else {
                            TextView textView = nw10Var.b;
                            textView.setVisibility(0);
                            textView.setText(nw10Var.c.getResources().getString(!((Boolean) nw10Var.a.invoke()).booleanValue() ? oyh0.translator_chat_translate_text : oyh0.translator_chat_show_original_text));
                        }
                        View view5 = nw10Var.c;
                        view5.setVisibility(0);
                        viewGroup7.addView(view5);
                    }
                    ai91.e(viewGroup7, i5 > 0 ? z : false);
                }
                if (i4 + i5 > 0) {
                    viewGroup5.setVisibility(0);
                    size2 = lj91.a(viewGroup5);
                    if (size2 != null) {
                        size2.getHeight();
                        if (num == null) {
                            int width2 = size2.getWidth();
                            num = Integer.valueOf(width2);
                            i3 = b(min, width2, bVar2.d());
                        }
                    }
                    if (num != null) {
                        int intValue = num.intValue();
                        kgx[] kgxVarArr = j;
                        kgx kgxVar3 = kgxVarArr[0];
                        rp3 rp3Var2 = this.h;
                        if (((l8x) rp3Var2.a.get()) == null) {
                            pzt0 N3 = tje.N(nka1.c(pj91.f(view)), null, null, new AiBotInteractionsUiDelegate$observeOverlaysToAdjustInteractions$1(this, min, intValue, null), 3);
                            kgx kgxVar4 = kgxVarArr[0];
                            rp3Var2.a(N3);
                        }
                    }
                    d(i3);
                    viewGroup = this.e;
                    if (viewGroup.isLayoutRequested()) {
                        viewGroup.post(new ce0(viewGroup, 26));
                    }
                    viewGroup2 = this.g;
                    if (viewGroup2.isLayoutRequested()) {
                        viewGroup2.post(new ce0(viewGroup2, 26));
                        return;
                    }
                    return;
                }
                rm1Var.a();
            }
            size2 = null;
            if (size2 != null) {
            }
            if (num != null) {
            }
            d(i3);
            viewGroup = this.e;
            if (viewGroup.isLayoutRequested()) {
            }
            viewGroup2 = this.g;
            if (viewGroup2.isLayoutRequested()) {
            }
        } else {
            view = view2;
            z = true;
            i2 = 8;
            c0Var.a();
        }
        size = null;
        bVar = this.b;
        if (size == null) {
        }
        rm1Var = this.d;
        ViewGroup viewGroup52 = rm1Var.a;
        lh00 lh00Var22 = rm1Var.h;
        ViewGroup viewGroup62 = rm1Var.f;
        List list92 = list;
        if (list92 != null) {
        }
        boolean isEmpty2 = arrayList.isEmpty();
        if (((nm1) rm1Var.d.get()).c) {
        }
        bVar2 = bVar;
        rm1Var.a();
        size2 = null;
        if (size2 != null) {
        }
        if (num != null) {
        }
        d(i3);
        viewGroup = this.e;
        if (viewGroup.isLayoutRequested()) {
        }
        viewGroup2 = this.g;
        if (viewGroup2.isLayoutRequested()) {
        }
    }

    public final int b(int i2, int i3, int i4) {
        View view = (View) this.a.getParent();
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (view.getMeasuredWidth() - i4 < i3) {
            return kjs0.b(13);
        }
        return 0;
    }

    public final void c() {
        d(0);
        this.d.a();
        this.f.a();
        kgx kgxVar = j[0];
        this.h.a(null);
    }

    public final void d(int i2) {
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null || layoutParams2.bottomMargin == i2) {
            return;
        }
        layoutParams2.bottomMargin = i2;
        view.setLayoutParams(layoutParams2);
    }
}
