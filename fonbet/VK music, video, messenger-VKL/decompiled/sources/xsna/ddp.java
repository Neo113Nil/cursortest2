package xsna;

import android.widget.EditText;
import androidx.annotation.NonNull;

/* compiled from: EmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class ddp {
    public final a a;

    /* compiled from: EmojiEditTextHelper.java */
    public static class a extends b {
        public final EditText a;
        public final eep b;

        public a(@NonNull EditText editText) {
            this.a = editText;
            eep eepVar = new eep(editText);
            this.b = eepVar;
            editText.addTextChangedListener(eepVar);
            if (edp.b == null) {
                synchronized (edp.a) {
                    try {
                        if (edp.b == null) {
                            edp edpVar = new edp();
                            try {
                                edp.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, edp.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            edp.b = edpVar;
                        }
                    } finally {
                    }
                }
            }
            editText.setEditableFactory(edp.b);
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    public static class b {
    }

    public ddp(@NonNull EditText editText) {
        this.a = new a(editText);
    }
}
