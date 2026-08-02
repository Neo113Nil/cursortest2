package xsna;

import com.vk.dto.group.Group;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.settings.impl.presentation.base.fragment.settings.RedesignNotificationSettingsFragment;
import com.vk.stickers.views.animation.VKAnimationView;
import kotlin.Pair;
import xsna.el50;
import xsna.kyd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ca10 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ca10(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((o43) obj2).invoke(obj);
                break;
            case 1:
                ((f2s) obj2).invoke(obj);
                break;
            case 2:
                ((gz30) obj2).invoke(obj);
                break;
            case 3:
                ((ue40) obj2).invoke(obj);
                break;
            case 4:
                ((qey) obj2).invoke(obj);
                break;
            case 5:
                ((z4v) obj2).invoke(obj);
                break;
            case 6:
                ((v4w) obj2).invoke(obj);
                break;
            case 7:
                ((r6h) obj2).invoke(obj);
                break;
            case 8:
                ((v4w) obj2).invoke(obj);
                break;
            case 9:
                sma0 sma0Var = (sma0) obj2;
                Pair pair = (Pair) obj;
                el50.a.b(sma0Var, new ftm(sma0Var, (kna0) pair.g(), (Group) pair.d(), 6));
                break;
            case 10:
                ((PollResultsFragment.b.C1521b) obj2).invoke(obj);
                break;
            case 11:
                int i2 = PostingFragment.L0;
                ((gz30) obj2).invoke(obj);
                break;
            case 12:
                ((v4w) obj2).invoke(obj);
                break;
            case 13:
                ((v4w) obj2).invoke(obj);
                break;
            case 14:
                ((kyd0.b) obj2).invoke(obj);
                break;
            case 15:
                ((com.vk.music.onboarding.impl.model.b) obj2).invoke(obj);
                break;
            case 16:
                RedesignNotificationSettingsFragment.a aVar = RedesignNotificationSettingsFragment.Y;
                ((v4w) obj2).invoke(obj);
                break;
            case 17:
                ((izs) obj2).invoke(obj);
                break;
            case 18:
                ((v4w) obj2).invoke(obj);
                break;
            case 19:
                ((gz30) obj2).invoke(obj);
                break;
            case 20:
                ((b8j0) obj2).invoke(obj);
                break;
            case 21:
                ((bbw) obj2).invoke(obj);
                break;
            case 22:
                ((b8j0) obj2).invoke(obj);
                break;
            case 23:
                ((lv2) obj2).invoke(obj);
                break;
            case 24:
                ((tzl0) obj2).invoke(obj);
                break;
            case 25:
                ((gz30) obj2).invoke(obj);
                break;
            case 26:
                ((xva) obj2).invoke(obj);
                break;
            case 27:
                ((b8j0) obj2).invoke(obj);
                break;
            case 28:
                ((b8j0) obj2).invoke(obj);
                break;
            default:
                int i3 = VKAnimationView.w;
                ((glo0) obj2).invoke(obj);
                break;
        }
    }
}
