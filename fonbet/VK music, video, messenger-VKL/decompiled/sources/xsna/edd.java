package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import com.vk.story.api.domain.interactor.repost.PublishedKind;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.R;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.hs50;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class edd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ edd(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f0  */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String absolutePath;
        kbz0 kbz0Var;
        int i = 0;
        r3 = null;
        Bitmap bitmap = null;
        switch (this.b) {
            case 0:
                kdd kddVar = (kdd) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                ClipVideoFile clipVideoFile = ((enc) obj).a;
                TypedValue typedValue = krv0.a;
                Context s = krv0.b != null ? dhr0.s() : null;
                if (s == null) {
                    AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.CLIP_REPOST);
                    aggregateEventBuilder.w(0, "Context is null");
                    aggregateEventBuilder.q();
                } else {
                    if (str != null) {
                        File v = com.vk.core.files.a.v();
                        if (new File(str).renameTo(v)) {
                            absolutePath = v.getAbsolutePath();
                            if (absolutePath != null) {
                                AggregateEventBuilder aggregateEventBuilder2 = new AggregateEventBuilder(AggregateEventKey.CLIP_REPOST);
                                aggregateEventBuilder2.w(0, "Move file failed (localFile is exist: " + com.vk.core.files.a.x(str) + ')');
                                aggregateEventBuilder2.q();
                            } else {
                                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                try {
                                    Pair c = kdd.c(clipVideoFile, absolutePath);
                                    ref$ObjectRef.element = c.i();
                                    Object j = c.j();
                                    scd scdVar = kddVar.a;
                                    String absolutePath2 = ((File) ref$ObjectRef.element).getAbsolutePath();
                                    MediaUtils.f d = MediaUtils.a.d(absolutePath);
                                    nov a = scdVar.a(s, clipVideoFile, absolutePath2, absolutePath, d != null ? Float.valueOf(d.b()) : null);
                                    if (a != null) {
                                        itg0.h(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.v(new gdd(i, kddVar, (Bitmap) j)), new xz(new s53(8, kddVar, (r4g0) a), 16)).l(new sj4(new fdd(kddVar, (r4g0) a, absolutePath, clipVideoFile, str2), 4)), new lz0(ref$ObjectRef, 17), new dda(ref$ObjectRef, kddVar, absolutePath, 2));
                                    }
                                } catch (Throwable th) {
                                    L.j(th, "Story upload failed in sticker prepare phase!");
                                    kddVar.g.e(PublishedKind.CLIP);
                                    AggregateEventBuilder aggregateEventBuilder3 = new AggregateEventBuilder(AggregateEventKey.CLIP_REPOST);
                                    aggregateEventBuilder3.w(0, erm0.D0(255, "SCF: ".concat(mnh0.A(th))));
                                    aggregateEventBuilder3.q();
                                }
                            }
                        }
                    }
                    absolutePath = null;
                    if (absolutePath != null) {
                    }
                }
                return s3q0.a;
            case 1:
                hs50 hs50Var = (hs50) this.c;
                zu50 zu50Var = (zu50) this.d;
                gjx gjxVar = (gjx) this.e;
                NewsEntry t6 = hs50Var.t6();
                if (t6 instanceof MyTargetNativeAdEntry) {
                    hs50Var.b7().E6(t6);
                    if (zu50Var != null) {
                        Drawable drawable = hs50Var.G.getImageView().getDrawable();
                        if (drawable != null) {
                            hs50Var.f7(drawable);
                        } else {
                            hs50.b bVar = hs50Var.Y;
                            zu50Var.k = bVar;
                            ckz0 ckz0Var = zu50Var.h;
                            if (ckz0Var != null) {
                                ckz0Var.m(bVar);
                            }
                        }
                    } else if (gjxVar != null) {
                        wjz0 content = gjxVar.getContent();
                        if (content != null && (kbz0Var = content.e) != null) {
                            bitmap = kbz0Var.a.a();
                        }
                        if (bitmap != null) {
                            hs50Var.e7(bitmap);
                        }
                    }
                }
                return s3q0.a;
            case 2:
                Activity activity = (Activity) this.c;
                y6s0 y6s0Var = (y6s0) this.d;
                s6s0 s6s0Var = (s6s0) this.e;
                String string = activity.getString(R.string.video_is_not_pinned);
                ikv0.a aVar = new ikv0.a(activity);
                aVar.u = new ikv0.d(string, (String) null, (ikv0.d.a) null, 6);
                aVar.n();
                if (y6s0Var == null) {
                    return null;
                }
                y6s0Var.a(VideoBottomSheetSideEffectOptions.PIN, s6s0Var.a);
                return s3q0.a;
            case 3:
                flc0 flc0Var = (flc0) this.c;
                aac0 aac0Var = (aac0) this.d;
                Integer num = (Integer) this.e;
                String str3 = (String) obj;
                if (str3.length() == 0) {
                    throw new IllegalArgumentException("upload link is null or empty");
                }
                String encode = URLEncoder.encode(flc0Var.a, C.UTF8_NAME);
                StringBuilder sb = new StringBuilder();
                sb.append(aac0Var.c);
                sb.append('_');
                sb.append(num);
                StringBuilder b = i5s.b(str3, "&text=", encode, "&bkg_id=", sb.toString());
                b.append("&bkg_access_hash=");
                String str4 = aac0Var.f;
                if (str4 == null) {
                    str4 = "";
                }
                b.append(str4);
                io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new ica(new gbc0(b.toString(), aac0Var.e), 1));
                asu0.a.getClass();
                return s0Var.r0(asu0.r()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            case 4:
                com.vk.profile.questions.impl.h hVar = (com.vk.profile.questions.impl.h) this.c;
                com.vk.profile.questions.impl.d dVar = (com.vk.profile.questions.impl.d) this.d;
                com.vk.lists.c cVar = (com.vk.lists.c) this.e;
                hVar.j.put(com.vk.profile.questions.impl.h.j7(dVar), 0);
                cVar.p(false);
                return s3q0.a;
            case 5:
                sul0 sul0Var = (sul0) this.c;
                StoriesContainer storiesContainer = (StoriesContainer) this.d;
                List list = (List) this.e;
                if (((Boolean) obj).booleanValue()) {
                    sul0Var.c.k(storiesContainer);
                    sul0Var.b.e(100, list);
                }
                return s3q0.a;
            default:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.c;
                mov0 mov0Var = (mov0) this.d;
                JsApiMethodType jsApiMethodType = (JsApiMethodType) this.e;
                bqu0 bqu0Var = (bqu0) ref$ObjectRef2.element;
                if (bqu0Var != null) {
                    bqu0Var.dismiss();
                }
                mov0Var.c.m(jsApiMethodType, VkAppsErrors.Client.UNKNOWN_ERROR, null, null);
                return s3q0.a;
        }
    }
}
