package com.yandex.go.taxi.summary.mobilityhub.verticalhub.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/model/ModalState;", "", "Anchored", "Expanded", "Other", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ModalState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ModalState[] $VALUES;
    public static final ModalState Anchored;
    public static final ModalState Expanded;
    public static final ModalState Other;

    static {
        ModalState modalState = new ModalState("Anchored", 0);
        Anchored = modalState;
        ModalState modalState2 = new ModalState("Expanded", 1);
        Expanded = modalState2;
        ModalState modalState3 = new ModalState("Other", 2);
        Other = modalState3;
        ModalState[] modalStateArr = {modalState, modalState2, modalState3};
        $VALUES = modalStateArr;
        $ENTRIES = a.a(modalStateArr);
    }

    public static ModalState valueOf(String str) {
        return (ModalState) Enum.valueOf(ModalState.class, str);
    }

    public static ModalState[] values() {
        return (ModalState[]) $VALUES.clone();
    }
}
