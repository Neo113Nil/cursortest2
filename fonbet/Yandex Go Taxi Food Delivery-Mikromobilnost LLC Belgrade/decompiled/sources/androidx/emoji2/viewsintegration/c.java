package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import defpackage.dai0;

/* loaded from: classes.dex */
public final class c extends dai0 {
    public final TextView d;
    public final EmojiInputFilter e;
    public boolean f = true;

    public c(TextView textView) {
        this.d = textView;
        this.e = new EmojiInputFilter(textView);
    }

    @Override // defpackage.dai0
    public final void G(boolean z) {
        if (z) {
            P();
        }
    }

    @Override // defpackage.dai0
    public final void H(boolean z) {
        this.f = z;
        P();
        TextView textView = this.d;
        textView.setFilters(q(textView.getFilters()));
    }

    @Override // defpackage.dai0
    public final void P() {
        TextView textView = this.d;
        textView.setTransformationMethod(Q(textView.getTransformationMethod()));
    }

    @Override // defpackage.dai0
    public final TransformationMethod Q(TransformationMethod transformationMethod) {
        return this.f ? ((transformationMethod instanceof EmojiTransformationMethod) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new EmojiTransformationMethod(transformationMethod) : transformationMethod instanceof EmojiTransformationMethod ? ((EmojiTransformationMethod) transformationMethod).getOriginalTransformationMethod() : transformationMethod;
    }

    @Override // defpackage.dai0
    public final InputFilter[] q(InputFilter[] inputFilterArr) {
        if (!this.f) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof EmojiInputFilter) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            EmojiInputFilter emojiInputFilter = this.e;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = emojiInputFilter;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == emojiInputFilter) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.dai0
    public final boolean x() {
        return this.f;
    }
}
