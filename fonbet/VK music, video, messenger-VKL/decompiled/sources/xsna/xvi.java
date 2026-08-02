package xsna;

import android.widget.CheckBox;
import android.widget.CompoundButton;

/* compiled from: CompoundButtonStateChangeObservable.kt */
/* loaded from: classes5.dex */
public final class xvi extends gzw<Boolean> {
    public final CompoundButton b;

    /* compiled from: CompoundButtonStateChangeObservable.kt */
    public static final class a extends io.reactivex.rxjava3.android.b implements CompoundButton.OnCheckedChangeListener {
        public final CompoundButton c;
        public final io.reactivex.rxjava3.core.v<? super Boolean> d;

        public a(CompoundButton compoundButton, io.reactivex.rxjava3.core.v<? super Boolean> vVar) {
            this.c = compoundButton;
            this.d = vVar;
        }

        @Override // io.reactivex.rxjava3.android.b
        public final void a() {
            this.c.setOnCheckedChangeListener(null);
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (this.b.get()) {
                return;
            }
            this.d.onNext(Boolean.valueOf(z));
        }
    }

    public xvi(CheckBox checkBox) {
        this.b = checkBox;
    }

    @Override // xsna.gzw
    public final Boolean M0() {
        return Boolean.valueOf(this.b.isChecked());
    }

    @Override // xsna.gzw
    public final void N0(io.reactivex.rxjava3.core.v<? super Boolean> vVar) {
        CompoundButton compoundButton = this.b;
        a aVar = new a(compoundButton, vVar);
        vVar.onSubscribe(aVar);
        compoundButton.setOnCheckedChangeListener(aVar);
    }
}
