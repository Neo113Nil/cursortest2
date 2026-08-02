package xsna;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.common.view.EditText;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.chat.ChatManager;
import ru.ok.android.externcalls.sdk.chat.message.OutboundMessage;

/* compiled from: SendMessageToSessionRoomsDialog.kt */
/* loaded from: classes7.dex */
public final class yhi0 extends lwi0 {
    public static final /* synthetic */ int f1 = 0;

    public static void Zn(String str, gzs gzsVar, gzs gzsVar2) {
        OKVoipEngine.b.getClass();
        Conversation conversation = OKVoipEngine.E.getConversation();
        ChatManager chatManager = conversation != null ? conversation.getChatManager() : null;
        if (chatManager != null) {
            chatManager.sendMessage(new OutboundMessage(null, str, 1, null), new tm50(1, gzsVar), new reo(3, gzsVar2));
        }
    }

    @Override // xsna.lwi0
    public final View Yn() {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_session_rooms_admin_send_message_dialog, (ViewGroup) null, false);
        bwt0.i0(inflate.findViewById(R.id.session_room_send_message_dialog_close_btn), new b140(this, 19));
        final AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(R.id.session_room_send_message_btn);
        final EditText editText = (EditText) inflate.findViewById(R.id.session_room_message_input);
        bwt0.j(editText, new pqz(23));
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xsna.vhi0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                int i2 = yhi0.f1;
                if (i == 4) {
                    AppCompatTextView appCompatTextView2 = AppCompatTextView.this;
                    if (appCompatTextView2.isEnabled()) {
                        appCompatTextView2.setEnabled(false);
                        yhi0.Zn(drm0.p0(editText.getText().toString()).toString(), new i440(this, 27), new pwh0(appCompatTextView2, 1));
                    }
                }
                return true;
            }
        });
        editText.setRawInputType(1);
        editText.addTextChangedListener(new xhi0(appCompatTextView));
        bwt0.i0(appCompatTextView, new whi0(0, this, editText));
        return inflate;
    }

    @Override // xsna.lwi0, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        Window window = yn.getWindow();
        if (window != null) {
            mhy.g(window);
        }
        yn.setCanceledOnTouchOutside(false);
        return yn;
    }
}
