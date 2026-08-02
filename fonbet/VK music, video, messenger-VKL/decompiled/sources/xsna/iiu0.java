package xsna;

import com.vk.feed.design.view.newsfeed.header.VkFeedPostHeaderView;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherError;
import xsna.d6x0;
import xsna.h6x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class iiu0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ iiu0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.b) {
            case 0:
                ((tdu) obj).b(1.0f);
                return s3q0.a;
            case 1:
                int i = VkFeedPostHeaderView.S;
                return com.vk.movika.sdk.base.model.n.a(1.5f);
            case 2:
                qgi0.d((tgi0) obj);
                return s3q0.a;
            case 3:
                Reef reef = (Reef) obj;
                if (reef != null) {
                    reef.a(new ReefEvent.a());
                }
                if (reef != null) {
                    reef.b();
                }
                return s3q0.a;
            case 4:
                return low0.a((low0) obj, false, false, 3071);
            case 5:
                WatchTogetherError watchTogetherError = (WatchTogetherError) obj;
                if (watchTogetherError != WatchTogetherError.CANT_PARSE_MOVIE_TYPE && watchTogetherError != WatchTogetherError.PLAY_PARSE_ERROR) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                return Boolean.valueOf(((FeatureRoles) obj) instanceof FeatureRoles.EnabledForAll);
            case 7:
                d6x0.e.a aVar = ((d6x0.e) obj).b;
                return new h6x0.e.a(aVar.a, aVar.b);
            default:
                ((Integer) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
