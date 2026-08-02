package xsna;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.text.TextUtils;
import android.util.Size;
import androidx.compose.ui.node.LayoutNode;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.measurement.zznn;
import com.vk.api.generated.catalog.dto.CatalogAdBannerDto;
import com.vk.api.generated.catalog.dto.CatalogBadgeDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogButtonDto;
import com.vk.api.generated.catalog.dto.CatalogHintDto;
import com.vk.api.generated.catalog.dto.CatalogSectionDataTypeDto;
import com.vk.api.generated.catalog.dto.CatalogSectionDto;
import com.vk.api.generated.catalog.dto.CatalogSectionStyleDto;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.hint.CatalogHint;
import com.vk.catalog2.common.dto.api.section.CatalogAdBanner;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.section.CatalogSectionStyle;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.narratives.HighlightLocalStoryCover;
import com.vk.dto.narratives.HighlightRemoteCustomCover;
import com.vk.dto.narratives.HighlightRemoteStoryCover;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.ecomm.onlinebooking.impl.utils.Entrypoint;
import com.vk.ecomm.reviews.impl.replies.presentation.actionbuilder.ReplyAction;
import com.vk.feed.core.models.cache.CachedNewsEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vkontakte.android.VKApplication;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlinx.serialization.json.JsonObject;
import xsna.a4a;

/* compiled from: AnimationLoaderBridge.kt */
/* loaded from: classes5.dex */
public final class up2 implements q701 {
    public static final up2 b = new up2();
    public static final jai c = new jai(1201511856, new ldi(0, 0), false);
    public static final wsy[] d = new wsy[0];
    public static final up2 e = new up2();
    public static final /* synthetic */ up2 f = new up2();

    public up2() {
        BuildInfo.Client client = BuildInfo.a;
    }

    public static final String a(StoryEntry storyEntry) {
        Image e1;
        String h;
        Photo photo = storyEntry.m;
        if (photo == null || (e1 = photo.y) == null) {
            VideoFile videoFile = storyEntry.n;
            e1 = videoFile != null ? videoFile.e1() : null;
        }
        return (e1 == null || (h = ixj0.h(e1.b)) == null) ? storyEntry.l : h;
    }

    public static final f2t b(Bitmap bitmap) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        return new f2t(bitmap.getWidth(), bitmap.getHeight(), iArr[0]);
    }

    public static final void c(String str) {
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        if (BuildInfo.h()) {
            throw new RuntimeException(str);
        }
        bn40.d(str);
    }

    public static final mm50 d(gzs gzsVar, wb0 wb0Var, cm20 cm20Var) {
        return sm50.a(new rn8(new r9(gzsVar, 29)), wb0Var, new tn8(), cm20Var, 16);
    }

    @ozl
    public static final q530 e(w8i w8iVar, Context context, f5z f5zVar, boolean z) {
        return ((ModerationComponent) ((k7m) m7m.f(w8iVar)).mo408a(fpf0.a(ModerationComponent.class))).pa().b(context, f5zVar, z);
    }

    public static final q530 f(h7m h7mVar, Context context, f5z f5zVar) {
        return ((ModerationComponent) h7mVar.mo408a(fpf0.a(ModerationComponent.class))).pa().b(context, f5zVar, false);
    }

    public static w530 g(l7m l7mVar, Context context) {
        return ((ModerationComponent) l7mVar.mo408a(fpf0.a(ModerationComponent.class))).pa().a(context, false);
    }

    public static final dyf0 h(Size size) {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glGenTextures(1, iArr2, 0);
        GLES20.glGenRenderbuffers(1, iArr3, 0);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr2[0]);
        GLES20.glTexImage2D(3553, 0, 6408, size.getWidth(), size.getHeight(), 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
        GLES20.glBindRenderbuffer(36161, iArr3[0]);
        GLES20.glRenderbufferStorage(36161, 33189, size.getWidth(), size.getHeight());
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, iArr3[0]);
        return new dyf0(iArr[0], iArr3[0], iArr2[0]);
    }

    public static final void i(dyf0 dyf0Var) {
        GLES20.glDeleteFramebuffers(1, new int[]{dyf0Var.a}, 0);
        GLES20.glDeleteTextures(1, new int[]{dyf0Var.c}, 0);
        GLES20.glDeleteRenderbuffers(1, new int[]{dyf0Var.b}, 0);
    }

    public static final void j(io.reactivex.rxjava3.disposables.c cVar, VkUiView vkUiView) {
        Activity B0 = vkUiView != null ? vkUiView.B0() : null;
        FragmentActivity fragmentActivity = B0 instanceof FragmentActivity ? (FragmentActivity) B0 : null;
        if (vkUiView != null) {
            vkUiView.D6().b(cVar);
            return;
        }
        if (fragmentActivity != null) {
            if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
                cVar.dispose();
                return;
            }
            Application application = fragmentActivity.getApplication();
            if (application != null) {
                application.registerActivityLifecycleCallbacks(new ydx0(fragmentActivity, cVar));
            }
        }
    }

    public static ListBuilder k(String str, boolean z, boolean z2, boolean z3) {
        ListBuilder e2 = e43.e();
        if (z3) {
            e2.add(ReplyAction.REPLY_ACTION_REPLY);
        }
        if (str.length() > 0) {
            e2.add(ReplyAction.REPLY_ACTION_COPY_TEXT);
        }
        if (z) {
            e2.add(ReplyAction.REPLY_ACTION_DELETE);
        }
        if (z2) {
            e2.add(ReplyAction.REPLY_ACTION_EDIT);
        }
        ListBuilder g = e2.g();
        if (g.isEmpty()) {
            return null;
        }
        return g;
    }

    public static final String l(Context context, String str) {
        Entrypoint entrypoint = Entrypoint.STORIES;
        if (epx.f(str, entrypoint.i())) {
            return context.getString(entrypoint.h());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static final ImageList m(HighlightCover highlightCover) {
        ArrayList arrayList;
        ?? r1 = 0;
        r1 = 0;
        Image image = highlightCover instanceof HighlightRemoteCustomCover ? ((HighlightRemoteCustomCover) highlightCover).b : highlightCover instanceof HighlightRemoteStoryCover ? ((HighlightRemoteStoryCover) highlightCover).b : null;
        if (image != null && (arrayList = image.b) != null) {
            r1 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r1.add(((ImageSize) it.next()).d);
            }
        }
        if (r1 == 0) {
            r1 = EmptyList.b;
        }
        return new ImageList(new ArrayList((Collection) r1));
    }

    public static final m600 n(m600 m600Var) {
        LayoutNode layoutNode = m600Var.q.q;
        while (true) {
            LayoutNode I = layoutNode.I();
            LayoutNode layoutNode2 = null;
            if ((I != null ? I.i : null) == null) {
                return layoutNode.G.d.w1();
            }
            LayoutNode I2 = layoutNode.I();
            if (I2 != null) {
                layoutNode2 = I2.i;
            }
            layoutNode2.getClass();
            layoutNode = layoutNode.I().i;
        }
    }

    public static final Integer o(HighlightCover highlightCover) {
        if (highlightCover instanceof HighlightLocalStoryCover) {
            return Integer.valueOf(((HighlightLocalStoryCover) highlightCover).b.c);
        }
        if (highlightCover instanceof HighlightRemoteStoryCover) {
            return Integer.valueOf(((HighlightRemoteStoryCover) highlightCover).d);
        }
        return null;
    }

    public static int p(long j) {
        if (j > 2147483647L || j < -2147483648L) {
            throw new RuntimeException(qlb0.a(j, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
        }
        return (int) j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v6 */
    public static CatalogSection q(CatalogSectionDto catalogSectionDto) {
        CatalogDataType catalogDataType;
        CatalogBadge catalogBadge;
        ArrayList arrayList;
        ?? r3;
        CatalogSectionStyle catalogSectionStyle;
        Long d2;
        CatalogAdBanner catalogAdBanner = null;
        if (catalogSectionDto == null) {
            return null;
        }
        t2a t2aVar = new t2a();
        z1a z1aVar = new z1a();
        String id = catalogSectionDto.getId();
        CatalogSectionDataTypeDto i = catalogSectionDto.i();
        if (i != null) {
            int i2 = a4a.a.$EnumSwitchMapping$1[i.ordinal()];
            catalogDataType = i2 != 1 ? i2 != 2 ? i2 != 3 ? CatalogDataType.UNKNOWN : CatalogDataType.DATA_TYPE_VIDEO_VIDEOS : CatalogDataType.DATA_TYPE_WALL : CatalogDataType.DATA_TYPE_FAVORITES;
        } else {
            catalogDataType = null;
        }
        String title = catalogSectionDto.getTitle();
        String l = catalogSectionDto.l();
        String url = catalogSectionDto.getUrl();
        CatalogBadgeDto f2 = catalogSectionDto.f();
        if (f2 != null) {
            String d3 = f2.d();
            if (d3 == null) {
                d3 = "";
            }
            catalogBadge = new CatalogBadge(d3, f2.e().i());
        } else {
            catalogBadge = null;
        }
        List<String> k = catalogSectionDto.k();
        if (k == null) {
            k = EmptyList.b;
        }
        List<String> list = k;
        List<CatalogBlockDto> g = catalogSectionDto.g();
        if (g != null) {
            List<CatalogBlockDto> list2 = g;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(z1aVar.b((CatalogBlockDto) it.next(), catalogSectionDto.getId()));
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        ArrayList arrayList3 = arrayList;
        List<CatalogButtonDto> d4 = catalogSectionDto.d();
        if (d4 != null) {
            r3 = new ArrayList();
            Iterator it2 = d4.iterator();
            while (it2.hasNext()) {
                CatalogButton c2 = t2aVar.c((CatalogButtonDto) it2.next());
                if (c2 != null) {
                    r3.add(c2);
                }
            }
        } else {
            r3 = EmptyList.b;
        }
        List list3 = r3;
        CatalogHintDto j = catalogSectionDto.j();
        CatalogHint a = j != null ? z6a.a(j) : null;
        CatalogSectionStyleDto n = catalogSectionDto.n();
        if (n != null) {
            Boolean e2 = n.e();
            boolean booleanValue = e2 != null ? e2.booleanValue() : false;
            Boolean d5 = n.d();
            catalogSectionStyle = new CatalogSectionStyle(booleanValue, d5 != null ? d5.booleanValue() : false);
        } else {
            catalogSectionStyle = null;
        }
        CatalogAdBannerDto e3 = catalogSectionDto.e();
        if (e3 != null && (d2 = e3.d()) != null) {
            catalogAdBanner = new CatalogAdBanner((int) d2.longValue());
        }
        return new CatalogSection(id, catalogDataType, title, l, url, catalogBadge, list, arrayList3, list3, a, catalogSectionStyle, null, catalogAdBanner, null, 10240, null);
    }

    public static final Object r(j8y j8yVar, String str, JsonObject jsonObject, a3m a3mVar) {
        return new aby(j8yVar, jsonObject, str, a3mVar.getDescriptor()).h(a3mVar);
    }

    public static final ArrayList s(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            arrayList2.add(str.substring(0, TextUtils.isDigitsOnly(str) ? str.length() : str.length() <= 3 ? str.length() : str.length() <= 4 ? str.length() - 1 : str.length() <= 6 ? str.length() - 2 : str.length() - 3));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((String) next).length() > 0) {
                arrayList3.add(next);
            }
        }
        return arrayList3;
    }

    public static final ArrayList t(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NewsEntry newsEntry = (NewsEntry) it.next();
            if (!newsEntry.d && newsEntry.c) {
                arrayList.add(new CachedNewsEntry(newsEntry));
            }
        }
        return arrayList;
    }

    public static final File u(Uri uri) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return com.vk.core.files.a.i(context, uri);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Integer.valueOf((int) zznn.zzc());
    }
}
