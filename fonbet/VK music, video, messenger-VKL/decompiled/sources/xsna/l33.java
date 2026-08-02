package xsna;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import xsna.chj;

/* compiled from: AppCompatReceiveContentHelper.java */
/* loaded from: classes11.dex */
public final class l33 {

    /* compiled from: AppCompatReceiveContentHelper.java */
    public static final class a {
        public static boolean a(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
            chj.b bVar;
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                ClipData clipData = dragEvent.getClipData();
                if (Build.VERSION.SDK_INT >= 31) {
                    bVar = new chj.a(clipData, 3);
                } else {
                    chj.c cVar = new chj.c();
                    cVar.a = clipData;
                    cVar.b = 3;
                    bVar = cVar;
                }
                iut0.m(textView, bVar.build());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        public static boolean b(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
            chj.b bVar;
            activity.requestDragAndDropPermissions(dragEvent);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                bVar = new chj.a(clipData, 3);
            } else {
                chj.c cVar = new chj.c();
                cVar.a = clipData;
                cVar.b = 3;
                bVar = cVar;
            }
            iut0.m(view, bVar.build());
            return true;
        }
    }

    public static boolean a(@NonNull AppCompatEditText appCompatEditText, @NonNull DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && iut0.h(appCompatEditText) != null) {
            Context context = appCompatEditText.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                appCompatEditText.toString();
                return false;
            }
            if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                return a.a(dragEvent, appCompatEditText, activity);
            }
        }
        return false;
    }

    public static boolean b(@NonNull AppCompatEditText appCompatEditText, int i) {
        chj.b bVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || iut0.h(appCompatEditText) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) appCompatEditText.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                bVar = new chj.a(primaryClip, 1);
            } else {
                chj.c cVar = new chj.c();
                cVar.a = primaryClip;
                cVar.b = 1;
                bVar = cVar;
            }
            bVar.setFlags(i != 16908322 ? 1 : 0);
            iut0.m(appCompatEditText, bVar.build());
        }
        return true;
    }
}
