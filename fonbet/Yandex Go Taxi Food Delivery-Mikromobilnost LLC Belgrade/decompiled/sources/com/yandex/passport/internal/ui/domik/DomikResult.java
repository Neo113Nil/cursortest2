package com.yandex.passport.internal.ui.domik;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.ClientToken;
import java.util.EnumSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/DomikResult;", "Landroid/os/Parcelable;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Lcom/yandex/passport/internal/ModernAccount;", "getModernAccount", "()Lcom/yandex/passport/internal/ModernAccount;", "modernAccount", "Lcom/yandex/passport/internal/entities/ClientToken;", "getClientToken", "()Lcom/yandex/passport/internal/entities/ClientToken;", "clientToken", "Lcom/yandex/passport/api/PassportLoginAction;", "getLoginAction", "()Lcom/yandex/passport/api/PassportLoginAction;", "loginAction", "Lcom/yandex/passport/internal/ui/c;", "getAdditionalActionResponse-CR7-YV8", "()Ljava/lang/String;", "additionalActionResponse", "Ljava/util/EnumSet;", "Lcom/yandex/passport/internal/ui/domik/FinishRegistrationActivities;", "getSkipFinishRegistrationActivities", "()Ljava/util/EnumSet;", "skipFinishRegistrationActivities", "Companion", "com/yandex/passport/internal/ui/domik/o", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DomikResult extends Parcelable {
    public static final o Companion = o.a;

    /* renamed from: getAdditionalActionResponse-CR7-YV8 */
    String mo317getAdditionalActionResponseCR7YV8();

    ClientToken getClientToken();

    PassportLoginAction getLoginAction();

    ModernAccount getModernAccount();

    EnumSet<FinishRegistrationActivities> getSkipFinishRegistrationActivities();

    Bundle toBundle();
}
