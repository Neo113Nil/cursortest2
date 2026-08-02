package xsna;

import android.widget.TextView;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem;
import com.vkontakte.android.R;

/* compiled from: AuthorSignViewHolder.kt */
/* loaded from: classes4.dex */
public final class ad5 extends slc0<PostingSettingsCommunityItem.a> {
    public ad5() {
        throw null;
    }

    @Override // xsna.slc0
    public final int q6(PostingSettingsCommunityItem.a aVar) {
        return aVar.b ? R.string.posting_settings_action_unsign : R.string.posting_settings_action_sign;
    }

    @Override // xsna.slc0
    /* renamed from: v6, reason: merged with bridge method [inline-methods] */
    public final void i6(PostingSettingsCommunityItem.a aVar) {
        super.i6(aVar);
        boolean z = aVar.b;
        TextView textView = this.s;
        if (z) {
            textView.setText(R.string.posting_settings_with_author_sign);
            t6(this.q);
        } else {
            textView.setText(R.string.newsfeed_newpost_without_sign);
            t6(this.o);
        }
        if (!aVar.c) {
            this.itemView.setClickable(true);
            return;
        }
        this.itemView.setClickable(false);
        textView.setText(R.string.newsfeed_newpost_without_sign);
        t6(this.p);
    }
}
