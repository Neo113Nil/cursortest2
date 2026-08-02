package ru.ok.android.webrtc.stat.ice;

import java.util.List;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import xsna.hl10;
import xsna.zr;

/* loaded from: classes9.dex */
public final class UrlParameterExtractor {
    public final Regex a;

    public UrlParameterExtractor(String str) {
        this.a = new Regex(zr.a("[?&]", Pattern.quote(str), "=([^&]+)"));
    }

    public final String extract(String str) {
        List<String> b;
        hl10 b2 = this.a.b(str);
        if (b2 == null || (b = b2.b()) == null) {
            return null;
        }
        return (String) ((hl10.a) b).get(1);
    }
}
