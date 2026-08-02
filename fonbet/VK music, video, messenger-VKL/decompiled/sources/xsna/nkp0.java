package xsna;

import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.util.Size;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.media.pipeline.bitrate.EncoderBitrateProvider$Companion$VideoEncoderMotionFactor;
import com.vk.media.pipeline.model.effect.AudioEffect;
import com.vk.media.pipeline.model.item.AudioItem;
import com.vk.media.pipeline.model.item.PlayableItem;
import com.vk.media.pipeline.model.item.VideoEncodedItem;
import com.vk.media.pipeline.model.item.VideoItem;
import com.vk.media.pipeline.model.quality.MediaQuality;
import com.vk.media.pipeline.model.timeline.AudioFragmentItem;
import com.vk.media.pipeline.model.transform.TransformFormat;
import com.vk.media.pipeline.session.transform.TransformException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import xsna.kel;
import xsna.uo10;
import xsna.v6e0;

/* compiled from: TransformSelector.kt */
/* loaded from: classes3.dex */
public final class nkp0 {
    public final csp a;
    public final ykm0 b;
    public final fq10 c;
    public final gtj d;
    public final djp0 e;

    /* compiled from: TransformSelector.kt */
    public static final class a {

        /* compiled from: TransformSelector.kt */
        /* renamed from: xsna.nkp0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3401a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MediaQuality.values().length];
                try {
                    iArr[MediaQuality.HIGH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MediaQuality.MEDIUM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MediaQuality.LOW.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static Uri a(List list) {
            Uri uri;
            List list2;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                o98 o98Var = (o98) it.next();
                if (o98Var instanceof c7s0) {
                    list2 = Collections.singletonList(((c7s0) o98Var).getLayout().b);
                } else {
                    if (!(o98Var instanceof el4)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<AudioFragmentItem> list3 = ((el4) o98Var).b.b;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((AudioFragmentItem) it2.next()).b);
                    }
                    list2 = arrayList2;
                }
                g5g.y(list2, arrayList);
            }
            Iterator it3 = arrayList.iterator();
            Uri uri2 = null;
            while (it3.hasNext()) {
                PlayableItem playableItem = (PlayableItem) it3.next();
                if (playableItem instanceof VideoEncodedItem) {
                    uri = ((VideoEncodedItem) playableItem).b.b;
                } else {
                    if (!(playableItem instanceof AudioItem)) {
                        return null;
                    }
                    uri = ((AudioItem) playableItem).b.b;
                }
                if (uri2 != null && !uri.equals(uri2)) {
                    return null;
                }
                uri2 = uri;
            }
            return uri2;
        }

        public static MediaFormat b(TransformFormat.AudioOutputFormat audioOutputFormat, ArrayList arrayList, b bVar, f100 f100Var) {
            if (arrayList.isEmpty()) {
                return null;
            }
            Iterator it = arrayList.iterator();
            int i = Integer.MIN_VALUE;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                xx4 xx4Var = (xx4) it.next();
                i2 = Math.min(i2, xx4Var.h());
                i = Math.max(i, xx4Var.h());
                i3 = Math.min(i3, xx4Var.c());
                i4 = Math.max(i4, xx4Var.c());
            }
            if (f100Var != null) {
                f100Var.v("TransformSelector", "input audio sources:\n- channel count=" + i2 + '/' + i + "\n- sample rate=" + i3 + '/' + i4 + "\n            ");
            }
            if (i2 <= 0 || i2 != i) {
                i = bVar.c;
            }
            Integer valueOf = audioOutputFormat != null ? Integer.valueOf(audioOutputFormat.b) : null;
            if (valueOf != null) {
                i4 = valueOf.intValue();
            } else if (i3 <= 0 || i3 != i4) {
                i4 = bVar.b;
            }
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setInteger("sample-rate", i4);
            mediaFormat.setInteger("channel-count", i);
            mediaFormat.setInteger("aac-profile", bVar.d);
            return mediaFormat;
        }

        public static int c(ArrayList arrayList, MediaQuality mediaQuality) {
            Iterator it = arrayList.iterator();
            int i = 0;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = 0;
            while (it.hasNext()) {
                Integer e = ((tht0) it.next()).e();
                if (e != null) {
                    i3 = Math.min(e.intValue(), i3);
                    i2 = Math.max(e.intValue(), i2);
                    i++;
                    i4 = e.intValue() + i4;
                }
            }
            int i5 = C3401a.$EnumSwitchMapping$0[mediaQuality.ordinal()];
            kel kelVar = kel.a.b;
            kel kelVar2 = kel.c.b;
            kel kelVar3 = kel.b.b;
            if (i5 == 1) {
                if (i != 0) {
                    return i2;
                }
                int i6 = jel.$EnumSwitchMapping$0[mediaQuality.ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        kelVar = kelVar2;
                    } else {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kelVar = kelVar3;
                    }
                }
                return kelVar.a.c;
            }
            if (i5 == 2) {
                if (i != 0) {
                    return (int) (i4 / i);
                }
                int i7 = jel.$EnumSwitchMapping$0[mediaQuality.ordinal()];
                if (i7 != 1) {
                    if (i7 == 2) {
                        kelVar = kelVar2;
                    } else {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kelVar = kelVar3;
                    }
                }
                return kelVar.a.c;
            }
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (i != 0) {
                return i3;
            }
            int i8 = jel.$EnumSwitchMapping$0[mediaQuality.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    kelVar = kelVar2;
                } else {
                    if (i8 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kelVar = kelVar3;
                }
            }
            return kelVar.a.c;
        }
    }

    /* compiled from: TransformSelector.kt */
    public static final class b {
        public final List<String> a = e43.l("video/avc", "video/hevc");
        public final int b = 44100;
        public final int c = 2;
        public final int d = 2;

        public b(int i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0302 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06dd A[LOOP:5: B:149:0x0573->B:158:0x06dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x06f9 A[EDGE_INSN: B:159:0x06f9->B:160:0x06f9 BREAK  A[LOOP:5: B:149:0x0573->B:158:0x06dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0350 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:312:? A[LOOP:7: B:297:0x031d->B:312:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nkp0(csp cspVar, s98 s98Var, ykm0 ykm0Var, nfq nfqVar, fq10 fq10Var) {
        String str;
        float f;
        boolean z;
        ArrayList X0;
        nfq nfqVar2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        boolean z6;
        Object wjp0Var;
        boolean z7;
        boolean z8;
        String string;
        f100 f100Var;
        ArrayList arrayList;
        String str2;
        String str3;
        TransformFormat.AudioOutputFormat audioOutputFormat;
        bjp ofy0Var;
        f100 f100Var2;
        String str4;
        wjp0 wjp0Var2;
        String str5;
        bjp bjpVar;
        String str6;
        String str7;
        v6e0 bVar;
        v6e0.b bVar2;
        v6e0 v6e0Var;
        Pair pair;
        String str8;
        String str9;
        bjp bjpVar2;
        String str10;
        f100 f100Var3;
        fq10 fq10Var2;
        Pair pair2;
        MediaFormat mediaFormat;
        int width;
        int height;
        MediaCodecInfo mediaCodecInfo;
        Iterator<String> it;
        int a2;
        gr10 gr10Var;
        String str11;
        String str12;
        int i2;
        int intValue;
        boolean z9;
        Integer num;
        int i3;
        f100 f100Var4 = cspVar.d;
        List<c7s0> list = s98Var.a;
        el4 el4Var = s98Var.b;
        this.a = cspVar;
        this.b = ykm0Var;
        this.c = fq10Var;
        TransformFormat transformFormat = (TransformFormat) ykm0Var.b;
        TransformFormat.AudioOutputFormat audioOutputFormat2 = transformFormat.d;
        TransformFormat.VideoOutputFormat videoOutputFormat = transformFormat.c;
        if (videoOutputFormat != null) {
            Integer num2 = videoOutputFormat.d;
            if (videoOutputFormat.b <= 0 || videoOutputFormat.c <= 0 || (num2 != null && num2.intValue() <= 0)) {
                throw new IllegalArgumentException(("Wrong requested video format=" + videoOutputFormat).toString());
            }
        }
        if (audioOutputFormat2 != null && (i3 = audioOutputFormat2.b) != 44100 && i3 != 48000) {
            throw new IllegalArgumentException(("Wrong requested audio format=" + audioOutputFormat2).toString());
        }
        MediaQuality mediaQuality = transformFormat.b;
        String str13 = "TransformSelector";
        if (f100Var4 != null) {
            f100Var4.i("TransformSelector", "requested transform:\nquality=" + mediaQuality + "\nvideo format=" + videoOutputFormat + "\naudio format=" + audioOutputFormat2 + '\n');
        }
        if (f100Var4 != null) {
            f100Var4.i("TransformSelector", s98Var.toString());
        }
        Uri a3 = a.a(s98Var.d);
        ArrayList<xx4> arrayList2 = el4Var.a;
        List<AudioFragmentItem> list2 = el4Var.b.b;
        if (arrayList2.size() <= 1) {
            List<AudioFragmentItem> list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    if (((AudioFragmentItem) it2.next()).c <= 0) {
                        ArrayList X02 = j5g.X0(list2, arrayList2);
                        if (!X02.isEmpty()) {
                            Iterator it3 = X02.iterator();
                            while (it3.hasNext()) {
                                Pair pair3 = (Pair) it3.next();
                                AudioFragmentItem audioFragmentItem = (AudioFragmentItem) pair3.d();
                                xx4 xx4Var = (xx4) pair3.g();
                                AudioItem audioItem = audioFragmentItem.b;
                                f = 1.0f;
                                if (audioItem.f != 1.0f) {
                                    str = str13;
                                    break;
                                }
                                str = str13;
                                if (audioItem.e != 1.0d || audioItem.g != AudioEffect.DEFAULT || (xx4Var instanceof rmj0)) {
                                    break;
                                } else {
                                    str13 = str;
                                }
                            }
                        }
                        str = str13;
                        f = 1.0f;
                        if (!s98Var.c) {
                            if (audioOutputFormat2 != null && !arrayList2.isEmpty()) {
                                Iterator it4 = arrayList2.iterator();
                                while (it4.hasNext()) {
                                    if (((xx4) it4.next()).c() == audioOutputFormat2.b) {
                                    }
                                }
                            }
                            z = false;
                            X0 = j5g.X0(list2, arrayList2);
                            if (!X0.isEmpty()) {
                                Iterator it5 = X0.iterator();
                                while (it5.hasNext()) {
                                    Pair pair4 = (Pair) it5.next();
                                    AudioFragmentItem audioFragmentItem2 = (AudioFragmentItem) pair4.d();
                                    xx4 xx4Var2 = (xx4) pair4.g();
                                    AudioItem audioItem2 = audioFragmentItem2.b;
                                    if (xx4Var2.d(audioItem2.O0(), audioItem2.W0())) {
                                        nfqVar2 = nfqVar;
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                            nfqVar2 = nfqVar;
                            z2 = false;
                            pms0 pms0Var = nfqVar2.b;
                            if (list.size() <= 1) {
                                List<c7s0> list4 = list;
                                boolean z10 = list4 instanceof Collection;
                                if (!z10 || !list4.isEmpty()) {
                                    Iterator<T> it6 = list4.iterator();
                                    while (it6.hasNext()) {
                                        if (a4p.a(((c7s0) it6.next()).getLayout().b)) {
                                        }
                                    }
                                }
                                if (!z10 || !list4.isEmpty()) {
                                    Iterator it7 = list4.iterator();
                                    while (it7.hasNext()) {
                                        c7s0 c7s0Var = (c7s0) it7.next();
                                        VideoItem videoItem = c7s0Var.getLayout().b;
                                        Iterator it8 = it7;
                                        i = 90;
                                        z3 = z;
                                        z4 = z2;
                                        if (c7s0Var.a().d(videoItem.O0(), videoItem.W0())) {
                                            break;
                                        }
                                        it7 = it8;
                                        z = z3;
                                        z2 = z4;
                                    }
                                }
                                z3 = z;
                                z4 = z2;
                                i = 90;
                                if (!(pms0Var != null ? pms0Var.b() : false)) {
                                    if ((videoOutputFormat != null ? videoOutputFormat.e : null) == null) {
                                        if ((videoOutputFormat != null ? videoOutputFormat.f : null) == null) {
                                            ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                                            Iterator<T> it9 = list4.iterator();
                                            while (it9.hasNext()) {
                                                arrayList3.add(((c7s0) it9.next()).a());
                                            }
                                            if (videoOutputFormat != null && !arrayList3.isEmpty()) {
                                                Iterator it10 = arrayList3.iterator();
                                                while (it10.hasNext()) {
                                                    tht0 tht0Var = (tht0) it10.next();
                                                    Pair pair5 = tht0Var.b() % 180 == 0 ? new Pair(Integer.valueOf(tht0Var.getWidth()), Integer.valueOf(tht0Var.getHeight())) : new Pair(Integer.valueOf(tht0Var.getHeight()), Integer.valueOf(tht0Var.getWidth()));
                                                    int intValue2 = ((Number) pair5.d()).intValue();
                                                    int intValue3 = ((Number) pair5.g()).intValue();
                                                    if (intValue2 == videoOutputFormat.b && intValue3 == videoOutputFormat.c && tht0Var.b() % 90 == 0 && ((num = videoOutputFormat.d) == null || num.equals(tht0Var.e()))) {
                                                    }
                                                }
                                            }
                                            z9 = false;
                                            if (!z9) {
                                                z5 = false;
                                                if (a3 != null || z3 || z5 || z4) {
                                                    if (!z3) {
                                                        if (!arrayList2.isEmpty()) {
                                                            for (xx4 xx4Var3 : arrayList2) {
                                                                if (!(xx4Var3 instanceof rmj0)) {
                                                                    MediaFormat format = xx4Var3.getFormat();
                                                                    if ((format == null || (string = format.getString("mime")) == null) ? false : e43.l("audio/mp4a-latm", "audio/mp4a.40.02").contains(string)) {
                                                                        z7 = true;
                                                                        if (z7) {
                                                                            z8 = false;
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                z7 = false;
                                                                if (z7) {
                                                                }
                                                            }
                                                        }
                                                        z8 = true;
                                                        if (z8) {
                                                            z6 = false;
                                                            wjp0Var = new wjp0(z6, z5);
                                                        }
                                                    }
                                                    z6 = true;
                                                    wjp0Var = new wjp0(z6, z5);
                                                } else {
                                                    wjp0Var = new vjp0(a3);
                                                }
                                                f100Var = this.a.d;
                                                if (f100Var != null) {
                                                    f100Var.i(str, "transform config = " + wjp0Var);
                                                }
                                                if (!(wjp0Var instanceof wjp0)) {
                                                    if (!(wjp0Var instanceof vjp0)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    this.e = null;
                                                    this.d = new gtj(((vjp0) wjp0Var).a, (File) this.b.a);
                                                    return;
                                                }
                                                wjp0 wjp0Var3 = (wjp0) wjp0Var;
                                                ykm0 ykm0Var2 = this.b;
                                                TransformFormat transformFormat2 = (TransformFormat) ykm0Var2.b;
                                                fq10 fq10Var3 = this.c;
                                                f100 f100Var5 = fq10Var3.a;
                                                csp cspVar2 = this.a;
                                                TransformFormat.VideoOutputFormat videoOutputFormat2 = transformFormat2.c;
                                                TransformFormat.AudioOutputFormat audioOutputFormat3 = transformFormat2.d;
                                                MediaQuality mediaQuality2 = transformFormat2.b;
                                                List<c7s0> list5 = list;
                                                ArrayList arrayList4 = new ArrayList(c5g.u(list5, 10));
                                                Iterator<T> it11 = list5.iterator();
                                                while (it11.hasNext()) {
                                                    arrayList4.add(((c7s0) it11.next()).a());
                                                }
                                                ArrayList arrayList5 = el4Var.a;
                                                b bVar3 = new b(0);
                                                jpa0 jpa0Var = cspVar2.b;
                                                f100 f100Var6 = cspVar2.d;
                                                if (jpa0Var.a()) {
                                                    str2 = "audio/mp4a-latm";
                                                    arrayList = arrayList5;
                                                    audioOutputFormat = audioOutputFormat3;
                                                    str3 = "mime";
                                                    ofy0Var = new uo10(new uo10.a(cspVar2, arrayList4, new ofy0(EncoderBitrateProvider$Companion$VideoEncoderMotionFactor.LOW, 6)));
                                                } else {
                                                    arrayList = arrayList5;
                                                    str2 = "audio/mp4a-latm";
                                                    str3 = "mime";
                                                    audioOutputFormat = audioOutputFormat3;
                                                    ofy0Var = new ofy0(EncoderBitrateProvider$Companion$VideoEncoderMotionFactor.LOW, 6);
                                                }
                                                if (wjp0Var3.b) {
                                                    wjp0Var2 = wjp0Var3;
                                                    String str14 = "height";
                                                    String str15 = "width";
                                                    if (videoOutputFormat2 != null) {
                                                        Integer num3 = videoOutputFormat2.d;
                                                        if (num3 == null) {
                                                            intValue = a.c(arrayList4, transformFormat2.b);
                                                            if (f100Var6 != null) {
                                                                f100Var6.d(str, "frame rate wasn't requested, because " + videoOutputFormat2 + ", chosen on is: " + intValue);
                                                            }
                                                        } else {
                                                            intValue = num3.intValue();
                                                        }
                                                        mediaFormat = new MediaFormat();
                                                        mediaFormat.setInteger("frame-rate", intValue);
                                                        mediaFormat.setInteger("height", videoOutputFormat2.c);
                                                        mediaFormat.setInteger("width", videoOutputFormat2.b);
                                                        Float f2 = videoOutputFormat2.e;
                                                        if (f2 != null) {
                                                            mediaFormat.setFloat("i-frame-interval", f2.floatValue());
                                                        }
                                                        Integer num4 = videoOutputFormat2.f;
                                                        if (num4 != null) {
                                                            mediaFormat.setInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE, num4.intValue());
                                                        }
                                                        str8 = "i-frame-interval";
                                                        str9 = ", closest format= ";
                                                        bjpVar2 = ofy0Var;
                                                        f100Var3 = f100Var5;
                                                        str10 = BadConnectionSignaling.KEY_BAD_NET_BITRATE;
                                                        fq10Var2 = fq10Var3;
                                                    } else {
                                                        Iterator it12 = arrayList4.iterator();
                                                        str8 = "i-frame-interval";
                                                        str9 = ", closest format= ";
                                                        bjpVar2 = ofy0Var;
                                                        str10 = BadConnectionSignaling.KEY_BAD_NET_BITRATE;
                                                        int i4 = Integer.MAX_VALUE;
                                                        int i5 = Integer.MAX_VALUE;
                                                        int i6 = Integer.MIN_VALUE;
                                                        int i7 = Integer.MIN_VALUE;
                                                        int i8 = 0;
                                                        int i9 = 0;
                                                        while (it12.hasNext()) {
                                                            tht0 tht0Var2 = (tht0) it12.next();
                                                            f100 f100Var7 = f100Var5;
                                                            fq10 fq10Var4 = fq10Var3;
                                                            if (tht0Var2.b() % 180 == i) {
                                                                width = tht0Var2.getHeight();
                                                                height = tht0Var2.getWidth();
                                                            } else {
                                                                width = tht0Var2.getWidth();
                                                                height = tht0Var2.getHeight();
                                                            }
                                                            int i10 = height;
                                                            i4 = Math.min(i10, i4);
                                                            i6 = Math.max(i10, i6);
                                                            i5 = Math.min(width, i5);
                                                            i7 = Math.max(width, i7);
                                                            i9 += i10;
                                                            i8 += width;
                                                            fq10Var3 = fq10Var4;
                                                            f100Var5 = f100Var7;
                                                            i = 90;
                                                        }
                                                        f100Var3 = f100Var5;
                                                        fq10Var2 = fq10Var3;
                                                        int i11 = a.C3401a.$EnumSwitchMapping$0[mediaQuality2.ordinal()];
                                                        if (i11 == 1) {
                                                            pair2 = new Pair(Integer.valueOf(i7), Integer.valueOf(i6));
                                                        } else if (i11 == 2) {
                                                            pair2 = new Pair(Integer.valueOf((int) (i8 / arrayList4.size())), Integer.valueOf((int) (i9 / arrayList4.size())));
                                                        } else {
                                                            if (i11 != 3) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            pair2 = new Pair(Integer.valueOf(i5), Integer.valueOf(i4));
                                                        }
                                                        int intValue4 = ((Number) pair2.d()).intValue();
                                                        int intValue5 = ((Number) pair2.g()).intValue();
                                                        int c = a.c(arrayList4, mediaQuality2);
                                                        if (f100Var6 != null) {
                                                            f100Var6.d(str, "agg. video format: " + intValue4 + 'x' + intValue5 + '@' + c);
                                                        }
                                                        mediaFormat = new MediaFormat();
                                                        mediaFormat.setInteger("frame-rate", c);
                                                        mediaFormat.setInteger("height", intValue5);
                                                        mediaFormat.setInteger("width", intValue4);
                                                    }
                                                    gr10 gr10Var2 = new gr10(mediaFormat);
                                                    Iterator<String> it13 = bVar3.a.iterator();
                                                    Pair pair6 = null;
                                                    while (true) {
                                                        if (!it13.hasNext()) {
                                                            str7 = str3;
                                                            str4 = str10;
                                                            bjpVar = bjpVar2;
                                                            f100Var2 = f100Var3;
                                                            break;
                                                        }
                                                        final String next = it13.next();
                                                        final fq10 fq10Var5 = fq10Var2;
                                                        boolean z11 = fq10Var5.b;
                                                        f100Var2 = f100Var3;
                                                        new gq10(f100Var2);
                                                        List a4 = gq10.a(next, true, z11);
                                                        final int intValue6 = gr10Var2.g.intValue();
                                                        final int intValue7 = gr10Var2.h.intValue();
                                                        final int i12 = intValue6 * intValue7;
                                                        ArrayList b2 = fq10.b(a4, new izs(fq10Var5, next, intValue6, intValue7, i12) { // from class: xsna.eq10
                                                            public final /* synthetic */ String b;
                                                            public final /* synthetic */ int c;
                                                            public final /* synthetic */ int d;
                                                            public final /* synthetic */ int e;

                                                            {
                                                                this.b = next;
                                                                this.c = intValue6;
                                                                this.d = intValue7;
                                                                this.e = i12;
                                                            }

                                                            @Override // xsna.izs
                                                            public final Object invoke(Object obj) {
                                                                int i13;
                                                                Size d = fq10.d((MediaCodecInfo) obj, this.b, this.c, this.d);
                                                                if (d != null) {
                                                                    i13 = Math.abs(this.e - (d.getHeight() * d.getWidth()));
                                                                } else {
                                                                    i13 = Integer.MAX_VALUE;
                                                                }
                                                                return Integer.valueOf(i13);
                                                            }
                                                        });
                                                        b2 = b2.isEmpty() ? null : b2;
                                                        if (b2 == null) {
                                                            gr10Var = gr10Var2;
                                                            str11 = str14;
                                                            it = it13;
                                                            str12 = str15;
                                                            str7 = str3;
                                                            str4 = str10;
                                                            bjpVar = bjpVar2;
                                                        } else {
                                                            Size d = fq10.d((MediaCodecInfo) b2.get(0), next, intValue6, intValue7);
                                                            int intValue8 = gr10Var2.k.intValue();
                                                            Integer num5 = gr10Var2.m;
                                                            if (num5 != null) {
                                                                a2 = num5.intValue();
                                                                it = it13;
                                                                bjpVar = bjpVar2;
                                                            } else {
                                                                it = it13;
                                                                bjpVar = bjpVar2;
                                                                a2 = bjpVar.a(d.getWidth(), d.getHeight(), intValue8);
                                                            }
                                                            ArrayList b3 = fq10.b(b2, new iob(next, a2, 1));
                                                            b3 = b3.isEmpty() ? null : b3;
                                                            if (b3 == null) {
                                                                gr10Var = gr10Var2;
                                                                str11 = str14;
                                                                str12 = str15;
                                                                str7 = str3;
                                                                str4 = str10;
                                                            } else {
                                                                MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) b3.get(0);
                                                                Integer clamp = mediaCodecInfo2.getCapabilitiesForType(next).getVideoCapabilities().getBitrateRange().clamp(Integer.valueOf(a2));
                                                                MediaFormat mediaFormat2 = new MediaFormat();
                                                                str7 = str3;
                                                                mediaFormat2.setString(str7, next);
                                                                int intValue9 = clamp.intValue();
                                                                str4 = str10;
                                                                mediaFormat2.setInteger(str4, intValue9);
                                                                mediaFormat2.setInteger(str15, d.getWidth());
                                                                mediaFormat2.setInteger(str14, d.getHeight());
                                                                mediaFormat2.setInteger("frame-rate", intValue8);
                                                                mediaFormat2.setInteger("color-format", 2130708361);
                                                                Float f3 = gr10Var2.l;
                                                                float floatValue = f3 != null ? f3.floatValue() : f;
                                                                int i13 = Build.VERSION.SDK_INT;
                                                                gr10Var = gr10Var2;
                                                                mediaFormat2.setFloat(str8, floatValue);
                                                                String string2 = mediaFormat2.getString(str7);
                                                                str11 = str14;
                                                                if (brm0.B(string2, "video/avc", false)) {
                                                                    str12 = str15;
                                                                    if (i13 >= 29) {
                                                                        int c2 = fq10.c(mediaCodecInfo2, string2);
                                                                        Integer valueOf = c2 == -1 ? null : Integer.valueOf(c2);
                                                                        if (valueOf != null) {
                                                                            int intValue10 = valueOf.intValue();
                                                                            mediaFormat2.setInteger(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, 8);
                                                                            mediaFormat2.setInteger("level", intValue10);
                                                                        }
                                                                    } else {
                                                                        int c3 = fq10.c(mediaCodecInfo2, string2);
                                                                        Integer valueOf2 = c3 == -1 ? null : Integer.valueOf(c3);
                                                                        if (valueOf2 != null) {
                                                                            int intValue11 = valueOf2.intValue();
                                                                            mediaFormat2.setInteger(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, 8);
                                                                            mediaFormat2.setInteger("level", intValue11);
                                                                            i2 = 1;
                                                                            mediaFormat2.setInteger("latency", 1);
                                                                            mediaFormat2.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, i2);
                                                                            pair6 = new Pair(mediaCodecInfo2, mediaFormat2);
                                                                            if (pair6 != null) {
                                                                                break;
                                                                            }
                                                                            bjpVar2 = bjpVar;
                                                                            str10 = str4;
                                                                            f100Var3 = f100Var2;
                                                                            str3 = str7;
                                                                            fq10Var2 = fq10Var5;
                                                                            gr10Var2 = gr10Var;
                                                                            str14 = str11;
                                                                            str15 = str12;
                                                                            it13 = it;
                                                                        }
                                                                    }
                                                                } else {
                                                                    str12 = str15;
                                                                }
                                                                i2 = 1;
                                                                mediaFormat2.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, i2);
                                                                pair6 = new Pair(mediaCodecInfo2, mediaFormat2);
                                                                if (pair6 != null) {
                                                                }
                                                            }
                                                        }
                                                        pair6 = null;
                                                        if (pair6 != null) {
                                                        }
                                                    }
                                                    if (f100Var2 != null) {
                                                        StringBuilder sb = new StringBuilder("found video encoder=");
                                                        sb.append((pair6 == null || (mediaCodecInfo = (MediaCodecInfo) pair6.i()) == null) ? null : mediaCodecInfo.getName());
                                                        str5 = str9;
                                                        sb.append(str5);
                                                        sb.append(pair6 != null ? (MediaFormat) pair6.j() : null);
                                                        str6 = "MediaCodecEncoderSelectorSmart";
                                                        f100Var2.d(str6, sb.toString());
                                                    } else {
                                                        str6 = "MediaCodecEncoderSelectorSmart";
                                                        str5 = str9;
                                                    }
                                                    if (pair6 == null) {
                                                        throw new TransformException("Failed to determine video output format");
                                                    }
                                                    bVar = new v6e0.a((MediaCodecInfo) pair6.d(), (MediaFormat) pair6.g());
                                                } else {
                                                    f100Var2 = f100Var5;
                                                    str4 = BadConnectionSignaling.KEY_BAD_NET_BITRATE;
                                                    wjp0Var2 = wjp0Var3;
                                                    str5 = ", closest format= ";
                                                    bjpVar = ofy0Var;
                                                    str6 = "MediaCodecEncoderSelectorSmart";
                                                    str7 = str3;
                                                    if (arrayList4.size() != 1) {
                                                        throw new IllegalArgumentException("TransformSelector video remux properties can be created only with single source");
                                                    }
                                                    MediaFormat format2 = ((tht0) j5g.Y(arrayList4)).getFormat();
                                                    if (format2 == null) {
                                                        throw new IllegalArgumentException("TransformSelector video remux properties can't be created without track format");
                                                    }
                                                    bVar = new v6e0.b(format2);
                                                }
                                                if (wjp0Var2.a) {
                                                    MediaFormat b4 = a.b(audioOutputFormat, arrayList, bVar3, f100Var6);
                                                    if (b4 != null) {
                                                        gr10 gr10Var3 = new gr10(b4);
                                                        int intValue12 = gr10Var3.o.intValue();
                                                        int intValue13 = gr10Var3.p.intValue();
                                                        int intValue14 = gr10Var3.n.intValue();
                                                        new gq10(f100Var2);
                                                        String str16 = str2;
                                                        List a5 = gq10.a(str16, true, false);
                                                        int c4 = bjpVar.c(intValue12, intValue13, intValue14);
                                                        ArrayList b5 = fq10.b(a5, new tjb(c4, 2));
                                                        b5 = b5.isEmpty() ? null : b5;
                                                        if (b5 == null) {
                                                            pair = null;
                                                        } else {
                                                            MediaCodecInfo mediaCodecInfo3 = (MediaCodecInfo) b5.get(0);
                                                            Integer clamp2 = mediaCodecInfo3.getCapabilitiesForType(str16).getAudioCapabilities().getBitrateRange().clamp(Integer.valueOf(c4));
                                                            MediaFormat mediaFormat3 = new MediaFormat();
                                                            mediaFormat3.setString(str7, str16);
                                                            mediaFormat3.setInteger(str4, clamp2.intValue());
                                                            mediaFormat3.setInteger("aac-profile", intValue14);
                                                            mediaFormat3.setInteger("sample-rate", intValue12);
                                                            mediaFormat3.setInteger("channel-count", intValue13);
                                                            mediaFormat3.setInteger("max-input-size", 8192);
                                                            if (f100Var2 != null) {
                                                                f100Var2.d(str6, "found audio encoder=" + mediaCodecInfo3.getName() + str5 + mediaFormat3);
                                                            }
                                                            pair = new Pair(mediaCodecInfo3, mediaFormat3);
                                                        }
                                                        if (pair == null) {
                                                            throw new TransformException("Failed to determine audio output format");
                                                        }
                                                    } else {
                                                        pair = null;
                                                    }
                                                    v6e0Var = pair != null ? new v6e0.a((MediaCodecInfo) pair.i(), (MediaFormat) pair.j()) : null;
                                                } else {
                                                    ArrayList arrayList6 = arrayList;
                                                    if (arrayList6.isEmpty()) {
                                                        bVar2 = null;
                                                    } else {
                                                        if (arrayList6.size() != 1) {
                                                            throw new IllegalArgumentException("TransformSelector audio remux properties can be created only with single source");
                                                        }
                                                        MediaFormat format3 = ((xx4) j5g.Y(arrayList6)).getFormat();
                                                        if (format3 == null) {
                                                            throw new IllegalArgumentException("TransformSelector audio remux properties can't be created without track format");
                                                        }
                                                        bVar2 = new v6e0.b(format3);
                                                    }
                                                    v6e0Var = bVar2;
                                                }
                                                if (f100Var6 != null) {
                                                    f100Var6.i(str, "selected transcode properties:\nvideo properties=" + bVar + "\naudio properties=" + v6e0Var + '\n');
                                                }
                                                this.e = new djp0((File) ykm0Var2.a, bVar, v6e0Var);
                                                this.d = null;
                                                return;
                                            }
                                        }
                                    }
                                    z9 = true;
                                    if (!z9) {
                                    }
                                }
                                z5 = true;
                                if (a3 != null) {
                                }
                                if (!z3) {
                                }
                                z6 = true;
                                wjp0Var = new wjp0(z6, z5);
                                f100Var = this.a.d;
                                if (f100Var != null) {
                                }
                                if (!(wjp0Var instanceof wjp0)) {
                                }
                            }
                            z3 = z;
                            z4 = z2;
                            i = 90;
                            z5 = true;
                            if (a3 != null) {
                            }
                            if (!z3) {
                            }
                            z6 = true;
                            wjp0Var = new wjp0(z6, z5);
                            f100Var = this.a.d;
                            if (f100Var != null) {
                            }
                            if (!(wjp0Var instanceof wjp0)) {
                            }
                        }
                        z = true;
                        X0 = j5g.X0(list2, arrayList2);
                        if (!X0.isEmpty()) {
                        }
                        nfqVar2 = nfqVar;
                        z2 = false;
                        pms0 pms0Var2 = nfqVar2.b;
                        if (list.size() <= 1) {
                        }
                        z3 = z;
                        z4 = z2;
                        i = 90;
                        z5 = true;
                        if (a3 != null) {
                        }
                        if (!z3) {
                        }
                        z6 = true;
                        wjp0Var = new wjp0(z6, z5);
                        f100Var = this.a.d;
                        if (f100Var != null) {
                        }
                        if (!(wjp0Var instanceof wjp0)) {
                        }
                    }
                }
            }
        }
        str = "TransformSelector";
        f = 1.0f;
        z = true;
        X0 = j5g.X0(list2, arrayList2);
        if (!X0.isEmpty()) {
        }
        nfqVar2 = nfqVar;
        z2 = false;
        pms0 pms0Var22 = nfqVar2.b;
        if (list.size() <= 1) {
        }
        z3 = z;
        z4 = z2;
        i = 90;
        z5 = true;
        if (a3 != null) {
        }
        if (!z3) {
        }
        z6 = true;
        wjp0Var = new wjp0(z6, z5);
        f100Var = this.a.d;
        if (f100Var != null) {
        }
        if (!(wjp0Var instanceof wjp0)) {
        }
    }
}
