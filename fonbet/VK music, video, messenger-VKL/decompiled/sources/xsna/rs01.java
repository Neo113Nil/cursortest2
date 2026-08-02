package xsna;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzey;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public abstract class rs01 {
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;

    public rs01(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @VisibleForTesting
    public static Boolean d(BigDecimal bigDecimal, zzer zzerVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        exc0.i(zzerVar);
        if (zzerVar.zzg()) {
            if (zzerVar.zzm() != 1 && (zzerVar.zzm() != 5 ? zzerVar.zzh() : zzerVar.zzk() && zzerVar.zzj())) {
                int zzm = zzerVar.zzm();
                try {
                    if (zzerVar.zzm() == 5) {
                        if (sj01.N(zzerVar.zze()) && sj01.N(zzerVar.zzd())) {
                            BigDecimal bigDecimal5 = new BigDecimal(zzerVar.zze());
                            bigDecimal4 = new BigDecimal(zzerVar.zzd());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        }
                    } else if (sj01.N(zzerVar.zzc())) {
                        bigDecimal2 = new BigDecimal(zzerVar.zzc());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    }
                    if (zzm != 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                        int i = zzm - 1;
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4 && bigDecimal3 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    if (d != ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                    }
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                            }
                        } else if (bigDecimal2 != null) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @VisibleForTesting
    public static Boolean e(String str, zzey zzeyVar, k901 k901Var) {
        List zze;
        exc0.i(zzeyVar);
        if (str != null && zzeyVar.zzi() && zzeyVar.zzj() != 1 && (zzeyVar.zzj() != 7 ? zzeyVar.zzh() : zzeyVar.zza() != 0)) {
            int zzj = zzeyVar.zzj();
            boolean zzf = zzeyVar.zzf();
            String zzd = (zzf || zzj == 2 || zzj == 7) ? zzeyVar.zzd() : zzeyVar.zzd().toUpperCase(Locale.ENGLISH);
            if (zzeyVar.zza() == 0) {
                zze = null;
            } else {
                zze = zzeyVar.zze();
                if (!zzf) {
                    ArrayList arrayList = new ArrayList(zze.size());
                    Iterator it = zze.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    zze = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = zzj == 2 ? zzd : null;
            if (zzj != 7 ? zzd != null : zze != null && !zze.isEmpty()) {
                if (!zzf && zzj != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (zzj - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zzf ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (k901Var != null) {
                                    k901Var.l.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(zzd));
                    case 3:
                        return Boolean.valueOf(str.endsWith(zzd));
                    case 4:
                        return Boolean.valueOf(str.contains(zzd));
                    case 5:
                        return Boolean.valueOf(str.equals(zzd));
                    case 6:
                        if (zze != null) {
                            return Boolean.valueOf(zze.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    @VisibleForTesting
    public static Boolean f(boolean z, Boolean bool) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
