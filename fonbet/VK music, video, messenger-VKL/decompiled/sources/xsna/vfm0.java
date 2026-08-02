package xsna;

import android.view.View;
import com.vk.api.generated.stories.dto.StoriesSetPrivacyPrivacyDto;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StoryStatisticsPrivacyDelegate.kt */
/* loaded from: classes6.dex */
public final class vfm0 implements w8i {
    public final View b;
    public final wrl0 c;
    public final bpn0 d = new bpn0(new kld0(this, 12));
    public final bpn0 e = new bpn0(new fm20(this, 29));
    public final bpn0 f = new bpn0(new so40(this, 25));
    public final bpn0 g = new bpn0(new ufm0(0));
    public final kam0 h;

    /* compiled from: StoryStatisticsPrivacyDelegate.kt */
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

    public vfm0(View view, wrl0 wrl0Var) {
        this.b = view;
        this.c = wrl0Var;
        this.h = new kam0(view, new viu(25), new orj0(this, 7), new v95(this, 16), new mcl0(4));
    }

    public final g9m0 a() {
        return (g9m0) this.d.getValue();
    }

    public final void b(int i, StoryPrivacyType storyPrivacyType, StoryPrivacyType storyPrivacyType2, svk0 svk0Var) {
        StoriesSetPrivacyPrivacyDto storiesSetPrivacyPrivacyDto;
        if (storyPrivacyType2 == storyPrivacyType) {
            return;
        }
        switch (a.$EnumSwitchMapping$0[storyPrivacyType2.ordinal()]) {
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
            return;
        }
        io.reactivex.rxjava3.internal.operators.single.b0 m = new io.reactivex.rxjava3.internal.operators.single.o(rsg0.W(yfb.x(((zul0) this.g.getValue()).i(i, storiesSetPrivacyPrivacyDto)), 7), new pw40(new js00(11, this, storyPrivacyType2), 11)).m(asu0.a.d());
        View view = this.b;
        hg1.b(view, hg1.n(m, view.getContext(), false, null, 62).subscribe(new wmz(new wd3(27, svk0Var, storyPrivacyType2), 25), new lkz(new eni0(4), 21)));
    }
}
