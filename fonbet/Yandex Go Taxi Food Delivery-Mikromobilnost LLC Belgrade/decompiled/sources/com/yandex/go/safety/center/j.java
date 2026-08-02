package com.yandex.go.safety.center;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import com.yandex.go.safety.center.api.AccidentsResponse;
import com.yandex.go.safety.center.api.SafetyCenterConfig;
import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.api.ShareResponse;
import com.yandex.go.safety.center.api.SharingType;
import com.yandex.go.safety.center.api.TrustedContact;
import com.yandex.go.safety.center.api.TrustedContacts;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.model.PresentationContact$Mode;
import com.yandex.go.safety.center.share.notification.ShareStatus;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import defpackage.a60;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.cne0;
import defpackage.cog;
import defpackage.czo0;
import defpackage.dne0;
import defpackage.dvw;
import defpackage.ffx;
import defpackage.hbp0;
import defpackage.itl0;
import defpackage.j18;
import defpackage.j73;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mo21;
import defpackage.n20;
import defpackage.ntl0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.ow7;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qw7;
import defpackage.sjh;
import defpackage.swe0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vjr0;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.y50;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes13.dex */
public final class j {
    public final r0 A;
    public final r0 B;
    public final SafetyCenterApi a;
    public final cog b;
    public final n20 c;
    public final itl0 d;
    public final ru.yandex.taxi.launch.c e;
    public final SafetyCenterExperiment f;
    public final y50 g;
    public final vjr0 h;
    public final ow7 i;
    public final tt2 j;
    public final com.yandex.go.taxi.order.provider.a k;
    public final wnt l;
    public final cne0 m;
    public final hbp0 n;
    public final r0 o;
    public final r0 p;
    public final r0 q;
    public int r;
    public ArrayList s;
    public volatile boolean t;
    public final n0 u;
    public final n0 v;
    public pzt0 w;
    public final UUID x;
    public final HashMap y;
    public final r0 z;

    public j(SafetyCenterApi safetyCenterApi, cog cogVar, n20 n20Var, itl0 itl0Var, ru.yandex.taxi.launch.c cVar, SafetyCenterExperiment safetyCenterExperiment, y50 y50Var, vjr0 vjr0Var, ow7 ow7Var, tt2 tt2Var, com.yandex.go.taxi.order.provider.a aVar, wnt wntVar, dne0 dne0Var) {
        this.a = safetyCenterApi;
        this.b = cogVar;
        this.c = n20Var;
        this.d = itl0Var;
        this.e = cVar;
        this.f = safetyCenterExperiment;
        this.g = y50Var;
        this.h = vjr0Var;
        this.i = ow7Var;
        this.j = tt2Var;
        this.k = aVar;
        this.l = wntVar;
        cne0 a = dne0Var.a("SafetyCenterProvider");
        this.m = a;
        hbp0 hbp0Var = new hbp0(new czo0(14), "SafetyCenterProvider", null);
        hbp0Var.a();
        this.n = hbp0Var;
        r0 c = bvf0.c(null);
        this.o = c;
        Boolean bool = Boolean.FALSE;
        r0 c2 = bvf0.c(bool);
        this.p = c2;
        this.q = c2;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.u = ffx.b(0, 1, bufferOverflow);
        this.v = ffx.b(0, 1, bufferOverflow);
        this.x = UUID.randomUUID();
        this.y = new HashMap();
        this.z = bvf0.c(bool);
        r0 c3 = bvf0.c(EmptyList.a);
        this.A = c3;
        this.B = c3;
        safetyCenterExperiment.q.put((EnumMap) SafetyCenterExperiment.L10nTemplateParam.PHONE, (SafetyCenterExperiment.L10nTemplateParam) safetyCenterExperiment.g.a);
        String l = a.l("cached_config", null);
        if (l != null) {
            try {
                c.m(null, new Result((SafetyCenterConfig) ((xnt) wntVar).c(l, SafetyCenterConfig.Companion.serializer())));
            } catch (Exception e) {
                jst.e.k(e, "Failed to load cached config");
            }
        }
        i iVar = new i(new g(this.z, this), this);
        this.j.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.n, null, null, new SafetyCenterProvider$launch$$inlined$safeCollectIn$1(new kotlinx.coroutines.flow.n(com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.F(iVar, mdh.b), new SafetyCenterProvider$launch$3(this, null)), new SafetyCenterProvider$launch$4(this, null)), null, this), 3);
    }

    public static ArrayList c(TrustedContacts trustedContacts) {
        ArrayList arrayList = new ArrayList();
        for (TrustedContact trustedContact : trustedContacts.a) {
            arrayList.add(new swe0(trustedContact.a, trustedContact.b, PresentationContact$Mode.NORMAL));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r6.e.d(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SafetyCenterProvider$accident$1 safetyCenterProvider$accident$1;
        int i;
        if (continuationImpl instanceof SafetyCenterProvider$accident$1) {
            safetyCenterProvider$accident$1 = (SafetyCenterProvider$accident$1) continuationImpl;
            int i2 = safetyCenterProvider$accident$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterProvider$accident$1.label = i2 - Integer.MIN_VALUE;
                Object obj = safetyCenterProvider$accident$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterProvider$accident$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    safetyCenterProvider$accident$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return (AccidentsResponse.Accident) ((AccidentsResponse) obj).b.getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.j.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                SafetyCenterProvider$accident$res$1 safetyCenterProvider$accident$res$1 = new SafetyCenterProvider$accident$res$1(this, null);
                safetyCenterProvider$accident$1.label = 2;
                obj = tje.k0(mdhVar, safetyCenterProvider$accident$res$1, safetyCenterProvider$accident$1);
            }
        }
        safetyCenterProvider$accident$1 = new SafetyCenterProvider$accident$1(this, continuationImpl);
        Object obj2 = safetyCenterProvider$accident$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterProvider$accident$1.label;
        if (i != 0) {
        }
        this.j.getClass();
        sjh sjhVar2 = uyj.a;
        mdh mdhVar2 = mdh.b;
        SafetyCenterProvider$accident$res$1 safetyCenterProvider$accident$res$12 = new SafetyCenterProvider$accident$res$1(this, null);
        safetyCenterProvider$accident$1.label = 2;
        obj2 = tje.k0(mdhVar2, safetyCenterProvider$accident$res$12, safetyCenterProvider$accident$1);
    }

    public final kotlinx.coroutines.flow.k b() {
        return new kotlinx.coroutines.flow.k(com.yandex.go.coroutines.b.d(new kotlinx.coroutines.flow.n(this.u, new SafetyCenterProvider$contactsObservable$1(this, null)), new SafetyCenterProvider$contactsObservable$2(this, null)), new SafetyCenterProvider$contactsObservable$3(this, null));
    }

    public final SafetyCenterConfig d() {
        Result result = (Result) this.o.getValue();
        if (result == null) {
            return null;
        }
        Object value = result.getValue();
        return (SafetyCenterConfig) (value instanceof Result.Failure ? null : value);
    }

    public final String e() {
        o2y0 u = ((com.yandex.go.taxi.order.provider.a) this.c).u();
        if (u == null || !u.e()) {
            return null;
        }
        try {
            return String.format(this.f.a(SafetyCenterExperiment.L10nKey.SHARE_SCREEN_SEND_OTHER_SMS_TEMPLATE), Arrays.copyOf(new Object[]{u.b().V().B}, 1));
        } catch (Throwable th) {
            jst.e.k(th, "Can not format route url to share");
            return u.b().V().B;
        }
    }

    public final List f() {
        ArrayList arrayList = this.s;
        SafetyCenterConfig d = d();
        return (arrayList != null || d == null) ? arrayList == null ? EmptyList.a : arrayList : c((TrustedContacts) d.d.getValue());
    }

    public final void g(TrustedContacts trustedContacts) {
        this.r = trustedContacts.b;
        ArrayList c = c(trustedContacts);
        this.s = c;
        this.u.g(c);
    }

    public final boolean h() {
        SafetyCenterConfig d = d();
        return d != null && d.a.c == SharingType.BUTTON;
    }

    public final void i(PresentationContact$Mode presentationContact$Mode) {
        ArrayList arrayList = new ArrayList(f());
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                swe0 swe0Var = (swe0) arrayList.get(size);
                PresentationContact$Mode presentationContact$Mode2 = swe0Var.c;
                PresentationContact$Mode presentationContact$Mode3 = PresentationContact$Mode.NORMAL;
                if (presentationContact$Mode2 != presentationContact$Mode3) {
                    arrayList.remove(size);
                    if (swe0Var.c == presentationContact$Mode) {
                        arrayList.add(size, new swe0(swe0Var.a, swe0Var.b, presentationContact$Mode3));
                    }
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        this.s = arrayList;
        this.u.g(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f0, code lost:
    
        if (r5.s() == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f2, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        if (r1 == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0061, code lost:
    
        if (r1 == r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        SafetyCenterProvider$orderCancelByAccident$1 safetyCenterProvider$orderCancelByAccident$1;
        int i;
        o2y0 o2y0Var;
        if (continuationImpl instanceof SafetyCenterProvider$orderCancelByAccident$1) {
            safetyCenterProvider$orderCancelByAccident$1 = (SafetyCenterProvider$orderCancelByAccident$1) continuationImpl;
            int i2 = safetyCenterProvider$orderCancelByAccident$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterProvider$orderCancelByAccident$1.label = i2 - Integer.MIN_VALUE;
                Object obj = safetyCenterProvider$orderCancelByAccident$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterProvider$orderCancelByAccident$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n20 n20Var = this.c;
                    String str = this.d.b;
                    if (str == null) {
                        ny61.r("Required value was null.");
                        return null;
                    }
                    safetyCenterProvider$orderCancelByAccident$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) n20Var).m(str, safetyCenterProvider$orderCancelByAccident$1);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    o2y0Var = (o2y0) safetyCenterProvider$orderCancelByAccident$1.L$0;
                    kotlin.b.b(obj);
                    String str2 = (String) obj;
                    safetyCenterProvider$orderCancelByAccident$1.L$0 = o2y0Var;
                    safetyCenterProvider$orderCancelByAccident$1.L$1 = str2;
                    safetyCenterProvider$orderCancelByAccident$1.label = 3;
                    j18 j18Var = new j18(1, dvw.b(safetyCenterProvider$orderCancelByAccident$1));
                    j18Var.u();
                    ((qw7) this.i).b(str2, o2y0Var.b(), OrderStatusParam.Break.ACCIDENT, new e(this, j18Var));
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null) {
                    ny61.r("No order to cancel");
                    return null;
                }
                TaxiOrder b = o2y0Var.b();
                b.getClass();
                synchronized (b) {
                    TaxiOrderLocalData taxiOrderLocalData = b.l;
                    taxiOrderLocalData.getClass();
                    b.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -33, 16777215);
                }
                ru.yandex.taxi.launch.c cVar = this.e;
                safetyCenterProvider$orderCancelByAccident$1.L$0 = o2y0Var;
                safetyCenterProvider$orderCancelByAccident$1.label = 2;
                obj = cVar.c(safetyCenterProvider$orderCancelByAccident$1);
            }
        }
        safetyCenterProvider$orderCancelByAccident$1 = new SafetyCenterProvider$orderCancelByAccident$1(this, continuationImpl);
        Object obj2 = safetyCenterProvider$orderCancelByAccident$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterProvider$orderCancelByAccident$1.label;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (defpackage.tje.k0(r8, r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r6.e.d(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, ContinuationImpl continuationImpl, boolean z) {
        SafetyCenterProvider$setAccidentStatus$1 safetyCenterProvider$setAccidentStatus$1;
        int i;
        if (continuationImpl instanceof SafetyCenterProvider$setAccidentStatus$1) {
            safetyCenterProvider$setAccidentStatus$1 = (SafetyCenterProvider$setAccidentStatus$1) continuationImpl;
            int i2 = safetyCenterProvider$setAccidentStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterProvider$setAccidentStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = safetyCenterProvider$setAccidentStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterProvider$setAccidentStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    safetyCenterProvider$setAccidentStatus$1.L$0 = str;
                    safetyCenterProvider$setAccidentStatus$1.Z$0 = z;
                    safetyCenterProvider$setAccidentStatus$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    z = safetyCenterProvider$setAccidentStatus$1.Z$0;
                    str = (String) safetyCenterProvider$setAccidentStatus$1.L$0;
                    kotlin.b.b(obj);
                }
                this.j.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                SafetyCenterProvider$setAccidentStatus$2 safetyCenterProvider$setAccidentStatus$2 = new SafetyCenterProvider$setAccidentStatus$2(this, str, z, null);
                safetyCenterProvider$setAccidentStatus$1.L$0 = null;
                safetyCenterProvider$setAccidentStatus$1.Z$0 = z;
                safetyCenterProvider$setAccidentStatus$1.label = 2;
            }
        }
        safetyCenterProvider$setAccidentStatus$1 = new SafetyCenterProvider$setAccidentStatus$1(this, continuationImpl);
        Object obj2 = safetyCenterProvider$setAccidentStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterProvider$setAccidentStatus$1.label;
        if (i != 0) {
        }
        this.j.getClass();
        sjh sjhVar2 = uyj.a;
        mdh mdhVar2 = mdh.b;
        SafetyCenterProvider$setAccidentStatus$2 safetyCenterProvider$setAccidentStatus$22 = new SafetyCenterProvider$setAccidentStatus$2(this, str, z, null);
        safetyCenterProvider$setAccidentStatus$1.L$0 = null;
        safetyCenterProvider$setAccidentStatus$1.Z$0 = z;
        safetyCenterProvider$setAccidentStatus$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r6.e.d(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(ShareRequestParam shareRequestParam, ContinuationImpl continuationImpl) {
        SafetyCenterProvider$share$1 safetyCenterProvider$share$1;
        int i;
        if (continuationImpl instanceof SafetyCenterProvider$share$1) {
            safetyCenterProvider$share$1 = (SafetyCenterProvider$share$1) continuationImpl;
            int i2 = safetyCenterProvider$share$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterProvider$share$1.label = i2 - Integer.MIN_VALUE;
                Object obj = safetyCenterProvider$share$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterProvider$share$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    safetyCenterProvider$share$1.L$0 = shareRequestParam;
                    safetyCenterProvider$share$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    shareRequestParam = (ShareRequestParam) safetyCenterProvider$share$1.L$0;
                    kotlin.b.b(obj);
                }
                cmt<ShareResponse> g = this.a.g(shareRequestParam);
                safetyCenterProvider$share$1.L$0 = null;
                safetyCenterProvider$share$1.label = 2;
                Object a = ru.yandex.taxi.network.api.a.a(g, null, safetyCenterProvider$share$1);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        safetyCenterProvider$share$1 = new SafetyCenterProvider$share$1(this, continuationImpl);
        Object obj2 = safetyCenterProvider$share$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterProvider$share$1.label;
        if (i != 0) {
        }
        cmt<ShareResponse> g2 = this.a.g(shareRequestParam);
        safetyCenterProvider$share$1.L$0 = null;
        safetyCenterProvider$share$1.label = 2;
        Object a2 = ru.yandex.taxi.network.api.a.a(g2, null, safetyCenterProvider$share$1);
        if (a2 != coroutineSingletons2) {
        }
    }

    public final void m(String str, List list) {
        String[] strArr = (String[]) list.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        ComponentActivity componentActivity = ((a60) this.g).a;
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("smsto:".concat(j73.L(strArr3, ";", null, null, 62))));
        intent.putExtra("sms_body", str);
        if (componentActivity == null) {
            intent.setFlags(SelfTester_JCP.IMITA);
        }
        if (intent.resolveActivity(componentActivity.getPackageManager()) != null) {
            componentActivity.startActivity(intent);
        }
    }

    public final ShareRequestParam n(mo21 mo21Var, ShareRequestParam.NotificationType notificationType, List list) {
        return new ShareRequestParam(notificationType, list, this.x.toString(), this.d.b, mo21Var != null ? Float.valueOf(mo21Var.c) : null, mo21Var != null ? mo21Var.a() : null);
    }

    public final ntl0 o(ShareRequestParam shareRequestParam) {
        pz40 pz40Var;
        HashMap hashMap = this.y;
        ntl0 ntl0Var = (ntl0) hashMap.get(shareRequestParam);
        if (ntl0Var == null) {
            pz40Var = bvf0.c(ShareStatus.PREPARING);
        } else {
            ntl0Var.a.a(null);
            pz40Var = ntl0Var.b;
        }
        pz40 pz40Var2 = pz40Var;
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        ntl0 ntl0Var2 = new ntl0(tje.N(this.n.c(), null, null, new SafetyCenterProvider$startShareSession$job$1(pz40Var2, this, b, shareRequestParam, null), 3), pz40Var2, b);
        hashMap.put(shareRequestParam, ntl0Var2);
        return ntl0Var2;
    }

    public final void p(ArrayList arrayList) {
        pzt0 pzt0Var = this.w;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.s = arrayList;
        this.u.g(arrayList);
        this.w = tje.N(this.n.c(), null, null, new SafetyCenterProvider$updateContacts$1(this, arrayList, null), 3);
    }
}
