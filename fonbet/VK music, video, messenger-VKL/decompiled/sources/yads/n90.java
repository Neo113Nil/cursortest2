package yads;

import android.widget.Toast;
import com.yandex.mobile.ads.R$string;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class n90 extends Lambda implements gzs {
    public final /* synthetic */ o90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(o90 o90Var) {
        super(0);
        this.b = o90Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        synchronized (fv1.a) {
            fv1.b = true;
        }
        o90 o90Var = this.b;
        Toast.makeText(o90Var.a, o90Var.a.getString(R$string.debug_panel_logging_is_enabled), 0).show();
        return s3q0.a;
    }
}
