package xsna;

import com.vk.superapp.verification.account.b;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VkVerificationTinkoffStatesFactory.kt */
/* loaded from: classes6.dex */
public final class czv0 implements b.i {
    @Override // com.vk.superapp.verification.account.b.i
    public final b.l a() {
        return new b.l(R.string.vk_verification_account_successful_connect_tinkoff_subtitile);
    }

    @Override // com.vk.superapp.verification.account.b.i
    public final b.h b() {
        return new b.h(R.string.vk_verification_account_tinkoff_account_not_verified_title, null);
    }

    @Override // com.vk.superapp.verification.account.b.i
    public final b.e c() {
        return new b.e(R.string.vk_verification_account_tinkoff_account_is_busy_title);
    }

    @Override // com.vk.superapp.verification.account.b.i
    public final b.C1911b d(List<b.f> list) {
        return new b.C1911b(R.string.vk_verification_account_tinkoff_data_not_match_subtitle, R.string.vk_vefification_account_tinkoff_sync, list);
    }

    @Override // com.vk.superapp.verification.account.b.i
    public final b.g e() {
        return new b.g(R.string.vk_verification_account_tinkoff_not_available_title);
    }
}
