package xsna;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.data.datasource.AndroidGoogleAppIdDataSource;
import java.util.Arrays;
import xsna.dq70;

/* compiled from: FirebaseOptions.java */
/* loaded from: classes.dex */
public final class ejr {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    /* compiled from: FirebaseOptions.java */
    /* loaded from: classes13.dex */
    public static final class a {
        public String a;
        public String b;
        public String c;
        public String d;

        @NonNull
        public final ejr a() {
            return new ejr(this.b, this.a, null, null, this.c, null, this.d);
        }

        @NonNull
        public final void b(@NonNull String str) {
            exc0.g(str, "ApiKey must be set.");
            this.a = str;
        }

        @NonNull
        public final void c(@NonNull String str) {
            exc0.g(str, "ApplicationId must be set.");
            this.b = str;
        }

        @NonNull
        public final void d(@Nullable String str) {
            this.c = str;
        }

        @NonNull
        public final void e(@Nullable String str) {
            this.d = str;
        }
    }

    public ejr(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        int i = vqm0.a;
        exc0.k("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    @Nullable
    public static ejr a(@NonNull Context context) {
        nqm0 nqm0Var = new nqm0(context);
        String a2 = nqm0Var.a(AndroidGoogleAppIdDataSource.GOOGLE_APP_ID_RESOURCE_NAME);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new ejr(a2, nqm0Var.a("google_api_key"), nqm0Var.a("firebase_database_url"), nqm0Var.a("ga_trackingId"), nqm0Var.a("gcm_defaultSenderId"), nqm0Var.a("google_storage_bucket"), nqm0Var.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ejr)) {
            return false;
        }
        ejr ejrVar = (ejr) obj;
        return dq70.b(this.b, ejrVar.b) && dq70.b(this.a, ejrVar.a) && dq70.b(this.c, ejrVar.c) && dq70.b(this.d, ejrVar.d) && dq70.b(this.e, ejrVar.e) && dq70.b(this.f, ejrVar.f) && dq70.b(this.g, ejrVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "applicationId");
        aVar.a(this.a, "apiKey");
        aVar.a(this.c, "databaseUrl");
        aVar.a(this.e, "gcmSenderId");
        aVar.a(this.f, "storageBucket");
        aVar.a(this.g, "projectId");
        return aVar.toString();
    }
}
