package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.clickable.ClickableApp;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.stat.domain.LoadStrategy;

/* compiled from: StoryBottomViewGroupCallback.kt */
/* loaded from: classes6.dex */
public interface nzl0 extends mbm0 {
    boolean a(UserId userId);

    void b(int i, UserId userId);

    void c();

    void d();

    boolean e();

    void g(m8m0 m8m0Var);

    MobileOfficialAppsConStoriesStat$ViewEntryPoint getViewEntryPoint();

    void h(zzs zzsVar);

    io.reactivex.rxjava3.core.a i(StoryEntry storyEntry, boolean z, Integer num);

    boolean isPlaying();

    void j();

    void k();

    boolean l();

    void m(Narrative narrative);

    void n(StoryEntry storyEntry);

    io.reactivex.rxjava3.core.q<tnm0> o(v3u0 v3u0Var, LoadStrategy loadStrategy);

    u8m0 p();

    void q();

    void r();

    void s();

    void t(ClickableSticker clickableSticker);

    void u(ClickableApp clickableApp);

    void v();

    void w(m8m0 m8m0Var);
}
