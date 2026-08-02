package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;

/* loaded from: classes11.dex */
public final class fg1 extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ fg1(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                try {
                    return (Cipher) s1o.b.a.n("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e) {
                    ny61.o(e);
                    return null;
                }
            case 1:
                try {
                    return (Cipher) s1o.b.a.n("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e2) {
                    ny61.o(e2);
                    return null;
                }
            case 2:
                try {
                    return (Cipher) s1o.b.a.n("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e3) {
                    ny61.o(e3);
                    return null;
                }
            case 3:
                try {
                    return (Cipher) s1o.b.a.n("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e4) {
                    ny61.o(e4);
                    return null;
                }
            case 4:
                return new StringBuilder("bitmapHunter");
            case 5:
                return new LinkedHashMap();
            case 6:
                return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
            case 7:
                return new SimpleDateFormat("HH:mm:ss", Locale.US);
            case 8:
                return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
            case 9:
                return new Random();
            case 10:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return geb1.f();
                }
                if (Looper.myLooper() != null) {
                    return new k6u(new Handler(Looper.myLooper()));
                }
                return null;
            case 11:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(zuu.a);
                return simpleDateFormat;
            default:
                return Boolean.FALSE;
        }
    }
}
