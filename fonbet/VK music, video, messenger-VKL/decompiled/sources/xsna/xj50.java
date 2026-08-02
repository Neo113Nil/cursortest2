package xsna;

import com.vk.dto.video.VideoOwner;
import com.vk.privacyui.PrivacyEditFragment;
import com.vk.stories.StorySettingsActivity;
import java.util.Iterator;
import xsna.ey60;
import xsna.mjw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xj50 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xj50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((ak50) obj2).invoke(obj);
                break;
            case 1:
                ((py60) obj2).a(new ey60.b.a((Throwable) obj));
                break;
            case 2:
                ((o99) obj2).invoke(obj);
                break;
            case 3:
                int i2 = u1a0.A1;
                ((q130) obj2).invoke(obj);
                break;
            case 4:
                ((a5) obj2).invoke(obj);
                break;
            case 5:
                ((isb0) obj2).invoke(obj);
                break;
            case 6:
                ((pw4) obj2).invoke(obj);
                break;
            case 7:
                ((rec0) obj2).invoke(obj);
                break;
            case 8:
                ((isb0) obj2).invoke(obj);
                break;
            case 9:
                ((q130) obj2).invoke(obj);
                break;
            case 10:
                ((PrivacyEditFragment) obj2).onError((Throwable) obj);
                break;
            case 11:
                ((t3v) obj2).invoke(obj);
                break;
            case 12:
                ((q130) obj2).invoke(obj);
                break;
            case 13:
                nef0 nef0Var = (nef0) obj2;
                azi0 azi0Var = (azi0) obj;
                Iterator it = nef0Var.f.c.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    if (((VideoOwner) it.next()).c.equals(azi0Var.a) && azi0Var.c) {
                        nef0Var.d.setSelectedPosition(i3);
                        break;
                    } else {
                        i3++;
                    }
                }
                break;
            case 14:
                int i4 = StorySettingsActivity.P;
                ((f6m0) obj2).invoke(obj);
                break;
            case 15:
                ((f6m0) obj2).invoke(obj);
                break;
            case 16:
                ((y5m0) obj2).invoke(obj);
                break;
            case 17:
                ((r8) obj2).invoke(obj);
                break;
            case 18:
                ((f6m0) obj2).invoke(obj);
                break;
            case 19:
                ((f6m0) obj2).invoke(obj);
                break;
            case 20:
                ((f6m0) obj2).invoke(obj);
                break;
            case 21:
                ((o99) obj2).invoke(obj);
                break;
            case 22:
                ((o99) obj2).invoke(obj);
                break;
            case 23:
                ((dm) obj2).invoke(obj);
                break;
            case 24:
                ((mdm0) obj2).invoke(obj);
                break;
            case 25:
                ((tzq0) obj2).invoke(obj);
                break;
            default:
                ((mjw0.f) obj2).invoke(obj);
                break;
        }
    }
}
