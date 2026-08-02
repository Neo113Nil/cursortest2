package xsna;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzjr;
import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class sj01 extends kj01 {
    public static zzaw B(zzaa zzaaVar) {
        Object obj;
        Bundle z = z(zzaaVar.zze(), true);
        String obj2 = (!z.containsKey("_o") || (obj = z.get("_o")) == null) ? MBridgeConstans.DYNAMIC_VIEW_WX_APP : obj.toString();
        String c = bbq.c(zzaaVar.zzd(), yiz.e, yiz.g);
        if (c == null) {
            c = zzaaVar.zzd();
        }
        return new zzaw(c, new zzau(z), obj2, zzaaVar.zza());
    }

    public static zzll D(zzkb zzkbVar, byte[] bArr) throws zzkp {
        zzjr zza = zzjr.zza();
        return zza != null ? zzkbVar.zzay(bArr, zza) : zzkbVar.zzax(bArr);
    }

    public static ArrayList H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(I((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(I((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(I((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap I(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z2 = obj instanceof Parcelable[];
            if (!z2 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    public static boolean L(int i, List list) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean N(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void P(zzfs zzfsVar, String str, Long l) {
        List zzp = zzfsVar.zzp();
        int i = 0;
        while (true) {
            if (i >= zzp.size()) {
                i = -1;
                break;
            } else if (str.equals(((zzfx) zzp.get(i)).zzg())) {
                break;
            } else {
                i++;
            }
        }
        zzfw zze = zzfx.zze();
        zze.zzj(str);
        if (l != null) {
            zze.zzi(l.longValue());
        }
        if (i >= 0) {
            zzfsVar.zzj(i, zze);
        } else {
            zzfsVar.zze(zze);
        }
    }

    public static final zzfx o(zzft zzftVar, String str) {
        for (zzfx zzfxVar : zzftVar.zzi()) {
            if (zzfxVar.zzg().equals(str)) {
                return zzfxVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable p(zzft zzftVar, String str) {
        zzfx o = o(zzftVar, str);
        if (o == null) {
            return null;
        }
        if (o.zzy()) {
            return o.zzh();
        }
        if (o.zzw()) {
            return Long.valueOf(o.zzd());
        }
        if (o.zzu()) {
            return Double.valueOf(o.zza());
        }
        if (o.zzc() <= 0) {
            return null;
        }
        List<zzfx> zzi = o.zzi();
        ArrayList arrayList = new ArrayList();
        for (zzfx zzfxVar : zzi) {
            if (zzfxVar != null) {
                Bundle bundle = new Bundle();
                for (zzfx zzfxVar2 : zzfxVar.zzi()) {
                    if (zzfxVar2.zzy()) {
                        bundle.putString(zzfxVar2.zzg(), zzfxVar2.zzh());
                    } else if (zzfxVar2.zzw()) {
                        bundle.putLong(zzfxVar2.zzg(), zzfxVar2.zzd());
                    } else if (zzfxVar2.zzu()) {
                        bundle.putDouble(zzfxVar2.zzg(), zzfxVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void s(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final String t(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void u(StringBuilder sb, String str, zzgi zzgiVar) {
        if (zzgiVar == null) {
            return;
        }
        s(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (zzgiVar.zzb() != 0) {
            s(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : zzgiVar.zzk()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (zzgiVar.zzd() != 0) {
            s(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : zzgiVar.zzn()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (zzgiVar.zza() != 0) {
            s(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (zzfr zzfrVar : zzgiVar.zzj()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(zzfrVar.zzh() ? Integer.valueOf(zzfrVar.zza()) : null);
                sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb.append(zzfrVar.zzg() ? Long.valueOf(zzfrVar.zzb()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (zzgiVar.zzc() != 0) {
            s(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (zzgk zzgkVar : zzgiVar.zzm()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(zzgkVar.zzi() ? Integer.valueOf(zzgkVar.zzb()) : null);
                sb.append(": [");
                Iterator it = zzgkVar.zzf().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i9 = i10;
                }
                sb.append(X3.j.e);
                i7 = i8;
            }
            sb.append("}\n");
        }
        s(3, sb);
        sb.append("}\n");
    }

    public static final void v(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        s(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void w(StringBuilder sb, int i, String str, zzer zzerVar) {
        if (zzerVar == null) {
            return;
        }
        s(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (zzerVar.zzg()) {
            int zzm = zzerVar.zzm();
            v(sb, i, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzerVar.zzi()) {
            v(sb, i, "match_as_float", Boolean.valueOf(zzerVar.zzf()));
        }
        if (zzerVar.zzh()) {
            v(sb, i, "comparison_value", zzerVar.zzc());
        }
        if (zzerVar.zzk()) {
            v(sb, i, "min_comparison_value", zzerVar.zze());
        }
        if (zzerVar.zzj()) {
            v(sb, i, "max_comparison_value", zzerVar.zzd());
        }
        s(i, sb);
        sb.append("}\n");
    }

    public static int x(zzgc zzgcVar, String str) {
        for (int i = 0; i < zzgcVar.zzb(); i++) {
            if (str.equals(zzgcVar.zzao(i).zzf())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle z(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(z((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public final Parcelable A(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            k901 k901Var = ((mb01) this.b).j;
            mb01.k(k901Var);
            k901Var.i.a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public final zzft C(dzz0 dzz0Var) {
        zzfs zze = zzft.zze();
        zze.zzl(dzz0Var.e);
        zzau zzauVar = dzz0Var.f;
        for (String str : zzauVar.b.keySet()) {
            zzfw zze2 = zzfx.zze();
            zze2.zzj(str);
            Object obj = zzauVar.b.get(str);
            exc0.i(obj);
            J(zze2, obj);
            zze.zze(zze2);
        }
        return (zzft) zze.zzaC();
    }

    public final String E(zzgb zzgbVar) {
        mb01 mb01Var = (mb01) this.b;
        if (zzgbVar == null) {
            return "";
        }
        StringBuilder e = fw3.e("\nbatch {\n");
        for (zzgd zzgdVar : zzgbVar.zzd()) {
            if (zzgdVar != null) {
                s(1, e);
                e.append("bundle {\n");
                if (zzgdVar.zzbj()) {
                    v(e, 1, CommonUrlParts.PROTOCOL_VERSION, Integer.valueOf(zzgdVar.zzd()));
                }
                zzpd.zzc();
                kwz0 kwz0Var = mb01Var.h;
                f901 f901Var = mb01Var.n;
                if (kwz0Var.t(null, s701.h0) && mb01Var.h.t(zzgdVar.zzx(), s701.j0) && zzgdVar.zzbm()) {
                    v(e, 1, "session_stitching_token", zzgdVar.zzK());
                }
                v(e, 1, "platform", zzgdVar.zzI());
                if (zzgdVar.zzbf()) {
                    v(e, 1, "gmp_version", Long.valueOf(zzgdVar.zzm()));
                }
                if (zzgdVar.zzbq()) {
                    v(e, 1, "uploading_gmp_version", Long.valueOf(zzgdVar.zzr()));
                }
                if (zzgdVar.zzbd()) {
                    v(e, 1, "dynamite_version", Long.valueOf(zzgdVar.zzj()));
                }
                if (zzgdVar.zzba()) {
                    v(e, 1, "config_version", Long.valueOf(zzgdVar.zzh()));
                }
                v(e, 1, "gmp_app_id", zzgdVar.zzF());
                v(e, 1, "admob_app_id", zzgdVar.zzw());
                v(e, 1, "app_id", zzgdVar.zzx());
                v(e, 1, CallAnalyticsApiRequest.KEY_APP_VERSION, zzgdVar.zzA());
                if (zzgdVar.zzaY()) {
                    v(e, 1, "app_version_major", Integer.valueOf(zzgdVar.zza()));
                }
                v(e, 1, "firebase_instance_id", zzgdVar.zzE());
                if (zzgdVar.zzbc()) {
                    v(e, 1, "dev_cert_hash", Long.valueOf(zzgdVar.zzi()));
                }
                v(e, 1, "app_store", zzgdVar.zzz());
                if (zzgdVar.zzbp()) {
                    v(e, 1, "upload_timestamp_millis", Long.valueOf(zzgdVar.zzq()));
                }
                if (zzgdVar.zzbn()) {
                    v(e, 1, "start_timestamp_millis", Long.valueOf(zzgdVar.zzp()));
                }
                if (zzgdVar.zzbe()) {
                    v(e, 1, "end_timestamp_millis", Long.valueOf(zzgdVar.zzk()));
                }
                if (zzgdVar.zzbi()) {
                    v(e, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgdVar.zzo()));
                }
                if (zzgdVar.zzbh()) {
                    v(e, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgdVar.zzn()));
                }
                v(e, 1, "app_instance_id", zzgdVar.zzy());
                v(e, 1, "resettable_device_id", zzgdVar.zzJ());
                v(e, 1, "ds_id", zzgdVar.zzD());
                if (zzgdVar.zzbg()) {
                    v(e, 1, "limited_ad_tracking", Boolean.valueOf(zzgdVar.zzaW()));
                }
                v(e, 1, "os_version", zzgdVar.zzH());
                v(e, 1, AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, zzgdVar.zzC());
                v(e, 1, "user_default_language", zzgdVar.zzL());
                if (zzgdVar.zzbo()) {
                    v(e, 1, "time_zone_offset_minutes", Integer.valueOf(zzgdVar.zzf()));
                }
                if (zzgdVar.zzaZ()) {
                    v(e, 1, "bundle_sequential_index", Integer.valueOf(zzgdVar.zzb()));
                }
                if (zzgdVar.zzbl()) {
                    v(e, 1, "service_upload", Boolean.valueOf(zzgdVar.zzaX()));
                }
                v(e, 1, "health_monitor", zzgdVar.zzG());
                if (zzgdVar.zzbk()) {
                    v(e, 1, "retry_counter", Integer.valueOf(zzgdVar.zze()));
                }
                if (zzgdVar.zzbb()) {
                    v(e, 1, "consent_signals", zzgdVar.zzB());
                }
                List<zzgm> zzO = zzgdVar.zzO();
                if (zzO != null) {
                    for (zzgm zzgmVar : zzO) {
                        if (zzgmVar != null) {
                            s(2, e);
                            e.append("user_property {\n");
                            v(e, 2, "set_timestamp_millis", zzgmVar.zzs() ? Long.valueOf(zzgmVar.zzc()) : null);
                            v(e, 2, "name", f901Var.f(zzgmVar.zzf()));
                            v(e, 2, "string_value", zzgmVar.zzg());
                            v(e, 2, "int_value", zzgmVar.zzr() ? Long.valueOf(zzgmVar.zzb()) : null);
                            v(e, 2, "double_value", zzgmVar.zzq() ? Double.valueOf(zzgmVar.zza()) : null);
                            s(2, e);
                            e.append("}\n");
                        }
                    }
                }
                List<zzfp> zzM = zzgdVar.zzM();
                if (zzM != null) {
                    for (zzfp zzfpVar : zzM) {
                        if (zzfpVar != null) {
                            s(2, e);
                            e.append("audience_membership {\n");
                            if (zzfpVar.zzk()) {
                                v(e, 2, "audience_id", Integer.valueOf(zzfpVar.zza()));
                            }
                            if (zzfpVar.zzm()) {
                                v(e, 2, "new_audience", Boolean.valueOf(zzfpVar.zzj()));
                            }
                            u(e, "current_data", zzfpVar.zzd());
                            if (zzfpVar.zzn()) {
                                u(e, "previous_data", zzfpVar.zze());
                            }
                            s(2, e);
                            e.append("}\n");
                        }
                    }
                }
                List<zzft> zzN = zzgdVar.zzN();
                if (zzN != null) {
                    for (zzft zzftVar : zzN) {
                        if (zzftVar != null) {
                            s(2, e);
                            e.append("event {\n");
                            v(e, 2, "name", f901Var.d(zzftVar.zzh()));
                            if (zzftVar.zzu()) {
                                v(e, 2, "timestamp_millis", Long.valueOf(zzftVar.zzd()));
                            }
                            if (zzftVar.zzt()) {
                                v(e, 2, "previous_timestamp_millis", Long.valueOf(zzftVar.zzc()));
                            }
                            if (zzftVar.zzs()) {
                                v(e, 2, "count", Integer.valueOf(zzftVar.zza()));
                            }
                            if (zzftVar.zzb() != 0) {
                                q(e, 2, zzftVar.zzi());
                            }
                            s(2, e);
                            e.append("}\n");
                        }
                    }
                }
                s(1, e);
                e.append("}\n");
            }
        }
        e.append("}\n");
        return e.toString();
    }

    public final String F(zzet zzetVar) {
        StringBuilder e = fw3.e("\nproperty_filter {\n");
        if (zzetVar.zzj()) {
            v(e, 0, "filter_id", Integer.valueOf(zzetVar.zza()));
        }
        v(e, 0, "property_name", ((mb01) this.b).n.f(zzetVar.zze()));
        String t = t(zzetVar.zzg(), zzetVar.zzh(), zzetVar.zzi());
        if (!t.isEmpty()) {
            v(e, 0, "filter_type", t);
        }
        r(e, 1, zzetVar.zzb());
        e.append("}\n");
        return e.toString();
    }

    public final List G(List list, List list2) {
        int i;
        mb01 mb01Var = (mb01) this.b;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.l.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    k901 k901Var2 = mb01Var.j;
                    mb01.k(k901Var2);
                    k901Var2.l.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final void J(zzfw zzfwVar, Object obj) {
        zzfwVar.zzg();
        zzfwVar.zze();
        zzfwVar.zzd();
        zzfwVar.zzf();
        if (obj instanceof String) {
            zzfwVar.zzk((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzfwVar.zzi(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzfwVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            k901 k901Var = ((mb01) this.b).j;
            mb01.k(k901Var);
            k901Var.i.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                zzfw zze = zzfx.zze();
                for (String str : bundle.keySet()) {
                    zzfw zze2 = zzfx.zze();
                    zze2.zzj(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zze2.zzi(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zze2.zzk((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zze2.zzh(((Double) obj2).doubleValue());
                    }
                    zze.zzc(zze2);
                }
                if (zze.zza() > 0) {
                    arrayList.add((zzfx) zze.zzaC());
                }
            }
        }
        zzfwVar.zzb(arrayList);
    }

    public final void K(zzgl zzglVar, Object obj) {
        exc0.i(obj);
        zzglVar.zzc();
        zzglVar.zzb();
        zzglVar.zza();
        if (obj instanceof String) {
            zzglVar.zzh((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzglVar.zze(((Long) obj).longValue());
        } else {
            if (obj instanceof Double) {
                zzglVar.zzd(((Double) obj).doubleValue());
                return;
            }
            k901 k901Var = ((mb01) this.b).j;
            mb01.k(k901Var);
            k901Var.i.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final boolean M(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((mb01) this.b).o.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public final byte[] O(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            k901 k901Var = ((mb01) this.b).j;
            mb01.k(k901Var);
            k901Var.i.b(e, "Failed to gzip content");
            throw e;
        }
    }

    public final void q(StringBuilder sb, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfx zzfxVar = (zzfx) it.next();
            if (zzfxVar != null) {
                s(i2, sb);
                sb.append("param {\n");
                v(sb, i2, "name", zzfxVar.zzx() ? ((mb01) this.b).n.e(zzfxVar.zzg()) : null);
                v(sb, i2, "string_value", zzfxVar.zzy() ? zzfxVar.zzh() : null);
                v(sb, i2, "int_value", zzfxVar.zzw() ? Long.valueOf(zzfxVar.zzd()) : null);
                v(sb, i2, "double_value", zzfxVar.zzu() ? Double.valueOf(zzfxVar.zza()) : null);
                if (zzfxVar.zzc() > 0) {
                    q(sb, i2, zzfxVar.zzi());
                }
                s(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public final void r(StringBuilder sb, int i, zzem zzemVar) {
        String str;
        if (zzemVar == null) {
            return;
        }
        s(i, sb);
        sb.append("filter {\n");
        if (zzemVar.zzh()) {
            v(sb, i, "complement", Boolean.valueOf(zzemVar.zzg()));
        }
        if (zzemVar.zzj()) {
            v(sb, i, "param_name", ((mb01) this.b).n.e(zzemVar.zze()));
        }
        if (zzemVar.zzk()) {
            int i2 = i + 1;
            zzey zzd = zzemVar.zzd();
            if (zzd != null) {
                s(i2, sb);
                sb.append("string_filter {\n");
                if (zzd.zzi()) {
                    switch (zzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    v(sb, i2, "match_type", str);
                }
                if (zzd.zzh()) {
                    v(sb, i2, "expression", zzd.zzd());
                }
                if (zzd.zzg()) {
                    v(sb, i2, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                }
                if (zzd.zza() > 0) {
                    s(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : zzd.zze()) {
                        s(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                s(i2, sb);
                sb.append("}\n");
            }
        }
        if (zzemVar.zzi()) {
            w(sb, i + 1, "number_filter", zzemVar.zzc());
        }
        s(i, sb);
        sb.append("}\n");
    }

    public final long y(byte[] bArr) {
        exc0.i(bArr);
        mb01 mb01Var = (mb01) this.b;
        sk01 sk01Var = mb01Var.m;
        mb01.i(sk01Var);
        sk01Var.k();
        MessageDigest r = sk01.r();
        if (r != null) {
            return sk01.i0(r.digest(bArr));
        }
        k901 k901Var = mb01Var.j;
        mb01.k(k901Var);
        k901Var.i.a("Failed to get MD5");
        return 0L;
    }

    @Override // xsna.kj01
    public final void n() {
    }
}
