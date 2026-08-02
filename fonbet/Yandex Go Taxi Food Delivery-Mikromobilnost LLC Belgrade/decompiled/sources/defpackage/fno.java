package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import androidx.media3.exoplayer.video.d;
import com.ybsdk.widgets.common.MoneyInputEditView;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;
import ru.yandex.video.m3.player.impl.managers.AllowInitCodecManager;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;

/* loaded from: classes10.dex */
public final class fno extends d {
    public final boolean O5;
    public final PlayerLogger P5;
    public final AllowInitCodecManager Q5;

    public fno(Context context, mb10 mb10Var, xb10 xb10Var, long j, boolean z, Handler handler, co31 co31Var, boolean z2, yd21 yd21Var, PlayerLogger playerLogger, AllowInitCodecManager allowInitCodecManager) {
        super(context, mb10Var, xb10Var, j, z, handler, co31Var);
        this.O5 = z2;
        this.P5 = playerLogger;
        this.Q5 = allowInitCodecManager;
        this.J5 = !yd21Var.equals(yd21.c) ? new ae21(yd21Var) : new u9h();
    }

    @Override // defpackage.peh
    public final void G(long j, long j2, String str) {
        PlayerLogger playerLogger = this.P5;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose("MediaCodecVideoRenderer", "onCodecInitialized", "before", "name=".concat(str));
        }
        a201 a201Var = this.R0;
        Handler handler = (Handler) a201Var.b;
        if (handler != null) {
            handler.post(new ug3(a201Var, str, j, j2, 2));
        }
        this.C1 = h0(str);
        sb10 sb10Var = this.N;
        sb10Var.getClass();
        this.H1 = sb10Var.f();
        p0();
    }

    @Override // androidx.media3.exoplayer.video.d, defpackage.peh
    public final qyg I(o7s o7sVar) {
        PlayerLogger playerLogger = this.P5;
        try {
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose("MediaCodecVideoRenderer", "onInputFormatChanged", "before", "format=" + o7sVar.b);
            }
            qyg I = super.I(o7sVar);
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose("MediaCodecVideoRenderer", "onInputFormatChanged", "after", "format=" + o7sVar.b);
            }
            return I;
        } finally {
        }
    }

    @Override // defpackage.peh
    public final void S() {
        PlayerLogger playerLogger = this.P5;
        try {
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose("MediaCodecVideoRenderer", "releaseCodec", "before", new Object[0]);
            }
            super.S();
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose("MediaCodecVideoRenderer", "releaseCodec", "after", new Object[0]);
            }
        } finally {
        }
    }

    @Override // defpackage.peh
    public final boolean a0(sb10 sb10Var) {
        AllowInitCodecManager allowInitCodecManager = this.Q5;
        if (allowInitCodecManager == null || allowInitCodecManager.getAllowInitCodec()) {
            return n0(sb10Var);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x073b, code lost:
    
        if (r4.equals("ELUGA_Ray_X") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x08bd, code lost:
    
        if (r14.equals("JSN-L21") == false) goto L664;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f A[FALL_THROUGH] */
    @Override // androidx.media3.exoplayer.video.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h0(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (str.startsWith("OMX.google")) {
            z = false;
        } else {
            synchronized (d.class) {
                try {
                    if (!d.M5) {
                        int i = tw21.a;
                        char c = 28;
                        if (i <= 28) {
                            String str2 = Build.DEVICE;
                            str2.getClass();
                            switch (str2.hashCode()) {
                                case -1339091551:
                                    if (str2.equals("dangal")) {
                                        z4 = false;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case -1220081023:
                                    if (str2.equals("dangalFHD")) {
                                        z4 = true;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case -1220066608:
                                    if (str2.equals("dangalUHD")) {
                                        z4 = 2;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case -1012436106:
                                    if (str2.equals("oneday")) {
                                        z4 = 3;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case -760312546:
                                    if (str2.equals("aquaman")) {
                                        z4 = 4;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case -64886864:
                                    if (str2.equals("magnolia")) {
                                        z4 = 5;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case 3415681:
                                    if (str2.equals("once")) {
                                        z4 = 6;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case 825323514:
                                    if (str2.equals("machuca")) {
                                        z4 = 7;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                default:
                                    z4 = -1;
                                    break;
                            }
                            switch (z4) {
                                case false:
                                case true:
                                case true:
                                case true:
                                case true:
                                case true:
                                case true:
                                case true:
                                    z3 = true;
                                    break;
                            }
                            d.N5 = z3;
                            d.M5 = true;
                        }
                        if (i > 27 || !"HWEML".equals(Build.DEVICE)) {
                            String str3 = Build.MODEL;
                            str3.getClass();
                            switch (str3.hashCode()) {
                                case -349662828:
                                    if (str3.equals("AFTJMST12")) {
                                        z2 = false;
                                        break;
                                    }
                                    z2 = -1;
                                    break;
                                case -321033677:
                                    if (str3.equals("AFTKMST12")) {
                                        z2 = true;
                                        break;
                                    }
                                    z2 = -1;
                                    break;
                                case 2006354:
                                    if (str3.equals("AFTA")) {
                                        z2 = 2;
                                        break;
                                    }
                                    z2 = -1;
                                    break;
                                case 2006367:
                                    if (str3.equals("AFTN")) {
                                        z2 = 3;
                                        break;
                                    }
                                    z2 = -1;
                                    break;
                                case 2006371:
                                    if (str3.equals("AFTR")) {
                                        z2 = 4;
                                        break;
                                    }
                                    z2 = -1;
                                    break;
                                case 1785421873:
                                    if (str3.equals("AFTEU011")) {
                                        z2 = 5;
                                        break;
                                    }
                                    z2 = -1;
                                    break;
                                case 1785421876:
                                    if (str3.equals("AFTEU014")) {
                                        z2 = 6;
                                        break;
                                    }
                                    z2 = -1;
                                    break;
                                case 1798172390:
                                    if (str3.equals("AFTSO001")) {
                                        z2 = 7;
                                        break;
                                    }
                                    z2 = -1;
                                    break;
                                case 2119412532:
                                    if (str3.equals("AFTEUFF014")) {
                                        z2 = 8;
                                        break;
                                    }
                                    z2 = -1;
                                    break;
                                default:
                                    z2 = -1;
                                    break;
                            }
                            switch (z2) {
                                default:
                                    if (i <= 26) {
                                        String str4 = Build.DEVICE;
                                        str4.getClass();
                                        switch (str4.hashCode()) {
                                            case -2144781245:
                                                if (str4.equals("GIONEE_SWW1609")) {
                                                    c = 0;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -2144781185:
                                                if (str4.equals("GIONEE_SWW1627")) {
                                                    c = 1;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -2144781160:
                                                if (str4.equals("GIONEE_SWW1631")) {
                                                    c = 2;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -2097309513:
                                                if (str4.equals("K50a40")) {
                                                    c = 3;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -2022874474:
                                                if (str4.equals("CP8676_I02")) {
                                                    c = 4;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1978993182:
                                                if (str4.equals("NX541J")) {
                                                    c = 5;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1978990237:
                                                if (str4.equals("NX573J")) {
                                                    c = 6;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1936688988:
                                                if (str4.equals("PGN528")) {
                                                    c = 7;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1936688066:
                                                if (str4.equals("PGN610")) {
                                                    c = '\b';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1936688065:
                                                if (str4.equals("PGN611")) {
                                                    c = '\t';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1931988508:
                                                if (str4.equals("AquaPowerM")) {
                                                    c = '\n';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1885099851:
                                                if (str4.equals("RAIJIN")) {
                                                    c = 11;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1696512866:
                                                if (str4.equals("XT1663")) {
                                                    c = '\f';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1680025915:
                                                if (str4.equals("ComioS1")) {
                                                    c = HexString.LF;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1615810839:
                                                if (str4.equals("Phantom6")) {
                                                    c = 14;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1600724499:
                                                if (str4.equals("pacificrim")) {
                                                    c = 15;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1554255044:
                                                if (str4.equals("vernee_M5")) {
                                                    c = 16;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1481772737:
                                                if (str4.equals("panell_dl")) {
                                                    c = 17;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1481772730:
                                                if (str4.equals("panell_ds")) {
                                                    c = 18;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1481772729:
                                                if (str4.equals("panell_dt")) {
                                                    c = 19;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1320080169:
                                                if (str4.equals("GiONEE_GBL7319")) {
                                                    c = 20;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1217592143:
                                                if (str4.equals("BRAVIA_ATV2")) {
                                                    c = 21;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1180384755:
                                                if (str4.equals("iris60")) {
                                                    c = 22;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1139198265:
                                                if (str4.equals("Slate_Pro")) {
                                                    c = 23;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1052835013:
                                                if (str4.equals("namath")) {
                                                    c = 24;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -993250464:
                                                if (str4.equals("A10-70F")) {
                                                    c = 25;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -993250458:
                                                if (str4.equals("A10-70L")) {
                                                    c = 26;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -965403638:
                                                if (str4.equals("s905x018")) {
                                                    c = 27;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -958336948:
                                                break;
                                            case -879245230:
                                                if (str4.equals("tcl_eu")) {
                                                    c = 29;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -842500323:
                                                if (str4.equals("nicklaus_f")) {
                                                    c = 30;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -821392978:
                                                if (str4.equals("A7000-a")) {
                                                    c = 31;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -797483286:
                                                if (str4.equals("SVP-DTV15")) {
                                                    c = HexString.CHAR_SPACE;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -794946968:
                                                if (str4.equals("watson")) {
                                                    c = '!';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -788334647:
                                                if (str4.equals("whyred")) {
                                                    c = OpenList.CHAR_QUOTE;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -782144577:
                                                if (str4.equals("OnePlus5T")) {
                                                    c = '#';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -575125681:
                                                if (str4.equals("GiONEE_CBL7513")) {
                                                    c = '$';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -521118391:
                                                if (str4.equals("GIONEE_GBL7360")) {
                                                    c = '%';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -430914369:
                                                if (str4.equals("Pixi4-7_3G")) {
                                                    c = '&';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -290434366:
                                                if (str4.equals("taido_row")) {
                                                    c = '\'';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -282781963:
                                                if (str4.equals("BLACK-1X")) {
                                                    c = '(';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -277133239:
                                                if (str4.equals("Z12_PRO")) {
                                                    c = ')';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -173639913:
                                                if (str4.equals("ELUGA_A3_Pro")) {
                                                    c = '*';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -56598463:
                                                if (str4.equals("woods_fn")) {
                                                    c = '+';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2126:
                                                if (str4.equals("C1")) {
                                                    c = HexString.CHAR_COMMA;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2564:
                                                if (str4.equals("Q5")) {
                                                    c = LicenseUtility.SEPARATOR;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2715:
                                                if (str4.equals("V1")) {
                                                    c = '.';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2719:
                                                if (str4.equals("V5")) {
                                                    c = '/';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 3091:
                                                if (str4.equals("b5")) {
                                                    c = MoneyInputEditView.DEFAULT_VALUE;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 3483:
                                                if (str4.equals("mh")) {
                                                    c = '1';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 73405:
                                                if (str4.equals("JGZ")) {
                                                    c = '2';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 75537:
                                                if (str4.equals("M04")) {
                                                    c = '3';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 75739:
                                                if (str4.equals("M5c")) {
                                                    c = '4';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 76779:
                                                if (str4.equals("MX6")) {
                                                    c = '5';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 78669:
                                                if (str4.equals("P85")) {
                                                    c = '6';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 79305:
                                                if (str4.equals("PLE")) {
                                                    c = '7';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 80618:
                                                if (str4.equals("QX1")) {
                                                    c = '8';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 88274:
                                                if (str4.equals("Z80")) {
                                                    c = '9';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 98846:
                                                if (str4.equals("cv1")) {
                                                    c = ':';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 98848:
                                                if (str4.equals("cv3")) {
                                                    c = ';';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 99329:
                                                if (str4.equals("deb")) {
                                                    c = '<';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 101481:
                                                if (str4.equals("flo")) {
                                                    c = '=';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1513190:
                                                if (str4.equals("1601")) {
                                                    c = '>';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1514184:
                                                if (str4.equals("1713")) {
                                                    c = '?';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1514185:
                                                if (str4.equals("1714")) {
                                                    c = '@';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2133089:
                                                if (str4.equals("F01H")) {
                                                    c = 'A';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2133091:
                                                if (str4.equals("F01J")) {
                                                    c = 'B';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2133120:
                                                if (str4.equals("F02H")) {
                                                    c = 'C';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2133151:
                                                if (str4.equals("F03H")) {
                                                    c = 'D';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2133182:
                                                if (str4.equals("F04H")) {
                                                    c = 'E';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2133184:
                                                if (str4.equals("F04J")) {
                                                    c = 'F';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2436959:
                                                if (str4.equals("P681")) {
                                                    c = 'G';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2463773:
                                                if (str4.equals("Q350")) {
                                                    c = 'H';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2464648:
                                                if (str4.equals("Q427")) {
                                                    c = 'I';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2689555:
                                                if (str4.equals("XE2X")) {
                                                    c = 'J';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 3154429:
                                                if (str4.equals("fugu")) {
                                                    c = 'K';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 3284551:
                                                if (str4.equals("kate")) {
                                                    c = 'L';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 3351335:
                                                if (str4.equals("mido")) {
                                                    c = 'M';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 3386211:
                                                if (str4.equals("p212")) {
                                                    c = 'N';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 41325051:
                                                if (str4.equals("MEIZU_M5")) {
                                                    c = 'O';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 51349633:
                                                if (str4.equals("601LV")) {
                                                    c = 'P';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 51350594:
                                                if (str4.equals("602LV")) {
                                                    c = 'Q';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 55178625:
                                                if (str4.equals("Aura_Note_2")) {
                                                    c = 'R';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 61542055:
                                                if (str4.equals("A1601")) {
                                                    c = 'S';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 65355429:
                                                if (str4.equals("E5643")) {
                                                    c = 'T';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 66214468:
                                                if (str4.equals("F3111")) {
                                                    c = 'U';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 66214470:
                                                if (str4.equals("F3113")) {
                                                    c = 'V';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 66214473:
                                                if (str4.equals("F3116")) {
                                                    c = 'W';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 66215429:
                                                if (str4.equals("F3211")) {
                                                    c = 'X';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 66215431:
                                                if (str4.equals("F3213")) {
                                                    c = 'Y';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 66215433:
                                                if (str4.equals("F3215")) {
                                                    c = 'Z';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 66216390:
                                                if (str4.equals("F3311")) {
                                                    c = '[';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 76402249:
                                                if (str4.equals("PRO7S")) {
                                                    c = CSPStore.UNIQUE_SEPARATOR;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 76404105:
                                                if (str4.equals("Q4260")) {
                                                    c = ']';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 76404911:
                                                if (str4.equals("Q4310")) {
                                                    c = '^';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 80963634:
                                                if (str4.equals("V23GB")) {
                                                    c = '_';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 82882791:
                                                if (str4.equals("X3_HK")) {
                                                    c = '`';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 98715550:
                                                if (str4.equals("i9031")) {
                                                    c = 'a';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 101370885:
                                                if (str4.equals("l5460")) {
                                                    c = 'b';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 102844228:
                                                if (str4.equals("le_x6")) {
                                                    c = 'c';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 165221241:
                                                if (str4.equals("A2016a40")) {
                                                    c = 'd';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 182191441:
                                                if (str4.equals("CPY83_I00")) {
                                                    c = 'e';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 245388979:
                                                if (str4.equals("marino_f")) {
                                                    c = 'f';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 287431619:
                                                if (str4.equals("griffin")) {
                                                    c = 'g';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 307593612:
                                                if (str4.equals("A7010a48")) {
                                                    c = 'h';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 308517133:
                                                if (str4.equals("A7020a48")) {
                                                    c = 'i';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 316215098:
                                                if (str4.equals("TB3-730F")) {
                                                    c = 'j';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 316215116:
                                                if (str4.equals("TB3-730X")) {
                                                    c = 'k';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 316246811:
                                                if (str4.equals("TB3-850F")) {
                                                    c = 'l';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 316246818:
                                                if (str4.equals("TB3-850M")) {
                                                    c = 'm';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 407160593:
                                                if (str4.equals("Pixi5-10_4G")) {
                                                    c = 'n';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 507412548:
                                                if (str4.equals("QM16XE_U")) {
                                                    c = 'o';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 793982701:
                                                if (str4.equals("GIONEE_WBL5708")) {
                                                    c = 'p';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 794038622:
                                                if (str4.equals("GIONEE_WBL7365")) {
                                                    c = 'q';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 794040393:
                                                if (str4.equals("GIONEE_WBL7519")) {
                                                    c = 'r';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 835649806:
                                                if (str4.equals("manning")) {
                                                    c = 's';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 917340916:
                                                if (str4.equals("A7000plus")) {
                                                    c = 't';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 958008161:
                                                if (str4.equals("j2xlteins")) {
                                                    c = 'u';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1060579533:
                                                if (str4.equals("panell_d")) {
                                                    c = 'v';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1150207623:
                                                if (str4.equals("LS-5017")) {
                                                    c = 'w';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1176899427:
                                                if (str4.equals("itel_S41")) {
                                                    c = 'x';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1280332038:
                                                if (str4.equals("hwALE-H")) {
                                                    c = 'y';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1306947716:
                                                if (str4.equals("EverStar_S")) {
                                                    c = 'z';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1349174697:
                                                if (str4.equals("htc_e56ml_dtul")) {
                                                    c = '{';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1522194893:
                                                if (str4.equals("woods_f")) {
                                                    c = '|';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1691543273:
                                                if (str4.equals("CPH1609")) {
                                                    c = '}';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1691544261:
                                                if (str4.equals("CPH1715")) {
                                                    c = '~';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1709443163:
                                                if (str4.equals("iball8735_9806")) {
                                                    c = 127;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1865889110:
                                                if (str4.equals("santoni")) {
                                                    c = 128;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1906253259:
                                                if (str4.equals("PB2-670M")) {
                                                    c = 129;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1977196784:
                                                if (str4.equals("Infinix-X572")) {
                                                    c = 130;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2006372676:
                                                if (str4.equals("BRAVIA_ATV3_4K")) {
                                                    c = 131;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2019281702:
                                                if (str4.equals("DM-01K")) {
                                                    c = 132;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2029784656:
                                                if (str4.equals("HWBLN-H")) {
                                                    c = 133;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2030379515:
                                                if (str4.equals("HWCAM-H")) {
                                                    c = 134;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2033393791:
                                                if (str4.equals("ASUS_X00AD_2")) {
                                                    c = 135;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2047190025:
                                                if (str4.equals("ELUGA_Note")) {
                                                    c = 136;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2047252157:
                                                if (str4.equals("ELUGA_Prim")) {
                                                    c = 137;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2048319463:
                                                if (str4.equals("HWVNS-H")) {
                                                    c = 138;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 2048855701:
                                                if (str4.equals("HWWAS-H")) {
                                                    c = 139;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            default:
                                                c = 65535;
                                                break;
                                        }
                                        switch (c) {
                                        }
                                    }
                                    z3 = false;
                                    break;
                                case false:
                                case true:
                                case true:
                                case true:
                                case true:
                                case true:
                                case true:
                                case true:
                                case true:
                                    break;
                            }
                            d.N5 = z3;
                            d.M5 = true;
                        }
                        z3 = true;
                        d.N5 = z3;
                        d.M5 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = d.N5;
        }
        if (!z && !this.O5) {
            z5 = false;
        }
        PlayerLogger playerLogger = this.P5;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, "MediaCodecVideoRenderer", "codecNeedsSetOutputSurfaceWorkaround", null, new Object[]{"isWorkaround=" + z5}, 4, null);
        }
        return z5;
    }

    @Override // androidx.media3.exoplayer.video.d, defpackage.peh, defpackage.a95
    public final void onReset() {
        PlayerLogger playerLogger = this.P5;
        try {
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose("MediaCodecVideoRenderer", "onReset", "before", new Object[0]);
            }
            super.onReset();
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose("MediaCodecVideoRenderer", "onReset", "after", new Object[0]);
            }
        } finally {
        }
    }

    @Override // androidx.media3.exoplayer.video.d, defpackage.a95
    public final void onStarted() {
        PlayerLogger playerLogger = this.P5;
        try {
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose("MediaCodecVideoRenderer", "onStarted", "before", new Object[0]);
            }
            super.onStarted();
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose("MediaCodecVideoRenderer", "onStarted", "after", new Object[0]);
            }
        } finally {
        }
    }

    @Override // androidx.media3.exoplayer.video.d, defpackage.a95
    public final void onStopped() {
        PlayerLogger playerLogger = this.P5;
        try {
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose("MediaCodecVideoRenderer", "onStopped", "before", new Object[0]);
            }
            super.onStopped();
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose("MediaCodecVideoRenderer", "onStopped", "after", new Object[0]);
            }
        } finally {
        }
    }

    @Override // defpackage.peh
    public final boolean q() {
        PlayerLogger playerLogger = this.P5;
        try {
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose("MediaCodecVideoRenderer", "flushOrReleaseCodec", "before", new Object[0]);
            }
            boolean q = super.q();
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose("MediaCodecVideoRenderer", "flushOrReleaseCodec", "after", new Object[0]);
            }
            return q;
        } finally {
        }
    }
}
