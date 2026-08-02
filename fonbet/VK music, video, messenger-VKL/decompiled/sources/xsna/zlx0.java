package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.whitelabelauth.di.data.WhiteLabelAuthData;

/* compiled from: WhitelabelRefactorDelegate.kt */
/* loaded from: classes15.dex */
public final class zlx0 {
    public static Bundle a(com.vk.whitelabelauth.di.b bVar, WhiteLabelAuthData whiteLabelAuthData) {
        if (SakFeatures.Type.VKC_AUTH_COMMON_REFACTOR.h()) {
            return bVar.a();
        }
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("key_white_label_auth_data", whiteLabelAuthData);
        return bundle;
    }

    public static Fragment b(com.vk.whitelabelauth.di.b bVar) {
        return SakFeatures.Type.VKC_AUTH_COMMON_REFACTOR.h() ? bVar.b() : new vkx0();
    }
}
