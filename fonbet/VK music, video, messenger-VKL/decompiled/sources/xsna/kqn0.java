package xsna;

import androidx.annotation.NonNull;

/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: classes.dex */
public final class kqn0 extends s140 {
    @Override // xsna.s140
    @NonNull
    public final String c() {
        return "DELETE FROM SystemIdInfo where work_spec_id=?";
    }
}
