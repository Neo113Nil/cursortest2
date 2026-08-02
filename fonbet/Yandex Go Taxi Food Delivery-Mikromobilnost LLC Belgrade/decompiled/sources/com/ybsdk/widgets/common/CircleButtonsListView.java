package com.ybsdk.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a7b;
import defpackage.i3y;
import defpackage.k5;
import defpackage.l7b;
import defpackage.lum;
import defpackage.m70;
import defpackage.n70;
import defpackage.ny61;
import defpackage.otb;
import defpackage.poh0;
import defpackage.qa3;
import defpackage.qha;
import defpackage.s061;
import defpackage.tls;
import defpackage.uz;
import defpackage.vqb;
import defpackage.wtb;
import defpackage.xtb;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0019\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR)\u0010\"\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\f0\f0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/ybsdk/widgets/common/CircleButtonsListView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lm70;", "", "Lotb;", "buttonsAdapterDelegate", "()Lm70;", "Lwtb;", ClidProvider.STATE, "Lzy11;", "render", "(Lwtb;)V", "Lkotlin/Function1;", "", "listener", "setOnButtonClickListener", "(Ltls;)V", "xtb", "buttonsDiffCallback", "Lxtb;", "Lqa3;", "kotlin.jvm.PlatformType", "buttonsAdapter$delegate", "Li3y;", "getButtonsAdapter", "()Lqa3;", "buttonsAdapter", "clickListener", "Ltls;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CircleButtonsListView extends RecyclerView {

    /* renamed from: buttonsAdapter$delegate, reason: from kotlin metadata */
    private final i3y buttonsAdapter;
    private final xtb buttonsDiffCallback;
    private tls clickListener;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ybsdk/widgets/common/CircleButtonsListView$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ybsdk.widgets.common.CircleButtonsListView$1, reason: invalid class name */
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
            return Boolean.valueOf(obj instanceof otb);
        }
    }

    public static final class b implements tls {
        public static final b a = new b();

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return LayoutInflater.from(((ViewGroup) obj).getContext());
        }
    }

    public CircleButtonsListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.buttonsDiffCallback = new xtb();
        this.buttonsAdapter = kotlin.a.a(new l7b(15, this));
        setLayoutManager(new AnonymousClass1(context, 0, false));
        setAdapter(getButtonsAdapter());
        setClipToPadding(false);
        setNestedScrollingEnabled(false);
        setItemAnimator(null);
    }

    private final m70 buttonsAdapterDelegate() {
        return new lum(new qha(20), a.a, new vqb(2, this), b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s061 buttonsAdapterDelegate$lambda$1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(poh0.ybsdk_circle_button_item, viewGroup, false);
        if (inflate != null) {
            return new s061((CircleButtonView) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 buttonsAdapterDelegate$lambda$6(CircleButtonsListView circleButtonsListView, n70 n70Var) {
        n70Var.W(new a7b(18, n70Var, circleButtonsListView));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 buttonsAdapterDelegate$lambda$6$lambda$5(n70 n70Var, CircleButtonsListView circleButtonsListView, List list) {
        CircleButtonView circleButtonView = ((s061) n70Var.N).a;
        circleButtonView.render((otb) n70Var.Z());
        if (((otb) n70Var.Z()).d) {
            circleButtonView.setOnClickListener(new k5(19, circleButtonsListView, n70Var));
        } else {
            circleButtonView.setOnClickListener(null);
            ((s061) n70Var.N).a.setClickable(false);
        }
        circleButtonView.post(new uz(17, circleButtonView));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buttonsAdapterDelegate$lambda$6$lambda$5$lambda$4$lambda$2(CircleButtonsListView circleButtonsListView, n70 n70Var, View view) {
        tls tlsVar = circleButtonsListView.clickListener;
        if (tlsVar != null) {
            tlsVar.invoke(((otb) n70Var.Z()).a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa3 buttonsAdapter_delegate$lambda$0(CircleButtonsListView circleButtonsListView) {
        return new qa3(circleButtonsListView.buttonsDiffCallback, circleButtonsListView.buttonsAdapterDelegate());
    }

    private final qa3 getButtonsAdapter() {
        return (qa3) this.buttonsAdapter.getValue();
    }

    public final void render(wtb state) {
        getButtonsAdapter().g(state.a);
    }

    public final void setOnButtonClickListener(tls listener) {
        this.clickListener = listener;
    }

    public CircleButtonsListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CircleButtonsListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CircleButtonsListView(Context context) {
        this(context, null, 0, 6, null);
    }
}
