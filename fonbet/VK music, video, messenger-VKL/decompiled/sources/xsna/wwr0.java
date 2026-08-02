package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import xsna.xwr0;

/* compiled from: VideoActionCompleteDataMapperImpl.kt */
/* loaded from: classes3.dex */
public final class wwr0 implements vwr0 {
    public final VideoFile a;
    public final View.OnClickListener b;
    public final Context c;

    public wwr0(VideoFile videoFile, View.OnClickListener onClickListener, Context context) {
        this.a = videoFile;
        this.b = onClickListener;
        this.c = context;
    }

    @Override // xsna.vwr0
    public final xwr0.a c() {
        String string;
        ActionLinkSnippet actionLinkSnippet;
        ActionLink m1 = this.a.m1();
        if (m1 == null || (actionLinkSnippet = m1.f) == null || (string = actionLinkSnippet.e) == null) {
            string = this.c.getString(R.string.video_complete_view_text);
        }
        return new xwr0.a(string, this.b);
    }
}
