package com.yandex.passport.internal.util;

import android.app.Activity;
import android.app.NotificationChannelGroup;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.s0;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.p2;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.credentials.Credentials;
import com.yandex.passport.internal.network.UrlOverride;
import com.yandex.passport.internal.properties.AccountListProperties;
import com.yandex.passport.internal.provider.InternalProvider;
import com.yandex.passport.internal.report.pd;
import com.yandex.passport.internal.report.sd;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.util.p;
import defpackage.aii0;
import defpackage.bts;
import defpackage.bvf0;
import defpackage.cq0;
import defpackage.did;
import defpackage.fd20;
import defpackage.ffx;
import defpackage.fid;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.ike;
import defpackage.kbs;
import defpackage.kvj0;
import defpackage.l8x;
import defpackage.lxj;
import defpackage.lz40;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.pse;
import defpackage.qhw0;
import defpackage.rvj0;
import defpackage.seu;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uza;
import defpackage.vng;
import defpackage.w511;
import defpackage.wls;
import defpackage.yci0;
import defpackage.zpn;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes8.dex */
public abstract class p {
    public static final PassportUidImpl A(Uid uid) {
        return new PassportUidImpl(y(uid.getEnvironment()), uid.getValue());
    }

    public static final Uid B(k2 k2Var) {
        return new Uid(u(PassportEnvironmentImpl.from(k2Var.getEnvironment())), k2Var.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final com.yandex.passport.internal.ui.challenge.webview.k kVar, final c0 c0Var, final com.yandex.passport.internal.ui.common.web.d dVar, final com.yandex.passport.common.ui.progress.g gVar, final tls tlsVar, final tls tlsVar2, final tls tlsVar3, boolean z, fid fidVar, final int i, final int i2) {
        int i3;
        final com.yandex.passport.internal.ui.common.web.d dVar2;
        tls tlsVar4;
        tls tlsVar5;
        boolean z2;
        Object Q;
        o430 o430Var;
        Object Q2;
        boolean z3;
        Object k;
        final oz40 oz40Var;
        Object k2;
        int i4;
        boolean z4;
        oz40 oz40Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(349057563);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(kVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(c0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            dVar2 = dVar;
            i3 |= btsVar.e(dVar2) ? 256 : 128;
        } else {
            dVar2 = dVar;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= (i & 4096) == 0 ? btsVar.k(gVar) : btsVar.e(gVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            tlsVar4 = tlsVar;
            i3 |= btsVar.e(tlsVar4) ? 16384 : 8192;
        } else {
            tlsVar4 = tlsVar;
        }
        if ((196608 & i) == 0) {
            tlsVar5 = tlsVar2;
            i3 |= btsVar.e(tlsVar5) ? 131072 : 65536;
        } else {
            tlsVar5 = tlsVar2;
        }
        if ((1572864 & i) == 0) {
            i3 |= btsVar.e(tlsVar3) ? 1048576 : 524288;
        }
        int i5 = i2 & 128;
        if (i5 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            z2 = z;
            i3 |= btsVar.a(z2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
            if ((i3 & 4793491) == 4793490 || !btsVar.E()) {
                if (i5 != 0) {
                    z2 = false;
                }
                Q = btsVar.Q();
                o430Var = did.a;
                if (Q == o430Var) {
                    Q = zpn.j(EmptyCoroutineContext.a, btsVar);
                    btsVar.o0(Q);
                }
                final tse tseVar = (tse) Q;
                btsVar.e0(-504949457);
                Q2 = btsVar.Q();
                if (Q2 != o430Var) {
                    z3 = false;
                    Q2 = ffx.c(0, 0, null, 7);
                    btsVar.o0(Q2);
                } else {
                    z3 = false;
                }
                final lz40 lz40Var = (lz40) Q2;
                k = g8e.k(-504947031, btsVar, z3);
                if (k == o430Var) {
                    k = androidx.compose.runtime.f.j(null);
                    btsVar.o0(k);
                }
                oz40Var = (oz40) k;
                k2 = g8e.k(-504944671, btsVar, z3);
                if (k2 == o430Var) {
                    k2 = androidx.compose.runtime.f.j(Boolean.FALSE);
                    btsVar.o0(k2);
                }
                oz40 oz40Var3 = (oz40) k2;
                btsVar.t(z3);
                btsVar.e0(-504943095);
                if (((String) oz40Var.getValue()) == null) {
                    String str = (String) oz40Var.getValue();
                    btsVar.e0(-504939469);
                    boolean e = btsVar.e(tseVar) | btsVar.e(lz40Var);
                    Object Q3 = btsVar.Q();
                    if (e || Q3 == o430Var) {
                        Q3 = new sls() { // from class: com.yandex.passport.internal.ui.challenge.webview.a
                            @Override // defpackage.sls
                            public final Object invoke() {
                                oz40Var.setValue(null);
                                tje.N(tse.this, null, null, new ChallengeScreenContentKt$ChallengeScreenContent$1$1$1(lz40Var, null), 3);
                                return zy11.a;
                            }
                        };
                        btsVar.o0(Q3);
                    }
                    btsVar.t(false);
                    com.yandex.passport.internal.ui.challenge.webview.m.a(str, (sls) Q3, btsVar, 0);
                    btsVar.t(false);
                    aii0 v = btsVar.v();
                    if (v != null) {
                        final int i6 = 0;
                        final tls tlsVar6 = tlsVar4;
                        final tls tlsVar7 = tlsVar5;
                        final boolean z5 = z2;
                        v.d = new wls() { // from class: com.yandex.passport.internal.ui.challenge.webview.b
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i7 = i6;
                                zy11 zy11Var = zy11.a;
                                int i8 = i;
                                switch (i7) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int O = vng.O(i8 | 1);
                                        p.a(kVar, c0Var, dVar2, gVar, tlsVar6, tlsVar7, tlsVar3, z5, (fid) obj, O, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int O2 = vng.O(i8 | 1);
                                        p.a(kVar, c0Var, dVar2, gVar, tlsVar6, tlsVar7, tlsVar3, z5, (fid) obj, O2, i2);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        return;
                    }
                    return;
                }
                btsVar.t(false);
                btsVar.e0(-504931847);
                if (kVar != null) {
                    btsVar.e0(-504924176);
                    boolean z6 = ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576);
                    Object Q4 = btsVar.Q();
                    if (z6 || Q4 == o430Var) {
                        oz40Var2 = oz40Var3;
                        cq0 cq0Var = new cq0(tlsVar, tlsVar2, tlsVar3, oz40Var2, oz40Var, 1);
                        btsVar.o0(cq0Var);
                        Q4 = cq0Var;
                    } else {
                        oz40Var2 = oz40Var3;
                    }
                    btsVar.t(false);
                    z4 = false;
                    i4 = i3;
                    com.yandex.passport.internal.ui.challenge.webview.d.a(kVar, c0Var, dVar, lz40Var, (tls) Q4, btsVar, i3 & 1022);
                } else {
                    i4 = i3;
                    z4 = false;
                    oz40Var2 = oz40Var3;
                }
                btsVar.t(z4);
                if (kVar == null || !((Boolean) oz40Var2.getValue()).booleanValue()) {
                    boolean z7 = (z2 && kVar == null) ? z4 : true;
                    com.yandex.passport.common.ui.progress.g gVar2 = com.yandex.passport.common.ui.progress.g.e;
                    com.yandex.passport.common.ui.progress.p.d(null, gVar, z7, btsVar, (i4 >> 6) & 112, 1);
                    btsVar = btsVar;
                }
            } else {
                btsVar.Y();
            }
            final boolean z8 = z2;
            aii0 v2 = btsVar.v();
            if (v2 != null) {
                final int i7 = 1;
                v2.d = new wls() { // from class: com.yandex.passport.internal.ui.challenge.webview.b
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i72 = i7;
                        zy11 zy11Var = zy11.a;
                        int i8 = i;
                        switch (i72) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int O = vng.O(i8 | 1);
                                p.a(kVar, c0Var, dVar, gVar, tlsVar, tlsVar2, tlsVar3, z8, (fid) obj, O, i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int O2 = vng.O(i8 | 1);
                                p.a(kVar, c0Var, dVar, gVar, tlsVar, tlsVar2, tlsVar3, z8, (fid) obj, O2, i2);
                                break;
                        }
                        return zy11Var;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if ((i3 & 4793491) == 4793490) {
        }
        if (i5 != 0) {
        }
        Q = btsVar.Q();
        o430Var = did.a;
        if (Q == o430Var) {
        }
        final tse tseVar2 = (tse) Q;
        btsVar.e0(-504949457);
        Q2 = btsVar.Q();
        if (Q2 != o430Var) {
        }
        final lz40 lz40Var2 = (lz40) Q2;
        k = g8e.k(-504947031, btsVar, z3);
        if (k == o430Var) {
        }
        oz40Var = (oz40) k;
        k2 = g8e.k(-504944671, btsVar, z3);
        if (k2 == o430Var) {
        }
        oz40 oz40Var32 = (oz40) k2;
        btsVar.t(z3);
        btsVar.e0(-504943095);
        if (((String) oz40Var.getValue()) == null) {
        }
    }

    public static final String b(kvj0 kvj0Var) {
        try {
            rvj0 rvj0Var = kvj0Var.z;
            String string = rvj0Var != null ? rvj0Var.string() : null;
            kvj0Var.close();
            if (string != null) {
                return string;
            }
            ny61.v("empty response body");
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(kvj0Var, th);
                throw th2;
            }
        }
    }

    public static final void c(Activity activity, Exception exc) {
        Intent intent = new Intent();
        intent.putExtra(Constants.KEY_EXCEPTION, exc);
        activity.setResult(13, intent);
        activity.finish();
    }

    public static void d(StringBuilder sb, CharsetDecoder charsetDecoder, ByteBuffer byteBuffer) {
        if (byteBuffer.position() == 0) {
            return;
        }
        byteBuffer.flip();
        try {
            try {
                sb.append((CharSequence) charsetDecoder.decode(byteBuffer));
            } catch (CharacterCodingException unused) {
                sb.append((char) 65533);
            }
        } finally {
            byteBuffer.flip();
            byteBuffer.limit(byteBuffer.capacity());
        }
    }

    public static com.yandex.passport.internal.entities.o e(PackageInfo packageInfo) {
        SigningInfo signingInfo = packageInfo.signingInfo;
        Signature[] apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
        if (apkContentsSigners == null) {
            apkContentsSigners = new Signature[0];
        }
        ArrayList arrayList = new ArrayList(apkContentsSigners.length);
        for (Signature signature : apkContentsSigners) {
            MessageDigest messageDigest = MessageDigest.getInstance(JCP.DIGEST_SHA256);
            messageDigest.update(signature.toByteArray());
            arrayList.add(messageDigest.digest());
        }
        return arrayList.isEmpty() ? new com.yandex.passport.internal.entities.o(Collections.singletonList("unknown".getBytes(uza.a)), apkContentsSigners) : new com.yandex.passport.internal.entities.o(arrayList, apkContentsSigners);
    }

    public static com.yandex.passport.internal.entities.o f(PackageManager packageManager, String str) {
        return e(packageManager.getPackageInfo(str, SelfTester_JCP.DECRYPT_CNT));
    }

    public static com.yandex.passport.internal.j g(com.yandex.passport.internal.properties.p pVar, Environment environment) {
        com.yandex.passport.internal.j jVar = (com.yandex.passport.internal.j) pVar.A.get(environment);
        if (jVar != null) {
            return jVar;
        }
        int i = com.yandex.passport.internal.credentials.c.a[environment.ordinal()];
        if (i == 1) {
            return new Credentials("ixnjS4SWsp6DD8fshySJ/ClWdh38gE/8EyyCvNaD+qEPmlANxFG2IvCpi9PDzl/E", "iU22SNiVvsrSCJG7hy2Or80ApPky0d92/7+fYSB60nZjmc18fduySNaiLpXlwdwk");
        }
        if (i == 2) {
            return new Credentials("30iwH9LBts7aWsa+h3jW+Pw2Nhffr9+OKE6kZUd3myxUewFcIBLQ/nPv9h9McIAP", "3xG+HNSdvpjXXMe4h3/W+5IuRDGIssyuQYxU9exB1baFb1Y+JYPq4PI56ipR46e8");
        }
        if (i == 3) {
            return new Credentials("ixnjS4SWsp6DD8fshySJ/ClWdh38gE/8EyyCvNaD+qEPmlANxFG2IvCpi9PDzl/E", "iU22SNiVvsrSCJG7hy2Or80ApPky0d92/7+fYSB60nZjmc18fduySNaiLpXlwdwk");
        }
        if (i == 4) {
            return new Credentials("0Bq1GdKTvs3bW5K4hyTZqKLDqiRQCxIOYPkslQWQTF+xkOoYmSo2leSvphu6RUu7", "jUy+StjEtZ7aCsfuhymO+zwotxbOaHjQps9n68SHQf/9qsHcz/t0nEVCGsXb5FCX");
        }
        if (i == 5) {
            return new Credentials("jR7jHtedspuBDcWwhyzXr+A3fH9NCkmIYIZDJhzdjkmVJOK45TpuMjtfPn/sK7Rj", "iU/iStTH5JjVXca5hyXZrRCSbGY5saNhDO+KLyv3DFmc3Lp/dhXLbW+/NPRoElOo");
        }
        kbs.f(environment, "Unknown environment ");
        return null;
    }

    public static Intent h(Context context, ComponentName componentName) {
        String j = j(context, componentName);
        if (j == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), j);
        return j(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static Intent i(AppCompatActivity appCompatActivity) {
        Intent parentActivityIntent = appCompatActivity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String j = j(appCompatActivity, appCompatActivity.getComponentName());
            if (j == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(appCompatActivity, j);
            try {
                return j(appCompatActivity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + j + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            yci0.r(e);
            return null;
        }
    }

    public static String j(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final lxj k(s0 s0Var) {
        NotificationChannelGroup notificationChannelGroup = s0Var.b.getNotificationChannelGroup("passport_channel_group_id");
        if (notificationChannelGroup != null) {
            return new lxj(notificationChannelGroup);
        }
        return null;
    }

    public static Uri l(String str) {
        return Uri.parse("content://".concat("com.yandex.passport.internal.provider." + str));
    }

    public static boolean m() {
        boolean z;
        InternalProvider.Companion.getClass();
        z = InternalProvider.isInPassportProcess;
        return z;
    }

    public static String n(String str, Environment environment) {
        return str + '_' + environment.getInteger();
    }

    public static final pse o(String str) {
        return new pse("Passport-".concat(str));
    }

    public static final void p(com.yandex.passport.internal.report.j jVar, fd20 fd20Var, yd ydVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ydVar);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((pd) next).a()) {
                arrayList2.add(next);
            }
        }
        if (jVar.c.a()) {
            sd sdVar = jVar.a;
            String fd20Var2 = fd20Var.toString();
            ArrayList m0 = kotlin.collections.a.m0(jVar.b.a(), arrayList2);
            int d = gw00.d(tcc.n(m0, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            Iterator it2 = m0.iterator();
            while (it2.hasNext()) {
                pd pdVar = (pd) it2.next();
                Pair pair = new Pair(pdVar.getName(), pdVar.getValue());
                linkedHashMap.put(pair.c(), pair.f());
            }
            sdVar.a(fd20Var2, linkedHashMap);
        }
    }

    public static final void q(com.yandex.passport.internal.report.j jVar, fd20 fd20Var, Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((pd) it.next());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((pd) next).a()) {
                arrayList2.add(next);
            }
        }
        if (jVar.c.a()) {
            sd sdVar = jVar.a;
            String fd20Var2 = fd20Var.toString();
            ArrayList m0 = kotlin.collections.a.m0(jVar.b.a(), arrayList2);
            int d = gw00.d(tcc.n(m0, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            Iterator it3 = m0.iterator();
            while (it3.hasNext()) {
                pd pdVar = (pd) it3.next();
                Pair pair = new Pair(pdVar.getName(), pdVar.getValue());
                linkedHashMap.put(pair.c(), pair.f());
            }
            sdVar.a(fd20Var2, linkedHashMap);
        }
    }

    public static com.yandex.passport.internal.entities.o r(PackageManager packageManager, String str) {
        try {
            return f(packageManager, str);
        } catch (PackageManager.NameNotFoundException unused) {
            return com.yandex.passport.internal.entities.o.g;
        } catch (NoSuchAlgorithmException unused2) {
            return com.yandex.passport.internal.entities.o.g;
        }
    }

    public static final ike s(tse tseVar) {
        return bvf0.a(tseVar.getCoroutineContext().plus(new qhw0((l8x) tseVar.getCoroutineContext().get(seu.C))));
    }

    public static final AppTheme t(PassportTheme passportTheme) {
        int i = com.yandex.passport.api.mapper.a.a[passportTheme.ordinal()];
        if (i == 1) {
            return AppTheme.LIGHT;
        }
        if (i == 2) {
            return AppTheme.DARK;
        }
        if (i == 3) {
            return AppTheme.FOLLOW_SYSTEM;
        }
        if (i == 4) {
            return AppTheme.LIGHT;
        }
        w511.b();
        return null;
    }

    public static final Environment u(PassportEnvironmentImpl passportEnvironmentImpl) {
        return passportEnvironmentImpl.equals(PassportEnvironmentImpl.PRODUCTION) ? Environment.PRODUCTION : passportEnvironmentImpl.equals(PassportEnvironmentImpl.TESTING) ? Environment.TESTING : passportEnvironmentImpl.equals(PassportEnvironmentImpl.RC) ? Environment.RC : passportEnvironmentImpl.equals(PassportEnvironmentImpl.TEAM_PRODUCTION) ? Environment.TEAM_PRODUCTION : passportEnvironmentImpl.equals(PassportEnvironmentImpl.TEAM_TESTING) ? Environment.TEAM_TESTING : Environment.PRODUCTION;
    }

    public static final AccountListProperties v(com.yandex.passport.api.j jVar) {
        AccountListProperties.Companion.getClass();
        return new AccountListProperties(jVar.getShowMode(), jVar.getBranding(), jVar.getShowCloseButton(), jVar.getMarkPlusUsers());
    }

    public static final Map w(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            com.yandex.passport.internal.network.p pVar = UrlOverride.Companion;
            p2 p2Var = (p2) entry.getValue();
            pVar.getClass();
            arrayList.add(new Pair(key, com.yandex.passport.internal.network.p.a(p2Var)));
        }
        return kotlin.collections.b.s(arrayList);
    }

    public static final KPassportEnvironment x(Environment environment) {
        int i = com.yandex.passport.internal.account.f.a[environment.ordinal()];
        if (i == 1) {
            return KPassportEnvironment.PRODUCTION;
        }
        if (i == 2) {
            return KPassportEnvironment.TEAM_PRODUCTION;
        }
        if (i == 3) {
            return KPassportEnvironment.TESTING;
        }
        if (i == 4) {
            return KPassportEnvironment.TEAM_TESTING;
        }
        if (i == 5) {
            return KPassportEnvironment.RC;
        }
        w511.b();
        return null;
    }

    public static final PassportEnvironmentImpl y(Environment environment) {
        int i = com.yandex.passport.internal.account.f.a[environment.ordinal()];
        if (i == 1) {
            return PassportEnvironmentImpl.PRODUCTION;
        }
        if (i == 2) {
            return PassportEnvironmentImpl.TEAM_PRODUCTION;
        }
        if (i == 3) {
            return PassportEnvironmentImpl.TESTING;
        }
        if (i == 4) {
            return PassportEnvironmentImpl.TEAM_TESTING;
        }
        if (i == 5) {
            return PassportEnvironmentImpl.RC;
        }
        w511.b();
        return null;
    }

    public static final PassportTheme z(AppTheme appTheme) {
        int i = com.yandex.passport.api.mapper.a.b[appTheme.ordinal()];
        if (i == 1) {
            return PassportTheme.LIGHT;
        }
        if (i == 2) {
            return PassportTheme.DARK;
        }
        if (i == 3) {
            return PassportTheme.FOLLOW_SYSTEM;
        }
        w511.b();
        return null;
    }
}
