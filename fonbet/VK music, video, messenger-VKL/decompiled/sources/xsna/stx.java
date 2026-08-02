package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.ljw;
import xsna.tlo0;

/* compiled from: ItemActionLinkView.kt */
/* loaded from: classes16.dex */
public final class stx extends FrameLayout implements otx {
    public ntx b;
    public final VkCell c;

    public stx(Context context) {
        super(context, null, 0);
        VkCell vkCell = new VkCell(context, null, 6, 0);
        vkCell.setLeftMainPictureController(new nmw());
        vkCell.setOnClickListener(new w16(this, 5));
        this.c = vkCell;
        addView(vkCell);
    }

    @Override // xsna.cux
    public void setActionVisibility(boolean z) {
        if (z) {
            VkCell.Right.c cVar = VkCell.Right.Companion;
            VkCell.Right.a.b.c cVar2 = new VkCell.Right.a.b.c(new gko(R.drawable.vk_icon_cancel_24), Integer.valueOf(R.attr.vk_ui_icon_medium), 2);
            this.c.setRight(VkCell.Right.c.a(cVar, new VkCell.Right.a.b(null, new cwg(this, 29), VkButton.Appearance.Neutral, VkButton.Mode.Tertiary, VkButton.Size.Medium, cVar2, null, null, 1985), null, null, null, 30));
        }
    }

    @Override // xsna.otx
    public void setItemClickEnabled(boolean z) {
        this.c.setClickable(z);
    }

    @Override // xsna.otx
    public void setLoadPhoto(String str) {
        this.c.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new qmw(new ljw.b(str)), VkCell.Left.Main.Size.Large)));
    }

    @Override // xsna.otx
    public void setPhotoPlaceholder(int i) {
        this.c.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new qmw(new ljw.a(i)), VkCell.Left.Main.Size.Large)));
    }

    @Override // xsna.otx
    public void setSelectionVisibility(boolean z) {
        VkCell vkCell = this.c;
        if (!z) {
            vkCell.setRight((VkCell.Right.d) null);
            return;
        }
        VkCell.Right.c cVar = VkCell.Right.Companion;
        VkCell.Right.a.b.c cVar2 = new VkCell.Right.a.b.c(new gko(R.drawable.vk_icon_done_outline_24), Integer.valueOf(R.attr.vk_ui_icon_accent), 2);
        vkCell.setRight(VkCell.Right.c.a(cVar, new VkCell.Right.a.b(null, new nd1(17), VkButton.Appearance.Accent, VkButton.Mode.Tertiary, VkButton.Size.Medium, cVar2, null, null, 1985), null, null, null, 30));
    }

    @Override // xsna.otx
    public final void z4(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        VkCell.Middle.c cVar = null;
        VkCell.Middle.e eVar = drm0.N(charSequence) ? null : new VkCell.Middle.e(u11.f(tlo0.Companion, charSequence), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
        VkCell.Middle.d dVar = drm0.N(charSequence2) ? null : new VkCell.Middle.d(u11.f(tlo0.Companion, charSequence2), (gzs) null, 1, TextUtils.TruncateAt.END, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50);
        if (!drm0.N(charSequence3)) {
            tlo0.h f = u11.f(tlo0.Companion, charSequence3);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            cVar = new VkCell.Middle.c(f, null, 1, 2);
        }
        this.c.setMiddle(VkCell.Middle.a.a(aVar, eVar, dVar, cVar, 8));
    }

    @Override // xsna.dc6
    public ntx getPresenter() {
        return this.b;
    }

    @Override // xsna.dc6
    public void setPresenter(ntx ntxVar) {
        this.b = ntxVar;
    }

    @Override // xsna.otx
    public void setActionLinkClicks(int i) {
    }

    @Override // xsna.otx
    public void setActionLinkViews(int i) {
    }
}
