package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.Owner;
import org.json.JSONObject;

/* compiled from: CatalogNewsEntryParsers.kt */
/* loaded from: classes16.dex */
public final class x490 extends aay<Owner> {
    public static final x490 a = new x490();

    @Override // xsna.aay
    public final Owner a(JSONObject jSONObject) {
        Serializer.c<Owner> cVar = Owner.CREATOR;
        return Owner.a.f(jSONObject);
    }
}
