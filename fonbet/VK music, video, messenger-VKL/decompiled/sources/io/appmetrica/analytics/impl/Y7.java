package io.appmetrica.analytics.impl;

import com.mbridge.msdk.foundation.tools.SameMD5;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;
import xsna.brm0;
import xsna.emb;

/* loaded from: classes8.dex */
public final class Y7 {
    public final U a;
    public final C5002m2 b;

    public Y7(U u, C5002m2 c5002m2) {
        this.a = u;
        this.b = c5002m2;
    }

    public final String a() {
        AdvertisingIdsHolder advertisingIdsHolder;
        byte[] bArr;
        U u = this.a;
        Tn tn = new Tn(5, 500);
        synchronized (u) {
            try {
                u.a((Qi) tn, true).get();
            } catch (InterruptedException | ExecutionException unused) {
            }
            advertisingIdsHolder = u.k;
        }
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        if (yandex.isValid()) {
            try {
                bArr = MessageDigest.getInstance(SameMD5.TAG).digest(yandex.mAdTrackingInfo.advId.getBytes(emb.b));
            } catch (NoSuchAlgorithmException unused2) {
                bArr = new byte[0];
            }
            return StringUtils.toHexString(bArr);
        }
        String id = this.b.getAppSetId().getId();
        if (id != null && id.length() != 0) {
            try {
                UUID.fromString(id);
                if (!id.equals(DeviceIdUtils.NULL_UUID)) {
                    return brm0.y(id, "-", "");
                }
            } catch (Throwable unused3) {
            }
        }
        return brm0.y(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
    }

    public Y7() {
        this(C5342za.k().c(), C5342za.k().d());
    }
}
