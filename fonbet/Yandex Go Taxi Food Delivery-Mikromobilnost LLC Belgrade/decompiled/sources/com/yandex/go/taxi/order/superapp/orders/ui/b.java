package com.yandex.go.taxi.order.superapp.orders.ui;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.shortcuts.impl.repository.j;
import com.yandex.go.superapp.order.multi.old.router.a;
import com.yandex.go.taxi.order.communications.analytics.PromoPlaqueAnalytics$Screen;
import com.yandex.go.taxi.order.communications.g;
import com.yandex.go.taxi.order.domain.repositories.f;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.car.CopyInfoType;
import com.yandex.go.taxi.order.search.ui.driver.d;
import com.yandex.go.taxi.order.superapp.orders.ui.b;
import defpackage.a3y0;
import defpackage.a630;
import defpackage.an91;
import defpackage.bdc;
import defpackage.bi;
import defpackage.bkx0;
import defpackage.cim;
import defpackage.co70;
import defpackage.dzg0;
import defpackage.e401;
import defpackage.e58;
import defpackage.evu0;
import defpackage.f2z;
import defpackage.f58;
import defpackage.fc8;
import defpackage.gpf0;
import defpackage.h3y;
import defpackage.hc8;
import defpackage.hhs0;
import defpackage.hit;
import defpackage.ho9;
import defpackage.hos0;
import defpackage.htc;
import defpackage.hy70;
import defpackage.i3y;
import defpackage.ic8;
import defpackage.iqz;
import defpackage.iup0;
import defpackage.iy70;
import defpackage.j37;
import defpackage.j38;
import defpackage.jl40;
import defpackage.jqz;
import defpackage.jtc;
import defpackage.jy70;
import defpackage.k48;
import defpackage.k7x0;
import defpackage.kdc;
import defpackage.kfb1;
import defpackage.kyh0;
import defpackage.m7x0;
import defpackage.n4h0;
import defpackage.n6y0;
import defpackage.ney;
import defpackage.o2y0;
import defpackage.p7y0;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.pzt0;
import defpackage.q48;
import defpackage.q6y0;
import defpackage.qa0;
import defpackage.qje;
import defpackage.rct0;
import defpackage.rp31;
import defpackage.s5w0;
import defpackage.t26;
import defpackage.t7y0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tr00;
import defpackage.tse;
import defpackage.tt2;
import defpackage.usg0;
import defpackage.vb3;
import defpackage.vng;
import defpackage.w511;
import defpackage.wug0;
import defpackage.wys;
import defpackage.x5s0;
import defpackage.xc8;
import defpackage.xng0;
import defpackage.xvy0;
import defpackage.xw;
import defpackage.xw31;
import defpackage.y7x0;
import defpackage.yfb;
import defpackage.yqb;
import defpackage.zf91;
import defpackage.zkh0;
import defpackage.zy11;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.taxi.carplates.ui.CarIndexContainerView;
import ru.yandex.taxi.checkin.CheckInStateActionType;
import ru.yandex.taxi.combo.ui.TravelCompanionStatusView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.RatingBarComponent;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.multiorder.multi.ServiceType;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.analytics.model.OrderButton;
import ru.yandex.taxi.order.view.TopCircleButtonsView;
import ru.yandex.taxi.superapp.orders.models.ActionType;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SearchProgressBar;
import ru.yandex.taxi.widget.TimerTextView;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class b extends wys implements co70 {
    public static final /* synthetic */ int p1 = 0;
    public final ViewGroup A0;
    public final TimerTextView B0;
    public final f58 C0;
    public final RecyclerView D0;
    public final g E0;
    public final TravelCompanionStatusView F0;
    public final d G0;
    public pzt0 H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public String L0;
    public o2y0 M0;
    public final int N0;
    public final Drawable O0;
    public final Drawable P0;
    public p7y0 Q0;
    public final tse R;
    public final t7y0 R0;
    public final pav S;
    public final vb3 S0;
    public final hy70 T;
    public final a3y0 T0;
    public final iy70 U;
    public final jy70 V;
    public final jy70 W;
    public final jy70 Z;
    public final ru.yandex.taxi.apprate.common.domain.a a0;
    public final k48 b0;
    public final c c0;
    public final k7x0 d0;
    public final j e0;
    public final iqz f0;
    public final Lifecycle g0;
    public final ney h0;
    public final gpf0 i0;
    public final com.yandex.go.navigation.screen.c j0;
    public final qa0 k0;
    public final h3y l0;
    public final f2z m0;
    public final i3y n0;
    public final RatingBarComponent o0;
    public final TopCircleButtonsView p0;
    public final View q0;
    public final View r0;
    public final SearchProgressBar s0;
    public final ViewGroup t0;
    public final ButtonComponent u0;
    public final SliderButtonView v0;
    public final ButtonComponent w0;
    public final ListItemComponent x0;
    public final ButtonComponent y0;
    public final DialogueComponent z0;

    public b(View view, tse tseVar, pav pavVar, hy70 hy70Var, iy70 iy70Var, jy70 jy70Var, jy70 jy70Var2, jy70 jy70Var3, ru.yandex.taxi.apprate.common.domain.a aVar, htc htcVar, k48 k48Var, c cVar, k7x0 k7x0Var, cim cimVar, rct0 rct0Var, j jVar, iqz iqzVar, final f0 f0Var, Lifecycle lifecycle, ney neyVar, gpf0 gpf0Var, com.yandex.go.navigation.screen.c cVar2, qa0 qa0Var, h3y h3yVar, f2z f2zVar) {
        super(view);
        this.R = tseVar;
        this.S = pavVar;
        this.T = hy70Var;
        this.U = iy70Var;
        this.V = jy70Var;
        this.W = jy70Var2;
        this.Z = jy70Var3;
        this.a0 = aVar;
        this.b0 = k48Var;
        this.c0 = cVar;
        this.d0 = k7x0Var;
        this.e0 = jVar;
        this.f0 = iqzVar;
        this.g0 = lifecycle;
        this.h0 = neyVar;
        this.i0 = gpf0Var;
        this.j0 = cVar2;
        this.k0 = qa0Var;
        this.l0 = h3yVar;
        this.m0 = f2zVar;
        this.n0 = kotlin.a.a(new j38(view, 4));
        this.L0 = "";
        this.N0 = ru.yandex.taxi.design.utils.c.g(0.5f, view);
        this.O0 = vng.t(n4h0.bg_order_item_round_rect_ripple, view.getContext());
        this.P0 = vng.t(n4h0.bg_order_item_round_top_rect_ripple, view.getContext());
        this.R0 = new t7y0(this);
        this.S0 = new vb3(16, this);
        this.T0 = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "TaxiOrderViewHolder");
        if (d0().getContext().getResources().getConfiguration().fontScale > 1.0f || d0().getContext().getResources().getDisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEVICE_STABLE > 1.0f) {
            d0().setTitleMaxLines(Integer.MAX_VALUE);
        }
        int i = p8h0.order_list_item_root;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ConstraintLayout constraintLayout = (ConstraintLayout) ((View) rp31.d(view, i));
        LinearLayout linearLayout = (LinearLayout) ((View) rp31.d(constraintLayout, p8h0.header_and_buttons_container));
        final int i2 = 1;
        constraintLayout.setClipToOutline(true);
        DialogueComponent dialogueComponent = (DialogueComponent) view;
        this.z0 = dialogueComponent;
        dialogueComponent.setAnimateChanges(true);
        dialogueComponent.setAnimationType(DialogueComponent.AnimationType.CONTENT_SLIDE_BOTTOM);
        dialogueComponent.setCornerRadius(tje.r(usg0.order_dialogue_component_corner_radius, view.getContext()));
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(view, p8h0.dialogue_header));
        this.x0 = listItemComponent;
        this.s0 = (SearchProgressBar) ((View) rp31.d(view, p8h0.order_list_item_search_progress));
        TopCircleButtonsView topCircleButtonsView = (TopCircleButtonsView) ((View) rp31.d(view, p8h0.order_list_item_buttons_panel));
        this.p0 = topCircleButtonsView;
        g a = ((jtc) htcVar).a(new s5w0(23, this));
        this.E0 = a;
        topCircleButtonsView.init(tseVar, pavVar);
        this.q0 = (View) rp31.d(view, p8h0.order_list_item_divider);
        this.o0 = (RatingBarComponent) ((View) rp31.d(view, p8h0.order_list_item_rating_bar));
        this.t0 = (ViewGroup) ((View) rp31.d(view, p8h0.check_in_container));
        this.w0 = (ButtonComponent) ((View) rp31.d(view, p8h0.check_in_instruction));
        this.y0 = (ButtonComponent) ((View) rp31.d(view, p8h0.check_in_details));
        this.u0 = (ButtonComponent) ((View) rp31.d(view, p8h0.check_in_button));
        this.v0 = (SliderButtonView) ((View) rp31.d(view, p8h0.check_in_slider_button));
        final int i3 = 0;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(dialogueComponent.getContext()).inflate(zkh0.order_item_timer, (ViewGroup) d0(), false);
        this.A0 = viewGroup;
        this.B0 = (TimerTextView) viewGroup.findViewById(p8h0.order_item_timer);
        this.C0 = new f58(d0());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(p8h0.communications_recycler_view);
        this.D0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(dialogueComponent.getContext(), 1, false));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(a);
        ViewStub viewStub = (ViewStub) ((View) rp31.d(view, p8h0.travel_companion_status_view_stub));
        TravelCompanionStatusView travelCompanionStatusView = (TravelCompanionStatusView) rct0Var.get();
        this.F0 = travelCompanionStatusView;
        ru.yandex.taxi.design.utils.c.w(viewStub, travelCompanionStatusView);
        this.r0 = (View) rp31.d(view, p8h0.order_companion_divider);
        ho9 ho9Var = cimVar.a;
        this.G0 = new d(constraintLayout, (hit) ho9Var.a.get(), (tt2) ho9Var.b.get(), (iup0) ho9Var.c.get(), (f) ho9Var.d.get());
        d0().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: q7y0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                int i12 = i3;
                b bVar = this;
                f0 f0Var2 = f0Var;
                switch (i12) {
                    case 0:
                        f0Var2.b(view2.getHeight() - bVar.N0, bVar.M0);
                        break;
                    case 1:
                        int height = view2.getHeight();
                        if (jl40.l(f0Var2.q.getValue(), bVar.M0)) {
                            f0Var2.o = height;
                            x4e.z(height + f0Var2.n, f0Var2.c, null);
                            break;
                        }
                        break;
                    case 2:
                        if (view2.getHeight() != i11 - i9) {
                            int height2 = view2.getHeight() - bVar.N0;
                            if (jl40.l(f0Var2.q.getValue(), bVar.M0)) {
                                x4e.z(height2, f0Var2.e, null);
                                break;
                            }
                        }
                        break;
                    default:
                        if (view2.getHeight() != i11 - i9) {
                            int height3 = view2.getHeight();
                            if (jl40.l(f0Var2.q.getValue(), bVar.M0)) {
                                x4e.z(height3, f0Var2.g, null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        listItemComponent.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: q7y0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                int i12 = i2;
                b bVar = this;
                f0 f0Var2 = f0Var;
                switch (i12) {
                    case 0:
                        f0Var2.b(view2.getHeight() - bVar.N0, bVar.M0);
                        break;
                    case 1:
                        int height = view2.getHeight();
                        if (jl40.l(f0Var2.q.getValue(), bVar.M0)) {
                            f0Var2.o = height;
                            x4e.z(height + f0Var2.n, f0Var2.c, null);
                            break;
                        }
                        break;
                    case 2:
                        if (view2.getHeight() != i11 - i9) {
                            int height2 = view2.getHeight() - bVar.N0;
                            if (jl40.l(f0Var2.q.getValue(), bVar.M0)) {
                                x4e.z(height2, f0Var2.e, null);
                                break;
                            }
                        }
                        break;
                    default:
                        if (view2.getHeight() != i11 - i9) {
                            int height3 = view2.getHeight();
                            if (jl40.l(f0Var2.q.getValue(), bVar.M0)) {
                                x4e.z(height3, f0Var2.g, null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final int i4 = 2;
        constraintLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: q7y0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i42, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                int i12 = i4;
                b bVar = this;
                f0 f0Var2 = f0Var;
                switch (i12) {
                    case 0:
                        f0Var2.b(view2.getHeight() - bVar.N0, bVar.M0);
                        break;
                    case 1:
                        int height = view2.getHeight();
                        if (jl40.l(f0Var2.q.getValue(), bVar.M0)) {
                            f0Var2.o = height;
                            x4e.z(height + f0Var2.n, f0Var2.c, null);
                            break;
                        }
                        break;
                    case 2:
                        if (view2.getHeight() != i11 - i9) {
                            int height2 = view2.getHeight() - bVar.N0;
                            if (jl40.l(f0Var2.q.getValue(), bVar.M0)) {
                                x4e.z(height2, f0Var2.e, null);
                                break;
                            }
                        }
                        break;
                    default:
                        if (view2.getHeight() != i11 - i9) {
                            int height3 = view2.getHeight();
                            if (jl40.l(f0Var2.q.getValue(), bVar.M0)) {
                                x4e.z(height3, f0Var2.g, null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final int i5 = 3;
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: q7y0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i42, int i52, int i6, int i7, int i8, int i9, int i10, int i11) {
                int i12 = i5;
                b bVar = this;
                f0 f0Var2 = f0Var;
                switch (i12) {
                    case 0:
                        f0Var2.b(view2.getHeight() - bVar.N0, bVar.M0);
                        break;
                    case 1:
                        int height = view2.getHeight();
                        if (jl40.l(f0Var2.q.getValue(), bVar.M0)) {
                            f0Var2.o = height;
                            x4e.z(height + f0Var2.n, f0Var2.c, null);
                            break;
                        }
                        break;
                    case 2:
                        if (view2.getHeight() != i11 - i9) {
                            int height2 = view2.getHeight() - bVar.N0;
                            if (jl40.l(f0Var2.q.getValue(), bVar.M0)) {
                                x4e.z(height2, f0Var2.e, null);
                                break;
                            }
                        }
                        break;
                    default:
                        if (view2.getHeight() != i11 - i9) {
                            int height3 = view2.getHeight();
                            if (jl40.l(f0Var2.q.getValue(), bVar.M0)) {
                                x4e.z(height3, f0Var2.g, null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        this.h0.d(this);
        this.p0.resetSubscriptions();
        SearchProgressBar searchProgressBar = this.s0;
        searchProgressBar.stopWithoutAnimation();
        searchProgressBar.setVisibility(8);
        this.I0 = false;
        this.J0 = false;
        pzt0 pzt0Var = this.H0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G0.b();
        this.e0.a.remove(this.L0);
        ((jqz) this.f0).a();
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        x5s0 x5s0Var = new x5s0(15, this);
        View view = this.a;
        xvy0.b(view, themeType, true, x5s0Var);
        this.q0.setBackgroundTintList(ColorStateList.valueOf(ru.yandex.taxi.design.utils.c.c(xng0.line, view)));
        this.r0.setBackgroundTintList(ColorStateList.valueOf(qje.t(xng0.line, view.getContext())));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x043d  */
    @Override // defpackage.wys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj) {
        boolean z;
        List<xw> list;
        DividerType dividerType;
        n6y0 n6y0Var;
        boolean z2;
        final e58 e58Var;
        q6y0 q6y0Var;
        Paint.FontMetricsInt fontMetricsInt;
        final b bVar = this;
        final tr00 tr00Var = (tr00) obj;
        ListItemComponent d0 = bVar.d0();
        q6y0 q6y0Var2 = tr00Var.a;
        bVar.h0.b(bVar, bVar.S0);
        bVar.p0.setActionClickListener(new hhs0(27, bVar, q6y0Var2));
        int i = 2;
        final int i2 = 1;
        final int i3 = 0;
        if (q6y0Var2.o || q6y0Var2.n) {
            Lifecycle lifecycle = bVar.g0;
            if (lifecycle.b() == Lifecycle.State.RESUMED || lifecycle.b() == Lifecycle.State.STARTED) {
                boolean z3 = q6y0Var2.o;
                long j = q6y0Var2.m;
                if (z3) {
                    d0.setTrailVerticalGravity(1);
                    androidx.core.view.b.p(d0.title(), new yqb(d0, bVar, 6));
                    d0.setTrailImportantForAccessibility(4);
                    d0.setTrailView(bVar.A0);
                    TimerTextView timerTextView = bVar.B0;
                    if (!timerTextView.isStarted()) {
                        timerTextView.setStartTime(Long.valueOf(j));
                    }
                } else {
                    bVar.B0.stopTimer();
                }
                if (q6y0Var2.n) {
                    SearchProgressBar searchProgressBar = bVar.s0;
                    searchProgressBar.setVisibility(0);
                    Long l = q6y0Var2.q;
                    long longValue = l != null ? l.longValue() : 0L;
                    if (!bVar.I0) {
                        bVar.I0 = true;
                        searchProgressBar.setDuration(longValue, j);
                    }
                    searchProgressBar.start(bVar.J0);
                    bVar.J0 = true;
                } else {
                    bVar.e0();
                }
                kdc kdcVar = q6y0Var2.r;
                d0.setTitle(q6y0Var2.f);
                TextView title = d0.title();
                String str = q6y0Var2.w;
                DriveState driveState = q6y0Var2.c.b().l.V;
                DriveState driveState2 = q6y0Var2.l;
                if (bVar.j0.b() != Screen.ORDER_DETAILS) {
                    if (driveState.ordinal() > driveState2.ordinal()) {
                        bVar.K0 = false;
                    }
                    CharSequence contentDescription = title.getContentDescription();
                    title.setContentDescription(str);
                    if (driveState2 == DriveState.WAITING) {
                        if (!bVar.K0 && driveState != driveState2) {
                            if (!jl40.l(contentDescription, str)) {
                                title.post(new y7x0(15, title, str));
                            }
                            bVar.K0 = true;
                        }
                    } else if (!jl40.l(contentDescription, str)) {
                        title.post(new y7x0(15, title, str));
                    }
                }
                d0.setTitleTextColor(kdcVar);
                if (q6y0Var2.p) {
                    d0.setTitleWithNavigationIcon(false);
                } else {
                    Drawable c0 = tje.c0(dzg0.chevron_next, d0.getContext());
                    d0.setTitleEndDrawable(c0);
                    if (c0 != null && kdcVar != null) {
                        c0.setTint(ru.yandex.taxi.design.utils.c.b(bVar.a, kdcVar));
                    }
                }
                if (q6y0Var2.g) {
                    d0.stopTitleProgressAnimation();
                } else {
                    d0.startTitleProgressAnimation(Integer.valueOf(qje.t(xng0.bgMain, bVar.a.getContext())), 800);
                }
                ButtonComponent buttonComponent = bVar.w0;
                ButtonComponent buttonComponent2 = bVar.y0;
                yfb yfbVar = q6y0Var2.s;
                z = yfbVar.b;
                ViewGroup viewGroup = bVar.t0;
                int i4 = 3;
                if (z) {
                    viewGroup.setVisibility(8);
                    buttonComponent.setDebounceClickListener(null);
                    buttonComponent2.setDebounceClickListener(null);
                    bVar.u0.setDebounceClickListener(null);
                } else {
                    viewGroup.setVisibility(0);
                    kfb1 kfb1Var = yfbVar.c;
                    if (kfb1Var instanceof fc8) {
                        bVar.c0(q6y0Var2, yfbVar, ((fc8) kfb1Var).b);
                        buttonComponent.setVisibility(8);
                        buttonComponent.setDebounceClickListener(null);
                        buttonComponent2.setVisibility(8);
                        buttonComponent2.setDebounceClickListener(null);
                    } else if (kfb1Var instanceof ic8) {
                        ic8 ic8Var = (ic8) kfb1Var;
                        bVar.c0(q6y0Var2, yfbVar, ic8Var.c);
                        String str2 = ic8Var.b;
                        ButtonComponent buttonComponent3 = bVar.w0;
                        buttonComponent3.setVisibility(0);
                        buttonComponent3.setText(str2);
                        buttonComponent3.setDebounceClickListener(new p7y0(bVar, q6y0Var2, i4));
                        buttonComponent2.setVisibility(8);
                        buttonComponent2.setDebounceClickListener(null);
                    } else {
                        if (!(kfb1Var instanceof hc8)) {
                            w511.b();
                            return;
                        }
                        hc8 hc8Var = (hc8) kfb1Var;
                        bVar.c0(q6y0Var2, yfbVar, hc8Var.c);
                        String str3 = hc8Var.b;
                        ButtonComponent buttonComponent4 = bVar.w0;
                        buttonComponent4.setVisibility(0);
                        buttonComponent4.setText(str3);
                        buttonComponent4.setDebounceClickListener(new p7y0(bVar, q6y0Var2, i4));
                        buttonComponent2.setVisibility(0);
                        buttonComponent2.setText(hc8Var.d);
                        buttonComponent2.setDebounceClickListener(new p7y0(bVar, q6y0Var2, i));
                    }
                }
                d0.setSubtitle(q6y0Var2.h);
                list = q6y0Var2.i;
                if (list.size() <= 4) {
                    List<xw> list2 = list;
                    bVar.T0.f(new xc8(kotlin.collections.a.X(list2, ",", null, null, new bkx0(24), 30), 21), "getActionsSafe");
                    list = kotlin.collections.a.A0(list2, 4);
                }
                bVar.p0.updateActions(q6y0Var2.a(), list);
                bVar.p0.setVisibility(list.isEmpty() ? 0 : 8);
                dividerType = !list.isEmpty() ? DividerType.NONE : DividerType.NORMAL;
                d0.setDividers(DividerPosition.BOTTOM, dividerType);
                boolean z4 = q6y0Var2.j.a;
                bVar.q0.setVisibility(!z4 ? 0 : 8);
                RatingBarComponent ratingBarComponent = bVar.o0;
                ratingBarComponent.setVisibility(!z4 ? 0 : 8);
                t7y0 t7y0Var = bVar.R0;
                t7y0Var.a = q6y0Var2;
                ratingBarComponent.addOnRatingBarChangeListener(t7y0Var);
                ratingBarComponent.setRating(q6y0Var2.j.b);
                DialogueComponent dialogueComponent = bVar.z0;
                ListItemComponent listItemComponent = bVar.x0;
                n6y0Var = q6y0Var2.v;
                if (n6y0Var != null) {
                    listItemComponent.clearTrailView();
                    listItemComponent.setDebounceClickListener(null);
                    listItemComponent.setImportantForAccessibility(0);
                    dialogueComponent.setImportantForAccessibility(0);
                    e401 e401Var = q6y0Var2.u;
                    if (e401Var == null) {
                        dialogueComponent.hide();
                    } else {
                        dialogueComponent.updateHeaderColor(e401Var.c);
                        String str4 = e401Var.b.a;
                        if (str4 == null || str4.length() == 0) {
                            listItemComponent.clearLeadView();
                            listItemComponent.setTitleAlignment(1);
                        } else {
                            String a = ((m7x0) bVar.d0).a(str4);
                            pzt0 pzt0Var = bVar.H0;
                            if (pzt0Var != null) {
                                pzt0Var.a(null);
                            }
                            bVar.H0 = tje.N(bVar.R, null, null, new TaxiOrderViewHolder$setHeaderDialogueIcon$1(bVar, a, null), 3);
                            listItemComponent.setTitleAlignment(0);
                        }
                        TaxiOrderViewHolder$convertText$1 taxiOrderViewHolder$convertText$1 = new TaxiOrderViewHolder$convertText$1(new x5s0(14, listItemComponent), bVar.c0, e401Var.a, this, null);
                        bVar = this;
                        bVar.Z(taxiOrderViewHolder$convertText$1, "DIALOG_HEADER_TEXT", true);
                        dialogueComponent.show();
                    }
                } else {
                    ButtonComponent buttonComponent5 = (ButtonComponent) listItemComponent.getTrailViewAs(ButtonComponent.class);
                    if (buttonComponent5 == null) {
                        View view = bVar.a;
                        ButtonComponent buttonComponent6 = new ButtonComponent(view.getContext(), null, 0, 6, null);
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams.setMarginEnd(tje.r(wug0.horizontal_button_end_padding, view.getContext()));
                        buttonComponent6.setLayoutParams(marginLayoutParams);
                        buttonComponent6.setRippleColor(qje.t(xng0.controlPressed, view.getContext()));
                        buttonComponent6.setButtonBackground(qje.t(xng0.everFront, view.getContext()));
                        buttonComponent6.setButtonSize(0);
                        buttonComponent6.setTextSize(0, tje.r(usg0.trail_button_text_size, view.getContext()));
                        listItemComponent.clearLeadView();
                        listItemComponent.setTrailView(buttonComponent6);
                        listItemComponent.setTitleAlignment(0);
                        listItemComponent.setDebounceClickListener(new hos0(6));
                        listItemComponent.setUseAutoAccessibilityDelegate(true);
                        listItemComponent.setTitleTextColor(new bdc(xng0.everFront));
                        listItemComponent.setImportantForAccessibility(2);
                        dialogueComponent.setImportantForAccessibility(2);
                        buttonComponent5 = buttonComponent6;
                    }
                    buttonComponent5.setText(n6y0Var.b);
                    buttonComponent5.setDebounceClickListener(new y7x0(16, bVar, n6y0Var));
                    listItemComponent.setTitle(n6y0Var.a);
                    dialogueComponent.updateHeaderColor(n6y0Var.c);
                    dialogueComponent.show();
                    o2y0 o2y0Var = bVar.M0;
                    if (o2y0Var != null) {
                        ((a630) bVar.l0.get()).a(o2y0Var.b().a, "OrderCard.NotEnoughFunds.Shown");
                    }
                }
                View view2 = bVar.r0;
                z2 = q6y0Var2.x.a.length() <= 0;
                TravelCompanionStatusView travelCompanionStatusView = bVar.F0;
                if (z2) {
                    travelCompanionStatusView.setVisibility(8);
                    view2.setVisibility(8);
                } else {
                    travelCompanionStatusView.setVisibility(0);
                    view2.setVisibility(0);
                    travelCompanionStatusView.bind(q6y0Var2.x);
                }
                e58Var = q6y0Var2.e;
                if (e58Var == null) {
                    Integer num = e58Var.a;
                    f58 f58Var = bVar.C0;
                    if (num != null) {
                        Object tag = ((CarIndexContainerView) f58Var.b).getTag(p8h0.car_cache_tag);
                        Integer num2 = tag instanceof Integer ? (Integer) tag : null;
                        int intValue = num.intValue();
                        if (num2 == null || num2.intValue() != intValue) {
                            TaxiOrderViewHolder$bindCarIcon$1 taxiOrderViewHolder$bindCarIcon$1 = new TaxiOrderViewHolder$bindCarIcon$1(bVar, num2, num, q6y0Var2, null);
                            q6y0Var = q6y0Var2;
                            bVar.Z(taxiOrderViewHolder$bindCarIcon$1, "SET_CAR_ICON", true);
                        }
                    } else {
                        q6y0Var = q6y0Var2;
                        q48 q48Var = q6y0Var.k;
                        ((CarIndexContainerView) f58Var.b).bind(q48Var != null ? q48Var.c() : null, new tls() { // from class: com.yandex.go.taxi.order.superapp.orders.ui.a
                            @Override // defpackage.tls
                            public final Object invoke(Object obj2) {
                                b bVar2 = b.this;
                                bVar2.Z(new TaxiOrderViewHolder$bindCarIcon$2$1(bVar2, e58Var, (ImageView) obj2, null), "SET_CAR_ICON", true);
                                return zy11.a;
                            }
                        });
                    }
                    bVar.E0.l(q6y0Var.t, q6y0Var.c, PromoPlaqueAnalytics$Screen.MULTI_ORDER);
                    bVar.G0.a(bVar.p0.getButtonForActionType(ActionType.DRIVER), q6y0Var);
                    ((jqz) bVar.f0).a.c();
                    bVar.Q0 = new p7y0(q6y0Var, bVar);
                    String id = q6y0Var.getId();
                    bVar.L0 = id;
                    bVar.M0 = q6y0Var.c;
                    bVar.e0.a.put(id, bVar.a);
                    if (dividerType == DividerType.NONE || bVar.r0.getVisibility() == 0 || bVar.q0.getVisibility() == 0) {
                        d0.setForeground(bVar.P0);
                    } else {
                        d0.setForeground(bVar.O0);
                    }
                    int i5 = q6y0Var.y ? 0 : 4;
                    bVar.s0.setImportantForAccessibility(i5);
                    bVar.p0.setImportantForAccessibility(i5);
                    bVar.o0.setImportantForAccessibility(i5);
                    bVar.t0.setImportantForAccessibility(i5);
                    bVar.w0.setImportantForAccessibility(i5);
                    bVar.y0.setImportantForAccessibility(i5);
                    bVar.u0.setImportantForAccessibility(i5);
                    bVar.v0.setImportantForAccessibility(i5);
                    bVar.D0.setImportantForAccessibility(i5);
                    zf91.c(bVar.x0);
                    fontMetricsInt = d0.title().getPaint().getFontMetricsInt();
                    if (fontMetricsInt != null) {
                        xw31.M(d0.getTitleComponentTop() + (((d0.title().getPaddingBottom() + fontMetricsInt.bottom) + (d0.title().getPaddingTop() - fontMetricsInt.top)) - bVar.B0.getHeight()), bVar.A0);
                    }
                    bVar.d0().setDebounceClickListener(new Runnable(bVar) { // from class: r7y0
                        public final /* synthetic */ b b;

                        {
                            this.b = bVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i6 = i3;
                            tr00 tr00Var2 = tr00Var;
                            b bVar2 = this.b;
                            switch (i6) {
                                case 0:
                                    bVar2.T.a(tr00Var2.a);
                                    break;
                                default:
                                    jy70 jy70Var = bVar2.W;
                                    q6y0 q6y0Var3 = tr00Var2.a;
                                    CopyInfoType copyInfoType = CopyInfoType.CAR_NUMBER;
                                    a aVar = jy70Var.a.l;
                                    ServiceType serviceType = ServiceType.TAXI;
                                    aVar.h.a(q6y0Var3, OrderButton.CAR_NUMBER.getAnalyticName(), jy70Var.b, jy70Var.c);
                                    p7y0 p7y0Var = bVar2.Q0;
                                    if (p7y0Var != null) {
                                        p7y0Var.run();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    bVar.d0().setTrailContainerClickListener(new Runnable(bVar) { // from class: r7y0
                        public final /* synthetic */ b b;

                        {
                            this.b = bVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i6 = i2;
                            tr00 tr00Var2 = tr00Var;
                            b bVar2 = this.b;
                            switch (i6) {
                                case 0:
                                    bVar2.T.a(tr00Var2.a);
                                    break;
                                default:
                                    jy70 jy70Var = bVar2.W;
                                    q6y0 q6y0Var3 = tr00Var2.a;
                                    CopyInfoType copyInfoType = CopyInfoType.CAR_NUMBER;
                                    a aVar = jy70Var.a.l;
                                    ServiceType serviceType = ServiceType.TAXI;
                                    aVar.h.a(q6y0Var3, OrderButton.CAR_NUMBER.getAnalyticName(), jy70Var.b, jy70Var.c);
                                    p7y0 p7y0Var = bVar2.Q0;
                                    if (p7y0Var != null) {
                                        p7y0Var.run();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
                bVar.Z(new TaxiOrderViewHolder$bindCarIcon$carIconStrategy$1(bVar, null), "SET_CAR_ICON", true);
                q6y0Var = q6y0Var2;
                bVar.E0.l(q6y0Var.t, q6y0Var.c, PromoPlaqueAnalytics$Screen.MULTI_ORDER);
                bVar.G0.a(bVar.p0.getButtonForActionType(ActionType.DRIVER), q6y0Var);
                ((jqz) bVar.f0).a.c();
                bVar.Q0 = new p7y0(q6y0Var, bVar);
                String id2 = q6y0Var.getId();
                bVar.L0 = id2;
                bVar.M0 = q6y0Var.c;
                bVar.e0.a.put(id2, bVar.a);
                if (dividerType == DividerType.NONE) {
                }
                d0.setForeground(bVar.P0);
                if (q6y0Var.y) {
                }
                bVar.s0.setImportantForAccessibility(i5);
                bVar.p0.setImportantForAccessibility(i5);
                bVar.o0.setImportantForAccessibility(i5);
                bVar.t0.setImportantForAccessibility(i5);
                bVar.w0.setImportantForAccessibility(i5);
                bVar.y0.setImportantForAccessibility(i5);
                bVar.u0.setImportantForAccessibility(i5);
                bVar.v0.setImportantForAccessibility(i5);
                bVar.D0.setImportantForAccessibility(i5);
                zf91.c(bVar.x0);
                fontMetricsInt = d0.title().getPaint().getFontMetricsInt();
                if (fontMetricsInt != null) {
                }
                bVar.d0().setDebounceClickListener(new Runnable(bVar) { // from class: r7y0
                    public final /* synthetic */ b b;

                    {
                        this.b = bVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = i3;
                        tr00 tr00Var2 = tr00Var;
                        b bVar2 = this.b;
                        switch (i6) {
                            case 0:
                                bVar2.T.a(tr00Var2.a);
                                break;
                            default:
                                jy70 jy70Var = bVar2.W;
                                q6y0 q6y0Var3 = tr00Var2.a;
                                CopyInfoType copyInfoType = CopyInfoType.CAR_NUMBER;
                                a aVar = jy70Var.a.l;
                                ServiceType serviceType = ServiceType.TAXI;
                                aVar.h.a(q6y0Var3, OrderButton.CAR_NUMBER.getAnalyticName(), jy70Var.b, jy70Var.c);
                                p7y0 p7y0Var = bVar2.Q0;
                                if (p7y0Var != null) {
                                    p7y0Var.run();
                                    break;
                                }
                                break;
                        }
                    }
                });
                bVar.d0().setTrailContainerClickListener(new Runnable(bVar) { // from class: r7y0
                    public final /* synthetic */ b b;

                    {
                        this.b = bVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = i2;
                        tr00 tr00Var2 = tr00Var;
                        b bVar2 = this.b;
                        switch (i6) {
                            case 0:
                                bVar2.T.a(tr00Var2.a);
                                break;
                            default:
                                jy70 jy70Var = bVar2.W;
                                q6y0 q6y0Var3 = tr00Var2.a;
                                CopyInfoType copyInfoType = CopyInfoType.CAR_NUMBER;
                                a aVar = jy70Var.a.l;
                                ServiceType serviceType = ServiceType.TAXI;
                                aVar.h.a(q6y0Var3, OrderButton.CAR_NUMBER.getAnalyticName(), jy70Var.b, jy70Var.c);
                                p7y0 p7y0Var = bVar2.Q0;
                                if (p7y0Var != null) {
                                    p7y0Var.run();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
        bVar.B0.stopTimer();
        if (an91.h(q6y0Var2.l) && q6y0Var2.k == null) {
            bVar.e0();
            d0.setTrailContainerClickListener(null);
            d0.setTrailView(null);
            androidx.core.view.b.p(d0.title(), null);
            d0.setTrailImportantForAccessibility(4);
        } else {
            d0.setTrailVerticalGravity(0);
            bVar.e0();
            String carNumberText = ((CarIndexContainerView) bVar.C0.b).getCarNumberText();
            ((CarIndexContainerView) bVar.C0.b).setContentDescription(ru.yandex.taxi.design.utils.c.H(bVar.a, kyh0.car_plate_content_description, carNumberText));
            d0.setTrailView((CarIndexContainerView) bVar.C0.b);
            androidx.core.view.b.p(d0.title(), null);
            d0.setTrailImportantForAccessibility(2);
            androidx.core.view.b.p((CarIndexContainerView) bVar.C0.b, !evu0.J(carNumberText) ? new bi(ru.yandex.taxi.design.utils.c.G(kyh0.open_copy_menu, bVar.a), 0) : null);
        }
        kdc kdcVar2 = q6y0Var2.r;
        d0.setTitle(q6y0Var2.f);
        TextView title2 = d0.title();
        String str5 = q6y0Var2.w;
        DriveState driveState3 = q6y0Var2.c.b().l.V;
        DriveState driveState22 = q6y0Var2.l;
        if (bVar.j0.b() != Screen.ORDER_DETAILS) {
        }
        d0.setTitleTextColor(kdcVar2);
        if (q6y0Var2.p) {
        }
        if (q6y0Var2.g) {
        }
        ButtonComponent buttonComponent7 = bVar.w0;
        ButtonComponent buttonComponent22 = bVar.y0;
        yfb yfbVar2 = q6y0Var2.s;
        z = yfbVar2.b;
        ViewGroup viewGroup2 = bVar.t0;
        int i42 = 3;
        if (z) {
        }
        d0.setSubtitle(q6y0Var2.h);
        list = q6y0Var2.i;
        if (list.size() <= 4) {
        }
        bVar.p0.updateActions(q6y0Var2.a(), list);
        bVar.p0.setVisibility(list.isEmpty() ? 0 : 8);
        dividerType = !list.isEmpty() ? DividerType.NONE : DividerType.NORMAL;
        d0.setDividers(DividerPosition.BOTTOM, dividerType);
        boolean z42 = q6y0Var2.j.a;
        bVar.q0.setVisibility(!z42 ? 0 : 8);
        RatingBarComponent ratingBarComponent2 = bVar.o0;
        ratingBarComponent2.setVisibility(!z42 ? 0 : 8);
        t7y0 t7y0Var2 = bVar.R0;
        t7y0Var2.a = q6y0Var2;
        ratingBarComponent2.addOnRatingBarChangeListener(t7y0Var2);
        ratingBarComponent2.setRating(q6y0Var2.j.b);
        DialogueComponent dialogueComponent2 = bVar.z0;
        ListItemComponent listItemComponent2 = bVar.x0;
        n6y0Var = q6y0Var2.v;
        if (n6y0Var != null) {
        }
        View view22 = bVar.r0;
        if (q6y0Var2.x.a.length() <= 0) {
        }
        TravelCompanionStatusView travelCompanionStatusView2 = bVar.F0;
        if (z2) {
        }
        e58Var = q6y0Var2.e;
        if (e58Var == null) {
        }
        q6y0Var = q6y0Var2;
        bVar.E0.l(q6y0Var.t, q6y0Var.c, PromoPlaqueAnalytics$Screen.MULTI_ORDER);
        bVar.G0.a(bVar.p0.getButtonForActionType(ActionType.DRIVER), q6y0Var);
        ((jqz) bVar.f0).a.c();
        bVar.Q0 = new p7y0(q6y0Var, bVar);
        String id22 = q6y0Var.getId();
        bVar.L0 = id22;
        bVar.M0 = q6y0Var.c;
        bVar.e0.a.put(id22, bVar.a);
        if (dividerType == DividerType.NONE) {
        }
        d0.setForeground(bVar.P0);
        if (q6y0Var.y) {
        }
        bVar.s0.setImportantForAccessibility(i5);
        bVar.p0.setImportantForAccessibility(i5);
        bVar.o0.setImportantForAccessibility(i5);
        bVar.t0.setImportantForAccessibility(i5);
        bVar.w0.setImportantForAccessibility(i5);
        bVar.y0.setImportantForAccessibility(i5);
        bVar.u0.setImportantForAccessibility(i5);
        bVar.v0.setImportantForAccessibility(i5);
        bVar.D0.setImportantForAccessibility(i5);
        zf91.c(bVar.x0);
        fontMetricsInt = d0.title().getPaint().getFontMetricsInt();
        if (fontMetricsInt != null) {
        }
        bVar.d0().setDebounceClickListener(new Runnable(bVar) { // from class: r7y0
            public final /* synthetic */ b b;

            {
                this.b = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = i3;
                tr00 tr00Var2 = tr00Var;
                b bVar2 = this.b;
                switch (i6) {
                    case 0:
                        bVar2.T.a(tr00Var2.a);
                        break;
                    default:
                        jy70 jy70Var = bVar2.W;
                        q6y0 q6y0Var3 = tr00Var2.a;
                        CopyInfoType copyInfoType = CopyInfoType.CAR_NUMBER;
                        a aVar = jy70Var.a.l;
                        ServiceType serviceType = ServiceType.TAXI;
                        aVar.h.a(q6y0Var3, OrderButton.CAR_NUMBER.getAnalyticName(), jy70Var.b, jy70Var.c);
                        p7y0 p7y0Var = bVar2.Q0;
                        if (p7y0Var != null) {
                            p7y0Var.run();
                            break;
                        }
                        break;
                }
            }
        });
        bVar.d0().setTrailContainerClickListener(new Runnable(bVar) { // from class: r7y0
            public final /* synthetic */ b b;

            {
                this.b = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = i2;
                tr00 tr00Var2 = tr00Var;
                b bVar2 = this.b;
                switch (i6) {
                    case 0:
                        bVar2.T.a(tr00Var2.a);
                        break;
                    default:
                        jy70 jy70Var = bVar2.W;
                        q6y0 q6y0Var3 = tr00Var2.a;
                        CopyInfoType copyInfoType = CopyInfoType.CAR_NUMBER;
                        a aVar = jy70Var.a.l;
                        ServiceType serviceType = ServiceType.TAXI;
                        aVar.h.a(q6y0Var3, OrderButton.CAR_NUMBER.getAnalyticName(), jy70Var.b, jy70Var.c);
                        p7y0 p7y0Var = bVar2.Q0;
                        if (p7y0Var != null) {
                            p7y0Var.run();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void c0(q6y0 q6y0Var, yfb yfbVar, String str) {
        CheckInStateActionType checkInStateActionType = yfbVar.d;
        CheckInStateActionType checkInStateActionType2 = CheckInStateActionType.BUTTON;
        int i = 0;
        SliderButtonView sliderButtonView = this.v0;
        ButtonComponent buttonComponent = this.u0;
        if (checkInStateActionType != checkInStateActionType2) {
            if (checkInStateActionType == CheckInStateActionType.SLIDER) {
                sliderButtonView.setTitleIdle(str);
                sliderButtonView.setSubtitleIdle(yfbVar.g);
                sliderButtonView.setSlideFinishedListener(new t26(22, this, q6y0Var, yfbVar));
                sliderButtonView.setVisibility(0);
                buttonComponent.setVisibility(8);
                return;
            }
            return;
        }
        buttonComponent.setText(str);
        j37 j37Var = yfbVar.i;
        if (j37Var != null) {
            buttonComponent.setTextIconTint(true);
            buttonComponent.setButtonTitleColor(j37Var.b);
            buttonComponent.setButtonBackground(j37Var.a);
        }
        yfbVar.a.a(buttonComponent, new p7y0(this, q6y0Var, i));
        buttonComponent.setVisibility(0);
        sliderButtonView.setVisibility(8);
    }

    public final ListItemComponent d0() {
        return (ListItemComponent) this.n0.getValue();
    }

    public final void e0() {
        this.I0 = false;
        SearchProgressBar searchProgressBar = this.s0;
        if (searchProgressBar.getVisibility() == 0) {
            searchProgressBar.stopAndHide();
        } else {
            searchProgressBar.stopWithoutAnimation();
        }
    }
}
