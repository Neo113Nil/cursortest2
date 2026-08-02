package xsna;

import android.content.Context;

/* compiled from: ContentSnapStrategy.kt */
/* loaded from: classes17.dex */
public final class nzl extends com.vk.core.ui.bottomsheet.internal.b {
    public final Context a;
    public final a b;

    /* compiled from: ContentSnapStrategy.kt */
    public static final class a {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        public final float a(Context context) {
            if (iah0.s(context)) {
                return this.a;
            }
            return 1.0f;
        }
    }

    public nzl(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        return (int) ((1.0f - this.b.a(this.a)) * i2);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        return (int) (this.b.a(this.a) * i2);
    }
}
