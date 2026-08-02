package xsna;

import android.content.Context;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.IssueKey;
import com.vk.push.core.work.WorkModel;
import com.vk.push.core.work.WorkResult;
import java.util.Collections;
import kotlin.jvm.internal.Lambda;

/* compiled from: WorkersSingleProcessDataSource.kt */
/* loaded from: classes5.dex */
public final class fzx0 {
    public final Context a;
    public final gzx0 b;
    public final CrashReporterRepository c;
    public final bpn0 d = new bpn0(new a());

    /* compiled from: WorkersSingleProcessDataSource.kt */
    public static final class a extends Lambda implements gzs<awx0> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final awx0 invoke() {
            try {
                return dwx0.h(fzx0.this.a);
            } catch (Throwable th) {
                fzx0.this.c.nonFatalReport(new IllegalStateException("Work manager get instance error", th), IssueKey.WORK_MANAGER_GET_INSTANCE_ERROR);
                return null;
            }
        }
    }

    public fzx0(Context context, gzx0 gzx0Var, CrashReporterRepository crashReporterRepository) {
        this.a = context;
        this.b = gzx0Var;
        this.c = crashReporterRepository;
    }

    public final WorkResult a(WorkModel workModel, boolean z) {
        String workName = workModel.getWorkName();
        if (workName == null) {
            return WorkResult.FAILURE;
        }
        gzx0 gzx0Var = this.b;
        px90 px90Var = gzx0Var.b.get(workName);
        wj80 wj80Var = gzx0Var.a.get(workName);
        bpn0 bpn0Var = this.d;
        if (px90Var != null) {
            awx0 awx0Var = (awx0) bpn0Var.getValue();
            if (awx0Var != null) {
                awx0Var.e(workName, workModel.getKeepExistingWork() == WorkModel.KeepExistingWork.YES ? ExistingPeriodicWorkPolicy.KEEP : ExistingPeriodicWorkPolicy.REPLACE, px90Var.a(workModel, z));
            }
            return WorkResult.SUCESSS;
        }
        if (wj80Var == null) {
            return WorkResult.FAILURE;
        }
        awx0 awx0Var2 = (awx0) bpn0Var.getValue();
        if (awx0Var2 != null) {
            awx0Var2.f(workName, workModel.getKeepExistingWork() == WorkModel.KeepExistingWork.YES ? ExistingWorkPolicy.KEEP : ExistingWorkPolicy.REPLACE, Collections.singletonList(wj80Var.a(workModel, z)));
        }
        return WorkResult.SUCESSS;
    }
}
