package com.ybsdk.core.stories;

import defpackage.k3z;
import defpackage.k4o;
import defpackage.uxg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000ej\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/core/stories/LocalImageEnum;", "", "", "assertName", "", "lightId", "darkId", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "Ljava/lang/String;", "getAssertName", "()Ljava/lang/String;", CA20Status.STATUS_USER_I, "getLightId", "()I", "getDarkId", "Companion", "k3z", "YA_PAY_BRANDS", "POS_TERMINAL", "YA_PAY_CASHBACK", "SPLIT_BOX", "CARD_MIR", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LocalImageEnum {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LocalImageEnum[] $VALUES;
    public static final k3z Companion;
    private final String assertName;
    private final int darkId;
    private final int lightId;
    public static final LocalImageEnum YA_PAY_BRANDS = new LocalImageEnum("YA_PAY_BRANDS", 0, "ya_pay_brands", uxg0.ybsdk_image_brands_light, uxg0.ybsdk_image_brands_dark);
    public static final LocalImageEnum POS_TERMINAL = new LocalImageEnum("POS_TERMINAL", 1, "pos_terminal", uxg0.ybsdk_image_pos_terminal, 0, 4, null);
    public static final LocalImageEnum YA_PAY_CASHBACK = new LocalImageEnum("YA_PAY_CASHBACK", 2, "ya_pay_cashback", uxg0.ybsdk_image_pay_cashback, 0, 4, null);
    public static final LocalImageEnum SPLIT_BOX = new LocalImageEnum("SPLIT_BOX", 3, "split_box", uxg0.ybsdk_image_split_box, 0, 4, null);
    public static final LocalImageEnum CARD_MIR = new LocalImageEnum("CARD_MIR", 4, "card_mir", uxg0.ybsdk_image_card_mir, 0, 4, null);

    private static final /* synthetic */ LocalImageEnum[] $values() {
        return new LocalImageEnum[]{YA_PAY_BRANDS, POS_TERMINAL, YA_PAY_CASHBACK, SPLIT_BOX, CARD_MIR};
    }

    static {
        LocalImageEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new k3z();
    }

    private LocalImageEnum(String str, int i, String str2, int i2, int i3) {
        this.assertName = str2;
        this.lightId = i2;
        this.darkId = i3;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static LocalImageEnum valueOf(String str) {
        return (LocalImageEnum) Enum.valueOf(LocalImageEnum.class, str);
    }

    public static LocalImageEnum[] values() {
        return (LocalImageEnum[]) $VALUES.clone();
    }

    public final String getAssertName() {
        return this.assertName;
    }

    public final int getDarkId() {
        return this.darkId;
    }

    public final int getLightId() {
        return this.lightId;
    }

    public /* synthetic */ LocalImageEnum(String str, int i, String str2, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, i2, (i4 & 4) != 0 ? i2 : i3);
    }
}
