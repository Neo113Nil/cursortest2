package com.yandex.plus.pay.api.model;

import defpackage.k4o;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/yandex/plus/pay/api/model/SyncType;", "", "<init>", "(Ljava/lang/String;I)V", "PASSPORT", "Companion", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SyncType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SyncType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SyncType PASSPORT = new SyncType("PASSPORT", 0);

    private static final /* synthetic */ SyncType[] $values() {
        return new SyncType[]{PASSPORT};
    }

    static {
        SyncType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        INSTANCE = new Companion(null);
    }

    private SyncType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SyncType valueOf(String str) {
        return (SyncType) Enum.valueOf(SyncType.class, str);
    }

    public static SyncType[] values() {
        return (SyncType[]) $VALUES.clone();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/SyncType$Companion;", "", "<init>", "()V", "all", "", "Lcom/yandex/plus/pay/api/model/SyncType;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<SyncType> all() {
            return Collections.singleton(SyncType.PASSPORT);
        }

        private Companion() {
        }
    }
}
