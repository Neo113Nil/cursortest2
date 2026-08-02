package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import rxdogtag2.RxDogTag;
import xsna.oug0;

/* compiled from: RxJavaInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class jug0 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "RxJavaInitializer";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        oug0.a.getClass();
        RxDogTag.install();
        io.reactivex.rxjava3.plugins.a.a = new czz(new oug0.a(), 3);
        io.reactivex.rxjava3.android.plugins.a.a = new djr();
        io.reactivex.rxjava3.plugins.a.d = new lug0(new kug0(0));
        io.reactivex.rxjava3.plugins.a.b = new mug0(new s6b(2), 0);
        io.reactivex.rxjava3.plugins.a.c = new nug0(new uv8(4));
        return s3q0.a;
    }
}
