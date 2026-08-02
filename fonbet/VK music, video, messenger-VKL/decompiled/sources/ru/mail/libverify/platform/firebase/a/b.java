package ru.mail.libverify.platform.firebase.a;

import android.content.Context;
import ru.mail.libverify.platform.core.JwsService;
import ru.mail.libverify.platform.core.JwsServiceCallback;

/* loaded from: classes11.dex */
public final class b implements JwsService {
    @Override // ru.mail.libverify.platform.core.JwsService
    public final void getJws(Context context, byte[] bArr, String str, JwsServiceCallback jwsServiceCallback) {
        jwsServiceCallback.onFailure(new UnsupportedOperationException("Not implemented."));
    }
}
