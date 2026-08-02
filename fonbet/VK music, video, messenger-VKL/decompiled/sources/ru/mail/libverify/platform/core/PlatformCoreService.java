package ru.mail.libverify.platform.core;

import android.content.Context;
import android.os.Bundle;
import ru.mail.libverify.platform.gcm.IDv2ProviderService;
import ru.mail.libverify.platform.gcm.IdProviderService;
import ru.mail.libverify.platform.sms.SmsRetrieverPlatformManager;
import ru.mail.libverify.platform.storage.KeyValueStorage;
import xsna.izs;
import xsna.s3q0;

/* compiled from: PlatformCoreService.kt */
/* loaded from: classes11.dex */
public interface PlatformCoreService {
    IDv2ProviderService getIDv2ProviderService(Context context);

    IdProviderService getIdProviderService();

    JwsService getJwsService();

    String getPushSenderId();

    ServiceType getServiceType();

    SmsRetrieverPlatformManager getSmsRetrieverPlatformManager();

    IPlatformUtils getUtils();

    boolean isServiceAvailable(Context context, izs<? super String, s3q0> izsVar);

    String obtainAdvertisingId(Context context, KeyValueStorage keyValueStorage);

    void setInternalFactory(IInternalFactory iInternalFactory);

    void setLog(ILog iLog);

    void setSmsRetrieverService(ISmsRetrieverService iSmsRetrieverService);

    SmsRetrieverResult smsRetrieverService(Bundle bundle);
}
