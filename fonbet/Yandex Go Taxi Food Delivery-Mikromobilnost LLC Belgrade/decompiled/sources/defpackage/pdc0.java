package defpackage;

import com.yandex.go.places.map.domain.entities.PlacesPinWarV2Config$GeometryEasing;
import com.yandex.go.places.map.domain.entities.PlacesPinWarV2Config$ZoomStep;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class pdc0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PlacesPinWarV2Config$GeometryEasing.values().length];
        try {
            iArr[PlacesPinWarV2Config$GeometryEasing.LINEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlacesPinWarV2Config$GeometryEasing.EASE_IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlacesPinWarV2Config$GeometryEasing.EASE_OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlacesPinWarV2Config$GeometryEasing.EASE_IN_OUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[PlacesPinWarV2Config$ZoomStep.values().length];
        try {
            iArr2[PlacesPinWarV2Config$ZoomStep.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PlacesPinWarV2Config$ZoomStep.HALF.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PlacesPinWarV2Config$ZoomStep.QUARTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PlacesPinWarV2Config$ZoomStep.EIGHTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
