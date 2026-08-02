package xsna;

import com.vk.catalog2.feature.music.holders.MusicTrackVh;
import com.vk.profile.questions.impl.h;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuActionsFragment;
import com.vkontakte.android.ValidationActivity;
import com.vkontakte.android.ValidationActivity.b.a;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class be50 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ be50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Set<String> set = MusicTrackVh.v;
                ((o010) obj2).invoke(obj);
                break;
            case 1:
                ((o010) obj2).invoke(obj);
                break;
            case 2:
                ((ow60) obj2).invoke(obj);
                break;
            case 3:
                ((py60) obj2).e((vx60) obj);
                break;
            case 4:
                ((o010) obj2).invoke(obj);
                break;
            case 5:
                ((o010) obj2).invoke(obj);
                break;
            case 6:
                ((p37) obj2).invoke(obj);
                break;
            case 7:
                int i2 = u1a0.A1;
                ((o010) obj2).invoke(obj);
                break;
            case 8:
                ((o010) obj2).invoke(obj);
                break;
            case 9:
                ((mga0) obj2).invoke(obj);
                break;
            case 10:
                ((h.c) obj2).invoke(obj);
                break;
            case 11:
                ((zb60) obj2).invoke(obj);
                break;
            case 12:
                ((y5z) obj2).invoke(obj);
                break;
            case 13:
                ((ou1) obj2).invoke(obj);
                break;
            case 14:
                ((mga0) obj2).invoke(obj);
                break;
            case 15:
                ((ku1) obj2).invoke(obj);
                break;
            case 16:
                ((ysl0) obj2).invoke(obj);
                break;
            case 17:
                ((mga0) obj2).invoke(obj);
                break;
            case 18:
                ((mga0) obj2).invoke(obj);
                break;
            case 19:
                ((een0) obj2).invoke(obj);
                break;
            case 20:
                ((mga0) obj2).invoke(obj);
                break;
            case 21:
                ValidationActivity.b bVar = (ValidationActivity.b) obj2;
                ValidationActivity validationActivity = ValidationActivity.this;
                qge0 d = validationActivity.A.d(validationActivity, bVar.new a(), (mge0) obj);
                validationActivity.B = d;
                d.g();
                break;
            case 22:
                ((een0) obj2).invoke(obj);
                break;
            case 23:
                ((vgs0) obj2).invoke(obj);
                break;
            case 24:
                ((vgs0) obj2).invoke(obj);
                break;
            case 25:
                ((com.vk.libvideo.b) obj2).invoke(obj);
                break;
            case 26:
                ((een0) obj2).invoke(obj);
                break;
            case 27:
                ((ow60) obj2).invoke(obj);
                break;
            case 28:
                ((vgs0) obj2).invoke(obj);
                break;
            default:
                int i3 = VoipMainMenuActionsFragment.V;
                ((vgs0) obj2).invoke(obj);
                break;
        }
    }
}
