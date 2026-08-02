package xsna;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: CrashlyticsFileMarker.java */
/* loaded from: classes.dex */
public final class e5k {
    public final String a;
    public final sar b;

    public e5k(String str, sar sarVar) {
        this.a = str;
        this.b = sarVar;
    }

    public final void a() {
        String str = this.a;
        try {
            sar sarVar = this.b;
            sarVar.getClass();
            new File(sarVar.c, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }
}
