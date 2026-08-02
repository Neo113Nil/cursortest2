package com.ybsdk.feature.pin.api.entities;

import com.ybsdk.core.utils.text.Text;
import defpackage.dzh0;
import defpackage.k4o;
import defpackage.unr0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/ybsdk/feature/pin/api/entities/BiometricHelper$PromptContent", "", "Lcom/ybsdk/feature/pin/api/entities/BiometricHelper$PromptContent;", "Lcom/ybsdk/core/utils/text/Text;", "title", "negativeButtonText", "<init>", "(Ljava/lang/String;ILcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;)V", "Lcom/ybsdk/core/utils/text/Text;", "getTitle", "()Lcom/ybsdk/core/utils/text/Text;", "getNegativeButtonText", "Add", "Verify", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BiometricHelper$PromptContent {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BiometricHelper$PromptContent[] $VALUES;
    public static final BiometricHelper$PromptContent Add;
    public static final BiometricHelper$PromptContent Verify;
    private final Text negativeButtonText;
    private final Text title;

    private static final /* synthetic */ BiometricHelper$PromptContent[] $values() {
        return new BiometricHelper$PromptContent[]{Add, Verify};
    }

    static {
        com.ybsdk.core.utils.text.b bVar = Text.Companion;
        Add = new BiometricHelper$PromptContent("Add", 0, unr0.h(bVar, dzh0.ybsdk_pin_biometric_add_title), unr0.h(bVar, dzh0.ybsdk_pin_biometric_add_cancel));
        Verify = new BiometricHelper$PromptContent("Verify", 1, unr0.h(bVar, dzh0.ybsdk_pin_biometric_verify_title), unr0.h(bVar, dzh0.ybsdk_pin_biometric_add_cancel));
        BiometricHelper$PromptContent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private BiometricHelper$PromptContent(String str, int i, Text text, Text text2) {
        this.title = text;
        this.negativeButtonText = text2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static BiometricHelper$PromptContent valueOf(String str) {
        return (BiometricHelper$PromptContent) Enum.valueOf(BiometricHelper$PromptContent.class, str);
    }

    public static BiometricHelper$PromptContent[] values() {
        return (BiometricHelper$PromptContent[]) $VALUES.clone();
    }

    public final Text getNegativeButtonText() {
        return this.negativeButtonText;
    }

    public final Text getTitle() {
        return this.title;
    }
}
