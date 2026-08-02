package defpackage;

import android.net.Uri;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment;
import com.ybsdk.core.utils.date.YbDateFormat;
import com.ybsdk.deeplink.generated.PdfLoadByIdAction;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class gh91 {
    public static final q501 a = new q501(22);

    public static final long a(Calendar calendar) {
        return (calendar.get(2) * 100) + (calendar.get(1) * 10000) + calendar.get(5);
    }

    public static final String b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.set((int) (j / 10000), (int) ((j / 100) % 100), (int) (j % 100));
        return vqg.a(calendar.getTime(), YbDateFormat.SHORT_SERVER_DATE_ONLY);
    }

    public static PdfLoadByIdAction c(Uri uri) {
        String queryParameter = uri.getQueryParameter("id");
        if (queryParameter == null) {
            return null;
        }
        String queryParameter2 = uri.getQueryParameter("target");
        String queryParameter3 = uri.getQueryParameter("lifetime_in_seconds");
        Integer l = queryParameter3 != null ? bvu0.l(10, queryParameter3) : null;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        ArrayList arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            if (!j73.f0(new String[]{"id", "target", "lifetime_in_seconds"}).contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String queryParameter4 = uri.getQueryParameter((String) next);
            if (queryParameter4 == null) {
                queryParameter4 = "";
            }
            linkedHashMap.put(next, queryParameter4);
        }
        return new PdfLoadByIdAction(queryParameter, queryParameter2, l, linkedHashMap.isEmpty() ? null : linkedHashMap);
    }

    public static final ep31 d(final BaseFragment baseFragment, tls tlsVar) {
        final int i = 2;
        return new ep31(new sls() { // from class: dp31
            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                Fragment fragment = baseFragment;
                switch (i2) {
                    case 0:
                        return (DialogFragment) fragment;
                    case 1:
                        return ((DialogFragment) fragment).getViewLifecycleOwner();
                    default:
                        return fragment.getViewLifecycleOwner();
                }
            }
        }, new hh31(4, tlsVar, baseFragment));
    }
}
