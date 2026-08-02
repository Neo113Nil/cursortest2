package xsna;

import androidx.compose.runtime.a;
import com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarDayBlockViewKt;
import java.util.List;
import xsna.yl70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qm7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qm7(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                BookingCalendarDayBlockViewKt.a((com.vk.ecomm.onlinebooking.impl.calendar.k) this.d, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                List list = (List) this.d;
                izs izsVar = (izs) this.c;
                ((Integer) obj2).getClass();
                hle.a(ne7.I(1), (androidx.compose.runtime.a) obj, list, izsVar);
                break;
            case 2:
                gwo gwoVar = (gwo) this.d;
                q630 q630Var = (q630) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-34515349, intValue, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.promote.EasyPromoteRightContent.Content.<anonymous> (EasyPromoteRightContent.kt:42)");
                    }
                    gwoVar.b(q630Var, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                qsp.b((String) this.d, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                g3x.c((wh50) this.d, (wh50) this.c, (androidx.compose.runtime.a) obj, ne7.I(55));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((yl70) this.d).B((yl70.b.C4110b) this.c, (androidx.compose.runtime.a) obj, ne7.I(519));
                break;
            case 6:
                vue0 vue0Var = (vue0) this.d;
                izs izsVar2 = (izs) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(439757847, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioBigPlayerScaffold.<anonymous> (RadioBigPlayerScaffold.kt:51)");
                    }
                    Boolean bool = (Boolean) ((zak0) vue0Var.b).getValue();
                    boolean booleanValue = bool.booleanValue();
                    Boolean bool2 = (Boolean) ((zak0) vue0Var.c).getValue();
                    boolean booleanValue2 = bool2.booleanValue();
                    Boolean bool3 = (Boolean) ((zak0) vue0Var.d).getValue();
                    boolean booleanValue3 = bool3.booleanValue();
                    wh50<Boolean> wh50Var = vue0Var.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(988789632, 196608, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioBigPlayerControls.Companion.invoke (RadioBigPlayerControls.kt:86)");
                    }
                    Object x = aVar2.x();
                    if (x == a.C0011a.a) {
                        ote0 ote0Var = new ote0(booleanValue, booleanValue2, booleanValue3, wh50Var, izsVar2);
                        aVar2.R(ote0Var);
                        x = ote0Var;
                    }
                    ote0 ote0Var2 = (ote0) x;
                    ((zak0) ote0Var2.b).setValue(bool);
                    ((zak0) ote0Var2.c).setValue(bool2);
                    ((zak0) ote0Var2.d).setValue(bool3);
                    ((zak0) ote0Var2.e).setValue(wh50Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    ote0Var2.a(null, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                izs izsVar3 = (izs) this.c;
                q630 q630Var2 = (q630) this.d;
                ((Integer) obj2).getClass();
                n3j0.a(ne7.I(1), (androidx.compose.runtime.a) obj, izsVar3, q630Var2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qm7(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
    }

    public /* synthetic */ qm7(izs izsVar, q630 q630Var, int i) {
        this.b = 7;
        this.c = izsVar;
        this.d = q630Var;
    }
}
