package xsna;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import com.google.android.gms.internal.measurement.zznn;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.core.preference.Preference;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vk.log.L;
import com.vk.stat.vkstat.VkStatSettings;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.chromium.base.TimeUtils;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import xsna.q630;

/* compiled from: OpenInfoPopupButtonTransformer.kt */
@vby
/* loaded from: classes16.dex */
public final class hr80 implements znj, zqi, q701, cvx, ulv, o320 {
    public static final hr80 b = new hr80();
    public static final hr80 c = new hr80();
    public static final hr80 d = new hr80();
    public static final String[] e = {"SHA-256", "SHA-384", "SHA-512"};
    public static final hr80 f = new hr80();
    public static final /* synthetic */ hr80 g = new hr80();

    public static final q630 A(q630 q630Var, izs izsVar) {
        return q630Var.g(new ba80(izsVar));
    }

    public static String B(String str) {
        byte[] bArr;
        byte[] bArr2;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("SHA-256")) {
            c2f0.b("SHA", "content or algorithm is null.");
            return "";
        }
        for (int i = 0; i < 3; i++) {
            String[] strArr = e;
            if (strArr[i].equals("SHA-256")) {
                try {
                    bArr = str.getBytes(C.UTF8_NAME);
                } catch (UnsupportedEncodingException unused) {
                    bArr = new byte[0];
                    c2f0.b("SHA", "Error in generate SHA UnsupportedEncodingException");
                }
                if (bArr == null || TextUtils.isEmpty("SHA-256")) {
                    c2f0.b("SHA", "content or algorithm is null.");
                    bArr2 = new byte[0];
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 3) {
                            c2f0.b("SHA", "algorithm is not safe or legal");
                            bArr2 = new byte[0];
                            break;
                        }
                        if (strArr[i2].equals("SHA-256")) {
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                messageDigest.update(bArr);
                                bArr2 = messageDigest.digest();
                                break;
                            } catch (NoSuchAlgorithmException unused2) {
                                c2f0.b("SHA", "Error in generate SHA NoSuchAlgorithmException");
                                bArr2 = new byte[0];
                            }
                        } else {
                            i2++;
                        }
                    }
                }
                return zq70.l(bArr2);
            }
        }
        c2f0.b("SHA", "algorithm is not safe or legal");
        return "";
    }

    public static ArrayList C(Collection collection, SparseArray sparseArray, ProfilesInfo profilesInfo) {
        Collection<AttachAudioMsg> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        for (AttachAudioMsg attachAudioMsg : collection2) {
            arrayList.add(D(attachAudioMsg, (lsx0) sparseArray.get(attachAudioMsg.b), profilesInfo));
        }
        return arrayList;
    }

    public static ur4 D(AttachAudioMsg attachAudioMsg, lsx0 lsx0Var, ProfilesInfo profilesInfo) {
        Peer a = com.vk.dto.common.a.a(attachAudioMsg.d);
        int i = attachAudioMsg.b;
        long j = attachAudioMsg.e;
        long j2 = attachAudioMsg.d.b;
        long y = lsx0Var.y();
        int Z5 = lsx0Var.Z5();
        String e2 = new DisplayNameFormatter(null, 3, null).e(profilesInfo != null ? profilesInfo.Bb(a) : null, UserNameCase.NOM);
        int i2 = attachAudioMsg.f;
        ArrayList arrayList = new ArrayList();
        if (myc0.f(attachAudioMsg.j)) {
            arrayList.add(Uri.parse(attachAudioMsg.j));
        }
        if (myc0.f(attachAudioMsg.h)) {
            arrayList.add(Uri.parse(attachAudioMsg.h));
        }
        s3q0 s3q0Var = s3q0.a;
        return new ur4(i, j, j2, y, Z5, e2, i2, arrayList);
    }

    public static QualitySettingsType F(int i) {
        Object obj;
        Iterator<E> it = QualitySettingsType.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((QualitySettingsType) obj).i() == i) {
                break;
            }
        }
        QualitySettingsType qualitySettingsType = (QualitySettingsType) obj;
        return qualitySettingsType == null ? QualitySettingsType.AUTO : qualitySettingsType;
    }

    public static String G(int i) {
        return uqi.a("GroupType(type=", i, ')');
    }

    public static final void H(htl htlVar, Object obj, izs izsVar) {
        u470 u470Var;
        boolean z;
        if (!htlVar.z().o) {
            uzw.b("visitAncestors called on an unattached node");
        }
        q630.c cVar = htlVar.z().f;
        LayoutNode f2 = itl.f(htlVar);
        while (f2 != null) {
            if ((f2.G.f.e & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                while (cVar != null) {
                    if ((cVar.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                        q630.c cVar2 = cVar;
                        ci50 ci50Var = null;
                        while (cVar2 != null) {
                            if (cVar2 instanceof npp0) {
                                npp0 npp0Var = (npp0) cVar2;
                                if (!(epx.f(obj, npp0Var.g0()) ? ((Boolean) izsVar.invoke(npp0Var)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                if (((cVar2.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) && (cVar2 instanceof ytl)) {
                                    int i = 0;
                                    for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                        if ((cVar3.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cVar2 = cVar3;
                                            } else {
                                                if (ci50Var == null) {
                                                    ci50Var = new ci50(new q630.c[16]);
                                                }
                                                if (cVar2 != null) {
                                                    ci50Var.b(cVar2);
                                                    cVar2 = null;
                                                }
                                                ci50Var.b(cVar3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            cVar2 = itl.b(ci50Var);
                        }
                    }
                    cVar = cVar.f;
                }
            }
            f2 = f2.I();
            cVar = (f2 == null || (u470Var = f2.G) == null) ? null : u470Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void I(npp0 npp0Var, izs izsVar) {
        u470 u470Var;
        boolean z;
        q630.c cVar = (q630.c) npp0Var;
        if (!cVar.b.o) {
            uzw.b("visitAncestors called on an unattached node");
        }
        q630.c cVar2 = cVar.b.f;
        LayoutNode f2 = itl.f(npp0Var);
        while (f2 != null) {
            if ((f2.G.f.e & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                while (cVar2 != null) {
                    if ((cVar2.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                        q630.c cVar3 = cVar2;
                        ci50 ci50Var = null;
                        while (cVar3 != null) {
                            if (cVar3 instanceof npp0) {
                                npp0 npp0Var2 = (npp0) cVar3;
                                if (!((epx.f(npp0Var.g0(), npp0Var2.g0()) && npp0Var.getClass() == npp0Var2.getClass()) ? ((Boolean) izsVar.invoke(npp0Var2)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                if (((cVar3.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) && (cVar3 instanceof ytl)) {
                                    int i = 0;
                                    for (q630.c cVar4 = ((ytl) cVar3).q; cVar4 != null; cVar4 = cVar4.g) {
                                        if ((cVar4.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cVar3 = cVar4;
                                            } else {
                                                if (ci50Var == null) {
                                                    ci50Var = new ci50(new q630.c[16]);
                                                }
                                                if (cVar3 != null) {
                                                    ci50Var.b(cVar3);
                                                    cVar3 = null;
                                                }
                                                ci50Var.b(cVar4);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            cVar3 = itl.b(ci50Var);
                        }
                    }
                    cVar2 = cVar2.f;
                }
            }
            f2 = f2.I();
            cVar2 = (f2 == null || (u470Var = f2.G) == null) ? null : u470Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void J(q630.c cVar, String str, izs izsVar) {
        if (!cVar.b.o) {
            uzw.b("visitSubtreeIf called on an unattached node");
        }
        ci50 ci50Var = new ci50(new q630.c[16]);
        q630.c cVar2 = cVar.b;
        q630.c cVar3 = cVar2.g;
        if (cVar3 == null) {
            itl.a(ci50Var, cVar2);
        } else {
            ci50Var.b(cVar3);
        }
        while (true) {
            int i = ci50Var.d;
            if (i == 0) {
                return;
            }
            q630.c cVar4 = (q630.c) ci50Var.k(i - 1);
            if ((cVar4.e & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                for (q630.c cVar5 = cVar4; cVar5 != null && cVar5.o; cVar5 = cVar5.g) {
                    if ((cVar5.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                        ytl ytlVar = cVar5;
                        ?? r6 = 0;
                        while (ytlVar != 0) {
                            if (ytlVar instanceof npp0) {
                                npp0 npp0Var = (npp0) ytlVar;
                                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = str.equals(npp0Var.g0()) ? (TraversableNode$Companion$TraverseDescendantsAction) izsVar.invoke(npp0Var) : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((ytlVar.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && (ytlVar instanceof ytl)) {
                                q630.c cVar6 = ytlVar.q;
                                int i2 = 0;
                                ytlVar = ytlVar;
                                r6 = r6;
                                while (cVar6 != null) {
                                    if ((cVar6.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                        i2++;
                                        r6 = r6;
                                        if (i2 == 1) {
                                            ytlVar = cVar6;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new ci50(new q630.c[16]);
                                            }
                                            if (ytlVar != 0) {
                                                r6.b(ytlVar);
                                                ytlVar = 0;
                                            }
                                            r6.b(cVar6);
                                        }
                                    }
                                    cVar6 = cVar6.g;
                                    ytlVar = ytlVar;
                                    r6 = r6;
                                }
                                if (i2 == 1) {
                                }
                            }
                            ytlVar = itl.b(r6);
                        }
                    }
                }
            }
            itl.a(ci50Var, cVar4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void K(npp0 npp0Var, izs izsVar) {
        if (!npp0Var.z().o) {
            uzw.b("visitSubtreeIf called on an unattached node");
        }
        ci50 ci50Var = new ci50(new q630.c[16]);
        q630.c cVar = npp0Var.z().g;
        if (cVar == null) {
            itl.a(ci50Var, npp0Var.z());
        } else {
            ci50Var.b(cVar);
        }
        while (true) {
            int i = ci50Var.d;
            if (i == 0) {
                return;
            }
            q630.c cVar2 = (q630.c) ci50Var.k(i - 1);
            if ((cVar2.e & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                for (q630.c cVar3 = cVar2; cVar3 != null && cVar3.o; cVar3 = cVar3.g) {
                    if ((cVar3.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                        ytl ytlVar = cVar3;
                        ?? r7 = 0;
                        while (ytlVar != 0) {
                            if (ytlVar instanceof npp0) {
                                npp0 npp0Var2 = (npp0) ytlVar;
                                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = (epx.f(npp0Var.g0(), npp0Var2.g0()) && npp0Var.getClass() == npp0Var2.getClass()) ? (TraversableNode$Companion$TraverseDescendantsAction) izsVar.invoke(npp0Var2) : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((ytlVar.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && (ytlVar instanceof ytl)) {
                                q630.c cVar4 = ytlVar.q;
                                int i2 = 0;
                                ytlVar = ytlVar;
                                r7 = r7;
                                while (cVar4 != null) {
                                    if ((cVar4.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            ytlVar = cVar4;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new ci50(new q630.c[16]);
                                            }
                                            if (ytlVar != 0) {
                                                r7.b(ytlVar);
                                                ytlVar = 0;
                                            }
                                            r7.b(cVar4);
                                        }
                                    }
                                    cVar4 = cVar4.g;
                                    ytlVar = ytlVar;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            ytlVar = itl.b(r7);
                        }
                    }
                }
            }
            itl.a(ci50Var, cVar2);
        }
    }

    public static final void j(final long j, final float f2, final gzs gzsVar, jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        long j2;
        int i2;
        final jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(-2089910538);
        if ((i & 6) == 0) {
            j2 = j;
            i2 = (M.p(j2) ? 4 : 2) | i;
        } else {
            j2 = j;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2089910538, i2, -1, "com.vk.biometrics.lock.impl.presentation.base.view.PinIcon (PinIcon.kt:12)");
            }
            jaiVar2 = jaiVar;
            yj6.a(j2, f2, gzsVar, null, kai.c(-1064110079, new l3m(1, jaiVar2), M), M, (i2 & 14) | 24576 | (i2 & 112) | (i2 & 896), 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.gma0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hr80.j(j, f2, gzsVar, jaiVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final q630 k(float f2, yk8 yk8Var, q630 q630Var, r5j0 r5j0Var) {
        return q630Var.g(new iw5(0L, yk8Var, f2, r5j0Var, a5x.a, 1));
    }

    public static /* synthetic */ q630 l(q630 q630Var, yk8 yk8Var, r5j0 r5j0Var, int i) {
        if ((i & 2) != 0) {
            r5j0Var = androidx.compose.ui.graphics.e.a;
        }
        return k((i & 4) != 0 ? 1.0f : 0.48f, yk8Var, q630Var, r5j0Var);
    }

    public static final q630 m(q630 q630Var, long j, r5j0 r5j0Var) {
        return q630Var.g(new iw5(j, null, 1.0f, r5j0Var, a5x.a, 2));
    }

    public static ArrayList o(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    @NonNull
    public static String p(@NonNull String str) throws IllegalArgumentException {
        if (str != null) {
            return new xp01(str, null).a();
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }

    public static byte q(long j) {
        fxc0.n(j, "out of range: %s", (j >> 8) == 0);
        return (byte) j;
    }

    public static final void r(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static xlv0 s(rlv0 rlv0Var) {
        return new xlv0(new VkStatSettings(0, 0, 3, null), rlv0Var);
    }

    public static final void t(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        Cursor cursor = null;
        try {
            ArrayList arrayList = new ArrayList();
            cursor = sQLiteDatabase.rawQuery("SELECT tbl_name FROM sqlite_master WHERE type='table'", null);
            if (cursor.getCount() != 0) {
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    String string = cursor.getString(0);
                    if (!epx.f(string, "android_metadata") && !epx.f(string, "sqlite_sequence")) {
                        arrayList.add(string);
                    }
                    cursor.moveToNext();
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) it.next()));
            }
            sQLiteDatabase.setTransactionSuccessful();
            cursor.close();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public static final npp0 u(ytl ytlVar, Object obj) {
        u470 u470Var;
        if (!ytlVar.b.o) {
            uzw.b("visitAncestors called on an unattached node");
        }
        q630.c cVar = ytlVar.b.f;
        LayoutNode f2 = itl.f(ytlVar);
        while (f2 != null) {
            if ((f2.G.f.e & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                while (cVar != null) {
                    if ((cVar.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                        q630.c cVar2 = cVar;
                        ci50 ci50Var = null;
                        while (cVar2 != null) {
                            if (cVar2 instanceof npp0) {
                                npp0 npp0Var = (npp0) cVar2;
                                if (obj.equals(npp0Var.g0())) {
                                    return npp0Var;
                                }
                            }
                            if ((cVar2.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && (cVar2 instanceof ytl)) {
                                int i = 0;
                                for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                    if ((cVar3.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVar2 = cVar3;
                                        } else {
                                            if (ci50Var == null) {
                                                ci50Var = new ci50(new q630.c[16]);
                                            }
                                            if (cVar2 != null) {
                                                ci50Var.b(cVar2);
                                                cVar2 = null;
                                            }
                                            ci50Var.b(cVar3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVar2 = itl.b(ci50Var);
                        }
                    }
                    cVar = cVar.f;
                }
            }
            f2 = f2.I();
            cVar = (f2 == null || (u470Var = f2.G) == null) ? null : u470Var.e;
        }
        return null;
    }

    public static final long v(Uri uri) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            assetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            return assetFileDescriptor != null ? assetFileDescriptor.getLength() : -1L;
        } catch (FileNotFoundException e2) {
            L.E(e2, new Object[0]);
            return -1L;
        } finally {
            r(assetFileDescriptor);
        }
    }

    public static long w(byte b2, byte b3) {
        int i;
        int i2 = b2 & 255;
        int i3 = b2 & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b3 & CharsetEncoder.DEFAULT_REPLACEMENT;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return i * (i4 >= 16 ? 2500 << r6 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static final String x(cms0 cms0Var) {
        String str = cms0Var.a;
        if (str != null) {
            return str;
        }
        return cms0Var.e + "x" + cms0Var.f;
    }

    public static Object y(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final bn20 z() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1655902260, 0, -1, "com.vk.core.compose.component.defaults.<get-VkButtonDefaults> (VkButtonDefaults.kt:27)");
        }
        bn20 bn20Var = bn20.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return bn20Var;
    }

    @Override // xsna.zqi
    public void a(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(740954176);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(740954176, i, -1, "com.vk.mvi.integration.VkComposeThemeProvider.Theme (VkComposeThemeProvider.kt:9)");
            }
            emi.e.g(6, M, kai.c(-289015202, new y5(jaiVar, 13), M));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a6(this, jaiVar, i, 17);
        }
    }

    @Override // xsna.ulv
    public boolean b() {
        long m = Preference.m(-1L, "fcm_action_last_time", "last_time_key");
        return m == -1 || SystemClock.elapsedRealtime() - m > TimeUtils.MILLISECONDS_PER_DAY;
    }

    @Override // xsna.cvx
    public int c(int i) {
        return 1;
    }

    @Override // xsna.o320
    public String d(i420 i420Var, String str) {
        if (i420Var instanceof b9z) {
            return super.h((b9z) i420Var, str);
        }
        if (!(i420Var instanceof ogq0)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(X3.j.d);
        UserId userId = ((ogq0) i420Var).b;
        sb.append(fkq0.b(userId) ? "club" : "id");
        sb.append(Math.abs(userId.b));
        sb.append('|');
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    @Override // xsna.cvx
    public int e(int i) {
        return 0;
    }

    @Override // xsna.cvx
    public int f(int i) {
        return 0;
    }

    @Override // xsna.znj
    public void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
        znj znjVar2;
        androidx.compose.runtime.a M = aVar.M(-738929956);
        int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-738929956, i2, -1, "com.vk.design.demo.presentation.screens.legacyMenuScopeContent.<anonymous>.<no name provided>.Content (ContextMenuScreenContent.kt:1209)");
            }
            qzu0.a.getClass();
            lqv m = fto0.m(qzu0.a(M), 0L, M, 30);
            lzo0 d2 = nzo.d(3078, 6, M, "Action", false);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new c6(10);
                M.R(x);
            }
            znjVar2 = znjVar;
            aou0.d(znjVar2, (gzs) x, null, null, false, null, d2, m, M, (i2 & 14) | 48, 30);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            znjVar2 = znjVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new d6(this, znjVar2, i, 4);
        }
    }

    @Override // xsna.cvx
    public int i(int i) {
        return 1;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Integer.valueOf((int) zznn.zzh());
    }
}
