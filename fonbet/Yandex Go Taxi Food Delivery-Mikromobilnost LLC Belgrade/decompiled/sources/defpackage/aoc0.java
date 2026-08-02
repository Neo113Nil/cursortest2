package defpackage;

import com.yandex.plus.home.plaque.repository.graphql.cache.dto.NotificationDto$Position;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.WidgetDto$Group$Line$Orientation;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class aoc0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[WidgetDto$Group$Line$Orientation.values().length];
        try {
            iArr[WidgetDto$Group$Line$Orientation.HORIZONTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WidgetDto$Group$Line$Orientation.VERTICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[NotificationDto$Position.values().length];
        try {
            iArr2[NotificationDto$Position.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[NotificationDto$Position.TOP_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[NotificationDto$Position.BOTTOM_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[NotificationDto$Position.BOTTOM_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
