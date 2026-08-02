package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class dom implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dom(long j, hpm hpmVar) {
        this.c = j;
        this.d = hpmVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((hpm) this.d).b.b().execSQL("UPDATE dialogs SET business_notify_info_visible = ? WHERE id = ?", new Object[]{0, Long.valueOf(this.c)});
                break;
            default:
                androidx.compose.ui.graphics.a aVar = (androidx.compose.ui.graphics.a) this.d;
                oio oioVar = (oio) obj;
                aVar.reset();
                aVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                float f = 20;
                float f2 = 6;
                float f3 = 3;
                float f4 = 8;
                float f5 = 2;
                aVar.b(oioVar.I0(f) / f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oioVar.I0(f) / f3, oioVar.I0(f4), oioVar.I0(f) / f5, oioVar.I0(f4));
                aVar.b((oioVar.I0(f) * f5) / f3, oioVar.I0(f4), oioVar.I0(f) - (oioVar.I0(f) / f2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oioVar.I0(f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                oio.C0(oioVar, aVar, this.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, qbr.a, 52);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ dom(androidx.compose.ui.graphics.a aVar, long j) {
        this.d = aVar;
        this.c = j;
    }
}
