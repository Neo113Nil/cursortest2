package xsna;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import kotlin.LazyThreadSafetyMode;
import xsna.qi6;

/* compiled from: BaseDiscoverGridItemHolder.kt */
/* loaded from: classes4.dex */
public abstract class uc6<T extends DiscoverGridItem> extends qi6<NewsEntry> implements View.OnClickListener, View.OnLongClickListener {
    public DiscoverMediaBlock C;
    public T D;
    public final Object E;
    public final int F;
    public final Object G;
    public p580 H;

    public uc6(View view, ViewGroup viewGroup) {
        super(view);
        g13 g13Var = new g13(1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E = msy.a(lazyThreadSafetyMode, g13Var);
        this.itemView.getContext();
        this.F = iah0.a(2);
        this.G = msy.a(lazyThreadSafetyMode, new h13(1));
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        T t = this.D;
        if (t != null) {
            U6(t);
        }
    }

    public final String R6(DiscoverGridItem discoverGridItem, Integer num) {
        Owner G;
        Parcelable parcelable = discoverGridItem.c;
        Integer u = znk0.u(discoverGridItem.f);
        String v6 = u != null ? v6(u.intValue()) : v6(num.intValue());
        String str = null;
        String str2 = (!(parcelable instanceof wee0) || (G = ((wee0) parcelable).G()) == null) ? null : G.c;
        VideoFile videoFile = discoverGridItem instanceof VideoDiscoverGridItem ? ((VideoDiscoverGridItem) discoverGridItem).j.k : null;
        if (videoFile != null && videoFile.b0() > 0) {
            str = pvo0.k(videoFile.b0(), this.itemView.getResources(), false);
        } else if (parcelable instanceof rsx0) {
            rsx0 rsx0Var = (rsx0) parcelable;
            if (rsx0Var.D() > 0) {
                str = pvo0.k(rsx0Var.D(), this.itemView.getResources(), false);
            }
        }
        T6().setLength(0);
        if (v6.length() != 0) {
            T6().append(v6);
        }
        if (str2 != null && str2.length() != 0) {
            T6().append(", ");
            T6().append(str2);
        }
        if (str != null && str.length() != 0) {
            T6().append(", ");
            T6().append(str);
        }
        return T6().toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final StringBuilder T6() {
        return (StringBuilder) this.E.getValue();
    }

    public abstract void U6(T t);

    public final boolean W6(View view) {
        T t = this.D;
        if (t != null) {
            u1c0 J0 = J0();
            int i = J0 != null ? J0.k : 0;
            p580 p580Var = this.H;
            if (p580Var != null) {
                DiscoverMediaBlock discoverMediaBlock = this.C;
                qi6.b bVar = p580Var.b;
                if (bVar != null) {
                    bVar.a(view, t.c, discoverMediaBlock, i);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.vk.feed.core.models.discover.DiscoverGridItem] */
    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        NewsEntry newsEntry = u1c0Var.b;
        this.C = newsEntry instanceof DiscoverMediaBlock ? (DiscoverMediaBlock) newsEntry : null;
        if (u1c0Var instanceof k2n) {
            ?? r0 = ((k2n) u1c0Var).s;
            this.D = r0 != 0 ? r0 : null;
        }
        super.a6(u1c0Var);
    }

    public void onClick(View view) {
        T t;
        if (jjc.b() || (t = this.D) == null) {
            return;
        }
        J0();
        p580 p580Var = this.H;
        if (p580Var != null) {
            p580Var.a(view, t);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return W6(view);
    }
}
