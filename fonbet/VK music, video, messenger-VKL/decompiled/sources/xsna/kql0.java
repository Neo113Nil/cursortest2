package xsna;

import com.vk.api.generated.stories.dto.StoriesBackgroundDto;
import com.vk.api.generated.stories.dto.StoriesGetBackgroundsResponseDto;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.dto.stories.model.StoryBackground;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: StoriesBackgroundRepositoryImpl.kt */
/* loaded from: classes18.dex */
public final class kql0 implements iql0 {
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public final avl0 a = new avl0();
    public final bpn0 b = new bpn0(new jql0(0));
    public final bpn0 c = new bpn0(new z4d0(this, 10));

    /* compiled from: StoriesBackgroundRepositoryImpl.kt */
    public final class a extends c320<StoriesGetBackgroundsResponseDto> {
        public a() {
            super(TimeUnit.HOURS.toMillis(2L));
        }

        @Override // xsna.c320
        public final io.reactivex.rxjava3.core.q<StoriesGetBackgroundsResponseDto> d() {
            kql0.this.a.getClass();
            return rsg0.y0(yfb.x(new tfx("stories.getBackgrounds", new bt(27), new ct(26))), null, null, 3);
        }
    }

    @Override // xsna.iql0
    public final void a() {
        PrivateFiles.a b;
        ((a) this.c.getValue()).a();
        b = e8r.a.b(r1, PrivateSubdir.STORIES_BACKGROUND.h(), true);
        nbr.l(b.a);
    }

    @Override // xsna.iql0
    public final io.reactivex.rxjava3.core.q<StoryBackground> b() {
        return new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.p0(c().U(new u1j0(new cd10(19), 3)), new vga0(new ubj0(4), 5)), new a840(new hwi0(6), 9)).L(new p5w(new tml0(this, 1), 20), false);
    }

    @Override // xsna.iql0
    public final io.reactivex.rxjava3.core.q<Map<StoryBackgroundType, List<StoryBackground>>> c() {
        return ((a) this.c.getValue()).b().r0(io.reactivex.rxjava3.schedulers.a.b()).U(new xq70(new qyi0(this, 4), 15));
    }

    public final ArrayList d(StoryBackgroundType storyBackgroundType, List list) {
        List<StoriesBackgroundDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (StoriesBackgroundDto storiesBackgroundDto : list2) {
            ((hql0) this.b.getValue()).getClass();
            arrayList.add(new StoryBackground(storyBackgroundType, storiesBackgroundDto.f(), storiesBackgroundDto.getUrl(), storiesBackgroundDto.g(), storiesBackgroundDto.d(), storiesBackgroundDto.e(), false, null, null, 448, null));
        }
        return arrayList;
    }
}
