package xsna;

import android.content.Context;
import com.vk.stickers.api.styles.StickerColorToken;
import com.vk.stickers.api.styles.StickerCommonStyle;
import kotlin.LazyThreadSafetyMode;

/* compiled from: StickerColorsImpl.kt */
/* loaded from: classes6.dex */
public final class y2l0 implements v2l0 {
    public final Integer a;
    public final Object b;
    public final Object c;
    public final Object d;

    /* compiled from: StickerColorsImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickerCommonStyle.values().length];
            try {
                iArr[StickerCommonStyle.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerCommonStyle.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public y2l0(Integer num) {
        this.a = num;
        r rVar = new r(28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, rVar);
        this.c = msy.a(lazyThreadSafetyMode, new fd90(8));
        this.d = msy.a(lazyThreadSafetyMode, new iia0(this, 21));
    }

    @Override // xsna.v2l0
    public final Integer a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.v2l0
    public final int b(Context context, StickerCommonStyle stickerCommonStyle, StickerColorToken stickerColorToken) {
        int i = a.$EnumSwitchMapping$0[stickerCommonStyle.ordinal()];
        u2l0 u2l0Var = i != 1 ? i != 2 ? (u2l0) this.d.getValue() : (u2l0) this.c.getValue() : (u2l0) this.b.getValue();
        if (u2l0Var != null) {
            return u2l0Var.a(context, stickerColorToken);
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.v2l0
    public final boolean c() {
        return ((u2l0) this.d.getValue()) != null;
    }
}
