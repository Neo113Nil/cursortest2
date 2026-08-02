package com.ybsdk.feature.qr.api.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/qr/api/domain/QrResolvingRulesSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "EXTERNAL", "INTERNAL", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QrResolvingRulesSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QrResolvingRulesSource[] $VALUES;
    public static final QrResolvingRulesSource EXTERNAL = new QrResolvingRulesSource("EXTERNAL", 0, "external");
    public static final QrResolvingRulesSource INTERNAL = new QrResolvingRulesSource("INTERNAL", 1, "internal");
    private final String value;

    private static final /* synthetic */ QrResolvingRulesSource[] $values() {
        return new QrResolvingRulesSource[]{EXTERNAL, INTERNAL};
    }

    static {
        QrResolvingRulesSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private QrResolvingRulesSource(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static QrResolvingRulesSource valueOf(String str) {
        return (QrResolvingRulesSource) Enum.valueOf(QrResolvingRulesSource.class, str);
    }

    public static QrResolvingRulesSource[] values() {
        return (QrResolvingRulesSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
