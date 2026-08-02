package xsna;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: TopicsStore.java */
/* loaded from: classes.dex */
public final class r9p0 {
    public static WeakReference<r9p0> c;
    public raj0 a;
    public final ScheduledThreadPoolExecutor b;

    public r9p0(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = scheduledThreadPoolExecutor;
    }

    @Nullable
    public final synchronized m9p0 a() {
        String peek;
        m9p0 m9p0Var;
        raj0 raj0Var = this.a;
        synchronized (raj0Var.d) {
            peek = raj0Var.d.peek();
        }
        Pattern pattern = m9p0.d;
        m9p0Var = null;
        if (!TextUtils.isEmpty(peek)) {
            String[] split = peek.split("!", -1);
            if (split.length == 2) {
                m9p0Var = new m9p0(split[0], split[1]);
            }
        }
        return m9p0Var;
    }
}
