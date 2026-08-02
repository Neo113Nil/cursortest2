package androidx.compose.foundation.text.input.internal;

import android.R;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.j;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.asy0;
import defpackage.cia1;
import defpackage.cry0;
import defpackage.csh;
import defpackage.d4r0;
import defpackage.div;
import defpackage.dry0;
import defpackage.dsh;
import defpackage.eja1;
import defpackage.ery0;
import defpackage.ezv;
import defpackage.fia1;
import defpackage.fmb1;
import defpackage.fnc;
import defpackage.g0w;
import defpackage.h0w;
import defpackage.hm40;
import defpackage.hoy0;
import defpackage.hza1;
import defpackage.jl40;
import defpackage.jon;
import defpackage.kk2;
import defpackage.lza1;
import defpackage.m2r0;
import defpackage.n2r0;
import defpackage.oay;
import defpackage.odf0;
import defpackage.p6u;
import defpackage.pay;
import defpackage.q6u;
import defpackage.reu;
import defpackage.rzx;
import defpackage.sls;
import defpackage.sxo;
import defpackage.u9r;
import defpackage.xm2;
import defpackage.xp31;
import defpackage.ygd;
import defpackage.zii0;
import defpackage.zkn;
import defpackage.zoy0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010 J\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001dH\u0016¢\u0006\u0004\b(\u0010$J\u001f\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001dH\u0016¢\u0006\u0004\b)\u0010$J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b*\u0010$J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\u0017J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dH\u0016¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dH\u0016¢\u0006\u0004\b4\u00103J\u0019\u00105\u001a\u0004\u0018\u00010\u001b2\u0006\u00101\u001a\u00020\u001dH\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u001dH\u0016¢\u0006\u0004\b8\u00109J!\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00101\u001a\u00020\u001dH\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u001dH\u0016¢\u0006\u0004\b@\u00109J\u0017\u0010B\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u001dH\u0016¢\u0006\u0004\bB\u00109J+\u0010I\u001a\u00020\u00132\u0006\u0010D\u001a\u00020C2\b\u0010F\u001a\u0004\u0018\u00010E2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJ!\u0010N\u001a\u00020\u00062\u0006\u0010D\u001a\u00020K2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bN\u0010OJ\u0019\u0010Q\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bQ\u0010RJ\u0019\u0010U\u001a\u00020\u00062\b\u0010T\u001a\u0004\u0018\u00010SH\u0016¢\u0006\u0004\bU\u0010VJ\u0011\u0010X\u001a\u0004\u0018\u00010WH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\u001dH\u0016¢\u0006\u0004\b[\u00109J\u0017\u0010]\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u0006H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\u001d2\u0006\u0010_\u001a\u00020\u001dH\u0016¢\u0006\u0004\b`\u0010aJ#\u0010f\u001a\u00020\u00062\b\u0010c\u001a\u0004\u0018\u00010b2\b\u0010e\u001a\u0004\u0018\u00010dH\u0016¢\u0006\u0004\bf\u0010gJ)\u0010k\u001a\u00020\u00062\u0006\u0010i\u001a\u00020h2\u0006\u00101\u001a\u00020\u001d2\b\u0010j\u001a\u0004\u0018\u00010dH\u0016¢\u0006\u0004\bk\u0010lJ\u001e\u0010o\u001a\u00020\u00062\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00130mH\u0082\b¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020\u00132\u0006\u0010r\u001a\u00020qH\u0002¢\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u00020\u0006H\u0002¢\u0006\u0004\bu\u0010\u0017J\u000f\u0010v\u001a\u00020\u0006H\u0002¢\u0006\u0004\bv\u0010\u0017J\u0017\u0010x\u001a\u00020\u00132\u0006\u0010w\u001a\u00020\u001dH\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020\u00132\u0006\u0010z\u001a\u00020bH\u0002¢\u0006\u0004\b{\u0010|R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010}\u001a\u0004\b~\u0010\u007fR\u0019\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\u0007\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0005\b\t\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u000f\n\u0005\b\u000b\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000f\n\u0005\b\r\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R2\u0010\u008e\u0001\u001a\u00020\u00022\u0007\u0010\u008d\u0001\u001a\u00020\u00028\u0000@@X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u008c\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0080\u0001R\u001e\u0010\u0097\u0001\u001a\t\u0012\u0004\u0012\u00020q0\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0019\u0010\u0099\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0080\u0001¨\u0006\u009a\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Lhoy0;", "initState", "Lezv;", "eventCallback", "", "autoCorrect", "Loay;", "legacyTextFieldState", "Landroidx/compose/foundation/text/selection/j;", "textFieldSelectionManager", "Lxp31;", "viewConfiguration", "<init>", "(Lhoy0;Lezv;ZLoay;Landroidx/compose/foundation/text/selection/j;Lxp31;)V", ClidProvider.STATE, "Lg0w;", "inputMethodManager", "Lzy11;", "updateInputState", "(Lhoy0;Lg0w;)V", "beginBatchEdit", "()Z", "endBatchEdit", "closeConnection", "()V", "", "text", "", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", BackendConfig.Restrictions.ENABLED, "reportFullscreenMode", "(Z)Z", "reqModes", "getCursorCapsMode", "(I)I", "", "action", "Landroid/os/Bundle;", Constants.KEY_DATA, "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "Lkotlin/Function0;", "block", "ensureActive", "(Lsls;)Z", "Lzkn;", "editCommand", "addEditCommandWithBatch", "(Lzkn;)V", "beginBatchEditInternal", "endBatchEditInternal", AuthSdkActivity.RESPONSE_TYPE_CODE, "sendSynthesizedKeyEvent", "(I)V", Constants.KEY_MESSAGE, "logDebug", "(Ljava/lang/String;)V", "Lezv;", "getEventCallback", "()Lezv;", "Z", "getAutoCorrect", "Loay;", "getLegacyTextFieldState", "()Loay;", "Landroidx/compose/foundation/text/selection/j;", "getTextFieldSelectionManager", "()Landroidx/compose/foundation/text/selection/j;", "Lxp31;", "getViewConfiguration", "()Lxp31;", "batchDepth", CA20Status.STATUS_USER_I, "value", "textFieldValue", "Lhoy0;", "getTextFieldValue$foundation", "()Lhoy0;", "setTextFieldValue$foundation", "(Lhoy0;)V", "currentExtractedTextRequestToken", "extractedTextMonitorMode", "", "editCommands", "Ljava/util/List;", "isActive", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;
    private final List<zkn> editCommands;
    private final ezv eventCallback;
    private boolean extractedTextMonitorMode;
    private boolean isActive;
    private final oay legacyTextFieldState;
    private final j textFieldSelectionManager;
    private hoy0 textFieldValue;
    private final xp31 viewConfiguration;

    public RecordingInputConnection(hoy0 hoy0Var, ezv ezvVar, boolean z, oay oayVar, j jVar, xp31 xp31Var) {
        this.eventCallback = ezvVar;
        this.autoCorrect = z;
        this.legacyTextFieldState = oayVar;
        this.textFieldSelectionManager = jVar;
        this.viewConfiguration = xp31Var;
        this.textFieldValue = hoy0Var;
        this.editCommands = new ArrayList();
        this.isActive = true;
    }

    private final void addEditCommandWithBatch(zkn editCommand) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(editCommand);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    private final boolean endBatchEditInternal() {
        int i = this.batchDepth - 1;
        this.batchDepth = i;
        if (i == 0 && !this.editCommands.isEmpty()) {
            ((pay) ((reu) this.eventCallback).b).c.invoke(new ArrayList(this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    private final boolean ensureActive(sls block) {
        boolean z = this.isActive;
        if (z) {
            block.invoke();
        }
        return z;
    }

    private final void logDebug(String message) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 performHandwritingGesture$lambda$0(RecordingInputConnection recordingInputConnection, zkn zknVar) {
        recordingInputConnection.addEditCommandWithBatch(zknVar);
        return zy11.a;
    }

    private final void sendSynthesizedKeyEvent(int code) {
        sendKeyEvent(new KeyEvent(0, code));
        sendKeyEvent(new KeyEvent(1, code));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z = this.isActive;
        return z ? beginBatchEditInternal() : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int states) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        ArrayList arrayList = ((pay) ((reu) this.eventCallback).b).j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (jl40.l(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo text) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int flags, Bundle opts) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.isActive;
        return z ? this.autoCorrect : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence text, int newCursorPosition) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new fnc(String.valueOf(text), newCursorPosition));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new csh(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new dsh(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new u9r());
        return true;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        hoy0 hoy0Var = this.textFieldValue;
        return TextUtils.getCapsMode(hoy0Var.a.b, asy0.f(hoy0Var.b), reqModes);
    }

    public final ezv getEventCallback() {
        return this.eventCallback;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest request, int flags) {
        boolean z = (flags & 1) != 0;
        this.extractedTextMonitorMode = z;
        if (z) {
            this.currentExtractedTextRequestToken = request != null ? request.token : 0;
        }
        return cia1.e(this.textFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    public final oay getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int flags) {
        if (asy0.c(this.textFieldValue.b)) {
            return null;
        }
        return fmb1.l(this.textFieldValue).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        return fmb1.m(this.textFieldValue, maxChars).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        return fmb1.n(this.textFieldValue, maxChars).b;
    }

    public final j getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    /* renamed from: getTextFieldValue$foundation, reason: from getter */
    public final hoy0 getTextFieldValue() {
        return this.textFieldValue;
    }

    public final xp31 getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id) {
        boolean z = this.isActive;
        if (z) {
            z = false;
            switch (id) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new d4r0(0, this.textFieldValue.a.b.length()));
                    break;
                case R.id.cut:
                    sendSynthesizedKeyEvent(277);
                    break;
                case R.id.copy:
                    sendSynthesizedKeyEvent(278);
                    break;
                case R.id.paste:
                    sendSynthesizedKeyEvent(279);
                    break;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int editorAction) {
        int i;
        boolean z = this.isActive;
        if (z) {
            z = true;
            if (editorAction != 0) {
                switch (editorAction) {
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 6:
                        i = 7;
                        break;
                    case 7:
                        i = 5;
                        break;
                }
                ((pay) ((reu) this.eventCallback).b).d.invoke(new div(i));
            }
            i = 1;
            ((pay) ((reu) this.eventCallback).b).d.invoke(new div(i));
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e0  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void performHandwritingGesture(HandwritingGesture gesture, Executor executor, IntConsumer consumer) {
        kk2 kk2Var;
        PointF startPoint;
        PointF endPoint;
        long j;
        int i;
        PointF insertionPoint;
        ery0 d;
        String textToInsert;
        dry0 dry0Var;
        PointF joinOrSplitPoint;
        ery0 d2;
        dry0 dry0Var2;
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int granularity3;
        RectF deletionArea;
        RectF selectionArea;
        int granularity4;
        dry0 dry0Var3;
        cry0 cry0Var;
        if (Build.VERSION.SDK_INT >= 34) {
            oay oayVar = this.legacyTextFieldState;
            j jVar = this.textFieldSelectionManager;
            xp31 xp31Var = this.viewConfiguration;
            odf0 odf0Var = new odf0(12, this);
            int i2 = 0;
            int i3 = 3;
            if (oayVar != null && (kk2Var = oayVar.j) != null) {
                ery0 d3 = oayVar.d();
                if (kk2Var.equals((d3 == null || (dry0Var3 = d3.a) == null || (cry0Var = dry0Var3.a) == null) ? null : cry0Var.a)) {
                    if (jon.r(gesture)) {
                        SelectGesture n = jon.n(gesture);
                        selectionArea = n.getSelectionArea();
                        zii0 h = fia1.h(selectionArea);
                        granularity4 = n.getGranularity();
                        long g = lza1.g(oayVar, h, granularity4 != 1 ? 0 : 1);
                        if (asy0.c(g)) {
                            i3 = hza1.c(jon.j(n), odf0Var);
                        } else {
                            odf0Var.invoke(new d4r0((int) (g >> 32), (int) (g & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                            if (jVar != null) {
                                jVar.h(true);
                            }
                            i3 = 1;
                        }
                    } else if (jon.D(gesture)) {
                        DeleteGesture l = p6u.l(gesture);
                        granularity3 = l.getGranularity();
                        int i4 = granularity3 != 1 ? 0 : 1;
                        deletionArea = l.getDeletionArea();
                        long g2 = lza1.g(oayVar, fia1.h(deletionArea), i4);
                        if (asy0.c(g2)) {
                            i3 = hza1.c(jon.j(l), odf0Var);
                        } else {
                            hza1.d(g2, kk2Var, i4 == 1, odf0Var);
                            i3 = 1;
                        }
                    } else if (p6u.y(gesture)) {
                        SelectRangeGesture n2 = p6u.n(gesture);
                        selectionStartArea = n2.getSelectionStartArea();
                        zii0 h2 = fia1.h(selectionStartArea);
                        selectionEndArea = n2.getSelectionEndArea();
                        zii0 h3 = fia1.h(selectionEndArea);
                        granularity2 = n2.getGranularity();
                        long b = lza1.b(oayVar, h2, h3, granularity2 != 1 ? 0 : 1);
                        if (asy0.c(b)) {
                            i3 = hza1.c(jon.j(n2), odf0Var);
                        } else {
                            odf0Var.invoke(new d4r0((int) (b >> 32), (int) (b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                            if (jVar != null) {
                                jVar.h(true);
                            }
                            i3 = 1;
                        }
                    } else if (p6u.B(gesture)) {
                        DeleteRangeGesture m = p6u.m(gesture);
                        granularity = m.getGranularity();
                        int i5 = granularity != 1 ? 0 : 1;
                        deletionStartArea = m.getDeletionStartArea();
                        zii0 h4 = fia1.h(deletionStartArea);
                        deletionEndArea = m.getDeletionEndArea();
                        long b2 = lza1.b(oayVar, h4, fia1.h(deletionEndArea), i5);
                        if (asy0.c(b2)) {
                            i3 = hza1.c(jon.j(m), odf0Var);
                        } else {
                            hza1.d(b2, kk2Var, i5 == 1, odf0Var);
                            i3 = 1;
                        }
                    } else {
                        i3 = 2;
                        if (jon.C(gesture)) {
                            JoinOrSplitGesture l2 = jon.l(gesture);
                            if (xp31Var == null) {
                                i3 = hza1.c(jon.v(l2), odf0Var);
                            } else {
                                joinOrSplitPoint = l2.getJoinOrSplitPoint();
                                int a = lza1.a(oayVar, lza1.d(joinOrSplitPoint), xp31Var);
                                if (a == -1 || !((d2 = oayVar.d()) == null || (dry0Var2 = d2.a) == null || !lza1.c(dry0Var2, a))) {
                                    i3 = hza1.c(jon.j(l2), odf0Var);
                                } else {
                                    int i6 = a;
                                    while (i6 > 0) {
                                        int codePointBefore = Character.codePointBefore(kk2Var, i6);
                                        if (!lza1.i(codePointBefore)) {
                                            break;
                                        } else {
                                            i6 -= Character.charCount(codePointBefore);
                                        }
                                    }
                                    while (a < kk2Var.b.length()) {
                                        int codePointAt = Character.codePointAt(kk2Var, a);
                                        if (!lza1.i(codePointAt)) {
                                            break;
                                        } else {
                                            a += Character.charCount(codePointAt);
                                        }
                                    }
                                    long c = eja1.c(i6, a);
                                    if (asy0.c(c)) {
                                        int i7 = (int) (c >> 32);
                                        odf0Var.invoke(new q6u(new zkn[]{new d4r0(i7, i7), new fnc(" ", 1)}));
                                    } else {
                                        hza1.d(c, kk2Var, false, odf0Var);
                                    }
                                    i3 = 1;
                                }
                            }
                        } else if (jon.x(gesture)) {
                            InsertGesture k = jon.k(gesture);
                            if (xp31Var == null) {
                                i3 = hza1.c(jon.v(k), odf0Var);
                            } else {
                                insertionPoint = k.getInsertionPoint();
                                int a2 = lza1.a(oayVar, lza1.d(insertionPoint), xp31Var);
                                if (a2 == -1 || !((d = oayVar.d()) == null || (dry0Var = d.a) == null || !lza1.c(dry0Var, a2))) {
                                    i3 = hza1.c(jon.j(k), odf0Var);
                                } else {
                                    textToInsert = k.getTextToInsert();
                                    odf0Var.invoke(new q6u(new zkn[]{new d4r0(a2, a2), new fnc(textToInsert, 1)}));
                                    i3 = 1;
                                }
                            }
                        } else if (jon.A(gesture)) {
                            RemoveSpaceGesture m2 = jon.m(gesture);
                            ery0 d4 = oayVar.d();
                            dry0 dry0Var4 = d4 != null ? d4.a : null;
                            startPoint = m2.getStartPoint();
                            long d5 = lza1.d(startPoint);
                            endPoint = m2.getEndPoint();
                            long d6 = lza1.d(endPoint);
                            rzx c2 = oayVar.c();
                            if (dry0Var4 != null) {
                                hm40 hm40Var = dry0Var4.b;
                                if (c2 != null) {
                                    long mo44screenToLocalMKHz9U = c2.mo44screenToLocalMKHz9U(d5);
                                    long mo44screenToLocalMKHz9U2 = c2.mo44screenToLocalMKHz9U(d6);
                                    int f = lza1.f(hm40Var, mo44screenToLocalMKHz9U, xp31Var);
                                    int f2 = lza1.f(hm40Var, mo44screenToLocalMKHz9U2, xp31Var);
                                    if (f != -1) {
                                        if (f2 != -1) {
                                            f = Math.min(f, f2);
                                        }
                                        f2 = f;
                                    } else if (f2 == -1) {
                                        j = asy0.b;
                                        if (asy0.c(j)) {
                                            i3 = hza1.c(jon.j(m2), odf0Var);
                                        } else {
                                            Ref$IntRef ref$IntRef = new Ref$IntRef();
                                            ref$IntRef.element = -1;
                                            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                            ref$IntRef2.element = -1;
                                            String i8 = new Regex("\\s+").i(kk2Var.subSequence(asy0.f(j), asy0.e(j)).b, new sxo(25, ref$IntRef, ref$IntRef2));
                                            int i9 = ref$IntRef.element;
                                            if (i9 == -1 || (i = ref$IntRef2.element) == -1) {
                                                i3 = hza1.c(jon.j(m2), odf0Var);
                                            } else {
                                                int i10 = (int) (j >> 32);
                                                odf0Var.invoke(new q6u(new zkn[]{new d4r0(i10 + i9, i10 + i), new fnc(i8.substring(i9, i8.length() - (asy0.d(j) - ref$IntRef2.element)), 1)}));
                                                i3 = 1;
                                            }
                                        }
                                    }
                                    float b3 = (hm40Var.b(f2) + hm40Var.f(f2)) / 2.0f;
                                    int i11 = (int) (mo44screenToLocalMKHz9U >> 32);
                                    int i12 = (int) (mo44screenToLocalMKHz9U2 >> 32);
                                    j = hm40Var.h(new zii0(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), b3 - 0.1f, Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), b3 + 0.1f), 0, zoy0.a);
                                    if (asy0.c(j)) {
                                    }
                                }
                            }
                            j = asy0.b;
                            if (asy0.c(j)) {
                            }
                        }
                    }
                }
            }
            if (consumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new xm2(consumer, i3, i2));
            } else {
                consumer.accept(i3);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String action, Bundle data) {
        boolean z = this.isActive;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture gesture, CancellationSignal cancellationSignal) {
        kk2 kk2Var;
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        RectF deletionArea;
        int granularity3;
        RectF selectionArea;
        int granularity4;
        dry0 dry0Var;
        cry0 cry0Var;
        if (Build.VERSION.SDK_INT >= 34) {
            oay oayVar = this.legacyTextFieldState;
            j jVar = this.textFieldSelectionManager;
            if (oayVar != null && (kk2Var = oayVar.j) != null) {
                ery0 d = oayVar.d();
                if (kk2Var.equals((d == null || (dry0Var = d.a) == null || (cry0Var = dry0Var.a) == null) ? null : cry0Var.a)) {
                    int i = 1;
                    if (jon.r(gesture)) {
                        SelectGesture n = jon.n(gesture);
                        if (jVar != null) {
                            selectionArea = n.getSelectionArea();
                            zii0 h = fia1.h(selectionArea);
                            granularity4 = n.getGranularity();
                            long g = lza1.g(oayVar, h, granularity4 != 1 ? 0 : 1);
                            oay oayVar2 = jVar.d;
                            if (oayVar2 != null) {
                                oayVar2.A.setValue(new asy0(g));
                            }
                            oay oayVar3 = jVar.d;
                            if (oayVar3 != null) {
                                oayVar3.B.setValue(new asy0(asy0.b));
                            }
                            if (!asy0.c(g)) {
                                jVar.u(false);
                                jVar.r(HandleState.None);
                            }
                        }
                    } else if (jon.D(gesture)) {
                        DeleteGesture l = p6u.l(gesture);
                        if (jVar != null) {
                            deletionArea = l.getDeletionArea();
                            zii0 h2 = fia1.h(deletionArea);
                            granularity3 = l.getGranularity();
                            long g2 = lza1.g(oayVar, h2, granularity3 != 1 ? 0 : 1);
                            oay oayVar4 = jVar.d;
                            if (oayVar4 != null) {
                                oayVar4.B.setValue(new asy0(g2));
                            }
                            oay oayVar5 = jVar.d;
                            if (oayVar5 != null) {
                                oayVar5.A.setValue(new asy0(asy0.b));
                            }
                            if (!asy0.c(g2)) {
                                jVar.u(false);
                                jVar.r(HandleState.None);
                            }
                        }
                    } else if (p6u.y(gesture)) {
                        SelectRangeGesture n2 = p6u.n(gesture);
                        if (jVar != null) {
                            selectionStartArea = n2.getSelectionStartArea();
                            zii0 h3 = fia1.h(selectionStartArea);
                            selectionEndArea = n2.getSelectionEndArea();
                            zii0 h4 = fia1.h(selectionEndArea);
                            granularity2 = n2.getGranularity();
                            long b = lza1.b(oayVar, h3, h4, granularity2 != 1 ? 0 : 1);
                            oay oayVar6 = jVar.d;
                            if (oayVar6 != null) {
                                oayVar6.A.setValue(new asy0(b));
                            }
                            oay oayVar7 = jVar.d;
                            if (oayVar7 != null) {
                                oayVar7.B.setValue(new asy0(asy0.b));
                            }
                            if (!asy0.c(b)) {
                                jVar.u(false);
                                jVar.r(HandleState.None);
                            }
                        }
                    } else if (p6u.B(gesture)) {
                        DeleteRangeGesture m = p6u.m(gesture);
                        if (jVar != null) {
                            deletionStartArea = m.getDeletionStartArea();
                            zii0 h5 = fia1.h(deletionStartArea);
                            deletionEndArea = m.getDeletionEndArea();
                            zii0 h6 = fia1.h(deletionEndArea);
                            granularity = m.getGranularity();
                            long b2 = lza1.b(oayVar, h5, h6, granularity != 1 ? 0 : 1);
                            oay oayVar8 = jVar.d;
                            if (oayVar8 != null) {
                                oayVar8.B.setValue(new asy0(b2));
                            }
                            oay oayVar9 = jVar.d;
                            if (oayVar9 != null) {
                                oayVar9.A.setValue(new asy0(asy0.b));
                            }
                            if (!asy0.c(b2)) {
                                jVar.u(false);
                                jVar.r(HandleState.None);
                            }
                        }
                    }
                    if (cancellationSignal != null) {
                        cancellationSignal.setOnCancelListener(new ygd(i, jVar));
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        boolean z;
        boolean z2;
        boolean z3;
        c cVar;
        boolean z4 = this.isActive;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (cursorUpdateMode & 1) != 0;
        boolean z7 = (cursorUpdateMode & 2) != 0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            z2 = (cursorUpdateMode & 16) != 0;
            z3 = (cursorUpdateMode & 8) != 0;
            boolean z8 = (cursorUpdateMode & 4) != 0;
            if (i >= 34 && (cursorUpdateMode & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
                cVar = ((pay) ((reu) this.eventCallback).b).m;
                synchronized (cVar.c) {
                    try {
                        cVar.f = z2;
                        cVar.g = z3;
                        cVar.h = z5;
                        cVar.i = z;
                        if (z6) {
                            cVar.e = true;
                            if (cVar.j != null) {
                                cVar.a();
                            }
                        }
                        cVar.d = z7;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            }
            if (i >= 34) {
                z = true;
                z5 = true;
            } else {
                z = z5;
                z5 = true;
            }
            z2 = z5;
        } else {
            z = false;
            z2 = true;
        }
        z3 = z2;
        cVar = ((pay) ((reu) this.eventCallback).b).m;
        synchronized (cVar.c) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent event) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((pay) ((reu) this.eventCallback).b).k.getValue()).sendKeyEvent(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int start, int end) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new m2r0(start, end));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence text, int newCursorPosition) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new n2r0(String.valueOf(text), newCursorPosition));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int start, int end) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new d4r0(start, end));
        return true;
    }

    public final void setTextFieldValue$foundation(hoy0 hoy0Var) {
        this.textFieldValue = hoy0Var;
    }

    public final void updateInputState(hoy0 state, g0w inputMethodManager) {
        if (this.isActive) {
            setTextFieldValue$foundation(state);
            if (this.extractedTextMonitorMode) {
                h0w h0wVar = (h0w) inputMethodManager;
                h0wVar.l().updateExtractedText((View) h0wVar.b, this.currentExtractedTextRequestToken, cia1.e(state));
            }
            asy0 asy0Var = state.c;
            long j = state.b;
            int f = asy0Var != null ? asy0.f(asy0Var.a) : -1;
            asy0 asy0Var2 = state.c;
            int e = asy0Var2 != null ? asy0.e(asy0Var2.a) : -1;
            h0w h0wVar2 = (h0w) inputMethodManager;
            h0wVar2.l().updateSelection((View) h0wVar2.b, asy0.f(j), asy0.e(j), f, e);
        }
    }

    public /* synthetic */ RecordingInputConnection(hoy0 hoy0Var, ezv ezvVar, boolean z, oay oayVar, j jVar, xp31 xp31Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hoy0Var, ezvVar, z, (i & 8) != 0 ? null : oayVar, (i & 16) != 0 ? null : jVar, (i & 32) != 0 ? null : xp31Var);
    }
}
