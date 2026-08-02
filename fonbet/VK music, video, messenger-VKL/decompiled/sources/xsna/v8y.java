package xsna;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: JsonDataEncoderBuilder.java */
/* loaded from: classes.dex */
public final class v8y implements cjp<v8y> {
    public static final r8y e = new r8y();
    public static final s8y f = new s8y();
    public static final t8y g = new t8y();
    public static final a h = new a();
    public final HashMap a;
    public final HashMap b;
    public final r8y c;
    public boolean d;

    /* compiled from: JsonDataEncoderBuilder.java */
    public static final class a implements tjr0<Date> {
        public static final SimpleDateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // xsna.wip
        public final void encode(@NonNull Object obj, @NonNull ujr0 ujr0Var) throws IOException {
            ujr0Var.add(a.format((Date) obj));
        }
    }

    public v8y() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    @Override // xsna.cjp
    @NonNull
    public final v8y registerEncoder(@NonNull Class cls, @NonNull mp70 mp70Var) {
        this.a.put(cls, mp70Var);
        this.b.remove(cls);
        return this;
    }
}
