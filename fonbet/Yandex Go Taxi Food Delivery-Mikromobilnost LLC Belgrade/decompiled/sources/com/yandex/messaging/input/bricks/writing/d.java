package com.yandex.messaging.input.bricks.writing;

import android.R;
import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.bricks.BrickSlotView;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.SendAction;
import com.yandex.messaging.ThreadChatRequest;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import com.yandex.messaging.files.ImageFileInfo;
import com.yandex.messaging.input.ChatInputEditText;
import com.yandex.messaging.input.CodeBlockPaddingTextWatcher;
import com.yandex.messaging.input.MessageSelectionActionModeCallback;
import com.yandex.messaging.input.bricks.writing.d;
import com.yandex.messaging.input.f;
import com.yandex.messaging.input.g;
import com.yandex.messaging.input.quote.QuotePresenter$QuoteType;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ChatBackendConfig;
import com.yandex.messaging.internal.v;
import com.yandex.messaging.internal.view.attach.AttachInfo;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import com.yandex.messaging.internal.view.input.mesix.Mesix;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;
import com.yandex.messaging.ui.sharing.SharingData$SharingFileData;
import com.yandex.messaging.ui.sharing.SharingData$SharingImageData;
import com.yandex.messaging.ui.timeline.ChatOpenTarget;
import com.yandex.messaging.views.KeyboardAwareEmojiEditText;
import com.yandex.messaging.views.MaxLengthInputFilter;
import defpackage.as10;
import defpackage.b00;
import defpackage.bgc;
import defpackage.bk3;
import defpackage.bs10;
import defpackage.ctq;
import defpackage.d1w;
import defpackage.d5b1;
import defpackage.dct;
import defpackage.dmt0;
import defpackage.e1w;
import defpackage.e3c;
import defpackage.e3n;
import defpackage.evu0;
import defpackage.f3c;
import defpackage.ftn;
import defpackage.h3y;
import defpackage.hi91;
import defpackage.hqr0;
import defpackage.j1w;
import defpackage.j3b;
import defpackage.j420;
import defpackage.j73;
import defpackage.jc3;
import defpackage.jl40;
import defpackage.jn3;
import defpackage.jqr;
import defpackage.juf0;
import defpackage.k0b;
import defpackage.kjs0;
import defpackage.kp50;
import defpackage.lqo;
import defpackage.m2a1;
import defpackage.m2v;
import defpackage.mdb;
import defpackage.ms11;
import defpackage.mvg;
import defpackage.nka1;
import defpackage.noy0;
import defpackage.nst;
import defpackage.ny61;
import defpackage.o430;
import defpackage.oo90;
import defpackage.ooc;
import defpackage.oyh0;
import defpackage.p4t;
import defpackage.pj91;
import defpackage.pk3;
import defpackage.pzt0;
import defpackage.q6b;
import defpackage.qna1;
import defpackage.qoi0;
import defpackage.qtb1;
import defpackage.qz;
import defpackage.reu;
import defpackage.rk91;
import defpackage.sfl0;
import defpackage.sls;
import defpackage.ss11;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tqq0;
import defpackage.tse;
import defpackage.tz10;
import defpackage.u7s;
import defpackage.u9v;
import defpackage.uqq0;
import defpackage.vng;
import defpackage.w05;
import defpackage.w511;
import defpackage.wls;
import defpackage.wwg0;
import defpackage.wy31;
import defpackage.x22;
import defpackage.x4b0;
import defpackage.x4k0;
import defpackage.xv10;
import defpackage.z83;
import defpackage.zj3;
import defpackage.zm90;
import defpackage.zy11;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

/* loaded from: classes15.dex */
public final class d extends ss11 {
    public final com.yandex.messaging.internal.backendconfig.b A;
    public final g B;
    public final ChatRequest C;
    public final sfl0 D;
    public final h3y E;
    public final com.yandex.alicekit.core.permissions.b F;
    public final com.yandex.messaging.input.util.c G;
    public final h3y H;
    public final mdb I;
    public final dct J;
    public final x22 K;
    public final com.yandex.messaging.input.b L;
    public final com.yandex.messaging.internal.view.chat.input.a M;
    public final wy31 N;
    public final h3y O;
    public final Mesix P;
    public final lqo Q;
    public final com.yandex.messaging.navigation.c R;
    public final com.yandex.messaging.attachments.e S;
    public final m2v T;
    public final f3c U;
    public final MessageSelectionActionModeCallback V;
    public final x4k0 W;
    public final com.yandex.messaging.formatting.a Z;
    public final j1w a;
    public final noy0 a0;
    public final q6b b;
    public final dmt0 b0;
    public final Activity c;
    public final j420 c0;
    public final f d0;
    public final com.yandex.messaging.internal.view.input.c e0;
    public final h3y f0;
    public final h3y g0;
    public final v h0;
    public boolean i0 = true;
    public j3b j0;
    public x4b0 k0;
    public ChatBackendConfig l0;
    public long m0;
    public boolean n0;
    public final e w;
    public final ChatInputHeightState x;
    public final h3y y;
    public final p4t z;

    /* JADX WARN: Multi-variable type inference failed */
    public d(j1w j1wVar, q6b q6bVar, Activity activity, e eVar, ChatInputHeightState chatInputHeightState, h3y h3yVar, p4t p4tVar, com.yandex.messaging.internal.backendconfig.b bVar, g gVar, ChatRequest chatRequest, sfl0 sfl0Var, h3y h3yVar2, com.yandex.alicekit.core.permissions.b bVar2, com.yandex.messaging.input.util.c cVar, h3y h3yVar3, mdb mdbVar, dct dctVar, x22 x22Var, com.yandex.messaging.input.b bVar3, SelectedMessagesPanel selectedMessagesPanel, com.yandex.messaging.internal.view.chat.input.a aVar, wy31 wy31Var, h3y h3yVar4, Mesix mesix, lqo lqoVar, com.yandex.messaging.navigation.c cVar2, com.yandex.messaging.attachments.e eVar2, m2v m2vVar, e3c e3cVar, f3c f3cVar, MessageSelectionActionModeCallback messageSelectionActionModeCallback, x4k0 x4k0Var, com.yandex.messaging.formatting.a aVar2, noy0 noy0Var, dmt0 dmt0Var, j420 j420Var, f fVar, com.yandex.messaging.internal.view.input.c cVar3, h3y h3yVar5, h3y h3yVar6, v vVar, u7s u7sVar) {
        this.a = j1wVar;
        this.b = q6bVar;
        this.c = activity;
        this.w = eVar;
        this.x = chatInputHeightState;
        this.y = h3yVar;
        this.z = p4tVar;
        this.A = bVar;
        this.B = gVar;
        this.C = chatRequest;
        this.D = sfl0Var;
        this.E = h3yVar2;
        this.F = bVar2;
        this.G = cVar;
        this.H = h3yVar3;
        this.I = mdbVar;
        this.J = dctVar;
        this.K = x22Var;
        this.L = bVar3;
        this.M = aVar;
        this.N = wy31Var;
        this.O = h3yVar4;
        this.P = mesix;
        this.Q = lqoVar;
        this.R = cVar2;
        this.S = eVar2;
        this.T = m2vVar;
        this.U = f3cVar;
        this.V = messageSelectionActionModeCallback;
        this.W = x4k0Var;
        this.Z = aVar2;
        this.a0 = noy0Var;
        this.b0 = dmt0Var;
        this.c0 = j420Var;
        this.d0 = fVar;
        this.e0 = cVar3;
        this.f0 = h3yVar5;
        this.g0 = h3yVar6;
        this.h0 = vVar;
        final int i = 1;
        ((ConstraintLayout) j1wVar.b).addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.messaging.input.bricks.writing.InputWritingBrick$setupViews$lambda$12$$inlined$onLayoutChange$1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                d.s(d.this);
            }
        });
        final ChatInputEditText chatInputEditText = j1wVar.x;
        chatInputEditText.setHint(chatRequest instanceof ThreadChatRequest ? oyh0.thread_input_hint_discuss : oyh0.chat_input_hint);
        final boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        chatInputEditText.setFilters(new InputFilter[]{new MaxLengthInputFilter(4096, chatInputEditText.getContext())});
        chatInputEditText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.messaging.input.bricks.writing.InputWritingBrick$setupViews$lambda$16$$inlined$onTextChange$1

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V", "com/yandex/dsl/views/TextViewKt$onTextChange$1$onTextChanged$1"}, k = 3, mv = {2, 1, 0})
            @mvg(c = "com.yandex.messaging.input.bricks.writing.InputWritingBrick$setupViews$lambda$16$$inlined$onTextChange$1$1", f = "InputWritingBrick.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.yandex.messaging.input.bricks.writing.InputWritingBrick$setupViews$lambda$16$$inlined$onTextChange$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements wls {
                final /* synthetic */ CharSequence $s;
                int label;
                final /* synthetic */ d this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(CharSequence charSequence, Continuation continuation, d dVar) {
                    super(2, continuation);
                    this.$s = charSequence;
                    this.this$0 = dVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass1(this.$s, continuation, this.this$0);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
                    zy11 zy11Var = zy11.a;
                    anonymousClass1.invokeSuspend(zy11Var);
                    return zy11Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    CharSequence charSequence = this.$s;
                    this.this$0.v(charSequence.toString(), this.this$0.W.a(new SpannableStringBuilder(charSequence)));
                    return zy11.a;
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (z) {
                    tje.N(nka1.c(pj91.f(chatInputEditText)), null, null, new AnonymousClass1(s, null, this), 3);
                } else {
                    this.v(s.toString(), this.W.a(new SpannableStringBuilder(s)));
                }
            }
        });
        chatInputEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.yandex.messaging.input.bricks.writing.InputWritingBrick$setupViews$lambda$16$$inlined$onEditorAction$1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                d dVar = d.this;
                boolean z2 = false;
                if (i2 != 4) {
                    dVar.getClass();
                    return false;
                }
                e eVar3 = dVar.w;
                if (eVar3.c().length() != 0) {
                    eVar3.f();
                    z2 = true;
                }
                if (z2) {
                    a aVar3 = (a) dVar.y.get();
                    aVar3.c.a.c(8);
                    aVar3.b.e(EmptyList.a);
                }
                return z2;
            }
        });
        chatInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.yandex.messaging.input.bricks.writing.InputWritingBrick$setupViews$lambda$16$$inlined$onFocusChange$1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                d dVar = d.this;
                ((com.yandex.messaging.internal.view.input.e) dVar.O.get()).b();
                e eVar3 = dVar.w;
                eVar3.g();
                eVar3.d();
            }
        });
        ImageView imageView = j1wVar.y;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16843518}, vng.t(wwg0.msg_ic_chat_input_emoji_show, imageView.getContext()));
        stateListDrawable.addState(new int[]{R.attr.state_activated}, vng.t(wwg0.msg_ic_chat_input_emoji_hide, imageView.getContext()));
        imageView.setImageDrawable(stateListDrawable);
        j1wVar.z.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.messaging.input.bricks.writing.InputWritingBrick$setupViews$lambda$20$$inlined$onLayoutChange$1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                d.s(d.this);
            }
        });
        hi91.g(new InputWritingBrick$setupViews$5$1(this, null), j1wVar.A);
        hi91.g(new InputWritingBrick$setupViews$6$1(this, null), j1wVar.w);
        chatInputEditText.setClipboardAttachesSender(e3cVar);
        chatInputEditText.setCustomSelectionActionModeCallback(messageSelectionActionModeCallback);
        if (u7sVar.c) {
            final Object[] objArr3 = objArr2 == true ? 1 : 0;
            chatInputEditText.setCopyFormattedText(new tls(this) { // from class: c1w
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i2 = objArr3;
                    zy11 zy11Var = zy11.a;
                    d dVar = this.b;
                    switch (i2) {
                        case 0:
                            Spanned spanned = (Spanned) obj;
                            String obj2 = spanned.toString();
                            String b = xeb1.b(spanned, dVar.b0);
                            boolean J = evu0.J(b);
                            f3c f3cVar2 = dVar.U;
                            if (J) {
                                f3cVar2.a("", obj2);
                            } else {
                                f3cVar2.getClass();
                                try {
                                    f3cVar2.b().setPrimaryClip(ClipData.newHtmlText("", obj2, b));
                                } catch (RemoteException unused) {
                                }
                            }
                            vqb1.g(oyh0.chat_share_copy_done_toast, dVar.c);
                            break;
                        default:
                            CharSequence charSequence = (CharSequence) obj;
                            dVar.v(charSequence.toString(), dVar.W.a(new SpannableStringBuilder(charSequence)));
                            break;
                    }
                    return zy11Var;
                }
            });
            chatInputEditText.setPasteFormattedText(new d1w(this, 2));
        }
        messageSelectionActionModeCallback.init(chatInputEditText, new ctq(17, this), new tls(this) { // from class: c1w
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i2 = i;
                zy11 zy11Var = zy11.a;
                d dVar = this.b;
                switch (i2) {
                    case 0:
                        Spanned spanned = (Spanned) obj;
                        String obj2 = spanned.toString();
                        String b = xeb1.b(spanned, dVar.b0);
                        boolean J = evu0.J(b);
                        f3c f3cVar2 = dVar.U;
                        if (J) {
                            f3cVar2.a("", obj2);
                        } else {
                            f3cVar2.getClass();
                            try {
                                f3cVar2.b().setPrimaryClip(ClipData.newHtmlText("", obj2, b));
                            } catch (RemoteException unused) {
                            }
                        }
                        vqb1.g(oyh0.chat_share_copy_done_toast, dVar.c);
                        break;
                    default:
                        CharSequence charSequence = (CharSequence) obj;
                        dVar.v(charSequence.toString(), dVar.W.a(new SpannableStringBuilder(charSequence)));
                        break;
                }
                return zy11Var;
            }
        });
        chatInputEditText.setGetMarkdownInInputFeatureState(new d1w(this, 3));
        bVar3.f.c = j1wVar.B;
        bVar3.s = new e1w(this);
        selectedMessagesPanel.insertInto(j1wVar.D);
        selectedMessagesPanel.setForwardListener(new e1w(this));
        selectedMessagesPanel.setReplyListener(new e1w(this));
        wy31Var.get().getClass();
        new nst(1, mesix).insertInto(j1wVar.C);
        int b = kjs0.b(11);
        mesix.setPadding(b, b, b, b);
        com.yandex.messaging.internal.view.input.e eVar3 = (com.yandex.messaging.internal.view.input.e) h3yVar4.get();
        BrickSlotView brickSlotView = j1wVar.E;
        d1w d1wVar = new d1w(this, objArr == true ? 1 : 0);
        eVar3.getClass();
        z83.i();
        brickSlotView.insert(eVar3.a());
        eVar3.f = chatInputEditText;
        eVar3.g = d1wVar;
        eVar3.b();
        if (lqoVar.a(tz10.D)) {
            chatInputEditText.addTextChangedListener(new CodeBlockPaddingTextWatcher());
        }
    }

    public static final void r(d dVar) {
        if (dVar.w.p == InputWritingPhase.ReadyToSend) {
            long j = dVar.m0;
            if (j <= 0) {
                dVar.w(new d1w(dVar, 1));
                return;
            }
            Mesix mesix = dVar.P;
            o430 o430Var = e3n.b;
            mesix.setState(new bs10(kp50.V(j, DurationUnit.SECONDS)));
        }
    }

    public static final void s(d dVar) {
        int bottom = dVar.getView().getBottom() - dVar.getView().getTop();
        int top = dVar.a.z.getTop();
        if (bottom == 0 || top == 0) {
            return;
        }
        dVar.x.a(bottom - top);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u(d dVar, ContinuationImpl continuationImpl) {
        InputWritingBrick$tryToRestoreViewState$1 inputWritingBrick$tryToRestoreViewState$1;
        int i;
        InputDraft inputDraft;
        String text;
        String forwardChatId;
        ServerMessageRef[] forwardMessageTimestamps;
        xv10 xv10Var;
        List<AttachInfo> attachments;
        dVar.getClass();
        if (continuationImpl instanceof InputWritingBrick$tryToRestoreViewState$1) {
            inputWritingBrick$tryToRestoreViewState$1 = (InputWritingBrick$tryToRestoreViewState$1) continuationImpl;
            int i2 = inputWritingBrick$tryToRestoreViewState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inputWritingBrick$tryToRestoreViewState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inputWritingBrick$tryToRestoreViewState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inputWritingBrick$tryToRestoreViewState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = dVar.w;
                    inputWritingBrick$tryToRestoreViewState$1.L$0 = dVar;
                    inputWritingBrick$tryToRestoreViewState$1.label = 1;
                    obj = eVar.k.a(inputWritingBrick$tryToRestoreViewState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar = (d) inputWritingBrick$tryToRestoreViewState$1.L$0;
                    kotlin.b.b(obj);
                }
                inputDraft = (InputDraft) obj;
                if (((com.yandex.messaging.input.quote.a) dVar.E.get()).c() == null && inputDraft != null && !inputDraft.isEmpty()) {
                    com.yandex.messaging.internal.view.input.c cVar = dVar.e0;
                    text = inputDraft.getText();
                    if (text != null) {
                        ((InputTextController) dVar.H.get()).setText(text, text.length());
                    }
                    forwardChatId = inputDraft.getForwardChatId();
                    if (forwardChatId != null && (forwardMessageTimestamps = inputDraft.getForwardMessageTimestamps()) != null) {
                        if (forwardMessageTimestamps.length == 0) {
                            forwardMessageTimestamps = null;
                        }
                        if (forwardMessageTimestamps != null) {
                            xv10Var = new xv10(forwardChatId, j73.d0(forwardMessageTimestamps), inputDraft.getIsQuote() ? QuotePresenter$QuoteType.QUOTE : inputDraft.getIsReply() ? QuotePresenter$QuoteType.REPLY : QuotePresenter$QuoteType.FORWARD, inputDraft.getQuotedText(), null, 16);
                            if (xv10Var != null) {
                                ((com.yandex.messaging.input.quote.a) dVar.E.get()).f(xv10Var);
                            } else if (inputDraft.getHasAttachments() && (attachments = inputDraft.getAttachments()) != null) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj2 : attachments) {
                                    AttachInfo attachInfo = (AttachInfo) obj2;
                                    boolean z = false;
                                    try {
                                        InputStream openInputStream = dVar.c.getContentResolver().openInputStream(attachInfo.uri);
                                        boolean z2 = openInputStream != null;
                                        if (openInputStream != null) {
                                            openInputStream.close();
                                        }
                                        z = z2;
                                    } catch (FileNotFoundException | IOException | SecurityException unused) {
                                    }
                                    if (z || (attachInfo.existingId != null && attachInfo.originalChatId != null)) {
                                        arrayList.add(obj2);
                                    }
                                }
                                ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                                if (arrayList2 != null) {
                                    ((a) dVar.y.get()).a(arrayList2);
                                }
                            }
                            cVar.c(inputDraft.getIsStarred());
                            cVar.b(inputDraft.getIsSilent());
                            if (!dVar.n0 || dVar.b.k != ChatOpenTarget.IMAGE_PICKER) {
                                dVar.a.x.requestFocusAndOpenKeyboard();
                            }
                        }
                    }
                    xv10Var = null;
                    if (xv10Var != null) {
                    }
                    cVar.c(inputDraft.getIsStarred());
                    cVar.b(inputDraft.getIsSilent());
                    if (!dVar.n0) {
                    }
                    dVar.a.x.requestFocusAndOpenKeyboard();
                }
                return zy11.a;
            }
        }
        inputWritingBrick$tryToRestoreViewState$1 = new InputWritingBrick$tryToRestoreViewState$1(dVar, continuationImpl);
        Object obj3 = inputWritingBrick$tryToRestoreViewState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inputWritingBrick$tryToRestoreViewState$1.label;
        if (i != 0) {
        }
        inputDraft = (InputDraft) obj3;
        if (((com.yandex.messaging.input.quote.a) dVar.E.get()).c() == null) {
            com.yandex.messaging.internal.view.input.c cVar2 = dVar.e0;
            text = inputDraft.getText();
            if (text != null) {
            }
            forwardChatId = inputDraft.getForwardChatId();
            if (forwardChatId != null) {
                if (forwardMessageTimestamps.length == 0) {
                }
                if (forwardMessageTimestamps != null) {
                }
            }
            xv10Var = null;
            if (xv10Var != null) {
            }
            cVar2.c(inputDraft.getIsStarred());
            cVar2.b(inputDraft.getIsSilent());
            if (!dVar.n0) {
            }
            dVar.a.x.requestFocusAndOpenKeyboard();
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00f4  */
    @Override // com.yandex.bricks.Brick
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        Point point;
        ImageFileInfo a;
        Object jc3Var;
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        com.yandex.messaging.attachments.e eVar = this.S;
        eVar.getClass();
        qtb1 qtb1Var = qtb1.c;
        if (i == 666 && i2 == -1) {
            if (intent == null || (uri = intent.getData()) == null) {
                uri = eVar.e;
                if (uri != null) {
                    eVar.e = null;
                }
            }
            Uri uri2 = uri;
            Activity activity = eVar.a;
            String f = rk91.f(activity, uri2);
            try {
                point = d5b1.j(activity, uri2, d5b1.k(activity, uri2));
            } catch (IOException unused) {
                point = new Point(0, 0);
            }
            int i3 = point.x;
            int i4 = point.y;
            Cursor query = activity.getContentResolver().query(uri2, m2a1.a, null, null, null, null);
            try {
                Cursor cursor = query;
                if (cursor == null || !cursor.moveToFirst()) {
                    u9v u9vVar = ImageFileInfo.Companion;
                    String uri3 = uri2.toString();
                    u9vVar.getClass();
                    a = u9v.a(uri3);
                    ooc.g(query, null);
                } else {
                    int columnIndex = cursor.getColumnIndex("_display_name");
                    String string = cursor.isNull(columnIndex) ? "" : cursor.getString(columnIndex);
                    int columnIndex2 = cursor.getColumnIndex("_size");
                    long j = !cursor.isNull(columnIndex2) ? cursor.getLong(columnIndex2) : -2L;
                    if (j == -2) {
                        InputStream openInputStream = activity.getContentResolver().openInputStream(uri2);
                        try {
                            j = openInputStream.available();
                            openInputStream.close();
                        } finally {
                        }
                    }
                    ImageFileInfo imageFileInfo = new ImageFileInfo(j, new Pair(Integer.valueOf(i3), Integer.valueOf(i4)), uri2.toString(), f, string);
                    ooc.g(query, null);
                    a = imageFileInfo;
                }
                jc3Var = new jc3(a);
                if (!(jc3Var instanceof jc3)) {
                    List<ImageFileInfo> singletonList = Collections.singletonList(((jc3) jc3Var).a);
                    ArrayList arrayList = new ArrayList(tcc.n(singletonList, 10));
                    for (ImageFileInfo imageFileInfo2 : singletonList) {
                        arrayList.add(new AttachInfo(imageFileInfo2.getUri(), null, null, imageFileInfo2.getFilename(), imageFileInfo2.getByteSize(), imageFileInfo2.getMimeType(), ((Number) imageFileInfo2.getPixelSize().c()).intValue(), ((Number) imageFileInfo2.getPixelSize().f()).intValue(), false));
                    }
                    e eVar2 = this.w;
                    if (eVar2.j.o != null) {
                        eVar2.y = true;
                    }
                    eVar2.s.addAll(arrayList);
                    eVar2.g();
                    eVar2.f();
                } else if (!jc3Var.equals(qtb1Var)) {
                    w511.b();
                    return;
                }
                if (i != 113) {
                    PollMessageDraft pollMessageDraft = (i2 != -1 || intent == null || (extras = intent.getExtras()) == null) ? null : (PollMessageDraft) vng.u(extras, PollMessageDraft.class, "param_draft");
                    if (pollMessageDraft != null) {
                        g gVar = this.B;
                        gVar.getClass();
                        String title = pollMessageDraft.getTitle();
                        List<String> answers = pollMessageDraft.getAnswers();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : answers) {
                            if (!evu0.J((String) obj)) {
                                arrayList2.add(obj);
                            }
                        }
                        List J0 = kotlin.collections.a.J0(arrayList2);
                        boolean isAnonymous = pollMessageDraft.isAnonymous();
                        boolean isMultiselect = pollMessageDraft.isMultiselect();
                        boolean isStarred = pollMessageDraft.isStarred();
                        boolean isSilent = pollMessageDraft.isSilent();
                        if (gVar.a()) {
                            return;
                        }
                        gVar.c.a(gVar.b.a, title, J0, isAnonymous, isMultiselect, isStarred, isSilent, gVar.b(null));
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ooc.g(query, th);
                    throw th2;
                }
            }
        }
        jc3Var = qtb1Var;
        if (!(jc3Var instanceof jc3)) {
        }
        if (i != 113) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.util.ArrayList] */
    @Override // com.yandex.bricks.Brick
    public final void onBrickAttach(Bundle bundle) {
        String str;
        List list;
        super.onBrickAttach(bundle);
        tje.N(getBrickScope(), null, null, new InputWritingBrick$onBrickAttach$1(this, null), 3);
        tje.N(getBrickScope(), null, null, new InputWritingBrick$onBrickAttach$2(this, null), 3);
        InputWritingBrick$onBrickAttach$3 inputWritingBrick$onBrickAttach$3 = new InputWritingBrick$onBrickAttach$3(1, this, d.class, "onPermissionResult", "onPermissionResult(Lcom/yandex/alicekit/core/permissions/PermissionRequestResult;)V", 0);
        SparseArray sparseArray = this.F.b;
        sparseArray.get(57226);
        z83.i();
        sparseArray.put(57226, inputWritingBrick$onBrickAttach$3);
        dct dctVar = this.J;
        ChatRequest chatRequest = this.C;
        kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(dctVar.a(chatRequest), new InputWritingBrick$onBrickAttach$4(this, null), 3));
        InputWritingBrick$onBrickAttach$5$1 inputWritingBrick$onBrickAttach$5$1 = new InputWritingBrick$onBrickAttach$5$1(0, this, d.class, "onSubmitTextClick", "onSubmitTextClick()V", 0);
        Mesix mesix = this.P;
        mesix.getClickListeners().put(qoi0.a(as10.class), inputWritingBrick$onBrickAttach$5$1);
        mesix.getClickListeners().put(qoi0.a(bs10.class), new InputWritingBrick$onBrickAttach$5$2(0, this, d.class, "onTimerClick", "onTimerClick()V", 0));
        e eVar = this.w;
        q6b q6bVar = eVar.j;
        if (bundle == null) {
            if (!eVar.z) {
                eVar.z = true;
                hqr0 hqr0Var = q6bVar.o;
                if (hqr0Var != null && (str = hqr0Var.e) != null && !hqr0Var.f.isEmpty()) {
                    eVar.u = new xv10(SendAction.FORWARD == hqr0Var.b ? str : "", hqr0Var.f, QuotePresenter$QuoteType.FORWARD, null, null, 24);
                }
            }
            String str2 = eVar.B;
            if (str2 != null) {
                eVar.k.b(str2, false, false, null, null);
                eVar.B = null;
            }
        } else if (bundle.getStringArrayList("Chat.FORWARD_IDS") != null) {
            String string = bundle.getString("Chat.FORWARD_CHAT_ID", "");
            ArrayList v = vng.v(bundle, ServerMessageRef.class, "Chat.FORWARD_IDS");
            if (v != null) {
                list = new ArrayList(tcc.n(v, 10));
                Iterator it = v.iterator();
                while (it.hasNext()) {
                    list.add(ServerMessageRef.copy$default((ServerMessageRef) it.next(), 0L, string, 1, null));
                }
            } else {
                list = EmptyList.a;
            }
            eVar.u = new xv10(string, list, QuotePresenter$QuoteType.FORWARD, null, null, 24);
        }
        hqr0 hqr0Var2 = q6bVar.o;
        if (hqr0Var2 != null) {
            String join = TextUtils.join("\n", hqr0Var2.c);
            if (join.length() > 0) {
                b bVar = eVar.k;
                tje.N(bVar.d, null, null, new InputDraftController$clear$1(bVar, null), 3);
                eVar.h.setText(join, join.length());
            }
            String str3 = q6bVar.p;
            eVar.v = str3;
            if (str3 != null) {
                eVar.l.a(str3, new reu(8, eVar));
            }
            if (!eVar.y) {
                ArrayList arrayList = new ArrayList();
                List list2 = hqr0Var2.d;
                if (!list2.isEmpty()) {
                    List list3 = list2;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(juf0.b(eVar.a, (Uri) it2.next()));
                    }
                    arrayList.addAll(arrayList2);
                }
                SharingData$SharingImageData sharingData$SharingImageData = hqr0Var2.h;
                AttachInfo attachInfo = sharingData$SharingImageData != null ? new AttachInfo(sharingData$SharingImageData.getUri(), sharingData$SharingImageData.getExistingFileId(), sharingData$SharingImageData.getOrigChatId(), sharingData$SharingImageData.getName(), sharingData$SharingImageData.getSize(), qna1.g(sharingData$SharingImageData.getName()), sharingData$SharingImageData.getWidth(), sharingData$SharingImageData.getHeight(), false, 0L, null) : null;
                if (attachInfo != null) {
                    arrayList.add(attachInfo);
                }
                SharingData$SharingFileData sharingData$SharingFileData = hqr0Var2.g;
                AttachInfo attachInfo2 = sharingData$SharingFileData != null ? new AttachInfo(Uri.EMPTY, sharingData$SharingFileData.getExistingFileId(), sharingData$SharingFileData.getOrigChatId(), sharingData$SharingFileData.getName(), sharingData$SharingFileData.getSize(), null, 0, 0, false, 0L, null) : null;
                if (attachInfo2 != null) {
                    arrayList.add(attachInfo2);
                }
                if (!arrayList.isEmpty()) {
                    ((a) eVar.i.get()).a(arrayList);
                }
            }
            eVar.d();
        }
        h3y h3yVar = this.H;
        ((InputTextController) h3yVar.get()).onAttach();
        j1w j1wVar = this.a;
        ImageView imageView = j1wVar.y;
        ChatInputEditText chatInputEditText = j1wVar.x;
        com.yandex.messaging.input.b bVar2 = this.L;
        bVar2.a(imageView, chatInputEditText);
        bVar2.k = this.I.d;
        bVar2.b();
        if (((tqq0) this.f0.get()).c) {
            f fVar = this.d0;
            fVar.e(chatInputEditText);
            kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(fVar.l, new InputWritingBrick$onBrickAttach$7(this, null), 3));
            eVar.e.d = new d1w(this, 4);
        }
        this.M.q((InputTextController) h3yVar.get());
        com.yandex.messaging.internal.view.input.c cVar = this.e0;
        cVar.a();
        ((com.yandex.messaging.internal.view.input.e) this.O.get()).c();
        kotlinx.coroutines.flow.e.H(getBrickScope(), kotlinx.coroutines.flow.e.I(cVar.f, new InputWritingBrick$onBrickAttach$9(this, null)));
        kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(this.A.a(chatRequest), new InputWritingBrick$onBrickAttach$10(this, null), 3));
        q6b q6bVar2 = this.b;
        if (q6bVar2.r) {
            q6bVar2.r = false;
            ((InputTextController) h3yVar.get()).requestFocusAndOpenKeyboard();
        }
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        e eVar = this.w;
        eVar.g.a();
        ((InputTextController) this.H.get()).onDetach();
        com.yandex.messaging.input.b bVar = this.L;
        kotlinx.coroutines.a.g(bVar.m.a, null);
        bVar.f.d();
        bVar.b();
        w05 w05Var = bVar.h;
        if (w05Var != null) {
            if (!ftn.e()) {
                w05Var = null;
            }
            if (w05Var != null) {
                ftn.a().l(w05Var);
            }
        }
        bVar.h = null;
        f fVar = this.d0;
        kotlinx.coroutines.a.g(fVar.j.a, null);
        fVar.m.a(true);
        fVar.d();
        fVar.f = null;
        fVar.e.get().getClass();
        this.F.d(57226);
        kotlinx.coroutines.a.g(((com.yandex.messaging.internal.view.input.e) this.O.get()).d.a, null);
        kotlinx.coroutines.a.g(this.e0.d.a, null);
        eVar.e.d = null;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickPause() {
        super.onBrickPause();
        e eVar = this.w;
        com.yandex.messaging.internal.view.input.c cVar = eVar.n;
        eVar.t = true;
        pzt0 pzt0Var = eVar.A;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        eVar.A = null;
        com.yandex.messaging.input.preview.a aVar = eVar.f;
        pzt0 pzt0Var2 = aVar.g;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        aVar.g = null;
        eVar.k.b(eVar.h.createDecodedText(), ((uqq0) cVar.f.a.getValue()).a, ((uqq0) cVar.f.a.getValue()).b, eVar.g.e(), eVar.s);
        eVar.g();
        eVar.d();
        this.G.b();
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickResume() {
        super.onBrickResume();
        e eVar = this.w;
        eVar.t = false;
        eVar.f.a();
        eVar.A = kotlinx.coroutines.flow.e.H(eVar.b, new jqr(eVar.C.a(), new InputWritingBrickModel$onResume$1(eVar, null), 3));
        xv10 xv10Var = eVar.u;
        if (xv10Var != null) {
            eVar.g.f(xv10Var);
            eVar.u = null;
        }
        eVar.g();
        eVar.d();
        j1w j1wVar = this.a;
        this.G.a(j1wVar.x, j1wVar.b);
        tje.N(this.R, null, null, new InputWritingBrick$onBrickResume$1(this, null), 3);
        Editable text = j1wVar.x.getText();
        if (text != null) {
            this.V.setLinkStyles(new SpannableStringBuilder(text));
        }
        if (this.n0 || this.b.k != ChatOpenTarget.IMAGE_PICKER) {
            return;
        }
        this.n0 = true;
        w(new c(this, this.c));
    }

    @Override // com.yandex.bricks.Brick
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        e eVar = this.w;
        xv10 e = eVar.g.e();
        hqr0 hqr0Var = eVar.j.o;
        if (hqr0Var == null || hqr0Var.f == null || e == null) {
            return;
        }
        bundle.putString("Chat.FORWARD_CHAT_ID", (String) e.a);
        bundle.putParcelableArrayList("Chat.FORWARD_IDS", new ArrayList<>((List) e.b));
    }

    @Override // defpackage.ss11
    public final ms11 q() {
        return this.a;
    }

    public final void v(String str, String str2) {
        com.yandex.messaging.internal.view.input.e eVar = (com.yandex.messaging.internal.view.input.e) this.O.get();
        KeyboardAwareEmojiEditText keyboardAwareEmojiEditText = eVar.f;
        if (keyboardAwareEmojiEditText == null) {
            keyboardAwareEmojiEditText = null;
        }
        if (evu0.J(keyboardAwareEmojiEditText.getEditableText())) {
            eVar.h = false;
        }
        KeyboardAwareEmojiEditText keyboardAwareEmojiEditText2 = eVar.f;
        if (!evu0.J((keyboardAwareEmojiEditText2 != null ? keyboardAwareEmojiEditText2 : null).getEditableText()) && eVar.d()) {
            eVar.h = true;
        }
        eVar.b();
        e eVar2 = this.w;
        com.yandex.messaging.input.preview.a aVar = eVar2.f;
        if (TextUtils.isEmpty(str)) {
            aVar.e = true;
            aVar.a();
        }
        if (!TextUtils.equals(eVar2.r, str2)) {
            eVar2.r = str2;
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = jl40.q(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            aVar.f = str2.subSequence(i, length + 1).toString();
            aVar.a();
        }
        if (TextUtils.equals(eVar2.q, str)) {
            return;
        }
        eVar2.q = str;
        eVar2.g();
        k0b k0bVar = eVar2.d;
        k0bVar.getClass();
        tje.e();
        b00 b00Var = k0bVar.a;
        ((Handler) b00Var.a.get()).post(new qz(b00Var, k0bVar.b, 4));
        eVar2.d();
    }

    public final void w(sls slsVar) {
        if (!this.i0) {
            slsVar.invoke();
            return;
        }
        if (this.j0 != null) {
            zj3 zj3Var = new zj3(!r0.r);
            bgc bgcVar = new bgc(12);
            m2v m2vVar = this.T;
            com.yandex.messaging.internal.suspend.a.b(new bk3(zj3Var, slsVar, bgcVar, (pk3) m2vVar.a, (jn3) m2vVar.b, (oo90) m2vVar.c, (zm90) m2vVar.w).f(true), getBrickScope());
        }
    }
}
