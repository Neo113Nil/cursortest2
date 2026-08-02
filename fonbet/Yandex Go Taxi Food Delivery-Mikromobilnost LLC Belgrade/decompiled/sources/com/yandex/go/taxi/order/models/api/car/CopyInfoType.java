package com.yandex.go.taxi.order.models.api.car;

import defpackage.k4o;
import defpackage.kyh0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/car/CopyInfoType;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", "stringId", CA20Status.STATUS_USER_I, "a", "()I", "CAR_NUMBER", "CAR_MARK", "CAR_NUMBER_AND_MARK", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CopyInfoType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CopyInfoType[] $VALUES;
    public static final CopyInfoType CAR_MARK;
    public static final CopyInfoType CAR_NUMBER;
    public static final CopyInfoType CAR_NUMBER_AND_MARK;
    private final String id;
    private final int stringId;

    static {
        CopyInfoType copyInfoType = new CopyInfoType("CAR_NUMBER", 0, "car_number_copied", kyh0.notification_car_number_copied);
        CAR_NUMBER = copyInfoType;
        CopyInfoType copyInfoType2 = new CopyInfoType("CAR_MARK", 1, "car_mark_copied", kyh0.notification_car_mark_copied);
        CAR_MARK = copyInfoType2;
        CopyInfoType copyInfoType3 = new CopyInfoType("CAR_NUMBER_AND_MARK", 2, "car_number_and_mark_copied", kyh0.notification_car_number_mark_copied);
        CAR_NUMBER_AND_MARK = copyInfoType3;
        CopyInfoType[] copyInfoTypeArr = {copyInfoType, copyInfoType2, copyInfoType3};
        $VALUES = copyInfoTypeArr;
        $ENTRIES = a.a(copyInfoTypeArr);
    }

    public CopyInfoType(String str, int i, String str2, int i2) {
        this.id = str2;
        this.stringId = i2;
    }

    public static CopyInfoType valueOf(String str) {
        return (CopyInfoType) Enum.valueOf(CopyInfoType.class, str);
    }

    public static CopyInfoType[] values() {
        return (CopyInfoType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getStringId() {
        return this.stringId;
    }

    public final String getId() {
        return this.id;
    }
}
