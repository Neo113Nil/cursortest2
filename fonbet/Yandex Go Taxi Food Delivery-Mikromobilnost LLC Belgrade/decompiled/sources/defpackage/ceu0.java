package defpackage;

import android.content.res.Resources;
import com.yandex.mob.domain.ValidateConfigUseCase$InvalidCause;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.builders.SetBuilder;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes9.dex */
public final /* synthetic */ class ceu0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ ceu0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return Integer.valueOf(((gki0) obj).b());
            case 1:
                return Integer.valueOf(((gki0) obj).a());
            case 2:
                uku0 uku0Var = (uku0) obj;
                return new cku0(uku0Var.a, uku0Var.b);
            case 3:
                return new w301() { // from class: n2w0
                    @Override // defpackage.w301
                    public final void a(a201 a201Var) {
                    }
                };
            case 4:
                return Long.valueOf(((g3w0) obj) instanceof f3w0 ? 100L : 0L);
            case 5:
                return Boolean.TRUE;
            case 6:
                return Boolean.FALSE;
            case 7:
                return Boolean.TRUE;
            case 8:
                return Boolean.valueOf((((Resources) obj).getConfiguration().uiMode & 48) == 32);
            case 9:
                ull0 T0 = ((oll0) obj).T0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(T0.Y1(0));
                    }
                    return arrayList;
                } finally {
                    T0.close();
                }
            case 10:
                return Boolean.valueOf(((WeakReference) obj).get() == null);
            case 11:
                return kp50.i();
            case 12:
                return kp50.i();
            case 13:
                return Boolean.valueOf(((ull0) obj).q());
            case 14:
                ull0 ull0Var = (ull0) obj;
                SetBuilder setBuilder = new SetBuilder();
                while (ull0Var.q()) {
                    setBuilder.add(Integer.valueOf((int) ull0Var.getLong(0)));
                }
                return setBuilder.b();
            case 15:
                return Long.valueOf(((Number) ((Pair) obj).f()).longValue());
            case 16:
                h0c h0cVar = (h0c) obj;
                auu0 auu0Var = auu0.a;
                h0cVar.a("name", auu0.b, (r3 & 8) == 0);
                h0cVar.a("version", qke.n(auu0Var).getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("value", c.Companion.serializer().getDescriptor(), (r3 & 8) == 0);
                return zy11Var;
            case 17:
                ((h0c) obj).a("items", new s43(qke.n(new oke(qoi0.a(un11.class), null, ooc.d)).getDescriptor(), 1), (r3 & 8) == 0);
                return zy11Var;
            case 18:
                return ((jzs) obj).c;
            case 19:
                jst.e.k((Throwable) obj, "Failed user info try");
                return zy11Var;
            case 20:
                return Boolean.valueOf(((ValidateConfigUseCase$InvalidCause) ((Pair) obj).getSecond()) != null);
            case 21:
                Pair pair = (Pair) obj;
                return new Pair((lq20) pair.getFirst(), (ValidateConfigUseCase$InvalidCause) pair.getSecond());
            case 22:
                return new oj2(((Float) obj).floatValue());
            case 23:
                return new oj2(((Integer) obj).intValue());
            case 24:
                return Integer.valueOf((int) ((oj2) obj).a);
            case 25:
                return new oj2(((y7m) obj).a);
            case 26:
                return new y7m(((oj2) obj).a);
            case 27:
                a8m a8mVar = (a8m) obj;
                return new pj2(Float.intBitsToFloat((int) (a8mVar.a >> 32)), Float.intBitsToFloat((int) (a8mVar.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
            case 28:
                pj2 pj2Var = (pj2) obj;
                return new a8m((Float.floatToRawIntBits(pj2Var.g()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(pj2Var.f()) << 32));
            default:
                cjs0 cjs0Var = (cjs0) obj;
                return new pj2(Float.intBitsToFloat((int) (cjs0Var.a >> 32)), Float.intBitsToFloat((int) (cjs0Var.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        }
    }
}
