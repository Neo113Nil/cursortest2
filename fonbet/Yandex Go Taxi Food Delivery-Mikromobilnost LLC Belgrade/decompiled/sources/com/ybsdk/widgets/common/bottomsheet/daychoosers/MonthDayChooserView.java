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
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.a10;
import defpackage.c161;
import defpackage.cma1;
import defpackage.d6w;
import defpackage.dzh0;
import defpackage.f361;
import defpackage.fch0;
import defpackage.fx3;
import defpackage.g8e;
import defpackage.i0z;
import defpackage.jsg;
import defpackage.lum;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.ps20;
import defpackage.qa3;
import defpackage.scc;
import defpackage.sls;
import defpackage.t130;
import defpackage.tls;
import defpackage.u630;
import defpackage.v630;
import defpackage.w630;
import defpackage.x630;
import defpackage.y630;
import defpackage.z530;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0016 B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ!\u0010\u0018\u001a\u00020\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\u000b2\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0004\b\u001f\u0010\u0019J\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010$R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R$\u0010-\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\"\u00108\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u00010101068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/ybsdk/widgets/common/bottomsheet/daychoosers/MonthDayChooserView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "position", "Lzy11;", "onDayClick", "(I)V", "changeHintVisibility", "()V", "", "animate", "onLastClick", "(Z)V", "onSaveClick", "Lkotlin/Function1;", "Lx630;", "action", "setOnSaveButtonClickListener", "(Ltls;)V", "Lkotlin/Function0;", "setOnErrorSaveButtonClickListener", "(Lsls;)V", "", "onDaySelect", "setupAnalyticActions", "Ly630;", ClidProvider.STATE, "render", "(Ly630;)V", CA20Status.STATUS_USER_I, "Lc161;", "binding", "Lc161;", "isLastDayChoosen", "Z", "selectedDayPosition", "saveClickAction", "Ltls;", "onDaySelectCallback", "errorSaveClickAction", "Lsls;", "", "Ljsg;", "days", "Ljava/util/List;", "selectedDay", "Ljsg;", "Lqa3;", "kotlin.jvm.PlatformType", "adapter", "Lqa3;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MonthDayChooserView extends LinearLayout {
    private final qa3 adapter;
    private final c161 binding;
    private final List<jsg> days;
    private final int defStyleAttr;
    private sls errorSaveClickAction;
    private boolean isLastDayChoosen;
    private tls onDaySelectCallback;
    private tls saveClickAction;
    private jsg selectedDay;
    private int selectedDayPosition;

    public MonthDayChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        this.defStyleAttr = i;
        View inflate = LayoutInflater.from(context).inflate(poh0.ybsdk_day_chooser_bottom_sheet, (ViewGroup) this, false);
        addView(inflate);
        int i2 = fch0.button;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, inflate);
        if (ybButtonView != null) {
            i2 = fch0.hint;
            TextView textView = (TextView) cma1.O(i2, inflate);
            if (textView != null && (O = cma1.O((i2 = fch0.last_day_checkbox_block), inflate)) != null) {
                f361 o = f361.o(O);
                i2 = fch0.personListRecyclerView;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i2, inflate);
                if (recyclerView != null) {
                    i2 = fch0.title;
                    if (((TextView) cma1.O(i2, inflate)) != null) {
                        this.binding = new c161((LinearLayout) inflate, ybButtonView, textView, o, recyclerView);
                        this.selectedDayPosition = -1;
                        this.saveClickAction = new ps20(17);
                        this.onDaySelectCallback = new ps20(18);
                        int i3 = 2;
                        this.errorSaveClickAction = new z530(i3);
                        this.days = new ArrayList();
                        int i4 = 1;
                        for (int i5 = 1; i5 < 31; i5++) {
                            this.days.add(new jsg(i5, g8e.i(Text.Companion, String.valueOf(i5)), true));
                        }
                        this.binding.d.c.setText(context.getString(dzh0.ybsdk_auto_topup_bottom_sheet_choose_date_last_day));
                        this.binding.d.c.setOnClickListener(new w630(this, i4));
                        this.binding.d.b.setOnClickListener(new w630(this, i3));
                        this.adapter = new qa3(new a10(8), new lum(new i0z(9), u630.a, new t130(i3, new fx3(this, i4), new MonthDayChooserView$adapter$2(1, this, MonthDayChooserView.class, "onDayClick", "onDayClick(I)V", 0)), v630.a));
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void changeHintVisibility() {
        TextView textView = this.binding.c;
        d6w d6wVar = new d6w(29, 30, 1);
        jsg jsgVar = this.selectedDay;
        Integer valueOf = jsgVar != null ? Integer.valueOf(jsgVar.a) : null;
        textView.setVisibility((valueOf == null || !d6wVar.g(valueOf.intValue())) ? 4 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDayClick(int position) {
        String str;
        int i;
        jsg jsgVar = this.days.get(position);
        this.selectedDay = jsgVar;
        tls tlsVar = this.onDaySelectCallback;
        if (jsgVar != null) {
            CharSequence a = d.a(getContext(), jsgVar.b);
            if (a != null) {
                str = a.toString();
                tlsVar.invoke(str);
                i = this.selectedDayPosition;
                qa3 qa3Var = this.adapter;
                if (i != -1) {
                    qa3Var.notifyDataSetChanged();
                } else {
                    qa3Var.notifyItemChanged(i);
                    this.adapter.notifyItemChanged(position);
                }
                changeHintVisibility();
                this.selectedDayPosition = position;
                this.binding.d.b.setChecked(false, this.isLastDayChoosen);
                this.isLastDayChoosen = false;
            }
        }
        str = null;
        tlsVar.invoke(str);
        i = this.selectedDayPosition;
        qa3 qa3Var2 = this.adapter;
        if (i != -1) {
        }
        changeHintVisibility();
        this.selectedDayPosition = position;
        this.binding.d.b.setChecked(false, this.isLastDayChoosen);
        this.isLastDayChoosen = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onDaySelectCallback$lambda$1(String str) {
        return zy11.a;
    }

    private final void onLastClick(boolean animate) {
        if (this.isLastDayChoosen) {
            return;
        }
        this.onDaySelectCallback.invoke("LAST_DAY");
        this.isLastDayChoosen = true;
        this.selectedDay = null;
        this.adapter.notifyItemChanged(this.selectedDayPosition);
        this.selectedDayPosition = -1;
        this.binding.d.b.setChecked(true, animate);
        changeHintVisibility();
    }

    public static /* synthetic */ void onLastClick$default(MonthDayChooserView monthDayChooserView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        monthDayChooserView.onLastClick(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSaveClick() {
        boolean z = this.isLastDayChoosen;
        if (!z && this.selectedDay == null) {
            this.errorSaveClickAction.invoke();
            return;
        }
        tls tlsVar = this.saveClickAction;
        jsg jsgVar = this.selectedDay;
        tlsVar.invoke(new x630(z, jsgVar != null ? Integer.valueOf(jsgVar.a) : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 saveClickAction$lambda$0(x630 x630Var) {
        return zy11.a;
    }

    public final void render(y630 state) {
        int i;
        Integer num = state.b;
        this.binding.e.setAdapter(this.adapter);
        Iterator it = state.d.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            int intValue = ((Number) it.next()).intValue() - 1;
            List<jsg> list = this.days;
            jsg jsgVar = list.get(intValue);
            list.set(intValue, new jsg(jsgVar.a, jsgVar.b, false));
        }
        this.binding.d.a.setVisibility(state.a == MonthDayChooserView$State$Mode.ONE_DATE ? 0 : 8);
        if (num != null) {
            int i2 = 0;
            for (Object obj : this.days) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    scc.m();
                    throw null;
                }
                jsg jsgVar2 = (jsg) obj;
                if (jsgVar2.a == num.intValue()) {
                    this.selectedDay = jsgVar2;
                    this.selectedDayPosition = i2;
                }
                i2 = i3;
            }
        }
        if (state.c) {
            onLastClick(false);
        }
        this.adapter.g(this.days);
        this.binding.b.setOnClickListener(new w630(this, i));
        changeHintVisibility();
    }

    public final void setOnErrorSaveButtonClickListener(sls action) {
        this.errorSaveClickAction = action;
    }

    public final void setOnSaveButtonClickListener(tls action) {
        this.saveClickAction = action;
    }

    public final void setupAnalyticActions(tls onDaySelect) {
        this.onDaySelectCallback = onDaySelect;
    }

    public MonthDayChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ MonthDayChooserView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public MonthDayChooserView(Context context) {
        this(context, null, 0, 6, null);
    }
}
