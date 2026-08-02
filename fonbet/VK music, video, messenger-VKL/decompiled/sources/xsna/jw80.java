package xsna;

import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.d;
import com.vk.libvideo.ui.VideoHideView;
import com.vkontakte.android.fragments.SettingsAccountInnerFragment;
import kotlin.Pair;
import xsna.e6e0;
import xsna.hxw0;
import xsna.svq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jw80 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jw80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        svq0.b.h hVar = svq0.b.h.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((com.vk.ecomm.orders.impl.orderlist.presentation.mvi.h) obj2).e(new d.c.a(((gy80) obj).b));
                break;
            case 1:
                ((qw30) obj2).invoke(obj);
                break;
            case 2:
                ((oey) obj2).invoke(obj);
                break;
            case 3:
                ((xd8) obj2).invoke(obj);
                break;
            case 4:
                ((ma) obj2).invoke(obj);
                break;
            case 5:
                ((qw30) obj2).invoke(obj);
                break;
            case 6:
                ((ma) obj2).invoke(obj);
                break;
            case 7:
                ((qw30) obj2).invoke(obj);
                break;
            case 8:
                ((qw30) obj2).invoke(obj);
                break;
            case 9:
                ((e6e0.a) obj2).invoke(obj);
                break;
            case 10:
                ((qw30) obj2).invoke(obj);
                break;
            case 11:
                int i2 = SettingsAccountInnerFragment.r0;
                ((SettingsAccountInnerFragment) obj2).findPreference("unread_counter").I("");
                break;
            case 12:
                ((emh0) obj2).invoke(obj);
                break;
            case 13:
                ((nyq) obj2).invoke(obj);
                break;
            case 14:
                ((csl0) obj2).invoke(obj);
                break;
            case 15:
                ((j4c) obj2).invoke(obj);
                break;
            case 16:
                ((vh9) obj2).invoke(obj);
                break;
            case 17:
                ((emh0) obj2).invoke(obj);
                break;
            case 18:
                ((zkj0) obj2).invoke(obj);
                break;
            case 19:
                isq0 isq0Var = (isq0) obj2;
                Pair pair = (Pair) obj;
                bwq0 bwq0Var = (bwq0) pair.d();
                boolean booleanValue = ((Boolean) pair.g()).booleanValue();
                isq0Var.e(bwq0Var);
                isq0Var.E(booleanValue);
                isq0Var.z();
                isq0Var.t();
                isq0Var.c(hVar);
                break;
            case 20:
                zvq0 zvq0Var = (zvq0) obj2;
                zvq0Var.e((bwq0) obj);
                zvq0Var.y();
                zvq0Var.t();
                zvq0Var.c(hVar);
                break;
            case 21:
                ((emh0) obj2).invoke(obj);
                break;
            case 22:
                ((emh0) obj2).invoke(obj);
                break;
            case 23:
                int i3 = VideoHideView.A;
                ((wql0) obj2).invoke(obj);
                break;
            case 24:
                ((emh0) obj2).invoke(obj);
                break;
            case 25:
                ((fom) obj2).invoke(obj);
                break;
            case 26:
                ((emh0) obj2).invoke(obj);
                break;
            case 27:
                ((wql0) obj2).invoke(obj);
                break;
            default:
                ((hxw0.c) obj2).invoke(obj);
                break;
        }
    }
}
