package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.os.Trace;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.clips.precache.api.di.ClipsPrecacheComponent;
import com.vk.folders.api.di.FoldersComponent;
import com.vk.im.chat.clips.decoration.api.di.DialogClipsContextComponent;
import com.vk.im.engine.di.ImExperimentsComponent;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.libvideo.api.di.AutoPlayDelegateComponent;
import com.vk.music.offline.impl.sync.MusicOfflineSyncServiceHelper;
import com.vk.music.podcast.impl.di.PodcastComponentImpl;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.textformat.di.MsgTextFormatComponent;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vk.voip.ui.prodstat.analytics.search.click.VoipSearchClickAnalytics;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.NewsFeedBridgeComponentImpl;
import xsna.k840;
import xsna.vx70;
import xsna.xwv;
import xsna.z8w;
import xsna.zdw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ho4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ho4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (AudioManager) ((io4) this.c).b.getSystemService("audio");
            case 1:
                yq40 yq40Var = (yq40) this.c;
                return new com.vk.music.offline.impl.sync.d(yq40Var.a, yq40Var.c, yq40Var.d, k840.a.i, new xq40(yq40Var.b), new MusicOfflineSyncServiceHelper());
            case 2:
                return ((MultiAccountComponent) m7m.a(((nx50) this.c).b).a(fpf0.a(MultiAccountComponent.class))).c();
            case 3:
                return ((ClipsPrecacheComponent) ((NewsFeedBridgeComponentImpl) this.c).a.getValue()).A2();
            case 4:
                PodcastComponentImpl podcastComponentImpl = (PodcastComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = PodcastComponentImpl.g;
                return new qhb0(new bpn0(new jw30(podcastComponentImpl, 10)), new bpn0(new so40(podcastComponentImpl, 9)), new ejb0(new clb0(), new qxi()));
            case 5:
                bhl0 bhl0Var = (bhl0) this.c;
                Trace.beginSection(ndp0.f("lazy StorageManager.contactsStorageManager"));
                try {
                    kdj kdjVar = new kdj(bhl0Var.B());
                    bhl0Var.z(kdjVar);
                    return kdjVar;
                } finally {
                    Trace.endSection();
                }
            case 6:
                return ((vx70.a) this.c).c();
            case 7:
                bpn0 bpn0Var = (bpn0) this.c;
                VKApplication.a aVar = VKApplication.c;
                ph20 ph20Var = (ph20) bpn0Var.getValue();
                ph20Var.a();
                pzv pzvVar = ph20Var.f;
                if (pzvVar != null) {
                    gx8 yc = ((CacheComponent) ((nmg0) ph20Var.c.invoke()).a(fpf0.a(CacheComponent.class))).yc();
                    MsgTextFormatComponent msgTextFormatComponent = (MsgTextFormatComponent) ((nmg0) ph20Var.c.invoke()).a(fpf0.a(MsgTextFormatComponent.class));
                    Context context = ph20Var.b;
                    int i = 5;
                    mn8 mn8Var = new mn8(i);
                    a1w a1wVar = q1w.a;
                    if (a1wVar == null) {
                        a1wVar = null;
                    }
                    kju0 kju0Var = new kju0(context, mn8Var, a1wVar, g2v.c(), z4g.d(), o25.a(), pla.e().b(), ((FoldersComponent) ((nmg0) ph20Var.c.invoke()).a(fpf0.a(FoldersComponent.class))).r3());
                    Context context2 = ph20Var.b;
                    a1w a1wVar2 = q1w.a;
                    a1w a1wVar3 = a1wVar2 != null ? a1wVar2 : null;
                    bpn0 bpn0Var2 = g2v.a;
                    bpn0 bpn0Var3 = bpn0Var2 != null ? bpn0Var2 : null;
                    pbw pbwVar = pzvVar.O;
                    Context context3 = ph20Var.b;
                    a1w a1wVar4 = q1w.a;
                    if (a1wVar4 == null) {
                        a1wVar4 = null;
                    }
                    eew eewVar = new eew(context3, a1wVar4);
                    dhr0 dhr0Var = dhr0.a;
                    bpn0 bpn0Var4 = pla.a;
                    bpn0 bpn0Var5 = bpn0Var4 != null ? bpn0Var4 : null;
                    bpn0 bpn0Var6 = o25.a;
                    if (bpn0Var6 == null) {
                        bpn0Var6 = null;
                    }
                    int i2 = 2;
                    z8w.a aVar2 = new z8w.a(o25.b((b25) bpn0Var6.getValue()), new bky(ph20Var, i2), ((AutoPlayDelegateComponent) ((nmg0) ph20Var.c.invoke()).a(fpf0.a(AutoPlayDelegateComponent.class))).Y9(), ((ImExperimentsComponent) ((nmg0) ph20Var.c.invoke()).a(fpf0.a(ImExperimentsComponent.class))).getExperiments(), new iw00(ph20Var, 1), ((ImReportersComponent) ((nmg0) ph20Var.c.invoke()).a(fpf0.a(ImReportersComponent.class))).K(), ((DialogClipsContextComponent) ((nmg0) ph20Var.c.invoke()).a(fpf0.a(DialogClipsContextComponent.class))).z());
                    w1w0 w1w0Var = new w1w0();
                    xwv.b bVar = new xwv.b();
                    uy2 uy2Var = new uy2(ph20Var, i2);
                    zdw.c cVar = new zdw.c(msgTextFormatComponent.ed(), msgTextFormatComponent.t3());
                    bib bibVar = new bib(new wuj());
                    zdw.a aVar3 = new zdw.a(kju0Var);
                    a1w a1wVar5 = q1w.a;
                    if (a1wVar5 == null) {
                        a1wVar5 = null;
                    }
                    i7o0.b = new zdw(context2, a1wVar3, bpn0Var3, pbwVar, eewVar, dhr0Var, bpn0Var5, aVar2, w1w0Var, bVar, uy2Var, cVar, bibVar, aVar3, new zdw.b(new j3f0(a1wVar5, yc, new eaw())), new iv3(new b2s()), new kh20(kju0Var), new ryt0());
                    yc.c(new tv8(new sv8(CacheTarget.OTHER, "imEngine", new jvg(i), new lh20(0))));
                    asu0.a.getClass();
                    asu0.n().execute(new jvn(ph20Var, 2));
                }
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((qks0) this.c).a);
            default:
                und0 und0Var = (und0) this.c;
                qcy<Object>[] qcyVarArr2 = VoipAnalyticsInternalComponent.b;
                return new VoipSearchClickAnalytics(und0Var);
        }
    }
}
