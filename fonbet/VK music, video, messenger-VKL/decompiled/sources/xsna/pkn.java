package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAction;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivDownloadCallbacks.kt */
/* loaded from: classes8.dex */
public final class pkn implements JSONSerializable, Hashable {
    public final List<DivAction> a;
    public final List<DivAction> b;
    public Integer c;

    public pkn() {
        this(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0046, code lost:
    
        if (r8 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(pkn pknVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (pknVar == null) {
            return false;
        }
        List<DivAction> list = pknVar.b;
        List<DivAction> list2 = pknVar.a;
        List<DivAction> list3 = this.a;
        if (list3 != null) {
            if (list2 != null && list3.size() == list2.size()) {
                int i = 0;
                for (Object obj : list3) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    if (!((DivAction) obj).a(list2.get(i), expressionResolver, expressionResolver2)) {
                        break;
                    }
                    i = i2;
                }
                List<DivAction> list4 = this.b;
                if (list4 != null) {
                    if (list != null && list4.size() == list.size()) {
                        int i3 = 0;
                        for (Object obj2 : list4) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                e43.t();
                                throw null;
                            }
                            if (((DivAction) obj2).a(list.get(i3), expressionResolver, expressionResolver2)) {
                                i3 = i4;
                            }
                        }
                        return true;
                    }
                } else if (list == null) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int i;
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(pkn.class).hashCode();
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
        int i4 = i3 + i2;
        this.c = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        qkn qknVar = (qkn) BuiltInParserKt.getBuiltInParserComponent().S2.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        qknVar.getClass();
        JSONObject jSONObject = new JSONObject();
        com.yandex.div2.fe feVar = qknVar.a;
        JsonPropertyParser.writeList(builtInParsingContext, jSONObject, "on_fail_actions", this.a, feVar.k1);
        JsonPropertyParser.writeList(builtInParsingContext, jSONObject, "on_success_actions", this.b, feVar.k1);
        return jSONObject;
    }

    public pkn(List<DivAction> list, List<DivAction> list2) {
        this.a = list;
        this.b = list2;
    }
}
