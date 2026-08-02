package com.yandex.go.superapp.tracking.models.dto;

import defpackage.b501;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nhz0;
import defpackage.r9v;
import defpackage.y401;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardStatusSquareImageDto;", "Ly401;", "Lb501;", "Companion", "Clipping", "$serializer", "com/yandex/go/superapp/tracking/models/dto/s", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrackingCardStatusSquareImageDto implements y401, b501 {
    public static final s Companion = new s();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(23))};
    public final r9v a;
    public final Clipping b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardStatusSquareImageDto$Clipping;", "", "Companion", "com/yandex/go/superapp/tracking/models/dto/r", "RoundedSquare", "Circle", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Clipping {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Clipping[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Clipping Circle;
        public static final r Companion;
        public static final Clipping RoundedSquare;

        static {
            Clipping clipping = new Clipping("RoundedSquare", 0);
            RoundedSquare = clipping;
            Clipping clipping2 = new Clipping("Circle", 1);
            Circle = clipping2;
            Clipping[] clippingArr = {clipping, clipping2};
            $VALUES = clippingArr;
            $ENTRIES = kotlin.enums.a.a(clippingArr);
            Companion = new r();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(24));
        }

        public static Clipping valueOf(String str) {
            return (Clipping) Enum.valueOf(Clipping.class, str);
        }

        public static Clipping[] values() {
            return (Clipping[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TrackingCardStatusSquareImageDto(int i, r9v r9vVar, Clipping clipping) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = r9vVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = clipping;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Clipping getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final r9v getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingCardStatusSquareImageDto)) {
            return false;
        }
        TrackingCardStatusSquareImageDto trackingCardStatusSquareImageDto = (TrackingCardStatusSquareImageDto) obj;
        return jl40.l(this.a, trackingCardStatusSquareImageDto.a) && this.b == trackingCardStatusSquareImageDto.b;
    }

    public final int hashCode() {
        r9v r9vVar = this.a;
        int hashCode = (r9vVar == null ? 0 : r9vVar.hashCode()) * 31;
        Clipping clipping = this.b;
        return hashCode + (clipping != null ? clipping.hashCode() : 0);
    }

    public final String toString() {
        return "TrackingCardStatusSquareImageDto(image=" + this.a + ", clipping=" + this.b + Extension.C_BRAKE;
    }

    public TrackingCardStatusSquareImageDto() {
        this.a = null;
        this.b = null;
    }
}
