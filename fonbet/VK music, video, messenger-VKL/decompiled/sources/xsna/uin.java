package xsna;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardJsonParser.kt */
/* loaded from: classes8.dex */
public final class uin implements Serializer, TemplateDeserializer {
    public final com.yandex.div2.fe a;

    public uin(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, win winVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, winVar.a, this.a.d0);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "copy_to_clipboard");
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        win winVar = (win) entityTemplate;
        return new win(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, parsingContext.getAllowPropertyOverride(), winVar != null ? winVar.a : null, this.a.d0));
    }
}
