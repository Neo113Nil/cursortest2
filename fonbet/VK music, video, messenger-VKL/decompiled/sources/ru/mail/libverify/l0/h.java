package ru.mail.libverify.l0;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import ru.mail.libverify.platform.storage.KeyValueStorage;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.json.JsonParseException;

/* loaded from: classes9.dex */
public abstract class h implements KeyValueStorage {

    @NonNull
    private final File a;

    @Nullable
    private volatile ConcurrentHashMap<String, String> c;

    @NonNull
    private final ConcurrentHashMap<String, Object> b = new ConcurrentHashMap<>();
    private boolean d = false;

    public h(@NonNull Context context) {
        this.a = new File(ru.mail.libverify.n0.e.c(context), "VERIFY_SETTINGS");
    }

    private void a() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    if (this.a.exists()) {
                        try {
                            b();
                            if (this.c == null) {
                                this.c = new ConcurrentHashMap<>();
                            }
                        } catch (IOException e) {
                            e = e;
                            FileLog.e("SecureSettings", "Failed to read settings file", e);
                            this.c = new ConcurrentHashMap<>();
                        } catch (JsonParseException e2) {
                            e = e2;
                            FileLog.e("SecureSettings", "Failed to read settings file", e);
                            this.c = new ConcurrentHashMap<>();
                        } catch (Exception e3) {
                            ru.mail.libverify.n0.b.a("SecureSettings", "Failed to read settings file", e3);
                            this.c = new ConcurrentHashMap<>();
                        }
                    } else {
                        this.c = new ConcurrentHashMap<>();
                    }
                }
            }
        }
    }

    private void b() throws IOException {
        FileLog.v("SecureSettings", "initialize file read");
        String a = ru.mail.libverify.n0.e.a(this.a);
        if (TextUtils.isEmpty(a)) {
            return;
        }
        this.c = new ConcurrentHashMap<>(ru.mail.libverify.q0.a.d(a, String.class));
    }

    @Override // ru.mail.libverify.platform.storage.KeyValueStorage
    @NonNull
    public final synchronized KeyValueStorage clear() {
        a();
        this.b.clear();
        this.c.clear();
        this.d = true;
        return this;
    }

    @Override // ru.mail.libverify.platform.storage.KeyValueStorage
    public synchronized void commit() {
        FileLog.v("SecureSettings", "commit (%s)", Boolean.valueOf(this.d));
        if (this.d) {
            try {
                FileLog.v("SecureSettings", "initialize file write");
                long nanoTime = System.nanoTime();
                ru.mail.libverify.n0.e.a(this.a, ru.mail.libverify.q0.a.f(this.c));
                FileLog.v("SecureSettings", "file write competed (%d ms)", Long.valueOf((System.nanoTime() - nanoTime) / 1000000));
            } catch (IOException e) {
                e = e;
                FileLog.e("SecureSettings", "Failed to write settings file", e);
            } catch (JsonParseException e2) {
                e = e2;
                FileLog.e("SecureSettings", "Failed to write settings file", e);
            } catch (Exception e3) {
                ru.mail.libverify.n0.b.a("SecureSettings", "Failed to write settings file", e3);
                this.c = null;
            }
            this.d = false;
        }
    }

    @Override // ru.mail.libverify.platform.storage.KeyValueStorage
    @Nullable
    public final Integer getIntegerValue(@NonNull String str, @Nullable Integer num) {
        Object obj = this.b.get(str);
        if (obj != null) {
            return (Integer) obj;
        }
        a();
        String str2 = this.c.get(str);
        if (str2 != null) {
            try {
                int parseInt = Integer.parseInt(str2);
                this.b.put(str, Integer.valueOf(parseInt));
                return Integer.valueOf(parseInt);
            } catch (NumberFormatException unused) {
            }
        }
        return num;
    }

    @Override // ru.mail.libverify.platform.storage.KeyValueStorage
    @Nullable
    public final Long getLongValue(@NonNull String str, @Nullable Long l) {
        Object obj = this.b.get(str);
        if (obj != null) {
            return (Long) obj;
        }
        a();
        String str2 = this.c.get(str);
        if (str2 != null) {
            try {
                long parseLong = Long.parseLong(str2);
                this.b.put(str, Long.valueOf(parseLong));
                return Long.valueOf(parseLong);
            } catch (NumberFormatException unused) {
            }
        }
        return l;
    }

    @Override // ru.mail.libverify.platform.storage.KeyValueStorage
    @Nullable
    public final String getValue(@NonNull String str) {
        a();
        return this.c.get(str);
    }

    @Override // ru.mail.libverify.platform.storage.KeyValueStorage
    @NonNull
    public final synchronized KeyValueStorage putValue(@NonNull String str, @NonNull String str2) {
        if (str2 == null) {
            try {
                String str3 = "Null value is not allowed[key = " + str + X3.j.e;
                ru.mail.libverify.n0.b.a("SecureSettings", str3, new IllegalArgumentException(str3));
                str2 = "";
            } catch (Throwable th) {
                throw th;
            }
        }
        a();
        this.d = (!TextUtils.equals(str2, this.c.put(str, str2))) | this.d;
        return this;
    }

    @Override // ru.mail.libverify.platform.storage.KeyValueStorage
    @NonNull
    public final synchronized KeyValueStorage removeValue(@NonNull String str) {
        a();
        this.b.remove(str);
        this.d = (this.c.remove(str) != null) | this.d;
        return this;
    }

    @Override // ru.mail.libverify.platform.storage.KeyValueStorage
    @NonNull
    public final synchronized KeyValueStorage putValue(@NonNull String str, long j) {
        this.b.put(str, Long.valueOf(j));
        return putValue(str, Long.toString(j));
    }

    @Override // ru.mail.libverify.platform.storage.KeyValueStorage
    @NonNull
    public final synchronized KeyValueStorage putValue(@NonNull String str, int i) {
        this.b.put(str, Integer.valueOf(i));
        return putValue(str, Integer.toString(i));
    }
}
