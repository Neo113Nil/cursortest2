package defpackage;

import android.app.Activity;
import android.content.res.Resources;

/* loaded from: classes15.dex */
public final class dk51 {
    public final Resources a;
    public final float b = 1024.0f;
    public final float c = 1048576.0f;
    public final float d = 1.0737418E9f;
    public final float e = 1.0995116E12f;

    public dk51(Activity activity) {
        this.a = activity.getResources();
    }

    public final String a(long j) {
        float f = j;
        float f2 = this.e;
        float f3 = this.c;
        float f4 = this.d;
        float f5 = f > f2 ? f / f2 : f > f4 ? f / f4 : f > f3 ? f / f3 : f / this.b;
        float b = m810.b(f5 * r3) / ((float) Math.pow(10.0d, 2.0d));
        Resources resources = this.a;
        return b + " " + (f > f2 ? resources.getString(oyh0.tb) : f > f4 ? resources.getString(oyh0.gb) : f > f3 ? resources.getString(oyh0.mb) : resources.getString(oyh0.kb));
    }
}
