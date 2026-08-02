package com.ybsdk.widgets.common.chip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a7b;
import defpackage.fqb;
import defpackage.gqb;
import defpackage.hqb;
import defpackage.i3y;
import defpackage.iqb;
import defpackage.jw00;
import defpackage.k5;
import defpackage.kp50;
import defpackage.l7b;
import defpackage.lum;
import defpackage.m70;
import defpackage.n70;
import defpackage.od9;
import defpackage.pqb;
import defpackage.qa3;
import defpackage.qha;
import defpackage.tls;
import defpackage.zls;
import defpackage.zo31;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0018\u0018\u0000 $2\u00020\u0001:\u0002\u000f%B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR)\u0010!\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\f0\f0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/ybsdk/widgets/common/chip/ChipListView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lm70;", "", "Lpqb;", "chipsAdapterDelegate", "()Lm70;", "Lhqb;", ClidProvider.STATE, "Lzy11;", "render", "(Lhqb;)V", "Lkotlin/Function1;", "listener", "setOnButtonClickListener", "(Ltls;)V", "iqb", "buttonsDiffCallback", "Liqb;", "Lqa3;", "kotlin.jvm.PlatformType", "chipsAdapter$delegate", "Li3y;", "getChipsAdapter", "()Lqa3;", "chipsAdapter", "clickListener", "Ltls;", "Companion", "gqb", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChipListView extends RecyclerView {
    private static final gqb Companion = new gqb();
    private static final int SPACE_DECORATION_PX = kp50.r(8);
    private final iqb buttonsDiffCallback;

    /* renamed from: chipsAdapter$delegate, reason: from kotlin metadata */
    private final i3y chipsAdapter;
    private tls clickListener;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ybsdk/widgets/common/chip/ChipListView$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ybsdk.widgets.common.chip.ChipListView$1, reason: invalid class name */
    public static final class AnonymousClass1 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
        public final boolean I() {
            return false;
        }
    }

    public static final class a implements zls {
        public static final a a = new a();

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            ((Number) obj3).intValue();
            return Boolean.valueOf(obj instanceof pqb);
        }
    }

    public static final class b implements tls {
        public static final b a = new b();

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return LayoutInflater.from(((ViewGroup) obj).getContext());
        }
    }

    public ChipListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.buttonsDiffCallback = new iqb();
        this.chipsAdapter = kotlin.a.a(new l7b(12, this));
        setLayoutManager(new AnonymousClass1(context, 0, false));
        setAdapter(getChipsAdapter());
        setClipToPadding(false);
        setItemAnimator(null);
        addItemDecoration(new jw00(0, 0, SPACE_DECORATION_PX, null, 11));
    }

    private final m70 chipsAdapterDelegate() {
        return new lum(new qha(19), a.a, new od9(29, this), b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zo31 chipsAdapterDelegate$lambda$2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new fqb(viewGroup, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View chipsAdapterDelegate$lambda$2$lambda$1(ViewGroup viewGroup) {
        return new ChipView(viewGroup.getContext(), null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 chipsAdapterDelegate$lambda$7(ChipListView chipListView, n70 n70Var) {
        n70Var.W(new a7b(16, n70Var, chipListView));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 chipsAdapterDelegate$lambda$7$lambda$6(n70 n70Var, ChipListView chipListView, List list) {
        View view = n70Var.a;
        ChipView chipView = view instanceof ChipView ? (ChipView) view : null;
        if (chipView != null) {
            chipView.render((pqb) n70Var.Z());
            chipView.setOnClickListener(new k5(18, chipListView, n70Var));
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void chipsAdapterDelegate$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3(ChipListView chipListView, n70 n70Var, View view) {
        tls tlsVar = chipListView.clickListener;
        if (tlsVar != null) {
            tlsVar.invoke(n70Var.Z());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa3 chipsAdapter_delegate$lambda$0(ChipListView chipListView) {
        return new qa3(chipListView.buttonsDiffCallback, chipListView.chipsAdapterDelegate());
    }

    private final qa3 getChipsAdapter() {
        return (qa3) this.chipsAdapter.getValue();
    }

    public final void render(hqb state) {
        getChipsAdapter().g(state.a);
    }

    public final void setOnButtonClickListener(tls listener) {
        this.clickListener = listener;
    }

    public ChipListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ChipListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ChipListView(Context context) {
        this(context, null, 0, 6, null);
    }
}
