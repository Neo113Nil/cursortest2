package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.xlw0;
import defpackage.zfx0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffGroupDefinitionPresentationType;", "", "Companion", "zfx0", "MODAL", "UNKNOWN", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TariffGroupDefinitionPresentationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffGroupDefinitionPresentationType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final zfx0 Companion;
    public static final TariffGroupDefinitionPresentationType MODAL;
    public static final TariffGroupDefinitionPresentationType UNKNOWN;

    static {
        TariffGroupDefinitionPresentationType tariffGroupDefinitionPresentationType = new TariffGroupDefinitionPresentationType("MODAL", 0);
        MODAL = tariffGroupDefinitionPresentationType;
        TariffGroupDefinitionPresentationType tariffGroupDefinitionPresentationType2 = new TariffGroupDefinitionPresentationType("UNKNOWN", 1);
        UNKNOWN = tariffGroupDefinitionPresentationType2;
        TariffGroupDefinitionPresentationType[] tariffGroupDefinitionPresentationTypeArr = {tariffGroupDefinitionPresentationType, tariffGroupDefinitionPresentationType2};
        $VALUES = tariffGroupDefinitionPresentationTypeArr;
        $ENTRIES = kotlin.enums.a.a(tariffGroupDefinitionPresentationTypeArr);
        Companion = new zfx0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlw0(23));
    }

    public static TariffGroupDefinitionPresentationType valueOf(String str) {
        return (TariffGroupDefinitionPresentationType) Enum.valueOf(TariffGroupDefinitionPresentationType.class, str);
    }

    public static TariffGroupDefinitionPresentationType[] values() {
        return (TariffGroupDefinitionPresentationType[]) $VALUES.clone();
    }
}
