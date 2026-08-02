package xsna;

import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import kotlin.collections.builders.ListBuilder;

/* compiled from: BookingRecordItem.kt */
/* loaded from: classes18.dex */
public final class av7 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final BookingRecord e;
    public final ListBuilder f;

    public av7(int i, String str, String str2, String str3, BookingRecord bookingRecord, ListBuilder listBuilder) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bookingRecord;
        this.f = listBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av7)) {
            return false;
        }
        av7 av7Var = (av7) obj;
        return this.a == av7Var.a && epx.f(this.b, av7Var.b) && this.c.equals(av7Var.c) && this.d.equals(av7Var.d) && epx.f(this.e, av7Var.e) && this.f.equals(av7Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + urd0.a(urd0.a(urd0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        return "BookingRecordItem(dateTime=" + this.a + ", name=" + this.b + ", avatarUrl=" + this.c + ", masterName=" + this.d + ", model=" + this.e + ", buttons=" + ((Object) wow.c(this.f)) + ')';
    }
}
