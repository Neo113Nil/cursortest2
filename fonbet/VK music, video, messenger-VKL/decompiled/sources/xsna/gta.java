package xsna;

import com.vk.api.generated.stories.dto.StoriesSetPrivacyPrivacyDto;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChangeStoryPrivacyDelegate.kt */
/* loaded from: classes6.dex */
public final class gta implements w8i {
    public mkm0 b;
    public StoryBottomViewGroup c;
    public final bpn0 d = new bpn0(new hh1(this, 9));
    public final bpn0 e = new bpn0(new s4(this, 17));
    public final bpn0 f = new bpn0(new ry0(this, 12));
    public final bpn0 g = new bpn0(new cj4(2));
    public io.reactivex.rxjava3.disposables.c h = EmptyDisposable.INSTANCE;

    /* compiled from: ChangeStoryPrivacyDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryPrivacyType.values().length];
            try {
                iArr[StoryPrivacyType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryPrivacyType.FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryPrivacyType.BEST_FRIENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoryPrivacyType.ONLY_ME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoryPrivacyType.FRIENDS_OF_FRIENDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoryPrivacyType.SOME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoryPrivacyType.EXCLUDED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static StoryPrivacyType c(StoryEntry storyEntry) {
        if (storyEntry.p) {
            return StoryPrivacyType.ALL;
        }
        String str = storyEntry.x0;
        StoryPrivacyType storyPrivacyType = null;
        if (str != null && str.length() != 0) {
            StoryPrivacyType[] values = StoryPrivacyType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StoryPrivacyType storyPrivacyType2 = values[i];
                if (epx.f(storyPrivacyType2.j(), storyEntry.x0)) {
                    storyPrivacyType = storyPrivacyType2;
                    break;
                }
                i++;
            }
        }
        return storyPrivacyType != null ? storyPrivacyType : storyEntry.w0 ? StoryPrivacyType.BEST_FRIENDS : storyEntry.K ? StoryPrivacyType.FRIENDS : StoryPrivacyType.ALL;
    }

    public final void a() {
        this.h.dispose();
        this.h = io.reactivex.rxjava3.core.q.R(16L, TimeUnit.MILLISECONDS).a0(asu0.a.d()).subscribe(new v8(new u8(this, 16), 14));
    }

    public final void b() {
        this.h.dispose();
        mkm0 mkm0Var = this.b;
        if (mkm0Var != null) {
            mkm0Var.play();
        }
    }

    public final g9m0 d() {
        return (g9m0) this.d.getValue();
    }

    public final void e(StoryEntry storyEntry, StoryPrivacyType storyPrivacyType, po6 po6Var) {
        StoriesSetPrivacyPrivacyDto storiesSetPrivacyPrivacyDto;
        boolean z = storyPrivacyType != c(storyEntry);
        if (z || storyPrivacyType == StoryPrivacyType.ALL) {
            switch (a.$EnumSwitchMapping$0[storyPrivacyType.ordinal()]) {
                case 1:
                    storiesSetPrivacyPrivacyDto = StoriesSetPrivacyPrivacyDto.ALL;
                    break;
                case 2:
                    storiesSetPrivacyPrivacyDto = StoriesSetPrivacyPrivacyDto.FRIENDS;
                    break;
                case 3:
                    storiesSetPrivacyPrivacyDto = StoriesSetPrivacyPrivacyDto.BEST_FRIENDS;
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    storiesSetPrivacyPrivacyDto = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (storiesSetPrivacyPrivacyDto == null) {
                b();
                po6Var.X0(po6Var.r);
            } else {
                a();
                hg1.b(po6Var, new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.n(hg1.n(new io.reactivex.rxjava3.internal.operators.single.o(rsg0.W(yfb.x(((zul0) this.g.getValue()).i(storyEntry.c, storiesSetPrivacyPrivacyDto)), 7), new defpackage.n(new iu9(this, storyPrivacyType, storyEntry, 1), 13)).m(asu0.a.d()), po6Var.getContext(), false, null, 62), new defpackage.p(new ec(this, 19), 7)), new is2(this, 1)).subscribe(new az(new ata(this, storyPrivacyType, storyEntry, po6Var, z), 7), new cz(new bz(7), 10)));
            }
        }
    }
}
