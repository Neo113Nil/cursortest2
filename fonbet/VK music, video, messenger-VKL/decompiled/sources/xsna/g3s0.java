package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import kotlin.Result;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g3s0 implements izs {
    public final /* synthetic */ VideoAutoPlay b;
    public final /* synthetic */ VideoFile c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    public /* synthetic */ g3s0(VideoAutoPlay videoAutoPlay, VideoFile videoFile, boolean z, int i) {
        this.b = videoAutoPlay;
        this.c = videoFile;
        this.d = z;
        this.e = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        sht0 e;
        boolean z3;
        VideoAutoPlay videoAutoPlay = this.b;
        VideoFile videoFile = this.c;
        Object W0 = VideoAutoPlay.W0(videoAutoPlay, videoFile, 6);
        if (W0 instanceof Result.Failure) {
            W0 = null;
        }
        m7q m7qVar = (m7q) W0;
        if (m7qVar != null && (e = jgz.e(m7qVar)) != null) {
            gpt0 gpt0Var = gpt0.a;
            if ((e instanceof mv70) || (e instanceof hwz)) {
                z3 = false;
            } else {
                String uri = e.b.toString();
                xuo0.a.getClass();
                z3 = !gpt0.z(xuo0.a(), uri);
            }
            if (z3) {
                z = true;
                z2 = (videoAutoPlay.l1() || videoFile.U7() == null) ? false : true;
                if (z && m7qVar != null && !this.d && !z2) {
                    return io.reactivex.rxjava3.core.x.k(new VideoAutoPlay.e(videoFile, m7qVar)).q(asu0.a.c());
                }
                int i = 2;
                return new io.reactivex.rxjava3.internal.operators.single.h(rsg0.w0(new gns0(videoFile.I0(), videoFile.o0(), videoFile.C1())).l(new xhb0(new vtt(videoFile, videoAutoPlay, z2, i), 12)), new fv70(new nc90(24), 24)).o(videoFile).l(new qw80(new es2(videoAutoPlay, this.e, i), 12));
            }
        }
        z = false;
        if (videoAutoPlay.l1()) {
        }
        if (z) {
        }
        int i2 = 2;
        return new io.reactivex.rxjava3.internal.operators.single.h(rsg0.w0(new gns0(videoFile.I0(), videoFile.o0(), videoFile.C1())).l(new xhb0(new vtt(videoFile, videoAutoPlay, z2, i2), 12)), new fv70(new nc90(24), 24)).o(videoFile).l(new qw80(new es2(videoAutoPlay, this.e, i2), 12));
    }
}
