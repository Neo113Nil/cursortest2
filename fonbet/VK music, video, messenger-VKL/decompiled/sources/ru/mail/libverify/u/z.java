package ru.mail.libverify.u;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.mail.libverify.platform.storage.KeyValueStorage;

/* loaded from: classes9.dex */
public final class z {
    private KeyValueStorage a;

    public z(@NonNull w wVar) {
        try {
            this.a = wVar.c();
        } catch (Exception e) {
            Log.e("PushTokenStorage", "key value storage obtain error", e);
        }
    }

    public final void a(@NonNull String str) {
        KeyValueStorage keyValueStorage = this.a;
        if (keyValueStorage != null) {
            keyValueStorage.putValue("push_token_id_storage", str).commit();
        }
    }

    @Nullable
    public final String b() {
        KeyValueStorage keyValueStorage = this.a;
        if (keyValueStorage != null) {
            return keyValueStorage.getValue("push_token_id_storage");
        }
        return null;
    }

    public final void a() {
        KeyValueStorage keyValueStorage = this.a;
        if (keyValueStorage != null) {
            keyValueStorage.removeValue("push_token_id_storage").commit();
        }
    }
}
