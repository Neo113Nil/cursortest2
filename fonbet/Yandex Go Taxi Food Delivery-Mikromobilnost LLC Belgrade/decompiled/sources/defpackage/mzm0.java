package defpackage;

import android.content.Context;
import android.view.View;
import androidx.core.view.b;
import defpackage.ozm0;
import defpackage.tls;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final class mzm0 implements bzm0 {
    public final /* synthetic */ ozm0 a;

    public mzm0(ozm0 ozm0Var) {
        this.a = ozm0Var;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        DialogueComponent dialogueComponent;
        int i;
        jzm0 jzm0Var = (jzm0) obj;
        boolean z = jzm0Var instanceof izm0;
        final ozm0 ozm0Var = this.a;
        if (!z) {
            if (!jl40.l(jzm0Var, hzm0.a)) {
                w511.b();
                return;
            }
            ozm0Var.f = false;
            tls tlsVar = ozm0Var.c;
            if (tlsVar != null) {
                tlsVar.invoke(Boolean.FALSE);
            }
            DialogueComponent dialogueComponent2 = ozm0Var.e;
            if (dialogueComponent2 != null) {
                dialogueComponent2.hide();
                return;
            }
            return;
        }
        izm0 izm0Var = (izm0) jzm0Var;
        ListItemComponent listItemComponent = ozm0Var.b;
        if (listItemComponent == null || (dialogueComponent = ozm0Var.e) == null) {
            return;
        }
        kzm0 kzm0Var = izm0Var.a;
        ozm0Var.f = true;
        listItemComponent.setSubtitle(kzm0Var.a.c);
        listItemComponent.setLeadImage(kzm0Var.b);
        WeakHashMap weakHashMap = b.a;
        if (!listItemComponent.isLaidOut() || listItemComponent.isLayoutRequested()) {
            listItemComponent.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.scooters.misc.attention.ui.ScootersAttentionViewDelegateImpl$showHeader$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    tls tlsVar2 = ozm0.this.c;
                    if (tlsVar2 != null) {
                        tlsVar2.invoke(Boolean.TRUE);
                    }
                }
            });
        } else {
            tls tlsVar2 = ozm0Var.c;
            if (tlsVar2 != null) {
                tlsVar2.invoke(Boolean.TRUE);
            }
        }
        dialogueComponent.setOnClickListener(new tai0(13, ozm0Var, kzm0Var));
        Context context = dialogueComponent.getContext();
        int i2 = nzm0.a[kzm0Var.a.b.ordinal()];
        if (i2 == 1) {
            i = mqg0.component_green_normal;
        } else if (i2 == 2) {
            i = mqg0.component_control_minor_dark_no_transparency;
        } else {
            if (i2 != 3) {
                w511.b();
                return;
            }
            i = mqg0.component_red_toxic;
        }
        dialogueComponent.updateHeaderColor(Integer.valueOf(context.getColor(i)));
        dialogueComponent.show();
    }
}
