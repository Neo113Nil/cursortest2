package defpackage;

import android.app.job.JobParameters;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes11.dex */
public final /* synthetic */ class j6b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public j6b1(b491 b491Var, SplitInstallRequest splitInstallRequest) {
        this.a = 2;
        this.c = b491Var;
        this.b = splitInstallRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((a6b1) ((t6b1) obj).a).zzb((JobParameters) obj2, false);
                return;
            case 1:
                itx0 itx0Var = (itx0) obj;
                AtomicReference atomicReference = itx0Var.d;
                cvw.o(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) obj2).run();
                    atomicReference.set(null);
                    itx0Var.b();
                    return;
                } catch (Throwable th) {
                    try {
                        atomicReference.set(null);
                        itx0Var.b();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                tvb1 tvb1Var = ((b491) obj2).b;
                SplitInstallRequest splitInstallRequest = (SplitInstallRequest) obj;
                ArrayList arrayList = splitInstallRequest.a;
                ArrayList h = b491.h(splitInstallRequest.b);
                Bundle bundle = new Bundle();
                bundle.putInt("session_id", 0);
                bundle.putInt(ACSPConstants.STATUS, 5);
                bundle.putInt("error_code", 0);
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("module_names", new ArrayList<>(arrayList));
                }
                if (!h.isEmpty()) {
                    bundle.putStringArrayList("languages", new ArrayList<>(h));
                }
                bundle.putLong("total_bytes_to_download", 0L);
                bundle.putLong("bytes_downloaded", 0L);
                tvb1Var.c(mvt0.m(bundle));
                return;
        }
    }

    public /* synthetic */ j6b1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
