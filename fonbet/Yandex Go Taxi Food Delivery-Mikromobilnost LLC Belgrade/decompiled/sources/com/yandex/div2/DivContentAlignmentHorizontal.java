package com.yandex.div2;

import defpackage.ekk;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/div2/DivContentAlignmentHorizontal;", "", "", "value", "Ljava/lang/String;", "Converter", "ekk", "LEFT", "CENTER", "RIGHT", "START", "END", "SPACE_BETWEEN", "SPACE_AROUND", "SPACE_EVENLY", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum DivContentAlignmentHorizontal {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");

    private final String value;
    public static final ekk Converter = new ekk();
    public static final tls TO_STRING = DivContentAlignmentHorizontal$Converter$TO_STRING$1.w;
    public static final tls FROM_STRING = DivContentAlignmentHorizontal$Converter$FROM_STRING$1.w;

    DivContentAlignmentHorizontal(String str) {
        this.value = str;
    }
}
