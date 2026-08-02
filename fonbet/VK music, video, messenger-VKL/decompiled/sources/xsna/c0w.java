package xsna;

import android.util.SparseArray;
import android.widget.TextView;
import com.vk.common.view.settings.RadioSettingsViewGroup;
import com.vk.im.ui.components.chat_controls.ChatControls;
import com.vk.im.ui.fragments.ImCreateChatControlParamsFragment;
import com.vkontakte.android.R;
import java.util.Locale;

/* compiled from: ImCreateChatControlParamsFragment.kt */
/* loaded from: classes2.dex */
public final class c0w implements RadioSettingsViewGroup.a {
    public final /* synthetic */ ImCreateChatControlParamsFragment a;

    public c0w(ImCreateChatControlParamsFragment imCreateChatControlParamsFragment) {
        this.a = imCreateChatControlParamsFragment;
    }

    @Override // com.vk.common.view.settings.RadioSettingsViewGroup.a
    public final void a(int i) {
        int i2 = ImCreateChatControlParamsFragment.b0;
        int i3 = i == R.id.closed_chat ? 1 : i == R.id.customs_chat ? 2 : 0;
        SparseArray<ChatControls> sparseArray = ChatControls.n;
        boolean a = zik0.a(sparseArray, i3);
        ImCreateChatControlParamsFragment imCreateChatControlParamsFragment = this.a;
        if (a) {
            eqb eqbVar = imCreateChatControlParamsFragment.S;
            if (eqbVar == null) {
                eqbVar = null;
            }
            eqbVar.X0(sparseArray.get(i3));
        }
        TextView textView = imCreateChatControlParamsFragment.X;
        (textView != null ? textView : null).setText(imCreateChatControlParamsFragment.getResources().getString(imCreateChatControlParamsFragment.Z.get(i3)).toUpperCase(Locale.ROOT));
        imCreateChatControlParamsFragment.Q = Integer.valueOf(i3);
    }
}
