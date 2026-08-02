package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.de;
import com.yandex.div2.he;
import com.yandex.div2.t;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bqk0;
import xsna.nkp;
import xsna.pkp;
import xsna.zpk0;

/* compiled from: DivActionScrollDestinationJsonParser.kt */
/* loaded from: classes8.dex */
public final class r implements Serializer, Deserializer {
    public final fe a;

    public r(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, t tVar) throws ParsingException {
        boolean z = tVar instanceof t.c;
        fe feVar = this.a;
        if (z) {
            he.b bVar = (he.b) feVar.V9.getValue();
            ie ieVar = ((t.c) tVar).a;
            bVar.getClass();
            return he.b.b(parsingContext, ieVar);
        }
        if (tVar instanceof t.b) {
            de.b bVar2 = (de.b) feVar.G9.getValue();
            ee eeVar = ((t.b) tVar).a;
            bVar2.getClass();
            return de.b.b(parsingContext, eeVar);
        }
        if (tVar instanceof t.d) {
            zpk0 zpk0Var = (zpk0) feVar.ba.getValue();
            bqk0 bqk0Var = ((t.d) tVar).a;
            zpk0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "start");
            return jSONObject;
        }
        if (!(tVar instanceof t.a)) {
            throw new NoWhenBranchMatchedException();
        }
        nkp nkpVar = (nkp) feVar.D9.getValue();
        pkp pkpVar = ((t.a) tVar).a;
        nkpVar.getClass();
        JSONObject jSONObject2 = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject2, "type", TtmlNode.END);
        return jSONObject2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object cVar;
        Object a;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        t tVar = entityTemplate instanceof t ? (t) entityTemplate : null;
        if (tVar != null) {
            if (tVar instanceof t.c) {
                readString = SignalingProtocol.KEY_OFFSET;
            } else if (tVar instanceof t.b) {
                readString = "index";
            } else if (tVar instanceof t.d) {
                readString = "start";
            } else {
                if (!(tVar instanceof t.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = TtmlNode.END;
            }
        }
        int hashCode = readString.hashCode();
        fe feVar = this.a;
        switch (hashCode) {
            case -1019779949:
                if (readString.equals(SignalingProtocol.KEY_OFFSET)) {
                    he.b bVar = (he.b) feVar.V9.getValue();
                    a = tVar != null ? tVar.a() : null;
                    bVar.getClass();
                    cVar = new t.c(he.b.a(parsingContext, (ie) a, jSONObject));
                    return cVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 100571:
                if (readString.equals(TtmlNode.END)) {
                    nkp nkpVar = (nkp) feVar.D9.getValue();
                    nkpVar.getClass();
                    return new t.a(new pkp());
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 100346066:
                if (readString.equals("index")) {
                    de.b bVar2 = (de.b) feVar.G9.getValue();
                    a = tVar != null ? tVar.a() : null;
                    bVar2.getClass();
                    cVar = new t.b(de.b.a(parsingContext, (ee) a, jSONObject));
                    return cVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 109757538:
                if (readString.equals("start")) {
                    zpk0 zpk0Var = (zpk0) feVar.ba.getValue();
                    zpk0Var.getClass();
                    return new t.d(new bqk0());
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            default:
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
        }
    }
}
