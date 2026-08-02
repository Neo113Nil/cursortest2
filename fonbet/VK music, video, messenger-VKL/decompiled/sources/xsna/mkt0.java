package xsna;

import android.content.Context;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;
import java.security.SecureRandom;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: VideoToClipsProviderImpl.kt */
/* loaded from: classes14.dex */
public final class mkt0 implements lkt0 {
    public final mhd a;
    public final bpn0 b;

    public mkt0(mhd mhdVar, bpn0 bpn0Var) {
        this.a = mhdVar;
        this.b = bpn0Var;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, xsna.dw20] */
    @Override // xsna.lkt0
    public final void a(Context context) {
        if (g620.f().e().j()) {
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        kmu0 kmu0Var = new kmu0(context, tzp0.a(null, 3));
        kmu0Var.U0(new jai(1579053086, new s77(ref$ObjectRef, 14), true));
        ref$ObjectRef.element = kmu0Var.I0("CLIPS_VTC_MODAL");
    }

    @Override // xsna.lkt0
    public final io.reactivex.rxjava3.core.x b(File file, ikt0 ikt0Var) {
        PrivateFiles.a b;
        cmf cmfVar = new cmf();
        cxd cxdVar = new cxd(new bpn0(new q6s0(this, 9)), this.b);
        b = e8r.a.b(r4, PrivateSubdir.CLIPS_VIDEO.h(), true);
        File file2 = b.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return new m9e(cmfVar, cxdVar, file2, context, qsk0.a, Integer.valueOf(new SecureRandom().nextInt(Integer.MAX_VALUE))).d(file, ikt0Var);
    }
}
