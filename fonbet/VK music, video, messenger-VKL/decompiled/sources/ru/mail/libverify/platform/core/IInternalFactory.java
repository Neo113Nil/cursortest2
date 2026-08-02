package ru.mail.libverify.platform.core;

import android.content.Context;
import java.util.Map;

/* compiled from: IInternalFactory.kt */
/* loaded from: classes11.dex */
public interface IInternalFactory {
    void deliverGcmMessageIntent(Context context, String str, Map<String, String> map);

    void refreshGcmToken(Context context);
}
