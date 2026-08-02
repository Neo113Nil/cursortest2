package yads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.car.app.hardware.common.CarZone;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.ironsource.B5;
import com.ironsource.C4498pe;
import com.ironsource.F9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.vk.dto.common.ImageSizeKey;
import io.jsonwebtoken.JwtParser;
import io.requery.android.database.sqlite.SQLiteStatementType;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.json.JsonToken;

/* loaded from: classes10.dex */
public final class dc0 implements im, v93 {
    public static final tn2 n = s51.a(4800000L, 3100000L, 2100000L, 1500000L, 800000L);
    public static final tn2 o = s51.a(1500000L, 1000000L, 730000L, 440000L, 170000L);
    public static final tn2 p = s51.a(2200000L, 1400000L, 1100000L, 910000L, 620000L);
    public static final tn2 q = s51.a(3000000L, 1900000L, 1400000L, 1000000L, 660000L);
    public static final tn2 r = s51.a(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);
    public static final tn2 s = s51.a(2800000L, 2400000L, 1600000L, 1100000L, 950000L);
    public static dc0 t;
    public final v51 a;
    public final gm b = new gm();
    public final f23 c;
    public final xv d;
    public final boolean e;
    public int f;
    public long g;
    public long h;
    public int i;
    public long j;
    public long k;
    public long l;
    public long m;

    public dc0(Context context, HashMap hashMap, int i, j63 j63Var, boolean z) {
        this.a = v51.a(hashMap);
        this.c = new f23(i);
        this.d = j63Var;
        this.e = z;
        if (context == null) {
            this.i = 0;
            this.l = a(0);
            return;
        }
        q92 a = q92.a(context);
        int a2 = a.a();
        this.i = a2;
        this.l = a(a2);
        a.b(new o92() { // from class: xsna.sqy0
            @Override // yads.o92
            public final void a(int i2) {
                yads.dc0.this.b(i2);
            }
        });
    }

    public final void a(Handler handler, se seVar) {
        seVar.getClass();
        gm gmVar = this.b;
        gmVar.getClass();
        Iterator it = gmVar.a.iterator();
        while (it.hasNext()) {
            fm fmVar = (fm) it.next();
            if (fmVar.b == seVar) {
                fmVar.c = true;
                gmVar.a.remove(fmVar);
            }
        }
        gmVar.a.add(new fm(handler, seVar));
    }

    public final synchronized void b(int i) {
        int i2 = this.i;
        if (i2 == 0 || this.e) {
            if (i2 == i) {
                return;
            }
            this.i = i;
            if (i != 1 && i != 0 && i != 8) {
                this.l = a(i);
                ((j63) this.d).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int i3 = this.f > 0 ? (int) (elapsedRealtime - this.g) : 0;
                long j = this.h;
                long j2 = this.l;
                if (i3 != 0 || j != 0 || j2 != this.m) {
                    this.m = j2;
                    this.b.a(i3, j, j2);
                }
                this.g = elapsedRealtime;
                this.h = 0L;
                this.k = 0L;
                this.j = 0L;
                f23 f23Var = this.c;
                f23Var.b.clear();
                f23Var.d = -1;
                f23Var.e = 0;
                f23Var.f = 0;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c = '\b';
                    break;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    c = '\t';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c = '\n';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c = 11;
                    break;
                }
                break;
            case C4498pe.g /* 2100 */:
                if (str.equals("AU")) {
                    c = '\f';
                    break;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    c = '\r';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c = 14;
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c = 15;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c = 16;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c = 17;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c = 18;
                    break;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    c = 19;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c = 20;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c = 21;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c = 22;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c = 23;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c = 24;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c = 25;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c = 26;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c = 27;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c = 28;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c = 29;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c = 30;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c = 31;
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c = ' ';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c = '!';
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c = '\"';
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c = '#';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c = '$';
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c = '%';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c = '&';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c = '\'';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c = '(';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c = ')';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c = ImageSizeKey.SIZE_KEY_BASE;
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c = '+';
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c = ',';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c = '-';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c = JwtParser.SEPARATOR_CHAR;
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c = '/';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c = ImageSizeKey.SIZE_KEY_UNDEFINED;
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c = '1';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c = '2';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c = '3';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c = '4';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c = '5';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c = '6';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c = '7';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c = '8';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c = '9';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c = ':';
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c = ';';
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c = '<';
                    break;
                }
                break;
            case F9.a.e /* 2210 */:
                if (str.equals("EG")) {
                    c = B5.U;
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c = '>';
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c = '?';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c = '@';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c = 'A';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c = 'B';
                    break;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    c = 'C';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c = 'D';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c = 'E';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c = 'F';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c = 'G';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c = 'H';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c = 'I';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c = 'J';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c = 'K';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c = 'L';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c = 'M';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c = 'N';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c = 'O';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c = 'P';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c = 'Q';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c = 'R';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c = 'S';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c = 'T';
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c = 'U';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c = 'V';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c = 'W';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c = 'X';
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c = 'Y';
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c = 'Z';
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c = '[';
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c = '\\';
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c = ']';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c = '^';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c = '_';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c = '`';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c = 'a';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c = 'b';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c = 'c';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c = 'd';
                    break;
                }
                break;
            case 2346:
                if (str.equals(IronSourceConstants.INTERSTITIAL_EVENT_TYPE)) {
                    c = 'e';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c = 'f';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c = 'g';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c = 'h';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c = 'i';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c = 'j';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c = 'k';
                    break;
                }
                break;
            case 2396:
                if (str.equals(ExpandedProductParsedResult.KILOGRAM)) {
                    c = 'l';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c = 'm';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c = 'n';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c = 'o';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c = 'p';
                    break;
                }
                break;
            case 2405:
                if (str.equals("KP")) {
                    c = 'q';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c = 'r';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c = 's';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c = 't';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c = 'u';
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c = 'v';
                    break;
                }
                break;
            case 2422:
                if (str.equals(ExpandedProductParsedResult.POUND)) {
                    c = 'w';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c = 'x';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c = 'y';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c = 'z';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c = '{';
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c = '|';
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c = '}';
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c = '~';
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c = 127;
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c = 128;
                    break;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    c = 129;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c = 130;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c = 131;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c = 132;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c = 133;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c = 134;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c = 135;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c = 136;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c = 137;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c = 138;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c = 139;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c = 140;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c = 141;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c = 142;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c = 143;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c = 144;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c = 145;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c = 146;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c = 147;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c = 148;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c = 149;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c = 150;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c = 151;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c = 152;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c = 153;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c = 154;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c = 155;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c = 156;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c = 157;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c = 158;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c = 159;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c = 160;
                    break;
                }
                break;
            case F9.b.e /* 2503 */:
                if (str.equals("NU")) {
                    c = 161;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c = 162;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c = 163;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c = 164;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c = 165;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c = 166;
                    break;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    c = 167;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c = 168;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c = 169;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c = 170;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c = 171;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c = 172;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c = 173;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c = 174;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c = 175;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c = 176;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c = 177;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c = 178;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c = 179;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c = 180;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c = 181;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c = 182;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c = 183;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c = 184;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c = 185;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c = 186;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c = 187;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c = 188;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c = 189;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c = 190;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c = 191;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c = 192;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c = 193;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c = 194;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c = 195;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c = 196;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c = 197;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c = 198;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c = 199;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c = 200;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c = 201;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c = 202;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c = 203;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c = 204;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c = 205;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c = 206;
                    break;
                }
                break;
            case 2679:
                if (str.equals("TK")) {
                    c = 207;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c = 208;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c = 209;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c = 210;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c = 211;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c = 212;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c = 213;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c = 214;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c = 215;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c = 216;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c = 217;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c = 218;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c = 219;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c = 220;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c = 221;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c = 222;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c = 223;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c = 224;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c = 225;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c = 226;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c = 227;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c = 228;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c = 229;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c = 230;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c = 231;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c = 232;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c = 233;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c = 234;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c = 235;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c = 236;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 26:
            case 29:
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
            case 'O':
            case 'p':
            case 't':
            case 'x':
            case STALE_CACHED_RESPONSE_VALUE:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 4, 4, 4, 0};
            case 2:
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return new int[]{4, 3, 3, 4, 2, 2};
            case 3:
                return new int[]{2, 4, 1, 2, 2, 2};
            case 4:
                return new int[]{0, 2, 0, 3, 2, 2};
            case 5:
            case 231:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{4, 4, 3, 2, 2, 2};
            case '\b':
            case '>':
            case 188:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
            case 'l':
            case AD_NOT_LOADED_VALUE:
            case AD_RESPONSE_RETRY_AFTER_VALUE:
                return new int[]{2, 1, 1, 1, 2, 2};
            case '\n':
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
                return new int[]{1, 0, 1, 1, 0, 0};
            case '\f':
                return new int[]{0, 1, 1, 1, 2, 0};
            case '\r':
                return new int[]{1, 3, 4, 4, 2, 2};
            case 14:
            case TPAT_ERROR_VALUE:
            case 144:
            case 171:
            case PsExtractor.AUDIO_STREAM /* 192 */:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
            case 128:
            case 169:
            case 194:
            case 211:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 16:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 17:
            case '8':
            case 'E':
            case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 3, 2, 2};
            case 19:
                return new int[]{0, 1, 4, 4, 3, 2};
            case 20:
                return new int[]{4, 3, 4, 3, 2, 2};
            case 21:
            case 145:
            case 190:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 2, 1, 3, 4, 2};
            case 23:
            case JsonToken.BEGIN_ARRAY /* 91 */:
            case 'o':
            case 134:
            case 154:
            case 185:
            case 203:
            case 224:
            case 232:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 3, 3, 2, 2};
            case 25:
            case '2':
            case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 27:
            case '1':
                return new int[]{2, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 3, 2, 2, 2};
            case 30:
                return new int[]{4, 4, 2, 2, 2, 2};
            case 31:
                return new int[]{3, 1, 3, 2, 2, 2};
            case ' ':
                return new int[]{3, 2, 1, 0, 2, 2};
            case '!':
                return new int[]{0, 1, 2, 3, 2, 2};
            case '\"':
                return new int[]{2, 4, 2, 1, 2, 2};
            case '#':
                return new int[]{0, 2, 2, 2, 3, 2};
            case '$':
                return new int[]{4, 2, 3, 2, 2, 2};
            case '%':
            case 'n':
                return new int[]{4, 2, 4, 2, 2, 2};
            case '&':
            case '=':
            case 'W':
                return new int[]{3, 4, 3, 3, 2, 2};
            case '\'':
                return new int[]{0, 0, 0, 1, 0, 2};
            case '(':
            case ':':
            case '{':
                return new int[]{3, 4, 4, 4, 2, 2};
            case ')':
            case 166:
                return new int[]{2, 2, 2, 1, 2, 2};
            case '*':
            case '_':
                return new int[]{1, 2, 2, 2, 3, 2};
            case '+':
                return new int[]{3, 3, 3, 3, 2, 2};
            case ',':
                return new int[]{2, 0, 1, 1, 3, 2};
            case '-':
                return new int[]{2, 3, 4, 3, 2, 2};
            case '.':
                return new int[]{2, 3, 4, 4, 2, 2};
            case '/':
            case '6':
            case 200:
            case 206:
            case INVALID_BID_PAYLOAD_VALUE:
                return new int[]{4, 3, 4, 4, 2, 2};
            case '0':
                return new int[]{2, 1, 0, 0, 2, 2};
            case '3':
            case INVALID_INDEX_URL_VALUE:
                return new int[]{1, 0, 0, 0, 0, 2};
            case '4':
            case 158:
                return new int[]{0, 0, 2, 0, 1, 2};
            case '5':
                return new int[]{0, 1, 2, 2, 2, 3};
            case '7':
                return new int[]{0, 0, 3, 2, 0, 2};
            case '9':
                return new int[]{3, 4, 4, 4, 4, 2};
            case ';':
                return new int[]{2, 3, 2, 1, 2, 2};
            case '<':
            case 'e':
            case 127:
            case 174:
            case 186:
            case AD_RESPONSE_EMPTY_VALUE:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '?':
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                return new int[]{0, 1, 1, 1, 2, 2};
            case '@':
                return new int[]{4, 3, 3, 1, 2, 2};
            case 'A':
                return new int[]{0, 0, 0, 3, 0, 2};
            case 'B':
                return new int[]{3, 1, 2, 2, 2, 2};
            case 'C':
            case ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED /* 107 */:
            case 'q':
                return new int[]{3, 2, 2, 2, 2, 2};
            case 'D':
                return new int[]{4, 2, 4, 1, 2, 2};
            case 'F':
                return new int[]{1, 2, 3, 1, 0, 2};
            case 'G':
            case 204:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 'H':
                return new int[]{0, 0, 1, 1, 1, 1};
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                return new int[]{1, 1, 1, 2, 2, 2};
            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
            case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                return new int[]{0, 2, 0, 1, 2, 2};
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
            case 152:
            case 228:
                return new int[]{3, 3, 3, 2, 2, 2};
            case IMAGES_IMAGE_LOADED_VALUE:
                return new int[]{4, 3, 4, 2, 2, 2};
            case 'R':
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 'S':
                return new int[]{4, 2, 1, 4, 2, 2};
            case 'T':
            case 'Z':
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 'U':
                return new int[]{2, 3, 2, 2, 2, 2};
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
            case 165:
                return new int[]{1, 2, 4, 4, 4, 2};
            case 'X':
                return new int[]{3, 2, 2, 1, 2, 2};
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                return new int[]{0, 1, 2, 3, 2, 0};
            case '\\':
                return new int[]{0, 0, 0, 1, 3, 2};
            case JsonToken.END_ARRAY /* 93 */:
                return new int[]{3, 1, 2, 2, 3, 2};
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
            case AD_RESPONSE_TIMED_OUT_VALUE:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 'a':
                return new int[]{1, 1, 3, 2, 3, 3};
            case JsonToken.BOOLEAN /* 98 */:
            case 135:
            case INVALID_GZIP_BID_PAYLOAD_VALUE:
            case 229:
                return new int[]{4, 2, 2, 4, 2, 2};
            case SQLiteStatementType.STATEMENT_OTHER /* 99 */:
                return new int[]{3, 2, 2, 3, 2, 2};
            case 'd':
                return new int[]{3, 0, 1, 1, 4, 1};
            case 'f':
                return new int[]{0, 0, 0, 1, 1, 2};
            case 'g':
            case 233:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 'h':
                return new int[]{2, 4, 3, 2, 2, 2};
            case 'i':
                return new int[]{2, 1, 1, 2, 2, 2};
            case INVALID_REQUEST_BUILDER_ERROR_VALUE:
                return new int[]{0, 1, 1, 2, 2, 4};
            case 'm':
                return new int[]{2, 1, 4, 2, 2, 2};
            case ASSET_WRITE_ERROR_VALUE:
                return new int[]{0, 1, 1, 3, 4, 4};
            case ASSET_FAILED_STATUS_CODE_VALUE:
                return new int[]{2, 1, 2, 2, 2, 2};
            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                return new int[]{1, 2, 1, 3, 2, 2};
            case JSON_ENCODE_ERROR_VALUE:
                return new int[]{3, 3, 2, 4, 2, 2};
            case INVALID_ADS_ENDPOINT_VALUE:
                return new int[]{3, 1, 3, 3, 4, 2};
            case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                return new int[]{3, 3, 2, 2, 2, 2};
            case '}':
                return new int[]{0, 0, 0, 0, 2, 2};
            case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                return new int[]{1, 0, 3, 2, 1, 4};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 130:
                return new int[]{0, 2, 2, 0, 2, 2};
            case MRAID_JS_WRITE_FAILED_VALUE:
            case 179:
                return new int[]{1, 0, 0, 0, 2, 2};
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                return new int[]{2, 0, 0, 1, 2, 2};
            case OMSDK_JS_WRITE_FAILED_VALUE:
            case 177:
                return new int[]{1, 2, 1, 2, 2, 2};
            case PRIVACY_URL_ERROR_VALUE:
                return new int[]{1, 0, 0, 1, 3, 2};
            case TPAT_RETRY_FAILED_VALUE:
            case 167:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 138:
                return new int[]{2, 4, 2, 3, 2, 2};
            case 139:
                return new int[]{2, 0, 1, 2, 2, 2};
            case VersionConstants.PRODUCT_MAJOR_VERSION /* 140 */:
            case 141:
                return new int[]{0, 2, 4, 4, 2, 2};
            case 143:
            case 236:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 146:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 147:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 148:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 149:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 150:
                return new int[]{1, 0, 3, 1, 3, 2};
            case 151:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 153:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 155:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 156:
            case 164:
            case 198:
                return new int[]{2, 3, 3, 3, 2, 2};
            case 157:
                return new int[]{0, 2, 2, 3, 0, 3};
            case 159:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 160:
            case 161:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 162:
            case 170:
                return new int[]{1, 1, 2, 2, 4, 2};
            case 163:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 168:
                return new int[]{2, 1, 3, 3, 3, 0};
            case 172:
                return new int[]{2, 0, 2, 1, 2, 1};
            case 173:
                return new int[]{3, 4, 1, 2, 2, 2};
            case 175:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 176:
                return new int[]{2, 4, 4, 4, 4, 2};
            case 178:
                return new int[]{0, 0, 1, 2, 1, 2};
            case 180:
                return new int[]{1, 0, 0, 0, 4, 3};
            case 181:
                return new int[]{3, 4, 2, 0, 2, 2};
            case 182:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 183:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 184:
            case INVALID_JSON_BID_PAYLOAD_VALUE:
                return new int[]{4, 2, 1, 1, 2, 2};
            case 187:
                return new int[]{1, 1, 2, 2, 2, 1};
            case 191:
            case MRAID_JS_DOES_NOT_EXIST_VALUE:
                return new int[]{3, 3, 4, 3, 2, 2};
            case 193:
                return new int[]{4, 4, 4, 3, 2, 2};
            case 195:
                return new int[]{2, 4, 3, 0, 2, 2};
            case 196:
                return new int[]{4, 3, 2, 3, 2, 2};
            case 197:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 199:
            case 202:
                return new int[]{1, 2, 1, 0, 2, 2};
            case 201:
                return new int[]{3, 3, 3, 4, 2, 2};
            case 205:
                return new int[]{0, 2, 2, 3, 3, 4};
            case 207:
                return new int[]{2, 2, 2, 4, 2, 2};
            case PLACEMENT_SLEEP_VALUE:
                return new int[]{1, 1, 0, 0, 2, 2};
            case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                return new int[]{1, 4, 1, 3, 2, 2};
            case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                return new int[]{3, 4, 3, 2, 2, 2};
            case MRAID_JS_COPY_FAILED_VALUE:
                return new int[]{1, 0, 2, 2, 3, 1};
            case AD_LOAD_FAIL_RETRY_AFTER_VALUE:
                return new int[]{2, 2, 3, 4, 2, 2};
            case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                return new int[]{2, 2, 1, 1, 2, 2};
            case INVALID_CSB_DATA_VALUE:
                return new int[]{0, 3, 3, 4, 2, 2};
            case 230:
                return new int[]{3, 1, 3, 1, 2, 2};
            case 234:
                return new int[]{3, 2, 2, 1, 1, 2};
            case 235:
                return new int[]{3, 3, 4, 2, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    public final long a(int i) {
        Long l = (Long) this.a.get(Integer.valueOf(i));
        if (l == null) {
            l = (Long) this.a.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }
}
