package com.ybsdk.feature.transfer.version2.internal.screens.main.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/main/domain/Toggles;", "", "title", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "AUTO_TOPUP", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Toggles {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Toggles[] $VALUES;
    public static final Toggles AUTO_TOPUP = new Toggles("AUTO_TOPUP", 0, "auto_topup");
    private final String title;

    private static final /* synthetic */ Toggles[] $values() {
        return new Toggles[]{AUTO_TOPUP};
    }

    static {
        Toggles[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private Toggles(String str, int i, String str2) {
        this.title = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static Toggles valueOf(String str) {
        return (Toggles) Enum.valueOf(Toggles.class, str);
    }

    public static Toggles[] values() {
        return (Toggles[]) $VALUES.clone();
    }

    public final String getTitle() {
        return this.title;
    }
}
