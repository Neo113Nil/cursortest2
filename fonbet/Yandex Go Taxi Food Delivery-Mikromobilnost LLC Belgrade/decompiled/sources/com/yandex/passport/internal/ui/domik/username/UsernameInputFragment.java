package com.yandex.passport.internal.ui.domik.username;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Screen;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.domik.RegTrack;
import com.yandex.passport.internal.ui.domik.common.BaseUsernameInputFragment;
import defpackage.ds31;
import defpackage.ny61;
import defpackage.tje;
import defpackage.vng;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/yandex/passport/internal/ui/domik/username/UsernameInputFragment;", "Lcom/yandex/passport/internal/ui/domik/common/BaseUsernameInputFragment;", "Lcom/yandex/passport/internal/ui/domik/username/b;", "Lcom/yandex/passport/internal/ui/domik/RegTrack;", "<init>", "()V", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "component", "createViewModel", "(Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;)Lcom/yandex/passport/internal/ui/domik/username/b;", "Lcom/yandex/passport/internal/analytics/DomikStatefulReporter$Screen;", "getScreenId", "()Lcom/yandex/passport/internal/analytics/DomikStatefulReporter$Screen;", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "firstName", "lastName", "upgradePhonish", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/yandex/passport/internal/ModernAccount;", "modernAccount", "Lcom/yandex/passport/internal/ModernAccount;", "Companion", "com/yandex/passport/internal/ui/domik/username/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UsernameInputFragment extends BaseUsernameInputFragment<b, RegTrack> {
    public static final int $stable = 8;
    private static final String ACCOUNT_KEY = "master_account_key";
    public static final a Companion = new a();
    private static final String FRAGMENT_TAG = "com.yandex.passport.internal.ui.domik.username.UsernameInputFragment";
    private ModernAccount modernAccount;

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public b createViewModel(PassportProcessGlobalComponent component) {
        return getDomikComponent().newUsernameInputViewModel();
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public DomikStatefulReporter$Screen getScreenId() {
        return DomikStatefulReporter$Screen.PERSONAL_INFO_ENTRY;
    }

    @Override // com.yandex.passport.internal.ui.domik.common.BaseUsernameInputFragment, com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.statefulReporter = com.yandex.passport.internal.di.a.a().getStatefulReporter();
    }

    @Override // com.yandex.passport.internal.ui.domik.common.BaseUsernameInputFragment, com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = (TextView) view.findViewById(R.id.text_message);
        RegTrack.RegOrigin regOrigin = ((RegTrack) this.currentTrack).getRegOrigin();
        regOrigin.getClass();
        if (regOrigin == RegTrack.RegOrigin.REGISTRATION || regOrigin == RegTrack.RegOrigin.REGISTRATION_ACCOUNT_NOT_FOUND) {
            String usernameMessage = ((RegTrack) this.currentTrack).getProperties().getVisualProperties().getUsernameMessage();
            int i = R.string.passport_fio_text;
            if (TextUtils.isEmpty(usernameMessage)) {
                textView.setText(i);
            } else {
                textView.setText(usernameMessage);
            }
        } else {
            textView.setText(R.string.passport_fio_auth_text);
        }
        if (((RegTrack) this.currentTrack).getProperties().getTurboAuthParams() != null) {
            getEditFirstName().setText(((RegTrack) this.currentTrack).getProperties().getTurboAuthParams().getFirstName());
            getEditLastName().setText(((RegTrack) this.currentTrack).getProperties().getTurboAuthParams().getLastName());
            validate();
        } else {
            if (textView != null) {
                textView.performAccessibilityAction(64, null);
            }
            if (textView != null) {
                textView.sendAccessibilityEvent(32768);
            }
        }
        Bundle arguments = getArguments();
        Bundle bundle = arguments != null ? arguments.getBundle(ACCOUNT_KEY) : null;
        if (bundle == null) {
            ((b) this.viewModel).b.m(new EventError("account.not_found", null, 2, null));
            return;
        }
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vng.u(bundle, ModernAccount.class, "master-account") : bundle.getParcelable("master-account");
        if (parcelable != null) {
            this.modernAccount = (ModernAccount) parcelable;
        } else {
            ny61.r("can't get required parcelable master-account");
        }
    }

    @Override // com.yandex.passport.internal.ui.domik.common.BaseUsernameInputFragment
    public void upgradePhonish(String firstName, String lastName) {
        b bVar = (b) this.viewModel;
        ModernAccount modernAccount = this.modernAccount;
        ModernAccount modernAccount2 = modernAccount == null ? null : modernAccount;
        String trackId = ((RegTrack) this.currentTrack).getTrackId();
        bVar.getClass();
        tje.N(ds31.a(bVar), null, null, new UsernameInputViewModel$upgradePhonish$1(trackId, bVar, modernAccount2, firstName, lastName, null), 3);
    }
}
