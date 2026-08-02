package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.net.Uri;
import android.view.Gravity;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import com.google.android.gms.internal.measurement.zznt;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.ads.dto.AdsItemBlockAdPhotoBaseDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdPhotoMainDto;
import com.vk.api.generated.notifications.dto.NotificationsEditRedesignPushSettingValueDto;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.logger.LoggerProvider;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
@vby
/* loaded from: classes13.dex */
public final class s101 implements LoggerProvider, q701, cvu, dsz, io.reactivex.rxjava3.functions.m, gn60 {
    public static d80 b;
    public static volatile aaz0 f;
    public static final s101 c = new s101();
    public static final jai d = new jai(226901279, new mz2(0, 3), false);
    public static final s101 e = new s101();
    public static final /* synthetic */ s101 g = new s101();

    public static void H(s101 s101Var, Context context, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str = context.getPackageName();
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "https://play.google.com/store/apps/details?id=".concat(str);
        }
        if (context.getPackageManager().resolveActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=")), 64) != null) {
            gau.d(context, str, null);
            return;
        }
        if (context.getPackageManager().resolveActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("appmarket://details?id=")), 64) != null) {
            try {
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("appmarket://details?id=".concat(str)));
                intent.addFlags(1074266112);
                context.startActivity(intent);
                return;
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.q(th);
            }
        }
        try {
            Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str2));
            intent2.addFlags(1074266112);
            context.startActivity(intent2);
        } catch (Throwable th2) {
            L.i(th2);
        }
    }

    public static final tz50 I(xvy xvyVar, boolean z, gzs gzsVar, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-906714156, 0, -1, "com.vk.catalog.mvi.section.ui.utils.rememberNearEndTriggerFlingBehaviour (ViewUtils.kt:94)");
        }
        l7l a = ilk0.a(aVar);
        zel f2 = k7b0.f(0, aVar);
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (x == obj) {
            x = io.reactivex.rxjava3.internal.operators.mixed.j.d(z, aVar);
        }
        wh50 wh50Var = (wh50) x;
        wh50Var.setValue(Boolean.valueOf(z));
        boolean J = aVar.J(xvyVar) | aVar.J(a);
        Object x2 = aVar.x();
        if (J || x2 == obj) {
            Object tz50Var = new tz50(xvyVar, wh50Var, gzsVar, a, f2);
            aVar.R(tz50Var);
            x2 = tz50Var;
        }
        tz50 tz50Var2 = (tz50) x2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return tz50Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean J(ph50 ph50Var, Object obj, Object obj2) {
        V d2 = ph50Var.d(obj);
        if (d2 == 0) {
            return false;
        }
        if (!(d2 instanceof qh50)) {
            if (!d2.equals(obj2)) {
                return false;
            }
            ph50Var.n(obj);
            return true;
        }
        qh50 qh50Var = (qh50) d2;
        boolean m = qh50Var.m(obj2);
        if (m && qh50Var.c()) {
            ph50Var.n(obj);
        }
        return m;
    }

    public static final void K(ph50 ph50Var, Object obj) {
        boolean z;
        long[] jArr = ph50Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = ph50Var.b[i4];
                        Object obj3 = ph50Var.c[i4];
                        if (obj3 instanceof qh50) {
                            qh50 qh50Var = (qh50) obj3;
                            qh50Var.m(obj);
                            z = qh50Var.c();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            ph50Var.o(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void e(int i, final int i2, androidx.compose.runtime.a aVar, final gzs gzsVar, final xvy xvyVar, final boolean z) {
        final int i3;
        androidx.compose.runtime.a M = aVar.M(81122948);
        int i4 = i2 | (M.J(xvyVar) ? 4 : 2) | (M.l(z) ? 32 : 16) | 384 | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(81122948, i4, -1, "com.vk.catalog.mvi.section.ui.utils.NearEndTrigger (ViewUtils.kt:28)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Boolean valueOf = Boolean.valueOf(z);
            i3 = 3;
            boolean z2 = ((i4 & 14) == 4) | ((i4 & 112) == 32) | ((i4 & 7168) == 2048);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new f2u0(z, xvyVar, 3, wh50Var, gzsVar, null);
                M.R(x2);
            }
            bap.e(xvyVar, valueOf, 3, (wzs) x2, M, i4 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            i3 = i;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, i3, gzsVar, i2) { // from class: xsna.e2u0
                public final /* synthetic */ boolean c;
                public final /* synthetic */ int d;
                public final /* synthetic */ gzs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    s101.e(this.d, I, (androidx.compose.runtime.a) obj, this.e, xvy.this, this.c);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(ph50 ph50Var, Object obj, Object obj2) {
        int j = ph50Var.j(obj);
        boolean z = j < 0;
        Object obj3 = z ? null : ph50Var.c[j];
        if (obj3 != null) {
            if (obj3 instanceof qh50) {
                ((qh50) obj3).e(obj2);
            } else if (obj3 != obj2) {
                qh50 qh50Var = new qh50((Object) null);
                qh50Var.e(obj3);
                qh50Var.e(obj2);
                obj2 = qh50Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            ph50Var.c[j] = obj2;
            return;
        }
        int i = ~j;
        ph50Var.b[i] = obj;
        ph50Var.c[i] = obj2;
    }

    public static void g(int i, int i2, int i3, int i4, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }

    public static aaz0 h() {
        aaz0 aaz0Var = f;
        if (aaz0Var != null) {
            return aaz0Var;
        }
        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
    }

    public static final ArrayList i(List list, List list2) {
        List<jis> list3 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
        for (jis jisVar : list3) {
            boolean z = jisVar.e;
            UserId userId = jisVar.a;
            if (list2.contains(userId) && !z) {
                jisVar = jis.a(jisVar, null, true, false, 111);
            } else if (!list2.contains(userId) && z) {
                jisVar = jis.a(jisVar, null, false, false, 111);
            }
            arrayList.add(jisVar);
        }
        return arrayList;
    }

    public static final List j(int i, Integer num, ArrayList arrayList) {
        if (num == null) {
            return arrayList;
        }
        if (i >= num.intValue()) {
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jis jisVar = (jis) it.next();
                arrayList2.add(jis.a(jisVar, null, false, jisVar.e, 95));
            }
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            jis jisVar2 = (jis) it2.next();
            if (!jisVar2.f) {
                jisVar2 = jis.a(jisVar2, null, false, true, 95);
            }
            arrayList3.add(jisVar2);
        }
        return arrayList3;
    }

    public static l3d0 k(l3d0 l3d0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = l3d0Var.a;
        }
        if ((i & 2) != 0) {
            z2 = l3d0Var.b;
        }
        return (z == l3d0Var.a && z2 == l3d0Var.b) ? l3d0Var : new l3d0(z, z2);
    }

    public static final RenderEffect l(float f2, float f3, float f4, boolean z) {
        RenderEffect createRuntimeShaderEffect;
        RenderEffect createRuntimeShaderEffect2;
        RenderEffect createChainEffect;
        float f5 = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bi4.d();
        RuntimeShader b2 = xa0.b();
        b2.setFloatUniform("u_resolution", f3, f4);
        b2.setFloatUniform("u_direction", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        b2.setFloatUniform("u_sigma", f2);
        b2.setFloatUniform("u_flipGradient", f5);
        bi4.d();
        RuntimeShader b3 = xa0.b();
        b3.setFloatUniform("u_resolution", f3, f4);
        b3.setFloatUniform("u_direction", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        b3.setFloatUniform("u_sigma", f2);
        b3.setFloatUniform("u_flipGradient", f5);
        createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(b3, "u_input");
        createRuntimeShaderEffect2 = RenderEffect.createRuntimeShaderEffect(b2, "u_input");
        createChainEffect = RenderEffect.createChainEffect(createRuntimeShaderEffect, createRuntimeShaderEffect2);
        return createChainEffect;
    }

    public static int n(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }

    public static final String o(zo10 zo10Var) {
        String obj;
        Object o = vua0.o(zo10Var);
        if (o == null) {
            o = s490.e(zo10Var);
        }
        return (o == null || (obj = o.toString()) == null) ? "null" : obj;
    }

    public static final int p(ph50 ph50Var) {
        return ph50Var.e;
    }

    public static final boolean q(Bitmap bitmap) {
        return bitmap.getWidth() > 10 && bitmap.getHeight() > 10;
    }

    public static final boolean r(ViewGroup viewGroup) {
        return viewGroup.getChildCount() > 0;
    }

    public static final boolean s(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = pm0.a(f5, f27, (f4 * f28) + ((-f3) * f29), f31);
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = pm0.a(f13, f21, (f12 * f22) + ((-f11) * f23), f31);
            float f32 = -f6;
            fArr2[4] = pm0.a(f9, f25, (f8 * f26) + (f32 * f29), f31);
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = pm0.a(f17, f19, (f16 * f20) + (f33 * f23), f31);
            fArr2[7] = ((f13 * f19) + ((f10 * f23) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = pm0.a(f5, f24, (f26 * f3) + ((-f2) * f28), f31);
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = pm0.a(f13, f18, (f20 * f11) + ((-f10) * f22), f31);
            fArr2[12] = pm0.a(f8, f24, (f7 * f25) + (f32 * f27), f31);
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = pm0.a(f16, f18, (f15 * f19) + (f33 * f21), f31);
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        return !(f30 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0066 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(scq0 scq0Var, String str, izs izsVar) {
        Pair pair;
        Object failure;
        if (str == null || drm0.N(str)) {
            str = null;
        }
        if (str == null) {
            return;
        }
        List c0 = drm0.c0(str, new String[]{StringUtils.COMMA}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : c0) {
            if (!drm0.N((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) izsVar.invoke((String) it.next());
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            List c02 = drm0.c0((String) it2.next(), new String[]{"-"}, 0, 6);
            if (c02.size() != 2) {
                c02 = null;
            }
            if (c02 != null) {
                String str3 = (String) c02.get(0);
                String str4 = (String) c02.get(1);
                if (drm0.N(str3) || drm0.N(str4)) {
                    c02 = null;
                }
                if (c02 != null) {
                    try {
                        failure = new Pair(Long.valueOf(Long.parseLong((String) c02.get(0))), Long.valueOf(Long.parseLong((String) c02.get(1))));
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    pair = (Pair) failure;
                    if (pair == null) {
                        arrayList3.add(pair);
                    }
                }
            }
            pair = null;
            if (pair == null) {
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Pair pair2 = (Pair) it3.next();
            long longValue = ((Number) pair2.d()).longValue();
            long longValue2 = (((Number) pair2.g()).longValue() - longValue) + 1;
            bcc bccVar = new bcc(longValue, longValue2);
            bccVar.b(longValue2);
            bccVar.a();
            scq0Var.a(scq0Var.c.size(), bccVar);
        }
    }

    public static Image u(List list) {
        ArrayList arrayList;
        if (list != null) {
            List<AdsItemBlockAdPhotoBaseDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            for (AdsItemBlockAdPhotoBaseDto adsItemBlockAdPhotoBaseDto : list2) {
                String url = adsItemBlockAdPhotoBaseDto.getUrl();
                Integer e2 = adsItemBlockAdPhotoBaseDto.e();
                int i = 0;
                int intValue = e2 != null ? e2.intValue() : 0;
                Integer d2 = adsItemBlockAdPhotoBaseDto.d();
                if (d2 != null) {
                    i = d2.intValue();
                }
                arrayList.add(new ImageSize(url, intValue, i, null, (char) 0, false, 56, null));
            }
        } else {
            arrayList = null;
        }
        return new Image(arrayList);
    }

    public static Image v(List list) {
        ArrayList arrayList;
        if (list != null) {
            List<AdsItemBlockAdPhotoMainDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            for (AdsItemBlockAdPhotoMainDto adsItemBlockAdPhotoMainDto : list2) {
                String url = adsItemBlockAdPhotoMainDto.getUrl();
                Integer e2 = adsItemBlockAdPhotoMainDto.e();
                int i = 0;
                int intValue = e2 != null ? e2.intValue() : 0;
                Integer d2 = adsItemBlockAdPhotoMainDto.d();
                if (d2 != null) {
                    i = d2.intValue();
                }
                arrayList.add(new ImageSize(url, intValue, i, null, (char) 0, false, 56, null));
            }
        } else {
            arrayList = null;
        }
        return new Image(arrayList);
    }

    public tfx A(Long l, String str, String str2) {
        tfx tfxVar = new tfx("notifications.getRedesign", new lr(26), new pn(28));
        if (l != null) {
            tfx.m(tfxVar, "group_id", l.longValue(), 1L, 8);
        }
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "category", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    public tfx B() {
        return new tfx("notifications.getUnreadCounters", new rf3(22), new r11(23));
    }

    public tfx C(Long l, String str) {
        tfx tfxVar = new tfx("notifications.markAsViewed", new nr(24), new defpackage.j0(29));
        if (l != null) {
            tfx.m(tfxVar, "group_id", l.longValue(), 1L, 8);
        }
        if (str != null) {
            tfx.o(tfxVar, "view_time", str, 0, 0, 12);
        }
        return tfxVar;
    }

    public tfx D(String str) {
        tfx tfxVar = new tfx("notifications.restore", new or(26), new ck70(0));
        if (str != null) {
            tfx.o(tfxVar, "query", str, 0, 0, 12);
        }
        return tfxVar;
    }

    public tfx E(String str) {
        tfx tfxVar = new tfx("notifications.subscribe", new et(25), new gp(26));
        tfx.o(tfxVar, "query", str, 0, 0, 12);
        return tfxVar;
    }

    public tfx F(String str) {
        tfx tfxVar = new tfx("notifications.unsubscribe", new qr(23), new rr(24));
        tfx.o(tfxVar, "query", str, 0, 0, 12);
        return tfxVar;
    }

    public void G(Context context, String str, String str2) {
        H(this, context, str, str2, 8);
    }

    @Override // xsna.cvu
    public String a(Context context) {
        return context.getString(R.string.clip_privacy_hint_mentions);
    }

    @Override // xsna.cvu
    public void b(Context context, gzs gzsVar) {
        if (j8.d(context)) {
            return;
        }
        g620.f().getPrivacy().o(context, new ht(10), gzsVar, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_EDITOR);
    }

    @Override // xsna.cvu
    public String c(Context context) {
        return context.getString(R.string.clip_privacy_hint_hashtags);
    }

    @Override // xsna.dsz
    public boolean d(frz frzVar) {
        return true;
    }

    public f1e0 m(Collection collection) {
        f1e0 f1e0Var = new f1e0();
        if ((collection instanceof List) && (collection instanceof RandomAccess)) {
            List list = (List) collection;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                lv30.b((Msg) list.get(i), f1e0Var);
            }
        } else {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                lv30.b((Msg) it.next(), f1e0Var);
            }
        }
        return f1e0Var;
    }

    @Override // com.vk.push.common.logger.LoggerProvider
    public Logger provideLogger() {
        Logger logger;
        aaz0 aaz0Var = f;
        return (aaz0Var == null || (logger = aaz0Var.c) == null) ? new DefaultLogger("VkpnsClientSdk") : logger;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return Boolean.valueOf(obj instanceof hy00).booleanValue();
    }

    public tfx w(String str) {
        tfx tfxVar = new tfx("notifications.actionRedesign", new mr(29), new yu50(2));
        tfx.o(tfxVar, "query", str, 0, 0, 12);
        return tfxVar;
    }

    @Override // xsna.gn60
    public List x(Pair pair, bp5 bp5Var) {
        NewsEntry newsEntry = (NewsEntry) pair.d();
        SnippetAttachment snippetAttachment = (SnippetAttachment) pair.g();
        Float s = di60.s(newsEntry);
        return Collections.singletonList(new u9d0(snippetAttachment.g, new Triple(snippetAttachment.i, null, null), snippetAttachment.p, "H," + (s != null ? s.floatValue() : 1.7777778f) + ":1", mnh0.G(bp5Var)));
    }

    public tfx y(String str, String str2, NotificationsEditRedesignPushSettingValueDto notificationsEditRedesignPushSettingValueDto) {
        tfx tfxVar = new tfx("notifications.editRedesignPushSetting", new as(24), new p11(21));
        tfx.o(tfxVar, "device_id", str, 0, 0, 12);
        tfx.o(tfxVar, "key", str2, 0, 0, 12);
        tfx.o(tfxVar, "value", notificationsEditRedesignPushSettingValueDto.i(), 0, 0, 12);
        return tfxVar;
    }

    public tfx z(String str, String str2, String str3) {
        tfx tfxVar = new tfx("notifications.editRedesignSetting", new ur(26), new vr(24));
        tfx.o(tfxVar, "device_id", str, 0, 0, 12);
        tfx.o(tfxVar, "category_id", str2, 0, 0, 12);
        tfx.o(tfxVar, "settings_id", str3, 0, 0, 12);
        return tfxVar;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zznt.zzd());
    }
}
