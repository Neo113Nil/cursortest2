package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.ynn;

/* compiled from: DivPagerLayoutModeJsonParser.kt */
/* loaded from: classes8.dex */
public final class wnn implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public wnn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, ynn ynnVar) throws ParsingException {
        boolean z = ynnVar instanceof ynn.c;
        com.yandex.div2.fe feVar = this.a;
        if (z) {
            return ((rnn) feVar.l5.getValue()).serialize(parsingContext, ((ynn.c) ynnVar).a);
        }
        if (ynnVar instanceof ynn.a) {
            return ((cnn) feVar.Z4.getValue()).serialize(parsingContext, ((ynn.a) ynnVar).a);
        }
        if (!(ynnVar instanceof ynn.b)) {
            throw new NoWhenBranchMatchedException();
        }
        mnn mnnVar = (mnn) feVar.i5.getValue();
        onn onnVar = ((ynn.b) ynnVar).a;
        mnnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "wrap_content");
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object cVar;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        ynn ynnVar = entityTemplate instanceof ynn ? (ynn) entityTemplate : null;
        if (ynnVar != null) {
            if (ynnVar instanceof ynn.c) {
                readString = "percentage";
            } else if (ynnVar instanceof ynn.a) {
                readString = "fixed";
            } else {
                if (!(ynnVar instanceof ynn.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "wrap_content";
            }
        }
        int hashCode = readString.hashCode();
        com.yandex.div2.fe feVar = this.a;
        if (hashCode == -921832806) {
            if (readString.equals("percentage")) {
                rnn rnnVar = (rnn) feVar.l5.getValue();
                tnn tnnVar = (tnn) (ynnVar != null ? ynnVar.a() : null);
                rnnVar.getClass();
                cVar = new ynn.c(new tnn(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "page_width", parsingContext.getAllowPropertyOverride(), tnnVar != null ? tnnVar.a : null, rnnVar.a.I5)));
                return cVar;
            }
            throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
        }
        if (hashCode != 97445748) {
            if (hashCode == 343327108 && readString.equals("wrap_content")) {
                mnn mnnVar = (mnn) feVar.i5.getValue();
                mnnVar.getClass();
                return new ynn.b(new onn());
            }
        } else if (readString.equals("fixed")) {
            cnn cnnVar = (cnn) feVar.Z4.getValue();
            enn ennVar = (enn) (ynnVar != null ? ynnVar.a() : null);
            cnnVar.getClass();
            cVar = new ynn.a(new enn(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "neighbour_page_width", parsingContext.getAllowPropertyOverride(), ennVar != null ? ennVar.a : null, cnnVar.a.x3)));
            return cVar;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
