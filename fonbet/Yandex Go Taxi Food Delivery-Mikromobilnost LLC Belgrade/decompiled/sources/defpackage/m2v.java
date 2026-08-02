package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata;
import com.yandex.go.payments.cards.domain.model.PaymentMethodVerificationSession;
import com.yandex.go.payments.cards.pci_dss.data.model.PciDssCardData;
import com.yandex.go.taxi.order.chat.call_feedback.experiments.CallFeedbackExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.a;
import kotlin.collections.b;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import yads.ct1;

/* loaded from: classes13.dex */
public final class m2v implements gb4, rc70 {
    public static volatile m2v z;
    public Object a;
    public Object b;
    public Object c;
    public Object w;
    public static final byte[] x = new byte[0];
    public static final Object y = new Object();
    public static final String[] A = {"id", "key", kju0.j};

    public m2v(int i) {
        switch (i) {
            case 13:
                this.a = null;
                this.b = null;
                this.c = null;
                this.w = mf1.B;
                break;
            default:
                this.a = null;
                this.b = null;
                this.c = null;
                this.w = null;
                break;
        }
    }

    public static b90 g(m2v m2vVar, xqw xqwVar, qc8 qc8Var, PciDssCardData pciDssCardData, j831 j831Var, y931 y931Var) {
        PaymentMethodVerificationSession paymentMethodVerificationSession = new PaymentMethodVerificationSession();
        m2vVar.getClass();
        return new b90(m2vVar, paymentMethodVerificationSession, qc8Var, pciDssCardData, j831Var, y931Var, xqwVar);
    }

    public static String r(CallFeedbackExperiment callFeedbackExperiment, String str, String str2) {
        Map map;
        String str3;
        return (callFeedbackExperiment == null || (map = callFeedbackExperiment.c) == null || (str3 = (String) map.get(str)) == null) ? str2 : str3;
    }

    public static /* synthetic */ void v(m2v m2vVar, int i, vu0 vu0Var, oo0 oo0Var, p61 p61Var, int i2) {
        sls slsVar = p61Var;
        if ((i2 & 16) != 0) {
            slsVar = new bgc(12);
        }
        m2vVar.u(i, vu0Var, b51.a, oo0Var, slsVar);
    }

    public void A(boolean z2) {
        ((rb8) this.a).c = z2;
    }

    public void B(va90 va90Var) {
        this.b = va90Var;
    }

    public void C(va90 va90Var) {
        this.c = va90Var;
    }

    public void D(Integer num) {
        this.w = num;
    }

    public void E(int i) {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public void F(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public void G(ee5 ee5Var) {
        String str = (String) this.b;
        o501 o501Var = (o501) this.w;
        tt5 tt5Var = (tt5) this.a;
        boolean z2 = false;
        int i = 21;
        if (o501Var != null) {
            tt5Var.h(str, ee5Var != null ? new ymu(this, ee5Var, z2, i) : null, o501Var);
        } else {
            tt5Var.j(str, ee5Var != null ? new ymu(this, ee5Var, z2, i) : null);
        }
    }

    public void H(cg1 cg1Var) {
        this.a = cg1Var;
    }

    public void I() {
        this.c = 16;
    }

    public void J(mf1 mf1Var) {
        this.w = mf1Var;
    }

    @Override // defpackage.gb4
    public Drawable a(Context context) {
        jb4 ib4Var = ((Boolean) this.a).booleanValue() ? new ib4() : hb4.a;
        fb4 fb4Var = (fb4) this.w;
        db4 db4Var = fb4Var.b;
        int i = fb4Var.e.a;
        return db4Var.a.a.l((String) this.b, (String) this.c, null, ib4Var);
    }

    public void b(eq81 eq81Var) {
        if (eq81Var instanceof wm81) {
            synchronized (y) {
                this.w = ct1.d;
            }
        } else if (eq81Var instanceof rj81) {
            synchronized (y) {
                this.w = ct1.b;
            }
        }
        lm71 lm71Var = (lm71) this.a;
        ((ht81) lm71Var.b).a.execute(new jy31(19, this));
    }

    public wf1 c() {
        va90 va90Var;
        cg1 cg1Var = (cg1) this.a;
        if (cg1Var == null) {
            kbs.v("Cannot build without parameters");
            return null;
        }
        va90 va90Var2 = (va90) this.b;
        if (va90Var2 == null || (va90Var = (va90) this.c) == null) {
            kbs.v("Cannot build without key material");
            return null;
        }
        if (cg1Var.a != ((u77) va90Var2.a).a.length) {
            kbs.v("AES key size mismatch");
            return null;
        }
        if (cg1Var.b != ((u77) va90Var.a).a.length) {
            kbs.v("HMAC key size mismatch");
            return null;
        }
        bg1 bg1Var = cg1Var.d;
        bg1 bg1Var2 = bg1.x;
        if (bg1Var != bg1Var2 && ((Integer) this.w) == null) {
            kbs.v("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (bg1Var == bg1Var2 && ((Integer) this.w) != null) {
            kbs.v("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (bg1Var == bg1Var2) {
            u77.a(new byte[0]);
        } else if (bg1Var == bg1.w) {
            u77.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.w).intValue()).array());
        } else {
            if (bg1Var != bg1.c) {
                yci0.t(((cg1) this.a).d, "Unknown AesCtrHmacAeadParameters.Variant: ");
                return null;
            }
            u77.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.w).intValue()).array());
        }
        return new wf1();
    }

    public bh1 d() {
        Integer num = (Integer) this.a;
        if (num == null) {
            kbs.v("Key size is not set");
            return null;
        }
        if (((Integer) this.b) == null) {
            kbs.v("IV size is not set");
            return null;
        }
        if (((Integer) this.c) != null) {
            return new bh1(num.intValue(), ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (mf1) this.w);
        }
        kbs.v("Tag size is not set");
        return null;
    }

    public a90 e() {
        return new a90(this);
    }

    public b90 f(String str, String str2, qc8 qc8Var, y931 y931Var) {
        return g(this, new a90(this), qc8Var, null, new j831(new k831(str, str2, qc8Var.d), null, null, null, false, null, null, null, null, UUID.randomUUID().toString(), null, null, 14328), y931Var);
    }

    public b90 h(String str) {
        return g(this, new a90(this), null, null, new j831(new l831(str, PaymentMethod$Type.EASYPAISA_WALLET), null, null, null, false, null, null, null, null, UUID.randomUUID().toString(), null, null, 14328), v931.a);
    }

    public b90 i(String str) {
        return g(this, new a90(this), null, null, new j831(new l831(str, PaymentMethod$Type.FASTSHIFT_ACCOUNT), null, null, null, false, null, null, null, null, UUID.randomUUID().toString(), null, null, 14328), v931.a);
    }

    public b90 j(String str) {
        return g(this, new a90(this), null, null, new j831(new l831(str, PaymentMethod$Type.JAZZCASH_WALLET), null, null, null, false, null, null, null, null, UUID.randomUUID().toString(), null, null, 14328), v931.a);
    }

    public b90 k(String str) {
        return g(this, new a90(this), null, null, new j831(new l831(str, PaymentMethod$Type.MBANK_ACCOUNT), null, null, null, false, null, null, null, null, UUID.randomUUID().toString(), null, null, 14328), v931.a);
    }

    @Override // defpackage.rc70
    public void l(Object obj, String str) {
        this.b = "sqlite_error";
        this.c = str;
        this.w = obj;
    }

    public b90 m(String str) {
        return g(this, new a90(this), null, null, new j831(new l831(str, PaymentMethod$Type.NEQUI_TOKEN), null, null, null, false, null, null, null, null, UUID.randomUUID().toString(), null, null, 14328), v931.a);
    }

    public b90 n(String str) {
        return g(this, new a90(this), null, null, new j831(new l831(str, PaymentMethod$Type.SBP_TOKEN), null, null, null, false, null, null, null, null, UUID.randomUUID().toString(), null, null, 14328), v931.a);
    }

    public b90 o(String str) {
        return g(this, new a90(this), null, null, new j831(new l831(str, PaymentMethod$Type.YAPE_TOKEN), null, null, null, false, null, null, null, null, UUID.randomUUID().toString(), null, null, 14328), v931.a);
    }

    public CallFeedbackExperiment p() {
        return (CallFeedbackExperiment) ((TaxiOrder) this.a).V().c(CallFeedbackExperiment.class);
    }

    public String q(CallFeedbackExperiment callFeedbackExperiment, String str, int i) {
        return r(callFeedbackExperiment, str, ((avj0) ((zuj0) this.b)).h(i));
    }

    public z820 s(String str) {
        if (!((ConcurrentHashMap) this.w).containsKey(str)) {
            synchronized (this) {
                try {
                    if (!((ConcurrentHashMap) this.w).containsKey(str)) {
                        try {
                            ((d0c) this.a).getClass();
                            InputStream a = d0c.a(str);
                            ((l920) this.b).getClass();
                            for (Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata : l920.a(a)) {
                                vbb vbbVar = (vbb) this.c;
                                hdu hduVar = (hdu) vbbVar.b;
                                if (((String) ((nf00) hduVar.b).f(phonemetadata$PhoneMetadata)).equals("001")) {
                                    ((hdu) vbbVar.a).f(phonemetadata$PhoneMetadata);
                                } else {
                                    hduVar.f(phonemetadata$PhoneMetadata);
                                }
                            }
                            ((ConcurrentHashMap) this.w).put(str, str);
                        } catch (IllegalArgumentException | IllegalStateException e) {
                            throw new IllegalStateException("Failed to read file ".concat(str), e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (vbb) this.c;
    }

    @Override // defpackage.rc70
    public void success(Object obj) {
        this.a = obj;
    }

    public oo0 t(int i) {
        qv0 qv0Var;
        j6s b = ((p6s) this.c).b();
        if (b == null || (qv0Var = (qv0) a.S(i, b.d.a)) == null) {
            return null;
        }
        return qv0Var.a;
    }

    public void u(int i, vu0 vu0Var, d51 d51Var, oo0 oo0Var, sls slsVar) {
        Map f;
        b7s b7sVar = (b7s) ((Map) ((c7s) this.w).a.getValue()).get((String) this.a);
        if (b7sVar == null || (f = b7sVar.a) == null) {
            f = b.f();
        }
        ((dv8) this.b).b(d51Var, new hu0(i), vu0Var, new s61(f, oo0Var), slsVar);
    }

    public void w(f90 f90Var) {
        this.c = f90Var;
    }

    public void x(f90 f90Var) {
        this.w = f90Var;
    }

    public void y(e90 e90Var) {
        this.b = e90Var;
    }

    public void z(Object obj, fe5 fe5Var) {
        ((tt5) this.a).m((String) this.b, ((rs10) this.c).b(obj), fe5Var == null ? null : new de5(0, this, fe5Var));
    }

    public /* synthetic */ m2v(Object obj, Object obj2, Object obj3, Object obj4, boolean z2) {
        this.a = obj2;
        this.b = obj3;
        this.c = obj4;
        this.w = obj;
    }

    public /* synthetic */ m2v(ka0 ka0Var) {
        this(ka0Var, (String) null);
    }

    public m2v(ka0 ka0Var, String str) {
        this.a = new rb8(ka0Var, str);
        this.b = new quz(6);
        int i = 1;
        this.c = new d82(i);
        this.w = new d82(i);
    }

    public m2v(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        this.a = sharedPreferences;
        this.b = com.yandex.messaging.utils.extension.a.a(sharedPreferences2, "disable_mic_for_group_call", false);
        this.c = com.yandex.messaging.utils.extension.a.a(sharedPreferences2, "disable_camera_for_group_call", false);
        this.w = com.yandex.messaging.utils.extension.a.a(sharedPreferences, "showMyVideo", true);
    }

    public /* synthetic */ m2v(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.w = obj4;
    }
}
