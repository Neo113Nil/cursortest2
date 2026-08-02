package xsna;

import com.vk.push.core.utils.CoroutineExtensionsKt;
import com.vk.voip.utils.ics.Freq;
import xsna.yye0;

/* compiled from: Donuts.kt */
/* loaded from: classes18.dex */
public final class q5o implements yye0.a {
    public Object b;
    public Object c;

    public /* synthetic */ q5o(Object obj, Object obj2) {
        this.c = obj;
        this.b = obj2;
    }

    @Override // xsna.yye0.a
    public void b() {
        CoroutineExtensionsKt.safeResume((lq9) this.c, ((o1i0) this.b).c.getokv2("com.vk.push.authsdk"));
    }

    @Override // xsna.yye0.a
    public void d(Throwable th) {
        CoroutineExtensionsKt.safeResumeWithException((lq9) this.c, new IllegalStateException("Library loading was failed", th));
    }

    public q5o(Freq freq) {
        this.c = freq;
    }
}
