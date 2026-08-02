package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes8.dex */
public final class Um extends AbstractC4739bn {
    @Override // io.appmetrica.analytics.impl.AbstractC4739bn
    public final IBinaryDataHelper a(Context context) {
        return C5342za.I.B().b(context);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4739bn
    public final IBinaryDataHelper b(Context context) {
        IBinaryDataHelper a;
        Ik B = C5342za.I.B();
        synchronized (B) {
            a = B.a(context);
        }
        return a;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4739bn
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        C4950k2 c4950k2 = new C4950k2();
        try {
            bArr = AbstractC5123qj.a(context.getPackageName());
        } catch (Throwable unused) {
            bArr = new byte[16];
        }
        try {
            bArr2 = AbstractC5123qj.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArr2 = new byte[16];
        }
        return new Wf("app_permissions_state", iBinaryDataHelper, new M8(c4950k2, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), new C4847g2(new H2()));
    }
}
