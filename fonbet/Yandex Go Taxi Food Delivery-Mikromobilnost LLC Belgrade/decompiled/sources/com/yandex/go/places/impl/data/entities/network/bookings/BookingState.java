package com.yandex.go.places.impl.data.entities.network.bookings;

import defpackage.av5;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.u86;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/bookings/BookingState;", "", "Companion", "u86", "CONFIRMATION", "PENDING", "COMPLETED", "CANCELLED", "CREATED", "CONFIRMED", "VISITED", "NOT_VISITED", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BookingState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BookingState[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final BookingState CANCELLED;
    public static final BookingState COMPLETED;
    public static final BookingState CONFIRMATION;
    public static final BookingState CONFIRMED;
    public static final BookingState CREATED;
    public static final u86 Companion;
    public static final BookingState NOT_VISITED;
    public static final BookingState PENDING;
    public static final BookingState UNKNOWN;
    public static final BookingState VISITED;

    static {
        BookingState bookingState = new BookingState("CONFIRMATION", 0);
        CONFIRMATION = bookingState;
        BookingState bookingState2 = new BookingState("PENDING", 1);
        PENDING = bookingState2;
        BookingState bookingState3 = new BookingState("COMPLETED", 2);
        COMPLETED = bookingState3;
        BookingState bookingState4 = new BookingState("CANCELLED", 3);
        CANCELLED = bookingState4;
        BookingState bookingState5 = new BookingState("CREATED", 4);
        CREATED = bookingState5;
        BookingState bookingState6 = new BookingState("CONFIRMED", 5);
        CONFIRMED = bookingState6;
        BookingState bookingState7 = new BookingState("VISITED", 6);
        VISITED = bookingState7;
        BookingState bookingState8 = new BookingState("NOT_VISITED", 7);
        NOT_VISITED = bookingState8;
        BookingState bookingState9 = new BookingState("UNKNOWN", 8);
        UNKNOWN = bookingState9;
        BookingState[] bookingStateArr = {bookingState, bookingState2, bookingState3, bookingState4, bookingState5, bookingState6, bookingState7, bookingState8, bookingState9};
        $VALUES = bookingStateArr;
        $ENTRIES = kotlin.enums.a.a(bookingStateArr);
        Companion = new u86();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new av5(14));
    }

    public static BookingState valueOf(String str) {
        return (BookingState) Enum.valueOf(BookingState.class, str);
    }

    public static BookingState[] values() {
        return (BookingState[]) $VALUES.clone();
    }
}
