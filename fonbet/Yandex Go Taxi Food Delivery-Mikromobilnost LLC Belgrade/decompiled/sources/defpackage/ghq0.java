package defpackage;

import android.view.View;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;

/* loaded from: classes15.dex */
public final /* synthetic */ class ghq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectedMessagesPanel b;

    public /* synthetic */ ghq0(SelectedMessagesPanel selectedMessagesPanel, int i) {
        this.a = i;
        this.b = selectedMessagesPanel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        SelectedMessagesPanel selectedMessagesPanel = this.b;
        switch (i) {
            case 0:
                selectedMessagesPanel.lambda$onCanBeSharedAndCopied$5(view);
                break;
            case 1:
                selectedMessagesPanel.lambda$onCanBeSharedAndCopied$6(view);
                break;
            case 2:
                selectedMessagesPanel.lambda$onCanBeDeleted$3(view);
                break;
            case 3:
                selectedMessagesPanel.lambda$onCanBeForwarded$2(view);
                break;
            default:
                selectedMessagesPanel.lambda$new$0(view);
                break;
        }
    }
}
