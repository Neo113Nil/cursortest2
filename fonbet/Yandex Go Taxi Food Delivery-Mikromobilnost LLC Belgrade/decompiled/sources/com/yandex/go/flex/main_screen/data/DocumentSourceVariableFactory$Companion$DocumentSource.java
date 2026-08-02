package com.yandex.go.flex.main_screen.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/flex/main_screen/data/DocumentSourceVariableFactory$Companion$DocumentSource", "", "Lcom/yandex/go/flex/main_screen/data/DocumentSourceVariableFactory$Companion$DocumentSource;", "", "source", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CACHE", "NETWORK", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DocumentSourceVariableFactory$Companion$DocumentSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DocumentSourceVariableFactory$Companion$DocumentSource[] $VALUES;
    public static final DocumentSourceVariableFactory$Companion$DocumentSource CACHE;
    public static final DocumentSourceVariableFactory$Companion$DocumentSource NETWORK;
    private final String source;

    static {
        DocumentSourceVariableFactory$Companion$DocumentSource documentSourceVariableFactory$Companion$DocumentSource = new DocumentSourceVariableFactory$Companion$DocumentSource("CACHE", 0, "cache");
        CACHE = documentSourceVariableFactory$Companion$DocumentSource;
        DocumentSourceVariableFactory$Companion$DocumentSource documentSourceVariableFactory$Companion$DocumentSource2 = new DocumentSourceVariableFactory$Companion$DocumentSource("NETWORK", 1, "network");
        NETWORK = documentSourceVariableFactory$Companion$DocumentSource2;
        DocumentSourceVariableFactory$Companion$DocumentSource[] documentSourceVariableFactory$Companion$DocumentSourceArr = {documentSourceVariableFactory$Companion$DocumentSource, documentSourceVariableFactory$Companion$DocumentSource2};
        $VALUES = documentSourceVariableFactory$Companion$DocumentSourceArr;
        $ENTRIES = a.a(documentSourceVariableFactory$Companion$DocumentSourceArr);
    }

    public DocumentSourceVariableFactory$Companion$DocumentSource(String str, int i, String str2) {
        this.source = str2;
    }

    public static DocumentSourceVariableFactory$Companion$DocumentSource valueOf(String str) {
        return (DocumentSourceVariableFactory$Companion$DocumentSource) Enum.valueOf(DocumentSourceVariableFactory$Companion$DocumentSource.class, str);
    }

    public static DocumentSourceVariableFactory$Companion$DocumentSource[] values() {
        return (DocumentSourceVariableFactory$Companion$DocumentSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getSource() {
        return this.source;
    }
}
