package ru.mail.libverify.requests;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Collections;
import java.util.List;
import ru.mail.libverify.requests.j;
import ru.mail.verify.core.utils.Gsonable;

/* loaded from: classes9.dex */
class k implements Gsonable, ru.mail.libverify.j0.l {

    @NonNull
    final j.b confirmAction;

    @NonNull
    final j.c deliveryMethod;

    @Nullable
    final String pushApplicationId;

    @NonNull
    final String pushSessionId;

    @Nullable
    final String routeType;

    @NonNull
    final List<j.d> statusData;
    final long statusTimestamp;

    public k(@NonNull List<j.d> list, @NonNull String str, @Nullable String str2, long j, @NonNull j.c cVar, @NonNull j.b bVar, @Nullable String str3) {
        this.pushSessionId = str;
        this.statusData = list;
        this.pushApplicationId = str2;
        this.statusTimestamp = j;
        this.deliveryMethod = cVar;
        this.confirmAction = bVar;
        this.routeType = str3;
    }

    @Override // ru.mail.libverify.j0.l
    @NonNull
    public final String getId() {
        return "push_status_" + this.pushSessionId + BundleUtil.UNDERLINE_TAG + this.statusData + BundleUtil.UNDERLINE_TAG + this.pushApplicationId + BundleUtil.UNDERLINE_TAG + this.deliveryMethod + BundleUtil.UNDERLINE_TAG + this.confirmAction;
    }

    private k() {
        this.pushSessionId = "";
        this.statusData = Collections.EMPTY_LIST;
        this.pushApplicationId = null;
        this.statusTimestamp = 0L;
        this.deliveryMethod = j.c.UNKNOWN;
        this.confirmAction = j.b.SMS_CODE;
        this.routeType = null;
    }
}
