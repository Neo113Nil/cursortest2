package xsna;

import com.vk.network.proxy.data.VkProxyPreferences;
import com.vk.network.proxy.data.model.VkProxyNetwork;
import java.util.concurrent.ConcurrentHashMap;
import xsna.pev0;

/* compiled from: ProxyNetworkStorage.kt */
/* loaded from: classes.dex */
public final class kae0 {
    public final io.reactivex.rxjava3.subjects.j<VkProxyNetwork> a;
    public final ConcurrentHashMap b;

    /* compiled from: ProxyNetworkStorage.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkProxyNetwork.Status.values().length];
            try {
                iArr[VkProxyNetwork.Status.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkProxyNetwork.Status.BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkProxyNetwork.Status.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kae0(VkProxyPreferences vkProxyPreferences, pev0.a aVar) {
        this.a = aVar.d ? io.reactivex.rxjava3.subjects.d.N0() : new io.reactivex.rxjava3.subjects.f<>();
        this.b = new ConcurrentHashMap();
        com.vk.core.utils.newtork.b.a.getClass();
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = com.vk.core.utils.newtork.b.e.a0(io.reactivex.rxjava3.schedulers.a.b());
        final lal lalVar = new lal(this, 1);
        a0.subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.jae0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                lal.this.invoke(obj);
            }
        });
    }
}
