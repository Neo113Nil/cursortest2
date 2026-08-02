package yads;

import android.content.Context;
import com.yandex.div.core.DivConfiguration;
import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class gi0 extends Lambda implements gzs {
    public final /* synthetic */ Context b;
    public final /* synthetic */ ai0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi0(Context context, ai0 ai0Var) {
        super(0);
        this.b = context;
        this.c = ai0Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        oh0 oh0Var = new oh0(this.b);
        ah0 ah0Var = new ah0(new ch0(), new gh0(), new fh0(), new bh0(), new hh0(), new dh0());
        qu2 a = gx2.a().a(this.b);
        DivConfiguration.Builder typefaceProvider = new DivConfiguration.Builder(oh0Var).divCustomContainerViewAdapter(ah0Var).typefaceProvider(epx.f(a != null ? Boolean.valueOf(tu2.a(a)) : null, Boolean.TRUE) ? new ui0(this.b) : new wi0(this.b));
        ai0 ai0Var = this.c;
        if (ai0Var != null) {
            typefaceProvider = typefaceProvider.extension(new ci0(ai0Var));
        }
        return typefaceProvider.extension(new oi0()).build();
    }
}
