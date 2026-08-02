package xsna;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.likes.dto.LikesItemReactionDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.reactions.ItemReaction;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.geo.impl.model.Coordinate;
import com.vk.log.L;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioAttachment;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.internal.functions.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.webrtc.IceCandidate;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.settings.EncoderSettings;

/* compiled from: NoOpImageCacheStatsTracker.java */
/* loaded from: classes12.dex */
public final class l370 implements igw, gn60, jvf0, da9 {
    public static l370 b;
    public static y6i f;
    public static final jai c = new jai(-645800435, new yhi(0), false);
    public static final l370 d = new l370(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public static final l370 e = new l370(1.0f);
    public static final Object g = new Object();

    public /* synthetic */ l370() {
    }

    public static String A() {
        if (f == null) {
            return null;
        }
        String str = com.android.grafika.a.q;
        if (str != null) {
            return str;
        }
        MediaCodec e2 = com.android.grafika.a.e();
        if (e2 == null) {
            return com.android.grafika.a.q;
        }
        String name = e2.getName();
        e2.release();
        return name + "/surf";
    }

    public static String B(String str, String str2) {
        return y57.a("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
    }

    public static void C(BrowserPerfState browserPerfState, v73 v73Var, com.vk.superapp.browser.ui.a aVar) {
        if (browserPerfState.F()) {
            return;
        }
        boolean z = v73Var.c || !(browserPerfState.m == 0 || browserPerfState.k == 0);
        if (browserPerfState.p || !z) {
            return;
        }
        browserPerfState.p = true;
        browserPerfState.q = null;
        browserPerfState.r = null;
        browserPerfState.n = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
        int i = 0;
        hg1.a(io.reactivex.rxjava3.core.a.r(20L, TimeUnit.SECONDS).h(new pk8(i, browserPerfState, v73Var)).subscribe(new qk8(i, browserPerfState, v73Var), new f40(new tc(4), 3)), aVar);
    }

    public static ItemReactions D(LikesItemReactionsDto likesItemReactionsDto, ReactionSet reactionSet) {
        ReactionMeta d2;
        TreeSet treeSet = new TreeSet(ItemReactions.j);
        int i = 0;
        for (LikesItemReactionDto likesItemReactionDto : likesItemReactionsDto.d()) {
            ItemReaction itemReaction = new ItemReaction(likesItemReactionDto.getId(), likesItemReactionDto.getCount());
            treeSet.add(itemReaction);
            i += itemReaction.c * ((reactionSet == null || (d2 = c2f0.d(reactionSet, itemReaction.b)) == null) ? 1 : d2.f());
        }
        return new ItemReactions(p4g.q(treeSet), likesItemReactionsDto.getCount(), i, likesItemReactionsDto.e());
    }

    public static Object[] E(int i, Object[] objArr) {
        if (objArr.length < i) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public static final float F(float f2) {
        return ((int) (f2 * r0)) / ((float) Math.pow(10.0f, 2));
    }

    public static final void H(igi0 igi0Var, int i, rg9 rg9Var) {
        igi0 igi0Var2;
        ci50 ci50Var = new ci50(new igi0[16]);
        List i2 = igi0Var.i(false, false);
        while (true) {
            ci50Var.c(ci50Var.d, i2);
            while (true) {
                int i3 = ci50Var.d;
                if (i3 == 0) {
                    return;
                }
                igi0Var2 = (igi0) ci50Var.k(i3 - 1);
                boolean o = qxm0.o(igi0Var2);
                xfi0 xfi0Var = igi0Var2.d;
                if (!o) {
                    if (xfi0Var.b.b(ngi0.j)) {
                        continue;
                    } else {
                        androidx.compose.ui.node.o d2 = igi0Var2.d();
                        if (d2 == null) {
                            throw pm0.f("Expected semantics node to have a coordinator.");
                        }
                        l9x I = d370.I(jgz.j(d2, true));
                        if (I.a < I.c && I.b < I.d) {
                            wzs wzsVar = (wzs) zfi0.a(xfi0Var, wfi0.e);
                            qeh0 qeh0Var = (qeh0) zfi0.a(xfi0Var, ngi0.w);
                            if (wzsVar != null && qeh0Var != null && qeh0Var.b.invoke().floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                int i4 = 1 + i;
                                rg9Var.invoke(new zeh0(igi0Var2, i4, I, d2));
                                H(igi0Var2, i4, rg9Var);
                            }
                        }
                    }
                }
            }
            i2 = igi0Var2.i(false, false);
        }
    }

    public static final io.reactivex.rxjava3.internal.operators.observable.b0 J(io.reactivex.rxjava3.core.q qVar, int i) {
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = qVar.a0(io.reactivex.rxjava3.android.schedulers.a.b());
        le50 le50Var = new le50(new wom(i, 1), 0);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return a0.E(le50Var, lVar, kVar, kVar).F(new o3y(new p2u(11), 7));
    }

    public static void K(@NonNull StringBuilder sb, @NonNull HashMap hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(StringUtils.COMMA);
            }
            String str2 = (String) hashMap.get(str);
            jh.f(sb, "\"", str, "\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                jh.f(sb, "\"", str2, "\"");
            }
            z = false;
        }
        sb.append("}");
    }

    public static File L(File file) {
        File file2 = new File(file.getParentFile().getAbsolutePath() + '/' + file.getName() + ".zip");
        if (!file.exists()) {
            throw new IllegalArgumentException("Input file '" + file + "' is not exists");
        }
        if (!file.canRead()) {
            throw new IllegalArgumentException("Input file '" + file + "' is not readable");
        }
        if (file2.exists() && !file2.isFile()) {
            throw new IllegalArgumentException("Output file '" + file2 + "' is not a file");
        }
        if (file2.exists() && !nbr.l(file2)) {
            throw new IllegalArgumentException("Unable to delete output file before zip");
        }
        byte[] bArr = new byte[1024];
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file2));
        try {
            if (file.isFile()) {
                N(file, bArr, "", zipOutputStream);
            }
            if (file.isDirectory()) {
                M(file, bArr, "", zipOutputStream);
            }
            s3q0 s3q0Var = s3q0.a;
            zipOutputStream.close();
            return file2;
        } finally {
        }
    }

    public static void M(File file, byte[] bArr, String str, ZipOutputStream zipOutputStream) {
        String sb;
        if (str.length() > 0 && !brm0.v(str, DomExceptionUtils.SEPARATOR, false)) {
            throw new IllegalArgumentException(air.b('\'', "zipRelativePath must by empty or ends with '/'. zipRelativePath = '", str));
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IllegalStateException("listFiles() return null for dir: '" + file + '\'');
        }
        for (File file2 : listFiles) {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (file2.isDirectory()) {
                boolean z = str.length() == 0;
                if (z) {
                    sb = file2.getName() + '/';
                } else {
                    if (z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    StringBuilder e2 = fw3.e(str);
                    e2.append(file2.getName());
                    e2.append('/');
                    sb = e2.toString();
                }
                M(file2, bArr, sb, zipOutputStream);
            }
            if (file2.isFile()) {
                N(file2, bArr, str, zipOutputStream);
            }
        }
    }

    public static void N(File file, byte[] bArr, String str, ZipOutputStream zipOutputStream) {
        if (str.length() > 0 && !brm0.v(str, DomExceptionUtils.SEPARATOR, false)) {
            throw new IllegalArgumentException(air.b('\'', "zipRelativePath must by empty or ends with '/'. zipRelativePath = '", str));
        }
        FileInputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
        try {
            zipOutputStream.putNextEntry(new ZipEntry(str + file.getName()));
            int read = fileInputStream.read(bArr);
            while (read >= 0) {
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
                zipOutputStream.write(bArr, 0, read);
                read = fileInputStream.read(bArr);
            }
            zipOutputStream.closeEntry();
            s3q0 s3q0Var = s3q0.a;
            fileInputStream.close();
        } finally {
        }
    }

    public static final ngj0 j() {
        return new ngj0();
    }

    public static final float k(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final void m(g47 g47Var, vfe vfeVar) {
        g47Var.a(rsr.i(new cxm0(vfeVar, null)));
    }

    public static final void n(g47 g47Var, vfe vfeVar, izs izsVar) {
        g47Var.a(rsr.i(new cxm0(f9t.F(vfeVar, izsVar), null)));
    }

    public static final void o(g47 g47Var, gzs gzsVar, vfe vfeVar, izs izsVar) {
        g47Var.b(new h1m(rsr.i(new cxm0(f9t.F(vfeVar, izsVar), null)), new xe4(3, gzsVar)));
    }

    public static final double p(float f2, float f3, float f4, float f5) {
        double sin = Math.sin((f2 - f4) * 0.5d);
        double sin2 = Math.sin((f3 - f5) * 0.5d);
        return Math.asin(Math.sqrt((sin2 * sin2 * ((float) Math.cos(r0)) * ((float) Math.cos(r8))) + (sin * sin))) * 2.0d * 6371009.0d;
    }

    public static final double q(long j, long j2) {
        return p(sdi.x(Coordinate.e(j)), sdi.x(Coordinate.f(j)), sdi.x(Coordinate.e(j2)), sdi.x(Coordinate.f(j2)));
    }

    public static final long r(float f2, float f3, float f4, float f5) {
        double d2 = f4 / 6371009.0d;
        float x = sdi.x(f5);
        float x2 = sdi.x(f2);
        float x3 = sdi.x(f3);
        double cos = Math.cos(d2);
        double sin = Math.sin(d2);
        double d3 = x2;
        float sin2 = (float) Math.sin(d3);
        float cos2 = (float) Math.cos(d3);
        double d4 = sin2;
        double d5 = sin * cos2;
        double d6 = x;
        double cos3 = (((float) Math.cos(d6)) * d5) + (cos * d4);
        double atan2 = Math.atan2(d5 * ((float) Math.sin(d6)), cos - (d4 * cos3));
        float w = sdi.w((float) Math.asin(cos3));
        float w2 = sdi.w((float) (x3 + atan2));
        Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
        return gqr.a(w, w2);
    }

    public static final long s(long j, float f2, float f3) {
        return r(Coordinate.e(j), Coordinate.f(j), f2, f3);
    }

    public static wt60 t() {
        ul50 ul50Var = new ul50();
        return new wt60(ul50Var, ul50Var);
    }

    public static com.android.grafika.a u(Context context, String str, LoggerInterface loggerInterface) throws IOException {
        if (f == null) {
            synchronized (g) {
                try {
                    if (f == null) {
                        f = new y6i(new EncoderSettings(str));
                    }
                } finally {
                }
            }
        }
        y6i y6iVar = f;
        y6iVar.getClass();
        return new com.android.grafika.a(context, (EncoderSettings) y6iVar.b, loggerInterface);
    }

    public static String w(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String y(String str, String str2) {
        return B(str, str2).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide");
    }

    public static synchronized l370 z() {
        l370 l370Var;
        synchronized (l370.class) {
            try {
                if (b == null) {
                    b = new l370();
                }
                l370Var = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l370Var;
    }

    public List G(int i, Pair pair, wm60 wm60Var) {
        AudioAttachment audioAttachment = (AudioAttachment) pair.d();
        boolean booleanValue = ((Boolean) pair.g()).booleanValue();
        MusicTrack musicTrack = audioAttachment.f;
        String str = musicTrack.h;
        if (str == null) {
            str = ob50.a(musicTrack);
        }
        String str2 = musicTrack.d;
        if (str.length() > 0 && str2 != null && str2.length() != 0) {
            str = y8g0.f(R.string.on_media_audio_name_template, str2, str);
        } else if (str.length() <= 0) {
            str = (str2 == null || str2.length() == 0) ? "" : str2;
        }
        boolean B = musicTrack.B();
        return Collections.singletonList(new y880(musicTrack, str != null ? str : "", musicTrack.Jb(), B, musicTrack.Lb(), booleanValue, musicTrack.Y != null, i, audioAttachment.h, audioAttachment.i));
    }

    public void I(gzs gzsVar) {
        L.D("OverlayMenu", gzsVar);
    }

    public void v(Throwable th) {
        L.g("OverlayMenu", th);
    }

    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return G(0, pair, bp5Var);
    }

    public l370(float f2) {
    }

    @Override // xsna.da9
    public void b() {
    }

    @Override // xsna.da9
    public void c() {
    }

    @Override // xsna.da9
    public void d() {
    }

    @Override // xsna.da9
    public void f() {
    }

    @Override // xsna.igw
    public void a(ww8 ww8Var) {
    }

    @Override // xsna.igw
    public void e(ww8 ww8Var) {
    }

    @Override // xsna.igw
    public void g(ww8 ww8Var) {
    }

    @Override // xsna.igw
    public void h(ww8 ww8Var) {
    }

    @Override // xsna.igw
    public void i(ww8 ww8Var) {
    }

    @Override // xsna.jvf0
    public IceCandidate l(IceCandidate iceCandidate) {
        return iceCandidate;
    }
}
