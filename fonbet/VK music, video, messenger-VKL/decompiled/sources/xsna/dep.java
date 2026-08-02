package xsna;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: EmojiTextViewHelper.java */
/* loaded from: classes.dex */
public final class dep {
    public final b a;

    /* compiled from: EmojiTextViewHelper.java */
    public static class a extends b {
        public final TextView a;
        public final ndp b;
        public boolean c = true;

        public a(TextView textView) {
            this.a = textView;
            this.b = new ndp(textView);
        }

        @Override // xsna.dep.b
        @NonNull
        public final InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            if (!this.c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i = 0; i < inputFilterArr.length; i++) {
                    InputFilter inputFilter = inputFilterArr[i];
                    if (inputFilter instanceof ndp) {
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
                ndp ndpVar = this.b;
                if (i4 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = ndpVar;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i4] == ndpVar) {
                    return inputFilterArr;
                }
                i4++;
            }
        }

        @Override // xsna.dep.b
        public final boolean b() {
            return this.c;
        }

        @Override // xsna.dep.b
        public final void c(boolean z) {
            if (z) {
                TextView textView = this.a;
                textView.setTransformationMethod(e(textView.getTransformationMethod()));
            }
        }

        @Override // xsna.dep.b
        public final void d(boolean z) {
            this.c = z;
            TextView textView = this.a;
            textView.setTransformationMethod(e(textView.getTransformationMethod()));
            textView.setFilters(a(textView.getFilters()));
        }

        @Override // xsna.dep.b
        @Nullable
        public final TransformationMethod e(@Nullable TransformationMethod transformationMethod) {
            return this.c ? transformationMethod instanceof fep ? transformationMethod : transformationMethod instanceof PasswordTransformationMethod ? transformationMethod : new fep(transformationMethod) : transformationMethod instanceof fep ? ((fep) transformationMethod).a() : transformationMethod;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    public static class b {
        @NonNull
        public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z) {
            throw null;
        }

        public void d(boolean z) {
            throw null;
        }

        @Nullable
        public TransformationMethod e(@Nullable TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    public static class c extends b {
        public final a a;

        public c(TextView textView) {
            this.a = new a(textView);
        }

        @Override // xsna.dep.b
        @NonNull
        public final InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            return !androidx.emoji2.text.c.d() ? inputFilterArr : this.a.a(inputFilterArr);
        }

        @Override // xsna.dep.b
        public final boolean b() {
            return this.a.c;
        }

        @Override // xsna.dep.b
        public final void c(boolean z) {
            if (androidx.emoji2.text.c.d()) {
                this.a.c(z);
            }
        }

        @Override // xsna.dep.b
        public final void d(boolean z) {
            boolean d = androidx.emoji2.text.c.d();
            a aVar = this.a;
            if (d) {
                aVar.d(z);
            } else {
                aVar.c = z;
            }
        }

        @Override // xsna.dep.b
        @Nullable
        public final TransformationMethod e(@Nullable TransformationMethod transformationMethod) {
            return !androidx.emoji2.text.c.d() ? transformationMethod : this.a.e(transformationMethod);
        }
    }

    public dep(@NonNull TextView textView) {
        this.a = new c(textView);
    }
}
