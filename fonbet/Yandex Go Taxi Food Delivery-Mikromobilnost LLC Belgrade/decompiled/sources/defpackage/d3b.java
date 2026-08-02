package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import androidx.appcompat.app.AlertDialog;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.menu.c;
import defpackage.sls;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public final /* synthetic */ class d3b implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ f3b c;

    public /* synthetic */ d3b(c cVar, f3b f3bVar, int i) {
        this.a = i;
        this.b = cVar;
        this.c = f3bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = 3;
        zy11 zy11Var = zy11.a;
        f3b f3bVar = this.c;
        c cVar = this.b;
        switch (i) {
            case 0:
                c3b c3bVar = cVar.c;
                int i3 = oyh0.chat_leave_confirmation;
                final d3b d3bVar = new d3b(cVar, f3bVar, 4);
                AlertDialog.a aVar = new AlertDialog.a(c3bVar.c.getContext(), w0i0.Messaging_AlertDialog);
                aVar.c(i3);
                AlertDialog create = aVar.setPositiveButton(oyh0.button_yes, new DialogInterface.OnClickListener() { // from class: com.yandex.messaging.internal.menu.ChatHolderDialogMenuView$askYesNo$alertDialog$1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface p0, int p1) {
                        sls.this.invoke();
                    }
                }).setNegativeButton(oyh0.button_no, null).create();
                create.show();
                g8a1.i(create, c3bVar.a.a());
                break;
            case 1:
                b00 b00Var = cVar.b;
                ((Handler) b00Var.a.get()).post(new pz(b00Var, f3bVar.a, 1));
                break;
            case 2:
                b00 b00Var2 = cVar.b;
                ChatRequest chatRequest = f3bVar.a;
                a620 a620Var = a620.d;
                ((Handler) b00Var2.a.get()).post(new kz(b00Var2, chatRequest, new WeakReference(new od9(18, cVar)), a620Var, 1));
                break;
            case 3:
                b00 b00Var3 = cVar.b;
                ((Handler) b00Var3.a.get()).post(new qz(b00Var3, f3bVar.a, 0));
                break;
            case 4:
                b00 b00Var4 = cVar.b;
                ((Handler) b00Var4.a.get()).post(new oz(b00Var4, f3bVar.a, 2));
                break;
            case 5:
                sfl0 sfl0Var = cVar.d;
                new bae(a620.d, null, f3bVar.h);
                ((b0x) sfl0Var).c();
                break;
            case 6:
                c3b c3bVar2 = cVar.c;
                int i4 = oyh0.clear_chat_clarification_text;
                d3b d3bVar2 = new d3b(cVar, f3bVar, i2);
                AlertDialog.a aVar2 = new AlertDialog.a(c3bVar2.c.getContext(), w0i0.Messaging_AlertDialog);
                aVar2.c(i4);
                AlertDialog create2 = aVar2.setPositiveButton(oyh0.messaging_button_ok_text, new p97(1, d3bVar2)).setNegativeButton(oyh0.button_cancel, null).create();
                create2.show();
                g8a1.i(create2, c3bVar2.a.a());
                break;
            case 7:
                b00 b00Var5 = cVar.b;
                ((Handler) b00Var5.a.get()).post(new qz(b00Var5, f3bVar.a, 3));
                break;
            case 8:
                b00 b00Var6 = cVar.b;
                ((Handler) b00Var6.a.get()).post(new lz(2, b00Var6, f3bVar.a, a620.d));
                break;
            case 9:
                b00 b00Var7 = cVar.b;
                ((Handler) b00Var7.a.get()).post(new oz(b00Var7, f3bVar.a, 3));
                break;
            case 10:
                b00 b00Var8 = cVar.b;
                ((Handler) b00Var8.a.get()).post(new qz(b00Var8, f3bVar.a, 2));
                break;
            default:
                sfl0 sfl0Var2 = cVar.d;
                new mbq0(a620.d, f3bVar.b.b);
                sfl0Var2.getClass();
                break;
        }
        return zy11Var;
    }
}
