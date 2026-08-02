package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.dzen.DzenStory;
import com.vk.feed.core.models.dzen.DzenTopStoriesHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.dzen.header.DzenNewsHeader;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.tlo0;

/* compiled from: DzenNewsHeaderHolder.kt */
/* loaded from: classes4.dex */
public final class rto extends qi6<NewsEntry> {
    public final DzenNewsHeader C;
    public final Object D;
    public final int E;
    public final tvw F;
    public boolean G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rto(ViewGroup viewGroup) {
        super(R.layout.news_dzen_header_item, viewGroup);
        viewGroup.getContext();
        getContext();
        View view = this.itemView;
        this.C = view instanceof DzenNewsHeader ? (DzenNewsHeader) view : null;
        VkGroupHeader vkGroupHeader = view instanceof VkGroupHeader ? (VkGroupHeader) view : null;
        this.D = msy.a(LazyThreadSafetyMode.NONE, new tbh(this, 9));
        this.E = cn70.b(28);
        this.F = new tvw();
        if (vkGroupHeader != null) {
            vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
        }
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        String str;
        Integer num;
        String str2;
        int intValue;
        Image image;
        ImageSize Cb;
        boolean z = newsEntry instanceof DzenNews;
        DzenTopStoriesHeader.DzenImage dzenImage = z ? ((DzenNews) newsEntry).i.b : null;
        if (dzenImage == null || (image = dzenImage.b) == null || (Cb = image.Cb(this.E, true, false)) == null || (str = Cb.d.d) == null) {
            str = dzenImage != null ? dzenImage.c : null;
        }
        if (dzenImage == null || (str2 = dzenImage.d) == null) {
            num = null;
        } else {
            Context context = this.itemView.getContext();
            if (str2.equals("news_color_28")) {
                intValue = R.drawable.vk_icon_news_color_28;
            } else {
                Integer d = wp.d(context, "vk_icon_", str2, "_28");
                if (d != null) {
                    intValue = d.intValue();
                } else {
                    Integer d2 = wp.d(context, "vk_icon_", str2, "_outline_28");
                    intValue = d2 != null ? d2.intValue() : 0;
                }
            }
            num = Integer.valueOf(intValue);
        }
        DzenNewsHeader dzenNewsHeader = this.C;
        if (str == null || str.length() == 0) {
            if (num != null) {
                if (dzenNewsHeader != null) {
                    dzenNewsHeader.setLeft(new DzenNewsHeader.a.C1051a(new gko(num.intValue())));
                }
            } else if (dzenNewsHeader != null) {
                dzenNewsHeader.setLeft((DzenNewsHeader.a) null);
            }
        } else if (dzenNewsHeader != null) {
            dzenNewsHeader.setLeft(new DzenNewsHeader.a.b(str));
        }
        String str3 = z ? ((DzenNews) newsEntry).i.c : newsEntry instanceof DzenStory ? ((DzenStory) newsEntry).i.c : null;
        if (str3 != null && str3.length() != 0) {
            boolean z2 = !z && (newsEntry instanceof DzenStory);
            if (this.G != z2) {
                if (dzenNewsHeader != null) {
                    dzenNewsHeader.setSize(z2 ? DzenNewsHeader.Size.Large : DzenNewsHeader.Size.Medium);
                }
                this.G = z2;
            }
            if (dzenNewsHeader != null) {
                dzenNewsHeader.setTitle(new DzenNewsHeader.c(oq.d(tlo0.Companion, str3)));
            }
        } else if (dzenNewsHeader != null) {
            dzenNewsHeader.setTitle(null);
        }
        String str4 = z ? ((DzenNews) newsEntry).i.d : null;
        if (str4 == null || str4.length() == 0) {
            if (dzenNewsHeader != null) {
                dzenNewsHeader.setRight((DzenNewsHeader.b) null);
            }
        } else {
            baf0 baf0Var = (!z || ((DzenNews) newsEntry).i.e == null) ? null : (baf0) this.D.getValue();
            if (dzenNewsHeader != null) {
                tlo0.h d3 = oq.d(tlo0.Companion, str4);
                baf0 baf0Var2 = baf0Var != null ? baf0Var : null;
                dzenNewsHeader.setRight(new DzenNewsHeader.b.a(d3, baf0Var2 != null ? new eko(baf0Var2) : null, baf0Var != null, new btm(this, 2)));
            }
        }
    }
}
