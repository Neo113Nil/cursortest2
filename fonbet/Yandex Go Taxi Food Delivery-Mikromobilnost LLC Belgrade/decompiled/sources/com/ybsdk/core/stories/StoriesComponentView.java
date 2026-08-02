package com.ybsdk.core.stories;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.stories.StoriesComponentView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.CloseButtonView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView$State$Type;
import com.ybsdk.widgets.common.storybar.YbSdkStoryProgressBar;
import defpackage.a961;
import defpackage.amu0;
import defpackage.b64;
import defpackage.c6w;
import defpackage.cma1;
import defpackage.fet0;
import defpackage.j5y;
import defpackage.jl40;
import defpackage.lah0;
import defpackage.lia1;
import defpackage.n7l0;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.prc;
import defpackage.qls0;
import defpackage.qrc;
import defpackage.qw51;
import defpackage.rcc;
import defpackage.rje;
import defpackage.rm31;
import defpackage.rw51;
import defpackage.scc;
import defpackage.sls;
import defpackage.t8;
import defpackage.tai0;
import defpackage.tif0;
import defpackage.tls;
import defpackage.tmh0;
import defpackage.ulu0;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.uwl0;
import defpackage.vrc;
import defpackage.w511;
import defpackage.wls;
import defpackage.wlu0;
import defpackage.wvg0;
import defpackage.xlu0;
import defpackage.xrc;
import defpackage.ylu0;
import defpackage.yrc;
import defpackage.zlu0;
import defpackage.zrc;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000¯\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\b\b*\u0001l\b\u0007\u0018\u0000 o2\u00020\u0001:\u0003pqrB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u0014\u0010\u0013J!\u0010\u0016\u001a\u00020\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\u0016\u0010\rJ!\u0010\u0017\u001a\u00020\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\u0017\u0010\rJ\u001b\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u0018\u0010\u0013J%\u0010\u001d\u001a\u00020\u000b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\bj\u0002`\u001b¢\u0006\u0004\b\u001d\u0010\rJ\u001b\u0010\u001f\u001a\u00020\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u001f\u0010\u0013J\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J!\u0010'\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u000b¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000b¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00020\u000b¢\u0006\u0004\b,\u0010*J\u000f\u0010-\u001a\u00020\u000bH\u0014¢\u0006\u0004\b-\u0010*J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u001aH\u0016¢\u0006\u0004\b/\u00100J'\u00103\u001a\u00020\u000b2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b01¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000bH\u0002¢\u0006\u0004\b5\u0010*J\u0017\u00108\u001a\u00020\u000b2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u000206H\u0002¢\u0006\u0004\b;\u00109J\u000f\u0010<\u001a\u00020\u000bH\u0002¢\u0006\u0004\b<\u0010*J\u000f\u0010=\u001a\u00020\u000bH\u0002¢\u0006\u0004\b=\u0010*J\u0017\u0010@\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000bH\u0002¢\u0006\u0004\bB\u0010*J\u000f\u0010C\u001a\u00020\u000bH\u0002¢\u0006\u0004\bC\u0010*J\u000f\u0010D\u001a\u00020\u000bH\u0002¢\u0006\u0004\bD\u0010*J\u0013\u0010G\u001a\u00020F*\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020IH\u0002¢\u0006\u0004\bL\u0010KJ\u0013\u0010N\u001a\u00020\u000b*\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u000bH\u0002¢\u0006\u0004\bT\u0010*J\u000f\u0010U\u001a\u00020\u000bH\u0002¢\u0006\u0004\bU\u0010*J\u000f\u0010V\u001a\u00020\u000bH\u0002¢\u0006\u0004\bV\u0010*J\u000f\u0010W\u001a\u00020\u000bH\u0002¢\u0006\u0004\bW\u0010*R\u0014\u0010X\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R(\u0010\\\u001a\u0014\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u001c\u0010^\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010g\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\"\u0010j\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020I0i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010m\u001a\u00020l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010n¨\u0006s"}, d2 = {"Lcom/ybsdk/core/stories/StoriesComponentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function1;", "Lcom/ybsdk/core/stories/StoriesComponentView$a;", "update", "Lzy11;", "render", "(Ltls;)V", ClidProvider.STATE, "(Lcom/ybsdk/core/stories/StoriesComponentView$a;)V", "Lkotlin/Function0;", "listener", "setPrimaryButtonClickListener", "(Lsls;)V", "setSecondaryButtonClickListener", "", "setOnLinkClickListener", "setOnAdLabelClickListener", "setCloseButtonClickListener", "Landroid/net/Uri;", "", "Lcom/ybsdk/feature/divkit/api/ui/ActionHandler;", "handler", "setDivkitActionHandler", "action", "setOnLastStoryFinish", "Lrm31;", "factory", "setVideoPlayerFactory", "(Lrm31;)V", "Lcom/ybsdk/core/stories/ChangeStoryReason;", CRLReasonCodeExtension.REASON, "target", "setNextStory", "(Lcom/ybsdk/core/stories/ChangeStoryReason;Ljava/lang/String;)V", "onResume", "()V", "onStop", "onDestroy", "onAttachedToWindow", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "Lkotlin/Function2;", "", "setChangedStoryListener", "(Lwls;)V", "handleTouchEvents", "", "touchPointX", "onScreenTouchDown", "(F)V", "releasePointX", "onScreenTouchRelease", "pauseStory", "resumeStory", "Lcom/ybsdk/core/stories/StoriesComponentView$a$a;", "paddingContent", "updateProgressTopMargin", "(Lcom/ybsdk/core/stories/StoriesComponentView$a$a;)V", "setPreviousStory", "onSelectedStoryChanged", "setStory", "Lxlu0;", "Lvrc;", "withRenderInfo", "(Lxlu0;)Lvrc;", "Lzrc;", "getCurrentStoryLoadingState", "()Lzrc;", "getCurrentStoryDefaultLoadingState", "La961;", "updateAccessibilityVisible", "(La961;)V", "", "passedTimeMs", "updateStoryProgressBar", "(J)V", "initErrorView", "stopProgressTimer", "startProgressTimer", "setSelectedFirstStoryOnce", "binding", "La961;", "currentState", "Lcom/ybsdk/core/stories/StoriesComponentView$a;", "changedStoryListener", "Lwls;", "onLastStoryFinished", "Lsls;", "wasFirstStoryShown", "Z", "Ltif0;", "timer", "Ltif0;", "touchDownTimeMs", "J", "touchStartX", "F", "", "storiesLoadingStates", "Ljava/util/Map;", "com/ybsdk/core/stories/a", "viewEventsListener", "Lcom/ybsdk/core/stories/a;", "Companion", "a", "zlu0", "wlu0", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoriesComponentView extends ConstraintLayout {
    public static final wlu0 Companion = new wlu0();
    private static final int SWIPE_THRESHOLD = 100;
    private final a961 binding;
    private wls changedStoryListener;
    private a currentState;
    private sls onLastStoryFinished;
    private Map<Integer, zrc> storiesLoadingStates;
    private tif0 timer;
    private long touchDownTimeMs;
    private float touchStartX;
    private com.ybsdk.core.stories.a viewEventsListener;
    private boolean wasFirstStoryShown;

    public StoriesComponentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View O;
        View O2;
        LayoutInflater.from(context).inflate(tmh0.ybsdk_stories_view, this);
        int i = lah0.accessibilityButtonLeft;
        View O3 = cma1.O(i, this);
        if (O3 != null && (O = cma1.O((i = lah0.accessibilityButtonRight), this)) != null) {
            i = lah0.closeButton;
            CloseButtonView closeButtonView = (CloseButtonView) cma1.O(i, this);
            if (closeButtonView != null) {
                i = lah0.communicationFullScreen;
                CommunicationFullScreenView communicationFullScreenView = (CommunicationFullScreenView) cma1.O(i, this);
                if (communicationFullScreenView != null) {
                    i = lah0.divView;
                    YbDivView ybDivView = (YbDivView) cma1.O(i, this);
                    if (ybDivView != null) {
                        i = lah0.divViewPreloadNextStory;
                        YbDivView ybDivView2 = (YbDivView) cma1.O(i, this);
                        if (ybDivView2 != null) {
                            i = lah0.storyErrorView;
                            ErrorView errorView = (ErrorView) cma1.O(i, this);
                            if (errorView != null) {
                                i = lah0.storyProgressBar;
                                YbSdkStoryProgressBar ybSdkStoryProgressBar = (YbSdkStoryProgressBar) cma1.O(i, this);
                                if (ybSdkStoryProgressBar != null && (O2 = cma1.O((i = lah0.touchHandleView), this)) != null) {
                                    this.binding = new a961(this, O3, O, closeButtonView, communicationFullScreenView, ybDivView, ybDivView2, errorView, ybSdkStoryProgressBar, O2);
                                    this.currentState = new a(0, (List) null, (a.C0090a) null, (CloseButtonVisibility) null, false, false, (a.b) null, 255);
                                    this.changedStoryListener = new qls0(14);
                                    this.onLastStoryFinished = new fet0(29);
                                    this.touchDownTimeMs = -1L;
                                    this.storiesLoadingStates = new LinkedHashMap();
                                    this.viewEventsListener = new com.ybsdk.core.stories.a(this);
                                    handleTouchEvents();
                                    initErrorView();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 changedStoryListener$lambda$0(int i, ChangeStoryReason changeStoryReason) {
        return zy11.a;
    }

    private final zrc getCurrentStoryDefaultLoadingState() {
        a aVar = this.currentState;
        zlu0 zlu0Var = (zlu0) aVar.b.get(aVar.a);
        if (!(zlu0Var instanceof ylu0)) {
            if (!(zlu0Var instanceof xlu0)) {
                w511.b();
                return null;
            }
            if (((xlu0) zlu0Var).c.a == CommunicationFullScreenView$State$Type.VIDEO) {
                return yrc.a;
            }
        }
        return xrc.a;
    }

    private final zrc getCurrentStoryLoadingState() {
        Map<Integer, zrc> map = this.storiesLoadingStates;
        Integer valueOf = Integer.valueOf(this.currentState.a);
        zrc zrcVar = map.get(valueOf);
        if (zrcVar == null) {
            zrcVar = getCurrentStoryDefaultLoadingState();
            map.put(valueOf, zrcVar);
        }
        return zrcVar;
    }

    private final void handleTouchEvents() {
        this.binding.j.setOnTouchListener(new t8(22, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handleTouchEvents$lambda$11(StoriesComponentView storiesComponentView, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            storiesComponentView.onScreenTouchDown(motionEvent.getX());
            return true;
        }
        if (action != 1) {
            return action == 3;
        }
        storiesComponentView.onScreenTouchRelease(motionEvent.getX());
        return true;
    }

    private final void initErrorView() {
        this.binding.h.setPrimaryButtonOnClickListener(new ulu0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initErrorView$lambda$16(StoriesComponentView storiesComponentView) {
        c6w it = scc.e(storiesComponentView.currentState.b).iterator();
        while (it.c) {
            storiesComponentView.storiesLoadingStates.put(Integer.valueOf(it.nextInt()), yrc.a);
        }
        storiesComponentView.setStory();
        storiesComponentView.binding.h.render(null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$18(StoriesComponentView storiesComponentView, View view) {
        setNextStory$default(storiesComponentView, ChangeStoryReason.STORIES_NEXT_CLICK, null, 2, null);
    }

    private final void onScreenTouchDown(float touchPointX) {
        pauseStory();
        this.touchDownTimeMs = System.currentTimeMillis();
        this.touchStartX = touchPointX;
    }

    private final void onScreenTouchRelease(float releasePointX) {
        resumeStory();
        float f = releasePointX - this.touchStartX;
        if (Math.abs(f) > 100.0f && !lia1.g(getContext())) {
            if (f > 0.0f) {
                setPreviousStory();
                return;
            } else {
                setNextStory$default(this, ChangeStoryReason.STORIES_NEXT_CLICK, null, 2, null);
                return;
            }
        }
        if (System.currentTimeMillis() - this.touchDownTimeMs < ViewConfiguration.getLongPressTimeout()) {
            if (this.binding.a.getWidth() / 2 <= releasePointX || lia1.g(getContext())) {
                setNextStory$default(this, ChangeStoryReason.STORIES_NEXT_CLICK, null, 2, null);
            } else {
                setPreviousStory();
            }
        }
    }

    private final void onSelectedStoryChanged() {
        stopProgressTimer();
        updateStoryProgressBar(0L);
        setStory();
    }

    private final void pauseStory() {
        tif0 tif0Var = this.timer;
        if (tif0Var != null) {
            tif0Var.a();
        }
        this.binding.e.sendCommand(prc.a);
    }

    private final void resumeStory() {
        tif0 tif0Var = this.timer;
        if (tif0Var != null) {
            tif0Var.b();
        }
        this.binding.e.sendCommand(qrc.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCloseButtonClickListener$lambda$6(StoriesComponentView storiesComponentView, sls slsVar, View view) {
        storiesComponentView.stopProgressTimer();
        slsVar.invoke();
    }

    public static /* synthetic */ void setNextStory$default(StoriesComponentView storiesComponentView, ChangeStoryReason changeStoryReason, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        storiesComponentView.setNextStory(changeStoryReason, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setOnAdLabelClickListener$lambda$5(tls tlsVar, String str) {
        tlsVar.invoke(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setOnLinkClickListener$lambda$4(tls tlsVar, String str) {
        tlsVar.invoke(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPreviousStory() {
        int f;
        if (this.currentState.b.isEmpty()) {
            return;
        }
        a aVar = this.currentState;
        int i = aVar.a;
        if (i > 0) {
            f = i - 1;
        } else if (!aVar.f || aVar.b.size() <= 1) {
            return;
        } else {
            f = scc.f(this.currentState.b);
        }
        this.currentState = a.a(this.currentState, f);
        this.changedStoryListener.invoke(Integer.valueOf(f), ChangeStoryReason.STORIES_PREVIEW_CLICK);
        onSelectedStoryChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setPrimaryButtonClickListener$lambda$2(sls slsVar) {
        slsVar.invoke();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setSecondaryButtonClickListener$lambda$3(sls slsVar) {
        slsVar.invoke();
        return zy11.a;
    }

    private final void setSelectedFirstStoryOnce() {
        if (this.currentState.a != 0 || this.wasFirstStoryShown) {
            return;
        }
        this.wasFirstStoryShown = true;
        this.changedStoryListener.invoke(0, ChangeStoryReason.STORIES_NEXT_TIME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStory() {
        if (this.currentState.b.isEmpty()) {
            return;
        }
        a aVar = this.currentState;
        zlu0 zlu0Var = (zlu0) aVar.b.get(aVar.a);
        if (zlu0Var instanceof xlu0) {
            this.binding.f.setVisibility(8);
            this.binding.e.setVisibility(0);
            this.binding.e.render(withRenderInfo((xlu0) zlu0Var));
            ColorModel colorModel = zlu0Var.b;
            setBackgroundColor(colorModel != null ? colorModel.get(getContext()) : rje.a(getContext(), ung0.ybColor_background_primary));
        } else {
            if (!(zlu0Var instanceof ylu0)) {
                w511.b();
                return;
            }
            YbDivView.setData$default(this.binding.f, ((ylu0) zlu0Var).c, null, null, false, 14, null);
            this.binding.e.setVisibility(8);
            this.binding.f.setVisibility(0);
            setBackgroundColor(rje.a(getContext(), ung0.ybsdk_transparentBackground));
        }
        a aVar2 = this.currentState;
        zlu0 zlu0Var2 = (zlu0) kotlin.collections.a.S(aVar2.a + 1, aVar2.b);
        if (zlu0Var2 instanceof ylu0) {
            YbDivView.setData$default(this.binding.g, ((ylu0) zlu0Var2).c, null, null, false, 14, null);
        }
        updateAccessibilityVisible(this.binding);
        if (this.currentState.g) {
            startProgressTimer();
            setSelectedFirstStoryOnce();
        } else {
            stopProgressTimer();
            this.wasFirstStoryShown = false;
        }
    }

    private final void startProgressTimer() {
        if (this.timer != null) {
            return;
        }
        a aVar = this.currentState;
        long j = ((zlu0) aVar.b.get(aVar.a)).a;
        tif0 tif0Var = new tif0(j, new j5y(this, j, 6), new ulu0(this, 0));
        this.timer = tif0Var;
        tif0Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 startProgressTimer$lambda$19(StoriesComponentView storiesComponentView, long j, long j2) {
        storiesComponentView.updateStoryProgressBar(j - j2);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 startProgressTimer$lambda$20(StoriesComponentView storiesComponentView) {
        if (!storiesComponentView.currentState.b.isEmpty() && !lia1.g(storiesComponentView.getContext())) {
            setNextStory$default(storiesComponentView, ChangeStoryReason.STORIES_NEXT_TIME, null, 2, null);
        }
        return zy11.a;
    }

    private final void stopProgressTimer() {
        tif0 tif0Var = this.timer;
        if (tif0Var != null) {
            tif0Var.a();
        }
        this.timer = null;
    }

    private final void updateAccessibilityVisible(a961 a961Var) {
        View view = a961Var.b;
        a aVar = this.currentState;
        int i = 8;
        view.setVisibility(((aVar.a != 0 || aVar.f) && lia1.g(getContext())) ? 0 : 8);
        View view2 = a961Var.c;
        int f = scc.f(this.currentState.b);
        a aVar2 = this.currentState;
        if ((f != aVar2.a || aVar2.f) && lia1.g(getContext())) {
            i = 0;
        }
        view2.setVisibility(i);
    }

    private final void updateProgressTopMargin(a.C0090a paddingContent) {
        a961 a961Var = this.binding;
        if (this.currentState.c.b != paddingContent.b) {
            YbSdkStoryProgressBar ybSdkStoryProgressBar = a961Var.i;
            ViewGroup.LayoutParams layoutParams = ybSdkStoryProgressBar.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, com.ybsdk.core.utils.ext.view.b.h(wvg0.ybsdk_stories_progress_top_margin, this) + paddingContent.b, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            ybSdkStoryProgressBar.setLayoutParams(marginLayoutParams);
        }
    }

    private final void updateStoryProgressBar(long passedTimeMs) {
        ListBuilder a2 = rcc.a();
        int size = this.currentState.b.size();
        int i = 0;
        while (i < size) {
            a aVar = this.currentState;
            int i2 = aVar.a;
            a2.add(new qw51((i > i2 ? 0 : i < i2 ? Integer.valueOf(((zlu0) aVar.b.get(i)).a) : Long.valueOf(passedTimeMs)).intValue(), ((zlu0) this.currentState.b.get(i)).a));
            i++;
        }
        ListBuilder j = a2.j();
        YbSdkStoryProgressBar ybSdkStoryProgressBar = this.binding.i;
        a.b bVar = this.currentState.h;
        ybSdkStoryProgressBar.render(new rw51(j, bVar != null ? bVar.a : null, bVar != null ? bVar.b : null));
    }

    private final vrc withRenderInfo(xlu0 xlu0Var) {
        vrc vrcVar = xlu0Var.c;
        boolean z = vrcVar.t;
        zrc currentStoryLoadingState = getCurrentStoryLoadingState();
        a aVar = this.currentState;
        a.C0090a c0090a = aVar.c;
        int i = c0090a.b;
        return vrc.a(vrcVar, null, null, null, z, xlu0Var.c.u, c0090a.a, i, currentStoryLoadingState, aVar.g, 1326448639);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final int i = 0;
        this.binding.b.setOnClickListener(new View.OnClickListener(this) { // from class: vlu0
            public final /* synthetic */ StoriesComponentView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                StoriesComponentView storiesComponentView = this.b;
                switch (i2) {
                    case 0:
                        storiesComponentView.setPreviousStory();
                        break;
                    default:
                        StoriesComponentView.onAttachedToWindow$lambda$18(storiesComponentView, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.binding.c.setOnClickListener(new View.OnClickListener(this) { // from class: vlu0
            public final /* synthetic */ StoriesComponentView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                StoriesComponentView storiesComponentView = this.b;
                switch (i22) {
                    case 0:
                        storiesComponentView.setPreviousStory();
                        break;
                    default:
                        StoriesComponentView.onAttachedToWindow$lambda$18(storiesComponentView, view);
                        break;
                }
            }
        });
    }

    public final void onDestroy() {
        stopProgressTimer();
    }

    public final void onResume() {
        resumeStory();
    }

    public final void onStop() {
        pauseStory();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        if (hasWindowFocus) {
            resumeStory();
        } else {
            pauseStory();
        }
    }

    public final void render(a state) {
        updateProgressTopMargin(state.c);
        this.currentState = state;
        int i = 4;
        this.binding.i.setVisibility((state.e || state.b.size() > 1) ? 0 : 4);
        CloseButtonView closeButtonView = this.binding.d;
        int i2 = amu0.a[state.d.ordinal()];
        if (i2 == 1) {
            i = 0;
        } else if (i2 != 2) {
            if (i2 != 3) {
                w511.b();
                return;
            }
            i = 8;
        }
        closeButtonView.setVisibility(i);
        setStory();
        this.binding.e.setEventsListener(this.viewEventsListener);
    }

    public final void setChangedStoryListener(wls listener) {
        this.changedStoryListener = listener;
    }

    public final void setCloseButtonClickListener(sls listener) {
        this.binding.d.setOnClickListener(new tai0(21, this, listener));
    }

    public final void setDivkitActionHandler(tls handler) {
        this.binding.f.setActionHandler(handler);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r3 != (-1)) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setNextStory(ChangeStoryReason reason, String target) {
        Integer num;
        if (this.currentState.b.isEmpty()) {
            return;
        }
        Integer num2 = null;
        if (target != null) {
            Iterator it = this.currentState.b.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (jl40.l(((zlu0) it.next()).a(), target)) {
                    break;
                } else {
                    i++;
                }
            }
            num = Integer.valueOf(i);
        }
        num = null;
        a aVar = this.currentState;
        int i2 = aVar.a;
        int f = scc.f(aVar.b);
        if (num != null) {
            num2 = num;
        } else if (i2 < f) {
            num2 = Integer.valueOf(i2 + 1);
        } else {
            a aVar2 = this.currentState;
            if (aVar2.f && aVar2.b.size() > 1) {
                num2 = 0;
            }
        }
        if (num2 != null) {
            int intValue = num2.intValue();
            this.currentState = a.a(this.currentState, intValue);
            this.changedStoryListener.invoke(Integer.valueOf(intValue), reason);
            onSelectedStoryChanged();
        }
        if (i2 != f || reason == ChangeStoryReason.STORIES_PREVIEW_CLICK) {
            return;
        }
        if (this.currentState.e && (reason == ChangeStoryReason.STORIES_NEXT_CLICK || reason == ChangeStoryReason.STORIES_NEXT_DEEPLINK)) {
            stopProgressTimer();
        }
        this.onLastStoryFinished.invoke();
    }

    public final void setOnAdLabelClickListener(tls listener) {
        this.binding.e.setOnAdLabelClickListener(new uwl0(15, listener));
    }

    public final void setOnLastStoryFinish(sls action) {
        this.onLastStoryFinished = action;
    }

    public final void setOnLinkClickListener(tls listener) {
        this.binding.e.setOnLinkClickListener(new uwl0(16, listener));
    }

    public final void setPrimaryButtonClickListener(sls listener) {
        this.binding.e.setPrimaryButtonOnClickListener(new n7l0(12, listener));
    }

    public final void setSecondaryButtonClickListener(sls listener) {
        this.binding.e.setSecondaryButtonClickListener(new n7l0(13, listener));
    }

    public final void setVideoPlayerFactory(rm31 factory) {
        this.binding.e.setVideoPlayerFactory(factory);
    }

    public static final class a {
        public final int a;
        public final List b;
        public final C0090a c;
        public final CloseButtonVisibility d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final b h;

        public /* synthetic */ a(int i, List list, C0090a c0090a, CloseButtonVisibility closeButtonVisibility, boolean z, boolean z2, b bVar, int i2) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? EmptyList.a : list, (i2 & 4) != 0 ? new C0090a(0, 0) : c0090a, (i2 & 8) != 0 ? CloseButtonVisibility.VISIBLE : closeButtonVisibility, (i2 & 16) != 0 ? false : z, (i2 & 32) == 0, (i2 & 64) != 0 ? true : z2, (i2 & 128) != 0 ? null : bVar);
        }

        public static a a(a aVar, int i) {
            List list = aVar.b;
            C0090a c0090a = aVar.c;
            CloseButtonVisibility closeButtonVisibility = aVar.d;
            boolean z = aVar.e;
            boolean z2 = aVar.f;
            boolean z3 = aVar.g;
            b bVar = aVar.h;
            aVar.getClass();
            return new a(i, list, c0090a, closeButtonVisibility, z, z2, z3, bVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && jl40.l(this.h, aVar.h);
        }

        public final int hashCode() {
            int e = unr0.e(unr0.e(unr0.e((this.d.hashCode() + ((this.c.hashCode() + unr0.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g);
            b bVar = this.h;
            return e + (bVar == null ? 0 : bVar.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(selectIndexStories=");
            sb.append(this.a);
            sb.append(", listStories=");
            sb.append(this.b);
            sb.append(", paddingContent=");
            sb.append(this.c);
            sb.append(", closeButtonVisibility=");
            sb.append(this.d);
            sb.append(", hasActionOnLastStoryEnd=");
            nnm.v(", areStoriesLooped=", ", isFocused=", sb, this.e, this.f);
            sb.append(this.g);
            sb.append(", progressStyle=");
            sb.append(this.h);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }

        /* renamed from: com.ybsdk.core.stories.StoriesComponentView$a$a, reason: collision with other inner class name */
        public static final class C0090a {
            public final int a;
            public final int b;

            public C0090a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0090a)) {
                    return false;
                }
                C0090a c0090a = (C0090a) obj;
                return this.a == c0090a.a && this.b == c0090a.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return b64.d(this.a, this.b, "PaddingContent(bottomPx=", ", topPx=", Extension.C_BRAKE);
            }

            public C0090a() {
                this(0, 0);
            }
        }

        public static final class b {
            public final ColorModel a;
            public final ColorModel b;

            public b(ColorModel colorModel, ColorModel colorModel2) {
                this.a = colorModel;
                this.b = colorModel2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b);
            }

            public final int hashCode() {
                ColorModel colorModel = this.a;
                int hashCode = (colorModel == null ? 0 : colorModel.hashCode()) * 31;
                ColorModel colorModel2 = this.b;
                return hashCode + (colorModel2 != null ? colorModel2.hashCode() : 0);
            }

            public final String toString() {
                return "ProgressStyle(trackColor=" + this.a + ", indicatorColor=" + this.b + Extension.C_BRAKE;
            }

            public b() {
                this(null, null);
            }
        }

        public a(int i, List list, C0090a c0090a, CloseButtonVisibility closeButtonVisibility, boolean z, boolean z2, boolean z3, b bVar) {
            this.a = i;
            this.b = list;
            this.c = c0090a;
            this.d = closeButtonVisibility;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = bVar;
        }

        public a() {
            this(0, (List) null, (C0090a) null, (CloseButtonVisibility) null, false, false, (b) null, 255);
        }
    }

    public final void render(tls update) {
        render((a) update.invoke(this.currentState));
    }

    public /* synthetic */ StoriesComponentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoriesComponentView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
