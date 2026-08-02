package xsna;

import android.graphics.Rect;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.ClipsEntry;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.Iterator;
import java.util.List;

/* compiled from: PostDisplayItem.java */
/* loaded from: classes3.dex */
public class u1c0 {

    @NonNull
    public final NewsEntry a;

    @NonNull
    public final NewsEntry b;
    public final int c;
    public Object g;

    @Nullable
    public ol60 h;

    @Nullable
    public Rect j;

    @Nullable
    public s1c0 n;
    public int d = 1;
    public boolean e = true;
    public int f = -1;
    public int i = 0;
    public int k = -1;

    @Nullable
    public String l = null;

    @Nullable
    public PostInteract m = null;
    public sgw o = null;
    public final de p = hd60.a().g0().a(this);

    public u1c0(int i, @NonNull NewsEntry newsEntry) {
        this.a = newsEntry;
        this.b = newsEntry;
        this.c = i;
    }

    @Nullable
    public yg5 a() {
        Object obj;
        NewsEntry newsEntry = this.b;
        int i = this.c;
        if ((i == 59 || i == 353) && (newsEntry instanceof ShitAttachment)) {
            VideoAttachment videoAttachment = ((ShitAttachment) newsEntry).I;
            if (videoAttachment != null && videoAttachment.j) {
                return videoAttachment.i;
            }
        } else if (newsEntry instanceof MyTargetNativeAdEntry) {
            VideoAttachment videoAttachment2 = ((MyTargetNativeAdEntry) newsEntry).u;
            if (videoAttachment2 != null && videoAttachment2.j) {
                return videoAttachment2.i;
            }
        } else if (newsEntry instanceof Digest) {
            Iterator<T> it = ((Digest) newsEntry).m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((DigestItem) obj).h) {
                    break;
                }
            }
            DigestItem digestItem = (DigestItem) obj;
            Attachment d = digestItem != null ? digestItem.d() : null;
            if (d instanceof VideoAttachment) {
                VideoAttachment videoAttachment3 = (VideoAttachment) d;
                if (videoAttachment3.j) {
                    return videoAttachment3.i;
                }
            }
        } else if (newsEntry instanceof ClipsEntry) {
            VideoAttachment Eb = ((ClipsEntry) newsEntry).Eb();
            if (Eb != null && Eb.j) {
                return Eb.i;
            }
        } else if (newsEntry instanceof DiscoverMediaBlock) {
            VideoDiscoverGridItem videoDiscoverGridItem = (VideoDiscoverGridItem) ((DiscoverMediaBlock) newsEntry).j.stream().filter(new t1c0()).map(new h690(1)).findFirst().orElse(null);
            if (videoDiscoverGridItem != null) {
                VideoAttachment videoAttachment4 = videoDiscoverGridItem.j;
                if (videoAttachment4.j) {
                    return videoAttachment4.i;
                }
            }
        } else if (newsEntry instanceof Videos) {
            List<VideoAttachment> Pb = ((Videos) newsEntry).Pb();
            if (!Pb.isEmpty()) {
                return Pb.get(0).i;
            }
        }
        return null;
    }

    @NonNull
    public final Rect b() {
        if (this.j == null) {
            this.j = new Rect();
        }
        return this.j;
    }

    @Nullable
    public final String c() {
        String str;
        NewsEntry.TrackData Cb = this.b.Cb();
        if (Cb != null && (str = Cb.b) != null) {
            return str;
        }
        PostInteract postInteract = this.m;
        if (postInteract != null) {
            return postInteract.h;
        }
        return null;
    }

    public String d() {
        Owner s;
        String Bb = this.a.Bb();
        if (Bb == null) {
            Bb = "";
        }
        Parcelable parcelable = this.b;
        if (!(parcelable instanceof l490) || (s = ((l490) parcelable).s()) == null) {
            return null;
        }
        return pzl.b(String.valueOf(s.b.b), HiAnalyticsConstant.REPORT_VAL_SEPARATOR, Bb);
    }

    @Nullable
    public String e() {
        Object obj;
        Object obj2;
        NewsEntry newsEntry = this.b;
        int i = this.c;
        if ((i == 59 || i == 353) && (newsEntry instanceof ShitAttachment)) {
            VideoAttachment videoAttachment = ((ShitAttachment) newsEntry).I;
            if (videoAttachment != null) {
                return videoAttachment.k.r();
            }
        } else if (newsEntry instanceof Digest) {
            Iterator<T> it = ((Digest) newsEntry).m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((DigestItem) obj2).h) {
                    break;
                }
            }
            DigestItem digestItem = (DigestItem) obj2;
            if (digestItem != null) {
                Attachment d = digestItem.d();
                if (d instanceof VideoAttachment) {
                    return ((VideoAttachment) d).k.r();
                }
            }
        } else if (newsEntry instanceof ClipsEntry) {
            VideoAttachment Eb = ((ClipsEntry) newsEntry).Eb();
            if (Eb != null) {
                return Eb.k.r();
            }
        } else if (newsEntry instanceof DiscoverMediaBlock) {
            Iterator<T> it2 = ((DiscoverMediaBlock) newsEntry).j.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((DiscoverGridItem) obj) instanceof VideoDiscoverGridItem) {
                    break;
                }
            }
            VideoDiscoverGridItem videoDiscoverGridItem = (VideoDiscoverGridItem) obj;
            if (videoDiscoverGridItem != null) {
                return videoDiscoverGridItem.j.k.r();
            }
        } else if (newsEntry instanceof Videos) {
            List<VideoAttachment> Pb = ((Videos) newsEntry).Pb();
            if (!Pb.isEmpty()) {
                return Pb.get(0).k.r();
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            u1c0 u1c0Var = (u1c0) obj;
            if (this.c == u1c0Var.c && this.b.equals(u1c0Var.b) && this.a.equals(u1c0Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.c;
    }

    public final boolean g() {
        return this.b.e && this.p.l0();
    }

    public final void h(int i) {
        this.k = i;
        this.b.Cb().c = i;
        this.a.Cb().c = i;
        PostInteract postInteract = this.m;
        if (postInteract != null) {
            postInteract.n = i;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + e630.b((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.c) * 31, 31, this.b);
    }

    public final void i(int i) {
        b().top = i;
    }

    public final void j(int i) {
        b().left = i;
        b().right = i;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PostDisplayItem{entry=");
        sb.append(this.a);
        sb.append(", rootEntry=");
        sb.append(this.b);
        sb.append(", viewType=");
        sb.append(this.c);
        sb.append(", blockType=");
        sb.append(this.d);
        sb.append(", clickable=");
        sb.append(this.e);
        sb.append(", subIndex=");
        sb.append(this.f);
        sb.append(", listPosition=");
        sb.append(this.k);
        sb.append(", refer='");
        return i5s.a(sb, this.l, "'}");
    }

    public u1c0(@NonNull NewsEntry newsEntry, @NonNull NewsEntry newsEntry2, int i) {
        this.a = newsEntry;
        this.b = newsEntry2;
        this.c = i;
    }
}
