package xsna;

import android.content.res.TypedArray;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoAccessInfo;
import com.vk.dto.common.VideoEditForbiddenReason;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.audio.Logger;
import xsna.b0a0;

/* compiled from: MarusiaBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class hg10 implements io.reactivex.rxjava3.functions.l, abk0, Logger {
    public static final float[][] c = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] d = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] e = {95.047f, 100.0f, 108.883f};
    public static final float[][] f = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final hg10 g = new hg10(3);
    public final /* synthetic */ int b;

    public /* synthetic */ hg10(int i) {
        this.b = i;
    }

    public static final boolean a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        if (videoFile.t0() && !videoFile.j0()) {
            return false;
        }
        if (!s6s0Var.g) {
            UserId userId = s6s0Var.n;
            if (!lan.a(s6s0Var) || userId == null) {
                return false;
            }
            bpn0 bpn0Var = o25.a;
            if (bpn0Var == null) {
                bpn0Var = null;
            }
            if (!((b25) bpn0Var.getValue()).a(userId)) {
                return false;
            }
        }
        return s6s0Var.d.b >= 0;
    }

    public static final boolean c(s6s0 s6s0Var) {
        boolean z;
        boolean z2;
        VideoFile videoFile = s6s0Var.a;
        VideoAccessInfo G9 = videoFile.G9();
        if (G9 != null) {
            List<VideoEditForbiddenReason> list = G9.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((VideoEditForbiddenReason) it.next()) instanceof VideoEditForbiddenReason.Ad) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        ArrayList arrayList = null;
        ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
        if (clipVideoFile != null) {
            ClickableStickers clickableStickers = clipVideoFile.C1;
            List<ClickableSticker> list2 = clickableStickers != null ? clickableStickers.d : null;
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (ClickableSticker clickableSticker : list2) {
                    ClickableMarketItem clickableMarketItem = clickableSticker instanceof ClickableMarketItem ? (ClickableMarketItem) clickableSticker : null;
                    String str = clickableMarketItem != null ? clickableMarketItem.l : null;
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                arrayList = arrayList2;
            }
            z2 = !(arrayList == null || arrayList.isEmpty());
        } else {
            z2 = false;
        }
        return z || z2;
    }

    public static int f(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = e;
        return n8g.c(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final boolean g(s6s0 s6s0Var) {
        return g620.f().c(s6s0Var.a);
    }

    public static final boolean h(s6s0 s6s0Var) {
        return epx.f(s6s0Var.p, "CLIPS") && s6s0Var.a.X2();
    }

    public static final boolean j(s6s0 s6s0Var, boolean z) {
        b25 a = o25.a();
        VideoFile videoFile = s6s0Var.a;
        if (a.a(videoFile.I0())) {
            return true;
        }
        UserId userId = s6s0Var.y;
        if (!z) {
            userId = null;
        }
        return epx.f(userId, videoFile.I0());
    }

    public static final boolean k(s6s0 s6s0Var) {
        VideoRestriction O = s6s0Var.a.O();
        if (O == null || !e5o.b(O)) {
            return false;
        }
        return epx.f(s6s0Var.p, "GROUP") || BuildInfo.q();
    }

    public static final boolean l(mdc0 mdc0Var) {
        return mdc0Var.b == PhotoVideoDisplayMode.Grid;
    }

    public static final boolean m(s6s0 s6s0Var) {
        return !g(s6s0Var);
    }

    public static final boolean n(s6s0 s6s0Var) {
        g7s0 B = fxc0.B();
        VideoFile videoFile = s6s0Var.a;
        if (B.c(videoFile)) {
            return false;
        }
        VideoRestriction O = videoFile.O();
        return O == null || O.f;
    }

    public static final boolean o(s6s0 s6s0Var) {
        return n(s6s0Var) && !fxc0.B().b0().e(s6s0Var.a);
    }

    public static float p(int i) {
        float f2 = i / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final b0a0 q(Object... objArr) {
        return k3k0.c.b(Arrays.asList(objArr));
    }

    public static final xow r(Iterable iterable) {
        xow xowVar = iterable instanceof xow ? (xow) iterable : null;
        return xowVar == null ? t(iterable) : xowVar;
    }

    public static final JSONObject s(MediaStoreEntry mediaStoreEntry) {
        JSONObject jSONObject = new JSONObject();
        if (mediaStoreEntry instanceof MediaStoreImageEntry) {
            jSONObject.put("type", 17);
            jSONObject.put("local_media_photo_exif_orientation", ((MediaStoreImageEntry) mediaStoreEntry).q);
        } else {
            if (!(mediaStoreEntry instanceof MediaStoreVideoEntry)) {
                throw new NoWhenBranchMatchedException();
            }
            jSONObject.put("type", 18);
            jSONObject.put("local_media_duration", ((MediaStoreVideoEntry) mediaStoreEntry).q);
        }
        jSONObject.put("local_media_id", mediaStoreEntry.getId());
        jSONObject.put("local_media_path", mediaStoreEntry.f().toString());
        jSONObject.put("local_media_date_taken", mediaStoreEntry.e());
        jSONObject.put("local_media_width", mediaStoreEntry.getWidth());
        jSONObject.put("local_media_height", mediaStoreEntry.getHeight());
        jSONObject.put("local_media_date_modified", mediaStoreEntry.d());
        jSONObject.put("local_media_size", mediaStoreEntry.g());
        return jSONObject;
    }

    public static final b0a0 t(Iterable iterable) {
        b0a0 b0a0Var = iterable instanceof b0a0 ? (b0a0) iterable : null;
        if (b0a0Var != null) {
            return b0a0Var;
        }
        b0a0.a aVar = iterable instanceof b0a0.a ? (b0a0.a) iterable : null;
        b0a0 build = aVar != null ? aVar.build() : null;
        if (build != null) {
            return build;
        }
        k3k0 k3k0Var = k3k0.c;
        if (iterable instanceof Collection) {
            return k3k0Var.b((Collection) iterable);
        }
        d1a0 d2 = k3k0Var.d();
        g5g.y(iterable, d2);
        return d2.build();
    }

    public static final boolean u(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        return g620.f().c(videoFile) && videoFile.p0();
    }

    public static float x() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) throws Throwable {
        return io.reactivex.rxjava3.core.q.T((UserProfile) ((List) obj).get(0));
    }

    @Override // xsna.abk0
    public boolean b(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void d(String str, String str2) {
        L.e(str, str2);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void e(String str, String str2) {
        L.l(str, str2);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void i(String str, String str2) {
        L.p(str, str2);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void reportError(String str, String str2, Throwable th) {
        L.f(str, str2, th);
        com.vk.metrics.eventtracking.b.a.a(th);
    }

    public String toString() {
        switch (this.b) {
            case 3:
                return "ReferentialEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void v(String str, String str2) {
        L.A(str, str2);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void w(String str, String str2) {
        L.G(str, str2);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void d(String str, String str2, Throwable th) {
        L.e(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void e(String str, String str2, Throwable th) {
        L.f(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void i(String str, String str2, Throwable th) {
        L.p(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void v(String str, String str2, Throwable th) {
        L.A(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void w(String str, String str2, Throwable th) {
        L.B(str, str2, th);
    }

    public static final void d(TypedArray typedArray, int i) {
        if (!typedArray.hasValue(i)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public void w(String str, Throwable th) {
        L.C(str, th);
    }
}
