package xsna;

import android.widget.EditText;
import android.widget.TextView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class p3l implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;

    public /* synthetic */ p3l(int i) {
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = this.c;
        switch (i) {
            case 0:
                EditText editText = (EditText) obj;
                TextView textView = (TextView) obj2;
                String[] strArr = DebugDevSettingsFragment.t0;
                editText.setInputType(2);
                editText.setHint("Slot id");
                editText.setText(i2 != 0 ? lhg.a(i2, "") : "");
                editText.addTextChangedListener(new r4l(textView));
                return null;
            default:
                ((Integer) obj).intValue();
                return Boolean.valueOf(((Integer) obj2).intValue() <= i2);
        }
    }

    public /* synthetic */ p3l(DebugDevSettingsFragment debugDevSettingsFragment, int i) {
        this.c = i;
    }
}
