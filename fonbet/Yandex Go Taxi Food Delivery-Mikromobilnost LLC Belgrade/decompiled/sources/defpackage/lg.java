package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.ParserException;
import com.google.android.gms.common.a;
import com.google.android.gms.common.b;
import com.google.android.gms.internal.play_billing.g;
import com.yandex.messaging.internal.view.timeline.overlay.e;
import com.yandex.messaging.internal.view.timeline.overlay.f;
import com.yandex.payment.sdk.cardscanner.CardScannerActivity;
import com.yandex.payment.sdk.core.camerascanner.CardScannerError;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public class lg implements cp7 {
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public lg(Fragment fragment, int i) {
        this.b = fragment.requireActivity();
        this.a = i;
        this.d = fragment.registerForActivityResult(new j50(), new v50(4, this));
    }

    public String a(long j, long j2, String str, int i) {
        String[] strArr = (String[]) this.d;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.a;
            String[] strArr2 = (String[]) this.b;
            if (i2 >= i3) {
                sb.append(strArr2[i3]);
                return sb.toString();
            }
            sb.append(strArr2[i2]);
            int i4 = ((int[]) this.c)[i2];
            if (i4 == 1) {
                sb.append(str);
            } else if (i4 == 2) {
                sb.append(String.format(Locale.US, strArr[i2], Long.valueOf(j)));
            } else if (i4 == 3) {
                sb.append(String.format(Locale.US, strArr[i2], Integer.valueOf(i)));
            } else if (i4 == 4) {
                sb.append(String.format(Locale.US, strArr[i2], Long.valueOf(j2)));
            }
            i2++;
        }
    }

    public Object b() {
        Object removeLast;
        synchronized (this.c) {
            removeLast = ((ArrayDeque) this.b).removeLast();
        }
        return removeLast;
    }

    public void c(Object obj) {
        Object b;
        synchronized (this.c) {
            try {
                b = ((ArrayDeque) this.b).size() >= this.a ? b() : null;
                ((ArrayDeque) this.b).addFirst(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((dy31) this.d) == null || b == null) {
            return;
        }
        ((jdv) b).close();
    }

    public String d(ga0 ga0Var, Uri uri, int i) {
        String str = (String) this.d;
        String str2 = (String) this.b;
        String str3 = (String) this.c;
        int i2 = this.a;
        if (i2 == 1) {
            String encodeToString = Base64.encodeToString((ga0Var.a + ":" + ga0Var.b).getBytes(njl0.z), 0);
            int i3 = tw21.a;
            Locale locale = Locale.US;
            return g8e.o("Basic ", encodeToString);
        }
        if (i2 != 2) {
            throw new ParserException(4, null, new UnsupportedOperationException(), false);
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String h = ojl0.h(i);
            String str4 = ga0Var.a + ":" + str2 + ":" + ga0Var.b;
            Charset charset = njl0.z;
            String j0 = tw21.j0(messageDigest.digest((tw21.j0(messageDigest.digest(str4.getBytes(charset))) + ":" + str3 + ":" + tw21.j0(messageDigest.digest((h + ":" + uri).getBytes(charset)))).getBytes(charset)));
            if (str.isEmpty()) {
                return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", ga0Var.a, str2, str3, uri, j0);
            }
            return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", ga0Var.a, str2, str3, uri, j0, str);
        } catch (NoSuchAlgorithmException e) {
            throw new ParserException(4, null, e, false);
        }
    }

    public int e() {
        int i = this.a;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public boolean f() {
        boolean isEmpty;
        synchronized (this.c) {
            isEmpty = ((ArrayDeque) this.b).isEmpty();
        }
        return isEmpty;
    }

    public void g(vs7 vs7Var) {
        FragmentActivity fragmentActivity = (FragmentActivity) this.b;
        if (((vs7) this.c) != null) {
            vs7Var.h(CardScannerError.Unknown);
        } else if (a.d.d(fragmentActivity, b.a) != 0) {
            vs7Var.h(CardScannerError.NoMlServices);
        } else {
            this.c = vs7Var;
            ((m50) this.d).a(new Intent(fragmentActivity, (Class<?>) CardScannerActivity.class).putExtra(CardScannerActivity.THEME_RES_ID, this.a));
        }
    }

    public void h(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        com.yandex.messaging.internal.view.timeline.overlay.b bVar = (com.yandex.messaging.internal.view.timeline.overlay.b) this.c;
        b190 b190Var = (b190) this.b;
        e eVar = bVar.x;
        ip31 ip31Var = bVar.b;
        f fVar = bVar.z;
        if (b190Var.equals(fVar)) {
            eVar.q(i > 0);
        }
        int c = bVar.c(bVar.y, bVar.c(eVar, bVar.c(fVar, bVar.c(bVar.w, bVar.G))));
        if (ip31Var.a.getMinimumWidth() != c) {
            ip31Var.a.setMinimumWidth(c);
            View view = ip31Var.a;
            if (view.isLayoutRequested()) {
                view.post(new ce0(view, 26));
            }
        }
        x4e.z(c, bVar.E, null);
    }

    public void i(Throwable th) {
        boolean z = th instanceof TimeoutException;
        com.android.billingclient.api.e eVar = (com.android.billingclient.api.e) this.d;
        if (z) {
            eVar.J(114, 28, fe91.u);
            g.h("BillingClientTesting");
        } else {
            eVar.J(HProv.PP_SET_PIN, 28, fe91.u);
            g.h("BillingClientTesting");
        }
        ((Runnable) this.c).run();
    }

    public lg(com.android.billingclient.api.e eVar, int i, Consumer consumer, Runnable runnable) {
        this.a = i;
        this.b = consumer;
        this.c = runnable;
        this.d = eVar;
    }

    public lg(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.b = strArr;
        this.c = iArr;
        this.d = strArr2;
        this.a = i;
    }

    public lg(b190 b190Var, com.yandex.messaging.internal.view.timeline.overlay.b bVar) {
        this.b = b190Var;
        this.c = bVar;
    }

    public /* synthetic */ lg(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public lg(int i, dy31 dy31Var) {
        this.c = new Object();
        this.a = i;
        this.b = new ArrayDeque(i);
        this.d = dy31Var;
    }

    public lg(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.b = str;
        this.a = i2;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.c = unmodifiableList;
        this.d = bArr;
    }

    public /* synthetic */ lg(int i, sls slsVar, sls slsVar2, Integer num, int i2) {
        this(i, slsVar, slsVar2, (i2 & 16) != 0 ? null : num);
    }

    public lg(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.b = uuid;
        this.a = i;
        this.c = bArr;
        this.d = uuidArr;
    }

    public lg(o5t0 o5t0Var, fn6 fn6Var, c820 c820Var) {
        this.b = o5t0Var;
        this.c = fn6Var;
        this.d = c820Var;
    }
}
