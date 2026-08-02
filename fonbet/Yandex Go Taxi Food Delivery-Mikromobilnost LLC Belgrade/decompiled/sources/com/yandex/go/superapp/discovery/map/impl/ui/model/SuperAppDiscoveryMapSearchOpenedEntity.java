package com.yandex.go.superapp.discovery.map.impl.ui.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/ui/model/SuperAppDiscoveryMapSearchOpenedEntity;", "", "TRANSPORT", "PLACES", "DEEPLINK", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppDiscoveryMapSearchOpenedEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperAppDiscoveryMapSearchOpenedEntity[] $VALUES;
    public static final SuperAppDiscoveryMapSearchOpenedEntity DEEPLINK;
    public static final SuperAppDiscoveryMapSearchOpenedEntity NONE;
    public static final SuperAppDiscoveryMapSearchOpenedEntity PLACES;
    public static final SuperAppDiscoveryMapSearchOpenedEntity TRANSPORT;

    static {
        SuperAppDiscoveryMapSearchOpenedEntity superAppDiscoveryMapSearchOpenedEntity = new SuperAppDiscoveryMapSearchOpenedEntity("TRANSPORT", 0);
        TRANSPORT = superAppDiscoveryMapSearchOpenedEntity;
        SuperAppDiscoveryMapSearchOpenedEntity superAppDiscoveryMapSearchOpenedEntity2 = new SuperAppDiscoveryMapSearchOpenedEntity("PLACES", 1);
        PLACES = superAppDiscoveryMapSearchOpenedEntity2;
        SuperAppDiscoveryMapSearchOpenedEntity superAppDiscoveryMapSearchOpenedEntity3 = new SuperAppDiscoveryMapSearchOpenedEntity("DEEPLINK", 2);
        DEEPLINK = superAppDiscoveryMapSearchOpenedEntity3;
        SuperAppDiscoveryMapSearchOpenedEntity superAppDiscoveryMapSearchOpenedEntity4 = new SuperAppDiscoveryMapSearchOpenedEntity(JCP.RAW_PREFIX, 3);
        NONE = superAppDiscoveryMapSearchOpenedEntity4;
        SuperAppDiscoveryMapSearchOpenedEntity[] superAppDiscoveryMapSearchOpenedEntityArr = {superAppDiscoveryMapSearchOpenedEntity, superAppDiscoveryMapSearchOpenedEntity2, superAppDiscoveryMapSearchOpenedEntity3, superAppDiscoveryMapSearchOpenedEntity4};
        $VALUES = superAppDiscoveryMapSearchOpenedEntityArr;
        $ENTRIES = a.a(superAppDiscoveryMapSearchOpenedEntityArr);
    }

    public static SuperAppDiscoveryMapSearchOpenedEntity valueOf(String str) {
        return (SuperAppDiscoveryMapSearchOpenedEntity) Enum.valueOf(SuperAppDiscoveryMapSearchOpenedEntity.class, str);
    }

    public static SuperAppDiscoveryMapSearchOpenedEntity[] values() {
        return (SuperAppDiscoveryMapSearchOpenedEntity[]) $VALUES.clone();
    }
}
