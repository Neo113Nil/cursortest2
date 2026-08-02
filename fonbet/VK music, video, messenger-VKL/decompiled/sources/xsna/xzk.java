package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import xsna.imw;
import xsna.q630;
import xsna.qq90;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public final class xzk implements yzs<spg0, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ jai b;
    public final /* synthetic */ boolean c;

    public xzk(jai jaiVar, boolean z) {
        this.b = jaiVar;
        this.c = z;
    }

    @Override // xsna.yzs
    public final s3q0 invoke(spg0 spg0Var, androidx.compose.runtime.a aVar, Integer num) {
        String b;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1899489890, intValue, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:2256)");
            }
            this.b.invoke(aVar2, 0);
            float f = np8.d;
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.q(aVar3, f), aVar2, 6);
            imw imwVar = mrv.c;
            if (imwVar == null) {
                imw.a aVar4 = new imw.a("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                EmptyList emptyList = jlr0.a;
                rek0 rek0Var = new rek0(l5g.b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new qq90.f(7.0f, 10.0f));
                arrayList.add(new qq90.m(5.0f, 5.0f));
                arrayList.add(new qq90.m(5.0f, -5.0f));
                arrayList.add(qq90.b.c);
                imw.a.a(aVar4, arrayList, rek0Var);
                imwVar = aVar4.b();
                mrv.c = imwVar;
            }
            boolean z = this.c;
            if (z) {
                aVar2.K(1509384391);
                b = e7b0.b(R.string.m3c_date_picker_switch_to_day_selection, aVar2);
                aVar2.j();
            } else {
                aVar2.K(1509478662);
                b = e7b0.b(R.string.m3c_date_picker_switch_to_year_selection, aVar2);
                aVar2.j();
            }
            uqv.a(imwVar, b, fto0.t(aVar3, z ? 180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 0L, aVar2, 0, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
