package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes10.dex */
public final class djl0 {
    public final ImmutableListMultimap a;

    static {
        new djl0(new cjl0());
    }

    public djl0(cjl0 cjl0Var) {
        this.a = cjl0Var.a.b();
    }

    public static String a(String str) {
        return f0b1.f(str, GlideBitmapDownloader.ACCEPT_HEADER) ? GlideBitmapDownloader.ACCEPT_HEADER : f0b1.f(str, "Allow") ? "Allow" : f0b1.f(str, "Authorization") ? "Authorization" : f0b1.f(str, "Bandwidth") ? "Bandwidth" : f0b1.f(str, "Blocksize") ? "Blocksize" : f0b1.f(str, "Cache-Control") ? "Cache-Control" : f0b1.f(str, "Connection") ? "Connection" : f0b1.f(str, "Content-Base") ? "Content-Base" : f0b1.f(str, "Content-Encoding") ? "Content-Encoding" : f0b1.f(str, "Content-Language") ? "Content-Language" : f0b1.f(str, "Content-Length") ? "Content-Length" : f0b1.f(str, "Content-Location") ? "Content-Location" : f0b1.f(str, "Content-Type") ? "Content-Type" : f0b1.f(str, "CSeq") ? "CSeq" : f0b1.f(str, "Date") ? "Date" : f0b1.f(str, "Expires") ? "Expires" : f0b1.f(str, "Location") ? "Location" : f0b1.f(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : f0b1.f(str, "Proxy-Require") ? "Proxy-Require" : f0b1.f(str, "Public") ? "Public" : f0b1.f(str, "Range") ? "Range" : f0b1.f(str, "RTP-Info") ? "RTP-Info" : f0b1.f(str, "RTCP-Interval") ? "RTCP-Interval" : f0b1.f(str, "Scale") ? "Scale" : f0b1.f(str, "Session") ? "Session" : f0b1.f(str, "Speed") ? "Speed" : f0b1.f(str, "Supported") ? "Supported" : f0b1.f(str, "Timestamp") ? "Timestamp" : f0b1.f(str, "Transport") ? "Transport" : f0b1.f(str, ExtFunctionsKt.HEADER_USER_AGENT) ? ExtFunctionsKt.HEADER_USER_AGENT : f0b1.f(str, "Via") ? "Via" : f0b1.f(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public final String b(String str) {
        ImmutableList f = this.a.f(a(str));
        if (f.isEmpty()) {
            return null;
        }
        return (String) eab1.c(f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof djl0) {
            return this.a.equals(((djl0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
