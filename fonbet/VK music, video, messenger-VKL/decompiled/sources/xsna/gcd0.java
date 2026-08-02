package xsna;

import android.app.UiModeManager;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.measurement.zznq;
import com.vk.api.generated.audio.dto.AudioPlaylistPermissionsDto;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.PlaylistPermissions;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.math.BigDecimal;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.TimeoutCancellationException;
import one.video.stat2.DeviceType;

/* compiled from: SlotTable.kt */
@vby
/* loaded from: classes11.dex */
public final class gcd0 implements lfi0, cvf, wq5, q701, io.reactivex.rxjava3.functions.l {
    public static final gcd0 c = new gcd0(5);
    public static final gcd0 d = new gcd0(6);
    public static final gcd0 e = new gcd0(8);
    public static final /* synthetic */ gcd0 f = new gcd0(9);
    public static Integer g;
    public final /* synthetic */ int b;

    public /* synthetic */ gcd0(int i) {
        this.b = i;
    }

    public static final zhf0 A(zhf0 zhf0Var, tny tnyVar, tny tnyVar2) {
        if (!tnyVar.e() || !tnyVar2.e()) {
            return zhf0.e;
        }
        return p490.e(tnyVar2.w(jgz.p(tnyVar), zhf0Var.e()), zhf0Var.d());
    }

    public static int B(int i, CharSequence charSequence) {
        long charAt = charSequence.charAt(i) | (charSequence.charAt(i + 1) << 16) | (charSequence.charAt(i + 2) << 32) | (charSequence.charAt(i + 3) << 48);
        long charAt2 = (charSequence.charAt(i + 7) << 48) | charSequence.charAt(i + 4) | (charSequence.charAt(i + 5) << 16) | (charSequence.charAt(i + 6) << 32);
        long j = charAt - 13511005043687472L;
        long j2 = charAt2 - 13511005043687472L;
        if ((((charAt2 + 19703549022044230L) | j2 | (charAt + 19703549022044230L) | j) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return (((int) ((j * 281475406208040961L) >>> 48)) * 10000) + ((int) ((j2 * 281475406208040961L) >>> 48));
    }

    public static long C(long j) {
        long j2 = j - 13511005043687472L;
        long j3 = (j - (-9207186978729525190L)) & (-9223231297218904064L);
        if (j3 != ((j - (-9196209287131529119L)) & (-9223231297218904064L) & ((9223231297218904063L ^ j2) + 15481359945891895L))) {
            return -1L;
        }
        long j4 = (j3 >>> 15) * 65535;
        long j5 = ((~j4) & j2) | (j2 - (j4 & 10977691597996071L));
        long j6 = j5 | (j5 >>> 12);
        return (j6 | (j6 >>> 24)) & 65535;
    }

    public static int D(int i, int i2, CharSequence charSequence) {
        int i3 = 0;
        boolean z = true;
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            z &= l(charAt);
            i3 = ((i3 * 10) + charAt) - 48;
            i++;
        }
        if (z) {
            return i3;
        }
        return -1;
    }

    public static final void b(ng50 ng50Var, int i) {
        if (ng50Var.b == 0 || !(ng50Var.a(0) == i || ng50Var.a(ng50Var.b - 1) == i)) {
            int i2 = ng50Var.b;
            ng50Var.c(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int a = ng50Var.a(i3);
                if (i <= a) {
                    break;
                }
                ng50Var.g(i2, a);
                i2 = i3;
            }
            ng50Var.g(i2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r9v5, types: [xsna.xlb0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(dmb0 dmb0Var, xlb0 xlb0Var, ContinuationImpl continuationImpl) {
        mgo mgoVar;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        if (continuationImpl instanceof mgo) {
            mgoVar = (mgo) continuationImpl;
            int i2 = mgoVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mgoVar.label = i2 - Integer.MIN_VALUE;
                Object obj = mgoVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mgoVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    ref$ObjectRef3.element = xlb0Var;
                    long c2 = dmb0Var.getViewConfiguration().c();
                    try {
                        ngo ngoVar = new ngo(dmb0Var, ref$ObjectRef3, ref$ObjectRef2, null);
                        mgoVar.L$0 = null;
                        mgoVar.L$1 = xlb0Var;
                        mgoVar.L$2 = ref$ObjectRef2;
                        mgoVar.L$3 = null;
                        mgoVar.J$0 = c2;
                        mgoVar.label = 1;
                        if (oxo0.b(c2, ngoVar, mgoVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return null;
                    } catch (TimeoutCancellationException unused) {
                        ref$ObjectRef = ref$ObjectRef2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) mgoVar.L$2;
                    xlb0Var = (xlb0) mgoVar.L$1;
                    try {
                        kotlin.a.a(obj);
                        return null;
                    } catch (TimeoutCancellationException unused2) {
                    }
                }
                xlb0 xlb0Var2 = (xlb0) ref$ObjectRef.element;
                return xlb0Var2 != null ? xlb0Var : xlb0Var2;
            }
        }
        mgoVar = new mgo(continuationImpl);
        Object obj2 = mgoVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mgoVar.label;
        if (i != 0) {
        }
        xlb0 xlb0Var22 = (xlb0) ref$ObjectRef.element;
        if (xlb0Var22 != null) {
        }
    }

    public static void d(View view, int i, float f2) {
        boolean z = (i & 2) != 0;
        view.setClipToOutline(true);
        view.setOutlineProvider(new m0u0(f2, z));
    }

    public static final String g(String str) {
        if (!epx.f(str, "0")) {
            return str;
        }
        com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Invalid startFrom = 0"));
        return null;
    }

    public static long h(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1630911716, 6, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:201)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
        }
        iyk0 iyk0Var = l9g.a;
        k9g k9gVar = (k9g) aVar.r(iyk0Var);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long c2 = l5g.c(14, k9gVar.a(), 0.8f);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
        }
        k9g k9gVar2 = (k9g) aVar.r(iyk0Var);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long i = f870.i(c2, k9gVar2.c());
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return i;
    }

    public static DeviceType i(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return DeviceType.TV;
        }
        UiModeManager uiModeManager2 = (UiModeManager) context.getSystemService(UiModeManager.class);
        if (uiModeManager2 != null && uiModeManager2.getCurrentModeType() == 3) {
            return DeviceType.CAR;
        }
        if (rl3.E(context.getResources().getConfiguration().screenLayout & 15, new int[]{3, 4})) {
            return DeviceType.TABLET;
        }
        return rl3.E(context.getResources().getConfiguration().screenLayout & 15, new int[]{1, 2}) ? DeviceType.PHONE : DeviceType.UNKNOWN;
    }

    public static io.reactivex.rxjava3.core.x j(ryd rydVar, Context context, ClipsEditorMusicInfo clipsEditorMusicInfo) {
        ClipsEditorMusicTrack clipsEditorMusicTrack = clipsEditorMusicInfo.b;
        return rsg0.w0(new dae(clipsEditorMusicTrack.c, clipsEditorMusicTrack.b, clipsEditorMusicTrack.h)).l(new rf1(new gr3(clipsEditorMusicInfo, 14), 12)).l(new q7(new ht(9), 10));
    }

    public static MediaCodecInfo k() {
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo.isEncoder()) {
                arrayList.add(mediaCodecInfo);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) it.next();
            String[] supportedTypes = mediaCodecInfo2.getSupportedTypes();
            int i = 0;
            while (true) {
                if (i < supportedTypes.length) {
                    int i2 = i + 1;
                    try {
                        if (brm0.w(supportedTypes[i], "video/hevc", true)) {
                            return mediaCodecInfo2;
                        }
                        i = i2;
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        throw new NoSuchElementException(e2.getMessage());
                    }
                }
            }
        }
        return null;
    }

    public static boolean l(char c2) {
        return ((char) (c2 + 65488)) < '\n';
    }

    public static boolean m(@NonNull EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean n(Context context) {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    public static final q630 o(q630 q630Var, rcy rcyVar, luy luyVar, Orientation orientation, boolean z, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1070136913, i, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:48)");
        }
        q630 g2 = q630Var.g(new ouy(rcyVar, luyVar, orientation, z));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return g2;
    }

    public static PlaylistPermissions p(AudioPlaylistPermissionsDto audioPlaylistPermissionsDto) {
        Boolean i = audioPlaylistPermissionsDto.i();
        boolean booleanValue = i != null ? i.booleanValue() : false;
        Boolean f2 = audioPlaylistPermissionsDto.f();
        boolean booleanValue2 = f2 != null ? f2.booleanValue() : false;
        Boolean g2 = audioPlaylistPermissionsDto.g();
        boolean booleanValue3 = g2 != null ? g2.booleanValue() : false;
        Boolean k = audioPlaylistPermissionsDto.k();
        boolean booleanValue4 = k != null ? k.booleanValue() : false;
        Boolean d2 = audioPlaylistPermissionsDto.d();
        boolean booleanValue5 = d2 != null ? d2.booleanValue() : false;
        Boolean e2 = audioPlaylistPermissionsDto.e();
        boolean booleanValue6 = e2 != null ? e2.booleanValue() : false;
        Boolean j = audioPlaylistPermissionsDto.j();
        return new PlaylistPermissions(booleanValue, booleanValue2, booleanValue3, booleanValue4, booleanValue5, booleanValue6, j != null ? j.booleanValue() : false);
    }

    public static final i4g0 q(k4g0 k4g0Var, boolean z, sdz sdzVar, e210 e210Var) {
        UserId userId;
        int i = k4g0Var.a;
        int i2 = k4g0Var.b;
        big0 big0Var = k4g0Var.c;
        if (big0Var == null || (userId = big0Var.a) == null) {
            userId = UserId.d;
        }
        return new i4g0(i, i2, userId, big0Var != null ? big0Var.b : null, big0Var != null ? big0Var.g : null, k4g0Var.e, sdzVar.m(k4g0Var.f), k4g0Var.l, a020.r(k4g0Var.d), k4g0Var.k, k4g0Var.j, e210Var, z);
    }

    @ozl
    public static final void s(Context context, UserId userId, int i, Integer num) {
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append('_');
        sb.append(i);
        io.reactivex.rxjava3.internal.operators.observable.c0 c0Var = new io.reactivex.rxjava3.internal.operators.observable.c0(hg1.m(rsg0.y0(new i730(sb.toString()), null, null, 3), context, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new qqb(1));
        mp3 mp3Var = new mp3(23, context, num);
        int i2 = 17;
        c0Var.subscribe(new hms(mp3Var, i2), new o330(new oqu(i2), 5));
    }

    public static /* synthetic */ void t(Context context, UserId userId, int i, Integer num, int i2) {
        if ((i2 & 16) != 0) {
            num = null;
        }
        s(context, userId, i, num);
    }

    public static BigDecimal u(char[] cArr, int i, int i2) {
        int i3;
        BigDecimal z;
        int i4 = i;
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i8 = 0;
        boolean z4 = false;
        for (int i9 = 0; i9 < i4; i9++) {
            char c2 = cArr[i9];
            if (c2 != '+') {
                if (c2 == 'E' || c2 == 'e') {
                    if (i5 >= 0) {
                        throw new NumberFormatException("Multiple exponent markers");
                    }
                    i5 = i9;
                } else if (c2 != '-') {
                    if (c2 == '.') {
                        if (i6 >= 0) {
                            throw new NumberFormatException("Multiple decimal points");
                        }
                        i6 = i9;
                    } else if (i6 >= 0 && i5 == -1) {
                        i7++;
                    }
                } else if (i5 >= 0) {
                    if (z3) {
                        throw new NumberFormatException("Multiple signs in exponent");
                    }
                    z3 = true;
                } else {
                    if (z2) {
                        throw new NumberFormatException("Multiple signs in number");
                    }
                    i8 = i9 + 1;
                    z2 = true;
                    z4 = true;
                }
            } else if (i5 >= 0) {
                if (z3) {
                    throw new NumberFormatException("Multiple signs in exponent");
                }
                z3 = true;
            } else {
                if (z2) {
                    throw new NumberFormatException("Multiple signs in number");
                }
                i8 = i9 + 1;
                z2 = true;
            }
        }
        if (i5 >= 0) {
            i3 = Integer.parseInt(new String(cArr, i5 + 1, (i4 - i5) - 1));
            long j = i3;
            long j2 = i7 - j;
            if (j2 > 2147483647L || j2 < -2147483648L) {
                throw new NumberFormatException(xy6.a(j, " to exponent ", eq0.a(i7, "Scale out of range: ", " while adjusting scale ", j2)));
            }
            i7 = (int) j2;
            i4 = i5;
        } else {
            i3 = 0;
        }
        if (i6 >= 0) {
            int i10 = (i4 - i6) - 1;
            z = z(cArr, i8, i6 - i8, i3, i2).add(z(cArr, i6 + 1, i10, i3 - i10, i2));
        } else {
            z = z(cArr, i8, i4 - i8, i3, i2);
        }
        if (i7 != 0) {
            z = z.setScale(i7);
        }
        return z4 ? z.negate() : z;
    }

    public static final d2h0 v(String str, izs izsVar, androidx.compose.runtime.a aVar) {
        aVar.K(1750654524);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1750654524, 0, -1, "com.vk.mvi.saver.compose.rememberRetainedSavable (Retained.android.kt:23)");
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            x = new qb8(10);
            aVar.R(x);
        }
        d2h0 d2h0Var = (d2h0) qeg0.a(str, (gzs) x, aVar, 48);
        if (d2h0Var != null) {
            if (oq.h(-39700794, aVar)) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return d2h0Var;
        }
        aVar.K(-38638393);
        Object[] objArr = {str};
        com.vk.movika.sdk.base.data.converter.c cVar = new com.vk.movika.sdk.base.data.converter.c(izsVar);
        boolean J = aVar.J(izsVar);
        Object x2 = aVar.x();
        if (J || x2 == c0012a) {
            x2 = new o87(izsVar, 11);
            aVar.R(x2);
        }
        d2h0 d2h0Var2 = (d2h0) crx0.D(objArr, cVar, (gzs) x2, aVar, 0);
        boolean y = aVar.y(d2h0Var2);
        Object x3 = aVar.x();
        if (y || x3 == c0012a) {
            x3 = new wm80(d2h0Var2, 13);
            aVar.R(x3);
        }
        d2h0 d2h0Var3 = (d2h0) qeg0.a(str, (gzs) x3, aVar, 0);
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return d2h0Var3;
    }

    public static final int w(ng50 ng50Var) {
        int a;
        int i = ng50Var.b;
        int a2 = ng50Var.a(0);
        while (ng50Var.b != 0 && ng50Var.a(0) == a2) {
            ng50Var.g(0, ng50Var.b());
            ng50Var.f(ng50Var.b - 1);
            int i2 = ng50Var.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int a3 = ng50Var.a(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int a4 = ng50Var.a(i6);
                if (i5 >= i2 || (a = ng50Var.a(i5)) <= a4) {
                    if (a4 > a3) {
                        ng50Var.g(i4, a4);
                        ng50Var.g(i6, a3);
                        i4 = i6;
                    }
                } else if (a > a3) {
                    ng50Var.g(i4, a);
                    ng50Var.g(i5, a3);
                    i4 = i5;
                }
            }
        }
        return a2;
    }

    public static final q630 x(q630 q630Var, pwi pwiVar, izs izsVar, aho0 aho0Var, izs izsVar2) {
        return q630Var.g(new ldo0(pwiVar, izsVar, aho0Var, izsVar2));
    }

    public static long y() {
        return SystemClock.elapsedRealtime();
    }

    public static BigDecimal z(char[] cArr, int i, int i2, int i3, int i4) {
        if (i2 <= i4) {
            return i2 == 0 ? BigDecimal.ZERO : new BigDecimal(cArr, i, i2).scaleByPowerOfTen(i3);
        }
        int i5 = i2 / 2;
        return z(cArr, i, i5, (i3 + i2) - i5, i4).add(z(cArr, i + i5, i2 - i5, i3, i4));
    }

    @Override // xsna.wq5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(String str, final yzs yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        Object obj;
        androidx.compose.runtime.a M = aVar.M(-108116273);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(yzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = this;
            i2 |= M.J(obj) ? 256 : 128;
        } else {
            obj = this;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-108116273, i2, -1, "com.vk.profile.design.compose.user.FluidBlockContent.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (VkProfileFriendsAndFollowersInfo.kt:143)");
            }
            fwu0.c(null, null, str, null, null, null, null, kai.c(-1030346210, new a0t() { // from class: xsna.vdv0
                @Override // xsna.a0t
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    lg90 lg90Var = (lg90) obj4;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj5;
                    int intValue = ((Integer) obj6).intValue();
                    if ((intValue & 384) == 0) {
                        intValue |= (intValue & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 1153) != 1152)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1030346210, intValue, -1, "com.vk.profile.design.compose.user.FluidBlockContent.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content.<anonymous> (VkProfileFriendsAndFollowersInfo.kt:144)");
                        }
                        if (as.a(((intValue >> 6) & 14) | 8, yzs.this, lg90Var, aVar2)) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 << 6) & 896) | 100663296, 251);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yrj0(i, 2, obj, str, yzsVar);
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        List asList = Arrays.asList((Object[]) obj);
        ArrayList arrayList = new ArrayList(c5g.u(asList, 10));
        for (Object obj2 : asList) {
            if (obj2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
            arrayList.add(obj2);
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"Got new custom counters " + arrayList});
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            spm spmVar = (spm) ((Optional) it.next()).orElse(null);
            if (spmVar != null) {
                arrayList2.add(spmVar);
            }
        }
        int e2 = on00.e(c5g.u(arrayList2, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(Integer.valueOf(((spm) next).a), next);
        }
        return linkedHashMap;
    }

    @Override // xsna.lfi0
    public s470 f(snt sntVar, final List list) {
        final lif0 d2 = sntVar.d();
        return (s470) j5g.r0(new Comparator() { // from class: xsna.x6i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                luu luuVar = (luu) obj;
                luu luuVar2 = (luu) obj2;
                lif0 lif0Var = lif0.this;
                List list2 = list;
                int compare = Double.compare(ahn.z(lif0Var, list2, luuVar), ahn.z(lif0Var, list2, luuVar2));
                return (compare == 0 && (compare = Float.compare(ahn.j(lif0Var, luuVar), ahn.j(lif0Var, luuVar2))) == 0) ? Float.compare(ahn.i(lif0Var, luuVar), ahn.i(lif0Var, luuVar2)) : compare;
            }
        }, list);
    }

    public long r(boolean z) {
        if (!z) {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
        return TimeUnit.SECONDS.toNanos(Clock.systemUTC().instant().getEpochSecond()) + r5.getNano();
    }

    public String toString() {
        switch (this.b) {
            case 6:
                return "SystemClock{}";
            default:
                return super.toString();
        }
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Integer.valueOf((int) zznq.zzb());
    }
}
