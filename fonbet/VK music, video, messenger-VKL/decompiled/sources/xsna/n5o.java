package xsna;

import android.content.res.ColorStateList;
import android.widget.TextView;
import com.vk.dto.posting.DonutPostingSettings;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.DonutSettingsDialogConfig;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DonutViewHolder.kt */
/* loaded from: classes4.dex */
public final class n5o extends slc0<PostingSettingsCommunityItem.b> {

    /* compiled from: DonutViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DonutSettingsDialogConfig.Mode.values().length];
            try {
                iArr[DonutSettingsDialogConfig.Mode.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DonutSettingsDialogConfig.Mode.Dones.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public n5o() {
        throw null;
    }

    @Override // xsna.slc0
    public final /* bridge */ /* synthetic */ int q6(PostingSettingsCommunityItem.b bVar) {
        return R.string.posting_settings_action_privacy;
    }

    @Override // xsna.slc0
    /* renamed from: v6, reason: merged with bridge method [inline-methods] */
    public final void i6(PostingSettingsCommunityItem.b bVar) {
        super.i6(bVar);
        int i = a.$EnumSwitchMapping$0[bVar.b.ordinal()];
        TextView textView = this.s;
        if (i == 1) {
            at.d(this.itemView, R.string.newsfeed_newpost_for_all, textView);
            t6(this.o);
            his0.v(textView, R.drawable.vk_icon_unlock_outline_20, 0);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = this.r;
        hno0.a(textView, ColorStateList.valueOf(i2));
        String string = this.itemView.getContext().getString(R.string.newsfeed_newpost_for_paid);
        DonutPostingSettings.Duration duration = bVar.c;
        String str = duration != null ? duration.c : null;
        if (!((duration != null ? duration.b : 0) > 0)) {
            str = null;
        }
        String concat = str != null ? ": ".concat(str) : null;
        StringBuilder e = fw3.e(string);
        if (concat != null) {
            e.append(concat);
        }
        textView.setText(e.toString());
        t6(i2);
        his0.v(textView, R.drawable.vk_icon_donut_outline_20, 0);
    }
}
