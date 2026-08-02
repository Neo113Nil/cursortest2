package xsna;

import android.content.Context;

/* compiled from: HeadphonesController.kt */
/* loaded from: classes.dex */
public final class syu {
    public static final a d = new a();
    public final xal a;
    public final yyu b;
    public final tyu c = new tyu(this);

    /* compiled from: HeadphonesController.kt */
    public static final class a implements bgk0 {
        public final String toString() {
            return "HEADPHONES_DISCONNECTED_UPDATE";
        }
    }

    public syu(Context context, xal xalVar) {
        this.a = xalVar;
        this.b = new yyu(context);
    }
}
