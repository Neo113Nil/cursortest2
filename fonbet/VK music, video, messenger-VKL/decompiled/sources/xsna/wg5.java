package xsna;

import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.widget.EditText;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.drawing.gradient.StoryEditText;

/* compiled from: AutoMeasureWatcher.kt */
/* loaded from: classes16.dex */
public final class wg5 implements TextWatcher {
    public final EditText b;
    public final int c;
    public final int d;
    public final int e;
    public final com.vk.ecomm.catalog.impl.geo.a f;

    public wg5(StoryEditText storyEditText, int i, int i2, int i3, com.vk.ecomm.catalog.impl.geo.a aVar) {
        this.b = storyEditText;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = aVar == null ? new com.vk.ecomm.catalog.impl.geo.a(storyEditText.getPaint()) : aVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.b;
        Editable editableText = editText.getEditableText();
        int i4 = this.d - 1;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            com.vk.ecomm.catalog.impl.geo.a aVar = this.f;
            if (i5 > i4) {
                aVar.getClass();
                break;
            }
            i6 = (i5 + i4) >>> 1;
            TextPaint textPaint = (TextPaint) aVar.b;
            textPaint.setTextSize(i6);
            float measureText = textPaint.measureText(editText.getText().toString()) - this.e;
            if (measureText >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (measureText <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    break;
                }
                i6--;
                i4 = i6;
            } else {
                int i7 = i6 + 1;
                i6 = i5;
                i5 = i7;
            }
        }
        if (i6 >= this.c - 1) {
            editText.setTextSize(0, i6);
            return;
        }
        int i8 = i2 + i;
        int i9 = i + i3;
        if (i9 <= i8 || i9 > editableText.length()) {
            return;
        }
        editableText.delete(i8, i9);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
