package defpackage;

import android.util.Base64;
import android.view.View;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import kotlin.Result;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class d471 {
    public final int[] a = new int[2];
    public final int[] b = new int[2];

    public final String a(View view, View view2) {
        Object failure;
        if (view.isAttachedToWindow() && view2.isAttachedToWindow()) {
            int[] iArr = this.a;
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.b;
            view2.getLocationInWindow(iArr2);
            try {
                failure = Base64.encodeToString(ly3.k(view.getWidth(), view.getHeight(), Extension.FIX_SPACE, "}", b64.s(iArr[0] - iArr2[0], iArr[1] - iArr2[1], "{", Extension.FIX_SPACE, Extension.FIX_SPACE)).getBytes(uza.a), 2);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            String str = (String) failure;
            if (str != null) {
                return URLEncoder.encode(str, StandardCharsets.UTF_8.toString());
            }
        }
        return null;
    }
}
