package ru.mail.libverify.storage;

import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public class DecryptionError extends Exception {
    public DecryptionError(@Nullable Exception exc) {
        super(exc);
    }

    public DecryptionError() {
        super("No private key found");
    }
}
