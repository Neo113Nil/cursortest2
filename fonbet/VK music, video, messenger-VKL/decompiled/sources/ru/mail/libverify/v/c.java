package ru.mail.libverify.v;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import xsna.z9r;

/* loaded from: classes9.dex */
final class c {
    static final Charset a = StandardCharsets.US_ASCII;

    static {
        Charset charset = StandardCharsets.UTF_8;
    }

    public static void a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException(z9r.a(file, "not a readable directory: "));
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new IOException(z9r.a(file2, "failed to delete file: "));
            }
        }
    }
}
