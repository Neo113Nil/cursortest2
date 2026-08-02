package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.view.Window;
import com.vk.im.popup.Popup;
import com.vk.im.popup.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.u3z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class fzb0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fzb0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                com.vk.im.popup.b bVar = (com.vk.im.popup.b) this.c;
                Popup.c cVar = (Popup.c) this.d;
                final gzs gzsVar = (gzs) this.e;
                b.C1130b c1130b = bVar.c;
                Context context = bVar.a;
                CharSequence charSequence = cVar.a;
                int i = cVar.b;
                CharSequence charSequence2 = cVar.c;
                nuv nuvVar = new nuv(bVar, 21);
                if (i != 0) {
                    charSequence2 = context.getString(i);
                }
                ner0 ner0Var = new ner0(context, R.style.VkIm_Dialog_Progress);
                Window window = ner0Var.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(e3m.e(R.attr.im_bg_modal_dialog, context));
                }
                ner0Var.setTitle(charSequence);
                ner0Var.setMessage(charSequence2);
                ner0Var.setIndeterminate(true);
                ner0Var.setCancelable(gzsVar != null);
                ner0Var.setCanceledOnTouchOutside(false);
                ner0Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xsna.qyb0
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        gzs gzsVar2 = gzs.this;
                        if (gzsVar2 != null) {
                            gzsVar2.invoke();
                        }
                    }
                });
                ner0Var.setOnDismissListener(new ktj(nuvVar, 1));
                c1130b.a();
                c1130b.b = ner0Var;
                ner0Var.show();
                break;
            default:
                jfz0 jfz0Var = (jfz0) this.c;
                bez0 bez0Var = (bez0) this.d;
                u3z0.a aVar = (u3z0.a) this.e;
                taz0 taz0Var = jfz0Var.b;
                ArrayList arrayList = jfz0Var.i;
                long j = bez0Var.a;
                e7z0 e7z0Var = bez0Var.d;
                arrayList.remove(Long.valueOf(j));
                boolean a = aVar.a();
                int i2 = aVar.a;
                if (a) {
                    taz0Var.b(j);
                } else if (i2 != 4) {
                    taz0Var.b(j);
                    e7z0Var.a("resolve resultCode=" + i2 + ", responseCode=" + aVar.c + ", error=" + aVar.d + ", " + e7z0Var.d);
                }
                jfz0Var.c();
                jfz0Var.b(null);
                break;
        }
    }
}
