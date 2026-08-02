package xsna;

import android.graphics.PointF;
import android.text.TextPaint;
import androidx.compose.foundation.gestures.Orientation;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.android.gms.internal.measurement.zzou;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.catalog2.common.ui.mvp.configuration.reload.CatalogReloadTrigger;
import com.vk.clips.viewer.edit.presentation.feature.state.ClipEditSdkCoverImage;
import com.vk.clips.viewer.edit.presentation.feature.state.CoverImageUrl;
import com.vk.core.preference.Preference;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.common.restrictions.Restriction;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import io.jsonwebtoken.JwtParser;
import io.reactivex.rxjava3.internal.functions.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GamesCatalogPWAModalBottomSheetContent.kt */
/* loaded from: classes17.dex */
public final class egi implements xca, zjr0, q701 {
    public static final jai b = new jai(858942453, new zai(1), false);
    public static final egi c = new egi();
    public static final egi d = new egi();
    public static final ioy e = new ioy();
    public static final /* synthetic */ egi f = new egi();

    public static final void a(bei0 bei0Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-954926513);
        int i2 = (M.y(bei0Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-954926513, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:49)");
            }
            sig.a(bei0Var, jaiVar, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gx(bei0Var, jaiVar, i, 5);
        }
    }

    public static final void c(gho0 gho0Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2080741862);
        if ((i & 6) == 0) {
            i2 = (M.y(gho0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2080741862, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:33)");
            }
            sig.b(gho0Var, jaiVar, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n74(gho0Var, jaiVar, i, 2);
        }
    }

    public static final boolean e(PointF pointF) {
        return Math.abs(pointF.x) <= Float.MAX_VALUE && Math.abs(pointF.y) <= Float.MAX_VALUE;
    }

    public static final void f(VKImageView vKImageView, int i, Restriction restriction) {
        if (restriction instanceof PhotoRestriction) {
            jwx jwxVar = edg0.a;
            vKImageView.setImageDrawable(edg0.a((PhotoRestriction) restriction, -1));
        } else if (restriction instanceof VideoRestriction) {
            ImageSize Cb = ((VideoRestriction) restriction).g.Cb(i, true, false);
            vKImageView.load(Cb != null ? Cb.d.d : null);
        }
    }

    public static final void g() {
        Preference.F(0L, "community_repository", "last_update_time");
    }

    public static final int h(qyg0 qyg0Var, String str) {
        if (qyg0Var instanceof wm00) {
            throw null;
        }
        int columnCount = qyg0Var.getColumnCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(qyg0Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String b2 = air.b('`', "`", str);
        if (qyg0Var instanceof wm00) {
            throw null;
        }
        int columnCount2 = qyg0Var.getColumnCount();
        while (true) {
            if (i >= columnCount2) {
                i = -1;
                break;
            }
            if (b2.equals(qyg0Var.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        return -1;
    }

    public static String i(Owner owner) {
        String a;
        Character y0;
        String a2;
        String a3;
        if (owner != null) {
            if (fkq0.b(owner.b)) {
                String str = owner.c;
                if (str != null) {
                    return str;
                }
            } else {
                String str2 = owner.h;
                String str3 = null;
                if (str2 != null && (a = cqm0.a(str2)) != null) {
                    String str4 = owner.i;
                    if (str4 == null || (a2 = cqm0.a(str4)) == null || (a3 = v1v.a(' ', a, a2)) == null) {
                        String str5 = owner.n;
                        if (str5 != null && (y0 = erm0.y0(str5)) != null) {
                            str3 = a + ' ' + y0.charValue() + JwtParser.SEPARATOR_CHAR;
                        }
                    } else {
                        str3 = a3;
                    }
                }
                if (str3 != null) {
                    return str3;
                }
                String str6 = owner.c;
                if (str6 != null) {
                    return str6;
                }
            }
        }
        return "";
    }

    public static final long j(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final int k(qyg0 qyg0Var, String str) {
        int h = h(qyg0Var, str);
        if (h >= 0) {
            return h;
        }
        int columnCount = qyg0Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(qyg0Var.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + j5g.g0(arrayList, null, null, null, 0, null, 63) + ']');
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w64 l(int i, Attachment attachment) {
        ImageSize Cb;
        String str;
        String str2;
        boolean z = false;
        if (attachment instanceof PhotoAttachment) {
            Photo photo = ((PhotoAttachment) attachment).l;
            ImageSize Fb = photo.y.E0() > 1.0f ? photo.Fb(i, true) : photo.Db(i, true);
            String str3 = Fb.d.d;
            float E0 = Fb.E0();
            PhotoRestriction photoRestriction = photo.L;
            if (photoRestriction != null && photoRestriction.d) {
                z = true;
            }
            return new w64(str3, E0, photoRestriction, z);
        }
        if (attachment instanceof VideoAttachment) {
            VideoAttachment videoAttachment = (VideoAttachment) attachment;
            ImageSize Bb = videoAttachment.k.getImage().E0() > 1.0f ? Image.Bb(i, videoAttachment.k.getImage().b, true, false, true) : Image.Bb(i, videoAttachment.k.getImage().b, false, false, true);
            if (Bb != null && (str2 = Bb.d.d) != null) {
                float E02 = Bb.E0();
                VideoRestriction O = videoAttachment.k.O();
                VideoRestriction O2 = videoAttachment.k.O();
                if (O2 != null && O2.d) {
                    z = true;
                }
                return new w64(str2, E02, O, z);
            }
        } else if (attachment instanceof DocumentAttachment) {
            Image image = ((DocumentAttachment) attachment).s;
            if ((image != null ? image.E0() : 1.0f) > 1.0f) {
                if (image != null) {
                    Cb = image.Cb(i, true, false);
                    if (Cb != null && (str = Cb.d.d) != null) {
                        return new w64(str, Cb.E0(), null, false);
                    }
                }
                Cb = null;
                if (Cb != null) {
                    return new w64(str, Cb.E0(), null, false);
                }
            } else {
                if (image != null) {
                    Cb = image.Cb(i, false, false);
                    if (Cb != null) {
                    }
                }
                Cb = null;
                if (Cb != null) {
                }
            }
        }
        return null;
    }

    public static final long m() {
        return Preference.m(0L, "community_repository", "last_update_time");
    }

    public static final int n(ob90 ob90Var) {
        return (int) (ob90Var.getOrientation() == Orientation.Vertical ? ob90Var.a() & 4294967295L : ob90Var.a() >> 32);
    }

    public static final q630 o(q630 q630Var, izs izsVar) {
        return q630Var.g(new i680(izsVar));
    }

    public static final void p(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255));
    }

    public static int q(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int r(Object obj) {
        return q(obj == null ? 0 : obj.hashCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ClipEditSdkCoverImage s(List list) {
        List<VideoVideoImageDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (VideoVideoImageDto videoVideoImageDto : list2) {
            arrayList.add(new CoverImageUrl(videoVideoImageDto.getUrl(), Math.max(videoVideoImageDto.getWidth(), videoVideoImageDto.getHeight()), epx.f(videoVideoImageDto.e(), Boolean.TRUE)));
        }
        return new ClipEditSdkCoverImage(arrayList, null, 2, 0 == true ? 1 : 0);
    }

    public static final io.reactivex.rxjava3.core.q t(io.reactivex.rxjava3.core.q qVar, sr80 sr80Var) {
        if (sr80Var == null) {
            return qVar;
        }
        rt10 rt10Var = new rt10(new rxz(sr80Var, 9), 9);
        qVar.getClass();
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.c0 c0Var = new io.reactivex.rxjava3.internal.operators.observable.c0(qVar, rt10Var, kVar);
        cl30 cl30Var = new cl30(new hxl(sr80Var, 23), 3);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        return new io.reactivex.rxjava3.internal.operators.observable.c0(c0Var.E(cl30Var, lVar, kVar, kVar).G(new if1(sr80Var, 2)), lVar, new fa(sr80Var, 9));
    }

    @Override // xsna.zjr0
    public Object b(JsonReader jsonReader, float f2) throws IOException {
        return Float.valueOf(mby.d(jsonReader) * f2);
    }

    @Override // xsna.xca
    public boolean d(CatalogReloadTrigger catalogReloadTrigger) {
        return false;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzou.zzc());
    }
}
