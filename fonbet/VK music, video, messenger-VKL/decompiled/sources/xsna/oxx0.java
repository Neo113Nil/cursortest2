package xsna;

import androidx.annotation.NonNull;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class oxx0 extends s140 {
    @Override // xsna.s140
    @NonNull
    public final String c() {
        return "UPDATE workspec SET stop_reason=? WHERE id=?";
    }
}
