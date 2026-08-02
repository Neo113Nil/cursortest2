package com.ybsdk.screens.registration.codeconfirmation.presentation;

import com.ybsdk.core.utils.ColorModel;
import defpackage.k4o;
import defpackage.ung0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationViewState$CodeState", "", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationViewState$CodeState;", "Lcom/ybsdk/core/utils/ColorModel;", "textColor", "<init>", "(Ljava/lang/String;ILcom/ybsdk/core/utils/ColorModel;)V", "Lcom/ybsdk/core/utils/ColorModel;", "getTextColor", "()Lcom/ybsdk/core/utils/ColorModel;", "DEFAULT", "ERROR", "SUCCESS", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CodeConfirmationViewState$CodeState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CodeConfirmationViewState$CodeState[] $VALUES;
    public static final CodeConfirmationViewState$CodeState DEFAULT = new CodeConfirmationViewState$CodeState("DEFAULT", 0, new ColorModel.Attr(ung0.ybColor_textIcon_primary));
    public static final CodeConfirmationViewState$CodeState ERROR = new CodeConfirmationViewState$CodeState("ERROR", 1, new ColorModel.Attr(ung0.ybColor_textIcon_negative));
    public static final CodeConfirmationViewState$CodeState SUCCESS = new CodeConfirmationViewState$CodeState("SUCCESS", 2, new ColorModel.Attr(ung0.ybColor_textIcon_positive));
    private final ColorModel textColor;

    private static final /* synthetic */ CodeConfirmationViewState$CodeState[] $values() {
        return new CodeConfirmationViewState$CodeState[]{DEFAULT, ERROR, SUCCESS};
    }

    static {
        CodeConfirmationViewState$CodeState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CodeConfirmationViewState$CodeState(String str, int i, ColorModel colorModel) {
        this.textColor = colorModel;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CodeConfirmationViewState$CodeState valueOf(String str) {
        return (CodeConfirmationViewState$CodeState) Enum.valueOf(CodeConfirmationViewState$CodeState.class, str);
    }

    public static CodeConfirmationViewState$CodeState[] values() {
        return (CodeConfirmationViewState$CodeState[]) $VALUES.clone();
    }

    public final ColorModel getTextColor() {
        return this.textColor;
    }
}
