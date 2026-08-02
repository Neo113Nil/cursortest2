package com.ybsdk.feature.savings.internal.views.diffrate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ext.view.b;
import defpackage.a561;
import defpackage.aij;
import defpackage.bij;
import defpackage.dzh0;
import defpackage.ef7;
import defpackage.ff7;
import defpackage.fij;
import defpackage.gf7;
import defpackage.gh91;
import defpackage.gij;
import defpackage.gse;
import defpackage.hf7;
import defpackage.hij;
import defpackage.idb1;
import defpackage.iij;
import defpackage.jf7;
import defpackage.jij;
import defpackage.kdb1;
import defpackage.kf7;
import defpackage.kij;
import defpackage.l1i0;
import defpackage.lf7;
import defpackage.lhj;
import defpackage.lum;
import defpackage.mq5;
import defpackage.ny61;
import defpackage.p7h;
import defpackage.pf7;
import defpackage.q;
import defpackage.qa3;
import defpackage.rf7;
import defpackage.scc;
import defpackage.sf7;
import defpackage.t8j;
import defpackage.tbb;
import defpackage.tcc;
import defpackage.tls;
import defpackage.vij;
import defpackage.w511;
import defpackage.wls;
import defpackage.wz;
import defpackage.ze7;
import defpackage.zhj;
import defpackage.zvg;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 M2\u00020\u0001:\u0002*NB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00062\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u0013J7\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0002¢\u0006\u0004\b(\u0010)J-\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b,\u0010-R6\u00100\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000e\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R0\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R0\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010ER\"\u0010H\u001a\u0010\u0012\f\u0012\n G*\u0004\u0018\u00010\"0\"0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lcom/ybsdk/feature/savings/internal/views/diffrate/DiffRateCalendarView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lbij;", "entity", "Lkotlin/Function1;", "", "Lzy11;", "onInitialViewportReady", "renderContent", "(Lbij;Ltls;)V", "renderLoading", "()V", "minVisibleDayShortServerIsoOrEmpty", "()Ljava/lang/String;", "lastItemIndex", "scrollToBottomOnCreation", "(ILtls;)V", "createWeekDaysHeader", "", "isVisible", "setWeekDayLabelsVisible", "(Z)V", "isLoading", "()Z", "setupRecyclerView", "", "Lkf7;", "items", "", "", "Lvij;", "styleByDate", "enrichWithStyles", "(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;", "Liij;", ClidProvider.STATE, "render", "(Liij;Ltls;)V", "Lkotlin/Function2;", "Landroid/view/View;", "dayClickListener", "Lwls;", "getDayClickListener", "()Lwls;", "setDayClickListener", "(Lwls;)V", "onRecyclerScrollStateChanged", "Ltls;", "getOnRecyclerScrollStateChanged", "()Ltls;", "setOnRecyclerScrollStateChanged", "(Ltls;)V", "onMinVisibleDateChanged", "getOnMinVisibleDateChanged", "setOnMinVisibleDateChanged", "La561;", "binding", "La561;", "Ljava/util/Locale;", "currentLocale", "Ljava/util/Locale;", "Liij;", "Lqa3;", "kotlin.jvm.PlatformType", "calendarAdapter", "Lqa3;", "Landroidx/recyclerview/widget/GridLayoutManager;", "calendarLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "Companion", "fij", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiffRateCalendarView extends LinearLayout {

    @Deprecated
    public static final float CALENDAR_RECYCLER_WEIGHT = 1.0f;
    private static final fij Companion = new fij();

    @Deprecated
    public static final int DAY_CELLS_COUNT = 1;

    @Deprecated
    public static final float DAY_VIEW_WEIGHT = 1.0f;

    @Deprecated
    public static final int FIRST_DAY_OF_MONTH = 1;

    @Deprecated
    public static final int LOADING_MONTHS_BACK_COUNT = 1;

    @Deprecated
    public static final int MONTH_CELLS_COUNT = 7;
    private final a561 binding;
    private final qa3 calendarAdapter;
    private final GridLayoutManager calendarLayoutManager;
    private final Locale currentLocale;
    private wls dayClickListener;
    private tls onMinVisibleDateChanged;
    private tls onRecyclerScrollStateChanged;
    private iij state;

    public DiffRateCalendarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.binding = a561.o(LayoutInflater.from(context), this);
        Locale locale = new Locale(context.getApplicationContext().getString(dzh0.ybsdk_ui_language));
        this.currentLocale = locale;
        this.state = hij.a;
        ef7 ef7Var = ef7.a;
        lhj lhjVar = new lhj(4);
        this.calendarAdapter = new qa3(ef7Var, new lum(new mq5(6), rf7.a, new q(26, new DiffRateCalendarView$calendarAdapter$2(0, this, DiffRateCalendarView.class, "isLoading", "isLoading()Z", 0), locale, lhjVar), sf7.a), new lum(new gse(24), zhj.a, new t8j(1, new DiffRateCalendarView$calendarAdapter$3(0, this, DiffRateCalendarView.class, "isLoading", "isLoading()Z", 0), new tbb(29, this)), aij.a));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 7);
        gridLayoutManager.h0 = new jij(this);
        this.calendarLayoutManager = gridLayoutManager;
        createWeekDaysHeader();
        setupRecyclerView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 calendarAdapter$lambda$0(pf7 pf7Var) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 calendarAdapter$lambda$1(DiffRateCalendarView diffRateCalendarView, hf7 hf7Var, View view) {
        wls wlsVar = diffRateCalendarView.dayClickListener;
        if (wlsVar != null) {
            wlsVar.invoke(Long.valueOf(gh91.a(hf7Var.a.a)), view);
        }
        return zy11.a;
    }

    private final void createWeekDaysHeader() {
        ArrayList g = kdb1.g(this.currentLocale);
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            TextView textView = new TextView(getContext(), null, 0, l1i0.Widget_YB_Text_Body2);
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            textView.setText(str);
            textView.setGravity(17);
            arrayList.add(textView);
        }
        LinearLayout linearLayout = this.binding.c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            linearLayout.addView((View) it2.next());
        }
    }

    private final List<kf7> enrichWithStyles(List<? extends kf7> items, Map<Long, vij> styleByDate) {
        List<? extends kf7> list = items;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (Object obj : list) {
            if (!(obj instanceof jf7) && !(obj instanceof gf7)) {
                if (!(obj instanceof hf7)) {
                    w511.b();
                    return null;
                }
                ze7 ze7Var = ((hf7) obj).a;
                vij vijVar = styleByDate.get(Long.valueOf(gh91.a(ze7Var.a)));
                if (vijVar != null) {
                    ColorModel colorModel = vijVar.a;
                    Integer valueOf = colorModel != null ? Integer.valueOf(colorModel.get(getContext())) : null;
                    ColorModel colorModel2 = vijVar.b;
                    obj = new hf7(ze7.a(ze7Var, null, valueOf, colorModel2 != null ? Integer.valueOf(colorModel2.get(getContext())) : null, 31));
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLoading() {
        return this.state instanceof hij;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String minVisibleDayShortServerIsoOrEmpty() {
        RecyclerView.e layoutManager = this.binding.b.getLayoutManager();
        Long l = null;
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return "";
        }
        int K1 = gridLayoutManager.K1();
        int M1 = gridLayoutManager.M1();
        if (K1 == -1 || M1 == -1) {
            return "";
        }
        if (K1 <= M1) {
            while (true) {
                kf7 kf7Var = (kf7) kotlin.collections.a.S(K1, this.calendarAdapter.b.f);
                if (kf7Var instanceof hf7) {
                    long a = gh91.a(((hf7) kf7Var).a.a);
                    l = l == null ? Long.valueOf(a) : Long.valueOf(Math.min(l.longValue(), a));
                }
                if (K1 == M1) {
                    break;
                }
                K1++;
            }
        }
        return l != null ? gh91.b(l.longValue()) : "";
    }

    public static /* synthetic */ void render$default(DiffRateCalendarView diffRateCalendarView, iij iijVar, tls tlsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            tlsVar = null;
        }
        diffRateCalendarView.render(iijVar, tlsVar);
    }

    private final void renderContent(bij entity, tls onInitialViewportReady) {
        setWeekDayLabelsVisible(true);
        Calendar calendar = entity.b;
        kdb1.e();
        List<kf7> enrichWithStyles = enrichWithStyles(idb1.d(idb1.c(calendar, null, null)), entity.a);
        this.calendarAdapter.h(enrichWithStyles, new p7h(4, this, enrichWithStyles, onInitialViewportReady));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderContent$lambda$3(DiffRateCalendarView diffRateCalendarView, List list, tls tlsVar) {
        diffRateCalendarView.scrollToBottomOnCreation(scc.f(list), tlsVar);
    }

    private final void renderLoading() {
        setWeekDayLabelsVisible(false);
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, -1);
        calendar.set(5, 1);
        kdb1.e();
        ArrayList d = idb1.d(idb1.c(calendar, null, null));
        this.calendarAdapter.h(d, new zvg(27, this, d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderLoading$lambda$5(DiffRateCalendarView diffRateCalendarView, List list) {
        diffRateCalendarView.scrollToBottomOnCreation(scc.f(list), null);
    }

    private final void scrollToBottomOnCreation(int lastItemIndex, tls onInitialViewportReady) {
        RecyclerView recyclerView = this.binding.b;
        recyclerView.post(new wz(recyclerView, lastItemIndex, onInitialViewportReady, this, 1));
    }

    private final void setWeekDayLabelsVisible(boolean isVisible) {
        LinearLayout linearLayout = this.binding.c;
        int i = 0;
        while (true) {
            if (!(i < linearLayout.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = linearLayout.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            } else {
                childAt.setVisibility(isVisible ? 0 : 4);
                i = i2;
            }
        }
    }

    private final void setupRecyclerView() {
        RecyclerView recyclerView = this.binding.b;
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        recyclerView.setLayoutManager(this.calendarLayoutManager);
        recyclerView.setAdapter(this.calendarAdapter);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new lf7(this.calendarAdapter));
        b.q(recyclerView, new ff7());
        recyclerView.addOnScrollListener(new kij(this));
    }

    public final wls getDayClickListener() {
        return this.dayClickListener;
    }

    public final tls getOnMinVisibleDateChanged() {
        return this.onMinVisibleDateChanged;
    }

    public final tls getOnRecyclerScrollStateChanged() {
        return this.onRecyclerScrollStateChanged;
    }

    public final void render(iij state, tls onInitialViewportReady) {
        this.state = state;
        if (state instanceof gij) {
            renderContent(((gij) state).a, onInitialViewportReady);
        } else if (state.equals(hij.a)) {
            renderLoading();
        } else {
            w511.b();
        }
    }

    public final void setDayClickListener(wls wlsVar) {
        this.dayClickListener = wlsVar;
    }

    public final void setOnMinVisibleDateChanged(tls tlsVar) {
        this.onMinVisibleDateChanged = tlsVar;
    }

    public final void setOnRecyclerScrollStateChanged(tls tlsVar) {
        this.onRecyclerScrollStateChanged = tlsVar;
    }

    public DiffRateCalendarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DiffRateCalendarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DiffRateCalendarView(Context context) {
        this(context, null, 0, 6, null);
    }
}
