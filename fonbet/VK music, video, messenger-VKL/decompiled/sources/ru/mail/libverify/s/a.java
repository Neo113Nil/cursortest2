package ru.mail.libverify.s;

import android.util.AtomicFile;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import ru.mail.libverify.p.a;
import ru.mail.libverify.p.b;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public final class a {

    @NonNull
    private final File a;

    @NonNull
    private final b b;

    /* renamed from: ru.mail.libverify.s.a$a, reason: collision with other inner class name */
    public static final class C2215a implements Serializable {

        @Nullable
        final Integer a;

        @Nullable
        final String b;

        @NonNull
        final Map<String, Object> c;

        @Nullable
        final Map<String, String> d;

        public C2215a(@NonNull ru.mail.libverify.p.a aVar) {
            this.a = aVar.e();
            this.b = aVar.c();
            this.c = aVar.a();
            this.d = aVar.d();
        }
    }

    public a(@NonNull File file, @NonNull b bVar) {
        this.a = file;
        this.b = bVar;
    }

    @Nullable
    public final synchronized ru.mail.libverify.p.a a(@NonNull String str) {
        File b = b(str);
        if (!b.exists()) {
            return null;
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(b));
            try {
                C2215a c2215a = (C2215a) objectInputStream.readObject();
                a.C2212a a = ru.mail.libverify.p.a.f().a(c2215a.a).a(c2215a.b).a(c2215a.d);
                for (Map.Entry<String, Object> entry : c2215a.c.entrySet()) {
                    a.a(entry.getKey(), entry.getValue());
                }
                ru.mail.libverify.p.a a2 = a.a();
                objectInputStream.close();
                return a2;
            } catch (Throwable th) {
                try {
                    objectInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (ClassCastException e) {
            e = e;
            a();
            this.b.getClass();
            FileLog.d("Omicron", "onGetDataError " + e + ", Data is cleared");
            return null;
        } catch (IllegalArgumentException e2) {
            e = e2;
            a();
            this.b.getClass();
            FileLog.d("Omicron", "onGetDataError " + e + ", Data is cleared");
            return null;
        } catch (Exception e3) {
            this.b.getClass();
            FileLog.d("Omicron", "onGetDataError " + e3 + ", Data is not cleared");
            return null;
        } catch (OutOfMemoryError e4) {
            e = e4;
            a();
            this.b.getClass();
            FileLog.d("Omicron", "onGetDataError " + e + ", Data is cleared");
            return null;
        }
    }

    @NonNull
    public final synchronized File b(@NonNull String str) {
        return new File(this.a, Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 3));
    }

    public final synchronized void a(@NonNull String str, @NonNull ru.mail.libverify.p.a aVar) {
        FileOutputStream fileOutputStream;
        C2215a c2215a = new C2215a(aVar);
        AtomicFile atomicFile = new AtomicFile(b(str));
        try {
            fileOutputStream = atomicFile.startWrite();
        } catch (IOException unused) {
            fileOutputStream = null;
        }
        if (fileOutputStream != null) {
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                try {
                    objectOutputStream.writeObject(c2215a);
                    atomicFile.finishWrite(fileOutputStream);
                    objectOutputStream.close();
                } catch (Throwable th) {
                    try {
                        objectOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                atomicFile.failWrite(fileOutputStream);
            }
        }
    }

    public final synchronized void a() {
        File[] listFiles = this.a.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file != null) {
                    file.delete();
                }
            }
        }
    }
}
