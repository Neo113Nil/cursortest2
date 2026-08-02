package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vk.core.files.PrivateFiles;

/* compiled from: FileComponent.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class e8r {
    public static final PrivateFiles a;
    public static final d8r b;

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        PrivateFiles privateFiles = new PrivateFiles(new zfd0(context));
        a = privateFiles;
        b = new d8r(privateFiles);
    }
}
