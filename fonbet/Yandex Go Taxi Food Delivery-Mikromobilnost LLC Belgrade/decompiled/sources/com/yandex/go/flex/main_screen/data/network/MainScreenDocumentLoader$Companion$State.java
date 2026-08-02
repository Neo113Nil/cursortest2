package com.yandex.go.flex.main_screen.data.network;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/flex/main_screen/data/network/MainScreenDocumentLoader$Companion$State", "", "Lcom/yandex/go/flex/main_screen/data/network/MainScreenDocumentLoader$Companion$State;", "BEFORE_FIRST_HEAD_REQUEST", "BEFORE_FIRST_HEAD_RESPONSE", "AFTER_FIRST_HEAD_RESPONSE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final class MainScreenDocumentLoader$Companion$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MainScreenDocumentLoader$Companion$State[] $VALUES;
    public static final MainScreenDocumentLoader$Companion$State AFTER_FIRST_HEAD_RESPONSE;
    public static final MainScreenDocumentLoader$Companion$State BEFORE_FIRST_HEAD_REQUEST;
    public static final MainScreenDocumentLoader$Companion$State BEFORE_FIRST_HEAD_RESPONSE;

    static {
        MainScreenDocumentLoader$Companion$State mainScreenDocumentLoader$Companion$State = new MainScreenDocumentLoader$Companion$State("BEFORE_FIRST_HEAD_REQUEST", 0);
        BEFORE_FIRST_HEAD_REQUEST = mainScreenDocumentLoader$Companion$State;
        MainScreenDocumentLoader$Companion$State mainScreenDocumentLoader$Companion$State2 = new MainScreenDocumentLoader$Companion$State("BEFORE_FIRST_HEAD_RESPONSE", 1);
        BEFORE_FIRST_HEAD_RESPONSE = mainScreenDocumentLoader$Companion$State2;
        MainScreenDocumentLoader$Companion$State mainScreenDocumentLoader$Companion$State3 = new MainScreenDocumentLoader$Companion$State("AFTER_FIRST_HEAD_RESPONSE", 2);
        AFTER_FIRST_HEAD_RESPONSE = mainScreenDocumentLoader$Companion$State3;
        MainScreenDocumentLoader$Companion$State[] mainScreenDocumentLoader$Companion$StateArr = {mainScreenDocumentLoader$Companion$State, mainScreenDocumentLoader$Companion$State2, mainScreenDocumentLoader$Companion$State3};
        $VALUES = mainScreenDocumentLoader$Companion$StateArr;
        $ENTRIES = kotlin.enums.a.a(mainScreenDocumentLoader$Companion$StateArr);
    }

    public static MainScreenDocumentLoader$Companion$State valueOf(String str) {
        return (MainScreenDocumentLoader$Companion$State) Enum.valueOf(MainScreenDocumentLoader$Companion$State.class, str);
    }

    public static MainScreenDocumentLoader$Companion$State[] values() {
        return (MainScreenDocumentLoader$Companion$State[]) $VALUES.clone();
    }
}
