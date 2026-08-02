package xsna;

import com.vk.superapp.api.dto.story.WebServiceInfo;
import com.vk.superapp.api.dto.story.WebStoryAttachment;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowStoryBox$Parameters;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ShowStoryBoxHandler.kt */
/* loaded from: classes6.dex */
public final class ojj0 {
    public final z6y a;
    public final a8y b;
    public final u1n0 c;
    public final pvp d;
    public boolean e;

    public ojj0(z6y z6yVar, a8y a8yVar, u1n0 u1n0Var, pvp pvpVar) {
        this.a = z6yVar;
        this.b = a8yVar;
        this.c = u1n0Var;
        this.d = pvpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static WebStoryBox a(ShowStoryBox$Parameters showStoryBox$Parameters, JSONArray jSONArray, String str) {
        ArrayList arrayList;
        JSONObject optJSONObject;
        ShowStoryBox$Parameters.ServiceInfo i;
        WebServiceInfo webServiceInfo;
        String lowerCase = showStoryBox$Parameters.d().name().toLowerCase(Locale.ROOT);
        String str2 = lowerCase.length() == 0 ? "none" : lowerCase;
        ShowStoryBox$Parameters.CameraType f = showStoryBox$Parameters.f();
        String name = f != null ? f.name() : null;
        String j = showStoryBox$Parameters.j();
        String e = showStoryBox$Parameters.e();
        Boolean g = showStoryBox$Parameters.g();
        boolean booleanValue = g != null ? g.booleanValue() : false;
        if (jSONArray != null) {
            ArrayList arrayList2 = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject2 = jSONArray.optJSONObject(i2);
                if (optJSONObject2 != null) {
                    arrayList2.add(i35.j(optJSONObject2));
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (j != null && e != null) {
            throw new JSONException("You can't pass url and blob immediately");
        }
        if (j == null && e == null && !str2.equals("none")) {
            throw new JSONException(zr.a("Background type ", str2, " require url or blob"));
        }
        ShowStoryBox$Parameters.Attachment c = showStoryBox$Parameters.c();
        WebStoryAttachment webStoryAttachment = c != null ? new WebStoryAttachment(c.d(), c.e().name(), c.f(), c.c(), c.b(), c.a()) : null;
        if (str != null) {
            try {
                optJSONObject = new JSONObject(str).optJSONObject("service_info");
            } catch (JSONException unused) {
            }
            String A = optJSONObject == null ? f370.A("memory_date", optJSONObject) : null;
            String A2 = optJSONObject == null ? f370.A("memory_type", optJSONObject) : null;
            i = showStoryBox$Parameters.i();
            if (i == null) {
                String d = i.d();
                Boolean e2 = i.e();
                webServiceInfo = new WebServiceInfo(d, e2 != null ? e2.booleanValue() : false, i.f(), i.g(), i.a(), i.c(), i.b(), A, A2);
            } else {
                webServiceInfo = null;
            }
            return new WebStoryBox(str2, name, j, e, booleanValue, webStoryAttachment, arrayList, webServiceInfo);
        }
        optJSONObject = null;
        if (optJSONObject == null) {
        }
        if (optJSONObject == null) {
        }
        i = showStoryBox$Parameters.i();
        if (i == null) {
        }
        return new WebStoryBox(str2, name, j, e, booleanValue, webStoryAttachment, arrayList, webServiceInfo);
    }
}
