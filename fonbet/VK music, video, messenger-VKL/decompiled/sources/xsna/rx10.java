package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* compiled from: MediaRouterParams.java */
/* loaded from: classes12.dex */
public final class rx10 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Bundle e;

    /* compiled from: MediaRouterParams.java */
    public static final class a {
        public boolean a;
        public boolean b;
        public boolean c;
        public boolean d;
        public Bundle e;
    }

    public rx10(@NonNull a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        Bundle bundle = aVar.e;
        this.e = bundle == null ? Bundle.EMPTY : new Bundle(bundle);
    }
}
