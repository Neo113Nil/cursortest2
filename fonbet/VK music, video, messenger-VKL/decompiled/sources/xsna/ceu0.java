package xsna;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.vk.superapp.browser.internal.ui.communitypicker.VkCommunityPickerActivity;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ceu0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ ceu0(KeyEvent.Callback callback, int i) {
        this.b = i;
        this.c = callback;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i = this.b;
        KeyEvent.Callback callback = this.c;
        switch (i) {
            case 0:
                EditText etInput = ((n3x) callback).getEtInput();
                mhy.j(etInput);
                etInput.setSelection(etInput.getText().length());
                break;
            default:
                com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) callback;
                int i2 = VkCommunityPickerActivity.g;
                View findViewById = bVar.findViewById(R.id.design_bottom_sheet);
                if (findViewById != null) {
                    bVar.o().W(findViewById.getHeight(), false);
                    bVar.o().X(3);
                    int i3 = iah0.f().widthPixels;
                    int i4 = VkCommunityPickerActivity.g;
                    if (i3 > i4) {
                        findViewById.getLayoutParams().width = i4;
                    }
                    findViewById.getParent().requestLayout();
                    break;
                }
                break;
        }
    }
}
