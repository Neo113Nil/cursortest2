package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.fullscreenbanners.BlockType;
import com.vk.fullscreenbanners.api.dto.blocks.FullScreenBannerBlock;

/* compiled from: FullScreenBannerOffsetsItemDecorations.kt */
/* loaded from: classes16.dex */
public final class ovs extends RecyclerView.n {
    public static final int b = iah0.a(10);
    public static final int c = iah0.a(16);
    public static final int d = iah0.a(20);
    public static final int e = iah0.a(22);
    public static final int f = iah0.a(28);
    public static final int g;

    /* compiled from: FullScreenBannerOffsetsItemDecorations.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockType.TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlockType.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        iah0.a(30);
        g = iah0.a(52);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i = a.$EnumSwitchMapping$0[((FullScreenBannerBlock) ((lvs) recyclerView.getAdapter()).c.c(recyclerView.getChildAdapterPosition(view))).b.ordinal()];
        int i2 = c;
        if (i == 1) {
            rect.set(i2, 0, i2, f);
            return;
        }
        if (i == 2) {
            int i3 = e;
            rect.set(i3, 0, i3, b);
            return;
        }
        int i4 = d;
        if (i == 3) {
            rect.set(i4, 0, i4, i2);
        } else if (i != 4) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(i4, 0, i4, g);
        }
    }
}
