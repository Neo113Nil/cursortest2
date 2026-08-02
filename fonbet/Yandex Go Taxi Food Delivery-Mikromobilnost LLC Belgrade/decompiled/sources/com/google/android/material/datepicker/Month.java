package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ny61;
import defpackage.yv21;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes11.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new Parcelable.Creator<Month>() { // from class: com.google.android.material.datepicker.Month.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Month createFromParcel(Parcel parcel) {
            return Month.create(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Month[] newArray(int i) {
            return new Month[i];
        }
    };
    final int daysInMonth;
    final int daysInWeek;
    private final Calendar firstOfMonth;
    private String longName;
    final int month;
    final long timeInMillis;
    final int year;

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c = yv21.c(calendar);
        this.firstOfMonth = c;
        this.month = c.get(2);
        this.year = c.get(1);
        this.daysInWeek = c.getMaximum(7);
        this.daysInMonth = c.getActualMaximum(5);
        this.timeInMillis = c.getTimeInMillis();
    }

    public static Month create(int i, int i2) {
        Calendar g = yv21.g(null);
        g.set(1, i);
        g.set(2, i2);
        return new Month(g);
    }

    public static Month current() {
        return new Month(yv21.f());
    }

    @Override // java.lang.Comparable
    public int compareTo(Month month) {
        return this.firstOfMonth.compareTo(month.firstOfMonth);
    }

    public int daysFromStartOfWeekToFirstOfMonth(int i) {
        int i2 = this.firstOfMonth.get(7);
        if (i <= 0) {
            i = this.firstOfMonth.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + this.daysInWeek : i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.month == month.month && this.year == month.year;
    }

    public long getDay(int i) {
        Calendar c = yv21.c(this.firstOfMonth);
        c.set(5, i);
        return c.getTimeInMillis();
    }

    public int getDayOfMonth(long j) {
        Calendar c = yv21.c(this.firstOfMonth);
        c.setTimeInMillis(j);
        return c.get(5);
    }

    public String getLongName() {
        if (this.longName == null) {
            this.longName = yv21.b("yMMMM", Locale.getDefault()).format(new Date(this.firstOfMonth.getTimeInMillis()));
        }
        return this.longName;
    }

    public long getStableId() {
        return this.firstOfMonth.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.month), Integer.valueOf(this.year)});
    }

    public Month monthsLater(int i) {
        Calendar c = yv21.c(this.firstOfMonth);
        c.add(2, i);
        return new Month(c);
    }

    public int monthsUntil(Month month) {
        if (this.firstOfMonth instanceof GregorianCalendar) {
            return (month.month - this.month) + ((month.year - this.year) * 12);
        }
        ny61.g("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.year);
        parcel.writeInt(this.month);
    }

    public static Month create(long j) {
        Calendar g = yv21.g(null);
        g.setTimeInMillis(j);
        return new Month(g);
    }
}
