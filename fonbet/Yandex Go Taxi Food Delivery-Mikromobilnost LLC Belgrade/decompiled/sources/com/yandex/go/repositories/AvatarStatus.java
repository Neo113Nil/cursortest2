package com.yandex.go.repositories;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/repositories/AvatarStatus;", "", "", "text", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NOT_FOUND_STATUS", "APPROVED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AvatarStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AvatarStatus[] $VALUES;
    public static final AvatarStatus APPROVED;
    public static final AvatarStatus NOT_FOUND_STATUS;
    private final String text;

    static {
        AvatarStatus avatarStatus = new AvatarStatus("NOT_FOUND_STATUS", 0, "not_found");
        NOT_FOUND_STATUS = avatarStatus;
        AvatarStatus avatarStatus2 = new AvatarStatus("APPROVED", 1, "approved");
        APPROVED = avatarStatus2;
        AvatarStatus[] avatarStatusArr = {avatarStatus, avatarStatus2};
        $VALUES = avatarStatusArr;
        $ENTRIES = kotlin.enums.a.a(avatarStatusArr);
    }

    public AvatarStatus(String str, int i, String str2) {
        this.text = str2;
    }

    public static AvatarStatus valueOf(String str) {
        return (AvatarStatus) Enum.valueOf(AvatarStatus.class, str);
    }

    public static AvatarStatus[] values() {
        return (AvatarStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
