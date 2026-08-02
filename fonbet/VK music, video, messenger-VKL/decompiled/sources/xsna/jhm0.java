package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.stories.design.view.viewer.StoryStat;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.rwl0;
import xsna.uwl0;

/* compiled from: StoryStatisticsVH.kt */
/* loaded from: classes6.dex */
public final class jhm0 extends cc<uwl0.a.c> {
    public final View p;
    public final Resources q;
    public final FrameLayout r;
    public final StoryStat s;
    public final StoryStat t;
    public final StoryStat u;
    public final Object v;

    public jhm0(View view, rwl0.a aVar) {
        super(view, aVar);
        this.p = view;
        Context context = view.getContext();
        this.q = view.getResources();
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.story_stats_counters_layout);
        this.r = frameLayout;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.story_stats_counters_content_layout);
        this.s = (StoryStat) view.findViewById(R.id.viewers_count_story_stat);
        this.t = (StoryStat) view.findViewById(R.id.likes_count_story_stat);
        this.u = (StoryStat) view.findViewById(R.id.answers_count_story_stat);
        int b = cn70.b(99);
        this.v = msy.a(LazyThreadSafetyMode.NONE, new iri0(this, 7));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new s0w0(b, 6));
        frameLayout.invalidateOutline();
        linearLayout.setBackground(null);
        linearLayout.setForeground(null);
        frameLayout.setBackground(dhr0.w(R.drawable.bg_statistics_button, context));
    }

    @Override // xsna.cc
    public final void b6(uwl0.a.c cVar) {
        uwl0.a.c cVar2 = cVar;
        int i = cVar2.e;
        int i2 = cVar2.d;
        int i3 = cVar2.c;
        FrameLayout frameLayout = this.r;
        StoryStat storyStat = this.s;
        StoryStat storyStat2 = this.u;
        StoryStat storyStat3 = this.t;
        Resources resources = this.q;
        if (i3 <= 0) {
            String string = resources.getString(R.string.story_no_viewers);
            storyStat.setText(string);
            frameLayout.setContentDescription(string + ". " + resources.getString(R.string.story_statistic_block_button));
            f4m.j(storyStat3);
            f4m.j(storyStat2);
            return;
        }
        storyStat.getClass();
        storyStat.b.setText(uqm0.d(i3));
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getQuantityString(R.plurals.story_views_counted, i3, Integer.valueOf(i3)));
        if (i2 > 0) {
            storyStat3.getClass();
            storyStat3.b.setText(uqm0.d(i2));
            storyStat3.setVisibility(0);
            sb.append(", ");
            sb.append(resources.getQuantityString(R.plurals.story_likes_counted, i2, Integer.valueOf(i2)));
        } else {
            f4m.j(storyStat3);
        }
        if (i > 0) {
            storyStat2.getClass();
            storyStat2.b.setText(uqm0.d(i));
            storyStat2.setVisibility(0);
            sb.append(", ");
            sb.append(resources.getQuantityString(R.plurals.story_answers_counted, i, Integer.valueOf(i)));
        } else {
            f4m.j(storyStat2);
        }
        sb.append(". ");
        sb.append(resources.getString(R.string.story_statistic_block_button));
        frameLayout.setContentDescription(sb.toString());
    }

    @Override // xsna.cc
    public final void i6() {
        if (jjc.b()) {
            return;
        }
        super.i6();
    }
}
