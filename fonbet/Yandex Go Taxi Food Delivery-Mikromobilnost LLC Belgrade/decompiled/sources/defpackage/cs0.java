package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import androidx.compose.ui.draw.b;
import java.util.ArrayList;
import kotlin.Result;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class cs0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ cs0(long j, int i) {
        this.a = i;
        this.b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Boolean bool;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        r14 = false;
        boolean z = false;
        long j = this.b;
        switch (i) {
            case 0:
                c1y c1yVar = (c1y) obj;
                float w0 = c1yVar.w0(16.0f);
                qam.g0(c1yVar, this.b, 0L, 0L, (Float.floatToRawIntBits(w0) << 32) | (Float.floatToRawIntBits(w0) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), null, 246);
                c1yVar.a();
                return zy11Var;
            case 1:
                oll0 oll0Var = (oll0) obj;
                ull0 T0 = oll0Var.T0("DELETE FROM admins WHERE internal_chat_id = ?");
                try {
                    T0.b(1, j);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 2:
                ull0 T02 = ((oll0) obj).T0("SELECT user_id FROM admins WHERE internal_chat_id = ? ORDER BY sort_order");
                try {
                    T02.b(1, j);
                    ArrayList arrayList = new ArrayList();
                    while (T02.q()) {
                        arrayList.add(T02.Y1(0));
                    }
                    return arrayList;
                } finally {
                }
            case 3:
                long j2 = this.b;
                qam qamVar = (qam) obj;
                float w02 = qamVar.w0(64.0f) / 2.0f;
                float c = cjs0.c(qamVar.c()) / 2.0f;
                i28 q = qamVar.N().q();
                try {
                    q.s(wwg.b(0L, qamVar.c()), new eb2());
                    qam.z(qamVar, j2, c, 0L, 0.0f, null, 0, HProv.PP_SAME_MEDIA);
                    qam.z(qamVar, ldc.l, w02, 0L, 0.0f, null, 0, 60);
                    return zy11Var;
                } finally {
                    q.n();
                }
            case 4:
                qam qamVar2 = (qam) obj;
                float w03 = qamVar2.w0(8.0f);
                long c2 = qamVar2.c();
                long j3 = this.b;
                qam.K(qamVar2, j3, 0L, c2, null, 122);
                long floatToRawIntBits = (Float.floatToRawIntBits(w03) << 32) | (Float.floatToRawIntBits(w03) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float f = w03 * 2.0f;
                qam.K(qamVar2, j3, floatToRawIntBits, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar2.c() >> 32)) - f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar2.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), null, 120);
                return zy11Var;
            case 5:
                b bVar = (b) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (bVar.a.c() >> 32)) / 2.0f;
                return bVar.b(new b92(intBitsToFloat, pva1.e(bVar, intBitsToFloat), new c36(j, 5), r14 ? 1 : 0));
            case 6:
                if (((Result) obj).getValue() instanceof Result.Failure) {
                    Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j);
                }
                return zy11Var;
            case 7:
                qam qamVar3 = (qam) obj;
                qam.z(qamVar3, this.b, qamVar3.w0(4.0f), 0L, 0.0f, null, 0, HProv.PP_SAME_MEDIA);
                return zy11Var;
            case 8:
                ull0 T03 = ((oll0) obj).T0("SELECT timeline_version FROM cache_timeline_versions WHERE chat_internal_id = ?");
                try {
                    T03.b(1, j);
                    if (T03.q() && !T03.isNull(0)) {
                        r13 = Long.valueOf(T03.getLong(0));
                    }
                    return r13;
                } finally {
                }
            case 9:
                qam qamVar4 = (qam) obj;
                jb2 a = nb2.a();
                a.m(Float.intBitsToFloat((int) (qamVar4.c() >> 32)) / 2.0f, 0.0f);
                a.l(Float.intBitsToFloat((int) (qamVar4.c() >> 32)), Float.intBitsToFloat((int) (qamVar4.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                a.l(0.0f, Float.intBitsToFloat((int) (qamVar4.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                a.g();
                qam.Y(qamVar4, a, this.b, null, 60);
                return zy11Var;
            case 10:
                qam qamVar5 = (qam) obj;
                jb2 a2 = nb2.a();
                a2.m(Float.intBitsToFloat((int) (qamVar5.c() >> 32)) / 2.0f, 0.0f);
                a2.l(Float.intBitsToFloat((int) (qamVar5.c() >> 32)), Float.intBitsToFloat((int) (qamVar5.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f);
                a2.l(Float.intBitsToFloat((int) (qamVar5.c() >> 32)) / 2.0f, Float.intBitsToFloat((int) (qamVar5.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                a2.l(0.0f, Float.intBitsToFloat((int) (qamVar5.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f);
                a2.g();
                qam.Y(qamVar5, a2, this.b, null, 60);
                return zy11Var;
            case 11:
                if (((Result) obj).getValue() instanceof Result.Failure) {
                    Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j);
                }
                return zy11Var;
            case 12:
                qam qamVar6 = (qam) obj;
                i28 q2 = qamVar6.N().q();
                Paint paint = new Paint();
                paint.setColor(rzo.X(j));
                paint.setMaskFilter(new BlurMaskFilter(96.0f, BlurMaskFilter.Blur.NORMAL));
                Canvas canvas = t72.a;
                ((s72) q2).a.drawOval(-250.0f, -80.0f, Float.intBitsToFloat((int) (qamVar6.c() >> 32)) * 0.8f, Float.intBitsToFloat((int) (qamVar6.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + 80.0f, paint);
                return zy11Var;
            case 13:
                qam qamVar7 = (qam) obj;
                i28 q3 = qamVar7.N().q();
                float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar7.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * 0.83f;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (qamVar7.c() >> 32)) * 1.5f;
                float intBitsToFloat4 = Float.intBitsToFloat((int) (qamVar7.c() >> 32)) / 2.0f;
                Paint paint2 = new Paint();
                paint2.setColor(rzo.X(j));
                paint2.setMaskFilter(new BlurMaskFilter(intBitsToFloat2, BlurMaskFilter.Blur.NORMAL));
                Canvas canvas2 = t72.a;
                ((s72) q3).a.drawOval(intBitsToFloat4 - intBitsToFloat3, 50.0f, intBitsToFloat4 + intBitsToFloat3, Float.intBitsToFloat((int) (qamVar7.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * 4.0f, paint2);
                return zy11Var;
            case 14:
                ull0 T04 = ((oll0) obj).T0("SELECT edit_history_client_max_timestamp FROM cache_chat_edit_history_timestamps where chat_internal_id = ?");
                try {
                    T04.b(1, j);
                    if (T04.q() && !T04.isNull(0)) {
                        r13 = Long.valueOf(T04.getLong(0));
                    }
                    return r13;
                } finally {
                }
            case 15:
                ull0 T05 = ((oll0) obj).T0("SELECT * FROM cache_chat_edit_history_timestamps where chat_internal_id = ?");
                try {
                    T05.b(1, j);
                    return T05.q() ? new l2b(T05.getLong(eja1.r(T05, "chat_internal_id")), T05.getLong(eja1.r(T05, "edit_history_server_max_timestamp")), T05.getLong(eja1.r(T05, "edit_history_client_max_timestamp"))) : null;
                } finally {
                }
            case 16:
                ull0 T06 = ((oll0) obj).T0("SELECT edit_history_server_max_timestamp FROM cache_chat_edit_history_timestamps where chat_internal_id = ?");
                try {
                    T06.b(1, j);
                    if (T06.q() && !T06.isNull(0)) {
                        r13 = Long.valueOf(T06.getLong(0));
                    }
                    return r13;
                } finally {
                }
            case 17:
                ull0 T07 = ((oll0) obj).T0("SELECT * FROM chat_events WHERE chat_internal_id = ?");
                try {
                    T07.b(1, j);
                    return T07.q() ? new w2b(T07.getLong(eja1.r(T07, "chat_internal_id")), T07.getLong(eja1.r(T07, "events")), T07.getLong(eja1.r(T07, "version"))) : null;
                } finally {
                }
            case 18:
                ull0 T08 = ((oll0) obj).T0("SELECT version FROM chat_events WHERE chat_internal_id = ?");
                try {
                    T08.b(1, j);
                    if (T08.q() && !T08.isNull(0)) {
                        r13 = Long.valueOf(T08.getLong(0));
                    }
                    return r13;
                } finally {
                }
            case 19:
                oll0 oll0Var2 = (oll0) obj;
                ull0 T09 = oll0Var2.T0("DELETE FROM chat_events WHERE chat_internal_id = ?");
                try {
                    T09.b(1, j);
                    T09.q();
                    int x2 = jx81.x(oll0Var2);
                    T09.close();
                    return Integer.valueOf(x2);
                } finally {
                }
            case 20:
                oll0 oll0Var3 = (oll0) obj;
                ull0 T010 = oll0Var3.T0("DELETE FROM chat_metadata WHERE chat_internal_id = ?");
                try {
                    T010.b(1, j);
                    T010.q();
                    int x3 = jx81.x(oll0Var3);
                    T010.close();
                    return Integer.valueOf(x3);
                } finally {
                }
            case 21:
                ull0 T011 = ((oll0) obj).T0("SELECT * FROM chat_metadata WHERE chat_internal_id = ?");
                try {
                    T011.b(1, j);
                    int r = eja1.r(T011, "chat_internal_id");
                    int r2 = eja1.r(T011, "chatbar");
                    int r3 = eja1.r(T011, "calls_settings");
                    int r4 = eja1.r(T011, "complain_action");
                    int r5 = eja1.r(T011, "miniapp_url");
                    int r6 = eja1.r(T011, "allow_unsafe_miniapp");
                    int r7 = eja1.r(T011, "view_importants_list");
                    if (T011.q()) {
                        long j4 = T011.getLong(r);
                        byte[] blob = T011.isNull(r2) ? null : T011.getBlob(r2);
                        byte[] blob2 = T011.isNull(r3) ? null : T011.getBlob(r3);
                        byte[] blob3 = T011.isNull(r4) ? null : T011.getBlob(r4);
                        String Y1 = T011.isNull(r5) ? null : T011.Y1(r5);
                        Integer valueOf = T011.isNull(r6) ? null : Integer.valueOf((int) T011.getLong(r6));
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        Integer valueOf2 = T011.isNull(r7) ? null : Integer.valueOf((int) T011.getLong(r7));
                        if (valueOf2 != null) {
                            r13 = Boolean.valueOf(valueOf2.intValue() != 0);
                        }
                        r13 = new o5b(j4, blob, blob2, blob3, Y1, bool, r13);
                    }
                    return r13;
                } finally {
                }
            case 22:
                ull0 T012 = ((oll0) obj).T0("SELECT last_shown_message_timestamp FROM chat_notifications WHERE chat_internal_id = ?");
                try {
                    T012.b(1, j);
                    if (T012.q() && !T012.isNull(0)) {
                        r13 = Long.valueOf(T012.getLong(0));
                    }
                    return r13;
                } finally {
                }
            case 23:
                ull0 T013 = ((oll0) obj).T0("\n        SELECT organization_id FROM chat_organization_cross_ref\n        WHERE chat_internal_id = ? ORDER BY rowId\n    ");
                try {
                    T013.b(1, j);
                    ArrayList arrayList2 = new ArrayList();
                    while (T013.q()) {
                        arrayList2.add(Long.valueOf(T013.getLong(0)));
                    }
                    return arrayList2;
                } finally {
                }
            case 24:
                ull0 T014 = ((oll0) obj).T0("DELETE FROM chat_organization_cross_ref WHERE chat_internal_id = ?");
                try {
                    T014.b(1, j);
                    T014.q();
                    return zy11Var;
                } finally {
                }
            case 25:
                ull0 T015 = ((oll0) obj).T0("SELECT COUNT(*) FROM chat_organization_cross_ref\n        WHERE chat_internal_id = ? AND organization_id > 0 LIMIT 1");
                try {
                    T015.b(1, j);
                    if (T015.q()) {
                        if (((int) T015.getLong(0)) != 0) {
                            z = true;
                        }
                    }
                    T015.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 26:
                ull0 T016 = ((oll0) obj).T0("SELECT rights FROM user_roles WHERE chat_internal_id = ?");
                try {
                    T016.b(1, j);
                    if (T016.q() && !T016.isNull(0)) {
                        r13 = Integer.valueOf((int) T016.getLong(0));
                    }
                    return r13;
                } finally {
                }
            case 27:
                ull0 T017 = ((oll0) obj).T0("SELECT role FROM user_roles WHERE chat_internal_id = ?");
                try {
                    T017.b(1, j);
                    if (T017.q() && !T017.isNull(0)) {
                        r13 = Integer.valueOf((int) T017.getLong(0));
                    }
                    return r13;
                } finally {
                }
            case 28:
                ull0 T018 = ((oll0) obj).T0("SELECT version FROM user_roles WHERE chat_internal_id = ?");
                try {
                    T018.b(1, j);
                    if (T018.q() && !T018.isNull(0)) {
                        r13 = Long.valueOf(T018.getLong(0));
                    }
                    return r13;
                } finally {
                }
            default:
                ull0 T019 = ((oll0) obj).T0("SELECT * FROM user_roles WHERE chat_internal_id = ?");
                try {
                    T019.b(1, j);
                    int r8 = eja1.r(T019, "chat_internal_id");
                    int r9 = eja1.r(T019, "version");
                    int r10 = eja1.r(T019, "role");
                    int r11 = eja1.r(T019, "rights");
                    if (T019.q()) {
                        r13 = new y8b((int) T019.getLong(r10), (int) T019.getLong(r11), T019.getLong(r8), T019.getLong(r9));
                    }
                    return r13;
                } finally {
                }
        }
    }
}
