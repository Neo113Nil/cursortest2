package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.attachments.impl.publish.cta.ActionButtonsPickerTestTags;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;

/* compiled from: ClipCtaWithDonutComposeContent.kt */
/* loaded from: classes16.dex */
public final class cpc {

    /* compiled from: ClipCtaWithDonutComposeContent.kt */
    public static final /* synthetic */ class a implements xy, g0t {
        public final /* synthetic */ qpc b;

        public a(qpc qpcVar) {
            this.b = qpcVar;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((fpc) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, qpc.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: ClipCtaWithDonutComposeContent.kt */
    @b6l(c = "com.vk.clips.attachments.impl.publish.cta.donut.presentation.compose.ClipCtaWithDonutComposeContentKt$ClipCtaWithDonutComposeContent$2$1", f = "ClipCtaWithDonutComposeContent.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<z37<fpc>, mpc, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<mpc, s3q0> $onEvent;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super mpc, s3q0> izsVar, spj<? super b> spjVar) {
            super(3, spjVar);
            this.$onEvent = izsVar;
        }

        @Override // xsna.yzs
        public final Object invoke(z37<fpc> z37Var, mpc mpcVar, spj<? super s3q0> spjVar) {
            b bVar = new b(this.$onEvent, spjVar);
            bVar.L$0 = mpcVar;
            return bVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            mpc mpcVar = (mpc) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onEvent.invoke(mpcVar);
            return s3q0.a;
        }
    }

    /* compiled from: ClipCtaWithDonutComposeContent.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<fpc, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(fpc fpcVar) {
            ((z37) this.receiver).b(fpcVar);
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class d implements izs<Integer, Object> {
        public final /* synthetic */ wow b;

        public d(wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class e implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ wow b;
        public final /* synthetic */ izs c;
        public final /* synthetic */ zpc d;
        public final /* synthetic */ boolean e;

        public e(wow wowVar, izs izsVar, zpc zpcVar, boolean z) {
            this.b = wowVar;
            this.c = izsVar;
            this.d = zpcVar;
            this.e = z;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                jkk jkkVar = (jkk) this.b.b.get(intValue);
                aVar2.K(-1708284075);
                cpc.a(jkkVar, this.c, this.d.b.size() - 1 != intValue, this.e, aVar2, 0);
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    public static final void a(jkk jkkVar, final izs<? super fpc, s3q0> izsVar, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        q630.a aVar2;
        xjk xjkVar;
        q630.a aVar3;
        Cell$Middle.d a2;
        q630 q630Var;
        int i2;
        a.C0011a.C0012a c0012a;
        xjk xjkVar2;
        int i3;
        Object obj;
        char c2;
        com.vk.core.compose.component.cell.content.y0 a3;
        int i4;
        char c3;
        final jkk jkkVar2 = jkkVar;
        boolean z3 = z2;
        androidx.compose.runtime.a M = aVar.M(-1146035756);
        int i5 = i | (M.J(jkkVar2) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.l(z3) ? 2048 : 1024);
        if (M.t(i5 & 1, (i5 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1146035756, i5, -1, "com.vk.clips.attachments.impl.publish.cta.donut.presentation.compose.ActionSection (ClipCtaWithDonutComposeContent.kt:173)");
            }
            com.vk.core.compose.component.group.header.f a4 = f.a.a(blk.J(jkkVar2.a, M), null, null, null, null, null, null, null, false, M, 805306368, 510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(958254720, Tensorflow.FRAME_WIDTH, -1, "com.vk.core.compose.component.group.header.GroupHeader.Middle.Companion.invoke (GroupHeader.kt:1088)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = new com.vk.core.compose.component.group.header.a(a4, null);
                M.R(x);
            }
            com.vk.core.compose.component.group.header.a aVar4 = (com.vk.core.compose.component.group.header.a) x;
            ((zak0) aVar4.a).setValue(a4);
            ((zak0) aVar4.b).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.group.header.g.a(aVar4, null, b.d.a, null, null, false, M, 384, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            M = M;
            M.K(-1828717548);
            Iterator it = jkkVar2.b.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                aVar2 = q630.a.a;
                if (!hasNext) {
                    break;
                }
                xjk xjkVar3 = (xjk) it.next();
                if (z3 && xjkVar3.a == -3) {
                    M.K(-855509023);
                    a2 = new h6v(blk.J(xjkVar3.c, M));
                    M.j();
                    xjkVar = xjkVar3;
                    aVar3 = aVar2;
                } else {
                    M.K(-855392432);
                    androidx.compose.runtime.a aVar5 = M;
                    xjkVar = xjkVar3;
                    aVar3 = aVar2;
                    a2 = Cell$Middle.d.b.a(blk.J(xjkVar3.c, M), null, null, 2, null, null, aVar5, 12610560, 102);
                    M = aVar5;
                    M.j();
                }
                Cell$Middle.d dVar = a2;
                q630 E = ahn.E(aVar3, ActionButtonsPickerTestTags.ActionButtonsPickerCta.h());
                androidx.compose.runtime.a aVar6 = M;
                com.vk.core.compose.component.cell.content.k0 a5 = Cell$Middle.a.a(dVar, Cell$Middle.c.b.b(blk.J(xjkVar.d, M), 1, null, null, null, M, 12583344, 120), null, null, aVar6, 196608, 28);
                androidx.compose.runtime.a aVar7 = aVar6;
                int i6 = i5 & 112;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1583806836, i6, -1, "com.vk.clips.attachments.impl.publish.cta.donut.presentation.compose.CellRight (ClipCtaWithDonutComposeContent.kt:260)");
                }
                int i7 = xjkVar.a;
                boolean z4 = xjkVar.b;
                if (i7 == -4) {
                    aVar7.K(1321424526);
                    if (z4) {
                        aVar7.K(1321450318);
                        if (androidx.compose.runtime.b.d()) {
                            i4 = 0;
                            androidx.compose.runtime.b.f(-1589335940, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel20> (VkSdkIcons.kt:216)");
                        } else {
                            i4 = 0;
                        }
                        lg90 b2 = or.b(aVar7, -187349011, R.drawable.vk_icon_cancel_20, aVar7, i4);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            c3 = 65535;
                            androidx.compose.runtime.b.f(1040687336, i4, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        } else {
                            c3 = 65535;
                        }
                        ylu0 ylu0Var = (ylu0) aVar7.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getIcon().n;
                        boolean z5 = ((i6 ^ 48) > 32 && aVar7.J(izsVar)) || (i5 & 48) == 32;
                        Object x2 = aVar7.x();
                        if (z5 || x2 == c0012a2) {
                            x2 = new oe1(izsVar, 1);
                            aVar7.R(x2);
                        }
                        c2 = c3;
                        q630Var = E;
                        xjkVar2 = xjkVar;
                        i2 = i6;
                        c0012a = c0012a2;
                        i3 = 32;
                        obj = null;
                        com.vk.core.compose.component.cell.content.x a6 = com.vk.core.compose.component.cell.content.p.a(b2, j, 0L, null, (gzs) x2, null, aVar7, 1572872, 44);
                        aVar7 = aVar7;
                        a3 = o.c.a(null, a6, null, null, null, aVar7, 61);
                        aVar7.j();
                    } else {
                        q630Var = E;
                        i2 = i6;
                        c0012a = c0012a2;
                        xjkVar2 = xjkVar;
                        i3 = 32;
                        obj = null;
                        c2 = 65535;
                        aVar7.K(1321777864);
                        boolean J = aVar7.J(xjkVar2) | (((i2 ^ 48) > 32 && aVar7.J(izsVar)) || (i5 & 48) == 32);
                        Object x3 = aVar7.x();
                        if (J || x3 == c0012a) {
                            x3 = new com.vk.movika.sdk.base.ui.i(7, izsVar, xjkVar2);
                            aVar7.R(x3);
                        }
                        a3 = o.c.a(null, null, null, o.b.a.a((gzs) x3, null, 0L, false, aVar7, 196608, 30), null, aVar7, 55);
                        aVar7.j();
                    }
                    aVar7.j();
                } else {
                    q630Var = E;
                    i2 = i6;
                    c0012a = c0012a2;
                    xjkVar2 = xjkVar;
                    i3 = 32;
                    obj = null;
                    c2 = 65535;
                    aVar7.K(1322012286);
                    boolean z6 = xjkVar2.b;
                    boolean J2 = aVar7.J(xjkVar2) | (((i2 ^ 48) > 32 && aVar7.J(izsVar)) || (i5 & 48) == 32);
                    Object x4 = aVar7.x();
                    if (J2 || x4 == c0012a) {
                        x4 = new dp0(4, izsVar, xjkVar2);
                        aVar7.R(x4);
                    }
                    com.vk.core.compose.component.cell.content.b0 a7 = o.e.a.C0736a.a(z6, (gzs) x4, false, null, aVar7, 24576, 12);
                    aVar7 = aVar7;
                    a3 = o.c.a(null, null, z4 ? a7 : null, null, null, aVar7, 59);
                    aVar7.j();
                }
                com.vk.core.compose.component.cell.content.y0 y0Var = a3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                boolean J3 = (i2 == i3) | aVar7.J(xjkVar2);
                Object x5 = aVar7.x();
                if (J3 || x5 == c0012a) {
                    x5 = new com.vk.movika.sdk.base.flow.binding.j(7, izsVar, xjkVar2);
                    aVar7.R(x5);
                }
                androidx.compose.runtime.a aVar8 = aVar7;
                wiu0.b(q630Var, false, null, a5, y0Var, (gzs) x5, null, aVar8, 6, 70);
                c0012a2 = c0012a;
                M = aVar8;
                z3 = z2;
            }
            M.j();
            jkkVar2 = jkkVar;
            if (jkkVar2.c) {
                M.K(-854656306);
                androidx.compose.runtime.a aVar9 = M;
                yiu0.a(null, null, null, null, aVar9, 0, 15);
                M = aVar9;
            } else {
                M.K(-863883890);
            }
            M.j();
            if (z) {
                M.K(-854588168);
                f9t.e(txj0.h(aVar2, kqu0.t), M, 0);
                ijv0.a(SeparatorDpi.At2x, SeparatorAppearance.Primary, true, null, null, M, 438, 24);
            } else {
                M.K(-863883890);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(izsVar, z, z2, i) { // from class: xsna.xoc
                public final /* synthetic */ izs c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1);
                    cpc.a(jkk.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final qpc qpcVar, izs<? super mpc, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1011123982);
        int i2 = (M.J(qpcVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1011123982, i2, -1, "com.vk.clips.attachments.impl.publish.cta.donut.presentation.compose.ClipCtaWithDonutComposeContent (ClipCtaWithDonutComposeContent.kt:75)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new w5(qpcVar, 18);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z2 = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new b(izsVar, null);
                M.R(x2);
            }
            r37.a(izsVar2, (yzs) x2, kai.c(-167203957, new zzs() { // from class: xsna.yoc
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i3;
                    z37 z37Var = (z37) obj;
                    zpc zpcVar = (zpc) obj2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        i3 = (aVar2.J(z37Var) ? 4 : 2) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i3 |= aVar2.J(zpcVar) ? 32 : 16;
                    }
                    if (aVar2.t(i3 & 1, (i3 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-167203957, i3, -1, "com.vk.clips.attachments.impl.publish.cta.donut.presentation.compose.ClipCtaWithDonutComposeContent.<anonymous> (ClipCtaWithDonutComposeContent.kt:84)");
                        }
                        new xnd(false).a(6, aVar2, kai.c(155298089, new t77(zpcVar, qpc.this.getCurrentState().h, z37Var), aVar2));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ud6(qpcVar, izsVar, i, 1);
        }
    }

    public static final void c(final zpc zpcVar, final boolean z, final izs<? super fpc, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1432223560);
        int i2 = (M.J(zpcVar) ? 4 : 2) | i | (M.l(z) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1432223560, i2, -1, "com.vk.clips.attachments.impl.publish.cta.donut.presentation.compose.ClipCtaWithDonutScreen (ClipCtaWithDonutComposeContent.kt:103)");
            }
            float f = 12;
            q630 d2 = rte0.d(q630.a.a, vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            jai c2 = kai.c(-1691247583, new zoc(izsVar, 0), M);
            jai c3 = kai.c(2035747490, new at0(2, zpcVar, izsVar), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            phv0.b(d2, c2, c3, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(20037740, new yzs() { // from class: xsna.apc
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
                            androidx.compose.runtime.b.f(20037740, intValue, -1, "com.vk.clips.attachments.impl.publish.cta.donut.presentation.compose.ClipCtaWithDonutScreen.<anonymous> (ClipCtaWithDonutComposeContent.kt:149)");
                        }
                        q630 t = n34.t(txj0.d(s200.C(q630.a.a, s890Var), 1.0f), dz5.I(0, 1, aVar3, false), null);
                        zpc zpcVar2 = zpc.this;
                        boolean J = aVar3.J(zpcVar2);
                        izs izsVar2 = izsVar;
                        boolean J2 = J | aVar3.J(izsVar2);
                        boolean z2 = z;
                        boolean l = J2 | aVar3.l(z2);
                        Object x = aVar3.x();
                        if (l || x == a.C0011a.a) {
                            x = new woc(zpcVar2, izsVar2, z2, 0);
                            aVar3.R(x);
                        }
                        x1v0.a(t, null, null, null, null, null, false, null, (izs) x, aVar3, 0, 510);
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
            s.d = new bpc(zpcVar, z, izsVar, i);
        }
    }
}
