package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.kdh0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class iif implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ xzs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ iif(int i, Object obj, xzs xzsVar) {
        this.b = i;
        this.d = obj;
        this.c = xzsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                CharSequence charSequence = (CharSequence) this.d;
                izs izsVar = (izs) this.c;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(q630Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(612585413, intValue, -1, "com.vk.clips.upload.vk.ui.impl.fragment.store.ClipsUploadStateMapper.mapLoaded.<anonymous>.<anonymous>.<anonymous> (ClipsUploadStateMapper.kt:169)");
                    }
                    v3z.b(charSequence, izsVar, q630Var, aVar, (intValue << 6) & 896);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                kdh0.a aVar2 = (kdh0.a) this.d;
                izs izsVar2 = (izs) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(422434832, intValue2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.upperSettingsItems.<anonymous> (Loaded.kt:141)");
                    }
                    ld5 ld5Var = aVar2.g;
                    boolean J = aVar3.J(izsVar2);
                    Object x = aVar3.x();
                    if (J || x == a.C0011a.a) {
                        x = new i97(izsVar2, 4);
                        aVar3.R(x);
                    }
                    wb5.a(ld5Var, (gzs) x, s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), aVar3, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            default:
                f5j0 f5j0Var = (f5j0) this.d;
                gzs gzsVar = (gzs) this.c;
                q630 q630Var2 = (q630) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                aVar4.K(-1050314438);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1050314438, intValue3, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.pin.animation.modifier.shake.<anonymous> (ShakeModifier.kt:15)");
                }
                e5j0 e5j0Var = (e5j0) ((zak0) f5j0Var.a).getValue();
                q630 q630Var3 = null;
                if (e5j0Var == null) {
                    aVar4.K(-1080611267);
                } else {
                    aVar4.K(-1080611266);
                    Object x2 = aVar4.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x2 == c0012a) {
                        x2 = qf2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        aVar4.R(x2);
                    }
                    if2 if2Var = (if2) x2;
                    e5j0 e5j0Var2 = (e5j0) ((zak0) f5j0Var.a).getValue();
                    Object invoke = gzsVar.invoke();
                    boolean J2 = aVar4.J(e5j0Var) | aVar4.y(if2Var);
                    Object x3 = aVar4.x();
                    if (J2 || x3 == c0012a) {
                        x3 = new j5j0(e5j0Var, if2Var, null);
                        aVar4.R(x3);
                    }
                    bap.f(e5j0Var2, invoke, (wzs) x3, aVar4, 0);
                    boolean y = aVar4.y(if2Var);
                    Object x4 = aVar4.x();
                    if (y || x4 == c0012a) {
                        x4 = new i5j0(if2Var, 0);
                        aVar4.R(x4);
                    }
                    q630 a = rdu.a(q630Var2, (izs) x4);
                    boolean y2 = aVar4.y(if2Var) | aVar4.J(e5j0Var);
                    Object x5 = aVar4.x();
                    if (y2 || x5 == c0012a) {
                        x5 = new w620(if2Var, e5j0Var);
                        aVar4.R(x5);
                    }
                    q630Var3 = kci.k(a, (izs) x5);
                }
                aVar4.j();
                if (q630Var3 != null) {
                    q630Var2 = q630Var3;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return q630Var2;
        }
    }
}
