package xsna;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.R;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: AddRoomToCallDialogFragment.kt */
/* loaded from: classes7.dex */
public final class ln0 extends dw20 {
    public static final Pattern h1 = Patterns.WEB_URL;
    public final pn0 f1 = new pn0(0);
    public final on0 g1 = new on0();

    public static boolean Yn(String str) {
        if (h1.matcher(str).matches()) {
            List<String> pathSegments = Uri.parse(str).getPathSegments();
            if (pathSegments.size() >= 3 && epx.f(pathSegments.get(0), NotificationCompat.CATEGORY_CALL) && epx.f(pathSegments.get(1), "join")) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        mhy.d(getView());
        ((io.reactivex.rxjava3.disposables.b) this.f1.b).dispose();
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        ClipData primaryClip;
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_add_room_to_call_by_link_layout, (ViewGroup) null, false);
        EditText editText = (EditText) inflate.findViewById(R.id.insert_link);
        TextView textView = (TextView) inflate.findViewById(R.id.continue_btn);
        Context requireContext = requireContext();
        ClipboardManager clipboardManager = (ClipboardManager) requireContext.getSystemService("clipboard");
        if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() > 0) {
            String obj = primaryClip.getItemAt(0).coerceToText(requireContext).toString();
            if (Yn(obj)) {
                editText.setText(obj);
            }
        }
        b0 b0Var = new b0(editText, textView, this);
        editText.addTextChangedListener(new jn0(b0Var));
        jjc.g(textView, new hn0(0, editText, this));
        b0Var.run();
        dw20.Rn(this, inflate, 6);
        return super.yn(bundle);
    }
}
