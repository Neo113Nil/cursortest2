package xsna;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.dto.photo.Photo;
import com.vk.feed.tool.view.newsfeed.digest.DigestLayout;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.List;
import xsna.dek0;

/* compiled from: DigestMediaItemHolder.kt */
/* loaded from: classes4.dex */
public class mym extends DigestLayout.d<DigestItem> {
    public final ViewGroup e;
    public final FrescoImageView f;
    public final TextView g;
    public final View h;

    public mym(DigestLayout digestLayout) {
        super(digestLayout);
        this.e = (ViewGroup) this.b.findViewById(R.id.container);
        FrescoImageView frescoImageView = (FrescoImageView) this.b.findViewById(R.id.picture);
        this.f = frescoImageView;
        this.g = (TextView) this.b.findViewById(R.id.duration);
        this.h = this.b.findViewById(R.id.iv_amp);
        int i = dek0.a;
        dek0.b(frescoImageView, null, new dek0.a(cn70.a() * 4.0f, true), 2);
        frescoImageView.setAspectRatio(1.0f);
        frescoImageView.setScaleType(ScaleType.CENTER_CROP);
        frescoImageView.setCornerRadius(cn70.b(4));
        frescoImageView.l(cn70.a() * 0.5f, digestLayout.getContext().getColor(R.color.vk_black_alpha12));
        frescoImageView.setPlaceholder(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)));
    }

    public void b(VideoAttachment videoAttachment) {
        FrescoImageView frescoImageView = this.f;
        frescoImageView.setLocalImage((fxj0) null);
        frescoImageView.setRemoteImage((List<? extends fxj0>) videoAttachment.k.getImage().b);
        int duration = videoAttachment.k.getDuration();
        TextView textView = this.g;
        if (duration > 0) {
            gpt0 gpt0Var = gpt0.a;
            textView.setText(z8s.a(duration));
            bwt0.p0(textView, true);
        } else {
            bwt0.p0(textView, false);
        }
        bwt0.p0(this.h, false);
    }

    @Override // com.vk.feed.tool.view.newsfeed.digest.DigestLayout.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(DigestItem digestItem) {
        Image image;
        Image image2;
        Attachment d = digestItem.d();
        boolean z = d instanceof PhotoAttachment;
        View view = this.h;
        TextView textView = this.g;
        ArrayList arrayList = null;
        FrescoImageView frescoImageView = this.f;
        if (z) {
            frescoImageView.setLocalImage((fxj0) null);
            frescoImageView.setRemoteImage((List<? extends fxj0>) ((PhotoAttachment) d).l.y.b);
            bwt0.p0(textView, false);
            bwt0.p0(view, false);
            return;
        }
        if (d instanceof VideoAttachment) {
            b((VideoAttachment) d);
            return;
        }
        if (d instanceof SnippetAttachment) {
            SnippetAttachment snippetAttachment = (SnippetAttachment) d;
            frescoImageView.setLocalImage((fxj0) null);
            Photo photo = snippetAttachment.p;
            if (photo != null && (image2 = photo.y) != null) {
                arrayList = image2.b;
            }
            frescoImageView.setRemoteImage((List<? extends fxj0>) arrayList);
            bwt0.p0(textView, false);
            bwt0.p0(view, snippetAttachment.q != null);
            return;
        }
        if (!(d instanceof ArticleAttachment)) {
            frescoImageView.setLocalImage((fxj0) null);
            frescoImageView.setRemoteImage((fxj0) null);
            bwt0.p0(textView, false);
            bwt0.p0(view, false);
            return;
        }
        frescoImageView.setLocalImage((fxj0) null);
        Photo photo2 = ((ArticleAttachment) d).f.l;
        if (photo2 != null && (image = photo2.y) != null) {
            arrayList = image.b;
        }
        frescoImageView.setRemoteImage((List<? extends fxj0>) arrayList);
        bwt0.p0(textView, false);
        bwt0.p0(view, true);
    }
}
