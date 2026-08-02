package com.yandex.messaging.internal.view.input.edit;

import android.R;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.bricks.Brick;
import com.yandex.bricks.BrickBoundHelper;
import com.yandex.bricks.BrickSlotView;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.input.ChatInputEditText;
import com.yandex.messaging.input.CodeBlockPaddingTextWatcher;
import com.yandex.messaging.input.MessageSelectionActionModeCallback;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.authorized.chat.b;
import com.yandex.messaging.internal.authorized.j;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import com.yandex.messaging.internal.view.input.UnderKeyboardLinearLayout;
import com.yandex.messaging.internal.view.input.edit.a;
import com.yandex.messaging.internal.view.input.mesix.Mesix;
import com.yandex.messaging.views.MaxLengthInputFilter;
import defpackage.as10;
import defpackage.bxl;
import defpackage.cmi;
import defpackage.cs10;
import defpackage.dmn;
import defpackage.e3c;
import defpackage.e9h0;
import defpackage.emn;
import defpackage.en2;
import defpackage.ftn;
import defpackage.gym;
import defpackage.idh;
import defpackage.lqo;
import defpackage.nl;
import defpackage.nmn;
import defpackage.noy0;
import defpackage.olh0;
import defpackage.ota;
import defpackage.pu31;
import defpackage.q0w;
import defpackage.qoi0;
import defpackage.t7j;
import defpackage.tmt0;
import defpackage.tz10;
import defpackage.tzt;
import defpackage.vng;
import defpackage.wq80;
import defpackage.wwg0;
import defpackage.x22;
import defpackage.x4k0;
import defpackage.xav;
import defpackage.xen;
import defpackage.yvf0;

/* loaded from: classes15.dex */
public final class a extends Brick {
    public final MessageSelectionActionModeCallback A;
    public final lqo B;
    public final View C;
    public final ChatInputEditText D;
    public final ImageView E;
    public final InputTextController F;
    public final TextView G;
    public final Mesix H;
    public final emn I;
    public final BrickBoundHelper J;
    public final idh K;
    public tzt L;
    public EditMessageDraft M;
    public final wq80 a;
    public final en2 b;
    public final noy0 c;
    public final tmt0 w;
    public final nmn x;
    public final xav y;
    public final x22 z;

    public a(Activity activity, ChatInputHeightState chatInputHeightState, wq80 wq80Var, en2 en2Var, noy0 noy0Var, tmt0 tmt0Var, q0w q0wVar, SharedPreferences sharedPreferences, yvf0 yvf0Var, pu31 pu31Var, nmn nmnVar, xav xavVar, com.yandex.messaging.internal.view.chat.input.a aVar, x22 x22Var, x4k0 x4k0Var, e3c e3cVar, MessageSelectionActionModeCallback messageSelectionActionModeCallback, lqo lqoVar, com.yandex.messaging.formatting.a aVar2) {
        this.a = wq80Var;
        this.b = en2Var;
        this.c = noy0Var;
        this.w = tmt0Var;
        this.x = nmnVar;
        this.y = xavVar;
        this.z = x22Var;
        this.A = messageSelectionActionModeCallback;
        this.B = lqoVar;
        View inflate = inflate(activity, olh0.msg_b_edit_message);
        this.C = inflate;
        ChatInputEditText chatInputEditText = (ChatInputEditText) inflate.findViewById(e9h0.messaging_edit_input);
        this.D = chatInputEditText;
        this.E = (ImageView) inflate.findViewById(e9h0.messaging_edit_icon);
        InputTextController inputTextController = new InputTextController(chatInputEditText, tmt0Var, q0wVar, x4k0Var, noy0Var, lqoVar);
        this.F = inputTextController;
        this.G = (TextView) inflate.findViewById(e9h0.messaging_edit_original_text);
        Mesix mesix = (Mesix) inflate.findViewById(e9h0.chat_mesix);
        this.H = mesix;
        emn emnVar = new emn(this);
        this.I = emnVar;
        this.J = new BrickBoundHelper(emnVar);
        final int i = 1;
        final int i2 = 0;
        chatInputEditText.setFilters(new InputFilter[]{new MaxLengthInputFilter(4096, activity)});
        chatInputEditText.setClipboardAttachesSender(e3cVar);
        chatInputEditText.setCustomSelectionActionModeCallback(messageSelectionActionModeCallback);
        chatInputEditText.setPasteFormattedText(new t7j(4, activity, aVar2, this));
        MessageSelectionActionModeCallback.init$default(messageSelectionActionModeCallback, chatInputEditText, new ota(22, this), null, 4, null);
        mesix.setState(cs10.b);
        mesix.getClickListeners().put(qoi0.a(as10.class), new EditMessageBrickHelperKt$setSubmitClickListener$1(0, new Runnable(this) { // from class: cmn
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                a aVar3 = this.b;
                switch (i3) {
                    case 0:
                        emn emnVar2 = aVar3.I;
                        emnVar2.getClass();
                        tje.e();
                        a aVar4 = emnVar2.x;
                        boolean isAttached = aVar4.isAttached();
                        InputTextController inputTextController2 = aVar4.F;
                        if (isAttached) {
                            op3 op3Var = emnVar2.c;
                            kgx kgxVar = emn.y[2];
                            if (op3Var.a() == null) {
                                String obj = evu0.k0(inputTextController2.createDecodedText()).toString();
                                if (!jl40.l(emnVar2.w, obj)) {
                                    aVar4.H.setState(cs10.a);
                                    ServerMessageRef serverMessageRef = (ServerMessageRef) aVar4.J.key();
                                    String[] mentionedUsers = inputTextController2.getMentionedUsers();
                                    en2 en2Var2 = aVar4.b;
                                    b bVar = en2Var2.a;
                                    ChatRequest chatRequest = en2Var2.b;
                                    bc bcVar = new bc();
                                    bcVar.a = new Handler();
                                    bcVar.b = serverMessageRef;
                                    bcVar.c = obj;
                                    bcVar.w = mentionedUsers;
                                    bcVar.x = emnVar2;
                                    bVar.getClass();
                                    tje.e();
                                    j jVar = bVar.b;
                                    an8 an8Var = new an8(bVar, chatRequest, bcVar);
                                    jVar.getClass();
                                    emnVar2.c(new zs21(jVar, an8Var));
                                    break;
                                } else {
                                    emnVar2.a();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        emn emnVar3 = aVar3.I;
                        emnVar3.c(null);
                        a aVar5 = emnVar3.x;
                        if (aVar5.isAttached() && aVar5.D.isEnabled()) {
                            aVar5.H.setState(as10.a);
                            break;
                        }
                        break;
                }
            }
        }, Runnable.class, "run", "run()V", 0));
        mesix.getClickListeners().put(qoi0.a(cs10.class), new EditMessageBrickHelperKt$setCountdownClickListener$1(0, new Runnable(this) { // from class: cmn
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                a aVar3 = this.b;
                switch (i3) {
                    case 0:
                        emn emnVar2 = aVar3.I;
                        emnVar2.getClass();
                        tje.e();
                        a aVar4 = emnVar2.x;
                        boolean isAttached = aVar4.isAttached();
                        InputTextController inputTextController2 = aVar4.F;
                        if (isAttached) {
                            op3 op3Var = emnVar2.c;
                            kgx kgxVar = emn.y[2];
                            if (op3Var.a() == null) {
                                String obj = evu0.k0(inputTextController2.createDecodedText()).toString();
                                if (!jl40.l(emnVar2.w, obj)) {
                                    aVar4.H.setState(cs10.a);
                                    ServerMessageRef serverMessageRef = (ServerMessageRef) aVar4.J.key();
                                    String[] mentionedUsers = inputTextController2.getMentionedUsers();
                                    en2 en2Var2 = aVar4.b;
                                    b bVar = en2Var2.a;
                                    ChatRequest chatRequest = en2Var2.b;
                                    bc bcVar = new bc();
                                    bcVar.a = new Handler();
                                    bcVar.b = serverMessageRef;
                                    bcVar.c = obj;
                                    bcVar.w = mentionedUsers;
                                    bcVar.x = emnVar2;
                                    bVar.getClass();
                                    tje.e();
                                    j jVar = bVar.b;
                                    an8 an8Var = new an8(bVar, chatRequest, bcVar);
                                    jVar.getClass();
                                    emnVar2.c(new zs21(jVar, an8Var));
                                    break;
                                } else {
                                    emnVar2.a();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        emn emnVar3 = aVar3.I;
                        emnVar3.c(null);
                        a aVar5 = emnVar3.x;
                        if (aVar5.isAttached() && aVar5.D.isEnabled()) {
                            aVar5.H.setState(as10.a);
                            break;
                        }
                        break;
                }
            }
        }, Runnable.class, "run", "run()V", 0));
        inflate.findViewById(e9h0.messaging_close).setOnClickListener(new cmi(15, this));
        inflate.addOnLayoutChangeListener(new dmn(0, chatInputHeightState, inflate.findViewById(e9h0.messaging_edit_shadow)));
        ((BrickSlotView) inflate.findViewById(e9h0.messaging_suggest_slot)).insert(aVar);
        aVar.q(inputTextController);
        ImageView imageView = (ImageView) inflate.findViewById(e9h0.messaging_edit_emoji_button);
        UnderKeyboardLinearLayout underKeyboardLinearLayout = (UnderKeyboardLinearLayout) inflate.findViewById(e9h0.messaging_edit_emoji_panel);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16843518}, vng.t(wwg0.msg_ic_chat_input_emoji_show, activity));
        stateListDrawable.addState(new int[]{R.attr.state_activated}, vng.t(wwg0.msg_ic_chat_input_emoji_hide, activity));
        imageView.setImageDrawable(stateListDrawable);
        imageView.setOnClickListener(new nl(7, underKeyboardLinearLayout, yvf0Var, this));
        underKeyboardLinearLayout.setSharedPreferences(sharedPreferences);
        underKeyboardLinearLayout.setVisibilityListener(new gym(imageView));
        underKeyboardLinearLayout.setOnBackClickListener(new xen(1, underKeyboardLinearLayout));
        this.K = new idh(1, imageView, this);
        pu31Var.a(inflate, "edit", null);
        chatInputEditText.setGetMarkdownInInputFeatureState(new bxl(25, this));
        if (lqoVar.a(tz10.D)) {
            chatInputEditText.addTextChangedListener(new CodeBlockPaddingTextWatcher());
        }
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.C;
    }

    @Override // com.yandex.bricks.Brick
    public final void onBrickAttach(Bundle bundle) {
        super.onBrickAttach(bundle);
        if (ftn.e()) {
            ftn.a().k(this.K);
        }
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        if (ftn.e()) {
            ftn.a().l(this.K);
        }
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickResume() {
        super.onBrickResume();
        Editable text = this.D.getText();
        if (text != null) {
            this.A.setLinkStyles(new SpannableStringBuilder(text));
        }
    }
}
