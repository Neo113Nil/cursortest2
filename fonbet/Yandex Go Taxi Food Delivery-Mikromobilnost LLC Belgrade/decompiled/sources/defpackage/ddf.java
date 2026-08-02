package defpackage;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import coil.compose.d;
import com.google.android.material.snackbar.b;
import com.yandex.div.core.view2.divs.tabs.a;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.Continuation;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.security.entities.exceptions.CertificateSecurityEbsException;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes9.dex */
public final class ddf implements og, r760, yx0, qz20, rjs0, bl3, f05, dt31, zeo, bx60 {
    public static final String[] c = {"TLS_GOSTR341112_256_WITH_KUZNYECHIK_CTR_OMAC", "TLS_CIPHER_2012", "TLS_CIPHER_2001"};
    public static final Object w = new Object();
    public static volatile ddf x;
    public final /* synthetic */ int a;
    public Object b;

    public ddf(rqo rqoVar) {
        this.a = 14;
        p02.Companion.getClass();
        this.b = (p02) ((jbh) rqoVar).c(p02.e).b();
    }

    public static void i(String str, X509Certificate x509Certificate) {
        throw new CertificateSecurityEbsException(b64.l("Certificate ", x509Certificate.getSerialNumber().toString(16), Extension.COLON_SPACE, str));
    }

    public static void j(X509Certificate x509Certificate) {
        String name;
        String name2;
        Principal issuerDN = x509Certificate.getIssuerDN();
        if (issuerDN == null || (name = issuerDN.getName()) == null || evu0.J(name)) {
            i("issuerDN is empty", x509Certificate);
            throw null;
        }
        Principal subjectDN = x509Certificate.getSubjectDN();
        if (subjectDN == null || (name2 = subjectDN.getName()) == null || evu0.J(name2)) {
            i("subjectDN is empty", x509Certificate);
            throw null;
        }
        if (!subjectDN.equals(issuerDN)) {
            return;
        }
        i("certificate is self-signed", x509Certificate);
        throw null;
    }

    @Override // defpackage.rjs0
    public Object a(Continuation continuation) {
        return e.y(new pb(((d) this.b).z, 9), continuation);
    }

    @Override // defpackage.bl3
    public Object b() {
        sq60 sq60Var = ((jn3) this.b).f.x;
        sq60Var.rewind();
        while (sq60Var.hasNext()) {
            ((cl3) sq60Var.next()).b();
        }
        return zy11.a;
    }

    @Override // defpackage.dt31
    public void c(float f, View view) {
        i05 i05Var;
        a aVar = (a) this.b;
        if (!aVar.n && f > -1.0f && f < 1.0f && (i05Var = (i05) aVar.g.get(view)) != null) {
            i05Var.a();
        }
    }

    @Override // defpackage.bl3
    public Object d() {
        sq60 sq60Var = ((jn3) this.b).f.x;
        sq60Var.rewind();
        while (sq60Var.hasNext()) {
            ((cl3) sq60Var.next()).d();
        }
        return zy11.a;
    }

    @Override // defpackage.bl3
    public Object e() {
        sq60 sq60Var = ((jn3) this.b).f.x;
        sq60Var.rewind();
        while (sq60Var.hasNext()) {
            ((cl3) sq60Var.next()).e();
        }
        return zy11.a;
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 2:
                if (obj == null) {
                    return false;
                }
                return jl40.l((SpannableString) this.b, obj);
            default:
                return super.equals(obj);
        }
    }

    @Override // defpackage.bl3
    public Object g() {
        sq60 sq60Var = ((jn3) this.b).f.x;
        sq60Var.rewind();
        while (sq60Var.hasNext()) {
            ((cl3) sq60Var.next()).g();
        }
        return zy11.a;
    }

    @Override // defpackage.bl3
    public Object h() {
        sq60 sq60Var = ((jn3) this.b).f.x;
        sq60Var.rewind();
        while (sq60Var.hasNext()) {
            ((cl3) sq60Var.next()).h();
        }
        return zy11.a;
    }

    public int hashCode() {
        switch (this.a) {
            case 2:
                return ((SpannableString) this.b).hashCode();
            default:
                return super.hashCode();
        }
    }

    public void k(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gju gjuVar = (gju) it.next();
            int i = gjuVar.a;
            SpannableString spannableString = (SpannableString) this.b;
            int max = Math.max(0, Math.min(i, spannableString.length()));
            int max2 = Math.max(0, Math.min(gjuVar.b, spannableString.length()));
            if (max < max2) {
                spannableString.setSpan(new ForegroundColorSpan(gjuVar.c), max, max2, 33);
            }
        }
    }

    public SpannableString l() {
        return (SpannableString) this.b;
    }

    public Object m(xf7 xf7Var, umx umxVar, String str, Class cls, tls tlsVar) {
        mzz mzzVar = (mzz) this.b;
        Object c2 = mzzVar.c(str);
        if (c2 != null) {
            return c2;
        }
        s0k0 s0k0Var = new s0k0();
        sbx a = umxVar.a();
        Regex regex = wg10.e;
        s0k0Var.a(bvf0.o(a, qje.o("application/json; charset=utf-8")));
        Objects.requireNonNull(xf7Var, "factory == null");
        s0k0Var.a = xf7Var;
        s0k0Var.b(str);
        Object b = ((s0k0) tlsVar.invoke(s0k0Var)).c().b(cls);
        mzzVar.d(str, b);
        return b;
    }

    public vq0 n(uq0 uq0Var, boolean z) {
        String str = uq0Var.a;
        g191 g191Var = (g191) this.b;
        ky P = g191Var.P(uq0Var.b, null);
        boolean z2 = uq0Var.d;
        String str2 = uq0Var.f;
        Object obj = uq0Var.e;
        y901 y901Var = uq0Var.c;
        return new vq0(str, P, str2, z2, obj, y901Var != null ? new aa01(g191Var.P(y901Var.a, null), y901Var.b, y901Var.c) : null, z);
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        b bVar = (b) this.b;
        bVar.l = n751Var.a();
        bVar.m = n751Var.b();
        bVar.n = n751Var.c();
        bVar.e();
        return n751Var;
    }

    @Override // defpackage.qz20
    public void onBack() {
        ((w71) this.b).r(new j01(12));
    }

    @Override // defpackage.zeo
    public void onCancel(Object obj) {
        q35 q35Var = (q35) this.b;
        try {
            q35Var.a(obj);
            q35Var.b = null;
        } catch (Throwable th) {
            kbs.g(ljo.b(th));
        }
    }

    @Override // defpackage.zeo
    public void onListen(Object obj, xeo xeoVar) {
        try {
            q35 q35Var = (q35) this.b;
            q35Var.b = (yeo) xeoVar;
            q35Var.b(obj);
        } catch (Throwable th) {
            kbs.g(ljo.b(th));
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ResolvedFeatureGroup(features=" + ((LinkedHashSet) this.b) + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ddf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ ddf() {
        this.a = 17;
    }

    public ddf(String str) {
        this.a = 2;
        this.b = new SpannableString(str);
    }

    public ddf(int i) {
        this.a = 18;
        this.b = new mzz(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ddf(RoutePointType routePointType) {
        this(11, new rwp0(routePointType, false));
        this.a = 11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ddf(RoutePointType routePointType, boolean z) {
        this(11, new rwp0(routePointType, z));
        this.a = 11;
    }
}
