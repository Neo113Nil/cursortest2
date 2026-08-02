package xsna;

import androidx.annotation.NonNull;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class vxx0 extends s140 {
    @Override // xsna.s140
    @NonNull
    public final String c() {
        return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
    }
}
