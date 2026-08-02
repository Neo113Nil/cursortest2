package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.datastore.core.CorruptionException;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.h;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.play_billing.m;
import com.google.android.gms.internal.play_billing.n;
import com.yandex.div.core.expression.variables.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.fragment.YandexTaxiFragment;

/* loaded from: classes8.dex */
public final class dxf0 implements zve, z3q0, vm11, wj2, pi, a600, z15, t070, iy60, sx60 {
    public final Object a;

    public dxf0(ArrayList arrayList) {
        int d = gw00.d(tcc.n(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i4q0 i4q0Var = (i4q0) it.next();
            Pair pair = new Pair(i4q0Var.a, i4q0Var.c);
            linkedHashMap.put(pair.c(), pair.f());
        }
        this.a = linkedHashMap;
    }

    @Override // defpackage.a600
    public boolean a() {
        return ((YandexTaxiFragment) this.a).hasSettings();
    }

    @Override // defpackage.zve
    public Object b(CorruptionException corruptionException) {
        return ((tls) this.a).invoke(corruptionException);
    }

    public void c(int i, Object obj, ofa1 ofa1Var) {
        n nVar = (n) this.a;
        nVar.k(i, 3);
        ofa1Var.g((m) obj, nVar.a);
        nVar.k(i, 4);
    }

    public void d(int i, Object obj, n7b1 n7b1Var) {
        p5b1 p5b1Var = (p5b1) obj;
        y0 y0Var = (y0) this.a;
        y0Var.n((i << 3) | 2);
        y0Var.n(((w0) p5b1Var).e(n7b1Var));
        n7b1Var.d(p5b1Var, y0Var.a);
    }

    public void e(int i, Object obj, n7b1 n7b1Var) {
        y0 y0Var = (y0) this.a;
        y0Var.c(i, 3);
        n7b1Var.d((p5b1) obj, y0Var.a);
        y0Var.c(i, 4);
    }

    public void f(int i, Object obj, ofa1 ofa1Var) {
        m mVar = (m) obj;
        n nVar = (n) this.a;
        nVar.m((i << 3) | 2);
        nVar.m(mVar.b(ofa1Var));
        ofa1Var.g(mVar, nVar.a);
    }

    @Override // defpackage.wj2
    public ynr get(int i) {
        return (por) this.a;
    }

    @Override // defpackage.a600
    public boolean h() {
        return ((YandexTaxiFragment) this.a).showOnTopOfMenuButton();
    }

    @Override // defpackage.pi
    public boolean o(View view, hi hiVar) {
        h hVar = (h) this.a;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = hVar.d;
        if (viewPager2.isUserInputEnabled()) {
            viewPager2.setCurrentItemInternal(currentItem, true);
        }
        return true;
    }

    @Override // defpackage.sx60
    public void onCanceled() {
        ((CountDownLatch) this.a).countDown();
    }

    @Override // defpackage.z15
    public void onConnected(Bundle bundle) {
        ((t4e) this.a).onConnected(null);
    }

    @Override // defpackage.z15
    public void onConnectionSuspended(int i) {
        ((t4e) this.a).onConnectionSuspended(i);
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.a).countDown();
    }

    @Override // defpackage.t070
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.a).countDown();
    }

    @Override // defpackage.vm11
    public Object q() {
        return (Uri) this.a;
    }

    @Override // defpackage.dtq0
    public KSerializer select(String str) {
        return (KSerializer) ((LinkedHashMap) this.a).get(str);
    }

    @Override // defpackage.vm11
    public boolean t(Object obj) {
        return obj instanceof Uri;
    }

    public dxf0(y0 y0Var) {
        Charset charset = f1b1.a;
        this.a = y0Var;
        y0Var.a = this;
    }

    public dxf0(n nVar) {
        Charset charset = q7a1.a;
        this.a = nVar;
        nVar.a = this;
    }

    public /* synthetic */ dxf0(Object obj) {
        this.a = obj;
    }

    public dxf0(a aVar, zw51 zw51Var) {
        this.a = aVar;
    }

    public dxf0(int i) {
        switch (i) {
            case 15:
                this.a = new CountDownLatch(1);
                break;
            default:
                this.a = Uri.EMPTY;
                break;
        }
    }

    public dxf0(float f, float f2) {
        this.a = new por(f, f2, 4);
    }
}
