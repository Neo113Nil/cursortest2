package xsna;

import android.util.SparseArray;
import com.vk.dto.common.Source;
import com.vk.games.presentation.fragments.GamesListFragment;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.voip.ui.call_effects.beauty.ui.BeautySettingsFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.Set;
import xsna.el50;
import xsna.qdw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ew implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ew(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                fw fwVar = (fw) obj2;
                fwVar.d.c();
                cmf0.a.c(fwVar.a.i0.getContext(), fwVar.a.i0.getWindow(), R.string.error);
                break;
            case 1:
                ((ix2) obj2).invoke(obj);
                break;
            case 2:
                ((fl6) obj2).j.onNext((DialogExt) obj);
                break;
            case 3:
                int i2 = BeautySettingsFragment.Q;
                ((k00) obj2).invoke(obj);
                break;
            case 4:
                ((k00) obj2).invoke(obj);
                break;
            case 5:
                ((od3) obj2).invoke(obj);
                break;
            case 6:
                ((k00) obj2).invoke(obj);
                break;
            case 7:
                ((k00) obj2).invoke(obj);
                break;
            case 8:
                ((k00) obj2).invoke(obj);
                break;
            case 9:
                ((k00) obj2).invoke(obj);
                break;
            case 10:
                ((k00) obj2).invoke(obj);
                break;
            case 11:
                ((com.vk.repository.internal.repos.stickers.suggests.a) obj2).invoke(obj);
                break;
            case 12:
                ((x5x0) obj2).invoke(obj);
                break;
            case 13:
                ((z8f) obj2).invoke(obj);
                break;
            case 14:
                el50.a.b((com.vk.profile.community.impl.ui.events.e) obj2, new vr0(23));
                break;
            case 15:
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) obj2;
                aVar.i.D(aVar, new abj((Set) obj, Source.ACTUAL, false, null));
                break;
            case 16:
                ((n9) obj2).invoke(obj);
                break;
            case 17:
                ((b.d) obj2).e();
                break;
            case 18:
                ((n9) obj2).invoke(obj);
                break;
            case 19:
                ((z8f) obj2).invoke(obj);
                break;
            case 20:
                ((z8f) obj2).invoke(obj);
                break;
            case 21:
                ((izs) obj2).invoke(obj);
                break;
            case 22:
                ((c4r) obj2).invoke(obj);
                break;
            case 23:
                SparseArray<String> sparseArray = GamesListFragment.L0;
                ((GamesListFragment) obj2).onError((Throwable) obj);
                break;
            case 24:
                ((z8f) obj2).invoke(obj);
                break;
            case 25:
                ((qdw.b) obj2).invoke(obj);
                break;
            case 26:
                ((udo) obj2).invoke(obj);
                break;
            case 27:
                ((z8f) obj2).invoke(obj);
                break;
            case 28:
                ((amp) obj2).invoke(obj);
                break;
            default:
                ((amp) obj2).invoke(obj);
                break;
        }
    }
}
