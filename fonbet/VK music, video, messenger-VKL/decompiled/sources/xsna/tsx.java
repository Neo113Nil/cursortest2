package xsna;

import android.net.Uri;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: IpMaskChecker.kt */
/* loaded from: classes3.dex */
public final class tsx {
    public final gzs<Boolean> a;
    public final ArrayList b;

    /* compiled from: IpMaskChecker.kt */
    public static final class a {
        public final int a;
        public final InetAddress b;

        public a(String str) {
            String str2;
            int i;
            InetAddress inetAddress;
            if (drm0.L(str, '/', 0, 6) > 0) {
                String[] strArr = (String[]) drm0.c0(str, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6).toArray(new String[0]);
                str2 = strArr[0];
                i = Integer.parseInt(strArr[1]);
            } else {
                str2 = str;
                i = -1;
            }
            this.a = i;
            try {
                inetAddress = InetAddress.getByName(str2);
            } catch (UnknownHostException unused) {
                inetAddress = null;
            }
            this.b = inetAddress;
        }
    }

    public tsx(Set<String> set, gzs<Boolean> gzsVar) {
        this.a = gzsVar;
        Set<String> set2 = set;
        ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(new a((String) it.next()));
        }
        this.b = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[LOOP:0: B:17:0x0048->B:26:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str) {
        boolean z;
        boolean z2;
        if (this.a.invoke().booleanValue()) {
            com.vk.core.utils.newtork.b.a.getClass();
            if (com.vk.core.utils.newtork.b.d()) {
                try {
                    String host = Uri.parse(str).getHost();
                    if (host != null) {
                        ArrayList arrayList = this.b;
                        if (!arrayList.isEmpty()) {
                            InetAddress byName = InetAddress.getByName(host);
                            if (arrayList == null || !arrayList.isEmpty()) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    a aVar = (a) it.next();
                                    int i = aVar.a;
                                    InetAddress inetAddress = aVar.b;
                                    if (inetAddress != null && inetAddress.getClass().equals(byName.getClass())) {
                                        if (i < 0) {
                                            z = byName.equals(inetAddress);
                                        } else {
                                            byte[] address = byName.getAddress();
                                            byte[] address2 = inetAddress.getAddress();
                                            int i2 = i / 8;
                                            byte b = (byte) (65280 >> (i & 7));
                                            int i3 = 0;
                                            while (true) {
                                                if (i3 < i2) {
                                                    if (address[i3] != address2[i3]) {
                                                        break;
                                                    }
                                                    i3++;
                                                } else if (b == 0 || ((byte) (address[i2] & b)) == ((byte) (address2[i2] & b))) {
                                                    z = true;
                                                }
                                            }
                                        }
                                        if (!z) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                    z = false;
                                    if (!z) {
                                    }
                                }
                            }
                            z2 = false;
                            if (z2) {
                            }
                        }
                        return false;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return true;
    }
}
