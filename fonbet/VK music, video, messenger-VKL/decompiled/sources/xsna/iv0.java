package xsna;

import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.ImageSize;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.Iterator;

/* compiled from: AdsCarouselCardHolderV1.kt */
/* loaded from: classes4.dex */
public final class iv0 extends vif0<ShitAttachment.Card> implements View.OnClickListener {
    public static final /* synthetic */ int w = 0;
    public final int n;
    public final VkImage o;
    public final VkText p;
    public final VkText q;
    public final VkText r;
    public final VkButton s;
    public final Rect t;
    public final hv0 u;
    public wf0 v;

    /* compiled from: AdsCarouselCardHolderV1.kt */
    public interface a {
        void Y4(ShitAttachment.Card card);

        void t4(ShitAttachment.Card card);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [xsna.hv0] */
    public iv0(FrameLayout frameLayout, int i) {
        super(frameLayout);
        this.n = i;
        VkImage vkImage = (VkImage) frameLayout.findViewById(R.id.content_photo);
        this.o = vkImage;
        this.p = (VkText) frameLayout.findViewById(R.id.price);
        this.q = (VkText) frameLayout.findViewById(R.id.title);
        this.r = (VkText) frameLayout.findViewById(R.id.old_price);
        VkButton vkButton = (VkButton) frameLayout.findViewById(R.id.button);
        this.s = vkButton;
        this.t = new Rect();
        this.u = new ViewTreeObserver.OnPreDrawListener() { // from class: xsna.hv0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                iv0 iv0Var = iv0.this;
                Rect rect = iv0Var.t;
                if (!iv0Var.itemView.isShown() || !iv0Var.itemView.getGlobalVisibleRect(rect)) {
                    return true;
                }
                int height = rect.height() * rect.width();
                if (iv0Var.itemView.getHeight() * iv0Var.itemView.getWidth() == 0 || height / r3 <= 0.5d) {
                    return true;
                }
                Iterator it = ((ShitAttachment.Card) iv0Var.m).p.b("impression").iterator();
                while (it.hasNext()) {
                    com.vkontakte.android.data.b.p((DeprecatedStatisticUrl) it.next());
                }
                iv0Var.itemView.getViewTreeObserver().removeOnPreDrawListener(iv0Var.u);
                return true;
            }
        };
        dek0.b(vkImage, null, null, 14);
        vkButton.setOnClickListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(ShitAttachment.Card card) {
        ShitAttachment.Card card2 = card;
        String str = card2.c;
        String str2 = card2.m;
        String str3 = card2.n;
        this.itemView.setContentDescription(card2.t);
        this.s.setText(card2.u ? card2.i : card2.h);
        SpannableString valueOf = SpannableString.valueOf("");
        PhotoAttachment photoAttachment = card2.l;
        VkImage vkImage = this.o;
        if (photoAttachment != null) {
            int i = this.n;
            float f = i;
            photoAttachment.r = Math.round(f);
            photoAttachment.s = Math.round(f);
            ImageSize Ab = photoAttachment.l.y.Ab(i, false);
            vkImage.o0(Ab != null ? Ab.d.d : null, null);
        } else {
            vkImage.clear();
        }
        if (myc0.f(str3)) {
            valueOf = SpannableString.valueOf(str3);
            valueOf.setSpan(new StrikethroughSpan(), 0, str3.length(), 33);
        }
        this.r.setText(valueOf);
        boolean f2 = myc0.f(str2);
        VkText vkText = this.q;
        VkText vkText2 = this.p;
        if (f2) {
            vkText.setText(str);
            vkText2.setEllipsize(null);
            vkText2.setText(str2);
        } else {
            vkText.setText(card2.f);
            vkText2.setEllipsize(TextUtils.TruncateAt.END);
            vkText2.setText(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.iv0$a, xsna.wf0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [xsna.iv0$a, xsna.wf0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [xsna.iv0$a, xsna.wf0] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (epx.f(view, this.itemView)) {
            ?? r2 = this.v;
            if (r2 != 0) {
                r2.Y4((ShitAttachment.Card) this.m);
                return;
            }
            return;
        }
        if (epx.f(view, this.s)) {
            ?? r22 = this.v;
            if (r22 != 0) {
                r22.t4((ShitAttachment.Card) this.m);
                return;
            }
            return;
        }
        ?? r23 = this.v;
        if (r23 != 0) {
            r23.Y4((ShitAttachment.Card) this.m);
        }
    }
}
