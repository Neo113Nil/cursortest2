package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.stickers.bridge.GiftData;
import com.vkontakte.android.attachments.StickerAttachment;

/* compiled from: BaseStickerHolder.kt */
/* loaded from: classes4.dex */
public abstract class do6 extends m56<StickerAttachment> implements View.OnClickListener {
    public tdg D;
    public UserId E;

    public do6(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.itemView.setOnClickListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // xsna.m56, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onClick(View view) {
        boolean z;
        tdg tdgVar;
        StickerAttachment stickerAttachment = (StickerAttachment) this.C;
        if (stickerAttachment == null) {
            return;
        }
        StickerItem stickerItem = stickerAttachment.f;
        int i = stickerAttachment.g;
        tdg tdgVar2 = this.D;
        if (tdgVar2 != null) {
            boolean z2 = true;
            if (tdgVar2.t2()) {
                t6g0 t6g0Var = t6g0.b;
                kcl0 d = t6g0.d();
                StickerStockItem I = d.I(i);
                if (I != null) {
                    UserId userId = this.E;
                    boolean a = userId != null ? o25.a().a(userId) : false;
                    if (d.F0(I) && I.h) {
                        VmojiAvatar vmojiAvatar = I.H;
                        if (epx.f(vmojiAvatar != null ? vmojiAvatar.Ab() : null, stickerItem.j)) {
                            z = true;
                            if (I.Q && !a) {
                                z2 = false;
                            }
                            if (z && z2) {
                                tdgVar = this.D;
                                if (tdgVar == null) {
                                    tdgVar.x(i);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    z = false;
                    if (I.Q) {
                        z2 = false;
                    }
                    if (z) {
                        tdgVar = this.D;
                        if (tdgVar == null) {
                        }
                    }
                }
                String str = stickerItem.j;
                UserId userId2 = this.E;
                if (str == null || userId2 == null || !fkq0.d(userId2)) {
                    zal0.H(g2v.d().a(), this.itemView.getContext(), stickerAttachment.g, GiftData.d, null, "comment", null, 96);
                } else {
                    g2v.d().a().t(this.itemView.getContext(), stickerAttachment.g, userId2, str, "comment");
                }
            }
        }
    }
}
