package xsna;

import com.vk.donut.video.impl.di.DonutVideoComponentImpl;
import com.vk.libvideo.adfree.impl.di.VideoAdFreeSubscriptionComponentImpl;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.tabbar.core.api.di.TabbarCoreComponent;
import com.vkontakte.android.VKApplication;
import xsna.nir0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b5o implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b5o(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = 0;
        switch (this.b) {
            case 0:
                DonutVideoComponentImpl donutVideoComponentImpl = (DonutVideoComponentImpl) this.c;
                return new x6(donutVideoComponentImpl.b.p().e(), donutVideoComponentImpl.J(), new qeq0());
            case 1:
                vop vopVar = (vop) this.c;
                return new nir0(new nir0.a(new wje(vopVar, 17), new eph(vopVar, 13), new sop(vopVar, i), new u4e(vopVar, 14), new yad(vopVar, 22)));
            case 2:
                return ((MusicPrefsComponent) ((axw) this.c).c().a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 3:
                pl00 pl00Var = (pl00) this.c;
                boolean z = pmr0.a;
                return Boolean.valueOf(pmr0.a(pl00Var.b));
            case 4:
                return ((TabbarCoreComponent) m7m.a(((nx50) this.c).b).a(fpf0.a(TabbarCoreComponent.class))).y8();
            case 5:
                StoriesComponentImpl storiesComponentImpl = (StoriesComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = StoriesComponentImpl.N;
                lrl0 bf = storiesComponentImpl.bf();
                p870 w = storiesComponentImpl.w();
                b25 s = storiesComponentImpl.b.s();
                nwy nwyVar = storiesComponentImpl.j;
                qcy<Object> qcyVar = StoriesComponentImpl.N[3];
                return new vvl0(bf, w, s, (tvl0) nwyVar.c(), storiesComponentImpl.w3(), storiesComponentImpl.r2());
            case 6:
                VKApplication vKApplication = (VKApplication) this.c;
                VKApplication.a aVar = VKApplication.c;
                pmr0.b(vKApplication);
                return s3q0.a;
            default:
                VideoAdFreeSubscriptionComponentImpl videoAdFreeSubscriptionComponentImpl = (VideoAdFreeSubscriptionComponentImpl) this.c;
                qcy<Object>[] qcyVarArr2 = VideoAdFreeSubscriptionComponentImpl.g;
                nwy nwyVar2 = videoAdFreeSubscriptionComponentImpl.b;
                qcy<Object>[] qcyVarArr3 = VideoAdFreeSubscriptionComponentImpl.g;
                qcy<Object> qcyVar2 = qcyVarArr3[0];
                wyr0 wyr0Var = (wyr0) nwyVar2.c();
                nwy nwyVar3 = videoAdFreeSubscriptionComponentImpl.c;
                qcy<Object> qcyVar3 = qcyVarArr3[1];
                return new hzr0(wyr0Var, (xyr0) nwyVar3.c(), videoAdFreeSubscriptionComponentImpl.G1());
        }
    }
}
