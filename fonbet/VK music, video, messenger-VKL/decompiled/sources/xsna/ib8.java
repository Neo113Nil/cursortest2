package xsna;

import android.content.Context;
import com.vk.bridges.di.BridgeComponent;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.cachecontrol.impl.CacheComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.music.offline.api.di.StorageTypeComponent;
import com.vk.nspk.di.NspkSearchBanksFeatureInnerComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vk.superapp.multiaccount.impl.MultiAccountComponentImpl;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import xsna.ysa.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ib8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ib8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ?? r0 = this.c;
                qcy<Object>[] qcyVarArr = BridgeComponentImpl.I;
                return ((VideoShareComponent) r0.getValue()).S();
            case 1:
                CacheComponentImpl cacheComponentImpl = (CacheComponentImpl) this.c;
                qcy<Object>[] qcyVarArr2 = CacheComponentImpl.d;
                return new nv8(cacheComponentImpl.yc());
            case 2:
                return ((ysa) this.c).new a();
            case 3:
                return ((BridgeComponent) ((gxw) this.c).c().a(fpf0.a(BridgeComponent.class))).Le();
            case 4:
                return ((StoryViewerComponent) ((LinksBridgeComponentImpl) this.c).c.getValue()).tb();
            case 5:
                cj00 cj00Var = (cj00) this.c;
                return cj00Var.a.getPackageManager().getApplicationInfo(cj00Var.a.getPackageName(), 128).metaData;
            case 6:
                MultiAccountComponentImpl multiAccountComponentImpl = (MultiAccountComponentImpl) this.c;
                qcy<Object>[] qcyVarArr3 = MultiAccountComponentImpl.e;
                r55 r55Var = r55.a;
                return new i340(r55.g(), r55.f().c, r55.f().d.invoke().booleanValue(), multiAccountComponentImpl.d());
            case 7:
                return (CacheComponent) ((g8m) this.c).a(fpf0.a(CacheComponent.class));
            case 8:
                NspkSearchBanksFeatureInnerComponent nspkSearchBanksFeatureInnerComponent = (NspkSearchBanksFeatureInnerComponent) this.c;
                return new tm70(nspkSearchBanksFeatureInnerComponent.a, nspkSearchBanksFeatureInnerComponent.b.yc());
            case 9:
                return ((StorageTypeComponent) this.c).rb();
            case 10:
                String str = (String) this.c;
                if (Preference.l) {
                    Preference.a.getClass();
                    Context context = Preference.b;
                    return new auj0(Preference.r(context != null ? context : null, str), str);
                }
                Preference.a.getClass();
                Context context2 = Preference.b;
                return (context2 != null ? context2 : null).getSharedPreferences(str, 0);
            case 11:
                aid0 aid0Var = (aid0) this.c;
                oi6 oi6Var = aid0Var.c;
                if (!lhs.d()) {
                    return aid0Var.i(oi6Var);
                }
                lhs.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
                try {
                    return aid0Var.i(oi6Var);
                } finally {
                    lhs.b();
                }
            case 12:
                StoryViewerComponentImpl storyViewerComponentImpl = (StoryViewerComponentImpl) this.c;
                qcy<Object>[] qcyVarArr4 = StoryViewerComponentImpl.s;
                StoriesComponent storiesComponent = storyViewerComponentImpl.a;
                return new yvl0(storiesComponent.w3(), storiesComponent.bf());
            default:
                VKApplication vKApplication = (VKApplication) this.c;
                VKApplication.a aVar = VKApplication.c;
                Context applicationContext = vKApplication.getApplicationContext();
                gpt0 gpt0Var = gpt0.a;
                b660.a(applicationContext);
                return s3q0.a;
        }
    }
}
