package ru.ok.android.webrtc.utils;

import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.IceCandidate;
import org.webrtc.SessionDescription;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.video.VideoSettingsCalculator;
import xsna.ho8;
import xsna.ji;

/* loaded from: classes9.dex */
public class MiscHelper {
    public static final Pattern b = Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))");
    public static final boolean a = (Build.MANUFACTURER + " " + Build.MODEL + " " + Build.DEVICE).equalsIgnoreCase(new String[]{"HUAWEI CHM-U01 hwCHM-H"}[0]);

    public static class IceCandidateParts {

        @Nullable
        public final String address;

        @Nullable
        public final String component;

        @Nullable
        public final String foundation;

        @Nullable
        public final String port;

        @Nullable
        public final String priority;

        @Nullable
        public final String raddr;

        @Nullable
        public final String rport;

        @Nullable
        public final String transport;

        @Nullable
        public final String type;

        public IceCandidateParts(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.foundation = str;
            this.component = str2;
            this.transport = str3;
            this.priority = str4;
            this.address = str5;
            this.port = str6;
            this.type = str7;
            this.raddr = str8;
            this.rport = str9;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static IceCandidateParts fromString(String str) {
            int i;
            if (str == null) {
                return null;
            }
            String[] split = str.split(" ");
            int i2 = 6;
            if (split.length < 6) {
                return null;
            }
            String str2 = split[4];
            String str3 = null;
            String str4 = null;
            String str5 = null;
            int i3 = 3;
            while (i2 < split.length) {
                String str6 = split[i2];
                if (str6 != null) {
                    switch (str6) {
                        case "typ":
                            i = i2 + 1;
                            if (i < split.length) {
                                str3 = split[i];
                                i3--;
                                i2 = i;
                                break;
                            }
                            break;
                        case "raddr":
                            i = i2 + 1;
                            if (i < split.length) {
                                str4 = split[i];
                                i3--;
                                i2 = i;
                                break;
                            }
                            break;
                        case "rport":
                            i = i2 + 1;
                            if (i < split.length) {
                                str5 = split[i];
                                i3--;
                                i2 = i;
                                break;
                            }
                            break;
                    }
                    if (i3 == 0) {
                        return new IceCandidateParts(split[0], split[1], split[2], split[3], !MiscHelper.b.matcher(str2).matches() ? str2 : null, split[5], str3, str4, str5);
                    }
                }
                i2++;
            }
            return new IceCandidateParts(split[0], split[1], split[2], split[3], !MiscHelper.b.matcher(str2).matches() ? str2 : null, split[5], str3, str4, str5);
        }
    }

    @NonNull
    public static VideoSettingsCalculator.BitRates calcAudioVideoBitrates(@NonNull ConnectivityManager connectivityManager, @NonNull TelephonyManager telephonyManager, CallParams.Bitrates bitrates, Context context) {
        int bitrateVideo2g;
        int bitrateAudio2g;
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && networkInfo.isConnected()) {
            bitrateVideo2g = bitrates.getBitrateVideoWifi();
            bitrateAudio2g = bitrates.getBitrateAudioWifi();
        } else if (context.checkPermission("android.permission.READ_PHONE_STATE", Process.myPid(), Process.myUid()) == 0) {
            switch (telephonyManager.getNetworkType()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    bitrateVideo2g = bitrates.getBitrateVideo2g();
                    bitrateAudio2g = bitrates.getBitrateAudio2g();
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    bitrateVideo2g = bitrates.getBitrateVideo3g();
                    bitrateAudio2g = bitrates.getBitrateAudio3g();
                    break;
                case 13:
                default:
                    bitrateVideo2g = bitrates.getBitrateVideoLte();
                    bitrateAudio2g = bitrates.getBitrateAudioLte();
                    break;
            }
        } else {
            bitrateVideo2g = bitrates.getBitrateVideoLte();
            bitrateAudio2g = bitrates.getBitrateAudioLte();
        }
        return new VideoSettingsCalculator.BitRates(bitrateAudio2g, bitrateVideo2g);
    }

    public static Point calculateAspectRatioResolution(int i, int i2) {
        int max = Math.max(i, i2);
        if (max > 1280) {
            float f = 1280.0f / max;
            i = Math.round(i * f);
            i2 = Math.round(i2 * f);
        }
        return new Point(i, i2);
    }

    @NonNull
    public static Point calculateScreenSharingDimensions(int i, int i2) {
        return (i > 1280 || i2 > 720) ? calculateAspectRatioResolution(i, i2) : new Point(i, i2);
    }

    @Nullable
    public static String getAddressFromIceCandidate(IceCandidate iceCandidate) {
        String str = iceCandidate.sdp;
        if (str == null) {
            return null;
        }
        String[] split = str.split(" ");
        if (split.length < 6) {
            return null;
        }
        String str2 = split[4];
        if (b.matcher(str2).matches()) {
            return str2;
        }
        return null;
    }

    public static String getNetworkType(@Nullable ConnectivityManager connectivityManager, @Nullable TelephonyManager telephonyManager) {
        String str;
        str = "unknown";
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            str = activeNetworkInfo != null ? activeNetworkInfo.getType() == 0 ? activeNetworkInfo.getSubtypeName() : activeNetworkInfo.getTypeName() : "unknown";
            if (telephonyManager != null && (activeNetworkInfo == null || activeNetworkInfo.getType() != 1)) {
                StringBuilder b2 = ho8.b(str, ".");
                b2.append(telephonyManager.getNetworkOperatorName());
                return b2.toString();
            }
        }
        return str;
    }

    public static int[] getSamsungOneUIVersion(Context context) {
        if (context.getApplicationContext() == null) {
            return null;
        }
        if (!context.getPackageManager().hasSystemFeature("com.samsung.feature.samsung_experience_mobile") && !context.getPackageManager().hasSystemFeature("com.samsung.feature.samsung_experience_mobile_lite")) {
            return null;
        }
        try {
            Field declaredField = Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT");
            declaredField.setAccessible(true);
            int i = declaredField.getInt(null) - 90000;
            if (i < 0) {
                return null;
            }
            return new int[]{i / 10000, (i % 10000) / 100};
        } catch (IllegalAccessException | NoSuchFieldException | SecurityException unused) {
            return null;
        }
    }

    @NonNull
    public static String getSessionDescriptionId(SessionDescription sessionDescription) {
        return sessionDescription != null ? getSessionDescriptionId(sessionDescription.description) : "";
    }

    public static String identity(Object obj) {
        return obj != null ? Integer.toString(System.identityHashCode(obj)) : "Ø";
    }

    public static String identity2(Object obj) {
        if (obj == null) {
            return "Ø";
        }
        return obj.getClass().getSimpleName() + '@' + System.identityHashCode(obj);
    }

    public static boolean isVideoHwAccelerationEnabled() {
        return !a;
    }

    @NonNull
    public static String joinString(Iterable<? extends CharSequence> iterable, String str, boolean z) {
        Iterator<? extends CharSequence> it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb.append(str);
            sb.append(it.next());
        }
        if (z) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static String secureIceCandidateSdpString(IceCandidate iceCandidate) {
        String str = iceCandidate.sdp;
        if (str == null) {
            return "";
        }
        String[] split = str.split(" ");
        if (split == null) {
            return iceCandidate.sdp;
        }
        StringBuilder sb = new StringBuilder();
        int i = 3;
        for (String str2 : split) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    sb.append(str2);
                } else {
                    sb.append("9");
                }
            } else if (str2.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                sb.append("::");
            } else {
                sb.append("0.0.0.0");
            }
            i = "raddr".equals(str2) ? 1 : "rport".equals(str2) ? 2 : 3;
        }
        return sb.toString();
    }

    @NonNull
    public static CameraEnumerationAndroid.CaptureFormat selectFormat(@NonNull List<CameraEnumerationAndroid.CaptureFormat> list, boolean z) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        h hVar = new h();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (CameraEnumerationAndroid.CaptureFormat captureFormat : list) {
            int i = captureFormat.width;
            if (i >= 500) {
                int i2 = captureFormat.height;
                if (i * i2 <= 921600) {
                    float f = i / i2;
                    if (Math.abs(f - 1.7777778f) < 0.1f) {
                        arrayList.add(captureFormat);
                    } else if (f > 1.1d && !z) {
                        arrayList2.add(captureFormat);
                    }
                }
            }
        }
        Collections.sort(arrayList, hVar);
        Collections.sort(arrayList2, hVar);
        return arrayList.size() > 0 ? (CameraEnumerationAndroid.CaptureFormat) arrayList.get(0) : arrayList2.size() > 0 ? (CameraEnumerationAndroid.CaptureFormat) arrayList2.get(0) : (CameraEnumerationAndroid.CaptureFormat) ji.a(1, list);
    }

    public static void throwIfNotBgThread() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Background thread expected");
        }
    }

    public static void throwIfNotMainThread() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Main (UI) thread expected");
        }
    }

    public static String toYesNo(Boolean bool) {
        return bool.booleanValue() ? "yes" : "no";
    }

    @NonNull
    public static String getSessionDescriptionId(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int indexOf = str.indexOf("o=");
        if (indexOf != -1) {
            int length = str.length();
            boolean z = false;
            for (int i = indexOf + 2; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt != ' ') {
                    if (charAt == '\r' || charAt == '\n') {
                        break;
                    }
                    if (z) {
                        sb.append(charAt);
                    }
                } else {
                    if (z) {
                        break;
                    }
                    z = true;
                }
            }
        }
        return sb.toString();
    }

    public static String identity(List<?> list) {
        if (list == null || list.isEmpty()) {
            return "[Ø]";
        }
        StringBuilder sb = new StringBuilder(X3.j.d);
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                sb.append(", ");
            }
            if (obj != null) {
                sb.append(obj.getClass().getSimpleName());
                sb.append('@');
                sb.append(System.identityHashCode(obj));
            } else {
                sb.append((char) 216);
            }
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static String identity(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            StringBuilder sb = new StringBuilder(X3.j.d);
            int length = objArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                if (!z) {
                    sb.append(", ");
                }
                if (obj != null) {
                    sb.append(obj.getClass().getSimpleName());
                    sb.append('@');
                    sb.append(System.identityHashCode(obj));
                } else {
                    sb.append((char) 216);
                }
                i++;
                z = false;
            }
            sb.append(']');
            return sb.toString();
        }
        return "[Ø]";
    }

    public static final class StackTrace extends Exception {
        public StackTrace() {
            super("");
        }

        public void logV(@NonNull String str) {
        }
    }
}
