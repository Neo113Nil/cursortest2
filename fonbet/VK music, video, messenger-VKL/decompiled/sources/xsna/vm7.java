package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.bmv;
import xsna.ym7;

/* compiled from: BookingCalendarInteractorBase.kt */
/* loaded from: classes18.dex */
public abstract class vm7<T> implements bmv {
    public final a a;

    /* compiled from: BookingCalendarInteractorBase.kt */
    public interface a {

        /* compiled from: BookingCalendarInteractorBase.kt */
        /* renamed from: xsna.vm7$a$a, reason: collision with other inner class name */
        public static final class C3896a implements a {
            public static final /* synthetic */ C3896a a = new C3896a();

            @Override // xsna.vm7.a
            public final Calendar a() {
                Calendar calendar = Calendar.getInstance();
                calendar.clear(15);
                calendar.clear(10);
                calendar.clear(12);
                calendar.clear(13);
                calendar.clear(14);
                return calendar;
            }
        }

        Calendar a();
    }

    public vm7(a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00d7, code lost:
    
        if (r0 == r4) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(vm7 vm7Var, bmv.a aVar, ContinuationImpl continuationImpl) {
        wm7 wm7Var;
        CoroutineSingletons coroutineSingletons;
        int i;
        ym7.a aVar2;
        ?? r5;
        vm7 vm7Var2;
        Iterator<T> it;
        T t;
        ym7.c cVar;
        ym7.b bVar;
        ym7.b bVar2;
        Object a2;
        List list;
        int i2;
        ym7.b bVar3;
        bmv.a aVar3;
        T t2;
        List<ym7.b> list2;
        T t3;
        vm7 vm7Var3 = vm7Var;
        bmv.a aVar4 = aVar;
        if (continuationImpl instanceof wm7) {
            wm7Var = (wm7) continuationImpl;
            int i3 = wm7Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wm7Var.label = i3 - Integer.MIN_VALUE;
                Object obj = wm7Var.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wm7Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    BookingScreenParams bookingScreenParams = aVar4.a;
                    BookingMaster bookingMaster = bookingScreenParams.f;
                    BookingScreenParams.DateTime dateTime = bookingScreenParams.h;
                    boolean z = bookingMaster == null;
                    boolean z2 = aVar4.d;
                    ym7.a aVar5 = ym7.a.g;
                    aVar2 = (z2 || dateTime == null) ? aVar5 : null;
                    if (aVar2 == null) {
                        if (dateTime != null) {
                            try {
                                OffsetDateTime withOffsetSameLocal = OffsetDateTime.parse(dateTime.b, DateTimeFormatter.ISO_OFFSET_DATE_TIME).withOffsetSameLocal(ZoneOffset.UTC);
                                if (withOffsetSameLocal != null) {
                                    aVar5 = new ym7.a(withOffsetSameLocal.getYear(), withOffsetSameLocal.getMonthValue() - 1, withOffsetSameLocal.getDayOfMonth(), withOffsetSameLocal.getDayOfWeek().getValue() - 1, aVar4.a.h.b);
                                }
                            } catch (Exception e) {
                                com.vk.metrics.eventtracking.b.a.a(e);
                            }
                        }
                        aVar2 = aVar5;
                    }
                    wm7Var.L$0 = vm7Var3;
                    wm7Var.L$1 = aVar4;
                    wm7Var.L$2 = aVar2;
                    wm7Var.I$0 = z ? 1 : 0;
                    wm7Var.label = 1;
                    obj = vm7Var3.c(aVar4, z, wm7Var);
                    vm7Var2 = vm7Var3;
                    r5 = z;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = wm7Var.I$0;
                        ym7.b bVar4 = (ym7.b) wm7Var.L$4;
                        List list3 = (List) wm7Var.L$3;
                        aVar3 = (bmv.a) wm7Var.L$1;
                        kotlin.a.a(obj);
                        bVar3 = bVar4;
                        list = list3;
                        return new ym7(bVar3, i2 == 0, aVar3.a.f, aVar3.b, aVar3.c, (ym7.e) obj, list);
                    }
                    int i4 = wm7Var.I$0;
                    ym7.a aVar6 = (ym7.a) wm7Var.L$2;
                    bmv.a aVar7 = (bmv.a) wm7Var.L$1;
                    vm7 vm7Var4 = (vm7) wm7Var.L$0;
                    kotlin.a.a(obj);
                    r5 = i4;
                    vm7Var2 = vm7Var4;
                    aVar2 = aVar6;
                    aVar4 = aVar7;
                }
                List list4 = (List) obj;
                List list5 = list4;
                it = list5.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = it.next();
                        ym7.c cVar2 = (ym7.c) t;
                        if (cVar2.a == aVar2.b && cVar2.b == aVar2.c) {
                            break;
                        }
                    } else {
                        t = (T) null;
                        break;
                    }
                }
                cVar = t;
                if (cVar != null || (list2 = cVar.c) == null) {
                    bVar = null;
                } else {
                    Iterator<T> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t3 = (T) null;
                            break;
                        }
                        t3 = it2.next();
                        if (((ym7.b) t3).a.equals(aVar2)) {
                            break;
                        }
                    }
                    bVar = t3;
                }
                if (bVar != null) {
                    Iterator<T> it3 = list5.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            bVar2 = ((ym7.c) list4.get(0)).c.get(0);
                            break;
                        }
                        Iterator<T> it4 = ((ym7.c) it3.next()).c.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                t2 = (T) null;
                                break;
                            }
                            t2 = it4.next();
                            if (((ym7.b) t2).b) {
                                break;
                            }
                        }
                        bVar2 = t2;
                        if (bVar2 != null) {
                            break;
                        }
                    }
                } else {
                    bVar2 = bVar;
                }
                boolean z3 = r5 == 0;
                wm7Var.L$0 = null;
                wm7Var.L$1 = aVar4;
                wm7Var.L$2 = null;
                wm7Var.L$3 = list4;
                wm7Var.L$4 = bVar2;
                wm7Var.I$0 = r5;
                wm7Var.label = 2;
                a2 = vm7Var2.a(aVar4, bVar2, z3, wm7Var);
                if (a2 != coroutineSingletons) {
                    list = list4;
                    obj = a2;
                    i2 = r5;
                    bVar3 = bVar2;
                    aVar3 = aVar4;
                    return new ym7(bVar3, i2 == 0, aVar3.a.f, aVar3.b, aVar3.c, (ym7.e) obj, list);
                }
                return coroutineSingletons;
            }
        }
        wm7Var = new wm7(vm7Var3, continuationImpl);
        Object obj2 = wm7Var.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wm7Var.label;
        if (i != 0) {
        }
        List list42 = (List) obj2;
        List list52 = list42;
        it = list52.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        cVar = t;
        if (cVar != null) {
        }
        bVar = null;
        if (bVar != null) {
        }
        if (r5 == 0) {
        }
        wm7Var.L$0 = null;
        wm7Var.L$1 = aVar4;
        wm7Var.L$2 = null;
        wm7Var.L$3 = list42;
        wm7Var.L$4 = bVar2;
        wm7Var.I$0 = r5;
        wm7Var.label = 2;
        a2 = vm7Var2.a(aVar4, bVar2, z3, wm7Var);
        if (a2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public static ym7.c d(Calendar calendar, ArrayList arrayList) {
        T t;
        Calendar calendar2 = (Calendar) calendar.clone();
        int i = calendar2.get(1);
        int i2 = calendar2.get(2);
        ListBuilder e = e43.e();
        while (calendar2.get(2) == i2) {
            int floorMod = Math.floorMod(calendar2.get(7) - 2, 7);
            int i3 = calendar2.get(1);
            int i4 = calendar2.get(2);
            int i5 = calendar2.get(5);
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            sb.append('-');
            sb.append(i4 + 1);
            sb.append('-');
            sb.append(i5);
            ym7.a aVar = new ym7.a(i3, i4, i5, floorMod, sb.toString());
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = (T) null;
                    break;
                }
                t = it.next();
                if (epx.f((ym7.a) t, aVar)) {
                    break;
                }
            }
            ym7.a aVar2 = t;
            if (aVar2 != null) {
                aVar = aVar2;
            }
            e.add(new ym7.b(aVar, aVar2 != null));
            calendar2.set(5, calendar2.get(5) + 1);
        }
        return new ym7.c(i, i2, e.g());
    }

    public static ym7.a e(String str) {
        TemporalAccessor parse = DateTimeFormatter.ISO_DATE.parse(str);
        return new ym7.a(parse.get(ChronoField.YEAR), parse.get(ChronoField.MONTH_OF_YEAR) - 1, parse.get(ChronoField.DAY_OF_MONTH), parse.get(ChronoField.DAY_OF_WEEK) - 1, str);
    }

    public abstract Serializable c(bmv.a aVar, boolean z, ContinuationImpl continuationImpl);

    public vm7() {
        this(a.C3896a.a);
    }
}
