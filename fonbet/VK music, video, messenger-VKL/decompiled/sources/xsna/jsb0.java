package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.privacyui.PrivacyEditFragment;
import com.vkontakte.android.ValidationActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jsb0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jsb0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((ggb0) this.c).invoke(obj);
                break;
            case 1:
                ((com.vk.channels.impl.post_settings.b) this.c).q(new vsq(22));
                break;
            case 2:
                ((juz) this.c).invoke(obj);
                break;
            case 3:
                ((juz) this.c).invoke(obj);
                break;
            case 4:
                ((dwa) this.c).invoke(obj);
                break;
            case 5:
                ((ggb0) this.c).invoke(obj);
                break;
            case 6:
                PrivacyEditFragment privacyEditFragment = (PrivacyEditFragment) this.c;
                sfd0 sfd0Var = (sfd0) obj;
                int[] iArr = PrivacyEditFragment.W0;
                privacyEditFragment.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(sfd0Var.a);
                List<UserProfile> list = sfd0Var.b;
                arrayList.addAll(list);
                privacyEditFragment.L0.c.addAll(sfd0Var.a);
                privacyEditFragment.M0.c.addAll(list);
                privacyEditFragment.oo();
                privacyEditFragment.Bo(Collections.EMPTY_LIST, false);
                break;
            case 7:
                ((wqb) this.c).invoke(obj);
                break;
            case 8:
                ((juz) this.c).invoke(obj);
                break;
            case 9:
                ((hv7) this.c).invoke(obj);
                break;
            case 10:
                ((juz) this.c).invoke(obj);
                break;
            case 11:
                ((h2h0) this.c).invoke(obj);
                break;
            case 12:
                ((ggb0) this.c).invoke(obj);
                break;
            case 13:
                ((ggb0) this.c).invoke(obj);
                break;
            case 14:
                ((ggb0) this.c).invoke(obj);
                break;
            case 15:
                ValidationActivity.b bVar = (ValidationActivity.b) this.c;
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    j03.i(ValidationActivity.this, (VKApiExecutionException) th);
                }
                ValidationActivity.this.setResult(0);
                ValidationActivity.H = 1;
                ValidationActivity.this.finish();
                break;
            case 16:
                ((ggb0) this.c).invoke(obj);
                break;
            case 17:
                ggb0 ggb0Var = (ggb0) this.c;
                int i = VideoOfflineFragment.f1;
                ggb0Var.invoke(obj);
                break;
            case 18:
                ((f6m0) this.c).invoke(obj);
                break;
            default:
                cbt0 cbt0Var = (cbt0) this.c;
                int i2 = c2x0.o1;
                cbt0Var.invoke(obj);
                break;
        }
    }
}
