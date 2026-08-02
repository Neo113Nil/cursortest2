package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.newsfeed.impl.presenters.b;
import com.vk.photos.root.photoflow.presentation.b;
import com.vk.privacyui.PrivacyEditFragment;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuActionsFragment;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh40 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dh40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((ch40) obj2).invoke(obj);
                break;
            case 1:
                ((ri0) obj2).invoke(obj);
                break;
            case 2:
                ((p010) obj2).invoke(obj);
                break;
            case 3:
                ((qot0) obj2).e((List) obj);
                break;
            case 4:
                ((p010) obj2).invoke(obj);
                break;
            case 5:
                ((dv60) obj2).e((jv60) obj);
                break;
            case 6:
                ((bws) obj2).invoke(obj);
                break;
            case 7:
                ((p010) obj2).invoke(obj);
                break;
            case 8:
                int i2 = u1a0.A1;
                ((p010) obj2).invoke(obj);
                break;
            case 9:
                ((b.a) obj2).invoke(obj);
                break;
            case 10:
                ((bws) obj2).invoke(obj);
                break;
            case 11:
                ((b.a) obj2).invoke(obj);
                break;
            case 12:
                ((bws) obj2).invoke(obj);
                break;
            case 13:
                PrivacyEditFragment privacyEditFragment = (PrivacyEditFragment) obj2;
                int[] iArr = PrivacyEditFragment.W0;
                privacyEditFragment.getClass();
                privacyEditFragment.onError(new VKApiExecutionException(0, "", true, privacyEditFragment.getString(R.string.general_error_description)));
                break;
            case 14:
                ((p010) obj2).invoke(obj);
                break;
            case 15:
                ((ri0) obj2).invoke(obj);
                break;
            case 16:
                ((ri0) obj2).invoke(obj);
                break;
            case 17:
                ((ri0) obj2).invoke(obj);
                break;
            case 18:
                ((btl0) obj2).invoke(obj);
                break;
            case 19:
                ((crx) obj2).invoke(obj);
                break;
            case 20:
                ((hfm0) obj2).invoke(obj);
                break;
            case 21:
                ((hfm0) obj2).invoke(obj);
                break;
            case 22:
                ((p99) obj2).invoke(obj);
                break;
            case 23:
                ((hfm0) obj2).invoke(obj);
                break;
            case 24:
                ((BaseVkSearchView) obj2).d0();
                break;
            case 25:
                ((lf3) obj2).invoke(obj);
                break;
            case 26:
                ((btl0) obj2).invoke(obj);
                break;
            default:
                int i3 = VoipMainMenuActionsFragment.V;
                ((hfm0) obj2).invoke(obj);
                break;
        }
    }
}
