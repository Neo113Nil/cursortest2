package ru.mail.libverify.platform.firebase;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.mail.libverify.platform.core.IInternalFactory;
import ru.mail.libverify.platform.core.ILog;
import ru.mail.libverify.platform.core.IPlatformUtils;
import ru.mail.libverify.platform.core.ISmsRetrieverService;
import ru.mail.libverify.platform.core.JwsService;
import ru.mail.libverify.platform.core.PlatformCoreService;
import ru.mail.libverify.platform.core.ServiceType;
import ru.mail.libverify.platform.core.SmsRetrieverResult;
import ru.mail.libverify.platform.firebase.sms.SmsRetrieverReceiver;
import ru.mail.libverify.platform.storage.KeyValueStorage;
import ru.mail.libverify.platform.utils.StringUtils;
import xsna.drm0;
import xsna.fau;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes11.dex */
public final class FirebaseCoreService implements PlatformCoreService {
    public static final a Companion = new a();
    public static final String SENDER_ID = "Mjk3MTA5MDM2MzQ5";
    public final ru.mail.libverify.platform.firebase.d.a a = ru.mail.libverify.platform.firebase.a.g;
    public final ru.mail.libverify.platform.firebase.b.b b = ru.mail.libverify.platform.firebase.a.h.getValue();
    public final ru.mail.libverify.platform.firebase.c.a c = ru.mail.libverify.platform.firebase.a.i.getValue();
    public final JwsService d = ru.mail.libverify.platform.firebase.a.j.getValue();
    public final ServiceType e = ServiceType.Firebase;

    public static final class a {
        public static ILog a() {
            ILog iLog = ru.mail.libverify.platform.firebase.a.a;
            return iLog == null ? ru.mail.libverify.platform.firebase.a.b.getValue() : iLog;
        }
    }

    @Override // ru.mail.libverify.platform.core.PlatformCoreService
    public JwsService getJwsService() {
        return this.d;
    }

    @Override // ru.mail.libverify.platform.core.PlatformCoreService
    public String getPushSenderId() {
        return StringUtils.INSTANCE.decodeBase64(SENDER_ID);
    }

    @Override // ru.mail.libverify.platform.core.PlatformCoreService
    public ServiceType getServiceType() {
        return this.e;
    }

    @Override // ru.mail.libverify.platform.core.PlatformCoreService
    public IPlatformUtils getUtils() {
        return this.a;
    }

    @Override // ru.mail.libverify.platform.core.PlatformCoreService
    public boolean isServiceAvailable(Context context, izs<? super String, s3q0> izsVar) {
        boolean z;
        Companion.getClass();
        ILog a2 = a.a();
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        AtomicBoolean atomicBoolean = fau.a;
        String l = ConnectionResult.l(isGooglePlayServicesAvailable);
        a2.v("FirebaseHelper", "play service check result: ".concat(l));
        if (isGooglePlayServicesAvailable == 0 || !(isGooglePlayServicesAvailable == 1 || isGooglePlayServicesAvailable == 3 || isGooglePlayServicesAvailable == 9)) {
            z = false;
        } else {
            if (izsVar != null) {
                izsVar.invoke(l);
            }
            z = true;
        }
        return !z;
    }

    @Override // ru.mail.libverify.platform.core.PlatformCoreService
    public String obtainAdvertisingId(Context context, KeyValueStorage keyValueStorage) {
        AdvertisingIdClient.Info advertisingIdInfo;
        if (ru.mail.libverify.platform.firebase.a.a.a.get()) {
            return null;
        }
        Companion.getClass();
        ILog a2 = a.a();
        a2.v("AdvertisingHelper", "getAdvertisingId - query android id");
        try {
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        } catch (GooglePlayServicesNotAvailableException e) {
            if (ru.mail.libverify.platform.firebase.a.a.a.compareAndSet(false, true)) {
                a2.e("AdvertisingHelper", "getAdvertisingId - Google Play services is not available entirely", e);
            }
        } catch (GooglePlayServicesRepairableException e2) {
            a2.e("AdvertisingHelper", "getAdvertisingId - error", e2);
        } catch (IOException e3) {
            a2.e("AdvertisingHelper", "getAdvertisingId - Unrecoverable error connecting to Google Play services (e.g., the old version of the service doesn't support getting AdvertisingId)", e3);
        } catch (Exception e4) {
            a2.e("AdvertisingHelper", "getAdvertisingId - unknown error", e4);
        }
        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
            a2.d("AdvertisingHelper", "getAdvertisingId - Google Play AdvertisingId usage blocked by a user");
            return null;
        }
        String id = advertisingIdInfo.getId();
        if (id != null && id.length() != 0) {
            keyValueStorage.putValue("instance_advertising_id", advertisingIdInfo.getId()).commit();
            return advertisingIdInfo.getId();
        }
        return keyValueStorage.getValue("instance_advertising_id");
    }

    @Override // ru.mail.libverify.platform.core.PlatformCoreService
    public void setInternalFactory(IInternalFactory iInternalFactory) {
        ru.mail.libverify.platform.firebase.a.c = iInternalFactory;
    }

    @Override // ru.mail.libverify.platform.core.PlatformCoreService
    public void setLog(ILog iLog) {
        ru.mail.libverify.platform.firebase.a.a = iLog;
    }

    @Override // ru.mail.libverify.platform.core.PlatformCoreService
    public void setSmsRetrieverService(ISmsRetrieverService iSmsRetrieverService) {
        ru.mail.libverify.platform.firebase.a.e = iSmsRetrieverService;
    }

    @Override // ru.mail.libverify.platform.core.PlatformCoreService
    public SmsRetrieverResult smsRetrieverService(Bundle bundle) {
        int i = SmsRetrieverReceiver.a;
        Status status = (Status) bundle.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
        if (status == null) {
            return null;
        }
        int i2 = status.b;
        String str = "";
        if (i2 == 0) {
            String str2 = (String) bundle.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            if (str2 == null || drm0.N(str2)) {
                i2 = 13;
            } else {
                str = str2;
            }
        }
        return new SmsRetrieverResult(i2, str);
    }

    @Override // ru.mail.libverify.platform.core.PlatformCoreService
    public ru.mail.libverify.platform.firebase.b.a getIDv2ProviderService(Context context) {
        return new ru.mail.libverify.platform.firebase.b.a(context, ru.mail.libverify.platform.firebase.a.a);
    }

    @Override // ru.mail.libverify.platform.core.PlatformCoreService
    public ru.mail.libverify.platform.firebase.b.b getIdProviderService() {
        return this.b;
    }

    @Override // ru.mail.libverify.platform.core.PlatformCoreService
    public ru.mail.libverify.platform.firebase.c.a getSmsRetrieverPlatformManager() {
        return this.c;
    }
}
