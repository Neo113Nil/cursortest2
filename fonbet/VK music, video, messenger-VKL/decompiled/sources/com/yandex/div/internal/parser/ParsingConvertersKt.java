package com.yandex.div.internal.parser;

import android.net.Uri;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.internal.util.ConvertUtilsKt;
import xsna.izs;

/* compiled from: ParsingConverters.kt */
/* loaded from: classes7.dex */
public final class ParsingConvertersKt {
    public static final izs<Integer, String> COLOR_INT_TO_STRING = new izs<Integer, String>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$COLOR_INT_TO_STRING$1
        @Override // xsna.izs
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final String invoke(int i) {
            return Color.m191toStringimpl(Color.m185constructorimpl(i));
        }
    };
    public static final izs<Object, Integer> STRING_TO_COLOR_INT = new izs<Object, Integer>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$STRING_TO_COLOR_INT$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xsna.izs
        public final Integer invoke(Object obj) {
            if (obj instanceof String) {
                return Integer.valueOf(Color.Companion.m194parseC4zCDoM((String) obj));
            }
            if (obj instanceof Color) {
                return Integer.valueOf(((Color) obj).m192unboximpl());
            }
            if (obj == null) {
                return null;
            }
            throw new ClassCastException("Received value of wrong type");
        }
    };
    public static final izs<Uri, String> URI_TO_STRING = new izs<Uri, String>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$URI_TO_STRING$1
        @Override // xsna.izs
        public final String invoke(Uri uri) {
            return uri.toString();
        }
    };
    public static final izs<String, Uri> STRING_TO_URI = new izs<String, Uri>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$STRING_TO_URI$1
        @Override // xsna.izs
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    };
    public static final izs<Object, Uri> ANY_TO_URI = new izs<Object, Uri>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$ANY_TO_URI$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xsna.izs
        public final Uri invoke(Object obj) {
            if (obj instanceof String) {
                return Uri.parse((String) obj);
            }
            if (obj instanceof Url) {
                return Uri.parse(((Url) obj).m201unboximpl());
            }
            throw new ClassCastException("Received value of wrong type");
        }
    };
    public static final izs<Object, Boolean> ANY_TO_BOOLEAN = new izs<Object, Boolean>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$ANY_TO_BOOLEAN$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof Number) {
                return ConvertUtilsKt.toBoolean((Number) obj);
            }
            throw new ClassCastException("Received value of wrong type");
        }
    };
    public static final izs<Number, Double> NUMBER_TO_DOUBLE = new izs<Number, Double>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$NUMBER_TO_DOUBLE$1
        @Override // xsna.izs
        public final Double invoke(Number number) {
            return Double.valueOf(number.doubleValue());
        }
    };
    public static final izs<Number, Long> NUMBER_TO_INT = new izs<Number, Long>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$NUMBER_TO_INT$1
        @Override // xsna.izs
        public final Long invoke(Number number) {
            return Long.valueOf(number.longValue());
        }
    };
}
