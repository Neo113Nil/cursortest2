package com.yandex.passport.internal.ui.domik.sms;

import com.yandex.passport.internal.analytics.DomikStatefulReporter$Screen;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.domik.RegTrack;
import com.yandex.passport.internal.ui.domik.common.BaseSmsFragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/sms/SmsFragment;", "Lcom/yandex/passport/internal/ui/domik/common/BaseSmsFragment;", "Lcom/yandex/passport/internal/ui/domik/sms/b;", "Lcom/yandex/passport/internal/ui/domik/RegTrack;", "<init>", "()V", "Lcom/yandex/passport/internal/analytics/DomikStatefulReporter$Screen;", "getScreenId", "()Lcom/yandex/passport/internal/analytics/DomikStatefulReporter$Screen;", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "component", "createViewModel", "(Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;)Lcom/yandex/passport/internal/ui/domik/sms/b;", "Companion", "com/yandex/passport/internal/ui/domik/sms/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmsFragment extends BaseSmsFragment<b, RegTrack> {
    public static final int $stable = 0;
    public static final a Companion = new a();
    private static final String FRAGMENT_TAG = "com.yandex.passport.internal.ui.domik.sms.SmsFragment";

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public b createViewModel(PassportProcessGlobalComponent component) {
        return getDomikComponent().newSmsViewModel();
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public DomikStatefulReporter$Screen getScreenId() {
        return DomikStatefulReporter$Screen.SMS_CODE_ENTRY;
    }
}
