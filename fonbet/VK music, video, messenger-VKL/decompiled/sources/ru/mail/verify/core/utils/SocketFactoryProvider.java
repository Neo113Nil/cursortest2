package ru.mail.verify.core.utils;

import androidx.annotation.Nullable;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes9.dex */
public interface SocketFactoryProvider {
    @Nullable
    SSLSocketFactory getSSLFactory(@Nullable SSLSocketFactory sSLSocketFactory);
}
