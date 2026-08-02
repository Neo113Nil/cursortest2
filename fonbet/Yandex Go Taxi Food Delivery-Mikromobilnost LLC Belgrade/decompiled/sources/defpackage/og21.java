package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.util.Set;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public abstract class og21 {
    public static final Set a = j73.f0(new String[]{"tel", "sms", "mailto", "geo", "market", "intent", "file"});

    public static final String a(Uri uri, String str) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery != null && encodedQuery.length() != 0) {
            String encode = Uri.encode(str, null);
            int length = encodedQuery.length();
            int i = 0;
            while (true) {
                int G = evu0.G(encodedQuery, '&', i, 4);
                int i2 = G != -1 ? G : length;
                int G2 = evu0.G(encodedQuery, '=', i, 4);
                if (G2 > i2 || G2 == -1) {
                    G2 = i2;
                }
                if (G2 - i != encode.length() || !encodedQuery.regionMatches(i, encode, 0, encode.length())) {
                    if (G == -1) {
                        break;
                    }
                    i = G + 1;
                } else {
                    return G2 == i2 ? "" : Uri.decode(encodedQuery.substring(G2 + 1, i2)).replace('+', HexString.CHAR_SPACE);
                }
            }
        }
        return null;
    }

    public static final boolean b(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equalsIgnoreCase(scheme) || Constants.SCHEME.equalsIgnoreCase(scheme);
    }
}
