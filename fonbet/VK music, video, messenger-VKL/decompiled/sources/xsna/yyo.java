package xsna;

import com.google.gson.Gson;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.photos.ui.editalbum.domain.e;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import xsna.c2r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class yyo implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yyo(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((com.vk.photos.ui.editalbum.domain.c) obj).T(e.b.b);
                break;
            case 1:
                ((i340) obj).c();
                break;
            case 2:
                ((b2e0) obj).a();
                break;
            case 3:
                int i2 = SettingsGeneralFragment.z0;
                androidx.appcompat.app.d dVar = ((androidx.appcompat.app.d[]) obj)[0];
                if (dVar != null && dVar.isShowing()) {
                    dVar.dismiss();
                    break;
                }
                break;
            case 4:
                bam0 bam0Var = (bam0) obj;
                Gson gson = bam0Var.d;
                String s = Preference.s("StoryPrivacyCache", "UserId", "");
                UserId userId = bam0Var.a;
                if (!s.equals(String.valueOf(userId.b))) {
                    Preference.H("StoryPrivacyCache", "StoryPrivacyResponse", gson.toJson((Object) null));
                    Preference.H("StoryPrivacyCache", "GroupsResponse", gson.toJson((Object) null));
                }
                Preference.H("StoryPrivacyCache", "UserId", String.valueOf(userId.b));
                break;
            case 5:
                c2r0.b bVar = (c2r0.b) obj;
                r55 r55Var = r55.a;
                ((l2q) r55.d()).b(bVar.a, bVar.g, true);
                break;
            default:
                ((com.vk.voip.ui.hint.a) obj).c();
                break;
        }
    }
}
