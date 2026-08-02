package com.yandex.go.due_timetable.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/due_timetable/domain/model/CalculationsStatus;", "", "PENDING", TlsConstants.TLS_FINISHED, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CalculationsStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CalculationsStatus[] $VALUES;
    public static final CalculationsStatus FINISHED;
    public static final CalculationsStatus PENDING;

    static {
        CalculationsStatus calculationsStatus = new CalculationsStatus("PENDING", 0);
        PENDING = calculationsStatus;
        CalculationsStatus calculationsStatus2 = new CalculationsStatus(TlsConstants.TLS_FINISHED, 1);
        FINISHED = calculationsStatus2;
        CalculationsStatus[] calculationsStatusArr = {calculationsStatus, calculationsStatus2};
        $VALUES = calculationsStatusArr;
        $ENTRIES = a.a(calculationsStatusArr);
    }

    public static CalculationsStatus valueOf(String str) {
        return (CalculationsStatus) Enum.valueOf(CalculationsStatus.class, str);
    }

    public static CalculationsStatus[] values() {
        return (CalculationsStatus[]) $VALUES.clone();
    }
}
