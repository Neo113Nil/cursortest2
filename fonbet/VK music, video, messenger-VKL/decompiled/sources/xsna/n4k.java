package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: CrashlyticsAppQualitySessionsSubscriber.java */
/* loaded from: classes.dex */
public final class n4k implements SessionSubscriber {
    public final wtk a;
    public final m4k b;

    public n4k(wtk wtkVar, sar sarVar) {
        this.a = wtkVar;
        this.b = new m4k(sarVar);
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public final boolean a() {
        return this.a.b();
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public final void b(@NonNull SessionSubscriber.a aVar) {
        Objects.toString(aVar);
        m4k m4kVar = this.b;
        String str = aVar.a;
        synchronized (m4kVar) {
            if (!Objects.equals(m4kVar.c, str)) {
                sar sarVar = m4kVar.a;
                String str2 = m4kVar.b;
                if (str2 != null && str != null) {
                    try {
                        sarVar.c(str2, "aqs.".concat(str)).createNewFile();
                    } catch (IOException unused) {
                    }
                }
                m4kVar.c = str;
            }
        }
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    @NonNull
    public final SessionSubscriber.Name c() {
        return SessionSubscriber.Name.CRASHLYTICS;
    }

    @Nullable
    public final String d(@NonNull String str) {
        m4k m4kVar = this.b;
        synchronized (m4kVar) {
            if (Objects.equals(m4kVar.b, str)) {
                return m4kVar.c;
            }
            sar sarVar = m4kVar.a;
            k4k k4kVar = m4k.d;
            File file = new File(sarVar.d, str);
            file.mkdirs();
            List f = sar.f(file.listFiles(k4kVar));
            return f.isEmpty() ? null : ((File) Collections.min(f, m4k.e)).getName().substring(4);
        }
    }

    public final void e(@Nullable String str) {
        m4k m4kVar = this.b;
        synchronized (m4kVar) {
            if (!Objects.equals(m4kVar.b, str)) {
                sar sarVar = m4kVar.a;
                String str2 = m4kVar.c;
                if (str != null && str2 != null) {
                    try {
                        sarVar.c(str, "aqs.".concat(str2)).createNewFile();
                    } catch (IOException unused) {
                    }
                }
                m4kVar.b = str;
            }
        }
    }
}
