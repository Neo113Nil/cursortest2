package ru.mail.libverify.m;

import androidx.annotation.Nullable;
import ru.mail.verify.core.utils.Gsonable;

/* loaded from: classes9.dex */
public final class l implements Gsonable {

    @Nullable
    String crypted_key;

    @Nullable
    String crypted_message;

    @Nullable
    public final String a() {
        return this.crypted_key;
    }

    @Nullable
    public final String b() {
        return this.crypted_message;
    }
}
