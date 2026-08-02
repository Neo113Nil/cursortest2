package xsna;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import one.video.player.OneVideoPlayer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class q9s implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ q9s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction invoke$lambda$0;
        switch (this.b) {
            case 0:
                one.video.player.j jVar = (one.video.player.j) this.c;
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) this.d;
                OneVideoPlayer.DiscontinuityReason discontinuityReason = (OneVideoPlayer.DiscontinuityReason) this.e;
                deb0 deb0Var = (deb0) this.f;
                deb0 deb0Var2 = (deb0) this.g;
                Iterator<OneVideoPlayer.c> it = jVar.b.iterator();
                while (it.hasNext()) {
                    it.next().a(discontinuityReason, oneVideoPlayer, deb0Var, deb0Var2);
                }
                return s3q0.a;
            default:
                invoke$lambda$0 = HandleInvocationsFromAdViewer.invoke$lambda$0((HandleInvocationsFromAdViewer) this.c, (String) this.d, (String) this.e, (String) this.f, (AdObject) this.g);
                return invoke$lambda$0;
        }
    }
}
