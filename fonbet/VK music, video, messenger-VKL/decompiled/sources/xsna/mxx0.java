package xsna;

import androidx.annotation.NonNull;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class mxx0 extends s140 {
    @Override // xsna.s140
    @NonNull
    public final String c() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
