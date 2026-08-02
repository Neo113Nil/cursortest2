package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: StockAmountHolder.kt */
/* loaded from: classes18.dex */
public final class xfl0 extends vif0<Integer> {
    public static final k9x p = new k9x(1, 3, 1);
    public static final k9x q = new k9x(4, 10, 1);
    public static final k9x r = new k9x(11, 30, 1);
    public final ComposeView n;
    public final bpn0 o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xfl0(ViewGroup viewGroup) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setTag("product_card_stock_amount_compose_view");
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.n = (ComposeView) this.itemView;
        this.o = new bpn0(new ia90(10));
    }

    @Override // xsna.vif0
    public final void i6(Integer num) {
        this.n.setContent(new jai(-1633639049, new b6d0(this, num.intValue(), 2), true));
    }

    /* JADX WARN: Type inference failed for: r14v10, types: [T, xsna.lg90] */
    /* JADX WARN: Type inference failed for: r14v17, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v20, types: [T, xsna.lg90] */
    /* JADX WARN: Type inference failed for: r14v27, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v30, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v33, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v39, types: [T, xsna.lg90] */
    /* JADX WARN: Type inference failed for: r14v46, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v11, types: [T, xsna.lg90] */
    /* JADX WARN: Type inference failed for: r8v7, types: [T, xsna.lg90] */
    public final void q6(int i, int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-53451283);
        int i3 = (M.o(i) ? 4 : 2) | i2;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-53451283, i3, -1, "com.vk.ecomm.market.good.ui.holder.StockAmountHolder.ContentOld (StockAmountHolder.kt:118)");
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Ref$LongRef ref$LongRef = new Ref$LongRef();
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            if (i == 0) {
                M.K(1065905083);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1787584620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelCircleOutline24> (VkSdkIcons.kt:262)");
                }
                ?? a = pg90.a(R.drawable.vk_icon_cancel_circle_outline_24, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                ref$ObjectRef.element = a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                ref$LongRef.element = ylu0Var.getIcon().h;
                ref$ObjectRef2.element = d370.N(R.string.market_not_in_stock, 0, M);
                M.j();
            } else {
                k9x k9xVar = p;
                int i4 = k9xVar.b;
                if (i > k9xVar.c || i4 > i) {
                    k9x k9xVar2 = q;
                    int i5 = k9xVar2.b;
                    if (i > k9xVar2.c || i5 > i) {
                        k9x k9xVar3 = r;
                        int i6 = k9xVar3.b;
                        if (i > k9xVar3.c || i6 > i) {
                            M.K(1067144618);
                            qzu0.a.getClass();
                            ref$ObjectRef.element = qzu0.H(M);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            ref$LongRef.element = ylu0Var2.getIcon().i;
                            ref$ObjectRef2.element = d370.N(R.string.market_in_stock, 0, M);
                            M.j();
                        } else {
                            M.K(1066908925);
                            qzu0.a.getClass();
                            ref$ObjectRef.element = qzu0.R(M);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            ref$LongRef.element = ylu0Var3.getIcon().p;
                            ref$ObjectRef2.element = d370.N(R.string.market_in_stock_little, 0, M);
                            M.j();
                        }
                    } else {
                        M.K(1066543218);
                        qzu0.a.getClass();
                        ref$ObjectRef.element = qzu0.H(M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        ref$LongRef.element = ylu0Var4.getIcon().i;
                        ref$ObjectRef2.element = d370.F(R.plurals.market_in_stock_quantity, i, new Object[]{Integer.valueOf(i)}, M, (i3 << 3) & 112);
                        M.j();
                    }
                } else {
                    M.K(1066174380);
                    qzu0.a.getClass();
                    ref$ObjectRef.element = qzu0.R(M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var5 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    ref$LongRef.element = ylu0Var5.getIcon().p;
                    ref$ObjectRef2.element = d370.F(R.plurals.market_in_stock_quantity, i, new Object[]{Integer.valueOf(i)}, M, (i3 << 3) & 112);
                    M.j();
                }
            }
            rrv0.d(null, null, null, null, kai.c(-396946136, new ar0(ref$ObjectRef, ref$LongRef, ref$ObjectRef2, 10), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g1b0(this, i, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r14v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v16, types: [T, xsna.lg90] */
    /* JADX WARN: Type inference failed for: r14v23, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v8, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v4, types: [T, xsna.lg90] */
    /* JADX WARN: Type inference failed for: r8v8, types: [T, xsna.lg90] */
    public final void s6(int i, int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(998000780);
        int i3 = (M.o(i) ? 4 : 2) | i2;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(998000780, i3, -1, "com.vk.ecomm.market.good.ui.holder.StockAmountHolder.ContentRedesigned (StockAmountHolder.kt:65)");
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Ref$LongRef ref$LongRef = new Ref$LongRef();
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            if (i == 0) {
                M.K(1677832279);
                ref$ObjectRef.element = pg90.a(R.drawable.vk_icon_cancel_circle_outline_20, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                ref$LongRef.element = ylu0Var.getIcon().h;
                ref$ObjectRef2.element = d370.N(R.string.market_not_in_stock, 0, M);
                M.j();
            } else {
                k9x k9xVar = p;
                int i4 = k9xVar.b;
                if (i > k9xVar.c || i4 > i) {
                    M.K(1678525811);
                    ref$ObjectRef.element = pg90.a(R.drawable.vk_icon_check_20, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    ref$LongRef.element = ylu0Var2.getIcon().i;
                    ref$ObjectRef2.element = d370.F(R.plurals.market_in_stock_quantity, i, new Object[]{Integer.valueOf(i)}, M, (i3 << 3) & 112);
                    M.j();
                } else {
                    M.K(1678138373);
                    ref$ObjectRef.element = pg90.a(R.drawable.vk_icon_error_circle_outline_20, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    ref$LongRef.element = ylu0Var3.getIcon().p;
                    ref$ObjectRef2.element = d370.F(R.plurals.market_in_stock_quantity, i, new Object[]{Integer.valueOf(i)}, M, (i3 << 3) & 112);
                    M.j();
                }
            }
            rrv0.d(null, null, null, null, kai.c(1271402737, new r67(ref$ObjectRef, ref$LongRef, ref$ObjectRef2), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zqy(this, i, i2);
        }
    }
}
