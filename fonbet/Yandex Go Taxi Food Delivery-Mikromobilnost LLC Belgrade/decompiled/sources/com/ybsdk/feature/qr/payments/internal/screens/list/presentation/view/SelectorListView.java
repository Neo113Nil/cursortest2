package com.ybsdk.feature.qr.payments.internal.screens.list.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a5p0;
import defpackage.arm0;
import defpackage.b7p0;
import defpackage.fqb;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jw00;
import defpackage.klq0;
import defpackage.kp50;
import defpackage.llq0;
import defpackage.lum;
import defpackage.m70;
import defpackage.mlq0;
import defpackage.n70;
import defpackage.qa3;
import defpackage.tai0;
import defpackage.tls;
import defpackage.tmq0;
import defpackage.uyo0;
import defpackage.zls;
import defpackage.zo31;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u001d\b\u0000\u0018\u0000 '2\u00020\u0001:\u0002\u0015(B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR)\u0010&\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\f0\f0 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/screens/list/presentation/view/SelectorListView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lm70;", "", "Ltmq0;", "selectorsAdapterDelegate", "()Lm70;", "Lkotlin/Function1;", "", "Lzy11;", "listener", "setOnSelectorClickListener", "(Ltls;)V", "Lllq0;", ClidProvider.STATE, "render", "(Lllq0;)V", "currentState", "Lllq0;", "clickListener", "Ltls;", "mlq0", "buttonsDiffCallback", "Lmlq0;", "Lqa3;", "kotlin.jvm.PlatformType", "selectorsAdapter$delegate", "Li3y;", "getSelectorsAdapter", "()Lqa3;", "selectorsAdapter", "Companion", "klq0", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectorListView extends RecyclerView {
    private static final klq0 Companion = new klq0();
    private static final int SPACE_DECORATION_PX = kp50.r(8);
    private final mlq0 buttonsDiffCallback;
    private tls clickListener;
    private llq0 currentState;

    /* renamed from: selectorsAdapter$delegate, reason: from kotlin metadata */
    private final i3y selectorsAdapter;

    public static final class a implements zls {
        public static final a a = new a();

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            ((Number) obj3).intValue();
            return Boolean.valueOf(obj instanceof tmq0);
        }
    }

    public static final class b implements tls {
        public static final b a = new b();

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return LayoutInflater.from(((ViewGroup) obj).getContext());
        }
    }

    public SelectorListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.currentState = new llq0(EmptyList.a);
        this.buttonsDiffCallback = new mlq0();
        this.selectorsAdapter = kotlin.a.a(new b7p0(10, this));
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        setAdapter(getSelectorsAdapter());
        setClipToPadding(false);
        setItemAnimator(null);
        addItemDecoration(new jw00(0, 0, SPACE_DECORATION_PX, null, 11));
    }

    private final qa3 getSelectorsAdapter() {
        return (qa3) this.selectorsAdapter.getValue();
    }

    private final m70 selectorsAdapterDelegate() {
        return new lum(new arm0(20), a.a, new uyo0(25, this), b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zo31 selectorsAdapterDelegate$lambda$2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new fqb(viewGroup, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View selectorsAdapterDelegate$lambda$2$lambda$1(ViewGroup viewGroup) {
        return new SelectorView(viewGroup.getContext(), null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 selectorsAdapterDelegate$lambda$7(SelectorListView selectorListView, n70 n70Var) {
        n70Var.W(new a5p0(14, n70Var, selectorListView));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 selectorsAdapterDelegate$lambda$7$lambda$6(n70 n70Var, SelectorListView selectorListView, List list) {
        View view = n70Var.a;
        SelectorView selectorView = view instanceof SelectorView ? (SelectorView) view : null;
        if (selectorView != null) {
            selectorView.setOnClickListener(new tai0(16, selectorListView, n70Var));
            selectorView.render((tmq0) n70Var.Z());
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void selectorsAdapterDelegate$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3(SelectorListView selectorListView, n70 n70Var, View view) {
        tls tlsVar = selectorListView.clickListener;
        if (tlsVar != null) {
            tlsVar.invoke(((tmq0) n70Var.Z()).a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa3 selectorsAdapter_delegate$lambda$0(SelectorListView selectorListView) {
        return new qa3(selectorListView.buttonsDiffCallback, selectorListView.selectorsAdapterDelegate());
    }

    public final void render(llq0 state) {
        if (jl40.l(this.currentState, state)) {
            return;
        }
        getSelectorsAdapter().g(state.a);
    }

    public final void setOnSelectorClickListener(tls listener) {
        this.clickListener = listener;
    }

    public SelectorListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SelectorListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SelectorListView(Context context) {
        this(context, null, 0, 6, null);
    }
}
