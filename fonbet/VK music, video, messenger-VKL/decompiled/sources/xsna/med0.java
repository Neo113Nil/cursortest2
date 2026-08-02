package xsna;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.stories.StorySettingsActivity;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ned0;
import xsna.ngv0;
import xsna.tgv0;

/* compiled from: PrivacySettingView.kt */
/* loaded from: classes5.dex */
public final class med0 extends ConstraintLayout {
    public final NewsfeedRouter t;
    public int u;
    public PrivacySetting v;
    public final VkRichCell w;

    public med0(StorySettingsActivity storySettingsActivity, NewsfeedRouter newsfeedRouter) {
        super(storySettingsActivity, null, 0);
        this.t = newsfeedRouter;
        VkRichCell vkRichCell = new VkRichCell(storySettingsActivity, null, 0);
        this.w = vkRichCell;
        addView(vkRichCell);
        setBackground(m33.a(e3m.g(R.attr.selectableItemBackground, storySettingsActivity), storySettingsActivity));
        setOnClickListener(new jkc(5, this, storySettingsActivity));
    }

    public final PrivacySetting getPrivacySetting() {
        return this.v;
    }

    public final void setModel(ned0 ned0Var) {
        tgv0.a aVar;
        qgv0 qgv0Var;
        this.u = ned0Var.d;
        PrivacySetting privacySetting = ned0Var.b;
        this.v = privacySetting;
        ned0.a aVar2 = ned0Var.a;
        if (aVar2.a.isEmpty()) {
            aVar = null;
            qgv0Var = new qgv0(oq.d(tlo0.Companion, epx.f(privacySetting.b, "stories_exclude") ? getContext().getString(R.string.story_settings_excluded_subtitle) : ned0Var.c), (ngv0.a) null, (ngv0.a) null, 0, 30);
        } else {
            List<String> list = aVar2.a;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                itj0.d((String) it.next(), arrayList);
            }
            qgv0Var = null;
            aVar = new tgv0.a(arrayList, null, hq.b(tlo0.Companion, R.plurals.users_quantity, aVar2.b), null, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        }
        this.w.setMiddle(ahn.v(new vgv0(oq.d(tlo0.Companion, privacySetting.c), (ngv0.a) null, (ngv0) null, 2, 22), null, qgv0Var, null, aVar, null, null, 490));
    }
}
