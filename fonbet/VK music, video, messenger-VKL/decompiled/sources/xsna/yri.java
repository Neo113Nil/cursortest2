package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.vk.im.engine.models.typing.ComposingType;

/* compiled from: ComposingDrawable.kt */
/* loaded from: classes2.dex */
public final class yri extends zko {
    public final uup0 c;
    public final rhf0 d;
    public final hhi0 e;
    public ComposingType f;

    /* compiled from: ComposingDrawable.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComposingType.values().length];
            try {
                iArr[ComposingType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComposingType.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComposingType.VIDEO_MSG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yri(Context context, int i) {
        super(null);
        this.c = new uup0(i);
        this.d = new rhf0(i);
        this.e = new hhi0(context, i);
        this.f = ComposingType.FILE;
        a(ComposingType.TEXT);
    }

    public final void a(ComposingType composingType) {
        if (this.f == composingType) {
            return;
        }
        this.f = composingType;
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setVisible(false, false);
        }
        int i = a.$EnumSwitchMapping$0[composingType.ordinal()];
        Drawable drawable2 = i != 1 ? (i == 2 || i == 3) ? this.d : this.e : this.c;
        Drawable drawable3 = this.b;
        if (drawable3 != null) {
            drawable3.setCallback(null);
        }
        this.b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override // xsna.zko, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.setBounds(rect);
        this.d.setBounds(rect);
        this.e.setBounds(rect);
    }

    @Override // xsna.zko, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return this.b.setVisible(z, z2);
    }
}
