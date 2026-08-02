package xsna;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAction;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivActionDownload.kt */
/* loaded from: classes8.dex */
public final class cjn implements JSONSerializable, Hashable {
    public final List<DivAction> a;
    public final List<DivAction> b;
    public final Expression<Uri> c;
    public Integer d;

    public cjn(List<DivAction> list, List<DivAction> list2, Expression<Uri> expression) {
        this.a = list;
        this.b = list2;
        this.c = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int i;
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(cjn.class).hashCode();
        int i2 = 0;
        List<DivAction> list = this.a;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((DivAction) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        List<DivAction> list2 = this.b;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                i2 += ((DivAction) it2.next()).hash();
            }
        }
        int hashCode2 = this.c.hashCode() + i3 + i2;
        this.d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((djn) BuiltInParserKt.getBuiltInParserComponent().l0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
