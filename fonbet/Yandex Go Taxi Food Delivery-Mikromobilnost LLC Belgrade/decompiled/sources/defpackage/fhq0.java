package defpackage;

import android.view.View;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;

/* loaded from: classes15.dex */
public final /* synthetic */ class fhq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectedMessagesPanel b;
    public final /* synthetic */ ServerMessageRef c;

    public /* synthetic */ fhq0(SelectedMessagesPanel selectedMessagesPanel, ServerMessageRef serverMessageRef, int i) {
        this.a = i;
        this.b = selectedMessagesPanel;
        this.c = serverMessageRef;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        ServerMessageRef serverMessageRef = this.c;
        SelectedMessagesPanel selectedMessagesPanel = this.b;
        switch (i) {
            case 0:
                selectedMessagesPanel.lambda$onCanBeReplied$4(serverMessageRef, view);
                break;
            default:
                selectedMessagesPanel.lambda$onCanBePinned$7(serverMessageRef, view);
                break;
        }
    }
}
