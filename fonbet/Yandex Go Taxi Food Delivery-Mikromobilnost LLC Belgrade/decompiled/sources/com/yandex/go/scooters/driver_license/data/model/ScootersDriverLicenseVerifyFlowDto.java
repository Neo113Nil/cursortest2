package com.yandex.go.scooters.driver_license.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ijn0;
import defpackage.k4o;
import defpackage.s3n0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/scooters/driver_license/data/model/ScootersDriverLicenseVerifyFlowDto;", "", "", "flow", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "ijn0", "EDOCUMENT", "NO_IIN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDriverLicenseVerifyFlowDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersDriverLicenseVerifyFlowDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ijn0 Companion;
    public static final ScootersDriverLicenseVerifyFlowDto EDOCUMENT;
    public static final ScootersDriverLicenseVerifyFlowDto NO_IIN;
    private final String flow;

    static {
        ScootersDriverLicenseVerifyFlowDto scootersDriverLicenseVerifyFlowDto = new ScootersDriverLicenseVerifyFlowDto("EDOCUMENT", 0, "edocument");
        EDOCUMENT = scootersDriverLicenseVerifyFlowDto;
        ScootersDriverLicenseVerifyFlowDto scootersDriverLicenseVerifyFlowDto2 = new ScootersDriverLicenseVerifyFlowDto("NO_IIN", 1, "no_iin");
        NO_IIN = scootersDriverLicenseVerifyFlowDto2;
        ScootersDriverLicenseVerifyFlowDto[] scootersDriverLicenseVerifyFlowDtoArr = {scootersDriverLicenseVerifyFlowDto, scootersDriverLicenseVerifyFlowDto2};
        $VALUES = scootersDriverLicenseVerifyFlowDtoArr;
        $ENTRIES = kotlin.enums.a.a(scootersDriverLicenseVerifyFlowDtoArr);
        Companion = new ijn0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s3n0(15));
    }

    public ScootersDriverLicenseVerifyFlowDto(String str, int i, String str2) {
        this.flow = str2;
    }

    public static ScootersDriverLicenseVerifyFlowDto valueOf(String str) {
        return (ScootersDriverLicenseVerifyFlowDto) Enum.valueOf(ScootersDriverLicenseVerifyFlowDto.class, str);
    }

    public static ScootersDriverLicenseVerifyFlowDto[] values() {
        return (ScootersDriverLicenseVerifyFlowDto[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getFlow() {
        return this.flow;
    }
}
