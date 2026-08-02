package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.profile.questions.impl.h;
import com.vk.stories.StorySettingsActivity;
import com.vkontakte.android.R;
import java.util.concurrent.ConcurrentHashMap;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qg60 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qg60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((rop) obj2).invoke(obj);
                break;
            case 1:
                rq60 rq60Var = (rq60) obj2;
                if (!((Post) obj).pc()) {
                    ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                    jt50.a(SingleEvent.POST);
                }
                rq60Var.c(new yo60.g.c(R.string.wall_ok));
                break;
            case 2:
                ((nw60) obj2).invoke(obj);
                break;
            case 3:
                ((rop) obj2).invoke(obj);
                break;
            case 4:
                ((rop) obj2).invoke(obj);
                break;
            case 5:
                ((rop) obj2).invoke(obj);
                break;
            case 6:
                ((xka0) obj2).invoke(obj);
                break;
            case 7:
                ((nt10) obj2).invoke(obj);
                break;
            case 8:
                ((k82) obj2).invoke(obj);
                break;
            case 9:
                ((lw3) obj2).invoke(obj);
                break;
            case 10:
                ((erh) obj2).invoke(obj);
                break;
            case 11:
                ((h.a) obj2).invoke(obj);
                break;
            case 12:
                ((erh) obj2).invoke(obj);
                break;
            case 13:
                ((fa00) obj2).invoke(obj);
                break;
            case 14:
                ((xka0) obj2).invoke(obj);
                break;
            case 15:
                int i2 = StorySettingsActivity.P;
                ((xka0) obj2).invoke(obj);
                break;
            case 16:
                ((qhg0) obj2).invoke(obj);
                break;
            case 17:
                ((k82) obj2).invoke(obj);
                break;
            case 18:
                ((xka0) obj2).invoke(obj);
                break;
            case 19:
                ((t8r0) obj2).invoke(obj);
                break;
            case 20:
                ((izs) obj2).invoke(obj);
                break;
            case 21:
                ((erh) obj2).invoke(obj);
                break;
            default:
                ((vnv0) obj2).invoke(obj);
                break;
        }
    }
}
