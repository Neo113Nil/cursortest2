package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zznn;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vk.api.generated.articles.dto.ArticlesArticleDonutDto;
import com.vk.api.generated.articles.dto.ArticlesArticleDonutPlaceholderDto;
import com.vk.api.generated.articles.dto.ArticlesArticleDto;
import com.vk.api.generated.articles.dto.ArticlesArticleStateDto;
import com.vk.api.generated.audio.dto.AudioAudioAlbumDto;
import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseLinkButtonStyleDto;
import com.vk.api.generated.marusia.dto.MarusiaTtsDto;
import com.vk.api.generated.marusia.dto.MarusiaTtsMetaDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.articles.Article;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.articles.ArticleTts;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.article.ArticleTtsInfo;
import com.vk.dto.music.playlist.MarusiaTrackMeta;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserSex;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.MsgIncomingCallPrivacy;
import com.vk.im.engine.models.users.UserNameCase;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import ru.ok.android.webrtc.CallTimings;

/* compiled from: BlendMode.kt */
@vby
/* loaded from: classes11.dex */
public final class ne7 implements ydp0, q701, gn60, CallTimings {
    public static final ne7 b = new ne7();
    public static final jai c = new jai(907902844, new tji(0), false);
    public static final jai d = new jai(-605450721, new oci(3), false);
    public static final jai e = new jai(-1543866092, new woi(0), false);
    public static final ne7 f = new ne7();
    public static final ne7 g = new ne7();
    public static final /* synthetic */ ne7 h = new ne7();
    public static volatile jfe0 i;

    public static void A(int i2, String str, StackTraceElement stackTraceElement, String str2) {
        jfe0 jfe0Var = i;
        if (jfe0Var == null) {
            return;
        }
        if (stackTraceElement == null) {
            jfe0Var.b(i2, str, 0, "<null>", "<null>", str2);
            return;
        }
        String fileName = stackTraceElement.getFileName();
        jfe0Var.b(i2, str, stackTraceElement.getLineNumber(), fileName, stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName(), str2);
    }

    public static Article B(ArticlesArticleDto articlesArticleDto, Owner owner) {
        LinkButton linkButton;
        ArticleDonut.Placeholder placeholder;
        Action b2;
        ArticleDonut articleDonut;
        ArticleTts articleTts;
        Owner owner2;
        Thumb thumb;
        AlbumLink albumLink;
        UserId userId;
        Integer i2 = articlesArticleDto.i();
        int intValue = i2 != null ? i2.intValue() : 0;
        UserId q = articlesArticleDto.q();
        if (q == null) {
            q = UserId.d;
        }
        UserId userId2 = q;
        long intValue2 = articlesArticleDto.o() != null ? r0.intValue() : 0L;
        Integer D = articlesArticleDto.D();
        int intValue3 = D != null ? D.intValue() : 0;
        Boolean F = articlesArticleDto.F();
        boolean booleanValue = F != null ? F.booleanValue() : false;
        Boolean f2 = articlesArticleDto.f();
        boolean booleanValue2 = f2 != null ? f2.booleanValue() : true;
        Boolean l = articlesArticleDto.l();
        boolean booleanValue3 = l != null ? l.booleanValue() : false;
        Integer B = articlesArticleDto.B();
        int intValue4 = B != null ? B.intValue() : 0;
        Boolean e2 = articlesArticleDto.e();
        boolean booleanValue4 = e2 != null ? e2.booleanValue() : false;
        PhotosPhotoDto n = articlesArticleDto.n();
        Photo a = n != null ? xfa0.a(n) : null;
        ArticlesArticleDonutDto g2 = articlesArticleDto.g();
        boolean z = g2 != null && g2.e();
        ArticlesArticleDonutPlaceholderDto d2 = g2 != null ? g2.d() : null;
        if (d2 == null) {
            placeholder = null;
        } else {
            BaseLinkButtonDto d3 = d2.d();
            BaseLinkButtonActionDto e3 = d3.e();
            if (e3 == null || (b2 = wf6.b(e3)) == null) {
                linkButton = null;
            } else {
                String title = d3.getTitle();
                if (title == null) {
                    title = "";
                }
                BaseLinkButtonStyleDto o = d3.o();
                linkButton = new LinkButton(title, b2, o != null ? o.name() : null);
            }
            placeholder = new ArticleDonut.Placeholder(d2.e(), d2.getDescription(), linkButton);
        }
        ArticleDonut articleDonut2 = new ArticleDonut(z, placeholder);
        MarusiaTtsDto k = articlesArticleDto.k();
        if (k != null) {
            MarusiaTtsMetaDto d4 = k.d();
            AudioAudioAlbumDto d5 = d4.d();
            if (d5 == null) {
                articleDonut = articleDonut2;
                albumLink = null;
            } else {
                AudioPhotoDto f3 = d5.f();
                if (f3 == null) {
                    articleDonut = articleDonut2;
                    thumb = null;
                } else {
                    String id = f3.getId();
                    String str = id != null ? id.toString() : null;
                    int height = f3.getHeight();
                    int width = f3.getWidth();
                    SparseArray sparseArray = new SparseArray();
                    String i3 = f3.i();
                    Uri parse = i3 == null ? null : Uri.parse(i3);
                    articleDonut = articleDonut2;
                    if (parse != null) {
                        sparseArray.append(34, parse);
                    }
                    String k2 = f3.k();
                    Uri parse2 = k2 == null ? null : Uri.parse(k2);
                    if (parse2 != null) {
                        sparseArray.append(68, parse2);
                    }
                    String e4 = f3.e();
                    Uri parse3 = e4 == null ? null : Uri.parse(e4);
                    if (parse3 != null) {
                        sparseArray.append(135, parse3);
                    }
                    String f4 = f3.f();
                    Uri parse4 = f4 == null ? null : Uri.parse(f4);
                    if (parse4 != null) {
                        sparseArray.append(atv0.b, parse4);
                    }
                    String g3 = f3.g();
                    Uri parse5 = g3 == null ? null : Uri.parse(g3);
                    if (parse5 != null) {
                        sparseArray.append(300, parse5);
                    }
                    String j = f3.j();
                    Uri parse6 = j == null ? null : Uri.parse(j);
                    if (parse6 != null) {
                        sparseArray.append(600, parse6);
                    }
                    String d6 = f3.d();
                    Uri parse7 = d6 == null ? null : Uri.parse(d6);
                    if (parse7 != null) {
                        sparseArray.append(1200, parse7);
                    }
                    thumb = new Thumb(str, width, height, sparseArray);
                }
                albumLink = new AlbumLink(d5.getId(), d5.q(), d5.d(), d5.getTitle(), thumb, null, 32, null);
            }
            String e5 = d4.e();
            String title2 = d4.getTitle();
            Integer f5 = d4.f();
            MarusiaTrackMeta marusiaTrackMeta = new MarusiaTrackMeta(e5, 0, null, 0L, title2, null, f5 != null ? f5.intValue() : 0, d4.getUrl(), albumLink, 19, false, null, null, 0L, false, false, false, false, null, null);
            AudioAudioAlbumDto d7 = k.d().d();
            int id2 = d7 != null ? d7.getId() : 0;
            if (d7 == null || (userId = d7.q()) == null) {
                userId = UserId.d;
            }
            articleTts = new ArticleTts(marusiaTrackMeta, new ArticleTtsInfo(id2, userId, k.getUrl(), k.e(), k.f()));
        } else {
            articleDonut = articleDonut2;
            articleTts = null;
        }
        String d8 = articlesArticleDto.d();
        String title3 = articlesArticleDto.getTitle();
        String u = articlesArticleDto.u();
        if (owner == null) {
            UserId q2 = articlesArticleDto.q();
            if (q2 == null) {
                q2 = UserId.d;
            }
            owner2 = new Owner(q2, articlesArticleDto.P(), null, articlesArticleDto.M0(), null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194292, null);
        } else {
            owner2 = owner;
        }
        String url = articlesArticleDto.getUrl();
        String C = articlesArticleDto.C();
        ArticlesArticleStateDto p = articlesArticleDto.p();
        return new Article(intValue, userId2, d8, intValue2, title3, u, owner2, url, C, p != null ? p.i() : null, a, intValue3, booleanValue, booleanValue2, booleanValue3, articleDonut, articleTts, articlesArticleDto.j(), intValue4, booleanValue4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    public static Integer C(@Nullable String str) {
        char c2;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1118317585:
                if (str.equals("REPEAT_ALL_AND_SHUFFLE")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -962896020:
                if (str.equals("REPEAT_SINGLE")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1645938909:
                if (str.equals("REPEAT_ALL")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1645952171:
                if (str.equals("REPEAT_OFF")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return 0;
        }
        if (c2 == 1) {
            return 1;
        }
        if (c2 != 2) {
            return c2 != 3 ? null : 3;
        }
        return 2;
    }

    public static final CharSequence D(int i2, CharSequence charSequence) {
        if (charSequence.length() >= 200) {
            if (i2 != -1) {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                String str = i3 <= 0 ? "" : ".....";
                String str2 = i4 >= charSequence.length() ? "" : ".....";
                StringBuilder e2 = fw3.e(str);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length = charSequence.length();
                if (i4 > length) {
                    i4 = length;
                }
                e2.append(charSequence.subSequence(i3, i4).toString());
                e2.append(str2);
                return e2.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static Object[] E(int i2, Object[] objArr) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i2);
    }

    public static String F(int i2) {
        return i2 == 0 ? "Clear" : i2 == 1 ? "Src" : i2 == 2 ? "Dst" : i2 == 3 ? "SrcOver" : i2 == 4 ? "DstOver" : i2 == 5 ? "SrcIn" : i2 == 6 ? "DstIn" : i2 == 7 ? "SrcOut" : i2 == 8 ? "DstOut" : i2 == 9 ? "SrcAtop" : i2 == 10 ? "DstAtop" : i2 == 11 ? "Xor" : i2 == 12 ? "Plus" : i2 == 13 ? "Modulate" : i2 == 14 ? "Screen" : i2 == 15 ? "Overlay" : i2 == 16 ? "Darken" : i2 == 17 ? "Lighten" : i2 == 18 ? "ColorDodge" : i2 == 19 ? "ColorBurn" : i2 == 20 ? "HardLight" : i2 == 21 ? "Softlight" : i2 == 22 ? "Difference" : i2 == 23 ? "Exclusion" : i2 == 24 ? "Multiply" : i2 == 25 ? "Hue" : i2 == 26 ? "Saturation" : i2 == 27 ? "Color" : i2 == 28 ? "Luminosity" : DeviceInfo.STR_TYPE_UNKNOWN;
    }

    public static final String H(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) D(-1, str2));
    }

    public static final int I(int i2) {
        int i3 = 306783378 & i2;
        int i4 = 613566756 & i2;
        return (i2 & (-920350135)) | (i4 >> 1) | i3 | ((i3 << 1) & i4);
    }

    public static void J(String str, String str2) {
        jfe0 jfe0Var = i;
        if (jfe0Var == null || !jfe0Var.a(2, str)) {
            return;
        }
        A(2, str, r(), str2);
    }

    public static void K(String str, String str2, Throwable th) {
        jfe0 jfe0Var = i;
        if (jfe0Var == null || !jfe0Var.a(2, str)) {
            return;
        }
        StackTraceElement r = r();
        StringBuilder b2 = v1v.b(str2, '\n');
        b2.append(Log.getStackTraceString(th));
        A(2, str, r, b2.toString());
    }

    @Nullable
    public static String L(@Nullable Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return "REPEAT_OFF";
        }
        if (intValue == 1) {
            return "REPEAT_ALL";
        }
        if (intValue == 2) {
            return "REPEAT_SINGLE";
        }
        if (intValue != 3) {
            return null;
        }
        return "REPEAT_ALL_AND_SHUFFLE";
    }

    public static final JsonEncodingException a(String str, Number number) {
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) D(-1, str)));
    }

    public static final JsonEncodingException b(SerialDescriptor serialDescriptor) {
        return new JsonEncodingException("Value of type '" + serialDescriptor.f() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException c(int i2, String str) {
        if (i2 >= 0) {
            str = com.vk.movika.sdk.base.model.history.b.b(i2, "Unexpected JSON token at offset ", ": ", str);
        }
        return new JsonDecodingException(str);
    }

    public static final JsonDecodingException d(String str, CharSequence charSequence, int i2) {
        StringBuilder b2 = ho8.b(str, "\nJSON input: ");
        b2.append((Object) D(i2, charSequence));
        return c(i2, b2.toString());
    }

    public static final aog0 e(zhf0 zhf0Var, long j, long j2, long j3, long j4) {
        return new aog0(zhf0Var.a, zhf0Var.b, zhf0Var.c, zhf0Var.d, j, j2, j3, j4);
    }

    public static final aog0 f(float f2, float f3, float f4, float f5, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new aog0(f2, f3, f4, f5, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final NewsEntry g(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("NEWS_ENTRY", NewsEntry.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("NEWS_ENTRY");
            if (!(parcelable3 instanceof NewsEntry)) {
                parcelable3 = null;
            }
            parcelable = (NewsEntry) parcelable3;
        }
        return (NewsEntry) parcelable;
    }

    public static final UserId h(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("OWNER_ID", UserId.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("OWNER_ID");
            if (!(parcelable3 instanceof UserId)) {
                parcelable3 = null;
            }
            parcelable = (UserId) parcelable3;
        }
        return (UserId) parcelable;
    }

    public static final Playlist i(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("USER_PLAYLIST", Playlist.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("USER_PLAYLIST");
            if (!(parcelable3 instanceof Playlist)) {
                parcelable3 = null;
            }
            parcelable = (Playlist) parcelable3;
        }
        return (Playlist) parcelable;
    }

    public static final boolean j(int i2, KeyEvent keyEvent) {
        return ((int) (zq70.u(keyEvent) >> 32)) == i2;
    }

    public static void k(int i2, Object obj) {
        if (obj == null) {
            throw new NullPointerException(lhg.a(i2, "at index "));
        }
    }

    public static void l(Object... objArr) {
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            k(i2, objArr[i2]);
        }
    }

    public static void m(String str, String str2) {
        jfe0 jfe0Var = i;
        if (jfe0Var == null || !jfe0Var.a(0, str)) {
            return;
        }
        A(0, str, r(), str2);
    }

    public static void n(String str, String str2) {
        jfe0 jfe0Var = i;
        if (jfe0Var == null || !jfe0Var.a(3, str)) {
            return;
        }
        A(3, str, r(), str2);
    }

    public static void o(String str, String str2, Throwable th) {
        jfe0 jfe0Var = i;
        if (jfe0Var == null || !jfe0Var.a(3, str)) {
            return;
        }
        StackTraceElement r = r();
        StringBuilder b2 = v1v.b(str2, '\n');
        b2.append(Log.getStackTraceString(th));
        A(3, str, r, b2.toString());
    }

    public static void p(String str, String str2) {
        jfe0 jfe0Var = i;
        if (jfe0Var == null || !jfe0Var.a(4, str)) {
            return;
        }
        A(4, str, r(), str2);
    }

    public static String q(MsgIncomingCallPrivacy msgIncomingCallPrivacy, com.vk.movika.sdk.android.defaultplayer.layout.a aVar, ProfilesSimpleInfo profilesSimpleInfo) {
        Context context = aVar.a;
        if (!msgIncomingCallPrivacy.i) {
            return context.getString(R.string.vkim_msg_incoming_call_privacy_outgoing);
        }
        qtd0 Ab = profilesSimpleInfo.Ab(Long.valueOf(msgIncomingCallPrivacy.c));
        if (Ab == null) {
            return "";
        }
        return context.getString(Ab.B2() == UserSex.FEMALE ? R.string.vkim_msg_incoming_call_privacy_incoming_female : R.string.vkim_msg_incoming_call_privacy_incoming_male, Arrays.copyOf(new Object[]{Ab.d6(UserNameCase.NOM)}, 1));
    }

    public static StackTraceElement r() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= 4) {
            return null;
        }
        return stackTrace[4];
    }

    public static final gkq0 s(RequestUserProfile requestUserProfile) {
        return new gkq0(requestUserProfile.c, requestUserProfile.t0);
    }

    public static void t(String str, String str2) {
        jfe0 jfe0Var = i;
        if (jfe0Var == null || !jfe0Var.a(1, str)) {
            return;
        }
        A(1, str, r(), str2);
    }

    public static final void u(af afVar, String str) {
        afVar.p(afVar.a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static /* synthetic */ void v(af afVar) {
        u(afVar, "object");
        throw null;
    }

    public static void w(View view, VideoFile videoFile) {
        hg1.b(view, hg1.m(rsg0.y0(yfb.x(tft0.b(new uft0(), videoFile.I0(), videoFile.o0(), Boolean.TRUE, videoFile.r(), null, 104)), null, null, 3), view.getContext(), 0L, false, 62).subscribe(new be50(new o010(videoFile, 18), 4), new dh40(new bws(6), 6)));
    }

    public static boolean y(int i2, String str) {
        jfe0 jfe0Var = i;
        return jfe0Var != null && jfe0Var.a(i2, str);
    }

    public static final boolean z(aog0 aog0Var) {
        long j = aog0Var.e;
        return (j >>> 32) == (4294967295L & j) && j == aog0Var.f && j == aog0Var.g && j == aog0Var.h;
    }

    public List G(int i2, Triple triple) {
        NewsEntry newsEntry = (NewsEntry) triple.d();
        NewsEntry newsEntry2 = (NewsEntry) triple.g();
        AlbumAttachment albumAttachment = (AlbumAttachment) triple.h();
        String str = albumAttachment.m;
        int i3 = albumAttachment.y;
        Photo photo = albumAttachment.l;
        return Collections.singletonList(new gcg0(newsEntry, newsEntry2, albumAttachment, str, i3, photo.y, photo.Ib(), photo.Hb()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return G(0, (Triple) pair);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Integer.valueOf((int) zznn.zzv());
    }

    @Override // ru.ok.android.webrtc.CallTimings
    public void trace(String str) {
    }
}
