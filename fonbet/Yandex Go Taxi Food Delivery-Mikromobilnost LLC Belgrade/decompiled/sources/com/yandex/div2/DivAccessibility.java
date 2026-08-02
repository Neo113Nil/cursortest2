package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.c4x;
import defpackage.ft6;
import defpackage.jl40;
import defpackage.kvo;
import defpackage.lb7;
import defpackage.ngd0;
import defpackage.qoi0;
import defpackage.rvo;
import defpackage.tls;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* loaded from: classes.dex */
public final class DivAccessibility implements c4x {
    public static final kvo i = ngd0.m(Mode.DEFAULT);
    public static final kvo j = ngd0.m(Boolean.FALSE);
    public static final Type k = Type.AUTO;
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final Expression e;
    public final Expression f;
    public final Type g;
    public Integer h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/div2/DivAccessibility$Mode;", "", "", "value", "Ljava/lang/String;", "Converter", "com/yandex/div2/a", "DEFAULT", "MERGE", "EXCLUDE", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Mode {
        DEFAULT("default"),
        MERGE("merge"),
        EXCLUDE("exclude");

        private final String value;
        public static final a Converter = new a();
        public static final tls TO_STRING = DivAccessibility$Mode$Converter$TO_STRING$1.w;
        public static final tls FROM_STRING = DivAccessibility$Mode$Converter$FROM_STRING$1.w;

        Mode(String str) {
            this.value = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div2/DivAccessibility$Type;", "", "", "value", "Ljava/lang/String;", "Converter", "com/yandex/div2/b", JCP.RAW_PREFIX, "BUTTON", "IMAGE", BaseDatabaseHelper.TYPE_TEXT, "EDIT_TEXT", IDialogId.INTENT_EXTRA_IN_HEADER, "TAB_BAR", "LIST", "SELECT", "CHECKBOX", "RADIO", "AUTO", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Type {
        NONE("none"),
        BUTTON("button"),
        IMAGE("image"),
        TEXT("text"),
        EDIT_TEXT("edit_text"),
        HEADER("header"),
        TAB_BAR("tab_bar"),
        LIST("list"),
        SELECT("select"),
        CHECKBOX("checkbox"),
        RADIO("radio"),
        AUTO("auto");

        private final String value;
        public static final b Converter = new b();
        public static final tls TO_STRING = DivAccessibility$Type$Converter$TO_STRING$1.w;
        public static final tls FROM_STRING = DivAccessibility$Type$Converter$FROM_STRING$1.w;

        Type(String str) {
            this.value = str;
        }
    }

    public DivAccessibility(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Type type) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
        this.e = expression5;
        this.f = expression6;
        this.g = type;
    }

    public final boolean a(DivAccessibility divAccessibility, rvo rvoVar, rvo rvoVar2) {
        if (divAccessibility == null) {
            return false;
        }
        Expression expression = this.a;
        String str = expression != null ? (String) expression.a(rvoVar) : null;
        Expression expression2 = divAccessibility.a;
        if (jl40.l(str, expression2 != null ? (String) expression2.a(rvoVar2) : null)) {
            Expression expression3 = this.b;
            String str2 = expression3 != null ? (String) expression3.a(rvoVar) : null;
            Expression expression4 = divAccessibility.b;
            if (jl40.l(str2, expression4 != null ? (String) expression4.a(rvoVar2) : null)) {
                Expression expression5 = this.c;
                Boolean bool = expression5 != null ? (Boolean) expression5.a(rvoVar) : null;
                Expression expression6 = divAccessibility.c;
                if (jl40.l(bool, expression6 != null ? (Boolean) expression6.a(rvoVar2) : null) && this.d.a(rvoVar) == divAccessibility.d.a(rvoVar2) && ((Boolean) this.e.a(rvoVar)).booleanValue() == ((Boolean) divAccessibility.e.a(rvoVar2)).booleanValue()) {
                    Expression expression7 = this.f;
                    String str3 = expression7 != null ? (String) expression7.a(rvoVar) : null;
                    Expression expression8 = divAccessibility.f;
                    if (jl40.l(str3, expression8 != null ? (String) expression8.a(rvoVar2) : null) && this.g == divAccessibility.g) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.h;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(DivAccessibility.class).hashCode();
        Expression expression = this.a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.b;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        Expression expression3 = this.c;
        int hashCode4 = this.e.hashCode() + this.d.hashCode() + hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
        Expression expression4 = this.f;
        int hashCode5 = this.g.hashCode() + hashCode4 + (expression4 != null ? expression4.hashCode() : 0);
        this.h = Integer.valueOf(hashCode5);
        return hashCode5;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        c cVar = (c) ft6.b.H.getValue();
        lb7 lb7Var = ft6.a;
        cVar.getClass();
        return c.c(lb7Var, this);
    }

    public DivAccessibility() {
        this(null, null, null, i, j, null, k);
    }
}
