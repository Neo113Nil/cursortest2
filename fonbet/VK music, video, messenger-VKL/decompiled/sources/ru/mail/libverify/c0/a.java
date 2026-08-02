package ru.mail.libverify.c0;

import android.os.Bundle;
import com.ironsource.B5;
import java.util.ArrayList;
import java.util.Set;
import ru.mail.libverify.o.d;
import ru.mail.verify.core.api.ApplicationModule;
import ru.mail.verify.core.utils.FileLog;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;
import xsna.bqy;
import xsna.c5g;

/* loaded from: classes9.dex */
public final class a implements d {
    private final ApplicationModule.c a;
    private final bqy<TracerCrashReportLite> b;

    public a(ApplicationModule.c cVar, bqy<TracerCrashReportLite> bqyVar) {
        this.a = cVar;
        this.b = bqyVar;
    }

    @Override // ru.mail.libverify.o.d
    public final void a(ru.mail.libverify.o.a aVar, Bundle bundle) {
        try {
            if (this.a.b()) {
                return;
            }
            Set<String> keySet = bundle.keySet();
            ArrayList arrayList = new ArrayList(c5g.u(keySet, 10));
            for (String str : keySet) {
                arrayList.add(str + B5.U + bundle.get(str));
            }
            this.b.get().log(aVar.name() + ' ' + arrayList);
        } catch (Throwable th) {
            FileLog.e("FirebaseEventSender", "sendLog", th);
        }
    }

    @Override // ru.mail.libverify.o.d
    public final void a(Throwable th, boolean z) {
        try {
            if (this.a.b()) {
                return;
            }
            this.b.get().report(th, "Libverify_".concat(z ? "SilentException" : "FatalException"));
        } catch (Throwable th2) {
            FileLog.e("FirebaseEventSender", "sendError", th2);
        }
    }
}
