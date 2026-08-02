package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.n;
import com.yandex.go.loyalty.impl.common.data.c;
import com.yandex.go.payments.payment.AddPaymentModel$State;
import com.yandex.go.yb.api.domain.model.YbDepositType;
import com.yandex.go.yb.api.domain.model.YbSdkPaymentMethodInfo$ProductType;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;
import org.json.JSONArray;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes.dex */
public final class o370 implements htq0, vm11, p4z, eeb1, l2a1 {
    public final Object a;

    public o370(Context context, int i) {
        boolean isEmpty;
        switch (i) {
            case 25:
                rl60 rl60Var = new rl60(context, false);
                this.a = fi61.b(new qc20(fi61.b(new rfw0(rl60Var, fi61.b(qh61.a), new ums(rl60Var, yo71.a)))));
                return;
            default:
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                this.a = sharedPreferences;
                File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
                if (file.exists()) {
                    return;
                }
                try {
                    if (file.createNewFile()) {
                        synchronized (this) {
                            isEmpty = sharedPreferences.getAll().isEmpty();
                        }
                        if (isEmpty) {
                            return;
                        }
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        synchronized (this) {
                            sharedPreferences.edit().clear().commit();
                        }
                        return;
                    }
                    return;
                } catch (IOException unused) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    return;
                }
        }
    }

    @Override // defpackage.eeb1
    public void a(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        j jVar = (j) this.a;
        if (isEmpty) {
            ((g) jVar.b).D.getClass();
            jVar.Lg("auto", "_err", bundle, true, true, System.currentTimeMillis());
        } else {
            jVar.getClass();
            ny61.r("Unexpected call on client side");
        }
    }

    @Override // defpackage.htq0
    public void b(lfx lfxVar, tls tlsVar) {
        ((a) this.a).d(lfxVar, tlsVar, true);
    }

    @Override // defpackage.htq0
    public void c(lfx lfxVar, tls tlsVar) {
        ((a) this.a).h(lfxVar, tlsVar, true);
    }

    @Override // defpackage.p4z
    public boolean d(String str) {
        return ((r5d0) this.a).b(str);
    }

    @Override // defpackage.htq0
    public void e(lfx lfxVar, lfx lfxVar2, KSerializer kSerializer) {
        ((a) this.a).i(lfxVar, lfxVar2, kSerializer, true);
    }

    @Override // defpackage.htq0
    public void f(lfx lfxVar, tls tlsVar) {
        ((a) this.a).j(lfxVar, new lke(tlsVar), true);
    }

    @Override // defpackage.htq0
    public void g(lfx lfxVar, KSerializer kSerializer) {
        ((a) this.a).j(lfxVar, new kke(kSerializer), true);
    }

    @Override // defpackage.p4z
    public boolean h(String str) {
        return ((r5d0) this.a).a(str);
    }

    @Override // defpackage.p4z
    public void i(String str, boolean z, com.yandex.plus.home.feature.webviews.internal.settings.domain.a aVar) {
        qyy0.c(new yno(this, str, z, aVar));
    }

    @Override // defpackage.p4z
    public boolean j(String str) {
        ((r5d0) this.a).getClass();
        return "composite_payment.enabled".equals(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c6a0 k(nea0 nea0Var) {
        f731 f731Var;
        boolean a;
        u0k u0kVar = nea0Var.a;
        bw90 bw90Var = nea0Var.b;
        if ((u0kVar instanceof h8b0) || (u0kVar instanceof wxc) || jl40.l(bw90Var, xw91.C)) {
            if (u0kVar instanceof lea0) {
                lea0 lea0Var = (lea0) u0kVar;
                if ((lea0Var instanceof f731) && !(a = (f731Var = (f731) lea0Var).a())) {
                    if (!a) {
                        return new b6a0(f731Var);
                    }
                    w511.b();
                    return null;
                }
                return p(lea0Var);
            }
            if (!(u0kVar instanceof vi0)) {
                w511.b();
                return null;
            }
            vi0 vi0Var = (vi0) u0kVar;
            if (vi0Var instanceof mj0) {
                if (((mj0) vi0Var).e == AddPaymentModel$State.ENABLED) {
                    return new r5a0(vi0Var);
                }
            } else if (vi0Var instanceof mf0) {
                if (((mf0) vi0Var).b() == AddPaymentModel$State.ENABLED) {
                    return new r5a0(vi0Var);
                }
            } else if (vi0Var instanceof bg0) {
                if (((bg0) vi0Var).b() == AddPaymentModel$State.ENABLED) {
                    return new r5a0(vi0Var);
                }
            } else if (vi0Var instanceof df0) {
                if (((df0) vi0Var).b() == AddPaymentModel$State.ENABLED) {
                    return new r5a0(vi0Var);
                }
            } else if (vi0Var instanceof mk0) {
                if (((mk0) vi0Var).b() == AddPaymentModel$State.ENABLED) {
                    return new r5a0(vi0Var);
                }
            } else {
                if (!(vi0Var instanceof kd0)) {
                    return new r5a0(vi0Var);
                }
                if (((kd0) vi0Var).b() == AddPaymentModel$State.ENABLED) {
                    return new r5a0(vi0Var);
                }
            }
        }
        return t5a0.a;
    }

    public uv51 l(xf51 xf51Var) {
        YbSdkPaymentMethodInfo$ProductType ybSdkPaymentMethodInfo$ProductType;
        tv51 tv51Var;
        hst hstVar = jst.e;
        String str = xf51Var.c;
        tf51 tf51Var = xf51Var.f;
        Objects.toString(tf51Var);
        hstVar.getClass();
        wf51 wf51Var = xf51Var.g;
        tv51 tv51Var2 = wf51Var != null ? new tv51(wf51Var.a, wf51Var.b, wf51Var.c, false, wf51Var.d) : null;
        String str2 = xf51Var.b;
        String str3 = xf51Var.c;
        String str4 = xf51Var.d;
        mv51 h = tf51Var == null ? null : d0a1.h(tf51Var);
        int i = ow51.a[xf51Var.h.ordinal()];
        if (i == 1) {
            ybSdkPaymentMethodInfo$ProductType = YbSdkPaymentMethodInfo$ProductType.WALLET;
        } else if (i == 2) {
            ybSdkPaymentMethodInfo$ProductType = YbSdkPaymentMethodInfo$ProductType.PRO;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            ybSdkPaymentMethodInfo$ProductType = YbSdkPaymentMethodInfo$ProductType.CREDIT_LIMIT;
        }
        YbSdkPaymentMethodInfo$ProductType ybSdkPaymentMethodInfo$ProductType2 = ybSdkPaymentMethodInfo$ProductType;
        if (tv51Var2 != null) {
            String str5 = tf51Var != null ? tf51Var.b : null;
            String h2 = ((avj0) ((zuj0) this.a)).h(kyh0.payment_refill);
            if (str5 == null) {
                str5 = "";
            }
            tv51Var = new tv51(h2, h2, new zv51(str5, BigDecimal.ZERO, YbDepositType.EXACT_AMOUNT), false, null);
        } else {
            tv51Var = null;
        }
        return new uv51(str2, str3, str4, ybSdkPaymentMethodInfo$ProductType2, h, tv51Var2, tv51Var);
    }

    public ArrayList m(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(l((xf51) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0000 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00bb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(ArrayList arrayList) {
        u70 b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        while (true) {
            int size = arrayList.size() - 1;
            boolean z = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((u70) arrayList.get(size)).a != 8) {
                    z = true;
                } else if (z) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                return;
            }
            int i6 = size + 1;
            n370 n370Var = (n370) this.a;
            u70 u70Var = (u70) arrayList.get(size);
            u70 u70Var2 = (u70) arrayList.get(i6);
            int i7 = u70Var2.a;
            if (i7 != 1) {
                u70 u70Var3 = null;
                if (i7 == 2) {
                    int i8 = u70Var.b;
                    int i9 = u70Var.d;
                    int i10 = u70Var2.b;
                    if (i8 < i9) {
                        if (i10 == i8 && u70Var2.d == i9 - i8) {
                            i3 = 0;
                            r2 = 1;
                            if (i9 >= i10) {
                                u70Var2.b = i10 - 1;
                            } else {
                                int i11 = u70Var2.d;
                                if (i9 < i10 + i11) {
                                    u70Var2.d = i11 - 1;
                                    u70Var.a = 2;
                                    u70Var.d = 1;
                                    if (u70Var2.d == 0) {
                                        arrayList.remove(i6);
                                        n370Var.a(u70Var2);
                                    }
                                }
                            }
                            i4 = u70Var.b;
                            i5 = u70Var2.b;
                            if (i4 > i5) {
                                u70Var2.b = i5 + 1;
                            } else {
                                int i12 = i5 + u70Var2.d;
                                if (i4 < i12) {
                                    u70Var3 = n370Var.b(2, null, i4 + 1, i12 - i4);
                                    u70Var2.d = u70Var.b - u70Var2.b;
                                }
                            }
                            if (r2 == 0) {
                                arrayList.set(size, u70Var2);
                                arrayList.remove(i6);
                                n370Var.a(u70Var);
                            } else {
                                if (i3 != 0) {
                                    if (u70Var3 != null) {
                                        int i13 = u70Var.b;
                                        if (i13 > u70Var3.b) {
                                            u70Var.b = i13 - u70Var3.d;
                                        }
                                        int i14 = u70Var.d;
                                        if (i14 > u70Var3.b) {
                                            u70Var.d = i14 - u70Var3.d;
                                        }
                                    }
                                    int i15 = u70Var.b;
                                    if (i15 > u70Var2.b) {
                                        u70Var.b = i15 - u70Var2.d;
                                    }
                                    int i16 = u70Var.d;
                                    if (i16 > u70Var2.b) {
                                        u70Var.d = i16 - u70Var2.d;
                                    }
                                } else {
                                    if (u70Var3 != null) {
                                        int i17 = u70Var.b;
                                        if (i17 >= u70Var3.b) {
                                            u70Var.b = i17 - u70Var3.d;
                                        }
                                        int i18 = u70Var.d;
                                        if (i18 >= u70Var3.b) {
                                            u70Var.d = i18 - u70Var3.d;
                                        }
                                    }
                                    int i19 = u70Var.b;
                                    if (i19 >= u70Var2.b) {
                                        u70Var.b = i19 - u70Var2.d;
                                    }
                                    int i20 = u70Var.d;
                                    if (i20 >= u70Var2.b) {
                                        u70Var.d = i20 - u70Var2.d;
                                    }
                                }
                                arrayList.set(size, u70Var2);
                                if (u70Var.b != u70Var.d) {
                                    arrayList.set(i6, u70Var);
                                } else {
                                    arrayList.remove(i6);
                                }
                                if (u70Var3 != null) {
                                    arrayList.add(size, u70Var3);
                                }
                            }
                        }
                        i3 = r2;
                        if (i9 >= i10) {
                        }
                        i4 = u70Var.b;
                        i5 = u70Var2.b;
                        if (i4 > i5) {
                        }
                        if (r2 == 0) {
                        }
                    } else if (i10 == i9 + 1 && u70Var2.d == i8 - i9) {
                        r2 = 1;
                        i3 = r2;
                        if (i9 >= i10) {
                        }
                        i4 = u70Var.b;
                        i5 = u70Var2.b;
                        if (i4 > i5) {
                        }
                        if (r2 == 0) {
                        }
                    } else {
                        i3 = 1;
                        if (i9 >= i10) {
                        }
                        i4 = u70Var.b;
                        i5 = u70Var2.b;
                        if (i4 > i5) {
                        }
                        if (r2 == 0) {
                        }
                    }
                } else if (i7 == 4) {
                    int i21 = u70Var.d;
                    int i22 = u70Var2.b;
                    if (i21 < i22) {
                        u70Var2.b = i22 - 1;
                    } else {
                        int i23 = u70Var2.d;
                        if (i21 < i22 + i23) {
                            u70Var2.d = i23 - 1;
                            b = n370Var.b(4, u70Var2.c, u70Var.b, 1);
                            i = u70Var.b;
                            i2 = u70Var2.b;
                            if (i > i2) {
                                u70Var2.b = i2 + 1;
                            } else {
                                int i24 = i2 + u70Var2.d;
                                if (i < i24) {
                                    int i25 = i24 - i;
                                    u70Var3 = n370Var.b(4, u70Var2.c, i + 1, i25);
                                    u70Var2.d -= i25;
                                }
                            }
                            arrayList.set(i6, u70Var);
                            if (u70Var2.d <= 0) {
                                arrayList.set(size, u70Var2);
                            } else {
                                arrayList.remove(size);
                                n370Var.a(u70Var2);
                            }
                            if (b != null) {
                                arrayList.add(size, b);
                            }
                            if (u70Var3 == null) {
                                arrayList.add(size, u70Var3);
                            }
                        }
                    }
                    b = null;
                    i = u70Var.b;
                    i2 = u70Var2.b;
                    if (i > i2) {
                    }
                    arrayList.set(i6, u70Var);
                    if (u70Var2.d <= 0) {
                    }
                    if (b != null) {
                    }
                    if (u70Var3 == null) {
                    }
                }
            } else {
                int i26 = u70Var.d;
                int i27 = u70Var2.b;
                r2 = i26 < i27 ? -1 : 0;
                int i28 = u70Var.b;
                if (i28 < i27) {
                    r2++;
                }
                if (i27 <= i28) {
                    u70Var.b = i28 + u70Var2.d;
                }
                int i29 = u70Var2.b;
                if (i29 <= i26) {
                    u70Var.d = i26 + u70Var2.d;
                }
                u70Var2.b = i29 + r2;
                arrayList.set(size, u70Var2);
                arrayList.set(i6, u70Var);
            }
        }
    }

    @Override // defpackage.l2a1
    public /* synthetic */ void o(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((n) this.a).v(str, i, th, bArr, map);
    }

    public c6a0 p(lea0 lea0Var) {
        Object obj;
        if (lea0Var instanceof wxc) {
            wxc wxcVar = (wxc) lea0Var;
            Iterator it = ((c) this.a).a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((evz) obj).getId(), wxcVar.a)) {
                    break;
                }
            }
            evz evzVar = (evz) obj;
            if (evzVar != null && fhb1.b(evzVar)) {
                return new z5a0(wxcVar);
            }
        } else {
            if (!(lea0Var instanceof h8b0)) {
                return new z5a0(lea0Var);
            }
            h8b0 h8b0Var = (h8b0) lea0Var;
            g8b0 g8b0Var = h8b0Var.j;
            if (g8b0Var instanceof f8b0) {
                return u5a0.a;
            }
            if (h8b0Var.f() && g8b0Var == null) {
                return new z5a0(h8b0Var);
            }
        }
        return t5a0.a;
    }

    @Override // defpackage.vm11
    public Object q() {
        return (JSONArray) this.a;
    }

    public synchronized void r(Context context, HashSet hashSet) {
        AssetManager assets = context.getAssets();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Integer) ora1.h(assets, "addAssetPath", Integer.class, String.class, ((File) it.next()).getPath())).intValue();
        }
    }

    @Override // defpackage.vm11
    public boolean t(Object obj) {
        return obj instanceof JSONArray;
    }

    public o370(yvi0 yvi0Var, lb7 lb7Var) {
        this.a = lb7Var;
        ((e) yvi0Var.a).d(new cr91(this));
    }

    public o370(d311 d311Var, g3y g3yVar) {
        this.a = g3yVar;
    }

    public o370(String str, String str2, String str3, PayEvgenSubscriptionState payEvgenSubscriptionState, String str4, String str5, String str6, String str7, String str8) {
        this.a = b.i(new Pair(CommonUrlParts.APP_ID, str), new Pair(StartupRequest.PARAM_APP_VERSION, str2), new Pair(Constants.KEY_SERVICE, str3), new Pair("sdk_version", "110.0.2"), new Pair("subscription_state", payEvgenSubscriptionState.getEventValue()), new Pair("testids", str4), new Pair("triggered_testids", str5), new Pair("puid", str6), new Pair("log_session_id", str7), new Pair("language", str8));
    }

    public /* synthetic */ o370(Object obj) {
        this.a = obj;
    }

    public o370() {
        this.a = new JSONArray();
    }

    public o370(long[] jArr) {
        fy40 fy40Var;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            fy40Var = new fy40(copyOf.length);
            int i = fy40Var.b;
            if (i >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i;
                    long[] jArr2 = fy40Var.a;
                    if (jArr2.length < length) {
                        fy40Var.a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = fy40Var.a;
                    int i2 = fy40Var.b;
                    if (i != i2) {
                        f73.f(jArr3, jArr3, copyOf.length + i, i, i2);
                    }
                    f73.k(copyOf, i, jArr3);
                    fy40Var.b += copyOf.length;
                }
            } else {
                xva1.d("");
                throw null;
            }
        } else {
            fy40Var = new fy40((Object) null);
        }
        this.a = fy40Var;
    }
}
