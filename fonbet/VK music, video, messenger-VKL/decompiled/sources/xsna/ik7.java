package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.stickers.bonus.StickersBonusBalance;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.vas.design.view.sticker.BonusProgressView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: BonusCatalogPointsHolder.kt */
/* loaded from: classes5.dex */
public final class ik7 extends qf6 {
    public final BonusCatalogFragment l;
    public final TextView m;
    public final TextView n;
    public final BonusProgressView o;
    public final TextView p;
    public final View q;

    public ik7(ViewGroup viewGroup, BonusCatalogFragment bonusCatalogFragment) {
        super(viewGroup, R.layout.stickers_bonus_catalog_points_item_ds, 1);
        this.l = bonusCatalogFragment;
        this.m = (TextView) this.itemView.findViewById(R.id.points);
        this.n = (TextView) this.itemView.findViewById(R.id.points_hint);
        this.o = (BonusProgressView) this.itemView.findViewById(R.id.progress);
        TextView textView = (TextView) this.itemView.findViewById(R.id.progress_hint);
        this.p = textView;
        this.q = this.itemView.findViewById(R.id.help);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = textView.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = textView.getMeasuredHeight();
        f4m.a(textView, new hk7(textView, ref$IntRef, ref$IntRef2, this));
        bwt0.i0(this.itemView, new com.vk.movika.sdk.base.observable.a(this, 7));
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        StickersBonusBalance stickersBonusBalance = ((jk7) hfzVar).c;
        this.m.setText(String.valueOf(stickersBonusBalance.b));
        float floatValue = ((Number) stickersBonusBalance.g.getValue()).floatValue();
        int i = BonusProgressView.i;
        BonusProgressView bonusProgressView = this.o;
        ValueAnimator valueAnimator = bonusProgressView.g;
        valueAnimator.cancel();
        int i2 = 1;
        valueAnimator.setFloatValues(bonusProgressView.h, floatValue);
        valueAnimator.start();
        bonusProgressView.invalidate();
        int i3 = stickersBonusBalance.b;
        int i4 = stickersBonusBalance.e;
        TextView textView = this.p;
        TextView textView2 = this.n;
        if (i3 >= i4) {
            textView.setText(this.itemView.getContext().getString(R.string.stickers_bonus_catalog_points_hint_3));
            textView.getPaint().setShader(zk7.b(Integer.valueOf(textView.getMeasuredWidth())));
            String t = d370.t(this.itemView.getContext(), stickersBonusBalance, true);
            if (t == null) {
                f4m.j(textView2);
            } else {
                textView2.setText(t);
                textView2.setVisibility(0);
            }
        } else {
            Integer num = stickersBonusBalance.f;
            if ((num != null ? num.intValue() : 0) <= i3) {
                textView.setText(this.itemView.getContext().getString(R.string.stickers_bonus_catalog_points_hint_2));
                textView.getPaint().setShader(zk7.b(Integer.valueOf(textView.getMeasuredWidth())));
                String t2 = d370.t(this.itemView.getContext(), stickersBonusBalance, false);
                if (t2 == null) {
                    f4m.j(textView2);
                } else {
                    textView2.setText(t2);
                    textView2.setVisibility(0);
                }
            } else {
                textView.setText(this.itemView.getContext().getString(R.string.stickers_bonus_catalog_points_hint_1));
                textView.getPaint().setShader(null);
                jno0.c(textView, R.attr.vk_ui_text_secondary);
                if (i3 == 0) {
                    textView2.setText(R.string.stickers_bonus_catalog_points_expire_1);
                    textView2.setVisibility(0);
                } else {
                    String t3 = d370.t(this.itemView.getContext(), stickersBonusBalance, false);
                    if (t3 == null) {
                        f4m.j(textView2);
                    } else {
                        textView2.setText(t3);
                        textView2.setVisibility(0);
                    }
                }
            }
        }
        this.q.setOnClickListener(new com.vk.im.video.d(this, i2));
    }
}
