package xsna;

import androidx.annotation.NonNull;
import java.util.ArrayList;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class nlk0 {
    public final ArrayList a;
    public final ArrayList b;

    /* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
    public static class a {
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();

        public final void a(String str) {
            this.a.add(str);
        }

        @NonNull
        public final nlk0 b() {
            return new nlk0(this);
        }
    }

    public /* synthetic */ nlk0(a aVar) {
        this.a = new ArrayList(aVar.a);
        this.b = new ArrayList(aVar.b);
    }

    @NonNull
    public static a c() {
        return new a();
    }

    public final ArrayList a() {
        return this.b;
    }

    public final ArrayList b() {
        return this.a;
    }

    public final String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.a, this.b);
    }
}
