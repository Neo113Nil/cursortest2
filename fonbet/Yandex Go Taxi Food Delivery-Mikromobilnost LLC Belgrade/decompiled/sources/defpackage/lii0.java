package defpackage;

import android.content.Context;
import androidx.camera.video.internal.audio.d;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class lii0 implements nii0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ b84 b;

    public lii0(b84 b84Var, Context context) {
        this.b = b84Var;
        this.a = context;
    }

    @Override // defpackage.nii0
    public final d a(m34 m34Var, Executor executor) {
        return new d(m34Var, executor, this.a);
    }
}
