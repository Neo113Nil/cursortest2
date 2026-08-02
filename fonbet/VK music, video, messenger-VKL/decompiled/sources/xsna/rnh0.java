package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import kotlin.LazyThreadSafetyMode;
import xsna.lfc;
import xsna.rec;

/* compiled from: SearchCityParameterInteractorImpl.kt */
/* loaded from: classes5.dex */
public final class rnh0 implements pnh0 {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new vo50(14));

    @Override // xsna.pnh0
    public final qnh0 a(izs izsVar) {
        return new qnh0(izsVar, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [xsna.lfc$b, xsna.uwh0] */
    @Override // xsna.pnh0
    public final sh90 c(Context context, String str) {
        rec.b bVar;
        if (((Boolean) this.a.getValue()).booleanValue()) {
            ?? bVar2 = new lfc.b(context, false);
            bVar2.h = str;
            bVar = bVar2;
        } else {
            rec.b bVar3 = new rec.b(context, null);
            bVar3.c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            bVar3.e = str;
            bVar = bVar3;
        }
        return new sh90(bVar);
    }
}
