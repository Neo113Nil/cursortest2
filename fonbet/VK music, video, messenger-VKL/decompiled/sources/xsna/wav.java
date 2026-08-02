package xsna;

import androidx.core.app.NotificationCompat;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.abv;

/* compiled from: HolidayInteractionJsonConverter.kt */
/* loaded from: classes7.dex */
public final class wav {
    public static JSONObject a(abv abvVar) {
        String str;
        if (abvVar instanceof abv.c) {
            JSONObject d = yq.d(NotificationCompat.CATEGORY_EVENT, "InteractionReady");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("interaction_id", ((abv.c) abvVar).a);
            s3q0 s3q0Var = s3q0.a;
            d.put("payload", jSONObject);
            return d;
        }
        if (abvVar.equals(abv.d.a)) {
            str = "InteractionRequest";
        } else if (abvVar.equals(abv.a.a)) {
            str = "InteractionAccept";
        } else {
            if (!abvVar.equals(abv.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "InteractionCancel";
        }
        return yq.d(NotificationCompat.CATEGORY_EVENT, str);
    }
}
