package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.features.VideoFeatures;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class cpf implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cpf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                dpf dpfVar = (dpf) this.c;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"ClipsViewersExperiments", "Init ClipsViewerExperimentsFullscreen"});
                }
                return new qof(dpfVar.d);
            case 1:
                return ((jq40) this.c).a.Ae();
            case 2:
                return new ka50(((eu70) this.c).b.getCache());
            default:
                qks0 qks0Var = (qks0) this.c;
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_MUTE_SYNC;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures) && qks0Var.a);
        }
    }
}
