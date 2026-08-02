package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class kbf implements ev31 {
    public final Context a;
    public final w530 b;

    public kbf(Context context, w530 w530Var) {
        this.a = context;
        this.b = w530Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 ibf, still in use, count: 2, list:
          (r9v2 ibf) from 0x012f: MOVE (r21v2 ibf) = (r9v2 ibf)
          (r9v2 ibf) from 0x011f: MOVE (r21v7 ibf) = (r9v2 ibf)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.ev31
    public final java.lang.Object q(java.lang.Object r44) {
        /*
            Method dump skipped, instructions count: 1838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbf.q(java.lang.Object):java.lang.Object");
    }
}
