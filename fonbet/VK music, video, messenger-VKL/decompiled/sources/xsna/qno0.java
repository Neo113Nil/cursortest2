package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.MetricAffectingSpan;
import android.widget.TextView;

/* compiled from: TextViewTextChangeEventObservable.kt */
/* loaded from: classes5.dex */
public final class qno0 extends gzw<pno0> {
    public final TextView b;

    public qno0(TextView textView) {
        this.b = textView;
    }

    @Override // xsna.gzw
    public final pno0 M0() {
        TextView textView = this.b;
        return new ono0(textView, textView.getText(), 0, 0, 0);
    }

    @Override // xsna.gzw
    public final void N0(io.reactivex.rxjava3.core.v<? super pno0> vVar) {
        TextView textView = this.b;
        a aVar = new a(textView, vVar);
        vVar.onSubscribe(aVar);
        textView.addTextChangedListener(aVar);
    }

    /* compiled from: TextViewTextChangeEventObservable.kt */
    public static final class a extends io.reactivex.rxjava3.android.b implements TextWatcher {
        public final TextView c;
        public final io.reactivex.rxjava3.core.v<? super pno0> d;

        public a(TextView textView, io.reactivex.rxjava3.core.v<? super pno0> vVar) {
            this.c = textView;
            this.d = vVar;
        }

        @Override // io.reactivex.rxjava3.android.b
        public final void a() {
            this.c.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            for (Object obj : editable.getSpans(0, editable.length(), MetricAffectingSpan.class)) {
                editable.removeSpan((MetricAffectingSpan) obj);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.b.get()) {
                return;
            }
            this.d.onNext(new ono0(this.c, charSequence, i, i2, i3));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
