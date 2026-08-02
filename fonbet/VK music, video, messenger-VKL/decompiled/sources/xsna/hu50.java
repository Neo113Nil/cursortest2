package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stories.StorySettingsActivity;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import xsna.ds60;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu50 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hu50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((x4w) obj2).invoke(obj);
                break;
            case 1:
                ((px30) obj2).invoke(obj);
                break;
            case 2:
                rq60 rq60Var = (rq60) obj2;
                Post post = (Post) obj;
                if (epx.f(post.m, post.o.b)) {
                    rq60Var.a(new ds60.b(new NewsfeedExternalAction.c.f0(post)));
                }
                rq60Var.c(new yo60.g.c(R.string.post_edit_saved));
                break;
            case 3:
                ((gzn) obj2).invoke(obj);
                break;
            case 4:
                ((px30) obj2).invoke(obj);
                break;
            case 5:
                ((hoc) obj2).invoke(obj);
                break;
            case 6:
                int i2 = u1a0.A1;
                ((px30) obj2).invoke(obj);
                break;
            case 7:
                ((px30) obj2).invoke(obj);
                break;
            case 8:
                ((xld) obj2).invoke(obj);
                break;
            case 9:
                ((px30) obj2).invoke(obj);
                break;
            case 10:
                ((h440) obj2).invoke(obj);
                break;
            case 11:
                ((hn0) obj2).invoke(obj);
                break;
            case 12:
                ((px30) obj2).invoke(obj);
                break;
            case 13:
                ((hn0) obj2).invoke(obj);
                break;
            case 14:
                ((n1g0) obj2).invoke(obj);
                break;
            case 15:
                ((uqh0) obj2).invoke(obj);
                break;
            case 16:
                ((n1g0) obj2).invoke(obj);
                break;
            case 17:
                int i3 = SettingsListFragment.X0;
                ((r9c0) obj2).invoke(obj);
                break;
            case 18:
                ((o83) obj2).invoke(obj);
                break;
            case 19:
                ((whg0) obj2).invoke(obj);
                break;
            case 20:
                ((n1g0) obj2).invoke(obj);
                break;
            case 21:
                ((p3m0) obj2).invoke(obj);
                break;
            case 22:
                ((hn0) obj2).invoke(obj);
                break;
            case 23:
                int i4 = StorySettingsActivity.P;
                ((whg0) obj2).invoke(obj);
                break;
            case 24:
                ((whg0) obj2).invoke(obj);
                break;
            case 25:
                ((ydn0) obj2).invoke(obj);
                break;
            case 26:
                ((ydn0) obj2).invoke(obj);
                break;
            case 27:
                ((whg0) obj2).invoke(obj);
                break;
            case 28:
                ((whg0) obj2).invoke(obj);
                break;
            default:
                ((n8) obj2).invoke(obj);
                break;
        }
    }
}
