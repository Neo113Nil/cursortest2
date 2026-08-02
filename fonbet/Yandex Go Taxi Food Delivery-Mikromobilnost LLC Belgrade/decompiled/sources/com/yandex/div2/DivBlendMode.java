package com.yandex.div2;

import defpackage.igk;
import defpackage.tls;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/div2/DivBlendMode;", "", "", "value", "Ljava/lang/String;", "Converter", "igk", "SOURCE_IN", "SOURCE_ATOP", "DARKEN", "LIGHTEN", "MULTIPLY", "SCREEN", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum DivBlendMode {
    SOURCE_IN("source_in"),
    SOURCE_ATOP("source_atop"),
    DARKEN("darken"),
    LIGHTEN("lighten"),
    MULTIPLY("multiply"),
    SCREEN(MetaDataField.SCREEN_FIELD);

    private final String value;
    public static final igk Converter = new igk();
    public static final tls TO_STRING = DivBlendMode$Converter$TO_STRING$1.w;
    public static final tls FROM_STRING = DivBlendMode$Converter$FROM_STRING$1.w;

    DivBlendMode(String str) {
        this.value = str;
    }
}
