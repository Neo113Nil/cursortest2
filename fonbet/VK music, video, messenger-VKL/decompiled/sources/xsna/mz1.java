package xsna;

import androidx.compose.runtime.a;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.BiometricsLockSettingsFragment;
import com.vk.catalog2.feature.music.holders.podcast.ComposePodcastSliderVh;
import com.vk.ecomm.checklist.impl.domain.model.CommunityCheckListTip;
import java.util.List;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.dg70;
import xsna.mvg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mz1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mz1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                ((ez1) obj4).a(floatValue, ((Float) obj2).floatValue());
                ((Ref$FloatRef) obj3).element = floatValue;
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((w44) obj4).d((bn50) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((lf4) obj4).b((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 3:
                List list = (List) obj4;
                BiometricsLockSettingsFragment biometricsLockSettingsFragment = (BiometricsLockSettingsFragment) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = BiometricsLockSettingsFragment.Y;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(966049448, intValue, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.settings.BiometricsLockSettingsFragment.showAutoLockTimeBottomSheet.<anonymous>.<anonymous> (BiometricsLockSettingsFragment.kt:247)");
                    }
                    boolean y = aVar.y(biometricsLockSettingsFragment);
                    Object x = aVar.x();
                    if (y || x == c0012a) {
                        x = new tm0(biometricsLockSettingsFragment, 12);
                        aVar.R(x);
                    }
                    tg5.a(0, aVar, list, (izs) x, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                vse.c((String) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(391));
                break;
            case 5:
                yvg yvgVar = (yvg) obj4;
                CommunityCheckListTip.Type type = (CommunityCheckListTip.Type) obj3;
                yvgVar.getClass();
                if (type != null) {
                    yvgVar.C(new mvg.i(type));
                }
                break;
            case 6:
                ijb0 ijb0Var = (ijb0) obj4;
                ComposePodcastSliderVh composePodcastSliderVh = (ComposePodcastSliderVh) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1296585653, intValue2, -1, "com.vk.catalog2.feature.music.holders.podcast.ComposePodcastSliderVh.bindData.<anonymous>.<anonymous> (ComposePodcastSliderVh.kt:91)");
                    }
                    boolean y2 = aVar2.y(composePodcastSliderVh);
                    Object x2 = aVar2.x();
                    if (y2 || x2 == c0012a) {
                        ComposePodcastSliderVh.a aVar3 = new ComposePodcastSliderVh.a(0, composePodcastSliderVh, ComposePodcastSliderVh.class, "handleClick", "handleClick()V", 0);
                        aVar2.R(aVar3);
                        x2 = aVar3;
                    }
                    iqi.a(ijb0Var, (gzs) ((fcy) x2), aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 7:
                izs izsVar = (izs) obj4;
                wh50 wh50Var = (wh50) obj3;
                boolean z = ((l9x) obj).b > ((l9x) obj2).b;
                izsVar.invoke(Boolean.valueOf(z));
                wh50Var.setValue(Boolean.valueOf(z));
                break;
            case 8:
                ((Integer) obj2).getClass();
                fg70.h((dg70.g) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                knl0.a(ne7.I(7), (androidx.compose.runtime.a) obj, (izs) obj3, (q630) obj4);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ mz1(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
