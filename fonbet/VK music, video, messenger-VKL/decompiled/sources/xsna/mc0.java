package xsna;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Map;

/* compiled from: AdAnalyticsDataSerializer.kt */
/* loaded from: classes6.dex */
public final class mc0 implements h16 {
    public final Object a;
    public final Object b;
    public final Object c;

    public /* synthetic */ mc0(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static String c(NewsEntry newsEntry) {
        return "https://" + a0a.d + '/' + newsEntry.Ab();
    }

    @Override // xsna.h16
    public Map a() {
        return (Map) this.c;
    }

    public String b(NewsEntry newsEntry) {
        Post R = di60.R(newsEntry);
        Videos videos = newsEntry instanceof Videos ? (Videos) newsEntry : null;
        if (o25.b((b25) this.a)) {
            if (!(newsEntry instanceof Post)) {
                return "https://sferum.ru/?p=channel&channelId=" + k9q0.o(newsEntry);
            }
            StringBuilder sb = new StringBuilder("https://sferum.ru/?p=channel&channelId=");
            Post post = (Post) newsEntry;
            sb.append(post.m);
            sb.append("&postId=");
            sb.append(post.n);
            return sb.toString();
        }
        if (R != null) {
            boolean z = R.nc() || R.dc();
            Owner owner = R.Q;
            return (!z || owner == null) ? c(R) : ((n4c0) this.b).a(owner, R.n);
        }
        if (videos == null) {
            return c(newsEntry);
        }
        Attachment R1 = videos.R1();
        if (!(R1 instanceof VideoAttachment)) {
            return c(newsEntry);
        }
        String a = fss0.a(((VideoAttachment) R1).k);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SHARING_LINK_WITH_APP;
        videoFeatures.getClass();
        return com.vk.toggle.b.A.a(videoFeatures) ? ((com.vk.video.ui.share.api.b) this.c).c(a) : a;
    }

    @Override // xsna.h16
    public Integer d() {
        return (Integer) this.a;
    }

    @Override // xsna.h16
    public Integer g() {
        return (Integer) this.b;
    }

    public mc0(View view) {
        this.a = (VkTopBar) view.findViewById(R.id.toolbar);
        this.b = (VkTabs) view.findViewById(R.id.tab_layout);
        this.c = (ViewPager2) view.findViewById(R.id.pager);
    }
}
