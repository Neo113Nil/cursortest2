package com.yandex.go.mainscreen.superapp.impl.header.presentation.header.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/mainscreen/superapp/impl/header/presentation/header/delegates/HeaderTranslationDelegate$State", "", "Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/delegates/HeaderTranslationDelegate$State;", "TranslatedToMinimum", "Translating", "TranslatedToZero", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HeaderTranslationDelegate$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HeaderTranslationDelegate$State[] $VALUES;
    public static final HeaderTranslationDelegate$State TranslatedToMinimum;
    public static final HeaderTranslationDelegate$State TranslatedToZero;
    public static final HeaderTranslationDelegate$State Translating;

    static {
        HeaderTranslationDelegate$State headerTranslationDelegate$State = new HeaderTranslationDelegate$State("TranslatedToMinimum", 0);
        TranslatedToMinimum = headerTranslationDelegate$State;
        HeaderTranslationDelegate$State headerTranslationDelegate$State2 = new HeaderTranslationDelegate$State("Translating", 1);
        Translating = headerTranslationDelegate$State2;
        HeaderTranslationDelegate$State headerTranslationDelegate$State3 = new HeaderTranslationDelegate$State("TranslatedToZero", 2);
        TranslatedToZero = headerTranslationDelegate$State3;
        HeaderTranslationDelegate$State[] headerTranslationDelegate$StateArr = {headerTranslationDelegate$State, headerTranslationDelegate$State2, headerTranslationDelegate$State3};
        $VALUES = headerTranslationDelegate$StateArr;
        $ENTRIES = a.a(headerTranslationDelegate$StateArr);
    }

    public static HeaderTranslationDelegate$State valueOf(String str) {
        return (HeaderTranslationDelegate$State) Enum.valueOf(HeaderTranslationDelegate$State.class, str);
    }

    public static HeaderTranslationDelegate$State[] values() {
        return (HeaderTranslationDelegate$State[]) $VALUES.clone();
    }
}
