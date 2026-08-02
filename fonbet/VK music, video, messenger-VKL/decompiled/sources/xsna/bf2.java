package xsna;

import com.vk.biometrics.lock.impl.service.HidePushContentService;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import java.util.Set;
import xsna.e820;
import xsna.fl6;
import xsna.qzr;
import xsna.xyb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class bf2 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bf2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((af2) obj2).invoke(obj);
                break;
            case 1:
                int i2 = AppearanceSettingsWithBackgroundsFragment.b0;
                ((h5) obj2).invoke(obj);
                break;
            case 2:
                ((h5) obj2).invoke(obj);
                break;
            case 3:
                ((po5) obj2).invoke(obj);
                break;
            case 4:
                ((af2) obj2).invoke(obj);
                break;
            case 5:
                ((fl6.c) obj2).invoke(obj);
                break;
            case 6:
                ((h5) obj2).invoke(obj);
                break;
            case 7:
                ((uw4) obj2).invoke(obj);
                break;
            case 8:
                ((k9) obj2).invoke(obj);
                break;
            case 9:
                ((xyb.a) obj2).invoke(obj);
                break;
            case 10:
                int i3 = ClipsGridDraftsListFragment.l0;
                ((yad) obj2).invoke(obj);
                break;
            case 11:
                ((yad) obj2).invoke(obj);
                break;
            case 12:
                ((yad) obj2).invoke(obj);
                break;
            case 13:
                ((wem) obj2).invoke(obj);
                break;
            case 14:
                psm psmVar = (psm) obj2;
                psmVar.x = itg0.l(psmVar.l.c((Set) obj).g(new jf1(psmVar, 3)).q(psmVar.q));
                break;
            case 15:
                pzr pzrVar = (pzr) obj2;
                a1s a1sVar = (a1s) obj;
                pzrVar.getClass();
                if (a1sVar instanceof b580) {
                    int i4 = ((b580) a1sVar).b;
                    Integer num = pzrVar.j.a;
                    if (num != null && i4 == num.intValue()) {
                        pzrVar.m(qzr.b.a);
                        break;
                    }
                }
                break;
            case 16:
                ((izs) obj2).invoke(obj);
                break;
            case 17:
                int i5 = FriendsRecommendationsFragment.b0;
                ((qm) obj2).invoke(obj);
                break;
            case 18:
                ((af2) obj2).invoke(obj);
                break;
            case 19:
                ((l6u) obj2).invoke(obj);
                break;
            case 20:
                ((uxu) obj2).invoke(obj);
                break;
            case 21:
                int i6 = HidePushContentService.j;
                ((af2) obj2).invoke(obj);
                break;
            case 22:
                ((yu1) obj2).invoke(obj);
                break;
            case 23:
                ((af2) obj2).invoke(obj);
                break;
            case 24:
                ((yu1) obj2).invoke(obj);
                break;
            case 25:
                pmz pmzVar = (pmz) obj2;
                pmzVar.e.l1();
                pmzVar.c.w();
                fxc0.B().O();
                break;
            case 26:
                ((e820.d) obj2).invoke(obj);
                break;
            case 27:
                ((l2e) obj2).invoke(obj);
                break;
            case 28:
                ((b95) obj2).invoke(obj);
                break;
            default:
                ((l6u) obj2).invoke(obj);
                break;
        }
    }
}
