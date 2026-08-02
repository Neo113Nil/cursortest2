package com.yandex.go.places.impl.data.entities.network.bookings;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.av5;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/bookings/BookingDto;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/bookings/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BookingDto {
    public static final a Companion = new a();
    public static final i3y[] u;
    public final String a;
    public final BookingSource b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final PriceDto i;
    public final String j;
    public final Integer k;
    public final BookingState l;
    public final String m;
    public final String n;
    public final ImageDto o;
    public final CategoryDto p;
    public final LocationDto q;
    public final String r;
    public final String s;
    public final String t;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        u = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new av5(11)), null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new av5(12)), null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ BookingDto(int i, String str, BookingSource bookingSource, String str2, String str3, String str4, String str5, String str6, String str7, PriceDto priceDto, String str8, Integer num, BookingState bookingState, String str9, String str10, ImageDto imageDto, CategoryDto categoryDto, LocationDto locationDto, String str11, String str12, String str13) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = BookingSource.UNKNOWN;
        } else {
            this.b = bookingSource;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str7;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = priceDto;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str8;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num;
        }
        if ((i & 2048) == 0) {
            this.l = BookingState.UNKNOWN;
        } else {
            this.l = bookingState;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str9;
        }
        if ((i & 8192) == 0) {
            this.n = "";
        } else {
            this.n = str10;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = imageDto;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = categoryDto;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = locationDto;
        }
        if ((131072 & i) == 0) {
            this.r = "";
        } else {
            this.r = str11;
        }
        if ((262144 & i) == 0) {
            this.s = "";
        } else {
            this.s = str12;
        }
        if ((i & 524288) == 0) {
            this.t = "";
        } else {
            this.t = str13;
        }
    }

    public BookingDto() {
        BookingSource bookingSource = BookingSource.UNKNOWN;
        BookingState bookingState = BookingState.UNKNOWN;
        this.a = "";
        this.b = bookingSource;
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = null;
        this.j = "";
        this.k = null;
        this.l = bookingState;
        this.m = null;
        this.n = "";
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = "";
        this.s = "";
        this.t = "";
    }
}
