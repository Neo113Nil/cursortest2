package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.data.b;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* compiled from: CommunityScreenTracker.kt */
/* loaded from: classes14.dex */
public final class g2h {
    public final UserId a;
    public String b;
    public String d;
    public String f;
    public JSONObject g;
    public String h;
    public String c = "tap";
    public String e = "group";

    public g2h(UserId userId) {
        this.a = userId;
    }

    public final void a() {
        long j = this.a.b;
        if (j >= 0) {
            return;
        }
        b.d dVar = new b.d("group_track_event");
        dVar.b(Long.valueOf(-j), "group_id");
        String str = this.b;
        if (str != null) {
            dVar.b(str, "component");
        }
        String str2 = this.c;
        if (str2 != null) {
            dVar.b(str2, "type");
        }
        String str3 = this.d;
        if (str3 != null) {
            dVar.b(str3, "subtype");
        }
        String str4 = this.e;
        if (str4 != null) {
            dVar.b(str4, "screen");
        }
        String str5 = this.f;
        if (str5 != null) {
            dVar.b(str5, DatabaseHelper.ITEM_COLUMN_NAME);
        }
        JSONObject jSONObject = this.g;
        if (jSONObject != null) {
            dVar.b(jSONObject, DatabaseHelper.ITEM_COLUMN_NAME);
        }
        String str6 = this.h;
        if (str6 != null) {
            dVar.b(str6, "source");
        }
        dVar.e();
    }
}
