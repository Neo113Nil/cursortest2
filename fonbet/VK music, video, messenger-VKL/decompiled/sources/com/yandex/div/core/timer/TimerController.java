package com.yandex.div.core.timer;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.xc;
import java.util.List;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: TimerController.kt */
/* loaded from: classes7.dex */
public final class TimerController {
    public static final Companion Companion = new Companion(null);
    private Div2View div2View;
    private final DivActionBinder divActionBinder;
    private final xc divTimer;
    private final List<DivAction> endActions;
    private final ErrorCollector errorCollector;
    private final ExpressionResolver expressionResolver;
    private final String id;
    private boolean savedForBackground;
    private final List<DivAction> tickActions;
    private final Ticker ticker;
    private final String valueVariable;

    /* compiled from: TimerController.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public TimerController(xc xcVar, DivActionBinder divActionBinder, ErrorCollector errorCollector, ExpressionResolver expressionResolver) {
        this.divTimer = xcVar;
        this.divActionBinder = divActionBinder;
        this.errorCollector = errorCollector;
        this.expressionResolver = expressionResolver;
        String str = xcVar.c;
        this.id = str;
        this.valueVariable = xcVar.f;
        this.endActions = xcVar.b;
        this.tickActions = xcVar.d;
        this.ticker = new Ticker(str, new TimerController$ticker$1(this), new TimerController$ticker$2(this), new TimerController$ticker$3(this), new TimerController$ticker$4(this), errorCollector);
        xcVar.a.observeAndGet(expressionResolver, new izs<Long, s3q0>() { // from class: com.yandex.div.core.timer.TimerController.1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Long l) {
                invoke(l.longValue());
                return s3q0.a;
            }

            public final void invoke(long j) {
                TimerController.this.updateTimer();
            }
        });
        Expression<Long> expression = xcVar.e;
        if (expression != null) {
            expression.observeAndGet(expressionResolver, new izs<Long, s3q0>() { // from class: com.yandex.div.core.timer.TimerController.2
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(Long l) {
                    invoke(l.longValue());
                    return s3q0.a;
                }

                public final void invoke(long j) {
                    TimerController.this.updateTimer();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEnd(long j) {
        updateTimerVariable(j);
        Div2View div2View = this.div2View;
        if (div2View != null) {
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, div2View, div2View.getExpressionResolver(), this.endActions, "timer", null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTick(long j) {
        updateTimerVariable(j);
        Div2View div2View = this.div2View;
        if (div2View != null) {
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, div2View, div2View.getExpressionResolver(), this.tickActions, "timer", null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimer() {
        Ticker ticker = this.ticker;
        long longValue = this.divTimer.a.evaluate(this.expressionResolver).longValue();
        Expression<Long> expression = this.divTimer.e;
        ticker.update(longValue, expression != null ? expression.evaluate(this.expressionResolver) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimerVariable(long j) {
        Div2View div2View;
        String str = this.valueVariable;
        if (str == null || (div2View = this.div2View) == null) {
            return;
        }
        div2View.setVariable(str, String.valueOf(j));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final void applyCommand(String str) {
        switch (str.hashCode()) {
            case -1367724422:
                if (str.equals("cancel")) {
                    this.ticker.cancel();
                    return;
                }
                break;
            case -934426579:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_RESUME)) {
                    this.ticker.resume();
                    return;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    this.ticker.stop();
                    return;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    this.ticker.pause();
                    return;
                }
                break;
            case 108404047:
                if (str.equals("reset")) {
                    this.ticker.reset();
                    return;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    this.ticker.start();
                    return;
                }
                break;
        }
        this.errorCollector.logError(new IllegalArgumentException(str.concat(" is unsupported timer command!")));
    }

    public final xc getDivTimer() {
        return this.divTimer;
    }

    public final boolean isAttachedToView(Div2View div2View) {
        return epx.f(div2View, this.div2View);
    }

    public final void onAttach(Div2View div2View) {
        this.div2View = div2View;
        if (this.savedForBackground) {
            this.ticker.restoreState(true);
            this.savedForBackground = false;
        }
    }

    public final void onDetach(Div2View div2View) {
        if (epx.f(div2View, this.div2View)) {
            reset();
        }
    }

    public final void reset() {
        this.div2View = null;
        this.ticker.saveState();
        this.savedForBackground = true;
    }
}
