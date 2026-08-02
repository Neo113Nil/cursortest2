package xsna;

import androidx.appcompat.app.AppCompatActivity;
import com.vk.dto.hints.Hint;
import java.lang.ref.WeakReference;

/* compiled from: ProtectHintUiModel.kt */
/* loaded from: classes5.dex */
public final class g8e0 {
    public final Hint a;
    public final WeakReference<? extends AppCompatActivity> b;

    public g8e0(Hint hint, WeakReference<? extends AppCompatActivity> weakReference) {
        this.a = hint;
        this.b = weakReference;
    }

    public final WeakReference<? extends AppCompatActivity> a() {
        return this.b;
    }
}
