package xsna;

import java.util.Calendar;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: CalendarUtils.kt */
/* loaded from: classes17.dex */
public final class c09 {
    public static final /* synthetic */ qcy<Object>[] b = {new PropertyReference1Impl(c09.class, "tempCalendar1", "getTempCalendar1()Ljava/util/Calendar;", 0), b09.a(0, c09.class, "tempCalendar2", "getTempCalendar2()Ljava/util/Calendar;", fpf0.a)};
    public static final c09 a = new c09();
    public static final wqo0 c = new wqo0(new com.vk.movika.sdk.base.logic.interactor.l(7));
    public static final wqo0 d = new wqo0(new com.vk.movika.sdk.base.logic.interactor.m(5));

    public static Calendar a() {
        qcy<Object> qcyVar = b[0];
        wqo0 wqo0Var = c;
        wqo0Var.getClass();
        return (Calendar) wqo0Var.get();
    }

    public static Calendar b() {
        qcy<Object> qcyVar = b[1];
        wqo0 wqo0Var = d;
        wqo0Var.getClass();
        return (Calendar) wqo0Var.get();
    }

    public static final boolean c(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static final boolean d(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1);
    }

    public static final boolean e(Calendar calendar, Calendar calendar2) {
        a.getClass();
        a().setTimeInMillis(calendar.getTimeInMillis());
        b().setTimeInMillis(calendar2.getTimeInMillis());
        b().add(5, -1);
        return c(a(), b());
    }

    public static final boolean f(Calendar calendar, Calendar calendar2) {
        a.getClass();
        a().setTimeInMillis(calendar.getTimeInMillis());
        b().setTimeInMillis(calendar2.getTimeInMillis());
        b().add(5, 1);
        return c(a(), b());
    }
}
