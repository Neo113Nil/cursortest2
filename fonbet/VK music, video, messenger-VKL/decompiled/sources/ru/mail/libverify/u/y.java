package ru.mail.libverify.u;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.mail.libverify.platform.storage.KeyValueStorage;

/* loaded from: classes9.dex */
public final class y {
    private KeyValueStorage a;

    public y(@NonNull ru.mail.libverify.c.b bVar) {
        try {
            this.a = bVar.c();
        } catch (Exception e) {
            Log.e("PushTokenStorage", "key value storage obtain error", e);
        }
    }

    public final void a(@NonNull String str) {
        KeyValueStorage keyValueStorage = this.a;
        if (keyValueStorage != null) {
            keyValueStorage.putValue("jws_id_storage", str).commit();
        }
    }

    @Nullable
    public final String b() {
        KeyValueStorage keyValueStorage = this.a;
        if (keyValueStorage != null) {
            return keyValueStorage.getValue("jws_id_storage");
        }
        return null;
    }

    public final void a() {
        KeyValueStorage keyValueStorage = this.a;
        if (keyValueStorage != null) {
            keyValueStorage.removeValue("jws_id_storage").commit();
        }
    }
}
