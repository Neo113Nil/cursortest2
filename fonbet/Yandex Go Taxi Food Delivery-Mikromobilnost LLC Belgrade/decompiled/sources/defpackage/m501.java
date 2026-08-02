package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.webkit.MimeTypeMap;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.items.Direction;
import com.yandex.div.core.view2.items.a;
import com.yandex.div.core.view2.items.b;
import com.yandex.div.core.view2.items.c;
import com.yandex.div2.DivGallery;
import com.yandex.messaging.internal.authorized.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.time.Instant;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class m501 implements s501, hxq0, af41, jh51, ww01, s8i0, h43, k43, vyn, i67, hwe, qt5, b731, f8p, ims, x3c, wxr {
    public static final m501 b = new m501(0);
    public static final m501 c = new m501(1);
    public static final m501 w = new m501(2);
    public static final m501 x = new m501(3);
    public static final m501 y = new m501(4);
    public static final /* synthetic */ m501 z = new m501(5);
    public final /* synthetic */ int a;

    public m501(kse kseVar, j jVar) {
        this.a = 13;
    }

    public static String A(Context context, Uri uri) {
        try {
            String extensionFromMimeType = uri.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            if (extensionFromMimeType == null || extensionFromMimeType.isEmpty()) {
                return null;
            }
            return Extension.DOT_CHAR + C(extensionFromMimeType);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        r13.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[Catch: all -> 0x0071, TryCatch #2 {all -> 0x0071, blocks: (B:5:0x000b, B:58:0x004d, B:11:0x0063, B:13:0x0069, B:16:0x0075, B:17:0x008d, B:20:0x00b8, B:29:0x00d3, B:43:0x00e5, B:42:0x00e2, B:44:0x00aa, B:46:0x007c, B:49:0x0089, B:50:0x0085, B:9:0x005f, B:69:0x005c, B:68:0x0059, B:37:0x00dc, B:52:0x0037, B:54:0x003d, B:57:0x0045, B:63:0x0053, B:23:0x00bf, B:24:0x00c1, B:26:0x00c8, B:28:0x00cc), top: B:4:0x000b, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8 A[Catch: all -> 0x00da, LOOP:0: B:24:0x00c1->B:26:0x00c8, LOOP_END, TryCatch #4 {all -> 0x00da, blocks: (B:23:0x00bf, B:24:0x00c1, B:26:0x00c8, B:28:0x00cc), top: B:22:0x00bf, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa A[Catch: all -> 0x0071, TryCatch #2 {all -> 0x0071, blocks: (B:5:0x000b, B:58:0x004d, B:11:0x0063, B:13:0x0069, B:16:0x0075, B:17:0x008d, B:20:0x00b8, B:29:0x00d3, B:43:0x00e5, B:42:0x00e2, B:44:0x00aa, B:46:0x007c, B:49:0x0089, B:50:0x0085, B:9:0x005f, B:69:0x005c, B:68:0x0059, B:37:0x00dc, B:52:0x0037, B:54:0x003d, B:57:0x0045, B:63:0x0053, B:23:0x00bf, B:24:0x00c1, B:26:0x00c8, B:28:0x00cc), top: B:4:0x000b, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String B(Context context, Uri uri) {
        String C;
        String canonicalPath;
        File file;
        FileOutputStream fileOutputStream;
        byte[] bArr;
        int read;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                File file2 = new File(context.getCacheDir(), UUID.randomUUID().toString());
                file2.mkdir();
                file2.deleteOnExit();
                Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                try {
                    if (query != null) {
                        try {
                            if (query.moveToFirst() && query.getColumnCount() >= 1) {
                                C = C(query.getString(0));
                                query.close();
                                String A = A(context, uri);
                                if (C != null) {
                                    Objects.toString(uri);
                                    if (A == null) {
                                        A = ".jpg";
                                    }
                                    C = "image_picker".concat(A);
                                } else if (A != null) {
                                    int lastIndexOf = C.lastIndexOf(46);
                                    if (lastIndexOf >= 0) {
                                        C = C.substring(0, lastIndexOf);
                                    }
                                    C = C.concat(A);
                                }
                                String path = new File(file2, C).getPath();
                                canonicalPath = file2.getCanonicalPath();
                                file = new File(path);
                                if (file.getCanonicalPath().startsWith(canonicalPath)) {
                                    yhl.f("Trying to open path outside of the expected directory. File: ", file.getCanonicalPath(), " was expected to be within directory: ", canonicalPath, Extension.DOT_CHAR);
                                    file = null;
                                }
                                fileOutputStream = new FileOutputStream(file);
                                bArr = new byte[4096];
                                while (true) {
                                    read = openInputStream.read(bArr);
                                    if (read != -1) {
                                        fileOutputStream.flush();
                                        String path2 = file.getPath();
                                        fileOutputStream.close();
                                        openInputStream.close();
                                        return path2;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                            }
                        } finally {
                        }
                    }
                    bArr = new byte[4096];
                    while (true) {
                        read = openInputStream.read(bArr);
                        if (read != -1) {
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
                C = null;
                String A2 = A(context, uri);
                if (C != null) {
                }
                String path3 = new File(file2, C).getPath();
                canonicalPath = file2.getCanonicalPath();
                file = new File(path3);
                if (file.getCanonicalPath().startsWith(canonicalPath)) {
                }
                fileOutputStream = new FileOutputStream(file);
            } finally {
            }
        } catch (IOException | IllegalArgumentException | SecurityException unused) {
            return null;
        }
    }

    public static String C(String str) {
        if (str == null) {
            return null;
        }
        String[] strArr = {"..", "/"};
        String str2 = str.split("/")[r4.length - 1];
        for (int i = 0; i < 2; i++) {
            str2 = str2.replace(strArr[i], "_");
        }
        return str2;
    }

    public static final sa90 t(Calendar calendar, j7z0 j7z0Var, TimeZone timeZone) {
        Pattern pattern = bwm.c;
        List list = j7z0Var.b;
        int i = j7z0Var.d;
        Iterator it = list.iterator();
        Calendar calendar2 = null;
        long j = -1;
        Calendar calendar3 = null;
        long j2 = -1;
        while (it.hasNext()) {
            h7z0 h7z0Var = (h7z0) it.next();
            long timeInMillis = calendar.getTimeInMillis();
            Calendar calendar4 = h7z0Var.b;
            Calendar calendar5 = h7z0Var.a;
            long timeInMillis2 = timeInMillis - calendar4.getTimeInMillis();
            long timeInMillis3 = calendar5.getTimeInMillis() - calendar.getTimeInMillis();
            Iterator it2 = it;
            if (timeInMillis2 > 0 && (j2 < 0 || timeInMillis2 < j2)) {
                calendar2 = wf7.c(h7z0Var.b, timeZone);
                calendar2.add(12, i);
                j2 = timeInMillis2;
            }
            if (timeInMillis3 <= 0 || (j >= 0 && timeInMillis3 >= j)) {
                it = it2;
            } else {
                calendar3 = wf7.c(calendar5, timeZone);
                calendar3.add(12, -i);
                it = it2;
                j = timeInMillis3;
            }
        }
        if (calendar2 == null) {
            calendar2 = Calendar.getInstance();
            calendar2.setTimeZone(timeZone);
        }
        if (calendar3 == null) {
            calendar3 = Calendar.getInstance();
            calendar3.setTimeZone(timeZone);
        }
        return new sa90(calendar2, calendar3);
    }

    public static final String w(Calendar calendar) {
        Pattern pattern = bwm.c;
        return String.format("%1$tH:%1$tM", Arrays.copyOf(new Object[]{calendar}, 1));
    }

    public static g191 y(String str, fpl fplVar, rvo rvoVar, Direction direction) {
        Object bVar;
        View findViewWithTag = fplVar.getView().findViewWithTag(str);
        if (findViewWithTag != null) {
            if (findViewWithTag instanceof DivRecyclerView) {
                DivRecyclerView divRecyclerView = (DivRecyclerView) findViewWithTag;
                int i = wpl.a[((DivGallery.ScrollMode) divRecyclerView.getDiv().c.D.a(rvoVar)).ordinal()];
                if (i == 1) {
                    bVar = new a(divRecyclerView, direction);
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    bVar = new aql(divRecyclerView, direction);
                }
            } else {
                bVar = findViewWithTag instanceof DivPagerView ? new b((DivPagerView) findViewWithTag) : findViewWithTag instanceof DivTabsLayout ? new c((DivTabsLayout) findViewWithTag) : null;
            }
            if (bVar != null) {
                return new g191(bVar);
            }
        }
        return null;
    }

    @Override // defpackage.af41
    public void E(String str) {
    }

    @Override // defpackage.af41
    public void H() {
    }

    @Override // defpackage.i67
    public Class a() {
        return ByteBuffer.class;
    }

    @Override // defpackage.ww01, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        switch (this.a) {
            case 5:
                return (byte[]) obj;
            default:
                return obj;
        }
    }

    @Override // defpackage.h43, defpackage.k43
    public float b() {
        return 0.0f;
    }

    @Override // defpackage.s8i0
    public void c(String str, boolean z2) {
    }

    @Override // defpackage.f8p
    public h8p f(float f, float f2, float f3) {
        return new h8p(ry01.e(f2, f3, f, 255, 0), ry01.e(f2, f3, f, 0, 255), false);
    }

    @Override // defpackage.hxq0
    /* renamed from: i */
    public String getAlias() {
        return "";
    }

    @Override // defpackage.i67
    public Object k(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    @Override // defpackage.k43
    public void m(fwi fwiVar, int i, int[] iArr, int[] iArr2) {
        lr20.b(i, iArr, iArr2, false);
    }

    @Override // defpackage.x3c
    public Instant now() {
        Instant instant = Instant.a;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis / 1000;
        if ((currentTimeMillis ^ 1000) < 0 && j * 1000 != currentTimeMillis) {
            j--;
        }
        long j2 = currentTimeMillis % 1000;
        return j < -31557014167219200L ? Instant.a : j > 31556889864403199L ? Instant.b : vng.m((int) ((j2 + (1000 & (((j2 ^ 1000) & ((-j2) | j2)) >> 63))) * 1000000), j);
    }

    @Override // defpackage.qt5
    public void q(ByteBuffer byteBuffer, yfg yfgVar) {
        zsu0.b.getClass();
        zsu0.c(byteBuffer);
    }

    @Override // defpackage.hwe
    public void q0() {
    }

    @Override // defpackage.hwe
    public String r0() {
        return "";
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "Arrangement#Center";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.h43
    public void u(fwi fwiVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.Ltr) {
            lr20.b(i, iArr, iArr2, false);
        } else {
            lr20.b(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.vyn
    public void v(azn aznVar) {
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (true) {
            boolean b2 = aznVar.b();
            sb = aznVar.c;
            if (!b2) {
                break;
            }
            sb2.append(aznVar.a());
            int i = aznVar.d + 1;
            aznVar.d = i;
            if (l1b1.k(i, 5, aznVar.a) != 5) {
                aznVar.e = 0;
                break;
            }
        }
        int length = sb2.length() - 1;
        int length2 = sb.length() + length + 1;
        aznVar.c(length2);
        boolean z2 = aznVar.f.b - length2 > 0;
        if (aznVar.b() || z2) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else if (length > 1555) {
                ny61.r(oyr.i(length, "Message length not in valid ranges: "));
                return;
            } else {
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            }
        }
        int length3 = sb2.length();
        for (int i2 = 0; i2 < length3; i2++) {
            int length4 = (((sb.length() + 1) * 149) % 255) + 1 + sb2.charAt(i2);
            if (length4 > 255) {
                length4 -= 256;
            }
            aznVar.d((char) length4);
        }
    }

    public void x(yyn yynVar) {
        yynVar.a(pfa1.class, ro91.a);
        yynVar.a(isa1.class, u1a1.a);
        yynVar.a(vfa1.class, xo91.a);
        yynVar.a(tga1.class, hp91.a);
        yynVar.a(fga1.class, cp91.a);
        yynVar.a(mga1.class, kp91.a);
        yynVar.a(o9a1.class, ak91.a);
        yynVar.a(i9a1.class, yj91.a);
        yynVar.a(dda1.class, rn91.a);
        yynVar.a(qqa1.class, zz91.a);
        yynVar.a(b9a1.class, rj91.a);
        yynVar.a(w8a1.class, qj91.a);
        yynVar.a(sia1.class, bs91.a);
        yynVar.a(mwa1.class, lm91.a);
        yynVar.a(kca1.class, en91.a);
        yynVar.a(sba1.class, gm91.a);
        yynVar.a(zia1.class, ds91.a);
        yynVar.a(bqa1.class, iz91.a);
        yynVar.a(fqa1.class, nz91.a);
        yynVar.a(vpa1.class, bz91.a);
        yynVar.a(pha1.class, uq91.a);
        yynVar.a(hwa1.class, fg91.a);
        yynVar.a(vha1.class, wq91.a);
        yynVar.a(zka1.class, vt91.a);
        yynVar.a(ola1.class, mu91.a);
        yynVar.a(jla1.class, hu91.a);
        yynVar.a(ela1.class, bu91.a);
        yynVar.a(una1.class, iw91.a);
        yynVar.a(xna1.class, qw91.a);
        yynVar.a(joa1.class, lx91.a);
        yynVar.a(coa1.class, gx91.a);
        yynVar.a(iha1.class, pq91.a);
        yynVar.a(ooa1.class, sx91.a);
        yynVar.a(toa1.class, zx91.a);
        yynVar.a(zoa1.class, fy91.a);
        yynVar.a(dpa1.class, ky91.a);
        yynVar.a(ppa1.class, qy91.a);
        yynVar.a(jpa1.class, wy91.a);
        yynVar.a(qna1.class, pv91.a);
        yynVar.a(nea1.class, jo91.a);
        yynVar.a(ena1.class, vv91.a);
        yynVar.a(yma1.class, rv91.a);
        yynVar.a(jna1.class, bw91.a);
        yynVar.a(lqa1.class, tz91.a);
        yynVar.a(mta1.class, q3a1.a);
        yynVar.a(c6a1.class, sh91.a);
        yynVar.a(r5a1.class, nh91.a);
        yynVar.a(k5a1.class, fh91.a);
        yynVar.a(v5a1.class, oh91.a);
        yynVar.a(q6a1.class, di91.a);
        yynVar.a(j6a1.class, zh91.a);
        yynVar.a(y6a1.class, ei91.a);
        yynVar.a(e7a1.class, ki91.a);
        yynVar.a(m7a1.class, qi91.a);
        yynVar.a(u7a1.class, ui91.a);
        yynVar.a(a8a1.class, zi91.a);
        yynVar.a(qa91.class, rf91.a);
        yynVar.a(ua91.class, ag91.a);
        yynVar.a(sa91.class, vf91.a);
        yynVar.a(cea1.class, eo91.a);
        yynVar.a(w9a1.class, gk91.a);
        yynVar.a(w691.class, cb91.a);
        yynVar.a(u691.class, eb91.a);
        yynVar.a(hba1.class, ml91.a);
        yynVar.a(h791.class, gb91.a);
        yynVar.a(b791.class, jb91.a);
        yynVar.a(w791.class, ld91.a);
        yynVar.a(t791.class, md91.a);
        yynVar.a(m791.class, kb91.a);
        yynVar.a(k791.class, ob91.a);
        yynVar.a(e991.class, de91.a);
        yynVar.a(c991.class, ee91.a);
        yynVar.a(r991.class, ne91.a);
        yynVar.a(m991.class, qe91.a);
        yynVar.a(ma91.class, if91.a);
        yynVar.a(ha91.class, nf91.a);
        yynVar.a(x991.class, se91.a);
        yynVar.a(u991.class, ve91.a);
        yynVar.a(ea91.class, af91.a);
        yynVar.a(ba91.class, ff91.a);
        yynVar.a(cva1.class, q0a1.a);
        yynVar.a(rta1.class, kk91.a);
        yynVar.a(mua1.class, jq91.a);
        yynVar.a(hua1.class, zp91.a);
        yynVar.a(xta1.class, qm91.a);
        yynVar.a(yua1.class, l0a1.a);
        yynVar.a(sua1.class, e0a1.a);
        yynVar.a(jva1.class, w0a1.a);
        yynVar.a(cua1.class, vn91.a);
        yynVar.a(bwa1.class, c4a1.a);
        yynVar.a(wva1.class, j4a1.a);
        yynVar.a(pva1.class, w3a1.a);
        yynVar.a(xqa1.class, a1a1.a);
        yynVar.a(xda1.class, zn91.a);
        yynVar.a(tea1.class, qo91.a);
        yynVar.a(c5a1.class, kg91.a);
        yynVar.a(qca1.class, fn91.a);
        yynVar.a(gea1.class, io91.a);
        yynVar.a(nba1.class, rl91.a);
        yynVar.a(oaa1.class, uk91.a);
        yynVar.a(vaa1.class, wk91.a);
        yynVar.a(jaa1.class, ok91.a);
        yynVar.a(aba1.class, al91.a);
        yynVar.a(cha1.class, yp91.a);
        yynVar.a(xga1.class, pp91.a);
        yynVar.a(t691.class, ya91.a);
        yynVar.a(xsa1.class, n2a1.a);
        yynVar.a(hta1.class, a3a1.a);
        yynVar.a(cta1.class, t2a1.a);
        yynVar.a(w4a1.class, bg91.a);
        yynVar.a(q8a1.class, nj91.a);
        yynVar.a(l8a1.class, hj91.a);
        yynVar.a(g8a1.class, gj91.a);
        yynVar.a(bia1.class, ir91.a);
        yynVar.a(lia1.class, tr91.a);
        yynVar.a(gia1.class, or91.a);
        yynVar.a(q791.class, zc91.a);
        yynVar.a(o791.class, fd91.a);
        yynVar.a(gja1.class, is91.a);
        yynVar.a(aka1.class, at91.a);
        yynVar.a(mja1.class, ps91.a);
        yynVar.a(tja1.class, us91.a);
        yynVar.a(r891.class, qd91.a);
        yynVar.a(n891.class, td91.a);
        yynVar.a(ira1.class, m1a1.a);
        yynVar.a(cra1.class, h1a1.a);
        yynVar.a(msa1.class, z1a1.a);
        yynVar.a(rsa1.class, g2a1.a);
        yynVar.a(ula1.class, su91.a);
        yynVar.a(rma1.class, hv91.a);
        yynVar.a(zla1.class, xu91.a);
        yynVar.a(kma1.class, bv91.a);
        yynVar.a(i991.class, ge91.a);
        yynVar.a(h991.class, je91.a);
        yynVar.a(xca1.class, jn91.a);
        yynVar.a(zba1.class, wm91.a);
        yynVar.a(hka1.class, ft91.a);
        yynVar.a(tka1.class, pt91.a);
        yynVar.a(mka1.class, kt91.a);
        yynVar.a(y891.class, wd91.a);
        yynVar.a(v891.class, zd91.a);
    }

    @Override // defpackage.af41
    public void z() {
    }

    public /* synthetic */ m501(int i, Object obj) {
        this.a = i;
    }

    public /* synthetic */ m501(int i) {
        this.a = i;
    }
}
