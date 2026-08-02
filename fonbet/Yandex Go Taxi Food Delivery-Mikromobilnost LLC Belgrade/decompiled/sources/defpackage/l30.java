package defpackage;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.cards.nfc.data.b;
import com.yandex.go.payments.cards.nfc.domain.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.address.design.AddressInputView$setOnTextChangedListener$$inlined$addTextChangedListener$default$1;
import ru.yandex.taxi.multiorder.i;

/* loaded from: classes13.dex */
public final /* synthetic */ class l30 implements g18 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l30(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.g18
    public final void cancel() {
        a aVar;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                m30 m30Var = (m30) obj2;
                pzr0 pzr0Var = (pzr0) obj;
                WeakReference weakReference = m30Var.a;
                if (jl40.l(weakReference != null ? (pzr0) weakReference.get() : null, pzr0Var)) {
                    m30Var.a = null;
                    break;
                }
                break;
            case 1:
                AddressInputView.setOnTextChangedListener$lambda$1((AddressInputView) obj2, (AddressInputView$setOnTextChangedListener$$inlined$addTextChangedListener$default$1) obj);
                break;
            case 2:
                ((wd7) ((com.yandex.go.logistics.cargo_flow.discovery_map.a) obj2).L.get()).b.remove(((String) obj).toLowerCase(Locale.ROOT));
                break;
            case 3:
                Supplier supplier = (Supplier) obj;
                AtomicReference atomicReference = ((fif) obj2).b;
                while (!atomicReference.compareAndSet(supplier, null) && atomicReference.get() == supplier) {
                }
            case 4:
                ob0 ob0Var = (ob0) obj;
                AtomicReference atomicReference2 = ((fif) obj2).c;
                while (!atomicReference2.compareAndSet(ob0Var, null) && atomicReference2.get() == ob0Var) {
                }
            case 5:
                ((o950) obj2).d((w1p) obj);
                break;
            case 6:
                ((pmw) obj2).G.b.remove(((String) obj).toLowerCase(Locale.ROOT));
                break;
            case 7:
                ((Lifecycle) obj2).d((bey) obj);
                break;
            case 8:
                ((pzt0) obj2).a(null);
                ((pzt0) obj).a(null);
                break;
            case 9:
                ((d130) obj2).j.remove((kft0) obj);
                break;
            case 10:
                ((gh00) ((ru.yandex.taxi.masstransit.main.ui.overlay.a) obj2).c).u((yh00) obj);
                break;
            case 11:
                b bVar = (b) obj;
                ((pzt0) obj2).a(null);
                q760 q760Var = bVar.b;
                int i2 = q760Var.d;
                if (i2 != 0) {
                    co40 co40Var = q760Var.c;
                    String b = q760Var.a.b().b();
                    co40Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("attempt", Integer.valueOf(i2));
                    hashMap.put(MetaDataField.SCREEN_FIELD, b);
                    co40Var.a.a("nfcScanFailed", hashMap, 1, new HashMap());
                    q760Var.d = 0;
                }
                if (bVar.e.decrementAndGet() == 0 && (aVar = bVar.d) != null) {
                    ComponentActivity componentActivity = aVar.a;
                    componentActivity.getLifecycle().d(aVar);
                    if (componentActivity.getLifecycle().b() == Lifecycle.State.RESUMED) {
                        if (aVar.c) {
                            componentActivity.unregisterReceiver(aVar.z);
                            aVar.c = false;
                        }
                        aVar.b.disableForegroundDispatch(componentActivity);
                        break;
                    }
                }
                break;
            case 12:
                c231 c231Var = (c231) obj2;
                u290 u290Var = (u290) obj;
                if (c231Var != null) {
                    c231Var.f(u290Var);
                    break;
                }
                break;
            case 13:
                ((i) obj2).v.remove((gf4) obj);
                break;
            default:
                ((k20) obj2).cancel();
                ((k20) obj).cancel();
                break;
        }
    }
}
