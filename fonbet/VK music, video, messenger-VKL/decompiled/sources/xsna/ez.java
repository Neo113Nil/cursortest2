package xsna;

import com.vk.channels.impl.list.g;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridCommonClipsListFragment;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.voip.ui.onboarding.ui.CallOnboardingView;
import xsna.kbj0;
import xsna.kz30;
import xsna.otb;
import xsna.zx10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ez implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ez(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((dz) obj2).invoke(obj);
                break;
            case 1:
                ((hu1) obj2).invoke(obj);
                break;
            case 2:
                int i2 = CallOnboardingView.j;
                ((com.vk.movika.sdk.base.observable.g) obj2).invoke(obj);
                break;
            case 3:
                ((h99) obj2).invoke(obj);
                break;
            case 4:
                com.vk.channels.impl.list.b bVar = (com.vk.channels.impl.list.b) obj2;
                Throwable th = (Throwable) obj;
                bVar.s().b(th, new cu1(5));
                bVar.n(new g.b(th));
                break;
            case 5:
                ((com.vk.movika.sdk.base.observable.g) obj2).invoke(obj);
                break;
            case 6:
                ((otb.f) obj2).invoke(obj);
                break;
            case 7:
                ((u8) obj2).invoke(obj);
                break;
            case 8:
                ((dz) obj2).invoke(obj);
                break;
            case 9:
                ((dz) obj2).invoke(obj);
                break;
            case 10:
                ((com.vk.movika.sdk.base.observable.g) obj2).invoke(obj);
                break;
            case 11:
                ((com.vk.movika.sdk.base.observable.g) obj2).invoke(obj);
                break;
            case 12:
                int i3 = ClipsGridCommonClipsListFragment.q0;
                ((com.vk.movika.sdk.base.observable.g) obj2).invoke(obj);
                break;
            case 13:
                ((p8) obj2).invoke(obj);
                break;
            case 14:
                ((com.vk.sharing.core.view.l) obj2).Ul((kbj0.a) obj);
                break;
            case 15:
                int i4 = d2h.p1;
                ((com.vk.movika.sdk.base.observable.g) obj2).invoke(obj);
                break;
            case 16:
                ((com.vk.movika.sdk.base.observable.g) obj2).invoke(obj);
                break;
            case 17:
                ((com.vk.movika.sdk.base.observable.g) obj2).invoke(obj);
                break;
            case 18:
                ((dz) obj2).invoke(obj);
                break;
            case 19:
                ((m1k) obj2).invoke(obj);
                break;
            case 20:
                ((fre) obj2).invoke(obj);
                break;
            case 21:
                ((dz) obj2).invoke(obj);
                break;
            case 22:
                ((m1k) obj2).invoke(obj);
                break;
            case 23:
                ((azt) obj2).invoke(obj);
                break;
            case 24:
                int i5 = ImDialogsSelectionFragment.n0;
                ((zf1) obj2).invoke(obj);
                break;
            case 25:
                ((com.vk.libvideo.design.view.video.a) obj2).invoke(obj);
                break;
            case 26:
                ((azt) obj2).invoke(obj);
                break;
            case 27:
                ((zx10.a) obj2).invoke(obj);
                break;
            case 28:
                ((kz30.f) obj2).invoke(obj);
                break;
            default:
                ((zf1) obj2).invoke(obj);
                break;
        }
    }
}
