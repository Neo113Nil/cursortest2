package xsna;

import android.content.Context;
import android.net.Uri;
import android.text.Editable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import xsna.dv90;
import xsna.x2o0;

/* compiled from: ChannelBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class sua implements dv90.a, ea60, jp70, yxq, gn60, t2x0 {
    public static final jai b = new jai(112014624, new rai(1), false);
    public static final jai c;
    public static final jai d;
    public static final jai e;
    public static final StackTraceElement[] f;
    public static final sua g;

    static {
        new jai(866784315, new z9g(2), false);
        new jai(1714259275, new a74((byte) 0, 1), false);
        new jai(-1836397928, new iii(1), false);
        new jai(-1406416085, new bv4((byte) 0, 3), false);
        c = new jai(566090785, new lq2(3), false);
        new jai(-1624772335, new mq2(3), false);
        d = new jai(939725476, new pai(1), false);
        e = new jai(-1341284559, new oq2((byte) 0, 2), false);
        f = new StackTraceElement[0];
        g = new sua();
    }

    public static final q630 d(float f2, q630 q630Var, boolean z) {
        return q630Var.g(new ru3(f2, a5x.a, z));
    }

    public static final wq2 f(wq2 wq2Var) {
        wq2 c2 = wq2Var.c();
        int b2 = c2.b();
        for (int i = 0; i < b2; i++) {
            c2.e(wq2Var.a(i), i);
        }
        return c2;
    }

    public static String i(double d2, char c2) {
        return j(new BigDecimal(d2).divide(new BigDecimal(100)), c2);
    }

    public static String j(BigDecimal bigDecimal, char c2) {
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        decimalFormatSymbols.setDecimalSeparator(c2);
        decimalFormatSymbols.setGroupingSeparator((char) 8201);
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setGroupingSize(3);
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        String format = decimalFormat.format(bigDecimal.doubleValue());
        boolean E = drm0.E(format, c2);
        if (!E) {
            if (E) {
                throw new NoWhenBranchMatchedException();
            }
            return format;
        }
        String l0 = drm0.l0(format, c2);
        String h0 = drm0.h0(format, c2);
        if (h0.length() == 1) {
            h0 = h0.concat("0");
        }
        return v1v.a(c2, l0, h0);
    }

    public static InputStream k(Context context, Uri uri) throws IOException {
        String uri2 = uri.toString();
        if (!brm0.B(uri2, "content://com.google.android.apps.photos.contentprovider", false) || !drm0.D(uri2, "/ACTUAL", false)) {
            return context.getContentResolver().openInputStream(uri);
        }
        String str = "";
        String y = brm0.y(uri.toString(), "content://com.google.android.apps.photos.contentprovider", "");
        List c0 = drm0.c0(y, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6);
        if (c0.size() <= 4) {
            return context.getContentResolver().openInputStream(Uri.parse(y));
        }
        int size = c0.size() - 2;
        for (int i = 3; i < size; i++) {
            if (str.length() != 0) {
                str = str.concat(DomExceptionUtils.SEPARATOR);
            }
            StringBuilder e2 = fw3.e(str);
            e2.append((String) c0.get(i));
            str = e2.toString();
        }
        return context.getContentResolver().openInputStream(Uri.parse(URLDecoder.decode(str)));
    }

    public static final com.vk.catalog2.common.dto.api.ui.a l(UIBlock uIBlock) {
        return new com.vk.catalog2.common.dto.api.ui.a(uIBlock.b, uIBlock.c, uIBlock.d, uIBlock.e, uIBlock.f, uIBlock.g, uIBlock.h, uIBlock.Db(), uIBlock.j, uIBlock.l, uIBlock.m, uIBlock.n, uIBlock.p);
    }

    public static final Map m(lu60 lu60Var) {
        if (lu60Var instanceof bl60) {
            return ((bl60) lu60Var).e;
        }
        if (lu60Var instanceof al60) {
            return ((al60) lu60Var).g;
        }
        return null;
    }

    public static final boolean n(lu60 lu60Var) {
        return (lu60Var instanceof os60) || (lu60Var instanceof al60);
    }

    public static final boolean o(int i, int i2, long j) {
        int k = o6j.k(j);
        if (i > o6j.i(j) || k > i) {
            return false;
        }
        return i2 <= o6j.h(j) && o6j.j(j) <= i2;
    }

    public static final boolean p(VideoAlbum videoAlbum) {
        return fxc0.B().J().i1() && fkq0.b(videoAlbum.c);
    }

    public static final void q(Lazy lazy, fvv0 fvv0Var) {
        if (lazy.isInitialized()) {
            ((npf0) lazy.getValue()).r(fvv0Var);
        }
    }

    public static final void r(Lazy lazy) {
        if (lazy.isInitialized()) {
            ((npf0) lazy.getValue()).release();
        }
    }

    public static final void s(Editable editable) {
        if (drm0.N(editable.toString())) {
            editable.clear();
        }
        if (editable.length() > 2) {
            int H = drm0.H(editable);
            char charAt = editable.charAt(H);
            char charAt2 = editable.charAt(H - 1);
            char charAt3 = editable.charAt(H - 2);
            if (drm0.N(String.valueOf(charAt)) && drm0.N(String.valueOf(charAt2)) && drm0.N(String.valueOf(charAt3))) {
                editable.delete(H, H + 1);
            }
        }
    }

    public static final String t(PhotoAlbum photoAlbum) {
        int i = photoAlbum.b;
        UserId userId = photoAlbum.c;
        if (i == -9000) {
            return "https://" + a0a.d + "/tag" + userId.b;
        }
        return "https://" + a0a.d + "/album" + userId + '_' + (i != -15 ? i != -7 ? i != -6 ? String.valueOf(i) : "0" : "00" : "000");
    }

    public static final Boolean u(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return drm0.o0(((String) obj).toLowerCase(Locale.ROOT));
        }
        return null;
    }

    public static final gk9 v(fk9 fk9Var) {
        return new gk9(new Coordinates(fk9Var.getTarget().a, fk9Var.getTarget().b), new vm00(fk9Var.a()));
    }

    public static final Double w(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Double.valueOf((String) obj);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final Integer y(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Integer.valueOf((int) Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final Long z(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Long.valueOf((long) Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public List A(int i, Triple triple) {
        NewsEntry newsEntry = (NewsEntry) triple.d();
        NewsEntry newsEntry2 = (NewsEntry) triple.g();
        PollAttachment pollAttachment = (PollAttachment) triple.h();
        return Collections.singletonList(new xmb0(newsEntry, newsEntry2, pollAttachment, (pollAttachment.f.isClosed() || pollAttachment.f.Bb()) ? pollAttachment.f.isClosed() ? R.string.poll_result_title : R.string.poll_vote : R.string.poll_open_poll));
    }

    @Override // xsna.dv90.a
    public Object a(qdg0 qdg0Var) {
        return ((x2o0.b) qdg0Var).getActiveWalletId();
    }

    @Override // xsna.t2x0
    public boolean b(String str) {
        return true;
    }

    @Override // xsna.yxq
    public io.reactivex.rxjava3.core.x g(iw60 iw60Var) {
        jk60 jk60Var = new jk60(gcd0.g(iw60Var.a), iw60Var.c, Boolean.valueOf(iw60Var.d), iw60Var.j, ce60.b);
        jk60Var.D(iw60Var.f, CommonUrlParts.REQUEST_ID);
        String str = iw60Var.i;
        if (jk60.x.compareAndSet(true, false)) {
            jk60Var.K(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "initial");
        } else {
            jk60Var.K(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, str);
        }
        jk60Var.K("device_info", iw60Var.e);
        Boolean bool = iw60Var.k;
        if (bool != null) {
            jk60Var.R("has_cached_items", bool.booleanValue());
        }
        return rsg0.w0(jk60Var);
    }

    @Override // xsna.jp70
    public Object h() {
        return new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return A(0, (Triple) pair);
    }

    @Override // xsna.t2x0
    public void c(String str) {
    }
}
