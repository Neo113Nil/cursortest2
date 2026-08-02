package androidx.compose.foundation.text.input.internal;

import android.R;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.bgr0;
import defpackage.bmt0;
import defpackage.cwa1;
import defpackage.eyr;
import defpackage.hmy0;
import defpackage.hzr;
import defpackage.ik2;
import defpackage.izr;
import defpackage.jl40;
import defpackage.k5z;
import defpackage.lzr;
import defpackage.oyr;
import defpackage.qys;
import defpackage.rly0;
import defpackage.rzo;
import defpackage.soy0;
import defpackage.td5;
import defpackage.tls;
import defpackage.wor0;
import defpackage.wz40;
import defpackage.ypy0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000³\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001p\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010'J\u0019\u0010)\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b,\u0010-J+\u00104\u001a\u00020\f2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J!\u00109\u001a\u00020\b2\u0006\u0010/\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b9\u0010:J!\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u0011H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u0011H\u0016¢\u0006\u0004\bD\u0010-J\u0017\u0010F\u001a\u00020\b2\u0006\u0010E\u001a\u00020\u0011H\u0016¢\u0006\u0004\bF\u0010-J\u0019\u0010H\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bH\u0010IJ\u0019\u0010L\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bL\u0010MJ\u0011\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\u0011H\u0016¢\u0006\u0004\bR\u0010-J\u0017\u0010T\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0016¢\u0006\u0004\bT\u0010UJ#\u0010Z\u001a\u00020\b2\b\u0010W\u001a\u0004\u0018\u00010V2\b\u0010Y\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\bZ\u0010[J)\u0010_\u001a\u00020\b2\u0006\u0010]\u001a\u00020\\2\u0006\u0010%\u001a\u00020\u00112\b\u0010^\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\bH\u0002¢\u0006\u0004\ba\u0010\nJ\u000f\u0010b\u001a\u00020\bH\u0002¢\u0006\u0004\bb\u0010\nJ\u0017\u0010d\u001a\u00020\f2\u0006\u0010c\u001a\u00020\u0011H\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020\f2\u0006\u0010f\u001a\u00020VH\u0002¢\u0006\u0004\bg\u0010hR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010iR\u0016\u0010j\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR&\u0010n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0m0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010s\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\bs\u0010t\u0012\u0004\bu\u0010\u000eR\u0014\u0010\u0010\u001a\u00020v8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x¨\u0006y"}, d2 = {"Landroidx/compose/foundation/text/input/internal/StatelessInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Lypy0;", "session", "Landroid/view/inputmethod/EditorInfo;", "editorInfo", "<init>", "(Lypy0;Landroid/view/inputmethod/EditorInfo;)V", "", "beginBatchEdit", "()Z", "endBatchEdit", "Lzy11;", "closeConnection", "()V", "", "text", "", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "reqModes", "getCursorCapsMode", "(I)I", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", BackendConfig.Restrictions.ENABLED, "reportFullscreenMode", "(Z)Z", "", "action", "Landroid/os/Bundle;", Constants.KEY_DATA, "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "beginBatchEditInternal", "endBatchEditInternal", AuthSdkActivity.RESPONSE_TYPE_CODE, "sendSynthesizedKeyEvent", "(I)V", Constants.KEY_MESSAGE, "logDebug", "(Ljava/lang/String;)V", "Lypy0;", "batchDepth", CA20Status.STATUS_USER_I, "Lwz40;", "Lkotlin/Function1;", "editCommands", "Lwz40;", "androidx/compose/foundation/text/input/internal/StatelessInputConnection$terminalInputConnection$1", "terminalInputConnection", "Landroidx/compose/foundation/text/input/internal/StatelessInputConnection$terminalInputConnection$1;", "commitContentDelegateInputConnection", "Landroid/view/inputmethod/InputConnection;", "getCommitContentDelegateInputConnection$annotations", "Lhmy0;", "getText", "()Lhmy0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StatelessInputConnection implements InputConnection {
    public static final int $stable = 8;
    private int batchDepth;
    private final InputConnection commitContentDelegateInputConnection;
    private final wz40 editCommands = new wz40(new tls[16]);
    private final ypy0 session;
    private final StatelessInputConnection$terminalInputConnection$1 terminalInputConnection;

    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.inputmethod.InputConnection, androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1] */
    public StatelessInputConnection(ypy0 ypy0Var, EditorInfo editorInfo) {
        ?? r2 = new InputConnectionWrapper(this) { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1
            {
                super(this, false);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitContent(InputContentInfo inputContentInfo, int flags, Bundle opts) {
                return false;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean performPrivateCommand(String action, Bundle data) {
                return true;
            }
        };
        this.terminalInputConnection = r2;
        this.commitContentDelegateInputConnection = androidx.core.view.inputmethod.a.a(r2, editorInfo, new wor0(this));
    }

    public static final /* synthetic */ ypy0 access$getSession$p(StatelessInputConnection statelessInputConnection) {
        statelessInputConnection.getClass();
        return null;
    }

    private final boolean beginBatchEditInternal() {
        throw null;
    }

    private final boolean endBatchEditInternal() {
        throw null;
    }

    private static /* synthetic */ void getCommitContentDelegateInputConnection$annotations() {
    }

    private final hmy0 getText() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logDebug(String message) {
    }

    private final void sendSynthesizedKeyEvent(int code) {
        sendKeyEvent(new KeyEvent(0, code));
        sendKeyEvent(new KeyEvent(1, code));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        logDebug("beginBatchEdit()");
        return beginBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int states) {
        logDebug(oyr.e(')', states, "clearMetaKeyStates("));
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        logDebug("closeConnection()");
        this.editCommands.g();
        this.batchDepth = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo text) {
        StringBuilder sb = new StringBuilder("commitCompletion(");
        sb.append((Object) (text != null ? text.getText() : null));
        sb.append(')');
        logDebug(sb.toString());
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int flags, Bundle opts) {
        logDebug("commitContent(" + inputContentInfo + Extension.FIX_SPACE + flags + Extension.FIX_SPACE + opts + ')');
        return this.commitContentDelegateInputConnection.commitContent(inputContentInfo, flags, opts);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence text, int newCursorPosition) {
        logDebug("commitText(\"" + ((Object) text) + "\", " + newCursorPosition + ')');
        if (text == null) {
            return true;
        }
        text.toString();
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        logDebug("deleteSurroundingText(" + beforeLength + Extension.FIX_SPACE + afterLength + ')');
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        logDebug("deleteSurroundingTextInCodePoints(" + beforeLength + Extension.FIX_SPACE + afterLength + ')');
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        logDebug("endBatchEdit()");
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        logDebug("finishComposingText()");
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        logDebug(oyr.e(')', reqModes, "getCursorCapsMode("));
        getText();
        getText();
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest request, int flags) {
        logDebug("getExtractedText(" + request + Extension.FIX_SPACE + flags + ')');
        getText();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = null;
        extractedText.startOffset = 0;
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        logDebug("getHandler()");
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int flags) {
        getText();
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        getText();
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        getText();
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id) {
        logDebug(oyr.e(')', id, "performContextMenuAction("));
        switch (id) {
            case R.id.selectAll:
                getText();
                throw null;
            case R.id.cut:
                sendSynthesizedKeyEvent(277);
                return false;
            case R.id.copy:
                sendSynthesizedKeyEvent(278);
                return false;
            case R.id.paste:
                sendSynthesizedKeyEvent(279);
                return false;
            default:
                return false;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int editorAction) {
        logDebug(oyr.e(')', editorAction, "performEditorAction("));
        if (editorAction != 0) {
            switch (editorAction) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    logDebug(oyr.i(editorAction, "IME sent an unrecognized editor action: "));
                    break;
            }
        }
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture gesture, Executor executor, IntConsumer consumer) {
        logDebug("performHandwritingGesture(" + gesture + Extension.FIX_SPACE + executor + Extension.FIX_SPACE + consumer + ')');
        if (Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String action, Bundle data) {
        logDebug("performPrivateCommand(" + action + Extension.FIX_SPACE + data + ')');
        return this.commitContentDelegateInputConnection.performPrivateCommand(action, data);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture gesture, CancellationSignal cancellationSignal) {
        logDebug("previewHandwritingGesture(" + gesture + Extension.FIX_SPACE + cancellationSignal + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        logDebug("reportFullscreenMode(" + enabled + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        logDebug(oyr.e(')', cursorUpdateMode, "requestCursorUpdates("));
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent event) {
        logDebug("sendKeyEvent(" + event + ')');
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int start, int end) {
        logDebug("setComposingRegion(" + start + Extension.FIX_SPACE + end + ')');
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12, types: [lyy] */
    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence text, int newCursorPosition) {
        bmt0 bmt0Var;
        bmt0 bmt0Var2;
        logDebug("setComposingText(\"" + ((Object) text) + "\", " + newCursorPosition + ')');
        if (text == null) {
            return true;
        }
        text.toString();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            throw null;
        }
        ArrayList arrayList = null;
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            if (obj instanceof BackgroundColorSpan) {
                bmt0Var = new bmt0(0L, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, rzo.d(((BackgroundColorSpan) obj).getBackgroundColor()), (rly0) null, (bgr0) null, 63487);
            } else if (obj instanceof ForegroundColorSpan) {
                bmt0Var = new bmt0(rzo.d(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65534);
            } else if (obj instanceof StrikethroughSpan) {
                bmt0Var = new bmt0(0L, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, rly0.d, (bgr0) null, 61439);
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    bmt0Var = new bmt0(0L, 0L, lzr.G, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65531);
                } else if (style != 2) {
                    if (style == 3) {
                        bmt0Var = new bmt0(0L, 0L, lzr.G, new hzr(1), (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65523);
                    }
                    bmt0Var = null;
                } else {
                    bmt0Var2 = new bmt0(0L, 0L, (lzr) null, new hzr(1), (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65527);
                    bmt0Var = bmt0Var2;
                }
            } else if (obj instanceof TypefaceSpan) {
                TypefaceSpan typefaceSpan = (TypefaceSpan) obj;
                String family = typefaceSpan.getFamily();
                qys qysVar = eyr.x;
                if (!jl40.l(family, qysVar.y)) {
                    qysVar = eyr.w;
                    if (!jl40.l(family, qysVar.y)) {
                        qysVar = eyr.b;
                        if (!jl40.l(family, qysVar.y)) {
                            qysVar = eyr.c;
                            if (!jl40.l(family, qysVar.y)) {
                                String family2 = typefaceSpan.getFamily();
                                if (family2 != null && family2.length() != 0) {
                                    Typeface create = Typeface.create(family2, 0);
                                    Typeface typeface = Typeface.DEFAULT;
                                    if (jl40.l(create, typeface) || jl40.l(create, Typeface.create(typeface, 0))) {
                                        create = null;
                                    }
                                    if (create != null) {
                                        qysVar = cwa1.a(create);
                                    }
                                }
                                qysVar = null;
                            }
                        }
                    }
                }
                bmt0Var2 = new bmt0(0L, 0L, (lzr) null, (hzr) null, (izr) null, qysVar, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65503);
                bmt0Var = bmt0Var2;
            } else {
                if (obj instanceof UnderlineSpan) {
                    bmt0Var = new bmt0(0L, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, rly0.c, (bgr0) null, 61439);
                }
                bmt0Var = null;
            }
            if (bmt0Var != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(new ik2(bmt0Var, spanned.getSpanStart(obj), spanned.getSpanEnd(obj)));
            }
        }
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int start, int end) {
        logDebug("setSelection(" + start + Extension.FIX_SPACE + end + ')');
        throw null;
    }
}
