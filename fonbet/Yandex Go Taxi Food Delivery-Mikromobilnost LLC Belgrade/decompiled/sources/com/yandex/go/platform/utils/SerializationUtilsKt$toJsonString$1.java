package com.yandex.go.platform.utils;

import defpackage.bvu0;
import defpackage.tls;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import ru.CryptoPro.JCP.VMInspector.OpenList;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SerializationUtilsKt$toJsonString$1 extends Lambda implements tls {
    public static final SerializationUtilsKt$toJsonString$1 w = new SerializationUtilsKt$toJsonString$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof HashMap) {
            return "\"" + key + "\": {" + b.b((Map) value) + '}';
        }
        if (bvu0.m(10, String.valueOf(value)) != null) {
            return "\"" + key + "\": " + value;
        }
        return "\"" + key + "\": \"" + value + OpenList.CHAR_QUOTE;
    }
}
