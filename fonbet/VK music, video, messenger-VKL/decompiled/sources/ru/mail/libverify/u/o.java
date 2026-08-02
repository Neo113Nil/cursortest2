package ru.mail.libverify.u;

import android.content.Context;
import android.telephony.TelephonyManager;
import kotlin.jvm.internal.Lambda;
import ru.mail.verify.core.utils.FileLog;
import xsna.gzs;

/* loaded from: classes9.dex */
final class o extends Lambda implements gzs<Object> {
    final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        super(0);
        this.a = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        try {
            return Boolean.valueOf(((TelephonyManager) this.a.getSystemService("phone")).isNetworkRoaming());
        } catch (Throwable unused) {
            FileLog.e("Utils", "failed to detect roaming");
            return null;
        }
    }
}
