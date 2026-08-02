package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Looper;
import androidx.compose.runtime.a;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.google.android.gms.internal.measurement.zzox;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupLeaveMode;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.EventAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.MarketLinkAttachment;
import com.vkontakte.android.attachments.MarketMessageOwnerAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.oap;

/* compiled from: FullFrameRect.java */
/* loaded from: classes12.dex */
public final class xus implements kbf0, axp, q701 {
    public static final float[][] b = new float[8][];
    public static final xus c = new xus();
    public static final xus d = new xus();
    public static final /* synthetic */ xus e = new xus();

    public static RippleDrawable a(float f, int i, int i2, int i3) {
        Drawable drawable;
        if ((i3 & 2) != 0) {
            i2 = dhr0.t.c(R.attr.vk_ui_separator_primary_alpha);
        }
        dhr0.t.c(R.attr.vk_ui_image_border_alpha);
        if ((i3 & 32) != 0) {
            f = 0.0f;
        }
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            drawable = new qog0(f, i);
        } else {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
            shapeDrawable.getPaint().setColor(i);
            drawable = shapeDrawable;
        }
        return new RippleDrawable(ColorStateList.valueOf(i2), drawable, new vvv0(f, -16777216));
    }

    public static final int b(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int c(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static float[] d(float f, boolean z) {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.rotateM(fArr, 0, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f);
        if (z) {
            Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        }
        return fArr;
    }

    public static final JSONObject e(tec0 tec0Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", tec0Var instanceof GeoAttachment ? 1 : tec0Var instanceof AlbumAttachment ? 13 : tec0Var instanceof PhotoAttachment ? 2 : tec0Var instanceof AudioAttachment ? 4 : tec0Var instanceof VideoAttachment ? 5 : tec0Var instanceof DocumentAttachment ? 7 : tec0Var instanceof PollAttachment ? 9 : tec0Var instanceof EventAttachment ? 10 : tec0Var instanceof MarketAttachment ? 11 : tec0Var instanceof ArticleAttachment ? 14 : tec0Var instanceof MarketLinkAttachment ? 15 : tec0Var instanceof MarketMessageOwnerAttachment ? 16 : 0);
        return jSONObject;
    }

    public static String f(String str, String str2) {
        Object obj;
        if (str == null) {
            return "unknown";
        }
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (!mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length = supportedTypes.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (brm0.w(supportedTypes[i], str, true)) {
                        arrayList.add(mediaCodecInfo);
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((MediaCodecInfo) obj).getName(), str2)) {
                break;
            }
        }
        MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) obj;
        if (mediaCodecInfo2 == null) {
            return "unknown";
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 ? mediaCodecInfo2.isHardwareAccelerated() : false) {
            return "HW";
        }
        return i2 >= 29 ? mediaCodecInfo2.isSoftwareOnly() : false ? "SW" : "unknown";
    }

    public static Drawable g(Context context) {
        return wvv0.a(context, R.drawable.vkui_bg_edittext, e3m.f(R.attr.vk_ui_field_background, context), e3m.f(R.attr.vk_ui_field_background, context), e3m.f(R.attr.vk_ui_stroke_accent, context), e3m.f(R.attr.vk_ui_field_border_alpha, context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int h(oap oapVar) {
        if (oapVar instanceof oap.b) {
            return ((Group) ((oap.b) oapVar).a).C;
        }
        if (oapVar instanceof oap.a) {
            return ((ExtendedCommunityProfile) ((oap.a) oapVar).a).a1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean i(oap oapVar) {
        if (oapVar instanceof oap.b) {
            return fkq0.c(((Group) ((oap.b) oapVar).a).L);
        }
        if (oapVar instanceof oap.a) {
            return ((ExtendedCommunityProfile) ((oap.a) oapVar).a).z1 != null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Boolean j(oap oapVar) {
        if (oapVar instanceof oap.b) {
            return ((Group) ((oap.b) oapVar).a).y0;
        }
        if (oapVar instanceof oap.a) {
            return Boolean.valueOf(((ExtendedCommunityProfile) ((oap.a) oapVar).a).b3);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final GroupLeaveMode k(oap oapVar) {
        if (oapVar instanceof oap.b) {
            return ((Group) ((oap.b) oapVar).a).j0;
        }
        if (oapVar instanceof oap.a) {
            return ((ExtendedCommunityProfile) ((oap.a) oapVar).a).N2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static float[] l(float f, boolean z) {
        int max;
        if (((int) f) % 90 != 0) {
            max = -1;
        } else {
            max = Math.max(0, (Math.round(f / 90.0f) + 40) % 4) + (z ? 4 : 0);
        }
        if (max < 0) {
            return d(f, z);
        }
        float[][] fArr = b;
        float[] fArr2 = fArr[max];
        if (fArr2 != null) {
            return fArr2;
        }
        float[] d2 = d(f, z);
        fArr[max] = d2;
        return d2;
    }

    public static final int m(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean n(oap oapVar) {
        if (oapVar instanceof oap.b) {
            Group group = (Group) ((oap.b) oapVar).a;
            return group.n() && group.p == 0;
        }
        if (!(oapVar instanceof oap.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) ((oap.a) oapVar).a;
        return extendedCommunityProfile.Y == 0 && extendedCommunityProfile.Z == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean o(oap oapVar) {
        if (oapVar instanceof oap.b) {
            return ((Group) ((oap.b) oapVar).a).p == 1;
        }
        if (oapVar instanceof oap.a) {
            return ((ExtendedCommunityProfile) ((oap.a) oapVar).a).Y == 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean p(oap oapVar) {
        if (oapVar instanceof oap.b) {
            return ((Group) ((oap.b) oapVar).a).u();
        }
        if (oapVar instanceof oap.a) {
            return ((ExtendedCommunityProfile) ((oap.a) oapVar).a).Z == 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final long q(long j, long j2, float f) {
        float z = q6x.z(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float z2 = q6x.z(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return (Float.floatToRawIntBits(z) << 32) | (Float.floatToRawIntBits(z2) & 4294967295L);
    }

    public static final agw r(final String str, izs izsVar, float f, float f2, androidx.compose.runtime.a aVar, int i, int i2) {
        izs izsVar2;
        int i3 = i2 & 2;
        Object obj = a.C0011a.a;
        if (i3 != 0) {
            Object x = aVar.x();
            if (x == obj) {
                x = new y8m(29);
                aVar.R(x);
            }
            izsVar2 = (izs) x;
        } else {
            izsVar2 = izsVar;
        }
        float f3 = (i2 & 4) != 0 ? 0 : f;
        final float f4 = (i2 & 8) != 0 ? 0 : f2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1764406864, i, -1, "com.vk.core.compose.image.rememberUrlImageBitmap (rememberUrlPainter.kt:60)");
        }
        Object x2 = aVar.x();
        if (x2 == obj) {
            x2 = new cgw();
            aVar.R(x2);
        }
        final cgw cgwVar = (cgw) x2;
        final wh50 c2 = androidx.compose.runtime.k.c(izsVar2, aVar, (i >> 3) & 14);
        Object x3 = aVar.x();
        if (x3 == obj) {
            x3 = new wvf();
            aVar.R(x3);
        }
        final wvf wvfVar = (wvf) x3;
        final azl azlVar = (azl) aVar.r(uvi.h);
        Object[] objArr = {str, new pco(f3), new pco(f4), azlVar};
        boolean J = ((((i & 14) ^ 6) > 4 && aVar.J(str)) || (i & 6) == 4) | aVar.J(azlVar) | ((((i & 896) ^ 384) > 256 && aVar.n(f3)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && aVar.n(f4)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && aVar.o(0)) || (i & 24576) == 16384);
        final float f5 = f3;
        final boolean z = false;
        boolean J2 = J | ((((458752 & i) ^ 196608) > 131072 && aVar.l(false)) || (i & 196608) == 131072) | aVar.J(c2);
        Object x4 = aVar.x();
        if (J2 || x4 == obj) {
            final int i4 = 0;
            Object obj2 = new izs() { // from class: xsna.kuf0
                @Override // xsna.izs
                public final Object invoke(Object obj3) {
                    io.reactivex.rxjava3.core.q w;
                    final Uri parse = Uri.parse(str);
                    azl azlVar2 = azlVar;
                    final int r0 = azlVar2.r0(f5);
                    final int r02 = azlVar2.r0(f4);
                    Field field = mcr0.a;
                    if (parse == null) {
                        w = io.reactivex.rxjava3.core.q.H(new NullPointerException("uri is null"));
                    } else {
                        final int i5 = i4;
                        final boolean z2 = z;
                        w = new io.reactivex.rxjava3.internal.operators.single.b(new io.reactivex.rxjava3.core.a0() { // from class: xsna.gcr0
                            @Override // io.reactivex.rxjava3.core.a0
                            public final void subscribe(io.reactivex.rxjava3.core.y yVar) {
                                ae a;
                                int i6;
                                Uri uri = parse;
                                if ("vkchatphoto".equals(uri.getScheme())) {
                                    a = dr5.l(uri);
                                } else {
                                    ImageRequestBuilder h = ImageRequestBuilder.h(uri);
                                    int i7 = i5;
                                    if (i7 == 94848) {
                                        h.e = eng0.c;
                                    } else {
                                        h.e = new eng0(i7, false);
                                    }
                                    int i8 = r0;
                                    if (i8 > 0 && (i6 = r02) > 0) {
                                        h.d = new x9g0(i8, i6);
                                    }
                                    if (z2) {
                                        h.g = ImageRequest.CacheChoice.SMALL;
                                    }
                                    a = rhs.b().a(h.a(), null, null, null, null);
                                }
                                if (a != null) {
                                    a.d(new pcr0(yVar), ac9.b);
                                } else {
                                    if (yVar.h()) {
                                        return;
                                    }
                                    yVar.onError(new NullPointerException("dataSource is null"));
                                }
                            }
                        }).w();
                    }
                    return new luf0(w.a0(io.reactivex.rxjava3.android.schedulers.a.a(Looper.getMainLooper())).subscribe(new hu50(new hn0(24, wvfVar, cgwVar), 13), new wnt(new me2(3, c2), 28)), 0);
                }
            };
            aVar.R(obj2);
            x4 = obj2;
        }
        bap.d(objArr, (izs) x4, aVar);
        agw agwVar = (agw) ((zak0) cgwVar.b).getValue();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return agwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ozl
    public static final lg90 s(String str, long j, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getBackground().g;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1572518149, i, -1, "com.vk.core.compose.image.rememberUrlPainter (rememberUrlPainter.kt:33)");
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            x = androidx.compose.runtime.k.b(new y6g(j));
            aVar.R(x);
        }
        wh50 wh50Var = (wh50) x;
        Object x2 = aVar.x();
        if (x2 == c0012a) {
            x2 = new u620(20);
            aVar.R(x2);
        }
        float f = 0;
        agw r = r(str, (izs) x2, f, f, aVar, (i & 14) | 224688, 0);
        if (r != null) {
            wh50Var.setValue(new rc7(r));
        }
        lg90 lg90Var = (lg90) wh50Var.getValue();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return lg90Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final UserId t(oap oapVar) {
        UserId userId;
        if (oapVar instanceof oap.b) {
            return ((Group) ((oap.b) oapVar).a).c;
        }
        if (!(oapVar instanceof oap.a)) {
            throw new NoWhenBranchMatchedException();
        }
        UserProfile userProfile = ((ExtendedCommunityProfile) ((oap.a) oapVar).a).a;
        return (userProfile == null || (userId = userProfile.c) == null) ? UserId.d : userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void u(oap oapVar, int i) {
        if (oapVar instanceof oap.b) {
            ((Group) ((oap.b) oapVar).a).C = i;
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ((ExtendedCommunityProfile) ((oap.a) oapVar).a).a1 = i;
        }
    }

    public static final Integer v(String str) {
        switch (str.hashCode()) {
            case -1897185151:
                return !str.equals(X3.i.d0) ? null : 2;
            case -1281977283:
                return !str.equals("failed") ? null : 4;
            case -673660814:
                return !str.equals("finished") ? null : 3;
            case 757725580:
                return !str.equals("postlive") ? null : 6;
            case 1116313165:
                return !str.equals("waiting") ? null : 1;
            case 1306691868:
                return !str.equals("upcoming") ? null : 5;
            default:
                return null;
        }
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzox.zzg());
    }
}
