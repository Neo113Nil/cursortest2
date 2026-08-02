package sg.bigo.ads.bp;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import xsna.y57;

/* loaded from: classes9.dex */
public final class b {
    final Map<String, String> a = new ConcurrentHashMap();

    public final boolean a(@Nullable URL url, @Nullable URL url2) {
        String str;
        if (url == null) {
            str = "originURL is null.";
        } else if (url2 == null) {
            str = "newURL is null.";
        } else {
            String protocol = url.getProtocol();
            if (TextUtils.isEmpty(protocol)) {
                str = "originURL protocol is empty.";
            } else {
                if (protocol.equalsIgnoreCase(url2.getProtocol())) {
                    String host = url.getHost();
                    String host2 = url2.getHost();
                    if (!host.equalsIgnoreCase("www.".concat(String.valueOf(host2))) && !host2.equalsIgnoreCase("www.".concat(host))) {
                        return false;
                    }
                    sg.bigo.ads.bn.a.a(0, "HostCache", y57.a("cache host, originHost=", host, ", newHost=", host2));
                    this.a.put(host, host2);
                    return true;
                }
                str = "protocol is not equal.";
            }
        }
        sg.bigo.ads.bn.a.a(0, "HostCache", str);
        return false;
    }
}
