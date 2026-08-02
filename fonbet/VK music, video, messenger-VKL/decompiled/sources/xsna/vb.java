package xsna;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.view.animation.CycleInterpolator;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ironsource.Ce;
import com.ironsource.InterfaceC4569te;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment;
import com.vk.im.reactions.impl.set_reaction.list.ReactionListController;
import com.vk.music.ui.bottomsheet.MusicPlayerPersistentBottomSheet;
import com.vk.rlottie.RLottieDrawable;
import ru.mail.libverify.controls.VerificationController;
import ru.ok.media.ReachabilityServiceImpl;
import xsna.i1e;
import xsna.k5x;
import xsna.l2f;
import xsna.o2z0;
import xsna.xn50;
import xsna.z710;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class vb implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Application application;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = AbsFriendsFragment.l0;
                ((AbsFriendsFragment) obj).so();
                break;
            case 1:
                Object obj2 = ((ta6) obj).o;
                ((l0c) (obj2 != null ? obj2 : null)).i();
                break;
            case 2:
                mhy.j(((BaseVkSearchView) obj).w);
                break;
            case 3:
                float f = CameraUIView.w1;
                ((CameraUIView) obj).I();
                break;
            case 4:
                Ce.a((InterfaceC4569te) obj);
                break;
            case 5:
                i1e i1eVar = (i1e) obj;
                i1e.b a = i1eVar.a();
                if (a != null) {
                    a.a.D4().j(i1eVar.b(a.b));
                    break;
                }
                break;
            case 6:
                l2f.a aVar = (l2f.a) obj;
                Activity activity = aVar.e.get();
                if (activity != null && (application = activity.getApplication()) != null) {
                    application.unregisterActivityLifecycleCallbacks(aVar.h);
                }
                l2f l2fVar = aVar.f;
                if (l2fVar != null) {
                    l2fVar.n();
                    break;
                }
                break;
            case 7:
                ((gzs) obj).invoke();
                break;
            case 8:
                z5f0 z5f0Var = ((m3r) obj).P;
                Float f2 = z5f0Var.k;
                if (f2 != null) {
                    float floatValue = f2.floatValue();
                    Float f3 = z5f0Var.l;
                    if (f3 != null) {
                        float floatValue2 = f3.floatValue();
                        if (!z5f0Var.m) {
                            hxb0 hxb0Var = z5f0Var.f;
                            if (hxb0Var.g) {
                                hxb0Var.d(floatValue, floatValue2);
                                break;
                            }
                        }
                    }
                }
                break;
            case 9:
                ((BottomSheetBehavior) obj).X(3);
                break;
            case 10:
                dfw dfwVar = (dfw) obj;
                mhy.j(dfwVar.h.getEditText());
                VkInputSelect vkInputSelect = dfwVar.h;
                AppCompatEditText editText = vkInputSelect.getEditText();
                Editable text = vkInputSelect.getText();
                editText.setSelection(text != null ? text.length() : 0);
                break;
            case 11:
                k5x.b bVar = (k5x.b) obj;
                bVar.animate().rotationBy(20.0f).setDuration(2000L).setInterpolator(new CycleInterpolator(4.0f)).withEndAction(new qd0(bVar, 9)).start();
                break;
            case 12:
                xn50.a.c(((e910) obj).a.d, z710.o.b);
                break;
            case 13:
                MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet = (MusicPlayerPersistentBottomSheet) obj;
                int i3 = MusicPlayerPersistentBottomSheet.u0;
                musicPlayerPersistentBottomSheet.getBottomSheetBehavior().G(musicPlayerPersistentBottomSheet.getContentLayout());
                break;
            case 14:
                xia0 xia0Var = (xia0) obj;
                View view = xia0Var.j;
                if (view != null) {
                    view.setVisibility(4);
                }
                d98 d98Var = xia0Var.l;
                if (d98Var != null) {
                    d98Var.a();
                    break;
                }
                break;
            case 15:
                Handler handler = RLottieDrawable.r;
                ((RLottieDrawable) obj).g();
                break;
            case 16:
                ((ReachabilityServiceImpl) obj).notifyChanged();
                break;
            case 17:
                ReactionListController reactionListController = (ReactionListController) obj;
                if (reactionListController.f()) {
                    reactionListController.a.setAlpha(1.0f);
                }
                reactionListController.i.invoke();
                break;
            case 18:
                ((e8m0) obj).b.f7();
                break;
            case 19:
                ((VerificationController) obj).lambda$reset$42();
                break;
            case 20:
                dou0 dou0Var = (dou0) obj;
                if (sxc0.b(dou0Var.a)) {
                    dou0Var.b(dou0Var.e);
                }
                Preference.F(System.currentTimeMillis(), "sa_pool", "__sa_pool_use_timestamp__");
                break;
            case 21:
                ((com.mbridge.msdk.config.component.info.provider.subprovider.b) obj).f();
                break;
            case 22:
                o2z0 o2z0Var = (o2z0) obj;
                o2z0.b bVar2 = o2z0Var.b;
                if (bVar2 != null) {
                    bVar2.a(true);
                    o2z0Var.b = null;
                    break;
                }
                break;
            default:
                ((ru.mail.libverify.api.s) obj).t();
                break;
        }
    }
}
