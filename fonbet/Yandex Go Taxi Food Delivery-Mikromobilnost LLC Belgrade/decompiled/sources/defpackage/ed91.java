package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public final class ed91 {
    public static final AtomicBoolean a;

    static {
        Uri.parse("content://com.google.android.gsf.gservices");
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        Pattern.compile("^(0|false|f|off|no|n)$", 2);
        a = new AtomicBoolean();
        new HashMap(16, 1.0f);
        new HashMap(16, 1.0f);
        new HashMap(16, 1.0f);
        new HashMap(16, 1.0f);
    }
}
