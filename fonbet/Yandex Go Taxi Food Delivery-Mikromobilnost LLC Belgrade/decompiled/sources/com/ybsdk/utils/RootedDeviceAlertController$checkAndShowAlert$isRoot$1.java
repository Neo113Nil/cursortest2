package com.ybsdk.utils;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Environment;
import android.telephony.TelephonyManager;
import com.scottyab.rootbeer.RootBeerNative;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.i5z0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pxn;
import defpackage.t791;
import defpackage.tse;
import defpackage.vr;
import defpackage.wls;
import defpackage.zba1;
import defpackage.zy11;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.utils.RootedDeviceAlertController$checkAndShowAlert$isRoot$1", f = "RootedDeviceAlertController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class RootedDeviceAlertController$checkAndShowAlert$isRoot$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootedDeviceAlertController$checkAndShowAlert$isRoot$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RootedDeviceAlertController$checkAndShowAlert$isRoot$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RootedDeviceAlertController$checkAndShowAlert$isRoot$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x03e2, code lost:
    
        if (defpackage.vr.a("magisk") != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x03d9, code lost:
    
        if (r0.checkForRoot(r3) > 0) goto L207;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0289  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String[] strArr;
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        String[] strArr2;
        boolean z4;
        String[] strArr3;
        boolean z5;
        String str;
        Process process;
        boolean z6;
        InputStream inputStream;
        InputStream inputStream2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        pxn pxnVar = this.this$0.b;
        Context context = pxnVar.a;
        Boolean bool = pxnVar.b;
        if (bool != null) {
            z = bool.booleanValue();
            strArr = null;
        } else {
            String str2 = Build.PRODUCT;
            int i = (evu0.y(str2, "sdk", false) || evu0.y(str2, "Droid4X", false) || evu0.y(str2, "nox", false) || evu0.y(str2, "sdk_x86", false) || evu0.y(str2, "Andy", false) || evu0.y(str2, "google_sdk", false) || evu0.y(str2, "ttVM_Hdragon", false) || evu0.y(str2, "sdk_google", false) || evu0.y(str2, "vbox86p", false)) ? 1 : 0;
            String str3 = Build.MANUFACTURER;
            strArr = null;
            if (str3.equals("unknown") || evu0.y(str3, "MIT", false) || evu0.y(str3, "nox", false) || evu0.y(str3, "Andy", false) || str3.equals("Genymotion") || evu0.y(str3, "TiantianVM", false)) {
                i++;
            }
            String str4 = Build.BRAND;
            if (str4.equals("generic") || str4.equals("TTVM") || str4.equals("generic_x86") || evu0.y(str4, "Andy", false)) {
                i++;
            }
            if (((SensorManager) context.getSystemService("sensor")).getSensorList(-1).isEmpty()) {
                i++;
            }
            String str5 = Build.DEVICE;
            int i2 = i;
            if (evu0.y(str5, "generic", false) || evu0.y(str5, "Droid4X", false) || evu0.y(str5, "generic_x86", false) || evu0.y(str5, "generic_x86_64", false) || evu0.y(str5, "ttVM_Hdragon", false) || evu0.y(str5, "nox", false) || evu0.y(str5, "Andy", false) || evu0.y(str5, "vbox86p", false) || evu0.y(str5, "emu", false)) {
                i2++;
            }
            String str6 = Build.MODEL;
            if (str6.equals("sdk") || evu0.y(str6, "Droid4X", false) || evu0.y(str6, "Andy", false) || str6.equals("google_sdk") || str6.equals("Android SDK built for x86_64") || evu0.y(str6, "TiantianVM", false) || str6.equals("Android SDK built for x86")) {
                i2++;
            }
            String str7 = Build.HARDWARE;
            if (str7.equals("goldfish") || evu0.y(str7, "nox", false) || str7.equals("vbox86") || evu0.y(str7, "ttVM_x86", false) || evu0.y(str7, "ranchu", false)) {
                i2++;
            }
            String str8 = Build.FINGERPRINT;
            if (evu0.y(str8, "generic/sdk/generic", false) || evu0.y(str8, "vbox86p", false) || evu0.y(str8, "generic/google_sdk/generic", false) || evu0.y(str8, "generic_x86/sdk_x86/generic_x86", false) || evu0.y(str8, "generic_x86_64", false) || evu0.y(str8, "ttVM_Hdragon", false) || evu0.y(str8, "Andy", false) || evu0.y(str8, "generic/vbox86p/vbox86p", false)) {
                i2++;
            }
            if (ConstantDeviceInfo.APP_PLATFORM.equalsIgnoreCase(((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName())) {
                i2 += 10;
            }
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            char c2 = File.separatorChar;
            if (new File(externalStorageDirectory + c2 + "windows" + c2 + "BstSharedFolder").exists()) {
                i2 += 10;
            }
            int i3 = i2;
            i5z0.a.a(oyr.i(i3, "emulator probability scale is "), new Object[0]);
            boolean z7 = i3 >= 3;
            pxnVar.b = Boolean.valueOf(z7);
            z = z7;
        }
        if (!z) {
            c = 0;
            vr vrVar = new vr(this.this$0.c.a, c);
            if (!vrVar.h(new ArrayList(Arrays.asList(t791.a)))) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(Arrays.asList(t791.b));
                if (!vrVar.h(arrayList) && !vr.a("su")) {
                    HashMap u = g8e.u("ro.debuggable", "1", "ro.secure", "0");
                    try {
                        inputStream2 = Runtime.getRuntime().exec("getprop").getInputStream();
                    } catch (IOException | NoSuchElementException unused) {
                    }
                    if (inputStream2 != null) {
                        strArr2 = new Scanner(inputStream2).useDelimiter("\\A").next().split("\n");
                        if (strArr2 != null) {
                            z4 = false;
                        } else {
                            boolean z8 = false;
                            for (String str9 : strArr2) {
                                for (String str10 : u.keySet()) {
                                    if (str9.contains(str10)) {
                                        if (str9.contains("[" + ((String) u.get(str10)) + "]")) {
                                            zba1.c();
                                            z8 = true;
                                        }
                                    }
                                }
                            }
                            z4 = z8;
                        }
                        if (!z4) {
                            try {
                                inputStream = Runtime.getRuntime().exec("mount").getInputStream();
                            } catch (IOException | NoSuchElementException unused2) {
                            }
                            if (inputStream != null) {
                                strArr3 = new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
                                if (strArr3 != null) {
                                    z5 = false;
                                } else {
                                    boolean z9 = false;
                                    for (String str11 : strArr3) {
                                        String[] split = str11.split(" ");
                                        if (split.length < 6) {
                                            zba1.b("Error formatting mount line: ".concat(str11));
                                        } else {
                                            String str12 = split[2];
                                            String str13 = split[5];
                                            for (int i4 = 0; i4 < 7; i4++) {
                                                if (str12.equalsIgnoreCase(t791.d[i4])) {
                                                    str13 = str13.replace(Extension.O_BRAKE, "").replace(Extension.C_BRAKE, "");
                                                    String[] split2 = str13.split(",");
                                                    int length = split2.length;
                                                    int i5 = 0;
                                                    while (true) {
                                                        if (i5 >= length) {
                                                            break;
                                                        }
                                                        if (split2[i5].equalsIgnoreCase("rw")) {
                                                            zba1.c();
                                                            z9 = true;
                                                            break;
                                                        }
                                                        i5++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z5 = z9;
                                }
                                if (!z5 && ((str = Build.TAGS) == null || !str.contains("test-keys"))) {
                                    try {
                                        process = Runtime.getRuntime().exec(new String[]{"which", "su"});
                                    } catch (Throwable unused3) {
                                        process = strArr;
                                    }
                                    try {
                                        z6 = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() == null;
                                        process.destroy();
                                    } catch (Throwable unused4) {
                                        if (process != 0) {
                                            process.destroy();
                                        }
                                        z6 = false;
                                        if (!z6) {
                                        }
                                        z3 = true;
                                        z2 = z3;
                                        return Boolean.valueOf(z2);
                                    }
                                    if (!z6) {
                                        new RootBeerNative();
                                        if (RootBeerNative.a) {
                                            String[] f = t791.f();
                                            int length2 = f.length;
                                            String[] strArr4 = new String[length2];
                                            for (int i6 = 0; i6 < length2; i6++) {
                                                strArr4[i6] = oyr.t(new StringBuilder(), f[i6], "su");
                                            }
                                            RootBeerNative rootBeerNative = new RootBeerNative();
                                            z3 = true;
                                            try {
                                                rootBeerNative.setLogDebugMessages(true);
                                            } catch (UnsatisfiedLinkError unused5) {
                                            }
                                        } else {
                                            zba1.b("We could not load the native library to test for root");
                                            z3 = true;
                                        }
                                    }
                                }
                            }
                            strArr3 = strArr;
                            if (strArr3 != null) {
                            }
                            if (!z5) {
                                process = Runtime.getRuntime().exec(new String[]{"which", "su"});
                                if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() == null) {
                                }
                                process.destroy();
                                if (!z6) {
                                }
                            }
                        }
                    }
                    strArr2 = strArr;
                    if (strArr2 != null) {
                    }
                    if (!z4) {
                    }
                }
            }
            z3 = true;
            z2 = z3;
            return Boolean.valueOf(z2);
        }
        c = 0;
        z2 = c;
        return Boolean.valueOf(z2);
    }
}
