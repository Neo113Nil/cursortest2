package com.ybsdk.core.analytics.generated.delegates;

import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.k4o;
import defpackage.uza;
import defpackage.y5e;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/ProEvents$ProStartSessionResultV2Action", "", "Lcom/ybsdk/core/analytics/generated/delegates/ProEvents$ProStartSessionResultV2Action;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "SUPPORT", "AUTHORIZATION", "YB_REGISTRATION", "APP_UPDATE", JCP.RAW_PREFIX, "PASSPORT_REGISTRATION", "CHANGE_PHONE", "AM_TOKEN_UPDATE", "ERROR", "REQUIRE_PIN", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProEvents$ProStartSessionResultV2Action {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProEvents$ProStartSessionResultV2Action[] $VALUES;
    public static final ProEvents$ProStartSessionResultV2Action AM_TOKEN_UPDATE;
    public static final ProEvents$ProStartSessionResultV2Action APP_UPDATE;
    public static final ProEvents$ProStartSessionResultV2Action CHANGE_PHONE;
    public static final ProEvents$ProStartSessionResultV2Action ERROR;
    public static final ProEvents$ProStartSessionResultV2Action NONE;
    public static final ProEvents$ProStartSessionResultV2Action PASSPORT_REGISTRATION;
    public static final ProEvents$ProStartSessionResultV2Action REQUIRE_PIN;
    public static final ProEvents$ProStartSessionResultV2Action YB_REGISTRATION;
    private final String originalValue;
    public static final ProEvents$ProStartSessionResultV2Action SUPPORT = new ProEvents$ProStartSessionResultV2Action("SUPPORT", 0, FoldersConfig.SUPPORT_FILTER_ID);
    public static final ProEvents$ProStartSessionResultV2Action AUTHORIZATION = new ProEvents$ProStartSessionResultV2Action("AUTHORIZATION", 1, "authorization");

    private static final /* synthetic */ ProEvents$ProStartSessionResultV2Action[] $values() {
        return new ProEvents$ProStartSessionResultV2Action[]{SUPPORT, AUTHORIZATION, YB_REGISTRATION, APP_UPDATE, NONE, PASSPORT_REGISTRATION, CHANGE_PHONE, AM_TOKEN_UPDATE, ERROR, REQUIRE_PIN};
    }

    static {
        byte[] bArr = y5e.i;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        YB_REGISTRATION = new ProEvents$ProStartSessionResultV2Action("YB_REGISTRATION", 2, new String(bArr2, uza.a));
        APP_UPDATE = new ProEvents$ProStartSessionResultV2Action("APP_UPDATE", 3, "app_update");
        NONE = new ProEvents$ProStartSessionResultV2Action(JCP.RAW_PREFIX, 4, "none");
        PASSPORT_REGISTRATION = new ProEvents$ProStartSessionResultV2Action("PASSPORT_REGISTRATION", 5, "passport_registration");
        CHANGE_PHONE = new ProEvents$ProStartSessionResultV2Action("CHANGE_PHONE", 6, "change_phone");
        AM_TOKEN_UPDATE = new ProEvents$ProStartSessionResultV2Action("AM_TOKEN_UPDATE", 7, "am_token_update");
        ERROR = new ProEvents$ProStartSessionResultV2Action("ERROR", 8, "error");
        REQUIRE_PIN = new ProEvents$ProStartSessionResultV2Action("REQUIRE_PIN", 9, "require_pin");
        ProEvents$ProStartSessionResultV2Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ProEvents$ProStartSessionResultV2Action(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ProEvents$ProStartSessionResultV2Action valueOf(String str) {
        return (ProEvents$ProStartSessionResultV2Action) Enum.valueOf(ProEvents$ProStartSessionResultV2Action.class, str);
    }

    public static ProEvents$ProStartSessionResultV2Action[] values() {
        return (ProEvents$ProStartSessionResultV2Action[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
