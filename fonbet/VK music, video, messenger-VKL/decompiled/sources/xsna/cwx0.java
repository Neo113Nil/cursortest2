package xsna;

import androidx.work.WorkInfo;
import java.util.List;
import xsna.fxx0;

/* compiled from: WorkManagerImpl.java */
/* loaded from: classes.dex */
public final class cwx0 implements f0t<List<fxx0.c>, WorkInfo> {
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 androidx.work.WorkInfo, still in use, count: 2, list:
          (r4v3 androidx.work.WorkInfo) from 0x005f: MOVE (r27v0 androidx.work.WorkInfo) = (r4v3 androidx.work.WorkInfo) (LINE:96)
          (r4v3 androidx.work.WorkInfo) from 0x0054: MOVE (r27v2 androidx.work.WorkInfo) = (r4v3 androidx.work.WorkInfo) (LINE:85)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // xsna.f0t
    public final androidx.work.WorkInfo apply(java.util.List<xsna.fxx0.c> r30) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.cwx0.apply(java.lang.Object):java.lang.Object");
    }
}
