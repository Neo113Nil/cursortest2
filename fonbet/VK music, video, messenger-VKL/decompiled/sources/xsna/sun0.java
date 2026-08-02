package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.BlendModeCompat;
import com.vk.tabbar.settings.impl.mvi.InteractSource;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;

/* compiled from: TabbarSettingsBottomIcon.kt */
/* loaded from: classes6.dex */
public final class sun0 {

    /* compiled from: TabbarSettingsBottomIcon.kt */
    @b6l(c = "com.vk.tabbar.settings.impl.compose.TabbarSettingsBottomIconKt$BottomTabbarItem$1$1", f = "TabbarSettingsBottomIcon.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ yvj $coroutineScope;
        final /* synthetic */ InteractSource $interactSource;
        final /* synthetic */ uun0 $item;
        final /* synthetic */ if2<Float, sq2> $scale;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yvj yvjVar, if2<Float, sq2> if2Var, InteractSource interactSource, uun0 uun0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$coroutineScope = yvjVar;
            this.$scale = if2Var;
            this.$interactSource = interactSource;
            this.$item = uun0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$coroutineScope, this.$scale, this.$interactSource, this.$item, spjVar);
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
            myc0.h(this.$coroutineScope, null, null, new tun0(this.$interactSource, this.$item.e, this.$scale, null), 3);
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(uun0 uun0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        long j;
        androidx.compose.runtime.a M = aVar.M(-416309219);
        if ((i & 6) == 0) {
            i2 = (M.J(uun0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-416309219, i2, -1, "com.vk.tabbar.settings.impl.compose.BottomIcon (TabbarSettingsBottomIcon.kt:100)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            final wh50 wh50Var = (wh50) x;
            boolean z = uun0Var.d;
            String str = uun0Var.f;
            aqv aqvVar = uun0Var.a;
            if (!z) {
                M.K(-641193041);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = l5g.c(14, ylu0Var.getIcon().l, 0.4f);
                M.j();
            } else if (uun0Var.e) {
                M.K(-641190935);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getIcon().c;
                M.j();
            } else {
                M.K(-641189369);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var3.getIcon().f;
                M.j();
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            M.W(-641185932, uun0Var.b);
            if (str != null) {
                M.K(1598087904);
                w800<i700> j2 = q700.j(context, str);
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new r800() { // from class: xsna.qun0
                        @Override // xsna.r800
                        public final void onResult(Object obj) {
                            wh50.this.setValue((i700) obj);
                        }
                    };
                    M.R(x2);
                }
                j2.b((r800) x2);
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new r800() { // from class: xsna.run0
                        @Override // xsna.r800
                        public final void onResult(Object obj) {
                            wh50.this.setValue(null);
                        }
                    };
                    M.R(x3);
                }
                j2.a((r800) x3);
                M.j();
            } else {
                M.K(1598315785);
                M.j();
                wh50Var.setValue(null);
            }
            T value = wh50Var.getValue();
            q630.a aVar2 = q630.a.a;
            if (value != 0) {
                M.K(1598454107);
                q630 q = txj0.q(aVar2, 28);
                float f = uun0Var.g;
                i700 i700Var = (i700) wh50Var.getValue();
                int i4 = l5g.l;
                i3 = 2;
                z600.b(i700Var, q, false, false, null, f, 0, false, false, false, false, null, false, false, new l800(Collections.singletonList(new n800(t800.I, new udy("**"), pe7.a(Long.hashCode(j), BlendModeCompat.SRC_ATOP)))), null, null, false, false, null, false, null, M, 3120, 32768, 0, 4177876);
                M = M;
                M.j();
            } else {
                i3 = 2;
                String str2 = aqvVar.b;
                Integer num = aqvVar.a;
                if (str2 != null) {
                    M.K(1598856239);
                    nvn0.o.getClass();
                    float f2 = nvn0.t;
                    ldu0.b(phw.a.a(fwu0.l(null, aqvVar.b, null, null, M, 0, 61), null, null, null, null, M, 196616, 30), f2, txj0.q(aVar2, f2), null, null, false, null, null, null, M, Tensorflow.FRAME_WIDTH, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                    M = M;
                    M.j();
                } else {
                    if (num != null) {
                        M.K(1599270461);
                        pzu0.b(pg90.a(num.intValue(), 0, M), null, txj0.q(aVar2, 28), j, M, 440, 0);
                    } else {
                        M.K(1593330117);
                    }
                    M.j();
                }
            }
            M.a0();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i3 = 2;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fi1(uun0Var, i, i3);
        }
    }

    public static final void b(InteractSource interactSource, boolean z, uun0 uun0Var, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        final uun0 uun0Var2;
        float f;
        Object obj;
        if2 if2Var;
        Throwable th;
        float f2;
        Object f3;
        String str = uun0Var.b;
        final boolean z2 = uun0Var.e;
        androidx.compose.runtime.a M = aVar.M(2100007540);
        int i2 = i | (M.o(interactSource.ordinal()) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.J(uun0Var) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2100007540, i2, -1, "com.vk.tabbar.settings.impl.compose.BottomTabbarItem (TabbarSettingsBottomIcon.kt:61)");
            }
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (x == obj2) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            Object x2 = M.x();
            if (x2 == obj2) {
                f = 1.0f;
                x2 = new if2(Float.valueOf(1.0f), rte0.e, null, 12);
                M.R(x2);
            } else {
                f = 1.0f;
            }
            if2 if2Var2 = (if2) x2;
            Boolean valueOf = Boolean.valueOf(z2);
            int i3 = i2 & 896;
            boolean y = ((i2 & 14) == 4) | M.y(yvjVar) | M.y(if2Var2) | (i3 == 256);
            Object x3 = M.x();
            if (y || x3 == obj2) {
                obj = obj2;
                if2Var = if2Var2;
                th = null;
                f2 = f;
                uun0Var2 = uun0Var;
                Object aVar2 = new a(yvjVar, if2Var, interactSource, uun0Var2, null);
                M.R(aVar2);
                x3 = aVar2;
            } else {
                obj = obj2;
                if2Var = if2Var2;
                th = null;
                f2 = f;
                uun0Var2 = uun0Var;
            }
            bap.f(str, valueOf, (wzs) x3, M, 0);
            gzo0 gzo0Var = uun0Var2.h;
            Object obj3 = gzo0Var.b;
            if (obj3 == null) {
                M.K(-527364803);
                Integer num = gzo0Var.a;
                if (num == null) {
                    M.K(831534035);
                    M.j();
                    f3 = th;
                } else {
                    f3 = l4.f(M, 831534036, num, M, 0);
                }
                if (f3 == null) {
                    f3 = "";
                }
                obj3 = f3;
            } else {
                M.K(-527366849);
            }
            M.j();
            Object N = d370.N(R.string.tabbar_settings_accessibility_selected, 0, M);
            boolean y2 = M.y(if2Var);
            Object x4 = M.x();
            if (y2 || x4 == obj) {
                x4 = new i5j0(if2Var, 1);
                M.R(x4);
            }
            q630 d = rte0.d(rdu.a(q630.a.a, (izs) x4), vog0.a);
            float f4 = 40;
            float f5 = 48;
            q630 a2 = qri.a(sua.d(f2, txj0.t(d, f4, f4, f5, f5), false), a5x.a, new yzs() { // from class: xsna.oun0
                @Override // xsna.yzs
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    q630 q630Var = (q630) obj4;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj5;
                    int intValue = ((Integer) obj6).intValue();
                    aVar3.K(-448215332);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-448215332, intValue, -1, "com.vk.tabbar.settings.impl.compose.backgroundForBottomItem.<anonymous> (TabbarSettingsBottomContent.kt:120)");
                    }
                    if (z2) {
                        aVar3.K(-1238203265);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var = hr80.m(q630Var, ylu0Var.getBackground().b, vog0.a);
                        aVar3.j();
                    } else {
                        uun0 uun0Var3 = uun0Var2;
                        if (uun0Var3.c) {
                            aVar3.K(-1238200169);
                            float f6 = 1;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var = q630Var.g(bu00.e(q630.a.a, new jtk(vog0.a, f6, 6, 4, f6, new rek0(ylu0Var2.p().c))));
                            aVar3.j();
                        } else if (uun0Var3.d) {
                            aVar3.K(-1238192382);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var3 = (ylu0) aVar3.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var = hr80.m(q630Var, ylu0Var3.getBackground().x, vog0.a);
                            aVar3.j();
                        } else {
                            aVar3.K(-1238189664);
                            aVar3.j();
                        }
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar3.j();
                    return q630Var;
                }
            });
            boolean J = (i3 == 256) | M.J(obj3) | M.J(N);
            Object x5 = M.x();
            if (J || x5 == obj) {
                x5 = new zo8(uun0Var2, obj3, N, 10);
                M.R(x5);
            }
            q630 E = ahn.E(egi0.b(a2, false, (izs) x5), "TabbarItem_" + str);
            boolean z3 = z && uun0Var2.d && !z2;
            Object x6 = M.x();
            if (x6 == obj) {
                x6 = ir.h(M);
            }
            sg50 sg50Var = (sg50) x6;
            boolean z4 = (i2 & 7168) == 2048;
            Object x7 = M.x();
            if (z4 || x7 == obj) {
                x7 = new upb0(2, gzsVar);
                M.R(x7);
            }
            q630 b = ojc.b(E, sg50Var, null, z3, null, (gzs) x7, 24);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw th;
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
            a(uun0Var2, M, (i2 >> 6) & 14);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            uun0Var2 = uun0Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new d3c(interactSource, z, uun0Var2, gzsVar, i);
        }
    }
}
