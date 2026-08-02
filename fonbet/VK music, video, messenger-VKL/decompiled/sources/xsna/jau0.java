package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vkontakte.android.VKApplication;

/* compiled from: VkAppInitDiGraphTask.kt */
/* loaded from: classes11.dex */
public final class jau0 extends ParallelTaskRunner.d {
    public final t7m c;
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;
    public final bpn0 g;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j;

    public jau0(VKApplication vKApplication) {
        super(vKApplication);
        this.c = new t7m(vKApplication);
        this.d = new bpn0(new s63(15));
        this.e = new bpn0(new cp(this, 7));
        this.f = new bpn0(new zg9(15));
        this.g = new bpn0(new u7r0(vKApplication, 1));
        this.h = new bpn0(new qo(vKApplication));
        this.i = new bpn0(new aq0(vKApplication));
        new bpn0(new rwe(vKApplication, 15));
        this.j = new bpn0(new nb8(24));
    }

    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "InitDepGraph";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        this.c.getClass();
        wrk.a(new p8m(0), new wuj(), new uhe0(this, 1));
        qhx0.a = new f25(this, 6);
        return s3q0.a;
    }
}
