package xsna;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Random;

/* compiled from: ExponentialBackoffSender.java */
/* loaded from: classes13.dex */
public final class maq {
    public static final Random e = new Random();
    public static final k15 f = new k15();
    public static final jcl g = jcl.a;
    public final Context a;

    @Nullable
    public final yfx b;

    @Nullable
    public final wfx c;
    public volatile boolean d;

    public maq(Context context, @Nullable yfx yfxVar, @Nullable wfx wfxVar) {
        this.a = context;
        this.b = yfxVar;
        this.c = wfxVar;
    }
}
