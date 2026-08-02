package xsna;

import android.accounts.Account;
import android.util.Base64;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.EmptyList;

/* compiled from: AccountManagerEncryptionDecorator.kt */
/* loaded from: classes.dex */
public final class jp implements mp {
    public static final byte[] c = "ecosystem.iv".getBytes(emb.b);
    public final op a;
    public final bpn0 b = new bpn0(new ip(this, 0));

    public jp(op opVar) {
        this.a = opVar;
    }

    @Override // xsna.mp
    public final hp a(UserId userId) {
        try {
            hp a = this.a.a(userId);
            if (a == null) {
                return null;
            }
            return hp.a(a, h(a.b()), h(a.e()), 891);
        } catch (Exception e) {
            xgx0.a.getClass();
            xgx0.d(e);
            return null;
        }
    }

    @Override // xsna.mp
    public final List<hp> b() {
        try {
            List<hp> b = this.a.b();
            ArrayList arrayList = new ArrayList(c5g.u(b, 10));
            for (hp hpVar : b) {
                arrayList.add(hp.a(hpVar, h(hpVar.b()), h(hpVar.e()), 891));
            }
            return arrayList;
        } catch (Exception e) {
            xgx0.a.getClass();
            xgx0.d(e);
            return EmptyList.b;
        }
    }

    @Override // xsna.mp
    public final boolean c(UserId userId) {
        return this.a.c(userId);
    }

    @Override // xsna.mp
    public final Account d(hp hpVar) {
        try {
            return this.a.d(hp.a(hpVar, i(hpVar.b()), i(hpVar.e()), 891));
        } catch (Exception e) {
            xgx0.a.getClass();
            xgx0.d(e);
            return null;
        }
    }

    @Override // xsna.mp
    public final hp e(UserId userId) {
        try {
            hp e = this.a.e(userId);
            if (e == null) {
                return null;
            }
            return hp.a(e, h(e.b()), h(e.e()), 891);
        } catch (Exception e2) {
            xgx0.a.getClass();
            xgx0.d(e2);
            return null;
        }
    }

    @Override // xsna.mp
    public final List<hp> f() {
        try {
            List<hp> f = this.a.f();
            ArrayList arrayList = new ArrayList(c5g.u(f, 10));
            for (hp hpVar : f) {
                arrayList.add(hp.a(hpVar, h(hpVar.b()), h(hpVar.e()), 891));
            }
            return arrayList;
        } catch (Exception e) {
            xgx0.a.getClass();
            xgx0.d(e);
            return EmptyList.b;
        }
    }

    @Override // xsna.mp
    public final Account g(hp hpVar) {
        try {
            return this.a.g(hp.a(hpVar, i(hpVar.b()), i(hpVar.e()), 891));
        } catch (Exception e) {
            xgx0.a.getClass();
            xgx0.d(e);
            return null;
        }
    }

    public final String h(String str) {
        byte[] decode = Base64.decode(str, 0);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, new SecretKeySpec((byte[]) this.b.getValue(), "AES"), new GCMParameterSpec(128, c));
        return new String(cipher.doFinal(decode), emb.b);
    }

    public final String i(String str) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, new SecretKeySpec((byte[]) this.b.getValue(), "AES"), new GCMParameterSpec(128, c));
        return Base64.encodeToString(cipher.doFinal(str.getBytes(emb.b)), 0);
    }
}
