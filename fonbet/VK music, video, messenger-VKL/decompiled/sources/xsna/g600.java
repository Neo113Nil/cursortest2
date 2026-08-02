package xsna;

import com.vk.libvideo.ui.dialog.single.VideoDialog;
import com.vk.stickers.views.LongtapRecyclerView;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class g600 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g600(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = LongtapRecyclerView.n;
                ((iie) obj2).invoke(obj);
                break;
            case 1:
                ((g22) obj2).invoke(obj);
                break;
            case 2:
                ((g1j) obj2).invoke(obj);
                break;
            case 3:
                ((iie) obj2).invoke(obj);
                break;
            case 4:
                ((g22) obj2).invoke(obj);
                break;
            case 5:
                ((iie) obj2).invoke(obj);
                break;
            case 6:
                ((t440) obj2).invoke(obj);
                break;
            case 7:
                ((t440) obj2).invoke(obj);
                break;
            case 8:
                Throwable th = (Throwable) obj;
                com.vk.metrics.eventtracking.b.a.a(th);
                ((kr60) obj2).c(new yo60.g.a(th));
                break;
            case 9:
                ((wd3) obj2).invoke(obj);
                break;
            case 10:
                ((g22) obj2).invoke(obj);
                break;
            case 11:
                ((t440) obj2).invoke(obj);
                break;
            case 12:
                ((t440) obj2).invoke(obj);
                break;
            case 13:
                ((t440) obj2).invoke(obj);
                break;
            case 14:
                ((t440) obj2).invoke(obj);
                break;
            case 15:
                ((g22) obj2).invoke(obj);
                break;
            case 16:
                ((t440) obj2).invoke(obj);
                break;
            case 17:
                ((kp5) obj2).invoke(obj);
                break;
            case 18:
                ((t440) obj2).invoke(obj);
                break;
            case 19:
                ((dsf0) obj2).invoke(obj);
                break;
            case 20:
                ((t440) obj2).invoke(obj);
                break;
            case 21:
                ((t440) obj2).invoke(obj);
                break;
            case 22:
                ((t440) obj2).invoke(obj);
                break;
            case 23:
                int i3 = SettingsGeneralFragment.z0;
                u1u0.b((com.vk.core.view.components.spinner.c) obj2);
                cvk.u(R.string.sett_cache_clear_done, false);
                break;
            case 24:
                ((dvh0) obj2).invoke(obj);
                break;
            case 25:
                ((fvq0) obj2).invoke(obj);
                break;
            case 26:
                ((fvq0) obj2).invoke(obj);
                break;
            case 27:
                ((fvq0) obj2).invoke(obj);
                break;
            case 28:
                VideoDialog videoDialog = (VideoDialog) obj2;
                videoDialog.x0.getViewBinding().c.e();
                i0q0.e(new sc2(videoDialog, 12));
                break;
            default:
                ((fvq0) obj2).invoke(obj);
                break;
        }
    }
}
