package xsna;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.vk.catalog2.common.ui.holders.video.VideoProfileHorizontallScrollItemWithHighlightVh;
import com.vk.clips.design.view.templates.ClipsTemplateEditorFragmentsBottomView;
import com.vk.core.dynamic_loader.b;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.ecomm.catalog.impl.catalog.simple.ClassifiedsCatalogSimpleRootVh;
import com.vk.feed.design.view.newsfeed.ads_carousel.VkFeedOverlayProductCarousel;
import com.vk.feed.design.view.newsfeed.reactionstack.FeedReactionsStack;
import com.vk.media.ok.recording.GesturedRecording;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.photo.editor.markup.view.tools.SizeSeekBarView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Locale;
import org.webrtc.SurfaceTextureHelper;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.android.webrtc.topology.direct.DirectCallTopology;
import ru.ok.media.PublisherImpl;
import ru.ok.proto.NetPublisher;
import xsna.jms0;
import xsna.lsw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class o93 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o93(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        o0f attachedPlayer;
        int bottom;
        int i = this.b;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                AppStartTrace appStartTrace = (AppStartTrace) obj;
                appStartTrace.c.e(appStartTrace.e.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                break;
            case 1:
                Object obj2 = ((wa6) obj).o;
                ((p0c) (obj2 != null ? obj2 : null)).i();
                break;
            case 2:
                ((irb) obj).j = true;
                break;
            case 3:
                ClassifiedsCatalogSimpleRootVh classifiedsCatalogSimpleRootVh = (ClassifiedsCatalogSimpleRootVh) obj;
                g3a.a(classifiedsCatalogSimpleRootVh.z, classifiedsCatalogSimpleRootVh);
                break;
            case 4:
                jpd jpdVar = (jpd) obj;
                jpdVar.c.getPositions().d();
                jpdVar.c.setShutterPosition(true);
                break;
            case 5:
                t1b0 t1b0Var = ((r2f) obj).e;
                if (t1b0Var != null && (attachedPlayer = t1b0Var.getAttachedPlayer()) != null) {
                    attachedPlayer.play();
                    break;
                }
                break;
            case 6:
                int i3 = ClipsTemplateEditorFragmentsBottomView.j;
                ((ClipsTemplateEditorFragmentsBottomView) obj).c();
                break;
            case 7:
                com.vk.clips.editor.templates.impl.player.a.e((com.vk.clips.editor.templates.impl.player.a) obj);
                break;
            case 8:
                b8h b8hVar = (b8h) obj;
                b8hVar.g.setVisibility(4);
                b8hVar.f.setVisibility(0);
                break;
            case 9:
                ((NetPublisher) obj).resume();
                break;
            case 10:
                qij qijVar = (qij) obj;
                qijVar.f = false;
                qijVar.j = null;
                qijVar.e(pij.b, false);
                break;
            case 11:
                ((DirectCallTopology) obj).b();
                break;
            case 12:
                SizeSeekBarView j = ((djo) obj).j();
                if (j != null) {
                    j.a(j.o);
                    break;
                }
                break;
            case 13:
                io.reactivex.rxjava3.subjects.d dVar = (io.reactivex.rxjava3.subjects.d) obj;
                dVar.onNext(b.AbstractC0762b.e.a);
                dVar.onNext(b.AbstractC0762b.g.a);
                break;
            case 14:
                ExploreFragment exploreFragment = (ExploreFragment) obj;
                AppBarLayout appBarLayout = exploreFragment.O;
                if (appBarLayout != null && (bottom = appBarLayout.getBottom()) >= 0) {
                    i2 = bottom;
                }
                exploreFragment.ho(i2);
                break;
            case 15:
                final bgq bgqVar = (bgq) obj;
                bgqVar.a.f(new jms0.b() { // from class: xsna.agq
                    @Override // xsna.jms0.b
                    public final void run() {
                        bgq bgqVar2 = bgq.this;
                        if (bgqVar2.n == bgqVar2.j.size()) {
                            return;
                        }
                        int size = bgqVar2.j.size();
                        long j2 = bgq.y;
                        int i4 = bgqVar2.n;
                        Locale locale = Locale.US;
                        StringBuilder b = jr.b(size, "Forcing EOS after missing ", " frames for ", j2);
                        b.append(" ms, with available frame count: ");
                        b.append(i4);
                        ahn.F(b.toString());
                        bgqVar2.o = false;
                        bgqVar2.p = null;
                        bgqVar2.u = true;
                        bgqVar2.s();
                        bgqVar2.j.clear();
                        bgqVar2.p();
                    }
                }, true);
                break;
            case 16:
                FeedReactionsStack feedReactionsStack = (FeedReactionsStack) obj;
                bwt0.p0(feedReactionsStack.g, false);
                ViewGroup.LayoutParams layoutParams = feedReactionsStack.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                }
                bwt0.p0(feedReactionsStack, feedReactionsStack.getMinimumHeight() != 0);
                feedReactionsStack.o = false;
                break;
            case 17:
                ((GesturedRecording) obj).a();
                break;
            case 18:
                AppCompatImageView appCompatImageView = ((xxu) obj).q;
                if (appCompatImageView != null) {
                    appCompatImageView.setPressed(false);
                    break;
                }
                break;
            case 19:
                ksw kswVar = (ksw) obj;
                Iterator it = kswVar.d.iterator();
                while (it.hasNext()) {
                    Runnable runnable = (Runnable) ((WeakReference) it.next()).get();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                WeakReference<lsw> weakReference = kswVar.e;
                if (weakReference != null && weakReference.get() != null && kswVar.f != 0) {
                    kswVar.dispose();
                    int i4 = kswVar.f;
                    kswVar.f = i4 != -1 ? i4 - 1 : -1;
                    lsw.a aVar = kswVar.c;
                    long longValue = aVar.d.invoke(Long.valueOf(kswVar.g)).longValue();
                    long j2 = aVar.e;
                    if (longValue > j2) {
                        longValue = j2;
                    }
                    kswVar.g = longValue;
                    lsw.b(kswVar, longValue);
                    break;
                }
                break;
            case 20:
                ((gzs) obj).invoke();
                break;
            case 21:
                ((PublisherImpl) obj).lambda$resume$2();
                break;
            case 22:
                dw20 dw20Var = ((c4m0) obj).i;
                if (dw20Var != null) {
                    dw20Var.On(3);
                    break;
                }
                break;
            case 23:
                ((SurfaceTextureHelper) obj).lambda$stopListening$1();
                break;
            case 24:
                TestSuiteActivity.b((TestSuiteActivity) obj);
                break;
            case 25:
                VkOnboardingHighlighter vkOnboardingHighlighter = ((VideoProfileHorizontallScrollItemWithHighlightVh) obj).i;
                VkOnboardingHighlighter.e(vkOnboardingHighlighter == null ? null : vkOnboardingHighlighter, true, 5000L, false, null, 12);
                break;
            case 26:
                VkFeedOverlayProductCarousel.Q4((VkFeedOverlayProductCarousel) obj);
                break;
            case 27:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$0$1((io.reactivex.rxjava3.core.y) obj);
                break;
            case 28:
                ((com.ironsource.lifecycle.b) obj).i();
                break;
            default:
                ((ru.ok.android.webrtc.protocol.screenshare.recv.c) obj).d();
                break;
        }
    }
}
