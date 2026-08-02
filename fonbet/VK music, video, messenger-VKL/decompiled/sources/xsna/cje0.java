package xsna;

import android.util.Log;
import com.vk.push.common.Logger;

/* compiled from: PushLogger.kt */
/* loaded from: classes5.dex */
public final class cje0 implements k100 {
    public final String a;

    public cje0(String str) {
        this.a = str;
    }

    @Override // com.vk.push.common.Logger
    public final Logger createLogger(Object obj) {
        return Logger.DefaultImpls.createLogger(this, obj);
    }

    @Override // com.vk.push.common.Logger
    public final void error(String str, Throwable th) {
        Log.e(this.a, str, th);
    }

    @Override // com.vk.push.common.Logger
    public final Logger createLogger(String str) {
        String str2 = this.a;
        if (str2 != null) {
            str = v1v.a(':', str2, str);
        }
        return new cje0(str);
    }

    @Override // com.vk.push.common.Logger
    public final void debug(String str, Throwable th) {
    }

    @Override // com.vk.push.common.Logger
    public final void info(String str, Throwable th) {
    }

    @Override // com.vk.push.common.Logger
    public final void verbose(String str, Throwable th) {
    }

    @Override // com.vk.push.common.Logger
    public final void warn(String str, Throwable th) {
    }
}
