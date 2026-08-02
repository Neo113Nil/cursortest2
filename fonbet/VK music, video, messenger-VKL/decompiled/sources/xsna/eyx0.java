package xsna;

import androidx.annotation.NonNull;

/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes.dex */
public final class eyx0 extends s140 {
    @Override // xsna.s140
    @NonNull
    public final String c() {
        return "DELETE FROM worktag WHERE work_spec_id=?";
    }
}
