package com.ybsdk.widgets.common.paymentmethod;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.ToolbarView;
import defpackage.a10;
import defpackage.a5p0;
import defpackage.adq0;
import defpackage.arm0;
import defpackage.bdq0;
import defpackage.cdq0;
import defpackage.cma1;
import defpackage.eaj0;
import defpackage.edq0;
import defpackage.f0z0;
import defpackage.fch0;
import defpackage.fdq0;
import defpackage.hc5;
import defpackage.hdq0;
import defpackage.hgy;
import defpackage.idq0;
import defpackage.igy;
import defpackage.jdq0;
import defpackage.jiz0;
import defpackage.kdq0;
import defpackage.kiz0;
import defpackage.l361;
import defpackage.ldq0;
import defpackage.liz0;
import defpackage.lum;
import defpackage.mdq0;
import defpackage.mtw;
import defpackage.n7l0;
import defpackage.ny61;
import defpackage.pdq0;
import defpackage.poh0;
import defpackage.qa3;
import defpackage.rbv;
import defpackage.sls;
import defpackage.stz0;
import defpackage.uyo0;
import defpackage.w511;
import defpackage.w9u;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\f2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010 R\"\u0010$\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/ybsdk/widgets/common/paymentmethod/SelectPaymentMethodView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lpdq0;", ClidProvider.STATE, "Lzy11;", "renderSbpWidget", "(Lpdq0;)V", "render", "(Lpdq0;)Lzy11;", "Lmdq0;", "selectPaymentMethodListener", "setListener", "(Lmdq0;)V", "Lkotlin/Function0;", "listener", "setOnLeftToolbarImageClickListener", "(Lsls;)V", "Landroid/view/View;", "widgetView", "setHeaderWidget", "(Landroid/view/View;)V", "Ll361;", "binding", "Ll361;", "Lmdq0;", "Lqa3;", "Lgc5;", "kotlin.jvm.PlatformType", "selectPaymentAdapter", "Lqa3;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SelectPaymentMethodView extends LinearLayout {
    private final l361 binding;
    private mdq0 listener;
    private final qa3 selectPaymentAdapter;

    public SelectPaymentMethodView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = 0;
        View inflate = LayoutInflater.from(context).inflate(poh0.ybsdk_layout_select_payment_method, (ViewGroup) this, false);
        addView(inflate);
        int i3 = fch0.select_payment_method_recycler;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i3, inflate);
        if (recyclerView != null) {
            i3 = fch0.select_payment_method_toolbar;
            ToolbarView toolbarView = (ToolbarView) cma1.O(i3, inflate);
            if (toolbarView != null) {
                i3 = fch0.select_payment_method_widget;
                WidgetSbpView widgetSbpView = (WidgetSbpView) cma1.O(i3, inflate);
                if (widgetSbpView != null) {
                    i3 = fch0.select_payment_widget_container;
                    FrameLayout frameLayout = (FrameLayout) cma1.O(i3, inflate);
                    if (frameLayout != null) {
                        this.binding = new l361((LinearLayout) inflate, recyclerView, toolbarView, widgetSbpView, frameLayout);
                        a10 a10Var = hc5.a;
                        uyo0 uyo0Var = new uyo0(21, this);
                        int i4 = cdq0.a;
                        qa3 qa3Var = new qa3(a10Var, new lum(new arm0(18), adq0.a, new uyo0(20, uyo0Var), bdq0.a), new lum(new w9u(27), hgy.a, new mtw(26), igy.a), new lum(new jiz0(i2), kiz0.a, new f0z0(9), liz0.a));
                        this.selectPaymentAdapter = qa3Var;
                        widgetSbpView.setOnClickListener(new eaj0(12, this));
                        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
                        recyclerView.setAdapter(qa3Var);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$1(SelectPaymentMethodView selectPaymentMethodView, View view) {
        mdq0 mdq0Var = selectPaymentMethodView.listener;
        if (mdq0Var != null) {
            mdq0Var.onSbpWidgetClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 render$lambda$7$lambda$6$lambda$5(Text text, pdq0 pdq0Var, stz0 stz0Var) {
        Text text2 = pdq0Var.c;
        rbv rbvVar = pdq0Var.d;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        stz0 a = stz0.a(stz0Var, text, text2, null, rbvVar, null, null, false, false, null, null, 0, 28660);
        Integer num = pdq0Var.e;
        return num != null ? stz0.a(a, null, null, null, null, null, null, false, false, null, null, num.intValue(), 16383) : a;
    }

    private final void renderSbpWidget(pdq0 state) {
        WidgetSbpView widgetSbpView = this.binding.c;
        state.getClass();
        widgetSbpView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 selectPaymentAdapter$lambda$0(SelectPaymentMethodView selectPaymentMethodView, ldq0 ldq0Var) {
        if (ldq0Var.equals(hdq0.a)) {
            mdq0 mdq0Var = selectPaymentMethodView.listener;
            if (mdq0Var != null) {
                mdq0Var.onAddMethodClicked();
            }
        } else if (ldq0Var instanceof kdq0) {
            mdq0 mdq0Var2 = selectPaymentMethodView.listener;
            if (mdq0Var2 != null) {
                mdq0Var2.onSelectedPaymentMethodChanged(((kdq0) ldq0Var).a);
            }
        } else if (ldq0Var.equals(hdq0.b)) {
            mdq0 mdq0Var3 = selectPaymentMethodView.listener;
            if (mdq0Var3 != null) {
                mdq0Var3.onSbpMethodClicked();
            }
        } else if (ldq0Var instanceof idq0) {
            mdq0 mdq0Var4 = selectPaymentMethodView.listener;
            if (mdq0Var4 != null) {
                mdq0Var4.onAdditionalButtonClicked(((idq0) ldq0Var).a);
            }
        } else if (ldq0Var instanceof edq0) {
            mdq0 mdq0Var5 = selectPaymentMethodView.listener;
            if (mdq0Var5 != null) {
                mdq0Var5.onSelectedAccountChanged(((edq0) ldq0Var).a);
            }
        } else if (ldq0Var instanceof fdq0) {
            mdq0 mdq0Var6 = selectPaymentMethodView.listener;
            if (mdq0Var6 != null) {
                mdq0Var6.onSelectedAccountChanged(((fdq0) ldq0Var).a);
            }
        } else {
            if (!(ldq0Var instanceof jdq0)) {
                w511.b();
                return null;
            }
            mdq0 mdq0Var7 = selectPaymentMethodView.listener;
            if (mdq0Var7 != null) {
                mdq0Var7.onCreditPaymentMethodChanged(((jdq0) ldq0Var).a);
            }
        }
        return zy11.a;
    }

    public static /* synthetic */ void setOnLeftToolbarImageClickListener$default(SelectPaymentMethodView selectPaymentMethodView, sls slsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            slsVar = null;
        }
        selectPaymentMethodView.setOnLeftToolbarImageClickListener(slsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setOnLeftToolbarImageClickListener$lambda$8(sls slsVar) {
        if (slsVar != null) {
            slsVar.invoke();
        }
        return zy11.a;
    }

    public final zy11 render(pdq0 state) {
        l361 l361Var = this.binding;
        renderSbpWidget(state);
        this.selectPaymentAdapter.g(state.a);
        this.selectPaymentAdapter.notifyDataSetChanged();
        ToolbarView toolbarView = l361Var.b;
        Text text = state.b;
        toolbarView.setVisibility(text != null ? 0 : 8);
        if (text == null) {
            return null;
        }
        l361Var.b.render(new a5p0(9, text, state));
        return zy11.a;
    }

    public final void setHeaderWidget(View widgetView) {
        this.binding.d.removeAllViews();
        this.binding.d.addView(widgetView);
    }

    public final void setListener(mdq0 selectPaymentMethodListener) {
        this.listener = selectPaymentMethodListener;
    }

    public final void setOnLeftToolbarImageClickListener(sls listener) {
        this.binding.b.setOnImageClickListener(new n7l0(5, listener));
    }

    public SelectPaymentMethodView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SelectPaymentMethodView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SelectPaymentMethodView(Context context) {
        this(context, null, 0, 6, null);
    }
}
