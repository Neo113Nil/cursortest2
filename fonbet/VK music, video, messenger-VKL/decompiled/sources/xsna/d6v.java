package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.d6v.a;
import xsna.q630;

/* compiled from: ShowOnMainSwitch.kt */
/* loaded from: classes17.dex */
public final class d6v implements Cell$Middle.d {
    public final String a;
    public final boolean b;
    public final izs<Float, s3q0> c;
    public final gzs<s3q0> d;

    /* compiled from: ShowOnMainSwitch.kt */
    @b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.main.HighlightedTitle$Content$1$1$1", f = "ShowOnMainSwitch.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return d6v.this.new a(spjVar);
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
            d6v.this.d.invoke();
            return s3q0.a;
        }
    }

    public d6v(String str, gzs gzsVar, izs izsVar, boolean z) {
        this.a = str;
        this.b = z;
        this.c = izsVar;
        this.d = gzsVar;
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Middle.d, com.vk.core.compose.component.cell.content.Cell$Middle.c, com.vk.core.compose.component.cell.content.Cell$Middle.b
    public final void c(q630 q630Var, final Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-602774051);
        if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i2 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(size.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-602774051, i2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.main.HighlightedTitle.Content (ShowOnMainSwitch.kt:74)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                String str = this.a;
                x = new v5v(str, new Pair(0, Integer.valueOf(str.length())));
                M.R(x);
            }
            final v5v v5vVar = (v5v) x;
            d8v0.a(v5vVar.b, q630Var2, VkOnboarding$HighlighterMarkerType.Type3, VkOnboarding$TintColor.Lime, false, false, this.b, this.c, kai.c(-709864807, new zzs() { // from class: xsna.x5v
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i3;
                    izs izsVar = (izs) obj;
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        i3 = (aVar2.y(izsVar) ? 4 : 2) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i3 |= aVar2.l(booleanValue) ? 32 : 16;
                    }
                    int i4 = i3;
                    if (aVar2.t(i4 & 1, (i4 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-709864807, i4, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.main.HighlightedTitle.Content.<anonymous> (ShowOnMainSwitch.kt:84)");
                        }
                        s3q0 s3q0Var = s3q0.a;
                        d6v d6vVar = d6v.this;
                        boolean J = aVar2.J(d6vVar);
                        Object x2 = aVar2.x();
                        if (J || x2 == a.C0011a.a) {
                            x2 = d6vVar.new a(null);
                            aVar2.R(x2);
                        }
                        bap.g(s3q0Var, (wzs) x2, aVar2, 6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        iyk0 iyk0Var = rrv0.a;
                        ylu0 ylu0Var = (ylu0) aVar2.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        boolean s = true ^ ylu0Var.s();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar2.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var2.getText().o;
                        bpn0 bpn0Var = v5v.c;
                        Cell$Middle.d.b.b(d8v0.c(v5vVar, booleanValue, s, j, aVar2, i4 & 112), null, null, null, 0, 2, null, null, izsVar, aVar2, ((i4 << 27) & 1879048192) | 196608, 6, 478).c(q630.a.a, size, aVar2, 6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 << 3) & 112) | 805309824, Sdk.SDKError.Reason.AD_EXPIRED_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b6v(this, q630Var, size, i, 0);
        }
    }
}
