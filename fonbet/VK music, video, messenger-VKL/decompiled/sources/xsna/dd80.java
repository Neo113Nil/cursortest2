package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: OnboardingButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class dd80 implements cfu, gn60 {
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    public static final int h = 9;
    public static final int i = 10;
    public static final int j = 11;
    public static final int k = 12;
    public static final int l = 13;
    public static final int m = 14;
    public static final int n = 15;
    public static final int o = 16;
    public static final int p = 17;
    public static final int q = 18;
    public static final int r = 19;
    public static final int s = 20;
    public static com.vk.socialgraph.a t;
    public static com.vk.auth.main.j u;
    public final /* synthetic */ int b;

    public /* synthetic */ dd80(int i2) {
        this.b = i2;
    }

    public static UIBlock f(UIBlock uIBlock, izs izsVar) {
        if (((Boolean) izsVar.invoke(uIBlock)).booleanValue()) {
            return uIBlock;
        }
        if (uIBlock instanceof UIBlockList) {
            Iterator<UIBlock> it = ((UIBlockList) uIBlock).y.iterator();
            while (it.hasNext()) {
                UIBlock f2 = f(it.next(), izsVar);
                if (f2 != null) {
                    return f2;
                }
            }
        }
        if (!(uIBlock instanceof UIBlockCatalog)) {
            return null;
        }
        Iterator<UIBlock> it2 = ((UIBlockCatalog) uIBlock).A.iterator();
        while (it2.hasNext()) {
            UIBlock f3 = f(it2.next(), izsVar);
            if (f3 != null) {
                return f3;
            }
        }
        return null;
    }

    public static String g(long j2, Integer num, String str, String str2, String str3, String str4) {
        if (str != null && str.length() != 0) {
            if (drm0.D(str, "#", false)) {
                str3 = drm0.j0(str, "#", str);
            } else if (str3 == null) {
                str3 = "";
            }
            String n0 = drm0.n0(str, "#");
            if (drm0.D(str, "ref=", true)) {
                return v1v.a('#', n0, str3);
            }
            return n0 + "?ref=" + str2 + '#' + str3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://" + a0a.d + "/app" + j2 + '?');
        if (num != null) {
            sb.append("request_id=" + num + '&');
        }
        if (str4 != null) {
            sb.append("request_key=" + str4 + '&');
        }
        StringBuilder sb2 = new StringBuilder("ref=");
        sb2.append(str2);
        sb2.append('#');
        if (str3 == null) {
            str3 = "";
        }
        sb2.append(str3);
        sb.append(sb2.toString());
        return sb.toString();
    }

    public static final q630 i(q630 q630Var, yzs yzsVar) {
        return q630Var.g(new xny(yzsVar));
    }

    public static String k(int i2) {
        if (i2 == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i2 == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i2 == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        switch (this.b) {
            case 7:
                throw null;
            default:
                return super.hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public List j(p3s0 p3s0Var) {
        NewsEntry newsEntry = p3s0Var.a;
        NewsEntry newsEntry2 = p3s0Var.b;
        VideoAttachment videoAttachment = p3s0Var.c;
        int i2 = p3s0Var.d;
        s1c0 s1c0Var = p3s0Var.e;
        VideoFile videoFile = videoAttachment.k;
        ?? c2 = g620.f().c(videoFile);
        ?? r4 = (videoAttachment.k.p0() || g620.f().d(videoAttachment.k)) ? false : true;
        boolean z = s1c0Var.k;
        ?? r8 = (c2 == 0 && videoAttachment.h == null) ? false : true;
        boolean z2 = (c2 == 0 && (newsEntry instanceof Videos) && z) ? false : true;
        if (!z) {
            c2 = (c2 == true ? 1 : 0) | 2;
        }
        if (r8 != false) {
            c2 = (c2 == true ? 1 : 0) | 4;
        }
        if (z2) {
            c2 = (c2 == true ? 1 : 0) | 8;
        }
        if (r4 != false) {
            c2 = (c2 == true ? 1 : 0) | 16;
        }
        return Collections.singletonList(new f4s0(newsEntry, newsEntry2, alk.G(newsEntry, newsEntry2, videoAttachment), (byte) c2, videoFile, videoFile.getTitle(), videoFile instanceof MusicVideoFile ? ((MusicVideoFile) videoFile).D1 : null, videoFile.j1(), videoFile.L8(), i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return j((p3s0) pair);
    }

    @Override // xsna.cfu
    public void a(izs izsVar) {
    }

    @Override // xsna.cfu
    public void b(boolean z) {
    }

    @Override // xsna.cfu
    public void d(boolean z) {
    }

    @Override // xsna.cfu
    public void e(float f2) {
    }

    @Override // xsna.cfu
    public void setVisible(boolean z) {
    }

    @Override // xsna.cfu
    public void c(Integer num, ActionLink actionLink) {
    }
}
