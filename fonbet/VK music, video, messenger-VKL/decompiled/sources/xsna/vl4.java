package xsna;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: AudioCapabilities.java */
/* loaded from: classes12.dex */
public final class vl4 {
    public static final vl4 c = new vl4(ImmutableList.p(a.d));

    @SuppressLint({"InlinedApi"})
    public static final com.google.common.collect.g d;
    public static final ImmutableMap<Integer, Integer> e;
    public final SparseArray<a> a = new SparseArray<>();
    public final int b;

    static {
        Object[] objArr = {2, 5, 6};
        ne7.l(objArr);
        d = ImmutableList.l(3, objArr);
        ImmutableMap.a aVar = new ImmutableMap.a(4);
        aVar.d(5, 6);
        aVar.d(17, 6);
        aVar.d(7, 6);
        aVar.d(30, 10);
        aVar.d(18, 6);
        aVar.d(6, 8);
        aVar.d(8, 8);
        aVar.d(14, 8);
        e = aVar.a(true);
    }

    public vl4(com.google.common.collect.g gVar) {
        for (int i = 0; i < gVar.e; i++) {
            a aVar = (a) gVar.get(i);
            this.a.put(aVar.a, aVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, this.a.valueAt(i3).b);
        }
        this.b = i2;
    }

    public static com.google.common.collect.g a(int i, @Nullable int[] iArr) {
        ImmutableList.b bVar = ImmutableList.c;
        ImmutableList.a aVar = new ImmutableList.a();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            aVar.c(new a(i2, i));
        }
        return aVar.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0216, code lost:
    
        if (r0.equals("Xiaomi") == false) goto L84;
     */
    @SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vl4 b(Context context, @Nullable Intent intent, nc4 nc4Var, @Nullable AudioDeviceInfo audioDeviceInfo) {
        boolean isDirectPlaybackSupported;
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        List audioDevicesForAttributes;
        AudioManager a2 = hq4.a(context);
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                audioDevicesForAttributes = a2.getAudioDevicesForAttributes(nc4Var.a());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
                }
            }
            audioDeviceInfo = null;
        }
        int i = Build.VERSION.SDK_INT;
        ImmutableMap<Integer, Integer> immutableMap = e;
        if (i >= 33 && (y2r0.Q(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            directProfilesForAttributes = a2.getDirectProfilesForAttributes(nc4Var.a());
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(ipx.r(12)));
            for (int i2 = 0; i2 < directProfilesForAttributes.size(); i2++) {
                AudioProfile b = pl4.b(directProfilesForAttributes.get(i2));
                encapsulationType = b.getEncapsulationType();
                if (encapsulationType != 1) {
                    format = b.getFormat();
                    if (y2r0.M(format) || immutableMap.containsKey(Integer.valueOf(format))) {
                        if (hashMap.containsKey(Integer.valueOf(format))) {
                            Set set = (Set) hashMap.get(Integer.valueOf(format));
                            set.getClass();
                            channelMasks2 = b.getChannelMasks();
                            set.addAll(ipx.r(channelMasks2));
                        } else {
                            Integer valueOf = Integer.valueOf(format);
                            channelMasks = b.getChannelMasks();
                            hashMap.put(valueOf, new HashSet(ipx.r(channelMasks)));
                        }
                    }
                }
            }
            ImmutableList.b bVar = ImmutableList.c;
            ImmutableList.a aVar = new ImmutableList.a();
            for (Map.Entry entry : hashMap.entrySet()) {
                aVar.c(new a(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
            }
            return new vl4(aVar.g());
        }
        AudioDeviceInfo[] devices = audioDeviceInfo == null ? a2.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo};
        ImmutableSet.a aVar2 = new ImmutableSet.a(4);
        aVar2.d(8, 7);
        if (i >= 31) {
            aVar2.d(26, 27);
        }
        if (i >= 33) {
            aVar2.c(30);
        }
        ImmutableSet i3 = aVar2.i();
        for (AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (i3.contains(Integer.valueOf(audioDeviceInfo2.getType()))) {
                return c;
            }
        }
        ImmutableSet.a aVar3 = new ImmutableSet.a(4);
        aVar3.c(2);
        if (Build.VERSION.SDK_INT >= 29 && (y2r0.Q(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            ImmutableList.b bVar2 = ImmutableList.c;
            ImmutableList.a aVar4 = new ImmutableList.a();
            s4q0<Integer> it = immutableMap.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                int intValue = next.intValue();
                if (Build.VERSION.SDK_INT >= y2r0.s(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), nc4Var.a());
                    if (isDirectPlaybackSupported) {
                        aVar4.c(next);
                    }
                }
            }
            aVar4.c(2);
            aVar3.h(aVar4.g());
            return new vl4(a(10, ipx.x(aVar3.i())));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (!str.equals("Amazon")) {
            }
        }
        if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar3.h(d);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new vl4(a(10, ipx.x(aVar3.i())));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar3.h(ipx.r(intArrayExtra));
        }
        return new vl4(a(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), ipx.x(aVar3.i())));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static vl4 c(Context context, nc4 nc4Var, @Nullable AudioDeviceInfo audioDeviceInfo) {
        return b(context, fp.a("android.media.action.HDMI_AUDIO_PLUG", context, null), nc4Var, audioDeviceInfo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f4, code lost:
    
        if (r9 != 5) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fe A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0100  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<Integer, Integer> d(androidx.media3.common.a aVar, nc4 nc4Var) {
        boolean isDirectPlaybackSupported;
        int t;
        String str = aVar.n;
        str.getClass();
        int d2 = io20.d(str, aVar.k);
        Integer valueOf = Integer.valueOf(d2);
        ImmutableMap<Integer, Integer> immutableMap = e;
        if (!immutableMap.containsKey(valueOf)) {
            return null;
        }
        int i = 6;
        SparseArray<a> sparseArray = this.a;
        if (d2 == 18 && !y2r0.l(sparseArray, 18)) {
            d2 = 6;
        } else if ((d2 == 8 && !y2r0.l(sparseArray, 8)) || (d2 == 30 && !y2r0.l(sparseArray, 30))) {
            d2 = 7;
        }
        if (!y2r0.l(sparseArray, d2)) {
            return null;
        }
        a aVar2 = sparseArray.get(d2);
        aVar2.getClass();
        int i2 = aVar2.b;
        ImmutableSet<Integer> immutableSet = aVar2.c;
        int i3 = aVar.F;
        boolean z = false;
        if (i3 == -1 || d2 == 18) {
            int i4 = aVar.G;
            if (i4 == -1) {
                i4 = 48000;
            }
            int i5 = aVar2.a;
            if (immutableSet == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    i2 = 10;
                    while (true) {
                        if (i2 <= 0) {
                            i2 = 0;
                            break;
                        }
                        int t2 = y2r0.t(i2);
                        if (t2 != 0) {
                            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i5).setSampleRate(i4).setChannelMask(t2).build(), nc4Var.a());
                            if (isDirectPlaybackSupported) {
                                break;
                            }
                        }
                        i2--;
                    }
                } else {
                    Integer num = immutableMap.get(Integer.valueOf(i5));
                    i2 = (num != null ? num : 0).intValue();
                }
            }
            i3 = i2;
        } else if (!aVar.n.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (immutableSet != null) {
                int t3 = y2r0.t(i3);
                if (t3 != 0) {
                    z = immutableSet.contains(Integer.valueOf(t3));
                }
            } else if (i3 <= i2) {
                z = true;
            }
            if (!z) {
                return null;
            }
        } else if (i3 > 10) {
            return null;
        }
        if (Build.VERSION.SDK_INT <= 28) {
            if (i3 == 7) {
                i = 8;
            } else if (i3 != 3) {
                if (i3 != 4) {
                }
            }
            t = y2r0.t(i);
            if (t != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(d2), Integer.valueOf(t));
        }
        i = i3;
        t = y2r0.t(i);
        if (t != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(@Nullable Object obj) {
        boolean contentEquals;
        if (this != obj) {
            if (obj instanceof vl4) {
                vl4 vl4Var = (vl4) obj;
                SparseArray<a> sparseArray = vl4Var.a;
                String str = y2r0.a;
                SparseArray<a> sparseArray2 = this.a;
                if (sparseArray2 != null) {
                    if (sparseArray != null) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            contentEquals = sparseArray2.contentEquals(sparseArray);
                        } else {
                            int size = sparseArray2.size();
                            if (size == sparseArray.size()) {
                                for (int i = 0; i < size; i++) {
                                    if (Objects.equals(sparseArray2.valueAt(i), sparseArray.get(sparseArray2.keyAt(i)))) {
                                    }
                                }
                                contentEquals = true;
                            }
                        }
                    }
                    contentEquals = false;
                    break;
                }
                if (!contentEquals || this.b != vl4Var.b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = y2r0.a;
        int i2 = Build.VERSION.SDK_INT;
        SparseArray<a> sparseArray = this.a;
        if (i2 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            i = 17;
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                i = Objects.hashCode(sparseArray.valueAt(i3)) + ((sparseArray.keyAt(i3) + (i * 31)) * 31);
            }
        }
        return (i * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + X3.j.e;
    }

    /* compiled from: AudioCapabilities.java */
    public static final class a {
        public static final a d;
        public final int a;
        public final int b;

        @Nullable
        public final ImmutableSet<Integer> c;

        static {
            a aVar;
            if (Build.VERSION.SDK_INT >= 33) {
                ImmutableSet.a aVar2 = new ImmutableSet.a(4);
                for (int i = 1; i <= 10; i++) {
                    aVar2.c(Integer.valueOf(y2r0.t(i)));
                }
                aVar = new a(2, aVar2.i());
            } else {
                aVar = new a(2, 10);
            }
            d = aVar;
        }

        public a(int i, Set<Integer> set) {
            this.a = i;
            ImmutableSet<Integer> n = ImmutableSet.n(set);
            this.c = n;
            s4q0<Integer> it = n.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 = Math.max(i2, Integer.bitCount(it.next().intValue()));
            }
            this.b = i2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Objects.equals(this.c, aVar.c);
        }

        public final int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            ImmutableSet<Integer> immutableSet = this.c;
            return i + (immutableSet == null ? 0 : immutableSet.hashCode());
        }

        public final String toString() {
            return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + X3.j.e;
        }

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = null;
        }
    }
}
