package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.text.ClipboardManager;
import android.widget.Toast;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ebz implements DialogInterface.OnClickListener {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ gzs c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ String e;

    public /* synthetic */ ebz(ArrayList arrayList, gzs gzsVar, Context context, String str) {
        this.b = arrayList;
        this.c = gzsVar;
        this.d = context;
        this.e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = (String) this.b.get(i);
        int hashCode = str.hashCode();
        if (hashCode != 3059573) {
            if (hashCode == 3417674 && str.equals("open")) {
                this.c.invoke();
                return;
            }
            return;
        }
        if (str.equals("copy")) {
            Context context = this.d;
            ((ClipboardManager) context.getSystemService("clipboard")).setText(this.e);
            Toast.makeText(context, R.string.vk_text_copied, 0).show();
        }
    }
}
