package com.yandex.messaging;

import com.yandex.messaging.core.net.entities.PersonalUserData;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/messaging/InitialOrganizationStrategy;", "", "Zero", "FirstAvailable", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class InitialOrganizationStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InitialOrganizationStrategy[] $VALUES;
    public static final InitialOrganizationStrategy FirstAvailable;
    public static final InitialOrganizationStrategy Zero;

    static {
        InitialOrganizationStrategy initialOrganizationStrategy = new InitialOrganizationStrategy() { // from class: com.yandex.messaging.InitialOrganizationStrategy.Zero
            @Override // com.yandex.messaging.InitialOrganizationStrategy
            public final long a(PersonalUserData.Organization[] organizationArr) {
                return 0L;
            }
        };
        Zero = initialOrganizationStrategy;
        InitialOrganizationStrategy initialOrganizationStrategy2 = new InitialOrganizationStrategy() { // from class: com.yandex.messaging.InitialOrganizationStrategy.FirstAvailable
            @Override // com.yandex.messaging.InitialOrganizationStrategy
            public final long a(PersonalUserData.Organization[] organizationArr) {
                PersonalUserData.Organization organization;
                if (organizationArr == null) {
                    return 0L;
                }
                int length = organizationArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        organization = null;
                        break;
                    }
                    organization = organizationArr[i];
                    if (!organization.isPublic && !organization.disabled) {
                        break;
                    }
                    i++;
                }
                if (organization != null) {
                    return organization.organizationId;
                }
                return 0L;
            }
        };
        FirstAvailable = initialOrganizationStrategy2;
        InitialOrganizationStrategy[] initialOrganizationStrategyArr = {initialOrganizationStrategy, initialOrganizationStrategy2};
        $VALUES = initialOrganizationStrategyArr;
        $ENTRIES = kotlin.enums.a.a(initialOrganizationStrategyArr);
    }

    public static InitialOrganizationStrategy valueOf(String str) {
        return (InitialOrganizationStrategy) Enum.valueOf(InitialOrganizationStrategy.class, str);
    }

    public static InitialOrganizationStrategy[] values() {
        return (InitialOrganizationStrategy[]) $VALUES.clone();
    }

    public abstract long a(PersonalUserData.Organization[] organizationArr);
}
