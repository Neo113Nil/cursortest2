package defpackage;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lcr {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public lcr(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = suu0.a;
        cvw.n("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static lcr a(Context context) {
        tig0 tig0Var = new tig0(context);
        String h = tig0Var.h("google_app_id");
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        return new lcr(h, tig0Var.h("google_api_key"), tig0Var.h("firebase_database_url"), tig0Var.h("ga_trackingId"), tig0Var.h("gcm_defaultSenderId"), tig0Var.h("google_storage_bucket"), tig0Var.h("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lcr)) {
            return false;
        }
        lcr lcrVar = (lcr) obj;
        return ooc.m(this.b, lcrVar.b) && ooc.m(this.a, lcrVar.a) && ooc.m(this.c, lcrVar.c) && ooc.m(this.d, lcrVar.d) && ooc.m(this.e, lcrVar.e) && ooc.m(this.f, lcrVar.f) && ooc.m(this.g, lcrVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        kjz kjzVar = new kjz(this);
        kjzVar.b(this.b, "applicationId");
        kjzVar.b(this.a, Constants.KEY_API_KEY);
        kjzVar.b(this.c, "databaseUrl");
        kjzVar.b(this.e, "gcmSenderId");
        kjzVar.b(this.f, "storageBucket");
        kjzVar.b(this.g, "projectId");
        return kjzVar.toString();
    }
}
