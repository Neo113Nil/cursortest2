package defpackage;

import android.view.View;
import androidx.compose.ui.focus.b;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.w;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public interface m390 extends xce0 {
    /* renamed from: calculateLocalPosition-MK-Hz9U */
    long mo60calculateLocalPositionMKHz9U(long j);

    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    long mo61calculatePositionInWindowMKHz9U(long j);

    j390 createLayer(wls wlsVar, sls slsVar, a aVar);

    /* renamed from: dispatchOnScrollChanged-k-4lQ0M */
    void mo62dispatchOnScrollChangedk4lQ0M(long j);

    void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z);

    hh getAccessibilityManager();

    k94 getAutofill();

    o94 getAutofillManager();

    p94 getAutofillTree();

    c3c getClipboard();

    j3c getClipboardManager();

    fse getCoroutineContext();

    fwi getDensity();

    k8m getDragAndDropManager();

    b getFocusOwner();

    dyr getFontFamilyResolver();

    wxr getFontLoader();

    l0u getGraphicsContext();

    w6u getHapticFeedBack();

    j0w getInputModeManager();

    LayoutDirection getLayoutDirection();

    k5z getLocaleList();

    rw80 getOutOfFrameExecutor();

    o.a getPlacementScope();

    xvd0 getPointerIconService();

    androidx.compose.ui.spatial.a getRectManager();

    q0k0 getRetainedValuesStore();

    LayoutNode getRoot();

    knq0 getSemanticsOwner();

    c1y getSharedDrawScope();

    boolean getShowLayoutBounds();

    w getSnapshotObserver();

    u5t0 getSoftwareKeyboardController();

    vpy0 getTextInputService();

    rty0 getTextToolbar();

    xp31 getViewConfiguration();

    k651 getWindowInfo();

    void invalidateRootLayer();

    void measureAndLayout(boolean z);

    /* renamed from: measureAndLayout-0kLqBqw */
    void mo66measureAndLayout0kLqBqw(LayoutNode layoutNode, long j);

    void onDetach(LayoutNode layoutNode);

    void onEndApplyChanges();

    void onInteropViewLayoutChange(View view);

    void onLayoutChange(LayoutNode layoutNode);

    void onLayoutNodeDeactivated(LayoutNode layoutNode);

    void onPostAttach(LayoutNode layoutNode);

    void onPostLayoutNodeReused(LayoutNode layoutNode, int i);

    void onPreAttach(LayoutNode layoutNode);

    void onPreLayoutNodeReused(LayoutNode layoutNode, int i);

    void onRequestMeasure(LayoutNode layoutNode, boolean z, boolean z2, boolean z3);

    void onRequestRelayout(LayoutNode layoutNode, boolean z, boolean z2);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(sls slsVar);

    void requestAutofill(LayoutNode layoutNode);

    void requestOnPositionedCallback(LayoutNode layoutNode);

    void setShowLayoutBounds(boolean z);

    Object textInputSession(wls wlsVar, Continuation continuation);

    void voteFrameRate(float f);
}
