package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.ListView;
import androidx.compose.runtime.a;
import androidx.compose.ui.state.ToggleableState;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.internal.api.GsonHolder;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.opencv.core.Mat;

/* compiled from: ListViewCompat.java */
@Deprecated
/* loaded from: classes12.dex */
public final class jgz implements zjr0, r7n0 {
    public static final jgz c = new jgz(2);
    public static final jai d = new jai(-869223072, new vai(0), false);
    public static final jai e = new jai(-5780142, new odi(0), false);
    public static final jai f = new jai(-1085743497, new yh3(4), false);
    public static final jai g = new jai(895137426, new x9d(1), false);
    public static final jgz h = new jgz(5);
    public static final ykg0 i = new ykg0(0.16f, 0.1f, 0.08f, 0.1f);
    public final /* synthetic */ int b;

    public /* synthetic */ jgz(int i2) {
        this.b = i2;
    }

    public static void a(ArrayList arrayList, Mat mat) {
        int v = mat.v();
        if (wpk.b != mat.y() || mat.d() != 1) {
            throw new IllegalArgumentException("CvType.CV_32SC2 != m.type() ||  m.cols()!=1\n" + mat);
        }
        arrayList.clear();
        mat.m(new int[v * 2]);
        for (int i2 = 0; i2 < v; i2++) {
            int i3 = i2 * 2;
            arrayList.add(new Mat((r1[i3] << 32) | (r1[i3 + 1] & 4294967295L)));
        }
    }

    public static final long c(int i2, int i3) {
        if (i2 < 0 || i3 < 0) {
            vzw.a("start and end cannot be negative. [start: " + i2 + ", end: " + i3 + ']');
        }
        long j = (i3 & 4294967295L) | (i2 << 32);
        int i4 = qko0.c;
        return j;
    }

    public static final ToggleableState d(boolean z) {
        return z ? ToggleableState.On : ToggleableState.Off;
    }

    public static final sht0 e(m7q m7qVar) {
        sht0 sht0Var = m7qVar.e;
        String str = m7qVar.a;
        r7s0 r7s0Var = m7qVar.x;
        if (m7qVar.p && m7qVar.C) {
            String v = fxc0.B().s().v(str);
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_OFFLINE_IGNORE_UPSTREAM_DATA_SOURCE;
            videoFeatures.getClass();
            return new mv70(v, null, com.vk.toggle.b.A.a(videoFeatures) ? fxc0.B().s().j() : false);
        }
        if (!m7qVar.A) {
            return r7s0Var != null ? new ay8(str, r7s0Var, sht0Var) : sht0Var;
        }
        StringBuilder e2 = fw3.e(str);
        e2.append(m7qVar.j);
        return new dbn(e2.toString(), sht0Var);
    }

    public static q630 f(q630 q630Var, int i2) {
        return q630Var.g(new xf10(i2, i2, wf10.a, wf10.b));
    }

    public static xy2 h(jgz jgzVar, List list, int i2) {
        ArrayList arrayList;
        Integer num = (i2 & 1) != 0 ? null : 100;
        if ((i2 & 4) != 0) {
            list = null;
        }
        jgzVar.getClass();
        tfx tfxVar = new tfx("bestFriends.get", new io.reactivex.rxjava3.processors.b(7), new io.reactivex.rxjava3.subjects.b(8));
        if (num != null) {
            tfxVar.f(num.intValue(), 0, 100, "count");
        }
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        return tfxVar;
    }

    public static final zhf0 i(tny tnyVar) {
        tny y = tnyVar.y();
        return y != null ? y.z(tnyVar, true) : new zhf0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (tnyVar.a() >> 32), (int) (tnyVar.a() & 4294967295L));
    }

    public static final zhf0 j(tny tnyVar, boolean z) {
        tny p = p(tnyVar);
        float a = (int) (p.a() >> 32);
        float a2 = (int) (p.a() & 4294967295L);
        zhf0 z2 = p.z(tnyVar, z);
        float f2 = z2.d;
        float f3 = z2.c;
        float f4 = z2.b;
        float f5 = z2.a;
        if (z) {
            if (f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f5 = 0.0f;
            }
            if (f5 > a) {
                f5 = a;
            }
        }
        if (z) {
            if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f4 = 0.0f;
            }
            if (f4 > a2) {
                f4 = a2;
            }
        }
        if (z) {
            if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f3 = 0.0f;
            }
            if (f3 <= a) {
                a = f3;
            }
            f3 = a;
        }
        if (z) {
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 = 0.0f;
            }
            if (f2 <= a2) {
                a2 = f2;
            }
            f2 = a2;
        }
        if (f5 == f3 || f4 == f2) {
            return zhf0.e;
        }
        long U = p.U((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        long U2 = p.U((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        long U3 = p.U((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        long U4 = p.U((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        float intBitsToFloat = Float.intBitsToFloat((int) (U >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (U2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (U4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (U3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (U & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (U2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (U4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (U3 & 4294967295L));
        return new zhf0(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    @Deprecated
    public static boolean k(ListView listView) {
        return listView.canScrollList(-1);
    }

    public static final byte l(char c2) {
        if (c2 < '~') {
            return rlb.b[c2];
        }
        return (byte) 0;
    }

    public static final long m(int i2, long j) {
        int i3 = qko0.c;
        int i4 = (int) (j >> 32);
        int i5 = i4 < 0 ? 0 : i4;
        if (i5 > i2) {
            i5 = i2;
        }
        int i6 = (int) (4294967295L & j);
        int i7 = i6 >= 0 ? i6 : 0;
        if (i7 <= i2) {
            i2 = i7;
        }
        return (i5 == i4 && i2 == i6) ? j : c(i5, i2);
    }

    public static yoe n(ClipsOwnerSwipeFragment clipsOwnerSwipeFragment, ViewPager2 viewPager2, h20 h20Var) {
        return new yoe(clipsOwnerSwipeFragment, viewPager2, clipsOwnerSwipeFragment.D, h20Var, clipsOwnerSwipeFragment.In().a);
    }

    public static nyt0 o(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException(vr.b(cls, "Cannot create an instance of "));
            }
            try {
                return (nyt0) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(vr.b(cls, "Cannot create an instance of "), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(vr.b(cls, "Cannot create an instance of "), e3);
            }
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(vr.b(cls, "Cannot create an instance of "), e4);
        }
    }

    public static final tny p(tny tnyVar) {
        tny tnyVar2;
        tny y = tnyVar.y();
        while (true) {
            tny tnyVar3 = y;
            tnyVar2 = tnyVar;
            tnyVar = tnyVar3;
            if (tnyVar == null) {
                break;
            }
            y = tnyVar.y();
        }
        androidx.compose.ui.node.o oVar = tnyVar2 instanceof androidx.compose.ui.node.o ? (androidx.compose.ui.node.o) tnyVar2 : null;
        if (oVar == null) {
            return tnyVar2;
        }
        androidx.compose.ui.node.o oVar2 = oVar.u;
        while (true) {
            androidx.compose.ui.node.o oVar3 = oVar2;
            androidx.compose.ui.node.o oVar4 = oVar;
            oVar = oVar3;
            if (oVar == null) {
                return oVar4;
            }
            oVar2 = oVar.u;
        }
    }

    public static String q(long j) {
        return defpackage.k0.a(j, "vk://channel?peer=");
    }

    public static LayerDrawable r(Context context) {
        Drawable findDrawableByLayerId;
        Drawable findDrawableByLayerId2;
        Drawable findDrawableByLayerId3;
        Drawable a = m33.a(R.drawable.vk_ic_logo_vkid_composite, context);
        LayerDrawable layerDrawable = a instanceof LayerDrawable ? (LayerDrawable) a : null;
        if (layerDrawable != null && (findDrawableByLayerId3 = layerDrawable.findDrawableByLayerId(R.id.background)) != null) {
            findDrawableByLayerId3.setTint(krv0.m(R.attr.vk_connect_icon_background_color, context));
        }
        if (layerDrawable != null && (findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.logo)) != null) {
            findDrawableByLayerId2.setTint(krv0.m(R.attr.vk_connect_icon_color, context));
        }
        if (layerDrawable != null && (findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.text)) != null) {
            findDrawableByLayerId.setTint(krv0.m(R.attr.vk_connect_icon_text_color, context));
        }
        return layerDrawable;
    }

    public static final in20 s() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(572641752, 0, -1, "com.vk.core.compose.component.defaults.<get-VkGroupHeaderDefaults> (VkGroupHeaderDefaults.kt:21)");
        }
        in20 in20Var = in20.g;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return in20Var;
    }

    public static final SpannableString t(Context context, String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        int K = drm0.K(0, 6, str, str2, false);
        int length = str2.length() + K;
        if (K == -1) {
            return spannableString;
        }
        spannableString.setSpan(new ForegroundColorSpan(krv0.m(R.attr.vk_ui_text_primary, context)), K, length, 33);
        return spannableString;
    }

    public static final ja5 v(int i2, int i3, androidx.compose.runtime.a aVar, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1563837645, 0, -1, "com.vk.profile.design.compose.header.rememberAuthorHeaderMediaPagerState (AuthorHeaderMediaPagerState.kt:97)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new ja5(i2, i3);
            aVar.R(x);
        }
        ja5 ja5Var = (ja5) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return ja5Var;
    }

    public static final String w(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    public static Mat x(List list) {
        int size = list != null ? list.size() : 0;
        if (size <= 0) {
            return new Mat();
        }
        Mat mat = new Mat(size, 1, wpk.b);
        int[] iArr = new int[size * 2];
        for (int i2 = 0; i2 < size; i2++) {
            long j = ((Mat) list.get(i2)).a;
            int i3 = i2 * 2;
            iArr[i3] = (int) (j >> 32);
            iArr[i3 + 1] = (int) j;
        }
        mat.t(iArr);
        return mat;
    }

    @Override // xsna.zjr0
    public Object b(JsonReader jsonReader, float f2) throws IOException {
        return mby.b(jsonReader, f2);
    }

    @Override // xsna.r7n0
    public CountDownLatch cancel() {
        return new CountDownLatch(0);
    }

    public tfx g(List list) {
        tfx tfxVar = new tfx("bestFriends.batchEdit", new wr(9), new xr(7));
        tfx.o(tfxVar, "operations", GsonHolder.a().toJson(list), 0, 0, 12);
        return tfxVar;
    }

    public int hashCode() {
        switch (this.b) {
            case 26:
                throw null;
            default:
                return super.hashCode();
        }
    }

    public boolean u() {
        Boolean bool = Boolean.FALSE;
        return (bool.equals(null) || bool.equals(null) || bool.equals(null)) ? false : true;
    }

    public jgz(squ squVar) {
        this.b = 14;
    }
}
