package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.measurement.zznn;
import com.huawei.hms.adapter.internal.CommonCode;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.core.preference.Preference;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.OptionalNativeAdEntry;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.EntryTitle;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.feed.core.models.attachment.EntryPhotoStyle;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.YandexNativeAdEntry;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.push.common.HostInfoProvider;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import com.vk.voip.dto.RecordType;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketLinkAttachment;
import com.vkontakte.android.attachments.MarketMessageOwnerAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.c8o0;

/* compiled from: VkTooltip.kt */
@vby
/* loaded from: classes17.dex */
public final class atv0 implements kwn, h300, k6o, q701, hgs, gn60, HostInfoProvider, io.reactivex.rxjava3.functions.k {
    public static final int b = 270;
    public static final atv0 c = new atv0();
    public static final atv0 d = new atv0();
    public static final /* synthetic */ atv0 e = new atv0();
    public static final String[] f = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
    public static final String[] g = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] h = {"items"};
    public static final String[] i = {"affiliation", "coupon", "creative_name", "creative_slot", InAppPurchaseMetaData.KEY_CURRENCY, "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", CommonCode.MapKey.TRANSACTION_ID, "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    public static final yiz h() {
        return new yiz();
    }

    public static byte[] i(@NonNull byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final ComponentName k(List list) {
        List<ResolveInfo> list2 = list;
        int e2 = on00.e(c5g.u(list2, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (ResolveInfo resolveInfo : list2) {
            Pair pair = new Pair(resolveInfo.serviceInfo.packageName, resolveInfo);
            linkedHashMap.put(pair.i(), pair.j());
        }
        ResolveInfo resolveInfo2 = (ResolveInfo) linkedHashMap.get("ru.vk.store.qa");
        if (resolveInfo2 == null) {
            resolveInfo2 = (ResolveInfo) linkedHashMap.get("ru.vk.store");
        }
        if (resolveInfo2 == null) {
            return null;
        }
        ServiceInfo serviceInfo = resolveInfo2.serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    public static final c8o0 l(double d2) {
        return new c8o0(d2, c8o0.a.CELSIUS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0175, code lost:
    
        if (r0.b.isEmpty() == false) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.vk.dto.common.ThemedColor, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CompactAttachmentStyle m(Attachment attachment, Context context, ndc0 ndc0Var) {
        Image image;
        Image image2;
        int i2 = 2;
        if (attachment instanceof ArticleAttachment) {
            Article article = ((ArticleAttachment) attachment).f;
            Photo photo = article.l;
            List singletonList = (photo == null || (image2 = photo.y) == null) ? EmptyList.b : Collections.singletonList(image2);
            return new CompactAttachmentStyle(null, null, singletonList, EntryPhotoStyle.Squircle, singletonList.isEmpty() ? "article_box_outline" : null, new EntryTitle(new Text(article.f, r5, i2, r5), false), new Description(new Text(article.g, r5, i2, r5), null, null, null, null, false, false, false, PsExtractor.AUDIO_STREAM, null), null);
        }
        if (attachment instanceof AlbumAttachment) {
            AlbumAttachment albumAttachment = (AlbumAttachment) attachment;
            List singletonList2 = Collections.singletonList(albumAttachment.l.y);
            EntryTitle entryTitle = new EntryTitle(new Text(albumAttachment.m, r5, i2, r5), false);
            Resources resources = context.getResources();
            int i3 = albumAttachment.y;
            return new CompactAttachmentStyle(null, null, singletonList2, EntryPhotoStyle.Squircle, null, entryTitle, new Description(new Text(resources.getQuantityString(R.plurals.photos_count, i3, Integer.valueOf(i3)), r5, i2, r5), null, null, null, null, false, false, false, PsExtractor.AUDIO_STREAM, null), null);
        }
        boolean z = attachment instanceof DocumentAttachment;
        if (z) {
            DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
            if (documentAttachment.x5()) {
                Image Gb = documentAttachment.Gb();
                return new CompactAttachmentStyle(null, null, Gb != null ? Collections.singletonList(Gb) : EmptyList.b, EntryPhotoStyle.Square, null, new EntryTitle(new Text(documentAttachment.i.toUpperCase(Locale.ROOT), r5, i2, r5), false), null, null);
            }
        }
        if ((attachment instanceof PendingDocumentAttachment) && cgc0.a(attachment)) {
            return u64.b((DocumentAttachment) attachment, context, true);
        }
        if (z && cgc0.a(attachment)) {
            return u64.b((DocumentAttachment) attachment, context, false);
        }
        if (attachment instanceof PhotoAttachment) {
            return u64.a(context.getResources().getString(R.string.photo_attach_title), context.getResources().getString(R.string.photo_attach_status_loaded), true, Collections.singletonList(((PhotoAttachment) attachment).l.y));
        }
        if (attachment instanceof PendingPhotoAttachment) {
            return u64.a(context.getResources().getString(R.string.photo_attach_title), context.getResources().getString(R.string.photo_attach_status_loading), false, EmptyList.b);
        }
        if (attachment instanceof SnippetAttachment) {
            SnippetAttachment snippetAttachment = (SnippetAttachment) attachment;
            if (snippetAttachment.Fb() && ndc0Var.b) {
                Photo photo2 = snippetAttachment.p;
                if (photo2 != null) {
                    image = photo2.y;
                }
                image = null;
                List singletonList3 = image != null ? Collections.singletonList(image) : EmptyList.b;
                return new CompactAttachmentStyle(null, null, singletonList3, EntryPhotoStyle.Square, singletonList3.isEmpty() ? "external_link_outline" : 0, new EntryTitle(new Text(snippetAttachment.g, r5, i2, r5), false), new Description(new Text(snippetAttachment.f.b, r5, i2, r5), null, null, null, null, false, false, false, PsExtractor.AUDIO_STREAM, null), null);
            }
        }
        if (attachment instanceof LinkAttachment) {
            LinkAttachment linkAttachment = (LinkAttachment) attachment;
            return new CompactAttachmentStyle(null, null, EmptyList.b, EntryPhotoStyle.Square, "external_link_outline", new EntryTitle(new Text(linkAttachment.g, r5, i2, r5), false), new Description(new Text(linkAttachment.f.b, r5, i2, r5), null, null, null, null, false, false, false, PsExtractor.AUDIO_STREAM, null), null);
        }
        if (attachment instanceof MarketLinkAttachment) {
            return new CompactAttachmentStyle(null, null, EmptyList.b, EntryPhotoStyle.Squircle, "storefront_outline", new EntryTitle(new Text(context.getString(R.string.market_link_title), r5, i2, r5), false), new Description(new Text(((MarketLinkAttachment) attachment).f, r5, i2, r5), null, null, null, null, false, false, false, PsExtractor.AUDIO_STREAM, null), null);
        }
        if (attachment instanceof MarketMessageOwnerAttachment) {
            return new CompactAttachmentStyle(null, null, EmptyList.b, EntryPhotoStyle.Squircle, "message_outline", new EntryTitle(new Text(context.getString(R.string.market_messages_to_owner_title), r5, i2, r5), false), new Description(new Text(context.getString(R.string.market_messages_to_owner_posting_description), r5, i2, r5), null, null, null, null, false, false, false, PsExtractor.AUDIO_STREAM, null), null);
        }
        return null;
    }

    public static long n(String str) {
        boolean B = brm0.B(str, "c", false);
        if (!B) {
            if (B) {
                throw new NoWhenBranchMatchedException();
            }
            return cqm0.l(str);
        }
        long l = cqm0.l(str.substring(1));
        if (l > 0) {
            return l + 2000000000;
        }
        return 0L;
    }

    @NonNull
    public static byte[] o(@NonNull InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                throw new IllegalStateException(lhg.a(i2, "Not enough bytes to read: "));
            }
            i3 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] p(@NonNull FileInputStream fileInputStream, int i2, int i3) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static long q(@NonNull InputStream inputStream, int i2) throws IOException {
        byte[] o = o(inputStream, i2);
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j += (o[i3] & 255) << (i3 * 8);
        }
        return j;
    }

    public static void r() {
        hzg0 hzg0Var = pjp.a;
        pjp.c("vk_pay_token", null);
        Preference.C("vk_pay", "vk_pay_token");
    }

    public static io.reactivex.rxjava3.internal.operators.observable.v0 s(VkCheckoutPayMethod vkCheckoutPayMethod, String str) {
        a8c a8cVar = sdi.f;
        int i2 = 9;
        io.reactivex.rxjava3.internal.operators.single.h hVar = new io.reactivex.rxjava3.internal.operators.single.h(a8c.e(a8c.d(a8cVar.a.g(vkCheckoutPayMethod, str))), new k5(new j5(a8cVar, 14), i2));
        return new io.reactivex.rxjava3.internal.operators.observable.v0(new io.reactivex.rxjava3.internal.operators.flowable.y0(new io.reactivex.rxjava3.internal.operators.flowable.p0(hVar.u(), new z250(new k990(23), i2)), new j630(new qyn0(2), 20)));
    }

    public static final Image t(List list) {
        List<BaseImageDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (BaseImageDto baseImageDto : list2) {
            arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
        }
        return new Image(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ListBuilder v(NewsEntry newsEntry) {
        String e2;
        int K;
        Owner s;
        ListBuilder e3 = e43.e();
        if (fkq0.d(k9q0.o(newsEntry))) {
            l490 l490Var = newsEntry instanceof l490 ? (l490) newsEntry : null;
            if (l490Var == null || (s = l490Var.s()) == null || (e2 = s.h) == null) {
                e2 = "";
            }
        } else {
            e2 = y8g0.e(R.string.newdfeed_community_gen);
        }
        String f2 = y8g0.f(R.string.newsfeed_item_ignored_message, e2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f2);
        qaz qazVar = new qaz("vkontakte://profile/" + k9q0.o(newsEntry), 0);
        qazVar.b = true;
        qazVar.b(R.attr.vk_ui_text_secondary);
        if (e2.length() > 0 && (K = drm0.K(0, 6, f2, e2, false)) >= 0) {
            spannableStringBuilder.setSpan(qazVar, K, e2.length() + K, 33);
        }
        e3.add(new fwv(y8g0.e(R.string.newsfeed_item_ignored_title), spannableStringBuilder, newsEntry));
        return e3.g();
    }

    public static void w(@NonNull ByteArrayOutputStream byteArrayOutputStream, long j, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void y(@NonNull ByteArrayOutputStream byteArrayOutputStream, int i2) throws IOException {
        w(byteArrayOutputStream, i2, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.functions.k
    public Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        RecordType recordType;
        boolean z;
        boolean booleanValue = ((Boolean) obj7).booleanValue();
        boolean booleanValue2 = ((Boolean) obj6).booleanValue();
        boolean booleanValue3 = ((Boolean) obj4).booleanValue();
        boolean booleanValue4 = ((Boolean) obj3).booleanValue();
        boolean booleanValue5 = ((Boolean) obj2).booleanValue();
        boolean booleanValue6 = ((Boolean) obj).booleanValue();
        T t = ((it80) obj5).a;
        hd8 hd8Var = (hd8) t;
        if (hd8Var == null || (recordType = hd8Var.f) == null) {
            recordType = RecordType.NOTHING;
        }
        boolean z2 = true;
        boolean z3 = recordType == RecordType.STREAM;
        if (booleanValue6 && booleanValue && !booleanValue2) {
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        hd8 hd8Var2 = (hd8) t;
        return new VoipActionsFeatureState.v(z2, z3, booleanValue5, booleanValue4, (booleanValue3 && z3) ? z : false, hd8Var2 != null ? Long.valueOf(hd8Var2.e) : null);
    }

    @Override // xsna.h300
    public List f(q94 q94Var) {
        return Collections.EMPTY_LIST;
    }

    @Override // xsna.kwn
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(Pair pair, zzs zzsVar, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(914264920);
        if ((i2 & 6) == 0) {
            i3 = (M.J(pair) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(zzsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(914264920, i3, -1, "com.vk.design.demo.presentation.screens.DonutUserStackContent.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (DonutUserStackContent.kt:109)");
            }
            zzsVar.invoke(fwu0.l(null, (String) pair.i(), null, null, M, 0, 61), pair.j(), M, Integer.valueOf(((i3 << 3) & 896) | 8));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new f4o(i2, 0, this, pair, zzsVar);
        }
    }

    @Override // com.vk.push.common.HostInfoProvider
    public String getHost() {
        return "rebus.rustore.ru";
    }

    @Override // com.vk.push.common.HostInfoProvider
    public Integer getPort() {
        return HostInfoProvider.DefaultImpls.getPort(this);
    }

    @Override // com.vk.push.common.HostInfoProvider
    public String getScheme() {
        return "wss";
    }

    @Override // xsna.k6o
    public List j(q94 q94Var) {
        return Collections.EMPTY_LIST;
    }

    @Override // xsna.gn60
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public List x(NewsEntry newsEntry, wm60 wm60Var) {
        if ((newsEntry instanceof ShitAttachment) || (newsEntry instanceof PromoPost) || (newsEntry instanceof Html5Entry) || (newsEntry instanceof OptionalNativeAdEntry) || (newsEntry instanceof YandexNativeAdEntry) || (newsEntry instanceof MyTargetNativeAdEntry)) {
            ListBuilder e2 = e43.e();
            e2.add(new fwv(y8g0.e(R.string.newsfeed_item_ad_ignored_title), y8g0.e(R.string.newsfeed_item_ad_ignored_message), newsEntry));
            return e2.g();
        }
        if ((newsEntry instanceof Post) || (newsEntry instanceof Photos)) {
            return v(newsEntry);
        }
        if (!(newsEntry instanceof Videos)) {
            ListBuilder e3 = e43.e();
            e3.add(new fwv(y8g0.e(R.string.newsfeed_block_ignored_title), y8g0.e(R.string.newsfeed_block_ignored_message), newsEntry));
            return e3.g();
        }
        Videos videos = (Videos) newsEntry;
        String str = videos.s;
        if (epx.f(str, "clip") || epx.f(str, "video")) {
            return v(videos);
        }
        ListBuilder e4 = e43.e();
        e4.add(new fwv(y8g0.e(R.string.newsfeed_block_ignored_title), y8g0.e(R.string.newsfeed_block_ignored_message), videos));
        return e4.g();
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Long.valueOf(zznn.zzk());
    }

    @Override // xsna.hgs
    public void d(FragmentActivity fragmentActivity) {
    }

    @Override // xsna.h300
    public void a(long j, q94 q94Var, wmj wmjVar) {
    }

    @Override // xsna.k6o
    public void c(double d2, q94 q94Var, wmj wmjVar) {
    }
}
