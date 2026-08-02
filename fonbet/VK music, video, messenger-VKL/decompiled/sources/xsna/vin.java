package xsna;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardJsonParser.kt */
/* loaded from: classes8.dex */
public final class vin implements TemplateResolver<JSONObject, win, nin> {
    public final com.yandex.div2.fe a;

    public vin(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final nin resolve(ParsingContext parsingContext, win winVar, JSONObject jSONObject) {
        Field<sin> field = winVar.a;
        com.yandex.div2.fe feVar = this.a;
        return new nin((oin) JsonFieldResolver.resolve(parsingContext, field, jSONObject, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, feVar.e0, feVar.c0));
    }
}
