package xsna;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R$styleable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.ddp;
import xsna.eep;

/* compiled from: AppCompatEmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class e33 {

    @NonNull
    public final EditText a;

    @NonNull
    public final ddp b;

    public e33(@NonNull EditText editText) {
        this.a = editText;
        this.b = new ddp(editText);
    }

    @Nullable
    public final KeyListener a(@Nullable KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        this.b.a.getClass();
        if (keyListener instanceof pdp) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new pdp(keyListener);
    }

    public final void b(@Nullable AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, R$styleable.i, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Nullable
    public final mdp c(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        ddp ddpVar = this.b;
        if (inputConnection == null) {
            ddpVar.getClass();
            inputConnection = null;
        } else {
            ddp.a aVar = ddpVar.a;
            aVar.getClass();
            if (!(inputConnection instanceof mdp)) {
                inputConnection = new mdp(aVar.a, inputConnection, editorInfo);
            }
        }
        return (mdp) inputConnection;
    }

    public final void d(boolean z) {
        eep eepVar = this.b.a.b;
        if (eepVar.d != z) {
            if (eepVar.c != null) {
                androidx.emoji2.text.c a = androidx.emoji2.text.c.a();
                eep.a aVar = eepVar.c;
                a.getClass();
                obr.e(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(aVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            eepVar.d = z;
            if (z) {
                eep.a(eepVar.b, androidx.emoji2.text.c.a().c());
            }
        }
    }
}
