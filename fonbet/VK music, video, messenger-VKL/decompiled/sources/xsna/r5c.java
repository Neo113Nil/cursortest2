package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.form.FormField$Style;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.feature.state.InputField;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.f8s;
import xsna.g8s;
import xsna.h8s;
import xsna.q630;
import xsna.s2x;
import xsna.t2x;
import xsna.u1x;

/* compiled from: CheckoutInputField.kt */
/* loaded from: classes18.dex */
public final class r5c {

    /* compiled from: CheckoutInputField.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputField.InputType.values().length];
            try {
                iArr[InputField.InputType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputField.InputType.TEXTAREA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputField.InputType.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InputField.InputType.PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InputField.InputType.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CheckoutInputField.kt */
    @b6l(c = "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutInputFieldKt$resolveContent$1$1", f = "CheckoutInputField.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ u1x $item;
        final /* synthetic */ wh50<tho0> $textValue$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u1x u1xVar, wh50<tho0> wh50Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$item = u1xVar;
            this.$textValue$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$item, this.$textValue$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (!epx.f(this.$item.g, this.$textValue$delegate.getValue().a.c)) {
                wh50<tho0> wh50Var = this.$textValue$delegate;
                String str = this.$item.g;
                if (str == null) {
                    str = "";
                }
                wh50Var.setValue(new tho0(str, 0L, 6));
            }
            return s3q0.a;
        }
    }

    public static final void a(l5c l5cVar, u1x u1xVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 g;
        FieldKey fieldKey = u1xVar.b;
        androidx.compose.runtime.a M = aVar.M(-917688053);
        if ((i & 6) == 0) {
            i2 = (M.J(l5cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(u1xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-917688053, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutInputField (CheckoutInputField.kt:38)");
            }
            int i3 = i2 >> 3;
            int i4 = i3 & 14;
            g8s c = c(u1xVar, izsVar, M, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            String concat = "checkout_input_field_".concat(fieldKey.e);
            q630.a aVar2 = q630.a.a;
            q630 g2 = ahn.E(aVar2, concat).g(q630Var);
            rwr rwrVar = (rwr) ((Map) ((zak0) l5cVar.a).getValue()).get(fieldKey);
            nvu0.a(c, (rwrVar == null || (g = g2.g(jvi.d(aVar2, rwrVar))) == null) ? g2 : g, e(u1xVar, M, i4), null, b(u1xVar.f, M), M, 0, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tr1(l5cVar, u1xVar, izsVar, q630Var, i);
        }
    }

    public static final vr9 b(u1x.b bVar, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1066972457, 0, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.resolveCaption (CheckoutInputField.kt:184)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new sc(7);
            aVar.R(x);
        }
        vr9 vr9Var = null;
        com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
        if (bVar instanceof u1x.b.C3782b) {
            aVar.K(876765871);
            aVar.j();
        } else if (bVar instanceof u1x.b.a) {
            aVar.K(876841821);
            vr9Var = f8s.a.a(((u1x.b.a) bVar).a, FormField$Style.Error, a2, aVar, 3120, 0);
            aVar.j();
        } else {
            if (!(bVar instanceof u1x.b.c)) {
                throw alb0.c(1136660164, aVar);
            }
            aVar.K(877088829);
            vr9Var = f8s.a.a(((u1x.b.c) bVar).a, FormField$Style.Valid, a2, aVar, 3120, 0);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return vr9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final g8s c(u1x u1xVar, izs<? super r2c, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        InputSelect$State inputSelect$State;
        g8s a2;
        int i2;
        sg50 sg50Var;
        String str;
        String str2;
        sg50 sg50Var2;
        hkg0 hkg0Var;
        InputSelect$State inputSelect$State2;
        long j;
        u1x.b bVar = u1xVar.f;
        u1x.a aVar2 = u1xVar.j;
        String str3 = u1xVar.g;
        InputField.InputType inputType = u1xVar.k;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-180025064, i, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.resolveContent (CheckoutInputField.kt:56)");
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            String str4 = str3 == null ? "" : str3;
            if (str3 != null) {
                int length = str3.length();
                j = jgz.c(length, length);
            } else {
                j = qko0.b;
            }
            x = or.a(str4, j, 4, aVar);
        }
        wh50 wh50Var = (wh50) x;
        int i3 = (i & 112) ^ 48;
        int i4 = (i & 14) ^ 6;
        boolean z = ((i4 > 4 && aVar.J(u1xVar)) || (i & 6) == 4) | ((i3 > 32 && aVar.J(izsVar)) || (i & 48) == 32);
        Object x2 = aVar.x();
        if (z || x2 == c0012a) {
            x2 = new eo3(izsVar, u1xVar, wh50Var, 1);
            aVar.R(x2);
        }
        izs izsVar2 = (izs) x2;
        Object x3 = aVar.x();
        if (x3 == c0012a) {
            x3 = new wr0(7);
            aVar.R(x3);
        }
        com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3);
        boolean z2 = (i4 > 4 && aVar.J(u1xVar)) || (i & 6) == 4;
        Object x4 = aVar.x();
        if (z2 || x4 == c0012a) {
            x4 = new b(u1xVar, wh50Var, null);
            aVar.R(x4);
        }
        bap.g(str3, (wzs) x4, aVar, 0);
        if (u1xVar.i) {
            aVar.K(1288633489);
            Object x5 = aVar.x();
            if (x5 == c0012a) {
                x5 = ir.h(aVar);
            }
            sg50 sg50Var3 = (sg50) x5;
            wh50 j2 = sa30.j(sg50Var3, aVar, 6);
            tho0 tho0Var = (tho0) wh50Var.getValue();
            String str5 = u1xVar.h;
            boolean o = aVar.o(inputType == null ? -1 : inputType.ordinal());
            Object x6 = aVar.x();
            if (o || x6 == c0012a) {
                int d = d(inputType);
                if (aVar2 instanceof u1x.a.C3781a) {
                    i2 = 7;
                } else {
                    if (!(aVar2 instanceof u1x.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 6;
                }
                sg50Var = sg50Var3;
                x6 = new rgy(d, i2, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
                aVar.R(x6);
            } else {
                sg50Var = sg50Var3;
            }
            rgy rgyVar = (rgy) x6;
            boolean z3 = ((i3 > 32 && aVar.J(izsVar)) || (i & 48) == 32) | ((i4 > 4 && aVar.J(u1xVar)) || (i & 6) == 4);
            Object x7 = aVar.x();
            if (z3 || x7 == c0012a) {
                x7 = new ea3(izsVar, u1xVar, wh50Var, 3);
                aVar.R(x7);
            }
            izs izsVar3 = (izs) x7;
            boolean z4 = ((i3 > 32 && aVar.J(izsVar)) || (i & 48) == 32) | ((i4 > 4 && aVar.J(u1xVar)) || (i & 6) == 4);
            Object x8 = aVar.x();
            if (z4 || x8 == c0012a) {
                x8 = new nk0(6, izsVar, u1xVar);
                aVar.R(x8);
            }
            uey ueyVar = new uey(izsVar3, (izs) x8, null, 58);
            String str6 = ((tho0) wh50Var.getValue()).a.c;
            boolean booleanValue = ((Boolean) j2.getValue()).booleanValue();
            int i5 = i << 6;
            int i6 = i5 & 8064;
            if (androidx.compose.runtime.b.d()) {
                str = str6;
                androidx.compose.runtime.b.f(51782394, i6, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.resolveInputRight (CheckoutInputField.kt:153)");
            } else {
                str = str6;
            }
            if (str.length() <= 0 || !(booleanValue || (aVar2 instanceof u1x.a.C3781a))) {
                str2 = str5;
                sg50Var2 = sg50Var;
                hkg0Var = null;
                aVar.K(756819484);
                aVar.j();
            } else {
                aVar.K(756300947);
                qzu0.a.getClass();
                lg90 x9 = qzu0.x(aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j3 = ylu0Var.getIcon().l;
                Object x10 = aVar.x();
                if (x10 == c0012a) {
                    x10 = new od3(6);
                    aVar.R(x10);
                }
                com.vk.core.compose.component.semantics.a a4 = com.vk.core.compose.component.semantics.b.a(null, (izs) x10, 3);
                boolean z5 = ((((i5 & 7168) ^ 3072) > 2048 && aVar.J(izsVar)) || (i5 & 3072) == 2048) | ((((i5 & 896) ^ 384) > 256 && aVar.J(u1xVar)) || (i5 & 384) == 256);
                Object x11 = aVar.x();
                if (z5 || x11 == c0012a) {
                    x11 = new rs0(4, (Object) u1xVar, (izs) izsVar);
                    aVar.R(x11);
                }
                sg50Var2 = sg50Var;
                str2 = str5;
                hkg0 a5 = t2x.b.a.a(x9, null, (gzs) x11, j3, a4, aVar, 196616, 2);
                aVar.j();
                hkg0Var = a5;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            b2x b2 = s2x.a.C3649a.b(tho0Var, izsVar2, str2, 0L, 0L, rgyVar, ueyVar, sg50Var2, null, hkg0Var, false, null, aVar, 0, 196614, 27256);
            if (bVar instanceof u1x.b.C3782b) {
                inputSelect$State2 = InputSelect$State.Default;
            } else if (bVar instanceof u1x.b.a) {
                inputSelect$State2 = InputSelect$State.Error;
            } else {
                if (!(bVar instanceof u1x.b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                inputSelect$State2 = InputSelect$State.Valid;
            }
            a2 = g8s.b.a.a(b2, inputSelect$State2, false, a3, aVar, 24576, 4);
            aVar.j();
        } else {
            aVar.K(1290309845);
            tho0 tho0Var2 = (tho0) wh50Var.getValue();
            String str7 = u1xVar.h;
            if (bVar instanceof u1x.b.C3782b) {
                inputSelect$State = InputSelect$State.Default;
            } else if (bVar instanceof u1x.b.a) {
                inputSelect$State = InputSelect$State.Error;
            } else {
                if (!(bVar instanceof u1x.b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                inputSelect$State = InputSelect$State.Valid;
            }
            boolean o2 = aVar.o(inputType != null ? inputType.ordinal() : -1);
            Object x12 = aVar.x();
            if (o2 || x12 == c0012a) {
                x12 = new rgy(d(inputType), 0, 123);
                aVar.R(x12);
            }
            a2 = g8s.e.a.a(tho0Var2, izsVar2, str7, inputSelect$State, 2, 8, false, (rgy) x12, null, null, a3, aVar, 221184, 24576, 7872);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a2;
    }

    public static final int d(InputField.InputType inputType) {
        int i = inputType == null ? -1 : a.$EnumSwitchMapping$0[inputType.ordinal()];
        int i2 = 1;
        if (i != 1 && i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    return i != 5 ? 0 : 6;
                }
            }
        }
        return i2;
    }

    public static final hly e(u1x u1xVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(467509285, i, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.resolveLabel (CheckoutInputField.kt:175)");
        }
        String str = u1xVar.e;
        boolean z = u1xVar.d;
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new z13(4);
            aVar.R(x);
        }
        hly a2 = h8s.a.a(str, z, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), aVar, 196608, 12);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a2;
    }
}
