package androidx.compose.ui.contentcapture;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.node.s;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.c;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.g;
import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.ag;
import defpackage.awk0;
import defpackage.b7;
import defpackage.ci9;
import defpackage.cnq0;
import defpackage.cry0;
import defpackage.cvw;
import defpackage.dry0;
import defpackage.fv31;
import defpackage.hz40;
import defpackage.inq0;
import defpackage.jl40;
import defpackage.jnq0;
import defpackage.jq6;
import defpackage.k4o;
import defpackage.kk2;
import defpackage.m9b1;
import defpackage.ny61;
import defpackage.pey;
import defpackage.rty;
import defpackage.sb2;
import defpackage.sls;
import defpackage.sty0;
import defpackage.tls;
import defpackage.v82;
import defpackage.w511;
import defpackage.wls;
import defpackage.wx40;
import defpackage.x4e;
import defpackage.x5w;
import defpackage.y5w;
import defpackage.yee;
import defpackage.yta1;
import defpackage.zee;
import defpackage.zii0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 \u009e\u00012\u00020\u00012\u00020\u0002:\u0006\u009f\u0001 \u0001¡\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\fH\u0080@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001d\u0010\u0019J\u000f\u0010 \u001a\u00020\fH\u0000¢\u0006\u0004\b\u001f\u0010\u0019J\u000f\u0010\"\u001a\u00020\fH\u0000¢\u0006\u0004\b!\u0010\u0019J/\u0010,\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'H\u0001¢\u0006\u0004\b*\u0010+J'\u00103\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u00002\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.H\u0001¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u00020\fH\u0002¢\u0006\u0004\b4\u0010\u0019J\u001f\u00109\u001a\u00020\f2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u001d\u0010>\u001a\u00020\f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010D\u001a\u00020\f2\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\fH\u0002¢\u0006\u0004\bF\u0010\u0019J\u000f\u0010G\u001a\u00020\fH\u0002¢\u0006\u0004\bG\u0010\u0019J\u001d\u0010J\u001a\u0004\u0018\u00010I*\u0002052\u0006\u0010H\u001a\u00020@H\u0002¢\u0006\u0004\bJ\u0010KJ-\u0010N\u001a\u00020\f*\u0002052\u0018\u0010M\u001a\u0014\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\f0LH\u0002¢\u0006\u0004\bN\u0010OJN\u0010U\u001a\u00020\f\"\u0004\b\u0000\u0010P*\b\u0012\u0004\u0012\u00028\u00000Q2\u0018\u0010M\u001a\u0014\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0L2\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020S0RH\u0082\b¢\u0006\u0004\bU\u0010VJ!\u0010Y\u001a\u00020\f2\u0006\u0010W\u001a\u00020@2\b\u0010X\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\f2\u0006\u0010W\u001a\u00020@H\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\fH\u0002¢\u0006\u0004\b]\u0010\u0019J\u001f\u0010_\u001a\u00020\f2\u0006\u0010H\u001a\u00020@2\u0006\u0010^\u001a\u000205H\u0002¢\u0006\u0004\b_\u0010`J\u0017\u0010a\u001a\u00020\f2\u0006\u0010^\u001a\u000205H\u0002¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020\f2\u0006\u0010^\u001a\u000205H\u0002¢\u0006\u0004\bc\u0010bJ\u000f\u0010d\u001a\u00020\fH\u0002¢\u0006\u0004\bd\u0010\u0019J\u000f\u0010e\u001a\u00020\fH\u0002¢\u0006\u0004\be\u0010\u0019J\u000f\u0010f\u001a\u00020\fH\u0002¢\u0006\u0004\bf\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010g\u001a\u0004\bh\u0010iR*\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR*\u0010o\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bo\u0010p\u0012\u0004\bu\u0010\u0019\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020w0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010{\u001a\u00020z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010~\u001a\u00020}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0019\u0010\u0080\u0001\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R.\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020<0;8@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0005\b\u008c\u0001\u0010?R\u0018\u0010\u008d\u0001\u001a\u00020z8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010|R \u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u0002070\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0091\u0001\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0093\u0001\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0081\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R!\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0085\u00018@X\u0080\u0004¢\u0006\u000f\u0012\u0005\b\u0099\u0001\u0010\u0019\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0017\u0010\u009d\u0001\u001a\u00020S8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006¢\u0001"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "Lkotlin/Function0;", "Lzee;", "onContentCaptureSession", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lsls;)V", "Landroid/view/View;", "v", "Lzy11;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Lpey;", "owner", "onStart", "(Lpey;)V", "onStop", "boundsUpdatesEventLoop$ui", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "boundsUpdatesEventLoop", "onSemanticsChange$ui", "()V", "onSemanticsChange", "onLayoutChange$ui", "onLayoutChange", "onShowTranslation$ui", "onShowTranslation", "onHideTranslation$ui", "onHideTranslation", "onClearTranslation$ui", "onClearTranslation", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests$ui", "([J[ILjava/util/function/Consumer;)V", "onCreateVirtualViewTranslationRequests", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "onVirtualViewTranslationResponses$ui", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;Landroid/util/LongSparseArray;)V", "onVirtualViewTranslationResponses", "sendContentCaptureDisappearEvents", "Landroidx/compose/ui/semantics/c;", "newNode", "Linq0;", "oldNode", "sendContentCaptureAppearEvents", "(Landroidx/compose/ui/semantics/c;Linq0;)V", "Lx5w;", "Ljnq0;", "newSemanticsNodes", "checkForContentCapturePropertyChanges", "(Lx5w;)V", "", "id", "", "newText", "sendContentCaptureTextUpdateEvent", "(ILjava/lang/String;)V", "updateSemanticsCopy", "notifySubtreeStateChangeIfNeeded", "index", "Lfv31;", "toViewStructure", "(Landroidx/compose/ui/semantics/c;I)Lfv31;", "Lkotlin/Function2;", "action", "fastForEachReplacedVisibleChildren", "(Landroidx/compose/ui/semantics/c;Lwls;)V", "T", "", "Lkotlin/Function1;", "", "predicate", "fastForEachIndexedWithFilter", "(Ljava/util/List;Lwls;Ltls;)V", "virtualId", "viewStructure", "bufferContentCaptureViewAppeared", "(ILfv31;)V", "bufferContentCaptureViewDisappeared", "(I)V", "notifyContentCaptureChanges", "node", "updateBuffersOnAppeared", "(ILandroidx/compose/ui/semantics/c;)V", "updateBuffersOnDisappeared", "(Landroidx/compose/ui/semantics/c;)V", "updateTranslationOnAppeared", "showTranslatedText", "hideTranslatedText", "clearTranslatedText", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Lsls;", "getOnContentCaptureSession", "()Lsls;", "setOnContentCaptureSession", "(Lsls;)V", "contentCaptureSession", "Lzee;", "getContentCaptureSession$ui", "()Lzee;", "setContentCaptureSession$ui", "(Lzee;)V", "getContentCaptureSession$ui$annotations", "", "Landroidx/compose/ui/contentcapture/b;", "bufferedEvents", "Ljava/util/List;", "", "SendRecurringContentCaptureEventsIntervalMillis", "J", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "translateStatus", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "currentSemanticsNodesInvalidated", "Z", "Lci9;", "boundsUpdateChannel", "Lci9;", "Landroid/os/Handler;", "legacyMainHandler", "Landroid/os/Handler;", "currentSemanticsNodes", "Lx5w;", "getCurrentSemanticsNodes$ui", "()Lx5w;", "setCurrentSemanticsNodes$ui", "currentSemanticsNodesSnapshotTimestampMillis", "Lwx40;", "previousSemanticsNodes", "Lwx40;", "previousSemanticsRoot", "Linq0;", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "contentCaptureChangeChecker", "Ljava/lang/Runnable;", "getHandler$ui", "()Landroid/os/Handler;", "getHandler$ui$annotations", "handler", "isEnabled$ui", "()Z", "isEnabled", "Companion", "TranslateStatus", "yta1", "v82", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidContentCaptureManager implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public static final int $stable = 8;
    public static final v82 Companion = new v82();
    public static final String VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX = "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX";
    public static final String VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP = "android.view.contentcapture.EventTimestamp";
    private boolean checkingForSemanticsChanges;
    private final Runnable contentCaptureChangeChecker;
    private zee contentCaptureSession;
    private x5w currentSemanticsNodes;
    private long currentSemanticsNodesSnapshotTimestampMillis;
    private sls onContentCaptureSession;
    private wx40 previousSemanticsNodes;
    private inq0 previousSemanticsRoot;
    private final AndroidComposeView view;
    private final List<b> bufferedEvents = new ArrayList();
    private long SendRecurringContentCaptureEventsIntervalMillis = 100;
    private TranslateStatus translateStatus = TranslateStatus.SHOW_ORIGINAL;
    private boolean currentSemanticsNodesInvalidated = true;
    private final ci9 boundsUpdateChannel = sb2.a(1, null, null, 6);
    private final Handler legacyMainHandler = new Handler(Looper.getMainLooper());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "", "SHOW_ORIGINAL", "SHOW_TRANSLATED", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TranslateStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TranslateStatus[] $VALUES;
        public static final TranslateStatus SHOW_ORIGINAL;
        public static final TranslateStatus SHOW_TRANSLATED;

        static {
            TranslateStatus translateStatus = new TranslateStatus("SHOW_ORIGINAL", 0);
            SHOW_ORIGINAL = translateStatus;
            TranslateStatus translateStatus2 = new TranslateStatus("SHOW_TRANSLATED", 1);
            SHOW_TRANSLATED = translateStatus2;
            TranslateStatus[] translateStatusArr = {translateStatus, translateStatus2};
            $VALUES = translateStatusArr;
            $ENTRIES = kotlin.enums.a.a(translateStatusArr);
        }

        public static TranslateStatus valueOf(String str) {
            return (TranslateStatus) Enum.valueOf(TranslateStatus.class, str);
        }

        public static TranslateStatus[] values() {
            return (TranslateStatus[]) $VALUES.clone();
        }
    }

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, sls slsVar) {
        this.view = androidComposeView;
        this.onContentCaptureSession = slsVar;
        wx40 wx40Var = y5w.a;
        this.currentSemanticsNodes = wx40Var;
        this.previousSemanticsNodes = y5w.a();
        this.previousSemanticsRoot = new inq0(androidComposeView.getSemanticsOwner().a(), wx40Var);
        this.contentCaptureChangeChecker = new b7(6, this);
    }

    private final void bufferContentCaptureViewAppeared(int virtualId, fv31 viewStructure) {
        if (viewStructure == null) {
            return;
        }
        this.bufferedEvents.add(new b(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_APPEAR, viewStructure));
    }

    private final void bufferContentCaptureViewDisappeared(int virtualId) {
        this.bufferedEvents.add(new b(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_DISAPPEAR, null));
    }

    private final void checkForContentCapturePropertyChanges(x5w newSemanticsNodes) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        x5w x5wVar = newSemanticsNodes;
        int[] iArr3 = x5wVar.b;
        long[] jArr = x5wVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        inq0 inq0Var = (inq0) this.previousSemanticsNodes.b(i7);
                        jnq0 jnq0Var = (jnq0) x5wVar.b(i7);
                        c cVar = jnq0Var != null ? jnq0Var.a : null;
                        if (cVar == null) {
                            throw x4e.v("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = cVar.f;
                        cnq0 cnq0Var = cVar.d;
                        hz40 hz40Var = cnq0Var.a;
                        if (inq0Var == null) {
                            Object[] objArr = hz40Var.b;
                            long[] jArr2 = hz40Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                g gVar = (g) objArr[(i10 << 3) + i12];
                                                g gVar2 = d.C;
                                                if (jl40.l(gVar, gVar2)) {
                                                    List list = (List) androidx.compose.ui.semantics.b.a(cnq0Var, gVar2);
                                                    sendContentCaptureTextUpdateEvent(i8, String.valueOf(list != null ? (kk2) kotlin.collections.a.R(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    j5 = j;
                                    i9 = 8;
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = hz40Var.b;
                            long[] jArr3 = hz40Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                g gVar3 = (g) objArr2[(i13 << 3) + i15];
                                                g gVar4 = d.C;
                                                if (jl40.l(gVar3, gVar4)) {
                                                    List list2 = (List) androidx.compose.ui.semantics.b.a(inq0Var.a, gVar4);
                                                    kk2 kk2Var = list2 != null ? (kk2) kotlin.collections.a.R(list2) : null;
                                                    List list3 = (List) androidx.compose.ui.semantics.b.a(cnq0Var, gVar4);
                                                    kk2 kk2Var2 = list3 != null ? (kk2) kotlin.collections.a.R(list3) : null;
                                                    if (!jl40.l(kk2Var, kk2Var2)) {
                                                        sendContentCaptureTextUpdateEvent(i8, String.valueOf(kk2Var2));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                    }
                                    if (i13 == length3) {
                                        break;
                                    }
                                    i13++;
                                    i6 = i;
                                    jArr4 = jArr5;
                                }
                                i2 = 8;
                            }
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    x5wVar = newSemanticsNodes;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            x5wVar = newSemanticsNodes;
            iArr3 = iArr;
        }
    }

    private final void clearTranslatedText() {
        ag agVar;
        sls slsVar;
        x5w currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.c;
        long[] jArr = currentSemanticsNodes$ui.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        cnq0 cnq0Var = ((jnq0) objArr[(i << 3) + i3]).a.d;
                        if (androidx.compose.ui.semantics.b.a(cnq0Var, d.E) != null && (agVar = (ag) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.a.n)) != null && (slsVar = (sls) agVar.a()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void contentCaptureChangeChecker$lambda$0(AndroidContentCaptureManager androidContentCaptureManager) {
        if (androidContentCaptureManager.isEnabled$ui()) {
            Trace.beginSection("ContentCapture:changeChecker");
            try {
                androidContentCaptureManager.view.measureAndLayout(true);
                androidContentCaptureManager.sendContentCaptureDisappearEvents();
                Trace.beginSection("ContentCapture:sendAppearEvents");
                androidContentCaptureManager.sendContentCaptureAppearEvents(androidContentCaptureManager.view.getSemanticsOwner().a(), androidContentCaptureManager.previousSemanticsRoot);
                Trace.endSection();
                androidContentCaptureManager.checkForContentCapturePropertyChanges(androidContentCaptureManager.getCurrentSemanticsNodes$ui());
                androidContentCaptureManager.updateSemanticsCopy();
                androidContentCaptureManager.checkingForSemanticsChanges = false;
            } catch (Throwable th) {
                throw th;
            } finally {
                Trace.endSection();
            }
        }
    }

    private final <T> void fastForEachIndexedWithFilter(List<? extends T> list, wls wlsVar, tls tlsVar) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (((Boolean) tlsVar.invoke(t)).booleanValue()) {
                wlsVar.invoke(Integer.valueOf(i), t);
                i++;
            }
        }
    }

    private final void fastForEachReplacedVisibleChildren(c cVar, wls wlsVar) {
        cVar.getClass();
        List j = c.j(cVar, 4);
        int size = j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = j.get(i2);
            if (getCurrentSemanticsNodes$ui().a(((c) obj).f)) {
                wlsVar.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public static /* synthetic */ void getContentCaptureSession$ui$annotations() {
    }

    public static /* synthetic */ void getHandler$ui$annotations() {
    }

    private final void hideTranslatedText() {
        ag agVar;
        tls tlsVar;
        x5w currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.c;
        long[] jArr = currentSemanticsNodes$ui.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        cnq0 cnq0Var = ((jnq0) objArr[(i << 3) + i3]).a.d;
                        if (jl40.l(androidx.compose.ui.semantics.b.a(cnq0Var, d.E), Boolean.TRUE) && (agVar = (ag) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.a.m)) != null && (tlsVar = (tls) agVar.a()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void notifyContentCaptureChanges() {
        zee zeeVar = this.contentCaptureSession;
        if (zeeVar == null || this.bufferedEvents.isEmpty()) {
            return;
        }
        List<b> list = this.bufferedEvents;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b bVar = list.get(i);
            int i2 = a.a[bVar.c().ordinal()];
            if (i2 == 1) {
                fv31 b = bVar.b();
                if (b != null) {
                    ((yee) zeeVar).d(b.h());
                }
            } else {
                if (i2 != 2) {
                    w511.b();
                    return;
                }
                yee yeeVar = (yee) zeeVar;
                AutofillId b2 = yeeVar.b(bVar.a());
                if (b2 != null) {
                    yeeVar.e(b2);
                }
            }
        }
        ((yee) zeeVar).a();
        this.bufferedEvents.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeStateChangeIfNeeded() {
        this.boundsUpdateChannel.d(zy11.a);
    }

    private final void sendContentCaptureAppearEvents(c newNode, final inq0 oldNode) {
        fastForEachReplacedVisibleChildren(newNode, new wls() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$sendContentCaptureAppearEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                int intValue = ((Number) obj).intValue();
                c cVar = (c) obj2;
                if (!inq0.this.b.c(cVar.f)) {
                    this.updateBuffersOnAppeared(intValue, cVar);
                    this.notifySubtreeStateChangeIfNeeded();
                }
                return zy11.a;
            }
        });
        newNode.getClass();
        List j = c.j(newNode, 4);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            c cVar = (c) j.get(i);
            x5w currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
            int i2 = cVar.f;
            if (currentSemanticsNodes$ui.a(i2) && this.previousSemanticsNodes.a(i2)) {
                Object b = this.previousSemanticsNodes.b(i2);
                if (b == null) {
                    throw x4e.v("node not present in pruned tree before this change");
                }
                sendContentCaptureAppearEvents(cVar, (inq0) b);
            }
        }
    }

    private final void sendContentCaptureDisappearEvents() {
        wx40 wx40Var = this.previousSemanticsNodes;
        int[] iArr = wx40Var.b;
        long[] jArr = wx40Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = iArr[(i << 3) + i3];
                        if (!getCurrentSemanticsNodes$ui().a(i4)) {
                            bufferContentCaptureViewDisappeared(i4);
                            notifySubtreeStateChangeIfNeeded();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void sendContentCaptureTextUpdateEvent(int id, String newText) {
        zee zeeVar = this.contentCaptureSession;
        if (zeeVar == null) {
            return;
        }
        yee yeeVar = (yee) zeeVar;
        AutofillId b = yeeVar.b(id);
        if (b == null) {
            throw x4e.v("Invalid content capture ID");
        }
        yeeVar.f(b, newText);
    }

    private final void showTranslatedText() {
        ag agVar;
        tls tlsVar;
        x5w currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.c;
        long[] jArr = currentSemanticsNodes$ui.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        cnq0 cnq0Var = ((jnq0) objArr[(i << 3) + i3]).a.d;
                        if (jl40.l(androidx.compose.ui.semantics.b.a(cnq0Var, d.E), Boolean.FALSE) && (agVar = (ag) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.a.m)) != null && (tlsVar = (tls) agVar.a()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r2 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final fv31 toViewStructure(c cVar, int i) {
        zii0 zii0Var;
        String h;
        zee zeeVar = this.contentCaptureSession;
        if (zeeVar != null) {
            AutofillId autofillId = this.view.getAutofillId();
            c l = cVar.l();
            int i2 = cVar.f;
            if (l != null) {
                autofillId = ((yee) zeeVar).b(l.f);
            }
            fv31 c = ((yee) zeeVar).c(autofillId, i2);
            cnq0 cnq0Var = cVar.d;
            if (!cnq0Var.a.b(d.L)) {
                Bundle a = c.a();
                if (a != null) {
                    a.putLong(VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP, this.currentSemanticsNodesSnapshotTimestampMillis);
                    a.putInt(VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX, i);
                }
                String str = (String) androidx.compose.ui.semantics.b.a(cnq0Var, d.A);
                if (str != null) {
                    c.e(i2, str);
                }
                if (((Boolean) androidx.compose.ui.semantics.b.a(cnq0Var, d.n)) != null) {
                    c.b("android.widget.ViewGroup");
                }
                List list = (List) androidx.compose.ui.semantics.b.a(cnq0Var, d.C);
                if (list != null) {
                    c.b(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
                    c.f(rty.a(62, null, "\n", list));
                }
                kk2 kk2Var = (kk2) androidx.compose.ui.semantics.b.a(cnq0Var, d.G);
                if (kk2Var != null) {
                    c.b(AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
                    c.f(kk2Var);
                }
                List list2 = (List) androidx.compose.ui.semantics.b.a(cnq0Var, d.a);
                if (list2 != null) {
                    c.c(rty.a(62, null, "\n", list2));
                }
                awk0 awk0Var = (awk0) androidx.compose.ui.semantics.b.a(cnq0Var, d.z);
                if (awk0Var != null && (h = m9b1.h(awk0Var.a)) != null) {
                    c.b(h);
                }
                dry0 f = m9b1.f(cnq0Var);
                if (f != null) {
                    cry0 g = f.g();
                    c.g(g.a().u0() * g.a().getDensity() * sty0.c(g.b().a.b));
                }
                s d = cVar.d();
                if (d != null) {
                    s sVar = d.d() ? d : null;
                    if (sVar != null) {
                        zii0Var = cVar.a(sVar);
                        float f2 = zii0Var.a;
                        float f3 = zii0Var.b;
                        c.d((int) f2, (int) f3, (int) (zii0Var.c - f2), (int) (zii0Var.d - f3));
                        return c;
                    }
                }
                zii0Var = zii0.e;
                float f22 = zii0Var.a;
                float f32 = zii0Var.b;
                c.d((int) f22, (int) f32, (int) (zii0Var.c - f22), (int) (zii0Var.d - f32));
                return c;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBuffersOnAppeared(int index, c node) {
        if (isEnabled$ui()) {
            updateTranslationOnAppeared(node);
            bufferContentCaptureViewAppeared(node.f, toViewStructure(node, index));
            fastForEachReplacedVisibleChildren(node, new wls() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$updateBuffersOnAppeared$1
                {
                    super(2);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    AndroidContentCaptureManager.this.updateBuffersOnAppeared(((Number) obj).intValue(), (c) obj2);
                    return zy11.a;
                }
            });
        }
    }

    private final void updateBuffersOnDisappeared(c node) {
        if (isEnabled$ui()) {
            bufferContentCaptureViewDisappeared(node.f);
            List j = c.j(node, 4);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                updateBuffersOnDisappeared((c) j.get(i));
            }
        }
    }

    private final void updateSemanticsCopy() {
        this.previousSemanticsNodes.c();
        x5w currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        int[] iArr = currentSemanticsNodes$ui.b;
        Object[] objArr = currentSemanticsNodes$ui.c;
        long[] jArr = currentSemanticsNodes$ui.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            this.previousSemanticsNodes.i(iArr[i4], new inq0(((jnq0) objArr[i4]).a, getCurrentSemanticsNodes$ui()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.previousSemanticsRoot = new inq0(this.view.getSemanticsOwner().a(), getCurrentSemanticsNodes$ui());
    }

    private final void updateTranslationOnAppeared(c node) {
        ag agVar;
        tls tlsVar;
        tls tlsVar2;
        cnq0 cnq0Var = node.d;
        Boolean bool = (Boolean) androidx.compose.ui.semantics.b.a(cnq0Var, d.E);
        if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL && jl40.l(bool, Boolean.TRUE)) {
            ag agVar2 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.a.m);
            if (agVar2 == null || (tlsVar2 = (tls) agVar2.a()) == null) {
                return;
            }
            return;
        }
        if (this.translateStatus != TranslateStatus.SHOW_TRANSLATED || !jl40.l(bool, Boolean.FALSE) || (agVar = (ag) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.a.m)) == null || (tlsVar = (tls) agVar.a()) == null) {
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (kotlinx.coroutines.a.i(r5, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0084 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object boundsUpdatesEventLoop$ui(Continuation<? super zy11> continuation) {
        AndroidContentCaptureManager$boundsUpdatesEventLoop$1 androidContentCaptureManager$boundsUpdatesEventLoop$1;
        int i;
        jq6 it;
        jq6 jq6Var;
        Object a;
        if (continuation instanceof AndroidContentCaptureManager$boundsUpdatesEventLoop$1) {
            androidContentCaptureManager$boundsUpdatesEventLoop$1 = (AndroidContentCaptureManager$boundsUpdatesEventLoop$1) continuation;
            int i2 = androidContentCaptureManager$boundsUpdatesEventLoop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidContentCaptureManager$boundsUpdatesEventLoop$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidContentCaptureManager$boundsUpdatesEventLoop$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidContentCaptureManager$boundsUpdatesEventLoop$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = this.boundsUpdateChannel.iterator();
                    androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0 = it;
                    androidContentCaptureManager$boundsUpdatesEventLoop$1.label = 1;
                    a = it.a(androidContentCaptureManager$boundsUpdatesEventLoop$1);
                    if (a != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jq6Var = (jq6) androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0;
                    kotlin.b.b(obj);
                    it = jq6Var;
                    androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0 = it;
                    androidContentCaptureManager$boundsUpdatesEventLoop$1.label = 1;
                    a = it.a(androidContentCaptureManager$boundsUpdatesEventLoop$1);
                    if (a != coroutineSingletons) {
                        jq6Var = it;
                        obj = a;
                        if (((Boolean) obj).booleanValue()) {
                            return zy11.a;
                        }
                        jq6Var.b();
                        if (isEnabled$ui()) {
                            notifyContentCaptureChanges();
                        }
                        Handler handler$ui = getHandler$ui();
                        if (!this.checkingForSemanticsChanges && handler$ui != null) {
                            this.checkingForSemanticsChanges = true;
                            handler$ui.post(this.contentCaptureChangeChecker);
                        }
                        long j = this.SendRecurringContentCaptureEventsIntervalMillis;
                        androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0 = jq6Var;
                        androidContentCaptureManager$boundsUpdatesEventLoop$1.label = 2;
                    }
                    return coroutineSingletons;
                }
                jq6Var = (jq6) androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        androidContentCaptureManager$boundsUpdatesEventLoop$1 = new AndroidContentCaptureManager$boundsUpdatesEventLoop$1(this, continuation);
        Object obj2 = androidContentCaptureManager$boundsUpdatesEventLoop$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidContentCaptureManager$boundsUpdatesEventLoop$1.label;
        if (i != 0) {
        }
    }

    /* renamed from: getContentCaptureSession$ui, reason: from getter */
    public final zee getContentCaptureSession() {
        return this.contentCaptureSession;
    }

    public final x5w getCurrentSemanticsNodes$ui() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = cvw.x(this.view.getSemanticsOwner(), AndroidContentCaptureManager$currentSemanticsNodes$1.w);
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    public final Handler getHandler$ui() {
        return this.view.getHandler();
    }

    public final sls getOnContentCaptureSession() {
        return this.onContentCaptureSession;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final boolean isEnabled$ui() {
        return this.contentCaptureSession != null;
    }

    public final void onClearTranslation$ui() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onCreate(pey peyVar) {
    }

    public final void onCreateVirtualViewTranslationRequests$ui(long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> requestsCollector) {
        yta1.c(this, virtualIds, requestsCollector);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onDestroy(pey peyVar) {
    }

    public final void onHideTranslation$ui() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        hideTranslatedText();
    }

    public final void onLayoutChange$ui() {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui()) {
            notifySubtreeStateChangeIfNeeded();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onPause(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onResume(pey peyVar) {
    }

    public final void onSemanticsChange$ui() {
        this.currentSemanticsNodesInvalidated = true;
        Handler handler$ui = getHandler$ui();
        if (!isEnabled$ui() || this.checkingForSemanticsChanges || handler$ui == null) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        handler$ui.post(this.contentCaptureChangeChecker);
    }

    public final void onShowTranslation$ui() {
        this.translateStatus = TranslateStatus.SHOW_TRANSLATED;
        showTranslatedText();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(pey owner) {
        this.contentCaptureSession = (zee) this.onContentCaptureSession.invoke();
        updateBuffersOnAppeared(-1, this.view.getSemanticsOwner().a());
        notifyContentCaptureChanges();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(pey owner) {
        updateBuffersOnDisappeared(this.view.getSemanticsOwner().a());
        notifyContentCaptureChanges();
        this.contentCaptureSession = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        getHandler$ui().removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    public final void onVirtualViewTranslationResponses$ui(AndroidContentCaptureManager contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
        yta1.d(contentCaptureManager, response);
    }

    public final void setContentCaptureSession$ui(zee zeeVar) {
        this.contentCaptureSession = zeeVar;
    }

    public final void setCurrentSemanticsNodes$ui(x5w x5wVar) {
        this.currentSemanticsNodes = x5wVar;
    }

    public final void setOnContentCaptureSession(sls slsVar) {
        this.onContentCaptureSession = slsVar;
    }
}
