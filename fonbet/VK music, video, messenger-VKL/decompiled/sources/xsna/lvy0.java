package xsna;

import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;

/* loaded from: classes9.dex */
public final class lvy0 {
    public static final Logger a;

    static {
        Logger defaultLogger;
        aaz0 aaz0Var = s101.f;
        if (aaz0Var == null || (defaultLogger = aaz0Var.c) == null) {
            defaultLogger = new DefaultLogger("VkpnsClientSdk");
        }
        a = defaultLogger;
    }
}
