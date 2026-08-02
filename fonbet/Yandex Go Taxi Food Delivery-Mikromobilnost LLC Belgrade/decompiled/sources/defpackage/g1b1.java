package defpackage;

import android.bluetooth.BluetoothGatt;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import com.yandex.go.scooters.ble.api.exceptions.ScootersBleConnectionFailureException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public abstract class g1b1 {
    public static final bom a(fid fidVar) {
        List W;
        bts btsVar = (bts) fidVar;
        btsVar.e0(474629640);
        W = evu0.W(ohb1.e(btsVar, oyh0.unavailable_chat), new String[]{" "}, (r2 & 4) != 0 ? 0 : 2);
        List A0 = a.A0(W, 2);
        ArrayList arrayList = new ArrayList();
        Iterator it = A0.iterator();
        while (it.hasNext()) {
            Character v0 = gvu0.v0((String) it.next());
            if (v0 != null) {
                arrayList.add(v0);
            }
        }
        bom bomVar = new bom(a.X(arrayList, "", null, null, null, 62).toUpperCase(Locale.ROOT), 5L, null, 12);
        btsVar.t(false);
        return bomVar;
    }

    public static final void b(Context context, BluetoothGatt bluetoothGatt, i18 i18Var) {
        h1b1.j(context);
        bluetoothGatt.close();
        bluetoothGatt.disconnect();
        i18Var.resumeWith(new Result.Failure(new ScootersBleConnectionFailureException()));
    }

    public static AttributeSet c(String str, Resources resources, int i) {
        int next;
        try {
            XmlResourceParser layout = resources.getLayout(i);
            do {
                next = layout.next();
                if (jl40.l(layout.getName(), str)) {
                    return Xml.asAttributeSet(layout);
                }
            } while (next != 1);
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
