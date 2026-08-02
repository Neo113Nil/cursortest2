package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zhz implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zhz(int i, gzs gzsVar) {
        this.c = i;
        this.d = gzsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                aiz aizVar = (aiz) this.d;
                return aizVar.b.findViewById(this.c);
            default:
                return new yjl(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.c, (gzs) this.d);
        }
    }

    public /* synthetic */ zhz(aiz aizVar, int i) {
        this.d = aizVar;
        this.c = i;
    }
}
