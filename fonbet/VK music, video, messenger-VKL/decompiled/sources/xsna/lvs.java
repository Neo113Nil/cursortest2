package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.fullscreenbanners.BlockType;
import com.vk.fullscreenbanners.api.dto.blocks.FullScreenBannerBlock;

/* compiled from: FullScreenBannerAdapter.kt */
/* loaded from: classes16.dex */
public final class lvs extends zoj0<FullScreenBannerBlock, rvs> {
    public final pvs e;

    /* compiled from: FullScreenBannerAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockType.BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlockType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public lvs(pvs pvsVar) {
        this.e = pvsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        FullScreenBannerBlock fullScreenBannerBlock = (FullScreenBannerBlock) this.c.c(i);
        BlockType.a aVar = BlockType.Companion;
        String h = fullScreenBannerBlock.b.h();
        aVar.getClass();
        return BlockType.a.a(h).ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((rvs) e0Var).l.R((FullScreenBannerBlock) this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        de cwuVar;
        int i2 = a.$EnumSwitchMapping$0[BlockType.values()[i].ordinal()];
        if (i2 == 1) {
            cwuVar = new cwu();
        } else if (i2 == 2) {
            cwuVar = new eco0();
        } else if (i2 == 3) {
            pvs pvsVar = this.e;
            cwuVar = new ps80(pvsVar.b, pvsVar.c);
        } else {
            if (i2 != 4) {
                throw new RuntimeException();
            }
            cwuVar = new zfw();
        }
        return new rvs(viewGroup, cwuVar);
    }
}
