package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.tabbar.settings.impl.di.TabbarSettingsComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class bpf implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bpf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                dpf dpfVar = (dpf) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"ClipsViewersExperiments", "Init ClipsViewerExperimentsNewsFeed"});
                }
                return new sof(dpfVar.d);
            case 1:
                return Boolean.valueOf(((fks0) obj).s());
            case 2:
                return pn00.m(new Pair("private_cache", (androidx.media3.datasource.cache.c) ((sp40) obj).i.getValue()));
            case 3:
                return ((jq40) obj).a.K1();
            case 4:
                StoriesComponentImpl storiesComponentImpl = (StoriesComponentImpl) obj;
                qcy<Object>[] qcyVarArr = StoriesComponentImpl.N;
                scd L6 = storiesComponentImpl.L6();
                b25 s = storiesComponentImpl.b.s();
                uvl0 eb = storiesComponentImpl.eb();
                nwy nwyVar = storiesComponentImpl.H;
                qcy<Object> qcyVar = StoriesComponentImpl.N[27];
                return new kdd(L6, s, eb, (mny) nwyVar.c(), storiesComponentImpl.j5(), storiesComponentImpl.w(), storiesComponentImpl.I2());
            case 5:
                return new vtn0(((TabbarSettingsComponentImpl) obj).b.md());
            default:
                if (((qks0) obj).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_OTHER_CHANNELS;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }
}
