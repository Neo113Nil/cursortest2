package xsna;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.DecelerateInterpolator;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.dialogsscreen.impl.DialogsScreenFragment;
import com.vk.media.MediaUtils;
import com.vk.profile.community.newsfeed.impl.di.CommunityNewsfeedComponentImpl;
import com.vk.superapp.browser_events.di.BrowserEventsComponent;
import com.vk.toggle.features.MusicFeatures;
import java.util.ArrayList;
import xsna.d7p;
import xsna.fpi;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i9 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ i9(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(MusicFeatures.AUDIO_VIDEO_STATIC_WIDGET.h());
            case 1:
                return new knp0();
            case 2:
                return s3q0.a;
            case 3:
                return new a390();
            case 4:
                return s3q0.a;
            case 5:
                return Integer.valueOf(cn70.b(52));
            case 6:
                BrowserEventsComponent.a aVar = BrowserEventsComponent.b;
                return new t9u0();
            case 7:
                return new com.vkontakte.android.ecomm.checkout.a();
            case 8:
                return new o2l0();
            case 9:
                return Boolean.valueOf(k840.a.d().o());
            case 10:
                a1w a1wVar = q1w.a;
                if (a1wVar != null) {
                    return a1wVar;
                }
                return null;
            case 11:
                return new lu();
            case 12:
                return new ezt0();
            case 13:
                return new MediaUtils.d(1080, 1920);
            case 14:
                qcy<Object>[] qcyVarArr = ClipsInterestsComponentImpl.o;
                return new pme();
            case 15:
                return new Handler(Looper.getMainLooper());
            case 16:
                qcy<Object>[] qcyVarArr2 = CommunityNewsfeedComponentImpl.d;
                return new bbh();
            case 17:
                return new jmh();
            case 18:
                return new x7h();
            case 19:
                return new fpi.a();
            case 20:
                int i = DialogsScreenFragment.p0;
                a1w a1wVar2 = q1w.a;
                cau0 cau0Var = (a1wVar2 != null ? a1wVar2 : null).r().h;
                return d7p.a.a;
            case 21:
                return Integer.valueOf((int) Math.floor(50 * Resources.getSystem().getDisplayMetrics().density));
            case 22:
                return s3q0.a;
            case 23:
                return new ArrayList(rl3.o0(5, Preference.n("firebase_init_controller", "timestamps")));
            case 24:
                return new qzq0();
            case 25:
                return new crs();
            case 26:
                return new DecelerateInterpolator(1.25f);
            case 27:
                return s3q0.a;
            default:
                return "#tryToRecover - already recovering";
        }
    }
}
