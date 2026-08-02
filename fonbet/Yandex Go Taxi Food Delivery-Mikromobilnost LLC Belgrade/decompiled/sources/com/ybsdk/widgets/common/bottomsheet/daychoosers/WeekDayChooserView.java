package com.ybsdk.widgets.common.bottomsheet.daychoosers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.a10;
import defpackage.aq41;
import defpackage.cma1;
import defpackage.dzh0;
import defpackage.e331;
import defpackage.fch0;
import defpackage.ix3;
import defpackage.js41;
import defpackage.lum;
import defpackage.nry;
import defpackage.ny61;
import defpackage.nyg0;
import defpackage.poh0;
import defpackage.qa3;
import defpackage.scc;
import defpackage.sls;
import defpackage.sw41;
import defpackage.tls;
import defpackage.tn41;
import defpackage.tw41;
import defpackage.unr0;
import defpackage.uw41;
import defpackage.vng;
import defpackage.vr51;
import defpackage.vw41;
import defpackage.ww41;
import defpackage.xa61;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0011\u001bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u00020\u000b2\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010%\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u000b0\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001fR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020(0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00101\u001a\u0010\u0012\f\u0012\n 0*\u0004\u0018\u00010(0(0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/ybsdk/widgets/common/bottomsheet/daychoosers/WeekDayChooserView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "position", "Lzy11;", "onItemClick", "(I)V", "onSaveButtonClick", "()V", "Lkotlin/Function1;", "Lvw41;", "action", "setOnSaveButtonClickListener", "(Ltls;)V", "Lkotlin/Function0;", "setOnErrorSaveButtonClickListener", "(Lsls;)V", "Lcom/ybsdk/widgets/common/bottomsheet/daychoosers/WeekDayChooserView$State$WeekDay;", "onWeekDaySelect", "setupAnalyticActions", "Lww41;", ClidProvider.STATE, "render", "(Lww41;)V", CA20Status.STATUS_USER_I, "Lxa61;", "binding", "Lxa61;", "saveClickAction", "Ltls;", "onWeekDaySelectCallback", "errorSaveClickAction", "Lsls;", "Lnry;", "selectedDay", "Lnry;", "selectedDayPosition", "", "weekDaysList", "Ljava/util/List;", "Lqa3;", "kotlin.jvm.PlatformType", "adapter", "Lqa3;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WeekDayChooserView extends LinearLayout {
    private final qa3 adapter;
    private final xa61 binding;
    private final int defStyleAttr;
    private sls errorSaveClickAction;
    private tls onWeekDaySelectCallback;
    private tls saveClickAction;
    private nry selectedDay;
    private int selectedDayPosition;
    private final List<nry> weekDaysList;

    public WeekDayChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.defStyleAttr = i;
        int i2 = 0;
        View inflate = LayoutInflater.from(context).inflate(poh0.ybsdk_week_day_chooser, (ViewGroup) this, false);
        addView(inflate);
        int i3 = fch0.button;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i3, inflate);
        if (ybButtonView != null) {
            i3 = fch0.recycler;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i3, inflate);
            if (recyclerView != null) {
                i3 = fch0.title;
                if (((TextView) cma1.O(i3, inflate)) != null) {
                    this.binding = new xa61((LinearLayout) inflate, ybButtonView, recyclerView);
                    this.saveClickAction = new js41(6);
                    this.onWeekDaySelectCallback = new js41(7);
                    this.errorSaveClickAction = new tn41(15);
                    this.selectedDayPosition = -1;
                    ybButtonView.setOnClickListener(new aq41(3, this));
                    this.weekDaysList = scc.g(new nry(WeekDayChooserView$State$WeekDay.MON, unr0.h(Text.Companion, dzh0.ybsdk_auto_topup_bottom_sheet_choose_week_day_in_monday)), new nry(WeekDayChooserView$State$WeekDay.TUE, new Text.Resource(dzh0.ybsdk_auto_topup_bottom_sheet_choose_week_day_in_tuesday)), new nry(WeekDayChooserView$State$WeekDay.WED, new Text.Resource(dzh0.ybsdk_auto_topup_bottom_sheet_choose_week_day_in_wednesday)), new nry(WeekDayChooserView$State$WeekDay.THU, new Text.Resource(dzh0.ybsdk_auto_topup_bottom_sheet_choose_week_day_in_thursday)), new nry(WeekDayChooserView$State$WeekDay.FRI, new Text.Resource(dzh0.ybsdk_auto_topup_bottom_sheet_choose_week_day_in_friday)), new nry(WeekDayChooserView$State$WeekDay.SAT, new Text.Resource(dzh0.ybsdk_auto_topup_bottom_sheet_choose_week_day_in_saturday)), new nry(WeekDayChooserView$State$WeekDay.SUN, new Text.Resource(dzh0.ybsdk_auto_topup_bottom_sheet_choose_week_day_in_sunday)));
                    this.adapter = new qa3(new a10(19), new lum(new sw41(i2), tw41.a, new e331(17, new WeekDayChooserView$adapter$2(1, this, WeekDayChooserView.class, "onItemClick", "onItemClick(I)V", 0), new ix3(this, 1)), uw41.a));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemClick(int position) {
        nry nryVar = this.weekDaysList.get(position);
        this.selectedDay = nryVar;
        this.onWeekDaySelectCallback.invoke(nryVar != null ? nryVar.a : null);
        int i = this.selectedDayPosition;
        qa3 qa3Var = this.adapter;
        if (i == -1) {
            qa3Var.notifyDataSetChanged();
        } else {
            qa3Var.notifyItemChanged(i);
            this.adapter.notifyItemChanged(position);
        }
        this.selectedDayPosition = position;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSaveButtonClick() {
        nry nryVar = this.selectedDay;
        if (nryVar != null) {
            this.saveClickAction.invoke(new vw41(nryVar.a));
        } else {
            this.errorSaveClickAction.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onWeekDaySelectCallback$lambda$1(WeekDayChooserView$State$WeekDay weekDayChooserView$State$WeekDay) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 saveClickAction$lambda$0(vw41 vw41Var) {
        return zy11.a;
    }

    public final void render(ww41 state) {
        RecyclerView recyclerView = this.binding.b;
        Context context = getContext();
        int i = nyg0.ybsdk_line_divider;
        vr51 vr51Var = new vr51();
        vr51Var.a = vng.t(i, context);
        recyclerView.addItemDecoration(vr51Var);
        this.binding.b.setAdapter(this.adapter);
        int i2 = 0;
        for (Object obj : this.weekDaysList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            nry nryVar = (nry) obj;
            if (nryVar.a == state.a) {
                this.selectedDay = nryVar;
                this.selectedDayPosition = i2;
            }
            i2 = i3;
        }
        this.adapter.g(this.weekDaysList);
    }

    public final void setOnErrorSaveButtonClickListener(sls action) {
        this.errorSaveClickAction = action;
    }

    public final void setOnSaveButtonClickListener(tls action) {
        this.saveClickAction = action;
    }

    public final void setupAnalyticActions(tls onWeekDaySelect) {
        this.onWeekDaySelectCallback = onWeekDaySelect;
    }

    public WeekDayChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ WeekDayChooserView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public WeekDayChooserView(Context context) {
        this(context, null, 0, 6, null);
    }
}
