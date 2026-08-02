package com.yandex.messaging.internal.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/messaging/internal/entities/AddresseeType;", "", "", "reportName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "CONTACT", "OTHER", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddresseeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddresseeType[] $VALUES;
    public static final AddresseeType CONTACT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AddresseeType OTHER;
    private final String reportName;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/AddresseeType$Companion;", "", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        AddresseeType addresseeType = new AddresseeType("CONTACT", 0, "contact");
        CONTACT = addresseeType;
        AddresseeType addresseeType2 = new AddresseeType("OTHER", 1, "other");
        OTHER = addresseeType2;
        AddresseeType[] addresseeTypeArr = {addresseeType, addresseeType2};
        $VALUES = addresseeTypeArr;
        $ENTRIES = a.a(addresseeTypeArr);
        INSTANCE = new Companion();
    }

    public AddresseeType(String str, int i, String str2) {
        this.reportName = str2;
    }

    public static AddresseeType valueOf(String str) {
        return (AddresseeType) Enum.valueOf(AddresseeType.class, str);
    }

    public static AddresseeType[] values() {
        return (AddresseeType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getReportName() {
        return this.reportName;
    }
}
