package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.c4x;
import defpackage.ft6;
import defpackage.lb7;
import defpackage.tls;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes.dex */
public final class DivText$Image$Accessibility implements c4x {
    public static final Type d = Type.AUTO;
    public final Expression a;
    public final Type b;
    public Integer c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/div2/DivText$Image$Accessibility$Type;", "", "", "value", "Ljava/lang/String;", "Converter", "com/yandex/div2/q2", JCP.RAW_PREFIX, "BUTTON", "IMAGE", BaseDatabaseHelper.TYPE_TEXT, "AUTO", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Type {
        NONE("none"),
        BUTTON("button"),
        IMAGE("image"),
        TEXT("text"),
        AUTO("auto");

        private final String value;
        public static final q2 Converter = new q2();
        public static final tls TO_STRING = DivText$Image$Accessibility$Type$Converter$TO_STRING$1.w;
        public static final tls FROM_STRING = DivText$Image$Accessibility$Type$Converter$FROM_STRING$1.w;

        Type(String str) {
            this.value = str;
        }
    }

    public DivText$Image$Accessibility(Expression expression, Type type) {
        this.a = expression;
        this.b = type;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        r2 r2Var = (r2) ft6.b.T8.getValue();
        lb7 lb7Var = ft6.a;
        r2Var.getClass();
        return r2.c(lb7Var, this);
    }

    public DivText$Image$Accessibility() {
        this(null, d);
    }
}
