package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.vk.clips.design.view.feed.item.onboarding.FastForwardOnboardingView;
import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.syc;

/* compiled from: ClipFeedOnboardingDelegate.kt */
/* loaded from: classes17.dex */
public final class tyc implements View.OnTouchListener {
    public final /* synthetic */ FastForwardOnboardingView b;
    public final /* synthetic */ syc.a.c c;
    public final /* synthetic */ long d;
    public final /* synthetic */ syc e;

    public tyc(FastForwardOnboardingView fastForwardOnboardingView, syc.a.c cVar, long j, syc sycVar) {
        this.b = fastForwardOnboardingView;
        this.c = cVar;
        this.d = j;
        this.e = sycVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.b.setOnTouchListener(null);
        long currentTimeMillis = System.currentTimeMillis();
        CommonOnboardingStat$TypeOnboardingEvent.EventType eventType = CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW;
        long j = this.c.c;
        long j2 = this.d;
        new g2e(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS, SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, Long.valueOf(j), null, null, null, null, 60, null), String.valueOf(j2), String.valueOf(currentTimeMillis), null, new CommonOnboardingStat$TypeOnboardingEvent(CommonOnboardingStat$TypeOnboardingEvent.OnboardingType.HIGHLIGHTER, eventType, "clips:fast_forward", 0, null, null, Long.valueOf(currentTimeMillis - j2), null, 176, null), 8), qsk0.a).q();
        this.e.d();
        return true;
    }
}
