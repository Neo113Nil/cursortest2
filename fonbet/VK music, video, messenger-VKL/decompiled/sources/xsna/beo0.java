package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper.java */
/* loaded from: classes13.dex */
public final class beo0 {
    public float c;
    public float d;

    @Nullable
    public final WeakReference<b> f;

    @Nullable
    public ubo0 g;
    public final TextPaint a = new TextPaint(1);
    public final a b = new a();
    public boolean e = true;

    /* compiled from: TextDrawableHelper.java */
    public class a extends de {
        public a() {
        }

        @Override // xsna.de
        public final void m0(int i) {
            beo0 beo0Var = beo0.this;
            beo0Var.e = true;
            b bVar = beo0Var.f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // xsna.de
        public final void n0(@NonNull Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            beo0 beo0Var = beo0.this;
            beo0Var.e = true;
            b bVar = beo0Var.f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    public interface b {
        void a();

        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public beo0(@Nullable b bVar) {
        this.f = new WeakReference<>(null);
        this.f = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        if (!this.e) {
            return this.c;
        }
        b(str);
        return this.c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.a;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            f = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = f;
        this.e = false;
    }

    public final void c(@Nullable ubo0 ubo0Var, Context context) {
        if (this.g != ubo0Var) {
            this.g = ubo0Var;
            if (ubo0Var != null) {
                TextPaint textPaint = this.a;
                a aVar = this.b;
                ubo0Var.f(context, textPaint, aVar);
                b bVar = this.f.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                ubo0Var.e(context, textPaint, aVar);
                this.e = true;
            }
            b bVar2 = this.f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
