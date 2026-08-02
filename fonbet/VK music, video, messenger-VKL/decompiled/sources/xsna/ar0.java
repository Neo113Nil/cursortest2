package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import com.vk.messagetemplates.impl.details.BottomBarViewState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.n1b0;
import xsna.pg00;
import xsna.q630;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ar0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ar0(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        q630.a aVar = q630.a.a;
        int i2 = 7;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                hr0 hr0Var = (hr0) obj5;
                ls0 ls0Var = (ls0) obj4;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(173109716, intValue, -1, "com.vk.newsfeed.posting.additional_settings.presentation.base.view.AdditionalSettingsContentView.ThemedContent.<anonymous> (AdditionalSettingsContentView.kt:55)");
                    }
                    fm50 fm50Var = (fm50) hr0Var.d(js0.a, (n0u0[]) Arrays.copyOf(new n0u0[]{ls0Var.a, ls0Var.b}, 2), aVar2, 518).getValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
                    }
                    lg90 b = or.b(aVar2, -45049119, R.drawable.vk_icon_arrow_left_outline_28, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N = d370.N(R.string.previous_step_talkback_title, 0, aVar2);
                    boolean J = aVar2.J(izsVar);
                    Object x = aVar2.x();
                    if (J || x == c0012a) {
                        x = new cr0(izsVar, 0);
                        aVar2.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
                    Object x2 = aVar2.x();
                    if (x2 == c0012a) {
                        x2 = new k60(1);
                        aVar2.R(x2);
                    }
                    TopBar$Before.e a = TopBar$Before.e.a.a(b, N, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2), aVar2, 1572872, 24);
                    q630 d = txj0.d(aVar, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    phv0.b(d, kai.c(1457976162, new dr0(a, 0), aVar2), null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(427161325, new er0(fm50Var, hr0Var, izsVar, 0), aVar2), aVar2, 805306422, 380);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 1:
                z37 z37Var = (z37) obj5;
                com.vk.ecomm.onlinebooking.impl.services.presentation.model.a aVar3 = (com.vk.ecomm.onlinebooking.impl.services.presentation.model.a) obj4;
                gzs gzsVar2 = (gzs) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1605592301, intValue2, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreen.<anonymous>.<anonymous> (BookingServicesScreen.kt:112)");
                    }
                    BookingServicesScreenKt.a(z37Var, aVar3, gzsVar2, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((ame) obj5).b((ao50) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((pbz) obj5).h((dcz) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((kh00) obj5).i((pg00.b) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((te10) obj5).h((ve10) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 6:
                dv60 dv60Var = (dv60) obj5;
                mu60 mu60Var = (mu60) obj4;
                qz60 qz60Var = (qz60) obj3;
                iw60 iw60Var = (iw60) obj;
                io.reactivex.rxjava3.internal.operators.single.y c = dv60Var.w().c(iw60Var, (jw60) obj2);
                int i3 = mu60Var.b;
                io.reactivex.rxjava3.core.x<lu60> A = dv60Var.A(c, i3);
                int i4 = iw60Var.c;
                io.reactivex.rxjava3.internal.operators.single.i d2 = gv60.d(dv60Var.L(gv60.c(dv60Var.H(A, i4).m(dv60Var.n), dv60Var.g)).l(new nit(new tu60(i3, dv60Var, qz60Var.d, qz60Var.c), 11)), i4, mu60Var.d, new lw3(dv60Var, 8));
                if (dv60Var.y()) {
                    d2 = new io.reactivex.rxjava3.internal.operators.single.i(d2, new h9b(new s55(dv60Var, 11)));
                }
                return dv60Var.N(gv60.b(dv60Var.O(dv60Var.J(new io.reactivex.rxjava3.internal.operators.single.r(dv60Var.t(gv60.a(d2)), new rt0(new wu60(dv60Var, i4, r9), 25)), iw60Var)), new ui(dv60Var, 7), new io60(dv60Var, 2)), i4, true);
            case 7:
                ((Integer) obj2).getClass();
                ((i1b0) obj5).h((n1b0.b) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                ((jib0) obj5).j(ne7.I(49), (androidx.compose.runtime.a) obj, (izs) obj3, (q630) obj4);
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((tdd0) obj5).i((udd0) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 10:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj5;
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj4;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-396946136, intValue3, -1, "com.vk.ecomm.market.good.ui.holder.StockAmountHolder.ContentOld.<anonymous> (StockAmountHolder.kt:164)");
                    }
                    q630 f = txj0.f(aVar, 1.0f);
                    com.vk.core.compose.component.cell.content.i0 a2 = Cell$Left.a.a(com.vk.core.compose.component.cell.content.f.a((lg90) ref$ObjectRef.element, Cell$Left.Main.Size.Small, ref$LongRef.element, null, null, aVar5, 196664, 24), null, aVar5, 2);
                    us2.b b2 = xga0.b(786868487, aVar5);
                    int m = b2.m(bkt0.c(new klv0(VkTypographyToken.Text, VkColorToken.TextSubhead), aVar5));
                    try {
                        b2.g((String) ref$ObjectRef2.element);
                        s3q0 s3q0Var = s3q0.a;
                        b2.k(m);
                        us2 n = b2.n();
                        aVar5.j();
                        Object x3 = aVar5.x();
                        if (x3 == c0012a) {
                            x3 = new n1g0(i2);
                            aVar5.R(x3);
                        }
                        wiu0.b(f, false, a2, Cell$Middle.a.a(Cell$Middle.d.b.b(n, null, null, null, 0, 0, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), null, null, aVar5, 0, 6, 958), null, null, null, aVar5, 196608, 30), null, null, null, aVar5, 6, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } catch (Throwable th) {
                        b2.k(m);
                        throw th;
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                j8o0.a((BottomBarViewState) obj5, (izs) obj3, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                jiv0.a((String) obj5, (bkg0) obj4, (tlh0) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
        }
    }

    public /* synthetic */ ar0(int i, int i2, Object obj, izs izsVar, q630 q630Var) {
        this.b = i2;
        this.c = obj;
        this.e = izsVar;
        this.d = q630Var;
    }

    public /* synthetic */ ar0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
