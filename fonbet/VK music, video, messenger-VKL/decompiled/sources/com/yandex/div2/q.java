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
import com.yandex.div2.p;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.lkp;
import xsna.mkp;
import xsna.xpk0;
import xsna.ypk0;

/* compiled from: DivActionScrollDestinationJsonParser.kt */
/* loaded from: classes8.dex */
public final class q implements Serializer, Deserializer {
    public final fe a;

    public q(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, p pVar) throws ParsingException {
        boolean z = pVar instanceof p.c;
        fe feVar = this.a;
        if (z) {
            he.a aVar = (he.a) feVar.U9.getValue();
            ge geVar = ((p.c) pVar).b;
            aVar.getClass();
            return he.a.b(parsingContext, geVar);
        }
        if (pVar instanceof p.b) {
            de.a aVar2 = (de.a) feVar.F9.getValue();
            ce ceVar = ((p.b) pVar).b;
            aVar2.getClass();
            return de.a.b(parsingContext, ceVar);
        }
        if (pVar instanceof p.d) {
            ypk0 ypk0Var = (ypk0) feVar.aa.getValue();
            xpk0 xpk0Var = ((p.d) pVar).b;
            ypk0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "start");
            return jSONObject;
        }
        if (!(pVar instanceof p.a)) {
            throw new NoWhenBranchMatchedException();
        }
        mkp mkpVar = (mkp) feVar.C9.getValue();
        lkp lkpVar = ((p.a) pVar).b;
        mkpVar.getClass();
        JSONObject jSONObject2 = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject2, "type", TtmlNode.END);
        return jSONObject2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    @Override // com.yandex.div.serialization.Deserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        t tVar;
        Object cVar;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int hashCode = readString.hashCode();
        fe feVar = this.a;
        switch (hashCode) {
            case -1019779949:
                if (readString.equals(SignalingProtocol.KEY_OFFSET)) {
                    ((he.a) feVar.U9.getValue()).getClass();
                    cVar = new p.c(he.a.a(parsingContext, jSONObject));
                    return cVar;
                }
                EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
                tVar = orThrow instanceof t ? (t) orThrow : null;
                if (tVar != null) {
                    return ((s) feVar.z0.getValue()).resolve(parsingContext, tVar, jSONObject);
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 100571:
                if (readString.equals(TtmlNode.END)) {
                    ((mkp) feVar.C9.getValue()).getClass();
                    return new p.a(new lkp());
                }
                EntityTemplate<?> orThrow2 = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
                if (orThrow2 instanceof t) {
                }
                if (tVar != null) {
                }
                break;
            case 100346066:
                if (readString.equals("index")) {
                    ((de.a) feVar.F9.getValue()).getClass();
                    cVar = new p.b(de.a.a(parsingContext, jSONObject));
                    return cVar;
                }
                EntityTemplate<?> orThrow22 = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
                if (orThrow22 instanceof t) {
                }
                if (tVar != null) {
                }
                break;
            case 109757538:
                if (readString.equals("start")) {
                    ((ypk0) feVar.aa.getValue()).getClass();
                    return new p.d(new xpk0());
                }
                EntityTemplate<?> orThrow222 = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
                if (orThrow222 instanceof t) {
                }
                if (tVar != null) {
                }
                break;
            default:
                EntityTemplate<?> orThrow2222 = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
                if (orThrow2222 instanceof t) {
                }
                if (tVar != null) {
                }
                break;
        }
    }
}
