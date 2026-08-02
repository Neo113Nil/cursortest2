package xsna;

import android.graphics.Rect;
import androidx.fragment.app.FragmentActivity;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.Signaling;
import xsna.hul;
import xsna.l7v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class eul implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ eul(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f3r f3rVar;
        FragmentActivity activity;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((gul) obj3).b.execute(new he6(1, (Runnable) obj2, (hul.a) obj));
                break;
            case 1:
                PostViewFragment postViewFragment = (PostViewFragment) obj2;
                String str = (String) obj;
                String[] strArr = PostViewFragment.T0;
                f3r[] reactionViews = ((m3r) obj3).getScrollView().getReactionViews();
                int length = reactionViews.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        f3rVar = reactionViews[i2];
                        if (!(f3rVar instanceof dxq)) {
                            i2++;
                        }
                    } else {
                        f3rVar = null;
                    }
                }
                if (f3rVar != null && (activity = postViewFragment.getActivity()) != null) {
                    l7v b = pla.e().b();
                    Rect C = bwt0.C(f3rVar);
                    b.getClass();
                    l7v.b bVar = new l7v.b(str, b, C);
                    bVar.m = 48;
                    bVar.j(activity);
                    break;
                }
                break;
            default:
                ((Signaling) obj3).a((Signaling.Listener) obj2, (JSONObject) obj);
                break;
        }
    }
}
