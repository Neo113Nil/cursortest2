package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.chromium.base.TimeUtils;
import xsna.cri;
import xsna.dt1;
import xsna.efu;
import xsna.imw;
import xsna.q630;
import xsna.qq90;
import xsna.ty6;
import xsna.x9k0;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public final class lzk {
    public static final float a = 48;
    public static final float b = 56;
    public static final float c;
    public static final u890 d;
    public static final u890 e;
    public static final u890 f;
    public static final float g;

    /* compiled from: DatePicker.kt */
    @b6l(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$1", f = "DatePicker.kt", l = {1552}, m = "invokeSuspend")
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
                if (!this.$monthsListState.j.a()) {
                    int h = this.$monthsListState.h();
                    int i2 = this.$monthIndex;
                    if (h != i2) {
                        xvy xvyVar = this.$monthsListState;
                        this.label = 1;
                        if (xvyVar.k(i2, 0, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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

    /* compiled from: DatePicker.kt */
    @b6l(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1$1", f = "DatePicker.kt", l = {1572}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ xvy $monthsListState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xvy xvyVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$monthsListState = xvyVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$monthsListState, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    xvy xvyVar = this.$monthsListState;
                    int h = xvyVar.h() + 1;
                    this.label = 1;
                    if (xvyVar.f(h, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
            } catch (IllegalArgumentException unused) {
            }
            return s3q0.a;
        }
    }

    /* compiled from: DatePicker.kt */
    @b6l(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1", f = "DatePicker.kt", l = {1584}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ xvy $monthsListState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xvy xvyVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$monthsListState = xvyVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$monthsListState, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    xvy xvyVar = this.$monthsListState;
                    int h = xvyVar.h() - 1;
                    this.label = 1;
                    if (xvyVar.f(h, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
            } catch (IllegalArgumentException unused) {
            }
            return s3q0.a;
        }
    }

    /* compiled from: DatePicker.kt */
    public static final class d implements yzs<om2, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ long b;
        public final /* synthetic */ wh50<Boolean> c;
        public final /* synthetic */ yvj d;
        public final /* synthetic */ xvy e;
        public final /* synthetic */ k9x f;
        public final /* synthetic */ zz8 g;
        public final /* synthetic */ eai0 h;
        public final /* synthetic */ wz8 i;
        public final /* synthetic */ vxk j;

        public d(long j, wh50<Boolean> wh50Var, yvj yvjVar, xvy xvyVar, k9x k9xVar, zz8 zz8Var, eai0 eai0Var, wz8 wz8Var, vxk vxkVar) {
            this.b = j;
            this.c = wh50Var;
            this.d = yvjVar;
            this.e = xvyVar;
            this.f = k9xVar;
            this.g = zz8Var;
            this.h = eai0Var;
            this.i = wz8Var;
            this.j = vxkVar;
        }

        @Override // xsna.yzs
        public final s3q0 invoke(om2 om2Var, androidx.compose.runtime.a aVar, Integer num) {
            k9x k9xVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1193716082, intValue, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1632)");
            }
            String b = e7b0.b(R.string.m3c_date_picker_year_picker_pane_title, aVar2);
            boolean J = aVar2.J(b);
            Object x = aVar2.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new bsf(b, 1);
                aVar2.R(x);
            }
            q630.a aVar3 = q630.a.a;
            q630 b2 = egi0.b(aVar3, false, (izs) x);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
            int m = n34.m(aVar2);
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, b2);
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
            q630 F = s200.F(lzk.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.k(aVar3, (lzk.a * 7) - srn.a));
            final wh50<Boolean> wh50Var = this.c;
            boolean J2 = aVar2.J(wh50Var);
            final yvj yvjVar = this.d;
            boolean y = J2 | aVar2.y(yvjVar);
            final xvy xvyVar = this.e;
            boolean J3 = y | aVar2.J(xvyVar);
            final k9x k9xVar2 = this.f;
            boolean y2 = J3 | aVar2.y(k9xVar2);
            final zz8 zz8Var = this.g;
            boolean J4 = y2 | aVar2.J(zz8Var);
            Object x2 = aVar2.x();
            if (J4 || x2 == c0012a) {
                izs izsVar = new izs() { // from class: xsna.mzk
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        int intValue2 = ((Integer) obj).intValue();
                        float f = lzk.a;
                        wh50Var.setValue(Boolean.valueOf(!((Boolean) r7.getValue()).booleanValue()));
                        myc0.h(yvj.this, null, null, new nzk(xvyVar, intValue2, k9xVar2, zz8Var, null), 3);
                        return s3q0.a;
                    }
                };
                k9xVar = k9xVar2;
                aVar2.R(izsVar);
                x2 = izsVar;
            } else {
                k9xVar = k9xVar2;
            }
            long j = this.b;
            eai0 eai0Var = this.h;
            wz8 wz8Var = this.i;
            vxk vxkVar = this.j;
            lzk.n(F, j, (izs) x2, eai0Var, wz8Var, k9xVar, vxkVar, aVar2, 6);
            csn.a(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, vxkVar.x, aVar2, 0);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return s3q0.a;
        }
    }

    /* compiled from: DatePicker.kt */
    public static final class e implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ int b;
        public final /* synthetic */ izs<efn, s3q0> c;
        public final /* synthetic */ q630 d;

        public e(izs izsVar, q630 q630Var, int i) {
            this.b = i;
            this.c = izsVar;
            this.d = q630Var;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1734512197, intValue, -1, "androidx.compose.material3.DisplayModeToggleButton.<anonymous> (DatePicker.kt:1408)");
                }
                int i = this.b;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                izs<efn, s3q0> izsVar = this.c;
                if (i == 0) {
                    aVar2.K(-101264927);
                    imw imwVar = mrv.a;
                    if (imwVar == null) {
                        imw.a aVar3 = new imw.a("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        EmptyList emptyList = jlr0.a;
                        rek0 rek0Var = new rek0(l5g.b);
                        dq90 dq90Var = new dq90();
                        dq90Var.f(3.0f, 17.25f);
                        qq90.s sVar = new qq90.s(21.0f);
                        ArrayList<qq90> arrayList = dq90Var.a;
                        arrayList.add(sVar);
                        dq90Var.c(3.75f);
                        dq90Var.d(17.81f, 9.94f);
                        dq90Var.e(-3.75f, -3.75f);
                        dq90Var.d(3.0f, 17.25f);
                        dq90Var.a();
                        dq90Var.f(20.71f, 7.04f);
                        dq90Var.b(0.39f, -0.39f, 0.39f, -1.02f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.41f);
                        dq90Var.e(-2.34f, -2.34f);
                        dq90Var.b(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        dq90Var.e(-1.83f, 1.83f);
                        dq90Var.e(3.75f, 3.75f);
                        dq90Var.e(1.83f, -1.83f);
                        dq90Var.a();
                        imw.a.a(aVar3, arrayList, rek0Var);
                        imwVar = aVar3.b();
                        mrv.a = imwVar;
                    }
                    String b = e7b0.b(R.string.m3c_date_picker_switch_to_input_mode, aVar2);
                    boolean J = aVar2.J(izsVar);
                    Object x = aVar2.x();
                    if (J || x == c0012a) {
                        x = new o2h(izsVar, 1);
                        aVar2.R(x);
                    }
                    lzk.h((gzs) x, imwVar, b, this.d, false, aVar2, 0, 16);
                    aVar2.j();
                } else {
                    aVar2.K(-100967048);
                    imw imwVar2 = mrv.b;
                    if (imwVar2 == null) {
                        imw.a aVar4 = new imw.a("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        EmptyList emptyList2 = jlr0.a;
                        rek0 rek0Var2 = new rek0(l5g.b);
                        dq90 dq90Var2 = new dq90();
                        dq90Var2.f(9.0f, 11.0f);
                        dq90Var2.d(7.0f, 11.0f);
                        dq90Var2.g(2.0f);
                        dq90Var2.c(2.0f);
                        dq90Var2.g(-2.0f);
                        dq90Var2.a();
                        dq90Var2.f(13.0f, 11.0f);
                        dq90Var2.c(-2.0f);
                        dq90Var2.g(2.0f);
                        dq90Var2.c(2.0f);
                        dq90Var2.g(-2.0f);
                        dq90Var2.a();
                        dq90Var2.f(17.0f, 11.0f);
                        dq90Var2.c(-2.0f);
                        dq90Var2.g(2.0f);
                        dq90Var2.c(2.0f);
                        dq90Var2.g(-2.0f);
                        dq90Var2.a();
                        dq90Var2.f(19.0f, 4.0f);
                        dq90Var2.c(-1.0f);
                        dq90Var2.d(18.0f, 2.0f);
                        dq90Var2.c(-2.0f);
                        dq90Var2.g(2.0f);
                        dq90Var2.d(8.0f, 4.0f);
                        dq90Var2.d(8.0f, 2.0f);
                        dq90Var2.d(6.0f, 2.0f);
                        dq90Var2.g(2.0f);
                        dq90Var2.d(5.0f, 4.0f);
                        dq90Var2.b(-1.11f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.99f, 0.9f, -1.99f, 2.0f);
                        dq90Var2.d(3.0f, 20.0f);
                        dq90Var2.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                        dq90Var2.c(14.0f);
                        dq90Var2.b(1.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, -0.9f, 2.0f, -2.0f);
                        dq90Var2.d(21.0f, 6.0f);
                        dq90Var2.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        dq90Var2.a();
                        dq90Var2.f(19.0f, 20.0f);
                        dq90Var2.d(5.0f, 20.0f);
                        dq90Var2.d(5.0f, 9.0f);
                        dq90Var2.c(14.0f);
                        dq90Var2.g(11.0f);
                        dq90Var2.a();
                        imw.a.a(aVar4, dq90Var2.a, rek0Var2);
                        imwVar2 = aVar4.b();
                        mrv.b = imwVar2;
                    }
                    String b2 = e7b0.b(R.string.m3c_date_picker_switch_to_calendar_mode, aVar2);
                    boolean J2 = aVar2.J(izsVar);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new ega(izsVar, 2);
                        aVar2.R(x2);
                    }
                    lzk.h((gzs) x2, imwVar2, b2, this.d, false, aVar2, 0, 16);
                    aVar2.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: DatePicker.kt */
    public static final class f implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ xvy b;
        public final /* synthetic */ k9x c;
        public final /* synthetic */ wz8 d;
        public final /* synthetic */ zz8 e;
        public final /* synthetic */ izs<Long, s3q0> f;
        public final /* synthetic */ rz8 g;
        public final /* synthetic */ Long h;
        public final /* synthetic */ nyk i;
        public final /* synthetic */ eai0 j;
        public final /* synthetic */ vxk k;

        /* JADX WARN: Multi-variable type inference failed */
        public f(xvy xvyVar, k9x k9xVar, wz8 wz8Var, zz8 zz8Var, izs<? super Long, s3q0> izsVar, rz8 rz8Var, Long l, nyk nykVar, eai0 eai0Var, vxk vxkVar) {
            this.b = xvyVar;
            this.c = k9xVar;
            this.d = wz8Var;
            this.e = zz8Var;
            this.f = izsVar;
            this.g = rz8Var;
            this.h = l;
            this.i = nykVar;
            this.j = eai0Var;
            this.k = vxkVar;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1504086906, intValue, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous> (DatePicker.kt:1721)");
                }
                Object x = aVar2.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = new b40(14);
                    aVar2.R(x);
                }
                q630 b = egi0.b(q630.a.a, false, (izs) x);
                ayk aykVar = ayk.a;
                m7l k = fto0.k();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2036003494, 384, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:741)");
                }
                phr a = lb30.a(MotionSchemeKeyTokens.DefaultEffects, aVar2);
                boolean J = aVar2.J(k);
                xvy xvyVar = this.b;
                boolean J2 = J | aVar2.J(xvyVar);
                Object x2 = aVar2.x();
                if (J2 || x2 == c0012a) {
                    byk bykVar = new byk(new qvy(xvyVar, x9k0.a.a));
                    float f = r9k0.a;
                    m9k0 m9k0Var = new m9k0(bykVar, k, a);
                    aVar2.R(m9k0Var);
                    x2 = m9k0Var;
                }
                h4o0 h4o0Var = (h4o0) x2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                boolean y = aVar2.y(this.c) | aVar2.y(this.d) | aVar2.J(this.e) | aVar2.J(this.f) | aVar2.J(this.g) | aVar2.J(this.h) | aVar2.y(this.i) | aVar2.J(this.j) | aVar2.J(this.k);
                Object x3 = aVar2.x();
                if (y || x3 == c0012a) {
                    final k9x k9xVar = this.c;
                    final wz8 wz8Var = this.d;
                    final zz8 zz8Var = this.e;
                    final izs<Long, s3q0> izsVar = this.f;
                    final rz8 rz8Var = this.g;
                    final Long l = this.h;
                    final nyk nykVar = this.i;
                    final eai0 eai0Var = this.j;
                    final vxk vxkVar = this.k;
                    izs izsVar2 = new izs() { // from class: xsna.qzk
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            float f2 = lzk.a;
                            k9x k9xVar2 = k9x.this;
                            nvy.c((nvy) obj, ((k9xVar2.c - k9xVar2.b) + 1) * 12, null, new jai(72599078, new rzk(wz8Var, zz8Var, izsVar, rz8Var, l, nykVar, eai0Var, vxkVar), true), 6);
                            return s3q0.a;
                        }
                    };
                    aVar2.R(izsVar2);
                    x3 = izsVar2;
                }
                lqy.b(b, xvyVar, null, null, null, h4o0Var, false, null, (izs) x3, aVar2, 0, 444);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: DatePicker.kt */
    @b6l(c = "androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1", f = "DatePicker.kt", l = {1754}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wz8 $calendarModel;
        final /* synthetic */ xvy $lazyListState;
        final /* synthetic */ izs<Long, s3q0> $onDisplayedMonthChange;
        final /* synthetic */ k9x $yearRange;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(xvy xvyVar, izs<? super Long, s3q0> izsVar, wz8 wz8Var, k9x k9xVar, spj<? super g> spjVar) {
            super(2, spjVar);
            this.$lazyListState = xvyVar;
            this.$onDisplayedMonthChange = izsVar;
            this.$calendarModel = wz8Var;
            this.$yearRange = k9xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new g(this.$lazyListState, this.$onDisplayedMonthChange, this.$calendarModel, this.$yearRange, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((g) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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

    /* compiled from: DatePicker.kt */
    public static final class h implements yzs<b6p0, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ String b;

        public h(String str) {
            this.b = str;
        }

        @Override // xsna.yzs
        public final s3q0 invoke(b6p0 b6p0Var, androidx.compose.runtime.a aVar, Integer num) {
            b6p0 b6p0Var2 = b6p0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if ((intValue & 6) == 0) {
                intValue |= (intValue & 8) == 0 ? aVar2.J(b6p0Var2) : aVar2.y(b6p0Var2) ? 4 : 2;
            }
            if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-456272562, intValue, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous> (DatePicker.kt:2283)");
                }
                x5p0.a(b6p0Var2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1905952188, new szk(this.b), aVar2), aVar2, (intValue & 14) | 805306368);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: DatePicker.kt */
    public static final class i implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ gzs<s3q0> b;
        public final /* synthetic */ q630 c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ imw e;
        public final /* synthetic */ String f;

        public i(gzs<s3q0> gzsVar, q630 q630Var, boolean z, imw imwVar, String str) {
            this.b = gzsVar;
            this.c = q630Var;
            this.d = z;
            this.e = imwVar;
            this.f = str;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1124908186, intValue, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous> (DatePicker.kt:2286)");
                }
                opv.a(1572864, aVar2, kai.c(-1301085432, new tzk(this.e, this.f), aVar2), this.b, null, this.c, null, this.d);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: DatePicker.kt */
    public static final class j implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ String b;
        public final /* synthetic */ vxk c;

        public j(String str, vxk vxkVar) {
            this.b = str;
            this.c = vxkVar;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(619076006, intValue, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2204)");
                }
                String str = this.b;
                boolean J = aVar2.J(str);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new k17(str, 1);
                    aVar2.R(x);
                }
                cjo0.c(str, egi0.b(q630.a.a, false, (izs) x), this.c.f, 0L, 0L, null, 0L, 0, false, 0, 0, null, aVar2, 0, 0, 262136);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: DatePicker.kt */
    public static final class k implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ gzs<s3q0> b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ gzs<s3q0> d;
        public final /* synthetic */ boolean e;

        public k(gzs gzsVar, gzs gzsVar2, boolean z, boolean z2) {
            this.b = gzsVar;
            this.c = z;
            this.d = gzsVar2;
            this.e = z2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-128317193, intValue, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2220)");
                }
                a.l lVar = androidx.compose.foundation.layout.a.a;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, aVar2, 0);
                int m = n34.m(aVar2);
                sy90 D = aVar2.D();
                q630 c = qri.c(aVar2, q630.a.a);
                cri.h7.getClass();
                LayoutNode.a aVar3 = cri.a.b;
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar3);
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
                imw imwVar = lrv.a;
                if (imwVar == null) {
                    imw.a aVar4 = new imw.a("AutoMirrored.Filled.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                    EmptyList emptyList = jlr0.a;
                    rek0 rek0Var = new rek0(l5g.b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new qq90.f(15.41f, 16.59f));
                    arrayList.add(new qq90.e(10.83f, 12.0f));
                    arrayList.add(new qq90.m(4.58f, -4.59f));
                    arrayList.add(new qq90.e(14.0f, 6.0f));
                    arrayList.add(new qq90.m(-6.0f, 6.0f));
                    arrayList.add(new qq90.m(6.0f, 6.0f));
                    arrayList.add(new qq90.m(1.41f, -1.41f));
                    arrayList.add(qq90.b.c);
                    imw.a.a(aVar4, arrayList, rek0Var);
                    imwVar = aVar4.b();
                    lrv.a = imwVar;
                }
                lzk.h(this.b, imwVar, e7b0.b(R.string.m3c_date_picker_switch_to_previous_month, aVar2), null, this.c, aVar2, 0, 8);
                imw imwVar2 = lrv.b;
                if (imwVar2 == null) {
                    imw.a aVar5 = new imw.a("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                    EmptyList emptyList2 = jlr0.a;
                    rek0 rek0Var2 = new rek0(l5g.b);
                    ArrayList arrayList2 = new ArrayList(32);
                    arrayList2.add(new qq90.f(8.59f, 16.59f));
                    arrayList2.add(new qq90.e(13.17f, 12.0f));
                    arrayList2.add(new qq90.e(8.59f, 7.41f));
                    arrayList2.add(new qq90.e(10.0f, 6.0f));
                    arrayList2.add(new qq90.m(6.0f, 6.0f));
                    arrayList2.add(new qq90.m(-6.0f, 6.0f));
                    arrayList2.add(new qq90.m(-1.41f, -1.41f));
                    arrayList2.add(qq90.b.c);
                    imw.a.a(aVar5, arrayList2, rek0Var2);
                    imwVar2 = aVar5.b();
                    lrv.b = imwVar2;
                }
                lzk.h(this.d, imwVar2, e7b0.b(R.string.m3c_date_picker_switch_to_next_month, aVar2), null, this.e, aVar2, 0, 8);
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

    /* compiled from: DatePicker.kt */
    public static final class l implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ String b;
        public final /* synthetic */ vxk c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean f;

        public l(String str, vxk vxkVar, boolean z, boolean z2, boolean z3) {
            this.b = str;
            this.c = vxkVar;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-564400443, intValue, -1, "androidx.compose.material3.Year.<anonymous> (DatePicker.kt:2157)");
                }
                q630.a aVar3 = q630.a.a;
                q630 f = txj0.f(aVar3, 1.0f);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.f, false);
                int m = n34.m(aVar2);
                sy90 D = aVar2.D();
                q630 c = qri.c(aVar2, f);
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
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    x = new vr0(28);
                    aVar2.R(x);
                }
                q630 a = egi0.a(aVar3, (izs) x);
                vxk vxkVar = this.c;
                vxkVar.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(874111097, 0, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:1006)");
                }
                boolean z = this.e;
                boolean z2 = this.f;
                mtk0 b = lwj0.b((z && z2) ? vxkVar.j : (!z || z2) ? (this.d && z2) ? vxkVar.i : z2 ? vxkVar.g : vxkVar.h : vxkVar.k, lb30.a(MotionSchemeKeyTokens.DefaultEffects, aVar2), null, aVar2, 0, 12);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                cjo0.c(this.b, a, ((l5g) b.getValue()).a, 0L, 0L, new obo0(3), 0L, 0, false, 0, 0, null, aVar2, 0, 0, 261112);
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

    /* compiled from: DatePicker.kt */
    public static final class m implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ wz8 b;
        public final /* synthetic */ long c;
        public final /* synthetic */ k9x d;
        public final /* synthetic */ q630 e;
        public final /* synthetic */ vxk f;
        public final /* synthetic */ izs<Integer, s3q0> g;
        public final /* synthetic */ eai0 h;

        /* JADX WARN: Multi-variable type inference failed */
        public m(wz8 wz8Var, long j, k9x k9xVar, q630 q630Var, vxk vxkVar, izs<? super Integer, s3q0> izsVar, eai0 eai0Var) {
            this.b = wz8Var;
            this.c = j;
            this.d = k9xVar;
            this.e = q630Var;
            this.f = vxkVar;
            this.g = izsVar;
            this.h = eai0Var;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1301915789, intValue, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:2070)");
                }
                wz8 wz8Var = this.b;
                final int i = wz8Var.g(wz8Var.h()).a;
                final int i2 = wz8Var.f(this.c).a;
                k9x k9xVar = this.d;
                dsy a = gsy.a(Math.max(0, (i2 - k9xVar.b) - 3), 2, aVar2);
                efu.b bVar = new efu.b(3);
                vxk vxkVar = this.f;
                q630 m = hr80.m(this.e, vxkVar.a, androidx.compose.ui.graphics.e.a);
                a.i iVar = androidx.compose.foundation.layout.a.f;
                a.j g = androidx.compose.foundation.layout.a.g(lzk.g);
                boolean y = aVar2.y(wz8Var) | aVar2.y(k9xVar) | aVar2.o(i2) | aVar2.o(i) | aVar2.J(this.g) | aVar2.J(this.h) | aVar2.J(vxkVar);
                Object x = aVar2.x();
                if (y || x == a.C0011a.a) {
                    final k9x k9xVar2 = this.d;
                    final wz8 wz8Var2 = this.b;
                    final izs<Integer, s3q0> izsVar = this.g;
                    final eai0 eai0Var = this.h;
                    final vxk vxkVar2 = this.f;
                    izs izsVar2 = new izs() { // from class: xsna.vzk
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            k9x k9xVar3 = k9x.this;
                            rry.d((rry) obj, j5g.Q(k9xVar3), null, new jai(674613074, new wzk(k9xVar3, wz8Var2, i2, i, izsVar, eai0Var, vxkVar2), true), 14);
                            return s3q0.a;
                        }
                    };
                    aVar2.R(izsVar2);
                    x = izsVar2;
                }
                uqy.b(bVar, m, a, null, g, iVar, null, false, null, (izs) x, aVar2, 1769472, 0, 920);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    static {
        float f2 = 12;
        c = f2;
        d = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, 3);
        float f3 = 24;
        float f4 = 16;
        e = s200.n(f3, f4, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
        f = s200.n(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, 2);
        g = f4;
    }

    public static final void a(final q630 q630Var, final wzs wzsVar, final wzs wzsVar2, final wzs wzsVar3, final vxk vxkVar, final nmo0 nmo0Var, final float f2, final jai jaiVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        wzs wzsVar4;
        wzs wzsVar5;
        wzs wzsVar6;
        nmo0 nmo0Var2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1539132883);
        if ((i2 & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            wzsVar4 = wzsVar;
            i3 |= M.y(wzsVar4) ? 32 : 16;
        } else {
            wzsVar4 = wzsVar;
        }
        if ((i2 & 384) == 0) {
            wzsVar5 = wzsVar2;
            i3 |= M.y(wzsVar5) ? 256 : 128;
        } else {
            wzsVar5 = wzsVar2;
        }
        if ((i2 & 3072) == 0) {
            wzsVar6 = wzsVar3;
            i3 |= M.y(wzsVar6) ? 2048 : 1024;
        } else {
            wzsVar6 = wzsVar3;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.J(vxkVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            nmo0Var2 = nmo0Var;
            i3 |= M.J(nmo0Var2) ? 131072 : 65536;
        } else {
            nmo0Var2 = nmo0Var;
        }
        if ((1572864 & i2) == 0) {
            i3 |= M.n(f2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= M.y(jaiVar) ? 8388608 : 4194304;
        }
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1539132883, i3, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1351)");
            }
            q630 u = txj0.u(q630Var, zzk.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new n82(17);
                M.R(x);
            }
            q630 m2 = hr80.m(egi0.b(u, false, (izs) x), vxkVar.a, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int m3 = n34.m(M);
            sy90 D = M.D();
            q630 c2 = qri.c(M, m2);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m3))) {
                kr.a(m3, M, m3, bVar);
            }
            k9q0.w(M, c2, cri.a.d);
            nmo0 nmo0Var3 = nmo0Var2;
            int i4 = i3;
            d(wzsVar, vxkVar.b, vxkVar.c, f2, kai.c(-1658370654, new gzk(wzsVar5, wzsVar6, wzsVar4, vxkVar, nmo0Var3), M), M, (i4 & 112) | 196614 | (57344 & (i4 >> 6)));
            aVar2 = M;
            if (er.f((i4 >> 21) & 14, aVar2, jaiVar)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.bzk
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lzk.a(q630.this, wzsVar, wzsVar2, wzsVar3, vxkVar, nmo0Var, f2, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final d0l d0lVar, q630 q630Var, nyk nykVar, vxk vxkVar, wzs wzsVar, wzs wzsVar2, boolean z, rwr rwrVar, androidx.compose.runtime.a aVar, final int i2) {
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
        int i3;
        wzs wzsVar5;
        jai jaiVar;
        androidx.compose.runtime.a M = aVar.M(1105472031);
        int i4 = i2 | (M.J(d0lVar) ? 4 : 2) | 14378160;
        if (M.t(i4 & 1, (4793491 & i4) != 4793490)) {
            M.V();
            int i5 = i2 & 1;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i5 == 0 || M.i()) {
                Object x = M.x();
                if (x == c0012a) {
                    ayk aykVar = ayk.a;
                    x = new oyk();
                    M.R(x);
                }
                nykVar3 = (nyk) x;
                ayk aykVar2 = ayk.a;
                vxk c3 = ayk.c(6, M);
                int i6 = i4 & (-8065);
                jai c4 = kai.c(1655706771, new hzk(d0lVar, c3), M);
                c2 = kai.c(1439279037, new izk(d0lVar, nykVar3, c3), M);
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new rwr();
                    M.R(x2);
                }
                rwrVar3 = (rwr) x2;
                q630Var3 = q630.a.a;
                z3 = true;
                vxkVar3 = c3;
                i3 = i6;
                wzsVar5 = c4;
            } else {
                M.h();
                q630Var3 = q630Var;
                nykVar3 = nykVar;
                vxkVar3 = vxkVar;
                c2 = wzsVar2;
                z3 = z;
                rwrVar3 = rwrVar;
                i3 = i4 & (-8065);
                wzsVar5 = wzsVar;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1105472031, i3, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
            }
            boolean J = M.J(d0lVar.b());
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = d0lVar instanceof jc6 ? d0lVar.c : new xz8(d0lVar.b());
                M.R(x3);
            }
            wz8 wz8Var = (wz8) x3;
            if (z3) {
                M.K(-690551113);
                jaiVar = kai.c(-1483431603, new jzk(d0lVar, vxkVar3), M);
                M.j();
            } else {
                M.K(-690163489);
                M.j();
                jaiVar = null;
            }
            nyk nykVar4 = nykVar3;
            rwr rwrVar4 = rwrVar3;
            wzs wzsVar6 = c2;
            q630 q630Var4 = q630Var3;
            a(q630Var4, wzsVar5, wzsVar6, jaiVar, vxkVar3, evp0.a(zzk.r, M), zzk.p, kai.c(-1346903698, new kzk(d0lVar, wz8Var, nykVar4, vxkVar3, rwrVar4), M), M, 14156214);
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
            s.d = new wzs(q630Var2, nykVar2, vxkVar2, wzsVar3, wzsVar4, z2, rwrVar2, i2) { // from class: xsna.azk
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
                    lzk.b(d0l.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0174, code lost:
    
        if (xsna.epx.f(r12.x(), java.lang.Integer.valueOf(r4)) == false) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final Long l2, final long j2, final izs<? super Long, s3q0> izsVar, final izs<? super Long, s3q0> izsVar2, final wz8 wz8Var, final k9x k9xVar, final nyk nykVar, final eai0 eai0Var, final vxk vxkVar, androidx.compose.runtime.a aVar, final int i2) {
        cri.a.c cVar;
        androidx.compose.runtime.a M = aVar.M(-434467002);
        int i3 = i2 | (M.J(l2) ? 4 : 2) | (M.p(j2) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.y(izsVar2) ? 2048 : 1024) | (M.y(wz8Var) ? 16384 : 8192) | (M.y(k9xVar) ? 131072 : 65536) | (M.J(nykVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(eai0Var) ? 8388608 : 4194304) | (M.J(vxkVar) ? 67108864 : 33554432);
        if (M.t(i3 & 1, (38347923 & i3) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-434467002, i3, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1537)");
            }
            zz8 f2 = wz8Var.f(j2);
            int i4 = (((f2.a - k9xVar.b) * 12) + f2.b) - 1;
            if (i4 < 0) {
                i4 = 0;
            }
            xvy a2 = zvy.a(i4, 2, M);
            Integer valueOf = Integer.valueOf(i4);
            boolean J = M.J(a2) | M.o(i4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new a(i4, null, a2);
                M.R(x);
            }
            bap.g(valueOf, (wzs) x, M, 0);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x2);
            }
            yvj yvjVar = (yvj) x2;
            Object[] objArr = new Object[0];
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new vg0(7);
                M.R(x3);
            }
            wh50 wh50Var = (wh50) crx0.A(objArr, (gzs) x3, M, 48);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar2 = dt1.a.n;
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar2, M, 0);
            int m2 = n34.m(M);
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c2 = qri.c(M, aVar3);
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
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a3, cVar2);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            cri.a.b bVar = cri.a.g;
            if (M.L()) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
            }
            kr.a(m2, M, m2, bVar);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            float f3 = c;
            q630 F = s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3);
            boolean c3 = a2.c();
            boolean e2 = a2.e();
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            String a4 = nykVar.a(Long.valueOf(j2), wz8Var.a);
            if (a4 == null) {
                a4 = "-";
            }
            boolean y = M.y(yvjVar) | M.J(a2);
            Object x4 = M.x();
            if (y || x4 == c0012a) {
                x4 = new dy0(7, yvjVar, a2);
                M.R(x4);
            }
            gzs gzsVar = (gzs) x4;
            boolean y2 = M.y(yvjVar) | M.J(a2);
            Object x5 = M.x();
            if (y2 || x5 == c0012a) {
                x5 = new com.vk.movika.tools.controls.seekbar.f(6, yvjVar, a2);
                M.R(x5);
            }
            gzs gzsVar2 = (gzs) x5;
            boolean J2 = M.J(wh50Var);
            Object x6 = M.x();
            if (J2 || x6 == c0012a) {
                x6 = new gbj(wh50Var, 3);
                M.R(x6);
            }
            int i5 = i3 & 234881024;
            cri.a.c cVar3 = cVar;
            j(F, c3, e2, booleanValue, a4, gzsVar, gzsVar2, (gzs) x6, vxkVar, M, i5 | 6);
            M = M;
            cp10 d2 = ja8.d(dt1.a.b, false);
            int m3 = n34.m(M);
            sy90 D2 = M.D();
            q630 c4 = qri.c(M, aVar3);
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
            k9q0.w(M, d2, cVar3);
            k9q0.w(M, D2, eVar);
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m3))) {
                kr.a(m3, M, m3, bVar);
            }
            k9q0.w(M, c4, dVar);
            q630 F2 = s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3);
            androidx.compose.foundation.layout.c a5 = androidx.compose.foundation.layout.b.a(mVar, aVar2, M, 0);
            int m4 = n34.m(M);
            sy90 D3 = M.D();
            q630 c5 = qri.c(M, F2);
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
            k9q0.w(M, a5, cVar3);
            k9q0.w(M, D3, eVar);
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m4))) {
                kr.a(m4, M, m4, bVar);
            }
            k9q0.w(M, c5, dVar);
            l(vxkVar, wz8Var, M, ((i3 >> 24) & 14) | ((i3 >> 9) & 112));
            g(a2, l2, izsVar, izsVar2, wz8Var, k9xVar, nykVar, eai0Var, vxkVar, M, ((i3 << 3) & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128) | i5);
            M.G();
            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultEffects;
            phr a6 = lb30.a(motionSchemeKeyTokens, M);
            phr a7 = lb30.a(MotionSchemeKeyTokens.FastEffects, M);
            phr a8 = lb30.a(motionSchemeKeyTokens, M);
            mm2.f(((Boolean) wh50Var.getValue()).booleanValue(), rte0.e(aVar3), anp.d(a8, null, null, 14).b(new rpp(new gmp0(new ciq(0.6f, a6), (b0k0) null, (vsa) null, (h4h0) null, (LinkedHashMap) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE))), anp.k(a8, null, 14).b(anp.f(a7, 2)), null, kai.c(1193716082, new d(j2, wh50Var, yvjVar, a2, k9xVar, f2, eai0Var, wz8Var, vxkVar), M), M, 196656, 16);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(l2, j2, izsVar, izsVar2, wz8Var, k9xVar, nykVar, eai0Var, vxkVar, i2) { // from class: xsna.pyk
                public final /* synthetic */ Long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ izs e;
                public final /* synthetic */ wz8 f;
                public final /* synthetic */ k9x g;
                public final /* synthetic */ nyk h;
                public final /* synthetic */ eai0 i;
                public final /* synthetic */ vxk j;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    lzk.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final wzs wzsVar, final long j2, final long j3, final float f2, final jai jaiVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        long j4;
        androidx.compose.runtime.a M = aVar.M(2020490761);
        int i4 = i2 & 6;
        q630.a aVar2 = q630.a.a;
        if (i4 == 0) {
            i3 = (M.J(aVar2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(wzsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            j4 = j2;
            i3 |= M.p(j4) ? 256 : 128;
        } else {
            j4 = j2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.p(j3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.n(f2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.y(jaiVar) ? 131072 : 65536;
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2020490761, i3, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1677)");
            }
            q630 g2 = txj0.f(aVar2, 1.0f).g(wzsVar != null ? txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, aVar2) : aVar2);
            a.h hVar = androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(hVar, dt1.a.n, M, 6);
            int m2 = n34.m(M);
            sy90 D = M.D();
            q630 c2 = qri.c(M, g2);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m2))) {
                kr.a(m2, M, m2, bVar);
            }
            k9q0.w(M, c2, cri.a.d);
            if (wzsVar != null) {
                M.K(396894187);
                po40.d(j4, evp0.a(zzk.t, M), kai.c(1344395458, new ozk(wzsVar), M), M, ((i3 >> 6) & 14) | 384);
                M.j();
            } else {
                M.K(397163267);
                M.j();
            }
            rvi.a(vcl0.b(j3, zfj.a), jaiVar, M, ((i3 >> 12) & 112) | 8);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.czk
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lzk.d(wzs.this, j2, j3, f2, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(final String str, final boolean z, final gzs gzsVar, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final String str2, final vxk vxkVar, androidx.compose.runtime.a aVar, final int i2) {
        String str3;
        int i3;
        gzs gzsVar2;
        boolean z6;
        androidx.compose.runtime.a aVar2;
        int i4;
        androidx.compose.runtime.a aVar3;
        mtk0 c2;
        long j2;
        y18 y18Var;
        androidx.compose.runtime.a M = aVar.M(-945355136);
        if ((i2 & 6) == 0) {
            str3 = str;
            i3 = (M.J(str3) ? 4 : 2) | i2;
        } else {
            str3 = str;
            i3 = i2;
        }
        int i5 = i2 & 48;
        q630.a aVar4 = q630.a.a;
        if (i5 == 0) {
            i3 |= M.J(aVar4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.l(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            gzsVar2 = gzsVar;
            i3 |= M.y(gzsVar2) ? 2048 : 1024;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.l(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.l(z3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= M.l(z4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            z6 = z5;
            i3 |= M.l(z6) ? 8388608 : 4194304;
        } else {
            z6 = z5;
        }
        if ((100663296 & i2) == 0) {
            i3 |= M.J(str2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= M.J(vxkVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if (M.t(i3 & 1, (306783379 & i3) != 306783378)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-945355136, i3, -1, "androidx.compose.material3.Day (DatePicker.kt:2003)");
            }
            boolean z7 = (234881024 & i3) == 67108864;
            Object x = M.x();
            if (z7 || x == a.C0011a.a) {
                x = new x43(str2, 2);
                M.R(x);
            }
            q630 b2 = egi0.b(aVar4, true, (izs) x);
            r5j0 a2 = p6j0.a(zzk.f, M);
            int i6 = i3 >> 6;
            int i7 = ((i3 >> 18) & 7168) | (i6 & 14) | ((i3 >> 12) & 112) | (i6 & 896);
            vxkVar.getClass();
            if (androidx.compose.runtime.b.d()) {
                i4 = i6;
                androidx.compose.runtime.b.f(-1240482658, i7, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:976)");
            } else {
                i4 = i6;
            }
            long j3 = z ? z3 ? vxkVar.r : vxkVar.s : l5g.j;
            if (z2) {
                M.K(-1319856736);
                c2 = lwj0.b(j3, lb30.a(MotionSchemeKeyTokens.DefaultEffects, M), null, M, 0, 12);
                aVar3 = M;
                aVar3.j();
            } else {
                aVar3 = M;
                aVar3.K(-1319630064);
                c2 = androidx.compose.runtime.k.c(new l5g(j3), aVar3, 0);
                aVar3.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j4 = ((l5g) c2.getValue()).a;
            if (!z4 || z) {
                j2 = j4;
                y18Var = null;
            } else {
                j2 = j4;
                y18Var = aqw.a(zzk.m, vxkVar.u);
            }
            aVar2 = aVar3;
            xjn0.b(z, gzsVar2, b2, z3, a2, j2, y18Var, kai.c(1126347158, new pzk(str3, vxkVar, z4, z, z6, z3), aVar3), aVar2, i4 & 7294, 1472);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.yyk
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lzk.e(str, z, gzsVar, z2, z3, z4, z5, str2, vxkVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(q630 q630Var, int i2, izs<? super efn, s3q0> izsVar, vxk vxkVar, androidx.compose.runtime.a aVar, int i3) {
        androidx.compose.runtime.a M = aVar.M(-1461252485);
        int i4 = (M.o(i2) ? 32 : 16) | i3 | (M.y(izsVar) ? 256 : 128) | (M.J(vxkVar) ? 2048 : 1024);
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1461252485, i4, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1406)");
            }
            rvi.a(vcl0.b(vxkVar.c, zfj.a), kai.c(-1734512197, new e(izsVar, q630Var, i2), M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fqi(q630Var, i2, izsVar, vxkVar, i3);
        }
    }

    public static final void g(xvy xvyVar, final Long l2, final izs<? super Long, s3q0> izsVar, final izs<? super Long, s3q0> izsVar2, final wz8 wz8Var, final k9x k9xVar, final nyk nykVar, final eai0 eai0Var, final vxk vxkVar, androidx.compose.runtime.a aVar, final int i2) {
        Object gVar;
        final xvy xvyVar2 = xvyVar;
        androidx.compose.runtime.a M = aVar.M(-1994757941);
        int i3 = i2 | (M.J(xvyVar2) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i3 |= M.J(l2) ? 32 : 16;
        }
        int i4 = i3 | (M.y(izsVar) ? 256 : 128) | (M.y(izsVar2) ? 2048 : 1024) | (M.y(wz8Var) ? 16384 : 8192) | (M.y(k9xVar) ? 131072 : 65536) | (M.J(nykVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(eai0Var) ? 8388608 : 4194304) | (M.J(vxkVar) ? 67108864 : 33554432);
        if (M.t(i4 & 1, (38347923 & i4) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1994757941, i4, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1711)");
            }
            rz8 h2 = wz8Var.h();
            boolean J = M.J(k9xVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = wz8Var.e(k9xVar.b, 1);
                M.R(x);
            }
            cjo0.a(evp0.a(zzk.h, M), kai.c(1504086906, new f(xvyVar2, k9xVar, wz8Var, (zz8) x, izsVar, h2, l2, nykVar, eai0Var, vxkVar), M), M, 48);
            int i5 = i4 & 14;
            boolean y = (i5 == 4) | ((i4 & 7168) == 2048) | M.y(wz8Var) | M.y(k9xVar);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                xvyVar2 = xvyVar;
                gVar = new g(xvyVar2, izsVar2, wz8Var, k9xVar, null);
                M.R(gVar);
            } else {
                gVar = x2;
                xvyVar2 = xvyVar;
            }
            bap.g(xvyVar2, (wzs) gVar, M, i5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.syk
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lzk.g(xvy.this, l2, izsVar, izsVar2, wz8Var, k9xVar, nykVar, eai0Var, vxkVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void h(final gzs<s3q0> gzsVar, final imw imwVar, final String str, q630 q630Var, boolean z, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        q630 q630Var2;
        int i4;
        boolean z2;
        int i5;
        final q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(-368059805);
        int i6 = i2 | (M.y(gzsVar) ? 4 : 2) | (M.J(imwVar) ? 32 : 16) | (M.J(str) ? 256 : 128);
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = i6 | 3072;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i4 = i6 | (M.J(q630Var2) ? 2048 : 1024);
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i5 = i4 | 24576;
            z2 = z;
        } else {
            z2 = z;
            i5 = i4 | (M.l(z2) ? 16384 : 8192);
        }
        if (M.t(i5 & 1, (i5 & 9363) != 9362)) {
            q630 q630Var4 = i7 != 0 ? q630.a.a : q630Var2;
            if (i8 != 0) {
                z2 = true;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-368059805, i5, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
            }
            q630 q630Var5 = q630Var4;
            x5p0.b(f5p0.a(M), kai.c(-456272562, new h(str), M), x5p0.c(M), null, false, kai.c(-1124908186, new i(gzsVar, q630Var5, z2, imwVar, str), M), M, 100663344);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var3 = q630Var5;
        } else {
            M.h();
            q630Var3 = q630Var2;
        }
        final boolean z3 = z2;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(imwVar, str, q630Var3, z3, i2, i3) { // from class: xsna.qyk
                public final /* synthetic */ imw c;
                public final /* synthetic */ String d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ int g;

                {
                    this.g = i3;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    lzk.h(gzs.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I, this.g);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(final zz8 zz8Var, final izs<? super Long, s3q0> izsVar, final long j2, final Long l2, final Long l3, final cbi0 cbi0Var, final nyk nykVar, final eai0 eai0Var, final vxk vxkVar, final Locale locale, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var;
        int i3;
        int i4;
        int i5;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a aVar3;
        int i6;
        boolean z;
        boolean z2;
        boolean z3;
        int i7;
        boolean z4;
        zz8 zz8Var2 = zz8Var;
        final izs<? super Long, s3q0> izsVar2 = izsVar;
        nyk nykVar2 = nykVar;
        vxk vxkVar2 = vxkVar;
        Locale locale2 = locale;
        androidx.compose.runtime.a M = aVar.M(-333300603);
        int i8 = (M.J(zz8Var2) ? 4 : 2) | i2 | (M.y(izsVar2) ? 32 : 16) | (M.p(j2) ? 256 : 128) | (M.J(l2) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i8 |= M.J(l3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i8 |= M.J(cbi0Var) ? 131072 : 65536;
        }
        int i9 = i8 | (M.J(nykVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(eai0Var) ? 8388608 : 4194304) | (M.J(vxkVar2) ? 67108864 : 33554432) | (M.y(locale2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if (M.t(i9 & 1, (306783379 & i9) != 306783378)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-333300603, i9, -1, "androidx.compose.material3.Month (DatePicker.kt:1844)");
            }
            q630.a aVar4 = q630.a.a;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (cbi0Var != null) {
                M.K(606579709);
                boolean z5 = ((i9 & 458752) == 131072) | ((234881024 & i9) == 67108864);
                Object x = M.x();
                if (z5 || x == c0012a2) {
                    x = new com.vk.libvideo.b(13, cbi0Var, vxkVar2);
                    M.R(x);
                }
                q630Var = bu00.f(aVar4, (izs) x);
                M.j();
            } else {
                M.K(606771165);
                M.j();
                q630Var = aVar4;
            }
            q630 g2 = txj0.k(aVar4, a * 6).g(q630Var);
            a.i iVar = androidx.compose.foundation.layout.a.f;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(iVar, dt1.a.n, M, 6);
            int m2 = n34.m(M);
            sy90 D = M.D();
            q630 c2 = qri.c(M, g2);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
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
            M.K(-680088486);
            int i10 = 0;
            int i11 = 0;
            while (i11 < 6) {
                q630 f2 = txj0.f(aVar4, 1.0f);
                a.i iVar2 = androidx.compose.foundation.layout.a.f;
                dt1.a.getClass();
                q630.a aVar6 = aVar4;
                androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(iVar2, dt1.a.l, M, 54);
                int m3 = n34.m(M);
                sy90 D2 = M.D();
                q630 c3 = qri.c(M, f2);
                cri.h7.getClass();
                int i12 = i10;
                LayoutNode.a aVar7 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar7);
                } else {
                    M.f();
                }
                k9q0.w(M, a3, cri.a.f);
                k9q0.w(M, D2, cri.a.e);
                cri.a.b bVar2 = cri.a.g;
                if (M.L() || !epx.f(M.x(), Integer.valueOf(m3))) {
                    kr.a(m3, M, m3, bVar2);
                }
                k9q0.w(M, c3, cri.a.d);
                M.K(1542622325);
                int i13 = i12;
                int i14 = 0;
                while (i14 < 7) {
                    int i15 = zz8Var2.d;
                    if (i13 < i15 || i13 >= i15 + zz8Var2.c) {
                        i3 = i14;
                        i4 = i13;
                        i5 = i11;
                        c0012a = c0012a2;
                        aVar3 = M;
                        i6 = i9;
                        aVar3.K(576825328);
                        q630 u = txj0.u(aVar6, zzk.g, zzk.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                        iyk0 iyk0Var = zax.c;
                        f9t.e(txj0.s(u, ((pco) aVar3.r(iyk0Var)).b, ((pco) aVar3.r(iyk0Var)).b), aVar3, 0);
                        aVar3.j();
                    } else {
                        M.K(577914947);
                        int i16 = i13 - zz8Var2.d;
                        i3 = i14;
                        i4 = i13;
                        final long j3 = (i16 * TimeUtils.MILLISECONDS_PER_DAY) + zz8Var2.e;
                        boolean z6 = j3 == j2;
                        boolean z7 = l2 != null && j3 == l2.longValue();
                        boolean z8 = l3 != null && j3 == l3.longValue();
                        if (cbi0Var != null) {
                            M.K(578361347);
                            boolean p = ((i9 & 458752) == 131072) | M.p(j3);
                            Object x2 = M.x();
                            if (p || x2 == c0012a2) {
                                if (j3 >= (l2 != null ? l2.longValue() : Long.MAX_VALUE)) {
                                    if (j3 <= (l3 != null ? l3.longValue() : Long.MIN_VALUE)) {
                                        z4 = true;
                                        x2 = io.reactivex.rxjava3.internal.operators.mixed.j.d(z4, M);
                                    }
                                }
                                z4 = false;
                                x2 = io.reactivex.rxjava3.internal.operators.mixed.j.d(z4, M);
                            }
                            z = ((Boolean) ((wh50) x2).getValue()).booleanValue();
                            M.j();
                        } else {
                            M.K(578890300);
                            M.j();
                            z = false;
                        }
                        boolean z9 = cbi0Var != null;
                        if (androidx.compose.runtime.b.d()) {
                            z2 = z;
                            i5 = i11;
                            z3 = z9;
                            i7 = i16;
                            androidx.compose.runtime.b.f(502032503, 0, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1972)");
                        } else {
                            z2 = z;
                            i5 = i11;
                            z3 = z9;
                            i7 = i16;
                        }
                        StringBuilder sb = new StringBuilder();
                        if (z3) {
                            M.K(974450583);
                            if (z7) {
                                M.K(1416909399);
                                sb.append(e7b0.b(R.string.m3c_date_range_picker_start_headline, M));
                                M.j();
                            } else if (z8) {
                                M.K(1416913397);
                                sb.append(e7b0.b(R.string.m3c_date_range_picker_end_headline, M));
                                M.j();
                            } else if (z2) {
                                M.K(1416917332);
                                sb.append(e7b0.b(R.string.m3c_date_range_picker_day_in_range, M));
                                M.j();
                            } else {
                                M.K(974832875);
                                M.j();
                            }
                            M.j();
                        } else {
                            M.K(974838827);
                            M.j();
                        }
                        if (z6) {
                            M.K(1416920485);
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(e7b0.b(R.string.m3c_date_picker_today_description, M));
                            M.j();
                        } else {
                            M.K(975029291);
                            M.j();
                        }
                        String sb2 = sb.length() == 0 ? null : sb.toString();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        String b2 = nykVar2.b(Long.valueOf(j3), locale2, true);
                        if (b2 == null) {
                            b2 = "";
                        }
                        String a4 = vz8.a(i7 + 1, locale2, 7);
                        boolean z10 = z7 || z8;
                        boolean p2 = ((i9 & 112) == 32) | M.p(j3);
                        Object x3 = M.x();
                        if (p2 || x3 == c0012a2) {
                            x3 = new gzs() { // from class: xsna.vyk
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    izsVar2.invoke(Long.valueOf(j3));
                                    return s3q0.a;
                                }
                            };
                            M.R(x3);
                        }
                        gzs gzsVar = (gzs) x3;
                        boolean p3 = ((i9 & 29360128) == 8388608) | M.p(j3);
                        Object x4 = M.x();
                        if (p3 || x4 == c0012a2) {
                            eai0Var.getClass();
                            x4 = Boolean.valueOf(eai0Var.a(j3));
                            M.R(x4);
                        }
                        boolean booleanValue = ((Boolean) x4).booleanValue();
                        if (sb2 != null) {
                            b2 = pzl.b(sb2, ", ", b2);
                        }
                        i6 = i9;
                        boolean z11 = z7;
                        androidx.compose.runtime.a aVar8 = M;
                        c0012a = c0012a2;
                        e(a4, z10, gzsVar, z11, booleanValue, z6, z2, b2, vxkVar2, aVar8, ((i9 << 3) & 1879048192) | 48);
                        aVar3 = aVar8;
                        aVar3.j();
                    }
                    zz8Var2 = zz8Var;
                    izsVar2 = izsVar;
                    nykVar2 = nykVar;
                    i9 = i6;
                    c0012a2 = c0012a;
                    M = aVar3;
                    i13 = i4 + 1;
                    i14 = i3 + 1;
                    i11 = i5;
                    vxkVar2 = vxkVar;
                    locale2 = locale;
                }
                int i17 = i11;
                androidx.compose.runtime.a aVar9 = M;
                aVar9.j();
                aVar9.G();
                zz8Var2 = zz8Var;
                izsVar2 = izsVar;
                nykVar2 = nykVar;
                vxkVar2 = vxkVar;
                i11 = i17 + 1;
                aVar4 = aVar6;
                i10 = i13;
                locale2 = locale;
            }
            aVar2 = M;
            if (gp.d(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wyk
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lzk.i(zz8.this, izsVar, j2, l2, l3, cbi0Var, nykVar, eai0Var, vxkVar, locale, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void j(q630 q630Var, final boolean z, final boolean z2, final boolean z3, final String str, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, final gzs<s3q0> gzsVar3, final vxk vxkVar, androidx.compose.runtime.a aVar, final int i2) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-773929258);
        int i3 = i2 | (M.l(z) ? 32 : 16) | (M.l(z2) ? 256 : 128) | (M.l(z3) ? 2048 : 1024) | (M.J(str) ? 16384 : 8192) | (M.y(gzsVar) ? 131072 : 65536) | (M.y(gzsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(gzsVar3) ? 8388608 : 4194304) | (M.J(vxkVar) ? 67108864 : 33554432);
        if (M.t(i3 & 1, (38347923 & i3) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-773929258, i3, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2191)");
            }
            q630Var2 = q630Var;
            q630 k2 = txj0.k(txj0.f(q630Var2, 1.0f), b);
            a.e eVar = z3 ? androidx.compose.foundation.layout.a.a : androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(eVar, dt1.a.l, M, 48);
            int m2 = n34.m(M);
            sy90 D = M.D();
            q630 c2 = qri.c(M, k2);
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
            o(((i3 >> 6) & 112) | ((i3 >> 21) & 14) | 3072, M, kai.c(619076006, new j(str, vxkVar), M), gzsVar3, null, z3);
            if (z3) {
                M.K(282432080);
                M.j();
            } else {
                M.K(281624840);
                rvi.a(vcl0.b(vxkVar.f, zfj.a), kai.c(-128317193, new k(gzsVar2, gzsVar, z2, z), M), M, 56);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final q630 q630Var3 = q630Var2;
            s.d = new wzs(z, z2, z3, str, gzsVar, gzsVar2, gzsVar3, vxkVar, i2) { // from class: xsna.ryk
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ String f;
                public final /* synthetic */ gzs g;
                public final /* synthetic */ gzs h;
                public final /* synthetic */ gzs i;
                public final /* synthetic */ vxk j;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(7);
                    lzk.j(q630.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void k(final Long l2, final long j2, final int i2, final izs izsVar, final izs izsVar2, final wz8 wz8Var, final k9x k9xVar, final nyk nykVar, final eai0 eai0Var, final vxk vxkVar, final rwr rwrVar, androidx.compose.runtime.a aVar, final int i3) {
        androidx.compose.runtime.a M = aVar.M(-2053685029);
        int i4 = i3 | (M.J(l2) ? 4 : 2) | (M.p(j2) ? 32 : 16) | (M.o(i2) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024) | (M.y(izsVar2) ? 16384 : 8192) | (M.y(wz8Var) ? 131072 : 65536) | (M.y(k9xVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(nykVar) ? 8388608 : 4194304) | (M.J(eai0Var) ? 67108864 : 33554432) | (M.J(vxkVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i5 = M.J(rwrVar) ? 4 : 2;
        if (M.t(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2053685029, i4, i5, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1443)");
            }
            final int i6 = -((azl) M.r(uvi.h)).r0(48);
            final phr a2 = lb30.a(MotionSchemeKeyTokens.DefaultEffects, M);
            final phr a3 = lb30.a(MotionSchemeKeyTokens.FastEffects, M);
            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultSpatial;
            final phr a4 = lb30.a(motionSchemeKeyTokens, M);
            final phr a5 = lb30.a(motionSchemeKeyTokens, M);
            efn efnVar = new efn(i2);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new qb(21);
                M.R(x);
            }
            q630 b2 = egi0.b(q630.a.a, false, (izs) x);
            boolean y = M.y(a4) | M.y(a2) | M.y(a3) | M.o(i6) | M.y(a5);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new izs() { // from class: xsna.dzk
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        li2 li2Var = (li2) obj;
                        int i7 = ((efn) li2Var.f()).a;
                        phr phrVar = phr.this;
                        phr phrVar2 = a2;
                        phr phrVar3 = a3;
                        int i8 = i6;
                        return li2Var.d(i7 == 1 ? xh2.c(anp.l(phrVar, new ht(19)).b(anp.e(phrVar2, 2)), anp.f(phrVar3, 2).b(anp.o(phrVar, new kjb(i8, 1)))) : xh2.c(anp.l(phrVar, new kjb(i8, 1)).b(anp.e(phrVar2, 2)), anp.o(phrVar, new ht(19)).b(anp.f(phrVar3, 2))), new xxj0(new jb5(a5, 5)));
                    }
                };
                M.R(x2);
            }
            xh2.a(efnVar, b2, (izs) x2, null, "DatePickerDisplayModeAnimation", null, kai.c(1838500091, new uzk(l2, j2, izsVar, izsVar2, wz8Var, k9xVar, nykVar, eai0Var, vxkVar, rwrVar), M), M, ((i4 >> 6) & 14) | 1597440, 40);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(l2, j2, i2, izsVar, izsVar2, wz8Var, k9xVar, nykVar, eai0Var, vxkVar, rwrVar, i3) { // from class: xsna.ezk
                public final /* synthetic */ Long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ int d;
                public final /* synthetic */ izs e;
                public final /* synthetic */ izs f;
                public final /* synthetic */ wz8 g;
                public final /* synthetic */ k9x h;
                public final /* synthetic */ nyk i;
                public final /* synthetic */ eai0 j;
                public final /* synthetic */ vxk k;
                public final /* synthetic */ rwr l;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lzk.k(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (androidx.compose.runtime.a) obj, ne7.I(1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v1, types: [java.lang.Throwable] */
    public static final void l(vxk vxkVar, wz8 wz8Var, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1849465391);
        int i3 = (i2 & 6) == 0 ? (M.J(vxkVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= M.y(wz8Var) ? 32 : 16;
        }
        boolean z = false;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1849465391, i3, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1782)");
            }
            int d2 = wz8Var.d();
            List<Pair<String, String>> i4 = wz8Var.i();
            ArrayList arrayList = new ArrayList();
            int i5 = d2 - 1;
            int size = i4.size();
            for (int i6 = i5; i6 < size; i6++) {
                arrayList.add(i4.get(i6));
            }
            for (int i7 = 0; i7 < i5; i7++) {
                arrayList.add(i4.get(i7));
            }
            nmo0 a2 = evp0.a(zzk.B, M);
            float f2 = a;
            q630.a aVar3 = q630.a.a;
            q630 f3 = txj0.f(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, aVar3), 1.0f);
            a.i iVar = androidx.compose.foundation.layout.a.f;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(iVar, dt1.a.l, M, 54);
            int m2 = n34.m(M);
            sy90 D = M.D();
            q630 c2 = qri.c(M, f3);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            dt1 dt1Var = null;
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
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m2))) {
                kr.a(m2, M, m2, bVar);
            }
            k9q0.w(M, c2, cri.a.d);
            M.K(24563235);
            int size2 = arrayList.size();
            int i8 = 0;
            while (i8 < size2) {
                Pair pair = (Pair) arrayList.get(i8);
                boolean J = M.J(pair);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    x = new fre(pair, 15);
                    M.R(x);
                }
                q630 u = txj0.u(egi0.a(aVar3, (izs) x), zzk.g, zzk.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                iyk0 iyk0Var = zax.c;
                q630 s = txj0.s(u, ((pco) M.r(iyk0Var)).b, ((pco) M.r(iyk0Var)).b);
                dt1.a.getClass();
                cp10 d3 = ja8.d(dt1.a.f, z);
                int m3 = n34.m(M);
                sy90 D2 = M.D();
                q630 c3 = qri.c(M, s);
                cri.h7.getClass();
                LayoutNode.a aVar5 = cri.a.b;
                if (M.N() == null) {
                    ?? r28 = dt1Var;
                    n34.r();
                    throw r28;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar5);
                } else {
                    M.f();
                }
                k9q0.w(M, d3, cri.a.f);
                k9q0.w(M, D2, cri.a.e);
                cri.a.b bVar2 = cri.a.g;
                if (M.L() || !epx.f(M.x(), Integer.valueOf(m3))) {
                    kr.a(m3, M, m3, bVar2);
                }
                k9q0.w(M, c3, cri.a.d);
                androidx.compose.runtime.a aVar6 = M;
                cjo0.c((String) pair.j(), txj0.B(aVar3, dt1Var, 3), vxkVar.d, 0L, 0L, new obo0(3), 0L, 0, false, 0, 0, a2, aVar6, 48, 0, 130040);
                aVar6.G();
                i8++;
                M = aVar6;
                arrayList = arrayList;
                z = z;
                aVar3 = aVar3;
                dt1Var = dt1Var;
            }
            aVar2 = M;
            if (gp.d(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new ao1(vxkVar, wz8Var, i2, 1);
        }
    }

    public static final void m(final String str, final q630 q630Var, final boolean z, final boolean z2, final gzs<s3q0> gzsVar, final boolean z3, final String str2, final vxk vxkVar, androidx.compose.runtime.a aVar, final int i2) {
        Object a2;
        androidx.compose.runtime.a M = aVar.M(-1153850597);
        int i3 = i2 | (M.J(str) ? 4 : 2) | (M.l(z) ? 256 : 128) | (M.l(z2) ? 2048 : 1024) | (M.y(gzsVar) ? 16384 : 8192) | (M.l(z3) ? 131072 : 65536) | (M.J(str2) ? 1048576 : 524288) | (M.J(vxkVar) ? 8388608 : 4194304);
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1153850597, i3, -1, "androidx.compose.material3.Year (DatePicker.kt:2128)");
            }
            boolean z4 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z4 || x == c0012a) {
                a2 = (!z2 || z) ? null : aqw.a(zzk.m, vxkVar.u);
                M.R(a2);
            } else {
                a2 = x;
            }
            y18 y18Var = (y18) a2;
            boolean z5 = (3670016 & i3) == 1048576;
            Object x2 = M.x();
            if (z5 || x2 == c0012a) {
                x2 = new z43(str2, 2);
                M.R(x2);
            }
            q630 b2 = egi0.b(q630Var, true, (izs) x2);
            r5j0 a3 = p6j0.a(zzk.H, M);
            int i4 = i3 >> 6;
            int i5 = i4 & 14;
            int i6 = i5 | ((i3 >> 12) & 112) | ((i3 >> 15) & 896);
            vxkVar.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1306331107, i6, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:1030)");
            }
            mtk0 b3 = lwj0.b(z ? z3 ? vxkVar.l : vxkVar.m : l5g.j, lb30.a(MotionSchemeKeyTokens.DefaultEffects, M), null, M, 0, 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            xjn0.b(z, gzsVar, b2, z3, a3, ((l5g) b3.getValue()).a, y18Var, kai.c(-564400443, new l(str, vxkVar, z2, z, z3), M), M, i5 | ((i3 >> 9) & 112) | (i4 & 7168), 1472);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, q630Var, z, z2, gzsVar, z3, str2, vxkVar, i2) { // from class: xsna.zyk
                public final /* synthetic */ String b;
                public final /* synthetic */ q630 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ String h;
                public final /* synthetic */ vxk i;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(49);
                    lzk.m(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void n(final q630 q630Var, final long j2, final izs<? super Integer, s3q0> izsVar, final eai0 eai0Var, final wz8 wz8Var, final k9x k9xVar, final vxk vxkVar, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a M = aVar.M(-1286899812);
        int i3 = i2 | (M.p(j2) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(eai0Var) ? 2048 : 1024) | (M.y(wz8Var) ? 16384 : 8192) | (M.y(k9xVar) ? 131072 : 65536) | (M.J(vxkVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1286899812, i3, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:2068)");
            }
            cjo0.a(evp0.a(zzk.E, M), kai.c(1301915789, new m(wz8Var, j2, k9xVar, q630Var, vxkVar, izsVar, eai0Var), M), M, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j2, izsVar, eai0Var, wz8Var, k9xVar, vxkVar, i2) { // from class: xsna.uyk
                public final /* synthetic */ long c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ eai0 e;
                public final /* synthetic */ wz8 f;
                public final /* synthetic */ k9x g;
                public final /* synthetic */ vxk h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(7);
                    lzk.n(q630.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void o(final int i2, androidx.compose.runtime.a aVar, final jai jaiVar, final gzs gzsVar, q630 q630Var, final boolean z) {
        gzs gzsVar2;
        int i3;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-709923073);
        if ((i2 & 6) == 0) {
            gzsVar2 = gzsVar;
            i3 = (M.y(gzsVar2) ? 4 : 2) | i2;
        } else {
            gzsVar2 = gzsVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.l(z) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= M.y(jaiVar) ? 2048 : 1024;
        }
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-709923073, i4, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:2247)");
            }
            uog0 uog0Var = vog0.a;
            u890 u890Var = np8.a;
            q630.a aVar2 = q630.a.a;
            lq8.b(gzsVar2, aVar2, false, uog0Var, np8.b(0L, ((l5g) M.r(zfj.a)).a, M, 13), null, kai.c(1899489890, new xzk(jaiVar, z), M), M, (i4 & 14) | 807075840 | ((i4 >> 3) & 112), 388);
            M = M;
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
            s.d = new wzs() { // from class: xsna.tyk
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lzk.o(ne7.I(i2 | 1), (androidx.compose.runtime.a) obj, jaiVar, gzs.this, q630Var2, z);
                    return s3q0.a;
                }
            };
        }
    }

    public static final d0l p(final Long l2, final k9x k9xVar, q9o0 q9o0Var, androidx.compose.runtime.a aVar) {
        final q9o0 q9o0Var2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2065763010, 0, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:373)");
        }
        final Locale a2 = uz8.a(aVar);
        Object[] objArr = new Object[0];
        fh9 C = q6x.C(new u9(10, q9o0Var, a2), new z9g(4));
        boolean J = aVar.J(l2) | aVar.J(l2) | aVar.y(k9xVar) | aVar.o(0) | aVar.J(q9o0Var) | aVar.y(a2);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            q9o0Var2 = q9o0Var;
            x = new gzs() { // from class: xsna.xyk
                @Override // xsna.gzs
                public final Object invoke() {
                    return new d0l(l2, l2, k9xVar, 0, q9o0Var2, a2);
                }
            };
            aVar.R(x);
        } else {
            q9o0Var2 = q9o0Var;
        }
        d0l d0lVar = (d0l) crx0.D(objArr, C, (gzs) x, aVar, 0);
        ((zak0) d0lVar.d).setValue(q9o0Var2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return d0lVar;
    }
}
