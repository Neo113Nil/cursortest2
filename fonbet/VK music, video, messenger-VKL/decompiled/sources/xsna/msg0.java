package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* compiled from: RustoreSeamlessInstallContract.kt */
/* loaded from: classes15.dex */
public final class msg0 extends va0<String, Boolean> {
    @Override // xsna.va0
    public final Intent a(Context context, String str) {
        return new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://adv.rustore.ru/app/ru.oneme.app?token=".concat(str)));
    }

    @Override // xsna.va0
    public final Boolean c(int i, Intent intent) {
        return Boolean.valueOf(i == -1);
    }
}
