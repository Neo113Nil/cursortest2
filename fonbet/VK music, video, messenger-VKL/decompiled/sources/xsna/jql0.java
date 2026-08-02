package xsna;

import com.vk.log.L;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.ui.share.impl.di.VideoShareComponentImpl;
import com.vk.voip.stereo.stub.room.di.VoipStereoComponentStub;
import com.vk.voip.ui.VoipStatManager;
import java.lang.annotation.Annotation;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jql0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ jql0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        uv4 uv4Var;
        switch (this.b) {
            case 0:
                return new hql0();
            case 1:
                return new gj2();
            case 2:
                return new i1t0(true, bo.h());
            case 3:
                qcy<Object>[] qcyVarArr = VideoShareComponentImpl.c;
                return new mgt0();
            case 4:
                return vre0.e((vre0) rau0.c.getValue(), new bmw(o25.a().c()), "imagestatus_tag", null, new ev60(20), null, null, 108);
            case 5:
                return new tub0(fpf0.a(k1u0.class), new Annotation[0]);
            case 6:
                return (VideoGrowthComponent) ((k7m) m7m.f(i0w0.b)).a(fpf0.a(VideoGrowthComponent.class));
            case 7:
                rq4 rq4Var = rq4.a;
                if (rq4.i) {
                    rq4Var.getClass();
                    if (rq4.e >= rq4.c() + rq4.c) {
                        rq4.i = false;
                        VoipStatManager.StatData statData = VoipStatManager.a;
                        long c = (rq4.e - rq4.c()) * 1000;
                        if (VoipStatManager.c) {
                            VoipStatManager.StatData statData2 = VoipStatManager.a;
                            statData2.m = true;
                            statData2.o = c;
                            statData2.n = true;
                        }
                        if (rq4.p != null) {
                            rq4.b();
                        } else {
                            L.A(rq4.b, "stopRecordingAndSend()");
                            if (rq4.k && (uv4Var = rq4.r) != null) {
                                uv4Var.e(null, false, true, false);
                            }
                        }
                        com.vk.voip.ui.c.b.getClass();
                        com.vk.voip.ui.c.n0(0L);
                    }
                } else {
                    rq4Var.getClass();
                }
                return s3q0.a;
            default:
                qcy<Object>[] qcyVarArr2 = VoipStereoComponentStub.b;
                VoipStereoComponentStub.b bVar = new VoipStereoComponentStub.b();
                io.reactivex.rxjava3.internal.operators.observable.g0 g0Var = io.reactivex.rxjava3.internal.operators.observable.g0.b;
                return bVar;
        }
    }
}
