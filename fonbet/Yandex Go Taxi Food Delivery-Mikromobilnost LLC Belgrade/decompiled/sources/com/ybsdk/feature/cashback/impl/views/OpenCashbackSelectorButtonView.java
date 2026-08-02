package com.ybsdk.feature.cashback.impl.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;
import com.ybsdk.feature.cashback.impl.entities.types.PromoID;
import defpackage.b470;
import defpackage.bnh0;
import defpackage.cma1;
import defpackage.cry;
import defpackage.d10;
import defpackage.fd60;
import defpackage.fx00;
import defpackage.hbv;
import defpackage.i090;
import defpackage.kp50;
import defpackage.l861;
import defpackage.lum;
import defpackage.n70;
import defpackage.ny61;
import defpackage.o061;
import defpackage.qaq0;
import defpackage.tah0;
import defpackage.tls;
import defpackage.v4b1;
import defpackage.vu30;
import defpackage.y00;
import defpackage.z00;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR.\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020  !*\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/views/OpenCashbackSelectorButtonView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lqaq0;", "item", "Lzy11;", "render", "(Lqaq0;)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ll861;", "binding", "Ll861;", "Lb470;", "selectCategoryListener", "Lb470;", "getSelectCategoryListener", "()Lb470;", "setSelectCategoryListener", "(Lb470;)V", "Lcry;", "", "", "kotlin.jvm.PlatformType", "iconsAdapter", "Lcry;", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OpenCashbackSelectorButtonView extends FrameLayout {
    private final l861 binding;
    private final cry iconsAdapter;
    private b470 selectCategoryListener;

    public static final class a implements zls {
        public static final a a = new a();

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            ((Number) obj3).intValue();
            return Boolean.valueOf(obj instanceof CashbackSelectorCategoryEntity);
        }
    }

    public static final class b implements tls {
        public static final b a = new b();

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return LayoutInflater.from(((ViewGroup) obj).getContext());
        }
    }

    public OpenCashbackSelectorButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(bnh0.ybsdk_select_new_cashback_item, (ViewGroup) this, false);
        addView(inflate);
        int i2 = tah0.description;
        TextView textView = (TextView) cma1.O(i2, inflate);
        if (textView != null) {
            i2 = tah0.image;
            if (((AppCompatImageView) cma1.O(i2, inflate)) != null) {
                i2 = tah0.imageRecycler;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i2, inflate);
                if (recyclerView != null) {
                    i2 = tah0.itemsText;
                    TextView textView2 = (TextView) cma1.O(i2, inflate);
                    if (textView2 != null) {
                        i2 = tah0.title;
                        TextView textView3 = (TextView) cma1.O(i2, inflate);
                        if (textView3 != null) {
                            this.binding = new l861((ConstraintLayout) inflate, textView, recyclerView, textView2, textView3);
                            this.iconsAdapter = new cry(new lum(new vu30(18), a.a, new fd60(16), b.a));
                            recyclerView.addItemDecoration(new i090(kp50.r(12)));
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o061 iconsAdapter$lambda$0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(bnh0.ybsdk_cashback_icon_view_item, viewGroup, false);
        if (inflate != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) inflate;
            return new o061(appCompatImageView, appCompatImageView);
        }
        ny61.t("rootView");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 iconsAdapter$lambda$3(n70 n70Var) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        n70Var.W(new y00(ref$ObjectRef, n70Var));
        n70Var.b0(new z00(3, ref$ObjectRef));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, hbv] */
    public static final zy11 iconsAdapter$lambda$3$lambda$1(Ref$ObjectRef ref$ObjectRef, n70 n70Var, List list) {
        ref$ObjectRef.element = v4b1.k(((CashbackSelectorCategoryEntity) n70Var.Z()).getImage(), ((o061) n70Var.N).b, null, null, 6);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 iconsAdapter$lambda$3$lambda$2(Ref$ObjectRef ref$ObjectRef) {
        hbv hbvVar = (hbv) ref$ObjectRef.element;
        if (hbvVar != null) {
            hbvVar.dispose();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$6$lambda$5(OpenCashbackSelectorButtonView openCashbackSelectorButtonView, qaq0 qaq0Var, View view) {
        b470 b470Var = openCashbackSelectorButtonView.selectCategoryListener;
        if (b470Var != null) {
            ((d10) b470Var).a.invoke(PromoID.m407boximpl(qaq0Var.a));
        }
    }

    public final b470 getSelectCategoryListener() {
        return this.selectCategoryListener;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    public final void render(qaq0 item) {
        ArrayList arrayList = item.w;
        l861 l861Var = this.binding;
        TextView textView = l861Var.e;
        RecyclerView recyclerView = l861Var.c;
        TextView textView2 = l861Var.d;
        textView.setText(d.a(getContext(), item.b));
        TextView textView3 = l861Var.b;
        Text text = item.c;
        textView3.setVisibility(text != null ? 0 : 8);
        textView2.setVisibility(!arrayList.isEmpty() ? 0 : 8);
        recyclerView.setVisibility(arrayList.isEmpty() ? 8 : 0);
        if (text != null) {
            textView3.setText(d.a(getContext(), text));
        }
        textView2.setText(d.a(getContext(), item.x));
        recyclerView.setAdapter(this.iconsAdapter);
        this.iconsAdapter.b = arrayList;
        setOnClickListener(new fx00(9, this, item));
    }

    public final void setSelectCategoryListener(b470 b470Var) {
        this.selectCategoryListener = b470Var;
    }

    public OpenCashbackSelectorButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ OpenCashbackSelectorButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public OpenCashbackSelectorButtonView(Context context) {
        this(context, null, 0, 6, null);
    }
}
