package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4715b implements S8 {
    public final AESEncrypter a;

    public C4715b() {
        this(new C4689a(C5342za.k().g()));
    }

    @Override // io.appmetrica.analytics.impl.S8
    @NonNull
    public final L8 a(@NonNull C4722b6 c4722b6) {
        byte[] encrypt;
        String encodeToString;
        String value = c4722b6.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                encrypt = this.a.encrypt(value.getBytes(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
            } catch (Throwable unused) {
            }
            if (encrypt != null) {
                encodeToString = Base64.encodeToString(encrypt, 0);
                c4722b6.setValue(encodeToString);
                return new L8(c4722b6, U8.AES_VALUE_ENCRYPTION);
            }
        }
        encodeToString = null;
        c4722b6.setValue(encodeToString);
        return new L8(c4722b6, U8.AES_VALUE_ENCRYPTION);
    }

    public C4715b(C4689a c4689a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c4689a.b(), c4689a.a()));
    }

    public C4715b(AESEncrypter aESEncrypter) {
        this.a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.S8
    @NonNull
    public final byte[] a(@Nullable byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr != null && bArr.length > 0) {
            try {
                return this.a.decrypt(Base64.decode(bArr, 0));
            } catch (Throwable unused) {
            }
        }
        return bArr2;
    }

    @NonNull
    public final U8 a() {
        return U8.AES_VALUE_ENCRYPTION;
    }
}
