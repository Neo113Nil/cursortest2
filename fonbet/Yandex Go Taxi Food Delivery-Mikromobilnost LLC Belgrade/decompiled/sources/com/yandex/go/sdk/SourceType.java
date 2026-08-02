package com.yandex.go.sdk;

import defpackage.k4o;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/sdk/SourceType;", "", "Lq6z;", "source", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "OUTPUT", "GPS", "NETWORK", "FUSED", "MAPKIT", "LBS_WIFI", "LBS_GSM", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SourceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SourceType[] $VALUES;
    public static final SourceType FUSED;
    public static final SourceType GPS;
    public static final SourceType LBS_GSM;
    public static final SourceType LBS_WIFI;
    public static final SourceType MAPKIT;
    public static final SourceType NETWORK;
    public static final SourceType OUTPUT;
    private final String source;

    static {
        SourceType sourceType = new SourceType("OUTPUT", 0, "verified");
        OUTPUT = sourceType;
        SourceType sourceType2 = new SourceType("GPS", 1, "gps");
        GPS = sourceType2;
        SourceType sourceType3 = new SourceType("NETWORK", 2, "network");
        NETWORK = sourceType3;
        SourceType sourceType4 = new SourceType("FUSED", 3, GplLibraryWrapper.FUSED_PROVIDER);
        FUSED = sourceType4;
        SourceType sourceType5 = new SourceType("MAPKIT", 4, "ext_mapkit");
        MAPKIT = sourceType5;
        SourceType sourceType6 = new SourceType("LBS_WIFI", 5, "lbs-wifi");
        LBS_WIFI = sourceType6;
        SourceType sourceType7 = new SourceType("LBS_GSM", 6, "lbs-gsm");
        LBS_GSM = sourceType7;
        SourceType[] sourceTypeArr = {sourceType, sourceType2, sourceType3, sourceType4, sourceType5, sourceType6, sourceType7};
        $VALUES = sourceTypeArr;
        $ENTRIES = kotlin.enums.a.a(sourceTypeArr);
    }

    public SourceType(String str, int i, String str2) {
        this.source = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static SourceType valueOf(String str) {
        return (SourceType) Enum.valueOf(SourceType.class, str);
    }

    public static SourceType[] values() {
        return (SourceType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getSource() {
        return this.source;
    }
}
