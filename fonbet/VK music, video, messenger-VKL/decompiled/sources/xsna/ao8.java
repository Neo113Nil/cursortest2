package xsna;

import android.graphics.Color;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zznn;
import com.vk.api.base.Document;
import com.vk.api.generated.catalog.dto.CatalogGetAudioSearchRequestedSectionIdDto;
import com.vk.api.generated.docs.dto.DocsDocDto;
import com.vk.api.generated.docs.dto.DocsDocPreviewAudioMsgDto;
import com.vk.api.generated.docs.dto.DocsDocPreviewDto;
import com.vk.api.generated.docs.dto.DocsDocPreviewGraffitiDto;
import com.vk.api.generated.docs.dto.DocsDocPreviewPhotoDto;
import com.vk.api.generated.docs.dto.DocsDocPreviewPhotoSizesDto;
import com.vk.api.generated.docs.dto.DocsDocPreviewVideoDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesTypeDto;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.friends.discover.UserDiscoverItem;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.attachment.OnMediaAttachmentStyle;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.mentions.MentionProfileVO;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: BundleCompat.java */
@Deprecated
/* loaded from: classes11.dex */
public final class ao8 implements ita, q701, gn60, ias0 {
    public static final jai c = new jai(-232709222, new uni(0), false);
    public static final ao8 d = new ao8(2);
    public static final anr e = new anr(0, 0, 0, 0);
    public static final /* synthetic */ ao8 f = new ao8(4);
    public static final /* synthetic */ ao8 g = new ao8(5);
    public final /* synthetic */ int b;

    public /* synthetic */ ao8(int i) {
        this.b = i;
    }

    public static ArrayList d(JSONArray jSONArray, ooy0 ooy0Var) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            ooy0 f2 = ooy0Var.f(i);
            if (optJSONObject == null) {
                f2.c(3007, "There is no image for index.");
                return null;
            }
            int optInt = optJSONObject.optInt("width", -1);
            if (optInt == -1) {
                e(f2, "width");
                return null;
            }
            int optInt2 = optJSONObject.optInt("height", -1);
            if (optInt2 == -1) {
                e(f2, "height");
                return null;
            }
            String optString = optJSONObject.optString("url");
            if (TextUtils.isEmpty(optString)) {
                e(f2, "url");
                return null;
            }
            arrayList.add(new kbz0(kiw.b(optInt, optInt2, optString)));
        }
        return arrayList;
    }

    public static void e(ooy0 ooy0Var, String str) {
        ooy0Var.c(3006, "Missing or empty required field: ".concat(str));
    }

    public static final float[] f(String str) {
        int parseColor = Color.parseColor(str);
        float f2 = 256;
        return new float[]{Color.red(parseColor) / f2, Color.green(parseColor) / f2, Color.blue(parseColor) / f2};
    }

    public static final lsr g(lsr lsrVar, kotlin.coroutines.d dVar) {
        return !(lsrVar instanceof aki0) ? lsrVar instanceof x670 ? lsrVar : new y2q0(lsrVar, dVar) : lsrVar;
    }

    public static final r4x h(te2 te2Var, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1485016250, 0, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:221)");
        }
        r4x r4xVar = new r4x(te2Var, (azl) aVar.r(uvi.h));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return r4xVar;
    }

    public static final RequestUserProfile i(String str, JSONObject jSONObject, RequestUserProfile requestUserProfile) {
        JSONObject jSONObject2;
        RequestUserProfile requestUserProfile2;
        JSONObject optJSONObject;
        if (epx.f(str, "user_discover_item")) {
            if (requestUserProfile instanceof UserDiscoverItem) {
                requestUserProfile2 = new UserDiscoverItem((UserDiscoverItem) requestUserProfile, jSONObject);
                jSONObject2 = jSONObject;
            } else if (requestUserProfile != null) {
                jSONObject2 = jSONObject;
                requestUserProfile2 = new UserDiscoverItem(requestUserProfile, jSONObject2, true, null, 0);
            } else {
                jSONObject2 = jSONObject;
                requestUserProfile2 = new UserDiscoverItem(jSONObject2, false, null, 0);
            }
            boolean has = jSONObject2.has("first_name_gen");
            Bundle bundle = requestUserProfile2.s;
            if (has) {
                bundle.putString("first_name_gen", jSONObject2.getString("first_name_gen"));
                if (jSONObject2.has("last_name_gen")) {
                    bundle.putString("name_gen", jSONObject2.getString("first_name_gen") + ' ' + jSONObject2.getString("last_name_gen"));
                }
            }
            if (jSONObject2.has("city") && (optJSONObject = jSONObject2.optJSONObject("city")) != null) {
                optJSONObject.optInt("id", 0);
                bundle.putString("city_name", optJSONObject.optString("title"));
            }
            requestUserProfile2.p = jSONObject2.optString("bdate", requestUserProfile2.p);
            requestUserProfile2.h0 = jSONObject2.optString("message", requestUserProfile2.h0);
        } else {
            jSONObject2 = jSONObject;
            if (requestUserProfile != null) {
                requestUserProfile2 = new RequestUserProfile(requestUserProfile);
                requestUserProfile2.h0 = jSONObject2.optString("message");
                requestUserProfile2.r = requestUserProfile2.o;
            } else {
                requestUserProfile2 = new RequestUserProfile();
                requestUserProfile2.h0 = jSONObject2.optString("message");
                requestUserProfile2.r = requestUserProfile2.o;
            }
        }
        if (TextUtils.isEmpty(requestUserProfile2.J)) {
            requestUserProfile2.J = jSONObject2.optString("track_code");
        }
        return requestUserProfile2;
    }

    public static final boolean j(SignUpDataHolder signUpDataHolder) {
        Bundle bundle = signUpDataHolder.g;
        if (bundle != null) {
            return bundle.getBoolean("BUSINESS_SIGN_UP_KEY", false);
        }
        return false;
    }

    public static Document k(DocsDocDto docsDocDto) {
        Image image;
        Document document = new Document();
        document.i = docsDocDto.j();
        document.b = docsDocDto.getId();
        UserId q = docsDocDto.q();
        if (q == null) {
            q = UserId.d;
        }
        document.h = q;
        document.l = docsDocDto.getTitle();
        document.g = docsDocDto.i();
        document.m = docsDocDto.f();
        document.k = docsDocDto.getUrl();
        document.j = docsDocDto.k();
        document.o = docsDocDto.d();
        DocsDocPreviewDto g2 = docsDocDto.g();
        if (g2 != null) {
            DocsDocPreviewVideoDto g3 = g2.g();
            char i = (g3 == null ? ImageSizeKey.SIZE_M_0130 : ImageSizeKey.SIZE_O_0130).i();
            if (g3 != null) {
                document.s = g3.d();
                document.d = g3.getWidth();
                document.e = g3.getHeight();
            }
            DocsDocPreviewGraffitiDto e2 = g2.e();
            if (e2 != null) {
                document.d = e2.getWidth();
                document.e = e2.getHeight();
                i = 'o';
            }
            DocsDocPreviewPhotoDto f2 = g2.f();
            if (f2 != null) {
                List<DocsDocPreviewPhotoSizesDto> d2 = f2.d();
                if (d2 == null) {
                    image = new Image((List<ImageSize>) null);
                } else {
                    List<DocsDocPreviewPhotoSizesDto> list = d2;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    for (DocsDocPreviewPhotoSizesDto docsDocPreviewPhotoSizesDto : list) {
                        PhotosPhotoSizesTypeDto e3 = docsDocPreviewPhotoSizesDto.e();
                        ImageSizeKey.a aVar = ImageSizeKey.Companion;
                        String i2 = e3 != null ? e3.i() : null;
                        char i3 = ImageSizeKey.SIZE_M_0130.i();
                        aVar.getClass();
                        arrayList.add(new ImageSize(docsDocPreviewPhotoSizesDto.d(), docsDocPreviewPhotoSizesDto.getWidth(), docsDocPreviewPhotoSizesDto.getHeight(), null, ImageSizeKey.a.c(i2, i3), false, 40, null));
                    }
                    image = new Image(arrayList);
                }
                document.t = image;
                Iterator it = image.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ImageSize imageSize = (ImageSize) it.next();
                    if (i == imageSize.b) {
                        com.vk.dto.common.im.Image image2 = imageSize.d;
                        document.n = image2.d;
                        if (document.d == 0) {
                            document.d = image2.b;
                        }
                        if (document.e == 0) {
                            document.e = image2.c;
                        }
                    }
                }
            }
            DocsDocPreviewAudioMsgDto d3 = g2.d();
            if (d3 != null) {
                document.p = d3.e();
                document.q = d3.d();
                document.f = d3.getDuration();
                List<Integer> f3 = d3.f();
                if (f3 != null) {
                    byte[] bArr = new byte[f3.size()];
                    int i4 = 0;
                    for (Object obj : f3) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            e43.t();
                            throw null;
                        }
                        bArr[i4] = (byte) ((Number) obj).intValue();
                        i4 = i5;
                    }
                    document.r = bArr;
                }
            }
        }
        document.c = docsDocDto.e();
        return document;
    }

    public static final CatalogGetAudioSearchRequestedSectionIdDto l(String str) {
        Object obj;
        Iterator<E> it = CatalogGetAudioSearchRequestedSectionIdDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((CatalogGetAudioSearchRequestedSectionIdDto) obj).j(), str)) {
                break;
            }
        }
        return (CatalogGetAudioSearchRequestedSectionIdDto) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final pgk0 m(String str) {
        String str2;
        boolean z;
        EmptyList emptyList;
        String str3;
        int i;
        int i2;
        ogk0 ogk0Var = new ogk0(str);
        char c2 = '(';
        int i3 = 1;
        Throwable th = null;
        if (ogk0Var.c('C')) {
            ogk0Var.b++;
            if (ogk0Var.c('C')) {
                ogk0Var.b++;
            }
            if (ogk0Var.c('(')) {
                ogk0Var.b++;
                String e2 = ogk0Var.e(")");
                ogk0Var.b();
                ogk0Var.b++;
                str2 = e2;
                z = true;
            } else {
                z = true;
                str2 = null;
            }
        } else {
            str2 = null;
            z = false;
        }
        EmptyList emptyList2 = EmptyList.b;
        while (ogk0Var.b < str.length() - i3 && Character.isLetter(str.charAt(ogk0Var.b)) && str.charAt(ogk0Var.b + i3) == c2) {
            char charAt = str.charAt(ogk0Var.b);
            if (charAt == 'N') {
                i = i3;
                ogk0Var.b += 2;
                ArrayList arrayList = new ArrayList();
                while (!ogk0Var.a() && !ogk0Var.c(')')) {
                    ogk0Var.e(":,)");
                    if (ogk0Var.c(':')) {
                        ogk0Var.b++;
                        brm0.A(ogk0Var.e(",)"), "c#", "androidx.compose.");
                    }
                    arrayList.add(new th90(arrayList.size()));
                    if (ogk0Var.c(',')) {
                        ogk0Var.b++;
                    }
                }
                ogk0Var.b();
                ogk0Var.b++;
                emptyList2 = arrayList;
            } else if (charAt != 'P') {
                ogk0Var.b += 2;
                int i4 = 0;
                while (true) {
                    if (i4 <= 0 && ogk0Var.c(')')) {
                        ogk0Var.b();
                        ogk0Var.b += i3;
                        break;
                    }
                    if (ogk0Var.a()) {
                        ogk0Var.f("unexpected end");
                        throw th;
                    }
                    if (ogk0Var.c(c2)) {
                        i4++;
                    } else if (ogk0Var.c(')')) {
                        i4--;
                    }
                    ogk0Var.b += i3;
                }
            } else {
                ogk0Var.b += 2;
                ArrayList arrayList2 = new ArrayList();
                int i5 = 0;
                while (!ogk0Var.a() && !ogk0Var.c(')')) {
                    if (ogk0Var.c('!')) {
                        ogk0Var.b += i3;
                        String e3 = ogk0Var.e("!,)");
                        if (e3.length() != 0) {
                            int parseInt = Integer.parseInt(e3);
                            int i6 = 0;
                            while (true) {
                                i2 = i3;
                                if (parseInt <= 0) {
                                    break;
                                }
                                int size = arrayList2.size();
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= size) {
                                        arrayList2.add(new th90(i6));
                                        parseInt--;
                                        break;
                                    }
                                    if (((th90) arrayList2.get(i7)).a == i6) {
                                        i6++;
                                        break;
                                    }
                                    i7++;
                                }
                                i3 = i2;
                            }
                        } else {
                            i5 = i3;
                            i2 = i5;
                        }
                    } else {
                        i2 = i3;
                        int d2 = ogk0Var.d("!:,)");
                        if (ogk0Var.c(':')) {
                            ogk0Var.b++;
                            brm0.A(ogk0Var.e("!,)"), "c#", "androidx.compose.");
                        }
                        if (i5 != 0) {
                            int i8 = 0;
                            while (i8 < d2) {
                                int size2 = arrayList2.size();
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= size2) {
                                        arrayList2.add(new th90(i8));
                                        break;
                                    }
                                    if (((th90) arrayList2.get(i9)).a == i8) {
                                        i8++;
                                        break;
                                    }
                                    i9++;
                                }
                            }
                            i5 = 0;
                        }
                        arrayList2.add(new th90(d2));
                    }
                    if (ogk0Var.c(',')) {
                        ogk0Var.b++;
                    }
                    i3 = i2;
                }
                i = i3;
                ogk0Var.b();
                ogk0Var.b++;
                emptyList2 = arrayList2;
            }
            i3 = i;
            c2 = '(';
            th = null;
        }
        EmptyList emptyList3 = EmptyList.b;
        if (ogk0Var.c(':')) {
            ogk0Var.b++;
            emptyList = emptyList3;
        } else {
            ArrayList arrayList3 = new ArrayList();
            while (!ogk0Var.a() && !ogk0Var.c(':')) {
                if (ogk0Var.c(ImageSizeKey.SIZE_KEY_BASE)) {
                    ogk0Var.b++;
                }
                Integer valueOf = !ogk0Var.c('@') ? Integer.valueOf(ogk0Var.d("@") + 1) : null;
                ogk0Var.b++;
                ogk0Var.d("L,:");
                if (ogk0Var.c('L')) {
                    ogk0Var.b++;
                    ogk0Var.d(",:");
                }
                arrayList3.add(new yyz(valueOf != null ? valueOf.intValue() : -1));
                if (ogk0Var.c(',')) {
                    ogk0Var.b++;
                }
            }
            ogk0Var.b++;
            emptyList = arrayList3;
        }
        EmptyList emptyList4 = emptyList;
        String e4 = ogk0Var.e("#");
        String str4 = e4.length() > 0 ? e4 : null;
        if (ogk0Var.c('#')) {
            int i10 = ogk0Var.b + 1;
            ogk0Var.b = i10;
            str3 = str.substring(i10, str.length());
        } else {
            str3 = null;
        }
        return new pgk0(z, str2, str4, emptyList2, str3, emptyList4);
    }

    @Deprecated
    public static void o(IBinder iBinder, Bundle bundle) {
        bundle.putBinder("KEY_WINDOW_TOKEN", iBinder);
    }

    public static final void p(int i, int i2) {
        int i3 = i > 0 ? 1 : 0;
        int i4 = i2 > 0 ? 1 : 0;
        AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.SMB_EMPTY_CART_OPTIMIZE);
        aggregateEventBuilder.v(0, i3);
        aggregateEventBuilder.v(1, i4);
        aggregateEventBuilder.v(2, i3 == i4 ? 1 : 0);
        aggregateEventBuilder.q();
    }

    public static final void q(SignUpDataHolder signUpDataHolder) {
        Bundle bundle = signUpDataHolder.g;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("BUSINESS_SIGN_UP_KEY", true);
        s3q0 s3q0Var = s3q0.a;
        signUpDataHolder.g = bundle;
    }

    public static final boolean r(List list) {
        int size = list.size();
        if (size == 0) {
            return false;
        }
        if (size == 1) {
            return ((EntryAttachment) j5g.Y(list)).c instanceof OnMediaAttachmentStyle;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Attachment attachment = ((EntryAttachment) it.next()).b;
            AudioAttachment audioAttachment = attachment instanceof AudioAttachment ? (AudioAttachment) attachment : null;
            if (audioAttachment != null) {
                arrayList.add(audioAttachment);
            }
        }
        return arrayList.size() >= 2;
    }

    public static final MarketFavable s(Good good) {
        return new MarketFavable(good.b, good.c, good.M, good.V, good.J);
    }

    public static final MentionProfileVO t(UserProfile userProfile) {
        UserId a = fkq0.a(userProfile.c);
        if (userProfile.C()) {
            a = fkq0.e(a);
        }
        UserId userId = a;
        String str = userProfile.e;
        String str2 = userProfile.d;
        String str3 = userProfile.q;
        if (str3 == null) {
            str3 = userProfile.C() ? userProfile.e : userProfile.d;
        }
        return new MentionProfileVO(userId, str, str2, userProfile.h, str3);
    }

    public static List v(int i, ry60 ry60Var) {
        ArrayList<StoriesContainer> arrayList;
        GetStoriesResponse getStoriesResponse = ry60Var.a;
        if (getStoriesResponse == null || (arrayList = getStoriesResponse.c) == null || arrayList.isEmpty()) {
            arrayList = new ArrayList<>();
        }
        return Collections.singletonList(new uy60(new j2m0(ry60Var.b, arrayList), ry60Var, i));
    }

    public static final Object w(kotlin.coroutines.d dVar, Object obj, Object obj2, wzs wzsVar, spj spjVar) {
        Object invoke;
        Object b = mqo0.b(dVar, obj2);
        try {
            aok0 aok0Var = new aok0(spjVar, dVar);
            if (wzsVar == null) {
                kotlin.coroutines.d context = aok0Var.getContext();
                spj intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = context == EmptyCoroutineContext.b ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(aok0Var) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(aok0Var, context);
                ttp0.d(2, wzsVar);
                invoke = wzsVar.invoke(obj, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
            } else {
                ttp0.d(2, wzsVar);
                invoke = wzsVar.invoke(obj, aok0Var);
            }
            mqo0.a(dVar, b);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return invoke;
        } catch (Throwable th) {
            mqo0.a(dVar, b);
            throw th;
        }
    }

    public static Object y(kotlin.coroutines.d dVar, Object obj, wzs wzsVar, spj spjVar) {
        return w(dVar, obj, dVar.fold(0, mqo0.b), wzsVar, spjVar);
    }

    @Override // xsna.ita
    public boolean b(Object obj, Object obj2) {
        return !epx.f(obj, obj2);
    }

    @Override // xsna.ias0
    public Map c() {
        return jgp.b;
    }

    public void n(nov novVar, boolean z) {
        if (novVar instanceof v800) {
            if (z) {
                ((v800) novVar).h.b();
            } else {
                ((v800) novVar).h.a();
            }
        }
    }

    public List u(int i, Triple triple) {
        NewsEntry newsEntry = (NewsEntry) triple.d();
        NewsEntry newsEntry2 = (NewsEntry) triple.g();
        AlbumAttachment albumAttachment = (AlbumAttachment) triple.h();
        String str = albumAttachment.m;
        int i2 = albumAttachment.y;
        Photo photo = albumAttachment.l;
        return Collections.singletonList(new htj0(newsEntry, newsEntry2, albumAttachment, str, i2, photo.y, photo.Ib(), photo.Hb()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        switch (this.b) {
            case 13:
                return v(0, (ry60) pair);
            default:
                return u(0, (Triple) pair);
        }
    }

    @Override // xsna.q701
    public Object zza() {
        switch (this.b) {
            case 4:
                List list = s701.a;
                return Long.valueOf(zznn.zzt());
            default:
                List list2 = s701.a;
                return Integer.valueOf((int) zznn.zzz());
        }
    }

    @Override // xsna.ias0
    public void a(Object obj) {
    }
}
