package xsna;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.EditText;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class onj implements wzs {
    public final /* synthetic */ qnj b;
    public final /* synthetic */ View c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    public /* synthetic */ onj(qnj qnjVar, View view, float f, float f2) {
        this.b = qnjVar;
        this.c = view;
        this.d = f;
        this.e = f2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ClipData clipData;
        CharSequence charSequence;
        ClipData.Item itemAt;
        qnj qnjVar = this.b;
        Context context = qnjVar.b;
        View view = (View) obj;
        int intValue = ((Integer) obj2).intValue();
        View view2 = this.c;
        switch (intValue) {
            case R.string.copy:
                EditText editText = (EditText) view2;
                CharSequence subSequence = editText.getText().subSequence(editText.getSelectionStart(), editText.getSelectionEnd());
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(subSequence, subSequence));
                qnjVar.b(view);
                break;
            case R.string.cut:
                EditText editText2 = (EditText) view2;
                CharSequence subSequence2 = editText2.getText().subSequence(editText2.getSelectionStart(), editText2.getSelectionEnd());
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(subSequence2, subSequence2));
                editText2.getText().delete(editText2.getSelectionStart(), editText2.getSelectionEnd());
                qnjVar.b(view);
                break;
            case R.string.paste:
                EditText editText3 = (EditText) view2;
                try {
                    clipData = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
                } catch (Throwable unused) {
                    clipData = null;
                }
                if (clipData == null || (itemAt = clipData.getItemAt(0)) == null || (charSequence = itemAt.getText()) == null) {
                    charSequence = "";
                }
                drm0.V(editText3.getSelectionStart(), editText3.getSelectionEnd(), editText3.getText());
                editText3.getText().insert(editText3.getSelectionStart(), charSequence);
                editText3.setSelection(Math.min((charSequence.length() + editText3.getSelectionStart()) - 1, editText3.getText().length()));
                qnjVar.b(view);
                break;
            case R.string.selectAll:
                EditText editText4 = (EditText) view2;
                editText4.setSelection(0, editText4.getText().length());
                qnjVar.b(view);
                qnjVar.showContextMenuForChild(view2, this.d, this.e);
                break;
        }
        return s3q0.a;
    }
}
