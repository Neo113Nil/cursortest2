package defpackage;

import com.yandex.go.payments.shared.business.BusinessAccountFlowExperiment;
import com.yandex.go.payments.shared.business.onboarding.b;
import com.yandex.go.splash.data.dto.DynamicSplash;
import com.yandex.mapkit.transport.masstransit.LineAtStop;
import com.yandex.mapkit.transport.masstransit.ThreadAtStop;
import com.yandex.messaging.internal.entities.MediaFileMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.passport.api.d1;
import com.yandex.passport.internal.properties.BindPhoneProperties;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.f;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.masstransit.datasource.schedule.a;
import ru.yandex.taxi.masstransit.stop.interactor.g;

/* loaded from: classes15.dex */
public final /* synthetic */ class ec1 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ ec1(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.w = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        float intBitsToFloat;
        int i = this.a;
        float f = 0.0f;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        long j = this.b;
        Object obj2 = this.w;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                gc1.e((gc1) obj3, j, (String[]) obj2);
                return zy11Var;
            case 1:
                qam.j0((qam) obj, zoy0.A(scc.g(((m3u0) obj3).getValue(), ((m3u0) obj2).getValue()), 0.0f, 0.0f, 14), 0L, 0L, this.b, null, 246);
                return zy11Var;
            case 2:
                b bVar = (b) obj3;
                tls tlsVar = (tls) obj;
                c cVar = bVar.c;
                String str = ((BusinessAccountFlowExperiment) obj2).c.a;
                jx6 jx6Var = new jx6(0, tlsVar);
                long j2 = this.b;
                cVar.g(str, jx6Var, new kx6(tlsVar, bVar, j2, 0), new jx6(1, tlsVar), new zi(21), true);
                return new vg3(bVar, j2, i2);
            case 3:
                Long l = (Long) obj3;
                Long l2 = (Long) obj2;
                oll0 oll0Var = (oll0) obj;
                ull0 T02 = oll0Var.T0("UPDATE chats SET last_timestamp = ?, last_seq_no = ? WHERE chat_internal_id = ?");
                try {
                    if (l == null) {
                        T02.p(1);
                    } else {
                        T02.b(1, l.longValue());
                    }
                    if (l2 == null) {
                        T02.p(2);
                    } else {
                        T02.b(2, l2.longValue());
                    }
                    T02.b(3, j);
                    T02.q();
                    int x = jx81.x(oll0Var);
                    T02.close();
                    return Integer.valueOf(x);
                } finally {
                    T02.close();
                }
            case 4:
                qor qorVar = (qor) obj3;
                ve8 ve8Var = (ve8) obj2;
                float f2 = ve8Var.e;
                qam qamVar = (qam) obj;
                long j3 = this.b;
                long b = qorVar != null ? ldc.b(j3, qorVar.getFloatValue() * ldc.d(j3), 0.0f, 0.0f, 0.0f, 14) : j3;
                float f3 = -0.0f;
                if (f2 > 0.0f) {
                    qam.Y(qamVar, ve8Var.a, b, null, 60);
                    ((cot) qamVar.N().a).n(Float.intBitsToFloat((int) (qamVar.c() >> 32)), 0.0f);
                    try {
                        qam.Y(qamVar, ve8Var.b, b, null, 60);
                    } finally {
                    }
                }
                if (f2 > 0.0f) {
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                    ((cot) qamVar.N().a).n(0.0f, intBitsToFloat2);
                    try {
                        qam.Y(qamVar, ve8Var.c, b, null, 60);
                        ((cot) qamVar.N().a).n(f3, -intBitsToFloat2);
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (qamVar.c() >> 32));
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                        ((cot) qamVar.N().a).n(intBitsToFloat3, intBitsToFloat4);
                        try {
                            qam.Y(qamVar, ve8Var.d, b, null, 60);
                        } finally {
                            ((cot) qamVar.N().a).n(-intBitsToFloat3, -intBitsToFloat4);
                        }
                    } finally {
                    }
                }
                qam.t0(qamVar, b, 0L, qamVar.c(), 0.0f, null, 122);
                return zy11Var;
            case 5:
                ((com.yandex.go.splash.dynamic.c) obj3).e.a(j, ((DynamicSplash) obj2).a);
                return zy11Var;
            case 6:
                String str2 = (String) obj3;
                Integer num = (Integer) obj2;
                oll0 oll0Var2 = (oll0) obj;
                T0 = oll0Var2.T0("UPDATE messages_view SET data = ?, data_type = ? WHERE msg_internal_id = ?");
                try {
                    if (str2 == null) {
                        T0.p(1);
                    } else {
                        T0.g1(1, str2);
                    }
                    if (num == null) {
                        T0.p(2);
                    } else {
                        T0.b(2, num.intValue());
                    }
                    T0.b(3, j);
                    T0.q();
                    int x2 = jx81.x(oll0Var2);
                    T0.close();
                    return Integer.valueOf(x2);
                } finally {
                }
            case 7:
                return ((a) obj3).c.b((LineAtStop) obj2, (ThreadAtStop) obj, j);
            case 8:
                return ((g) obj3).c.b((LineAtStop) obj2, (ThreadAtStop) obj, j);
            case 9:
                BindPhoneProperties a = ((no90) obj3).c.a(j, (String) obj2);
                LoginProperties.a aVar = (LoginProperties.a) ((d1) obj);
                aVar.getClass();
                BindPhoneProperties.Companion.getClass();
                aVar.I = f.a(a);
                return zy11Var;
            case 10:
                p5l0 p5l0Var = (p5l0) obj3;
                ldc ldcVar = (ldc) obj2;
                qam qamVar2 = (qam) obj;
                boolean z = p5l0Var instanceof o5l0;
                if (z) {
                    f = Float.intBitsToFloat((int) (qamVar2.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f;
                } else if (!(p5l0Var instanceof n5l0) && !(p5l0Var instanceof m5l0)) {
                    w511.b();
                    return null;
                }
                if (z) {
                    intBitsToFloat = Float.intBitsToFloat((int) (qamVar2.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                } else if (p5l0Var instanceof n5l0) {
                    intBitsToFloat = Float.intBitsToFloat((int) (qamVar2.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                } else {
                    if (!(p5l0Var instanceof m5l0)) {
                        w511.b();
                        return null;
                    }
                    intBitsToFloat = Float.intBitsToFloat((int) (qamVar2.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f;
                }
                qamVar2.h(this.b, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar2.P() >> 32))) << 32) | (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar2.P() >> 32))) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), qamVar2.w0(r5l0.b), (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
                q5l0 b2 = p5l0Var.b();
                if (b2 != null) {
                    qamVar2.r(new a6t0(ldcVar != null ? ldcVar.a : ldc.m), qamVar2.P(), qamVar2.w0(b2.a.getSize()) / 2.0f);
                }
                return zy11Var;
            case 11:
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                oll0 oll0Var3 = (oll0) obj;
                T0 = oll0Var3.T0("UPDATE objects_to_share SET display_name = ? WHERE user_id = ? AND org_id = ?");
                try {
                    if (str3 == null) {
                        T0.p(1);
                    } else {
                        T0.g1(1, str3);
                    }
                    T0.g1(2, str4);
                    T0.b(3, j);
                    T0.q();
                    int x3 = jx81.x(oll0Var3);
                    T0.close();
                    return Integer.valueOf(x3);
                } finally {
                }
            default:
                String str5 = (String) obj3;
                ndz0 ndz0Var = (ndz0) obj2;
                yab yabVar = (yab) obj;
                long G = yabVar.G();
                MessageData R = yabVar.R();
                MediaFileMessageData mediaFileMessageData = R instanceof MediaFileMessageData ? (MediaFileMessageData) R : null;
                if (mediaFileMessageData == null) {
                    return Boolean.FALSE;
                }
                mediaFileMessageData.fileId = str5;
                String json2 = ndz0Var.p.toJson(mediaFileMessageData);
                ndz0Var.d.d(G, json2);
                az10 az10Var = ndz0Var.c;
                long j4 = this.b;
                ndz0Var.k.h(j4, alb1.j(az10Var, j4, G, json2));
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ ec1(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.b = j;
    }
}
