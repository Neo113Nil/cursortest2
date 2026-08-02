package com.ybsdk.widgets.common.communication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.design.design.DesignTextStyle;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.videoplayer.api.VideoPlayer$RepeatMode;
import com.ybsdk.widgets.common.AdLabelView;
import com.ybsdk.widgets.common.ScrollableNestedScrollView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import defpackage.asc;
import defpackage.bsc;
import defpackage.cma1;
import defpackage.dv9;
import defpackage.fch0;
import defpackage.gob1;
import defpackage.grc;
import defpackage.hrc;
import defpackage.io9;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.l7a;
import defpackage.lrc;
import defpackage.lwg0;
import defpackage.nrc;
import defpackage.ny61;
import defpackage.p60;
import defpackage.poh0;
import defpackage.rbv;
import defpackage.rje;
import defpackage.rm31;
import defpackage.rrc;
import defpackage.sls;
import defpackage.src;
import defpackage.tls;
import defpackage.trc;
import defpackage.ung0;
import defpackage.urc;
import defpackage.vrc;
import defpackage.w511;
import defpackage.x4c;
import defpackage.y061;
import defpackage.zrc;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 A2\u00020\u0001:\u00040-\nBB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\f2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\f2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010 ¢\u0006\u0004\b$\u0010#J!\u0010'\u001a\u00020\f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\f0%¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\u00020\f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\f0%¢\u0006\u0004\b)\u0010(J#\u0010+\u001a\u0004\u0018\u00010\f2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0%¢\u0006\u0004\b+\u0010,J\u0015\u0010+\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b+\u0010\u000eJ\u0015\u0010.\u001a\u00020\f2\u0006\u0010!\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\f2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/ybsdk/widgets/common/communication/CommunicationFullScreenView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lvrc;", ClidProvider.STATE, "Lzy11;", "createView", "(Lvrc;)V", "Landroid/view/View;", "view", "updateView", "(Landroid/view/View;Lvrc;)V", "Lcom/ybsdk/widgets/common/communication/CommunicationFullScreenVideoView;", "createVideoView", "()Lcom/ybsdk/widgets/common/communication/CommunicationFullScreenVideoView;", "setupBackground", "Lhrc;", "toGraphicsViewState", "(Lvrc;)Lhrc;", "Lgrc;", "toDescriptionViewState", "(Lvrc;)Lgrc;", "Lnrc;", "toVideoViewState", "(Lvrc;)Lnrc;", "Lkotlin/Function0;", "listener", "setPrimaryButtonOnClickListener", "(Lsls;)V", "setSecondaryButtonClickListener", "Lkotlin/Function1;", "", "setOnLinkClickListener", "(Ltls;)V", "setOnAdLabelClickListener", "update", "render", "(Ltls;)Lzy11;", "Lasc;", "setEventsListener", "(Lasc;)V", "Lrrc;", "command", "sendCommand", "(Lrrc;)V", "Lrm31;", "factory", "setVideoPlayerFactory", "(Lrm31;)V", "Ly061;", "binding", "Ly061;", "currentState", "Lvrc;", "eventsListener", "Lasc;", "videoPlayerFactory", "Lrm31;", "Companion", "src", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CommunicationFullScreenView extends ConstraintLayout {
    private static final int CONTAINER_BOTTOM_PADDING_DP = 14;
    public static final src Companion = new src();
    private final y061 binding;
    private vrc currentState;
    private asc eventsListener;
    private rm31 videoPlayerFactory;

    public CommunicationFullScreenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_communication_full_screen_view, this);
        int i2 = fch0.clickableNestedScrollView;
        ScrollableNestedScrollView scrollableNestedScrollView = (ScrollableNestedScrollView) cma1.O(i2, this);
        if (scrollableNestedScrollView != null) {
            i2 = fch0.communicationViewContainer;
            FrameLayout frameLayout = (FrameLayout) cma1.O(i2, this);
            if (frameLayout != null) {
                i2 = fch0.ybAdLabel;
                AdLabelView adLabelView = (AdLabelView) cma1.O(i2, this);
                if (adLabelView != null) {
                    i2 = fch0.ybButtonsGroupCommunication;
                    YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i2, this);
                    if (ybButtonViewGroup != null) {
                        this.binding = new y061(this, scrollableNestedScrollView, frameLayout, adLabelView, ybButtonViewGroup);
                        setBackgroundColor(rje.a(context, ung0.ybColor_background_primary));
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final CommunicationFullScreenVideoView createVideoView() {
        CommunicationFullScreenVideoView communicationFullScreenVideoView = new CommunicationFullScreenVideoView(getContext(), null, 0, 6, null);
        rm31 rm31Var = this.videoPlayerFactory;
        if (rm31Var != null) {
            communicationFullScreenVideoView.initPlayer(rm31Var);
        }
        communicationFullScreenVideoView.setEventsListener(new io9(this));
        return communicationFullScreenVideoView;
    }

    private final void createView(vrc state) {
        View createVideoView;
        FrameLayout frameLayout = this.binding.c;
        if (frameLayout.getChildCount() != 0) {
            frameLayout.removeView(frameLayout.getChildAt(0));
        }
        int i = bsc.a[state.a.ordinal()];
        if (i == 1) {
            createVideoView = createVideoView();
        } else if (i == 2) {
            createVideoView = new CommunicationFullScreenGraphicsView(getContext(), null, 0, 6, null);
        } else if (i != 3) {
            w511.b();
            return;
        } else {
            createVideoView = new CommunicationFullScreenDescriptionView(getContext(), null, 0, 6, null);
        }
        updateView(createVideoView, state);
        frameLayout.addView(createVideoView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$9$lambda$8(vrc vrcVar, y061 y061Var) {
        if (vrcVar.u) {
            FrameLayout frameLayout = y061Var.c;
            frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), kp50.r(14) + y061Var.e.getHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setOnAdLabelClickListener$lambda$1(tls tlsVar, String str) {
        tlsVar.invoke(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setOnLinkClickListener$lambda$0(tls tlsVar, String str) {
        tlsVar.invoke(str);
        return zy11.a;
    }

    private final void setupBackground(vrc state) {
        List list = state.q;
        if (list != null) {
            gob1.c(this, list, new ColorModel.Attr(ung0.ybColor_background_primary), null);
            return;
        }
        ColorModel colorModel = state.p;
        if (colorModel != null) {
            setBackgroundColor(colorModel.get(getContext()));
        } else {
            setBackgroundColor(b.g(ung0.ybColor_background_primary, this));
        }
    }

    private final grc toDescriptionViewState(vrc vrcVar) {
        Integer num = vrcVar.h;
        ColorModel colorModel = vrcVar.i;
        rbv rbvVar = vrcVar.j;
        lrc lrcVar = new lrc(vrcVar.b, vrcVar.c, vrcVar.d, vrcVar.e, vrcVar.f, vrcVar.g, vrcVar.k, vrcVar.n, vrcVar.o, vrcVar.s, vrcVar.t, vrcVar.E);
        urc urcVar = vrcVar.m;
        int i = vrcVar.w;
        Float f = vrcVar.x;
        ImageView.ScaleType scaleType = vrcVar.r;
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        Integer num2 = vrcVar.D;
        trc trcVar = vrcVar.F;
        return new grc(num, colorModel, rbvVar, lrcVar, urcVar, i, scaleType, f, num2, trcVar != null ? Integer.valueOf(trcVar.b) : null);
    }

    private final hrc toGraphicsViewState(vrc vrcVar) {
        Integer num = vrcVar.h;
        rbv rbvVar = vrcVar.j;
        lrc lrcVar = new lrc(vrcVar.b, vrcVar.c, vrcVar.d, vrcVar.e, vrcVar.f, vrcVar.g, vrcVar.k, vrcVar.n, vrcVar.o, vrcVar.s, vrcVar.t, vrcVar.E);
        urc urcVar = vrcVar.m;
        ImageView.ScaleType scaleType = vrcVar.r;
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.CENTER;
        }
        int i = vrcVar.w;
        trc trcVar = vrcVar.F;
        return new hrc(num, rbvVar, lrcVar, urcVar, scaleType, i, vrcVar.y, trcVar != null ? Integer.valueOf(trcVar.b) : null);
    }

    private final nrc toVideoViewState(vrc vrcVar) {
        Text text = vrcVar.b;
        ColorModel colorModel = vrcVar.c;
        DesignTextStyle designTextStyle = vrcVar.d;
        Text text2 = vrcVar.e;
        ColorModel colorModel2 = vrcVar.f;
        DesignTextStyle designTextStyle2 = vrcVar.g;
        List list = vrcVar.k;
        boolean z = vrcVar.t;
        int i = vrcVar.o;
        int i2 = vrcVar.s;
        lrc lrcVar = new lrc(text, colorModel, designTextStyle, text2, colorModel2, designTextStyle2, list, vrcVar.n, i, i2, z, vrcVar.E);
        int i3 = vrcVar.w;
        String str = vrcVar.z;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        YbButtonViewGroup.b bVar = vrcVar.l;
        boolean z2 = (bVar != null ? bVar.b : null) != null;
        VideoPlayer$RepeatMode videoPlayer$RepeatMode = vrcVar.A;
        if (videoPlayer$RepeatMode == null) {
            videoPlayer$RepeatMode = VideoPlayer$RepeatMode.OFF;
        }
        VideoPlayer$RepeatMode videoPlayer$RepeatMode2 = videoPlayer$RepeatMode;
        zrc zrcVar = vrcVar.C;
        boolean z3 = vrcVar.B;
        ColorModel colorModel3 = vrcVar.p;
        rbv rbvVar = vrcVar.j;
        trc trcVar = vrcVar.F;
        return new nrc(rbvVar, colorModel3, lrcVar, i3, str2, z2, videoPlayer$RepeatMode2, z3, zrcVar, i2, trcVar != null ? Integer.valueOf(trcVar.b) : null);
    }

    private final void updateView(View view, vrc state) {
        int i = bsc.a[state.a.ordinal()];
        if (i == 1) {
            ((CommunicationFullScreenVideoView) view).render(toVideoViewState(state));
            return;
        }
        if (i == 2) {
            ((CommunicationFullScreenGraphicsView) view).render(toGraphicsViewState(state));
        } else if (i == 3) {
            ((CommunicationFullScreenDescriptionView) view).render(toDescriptionViewState(state));
        } else {
            w511.b();
        }
    }

    public final void render(vrc state) {
        Object failure;
        View childAt;
        YbButtonViewGroup.b bVar = state.l;
        p60 p60Var = state.G;
        y061 y061Var = this.binding;
        if (jl40.l(this.currentState, state)) {
            return;
        }
        ScrollableNestedScrollView scrollableNestedScrollView = y061Var.b;
        AdLabelView adLabelView = y061Var.d;
        YbButtonViewGroup ybButtonViewGroup = y061Var.e;
        scrollableNestedScrollView.setIsScrollable(state.t);
        setupBackground(state);
        CommunicationFullScreenView$State$Type communicationFullScreenView$State$Type = state.a;
        vrc vrcVar = this.currentState;
        if (communicationFullScreenView$State$Type == (vrcVar != null ? vrcVar.a : null)) {
            FrameLayout frameLayout = y061Var.c;
            try {
                if (frameLayout.getChildCount() > 0) {
                    childAt = frameLayout.getChildAt(0);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    childAt = null;
                }
                if (childAt != null) {
                    updateView(childAt, state);
                    failure = zy11.a;
                } else {
                    failure = null;
                }
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                x4c.g("exception while rendering CommunicationFullScreen", a, null, null, 12);
            }
        } else {
            createView(state);
        }
        adLabelView.setVisibility(p60Var != null ? 0 : 8);
        if (p60Var != null) {
            adLabelView.render(p60Var);
        }
        ybButtonViewGroup.render(bVar);
        ybButtonViewGroup.setPadding(ybButtonViewGroup.getPaddingLeft(), ybButtonViewGroup.getPaddingTop(), ybButtonViewGroup.getPaddingRight(), rje.d(lwg0.ybsdk_buttons_group_view_vertical_margin, getContext()) + state.v);
        trc trcVar = state.F;
        if (trcVar != null) {
            int i = trcVar.a;
            ViewGroup.LayoutParams layoutParams = ybButtonViewGroup.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i);
                ybButtonViewGroup.setLayoutParams(marginLayoutParams);
            }
        }
        ybButtonViewGroup.post(new l7a(18, state, y061Var));
        ybButtonViewGroup.setVisibility(bVar == null ? 8 : 0);
        this.currentState = state;
    }

    public final void sendCommand(rrc command) {
        FrameLayout frameLayout = this.binding.c;
        int i = 0;
        while (true) {
            if (!(i < frameLayout.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = frameLayout.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            }
            CommunicationFullScreenVideoView communicationFullScreenVideoView = childAt instanceof CommunicationFullScreenVideoView ? (CommunicationFullScreenVideoView) childAt : null;
            if (communicationFullScreenVideoView != null) {
                communicationFullScreenVideoView.onCommand(command);
            }
            i = i2;
        }
    }

    public final void setEventsListener(asc listener) {
        this.eventsListener = listener;
    }

    public final void setOnAdLabelClickListener(tls listener) {
        this.binding.d.setOnAdLabelClickListener(new dv9(21, listener));
    }

    public final void setOnLinkClickListener(tls listener) {
        this.binding.e.setLinkClickListener(new dv9(22, listener));
    }

    public final void setPrimaryButtonOnClickListener(sls listener) {
        this.binding.e.setPrimaryButtonOnClickListener(listener);
    }

    public final void setSecondaryButtonClickListener(sls listener) {
        this.binding.e.setSecondaryButtonClickListener(listener);
    }

    public final void setVideoPlayerFactory(rm31 factory) {
        this.videoPlayerFactory = factory;
    }

    public CommunicationFullScreenView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CommunicationFullScreenView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CommunicationFullScreenView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final zy11 render(tls update) {
        vrc vrcVar = this.currentState;
        if (vrcVar == null) {
            return null;
        }
        render((vrc) update.invoke(vrcVar));
        return zy11.a;
    }
}
