package com.yandex.quark.js;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/quark/js/QuarkJsState;", "", "NOT_CONNECTED", "CONNECTING", "CONNECTED", "DESTROYED", "quark-js_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class QuarkJsState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QuarkJsState[] $VALUES;
    public static final QuarkJsState CONNECTED;
    public static final QuarkJsState CONNECTING;
    public static final QuarkJsState DESTROYED;
    public static final QuarkJsState NOT_CONNECTED;

    static {
        QuarkJsState quarkJsState = new QuarkJsState() { // from class: com.yandex.quark.js.QuarkJsState.NOT_CONNECTED
            @Override // com.yandex.quark.js.QuarkJsState
            public final boolean a(QuarkJsState quarkJsState2) {
                return quarkJsState2 == QuarkJsState.CONNECTING || quarkJsState2 == QuarkJsState.DESTROYED;
            }
        };
        NOT_CONNECTED = quarkJsState;
        QuarkJsState quarkJsState2 = new QuarkJsState() { // from class: com.yandex.quark.js.QuarkJsState.CONNECTING
            @Override // com.yandex.quark.js.QuarkJsState
            public final boolean a(QuarkJsState quarkJsState3) {
                return quarkJsState3 == QuarkJsState.CONNECTED || quarkJsState3 == QuarkJsState.NOT_CONNECTED || quarkJsState3 == QuarkJsState.DESTROYED;
            }
        };
        CONNECTING = quarkJsState2;
        QuarkJsState quarkJsState3 = new QuarkJsState() { // from class: com.yandex.quark.js.QuarkJsState.CONNECTED
            @Override // com.yandex.quark.js.QuarkJsState
            public final boolean a(QuarkJsState quarkJsState4) {
                return quarkJsState4 == QuarkJsState.NOT_CONNECTED || quarkJsState4 == QuarkJsState.DESTROYED;
            }
        };
        CONNECTED = quarkJsState3;
        QuarkJsState quarkJsState4 = new QuarkJsState() { // from class: com.yandex.quark.js.QuarkJsState.DESTROYED
            @Override // com.yandex.quark.js.QuarkJsState
            public final boolean a(QuarkJsState quarkJsState5) {
                return false;
            }
        };
        DESTROYED = quarkJsState4;
        QuarkJsState[] quarkJsStateArr = {quarkJsState, quarkJsState2, quarkJsState3, quarkJsState4};
        $VALUES = quarkJsStateArr;
        $ENTRIES = a.a(quarkJsStateArr);
    }

    public static QuarkJsState valueOf(String str) {
        return (QuarkJsState) Enum.valueOf(QuarkJsState.class, str);
    }

    public static QuarkJsState[] values() {
        return (QuarkJsState[]) $VALUES.clone();
    }

    public abstract boolean a(QuarkJsState quarkJsState);
}
