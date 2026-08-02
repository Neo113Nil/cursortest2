package defpackage;

import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.Recomposer$State;
import androidx.compose.runtime.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.go.environment.i;
import com.yandex.go.layers.api.model.MapObjectComponentType;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.zone.dto.objects.ZoneVertical;
import com.yandex.messaging.sdk.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.datetime.format.f;
import kotlinx.datetime.internal.format.e;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.messenger.domain.MessengerChatOwner;

/* loaded from: classes.dex */
public final /* synthetic */ class jid implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jid(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0238, code lost:
    
        if (r5 == null) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x023f  */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object[], java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.util.Collection] */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        ym00 b;
        List W;
        ArrayList arrayList;
        char c = 7;
        String str = null;
        r14 = null;
        r14 = null;
        r14 = null;
        ioq0 ioq0Var = null;
        l8x l8xVar = null;
        i18 i18Var = null;
        str = null;
        int i = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                zti0 zti0Var = (zti0) this.b;
                ((Integer) obj).getClass();
                if (obj2 instanceof qgd) {
                    qgd qgdVar = (qgd) obj2;
                    iz40 iz40Var = zti0Var.h;
                    if (iz40Var == null) {
                        iz40Var = dmm0.a();
                        zti0Var.h = iz40Var;
                    }
                    iz40Var.k(qgdVar);
                    zti0Var.f.b(qgdVar);
                }
                if (obj2 instanceof gts) {
                    zti0Var.e((gts) obj2);
                }
                if (obj2 instanceof aii0) {
                    ((aii0) obj2).c();
                }
                return zy11.a;
            case 1:
                lm00 lm00Var = (lm00) obj2;
                lm00 lm00Var2 = (lm00) ((Map) this.b).get((String) obj);
                if (lm00Var2 != null && (b = dn00.b(lm00Var2, MapObjectComponentType.BODY)) != null && (!b.g().b)) {
                    Iterator it = lm00Var.f.iterator();
                    while (it.hasNext()) {
                        dn00.d((ym00) it.next());
                    }
                }
                return zy11.a;
            case 2:
                a aVar = (a) this.b;
                String str2 = (String) obj;
                W = evu0.W(str2, new String[]{"_"}, (r2 & 4) != 0 ? 0 : 2);
                if (W.size() == 2) {
                    if (((zzf) aVar.b()).h().a((String) W.get(0))) {
                        str = (String) W.get(0);
                    } else if (((zzf) aVar.b()).h().a((String) W.get(1))) {
                        str = (String) W.get(1);
                    }
                }
                if (str != null) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    ((pux0) ((pw2) ((zzf) aVar.b()).K.get())).getClass();
                    intent.setData(Uri.parse(pux0.c + "://chat?BOT_GUID_ID_PARAM=" + str));
                    return intent;
                }
                zzf zzfVar = (zzf) aVar.b();
                MessengerChatOwner a = new x020(new v220((rqo) zzfVar.C.get()), (g) zzfVar.e6.get()).a(str2);
                Intent intent2 = new Intent("android.intent.action.VIEW");
                ((pux0) ((pw2) ((zzf) aVar.b()).K.get())).getClass();
                String str3 = pux0.c;
                r12 = a != null ? d220.a[a.ordinal()] : -1;
                intent2.setData(Uri.parse(str3 + (r12 != 1 ? r12 != 2 ? "" : "://taxi_order_details?action=messenger&chat_id=" : "://marketplace?type=marketplace&screen=chat&chat_id=") + str2));
                return intent2;
            case 3:
                ZoneVertical zoneVertical = (ZoneVertical) this.b;
                List list = (List) obj2;
                List list2 = list;
                if (list == null) {
                    list2 = EmptyList.a;
                }
                List list3 = list2;
                boolean isEmpty = list3.isEmpty();
                List list4 = list3;
                if (isEmpty) {
                    list4 = zoneVertical.m;
                }
                return list4;
            case 4:
                j jVar = (j) this.b;
                Set set = (Set) obj;
                synchronized (jVar.c) {
                    try {
                        if (((Recomposer$State) jVar.u.getValue()).compareTo(Recomposer$State.Idle) >= 0) {
                            iz40 iz40Var2 = jVar.h;
                            if (set instanceof androidx.compose.runtime.collection.a) {
                                iz40 iz40Var3 = ((androidx.compose.runtime.collection.a) set).a;
                                Object[] objArr = iz40Var3.b;
                                long[] jArr = iz40Var3.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    while (true) {
                                        long j = jArr[i3];
                                        if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j & 255) < 128) {
                                                    Object obj3 = objArr[(i3 << 3) + i5];
                                                    if (!(obj3 instanceof h5u0) || ((h5u0) obj3).m483isReadInh_f27i8$runtime(1)) {
                                                        iz40Var2.a(obj3);
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i4 != 8) {
                                            }
                                        }
                                        if (i3 != length) {
                                            i3++;
                                            c = 7;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof h5u0) || ((h5u0) obj4).m483isReadInh_f27i8$runtime(1)) {
                                        iz40Var2.a(obj4);
                                    }
                                }
                            }
                            i18Var = jVar.C();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i18Var != null) {
                    ((j18) i18Var).resumeWith(zy11.a);
                }
                return zy11.a;
            case 5:
                SafeCollector safeCollector = (SafeCollector) this.b;
                int intValue = ((Integer) obj).intValue();
                dse dseVar = (dse) obj2;
                ese key = dseVar.getKey();
                dse dseVar2 = safeCollector.collectContext.get(key);
                if (key != seu.C) {
                    if (dseVar != dseVar2) {
                        intValue = Integer.MIN_VALUE;
                    }
                    intValue++;
                } else {
                    l8x l8xVar2 = (l8x) dseVar2;
                    l8x l8xVar3 = (l8x) dseVar;
                    while (l8xVar3 != null) {
                        if (l8xVar3 != l8xVar2 && (l8xVar3 instanceof fbp0)) {
                            hpb M = ((fbp0) l8xVar3).M();
                            l8xVar3 = M != null ? M.getParent() : null;
                        } else {
                            l8xVar = l8xVar3;
                            if (l8xVar == l8xVar2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + l8xVar + ", expected child of " + l8xVar2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (l8xVar == l8xVar2) {
                    }
                }
                return Integer.valueOf(intValue);
            case 6:
                e eVar = (e) this.b;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                for (f fVar : eVar.b) {
                    fVar.a.a(obj, Boolean.valueOf(booleanValue != jl40.l(fVar.a.a.get(obj), Boolean.TRUE)));
                }
                return zy11.a;
            case 7:
                fis0 fis0Var = (fis0) this.b;
                Set set2 = (Set) obj;
                synchronized (fis0Var.a) {
                    try {
                        iz40 iz40Var4 = fis0Var.d;
                        if (iz40Var4 != null) {
                            Object[] objArr2 = iz40Var4.b;
                            long[] jArr2 = iz40Var4.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j2 = jArr2[i6];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 < i7) {
                                                if ((j2 & 255) >= 128 || !set2.contains(objArr2[(i6 << 3) + i8])) {
                                                    j2 >>= 8;
                                                    i8++;
                                                } else {
                                                    ioq0Var = fis0Var.f;
                                                }
                                            } else if (i7 != 8) {
                                            }
                                        }
                                    }
                                    if (i6 != length2) {
                                        i6++;
                                    }
                                }
                            }
                        } else if (kotlin.collections.a.G(set2, fis0Var.b)) {
                            ioq0Var = fis0Var.f;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (ioq0Var != null) {
                    ioq0Var.d(zy11.a);
                    ni9 ni9Var = oi9.b;
                }
                return zy11.a;
            case 8:
                n3t0 n3t0Var = (n3t0) this.b;
                Set set3 = (Set) obj;
                AtomicReference atomicReference = n3t0Var.b;
                while (true) {
                    Object obj5 = atomicReference.get();
                    if (obj5 == null) {
                        arrayList = set3;
                    } else if (obj5 instanceof Set) {
                        arrayList = scc.g(new Set[]{obj5, set3});
                    } else {
                        if (!(obj5 instanceof List)) {
                            lid.b("Unexpected notification");
                            ny61.A();
                            return null;
                        }
                        arrayList = kotlin.collections.a.m0(Collections.singletonList(set3), (Collection) obj5);
                    }
                    while (!atomicReference.compareAndSet(obj5, arrayList)) {
                        if (atomicReference.get() != obj5) {
                            break;
                        }
                    }
                    if (n3t0Var.b()) {
                        n3t0Var.a.invoke(new qhq0(11, n3t0Var));
                    }
                    return zy11.a;
                    break;
                }
            case 9:
                i iVar = (i) this.b;
                return Boolean.valueOf(i.d(iVar, (pv0) ((Pair) obj).getFirst()).equals(i.d(iVar, (pv0) ((Pair) obj2).getFirst())));
            case 10:
                yx1 yx1Var = (yx1) this.b;
                s221 s221Var = (s221) obj;
                return new hwu((qh41) yx1Var.a, s221Var.getChatRequest(), ((Boolean) obj2).booleanValue(), new o221(yx1Var, s221Var, i), new o221(yx1Var, s221Var, i2));
            case 11:
                ((tls) this.b).invoke(obj);
                return zy11.a;
            case 12:
                qk0 qk0Var = (qk0) this.b;
                l13 l13Var = (l13) obj;
                l13 l13Var2 = (l13) obj2;
                boolean z = l13Var.a;
                if (!z || l13Var2.a) {
                    if (z || !l13Var2.a) {
                        long j3 = l13Var.e;
                        long j4 = qk0Var.e;
                        long j5 = (j3 / j4) * j4;
                        long j6 = (l13Var2.e / j4) * j4;
                        r12 = j5 != j6 ? jl40.r(j6, j5) : jl40.q(l13Var2.d, l13Var.d);
                    } else {
                        r12 = 1;
                    }
                }
                return Integer.valueOf(r12);
            case 13:
                return new z5w(((it1) this.b).a(0, (int) (((k6w) obj).a >> 32), (LayoutDirection) obj2) << 32);
            case 14:
                return new z5w(((to5) this.b).a(0, (int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            default:
                return new z5w(((jt1) this.b).a(0L, ((k6w) obj).a, (LayoutDirection) obj2));
        }
    }
}
