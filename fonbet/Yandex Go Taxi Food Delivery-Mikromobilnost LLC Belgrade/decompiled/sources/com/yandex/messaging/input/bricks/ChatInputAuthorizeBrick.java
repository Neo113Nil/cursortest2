package com.yandex.messaging.input.bricks;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.yandex.bricks.Brick;
import com.yandex.messaging.activity.MessengerRequestCode;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;
import defpackage.e9h0;
import defpackage.fk6;
import defpackage.gvg0;
import defpackage.j1q;
import defpackage.olh0;
import defpackage.oyh0;
import defpackage.pu31;
import defpackage.yh3;
import defpackage.ymp;

/* loaded from: classes15.dex */
public class ChatInputAuthorizeBrick extends Brick implements View.OnClickListener {
    private final Activity mActivity;
    private final yh3 mAuthActivityStarter;
    private final ChatInputHeightState mChatInputHeightState;
    private final ymp mFeatures;
    private final View mView;
    private final pu31 mViewShownLogger;

    public ChatInputAuthorizeBrick(Activity activity, pu31 pu31Var, yh3 yh3Var, SelectedMessagesPanel selectedMessagesPanel, ChatInputHeightState chatInputHeightState, ymp ympVar) {
        this.mActivity = activity;
        this.mViewShownLogger = pu31Var;
        this.mAuthActivityStarter = yh3Var;
        this.mChatInputHeightState = chatInputHeightState;
        this.mFeatures = ympVar;
        View inflate = inflate(activity, olh0.msg_b_input_single_button);
        this.mView = inflate;
        TextView textView = (TextView) inflate.findViewById(e9h0.messaging_input_button);
        textView.setText(oyh0.chat_authorize_button);
        textView.setOnClickListener(this);
        selectedMessagesPanel.insertInto((fk6) inflate.findViewById(e9h0.messaging_input_slot));
    }

    @Override // com.yandex.bricks.Brick
    public View getView() {
        return this.mView;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public void onBrickAttach() {
        super.onBrickAttach();
        this.mChatInputHeightState.a(this.mActivity.getResources().getDimensionPixelSize(gvg0.chat_input_button_height));
        this.mViewShownLogger.a(this.mView, "auth_button", null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        j1q j1qVar = (j1q) this.mFeatures;
        if (j1qVar.a == null || !((Boolean) j1qVar.b.e.getValue()).booleanValue()) {
            return;
        }
        yh3 yh3Var = this.mAuthActivityStarter;
        int value = MessengerRequestCode.SEND_MESSAGE.getValue();
        yh3Var.getClass();
        yh3.a(yh3Var, value, "android_messenger_write_to_chat");
    }
}
