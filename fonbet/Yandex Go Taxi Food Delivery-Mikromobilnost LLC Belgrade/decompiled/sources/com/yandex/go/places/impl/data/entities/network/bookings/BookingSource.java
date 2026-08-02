package com.yandex.go.places.impl.data.entities.network.bookings;

import defpackage.av5;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.t86;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/bookings/BookingSource;", "", "Companion", "t86", "MAPS", "ULTIMA", "FITMOST", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BookingSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BookingSource[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final t86 Companion;
    public static final BookingSource FITMOST;
    public static final BookingSource MAPS;
    public static final BookingSource ULTIMA;
    public static final BookingSource UNKNOWN;

    static {
        BookingSource bookingSource = new BookingSource("MAPS", 0);
        MAPS = bookingSource;
        BookingSource bookingSource2 = new BookingSource("ULTIMA", 1);
        ULTIMA = bookingSource2;
        BookingSource bookingSource3 = new BookingSource("FITMOST", 2);
        FITMOST = bookingSource3;
        BookingSource bookingSource4 = new BookingSource("UNKNOWN", 3);
        UNKNOWN = bookingSource4;
        BookingSource[] bookingSourceArr = {bookingSource, bookingSource2, bookingSource3, bookingSource4};
        $VALUES = bookingSourceArr;
        $ENTRIES = kotlin.enums.a.a(bookingSourceArr);
        Companion = new t86();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new av5(13));
    }

    public static BookingSource valueOf(String str) {
        return (BookingSource) Enum.valueOf(BookingSource.class, str);
    }

    public static BookingSource[] values() {
        return (BookingSource[]) $VALUES.clone();
    }
}
