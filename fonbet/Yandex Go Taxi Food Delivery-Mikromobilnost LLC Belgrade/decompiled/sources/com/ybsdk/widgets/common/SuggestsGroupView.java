package com.ybsdk.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b961;
import defpackage.i3y;
import defpackage.kp50;
import defpackage.lum;
import defpackage.lzu0;
import defpackage.m70;
import defpackage.n70;
import defpackage.ny61;
import defpackage.ogu0;
import defpackage.p9t0;
import defpackage.poh0;
import defpackage.qa3;
import defpackage.qls0;
import defpackage.sbv0;
import defpackage.tai0;
import defpackage.tbv0;
import defpackage.tls;
import defpackage.u9v0;
import defpackage.ubv0;
import defpackage.vbv0;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u001a\u0018\u0000 &2\u00020\u0001:\u0003'\u000f(B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\u00112\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR)\u0010#\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\f0\f0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R*\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/ybsdk/widgets/common/SuggestsGroupView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lm70;", "", "Lu9v0;", "suggestsAdapterDelegate", "()Lm70;", "Lubv0;", ClidProvider.STATE, "Lzy11;", "render", "(Lubv0;)V", "Lkotlin/Function2;", "Ljava/math/BigDecimal;", "Lcom/ybsdk/widgets/common/SuggestView$State$Behaviour;", "listener", "setOnSuggestClickListener", "(Lwls;)V", "vbv0", "suggestsDiffCallback", "Lvbv0;", "Lqa3;", "kotlin.jvm.PlatformType", "suggestsAdapter$delegate", "Li3y;", "getSuggestsAdapter", "()Lqa3;", "suggestsAdapter", "clickListener", "Lwls;", "Companion", "tbv0", "sbv0", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestsGroupView extends RecyclerView {
    private static final sbv0 Companion = new sbv0();
    private static final int SPACE_DECORATION_PX = kp50.r(8);
    private wls clickListener;

    /* renamed from: suggestsAdapter$delegate, reason: from kotlin metadata */
    private final i3y suggestsAdapter;
    private final vbv0 suggestsDiffCallback;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ybsdk/widgets/common/SuggestsGroupView$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ybsdk.widgets.common.SuggestsGroupView$1, reason: invalid class name */
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
            return Boolean.valueOf(obj instanceof u9v0);
        }
    }

    public static final class b implements tls {
        public static final b a = new b();

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return LayoutInflater.from(((ViewGroup) obj).getContext());
        }
    }

    public SuggestsGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.suggestsDiffCallback = new vbv0();
        this.suggestsAdapter = kotlin.a.a(new ogu0(9, this));
        setLayoutManager(new AnonymousClass1(context, 0, false));
        setAdapter(getSuggestsAdapter());
        setClipToPadding(false);
        setNestedScrollingEnabled(false);
        addItemDecoration(new tbv0(getSuggestsAdapter()));
        setItemAnimator(null);
    }

    private final qa3 getSuggestsAdapter() {
        return (qa3) this.suggestsAdapter.getValue();
    }

    private final m70 suggestsAdapterDelegate() {
        return new lum(new qls0(28), a.a, new p9t0(22, this), b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b961 suggestsAdapterDelegate$lambda$1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(poh0.ybsdk_suggest_view, viewGroup, false);
        if (inflate != null) {
            return new b961((SuggestView) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 suggestsAdapterDelegate$lambda$5(SuggestsGroupView suggestsGroupView, n70 n70Var) {
        n70Var.W(new lzu0(3, n70Var, suggestsGroupView));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 suggestsAdapterDelegate$lambda$5$lambda$4(n70 n70Var, SuggestsGroupView suggestsGroupView, List list) {
        SuggestView suggestView = ((b961) n70Var.N).a;
        suggestView.render((u9v0) n70Var.Z());
        suggestView.setOnClickListener(new tai0(24, suggestsGroupView, n70Var));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void suggestsAdapterDelegate$lambda$5$lambda$4$lambda$3$lambda$2(SuggestsGroupView suggestsGroupView, n70 n70Var, View view) {
        wls wlsVar = suggestsGroupView.clickListener;
        if (wlsVar != null) {
            wlsVar.invoke(((u9v0) n70Var.Z()).a.getAmount(), ((u9v0) n70Var.Z()).c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa3 suggestsAdapter_delegate$lambda$0(SuggestsGroupView suggestsGroupView) {
        return new qa3(suggestsGroupView.suggestsDiffCallback, suggestsGroupView.suggestsAdapterDelegate());
    }

    public final void render(ubv0 state) {
        getSuggestsAdapter().g(state.a);
    }

    public final void setOnSuggestClickListener(wls listener) {
        this.clickListener = listener;
    }

    public SuggestsGroupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SuggestsGroupView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SuggestsGroupView(Context context) {
        this(context, null, 0, 6, null);
    }
}
