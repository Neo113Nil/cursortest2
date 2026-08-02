package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;

/* compiled from: CustomVirtualBackgroundRepository.kt */
/* loaded from: classes7.dex */
public final class gpk {
    public final UserId a;
    public final bpn0 b;

    public gpk(Context context, UserId userId) {
        this.a = userId;
        this.b = new bpn0(new lb6(7, context, this));
    }

    public final boolean a() {
        if (fkq0.c(this.a)) {
            return BuildInfo.s() || BuildInfo.t() || BuildInfo.g();
        }
        return false;
    }
}
