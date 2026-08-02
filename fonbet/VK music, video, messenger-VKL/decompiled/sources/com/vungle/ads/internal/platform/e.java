package com.vungle.ads.internal.platform;

import android.content.Context;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.facebook.soloader.MinElf;
import com.ironsource.T3;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Result;
import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;
import xsna.dli0;
import xsna.drm0;
import xsna.epx;
import xsna.rl3;

/* loaded from: classes7.dex */
public abstract class e {
    public static boolean a() {
        String str = Build.FINGERPRINT;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        String str2 = Build.MODEL;
        String lowerCase2 = str2 != null ? str2.toLowerCase(Locale.ROOT) : "";
        String str3 = Build.PRODUCT;
        String lowerCase3 = str3 != null ? str3.toLowerCase(Locale.ROOT) : "";
        String str4 = Build.BRAND;
        String lowerCase4 = str4 != null ? str4.toLowerCase(Locale.ROOT) : "";
        String str5 = Build.MANUFACTURER;
        String lowerCase5 = str5 != null ? str5.toLowerCase(Locale.ROOT) : "";
        String str6 = Build.BOARD;
        return drm0.D(lowerCase, PeerVideoSettingsBitrateTable.CODEC_GENERIC, false) || drm0.D(lowerCase, "emulator", false) || drm0.D(lowerCase2, "google_sdk", false) || drm0.D(lowerCase2, "emulator", false) || drm0.D(lowerCase3, "sdk", false) || drm0.D(lowerCase3, "vbox", false) || drm0.D(lowerCase4, PeerVideoSettingsBitrateTable.CODEC_GENERIC, false) || drm0.D(lowerCase5, "genymotion", false) || drm0.D(str6 != null ? str6.toLowerCase(Locale.ROOT) : "", "nox", false) || drm0.D(rl3.Z(Build.SUPPORTED_ABIS, null, null, null, null, 63).toLowerCase(Locale.ROOT), MinElf.ISA.X86, false);
    }

    public static String b(Context context) {
        Object failure;
        try {
            failure = Settings.Global.getString(context.getContentResolver(), "private_dns_mode");
            if (failure == null) {
                failure = "opportunistic";
            }
            if (failure.equals("hostname")) {
                String string = Settings.Global.getString(context.getContentResolver(), "private_dns_specifier");
                if (string == null) {
                    string = "";
                }
                failure = "hostname(" + string + ')';
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = "unknown";
        }
        return (String) failure;
    }

    public static int c(Context context) {
        return ((SensorManager) context.getSystemService("sensor")).getSensorList(-1).size();
    }

    public static boolean d(Context context) {
        return Settings.canDrawOverlays(context);
    }

    public static boolean e(Context context) {
        Object failure;
        boolean a;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                a = false;
            } else {
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                a = a(linkProperties != null ? linkProperties.getHttpProxy() : null);
            }
            failure = Boolean.valueOf(a);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return ((Boolean) failure).booleanValue();
    }

    public static boolean f(Context context) {
        Object failure;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            Network[] allNetworks = connectivityManager.getAllNetworks();
            int length = allNetworks.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < length) {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i]);
                    if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            failure = Boolean.valueOf(z);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return ((Boolean) failure).booleanValue();
    }

    public static boolean a(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return false;
        }
        String host = proxyInfo.getHost();
        return (host != null && host.length() > 0 && proxyInfo.getPort() > 0) || (proxyInfo.getPacFileUrl() != null && !epx.f(proxyInfo.getPacFileUrl(), Uri.EMPTY));
    }

    public static String a(Context context) {
        Object failure;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                failure = "none";
            } else {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    failure = "unknown";
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (networkCapabilities.hasTransport(1)) {
                        sb.append("wifi");
                    } else if (networkCapabilities.hasTransport(0)) {
                        sb.append("cellular");
                    } else if (networkCapabilities.hasTransport(3)) {
                        sb.append(T3.e);
                    } else {
                        sb.append("other");
                    }
                    if (networkCapabilities.hasTransport(4)) {
                        sb.append("+vpn");
                    }
                    if (connectivityManager.isActiveNetworkMetered()) {
                        sb.append("+metered");
                    }
                    failure = sb.toString();
                }
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (String) (failure instanceof Result.Failure ? "unknown" : failure);
    }

    public static String a(Throwable th) {
        boolean z;
        if (th == null) {
            return "none";
        }
        Iterator it = dli0.e(th, d.a).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((Throwable) it.next()) instanceof CertificateException) {
                z = true;
                break;
            }
        }
        boolean z2 = th instanceof SSLHandshakeException;
        if (z2 && z) {
            return "SSL_CERT_ERROR";
        }
        if (z2) {
            return "SSL_HANDSHAKE";
        }
        if (th instanceof SSLPeerUnverifiedException) {
            return "SSL_PEER_UNVERIFIED";
        }
        if (th instanceof SSLException) {
            return "SSL_ERROR";
        }
        if (th instanceof UnknownHostException) {
            return "DNS_FAILURE";
        }
        if (th instanceof ConnectException) {
            return "CONNECT_FAILURE";
        }
        if (th instanceof SocketTimeoutException) {
            return "TIMEOUT";
        }
        if (th instanceof SocketException) {
            SocketException socketException = (SocketException) th;
            String message = socketException.getMessage();
            if (message != null && drm0.D(message, "reset", true)) {
                return "CONNECTION_RESET";
            }
            String message2 = socketException.getMessage();
            if (message2 != null && drm0.D(message2, "abort", true)) {
                return "CONNECTION_ABORT";
            }
            String message3 = socketException.getMessage();
            return (message3 == null || !drm0.D(message3, "closed", true)) ? "SOCKET_ERROR" : "CONNECTION_CLOSED";
        }
        return th.getClass().getSimpleName();
    }
}
