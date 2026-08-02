package xsna;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.LinearLayout;
import com.vk.clips.internal.nps.impl.di.ClipsInternalNpsComponentImpl;
import com.vk.ecomm.market.impl.di.MarketComponentImpl;
import com.vk.foldertypeobserver.api.FolderTypeObserverComponent;
import com.vk.friends.requests.impl.di.FriendsRequestsComponentImpl;
import com.vk.googleump.impl.di.GoogleUMPComponentImpl;
import com.vk.multiplecoownership.di.MultipleCoownershipComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import xsna.asu0;
import xsna.glo;
import xsna.k840;
import xsna.ku2;
import xsna.mgn0;
import xsna.rw1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class sw1 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ sw1(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return rw1.a.a.getSTUB();
            case 1:
                mgn0.b.a aVar = new mgn0.b.a();
                aVar.a = false;
                aVar.b = true;
                ku2.a aVar2 = new ku2.a(0, o25.a(), b25.class, "isLoggedIn", "isLoggedIn()Z", 0);
                aVar.d = aVar2;
                return new mgn0.b(aVar.a, aVar.b, aVar.c, aVar2);
            case 2:
                com.vk.utils.log.a.b();
                return s3q0.a;
            case 3:
                return s3q0.a;
            case 4:
                return new ClipsInternalNpsComponentImpl.a();
            case 5:
                Application application = u6l.a;
                LinearLayout linearLayout = new LinearLayout(application != null ? application : null);
                linearLayout.setOrientation(1);
                linearLayout.setBackgroundColor(linearLayout.getContext().getColor(R.color.debug_view_bg));
                return linearLayout;
            case 6:
                Context b = ((lrv0) glo.b.getValue()).b();
                return new glo.a(b, b.getResources());
            case 7:
                return new Regex("height=\"(\\d+)", RegexOption.MULTILINE);
            case 8:
                return rjg.a;
            case 9:
                wjy wjyVar = wjy.a;
                return Boolean.FALSE;
            case 10:
                return new Regex("\\{\"key\":\"([a-zA-Z0-9._%-]+)\",\"value\":\"[^\"]*\"", RegexOption.IGNORE_CASE);
            case 11:
                qcy<Object>[] qcyVarArr = MarketComponentImpl.l;
                return new gy00();
            case 12:
                return ((FolderTypeObserverComponent) ((k7m) m7m.f(f620.b)).a(fpf0.a(FolderTypeObserverComponent.class))).He();
            case 13:
                return com.vk.contacts.d.a;
            case 14:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                return Boolean.valueOf(com.vk.toggle.b.A.a(MusicFeatures.AUDIO_NEW_DOWNLOADED_TRACKS_DUPLICATE_FIX));
            case 15:
                r5v0 r5v0Var = k840.a.h;
                return (r5v0Var != null ? r5v0Var : null).a.a.b0(oe50.class);
            case 16:
                FeedFeatures feedFeatures = FeedFeatures.DS_HEADER;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 17:
                return new Handler(Looper.getMainLooper());
            case 18:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_VIDEO_SLIDER_VKUI;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 19:
                return j0t0.a.getSTUB();
            case 20:
                asu0.a.getClass();
                return new GoogleUMPComponentImpl.a(asu0.n());
            case 21:
                return new FriendsRequestsComponentImpl.a();
            case 22:
                return new MultipleCoownershipComponentImpl.a();
            default:
                asu0 asu0Var = asu0.a;
                asu0.a invoke = asu0.y.invoke();
                asu0Var.getClass();
                return asu0.E(invoke, "vk-io-pool-thread-");
        }
    }
}
