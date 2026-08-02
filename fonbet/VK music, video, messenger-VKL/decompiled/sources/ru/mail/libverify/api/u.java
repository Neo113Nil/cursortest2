package ru.mail.libverify.api;

import android.content.Context;
import android.net.Network;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.core.network.model.HttpRequest;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import ru.mail.verify.core.api.ApplicationModule;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.SocketFactoryProvider;
import ru.mail.verify.core.utils.components.MessageBus;
import xsna.drm0;
import xsna.epx;
import xsna.y57;

/* loaded from: classes9.dex */
final class u extends ru.mail.verify.core.api.n {

    @NonNull
    private final ru.mail.libverify.u.w f;

    public u(@NonNull Context context, @NonNull ru.mail.libverify.u.w wVar, @NonNull MessageBus messageBus, @NonNull ApplicationModule.NetworkPolicyConfig networkPolicyConfig, @Nullable SocketFactoryProvider socketFactoryProvider) {
        super(context, messageBus, networkPolicyConfig, socketFactoryProvider);
        this.f = wVar;
    }

    @NonNull
    private String b(@NonNull String str) {
        URL url;
        int port;
        String E = this.f.E();
        if (TextUtils.isEmpty(E) || E == null) {
            return str;
        }
        try {
            URL url2 = new URL(str);
            int i = -1;
            if (drm0.K(0, 6, E, StringUtils.PROCESS_POSTFIX_DELIMITER, false) != -1) {
                try {
                    url = new URL("http://".concat(E));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    url = null;
                }
                E = url.getHost();
                port = url.getPort();
            } else {
                port = -1;
            }
            boolean f = epx.f(url2.getProtocol(), HttpRequest.DEFAULT_SCHEME);
            if ((port != 443 || !f) && (port != 80 || f)) {
                i = port;
            }
            return new URL(url2.getProtocol(), E, i, url2.getFile()).toString();
        } catch (MalformedURLException unused) {
            throw new RuntimeException(y57.a("Couldn't replace host in url, originalUrl=", str, ", newHost=", E));
        }
    }

    @Override // ru.mail.libverify.g0.q
    @NonNull
    public final ru.mail.verify.core.utils.a a(@NonNull String str, @Nullable Network network, boolean z) {
        if (z) {
            try {
                str = b(a(str));
            } catch (Exception e) {
                FileLog.e("VerifyNetworkManager", e, "failed to replace token in url %s", str);
            }
        }
        return ru.mail.verify.core.utils.c.a(str, this.d, network);
    }

    @NonNull
    private String a(@NonNull String str) {
        Map<String, String> p = this.f.p();
        if (!p.isEmpty()) {
            for (Map.Entry<String, String> entry : p.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                    str = str.replace(entry.getKey(), entry.getValue());
                }
            }
        }
        return str;
    }
}
