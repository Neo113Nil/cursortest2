package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DateRangePicker.kt */
/* loaded from: classes11.dex */
public final class x0l {
    public static final u890 b;
    public static final u890 c;
    public static final u890 a = s200.n(24, 20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 4);
    public static final float d = 60;

    /* compiled from: DateRangePicker.kt */
    @b6l(c = "androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$1$1", f = "DateRangePicker.kt", l = {775}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ int $monthIndex;
        final /* synthetic */ xvy $monthsListState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, spj spjVar, xvy xvyVar) {
            super(2, spjVar);
            this.$monthsListState = xvyVar;
            this.$monthIndex = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$monthIndex, spjVar, this.$monthsListState);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                int h = this.$monthsListState.h();
                int i2 = this.$monthIndex;
                if (h != i2) {
                    xvy xvyVar = this.$monthsListState;
                    this.label = 1;
                    if (xvyVar.k(i2, 0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    /* compiled from: DateRangePicker.kt */
    public static final class b implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ Long b;
        public final /* synthetic */ Long c;
        public final /* synthetic */ wzs<Long, Long, s3q0> d;
        public final /* synthetic */ xvy e;
        public final /* synthetic */ k9x f;
        public final /* synthetic */ wz8 g;
        public final /* synthetic */ zz8 h;
        public final /* synthetic */ nyk i;
        public final /* synthetic */ vxk j;
        public final /* synthetic */ rz8 k;
        public final /* synthetic */ eai0 l;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Long l, Long l2, wzs<? super Long, ? super Long, s3q0> wzsVar, xvy xvyVar, k9x k9xVar, wz8 wz8Var, zz8 zz8Var, nyk nykVar, vxk vxkVar, rz8 rz8Var, eai0 eai0Var) {
            this.b = l;
            this.c = l2;
            this.d = wzsVar;
            this.e = xvyVar;
            this.f = k9xVar;
            this.g = wz8Var;
            this.h = zz8Var;
            this.i = nykVar;
            this.j = vxkVar;
            this.k = rz8Var;
            this.l = eai0Var;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1090773432, intValue, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:822)");
                }
                Object x = aVar2.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = bap.j(EmptyCoroutineContext.b, aVar2);
                    aVar2.R(x);
                }
                yvj yvjVar = (yvj) x;
                String b = e7b0.b(R.string.m3c_date_range_picker_scroll_to_previous_month, aVar2);
                String b2 = e7b0.b(R.string.m3c_date_range_picker_scroll_to_next_month, aVar2);
                Long l = this.b;
                boolean J = aVar2.J(l);
                Long l2 = this.c;
                boolean J2 = J | aVar2.J(l2);
                wzs<Long, Long, s3q0> wzsVar = this.d;
                boolean J3 = J2 | aVar2.J(wzsVar);
                Object x2 = aVar2.x();
                if (J3 || x2 == c0012a) {
                    x2 = new yf7(l, l2, wzsVar, 4);
                    aVar2.R(x2);
                }
                final izs izsVar = (izs) x2;
                xvy xvyVar = this.e;
                final List l3 = e43.l(new fmk(b, new pk(7, xvyVar, yvjVar)), new fmk(b2, new qk(8, xvyVar, yvjVar)));
                Object x3 = aVar2.x();
                if (x3 == c0012a) {
                    x3 = new gt(16);
                    aVar2.R(x3);
                }
                q630 b3 = egi0.b(q630.a.a, false, (izs) x3);
                boolean y = aVar2.y(this.f) | aVar2.y(this.g) | aVar2.J(this.h) | aVar2.y(this.i) | aVar2.y(l3) | aVar2.J(this.j) | aVar2.J(l) | aVar2.J(l2) | aVar2.J(izsVar) | aVar2.J(this.k) | aVar2.J(this.l);
                Object x4 = aVar2.x();
                if (y || x4 == c0012a) {
                    final k9x k9xVar = this.f;
                    final wz8 wz8Var = this.g;
                    final zz8 zz8Var = this.h;
                    final Long l4 = this.b;
                    final Long l5 = this.c;
                    final rz8 rz8Var = this.k;
                    final nyk nykVar = this.i;
                    final eai0 eai0Var = this.l;
                    final vxk vxkVar = this.j;
                    izs izsVar2 = new izs() { // from class: xsna.z0l
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            float f = lzk.a;
                            k9x k9xVar2 = k9x.this;
                            nvy.c((nvy) obj, ((k9xVar2.c - k9xVar2.b) + 1) * 12, null, new jai(682334170, new b1l(wz8Var, zz8Var, l4, l5, izsVar, rz8Var, nykVar, eai0Var, vxkVar, l3), true), 6);
                            return s3q0.a;
                        }
                    };
                    aVar2.R(izsVar2);
                    x4 = izsVar2;
                }
                lqy.a(b3, this.e, null, null, null, null, false, null, (izs) x4, aVar2, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @b6l(c = "androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1", f = "DateRangePicker.kt", l = {901}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wz8 $calendarModel;
        final /* synthetic */ xvy $lazyListState;
        final /* synthetic */ izs<Long, s3q0> $onDisplayedMonthChange;
        final /* synthetic */ k9x $yearRange;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(xvy xvyVar, izs<? super Long, s3q0> izsVar, wz8 wz8Var, k9x k9xVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$lazyListState = xvyVar;
            this.$onDisplayedMonthChange = izsVar;
            this.$calendarModel = wz8Var;
            this.$yearRange = k9xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$lazyListState, this.$onDisplayedMonthChange, this.$calendarModel, this.$yearRange, spjVar);
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
                xvy xvyVar = this.$lazyListState;
                izs<Long, s3q0> izsVar = this.$onDisplayedMonthChange;
                wz8 wz8Var = this.$calendarModel;
                k9x k9xVar = this.$yearRange;
                this.label = 1;
                float f = lzk.a;
                Object collect = nr2.M(new trf(xvyVar, 15)).collect(new yzk(xvyVar, izsVar, wz8Var, k9xVar), this);
                if (collect != coroutineSingletons) {
                    collect = s3q0.a;
                }
                if (collect == coroutineSingletons) {
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

    static {
        float f = 64;
        float f2 = 12;
        b = s200.n(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
        c = s200.n(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, 2);
    }

    public static final void a(final e1l e1lVar, q630 q630Var, nyk nykVar, vxk vxkVar, wzs wzsVar, wzs wzsVar2, boolean z, rwr rwrVar, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        final nyk nykVar2;
        final vxk vxkVar2;
        final wzs wzsVar3;
        final wzs wzsVar4;
        final boolean z2;
        final rwr rwrVar2;
        nyk nykVar3;
        wzs c2;
        rwr rwrVar3;
        q630 q630Var3;
        boolean z3;
        vxk vxkVar3;
        int i2;
        wzs wzsVar5;
        jai jaiVar;
        androidx.compose.runtime.a M = aVar.M(1969726368);
        int i3 = i | (M.J(e1lVar) ? 4 : 2) | 14378160;
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            M.V();
            int i4 = i & 1;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i4 == 0 || M.i()) {
                Object x = M.x();
                if (x == c0012a) {
                    ayk aykVar = ayk.a;
                    x = new oyk();
                    M.R(x);
                }
                nykVar3 = (nyk) x;
                ayk aykVar2 = ayk.a;
                vxk c3 = ayk.c(6, M);
                int i5 = i3 & (-8065);
                jai c4 = kai.c(-803011924, new t0l(e1lVar, c3), M);
                c2 = kai.c(-331385278, new u0l(e1lVar, nykVar3, c3), M);
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new rwr();
                    M.R(x2);
                }
                rwrVar3 = (rwr) x2;
                q630Var3 = q630.a.a;
                z3 = true;
                vxkVar3 = c3;
                i2 = i5;
                wzsVar5 = c4;
            } else {
                M.h();
                q630Var3 = q630Var;
                nykVar3 = nykVar;
                vxkVar3 = vxkVar;
                c2 = wzsVar2;
                z3 = z;
                rwrVar3 = rwrVar;
                i2 = i3 & (-8065);
                wzsVar5 = wzsVar;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1969726368, i2, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
            }
            boolean J = M.J(e1lVar.b);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = e1lVar.c;
                M.R(x3);
            }
            wz8 wz8Var = (wz8) x3;
            if (z3) {
                M.K(-2018438858);
                jaiVar = kai.c(1343236786, new v0l(e1lVar, vxkVar3), M);
                M.j();
            } else {
                M.K(-2018051234);
                M.j();
                jaiVar = null;
            }
            nyk nykVar4 = nykVar3;
            rwr rwrVar4 = rwrVar3;
            wzs wzsVar6 = c2;
            q630 q630Var4 = q630Var3;
            lzk.a(q630Var4, wzsVar5, wzsVar6, jaiVar, vxkVar3, evp0.a(zzk.x, M), zzk.w - d, kai.c(684885105, new w0l(e1lVar, wz8Var, nykVar4, vxkVar3, rwrVar4), M), M, 14156214);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            wzsVar4 = wzsVar6;
            vxkVar2 = vxkVar3;
            z2 = z3;
            nykVar2 = nykVar4;
            rwrVar2 = rwrVar4;
            wzsVar3 = wzsVar5;
            q630Var2 = q630Var4;
        } else {
            M.h();
            q630Var2 = q630Var;
            nykVar2 = nykVar;
            vxkVar2 = vxkVar;
            wzsVar3 = wzsVar;
            wzsVar4 = wzsVar2;
            z2 = z;
            rwrVar2 = rwrVar;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(q630Var2, nykVar2, vxkVar2, wzsVar3, wzsVar4, z2, rwrVar2, i) { // from class: xsna.p0l
                public final /* synthetic */ q630 c;
                public final /* synthetic */ nyk d;
                public final /* synthetic */ vxk e;
                public final /* synthetic */ wzs f;
                public final /* synthetic */ wzs g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ rwr i;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    x0l.a(e1l.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final Long l, final Long l2, final long j, final wzs<? super Long, ? super Long, s3q0> wzsVar, final izs<? super Long, s3q0> izsVar, final wz8 wz8Var, final k9x k9xVar, final nyk nykVar, final eai0 eai0Var, final vxk vxkVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-787063721);
        int i2 = i | (M.J(l) ? 4 : 2) | (M.J(l2) ? 32 : 16) | (M.p(j) ? 256 : 128) | (M.y(wzsVar) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192) | (M.y(wz8Var) ? 131072 : 65536) | (M.y(k9xVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(nykVar) ? 8388608 : 4194304) | (M.J(eai0Var) ? 67108864 : 33554432) | (M.J(vxkVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if (M.t(i2 & 1, (306783379 & i2) != 306783378)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-787063721, i2, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:764)");
            }
            zz8 f = wz8Var.f(j);
            int i3 = (((f.a - k9xVar.b) * 12) + f.b) - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            xvy a2 = zvy.a(i3, 2, M);
            Integer valueOf = Integer.valueOf(i3);
            boolean J = M.J(a2) | M.o(i3);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new a(i3, null, a2);
                M.R(x);
            }
            bap.g(valueOf, (wzs) x, M, 0);
            q630 F = s200.F(lzk.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int m = n34.m(M);
            sy90 D = M.D();
            q630 c2 = qri.c(M, F);
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
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m))) {
                kr.a(m, M, m, bVar);
            }
            k9q0.w(M, c2, cri.a.d);
            lzk.l(vxkVar, wz8Var, M, ((i2 >> 27) & 14) | ((i2 >> 12) & 112));
            d(a2, l, l2, wzsVar, izsVar, wz8Var, k9xVar, nykVar, eai0Var, vxkVar, M, ((i2 << 3) & 1008) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (234881024 & i2) | (i2 & 1879048192));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(l, l2, j, wzsVar, izsVar, wz8Var, k9xVar, nykVar, eai0Var, vxkVar, i) { // from class: xsna.r0l
                public final /* synthetic */ Long b;
                public final /* synthetic */ Long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ wzs e;
                public final /* synthetic */ izs f;
                public final /* synthetic */ wz8 g;
                public final /* synthetic */ k9x h;
                public final /* synthetic */ nyk i;
                public final /* synthetic */ eai0 j;
                public final /* synthetic */ vxk k;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    x0l.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final Long l, final Long l2, final long j, final int i, final wzs wzsVar, final izs izsVar, final wz8 wz8Var, final k9x k9xVar, final nyk nykVar, final eai0 eai0Var, final vxk vxkVar, final rwr rwrVar, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a M = aVar.M(621028059);
        int i3 = i2 | (M.J(l) ? 4 : 2) | (M.J(l2) ? 32 : 16) | (M.p(j) ? 256 : 128) | (M.o(i) ? 2048 : 1024) | (M.y(wzsVar) ? 16384 : 8192) | (M.y(izsVar) ? 131072 : 65536) | (M.y(wz8Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(k9xVar) ? 8388608 : 4194304) | (M.J(nykVar) ? 67108864 : 33554432) | (M.J(eai0Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i4 = (M.J(vxkVar) ? 4 : 2) | (M.J(rwrVar) ? 32 : 16);
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(621028059, i3, i4, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:708)");
            }
            phr a2 = lb30.a(MotionSchemeKeyTokens.FastEffects, M);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new ci3(21);
                M.R(x);
            }
            ijk.a(new efn(i), egi0.b(q630.a.a, false, (izs) x), a2, null, kai.c(-773828161, new y0l(l, l2, j, wzsVar, izsVar, wz8Var, k9xVar, nykVar, eai0Var, vxkVar, rwrVar), M), M, ((i3 >> 9) & 14) | 24576, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(l, l2, j, i, wzsVar, izsVar, wz8Var, k9xVar, nykVar, eai0Var, vxkVar, rwrVar, i2) { // from class: xsna.q0l
                public final /* synthetic */ Long b;
                public final /* synthetic */ Long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ int e;
                public final /* synthetic */ wzs f;
                public final /* synthetic */ izs g;
                public final /* synthetic */ wz8 h;
                public final /* synthetic */ k9x i;
                public final /* synthetic */ nyk j;
                public final /* synthetic */ eai0 k;
                public final /* synthetic */ vxk l;
                public final /* synthetic */ rwr m;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    x0l.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(xvy xvyVar, final Long l, final Long l2, final wzs<? super Long, ? super Long, s3q0> wzsVar, final izs<? super Long, s3q0> izsVar, final wz8 wz8Var, final k9x k9xVar, final nyk nykVar, final eai0 eai0Var, final vxk vxkVar, androidx.compose.runtime.a aVar, final int i) {
        Long l3;
        Object cVar;
        final xvy xvyVar2 = xvyVar;
        androidx.compose.runtime.a M = aVar.M(1257365001);
        int i2 = (M.J(xvyVar2) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= M.J(l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            l3 = l2;
            i2 |= M.J(l3) ? 256 : 128;
        } else {
            l3 = l2;
        }
        int i3 = i2 | (M.y(wzsVar) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192) | (M.y(wz8Var) ? 131072 : 65536) | (M.y(k9xVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(nykVar) ? 8388608 : 4194304) | (M.J(eai0Var) ? 67108864 : 33554432) | (M.J(vxkVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if (M.t(i3 & 1, (306783379 & i3) != 306783378)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1257365001, i3, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:812)");
            }
            rz8 h = wz8Var.h();
            boolean J = M.J(k9xVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = wz8Var.e(k9xVar.b, 1);
                M.R(x);
            }
            cjo0.a(evp0.a(zzk.h, M), kai.c(1090773432, new b(l, l3, wzsVar, xvyVar2, k9xVar, wz8Var, (zz8) x, nykVar, vxkVar, h, eai0Var), M), M, 48);
            int i4 = i3 & 14;
            boolean y = (i4 == 4) | ((i3 & 57344) == 16384) | M.y(wz8Var) | M.y(k9xVar);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                xvyVar2 = xvyVar;
                cVar = new c(xvyVar2, izsVar, wz8Var, k9xVar, null);
                M.R(cVar);
            } else {
                cVar = x2;
                xvyVar2 = xvyVar;
            }
            bap.g(xvyVar2, (wzs) cVar, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.s0l
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x0l.d(xvy.this, l, l2, wzsVar, izsVar, wz8Var, k9xVar, nykVar, eai0Var, vxkVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
