package com.yandex.payment.sdk.core.impl.bind;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/payment/sdk/core/impl/bind/DefaultCardDataCipher$CipherInfo", "", "Lcom/yandex/payment/sdk/core/impl/bind/DefaultCardDataCipher$CipherInfo;", "", "algorithm", "Ljava/lang/String;", "getAlgorithm", "()Ljava/lang/String;", "hashAlgorithm", "a", "RSA_SHA512", "RSA_SHA256", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DefaultCardDataCipher$CipherInfo {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DefaultCardDataCipher$CipherInfo[] $VALUES;
    public static final DefaultCardDataCipher$CipherInfo RSA_SHA256;
    public static final DefaultCardDataCipher$CipherInfo RSA_SHA512;
    private final String algorithm;
    private final String hashAlgorithm;

    static {
        DefaultCardDataCipher$CipherInfo defaultCardDataCipher$CipherInfo = new DefaultCardDataCipher$CipherInfo("RSA_SHA512", 0, "RSA/NONE/OAEPwithSHA-512andMGF1Padding", JCP.DIGEST_SHA512);
        RSA_SHA512 = defaultCardDataCipher$CipherInfo;
        DefaultCardDataCipher$CipherInfo defaultCardDataCipher$CipherInfo2 = new DefaultCardDataCipher$CipherInfo("RSA_SHA256", 1, "RSA/NONE/OAEPwithSHA-256andMGF1Padding", JCP.DIGEST_SHA256);
        RSA_SHA256 = defaultCardDataCipher$CipherInfo2;
        DefaultCardDataCipher$CipherInfo[] defaultCardDataCipher$CipherInfoArr = {defaultCardDataCipher$CipherInfo, defaultCardDataCipher$CipherInfo2};
        $VALUES = defaultCardDataCipher$CipherInfoArr;
        $ENTRIES = kotlin.enums.a.a(defaultCardDataCipher$CipherInfoArr);
    }

    public DefaultCardDataCipher$CipherInfo(String str, int i, String str2, String str3) {
        this.algorithm = str2;
        this.hashAlgorithm = str3;
    }

    public static DefaultCardDataCipher$CipherInfo valueOf(String str) {
        return (DefaultCardDataCipher$CipherInfo) Enum.valueOf(DefaultCardDataCipher$CipherInfo.class, str);
    }

    public static DefaultCardDataCipher$CipherInfo[] values() {
        return (DefaultCardDataCipher$CipherInfo[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }
}
