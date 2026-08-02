package defpackage;

import com.yandex.go.taxi.tariffs.factory.CompoundTariffInfoFactoryImpl$createFromZoneAndRouteStats$lambda$0$$inlined$computeIfAbsentCompat$1;
import java.util.HashMap;
import java.util.function.Function;

/* loaded from: classes8.dex */
public final /* synthetic */ class awd implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ HashMap b;

    public /* synthetic */ awd(int i, HashMap hashMap) {
        this.a = i;
        this.b = hashMap;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String obj2;
        int i = this.a;
        HashMap hashMap = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                final CompoundTariffInfoFactoryImpl$createFromZoneAndRouteStats$lambda$0$$inlined$computeIfAbsentCompat$1 compoundTariffInfoFactoryImpl$createFromZoneAndRouteStats$lambda$0$$inlined$computeIfAbsentCompat$1 = new CompoundTariffInfoFactoryImpl$createFromZoneAndRouteStats$lambda$0$$inlined$computeIfAbsentCompat$1(1, new brd(str, 1), tls.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0);
                return (is60) hashMap.computeIfAbsent(str, new Function() { // from class: bwd
                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj3) {
                        return CompoundTariffInfoFactoryImpl$createFromZoneAndRouteStats$lambda$0$$inlined$computeIfAbsentCompat$1.this.invoke(obj3);
                    }
                });
            default:
                t610 a = ((w610) obj).c.a(1);
                String str2 = a != null ? a.a : null;
                Object remove = str2 != null ? hashMap.remove(str2) : null;
                return (remove == null || (obj2 = remove.toString()) == null) ? "" : obj2;
        }
    }
}
