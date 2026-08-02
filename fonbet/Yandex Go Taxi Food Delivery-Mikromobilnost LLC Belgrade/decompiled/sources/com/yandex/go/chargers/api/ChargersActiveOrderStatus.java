package com.yandex.go.chargers.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/chargers/api/ChargersActiveOrderStatus;", "", "", "stringName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CREATED", "RESERVATION", "EXECUTION", "LEASING", "CANCELED", TlsConstants.TLS_FINISHED, "go-client-android.features.chargers:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersActiveOrderStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersActiveOrderStatus[] $VALUES;
    public static final ChargersActiveOrderStatus CANCELED;
    public static final ChargersActiveOrderStatus CREATED;
    public static final ChargersActiveOrderStatus EXECUTION;
    public static final ChargersActiveOrderStatus FINISHED;
    public static final ChargersActiveOrderStatus LEASING;
    public static final ChargersActiveOrderStatus RESERVATION;
    private final String stringName;

    static {
        ChargersActiveOrderStatus chargersActiveOrderStatus = new ChargersActiveOrderStatus("CREATED", 0, "created");
        CREATED = chargersActiveOrderStatus;
        ChargersActiveOrderStatus chargersActiveOrderStatus2 = new ChargersActiveOrderStatus("RESERVATION", 1, "reservation");
        RESERVATION = chargersActiveOrderStatus2;
        ChargersActiveOrderStatus chargersActiveOrderStatus3 = new ChargersActiveOrderStatus("EXECUTION", 2, "execution");
        EXECUTION = chargersActiveOrderStatus3;
        ChargersActiveOrderStatus chargersActiveOrderStatus4 = new ChargersActiveOrderStatus("LEASING", 3, "leasing");
        LEASING = chargersActiveOrderStatus4;
        ChargersActiveOrderStatus chargersActiveOrderStatus5 = new ChargersActiveOrderStatus("CANCELED", 4, "canceled");
        CANCELED = chargersActiveOrderStatus5;
        ChargersActiveOrderStatus chargersActiveOrderStatus6 = new ChargersActiveOrderStatus(TlsConstants.TLS_FINISHED, 5, UgcLiveVideoData.UgcLiveStatus.FINISHED);
        FINISHED = chargersActiveOrderStatus6;
        ChargersActiveOrderStatus[] chargersActiveOrderStatusArr = {chargersActiveOrderStatus, chargersActiveOrderStatus2, chargersActiveOrderStatus3, chargersActiveOrderStatus4, chargersActiveOrderStatus5, chargersActiveOrderStatus6};
        $VALUES = chargersActiveOrderStatusArr;
        $ENTRIES = a.a(chargersActiveOrderStatusArr);
    }

    public ChargersActiveOrderStatus(String str, int i, String str2) {
        this.stringName = str2;
    }

    public static ChargersActiveOrderStatus valueOf(String str) {
        return (ChargersActiveOrderStatus) Enum.valueOf(ChargersActiveOrderStatus.class, str);
    }

    public static ChargersActiveOrderStatus[] values() {
        return (ChargersActiveOrderStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getStringName() {
        return this.stringName;
    }
}
