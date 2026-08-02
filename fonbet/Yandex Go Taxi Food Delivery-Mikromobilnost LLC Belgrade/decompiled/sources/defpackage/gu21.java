package defpackage;

import android.content.res.Resources;
import com.yandex.messaging.domain.statuses.StatusAvailability;

/* loaded from: classes15.dex */
public abstract class gu21 {
    public final StatusAvailability a;
    public final boolean b;
    public final int c;

    public gu21(StatusAvailability statusAvailability, boolean z) {
        this.a = statusAvailability;
        this.b = z;
        StatusAvailability.Companion companion = StatusAvailability.INSTANCE;
        this.c = jzz.e(statusAvailability, false);
        jzz.e(statusAvailability, true);
    }

    public boolean a() {
        return this.b;
    }

    public abstract String b(Resources resources);
}
