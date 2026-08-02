package xsna;

import androidx.annotation.NonNull;

/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes.dex */
public final class qwx0 extends s140 {
    @Override // xsna.s140
    @NonNull
    public final String c() {
        return "DELETE from WorkProgress where work_spec_id=?";
    }
}
