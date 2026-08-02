package ru.ok.android.externcalls.sdk.net;

import ru.ok.android.webrtc.hash.HashAlgorithm;
import xsna.epx;

/* compiled from: FileValidationConfig.kt */
/* loaded from: classes9.dex */
public final class FileValidationConfig {
    private final String expectedChecksum;
    private final HashAlgorithm hashAlgorithm;

    public FileValidationConfig(String str, HashAlgorithm hashAlgorithm) {
        this.expectedChecksum = str;
        this.hashAlgorithm = hashAlgorithm;
    }

    public static /* synthetic */ FileValidationConfig copy$default(FileValidationConfig fileValidationConfig, String str, HashAlgorithm hashAlgorithm, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileValidationConfig.expectedChecksum;
        }
        if ((i & 2) != 0) {
            hashAlgorithm = fileValidationConfig.hashAlgorithm;
        }
        return fileValidationConfig.copy(str, hashAlgorithm);
    }

    public final String component1() {
        return this.expectedChecksum;
    }

    public final HashAlgorithm component2() {
        return this.hashAlgorithm;
    }

    public final FileValidationConfig copy(String str, HashAlgorithm hashAlgorithm) {
        return new FileValidationConfig(str, hashAlgorithm);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileValidationConfig)) {
            return false;
        }
        FileValidationConfig fileValidationConfig = (FileValidationConfig) obj;
        return epx.f(this.expectedChecksum, fileValidationConfig.expectedChecksum) && this.hashAlgorithm == fileValidationConfig.hashAlgorithm;
    }

    public final String getExpectedChecksum() {
        return this.expectedChecksum;
    }

    public final HashAlgorithm getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public int hashCode() {
        return this.hashAlgorithm.hashCode() + (this.expectedChecksum.hashCode() * 31);
    }

    public String toString() {
        return "FileValidationConfig(expectedChecksum=" + this.expectedChecksum + ", hashAlgorithm=" + this.hashAlgorithm + ")";
    }
}
