package xsna;

import com.vk.channels.impl.comments.f;
import com.vk.im.ui.fragments.chat.ChatFragment;
import xsna.eee;
import xsna.mwa;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh6 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sh6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        int i2 = 2;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((ph6) obj2).invoke(obj);
                break;
            case 1:
                ((d7) obj2).invoke(obj);
                break;
            case 2:
                ((pf) obj2).invoke(obj);
                break;
            case 3:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) obj2;
                bVar.q(new ju(i2, bVar, (mwa.a) obj));
                Integer num = bVar.h.d;
                if (num != null) {
                    int intValue = num.intValue();
                    bVar.n(new f.e(intValue));
                    bVar.w(intValue);
                    break;
                }
                break;
            case 4:
                ((sg3) obj2).invoke(obj);
                break;
            case 5:
                ChatFragment.d dVar = ChatFragment.w1;
                ((pf) obj2).invoke(obj);
                break;
            case 6:
                ((d7) obj2).invoke(obj);
                break;
            case 7:
                ((vh9) obj2).invoke(obj);
                break;
            case 8:
                ((d7) obj2).invoke(obj);
                break;
            case 9:
                ((p8) obj2).invoke(obj);
                break;
            case 10:
                ((eee.a) obj2).invoke(obj);
                break;
            case 11:
                ((wcx0) obj2).invoke(obj);
                break;
            case 12:
                ((vh9) obj2).invoke(obj);
                break;
            case 13:
                ((pf) obj2).invoke(obj);
                break;
            case 14:
                ((dkg) obj2).invoke(obj);
                break;
            case 15:
                ((tmg) obj2).invoke(obj);
                break;
            case 16:
                ((dkg) obj2).invoke(obj);
                break;
            case 17:
                ((u9e) obj2).invoke(obj);
                break;
            case 18:
                ((hwm) obj2).q(new vam((sr5) obj, i2));
                break;
            case 19:
                ((ma) obj2).invoke(obj);
                break;
            case 20:
                ((dkg) obj2).invoke(obj);
                break;
            case 21:
                ((dkg) obj2).invoke(obj);
                break;
            case 22:
                ((x030) obj2).invoke(obj);
                break;
            case 23:
                ((lwa) obj2).invoke(obj);
                break;
            case 24:
                ((x2y) obj2).invoke(obj);
                break;
            case 25:
                ((qw30) obj2).invoke(obj);
                break;
            case 26:
                ((ma) obj2).invoke(obj);
                break;
            case 27:
                ((yw5) obj2).invoke(obj);
                break;
            case 28:
                ((nyq) obj2).invoke(obj);
                break;
            default:
                ((vh9) obj2).invoke(obj);
                break;
        }
    }
}
