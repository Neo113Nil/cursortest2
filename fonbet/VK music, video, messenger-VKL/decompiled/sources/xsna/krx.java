package xsna;

import android.content.Context;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.qrx;

/* compiled from: InviteFriendsMviView.kt */
/* loaded from: classes14.dex */
public final class krx extends i6v0<lsx, gqx> {
    public final Object f;
    public final Object g;

    /* compiled from: InviteFriendsMviView.kt */
    @b6l(c = "com.vk.friends.groupinvite.impl.ui.InviteFriendsMviView$InviteFriendsContent$1$1", f = "InviteFriendsMviView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return krx.this.new a(spjVar);
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
            krx krxVar = krx.this;
            ((mzp0) krxVar.f).d(krxVar.c());
            ((yw90) krx.this.g).a();
            return s3q0.a;
        }
    }

    public krx(yqx yqxVar, Context context, Object obj, Object obj2) {
        super(context, yqxVar);
        this.f = obj;
        this.g = obj2;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        l((lsx) ao50Var, izsVar, aVar, 512);
    }

    public final void h(final String str, q630 q630Var, final s890 s890Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        String str2;
        int i2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1361992317);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (M.J(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= M.J(s890Var) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1361992317, i3, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsMviView.Error (InviteFriendsMviView.kt:188)");
            }
            q630.a aVar3 = q630.a.a;
            q630 c = txj0.c(txj0.f(s200.C(aVar3, s890Var), 1.0f), 1.0f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            aVar2 = M;
            yqv0.c(str2, txj0.f(aVar3, 1.0f), 0L, null, null, 0, 3, null, 0, false, 0, 0, null, null, aVar2, (i3 & 14) | 48, 0, 16316);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.irx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    krx.this.h(str, q630Var2, s890Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(qrx.b bVar, final izs<? super gqx, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1815438030);
        int i2 = (M.J(bVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1815438030, i2, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsMviView.InviteFriendsContent (InviteFriendsMviView.kt:78)");
            }
            final wh50 a2 = jk50.a(bVar.a, M, 0, 3);
            final wh50 d = jk50.d(bVar.b, Boolean.FALSE, M, 48);
            final wh50 d2 = jk50.d(bVar.c, new uyh0(0), M, 48);
            final wh50 d3 = jk50.d(bVar.e, new isx(0), M, 48);
            wh50 d4 = jk50.d(bVar.d, new u7p0(null, 3), M, 48);
            wh50 a3 = jk50.a(bVar.f, M, 0, 3);
            if (((Throwable) a2.getValue()) != null || ((Boolean) d.getValue()).booleanValue()) {
                M.K(1483092244);
            } else {
                M.K(1486818568);
                s3q0 s3q0Var = s3q0.a;
                boolean z = (i2 & 896) == 256 || M.y(this);
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new a(null);
                    M.R(x);
                }
                bap.g(s3q0Var, (wzs) x, M, 6);
            }
            M.j();
            q630 b = ahh0.b(n34.t(q630.a.a, dz5.I(0, 1, M, false), null), p490.x(M), Orientation.Vertical);
            float f = 8;
            float f2 = 0;
            uog0 c = vog0.c(f, f, f2, f2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(b, ylu0Var.getBackground().g, c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            phv0.b(m, kai.c(-1545326873, new cqg(this, izsVar, d4), M), kai.c(-1296048472, new vy7(this, izsVar, 5, a3), M), null, null, 0, ylu0Var2.d().a, 0L, kai.c(818876658, new yzs() { // from class: xsna.grx
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    s890 s890Var = (s890) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(s890Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(818876658, intValue, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsMviView.InviteFriendsContent.<anonymous> (InviteFriendsMviView.kt:123)");
                        }
                        wh50 wh50Var = a2;
                        Throwable th = (Throwable) wh50Var.getValue();
                        krx krxVar = krx.this;
                        izs izsVar2 = izsVar;
                        if (th != null) {
                            aVar3.K(-259650570);
                            Throwable th2 = (Throwable) wh50Var.getValue();
                            String message = th2 != null ? th2.getMessage() : null;
                            if (message == null) {
                                message = "";
                            }
                            krxVar.h(message, null, s890Var, izsVar2, aVar3, ((intValue << 6) & 896) | 32768);
                            aVar3.j();
                        } else if (((Boolean) d.getValue()).booleanValue()) {
                            aVar3.K(-259405391);
                            krxVar.j(null, s890Var, izsVar2, aVar3, ((intValue << 3) & 112) | 4096);
                            aVar3.j();
                        } else {
                            mtk0 mtk0Var = d2;
                            if (((uyh0) mtk0Var.getValue()).a) {
                                aVar3.K(-259203023);
                                wrx.a((uyh0) mtk0Var.getValue(), null, s890Var, izsVar2, aVar3, (intValue << 6) & 896);
                                aVar3.j();
                            } else {
                                if (((uyh0) mtk0Var.getValue()).a) {
                                    aVar3.K(-264694704);
                                } else {
                                    aVar3.K(-258938779);
                                    krxVar.k((isx) d3.getValue(), null, s890Var, izsVar2, aVar3, ((intValue << 6) & 896) | 32768);
                                    aVar3 = aVar3;
                                }
                                aVar3.j();
                            }
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 805306800, 376);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new o54(this, bVar, izsVar, i);
        }
    }

    public final void j(q630 q630Var, s890 s890Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(564031498);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= M.J(s890Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(564031498, i2, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsMviView.Loading (InviteFriendsMviView.kt:163)");
            }
            q630Var = q630.a.a;
            q630 c = txj0.c(txj0.f(s200.C(q630Var, s890Var), 1.0f), 1.0f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            q630 q = txj0.q(ra8.a.b(q630Var, dt1.a.f), 44);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            x2e0.b(q, ylu0Var.getIcon().f, 3, 0L, 0, M, 384, 24);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hrx(this, q630Var2, s890Var, izsVar, i, 0);
        }
    }

    public final void k(final isx isxVar, q630 q630Var, final s890 s890Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1536078164);
        if ((i & 6) == 0) {
            i2 = (M.J(isxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= M.J(s890Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? M.J(this) : M.y(this) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1536078164, i3, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsMviView.Main (InviteFriendsMviView.kt:212)");
            }
            q630Var2 = q630.a.a;
            q630 C = s200.C(q630Var2, s890Var);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, C);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            List<yrx> list = isxVar.b;
            InviteFriendsTabIndex inviteFriendsTabIndex = isxVar.a;
            int i4 = i3 & 7168;
            boolean z = i4 == 2048;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new qqw(izsVar);
                M.R(x);
            }
            hsx.b(list, inviteFriendsTabIndex, q630Var2, (wzs) x, M, 384);
            M = M;
            yrx yrxVar = (yrx) j5g.b0(isxVar.a.h(), isxVar.b);
            if (yrxVar == null) {
                M.K(208502409);
            } else {
                M.K(208502410);
                gsn0.c(isxVar.a, yrxVar, null, izsVar, M, i4);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.jrx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    krx.this.k(isxVar, q630Var2, s890Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void l(lsx lsxVar, izs<? super gqx, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1457633770);
        int i2 = (M.J(lsxVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1457633770, i2, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsMviView.ThemedContent (InviteFriendsMviView.kt:56)");
            }
            int i3 = i2 & 896;
            qrx qrxVar = (qrx) d(qrx.a.a, new n0u0[]{lsxVar.a}, M, 518 | i3).getValue();
            if (qrxVar instanceof qrx.b) {
                M.K(-2046323069);
                i((qrx.b) qrxVar, izsVar, M, i3 | (i2 & 112) | 512);
                M.j();
            } else {
                M.K(626731566);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kv7(this, lsxVar, izsVar, i, 2);
        }
    }
}
