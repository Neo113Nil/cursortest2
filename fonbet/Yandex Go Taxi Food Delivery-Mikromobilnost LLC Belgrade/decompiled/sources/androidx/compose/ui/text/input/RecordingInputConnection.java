package androidx.compose.ui.text.input;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.asy0;
import defpackage.csh;
import defpackage.d4r0;
import defpackage.div;
import defpackage.dsh;
import defpackage.dzv;
import defpackage.f0w;
import defpackage.fmb1;
import defpackage.fnc;
import defpackage.hoy0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.l7b1;
import defpackage.m2r0;
import defpackage.n2r0;
import defpackage.sls;
import defpackage.u9r;
import defpackage.wpy0;
import defpackage.zkn;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@jxi
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b#\u0010\u001eJ\u001f\u0010$\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b$\u0010\u001eJ\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010\u0011J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0017H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0017H\u0016¢\u0006\u0004\b.\u0010-J\u0019\u0010/\u001a\u0004\u0018\u00010\u00152\u0006\u0010+\u001a\u00020\u0017H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0017H\u0016¢\u0006\u0004\b2\u00103J!\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010+\u001a\u00020\u0017H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0017H\u0016¢\u0006\u0004\b:\u00103J\u0017\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0017H\u0016¢\u0006\u0004\b<\u00103J\u0019\u0010>\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b>\u0010?J\u0019\u0010B\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CJ\u0011\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0017H\u0016¢\u0006\u0004\bH\u00103J\u0017\u0010J\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u0006H\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00172\u0006\u0010L\u001a\u00020\u0017H\u0016¢\u0006\u0004\bM\u0010NJ#\u0010S\u001a\u00020\u00062\b\u0010P\u001a\u0004\u0018\u00010O2\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bS\u0010TJ)\u0010X\u001a\u00020\u00062\u0006\u0010V\u001a\u00020U2\u0006\u0010+\u001a\u00020\u00172\b\u0010W\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bX\u0010YJ\u001e\u0010\\\u001a\u00020\u00062\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\r0ZH\u0082\b¢\u0006\u0004\b\\\u0010]J\u0017\u0010`\u001a\u00020\r2\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bb\u0010\u0011J\u000f\u0010c\u001a\u00020\u0006H\u0002¢\u0006\u0004\bc\u0010\u0011J\u0017\u0010e\u001a\u00020\r2\u0006\u0010d\u001a\u00020\u0017H\u0002¢\u0006\u0004\be\u0010fJ\u0017\u0010h\u001a\u00020\r2\u0006\u0010g\u001a\u00020OH\u0002¢\u0006\u0004\bh\u0010iR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010j\u001a\u0004\bk\u0010lR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010m\u001a\u0004\bn\u0010\u0011R\u0016\u0010o\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR*\u0010r\u001a\u00020\u00022\u0006\u0010q\u001a\u00020\u00028\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0016\u0010x\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010pR\u0016\u0010y\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010mR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020^0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010m¨\u0006~"}, d2 = {"Landroidx/compose/ui/text/input/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Lhoy0;", "initState", "Ldzv;", "eventCallback", "", "autoCorrect", "<init>", "(Lhoy0;Ldzv;Z)V", ClidProvider.STATE, "Lf0w;", "inputMethodManager", "Lzy11;", "updateInputState", "(Lhoy0;Lf0w;)V", "beginBatchEdit", "()Z", "endBatchEdit", "closeConnection", "()V", "", "text", "", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", BackendConfig.Restrictions.ENABLED, "reportFullscreenMode", "(Z)Z", "reqModes", "getCursorCapsMode", "(I)I", "", "action", "Landroid/os/Bundle;", Constants.KEY_DATA, "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "Lkotlin/Function0;", "block", "ensureActive", "(Lsls;)Z", "Lzkn;", "editCommand", "addEditCommandWithBatch", "(Lzkn;)V", "beginBatchEditInternal", "endBatchEditInternal", AuthSdkActivity.RESPONSE_TYPE_CODE, "sendSynthesizedKeyEvent", "(I)V", Constants.KEY_MESSAGE, "logDebug", "(Ljava/lang/String;)V", "Ldzv;", "getEventCallback", "()Ldzv;", "Z", "getAutoCorrect", "batchDepth", CA20Status.STATUS_USER_I, "value", "mTextFieldValue", "Lhoy0;", "getMTextFieldValue$ui", "()Lhoy0;", "setMTextFieldValue$ui", "(Lhoy0;)V", "currentExtractedTextRequestToken", "extractedTextMonitorMode", "", "editCommands", "Ljava/util/List;", "isActive", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;
    private final dzv eventCallback;
    private boolean extractedTextMonitorMode;
    private hoy0 mTextFieldValue;
    private final List<zkn> editCommands = new ArrayList();
    private boolean isActive = true;

    public RecordingInputConnection(hoy0 hoy0Var, dzv dzvVar, boolean z) {
        this.eventCallback = dzvVar;
        this.autoCorrect = z;
        this.mTextFieldValue = hoy0Var;
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
            ((f) ((wpy0) this.eventCallback).b).e.invoke(new ArrayList(this.editCommands));
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
        ArrayList arrayList = ((f) ((wpy0) this.eventCallback).b).i;
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
        hoy0 hoy0Var = this.mTextFieldValue;
        return TextUtils.getCapsMode(hoy0Var.a.b, asy0.f(hoy0Var.b), reqModes);
    }

    public final dzv getEventCallback() {
        return this.eventCallback;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest request, int flags) {
        boolean z = (flags & 1) != 0;
        this.extractedTextMonitorMode = z;
        if (z) {
            this.currentExtractedTextRequestToken = request != null ? request.token : 0;
        }
        return l7b1.b(this.mTextFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    /* renamed from: getMTextFieldValue$ui, reason: from getter */
    public final hoy0 getMTextFieldValue() {
        return this.mTextFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int flags) {
        if (asy0.c(this.mTextFieldValue.b)) {
            return null;
        }
        return fmb1.l(this.mTextFieldValue).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        return fmb1.m(this.mTextFieldValue, maxChars).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        return fmb1.n(this.mTextFieldValue, maxChars).b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id) {
        boolean z = this.isActive;
        if (z) {
            z = false;
            switch (id) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new d4r0(0, this.mTextFieldValue.a.b.length()));
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
                ((f) ((wpy0) this.eventCallback).b).f.invoke(new div(i));
            }
            i = 1;
            ((f) ((wpy0) this.eventCallback).b).f.invoke(new div(i));
        }
        return z;
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
        a aVar;
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
                aVar = ((f) ((wpy0) this.eventCallback).b).l;
                synchronized (aVar.c) {
                    try {
                        aVar.f = z2;
                        aVar.g = z3;
                        aVar.h = z5;
                        aVar.i = z;
                        if (z6) {
                            aVar.e = true;
                            if (aVar.j != null) {
                                aVar.a();
                            }
                        }
                        aVar.d = z7;
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
        aVar = ((f) ((wpy0) this.eventCallback).b).l;
        synchronized (aVar.c) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent event) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((f) ((wpy0) this.eventCallback).b).j.getValue()).sendKeyEvent(event);
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

    public final void setMTextFieldValue$ui(hoy0 hoy0Var) {
        this.mTextFieldValue = hoy0Var;
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

    public final void updateInputState(hoy0 state, f0w inputMethodManager) {
        if (this.isActive) {
            setMTextFieldValue$ui(state);
            if (this.extractedTextMonitorMode) {
                b bVar = (b) inputMethodManager;
                ((InputMethodManager) bVar.b.getValue()).updateExtractedText(bVar.a, this.currentExtractedTextRequestToken, l7b1.b(state));
            }
            asy0 asy0Var = state.c;
            long j = state.b;
            int f = asy0Var != null ? asy0.f(asy0Var.a) : -1;
            asy0 asy0Var2 = state.c;
            int e = asy0Var2 != null ? asy0.e(asy0Var2.a) : -1;
            b bVar2 = (b) inputMethodManager;
            ((InputMethodManager) bVar2.b.getValue()).updateSelection(bVar2.a, asy0.f(j), asy0.e(j), f, e);
        }
    }
}
