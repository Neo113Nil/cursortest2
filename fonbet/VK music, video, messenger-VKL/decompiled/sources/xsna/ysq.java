package xsna;

import android.opengl.GLES20;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import one.video.gl.GLESUtils;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ysq implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ysq(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        l31 l31Var;
        g08 g08Var;
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                gzs gzsVar = (gzs) this.f;
                tgi0 tgi0Var = (tgi0) obj;
                izsVar.invoke(tgi0Var);
                qgi0.n(tgi0Var, 0);
                qgi0.h(tgi0Var, str);
                qgi0.e(tgi0Var, str2, new mn0(1, gzsVar));
                return s3q0.a;
            case 1:
                v1t v1tVar = (v1t) this.c;
                r1t r1tVar = (r1t) this.d;
                ufs ufsVar = (ufs) this.e;
                s1t s1tVar = (s1t) this.f;
                Size size = (Size) obj;
                GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
                GLESUtils.c("glViewport", new int[0]);
                GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                GLESUtils.c("glClearColor", new int[0]);
                GLES20.glClear(16384);
                GLESUtils.c("glClear", 1285);
                v1tVar.i = r1tVar.a;
                ufsVar.u.j(v1tVar);
                s1tVar.d();
                return s3q0.a;
            case 2:
                List list = (List) this.c;
                jai jaiVar = (jai) this.d;
                List list2 = (List) this.e;
                zzs<? super ksy, ? super Integer, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar = (zzs) this.f;
                nvy nvyVar = (nvy) obj;
                wow wowVar = new wow(list);
                nvyVar.e(list.size(), new bxa0(new tji(6), wowVar), new cxa0(wowVar), new jai(2039820996, new dxa0(jaiVar, wowVar), true));
                nvyVar.e(list2.size(), new i54(list2, 1), new f1s(17), zzsVar);
                return s3q0.a;
            default:
                s0s0 s0s0Var = (s0s0) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                String str5 = (String) this.f;
                VideoAdvertisementsRepository.a aVar = (VideoAdvertisementsRepository.a) obj;
                if ((aVar instanceof VideoAdvertisementsRepository.a.C1194a) && ((VideoAdvertisementsRepository.a.C1194a) aVar).a) {
                    return io.reactivex.rxjava3.core.q.T(aVar);
                }
                VideoAdvertisementsRepository.a.d dVar = aVar instanceof VideoAdvertisementsRepository.a.d ? (VideoAdvertisementsRepository.a.d) aVar : null;
                long j = (dVar == null || (l31Var = dVar.a) == null || (g08Var = l31Var.a) == null) ? 0L : g08Var.b;
                io.reactivex.rxjava3.internal.operators.observable.g1 T = io.reactivex.rxjava3.core.q.T(aVar);
                io.reactivex.rxjava3.core.t L = io.reactivex.rxjava3.core.q.B0(j, TimeUnit.SECONDS).L(new cmc0(new byh(s0s0Var, str3, str4, str5, 2), 3), false);
                Objects.requireNonNull(L, "other is null");
                return io.reactivex.rxjava3.core.q.q(T, L);
        }
    }
}
