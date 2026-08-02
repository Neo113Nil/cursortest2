package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.pushes.PushOpenActivity;
import com.vk.stickers.settings.StickerSettingsFeature;
import com.vk.stickers.settings.c;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl;
import xsna.sg60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rg60 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rg60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((sg60.a) obj).a();
                break;
            case 1:
                ((h7b0) obj).g = null;
                break;
            case 2:
                PushOpenActivity pushOpenActivity = (PushOpenActivity) obj;
                int i2 = PushOpenActivity.f;
                rwi.d().o(pushOpenActivity);
                i0q0.f(new p1d0(pushOpenActivity, 4));
                break;
            case 3:
                RateManagerImpl._init_$lambda$0((RateManagerImpl) obj);
                break;
            case 4:
                int i3 = SettingsGeneralFragment.z0;
                androidx.appcompat.app.d dVar = ((androidx.appcompat.app.d[]) obj)[0];
                if (dVar != null && dVar.isShowing()) {
                    dVar.dismiss();
                    break;
                }
                break;
            case 5:
                ((StickerSettingsFeature) obj).T(new c.e(false));
                break;
            default:
                FragmentActivity activity = ((lwv0) obj).e.getActivity();
                if (activity != null) {
                    iah0.x(activity, false);
                    break;
                }
                break;
        }
    }
}
