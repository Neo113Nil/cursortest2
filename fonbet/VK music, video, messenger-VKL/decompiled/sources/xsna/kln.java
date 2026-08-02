package xsna;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivAction;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import org.json.JSONObject;
import xsna.jln;

/* compiled from: DivFocusJsonParser.kt */
/* loaded from: classes8.dex */
public final class kln implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public kln(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, jln jlnVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        List<com.yandex.div2.m1> list = jlnVar.a;
        com.yandex.div2.fe feVar = this.a;
        JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, list, feVar.F1);
        JsonPropertyParser.write(parsingContext, jSONObject, "border", jlnVar.b, feVar.L1);
        JsonPropertyParser.write(parsingContext, jSONObject, "next_focus_ids", jlnVar.c, feVar.C3);
        List<DivAction> list2 = jlnVar.d;
        bpn0 bpn0Var = feVar.k1;
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_blur", list2, bpn0Var);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_focus", jlnVar.e, bpn0Var);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        com.yandex.div2.fe feVar = this.a;
        List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
        com.yandex.div2.u1 u1Var = (com.yandex.div2.u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
        jln.a aVar = (jln.a) JsonPropertyParser.readOptional(parsingContext, jSONObject, "next_focus_ids", feVar.C3);
        bpn0 bpn0Var = feVar.k1;
        return new jln(readOptionalList, u1Var, aVar, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_blur", bpn0Var), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_focus", bpn0Var));
    }
}
