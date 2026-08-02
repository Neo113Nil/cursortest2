package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final /* synthetic */ class leb implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ leb(boolean z, long j) {
        this.a = 0;
        this.c = z;
        this.b = j;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        jb2 jb2Var;
        jb2 jb2Var2;
        int i = this.a;
        boolean z = this.c;
        switch (i) {
            case 0:
                long j = this.b;
                oll0 oll0Var = (oll0) obj;
                ull0 T0 = oll0Var.T0("UPDATE chats SET is_transient = ? WHERE chat_internal_id = ?");
                try {
                    T0.b(1, z ? 1L : 0L);
                    T0.b(2, j);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } catch (Throwable th) {
                    T0.close();
                    throw th;
                }
            case 1:
                qam qamVar = (qam) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32)) / 8.0f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 24.0f;
                jb2 a = nb2.a();
                if (z) {
                    float f = intBitsToFloat * 0.0f;
                    float f2 = intBitsToFloat2 * 12.0f;
                    a.m(f, f2);
                    float f3 = intBitsToFloat * 0.845f;
                    a.l(f3, intBitsToFloat2 * 11.578f);
                    float f4 = intBitsToFloat * 1.348f;
                    float f5 = intBitsToFloat * 1.6f;
                    float f6 = intBitsToFloat * 1.829f;
                    a.h(f4, intBitsToFloat2 * 11.326f, f5, intBitsToFloat2 * 11.2f, f6, intBitsToFloat2 * 11.073f);
                    float f7 = intBitsToFloat * 5.475f;
                    float f8 = intBitsToFloat * 7.807f;
                    float f9 = intBitsToFloat * 7.989f;
                    a.h(f7, intBitsToFloat2 * 9.047f, f8, intBitsToFloat2 * 5.273f, f9, intBitsToFloat2 * 1.106f);
                    float f10 = intBitsToFloat * 8.0f;
                    a.h(f10, intBitsToFloat2 * 0.845f, f10, intBitsToFloat2 * 0.563f, f10, intBitsToFloat2 * 0.0f);
                    a.l(f10, intBitsToFloat2 * 24.0f);
                    a.h(f10, intBitsToFloat2 * 23.437f, f10, intBitsToFloat2 * 23.155f, f9, intBitsToFloat2 * 22.894f);
                    a.h(f8, intBitsToFloat2 * 18.727f, f7, intBitsToFloat2 * 14.953f, f6, intBitsToFloat2 * 12.927f);
                    a.h(f5, intBitsToFloat2 * 12.8f, f4, intBitsToFloat2 * 12.674f, f3, intBitsToFloat2 * 12.422f);
                    a.l(f, f2);
                    jb2Var = a;
                } else {
                    float f11 = intBitsToFloat * 8.0f;
                    float f12 = intBitsToFloat2 * 12.0f;
                    a.m(f11, f12);
                    float f13 = 7.155f * intBitsToFloat;
                    a.l(f13, intBitsToFloat2 * 11.578f);
                    float f14 = intBitsToFloat * 6.652f;
                    float f15 = intBitsToFloat * 6.4f;
                    float f16 = intBitsToFloat * 6.171f;
                    a.h(f14, intBitsToFloat2 * 11.326f, f15, intBitsToFloat2 * 11.2f, f16, intBitsToFloat2 * 11.073f);
                    float f17 = intBitsToFloat * 2.525f;
                    float f18 = intBitsToFloat * 0.193f;
                    float f19 = intBitsToFloat * 0.011f;
                    a.h(f17, intBitsToFloat2 * 9.047f, f18, intBitsToFloat2 * 5.273f, f19, intBitsToFloat2 * 1.106f);
                    float f20 = intBitsToFloat * 0.0f;
                    a.h(f20, intBitsToFloat2 * 0.845f, f20, intBitsToFloat2 * 0.563f, f20, intBitsToFloat2 * 0.0f);
                    jb2Var = a;
                    jb2Var.l(f20, intBitsToFloat2 * 24.0f);
                    a.h(f20, intBitsToFloat2 * 23.437f, f20, intBitsToFloat2 * 23.155f, f19, intBitsToFloat2 * 22.894f);
                    a.h(f18, intBitsToFloat2 * 18.727f, f17, intBitsToFloat2 * 14.953f, f16, intBitsToFloat2 * 12.927f);
                    a.h(f15, intBitsToFloat2 * 12.8f, f14, intBitsToFloat2 * 12.674f, f13, intBitsToFloat2 * 12.422f);
                    jb2Var.l(f11, f12);
                }
                jb2Var.g();
                qam.Y(qamVar, jb2Var, this.b, null, 60);
                return zy11.a;
            default:
                qam qamVar2 = (qam) obj;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (qamVar2.c() >> 32)) / 24.0f;
                float intBitsToFloat4 = Float.intBitsToFloat((int) (qamVar2.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 8.0f;
                jb2 a2 = nb2.a();
                if (z) {
                    float f21 = intBitsToFloat3 * 12.0f;
                    float f22 = intBitsToFloat4 * 0.0f;
                    a2.m(f21, f22);
                    float f23 = intBitsToFloat4 * 0.845f;
                    a2.l(11.578f * intBitsToFloat3, f23);
                    float f24 = intBitsToFloat4 * 1.348f;
                    float f25 = intBitsToFloat4 * 1.6f;
                    float f26 = intBitsToFloat4 * 1.829f;
                    a2.h(intBitsToFloat3 * 11.326f, f24, intBitsToFloat3 * 11.2f, f25, intBitsToFloat3 * 11.073f, f26);
                    float f27 = intBitsToFloat4 * 5.475f;
                    float f28 = intBitsToFloat4 * 7.807f;
                    float f29 = intBitsToFloat4 * 7.989f;
                    a2.h(intBitsToFloat3 * 9.047f, f27, intBitsToFloat3 * 5.273f, f28, intBitsToFloat3 * 1.106f, f29);
                    float f30 = intBitsToFloat4 * 8.0f;
                    a2.h(intBitsToFloat3 * 0.845f, f30, intBitsToFloat3 * 0.563f, f30, intBitsToFloat3 * 0.0f, f30);
                    a2.l(intBitsToFloat3 * 24.0f, f30);
                    a2.h(intBitsToFloat3 * 23.437f, f30, intBitsToFloat3 * 23.155f, f30, intBitsToFloat3 * 22.894f, f29);
                    a2.h(intBitsToFloat3 * 18.727f, f28, intBitsToFloat3 * 14.953f, f27, intBitsToFloat3 * 12.927f, f26);
                    a2.h(intBitsToFloat3 * 12.8f, f25, intBitsToFloat3 * 12.674f, f24, intBitsToFloat3 * 12.422f, f23);
                    a2.l(f21, f22);
                    jb2Var2 = a2;
                } else {
                    float f31 = intBitsToFloat3 * 12.0f;
                    float f32 = intBitsToFloat4 * 8.0f;
                    a2.m(f31, f32);
                    float f33 = 7.155f * intBitsToFloat4;
                    a2.l(11.578f * intBitsToFloat3, f33);
                    float f34 = intBitsToFloat4 * 6.652f;
                    float f35 = intBitsToFloat4 * 6.4f;
                    float f36 = intBitsToFloat4 * 6.171f;
                    a2.h(intBitsToFloat3 * 11.326f, f34, intBitsToFloat3 * 11.2f, f35, intBitsToFloat3 * 11.073f, f36);
                    float f37 = intBitsToFloat4 * 2.525f;
                    float f38 = intBitsToFloat4 * 0.193f;
                    float f39 = intBitsToFloat4 * 0.011f;
                    a2.h(intBitsToFloat3 * 9.047f, f37, intBitsToFloat3 * 5.273f, f38, intBitsToFloat3 * 1.106f, f39);
                    float f40 = intBitsToFloat4 * 0.0f;
                    a2.h(intBitsToFloat3 * 0.845f, f40, intBitsToFloat3 * 0.563f, f40, intBitsToFloat3 * 0.0f, f40);
                    jb2Var2 = a2;
                    jb2Var2.l(intBitsToFloat3 * 24.0f, f40);
                    a2.h(intBitsToFloat3 * 23.437f, f40, intBitsToFloat3 * 23.155f, f40, intBitsToFloat3 * 22.894f, f39);
                    a2.h(intBitsToFloat3 * 18.727f, f38, intBitsToFloat3 * 14.953f, f37, intBitsToFloat3 * 12.927f, f36);
                    a2.h(intBitsToFloat3 * 12.8f, f35, intBitsToFloat3 * 12.674f, f34, intBitsToFloat3 * 12.422f, f33);
                    jb2Var2.l(f31, f32);
                }
                jb2Var2.g();
                qam.Y(qamVar2, jb2Var2, this.b, null, 60);
                return zy11.a;
        }
    }

    public /* synthetic */ leb(boolean z, int i, long j) {
        this.a = i;
        this.b = j;
        this.c = z;
    }
}
