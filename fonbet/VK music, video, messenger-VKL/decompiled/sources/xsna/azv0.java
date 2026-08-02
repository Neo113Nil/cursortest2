package xsna;

import com.vk.superapp.verification.account.b;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VkVerificationEsiaStatesFactory.kt */
/* loaded from: classes6.dex */
public final class azv0 implements b.i {
    @Override // com.vk.superapp.verification.account.b.i
    public final b.l a() {
        return new b.l(R.string.vk_verification_account_successful_connect_esia_subtitile);
    }

    @Override // com.vk.superapp.verification.account.b.i
    public final b.h b() {
        return new b.h(R.string.vk_verification_account_esia_account_not_verified_title, Integer.valueOf(R.string.vk_verification_account_more_info));
    }

    @Override // com.vk.superapp.verification.account.b.i
    public final b.e c() {
        return new b.e(R.string.vk_verification_account_esia_account_is_busy_title);
    }

    @Override // com.vk.superapp.verification.account.b.i
    public final b.C1911b d(List<b.f> list) {
        return new b.C1911b(R.string.vk_verification_account_esia_data_not_match_subtitle, R.string.vk_vefification_account_esia_sync, list);
    }

    @Override // com.vk.superapp.verification.account.b.i
    public final b.g e() {
        return new b.g(R.string.vk_verification_account_esia_not_available_title);
    }
}
