package defpackage;

import android.content.Context;
import com.yandex.go.lootbox.api.domain.entities.lootbox.animation_type.LootBoxAnimationType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class bpz {
    public final File a;

    public bpz(Context context) {
        this.a = new File(context.getFilesDir(), "lootbox_animations");
    }

    public static void c(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } finally {
        }
    }

    public File a(String str, LootBoxAnimationType lootBoxAnimationType) {
        File b = b(str, lootBoxAnimationType);
        if (b.exists()) {
            return b;
        }
        return new File(this.a, unr0.o(str, "_", lootBoxAnimationType.getCacheKey().toLowerCase(Locale.ROOT), ".json"));
    }

    public File b(String str, LootBoxAnimationType lootBoxAnimationType) {
        return new File(this.a, unr0.o(str, "_", lootBoxAnimationType.getCacheKey(), ".json"));
    }

    public void d(String str, LootBoxAnimationType lootBoxAnimationType, InputStream inputStream) {
        File file = this.a;
        try {
            try {
                if (!file.exists()) {
                    file.mkdirs();
                }
                File b = b(str, lootBoxAnimationType);
                if (!b.exists()) {
                    b.createNewFile();
                }
                c(inputStream, b);
                inputStream.close();
            } catch (Exception e) {
                jst.e.j(e);
                inputStream.close();
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public bpz(File file) {
        this.a = file;
    }
}
