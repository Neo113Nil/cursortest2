package xsna;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import com.vk.core.preference.Preference;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptySet;

/* compiled from: PackageVerifier.kt */
/* loaded from: classes6.dex */
public final class e890 {
    public static final HashMap<String, a> a = new HashMap<>();

    /* compiled from: PackageVerifier.kt */
    public static final class a {
        public boolean a = false;
        public boolean b = false;
        public boolean c = false;
        public final io.reactivex.rxjava3.subjects.d<List<String>> d;

        public a(io.reactivex.rxjava3.subjects.d dVar) {
            this.d = dVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static io.reactivex.rxjava3.core.q a(String str) {
        boolean z;
        Signature[] signatureArr;
        boolean z2;
        PackageInfo f;
        HashMap<String, a> hashMap = a;
        a aVar = hashMap.get(str);
        if (aVar == null) {
            aVar = new a(io.reactivex.rxjava3.subjects.d.N0());
            hashMap.put(str, aVar);
        }
        try {
            z = dy2.i(str);
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
            z = false;
        }
        if (!z) {
            aVar.a = false;
            aVar.b = false;
            return io.reactivex.rxjava3.core.q.T(Boolean.FALSE);
        }
        if (aVar.a) {
            return io.reactivex.rxjava3.core.q.T(Boolean.TRUE);
        }
        if (!aVar.b) {
            aVar.b = true;
            List O0 = j5g.O0(Preference.u(EmptySet.b, "package_verifier", go9.b("package_cert_hashes_", str)));
            try {
                f = dy2.f(str, 134217729);
            } catch (Throwable th2) {
                com.vk.metrics.eventtracking.b.a.q(th2);
            }
            if (f != null) {
                z2 = u790.a(f, O0);
                if (z2) {
                    aVar.a = true;
                    return io.reactivex.rxjava3.core.q.T(Boolean.TRUE);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        if (!aVar.c) {
            try {
                PackageInfo f2 = dy2.f(str, 134217729);
                if (f2 != null) {
                    SigningInfo signingInfo = f2.signingInfo;
                    if (signingInfo == null || (signatureArr = signingInfo.getSigningCertificateHistory()) == null) {
                        signatureArr = new Signature[0];
                    }
                    Signature signature = signatureArr.length == 0 ? null : signatureArr[signatureArr.length - 1];
                    String b = signature != null ? u790.b(signature) : null;
                    if (b == null) {
                        b = "";
                    }
                    a aVar2 = hashMap.get(str);
                    if (aVar2 == null) {
                        aVar2 = new a(io.reactivex.rxjava3.subjects.d.N0());
                        hashMap.put(str, aVar2);
                    }
                    new io.reactivex.rxjava3.internal.operators.observable.c0(rsg0.T(new fym(str, b)).a0(asu0.a.d()), new o7y(new ut30(aVar2, 7), 7), io.reactivex.rxjava3.internal.functions.a.c).subscribe(new fsq(new rh4(22, aVar2, str), 14), new b0y(new el30(aVar2, 11), 13));
                }
            } catch (Throwable th3) {
                com.vk.metrics.eventtracking.b.a.q(th3);
            }
        }
        return aVar.d.a0(asu0.a.d()).U(new nh40(new na7(22, aVar, str), 4));
    }
}
