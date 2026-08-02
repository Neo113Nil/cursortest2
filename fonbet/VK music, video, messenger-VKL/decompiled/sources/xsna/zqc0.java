package xsna;

import android.view.View;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PostponeViewHolder.kt */
/* loaded from: classes4.dex */
public final class zqc0 extends slc0<PostingSettingsCommunityItem.c> {
    public final SimpleDateFormat t;

    public zqc0(View view, wmc wmcVar) {
        super(view, wmcVar);
        this.t = new SimpleDateFormat("HH:mm", Locale.getDefault());
        his0.v(this.s, R.drawable.vk_icon_recent_outline_20, 0);
    }

    @Override // xsna.slc0
    public final /* bridge */ /* synthetic */ int q6(PostingSettingsCommunityItem.c cVar) {
        return R.string.posting_settings_action_postpone;
    }

    @Override // xsna.slc0
    /* renamed from: v6, reason: merged with bridge method [inline-methods] */
    public final void i6(PostingSettingsCommunityItem.c cVar) {
        String string;
        super.i6(cVar);
        Date date = cVar.b;
        t6(date != null ? this.q : this.o);
        if (date != null) {
            string = pvo0.j(date.getTime(), true, true) + ' ' + this.itemView.getContext().getString(R.string.date_at) + ' ' + this.t.format(date);
        } else {
            string = this.itemView.getContext().getString(R.string.posting_settings_now);
        }
        this.s.setText(string);
    }
}
