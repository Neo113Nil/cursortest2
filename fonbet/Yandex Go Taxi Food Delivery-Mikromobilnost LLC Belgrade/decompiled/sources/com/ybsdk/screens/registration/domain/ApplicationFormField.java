package com.ybsdk.screens.registration.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/screens/registration/domain/ApplicationFormField;", "", "filedName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getFiledName", "()Ljava/lang/String;", "PHONE", "MASKED_PHONE", "PHONE_ID", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ApplicationFormField {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ApplicationFormField[] $VALUES;
    private final String filedName;
    public static final ApplicationFormField PHONE = new ApplicationFormField("PHONE", 0, "phone");
    public static final ApplicationFormField MASKED_PHONE = new ApplicationFormField("MASKED_PHONE", 1, "masked_phone");
    public static final ApplicationFormField PHONE_ID = new ApplicationFormField("PHONE_ID", 2, "phone_id");

    private static final /* synthetic */ ApplicationFormField[] $values() {
        return new ApplicationFormField[]{PHONE, MASKED_PHONE, PHONE_ID};
    }

    static {
        ApplicationFormField[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ApplicationFormField(String str, int i, String str2) {
        this.filedName = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ApplicationFormField valueOf(String str) {
        return (ApplicationFormField) Enum.valueOf(ApplicationFormField.class, str);
    }

    public static ApplicationFormField[] values() {
        return (ApplicationFormField[]) $VALUES.clone();
    }

    public final String getFiledName() {
        return this.filedName;
    }
}
