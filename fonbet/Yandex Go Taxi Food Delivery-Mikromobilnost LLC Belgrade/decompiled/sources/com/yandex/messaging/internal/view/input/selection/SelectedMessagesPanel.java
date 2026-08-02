package com.yandex.messaging.internal.view.input.selection;

import android.animation.Animator;
import android.app.Activity;
import android.os.Handler;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.b;
import androidx.transition.TransitionManager;
import com.yandex.alicekit.core.views.BackHandlingLinearLayout;
import com.yandex.bricks.Brick;
import com.yandex.messaging.input.bricks.writing.d;
import com.yandex.messaging.input.bricks.writing.e;
import com.yandex.messaging.input.quote.QuotePresenter$QuoteType;
import com.yandex.messaging.input.quote.a;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuReporter$Item;
import com.yandex.messaging.internal.view.timeline.g0;
import defpackage.b00;
import defpackage.c0x;
import defpackage.cz2;
import defpackage.e1w;
import defpackage.e9h0;
import defpackage.epo0;
import defpackage.fb90;
import defpackage.fhq0;
import defpackage.ghq0;
import defpackage.gvg0;
import defpackage.hdu;
import defpackage.j3b;
import defpackage.jb90;
import defpackage.lz;
import defpackage.mdb;
import defpackage.nfq0;
import defpackage.nrh;
import defpackage.ny61;
import defpackage.ofq0;
import defpackage.olh0;
import defpackage.qhs0;
import defpackage.ru10;
import defpackage.su10;
import defpackage.sv10;
import defpackage.tje;
import defpackage.tv10;
import defpackage.uv10;
import defpackage.vpa;
import defpackage.xe4;
import defpackage.xs10;
import defpackage.xv10;
import defpackage.z83;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes15.dex */
public class SelectedMessagesPanel extends Brick implements tv10, xe4, Animator.AnimatorListener {
    private static final int MAX_FORWARD_COUNT = 100;
    private final ofq0 mActionsObservable;
    private final mdb mChatViewConfig;
    private final View mCopyButton;
    private final TextView mCounterText;
    private final View mDeleteButton;
    private final nrh mDeleteCommand;
    private final View mForwardButton;
    private fb90 mForwardListener;
    private final xs10 mMessageDeleteConfirmation;
    private final uv10 mMessageSelectionModel;
    private final int mPanelHeight;
    private final View mPinButton;
    private nfq0 mProcessor;
    private final View mReplyButton;
    private jb90 mReplyListener;
    private final su10 mReporter;
    private final View mShareButton;
    private boolean mSuppressAnimation;
    private final g0 mTimelineActions;
    private final BackHandlingLinearLayout mView;

    public SelectedMessagesPanel(Activity activity, g0 g0Var, uv10 uv10Var, xs10 xs10Var, nrh nrhVar, ofq0 ofq0Var, su10 su10Var, mdb mdbVar) {
        this.mTimelineActions = g0Var;
        this.mMessageSelectionModel = uv10Var;
        this.mMessageDeleteConfirmation = xs10Var;
        this.mDeleteCommand = nrhVar;
        this.mActionsObservable = ofq0Var;
        this.mReporter = su10Var;
        this.mChatViewConfig = mdbVar;
        this.mPanelHeight = activity.getResources().getDimensionPixelSize(gvg0.chat_input_height);
        BackHandlingLinearLayout backHandlingLinearLayout = (BackHandlingLinearLayout) inflate(activity, olh0.msg_b_selected_messages_panel);
        this.mView = backHandlingLinearLayout;
        TextView textView = (TextView) backHandlingLinearLayout.findViewById(e9h0.text_counter);
        this.mCounterText = textView;
        WeakHashMap weakHashMap = b.a;
        textView.setAccessibilityLiveRegion(1);
        backHandlingLinearLayout.findViewById(e9h0.button_close).setOnClickListener(new ghq0(this, 4));
        this.mDeleteButton = backHandlingLinearLayout.findViewById(e9h0.button_delete);
        this.mForwardButton = backHandlingLinearLayout.findViewById(e9h0.button_forward);
        this.mReplyButton = backHandlingLinearLayout.findViewById(e9h0.button_reply);
        this.mShareButton = backHandlingLinearLayout.findViewById(e9h0.button_share);
        this.mCopyButton = backHandlingLinearLayout.findViewById(e9h0.button_copy);
        this.mPinButton = backHandlingLinearLayout.findViewById(e9h0.button_pin);
        backHandlingLinearLayout.setOnBackClickListener(this);
        backHandlingLinearLayout.setOnTouchListener(new cz2(11));
        new hdu(backHandlingLinearLayout);
        backHandlingLinearLayout.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        onCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$1(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCanBeDeleted$3(View view) {
        onDelete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCanBeForwarded$2(View view) {
        onForward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCanBePinned$7(ServerMessageRef serverMessageRef, View view) {
        onPin(serverMessageRef);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCanBeReplied$4(ServerMessageRef serverMessageRef, View view) {
        onReply(serverMessageRef);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCanBeSharedAndCopied$5(View view) {
        onShare();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCanBeSharedAndCopied$6(View view) {
        onCopy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDelete$8(ServerMessageRef[] serverMessageRefArr) {
        nrh nrhVar = this.mDeleteCommand;
        Objects.requireNonNull(nrhVar);
        ((c0x) nrhVar).a(serverMessageRefArr);
        this.mMessageSelectionModel.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDelete$9() {
    }

    private void onCancel() {
        this.mMessageSelectionModel.e();
        this.mReporter.b(MessageMenuReporter$Item.CANCEL, this.mMessageSelectionModel.a().size());
    }

    private void onCopy() {
        HashSet a = this.mMessageSelectionModel.a();
        if (a.isEmpty()) {
            return;
        }
        this.mTimelineActions.b(a);
        this.mMessageSelectionModel.e();
        this.mReporter.b(MessageMenuReporter$Item.COPY, a.size());
    }

    private void onDelete() {
        ServerMessageRef serverMessageRef;
        nfq0 nfq0Var = this.mProcessor;
        Objects.requireNonNull(nfq0Var);
        LongSparseArray longSparseArray = nfq0Var.b;
        int size = longSparseArray.size();
        ServerMessageRef[] serverMessageRefArr = new ServerMessageRef[size];
        for (int i = 0; i < size; i++) {
            qhs0 qhs0Var = (qhs0) longSparseArray.valueAt(i);
            ru10 ru10Var = qhs0Var != null ? qhs0Var.x : null;
            if (ru10Var == null || (serverMessageRef = ru10Var.d) == null) {
                ny61.k();
                return;
            }
            serverMessageRefArr[i] = serverMessageRef;
        }
        this.mMessageDeleteConfirmation.a(size, new epo0(13, this, serverMessageRefArr), new vpa(27));
        this.mReporter.b(MessageMenuReporter$Item.DELETE, size);
    }

    private void onForward() {
        nfq0 nfq0Var = this.mProcessor;
        Objects.requireNonNull(nfq0Var);
        LongSparseArray longSparseArray = nfq0Var.b;
        int size = longSparseArray.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            qhs0 qhs0Var = (qhs0) longSparseArray.valueAt(i);
            ru10 ru10Var = qhs0Var != null ? qhs0Var.x : null;
            if ((ru10Var != null ? ru10Var.f : null) == null) {
                ny61.k();
                return;
            } else {
                if (!arrayList.contains(ru10Var.f)) {
                    arrayList.add(ru10Var.f);
                }
            }
        }
        ServerMessageRef[] serverMessageRefArr = (ServerMessageRef[]) arrayList.toArray(new ServerMessageRef[0]);
        fb90 fb90Var = this.mForwardListener;
        Objects.requireNonNull(fb90Var);
        fb90Var.m(serverMessageRefArr);
        this.mMessageSelectionModel.e();
        this.mReporter.b(MessageMenuReporter$Item.FORWARD, serverMessageRefArr.length);
    }

    private void onPin(ServerMessageRef serverMessageRef) {
        g0 g0Var = this.mTimelineActions;
        g0Var.getClass();
        tje.e();
        b00 b00Var = g0Var.a;
        ((Handler) b00Var.a.get()).post(new lz(3, b00Var, g0Var.b, serverMessageRef));
        this.mReporter.b(MessageMenuReporter$Item.PIN, 1);
    }

    private void onReply(ServerMessageRef serverMessageRef) {
        jb90 jb90Var = this.mReplyListener;
        Objects.requireNonNull(jb90Var);
        d dVar = ((e1w) jb90Var).a;
        j3b j3bVar = dVar.j0;
        if (j3bVar != null) {
            e eVar = dVar.w;
            eVar.b(true);
            eVar.d();
            ((a) dVar.E.get()).f(new xv10(j3bVar.b, Collections.singletonList(serverMessageRef), QuotePresenter$QuoteType.REPLY, null, null, 24));
        }
        this.mMessageSelectionModel.e();
        this.mReporter.b(MessageMenuReporter$Item.REPLY, 1);
    }

    private void onShare() {
        HashSet a = this.mMessageSelectionModel.a();
        if (a.isEmpty()) {
            return;
        }
        this.mTimelineActions.c(a);
        this.mMessageSelectionModel.e();
        this.mReporter.b(MessageMenuReporter$Item.SHARE, a.size());
    }

    private void setButton(View view, boolean z, View.OnClickListener onClickListener) {
        view.setVisibility(z ? 0 : 8);
        if (!z) {
            onClickListener = null;
        }
        view.setOnClickListener(onClickListener);
    }

    @Override // com.yandex.bricks.Brick
    public View getView() {
        return this.mView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.mMessageSelectionModel.b()) {
            return;
        }
        this.mView.setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // defpackage.xe4
    public boolean onBackClick() {
        this.mMessageSelectionModel.e();
        return true;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public void onBrickAttach() {
        super.onBrickAttach();
        z83.f(this.mProcessor, null);
        boolean b = this.mMessageSelectionModel.b();
        BackHandlingLinearLayout backHandlingLinearLayout = this.mView;
        if (b) {
            backHandlingLinearLayout.setTranslationY(0.0f);
            this.mView.setVisibility(0);
            this.mSuppressAnimation = true;
            ofq0 ofq0Var = this.mActionsObservable;
            ofq0Var.getClass();
            this.mProcessor = new nfq0(ofq0Var, this);
            ArrayList arrayList = this.mMessageSelectionModel.b.a;
            for (int i = 0; i < arrayList.size(); i++) {
                sv10 sv10Var = (sv10) arrayList.get(i);
                this.mProcessor.a(sv10Var.a, sv10Var.d);
            }
            onSelectionChanged();
        } else {
            backHandlingLinearLayout.setTranslationY(this.mPanelHeight);
            this.mView.setVisibility(8);
        }
        this.mMessageSelectionModel.c.b(this);
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public void onBrickDetach() {
        super.onBrickDetach();
        nfq0 nfq0Var = this.mProcessor;
        if (nfq0Var != null) {
            nfq0Var.close();
            this.mProcessor = null;
        }
        this.mView.animate().cancel();
        this.mMessageSelectionModel.c.d(this);
    }

    public void onCanBeDeleted(boolean z) {
        setButton(this.mDeleteButton, this.mDeleteCommand != null && z, new ghq0(this, 2));
    }

    public void onCanBeForwarded(boolean z) {
        setButton(this.mForwardButton, z && this.mForwardListener != null && this.mChatViewConfig.c, new ghq0(this, 3));
    }

    public void onCanBePinned(ServerMessageRef serverMessageRef) {
        this.mPinButton.setVisibility(serverMessageRef != null ? 0 : 8);
        this.mPinButton.setOnClickListener(serverMessageRef != null ? new fhq0(this, serverMessageRef, 1) : null);
    }

    public void onCanBeReplied(ServerMessageRef serverMessageRef) {
        boolean z = (this.mReplyListener == null || serverMessageRef == null) ? false : true;
        this.mReplyButton.setVisibility(z ? 0 : 8);
        this.mReplyButton.setOnClickListener(z ? new fhq0(this, serverMessageRef, 0) : null);
    }

    public void onCanBeSharedAndCopied(boolean z) {
        this.mShareButton.setVisibility(z ? 0 : 8);
        this.mShareButton.setOnClickListener(z ? new ghq0(this, 0) : null);
        this.mCopyButton.setVisibility(z ? 0 : 8);
        this.mCopyButton.setOnClickListener(z ? new ghq0(this, 1) : null);
    }

    @Override // defpackage.tv10
    public void onEnterSelectionMode() {
        this.mSuppressAnimation = true;
        this.mView.setVisibility(0);
        this.mView.animate().translationY(0.0f);
        su10 su10Var = this.mReporter;
        su10Var.a.c("multiselect_menu_opened", "chat_id", this.mMessageSelectionModel.a.uniqueRequestId());
    }

    @Override // defpackage.tv10
    public void onExitSelectionMode() {
        nfq0 nfq0Var = this.mProcessor;
        if (nfq0Var != null) {
            nfq0Var.close();
            this.mProcessor = null;
        }
        this.mView.animate().translationY(this.mPanelHeight).setListener(this);
    }

    @Override // defpackage.tv10
    public void onMessageSelected(long j, LocalMessageRef localMessageRef) {
        if (this.mProcessor == null) {
            ofq0 ofq0Var = this.mActionsObservable;
            ofq0Var.getClass();
            this.mProcessor = new nfq0(ofq0Var, this);
        }
        this.mProcessor.a(j, localMessageRef);
    }

    @Override // defpackage.tv10
    public void onMessageUnselected(long j, LocalMessageRef localMessageRef) {
        nfq0 nfq0Var = this.mProcessor;
        if (nfq0Var != null) {
            tje.e();
            z83.d(nfq0Var.a, null);
            LongSparseArray longSparseArray = nfq0Var.b;
            qhs0 qhs0Var = (qhs0) longSparseArray.get(j);
            if (qhs0Var != null) {
                qhs0Var.close();
            }
            longSparseArray.remove(j);
            nfq0Var.c();
            if (this.mProcessor.b.size() == 0) {
                this.mProcessor.close();
                this.mProcessor = null;
            }
        }
    }

    @Override // defpackage.tv10
    public void onSelectionChanged() {
        if (!this.mSuppressAnimation) {
            TransitionManager.a(null, this.mView);
        }
        if (this.mMessageSelectionModel.b()) {
            int size = this.mMessageSelectionModel.b.a.size();
            this.mCounterText.setText(size > 99 ? "99+" : String.valueOf(size));
            this.mSuppressAnimation = false;
        }
    }

    public void setForwardListener(fb90 fb90Var) {
        this.mForwardListener = fb90Var;
        if (this.mMessageSelectionModel.b()) {
            onSelectionChanged();
        }
    }

    public void setReplyListener(jb90 jb90Var) {
        this.mReplyListener = jb90Var;
        if (this.mMessageSelectionModel.b()) {
            onSelectionChanged();
        }
    }
}
