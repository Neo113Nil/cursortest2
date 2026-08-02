package ru.ok.android.webrtc.hash;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class HashAlgorithm {
    public static final HashAlgorithm MD5;
    public static final HashAlgorithm SHA1;
    public static final HashAlgorithm SHA256;
    public static final /* synthetic */ HashAlgorithm[] b;
    public static final /* synthetic */ zrp c;
    public final String a;

    static {
        HashAlgorithm hashAlgorithm = new HashAlgorithm(SameMD5.TAG, 0, SameMD5.TAG);
        MD5 = hashAlgorithm;
        HashAlgorithm hashAlgorithm2 = new HashAlgorithm("SHA1", 1, AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        SHA1 = hashAlgorithm2;
        HashAlgorithm hashAlgorithm3 = new HashAlgorithm("SHA256", 2, "SHA-256");
        SHA256 = hashAlgorithm3;
        HashAlgorithm[] hashAlgorithmArr = {hashAlgorithm, hashAlgorithm2, hashAlgorithm3};
        b = hashAlgorithmArr;
        c = new asp(hashAlgorithmArr);
    }

    public HashAlgorithm(String str, int i, String str2) {
        this.a = str2;
    }

    public static zrp<HashAlgorithm> getEntries() {
        return c;
    }

    public static HashAlgorithm valueOf(String str) {
        return (HashAlgorithm) Enum.valueOf(HashAlgorithm.class, str);
    }

    public static HashAlgorithm[] values() {
        return (HashAlgorithm[]) b.clone();
    }

    public final String getStringValue() {
        return this.a;
    }
}
