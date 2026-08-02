package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cfs0 implements tg21 {
    @Override // defpackage.tg21
    public final Object a(String str, Map map, Continuation continuation) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Iterator it = ((Set) entry.getValue()).iterator();
            while (it.hasNext()) {
                buildUpon.appendQueryParameter(str2, (String) it.next());
            }
        }
        return buildUpon.build().toString();
    }
}
