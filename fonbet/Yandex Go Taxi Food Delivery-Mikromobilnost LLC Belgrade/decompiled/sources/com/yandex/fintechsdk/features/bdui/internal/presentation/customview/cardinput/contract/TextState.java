package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.contract;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/contract/TextState;", "", "REGULAR", "MASKED", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TextState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextState[] $VALUES;
    public static final TextState MASKED;
    public static final TextState REGULAR;

    static {
        TextState textState = new TextState("REGULAR", 0);
        REGULAR = textState;
        TextState textState2 = new TextState("MASKED", 1);
        MASKED = textState2;
        TextState[] textStateArr = {textState, textState2};
        $VALUES = textStateArr;
        $ENTRIES = a.a(textStateArr);
    }

    public static TextState valueOf(String str) {
        return (TextState) Enum.valueOf(TextState.class, str);
    }

    public static TextState[] values() {
        return (TextState[]) $VALUES.clone();
    }
}
