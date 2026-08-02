package defpackage;

import android.app.Activity;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.yandex.messaging.ui.settings.c;

/* loaded from: classes15.dex */
public abstract class ag6 {
    public final BottomSheetDialog a;

    public ag6(Activity activity, int i, String str, c cVar) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(activity, i);
        bottomSheetDialog.setContentView(olh0.msg_d_bottom_sheet_list);
        bottomSheetDialog.setCanceledOnTouchOutside(true);
        this.a = bottomSheetDialog;
        TextView textView = (TextView) bottomSheetDialog.findViewById(e9h0.dialog_title);
        if (textView != null) {
            textView.setText(str);
        }
        RecyclerView recyclerView = (RecyclerView) bottomSheetDialog.findViewById(e9h0.dialog_recycler_view);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(activity));
            recyclerView.setAdapter(cVar);
        }
        int i2 = 0;
        bottomSheetDialog.setOnCancelListener(new yf6(i2, this));
        bottomSheetDialog.setOnDismissListener(new zf6(i2, this));
    }
}
