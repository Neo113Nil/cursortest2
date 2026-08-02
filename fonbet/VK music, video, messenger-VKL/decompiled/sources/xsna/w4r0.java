package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.uxpolls.UxPoll;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import com.vk.video.polls.entrypoint.model.UxPollType;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: UxPollsDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class w4r0 implements u4r0 {
    public final m5r0 a;
    public final b25 b;
    public final ujm0 c;
    public final ConcurrentHashMap<Integer, UxPoll> d = new ConcurrentHashMap<>();

    /* compiled from: UxPollsDelegateImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UxPollType.values().length];
            try {
                iArr[UxPollType.DiscoveryPoll.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UxPollType.RecommendationsPoll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public w4r0(m5r0 m5r0Var, b25 b25Var, ujm0 ujm0Var) {
        this.a = m5r0Var;
        this.b = b25Var;
        this.c = ujm0Var;
    }

    @Override // xsna.u4r0
    public final io.reactivex.rxjava3.internal.operators.maybe.m a() {
        return new io.reactivex.rxjava3.internal.operators.maybe.m(new io.reactivex.rxjava3.internal.operators.maybe.p(new dil(this, 2)), new i3u(new ptl0(this, 10), 17));
    }

    @Override // xsna.u4r0
    public final boolean b() {
        return c() && this.d.get(1355) != null;
    }

    @Override // xsna.u4r0
    public final boolean c() {
        VideoFeatures videoFeatures = VideoFeatures.PLAYER_TECH_BUGREPORT;
        videoFeatures.getClass();
        return !com.vk.toggle.b.A.a(videoFeatures) && this.b.b() && BuildInfo.q();
    }

    @Override // xsna.u4r0
    public final void d(Context context, UxPollEntryPointLocation uxPollEntryPointLocation) {
        UxPoll uxPoll = this.d.get(1355);
        if (uxPoll == null || uxPoll.d.isEmpty()) {
            return;
        }
        ((com.vk.video.polls.nav.b) this.c.invoke(context)).a(new puo0(this, uxPoll, uxPollEntryPointLocation));
    }
}
