package xsna;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ClipFeedTooltipDelegate.kt */
/* loaded from: classes17.dex */
public final class czc {
    public final Map<add, Runnable> a = Collections.synchronizedMap(new LinkedHashMap());
    public final AtomicBoolean b = new AtomicBoolean(false);
    public com.vk.core.tips.b c;
    public WeakReference<View> d;
    public owt0 e;

    static {
        TimeUnit.DAYS.toMillis(60L);
    }
}
