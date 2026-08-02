package com.yandex.go.superapp.tracking.models.dto;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardStatusLeadImageWithOverlayImageDto;", "Ly401;", "Companion", "OverlapCorner", "$serializer", "com/yandex/go/superapp/tracking/models/dto/p", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrackingCardStatusLeadImageWithOverlayImageDto implements y401 {
    public static final p Companion = new p();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(21))};
    public final r9v a;
    public final r9v b;
    public final OverlapCorner c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardStatusLeadImageWithOverlayImageDto$OverlapCorner;", "", "Companion", "com/yandex/go/superapp/tracking/models/dto/q", "TopStart", "TopEnd", "BottomStart", "BottomEnd", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class OverlapCorner {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ OverlapCorner[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final OverlapCorner BottomEnd;
        public static final OverlapCorner BottomStart;
        public static final q Companion;
        public static final OverlapCorner TopEnd;
        public static final OverlapCorner TopStart;

        static {
            OverlapCorner overlapCorner = new OverlapCorner("TopStart", 0);
            TopStart = overlapCorner;
            OverlapCorner overlapCorner2 = new OverlapCorner("TopEnd", 1);
            TopEnd = overlapCorner2;
            OverlapCorner overlapCorner3 = new OverlapCorner("BottomStart", 2);
            BottomStart = overlapCorner3;
            OverlapCorner overlapCorner4 = new OverlapCorner("BottomEnd", 3);
            BottomEnd = overlapCorner4;
            OverlapCorner[] overlapCornerArr = {overlapCorner, overlapCorner2, overlapCorner3, overlapCorner4};
            $VALUES = overlapCornerArr;
            $ENTRIES = kotlin.enums.a.a(overlapCornerArr);
            Companion = new q();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(22));
        }

        public static OverlapCorner valueOf(String str) {
            return (OverlapCorner) Enum.valueOf(OverlapCorner.class, str);
        }

        public static OverlapCorner[] values() {
            return (OverlapCorner[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TrackingCardStatusLeadImageWithOverlayImageDto(int i, r9v r9vVar, r9v r9vVar2, OverlapCorner overlapCorner) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = r9vVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = r9vVar2;
        }
        if ((i & 4) == 0) {
            this.c = OverlapCorner.BottomEnd;
        } else {
            this.c = overlapCorner;
        }
    }

    /* renamed from: a, reason: from getter */
    public final OverlapCorner getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final r9v getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final r9v getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingCardStatusLeadImageWithOverlayImageDto)) {
            return false;
        }
        TrackingCardStatusLeadImageWithOverlayImageDto trackingCardStatusLeadImageWithOverlayImageDto = (TrackingCardStatusLeadImageWithOverlayImageDto) obj;
        return jl40.l(this.a, trackingCardStatusLeadImageWithOverlayImageDto.a) && jl40.l(this.b, trackingCardStatusLeadImageWithOverlayImageDto.b) && this.c == trackingCardStatusLeadImageWithOverlayImageDto.c;
    }

    public final int hashCode() {
        r9v r9vVar = this.a;
        int hashCode = (r9vVar == null ? 0 : r9vVar.hashCode()) * 31;
        r9v r9vVar2 = this.b;
        return this.c.hashCode() + ((hashCode + (r9vVar2 != null ? r9vVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TrackingCardStatusLeadImageWithOverlayImageDto(primaryImage=" + this.a + ", overlayImage=" + this.b + ", overlapCorner=" + this.c + Extension.C_BRAKE;
    }

    public TrackingCardStatusLeadImageWithOverlayImageDto() {
        OverlapCorner overlapCorner = OverlapCorner.BottomEnd;
        this.a = null;
        this.b = null;
        this.c = overlapCorner;
    }
}
