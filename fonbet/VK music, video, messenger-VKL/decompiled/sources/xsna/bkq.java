package xsna;

import java.util.Random;

/* compiled from: PlatformRandom.kt */
/* loaded from: classes11.dex */
public final class bkq extends gg {
    public final a d = new a();

    /* compiled from: PlatformRandom.kt */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // xsna.gg
    public final Random p() {
        return this.d.get();
    }
}
