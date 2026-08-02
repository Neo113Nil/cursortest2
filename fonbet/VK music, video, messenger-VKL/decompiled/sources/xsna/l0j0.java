package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.user.UserNameType;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.prefui.views.SummaryListPreference;
import com.vkontakte.android.fragments.SettingsAccountInnerFragment;

/* compiled from: SettingsAccountInnerFragment.java */
/* loaded from: classes7.dex */
public final class l0j0 extends rpj0<Boolean> {
    public final /* synthetic */ UserNameType d;
    public final /* synthetic */ SummaryListPreference e;
    public final /* synthetic */ String f;
    public final /* synthetic */ SettingsAccountInnerFragment g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0j0(SettingsAccountInnerFragment settingsAccountInnerFragment, FragmentActivity fragmentActivity, UserNameType userNameType, SummaryListPreference summaryListPreference, String str) {
        super(fragmentActivity);
        this.g = settingsAccountInnerFragment;
        this.d = userNameType;
        this.e = summaryListPreference;
        this.f = str;
    }

    @Override // xsna.hx2
    public final void b(Object obj) {
        o25.a().a0(this.d);
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        a1wVar.x(new OnCacheInvalidateEvent(this, OnCacheInvalidateEvent.Reason.FORCED_FROM_CMD));
    }

    @Override // xsna.rpj0, xsna.q76, xsna.hx2
    public final void e(VKApiExecutionException vKApiExecutionException) {
        if (this.g.getActivity() != null) {
            super.e(vKApiExecutionException);
            this.e.R(this.f);
        }
    }
}
