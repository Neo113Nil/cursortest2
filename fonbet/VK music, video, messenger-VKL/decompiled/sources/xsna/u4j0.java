package xsna;

import android.graphics.Bitmap;
import androidx.compose.runtime.a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.q630;
import xsna.wkj;

/* compiled from: ShaderCpuGenerator.kt */
/* loaded from: classes3.dex */
public final class u4j0 {
    public static final void a(final long j, final tm6 tm6Var, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1226531473);
        int i2 = i | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1226531473, i2, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.shaders.ShaderCpuGenerator (ShaderCpuGenerator.kt:32)");
            }
            jai c = kai.c(-1883450117, new yzs() { // from class: xsna.p4j0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    wh50 wh50Var;
                    final va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(va8Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1883450117, intValue, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.shaders.ShaderCpuGenerator.<anonymous> (ShaderCpuGenerator.kt:37)");
                        }
                        Object x = aVar2.x();
                        Object obj4 = a.C0011a.a;
                        if (x == obj4) {
                            x = androidx.compose.runtime.k.b(null);
                            aVar2.R(x);
                        }
                        final wh50 wh50Var2 = (wh50) x;
                        Object x2 = aVar2.x();
                        if (x2 == obj4) {
                            x2 = bap.j(EmptyCoroutineContext.b, aVar2);
                            aVar2.R(x2);
                        }
                        final yvj yvjVar = (yvj) x2;
                        Integer valueOf = Integer.valueOf(o6j.i(va8Var.f()));
                        Integer valueOf2 = Integer.valueOf(o6j.h(va8Var.f()));
                        final long j2 = j;
                        l5g l5gVar = new l5g(j2);
                        boolean y = aVar2.y(yvjVar) | ((intValue & 14) == 4);
                        final tm6 tm6Var2 = tm6Var;
                        boolean y2 = y | aVar2.y(tm6Var2) | aVar2.p(j2);
                        Object x3 = aVar2.x();
                        if (y2 || x3 == obj4) {
                            x3 = new izs() { // from class: xsna.r4j0
                                /* JADX WARN: Type inference failed for: r0v5, types: [T, xsna.yok0] */
                                @Override // xsna.izs
                                public final Object invoke(Object obj5) {
                                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                    va8 va8Var2 = va8.this;
                                    int i3 = o6j.i(va8Var2.f());
                                    wh50 wh50Var3 = wh50Var2;
                                    if (i3 != Integer.MAX_VALUE && o6j.h(va8Var2.f()) != Integer.MAX_VALUE) {
                                        ref$ObjectRef.element = myc0.h(yvjVar, null, null, new s4j0(tm6Var2, va8Var2, j2, wh50Var3, null), 3);
                                    }
                                    return new t4j0(ref$ObjectRef, wh50Var3);
                                }
                            };
                            wh50Var = wh50Var2;
                            aVar2.R(x3);
                        } else {
                            wh50Var = wh50Var2;
                        }
                        bap.a(valueOf, valueOf2, l5gVar, (izs) x3, aVar2, 0);
                        Bitmap bitmap = (Bitmap) wh50Var.getValue();
                        if (bitmap == null) {
                            aVar2.K(-408774317);
                        } else {
                            aVar2.K(-408774316);
                            vjw.b(new aa2(bitmap), txj0.d(q630.a.a, 1.0f), wkj.a.g, aVar2, 25008, 232);
                        }
                        aVar2.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M);
            q630.a aVar2 = q630.a.a;
            ua8.a(aVar2, null, false, c, M, 3078, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, tm6Var, q630Var2, i) { // from class: xsna.q4j0
                public final /* synthetic */ long b;
                public final /* synthetic */ tm6 c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(55);
                    u4j0.a(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
