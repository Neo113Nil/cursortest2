package xsna;

import android.annotation.SuppressLint;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import com.vk.log.L;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: NetworkWifiManager.kt */
@ozl
@SuppressLint({"MissingPermission"})
/* loaded from: classes17.dex */
public final class h660 {
    public static final Pattern a = Pattern.compile("[0-9A-Fa-f]+");

    /* compiled from: NetworkWifiManager.kt */
    public static final class a {
        public static WifiConfiguration a(d dVar) {
            WifiConfiguration wifiConfiguration = new WifiConfiguration();
            wifiConfiguration.allowedAuthAlgorithms.clear();
            wifiConfiguration.allowedGroupCiphers.clear();
            wifiConfiguration.allowedKeyManagement.clear();
            wifiConfiguration.allowedPairwiseCiphers.clear();
            wifiConfiguration.allowedProtocols.clear();
            wifiConfiguration.SSID = b(dVar.a, new int[0]);
            wifiConfiguration.hiddenSSID = dVar.d;
            return wifiConfiguration;
        }

        public static String b(String str, int... iArr) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            if (str != null && h660.a.matcher(str).matches()) {
                if (copyOf.length != 0) {
                    for (int i : copyOf) {
                        if (str.length() != i) {
                        }
                    }
                }
                return str;
            }
            if (str == null || str.length() == 0) {
                return null;
            }
            return (str.charAt(0) == '\"' && str.charAt(str.length() + (-1)) == '\"') ? str : air.b('\"', "\"", str);
        }

        public static void c(WifiManager wifiManager, WifiConfiguration wifiConfiguration) {
            Integer num;
            String str = wifiConfiguration.SSID;
            List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
            if (configuredNetworks != null) {
                for (WifiConfiguration wifiConfiguration2 : configuredNetworks) {
                    String str2 = wifiConfiguration2.SSID;
                    if (str2 != null && str2.equals(str)) {
                        num = Integer.valueOf(wifiConfiguration2.networkId);
                        break;
                    }
                }
            }
            num = null;
            if (num != null) {
                L.p("Removing old configuration for network " + wifiConfiguration.SSID);
                wifiManager.removeNetwork(num.intValue());
                wifiManager.saveConfiguration();
            }
            int addNetwork = wifiManager.addNetwork(wifiConfiguration);
            if (addNetwork < 0) {
                L.G("Unable to add network " + wifiConfiguration.SSID);
            } else if (!wifiManager.enableNetwork(addNetwork, true)) {
                L.G("Failed to enable network " + wifiConfiguration.SSID);
            } else {
                L.p("Associating to network " + wifiConfiguration.SSID);
                wifiManager.saveConfiguration();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NetworkWifiManager.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final a Companion;
        public static final b NO_PASSWORD;
        public static final b WEP;
        public static final b WPA;
        public static final b WPA2_EAP;

        /* compiled from: NetworkWifiManager.kt */
        public static final class a {
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
            
                if (r1.equals("WPA2") != false) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
            
                return xsna.h660.b.WPA;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
            
                if (r1.equals("WPA") != false) goto L17;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static b a(String str) {
                if (str == null) {
                    return b.NO_PASSWORD;
                }
                switch (str.hashCode()) {
                    case -1039816366:
                        if (str.equals("nopass")) {
                            return b.NO_PASSWORD;
                        }
                        throw new IllegalArgumentException(str);
                    case 85826:
                        if (str.equals("WEP")) {
                            return b.WEP;
                        }
                        throw new IllegalArgumentException(str);
                    case 86152:
                        break;
                    case 2670762:
                        break;
                    case 1194974097:
                        if (str.equals("WPA2-EAP")) {
                            return b.WPA2_EAP;
                        }
                        throw new IllegalArgumentException(str);
                    default:
                        throw new IllegalArgumentException(str);
                }
            }
        }

        static {
            b bVar = new b("WEP", 0);
            WEP = bVar;
            b bVar2 = new b("WPA", 1);
            WPA = bVar2;
            b bVar3 = new b("NO_PASSWORD", 2);
            NO_PASSWORD = bVar3;
            b bVar4 = new b("WPA2_EAP", 3);
            WPA2_EAP = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
            Companion = new a();
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: NetworkWifiManager.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.WEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.WPA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.WPA2_EAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: NetworkWifiManager.kt */
    public static final class d {
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;

        public d(String str, String str2, String str3, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
        }
    }
}
