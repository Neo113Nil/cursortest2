package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-measurement-connector@@20.0.1 */
/* loaded from: classes.dex */
public interface ex1 {

    /* compiled from: com.google.firebase:firebase-measurement-connector@@20.0.1 */
    /* loaded from: classes13.dex */
    public static class a {

        @NonNull
        public String a;

        @NonNull
        public String b;

        @Nullable
        public Object c;

        @Nullable
        public String d;
        public long e;

        @Nullable
        public String f;

        @Nullable
        public Bundle g;

        @Nullable
        public String h;

        @Nullable
        public Bundle i;
        public long j;

        @Nullable
        public String k;

        @Nullable
        public Bundle l;
        public long m;
        public boolean n;
        public long o;
    }

    @NonNull
    ArrayList a();

    void b(@NonNull String str);

    @NonNull
    Map<String, Object> c(boolean z);

    void d(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle);

    @Nullable
    lyd e(@NonNull String str, @NonNull j4k j4kVar);

    void f(@NonNull String str);

    void g(@NonNull a aVar);

    int h();
}
