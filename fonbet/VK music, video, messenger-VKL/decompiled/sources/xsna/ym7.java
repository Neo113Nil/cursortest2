package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* compiled from: BookingCalendarModel.kt */
/* loaded from: classes18.dex */
public final class ym7 {
    public final b a;
    public final boolean b;
    public final BookingMaster c;
    public final boolean d;
    public final boolean e;
    public final e f;
    public final List<c> g;

    /* compiled from: BookingCalendarModel.kt */
    public static final class a implements Comparable<a> {
        public static final a g = new a(0, 0, 1, 0, "0-0-1");
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final String f;

        public a(int i, int i2, int i3, int i4, String str) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = str;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            int i = this.b - aVar.b;
            if (i != 0) {
                return Integer.signum(i);
            }
            int i2 = this.c - aVar.c;
            return i2 != 0 ? Integer.signum(i2) : Integer.signum(this.d - aVar.d);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && compareTo((a) obj) == 0;
        }

        public final int hashCode() {
            return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Date(year=");
            sb.append(this.b);
            sb.append(", month=");
            sb.append(this.c);
            sb.append(", day=");
            sb.append(this.d);
            sb.append(", dayOfWeek=");
            sb.append(this.e);
            sb.append(", isoString=");
            return ho8.a(sb, this.f, ')');
        }
    }

    /* compiled from: BookingCalendarModel.kt */
    public static final class b {
        public final a a;
        public final boolean b;

        public b(a aVar, boolean z) {
            this.a = aVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Day(date=");
            sb.append(this.a);
            sb.append(", hasTimeSlots=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: BookingCalendarModel.kt */
    public static final class c {
        public final int a;
        public final int b;
        public final List<b> c;

        public c(int i, int i2, ListBuilder listBuilder) {
            this.a = i;
            this.b = i2;
            this.c = listBuilder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Month(year=");
            sb.append(this.a);
            sb.append(", month=");
            sb.append(this.b);
            sb.append(", days=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* compiled from: BookingCalendarModel.kt */
    public static final class d {
        public final String a;
        public final String b;
        public final int c;
        public final Integer d;
        public final Integer e;
        public final int f;

        public d(String str, String str2, int i, Integer num, Integer num2, int i2) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = num;
            this.e = num2;
            this.f = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && this.c == dVar.c && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && this.f == dVar.f;
        }

        public final int hashCode() {
            int a = shy.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31);
            Integer num = this.d;
            int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.e;
            return Integer.hashCode(this.f) + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TimeSlot(timeString=");
            sb.append(this.a);
            sb.append(", datetime=");
            sb.append(this.b);
            sb.append(", seanceLength=");
            sb.append(this.c);
            sb.append(", capacity=");
            sb.append(this.d);
            sb.append(", recordsCount=");
            sb.append(this.e);
            sb.append(", activityId=");
            return vu5.b(sb, this.f, ')');
        }
    }

    /* compiled from: BookingCalendarModel.kt */
    public static final class e {
        public static final e e;
        public final List<d> a;
        public final List<d> b;
        public final List<d> c;
        public final List<d> d;

        static {
            EmptyList emptyList = EmptyList.b;
            e = new e(emptyList, emptyList, emptyList, emptyList);
        }

        public e(List<d> list, List<d> list2, List<d> list3, List<d> list4) {
            this.a = list;
            this.b = list2;
            this.c = list3;
            this.d = list4;
        }

        public final boolean a() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + fw3.a(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TimeSlotList(night=");
            sb.append(this.a);
            sb.append(", morning=");
            sb.append(this.b);
            sb.append(", day=");
            sb.append(this.c);
            sb.append(", evening=");
            return ms9.a(')', sb, this.d);
        }
    }

    public ym7(b bVar, boolean z, BookingMaster bookingMaster, boolean z2, boolean z3, e eVar, List<c> list) {
        this.a = bVar;
        this.b = z;
        this.c = bookingMaster;
        this.d = z2;
        this.e = z3;
        this.f = eVar;
        this.g = list;
    }

    public static ym7 a(ym7 ym7Var, b bVar, boolean z, e eVar, List list, int i) {
        if ((i & 1) != 0) {
            bVar = ym7Var.a;
        }
        b bVar2 = bVar;
        if ((i & 2) != 0) {
            z = ym7Var.b;
        }
        boolean z2 = z;
        BookingMaster bookingMaster = ym7Var.c;
        boolean z3 = ym7Var.d;
        boolean z4 = ym7Var.e;
        if ((i & 32) != 0) {
            eVar = ym7Var.f;
        }
        e eVar2 = eVar;
        if ((i & 64) != 0) {
            list = ym7Var.g;
        }
        ym7Var.getClass();
        return new ym7(bVar2, z2, bookingMaster, z3, z4, eVar2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym7)) {
            return false;
        }
        ym7 ym7Var = (ym7) obj;
        return epx.f(this.a, ym7Var.a) && this.b == ym7Var.b && epx.f(this.c, ym7Var.c) && this.d == ym7Var.d && this.e == ym7Var.e && epx.f(this.f, ym7Var.f) && epx.f(this.g, ym7Var.g);
    }

    public final int hashCode() {
        int b2 = qoy.b(this.a.hashCode() * 31, 31, this.b);
        BookingMaster bookingMaster = this.c;
        return this.g.hashCode() + ((this.f.hashCode() + qoy.b(qoy.b((b2 + (bookingMaster == null ? 0 : bookingMaster.hashCode())) * 31, 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookingCalendarModel(selectedDay=");
        sb.append(this.a);
        sb.append(", allMasters=");
        sb.append(this.b);
        sb.append(", master=");
        sb.append(this.c);
        sb.append(", isMasterChangeable=");
        sb.append(this.d);
        sb.append(", isServiceChangeable=");
        sb.append(this.e);
        sb.append(", slots=");
        sb.append(this.f);
        sb.append(", months=");
        return ms9.a(')', sb, this.g);
    }
}
