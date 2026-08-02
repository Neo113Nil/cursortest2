package xsna;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DevelopmentPlatformProvider.java */
/* loaded from: classes.dex */
public final class s5m {
    public final Context a;

    @Nullable
    public a b = null;

    /* compiled from: DevelopmentPlatformProvider.java */
    public class a {

        @Nullable
        public final String a;

        @Nullable
        public final String b;

        public a(s5m s5mVar) {
            Context context = s5mVar.a;
            int e = fng.e(context, "com.google.firebase.crashlytics.unity_version", "string");
            if (e != 0) {
                this.a = "Unity";
                this.b = context.getResources().getString(e);
                return;
            }
            if (context.getAssets() != null) {
                try {
                    InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (open != null) {
                        open.close();
                    }
                    this.a = "Flutter";
                    this.b = null;
                    return;
                } catch (IOException unused) {
                }
            }
            this.a = null;
            this.b = null;
        }
    }

    public s5m(Context context) {
        this.a = context;
    }

    public final a a() {
        if (this.b == null) {
            this.b = new a(this);
        }
        return this.b;
    }
}
