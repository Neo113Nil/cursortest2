package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivTransitionSelector;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class omk implements c4x {
    public static final kvo i = new kvo(DivTransitionSelector.NONE);
    public final List a;
    public final String b;
    public final List c;
    public final List d;
    public final Expression e;
    public final List f;
    public final List g;
    public final List h;

    public /* synthetic */ omk(List list, String str, List list2, List list3, Expression expression, List list4, List list5, List list6, int i2) {
        this((i2 & 1) != 0 ? null : list, str, list2, list3, (i2 & 16) != 0 ? i : expression, list4, list5, (i2 & 128) != 0 ? null : list6);
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((umk) ft6.b.N2.getValue()).b(ft6.a, this);
    }

    public omk(List list, String str, List list2, List list3, Expression expression, List list4, List list5, List list6) {
        this.a = list;
        this.b = str;
        this.c = list2;
        this.d = list3;
        this.e = expression;
        this.f = list4;
        this.g = list5;
        this.h = list6;
    }
}
