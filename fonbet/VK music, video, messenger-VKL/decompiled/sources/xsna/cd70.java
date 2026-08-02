package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random;
import xsna.cri;
import xsna.dt1;
import xsna.i870;
import xsna.kb70;
import xsna.q630;
import xsna.tlo0;

/* compiled from: NotificationLoading.kt */
/* loaded from: classes4.dex */
public final class cd70 {

    /* compiled from: NotificationLoading.kt */
    @b6l(c = "com.vk.notifications.list.impl.presentation.base.view.common.NotificationLoadingKt$NotificationLoading$1$1", f = "NotificationLoading.kt", l = {28}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $firstFrameRendered$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wh50<Boolean> wh50Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$firstFrameRendered$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$firstFrameRendered$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003b -> B:5:0x003e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (!this.$firstFrameRendered$delegate.getValue().booleanValue()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                this.$firstFrameRendered$delegate.setValue(Boolean.TRUE);
                if (!this.$firstFrameRendered$delegate.getValue().booleanValue()) {
                    h2w h2wVar = new h2w(16);
                    this.label = 1;
                    if (i830.a(getContext()).k(h2wVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    this.$firstFrameRendered$delegate.setValue(Boolean.TRUE);
                    if (!this.$firstFrameRendered$delegate.getValue().booleanValue()) {
                        return s3q0.a;
                    }
                }
            }
        }
    }

    /* compiled from: NotificationLoading.kt */
    @b6l(c = "com.vk.notifications.list.impl.presentation.base.view.common.NotificationLoadingKt$NotificationLoading$2$5$1", f = "NotificationLoading.kt", l = {49}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ List $warmUpContent;
        final /* synthetic */ xvy $warmUpListState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xvy xvyVar, List list, spj spjVar) {
            super(2, spjVar);
            this.$warmUpListState = xvyVar;
            this.$warmUpContent = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$warmUpListState, this.$warmUpContent, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                xvy xvyVar = this.$warmUpListState;
                int h = e43.h(new wow(this.$warmUpContent));
                this.label = 1;
                fh9 fh9Var = xvy.y;
                if (xvyVar.f(h, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        Object obj;
        Throwable th;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-767763509);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-767763509, i, -1, "com.vk.notifications.list.impl.presentation.base.view.common.NotificationLoading (NotificationLoading.kt:22)");
            }
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (x == obj2) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            s3q0 s3q0Var = s3q0.a;
            Object x2 = M.x();
            if (x2 == obj2) {
                x2 = new a(wh50Var, null);
                M.R(x2);
            }
            bap.g(s3q0Var, (wzs) x2, M, 6);
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (((Boolean) wh50Var.getValue()).booleanValue()) {
                M.K(2076265777);
                xvy a2 = zvy.a(0, 3, M);
                Object x3 = M.x();
                if (x3 == obj2) {
                    List<w770> list = lk70.b;
                    ListBuilder e = e43.e();
                    for (int i3 = 0; i3 < 30; i3++) {
                        String valueOf = String.valueOf(i3);
                        int currentTimeMillis = ((int) (System.currentTimeMillis() / 1000)) + i3;
                        Random.Default r5 = Random.b;
                        w770 w770Var = (w770) j5g.w0(list, r5);
                        s8u0 s8u0Var = new s8u0(0);
                        int i4 = s8u0Var.i(new klv0(VkTypographyToken.SubheadMedium, VkColorToken.TextPrimary));
                        try {
                            String str = "Notification Title " + i3;
                            gg ggVar = Random.c;
                            if (!ggVar.d()) {
                                str = null;
                            }
                            if (str == null) {
                                str = "";
                            }
                            s8u0Var.e(str);
                            s3q0 s3q0Var2 = s3q0.a;
                            s8u0Var.f(i4);
                            s8u0 s8u0Var2 = new s8u0(0);
                            s8u0Var2.e("Notification Subtitle " + i3);
                            e.addAll(Collections.singletonList(new kb70.d(valueOf, currentTimeMillis, (snv) null, (String) null, w770Var, s8u0Var, ggVar.d() ? s8u0Var2 : null, lk70.d, (String) null, (com.vk.notifications.core.item.a) j5g.w0(lk70.c, r5), (i870.a) null, 3336)));
                        } catch (Throwable th2) {
                            s8u0Var.f(i4);
                            throw th2;
                        }
                    }
                    i2 = 1;
                    e.addAll(e43.l(new kb70.a("123"), new kb70.e(oq.d(tlo0.Companion, "Notification Title")), new kb70.c(new tlo0.h("Notification Title"), new tlo0.h("Notification Subtitle"), (w770) j5g.w0(list, Random.b), Integer.MAX_VALUE)));
                    x3 = new wow(e43.r(e.g()));
                    M.R(x3);
                } else {
                    i2 = 1;
                }
                List<T> list2 = ((wow) x3).b;
                Object x4 = M.x();
                if (x4 == obj2) {
                    x4 = new e750(i2);
                    M.R(x4);
                }
                izs izsVar = (izs) x4;
                Object x5 = M.x();
                if (x5 == obj2) {
                    x5 = new tcu(15);
                    M.R(x5);
                }
                izs izsVar2 = (izs) x5;
                Object x6 = M.x();
                if (x6 == obj2) {
                    x6 = new ehu(18);
                    M.R(x6);
                }
                izs izsVar3 = (izs) x6;
                Object x7 = M.x();
                if (x7 == obj2) {
                    x7 = new z34(25);
                    M.R(x7);
                }
                obj = obj2;
                th = null;
                ub70.c(list2, izsVar, izsVar2, izsVar3, (gzs) x7, aVar2, false, a2, null, null, M, 224694, 832);
                s3q0 s3q0Var3 = s3q0.a;
                boolean J = M.J(a2);
                Object x8 = M.x();
                if (J || x8 == obj) {
                    x8 = new b(a2, list2, null);
                    M.R(x8);
                }
                bap.g(s3q0Var3, (wzs) x8, M, 6);
            } else {
                obj = obj2;
                th = null;
                M.K(2075039293);
            }
            M.j();
            q630 d3 = txj0.d(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d3, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            Object x9 = M.x();
            if (x9 == obj) {
                x9 = ir.h(M);
            }
            sg50 sg50Var = (sg50) x9;
            Object x10 = M.x();
            if (x10 == obj) {
                x10 = new n1(29);
                M.R(x10);
            }
            q630 b2 = ojc.b(m, sg50Var, null, false, null, (gzs) x10, 28);
            dt1.a.getClass();
            cp10 d4 = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, b2);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw th;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d4, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            cc70.a(0, M);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ldi(i);
        }
    }
}
