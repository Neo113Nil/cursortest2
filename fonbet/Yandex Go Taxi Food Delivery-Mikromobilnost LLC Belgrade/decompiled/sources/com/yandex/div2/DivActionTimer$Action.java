package com.yandex.div2;

import defpackage.gak;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/div2/DivActionTimer$Action", "", "Lcom/yandex/div2/DivActionTimer$Action;", "", "value", "Ljava/lang/String;", "Converter", "gak", "START", "STOP", "PAUSE", "RESUME", "CANCEL", "RESET", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum DivActionTimer$Action {
    START("start"),
    STOP("stop"),
    PAUSE("pause"),
    RESUME("resume"),
    CANCEL("cancel"),
    RESET("reset");

    private final String value;
    public static final gak Converter = new gak();
    public static final tls TO_STRING = DivActionTimer$Action$Converter$TO_STRING$1.w;
    public static final tls FROM_STRING = DivActionTimer$Action$Converter$FROM_STRING$1.w;

    DivActionTimer$Action(String str) {
        this.value = str;
    }
}
