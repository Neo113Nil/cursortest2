package com.yandex.passport.internal.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.location.LocationManagerCompat$LocationListenerTransport;
import com.airbnb.lottie.LottieAnimationView;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.api.PassportPartition;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.f3;
import com.yandex.passport.api.g3;
import com.yandex.passport.api.h3;
import com.yandex.passport.api.i3;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.j3;
import com.yandex.passport.api.p0;
import com.yandex.passport.api.q0;
import com.yandex.passport.api.r0;
import com.yandex.passport.api.s;
import com.yandex.passport.api.s1;
import com.yandex.passport.api.t;
import com.yandex.passport.api.u;
import com.yandex.passport.api.v;
import com.yandex.passport.api.w;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Partition;
import com.yandex.passport.common.domain.RetryStrategy;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.common.network.x;
import com.yandex.passport.common.ui.view.CommonAnimationProgressBarKt$commonAnimationProgressBar$2$2$1;
import com.yandex.passport.common.ui.view.CommonSpinner;
import com.yandex.passport.common.ui.view.LottieAnimationViewBuilder;
import com.yandex.passport.common.ui.view.LottieAnimationWrapperKt$lottieProgressBar$$inlined$view$1;
import com.yandex.passport.common.util.LocationType;
import com.yandex.passport.data.exceptions.BackendErrorException;
import com.yandex.passport.data.exceptions.DeviceValidationException;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.data.exceptions.InvalidTrackException;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.account.PassportAccountImpl;
import com.yandex.passport.internal.entities.AccountType;
import com.yandex.passport.internal.properties.BiometricVerificationPropertiesImpl;
import com.yandex.passport.internal.properties.RegisterWebAuthNPropertiesImpl;
import com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationProperties;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNProperties;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.d7z;
import defpackage.jl40;
import defpackage.kbs;
import defpackage.kp31;
import defpackage.lzx;
import defpackage.m810;
import defpackage.mcz;
import defpackage.ngb1;
import defpackage.tcc;
import defpackage.uc20;
import defpackage.unr0;
import defpackage.w511;
import defpackage.w53;
import defpackage.wj91;
import defpackage.wwg;
import defpackage.xbm;
import defpackage.yhl;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes15.dex */
public abstract class c {
    public static Class a;
    public static Method b;

    public static final AccountType A(PassportAccountType passportAccountType) {
        switch (com.yandex.passport.api.m.b[passportAccountType.ordinal()]) {
            case 1:
                return AccountType.PORTAL;
            case 2:
                return AccountType.LITE;
            case 3:
                return AccountType.SOCIAL;
            case 4:
                return AccountType.PDD;
            case 5:
                return AccountType.PHONISH;
            case 6:
                return AccountType.MAILISH;
            case 7:
                return AccountType.MUSIC_PHONISH;
            case 8:
                return AccountType.CHILDISH;
            case 9:
                return AccountType.UNDEFINED;
            default:
                w511.b();
                return null;
        }
    }

    public static final ActivityResult B(w wVar) {
        if (!(wVar instanceof u)) {
            if (wVar.equals(com.yandex.passport.api.q.a)) {
                return b(0);
            }
            if (wVar.equals(t.a)) {
                return b(6);
            }
            if (wVar instanceof s) {
                return a(13, wwg.g(new Pair(Constants.KEY_EXCEPTION, ((s) wVar).a)));
            }
            if (wVar instanceof v) {
                v vVar = (v) wVar;
                return a(42, wwg.g(new Pair("passport-result-url", vVar.a), new Pair("passport-result-purpose", vVar.b)));
            }
            w511.b();
            return null;
        }
        u uVar = (u) wVar;
        PassportUidImpl passportUidImpl = uVar.a;
        Pair pair = new Pair("passport-login-result-environment", Integer.valueOf(passportUidImpl.getEnvironment().getInteger()));
        Pair pair2 = new Pair("passport-login-result-uid", Long.valueOf(passportUidImpl.getValue()));
        Pair pair3 = new Pair("passport-login-action", Integer.valueOf(uVar.c.ordinal()));
        String str = uVar.d;
        if (str == null) {
            str = null;
        }
        Bundle g = wwg.g(pair, pair2, pair3, new Pair("passport-login-additional-action", str), new Pair("phone-number", uVar.e));
        PassportAccountImpl passportAccountImpl = uVar.b;
        if (passportAccountImpl == null) {
            passportAccountImpl = null;
        }
        Bundle bundle = passportAccountImpl != null ? passportAccountImpl.toBundle() : null;
        Bundle bundle2 = new Bundle();
        bundle2.putAll(g);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return a(-1, bundle2);
    }

    public static final ActivityResult C(r0 r0Var) {
        if (r0Var.equals(p0.c)) {
            return a(-1, new Bundle());
        }
        if (r0Var.equals(p0.a)) {
            return b(0);
        }
        if (r0Var.equals(p0.b)) {
            return b(6);
        }
        if (r0Var instanceof q0) {
            return a(13, wwg.g(new Pair(Constants.KEY_EXCEPTION, ((q0) r0Var).a)));
        }
        w511.b();
        return null;
    }

    public static final ActivityResult D(j3 j3Var) {
        if (j3Var instanceof i3) {
            i3 i3Var = (i3) j3Var;
            return a(42, wwg.g(new Pair("url", i3Var.a), new Pair("purpose", i3Var.b)));
        }
        if (j3Var instanceof h3) {
            h3 h3Var = (h3) j3Var;
            return a(-1, wwg.g(new Pair("item", h3Var.a), new Pair("params", h3Var.b)));
        }
        if (j3Var.equals(f3.a)) {
            return b(0);
        }
        if (j3Var instanceof g3) {
            return a(13, wwg.g(new Pair(Constants.KEY_EXCEPTION, ((g3) j3Var).a)));
        }
        w511.b();
        return null;
    }

    public static final BiometricVerificationProperties E(BiometricVerificationPropertiesImpl biometricVerificationPropertiesImpl, String str) {
        return new BiometricVerificationProperties(com.yandex.passport.internal.util.p.B(biometricVerificationPropertiesImpl.getUid()), str, biometricVerificationPropertiesImpl.getFlowId(), biometricVerificationPropertiesImpl.getServiceId(), com.yandex.passport.internal.util.p.t(biometricVerificationPropertiesImpl.getTheme()));
    }

    public static final LocationType F(Long l) {
        return (l != null && l.longValue() == 1) ? LocationType.FI : (l != null && l.longValue() == 2) ? LocationType.KZ : LocationType.DEFAULT;
    }

    public static final ArrayList G(s1 s1Var) {
        List partitions = s1Var.getPartitions();
        ArrayList arrayList = new ArrayList(tcc.n(partitions, 10));
        Iterator it = partitions.iterator();
        while (it.hasNext()) {
            arrayList.add(Partition.m249boximpl(Partition.m250constructorimpl(((PassportPartition) it.next()).m240unboximpl())));
        }
        return arrayList;
    }

    public static final PassportAccountType H(AccountType accountType) {
        switch (com.yandex.passport.api.m.a[accountType.ordinal()]) {
            case 1:
                return PassportAccountType.PORTAL;
            case 2:
                return PassportAccountType.LITE;
            case 3:
                return PassportAccountType.SOCIAL;
            case 4:
                return PassportAccountType.PDD;
            case 5:
                return PassportAccountType.PHONISH;
            case 6:
                return PassportAccountType.MAILISH;
            case 7:
                return PassportAccountType.MUSIC_PHONISH;
            case 8:
                return PassportAccountType.CHILDISH;
            case 9:
                return PassportAccountType.UNDEFINED;
            default:
                w511.b();
                return null;
        }
    }

    public static final RegisterWebAuthNProperties I(RegisterWebAuthNPropertiesImpl registerWebAuthNPropertiesImpl) {
        return new RegisterWebAuthNProperties(com.yandex.passport.internal.util.p.B(registerWebAuthNPropertiesImpl.getUid()), com.yandex.passport.internal.util.p.t(registerWebAuthNPropertiesImpl.getTheme()));
    }

    public static String J(String str) {
        return unr0.l(')', "AdditionalActionResponse(rawValue=", str);
    }

    public static final MasterToken K(com.yandex.passport.common.network.j jVar) {
        if (jVar instanceof com.yandex.passport.common.network.i) {
            com.yandex.passport.common.account.b bVar = MasterToken.Companion;
            String a2 = ((com.yandex.passport.data.models.p) ((com.yandex.passport.common.network.i) jVar).a).a();
            bVar.getClass();
            return com.yandex.passport.common.account.b.a(a2);
        }
        if (!(jVar instanceof com.yandex.passport.common.network.g)) {
            w511.b();
            return null;
        }
        List list = ((x) ((com.yandex.passport.common.network.g) jVar).a).a;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            yhl.d(list, "Internal error: Can't throw exception for error list ");
            return null;
        }
        BackendError backendError = (BackendError) it.next();
        com.yandex.passport.common.network.b bVar2 = BackendError.Companion;
        z(backendError);
        throw null;
    }

    public static boolean L(LocationManager locationManager, String str, mcz mczVar, LocationManagerCompat$LocationListenerTransport locationManagerCompat$LocationListenerTransport) {
        try {
            if (a == null) {
                a = Class.forName("android.location.LocationRequest");
            }
            if (b == null) {
                Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", a, LocationListener.class, Looper.class);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            mczVar.getClass();
            LocationRequest d = Build.VERSION.SDK_INT >= 31 ? d7z.d(mczVar) : xbm.d(ngb1.d(mczVar, str));
            if (d == null) {
                return false;
            }
            synchronized (androidx.core.location.j.a) {
                b.invoke(locationManager, d, locationManagerCompat$LocationListenerTransport, Looper.getMainLooper());
                androidx.core.location.j.a(locationManager, locationManagerCompat$LocationListenerTransport);
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            return false;
        }
    }

    public static void M(long j, Parcel parcel) {
        parcel.writeLong(j);
    }

    public static final ActivityResult a(int i, Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        return new ActivityResult(i, intent);
    }

    public static ActivityResult b(int i) {
        return new ActivityResult(i, null);
    }

    public static final PassportUidImpl c(KPassportEnvironment kPassportEnvironment, long j) {
        return new PassportUidImpl(PassportEnvironmentImpl.from(kPassportEnvironment), j);
    }

    public static final long d(RetryStrategy retryStrategy, int i, long j) {
        long b2;
        int i2 = com.yandex.passport.common.domain.c.a[retryStrategy.ordinal()];
        if (i2 == 1) {
            return j;
        }
        if (i2 == 2) {
            return m810.c(j * i);
        }
        if (i2 == 3) {
            b2 = com.yandex.passport.common.time.a.b(0L, 0L, 0L, (long) Math.pow(2.0d, i));
            return b2;
        }
        w511.b();
        return 0L;
    }

    public static final View e(kp31 kp31Var, Context context, boolean z, CommonSpinner commonSpinner, float f, long j) {
        if (z) {
            commonSpinner.startAnimation();
            return commonSpinner;
        }
        boolean z2 = (context.getResources().getConfiguration().uiMode & 48) == 32;
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        int i = jl40.l(locales.isEmpty() ? null : locales.get(0).getLanguage(), new Locale(ClearCryptoProPrefs.COUNTRY).getLanguage()) ? z2 ? com.yandex.passport.common.b.logo_yandex_animation_ru_dark : com.yandex.passport.common.b.logo_yandex_animation_ru_light : z2 ? com.yandex.passport.common.b.logo_yandex_animation_en_dark : com.yandex.passport.common.b.logo_yandex_animation_en_light;
        ViewParent parent = commonSpinner.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(commonSpinner);
        }
        FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(frameLayoutBuilder);
        }
        frameLayoutBuilder.setAlpha(f);
        frameLayoutBuilder.addView(commonSpinner);
        View view = (View) LottieAnimationWrapperKt$lottieProgressBar$$inlined$view$1.b.invoke(wj91.e(0, frameLayoutBuilder.getCtx()), 0, 0);
        frameLayoutBuilder.addToParent(view);
        LottieAnimationViewBuilder lottieAnimationViewBuilder = (LottieAnimationViewBuilder) view;
        lottieAnimationViewBuilder.setVisibility(j > 0 ? 8 : 0);
        lottieAnimationViewBuilder.setRepeatCount(-1);
        lottieAnimationViewBuilder.setAnimation(i);
        int i2 = (int) (8.0f * uc20.a.density);
        lottieAnimationViewBuilder.setPadding(i2, i2, i2, i2);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view;
        lottieAnimationView.addAnimatorListener(new CommonAnimationProgressBarKt$commonAnimationProgressBar$2$2$1(lottieAnimationView, j, commonSpinner));
        return frameLayoutBuilder;
    }

    public static long g(Parcel parcel) {
        long b2;
        b2 = com.yandex.passport.common.time.a.b(0L, 0L, 0L, parcel.readLong());
        return b2;
    }

    public static final List h(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2.size() == arrayList.size() ? arrayList2 : list;
    }

    public static final MapBuilder i(Map map) {
        MapBuilder mapBuilder = new MapBuilder();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                mapBuilder.put(key, value);
            }
        }
        return mapBuilder.j();
    }

    public static final void j(Activity activity, Throwable th) {
        Intent intent = new Intent();
        intent.putExtra(Constants.KEY_EXCEPTION, th);
        activity.setResult(13, intent);
        activity.finish();
    }

    public static final void k(Activity activity, ActivityResult activityResult) {
        activity.setResult(activityResult.getResultCode(), activityResult.getData());
        activity.finish();
    }

    public static final ArrayList l(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(pair.c());
            arrayList.add(pair.f());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m(long j, String str) {
        String str2;
        String str3;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        String str4;
        long j9;
        long j10;
        long j11;
        long j12;
        ArrayList arrayList = new ArrayList(str.length());
        int length = str.length();
        int i = 0;
        boolean z = false;
        StringBuilder sb = null;
        com.yandex.passport.common.time.b bVar = null;
        while (true) {
            String str5 = "M";
            str2 = "S";
            str3 = RemoteBioParameters.Y;
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (z && charAt != '\'') {
                sb.append(charAt);
            } else if (charAt != '\'') {
                if (charAt == 'H') {
                    str5 = CA20Status.STATUS_CERTIFICATE_H;
                } else if (charAt != 'M') {
                    if (charAt == 'S') {
                        str5 = "S";
                    } else if (charAt == 'd') {
                        str5 = "d";
                    } else if (charAt == 'm') {
                        str5 = "m";
                    } else if (charAt == 's') {
                        str5 = "s";
                    } else if (charAt != 'y') {
                        if (sb == null) {
                            StringBuilder sb2 = new StringBuilder();
                            arrayList.add(new com.yandex.passport.common.time.b(sb2));
                            sb = sb2;
                        }
                        sb.append(charAt);
                        str5 = null;
                    } else {
                        str5 = RemoteBioParameters.Y;
                    }
                }
                if (str5 != null) {
                    if (bVar == null || !bVar.a.equals(str5)) {
                        com.yandex.passport.common.time.b bVar2 = new com.yandex.passport.common.time.b(str5);
                        arrayList.add(bVar2);
                        bVar = bVar2;
                    } else {
                        bVar.b++;
                    }
                    sb = null;
                }
            } else if (z) {
                sb = null;
                str5 = null;
                z = false;
                if (str5 != null) {
                }
            } else {
                sb = new StringBuilder();
                arrayList.add(new com.yandex.passport.common.time.b(sb));
                z = true;
                str5 = null;
                if (str5 != null) {
                }
            }
            i++;
        }
        if (z) {
            w511.f("Unmatched quote in format: ".concat(str));
            return null;
        }
        com.yandex.passport.common.time.b[] bVarArr = (com.yandex.passport.common.time.b[]) arrayList.toArray(new com.yandex.passport.common.time.b[0]);
        int length2 = bVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                j2 = 0;
                j3 = j;
                break;
            }
            if (bVarArr[i2].a == "d") {
                long j13 = j / 86400000;
                j3 = j - (86400000 * j13);
                j2 = j13;
                break;
            }
            i2++;
        }
        int length3 = bVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                j4 = 0;
                break;
            }
            if (bVarArr[i3].a == CA20Status.STATUS_CERTIFICATE_H) {
                long j14 = j3 / 3600000;
                j3 -= 3600000 * j14;
                j4 = j14;
                break;
            }
            i3++;
        }
        int length4 = bVarArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length4) {
                j5 = j3;
                j6 = 0;
                break;
            }
            int i5 = length4;
            if (bVarArr[i4].a == "m") {
                long j15 = j3 / 60000;
                j5 = j3 - (60000 * j15);
                j6 = j15;
                break;
            }
            i4++;
            length4 = i5;
        }
        int length5 = bVarArr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length5) {
                j7 = j5;
                j8 = 0;
                break;
            }
            int i7 = length5;
            if (bVarArr[i6].a == "s") {
                long j16 = j5 / 1000;
                j7 = j5 - (1000 * j16);
                j8 = j16;
                break;
            }
            i6++;
            length5 = i7;
        }
        StringBuilder sb3 = new StringBuilder();
        int length6 = bVarArr.length;
        int i8 = 0;
        boolean z2 = false;
        while (i8 < length6) {
            int i9 = i8;
            com.yandex.passport.common.time.b bVar3 = bVarArr[i9];
            int i10 = length6;
            Object obj = bVar3.a;
            int i11 = bVar3.b;
            String str6 = str2;
            if (obj instanceof StringBuilder) {
                sb3.append(((StringBuilder) obj).toString());
                str4 = str3;
                j9 = j8;
                j10 = j2;
            } else {
                if (obj.equals(str3)) {
                    str4 = str3;
                    sb3.append(v(i11, 0L));
                } else {
                    str4 = str3;
                    if (obj.equals("M")) {
                        sb3.append(v(i11, 0L));
                    } else if (obj.equals("d")) {
                        sb3.append(v(i11, j2));
                    } else if (obj.equals(CA20Status.STATUS_CERTIFICATE_H)) {
                        sb3.append(v(i11, j4));
                    } else if (obj.equals("m")) {
                        sb3.append(v(i11, j6));
                    } else if (obj.equals("s")) {
                        j9 = j8;
                        sb3.append(v(i11, j9));
                        j10 = j2;
                        j11 = j4;
                        z2 = true;
                        j12 = j7;
                        i8 = i9 + 1;
                        j4 = j11;
                        j7 = j12;
                        length6 = i10;
                        j2 = j10;
                        j8 = j9;
                        str2 = str6;
                        str3 = str4;
                    } else {
                        j9 = j8;
                        j10 = j2;
                        if (obj.equals(str6)) {
                            if (z2) {
                                str6 = str6;
                                j11 = j4;
                                j12 = j7;
                                sb3.append(v((int) Math.max(3.0d, i11), j12));
                            } else {
                                str6 = str6;
                                j11 = j4;
                                j12 = j7;
                                sb3.append(v(i11, j12));
                            }
                            z2 = false;
                            i8 = i9 + 1;
                            j4 = j11;
                            j7 = j12;
                            length6 = i10;
                            j2 = j10;
                            j8 = j9;
                            str2 = str6;
                            str3 = str4;
                        } else {
                            str6 = str6;
                        }
                    }
                }
                j11 = j4;
                j9 = j8;
                z2 = false;
                j10 = j2;
                j12 = j7;
                i8 = i9 + 1;
                j4 = j11;
                j7 = j12;
                length6 = i10;
                j2 = j10;
                j8 = j9;
                str2 = str6;
                str3 = str4;
            }
            j11 = j4;
            j12 = j7;
            i8 = i9 + 1;
            j4 = j11;
            j7 = j12;
            length6 = i10;
            j2 = j10;
            j8 = j9;
            str2 = str6;
            str3 = str4;
        }
        return sb3.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.yandex.passport.internal.a n(ArrayList arrayList, List list) {
        boolean z;
        w53 w53Var = new w53();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AccountRow accountRow = (AccountRow) it.next();
            w53Var.put(accountRow.name, accountRow);
        }
        w53 w53Var2 = new w53();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AccountRow accountRow2 = (AccountRow) it2.next();
            w53Var2.put(accountRow2.name, accountRow2);
        }
        int size = arrayList.size() + list.size();
        HashSet hashSet = new HashSet(size);
        hashSet.addAll(w53Var.keySet());
        hashSet.addAll(w53Var2.keySet());
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        ArrayList arrayList4 = new ArrayList(size);
        ArrayList arrayList5 = new ArrayList(size);
        ArrayList arrayList6 = new ArrayList(size);
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            String str = (String) it3.next();
            AccountRow accountRow3 = (AccountRow) w53Var.get(str);
            AccountRow accountRow4 = (AccountRow) w53Var2.get(str);
            boolean z2 = accountRow3 == null && accountRow4 != null;
            boolean z3 = (accountRow3 == null || accountRow4 == null || accountRow3.equals(accountRow4)) ? false : true;
            if (z3) {
                String str2 = accountRow3.masterTokenValue;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = accountRow4.masterTokenValue;
                if (!str2.equals(str3 != null ? str3 : "")) {
                    z = true;
                    boolean z4 = accountRow3 == null && accountRow4 == null;
                    if (z2) {
                        if (z3) {
                            if (accountRow4 != null) {
                                arrayList3.add(accountRow4);
                            }
                        } else if (z4) {
                            if (accountRow3 != null) {
                                arrayList5.add(accountRow3);
                            }
                        } else if (accountRow3 != null) {
                            arrayList6.add(accountRow3);
                        }
                    } else if (accountRow4 != null) {
                        arrayList2.add(accountRow4);
                    }
                    if (z && accountRow4 != null) {
                        arrayList4.add(accountRow4);
                    }
                }
            }
            z = false;
            if (accountRow3 == null) {
            }
            if (z2) {
            }
            if (z) {
                arrayList4.add(accountRow4);
            }
        }
        return new com.yandex.passport.internal.a(arrayList2, arrayList3, arrayList4, arrayList5, arrayList6);
    }

    public static final int o(boolean z) {
        if (z) {
            return 1;
        }
        if (!z) {
            return 0;
        }
        w511.b();
        return 0;
    }

    public static final boolean p(PassportAccountUpgradeStatus passportAccountUpgradeStatus) {
        int i = com.yandex.passport.api.n.a[passportAccountUpgradeStatus.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i != 3) {
            if (i == 4) {
                return true;
            }
            w511.b();
        }
        return false;
    }

    public static final int q(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.data;
        }
        kbs.o("%1$s requires a value for the %2$s attribute to be set in your theme.", Arrays.copyOf(new Object[]{context.getClass().getCanonicalName(), context.getResources().getResourceName(i)}, 2));
        return 0;
    }

    public static final int s(int i) {
        return (int) (i * uc20.a.density);
    }

    public static final boolean t(Environment environment) {
        return environment == Environment.TEAM_PRODUCTION || environment == Environment.TEAM_TESTING;
    }

    public static String u(char c, int i, String str) {
        String str2;
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        if (length > 0) {
            str2 = " ";
            if (length <= 8192) {
                if (length > 0) {
                    char[] cArr = new char[length];
                    for (int i2 = length - 1; -1 < i2; i2--) {
                        cArr[i2] = c;
                    }
                    str2 = new String(cArr);
                }
                return str2.concat(str);
            }
            String valueOf = String.valueOf(c);
            str2 = TextUtils.isEmpty(valueOf) ? " " : valueOf;
            int length2 = str2.length();
            int length3 = i - str.length();
            if (length3 > 0) {
                if (length2 == 1 && length3 <= 8192) {
                    return u(str2.charAt(0), i, str);
                }
                if (length3 == length2) {
                    return str2.concat(str);
                }
                if (length3 < length2) {
                    return str2.substring(0, length3).concat(str);
                }
                char[] cArr2 = new char[length3];
                char[] charArray = str2.toCharArray();
                for (int i3 = 0; i3 < length3; i3++) {
                    cArr2[i3] = charArray[i3 % length2];
                }
                return new String(cArr2).concat(str);
            }
        }
        return str;
    }

    public static String v(int i, long j) {
        return u(MoneyInputEditView.DEFAULT_VALUE, i, String.valueOf(j));
    }

    public static void w(PassportUidImpl passportUidImpl, Bundle bundle) {
        bundle.putInt(WebViewActivity.KEY_ENVIRONMENT, passportUidImpl.getEnvironment().getInteger());
        bundle.putLong("uid", passportUidImpl.getValue());
    }

    public static final Exception x(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        Serializable serializable = extras.getSerializable(Constants.KEY_EXCEPTION);
        return (Exception) (serializable instanceof Exception ? serializable : null);
    }

    public static final void y(AppCompatActivity appCompatActivity) {
        WindowInsetsController insetsController;
        if (Build.VERSION.SDK_INT < 30) {
            Window window = appCompatActivity.getWindow();
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8193));
        } else {
            insetsController = appCompatActivity.getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsAppearance(0, 8);
            }
        }
    }

    public static final void z(BackendError backendError) {
        switch (com.yandex.passport.data.network.core.b.a[backendError.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                throw new InvalidTokenException();
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new InvalidTrackException(backendError.toString());
            case 11:
            case 12:
            case 13:
            case 14:
                throw new DeviceValidationException();
            case 15:
                throw new FailedResponseException(backendError.toString());
            default:
                throw new BackendErrorException(backendError);
        }
    }
}
