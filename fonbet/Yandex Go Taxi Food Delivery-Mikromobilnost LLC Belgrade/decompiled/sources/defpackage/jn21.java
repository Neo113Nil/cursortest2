package defpackage;

import android.os.Bundle;
import com.samsung.android.sdk.samsungpay.v2.service.RequestType;
import java.text.SimpleDateFormat;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class jn21 {
    private static final SimpleDateFormat c = new SimpleDateFormat("yyyy/dd/MM");
    private Bundle a;
    private RequestType[] b;

    public jn21(Bundle bundle) {
        Bundle bundle2 = (Bundle) bundle.clone();
        this.a = bundle2;
        this.b = new RequestType[bundle2.keySet().size()];
        Iterator<String> it = this.a.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            this.b[i] = RequestType.valueOf(it.next());
            i++;
        }
    }
}
