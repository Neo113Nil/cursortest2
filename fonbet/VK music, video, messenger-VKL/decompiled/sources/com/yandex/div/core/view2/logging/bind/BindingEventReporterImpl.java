package com.yandex.div.core.view2.logging.bind;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.logging.EventMessageBuilder;
import com.yandex.div.core.view2.reuse.RebindTask;
import com.yandex.div2.j3;
import xsna.fpf0;
import xsna.zcl;

/* compiled from: BindingEventReporterImpl.kt */
/* loaded from: classes7.dex */
public final class BindingEventReporterImpl extends EventMessageBuilder implements BindingEventReporter {
    public static final Companion Companion = new Companion(null);
    private final Div2View div2View;
    private final j3 newData;
    private final j3 oldData;

    /* compiled from: BindingEventReporterImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public BindingEventReporterImpl(Div2View div2View, j3 j3Var, j3 j3Var2) {
        this.div2View = div2View;
        this.oldData = j3Var;
        this.newData = j3Var2;
    }

    private final void sendLog(String str) {
        this.div2View.getDiv2Component$div_release().getDiv2Logger().logBindingResult(this.div2View, this.oldData, this.newData, str, buildEventsLogMessage());
    }

    @Override // com.yandex.div.core.view2.logging.bind.BindingEventReporter
    public void onBindingFatalNoData() {
        sendLog("Binding failed. New DivData not provided");
    }

    @Override // com.yandex.div.core.view2.logging.bind.BindingEventReporter
    public void onBindingFatalSameData() {
        sendLog("No actions performed. Old and new DivData are the same");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public void onComparisonDifferentChildCount() {
        appendEventMessage("Div comparison failed", "Some element changed its child count");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public void onComparisonDifferentClasses() {
        appendEventMessage("Div comparison failed", "For some element its old and new java classes are not equal");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public void onComparisonDifferentCustomTypes() {
        appendEventMessage("Div comparison failed", "Some `DivCustom` element has different `customType`");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public void onComparisonDifferentIdsWithTransition() {
        appendEventMessage("Div comparison failed", "Some element has changed its `id` while has transitions");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public void onComparisonDifferentOverlap() {
        appendEventMessage("Div comparison failed", "Some element has changed its `orientation` from/to 'overlap'");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public void onComparisonDifferentWrap() {
        appendEventMessage("Div comparison failed", "Some element has changed its `layoutMode` from/to 'wrap'");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public void onComparisonNoOldData() {
        appendEventMessage("Div comparison failed", "No old `DivData` to compare with");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public void onComparisonNoState() {
        appendEventMessage("Div comparison failed", "Cannot find required state of `DivData`");
    }

    @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
    public void onComplexRebindFatalNoState() {
        sendLog("Div has no state to bind");
    }

    @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
    public void onComplexRebindNoDivInState() {
        appendEventMessage("Complex rebind failed", "Cannot find div inside state to bind");
    }

    @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
    public void onComplexRebindNoExistingParent() {
        appendEventMessage("Complex rebind failed", "Cannot find any existing view to start binding");
    }

    @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
    public void onComplexRebindNothingToBind() {
        appendEventMessage("Complex rebind failed", "Cannot find any difference to bind");
    }

    @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
    public void onComplexRebindSuccess() {
        sendLog("Performed complex rebind");
    }

    @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
    public void onComplexRebindUnsupportedElementException(RebindTask.UnsupportedElementException unsupportedElementException) {
        appendEventMessage("Complex rebind failed with exception", fpf0.a(unsupportedElementException.getClass()) + " (" + unsupportedElementException.getMessage() + ')');
    }

    @Override // com.yandex.div.core.view2.logging.bind.ForceRebindReporter
    public void onFirstBindingCompleted() {
        sendLog("DivData bound for the first time");
    }

    @Override // com.yandex.div.core.view2.logging.bind.ForceRebindReporter
    public void onForceRebindFatalNoState() {
        sendLog("Div has no state to bind");
    }

    @Override // com.yandex.div.core.view2.logging.bind.ForceRebindReporter
    public void onForceRebindSuccess() {
        sendLog("Performed unoptimized rebind. Old data was cleaned up");
    }

    @Override // com.yandex.div.core.view2.logging.bind.SimpleRebindReporter
    public void onSimpleRebindException(Exception exc) {
        appendEventMessage("Simple rebind failed with exception", fpf0.a(exc.getClass()) + " (" + exc.getMessage() + ')');
    }

    @Override // com.yandex.div.core.view2.logging.bind.SimpleRebindReporter
    public void onSimpleRebindFatalNoState() {
        sendLog("Div has no state to bind");
    }

    @Override // com.yandex.div.core.view2.logging.bind.SimpleRebindReporter
    public void onSimpleRebindNoChild() {
        appendEventMessage("Simple rebind failed", "Div2View has no child to rebind");
    }

    @Override // com.yandex.div.core.view2.logging.bind.SimpleRebindReporter
    public void onSimpleRebindSuccess() {
        sendLog("Performed simple rebind");
    }
}
