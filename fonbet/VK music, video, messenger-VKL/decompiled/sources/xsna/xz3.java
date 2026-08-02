package xsna;

import android.os.Message;
import android.view.Surface;
import com.ironsource.C4405kb;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import ru.ok.android.onelog.OneLogImpl;
import ru.ok.android.onelog.OneLogTrigger;
import xsna.duy0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class xz3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xz3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                androidx.media3.exoplayer.mediacodec.a aVar = (androidx.media3.exoplayer.mediacodec.a) this.c;
                vrl vrlVar = (vrl) this.d;
                aVar.c.c();
                c04 c04Var = aVar.b;
                synchronized (c04Var.a) {
                    c04Var.b();
                    vrlVar.run();
                }
                return;
            case 1:
                LevelPlayNativeAd.a((LevelPlayNativeAd) this.c, (IronSourceError) this.d);
                return;
            case 2:
                cw30 cw30Var = (cw30) this.c;
                dgm dgmVar = (dgm) this.d;
                if (cw30Var.d) {
                    dgmVar.invoke();
                }
                d3m.b(cw30Var.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
                cw30Var.d = false;
                rvv.f.remove(cw30Var);
                return;
            case 3:
                NewsfeedSearchFragment newsfeedSearchFragment = (NewsfeedSearchFragment) this.c;
                sq60 sq60Var = (sq60) this.d;
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                newsfeedSearchFragment.go().i(sq60Var);
                return;
            case 4:
                OneLogImpl.lambda$startUpload$0((String) this.c, (OneLogTrigger) this.d);
                return;
            case 5:
                ((o7j) this.c).accept(new ao5(3, (Surface) this.d));
                return;
            case 6:
                ((ru.mail.libverify.p0.c) this.c).a((Message) this.d);
                return;
            case 7:
                duy0.a aVar2 = (duy0.a) this.c;
                aVar2.a.h.a((String) this.d);
                return;
            default:
                C4405kb.a((C4405kb) this.c, (LevelPlayAdError) this.d);
                return;
        }
    }
}
