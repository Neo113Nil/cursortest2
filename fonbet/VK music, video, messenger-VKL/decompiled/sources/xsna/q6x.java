package xsna;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.foundation.gestures.Orientation;
import com.google.android.gms.internal.measurement.zznn;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraft;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftOrdDataInfo;
import com.vk.dto.clips.ClipItemFilterType;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.clips.VideoTransform;
import com.vk.dto.clips.filters.CorrectionsInfo;
import com.vk.dto.clips.filters.FilterInfo;
import com.vk.dto.clips.filters.HslInfo;
import com.vk.dto.clips.gallery.TranscodingState;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.media.AudioConfigEditor;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.clips.model.ClipsEditorVideoVolumeItem;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.friends.discover.UserDiscoverItem;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistOwner;
import com.vk.dto.music.Thumb;
import com.vk.feed.core.models.attachment.AudioPlaylistAttachmentPayload;
import com.vk.feed.core.models.attachment.EntryAttachmentPayload;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.webrtc.IceCandidate;
import xsna.mbv;
import xsna.njg0;
import xsna.vav;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class q6x implements znj, q701, toc, io.reactivex.rxjava3.functions.c, gn60, jvf0, kvu {
    public static Context b;

    @Nullable
    public static Boolean c;
    public static f4j j;
    public static volatile qtq m;
    public static volatile ptq n;
    public static final double[][] d = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[] e = {95.047d, 100.0d, 108.883d};
    public static final jai f = new jai(-913592052, new gqg(0, 2), false);
    public static final jai g = new jai(452243279, new dki(), false);
    public static final q6x h = new q6x();
    public static final q6x i = new q6x();
    public static final Object k = new Object();
    public static final /* synthetic */ q6x l = new q6x();

    public static final int A(int i2, int i3, float f2) {
        return i2 + ((int) Math.round((i3 - i2) * f2));
    }

    public static double B(int i2) {
        double d2 = i2 / 255.0d;
        return (d2 <= 0.040449936d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static final fh9 C(izs izsVar, wzs wzsVar) {
        oac oacVar = new oac(wzsVar, 8);
        ttp0.d(1, izsVar);
        return new fh9(oacVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ClipsDraft D(otd otdVar) {
        ArrayList arrayList;
        int i2;
        AudioConfigEditor audioConfigEditor;
        long j2;
        FilterInfo filterInfo;
        long j3;
        ClipsVideoItemLocation clipsVideoItemLocation;
        ptd ptdVar = otdVar.a;
        String str = ptdVar.a;
        int i3 = ptdVar.b;
        List<cud> list = ptdVar.c;
        ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cud cudVar = (cud) it.next();
            ctd ctdVar = cudVar.d;
            MaskLight maskLight = ctdVar != null ? new MaskLight(ctdVar.a, ctdVar.b, ctdVar.c, ctdVar.d) : null;
            rsd rsdVar = cudVar.h;
            ClipItemFilterType clipItemFilterType = (ClipItemFilterType) ClipItemFilterType.h().get(rsdVar.a.ordinal());
            float f2 = rsdVar.b;
            ssd ssdVar = rsdVar.c;
            Iterator it2 = it;
            CorrectionsInfo correctionsInfo = new CorrectionsInfo(ssdVar.a, ssdVar.b, ssdVar.c, ssdVar.d, ssdVar.e, ssdVar.f, ssdVar.g, ssdVar.h, ssdVar.i, ssdVar.j);
            tsd tsdVar = rsdVar.d;
            FilterInfo filterInfo2 = new FilterInfo(clipItemFilterType, f2, correctionsInfo, new HslInfo(t2f.a(tsdVar.a), t2f.a(tsdVar.b), t2f.a(tsdVar.c), t2f.a(tsdVar.d), t2f.a(tsdVar.e), t2f.a(tsdVar.f), t2f.a(tsdVar.g), t2f.a(tsdVar.h)));
            dud dudVar = cudVar.k;
            VideoTransform videoTransform = dudVar != null ? new VideoTransform(dudVar.a, dudVar.b, dudVar.c, dudVar.d, dudVar.e, dudVar.f) : null;
            File file = cudVar.a;
            File file2 = cudVar.f;
            dtd dtdVar = cudVar.e;
            ClipsEditorMusicInfo m2 = dtdVar != null ? i35.m(dtdVar) : null;
            float f3 = cudVar.j;
            long j4 = cudVar.b;
            long j5 = cudVar.c;
            TranscodingState transcodingState = (TranscodingState) TranscodingState.h().get(cudVar.g.ordinal());
            boolean z = cudVar.i;
            boolean z2 = cudVar.l;
            String str2 = str;
            AudioEffectType audioEffectType = (AudioEffectType) AudioEffectType.h().get(cudVar.m.ordinal());
            urd urdVar = cudVar.n;
            if (urdVar != null) {
                i2 = i3;
                audioConfigEditor = new AudioConfigEditor(urdVar.a, urdVar.b);
            } else {
                i2 = i3;
                audioConfigEditor = null;
            }
            btd btdVar = cudVar.o;
            if (btdVar != null) {
                j2 = j4;
                filterInfo = filterInfo2;
                j3 = j5;
                clipsVideoItemLocation = new ClipsVideoItemLocation(btdVar.a, btdVar.b);
            } else {
                j2 = j4;
                filterInfo = filterInfo2;
                j3 = j5;
                clipsVideoItemLocation = null;
            }
            eud eudVar = cudVar.p;
            arrayList2.add(new ClipsEditorInputVideoItem(file, j2, j3, maskLight, m2, file2, transcodingState, filterInfo, z, f3, videoTransform, z2, audioEffectType, audioConfigEditor, null, clipsVideoItemLocation, new ClipsEditorVideoVolumeItem(eudVar.a, eudVar.b), 16384, null));
            it = it2;
            str = str2;
            i3 = i2;
        }
        String str3 = str;
        int i4 = i3;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        String str4 = ptdVar.d;
        long j6 = ptdVar.e;
        boolean z3 = ptdVar.f;
        int i5 = ptdVar.g;
        String str5 = ptdVar.i;
        List<List<vrd>> list2 = ptdVar.k;
        if (list2 != null) {
            List<List<vrd>> list3 = list2;
            int i6 = 10;
            ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                List<vrd> list4 = (List) it3.next();
                ArrayList arrayList5 = new ArrayList(c5g.u(list4, i6));
                for (vrd vrdVar : list4) {
                    arrayList5.add(new ClipsDraftMusicInfo(i35.m(vrdVar.a), vrdVar.b, (AudioEffectType) AudioEffectType.h().get(vrdVar.c.ordinal()), vrdVar.d));
                    arrayList3 = arrayList3;
                    it3 = it3;
                    str4 = str4;
                }
                arrayList4.add(arrayList5);
                i6 = 10;
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        ArrayList arrayList6 = arrayList3;
        String str6 = str4;
        float f4 = ptdVar.l;
        gtd gtdVar = ptdVar.m;
        return new ClipsDraft(new ClipsDraftCommonData(str3, i4, arrayList6, str6, j6, z3, i5, ptdVar.h, str5, ptdVar.j, arrayList, f4, gtdVar != null ? new ClipsDraftOrdDataInfo(gtdVar.a, gtdVar.b, gtdVar.c) : null, ptdVar.n), otdVar.b);
    }

    public static void F(w2w w2wVar, long j2, MsgFromUser msgFromUser) {
        if (msgFromUser == null) {
            w2wVar.I0().b().e().w(j2, null, false);
        } else {
            w2wVar.I0().b().e().x(new PinnedMsg(msgFromUser).Bb(new vfm(1, w2wVar)), j2);
        }
    }

    public static double G(double d2) {
        double d3 = (d2 + 16.0d) / 116.0d;
        double d4 = d3 * d3 * d3;
        if (d4 <= 0.008856451679035631d) {
            d4 = ((d3 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        return d4 * 100.0d;
    }

    public static aa2 n(int i2, int i3, int i4) {
        ColorSpace colorSpace;
        ColorSpace rgb;
        ColorSpace colorSpace2;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        njg0 njg0Var = h8g.e;
        ba2.b(i4);
        int i5 = Build.VERSION.SDK_INT;
        Bitmap.Config b2 = ba2.b(i4);
        if (epx.f(njg0Var, njg0Var)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (epx.f(njg0Var, h8g.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (epx.f(njg0Var, h8g.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (epx.f(njg0Var, h8g.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (epx.f(njg0Var, h8g.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (epx.f(njg0Var, h8g.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (epx.f(njg0Var, h8g.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (epx.f(njg0Var, h8g.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (epx.f(njg0Var, h8g.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (epx.f(njg0Var, h8g.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (epx.f(njg0Var, h8g.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (epx.f(njg0Var, h8g.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (epx.f(njg0Var, h8g.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (epx.f(njg0Var, h8g.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (epx.f(njg0Var, h8g.p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (epx.f(njg0Var, h8g.n)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            if (i5 >= 34) {
                if (epx.f(njg0Var, h8g.v)) {
                    named2 = ColorSpace.Named.BT2020_HLG;
                    colorSpace2 = ColorSpace.get(named2);
                } else if (epx.f(njg0Var, h8g.w)) {
                    named = ColorSpace.Named.BT2020_PQ;
                    colorSpace2 = ColorSpace.get(named);
                } else {
                    colorSpace2 = null;
                }
                if (colorSpace2 != null) {
                    rgb = colorSpace2;
                    return new aa2(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, b2, true, rgb));
                }
            }
            if (njg0Var != null) {
                float[] a = njg0Var.d.a();
                pjp0 pjp0Var = njg0Var.g;
                ColorSpace.Rgb.TransferParameters transferParameters = pjp0Var != null ? new ColorSpace.Rgb.TransferParameters(pjp0Var.b, pjp0Var.c, pjp0Var.d, pjp0Var.e, pjp0Var.f, pjp0Var.g, pjp0Var.a) : null;
                float[] fArr = njg0Var.i;
                if (transferParameters != null) {
                    ColorSpace.Rgb rgb2 = new ColorSpace.Rgb(njg0Var.a, njg0Var.h, a, transferParameters);
                    if (!Float.isNaN(fArr[0]) && !Arrays.equals(rgb2.getTransform(), fArr)) {
                        rgb2 = new ColorSpace.Rgb(njg0Var.a, fArr, transferParameters);
                    }
                    rgb = rgb2;
                } else {
                    String str = njg0Var.a;
                    float[] fArr2 = njg0Var.h;
                    final njg0.c cVar = njg0Var.l;
                    DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: xsna.f8g
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d2) {
                            return ((Number) izs.this.invoke(Double.valueOf(d2))).doubleValue();
                        }
                    };
                    final njg0.b bVar = njg0Var.o;
                    rgb = new ColorSpace.Rgb(str, fArr2, a, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: xsna.g8g
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d2) {
                            return ((Number) izs.this.invoke(Double.valueOf(d2))).doubleValue();
                        }
                    }, njg0Var.e, njg0Var.f);
                }
                return new aa2(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, b2, true, rgb));
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        rgb = colorSpace;
        return new aa2(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, b2, true, rgb));
    }

    public static int o(double d2) {
        double d3 = d2 / 100.0d;
        int round = (int) Math.round((d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (round < 0) {
            return 0;
        }
        if (round > 255) {
            return 255;
        }
        return round;
    }

    public static Object p(Context context, Uri uri, izs izsVar) {
        try {
            String K = com.vk.core.files.a.K(uri);
            if (K == null) {
                Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
                try {
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                    query.moveToFirst();
                    K = query.getString(columnIndexOrThrow);
                    s3q0 s3q0Var = s3q0.a;
                    query.close();
                } finally {
                }
            }
            if (K == null) {
                return null;
            }
            return izsVar.invoke(new ExifInterface(K));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Pair q(int i2) {
        return i2 > 9 ? new Pair(Integer.valueOf(i2 / 10), Integer.valueOf(i2 % 10)) : i2 > 0 ? new Pair(0, Integer.valueOf(i2)) : new Pair(0, 0);
    }

    public static final float r(float f2) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f2) & 8589934591L) / 3)) + 709952852);
        float f3 = intBitsToFloat - ((intBitsToFloat - (f2 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static tmv s() {
        return m;
    }

    public static final String t(UserDiscoverItem userDiscoverItem, Integer num) {
        String a = cqm0.a(userDiscoverItem.g);
        if (a != null) {
            String a2 = js5.a(num != null ? num.intValue() : 480, a);
            if (a2 != null) {
                return a2;
            }
        }
        String str = userDiscoverItem.z0;
        String a3 = str != null ? cqm0.a(str) : null;
        if (a3 == null) {
            String str2 = userDiscoverItem.y0;
            a3 = str2 != null ? cqm0.a(str2) : null;
            if (a3 == null) {
                String str3 = userDiscoverItem.x0;
                a3 = str3 != null ? cqm0.a(str3) : null;
                if (a3 == null) {
                    String str4 = userDiscoverItem.w0;
                    if (str4 != null) {
                        return cqm0.a(str4);
                    }
                    return null;
                }
            }
        }
        return a3;
    }

    public static boolean u(Context context) {
        boolean z;
        ActivityManager.MemoryInfo memoryInfo;
        boolean a = b4k.e.a();
        try {
            memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        } catch (Throwable th) {
            L.g("Failed to get device total memory", th);
        }
        if (memoryInfo.totalMem > 3000000000L) {
            z = true;
            return !a && z && gz80.a(24);
        }
        z = false;
        if (a) {
        }
    }

    public static synchronized boolean v(@NonNull Context context) {
        Boolean bool;
        synchronized (q6x.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = b;
            if (context2 != null && (bool = c) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            c = null;
            Boolean valueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            c = valueOf;
            b = applicationContext;
            return valueOf.booleanValue();
        }
    }

    public static boolean w(w2w w2wVar, long j2, Msg msg) {
        return w2wVar.I0().b().e().X(msg.d, j2);
    }

    public static final q630 y(tsy tsyVar, qsy qsyVar, Orientation orientation) {
        return new rsy(tsyVar, qsyVar, orientation);
    }

    public static final float z(float f2, float f3, float f4) {
        return (f4 * f3) + ((1 - f4) * f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Integer] */
    public List E(int i2, Pair pair, wm60 wm60Var) {
        w780 w780Var;
        boolean z;
        AudioPlaylistAttachment audioPlaylistAttachment = (AudioPlaylistAttachment) pair.d();
        boolean booleanValue = ((Boolean) pair.g()).booleanValue();
        db60 db60Var = wm60Var instanceof db60 ? (db60) wm60Var : null;
        Playlist playlist = audioPlaylistAttachment.f;
        if (playlist.Gb()) {
            EntryAttachmentPayload entryAttachmentPayload = db60Var != null ? db60Var.a : null;
            String str = playlist.h;
            AudioPlaylistAttachmentPayload audioPlaylistAttachmentPayload = entryAttachmentPayload instanceof AudioPlaylistAttachmentPayload ? (AudioPlaylistAttachmentPayload) entryAttachmentPayload : null;
            String str2 = audioPlaylistAttachmentPayload != null ? audioPlaylistAttachmentPayload.c : null;
            String str3 = audioPlaylistAttachmentPayload != null ? audioPlaylistAttachmentPayload.b : null;
            PlaylistOwner playlistOwner = playlist.q;
            String str4 = playlistOwner != null ? playlistOwner.c : null;
            String obj = (str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) ? (str4 == null || str4.length() == 0) ? "" : drm0.p0(y8g0.f(R.string.from_author_template, str4, "")).toString() : y8g0.f(R.string.from_author_template, str3, str2);
            if (str == null || str.length() == 0) {
                str = "";
            }
            w780Var = new w780(str, obj.length() > 0 ? y8g0.f(R.string.on_media_full_playlist_subtitle_template, obj) : y8g0.f(R.string.on_media_full_playlist_subtitle_template, ""));
        } else {
            String str5 = playlist.h;
            String str6 = playlist.o;
            int i3 = playlist.l;
            String valueOf = String.valueOf(i3 != 0 ? Integer.valueOf(i3) : null);
            if (str5 != null && str5.length() != 0 && str6 != null && str6.length() != 0) {
                str5 = y8g0.f(R.string.on_media_audio_name_template, str6, str5);
            } else if (str5 == null || str5.length() == 0) {
                str5 = (str6 == null || str6.length() == 0) ? "" : str6;
            }
            w780Var = new w780(str5, valueOf.length() > 0 ? y8g0.f(R.string.on_media_full_album_title_template, valueOf) : y8g0.f(R.string.on_media_full_album_title_template, ""));
        }
        if (!playlist.Fb()) {
            List<MusicTrack> list = playlist.y;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((MusicTrack) it.next()).B()) {
                        if (playlist.v != 0) {
                            z = false;
                        }
                    }
                }
            }
        }
        z = true;
        boolean z2 = z;
        boolean z3 = playlist.k;
        Thumb thumb = (Thumb) j5g.a0(playlist.Cb());
        w780 w780Var2 = w780Var;
        String str7 = w780Var2.a;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = w780Var2.b;
        return Collections.singletonList(new t880(playlist, str7, str8 == null ? "" : str8, thumb, z2, z3, booleanValue, false, audioPlaylistAttachment.g, audioPlaylistAttachment.h));
    }

    @Override // xsna.kvu
    public p0m0 a(String str) {
        return new tqj0();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        szt0 szt0Var = (szt0) obj2;
        vav vavVar = (vav) obj;
        if (!szt0Var.b) {
            return mbv.a.a;
        }
        if (vavVar.equals(vav.b.a)) {
            return mbv.a.a;
        }
        if (!(vavVar instanceof vav.c)) {
            if (vavVar instanceof vav.f) {
                vav.f fVar = (vav.f) vavVar;
                return new mbv.e(fVar.b, fVar.a);
            }
            if (vavVar instanceof vav.e) {
                vav.e eVar = (vav.e) vavVar;
                return new mbv.d(eVar.a, eVar.b, eVar.c, eVar.f, eVar.d, eVar.e);
            }
            if (vavVar instanceof vav.d) {
                return new mbv.c(((vav.d) vavVar).a);
            }
            throw new NoWhenBranchMatchedException();
        }
        vav.c cVar = (vav.c) vavVar;
        boolean z = cVar.b;
        if (!z) {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            return mbv.a.a;
        }
        return new mbv.b(new mbv.b.C3335b(cVar.e, cVar.f, cVar.g, cVar.j), szt0Var.a, new mbv.b.a(cVar.a, cVar.h, cVar.i));
    }

    @Override // xsna.kvu
    public Class f() {
        return tqj0.class;
    }

    @Override // xsna.znj
    public void g(znj znjVar, androidx.compose.runtime.a aVar, int i2) {
        znj znjVar2;
        androidx.compose.runtime.a M = aVar.M(-1494954024);
        int i3 = (M.J(znjVar) ? 4 : 2) | i2 | (M.J(this) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1494954024, i3, -1, "com.vk.design.demo.presentation.screens.legacyMenuScopeContent.<anonymous>.<no name provided>.Content (ContextMenuScreenContent.kt:1156)");
            }
            znjVar2 = znjVar;
            aou0.b(znjVar2, "Title", null, null, M, (i3 & 14) | 48, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            znjVar2 = znjVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q3h(this, znjVar2, i2);
        }
    }

    @Override // xsna.jvf0
    public IceCandidate l(IceCandidate iceCandidate) {
        return new IceCandidate("fake remote sdpMid", Integer.MIN_VALUE, "fake remote sdp");
    }

    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return E(0, pair, bp5Var);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Long.valueOf(zznn.zzo());
    }

    @Override // xsna.toc
    public void b(izs izsVar) {
    }

    @Override // xsna.toc
    public void c(izs izsVar) {
    }

    @Override // xsna.toc
    public void d(izs izsVar) {
    }

    @Override // xsna.toc
    public void e(izs izsVar) {
    }

    @Override // xsna.toc
    public void h(izs izsVar) {
    }

    @Override // xsna.toc
    public void i(izs izsVar) {
    }

    @Override // xsna.toc
    public void j(wmf wmfVar) {
    }

    @Override // xsna.toc
    public void k(h3d h3dVar) {
    }

    @Override // xsna.toc
    public void m(izs izsVar) {
    }
}
