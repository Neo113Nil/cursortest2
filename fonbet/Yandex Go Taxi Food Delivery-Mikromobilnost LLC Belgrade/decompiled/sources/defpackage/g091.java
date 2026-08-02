package defpackage;

import android.os.Build;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public abstract class g091 {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? SelfTester_JCP.DECRYPT_CFB : 0;
    }
}
