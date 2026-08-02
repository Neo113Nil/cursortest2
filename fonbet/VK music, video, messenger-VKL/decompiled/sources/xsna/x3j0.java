package xsna;

import android.view.View;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem;
import com.vkontakte.android.R;

/* compiled from: SettingsViewHolder.kt */
/* loaded from: classes4.dex */
public final class x3j0 extends slc0<PostingSettingsCommunityItem.d> {
    public final h7v t;

    public x3j0(View view, wmc wmcVar) {
        super(view, wmcVar);
        this.t = pla.e().b();
        his0.v(this.s, R.drawable.vk_icon_gear_outline_20, 0);
        this.s.setCompoundDrawablePadding(cn70.b(0));
        this.s.setContentDescription(this.itemView.getContext().getString(R.string.posting_settings_title));
    }

    @Override // xsna.slc0, xsna.vif0
    public final void i6(Object obj) {
        PostingSettingsCommunityItem.d dVar = (PostingSettingsCommunityItem.d) obj;
        super.i6(dVar);
        t6(dVar.b ? this.q : this.o);
    }

    @Override // xsna.slc0
    public final /* bridge */ /* synthetic */ int q6(PostingSettingsCommunityItem.d dVar) {
        return R.string.posting_settings_action_to_settings;
    }

    @Override // xsna.slc0
    /* renamed from: s6 */
    public final void i6(PostingSettingsCommunityItem.d dVar) {
        PostingSettingsCommunityItem.d dVar2 = dVar;
        super.i6(dVar2);
        t6(dVar2.b ? this.q : this.o);
    }
}
