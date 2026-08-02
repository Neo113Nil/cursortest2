package com.ybsdk.feature.pdf.internal.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/pdf/internal/entities/ButtonEntity$Alignment", "", "Lcom/ybsdk/feature/pdf/internal/entities/ButtonEntity$Alignment;", "<init>", "(Ljava/lang/String;I)V", "VERTICAL", "HORIZONTAL", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonEntity$Alignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonEntity$Alignment[] $VALUES;
    public static final ButtonEntity$Alignment VERTICAL = new ButtonEntity$Alignment("VERTICAL", 0);
    public static final ButtonEntity$Alignment HORIZONTAL = new ButtonEntity$Alignment("HORIZONTAL", 1);

    private static final /* synthetic */ ButtonEntity$Alignment[] $values() {
        return new ButtonEntity$Alignment[]{VERTICAL, HORIZONTAL};
    }

    static {
        ButtonEntity$Alignment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ButtonEntity$Alignment(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ButtonEntity$Alignment valueOf(String str) {
        return (ButtonEntity$Alignment) Enum.valueOf(ButtonEntity$Alignment.class, str);
    }

    public static ButtonEntity$Alignment[] values() {
        return (ButtonEntity$Alignment[]) $VALUES.clone();
    }
}
