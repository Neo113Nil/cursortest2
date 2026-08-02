package xsna;

import android.net.Uri;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: AudioCacheHelper.java */
/* loaded from: classes7.dex */
public final class ol4 {
    public static final Pattern a = Pattern.compile("mid\\.([0-9_\\-]+|null)\\.type\\.(afile|ahttp)\\.(.*)");

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        if (r1.matches() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0013, code lost:
    
        if (r0.matches() == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(Uri uri) {
        Matcher matcher;
        Uri uri2;
        Matcher matcher2;
        String authority = uri.getAuthority();
        Pattern pattern = a;
        String str = null;
        if (authority != null) {
            matcher = pattern.matcher(authority);
        }
        matcher = null;
        if (matcher != null && matcher.groupCount() == 3) {
            Uri.Builder buildUpon = uri.buildUpon();
            String authority2 = uri.getAuthority();
            if (authority2 != null) {
                matcher2 = pattern.matcher(authority2);
            }
            matcher2 = null;
            if (matcher2 != null && matcher2.groupCount() == 3) {
                str = matcher2.group(3);
            }
            uri2 = buildUpon.authority(str).build();
        } else {
            uri2 = uri;
        }
        bn40.f("cleaner: " + uri.getAuthority() + " -> " + uri2.getAuthority());
        Uri.Builder clearQuery = uri2.buildUpon().clearQuery();
        for (String str2 : uri2.getQueryParameterNames()) {
            if (!"segment_num".equals(str2)) {
                clearQuery.appendQueryParameter(str2, uri2.getQueryParameter(str2));
            }
        }
        return clearQuery.build().toString();
    }
}
