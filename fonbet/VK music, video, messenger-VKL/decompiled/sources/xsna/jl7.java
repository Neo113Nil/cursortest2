package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.bonus.StickerStockItemDiscount;
import xsna.ngv0;
import xsna.nl7;
import xsna.tlo0;

/* compiled from: BonusRewardHolderDs.kt */
/* loaded from: classes5.dex */
public final class jl7 extends vfz<ol7> {
    public final ql7 l;
    public final bpn0 m;
    public final bpn0 n;
    public final VkRichCell o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jl7(ViewGroup viewGroup, ql7 ql7Var) {
        super(r0);
        VkRichCell vkRichCell = new VkRichCell(viewGroup.getContext(), null, 6, 0);
        vkRichCell.setId(View.generateViewId());
        vkRichCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.l = ql7Var;
        this.m = new bpn0(new pr1(3));
        this.n = new bpn0(new i9(5));
        bpn0 bpn0Var = new bpn0(new d1(4));
        VkRichCell vkRichCell2 = (VkRichCell) this.itemView;
        vkRichCell2.setLeftMainPictureController(new nl7.b(((Number) bpn0Var.getValue()).floatValue()));
        vkRichCell2.setRightExtraViewController(new a.C3123a());
        this.o = vkRichCell2;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(ol7 ol7Var) {
        ol7 ol7Var2 = ol7Var;
        boolean z = ol7Var2.c;
        StickerStockItemDiscount stickerStockItemDiscount = ol7Var2.b;
        ImageList imageList = stickerStockItemDiscount.c;
        VkCell.Left.b bVar = new VkCell.Left.b(new VkCell.Left.Main.d(new nl7.a(imageList != null ? imageList.Hb(VkCell.Left.Main.Size.Large.k(this.itemView.getContext())) : null, z), VkCell.Left.Main.Size.Large), null);
        VkRichCell vkRichCell = this.o;
        vkRichCell.setLeft(bVar);
        tlo0.h d = oq.d(tlo0.Companion, stickerStockItemDiscount.b);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        vgv0 vgv0Var = new vgv0(d, (ngv0.a) null, (ngv0) null, 0, 14);
        String str = stickerStockItemDiscount.d;
        if (str == null) {
            str = "";
        }
        vkRichCell.setMiddle(new pgv0(vgv0Var, null, new qgv0(new tlo0.h(str), (ngv0.a) null, (ngv0.a) null, 0, 14), null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE));
        kl7 kl7Var = (kl7) this.m.getValue();
        bpn0 bpn0Var = this.n;
        vkRichCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.d(kl7Var, new Size(((Number) bpn0Var.getValue()).intValue(), ((Number) bpn0Var.getValue()).intValue())), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29));
        if (!z) {
            bwt0.i0(this.itemView, new il7(0, this, ol7Var2));
        } else {
            this.itemView.setOnClickListener(null);
            this.itemView.setClickable(false);
        }
    }

    /* compiled from: BonusRewardHolderDs.kt */
    public static final class a implements VkCell.d {
        public final View a;

        /* compiled from: BonusRewardHolderDs.kt */
        /* renamed from: xsna.jl7$a$a, reason: collision with other inner class name */
        public static final class C3123a implements VkCell.e {
            @Override // com.vk.core.view.components.cell.VkCell.e
            public final VkCell.d create(Context context) {
                return new a(context);
            }
        }

        public a(Context context) {
            this.a = new View(context);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
        }
    }
}
