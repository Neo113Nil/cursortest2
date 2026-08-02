package xsna;

import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemTooltipEvent;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a7f0;
import xsna.t0d;
import xsna.wk50;
import xsna.z2d;

/* compiled from: TooltipActionApplier.kt */
/* loaded from: classes17.dex */
public final class x4p0 implements oj50<z2d, ClipItemAction, ClipItemPatch> {
    public static final /* synthetic */ qcy<Object>[] d;
    public final f4z a;
    public final f4z b;
    public final d80 c = new d80();

    /* compiled from: TooltipActionApplier.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipItemAction.Tooltip.Hide.values().length];
            try {
                iArr[ClipItemAction.Tooltip.Hide.IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipItemAction.Tooltip.Hide.ANIMATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipItemAction.Tooltip.Hide.DELAYED_WITH_ANIMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(x4p0.class, "hideTooltipDisposable", "getHideTooltipDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        d = new qcy[]{mutablePropertyReference1Impl};
    }

    public x4p0(f4z f4zVar, f4z f4zVar2) {
        this.a = f4zVar;
        this.b = f4zVar2;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        ClipItemTooltipEvent.HideTooltip hideTooltip;
        ClipItemAction clipItemAction = (ClipItemAction) kj50Var;
        if ((((z2d) km50Var) instanceof z2d.a) && (clipItemAction instanceof ClipItemAction.Tooltip)) {
            ClipItemAction.Tooltip tooltip = (ClipItemAction.Tooltip) clipItemAction;
            if (tooltip instanceof ClipItemAction.Tooltip.c) {
                this.b.b(t0d.l.a);
                return;
            }
            if (tooltip instanceof ClipItemAction.Tooltip.b) {
                aVar.b(new ClipItemPatch.r(true));
                return;
            }
            if (tooltip instanceof ClipItemAction.Tooltip.a) {
                aVar.b(new ClipItemPatch.q(true));
                return;
            }
            if (!(tooltip instanceof ClipItemAction.Tooltip.Hide)) {
                throw new NoWhenBranchMatchedException();
            }
            ClipItemAction.Tooltip.Hide hide = (ClipItemAction.Tooltip.Hide) clipItemAction;
            int i = a.$EnumSwitchMapping$0[hide.ordinal()];
            if (i == 1) {
                hideTooltip = ClipItemTooltipEvent.HideTooltip.IMMEDIATE;
            } else if (i == 2) {
                hideTooltip = ClipItemTooltipEvent.HideTooltip.ANIMATED;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                hideTooltip = ClipItemTooltipEvent.HideTooltip.ANIMATED;
            }
            ClipItemAction.Tooltip.Hide hide2 = ClipItemAction.Tooltip.Hide.DELAYED_WITH_ANIMATION;
            qcy<Object>[] qcyVarArr = d;
            d80 d80Var = this.c;
            f4z f4zVar = this.a;
            if (hide == hide2) {
                io.reactivex.rxjava3.disposables.c f = a7f0.a.f(aVar, io.reactivex.rxjava3.core.x.k(hideTooltip).f(5000L, TimeUnit.MILLISECONDS), new y4p0(1, f4zVar, wj50.class, "notify", "notify(Ljava/lang/Object;)V", 0), null, 5);
                qcy<Object> qcyVar = qcyVarArr[0];
                d80Var.g(f);
            } else {
                qcy<Object> qcyVar2 = qcyVarArr[0];
                d80Var.g(null);
                f4zVar.b(hideTooltip);
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
