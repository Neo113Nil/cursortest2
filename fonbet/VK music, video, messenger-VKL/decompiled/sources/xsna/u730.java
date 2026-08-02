package xsna;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.imageloader.view.VkImageViewTopCrop;
import com.vk.libvideo.api.Subscription;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.poll.fragments.PollViewerFragment;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.vmoji.character.recommendations.VmojiRecommendationsFragment;
import java.util.List;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.naw0;
import xsna.p8c0;
import xsna.s8z0;
import xsna.xex0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u730 implements io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.l, Toolbar.h, UsableRecyclerPaginatedView.a, m6o, io.reactivex.rxjava3.functions.m, SwipeDrawableRefreshLayout.g, s8z0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u730(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return (a830) ((wzs) this.c).invoke(obj, obj2);
            case 1:
                return (List) ((rv4) this.c).invoke((List) obj, obj2);
            default:
                return (io.reactivex.rxjava3.core.q) ((wxh0) this.c).invoke(obj, obj2);
        }
    }

    @Override // xsna.m6o
    public double b(double d) {
        pjp0 pjp0Var = (pjp0) this.c;
        double d2 = pjp0Var.b;
        double d3 = pjp0Var.c;
        double d4 = pjp0Var.d;
        return d >= pjp0Var.e ? Math.pow((d2 * d) + d3, pjp0Var.a) + pjp0Var.f : (d4 * d) + pjp0Var.g;
    }

    @Override // me.grishka.appkit.views.UsableRecyclerPaginatedView.a
    public void h() {
        switch (this.b) {
            case 9:
                com.vk.lists.c cVar = ((QuestionsListFragment) this.c).U;
                if (cVar != null) {
                    cVar.p(false);
                    break;
                }
                break;
            default:
                ((VmojiRecommendationsFragment.b) this.c).invoke(naw0.d.b);
                break;
        }
    }

    @Override // xsna.s8z0.a
    public void i(z9z0 z9z0Var) {
        ((ydz0) this.c).x = z9z0Var;
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        PollViewerFragment pollViewerFragment = (PollViewerFragment) this.c;
        int i = PollViewerFragment.d0;
        return pollViewerFragment.onOptionsItemSelected(menuItem);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 12:
                return ((Boolean) ((bqt) this.c).invoke(obj)).booleanValue();
            case 15:
                return ((Boolean) ((ece0) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((t9o0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 2:
                return (io.reactivex.rxjava3.core.b0) ((u3u) obj2).invoke(obj);
            case 3:
                return (x960) ((bqt) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((u3u) obj2).invoke(obj);
            case 5:
                return (List) ((com.vk.movika.sdk.base.logic.processor.d) obj2).invoke(obj);
            case 6:
                int i2 = PollResultsFragment.b0;
                return (com.vk.dto.polls.a) ((com.vk.movika.sdk.base.logic.processor.d) obj2).invoke(obj);
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 19:
            default:
                return (nex0) ((xex0.d) obj2).invoke(obj);
            case 8:
                return (p8c0.b) ((u3u) obj2).invoke(obj);
            case 13:
                return (ThemeChooserState) ((ece0) obj2).invoke(obj);
            case 14:
                return (String) ((t9o0) obj2).invoke(obj);
            case 16:
                return (i700) ((t62) obj2).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.t) ((jl6) obj2).invoke(obj);
            case 18:
                return (Subscription) ((av70) obj2).invoke(obj);
            case 20:
                int i3 = VkImageViewTopCrop.c;
                return (io.reactivex.rxjava3.core.t) ((zy2) obj2).invoke(obj);
            case 21:
                return (xpp) ((ece0) obj2).invoke(obj);
        }
    }
}
