package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.newsfeed.EntryDescription;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.List;

/* compiled from: VideoPostcardInfoHolder.kt */
/* loaded from: classes4.dex */
public final class w5t0 extends w2m<Videos> {
    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        View view = this.itemView;
        EntryDescription entryDescription = ((Videos) newsEntry).w;
        bwt0.p0(view, entryDescription != null);
        if (entryDescription == null) {
            return;
        }
        List<LinkButton> list = entryDescription.e;
        String str = entryDescription.d;
        String str2 = entryDescription.c;
        String str3 = entryDescription.b;
        TextView textView = this.C;
        textView.setText(str3);
        textView.setVisibility((str3 == null || drm0.N(str3)) ? 8 : 0);
        TextView textView2 = this.D;
        textView2.setText(str2);
        textView2.setVisibility((str2 == null || drm0.N(str2)) ? 8 : 0);
        TextView textView3 = this.E;
        textView3.setText(str);
        textView3.setVisibility((str == null || drm0.N(str)) ? 8 : 0);
        int size = list.size();
        int i = size > 0 ? 0 : 8;
        TextView textView4 = this.F;
        textView4.setVisibility(i);
        int i2 = size > 1 ? 0 : 8;
        TextView textView5 = this.G;
        textView5.setVisibility(i2);
        int i3 = 0;
        for (Object obj : e43.l(textView4, textView5)) {
            int i4 = i3 + 1;
            String str4 = null;
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            TextView textView6 = (TextView) obj;
            LinkButton linkButton = (LinkButton) j5g.b0(i3, list);
            textView6.setVisibility(linkButton != null ? 0 : 8);
            if (linkButton != null) {
                str4 = linkButton.b;
            }
            textView6.setText(str4);
            i3 = i4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Videos videos;
        Action action;
        if (jjc.b() || (videos = (Videos) q6()) == null) {
            return;
        }
        Attachment R1 = videos.R1();
        VideoAttachment videoAttachment = R1 instanceof VideoAttachment ? (VideoAttachment) R1 : null;
        if (videoAttachment == null) {
            return;
        }
        TextView textView = this.F;
        boolean f = epx.f(view, textView);
        TextView textView2 = this.G;
        if (!f && !epx.f(view, textView2)) {
            fxc0.B().Y().k(this.itemView.getContext(), videoAttachment.k, (r43 & 4) != 0 ? null : videoAttachment.l, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : videoAttachment.m, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
            return;
        }
        EntryDescription entryDescription = videos.w;
        if (entryDescription != null) {
            LinkButton linkButton = (LinkButton) j5g.b0(e43.l(textView, textView2).indexOf(view), entryDescription.e);
            if (linkButton == null || (action = linkButton.c) == null) {
                return;
            }
            Context context = this.itemView.getContext();
            String str = videoAttachment.l;
            di60.w(action, context, videos, str, str, videos.Pb(), 32);
        }
    }
}
