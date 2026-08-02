package defpackage;

import android.util.Range;
import android.util.Size;

/* loaded from: classes10.dex */
public abstract class lru0 {
    public static final Range a = new Range(0, 0);

    public static j4n a(Size size) {
        j4n j4nVar = new j4n();
        if (size == null) {
            ny61.t("Null resolution");
            return null;
        }
        j4nVar.a = size;
        j4nVar.b = size;
        j4nVar.x = 0;
        Range range = a;
        if (range == null) {
            ny61.t("Null expectedFrameRateRange");
            return null;
        }
        j4nVar.y = range;
        j4nVar.c = q8n.d;
        j4nVar.w = Boolean.FALSE;
        return j4nVar;
    }

    public abstract q8n b();

    public abstract Range c();

    public abstract szd d();

    public abstract Size e();

    public abstract Size f();

    public abstract int g();

    public abstract boolean h();

    public abstract j4n i();
}
