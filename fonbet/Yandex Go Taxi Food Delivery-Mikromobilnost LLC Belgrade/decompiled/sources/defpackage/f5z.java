package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public abstract class f5z {
    public static final qwd a = new qwd(new wwx(29));

    public static rs31 a(fid fidVar) {
        bts btsVar = (bts) fidVar;
        rs31 rs31Var = (rs31) btsVar.m(a);
        if (rs31Var == null) {
            btsVar.e0(1260197608);
            rs31Var = rzo.z((View) btsVar.m(AndroidCompositionLocals_androidKt.f));
        } else {
            btsVar.e0(1260196492);
        }
        btsVar.t(false);
        return rs31Var;
    }
}
