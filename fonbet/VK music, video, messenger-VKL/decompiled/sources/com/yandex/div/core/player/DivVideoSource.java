package com.yandex.div.core.player;

import android.net.Uri;
import xsna.epx;
import xsna.iq;
import xsna.urd0;

/* compiled from: DivVideoSource.kt */
/* loaded from: classes7.dex */
public final class DivVideoSource {
    private final Long bitrate;
    private final String mimeType;
    private final DivVideoResolution resolution;
    private final Uri url;

    public DivVideoSource(Uri uri, String str, DivVideoResolution divVideoResolution, Long l) {
        this.url = uri;
        this.mimeType = str;
        this.resolution = divVideoResolution;
        this.bitrate = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivVideoSource)) {
            return false;
        }
        DivVideoSource divVideoSource = (DivVideoSource) obj;
        return epx.f(this.url, divVideoSource.url) && epx.f(this.mimeType, divVideoSource.mimeType) && epx.f(this.resolution, divVideoSource.resolution) && epx.f(this.bitrate, divVideoSource.bitrate);
    }

    public int hashCode() {
        int a = urd0.a(this.url.hashCode() * 31, 31, this.mimeType);
        DivVideoResolution divVideoResolution = this.resolution;
        int hashCode = (a + (divVideoResolution == null ? 0 : divVideoResolution.hashCode())) * 31;
        Long l = this.bitrate;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DivVideoSource(url=");
        sb.append(this.url);
        sb.append(", mimeType=");
        sb.append(this.mimeType);
        sb.append(", resolution=");
        sb.append(this.resolution);
        sb.append(", bitrate=");
        return iq.b(sb, this.bitrate, ')');
    }
}
