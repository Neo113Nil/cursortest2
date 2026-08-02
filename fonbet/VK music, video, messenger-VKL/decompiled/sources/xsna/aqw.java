package xsna;

import android.content.Context;
import android.graphics.Color;
import android.os.Looper;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.articles.dto.ArticlesArticleDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseLinkDto;
import com.vk.api.generated.base.dto.BaseLinkProductDto;
import com.vk.api.generated.base.dto.BaseLinkRatingDto;
import com.vk.api.generated.base.dto.BaseOwnerButtonActionTargetDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.snippets.dto.SnippetsAmpDto;
import com.vk.api.generated.stickers.dto.StickersPackLinkItemDto;
import com.vk.api.generated.vmoji.dto.VmojiAvatarLinkItemDto;
import com.vk.common.links.AwayLink;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.preference.Preference;
import com.vk.dto.articles.AMP;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.Merchant;
import com.vk.dto.attachments.Product;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.attachments.VmojiAttachInfo;
import com.vk.dto.common.Price;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.fave.entities.FaveSource;
import com.vk.fave.entities.FaveType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;

/* compiled from: ImportButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class aqw implements pl50, p7f0 {
    public static final aqw b = new aqw();
    public static final jai c = new jai(220644748, new gre(2), false);
    public static final jai d = new jai(1985671278, new fhi(0, 0), false);

    public static final y18 a(float f, long j) {
        return new y18(f, new rek0(j));
    }

    public static final s8u0 c(String str, String str2, i9z i9zVar) {
        int i;
        s8u0 s8u0Var = new s8u0(0);
        int K = drm0.K(0, 6, str, "{link}", false);
        int K2 = drm0.K(0, 6, str, "{/link}", false);
        if (K == -1 || K2 == -1 || K2 <= (i = K + 6)) {
            s8u0Var.e(str);
            return s8u0Var;
        }
        s8u0Var.e(str.substring(0, K));
        String substring = str.substring(i, K2);
        int length = s8u0Var.a.length();
        s8u0Var.e(substring);
        VkColorToken vkColorToken = VkColorToken.TextLink;
        s8u0Var.d(new klv0(null, vkColorToken), length, substring.length() + length);
        if (i9zVar != null) {
            s8u0Var.b(new i2v0(str2, new zqv0(new klv0(null, vkColorToken), 14), i9zVar), length, substring.length() + length);
        }
        int i2 = K2 + 7;
        if (i2 < str.length()) {
            s8u0Var.e(str.substring(i2));
        }
        return s8u0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(String str, byte[] bArr) {
        if (bArr.length == str.length()) {
            k9x k9xVar = new k9x(0, bArr.length - 1, 1);
            if (!(k9xVar instanceof Collection) || !((Collection) k9xVar).isEmpty()) {
                j9x it = k9xVar.iterator();
                while (it.d) {
                    int nextInt = it.nextInt();
                    if (((byte) str.charAt(nextInt)) != bArr[nextInt]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final int e(AudioBook audioBook) {
        return audioBook.u;
    }

    public static void g(InputStream inputStream) throws IOException {
        inputStream.read();
        inputStream.read();
        inputStream.read();
        inputStream.read();
    }

    public static Pair h(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        int read = inputStream.read() & 255;
        int read2 = inputStream.read() & 255;
        int read3 = inputStream.read() & 255;
        if (read != 157 || read2 != 1 || read3 != 42) {
            return null;
        }
        return new Pair(Integer.valueOf((inputStream.read() & 255) | ((inputStream.read() & 255) << 8)), Integer.valueOf(((inputStream.read() & 255) << 8) | (inputStream.read() & 255)));
    }

    public static Pair i(InputStream inputStream) throws IOException {
        g(inputStream);
        if ((inputStream.read() & 255) != 47) {
            return null;
        }
        int read = inputStream.read() & 255;
        int read2 = inputStream.read();
        return new Pair(Integer.valueOf((read | ((read2 & 63) << 8)) + 1), Integer.valueOf((((inputStream.read() & 15) << 10) | ((inputStream.read() & 255) << 2) | ((read2 & PsExtractor.AUDIO_STREAM) >> 6)) + 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SnippetAttachment j(BaseLinkDto baseLinkDto, Map map) {
        Product product;
        Article article;
        VmojiAttachInfo vmojiAttachInfo;
        VmojiAttachInfo vmojiAttachInfo2;
        SnippetsAmpDto d2;
        AMP amp;
        Float d3;
        BaseLinkButtonActionDto e;
        if (baseLinkDto == null) {
            return null;
        }
        PhotosPhotoDto i = baseLinkDto.i();
        Photo a = i != null ? xfa0.a(i) : null;
        BaseLinkProductDto l = baseLinkDto.l();
        if (l != null) {
            Price i2 = b210.i(l.k());
            Integer j = l.j();
            int intValue = j != null ? j.intValue() : 0;
            String i3 = l.i();
            Merchant.Companion.getClass();
            product = new Product(i2, intValue, Merchant.a.a(i3), eg6.a(l.e()), l.d());
        } else {
            product = null;
        }
        BaseLinkButtonDto e2 = baseLinkDto.e();
        String title = e2 != null ? e2.getTitle() : null;
        BaseLinkButtonDto e3 = baseLinkDto.e();
        String url = (e3 == null || (e = e3.e()) == null) ? null : e.getUrl();
        BaseLinkRatingDto n = baseLinkDto.n();
        float floatValue = (n == null || (d3 = n.d()) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : d3.floatValue();
        BaseLinkButtonDto e4 = baseLinkDto.e();
        ButtonAction a2 = e4 != null ? xf6.a(e4.e()) : null;
        Boolean C = baseLinkDto.C();
        Boolean bool = Boolean.TRUE;
        boolean f = epx.f(C, bool);
        ArticlesArticleDto j2 = baseLinkDto.j();
        if (j2 != null) {
            article = ne7.B(j2, map != null ? (Owner) map.get(j2.q()) : null);
        } else {
            article = null;
        }
        VmojiAvatarLinkItemDto B = baseLinkDto.B();
        StickersPackLinkItemDto o = baseLinkDto.o();
        if (B != null) {
            vmojiAttachInfo2 = new VmojiAttachInfo(false, Integer.valueOf(Color.parseColor(B.d())));
        } else {
            if (o == null) {
                vmojiAttachInfo = null;
                String title2 = baseLinkDto.getTitle();
                String description = baseLinkDto.getDescription();
                String f2 = baseLinkDto.f();
                AwayLink awayLink = new AwayLink(baseLinkDto.getUrl(), null);
                BaseOwnerButtonActionTargetDto p = baseLinkDto.p();
                String i4 = p == null ? p.i() : null;
                d2 = baseLinkDto.d();
                if (d2 != null) {
                    amp = null;
                } else {
                    String url2 = d2.getUrl();
                    if (url2 == null) {
                        url2 = "";
                    }
                    String str = url2;
                    Integer d4 = d2.d();
                    amp = new AMP(str, d4 != null ? d4.intValue() : 0, epx.f(d2.e(), bool));
                }
                String k = baseLinkDto.k();
                String id = baseLinkDto.getId();
                BaseLinkButtonDto e5 = baseLinkDto.e();
                return new SnippetAttachment(title2, description, f2, awayLink, i4, a, amp, product, title, url, floatValue, k, a2, f, id, false, article, null, e5 == null ? e5.l() : null, null, vmojiAttachInfo, null, null, 0, null);
            }
            vmojiAttachInfo2 = new VmojiAttachInfo(o.d(), null);
        }
        vmojiAttachInfo = vmojiAttachInfo2;
        String title22 = baseLinkDto.getTitle();
        String description2 = baseLinkDto.getDescription();
        String f22 = baseLinkDto.f();
        AwayLink awayLink2 = new AwayLink(baseLinkDto.getUrl(), null);
        BaseOwnerButtonActionTargetDto p2 = baseLinkDto.p();
        if (p2 == null) {
        }
        d2 = baseLinkDto.d();
        if (d2 != null) {
        }
        String k2 = baseLinkDto.k();
        String id2 = baseLinkDto.getId();
        BaseLinkButtonDto e52 = baseLinkDto.e();
        return new SnippetAttachment(title22, description2, f22, awayLink2, i4, a, amp, product, title, url, floatValue, k2, a2, f, id2, false, article, null, e52 == null ? e52.l() : null, null, vmojiAttachInfo, null, null, 0, null);
    }

    public static final void k(y2k0 y2k0Var, fd3 fd3Var, int i) {
        while (true) {
            int i2 = y2k0Var.v;
            if (i > i2 && i < y2k0Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            y2k0Var.U();
            if (y2k0Var.D(y2k0Var.v)) {
                fd3Var.j();
            }
            y2k0Var.j();
        }
    }

    public static final void l(ComposeView composeView, jai jaiVar) {
        if (composeView.isAttachedToWindow()) {
            composeView.setContent(jaiVar);
        } else {
            composeView.addOnAttachStateChangeListener(new lri(composeView, composeView, jaiVar));
        }
    }

    public static void m(int i, Context context) {
        String string = context.getResources().getString(i);
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            Toast.makeText(context, string, 0).show();
        } else {
            i0q0.e(new y(7, string, context));
        }
    }

    public static final Pair n(w2w w2wVar, izs izsVar) {
        Long q;
        Object invoke;
        int i = 0;
        do {
            i++;
            q = w2wVar.I0().system().q();
            invoke = izsVar.invoke(Integer.valueOf(i));
        } while (!epx.f(q, w2wVar.I0().system().q()));
        return new Pair(Integer.valueOf(i), invoke);
    }

    public static final void o(q7v0 q7v0Var, String str, wzs wzsVar) {
        q7v0Var.init();
        q7v0Var.c(new jch(6, q7v0Var, wzsVar, str));
    }

    public static final nla p(mla mlaVar) {
        return new nla(mlaVar);
    }

    public static void q(ByteBuffer byteBuffer, double d2) {
        int i = (int) (d2 * 1.073741824E9d);
        byteBuffer.put((byte) (((-16777216) & i) >> 24));
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & 255));
    }

    public static void r(ByteBuffer byteBuffer, double d2) {
        int i = (int) (d2 * 65536.0d);
        byteBuffer.put((byte) (((-16777216) & i) >> 24));
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & 255));
    }

    public static void s(ByteBuffer byteBuffer, double d2) {
        short s = (short) (d2 * 256.0d);
        byteBuffer.put((byte) ((65280 & s) >> 8));
        byteBuffer.put((byte) (s & 255));
    }

    public static void t(String str, ByteBuffer byteBuffer) {
        if (str.getBytes().length != 3) {
            throw new IllegalArgumentException(zr.a("\"", str, "\" language string isn't exactly 3 characters long!"));
        }
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            i += (str.getBytes()[i2] - 96) << ((2 - i2) * 5);
        }
        u(i, byteBuffer);
    }

    public static void u(int i, ByteBuffer byteBuffer) {
        w((65535 & i) >> 8, byteBuffer);
        byteBuffer.put((byte) (i & 255));
    }

    public static void v(int i, ByteBuffer byteBuffer) {
        u((16777215 & i) >> 8, byteBuffer);
        byteBuffer.put((byte) (i & 255));
    }

    public static void w(int i, ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (i & 255));
    }

    public static void x(String str, ByteBuffer byteBuffer) {
        byteBuffer.put(imj0.b(str));
        byteBuffer.put((byte) 0);
    }

    @Override // xsna.pl50
    public void b(gzs gzsVar) {
    }

    public io.reactivex.rxjava3.internal.operators.single.b0 f(Integer num, FaveType faveType, pqq pqqVar, String str) {
        rsg0 z;
        String str2 = pqqVar.b;
        FaveSource faveSource = pqqVar.d;
        boolean z2 = faveSource != null && faveSource == FaveSource.SNACKBAR;
        if (num == null) {
            hz2 z3 = yfb.z(fdi.r(new fdi(), faveType != null ? hqq.a(faveType) : null, null, str, null, 30, hqq.a, Boolean.valueOf(z2), str2, 2), new n82(21));
            z3.C(1, "photo_sizes");
            dz2 x = yfb.x(new fdi().s(0, 1, null, null, null, null));
            x.C(1, "photo_sizes");
            rsg0 grtVar = new grt(z3, x);
            grtVar.q = 1;
            z = grtVar;
        } else {
            z = yfb.z(new fdi().q(faveType != null ? hqq.a(faveType) : null, num, str, null, 30, hqq.a, Boolean.valueOf(z2), null, str2), new x8m(6));
            z.C(1, "photo_sizes");
            z.q = 1;
        }
        return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.W(z, 7), new mm6(new arq(str, this, num, faveType, pqqVar, 0), 16)).m(asu0.a.d());
    }

    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        return Preference.n("VkVideoBridge", "VkVideoBridge.selected_user_ids");
    }

    @Override // xsna.p7f0
    public void setValue(Object obj, qcy qcyVar, Object obj2) {
        Preference.J("VkVideoBridge", "VkVideoBridge.selected_user_ids", (Long[]) obj2);
    }
}
