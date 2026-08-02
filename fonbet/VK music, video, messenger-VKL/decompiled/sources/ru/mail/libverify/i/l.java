package ru.mail.libverify.i;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.TypedValue;
import ru.mail.libverify.R;
import xsna.dbg0;

/* loaded from: classes9.dex */
public final class l {
    public static final AlertDialog a(Context context, AlertDialog.Builder builder) {
        final AlertDialog create = builder.create();
        Resources resources = context.getResources();
        int i = R.color.libverify_settings_color;
        Integer num = null;
        try {
            ThreadLocal<TypedValue> threadLocal = dbg0.a;
            num = Integer.valueOf(resources.getColor(i, null));
        } catch (Resources.NotFoundException unused) {
        }
        if (num != null) {
            final int intValue = num.intValue();
            create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.w3z0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    ru.mail.libverify.i.l.a(create, intValue, dialogInterface);
                }
            });
        }
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AlertDialog alertDialog, int i, DialogInterface dialogInterface) {
        alertDialog.getButton(-1).setTextColor(i);
        alertDialog.getButton(-2).setTextColor(i);
    }
}
