package com.ybsdk.screens.initial.deeplink;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/screens/initial/deeplink/DefaultOriginValues;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ExternalRedirect", "Unknown", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultOriginValues {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DefaultOriginValues[] $VALUES;
    public static final DefaultOriginValues ExternalRedirect = new DefaultOriginValues("ExternalRedirect", 0, "external_redirect");
    public static final DefaultOriginValues Unknown = new DefaultOriginValues("Unknown", 1, "unknown");
    private final String value;

    private static final /* synthetic */ DefaultOriginValues[] $values() {
        return new DefaultOriginValues[]{ExternalRedirect, Unknown};
    }

    static {
        DefaultOriginValues[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private DefaultOriginValues(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DefaultOriginValues valueOf(String str) {
        return (DefaultOriginValues) Enum.valueOf(DefaultOriginValues.class, str);
    }

    public static DefaultOriginValues[] values() {
        return (DefaultOriginValues[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
