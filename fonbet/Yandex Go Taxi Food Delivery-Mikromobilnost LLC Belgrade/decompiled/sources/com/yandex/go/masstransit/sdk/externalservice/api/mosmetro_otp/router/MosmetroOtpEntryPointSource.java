package com.yandex.go.masstransit.sdk.externalservice.api.mosmetro_otp.router;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/go/masstransit/sdk/externalservice/api/mosmetro_otp/router/MosmetroOtpEntryPointSource;", "", "DETAIL_CARD", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MosmetroOtpEntryPointSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MosmetroOtpEntryPointSource[] $VALUES;
    public static final MosmetroOtpEntryPointSource DETAIL_CARD;

    static {
        MosmetroOtpEntryPointSource mosmetroOtpEntryPointSource = new MosmetroOtpEntryPointSource("DETAIL_CARD", 0);
        DETAIL_CARD = mosmetroOtpEntryPointSource;
        MosmetroOtpEntryPointSource[] mosmetroOtpEntryPointSourceArr = {mosmetroOtpEntryPointSource};
        $VALUES = mosmetroOtpEntryPointSourceArr;
        $ENTRIES = a.a(mosmetroOtpEntryPointSourceArr);
    }

    public static MosmetroOtpEntryPointSource valueOf(String str) {
        return (MosmetroOtpEntryPointSource) Enum.valueOf(MosmetroOtpEntryPointSource.class, str);
    }

    public static MosmetroOtpEntryPointSource[] values() {
        return (MosmetroOtpEntryPointSource[]) $VALUES.clone();
    }
}
