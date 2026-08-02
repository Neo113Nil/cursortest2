package com.yandex.go.chargers.station.presentation.details;

import android.text.SpannableStringBuilder;
import com.yandex.go.chargers.station.domain.c;
import defpackage.bra;
import defpackage.e3n;
import defpackage.gra;
import defpackage.kp50;
import defpackage.lra;
import defpackage.ny61;
import defpackage.o430;
import defpackage.rra;
import defpackage.scc;
import defpackage.sra;
import defpackage.t7s;
import defpackage.tcc;
import defpackage.uo9;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ sra a;
    public final /* synthetic */ gra b;
    public final /* synthetic */ bra c;
    public final /* synthetic */ String w;

    public b(sra sraVar, gra graVar, bra braVar, String str) {
        this.a = sraVar;
        this.b = graVar;
        this.c = braVar;
        this.w = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0139, code lost:
    
        if (kotlinx.coroutines.a.j(r4, r2) == r3) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Long l, Continuation continuation) {
        ChargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1 chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1;
        int i;
        Throwable th;
        gra graVar;
        Throwable th2;
        long j;
        if (continuation instanceof ChargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1) {
            chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1 = (ChargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1) continuation;
            int i2 = chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1.label;
                zy11 zy11Var = zy11.a;
                Throwable th3 = null;
                sra sraVar = this.a;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (l != null) {
                        rra rraVar = (rra) sraVar.Dg();
                        long longValue = l.longValue();
                        gra graVar2 = this.b;
                        List list = graVar2.b;
                        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                        int i4 = 0;
                        int i5 = 0;
                        for (Object obj2 : list) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                Throwable th4 = th3;
                                scc.m();
                                throw th4;
                            }
                            uo9 uo9Var = (uo9) obj2;
                            int i7 = i3;
                            if (i5 == graVar2.o.intValue()) {
                                CharSequence charSequence = uo9Var.a;
                                th2 = th3;
                                String concat = " • ".concat(t7s.j(longValue));
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                int length = spannableStringBuilder.length();
                                spannableStringBuilder.append((CharSequence) concat);
                                graVar = graVar2;
                                Object[] spans = spannableStringBuilder.getSpans(i4, length, Object.class);
                                int length2 = spans.length;
                                int i8 = 0;
                                while (i8 < length2) {
                                    int i9 = i8;
                                    Object obj3 = spans[i9];
                                    String str = concat;
                                    int spanStart = spannableStringBuilder.getSpanStart(obj3);
                                    long j2 = longValue;
                                    int spanEnd = spannableStringBuilder.getSpanEnd(obj3);
                                    int spanFlags = spannableStringBuilder.getSpanFlags(obj3);
                                    int i10 = length;
                                    if (spanEnd == length && !(obj3 instanceof CustomImageSpan)) {
                                        spanEnd += str.length();
                                    }
                                    spannableStringBuilder.setSpan(obj3, spanStart, spanEnd, spanFlags);
                                    i8 = i9 + 1;
                                    concat = str;
                                    longValue = j2;
                                    length = i10;
                                }
                                j = longValue;
                                uo9Var = uo9.a(uo9Var, spannableStringBuilder, 254);
                            } else {
                                graVar = graVar2;
                                th2 = th3;
                                j = longValue;
                            }
                            arrayList.add(uo9Var);
                            i3 = i7;
                            i5 = i6;
                            th3 = th2;
                            graVar2 = graVar;
                            longValue = j;
                            i4 = 0;
                        }
                        Throwable th5 = th3;
                        int i11 = i3;
                        rraVar.G6(new lra(arrayList));
                        if (l.longValue() == 0) {
                            o430 o430Var = e3n.b;
                            int i12 = this.c.b;
                            long U = kp50.U((i12 < 0 ? 0 : i12) + 1, DurationUnit.SECONDS);
                            th = th5;
                            chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1.L$0 = th;
                            chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1.label = i11;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                th = null;
                sraVar.C.a(this.w);
                c cVar = sraVar.x;
                chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1.L$0 = th;
                chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1.label = 2;
                Object emit = cVar.b.a.emit(zy11Var, chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1);
                return emit != coroutineSingletons ? coroutineSingletons : emit;
            }
        }
        chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1 = new ChargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1(this, continuation);
        Object obj4 = chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        Throwable th32 = null;
        sra sraVar2 = this.a;
        int i32 = 1;
        if (i != 0) {
        }
        sraVar2.C.a(this.w);
        c cVar2 = sraVar2.x;
        chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1.L$0 = th;
        chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1.label = 2;
        Object emit2 = cVar2.b.a.emit(zy11Var2, chargersStationDetailsPresenter$startFooterTimerUpdates$1$1$emit$1);
        if (emit2 != coroutineSingletons2) {
        }
    }
}
