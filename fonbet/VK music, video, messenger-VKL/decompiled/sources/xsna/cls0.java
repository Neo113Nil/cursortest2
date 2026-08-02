package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.nlh0;
import xsna.yks0;

/* compiled from: VideoFileControllerAdapter.kt */
/* loaded from: classes17.dex */
public final class cls0 implements nlh0 {
    public static final /* synthetic */ qcy<Object>[] c;
    public final yks0 a;
    public final z6i b = new z6i(new gkc0(this, 22), new w9l0(9), new b8e0(this, 21));

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(cls0.class, "video", "getVideo()Lcom/vk/clips/sdk/shared/api/deps/video/SdkVideoFile;", 0);
        fpf0.a.getClass();
        c = new qcy[]{mutablePropertyReference1Impl};
    }

    public cls0(yks0 yks0Var) {
        this.a = yks0Var;
    }

    @Override // xsna.nlh0
    public final void a(nlh0.a aVar) {
        this.a.f.remove(new bgx(aVar));
    }

    @Override // xsna.nlh0
    public final void b(nlh0.a aVar) {
        this.a.b(new bgx(aVar));
    }

    @Override // xsna.nlh0
    public final void c(SdkVideoFile sdkVideoFile) {
        qcy<Object> qcyVar = c[0];
        this.b.e.invoke(sdkVideoFile);
    }

    @Override // xsna.nlh0
    public final void d(List<? extends olh0> list) {
        List<? extends olh0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(w1t0.a((olh0) it.next()));
        }
        yks0 yks0Var = this.a;
        Iterator<T> it2 = yks0Var.f.iterator();
        while (it2.hasNext()) {
            ((yks0.a) it2.next()).He(arrayList, yks0Var.e);
        }
    }

    @Override // xsna.nlh0
    public final SdkVideoFile k() {
        qcy<Object> qcyVar = c[0];
        return (SdkVideoFile) this.b.b();
    }
}
