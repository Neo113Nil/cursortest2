package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.layout.a;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.kuo0;
import xsna.q630;
import xsna.t7z;

/* compiled from: TimePicker.kt */
/* loaded from: classes11.dex */
public final class kuo0 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final ng50 h;
    public static final ng50 i;
    public static final ng50 j;
    public static final float k;
    public static final float l;
    public static final float m;
    public static final float n;
    public static final float o;

    /* compiled from: TimePicker.kt */
    public static final class a implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ tuo0 b;
        public final /* synthetic */ yto0 c;

        public a(tuo0 tuo0Var, yto0 yto0Var) {
            this.b = tuo0Var;
            this.c = yto0Var;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-477913269, intValue, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:1179)");
                }
                a.l lVar = androidx.compose.foundation.layout.a.a;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, aVar2, 0);
                int m = n34.m(aVar2);
                sy90 D = aVar2.D();
                q630.a aVar3 = q630.a.a;
                q630 c = qri.c(aVar2, aVar3);
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
                k9q0.w(aVar2, a, cri.a.f);
                k9q0.w(aVar2, D, cri.a.e);
                cri.a.b bVar = cri.a.g;
                if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                    kr.a(m, aVar2, m, bVar);
                }
                k9q0.w(aVar2, c, cri.a.d);
                float f = vuo0.w;
                float f2 = vuo0.u;
                q630 s = txj0.s(aVar3, f, f2);
                tuo0 tuo0Var = this.b;
                int c2 = tuo0Var.g() ? tuo0Var.c() % 24 : tuo0Var.c() % 12 == 0 ? 12 : kuo0.r(tuo0Var) ? tuo0Var.c() - 12 : tuo0Var.c();
                yto0 yto0Var = this.c;
                kuo0.k(s, c2, tuo0Var, 0, yto0Var, aVar2, 3078);
                kuo0.e(txj0.s(aVar3, kuo0.e, vuo0.s), aVar2, 6);
                kuo0.k(txj0.s(aVar3, f, f2), tuo0Var.b(), tuo0Var, 1, yto0Var, aVar2, 3078);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: TimePicker.kt */
    public static final class b implements yzs<a9x, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ yto0 b;
        public final /* synthetic */ qw1 c;
        public final /* synthetic */ boolean d;

        public b(yto0 yto0Var, qw1 qw1Var, boolean z) {
            this.b = yto0Var;
            this.c = qw1Var;
            this.d = z;
        }

        @Override // xsna.yzs
        public final s3q0 invoke(a9x a9xVar, androidx.compose.runtime.a aVar, Integer num) {
            a9x a9xVar2 = a9xVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(747010833, intValue, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1609)");
            }
            q630 q = txj0.q(q630.a.a, vuo0.b);
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                x = new yml0(3);
                aVar2.R(x);
            }
            q630 b = egi0.b(q, false, (izs) x);
            kuo0.a(kuo0.a, Tensorflow.FRAME_WIDTH, aVar2, kai.c(-99063847, new nuo0(this.b, a9xVar2, this.c, this.d), aVar2), b);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return s3q0.a;
        }
    }

    /* compiled from: TimePicker.kt */
    @b6l(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", l = {1769}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ wh50<ov70> $center$delegate;
        final /* synthetic */ float $maxDist;
        final /* synthetic */ wh50<h9x> $parentCenter$delegate;
        final /* synthetic */ qw1 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qw1 qw1Var, float f, boolean z, wh50<ov70> wh50Var, wh50<h9x> wh50Var2, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$state = qw1Var;
            this.$maxDist = f;
            this.$autoSwitchToMinute = z;
            this.$center$delegate = wh50Var;
            this.$parentCenter$delegate = wh50Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, this.$parentCenter$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                qw1 qw1Var = this.$state;
                wh50<ov70> wh50Var = this.$center$delegate;
                float f = kuo0.a;
                float intBitsToFloat = Float.intBitsToFloat((int) (wh50Var.getValue().a >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.$center$delegate.getValue().a & 4294967295L));
                float f2 = this.$maxDist;
                boolean z = this.$autoSwitchToMinute;
                long j = this.$parentCenter$delegate.getValue().a;
                aak0 aak0Var = new aak0();
                this.label = 1;
                if (kuo0.p(qw1Var, intBitsToFloat, intBitsToFloat2, f2, z, j, aak0Var, this) == coroutineSingletons) {
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

    /* compiled from: TimePicker.kt */
    public static final class d implements cp10 {
        public static final d a = new d();

        @Override // xsna.cp10
        public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                zo10 zo10Var = list.get(i);
                if (epx.f(vua0.o(zo10Var), "Spacer")) {
                    tra0 N = zo10Var.N(o6j.b(0, j, ep10Var.r0(vuo0.o), 0, 0, 12));
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        zo10 zo10Var2 = list.get(i2);
                        if (!epx.f(vua0.o(zo10Var2), "Spacer")) {
                            arrayList.add(zo10Var2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        i3 = rf3.a((zo10) arrayList.get(i3), o6j.b(0, j, o6j.i(j) / 2, 0, 0, 12), arrayList2, i3, 1);
                    }
                    return ep10Var.Q(o6j.i(j), o6j.h(j), jgp.b, new yl0(27, arrayList2, N));
                }
            }
            hgz.c("Collection contains no element matching the predicate.");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: TimePicker.kt */
    public static final class e implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ int b;
        public final /* synthetic */ tuo0 c;
        public final /* synthetic */ int d;
        public final /* synthetic */ long e;

        public e(int i, tuo0 tuo0Var, int i2, long j) {
            this.b = i;
            this.c = tuo0Var;
            this.d = i2;
            this.e = j;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1477282471, intValue, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1431)");
                }
                boolean g = this.c.g();
                int i = this.b;
                int i2 = this.d;
                String t = kuo0.t(i, i2, aVar2, g);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.f, false);
                int m = n34.m(aVar2);
                sy90 D = aVar2.D();
                q630.a aVar3 = q630.a.a;
                q630 c = qri.c(aVar2, aVar3);
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
                k9q0.w(aVar2, d, cri.a.f);
                k9q0.w(aVar2, D, cri.a.e);
                cri.a.b bVar = cri.a.g;
                if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                    kr.a(m, aVar2, m, bVar);
                }
                k9q0.w(aVar2, c, cri.a.d);
                boolean J = aVar2.J(t);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new rdh(t, 2);
                    aVar2.R(x);
                }
                cjo0.c(vz8.a(i2, null, 14), egi0.b(aVar3, false, (izs) x), this.e, 0L, 0L, null, 0L, 0, false, 0, 0, null, aVar2, 0, 0, 262136);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: TimePicker.kt */
    public static final class f implements cp10 {
        public static final f a = new f();

        @Override // xsna.cp10
        public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                zo10 zo10Var = list.get(i);
                if (epx.f(vua0.o(zo10Var), "Spacer")) {
                    tra0 N = zo10Var.N(o6j.b(0, j, 0, 0, ep10Var.r0(vuo0.o), 3));
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        zo10 zo10Var2 = list.get(i2);
                        if (!epx.f(vua0.o(zo10Var2), "Spacer")) {
                            arrayList.add(zo10Var2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        i3 = rf3.a((zo10) arrayList.get(i3), o6j.b(0, j, 0, 0, o6j.h(j) / 2, 3), arrayList2, i3, 1);
                    }
                    return ep10Var.Q(o6j.i(j), o6j.h(j), jgp.b, new puo0(0, arrayList2, N));
                }
            }
            hgz.c("Collection contains no element matching the predicate.");
            throw new KotlinNothingValueException();
        }
    }

    static {
        float f2 = vuo0.b;
        a = 101 / f2;
        b = 69 / f2;
        c = 36;
        float f3 = 24;
        d = f3;
        e = f3;
        f = 74;
        g = 48;
        h = b9x.a(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
        ng50 a2 = b9x.a(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        i = a2;
        ng50 ng50Var = new ng50(a2.b);
        int[] iArr = a2.a;
        int i2 = a2.b;
        for (int i3 = 0; i3 < i2; i3++) {
            ng50Var.c((iArr[i3] % 12) + 12);
        }
        j = ng50Var;
        k = 12;
        l = 384;
        m = 330;
        n = 238;
        o = 200;
    }

    public static final void a(final float f2, final int i2, androidx.compose.runtime.a aVar, final jai jaiVar, final q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(-1041042571);
        int i3 = (M.J(q630Var) ? 4 : 2) | i2;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1041042571, i3, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1978)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new juo0(f2);
                M.R(x);
            }
            cp10 cp10Var = (cp10) x;
            int m2 = n34.m(M);
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
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
            k9q0.w(M, cp10Var, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m2))) {
                kr.a(m2, M, m2, bVar);
            }
            k9q0.w(M, c2, cri.a.d);
            if (er.f(6, M, jaiVar)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f2, jaiVar, i2) { // from class: xsna.duo0
                public final /* synthetic */ float c;
                public final /* synthetic */ jai d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(433);
                    kuo0.a(this.c, I, (androidx.compose.runtime.a) obj, this.d, q630.this);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(tuo0 tuo0Var, yto0 yto0Var, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-934561141);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? M.J(tuo0Var) : M.y(tuo0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(yto0Var) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-934561141, i3, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:1173)");
            }
            rvi.b(new c9e0[]{cjo0.a.b(evp0.a(vuo0.x, M)), uvi.n.b(LayoutDirection.Ltr)}, kai.c(-477913269, new a(tuo0Var, yto0Var), M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qig(tuo0Var, yto0Var, i2, 2);
        }
    }

    public static final void c(final int i2, androidx.compose.runtime.a aVar, final qw1 qw1Var, final q630 q630Var, final yto0 yto0Var, final boolean z) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-478841003);
        if ((i2 & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(qw1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(yto0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.l(z) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-478841003, i3, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1591)");
            }
            ijk.a(qw1Var.a.a() == 1 ? h : i, bu00.f(hr80.m(q630Var, yto0Var.a, vog0.a).g(new evf(qw1Var, z, qw1Var.a.a(), lb30.a(MotionSchemeKeyTokens.DefaultSpatial, M))), new defpackage.v(26, qw1Var, yto0Var)), lb30.a(MotionSchemeKeyTokens.DefaultEffects, M), null, kai.c(747010833, new b(yto0Var, qw1Var, z), M), M, 24576, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.huo0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    kuo0.c(ne7.I(i2 | 1), (androidx.compose.runtime.a) obj, qw1Var, q630Var, yto0Var, z);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(q630 q630Var, final qw1 qw1Var, int i2, final boolean z, androidx.compose.runtime.a aVar, int i3) {
        androidx.compose.runtime.a aVar2;
        a.C0011a.C0012a c0012a;
        ty6 ty6Var;
        androidx.compose.runtime.a M = aVar.M(-206784607);
        int i4 = i3 | (M.J(q630Var) ? 4 : 2) | (M.y(qw1Var) ? 32 : 16) | (M.o(i2) ? 256 : 128) | (M.l(z) ? 2048 : 1024);
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-206784607, i4, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1727)");
            }
            nmo0 a2 = evp0.a(vuo0.c, M);
            azl azlVar = (azl) M.r(uvi.h);
            final float I0 = azlVar.I0(f);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = androidx.compose.runtime.k.b(new ov70(0L));
                M.R(x);
            }
            final wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = androidx.compose.runtime.k.b(new h9x(0L));
                M.R(x2);
            }
            final wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a2) {
                x3 = androidx.compose.runtime.k.b(zhf0.e);
                M.R(x3);
            }
            wh50 wh50Var3 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a2) {
                x4 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x4);
            }
            final yvj yvjVar = (yvj) x4;
            String t = t(qw1Var.a.a(), i2, M, qw1Var.a.g());
            String a3 = vz8.a(i2, null, 15);
            boolean J = M.J(qw1Var);
            Object x5 = M.x();
            if (J || x5 == c0012a2) {
                x5 = bbk0.b(new hgq(qw1Var, azlVar, wh50Var3, 4));
                M.R(x5);
            }
            final mtk0 mtk0Var = (mtk0) x5;
            dt1.a.getClass();
            ty6 ty6Var2 = dt1.a.f;
            Object x6 = M.x();
            if (x6 == c0012a2) {
                x6 = new yl3(wh50Var2, wh50Var3, wh50Var, 5);
                M.R(x6);
            }
            q630 o2 = egi.o(q630Var, (izs) x6);
            icv icvVar = zax.a;
            q630 b2 = mxr.b(3, txj0.q(o2.g(zr20.a), g), false);
            boolean y = M.y(yvjVar) | M.y(qw1Var) | M.n(I0) | ((i4 & 7168) == 2048) | M.J(mtk0Var);
            Object x7 = M.x();
            if (y || x7 == c0012a2) {
                c0012a = c0012a2;
                ty6Var = ty6Var2;
                izs izsVar = new izs() { // from class: xsna.euo0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        tgi0 tgi0Var = (tgi0) obj;
                        final yvj yvjVar2 = yvj.this;
                        final qw1 qw1Var2 = qw1Var;
                        final float f2 = I0;
                        final boolean z2 = z;
                        final wh50 wh50Var4 = wh50Var;
                        final wh50 wh50Var5 = wh50Var2;
                        qgi0.e(tgi0Var, null, new gzs() { // from class: xsna.fuo0
                            @Override // xsna.gzs
                            public final Object invoke() {
                                myc0.h(yvj.this, null, null, new kuo0.c(qw1Var2, f2, z2, wh50Var4, wh50Var5, null), 3);
                                return Boolean.TRUE;
                            }
                        });
                        qgi0.o(tgi0Var, ((Boolean) mtk0Var.getValue()).booleanValue());
                        return s3q0.a;
                    }
                };
                M.R(izsVar);
                x7 = izsVar;
            } else {
                ty6Var = ty6Var2;
                c0012a = c0012a2;
            }
            q630 b3 = egi0.b(b2, true, (izs) x7);
            cp10 d2 = ja8.d(ty6Var, false);
            int m2 = n34.m(M);
            sy90 D = M.D();
            q630 c2 = qri.c(M, b3);
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
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m2))) {
                kr.a(m2, M, m2, bVar);
            }
            k9q0.w(M, c2, cri.a.d);
            boolean J2 = M.J(t);
            Object x8 = M.x();
            if (J2 || x8 == c0012a) {
                x8 = new ykb(t, 4);
                M.R(x8);
            }
            aVar2 = M;
            cjo0.c(a3, egi0.a(q630.a.a, (izs) x8), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, a2, aVar2, 0, 0, 131068);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new vs0(q630Var, qw1Var, i2, z, i3);
        }
    }

    public static final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(2100674302);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2100674302, i2, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1379)");
            }
            nmo0 a2 = nmo0.a((nmo0) M.r(cjo0.a), 0L, 0L, null, null, 0L, 0L, null, new t7z(t7z.a.b, 17, 0), 15695871);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new cd10(21);
                M.R(x);
            }
            q630 a3 = egi0.a(q630Var, (izs) x);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int m2 = n34.m(M);
            sy90 D = M.D();
            q630 c2 = qri.c(M, a3);
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
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m2))) {
                kr.a(m2, M, m2, bVar);
            }
            k9q0.w(M, c2, cri.a.d);
            aVar2 = M;
            cjo0.c(StringUtils.PROCESS_POSTFIX_DELIMITER, null, u7g.c(rto0.a, M), 0L, 0L, null, 0L, 0, false, 0, 0, a2, aVar2, 6, 0, 131066);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new bh5(q630Var, i2, 16);
        }
    }

    public static final void f(tuo0 tuo0Var, yto0 yto0Var, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(755539561);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? M.J(tuo0Var) : M.y(tuo0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(yto0Var) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(755539561, i3, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:1133)");
            }
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(cVar, dt1.a.n, M, 6);
            int m2 = n34.m(M);
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c2 = qri.c(M, aVar2);
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
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a2, cVar2);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m2))) {
                kr.a(m2, M, m2, bVar);
            }
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            b(tuo0Var, yto0Var, M, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (tuo0Var.g()) {
                M.K(999020143);
                M.j();
            } else {
                M.K(998576161);
                q630 H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, k, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                cp10 d2 = ja8.d(dt1.a.b, false);
                int m3 = n34.m(M);
                sy90 D2 = M.D();
                q630 c3 = qri.c(M, H);
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
                k9q0.w(M, d2, cVar2);
                k9q0.w(M, D2, eVar);
                if (M.L() || !epx.f(M.x(), Integer.valueOf(m3))) {
                    kr.a(m3, M, m3, bVar);
                }
                k9q0.w(M, c3, dVar);
                int i4 = i3 << 3;
                g(txj0.s(aVar2, vuo0.m, vuo0.l), tuo0Var, yto0Var, M, (i4 & 896) | (i4 & 112) | 6);
                M.G();
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fjj(tuo0Var, yto0Var, i2, 3);
        }
    }

    public static final void g(q630 q630Var, tuo0 tuo0Var, yto0 yto0Var, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(1261215927);
        if ((i2 & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? M.J(tuo0Var) : M.y(tuo0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(yto0Var) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1261215927, i3, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1206)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = d.a;
                M.R(x);
            }
            quj qujVar = (quj) p6j0.a(vuo0.k, M);
            qco qcoVar = x5j0.i;
            i(q630Var, tuo0Var, yto0Var, (cp10) x, quj.c(qujVar, null, qcoVar, qcoVar, null, 9), quj.c(qujVar, qcoVar, null, null, qcoVar, 6), M, (i3 & 896) | (i3 & 14) | 3072 | (i3 & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rz5(i2, 3, q630Var, tuo0Var, yto0Var);
        }
    }

    public static final void h(final int i2, androidx.compose.runtime.a aVar, final qw1 qw1Var, final q630 q630Var, final yto0 yto0Var, final boolean z) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(1432307537);
        if ((i2 & 6) == 0) {
            i3 = (M.y(qw1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(yto0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.l(z) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            M.V();
            if ((i2 & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1432307537, i3, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:980)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new uuz(28);
                M.R(x);
            }
            q630 b2 = egi0.b(q630Var, false, (izs) x);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int m2 = n34.m(M);
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m2))) {
                kr.a(m2, M, m2, bVar);
            }
            k9q0.w(M, c2, cri.a.d);
            f(qw1Var, yto0Var, M, (i3 & 14) | ((i3 >> 3) & 112));
            f9t.e(txj0.v(q630.a.a, c), M, 6);
            c(((i3 << 3) & 112) | (i3 & 896) | (i3 & 7168), M, qw1Var, new hvf(), yto0Var, z);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.guo0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kuo0.h(ne7.I(i2 | 1), (androidx.compose.runtime.a) obj, qw1Var, q630Var, yto0Var, z);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void i(final q630 q630Var, final tuo0 tuo0Var, final yto0 yto0Var, final cp10 cp10Var, final r5j0 r5j0Var, final r5j0 r5j0Var2, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(1374241901);
        if ((i2 & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? M.J(tuo0Var) : M.y(tuo0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(yto0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(cp10Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.J(r5j0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.J(r5j0Var2) ? 131072 : 65536;
        }
        int i4 = i3;
        boolean z = false;
        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1374241901, i4, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1301)");
            }
            y18 a2 = aqw.a(vuo0.o, yto0Var.d);
            quj qujVar = (quj) p6j0.a(vuo0.k, M);
            String b2 = e7b0.b(R.string.m3c_time_picker_period_toggle_description, M);
            boolean J = M.J(b2);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new v89(b2, 3);
                M.R(x);
            }
            q630 b3 = r18.b(a2.a, a2.b, egi0.b(egi0.b(q630Var, false, (izs) x), false, new t6c0(4)), qujVar);
            int m2 = n34.m(M);
            sy90 D = M.D();
            q630 c2 = qri.c(M, b3);
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
            k9q0.w(M, cp10Var, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m2))) {
                kr.a(m2, M, m2, bVar);
            }
            k9q0.w(M, c2, cri.a.d);
            boolean z2 = !r(tuo0Var);
            int i5 = i4 & 112;
            boolean z3 = i5 == 32 || ((i4 & 64) != 0 && M.y(tuo0Var));
            Object x2 = M.x();
            if (z3 || x2 == obj) {
                x2 = new z4d0(tuo0Var, 19);
                M.R(x2);
            }
            int i6 = (i4 << 3) & 7168;
            l(z2, r5j0Var, (gzs) x2, yto0Var, tli.a, M, ((i4 >> 9) & 112) | 24576 | i6);
            f9t.e(hr80.m(txj0.d(f370.P(vua0.u(q630.a.a, "Spacer"), 2.0f), 1.0f), yto0Var.d, androidx.compose.ui.graphics.e.a), M, 0);
            boolean r = r(tuo0Var);
            if (i5 == 32 || ((i4 & 64) != 0 && M.y(tuo0Var))) {
                z = true;
            }
            Object x3 = M.x();
            if (z || x3 == obj) {
                x3 = new tfm0(tuo0Var, 3);
                M.R(x3);
            }
            l(r, r5j0Var2, (gzs) x3, yto0Var, tli.b, M, ((i4 >> 12) & 112) | 24576 | i6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.cuo0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    kuo0.i(q630.this, tuo0Var, yto0Var, cp10Var, r5j0Var, r5j0Var2, (androidx.compose.runtime.a) obj2, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void j(tuo0 tuo0Var, q630 q630Var, yto0 yto0Var, int i2, androidx.compose.runtime.a aVar, int i3) {
        q630 q630Var2;
        int i4;
        androidx.compose.runtime.a aVar2;
        yto0 yto0Var2;
        yto0 yto0Var3;
        int i5;
        int i6;
        q630 q630Var3;
        yto0 yto0Var4;
        androidx.compose.runtime.a M = aVar.M(-619286452);
        int i7 = i3 | (M.J(tuo0Var) ? 4 : 2) | 1200;
        if (M.t(i7 & 1, (i7 & 1171) != 1170)) {
            M.V();
            if ((i3 & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2085808058, 6, -1, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:284)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-561618718, 6, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:121)");
                }
                t7g t7gVar = (t7g) M.r(u7g.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yto0 yto0Var5 = t7gVar.b0;
                if (yto0Var5 == null) {
                    yto0Var3 = new yto0(u7g.b(t7gVar, vuo0.a), u7g.b(t7gVar, vuo0.f), u7g.b(t7gVar, vuo0.j), u7g.b(t7gVar, vuo0.n), u7g.b(t7gVar, vuo0.d), u7g.b(t7gVar, vuo0.i), u7g.b(t7gVar, vuo0.p), l5g.j, u7g.b(t7gVar, vuo0.q), u7g.b(t7gVar, vuo0.r), u7g.b(t7gVar, vuo0.y), u7g.b(t7gVar, vuo0.A), u7g.b(t7gVar, vuo0.z), u7g.b(t7gVar, vuo0.B));
                    t7gVar.b0 = yto0Var3;
                } else {
                    yto0Var3 = yto0Var5;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(517161502, 6, -1, "androidx.compose.material3.TimePickerDefaults.layoutType (TimePicker.kt:381)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(435687004, 0, -1, "androidx.compose.material3.<get-defaultTimePickerLayoutType> (TimePicker.kt:2051)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-721362352, 0, -1, "androidx.compose.material3.defaultTimePickerLayoutType (TimePicker.android.kt:26)");
                }
                Configuration configuration = (Configuration) M.r(AndroidCompositionLocals_androidKt.a);
                int i8 = configuration.screenHeightDp < configuration.screenWidthDp ? 0 : 1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i5 = i7 & (-8065);
                i6 = i8;
                q630Var3 = q630.a.a;
            } else {
                M.h();
                i5 = i7 & (-8065);
                q630Var3 = q630Var;
                yto0Var3 = yto0Var;
                i6 = i2;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-619286452, i5, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:224)");
            }
            boolean z = (7 & 4) != 0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(432241692, 0, -1, "androidx.compose.material3.internal.rememberAccessibilityServiceState (AccessibilityServiceStateProvider.android.kt:46)");
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) ((Context) M.r(AndroidCompositionLocals_androidKt.b)).getSystemService("accessibility");
            boolean z2 = ((((0 & 14) ^ 6) > 4 && M.l(true)) || (0 & 6) == 4) | ((((0 & 112) ^ 48) > 32 && M.l(true)) || (0 & 48) == 32) | ((((0 & 896) ^ 384) > 256 && M.l(z)) || (0 & 384) == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new chz(true, true, z);
                M.R(x);
            }
            chz chzVar = (chz) x;
            f5z f5zVar = (f5z) M.r(bvz.a);
            boolean J = M.J(chzVar) | M.y(accessibilityManager);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new lh(1, chzVar, accessibilityManager);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            boolean J2 = M.J(chzVar) | M.y(accessibilityManager);
            Object x3 = M.x();
            if (J2 || x3 == c0012a) {
                x3 = new cm(0, chzVar, accessibilityManager);
                M.R(x3);
            }
            hm.a(f5zVar, izsVar, (gzs) x3, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x4 = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x4 == c0012a2) {
                x4 = new cpf0();
                M.R(x4);
            }
            cpf0 cpf0Var = (cpf0) x4;
            int i9 = i5 & 14;
            boolean z3 = i9 == 4;
            Object x5 = M.x();
            if (z3 || x5 == c0012a2) {
                x5 = new qw1(tuo0Var, cpf0Var);
                M.R(x5);
            }
            qw1 qw1Var = (qw1) x5;
            Integer valueOf = Integer.valueOf(tuo0Var.c());
            Integer valueOf2 = Integer.valueOf(tuo0Var.b());
            boolean y = (i9 == 4) | M.y(cpf0Var) | M.y(qw1Var);
            Object x6 = M.x();
            if (y || x6 == c0012a2) {
                x6 = new ouo0(cpf0Var, qw1Var, tuo0Var, null);
                M.R(x6);
            }
            bap.f(valueOf, valueOf2, (wzs) x6, M, 0);
            if (i6 == 1) {
                M.K(2017551219);
                yto0Var4 = yto0Var3;
                o(48, M, qw1Var, q630Var3, yto0Var4, !((Boolean) chzVar.getValue()).booleanValue());
                M.j();
            } else {
                yto0Var4 = yto0Var3;
                M.K(2017750673);
                h(48, M, qw1Var, q630Var3, yto0Var4, !((Boolean) chzVar.getValue()).booleanValue());
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            q630Var2 = q630Var3;
            yto0Var2 = yto0Var4;
            i4 = i6;
        } else {
            M.h();
            q630Var2 = q630Var;
            i4 = i2;
            aVar2 = M;
            yto0Var2 = yto0Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xs0(tuo0Var, q630Var2, yto0Var2, i4, i3);
        }
    }

    public static final void k(final q630 q630Var, final int i2, final tuo0 tuo0Var, final int i3, final yto0 yto0Var, androidx.compose.runtime.a aVar, final int i4) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1148055889);
        int i5 = i4 | (M.o(i2) ? 32 : 16) | (M.J(tuo0Var) ? 256 : 128) | (M.J(yto0Var) ? 16384 : 8192);
        if (M.t(i5 & 1, (i5 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1148055889, i5, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1403)");
            }
            boolean z = tuo0Var.a() == i3;
            String b2 = e7b0.b(i3 == 0 ? R.string.m3c_time_picker_hour_selection : R.string.m3c_time_picker_minute_selection, M);
            long j2 = z ? yto0Var.k : yto0Var.l;
            long j3 = z ? yto0Var.m : yto0Var.n;
            boolean J = M.J(b2);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new y2b(b2, 2);
                M.R(x);
            }
            q630 b3 = egi0.b(q630Var, true, (izs) x);
            r5j0 a2 = p6j0.a(vuo0.v, M);
            boolean z2 = (i5 & 896) == 256;
            Object x2 = M.x();
            if (z2 || x2 == obj) {
                x2 = new i6l(i3, tuo0Var);
                M.R(x2);
            }
            aVar2 = M;
            xjn0.b(z, (gzs) x2, b3, false, a2, j2, null, kai.c(-1477282471, new e(i3, tuo0Var, i2, j3), M), aVar2, 0, 1992);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(i2, tuo0Var, i3, yto0Var, i4) { // from class: xsna.auo0
                public final /* synthetic */ int c;
                public final /* synthetic */ tuo0 d;
                public final /* synthetic */ int e;
                public final /* synthetic */ yto0 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(3079);
                    kuo0.k(q630.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void l(boolean z, r5j0 r5j0Var, gzs gzsVar, yto0 yto0Var, jai jaiVar, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        r5j0 r5j0Var2;
        androidx.compose.runtime.a M = aVar.M(1523811083);
        if ((i2 & 6) == 0) {
            i3 = (M.l(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            r5j0Var2 = r5j0Var;
            i3 |= M.J(r5j0Var2) ? 32 : 16;
        } else {
            r5j0Var2 = r5j0Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(yto0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.y(jaiVar) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1523811083, i3, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1359)");
            }
            long j2 = z ? yto0Var.i : yto0Var.j;
            long j3 = z ? yto0Var.g : yto0Var.h;
            q630 d2 = txj0.d(f370.P(q630.a.a, z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f), 1.0f);
            boolean z2 = (i3 & 14) == 4;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new g560(z, 1);
                M.R(x);
            }
            q630 b2 = egi0.b(d2, false, (izs) x);
            float f2 = 0;
            lq8.b(gzsVar, b2, false, r5j0Var2, np8.b(j3, j2, M, 12), new u890(f2, f2, f2, f2), jaiVar, M, ((i3 << 15) & 1879048192) | ((i3 >> 6) & 14) | 12582912 | ((i3 << 6) & 7168), 356);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wma(z, r5j0Var, gzsVar, yto0Var, jaiVar, i2);
        }
    }

    public static final void m(tuo0 tuo0Var, yto0 yto0Var, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(2054675515);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? M.J(tuo0Var) : M.y(tuo0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(yto0Var) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2054675515, i3, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:1153)");
            }
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(cVar, dt1.a.k, M, 6);
            int m2 = n34.m(M);
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c2 = qri.c(M, aVar2);
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
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a2, cVar2);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m2))) {
                kr.a(m2, M, m2, bVar);
            }
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            b(tuo0Var, yto0Var, M, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (tuo0Var.g()) {
                M.K(1364727499);
                M.j();
            } else {
                M.K(1364287361);
                q630 H = s200.H(aVar2, k, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                cp10 d2 = ja8.d(dt1.a.b, false);
                int m3 = n34.m(M);
                sy90 D2 = M.D();
                q630 c3 = qri.c(M, H);
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
                k9q0.w(M, d2, cVar2);
                k9q0.w(M, D2, eVar);
                if (M.L() || !epx.f(M.x(), Integer.valueOf(m3))) {
                    kr.a(m3, M, m3, bVar);
                }
                k9q0.w(M, c3, dVar);
                int i4 = i3 << 3;
                n(txj0.s(aVar2, vuo0.t, vuo0.s), tuo0Var, yto0Var, M, (i4 & 896) | (i4 & 112) | 6);
                M.G();
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xw5(tuo0Var, yto0Var, i2, 5);
        }
    }

    public static final void n(q630 q630Var, tuo0 tuo0Var, yto0 yto0Var, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1898918107);
        if ((i2 & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? M.J(tuo0Var) : M.y(tuo0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(yto0Var) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1898918107, i3, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1252)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = f.a;
                M.R(x);
            }
            quj qujVar = (quj) p6j0.a(vuo0.k, M);
            quj b2 = p6j0.b(qujVar);
            qco qcoVar = x5j0.i;
            i(q630Var, tuo0Var, yto0Var, (cp10) x, b2, quj.c(qujVar, qcoVar, qcoVar, null, null, 12), M, (i3 & 896) | (i3 & 14) | 3072 | (i3 & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ni1(q630Var, tuo0Var, yto0Var, i2);
        }
    }

    public static final void o(int i2, androidx.compose.runtime.a aVar, qw1 qw1Var, q630 q630Var, yto0 yto0Var, boolean z) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(1249591487);
        if ((i2 & 6) == 0) {
            i3 = (M.y(qw1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(yto0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.l(z) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            M.V();
            if ((i2 & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1249591487, i3, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:957)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new zsw(26);
                M.R(x);
            }
            q630 b2 = egi0.b(q630Var, false, (izs) x);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int m2 = n34.m(M);
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m2))) {
                kr.a(m2, M, m2, bVar);
            }
            k9q0.w(M, c2, cri.a.d);
            m(qw1Var, yto0Var, M, (i3 & 14) | ((i3 >> 3) & 112));
            float f2 = c;
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, f2), M, 6);
            c(((i3 << 3) & 112) | 6 | (i3 & 896) | (i3 & 7168), M, qw1Var, txj0.q(aVar3, vuo0.b), yto0Var, z);
            if (xga0.c(aVar3, d, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new e74(i2, qw1Var, q630Var, yto0Var, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(qw1 qw1Var, float f2, float f3, float f4, boolean z, long j2, iq2 iq2Var, ContinuationImpl continuationImpl) {
        quo0 quo0Var;
        quo0 quo0Var2;
        CoroutineSingletons coroutineSingletons;
        int i2;
        float f5;
        float rint;
        boolean z2;
        int i3;
        qw1 qw1Var2;
        boolean z3;
        if (continuationImpl instanceof quo0) {
            quo0Var = (quo0) continuationImpl;
            int i4 = quo0Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                quo0Var.label = i4 - Integer.MIN_VALUE;
                quo0Var2 = quo0Var;
                Object obj = quo0Var2.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = quo0Var2.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    float atan2 = ((float) Math.atan2(f3 - ((int) (j2 & 4294967295L)), f2 - ((int) (j2 >> 32)))) - 1.5707964f;
                    if (atan2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        atan2 += 6.2831855f;
                    }
                    if (qw1Var.a.a() == 1) {
                        f5 = 0.10471976f;
                        rint = ((float) Math.rint((atan2 / 0.10471976f) / 5.0f)) * 5.0f;
                    } else {
                        f5 = 0.5235988f;
                        rint = (float) Math.rint(atan2 / 0.5235988f);
                    }
                    float f6 = rint * f5;
                    s(qw1Var, f2, f3, f4, j2);
                    quo0Var2.L$0 = qw1Var;
                    z2 = z;
                    quo0Var2.Z$0 = z2;
                    quo0Var2.label = 1;
                    qw1Var.b.a = Boolean.FALSE;
                    i3 = 1;
                    Object b2 = qw1Var.g.b(MutatePriority.UserInput, new pw1(qw1Var, f6, true, iq2Var, null), quo0Var2);
                    if (b2 != coroutineSingletons) {
                        b2 = s3q0.a;
                    }
                    if (b2 != coroutineSingletons) {
                        qw1Var2 = qw1Var;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z3 = quo0Var2.Z$0;
                    qw1Var2 = (qw1) quo0Var2.L$0;
                    kotlin.a.a(obj);
                    i3 = 1;
                    z2 = z3;
                    if (z2) {
                        qw1Var2.d(i3);
                    }
                    return s3q0.a;
                }
                boolean z4 = quo0Var2.Z$0;
                qw1Var2 = (qw1) quo0Var2.L$0;
                kotlin.a.a(obj);
                z2 = z4;
                i3 = 1;
                if (qw1Var2.a.a() == 0 && z2) {
                    quo0Var2.L$0 = qw1Var2;
                    quo0Var2.Z$0 = z2;
                    quo0Var2.label = 2;
                    if (qsl.b(100L, quo0Var2) != coroutineSingletons) {
                        z3 = z2;
                        z2 = z3;
                    }
                    return coroutineSingletons;
                }
                if (z2) {
                }
                return s3q0.a;
            }
        }
        quo0Var = new quo0(continuationImpl);
        quo0Var2 = quo0Var;
        Object obj2 = quo0Var2.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = quo0Var2.label;
        if (i2 != 0) {
        }
        if (qw1Var2.a.a() == 0) {
            quo0Var2.L$0 = qw1Var2;
            quo0Var2.Z$0 = z2;
            quo0Var2.label = 2;
            if (qsl.b(100L, quo0Var2) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (z2) {
        }
        return s3q0.a;
    }

    public static final long q(qw1 qw1Var) {
        float i2;
        float f2;
        float i3 = (vuo0.g / 2.0f) * (qw1Var.i() / vuo0.b);
        tuo0 tuo0Var = qw1Var.a;
        if (tuo0Var.g() && r(qw1Var) && tuo0Var.a() == 0) {
            i2 = qw1Var.i();
            f2 = b;
        } else {
            i2 = qw1Var.i();
            f2 = a;
        }
        float f3 = ((pco) swe0.c(new pco((i2 * f2) - i3), new pco(0))).b + i3;
        float f4 = 2;
        float i4 = (qw1Var.i() / f4) + (((float) Math.cos(qw1Var.f.d().floatValue())) * f3);
        float i5 = (qw1Var.i() / f4) + (f3 * ((float) Math.sin(qw1Var.f.d().floatValue())));
        return (Float.floatToRawIntBits(i4) << 32) | (Float.floatToRawIntBits(i5) & 4294967295L);
    }

    public static final boolean r(tuo0 tuo0Var) {
        return tuo0Var.c() >= 12;
    }

    public static final void s(tuo0 tuo0Var, float f2, float f3, float f4, long j2) {
        if (tuo0Var.a() == 0 && tuo0Var.g()) {
            float hypot = (float) Math.hypot(((int) (j2 >> 32)) - f2, ((int) (j2 & 4294967295L)) - f3);
            if (r(tuo0Var)) {
                tuo0Var.e(tuo0Var.c() - (hypot >= f4 ? 12 : 0));
            } else {
                tuo0Var.e(tuo0Var.c() + (hypot < f4 ? 12 : 0));
            }
        }
    }

    public static final String t(int i2, int i3, androidx.compose.runtime.a aVar, boolean z) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(194237364, 0, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:2019)");
        }
        int i4 = i2 == 1 ? R.string.m3c_time_picker_minute_suffix : z ? R.string.m3c_time_picker_hour_24h_suffix : R.string.m3c_time_picker_hour_suffix;
        Object[] objArr = {Integer.valueOf(i3)};
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1427268608, 0, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:38)");
        }
        String b2 = e7b0.b(i4, aVar);
        Locale locale = hyi.a((Configuration) aVar.r(AndroidCompositionLocals_androidKt.a)).a.a.get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Object[] copyOf = Arrays.copyOf(objArr, 1);
        String format = String.format(locale, b2, Arrays.copyOf(copyOf, copyOf.length));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return format;
    }
}
