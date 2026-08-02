package org.chromium.base;

/* loaded from: classes8.dex */
public class ImportantFileWriterAndroid {

    public interface Natives {
        boolean writeFileAtomically(String str, byte[] bArr);
    }

    public static boolean writeFileAtomically(String str, byte[] bArr) {
        return ImportantFileWriterAndroidJni.get().writeFileAtomically(str, bArr);
    }
}
