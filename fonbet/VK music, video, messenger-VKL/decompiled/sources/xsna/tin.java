package xsna;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardJsonParser.kt */
/* loaded from: classes8.dex */
public final class tin implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public tin(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nin deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new nin((oin) JsonPropertyParser.read(parsingContext, jSONObject, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, this.a.c0));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, nin ninVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, ninVar.a, this.a.c0);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "copy_to_clipboard");
        return jSONObject;
    }
}
