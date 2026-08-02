package ru.mail.libverify.e;

import androidx.annotation.Nullable;
import ru.mail.verify.core.utils.Gsonable;

/* loaded from: classes9.dex */
public final class e implements Gsonable {

    @Nullable
    String api_key;

    @Nullable
    String nonce;

    @Nullable
    public final String a() {
        return this.api_key;
    }

    @Nullable
    public final String b() {
        return this.nonce;
    }
}
