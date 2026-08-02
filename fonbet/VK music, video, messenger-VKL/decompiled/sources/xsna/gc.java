package xsna;

import android.content.Context;
import android.graphics.RectF;
import android.provider.MediaStore;
import com.ironsource.D1;
import com.vk.censoredsettings.di.CensoredSettingsInnerComponent;
import com.vk.core.preference.Preference;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.im.messageviews.impl.dependencies.MessageViewsFeatureComponentImpl;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponentImpl;
import com.vk.newsfeed.common.recycler.holders.story.discover.InterestingStoriesBlockEventDispatcher;
import com.vk.toggle.b;
import com.vk.toggle.features.MusicFeatures;
import com.vk.video.ui.albums.fragments.AbsVideoListFragment;
import com.vk.voip.api.id.CallId;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import xsna.hg1;
import xsna.pqc;
import xsna.zzz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class gc implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ gc(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        JSONObject g;
        boolean z = false;
        switch (this.b) {
            case 0:
                int i = AbsVideoListFragment.W0;
                return Boolean.valueOf(fxc0.B().J().X1());
            case 1:
                return com.vk.toggle.d.r();
            case 2:
                return new ix4();
            case 3:
                return new CallId(ConversationFactory.generateConversationId());
            case 4:
                qcy<Object>[] qcyVarArr = CensoredSettingsInnerComponent.c;
                return new rpa();
            case 5:
                pqc pqcVar = pqc.a;
                pqcVar.getClass();
                if (pqc.c.compareAndSet(false, true)) {
                    io.reactivex.rxjava3.subjects.f<pqc.c> fVar = pqc.f;
                    int i2 = 10;
                    io.reactivex.rxjava3.core.g<R> b = fVar.D0(BackpressureStrategy.LATEST).b(new e8(new qqc(1, pqcVar, pqc.class, "loadDiscover", "loadDiscover(Lcom/vk/catalog2/common/ui/mvp/clip/cache/ClipDiscoverCatalogCache$RequestType;)Lio/reactivex/rxjava3/core/Flowable;", 0), i2));
                    io.reactivex.rxjava3.subjects.d<pqc.a> dVar = pqc.g;
                    io.reactivex.rxjava3.disposables.c subscribe = b.subscribe(new ho1(new rqc(1, dVar, io.reactivex.rxjava3.subjects.d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0), i2));
                    c63 c63Var = c63.a;
                    c63.a(new pqc.b(subscribe));
                    pgn pgnVar = pqc.h;
                    qcy<Object>[] qcyVarArr2 = pqc.b;
                    qcy<Object> qcyVar = qcyVarArr2[0];
                    pgnVar.b(subscribe);
                    hg1.h0 h0Var = new hg1.h0();
                    dVar.getClass();
                    io.reactivex.rxjava3.disposables.c h = hg1.h(new io.reactivex.rxjava3.internal.operators.observable.i0(dVar, h0Var).U(new hg1.g0()), new g8(8));
                    c63.a(new pqc.b(h));
                    pgn pgnVar2 = pqc.i;
                    qcy<Object> qcyVar2 = qcyVarArr2[1];
                    pgnVar2.b(h);
                    fVar.onNext(pqc.c.INIT);
                }
                return pqcVar;
            case 6:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return new qje0(context);
            case 7:
                return s3q0.a;
            case 8:
                return s3q0.a;
            case 9:
                int i3 = GamesCatalogFragment.i0;
                return Boolean.valueOf(uca.b());
            case 10:
                return new ykg();
            case 11:
                return new RectF();
            case 12:
                return "#doClearCache starting...";
            case 13:
                return new InterestingStoriesBlockEventDispatcher();
            case 14:
                return Pattern.compile("\\[((?:id|club)[0-9]+):bp[0-9_-]+\\|([^]]+)]");
            case 15:
                return new zzz.a.C4213a();
            case 16:
                return MediaStore.Files.getContentUri(D1.e);
            case 17:
                qcy<Object>[] qcyVarArr3 = MessageViewsFeatureComponentImpl.c;
                return new uc20();
            case 18:
                return Calendar.getInstance();
            case 19:
                return Boolean.valueOf(MusicFeatures.AUDIO_REWORK_PLAYER_ADS.h());
            case 20:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                b.d i4 = com.vk.toggle.b.A.i(MusicFeatures.VK_MIX_ANIMATION);
                if (i4 != null && (g = i4.g()) != null) {
                    z = g.optBoolean("enable_tilt");
                }
                return Boolean.valueOf(z);
            case 21:
                return new m450();
            case 22:
                qcy<Object>[] qcyVarArr4 = NewsfeedMappersComponentImpl.o;
                return new mb6();
            case 23:
                return new p4r();
            case 24:
                return Preference.f("onboarding_cache_pref");
            case 25:
                return new u1r0();
            case 26:
                return s3q0.a;
            case 27:
                return new vti0();
            case 28:
                return new a390();
            default:
                return new ssd0();
        }
    }
}
