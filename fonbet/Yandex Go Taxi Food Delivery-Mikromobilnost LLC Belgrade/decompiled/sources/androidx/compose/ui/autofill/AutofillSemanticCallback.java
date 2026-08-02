package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/autofill/AutofillSemanticCallback;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "<init>", "()V", "Landroid/view/View;", "view", "", "virtualId", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "onAutofillEvent", "(Landroid/view/View;II)V", "Landroidx/compose/ui/autofill/a;", "androidAutofillManager", "register", "(Landroidx/compose/ui/autofill/a;)V", "unregister", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AutofillSemanticCallback extends AutofillManager.AutofillCallback {
    public static final AutofillSemanticCallback INSTANCE = new AutofillSemanticCallback();
    public static final int $stable = 8;

    private AutofillSemanticCallback() {
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(View view, int virtualId, int event) {
        super.onAutofillEvent(view, virtualId, event);
    }

    public final void register(a androidAutofillManager) {
        ((AutofillManager) androidAutofillManager.a.a).registerCallback(this);
    }

    public final void unregister(a androidAutofillManager) {
        ((AutofillManager) androidAutofillManager.a.a).unregisterCallback(this);
    }
}
