package xsna;

import androidx.compose.foundation.text.HandleState;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ouj implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ouj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        boolean z = false;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                puj pujVar = (puj) obj4;
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                if (!booleanValue) {
                    intValue = pujVar.w.a(intValue);
                }
                if (!booleanValue) {
                    intValue2 = pujVar.w.a(intValue2);
                }
                if (pujVar.v) {
                    long j = pujVar.s.b;
                    int i2 = qko0.c;
                    if (intValue != ((int) (j >> 32)) || intValue2 != ((int) (j & 4294967295L))) {
                        if (Math.min(intValue, intValue2) < 0 || Math.max(intValue, intValue2) > pujVar.s.a.c.length()) {
                            gho0 gho0Var = pujVar.x;
                            gho0Var.v(false);
                            gho0Var.s(HandleState.None);
                        } else {
                            if (booleanValue || intValue == intValue2) {
                                gho0 gho0Var2 = pujVar.x;
                                gho0Var2.v(false);
                                gho0Var2.s(HandleState.None);
                            } else {
                                pujVar.x.j(true);
                            }
                            pujVar.t.v.invoke(new tho0(pujVar.s.a, jgz.c(intValue, intValue2), 4));
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                q630 q630Var = (q630) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1785575669, intValue3, -1, "com.vk.games.presentation.components.MapDetailItemsToView.<anonymous> (MapDetailItemsToView.kt:46)");
                    }
                    cft.a(q630Var, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                Boolean bool = (Boolean) obj;
                FeatureRoles featureRoles = (FeatureRoles) obj2;
                Boolean bool2 = (Boolean) obj3;
                if (((Boolean) ((kcx0) obj4).b.invoke()).booleanValue() && bool.booleanValue() && !bool2.booleanValue()) {
                    z = true;
                }
                return new VoipActionsFeatureState.y(z, epx.f(featureRoles, FeatureRoles.EnabledForAll.INSTANCE));
        }
    }
}
