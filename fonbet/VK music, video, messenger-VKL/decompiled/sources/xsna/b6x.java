package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b5x;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: InspectorReportView.kt */
/* loaded from: classes17.dex */
public final class b6x extends rpo0 {
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;

    /* compiled from: InspectorReportView.kt */
    @b6l(c = "com.vk.core.tool.view.InspectorReportView$ThemedContent$1$1", f = "InspectorReportView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ wh50<uao0> $styleDescription$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, wh50<uao0> wh50Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$context = context;
            this.$styleDescription$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return b6x.this.new a(this.$context, this.$styleDescription$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (b6x.this.getInspectorParams() == null || b6x.this.getStyle() == null) {
                this.$styleDescription$delegate.setValue(null);
                return s3q0.a;
            }
            this.$styleDescription$delegate.setValue(b6x.this.getStyle().a(b6x.this.getInspectorParams(), this.$context));
            return s3q0.a;
        }
    }

    public b6x(Context context) {
        super(context, null, 0);
        this.m = androidx.compose.runtime.k.b(null);
        this.n = androidx.compose.runtime.k.b(null);
        this.o = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        List<String> list;
        androidx.compose.runtime.a M = aVar.M(1029535890);
        int i2 = (M.y(this) ? 4 : 2) | i;
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1029535890, i2, -1, "com.vk.core.tool.view.InspectorReportView.ThemedContent (InspectorReportView.kt:44)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            final wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                b5x.c inspectorParams = getInspectorParams();
                x2 = Boolean.valueOf((inspectorParams == null || (list = inspectorParams.g) == null || !list.contains("LegoThemeAdopted")) ? false : true);
                M.R(x2);
            }
            final boolean booleanValue = ((Boolean) x2).booleanValue();
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            b5x.c inspectorParams2 = getInspectorParams();
            xsm0 style = getStyle();
            if ((i2 & 14) != 4 && !M.y(this)) {
                z = false;
            }
            boolean y = M.y(context) | z;
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new a(context, wh50Var, null);
                M.R(x3);
            }
            bap.f(inspectorParams2, style, (wzs) x3, M, 0);
            rrv0.d(null, null, null, null, kai.c(-2092389641, new wzs() { // from class: xsna.a6x
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    Object failure;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2092389641, intValue, -1, "com.vk.core.tool.view.InspectorReportView.ThemedContent.<anonymous> (InspectorReportView.kt:61)");
                        }
                        q630.a aVar3 = q630.a.a;
                        q630 f = txj0.f(aVar3, 1.0f);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630 D = s200.D(hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), kqu0.v);
                        dt1.a.getClass();
                        cp10 d = ja8.d(dt1.a.b, false);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D2 = aVar2.D();
                        q630 c = qri.c(aVar2, D);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar4);
                        } else {
                            aVar2.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar2, d, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar2, D2, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar2, valueOf, bVar);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(aVar2, c2678a);
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(aVar2, c, dVar);
                        q630 f2 = txj0.f(aVar3, 1.0f);
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar2, 0);
                        int hashCode2 = Long.hashCode(n34.n(aVar2));
                        sy90 D3 = aVar2.D();
                        q630 c2 = qri.c(aVar2, f2);
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar4);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, a2, cVar);
                        k9q0.w(aVar2, D3, eVar);
                        ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
                        k9q0.w(aVar2, c2, dVar);
                        muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("View Report", null, null, null, null, aVar2, 196614, 30), null, null, null, aVar2, 14), null, null, null, null, null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 8190);
                        androidx.compose.runtime.a aVar5 = aVar2;
                        b5x.c inspectorParams3 = b6x.this.getInspectorParams();
                        if (inspectorParams3 == null) {
                            aVar5.K(-1270773564);
                        } else {
                            aVar5.K(-1270773563);
                            String str = inspectorParams3.a;
                            if (str == null) {
                                aVar5.K(1561109427);
                            } else {
                                aVar5.K(1561109428);
                                wiu0.b(null, false, null, Cell$Middle.a.a(Cell$Middle.d.b.a("Class", null, null, 0, null, null, aVar5, 12582918, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), Cell$Middle.c.b.b(str, 0, null, null, null, aVar5, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar5, 196608, 28), null, null, null, aVar5, 0, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                                aVar5 = aVar5;
                                s3q0 s3q0Var = s3q0.a;
                            }
                            aVar5.j();
                            aVar5.K(1561485550);
                            aVar5.j();
                            Integer num = inspectorParams3.c;
                            if (num == null) {
                                aVar5.K(1561878723);
                            } else {
                                aVar5.K(1561878724);
                                int intValue2 = num.intValue();
                                aVar5.K(1574404962);
                                try {
                                    failure = ((Context) aVar5.r(AndroidCompositionLocals_androidKt.b)).getResources().getResourceName(intValue2);
                                } catch (Throwable th) {
                                    failure = new Result.Failure(th);
                                }
                                aVar5.j();
                                androidx.compose.runtime.a aVar6 = aVar5;
                                com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a("Defined in", null, null, 0, null, null, aVar6, 12582918, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                                String str2 = (String) (failure instanceof Result.Failure ? null : failure);
                                if (str2 == null) {
                                    str2 = lhg.a(intValue2, "Unknown layout id: ");
                                }
                                wiu0.b(null, false, null, Cell$Middle.a.a(a3, Cell$Middle.c.b.b(str2, 0, null, null, null, aVar6, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar6, 196608, 28), null, null, null, aVar6, 0, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                                aVar5 = aVar6;
                                s3q0 s3q0Var2 = s3q0.a;
                            }
                            aVar5.j();
                            String str3 = inspectorParams3.d;
                            if (str3 == null) {
                                aVar5.K(1562546153);
                            } else {
                                aVar5.K(1562546154);
                                androidx.compose.runtime.a aVar7 = aVar5;
                                wiu0.b(null, false, null, Cell$Middle.a.a(Cell$Middle.d.b.a("Defined in file", null, null, 0, null, null, aVar7, 12582918, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), Cell$Middle.c.b.b(str3, 0, null, null, null, aVar7, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar7, 196608, 28), null, null, null, aVar7, 0, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                                aVar5 = aVar7;
                                s3q0 s3q0Var3 = s3q0.a;
                            }
                            aVar5.j();
                            aVar5.K(1562928910);
                            aVar5.j();
                            uao0 uao0Var = (uao0) wh50Var.getValue();
                            if (uao0Var == null) {
                                aVar5.K(1563305436);
                            } else {
                                aVar5.K(1563305437);
                                androidx.compose.runtime.a aVar8 = aVar5;
                                com.vk.core.compose.component.cell.content.h1 a4 = Cell$Middle.d.b.a(uao0Var.a, null, null, 0, null, null, aVar8, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                                String str4 = uao0Var.b;
                                if (str4 == null) {
                                    str4 = DeviceInfo.STR_TYPE_UNKNOWN;
                                }
                                wiu0.b(null, false, null, Cell$Middle.a.a(a4, Cell$Middle.c.b.b(str4, 0, null, null, null, aVar8, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar8, 196608, 28), null, null, null, aVar8, 0, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                                aVar5 = aVar8;
                                s3q0 s3q0Var4 = s3q0.a;
                            }
                            aVar5.j();
                            androidx.compose.runtime.a aVar9 = aVar5;
                            wiu0.b(null, false, null, Cell$Middle.a.a(Cell$Middle.d.b.a("Lego Adopted", null, null, 0, null, null, aVar9, 12582918, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), Cell$Middle.c.b.b(booleanValue ? "yes" : "no", 0, null, null, null, aVar9, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar9, 196608, 28), null, null, null, aVar9, 0, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                            aVar5 = aVar9;
                            aVar5.K(1564012019);
                            aVar5.j();
                            List<String> list2 = inspectorParams3.g;
                            if (list2 == null) {
                                aVar5.K(1564385786);
                            } else {
                                aVar5.K(1564385787);
                                wiu0.b(null, false, null, Cell$Middle.a.a(Cell$Middle.d.b.a("Annotations", null, null, 0, null, null, aVar5, 12582918, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), Cell$Middle.c.b.b(j5g.g0(list2, "\n", null, null, 0, null, 62), 0, null, null, null, aVar5, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar5, 196608, 28), null, null, null, aVar5, 0, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                                aVar5 = aVar5;
                                s3q0 s3q0Var5 = s3q0.a;
                            }
                            aVar5.j();
                            s3q0 s3q0Var6 = s3q0.a;
                        }
                        aVar5.j();
                        if (kr.f(aVar5)) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w69(this, i, 9);
        }
    }

    public final b5x.c getInspectorParams() {
        return (b5x.c) ((zak0) this.n).getValue();
    }

    public final gzs<s3q0> getOnClickClose() {
        return (gzs) ((zak0) this.o).getValue();
    }

    public final xsm0 getStyle() {
        return (xsm0) ((zak0) this.m).getValue();
    }

    public final void setInspectorParams(b5x.c cVar) {
        ((zak0) this.n).setValue(cVar);
    }

    public final void setOnClickClose(gzs<s3q0> gzsVar) {
        ((zak0) this.o).setValue(gzsVar);
    }

    public final void setStyle(xsm0 xsm0Var) {
        ((zak0) this.m).setValue(xsm0Var);
    }
}
