package com.yandex.messaging.input.bricks;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.yandex.bricks.Brick;
import com.yandex.messaging.activity.MessengerRequestCode;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;
import com.yandex.messaging.ui.auth.ProxyPassportActivity;
import defpackage.an90;
import defpackage.bn90;
import defpackage.e9h0;
import defpackage.fk6;
import defpackage.gvg0;
import defpackage.olh0;
import defpackage.oyh0;
import defpackage.pu31;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public class AuthorizationWithoutPhone extends Brick implements View.OnClickListener {
    private final Activity mActivity;
    private final ChatInputHeightState mChatInputHeightState;
    private final an90 mPassportActivityStarter;
    private final View mView;
    private final pu31 mViewShownLogger;

    public AuthorizationWithoutPhone(Activity activity, pu31 pu31Var, an90 an90Var, SelectedMessagesPanel selectedMessagesPanel, ChatInputHeightState chatInputHeightState) {
        this.mActivity = activity;
        this.mViewShownLogger = pu31Var;
        this.mPassportActivityStarter = an90Var;
        this.mChatInputHeightState = chatInputHeightState;
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
        this.mViewShownLogger.a(this.mView, "auth_without_phone_button", null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        an90 an90Var = this.mPassportActivityStarter;
        int value = MessengerRequestCode.MESSENGER_PROFILE.getValue();
        bn90 bn90Var = (bn90) an90Var;
        bn90Var.b.c("am account request", CRLReasonCodeExtension.REASON, "login_without_phone_requirement");
        Activity activity = bn90Var.a;
        Intent intent = new Intent(activity, (Class<?>) ProxyPassportActivity.class);
        intent.setAction("LOGIN");
        activity.startActivityForResult(intent, value);
    }
}
