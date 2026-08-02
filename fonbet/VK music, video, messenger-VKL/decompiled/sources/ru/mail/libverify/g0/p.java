package ru.mail.libverify.g0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import ru.mail.libverify.platform.storage.KeyValueStorage;
import xsna.zr;

/* loaded from: classes9.dex */
public abstract class p {

    @NonNull
    protected final KeyValueStorage a;

    public p(@NonNull KeyValueStorage keyValueStorage) {
        this.a = keyValueStorage;
    }

    @NonNull
    public abstract HashMap a();

    public abstract void a(@NonNull String str, boolean z);

    public final boolean a(@NonNull String str) {
        Boolean bool = (Boolean) a().get(str);
        if (bool == null) {
            throw new IllegalArgumentException(zr.a("Feature ", str, " is not defined"));
        }
        Integer integerValue = this.a.getIntegerValue(str, null);
        return integerValue == null ? bool.booleanValue() : integerValue.intValue() == 1;
    }

    public final void a(@NonNull String str, @Nullable Boolean bool) {
        if (bool == null) {
            return;
        }
        this.a.putValue(str, bool.booleanValue() ? 1 : 0);
        a(str, bool.booleanValue());
    }
}
