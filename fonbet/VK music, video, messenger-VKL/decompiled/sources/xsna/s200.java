package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.util.TypedValue;
import android.view.Window;
import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.internal.measurement.zzpp;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.stories.model.ideas.StoryIdeaPayload;
import com.vk.dto.stories.model.ideas.StoryIdeaType;
import com.vk.music.screens.about.CommunityProfileLinksFragment;
import com.vkontakte.android.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LogoutButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class s200 implements j8s, q701 {
    public static final jai c;
    public static final jai d;
    public static Long n;
    public static Long o;
    public static Long p;
    public static boolean q;
    public static boolean r;
    public static boolean s;
    public static final jai b = new jai(2120693997, new jbi(1), false);
    public static final s200 e = new s200();
    public static final int[] f = {128128, 128570, 128068, 10084, 128081, 127913, 128142, 128060, 128056, 128031, 127800, 127794, 127823, 127824, 127820, 127812, 127757, 127968, 128690, 9200, 11088, 9730, 128293, 127880, 9917, 128276, 128161, 9999, 9986, 128064, 128083, 128663};
    public static final String[] g = {"gorod        ", "slovo\t\t  ", "volk\t\t  ", "luna\t\t  ", "oblako\t\t  ", "samolet\t  ", "okno\t\t  ", "kakao\t\t  ", "tort\t\t  ", "stena\t\t  ", "foto\t\t  ", "video\t\t  ", "voda\t\t  ", "lemon\t\t  ", "nebo\t\t  ", "izba\t\t  ", "dom\t\t  ", "blog\t\t  ", "reka\t\t  ", "mem\t\t  ", "petuh\t\t  ", "trava\t\t  ", "testo\t\t  ", "nota\t\t  ", "kino\t\t  ", "leto\t\t  ", "divan\t\t  ", "slon\t\t  ", "flag\t\t  ", "karma\t\t  ", "metro\t\t  ", "most\t\t  ", "tost\t\t  ", "fon\t\t  ", "ozero\t\t  ", "idol\t\t  ", "teplo\t\t  ", "obed\t\t  ", "banan\t\t  ", "status\t\t  ", "zvon\t\t  ", "bank\t\t  ", "mir\t\t  ", "dno\t\t  ", "soda\t\t  ", "sila\t\t  ", "salo\t\t  ", "ruka\t\t  ", "plot\t\t  ", "orda\t\t  ", "moda\t\t  ", "lava\t\t  ", "zona\t\t  ", "zima\t\t  ", "grom\t\t  ", "znak\t\t  ", "oval\t\t  ", "more\t\t  ", "sport\t\t  ", "repka\t\t  ", "olovo\t\t  ", "motor\t\t  ", "moroz\t\t  ", "mesto\t\t  ", "kubok\t\t  ", "divan\t\t  ", "drama\t\t  ", "golod\t\t  ", "vesna\t\t  ", "beton\t\t  ", "proba\t\t  ", "komod\t\t  ", "volna\t\t  ", "robot\t\t  ", "omlet\t\t  ", "groza\t\t  ", "stroka\t\t  ", "sobaka\t\t  ", "planka\t\t  ", "lopata\t\t  ", "korova\t\t  ", "kalina\t\t  ", "zvezda\t\t  ", "golova\t\t  ", "bereza\t\t  ", "steklo\t\t  ", "smenka\t\t  ", "doroga\t\t  ", "raduga\t\t  ", "marker\t\t  ", "moneta\t\t  ", "knopka\t\t  ", "sputnik\t  ", "podarok\t  ", "povorot\t  ", "planeta\t  ", "kapusta\t  ", "korobok\t  ", "bokal\t\t  ", "zont\t\t  ", "kabina\t\t  ", "lavka\t\t  ", "laguna\t\t  ", "lampa\t\t  ", "avoska\t\t  "};
    public static final Object h = new Object();
    public static final Object i = new Object();
    public static final Object j = new Object();
    public static final Object k = new Object();
    public static final Object l = new Object();
    public static final /* synthetic */ s200 m = new s200();

    static {
        byte b2 = 0;
        c = new jai(-1662249240, new xpd(b2, 2), false);
        d = new jai(240392109, new e69(b2, 3), false);
    }

    public static boolean A(long j2, long j3, long j4, boolean z) {
        if (j3 <= 0) {
            pv8 T = o25.a().T();
            Long l2 = p;
            if (l2 != null) {
                j3 = l2.longValue();
            } else {
                j3 = T != null ? T.c : o25.a().X();
                p = Long.valueOf(j3);
            }
        }
        if (j4 <= 0) {
            pv8 T2 = o25.a().T();
            Long l3 = o;
            if (l3 != null) {
                j4 = l3.longValue();
            } else {
                j4 = T2 != null ? T2.b : o25.a().z();
                o = Long.valueOf(j4);
            }
        }
        if (j3 <= 0 || j4 <= 0) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (j2 > currentTimeMillis) {
            return false;
        }
        return z ? currentTimeMillis - j2 < j4 : currentTimeMillis - j2 < j3;
    }

    public static final boolean B(zhf0 zhf0Var) {
        return !zhf0Var.g() && zhf0Var.c - zhf0Var.a > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && zhf0Var.d - zhf0Var.b > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static final q630 C(q630 q630Var, s890 s890Var) {
        return q630Var.g(new t890(s890Var, new qi00(s890Var, 17)));
    }

    public static final q630 D(q630 q630Var, float f2) {
        return q630Var.g(new j890(f2, f2, f2, f2, new oqu(20)));
    }

    public static final q630 E(q630 q630Var, final float f2, final float f3) {
        return q630Var.g(new j890(f2, f3, f2, f3, new izs() { // from class: xsna.n890
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                z5x z5xVar = (z5x) obj;
                z5xVar.getClass();
                sjr0 sjr0Var = z5xVar.a;
                sjr0Var.c("horizontal", new pco(f2));
                sjr0Var.c("vertical", new pco(f3));
                return s3q0.a;
            }
        }));
    }

    public static q630 F(float f2, float f3, int i2, q630 q630Var) {
        if ((i2 & 1) != 0) {
            f2 = 0;
        }
        if ((i2 & 2) != 0) {
            f3 = 0;
        }
        return E(q630Var, f2, f3);
    }

    public static final q630 G(q630 q630Var, final float f2, final float f3, final float f4, final float f5) {
        return q630Var.g(new j890(f2, f3, f4, f5, new izs() { // from class: xsna.m890
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                z5x z5xVar = (z5x) obj;
                z5xVar.getClass();
                sjr0 sjr0Var = z5xVar.a;
                sjr0Var.c("start", new pco(f2));
                sjr0Var.c("top", new pco(f3));
                sjr0Var.c(TtmlNode.END, new pco(f4));
                sjr0Var.c("bottom", new pco(f5));
                return s3q0.a;
            }
        }));
    }

    public static q630 H(q630 q630Var, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0;
        }
        if ((i2 & 2) != 0) {
            f3 = 0;
        }
        if ((i2 & 4) != 0) {
            f4 = 0;
        }
        if ((i2 & 8) != 0) {
            f5 = 0;
        }
        return G(q630Var, f2, f3, f4, f5);
    }

    public static final void I(int i2, float[] fArr, float[] fArr2, float[] fArr3) {
        if (i2 == 0) {
            uzw.a("At least one point must be provided");
        }
        int i3 = 2 >= i2 ? i2 - 1 : 2;
        int i4 = i3 + 1;
        float[][] fArr4 = new float[i4][];
        for (int i5 = 0; i5 < i4; i5++) {
            fArr4[i5] = new float[i2];
        }
        for (int i6 = 0; i6 < i2; i6++) {
            fArr4[0][i6] = 1.0f;
            for (int i7 = 1; i7 < i4; i7++) {
                fArr4[i7][i6] = fArr4[i7 - 1][i6] * fArr[i6];
            }
        }
        float[][] fArr5 = new float[i4][];
        for (int i8 = 0; i8 < i4; i8++) {
            fArr5[i8] = new float[i2];
        }
        float[][] fArr6 = new float[i4][];
        for (int i9 = 0; i9 < i4; i9++) {
            fArr6[i9] = new float[i4];
        }
        int i10 = 0;
        while (i10 < i4) {
            float[] fArr7 = fArr5[i10];
            System.arraycopy(fArr4[i10], 0, fArr7, 0, i2);
            for (int i11 = 0; i11 < i10; i11++) {
                float[] fArr8 = fArr5[i11];
                float u = u(fArr7, fArr8);
                for (int i12 = 0; i12 < i2; i12++) {
                    fArr7[i12] = fArr7[i12] - (fArr8[i12] * u);
                }
            }
            float sqrt = (float) Math.sqrt(u(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f2 = 1.0f / sqrt;
            for (int i13 = 0; i13 < i2; i13++) {
                fArr7[i13] = fArr7[i13] * f2;
            }
            float[] fArr9 = fArr6[i10];
            int i14 = 0;
            while (i14 < i4) {
                fArr9[i14] = i14 < i10 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : u(fArr7, fArr4[i14]);
                i14++;
            }
            i10++;
        }
        for (int i15 = i3; -1 < i15; i15--) {
            float u2 = u(fArr5[i15], fArr2);
            float[] fArr10 = fArr6[i15];
            int i16 = i15 + 1;
            if (i16 <= i3) {
                int i17 = i3;
                while (true) {
                    u2 -= fArr10[i17] * fArr3[i17];
                    if (i17 != i16) {
                        i17--;
                    }
                }
            }
            fArr3[i15] = u2 / fArr10[i15];
        }
    }

    public static void J(Throwable th) {
        K(th);
        throw new RuntimeException(th);
    }

    public static void K(Throwable th) {
        if (Error.class.isInstance(th)) {
            throw ((Throwable) Error.class.cast(th));
        }
        if (RuntimeException.class.isInstance(th)) {
            throw ((Throwable) RuntimeException.class.cast(th));
        }
    }

    public static int L(InputStream inputStream, byte[] bArr, int i2) throws IOException {
        inputStream.getClass();
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read == -1) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    public static final nzw M(FragmentImpl fragmentImpl, String str, gzs gzsVar) {
        return new nzw(str, fragmentImpl, gzsVar);
    }

    public static final u1h0 N(CommunityProfileLinksFragment communityProfileLinksFragment, String str, CommunityProfileLinksFragment communityProfileLinksFragment2, t9e t9eVar) {
        return new u1h0(str, communityProfileLinksFragment, communityProfileLinksFragment2, t9eVar);
    }

    public static final long O(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) * Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final u890 l(float f2, float f3) {
        return new u890(f2, f3, f2, f3);
    }

    public static u890 m(float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0;
        }
        if ((i2 & 2) != 0) {
            f3 = 0;
        }
        return new u890(f2, f3, f2, f3);
    }

    public static u890 n(float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0;
        }
        if ((i2 & 2) != 0) {
            f3 = 0;
        }
        if ((i2 & 4) != 0) {
            f4 = 0;
        }
        if ((i2 & 8) != 0) {
            f5 = 0;
        }
        return new u890(f2, f3, f4, f5);
    }

    public static final int o(int i2, int i3, int i4) {
        int i5 = i2 - (i2 % 16);
        int i6 = i5 / i3;
        if (i6 == 9) {
            return i5;
        }
        int i7 = i3 * 9;
        int i8 = i7 % 16;
        if (i8 == 0) {
            return i7;
        }
        int i9 = i7 - i8;
        int i10 = 9 - i6;
        int i11 = i4 - i9;
        return (i10 <= 0 || i11 <= 0) ? i9 : (Math.min(i10, i11 / 16) * 16) + i9;
    }

    public static final Context p(Context context) {
        TypedValue typedValue = krv0.a;
        Integer d2 = krv0.d();
        return d2 != null ? new l7s(context, d2.intValue()) : context;
    }

    public static final void q(com.vk.comments.impl.a aVar, xlb0 xlb0Var, long j2) {
        androidx.compose.ui.input.pointer.util.a aVar2 = (androidx.compose.ui.input.pointer.util.a) aVar.b;
        aVar2.getClass();
        VelocityTracker1D velocityTracker1D = aVar2.b;
        VelocityTracker1D velocityTracker1D2 = aVar2.a;
        boolean m2 = fdi.m(xlb0Var);
        long j3 = xlb0Var.b;
        if (m2) {
            jw5.p(null, velocityTracker1D2.d);
            velocityTracker1D2.e = 0;
            jw5.p(null, velocityTracker1D.d);
            velocityTracker1D.e = 0;
            aVar2.c = 0L;
        }
        if (!fdi.o(xlb0Var)) {
            List<w7v> b2 = xlb0Var.b();
            int i2 = 0;
            for (int size = b2.size(); i2 < size; size = size) {
                w7v w7vVar = b2.get(i2);
                aVar2.a(w7vVar.a, ov70.f(w7vVar.e, j2));
                i2++;
            }
            aVar2.a(j3, ov70.f(xlb0Var.n, j2));
        }
        if (fdi.o(xlb0Var) && j3 - aVar2.c > 40) {
            jw5.p(null, velocityTracker1D2.d);
            velocityTracker1D2.e = 0;
            jw5.p(null, velocityTracker1D.d);
            velocityTracker1D.e = 0;
            aVar2.c = 0L;
        }
        aVar2.c = j3;
    }

    public static final float r(s890 s890Var, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? s890Var.a(layoutDirection) : s890Var.c(layoutDirection);
    }

    public static final float s(s890 s890Var, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? s890Var.c(layoutDirection) : s890Var.a(layoutDirection);
    }

    public static final String t(String str) {
        return zr.a("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", str, "')");
    }

    public static final float u(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i2 = 0; i2 < length; i2++) {
            f2 += fArr[i2] * fArr2[i2];
        }
        return f2;
    }

    public static final ww50 v(Context context) {
        ComponentCallbacks2 h2 = e3m.h(context);
        ey50 ey50Var = h2 instanceof ey50 ? (ey50) h2 : null;
        if (ey50Var != null) {
            return ey50Var.Y();
        }
        return null;
    }

    public static long w() {
        pv8 T = o25.a().T();
        Long l2 = n;
        if (l2 != null) {
            return l2.longValue();
        }
        long F = T != null ? T.d : o25.a().F();
        n = Long.valueOf(F);
        return F;
    }

    public static final StoryIdeaType x(StoryIdeaPayload storyIdeaPayload) {
        if (storyIdeaPayload instanceof StoryIdeaPayload.Birthday) {
            return StoryIdeaType.BIRTHDAY;
        }
        if (storyIdeaPayload instanceof StoryIdeaPayload.Music) {
            return StoryIdeaType.MUSIC;
        }
        if (storyIdeaPayload instanceof StoryIdeaPayload.Gallery) {
            return StoryIdeaType.GALLERY;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Window y(Context context) {
        Dialog dialog;
        Window window;
        Window window2 = null;
        if (!(context instanceof ey50)) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow();
            }
            return null;
        }
        ww50<?> Y = ((ey50) context).Y();
        Object z = Y.z();
        Dialog dialog2 = z instanceof Dialog ? (Dialog) z : null;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            return window;
        }
        androidx.fragment.app.d dVar = z instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) z : null;
        if (dVar != null && (dialog = dVar.s) != null) {
            window2 = dialog.getWindow();
        }
        return window2 == null ? Y.b.getWindow() : window2;
    }

    public static mqv z(lg90 lg90Var, long j2, androidx.compose.runtime.a aVar) {
        lg90 lg90Var2;
        long j3;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2046635686, 24584, -1, "com.vk.core.compose.component.snackbar.SnackbarContent.Left.Icon.Companion.invoke (SnackbarContent.kt:104)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(377341471, 70, -1, "com.vk.core.compose.component.snackbar.remember (IconImpl.kt:88)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            lg90Var2 = lg90Var;
            j3 = j2;
            mqv mqvVar = new mqv(lg90Var2, j3, 9205357640488583168L, 0);
            aVar.R(mqvVar);
            x = mqvVar;
        } else {
            lg90Var2 = lg90Var;
            j3 = j2;
        }
        mqv mqvVar2 = (mqv) x;
        ((zak0) mqvVar2.a).setValue(lg90Var2);
        mqvVar2.b(j3);
        ((zak0) mqvVar2.d).setValue(new uco(9205357640488583168L));
        ((zak0) mqvVar2.e).setValue(null);
        ((zak0) mqvVar2.f).setValue(null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return mqvVar2;
    }

    @Override // xsna.j8s
    public int a(Context context) {
        return hbh0.b(22, context);
    }

    @Override // xsna.j8s
    public int b() {
        return R.attr.vk_ui_text_tertiary;
    }

    @Override // xsna.j8s
    public int c(Context context) {
        return hbh0.b(0, context);
    }

    @Override // xsna.j8s
    public int d() {
        return R.attr.vk_ui_text_positive;
    }

    @Override // xsna.j8s
    public int e(Context context) {
        return hbh0.b(44, context);
    }

    @Override // xsna.j8s
    public int f(Context context) {
        return hbh0.b(12, context);
    }

    @Override // xsna.j8s
    public int g(Context context) {
        return hbh0.b(0, context);
    }

    @Override // xsna.j8s
    public int h(Context context) {
        return hbh0.b(28, context);
    }

    @Override // xsna.j8s
    public int i(Context context) {
        return hbh0.b(2, context);
    }

    @Override // xsna.j8s
    public int j(Context context) {
        return hbh0.b(16, context);
    }

    @Override // xsna.j8s
    public int k() {
        return R.attr.vk_ui_text_subhead;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzpp.zzc());
    }
}
