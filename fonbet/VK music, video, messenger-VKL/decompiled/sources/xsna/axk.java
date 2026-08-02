package xsna;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import ru.ok.android.webrtc.protocol.impl.commands.RtcCommandExecutorImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class axk implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ axk(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                com.google.android.material.datepicker.a aVar = (com.google.android.material.datepicker.a) this.d;
                Calendar d = l2r0.d();
                Calendar e = l2r0.e(null);
                long j = this.c;
                e.setTimeInMillis(j);
                aVar.b.setError(String.format(aVar.f, (d.get(1) == e.get(1) ? l2r0.b("MMMd", Locale.getDefault()).format(new Date(j)) : i1l.a(j)).replace(' ', (char) 160)));
                otj0 otj0Var = (otj0) aVar;
                otj0Var.k.getError();
                otj0Var.j.a();
                break;
            default:
                ((RtcCommandExecutorImpl) this.d).a(this.c);
                break;
        }
    }
}
