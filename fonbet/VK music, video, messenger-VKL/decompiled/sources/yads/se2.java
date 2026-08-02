package yads;

import com.google.android.gms.tasks.OnFailureListener;
import xsna.kq9;
import xsna.lq9;

/* loaded from: classes10.dex */
public final class se2 implements OnFailureListener {
    public final /* synthetic */ kq9 a;

    public se2(lq9 lq9Var) {
        this.a = lq9Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.a.p(null, null);
    }
}
