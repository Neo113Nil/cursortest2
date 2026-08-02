package xsna;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.View;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: MyTargetInternalNativeAdCarouselCardHolder.kt */
/* loaded from: classes4.dex */
public final class sq50 extends vif0<lp50> {
    public static final /* synthetic */ int x = 0;
    public final VkImage n;
    public final VkText o;
    public final VkText p;
    public final VkText q;
    public final VkButton r;
    public wzs<? super View, ? super wix, s3q0> s;
    public wzs<? super View, ? super wix, s3q0> t;
    public xix u;
    public wix v;
    public final adz w;

    /* compiled from: MyTargetInternalNativeAdCarouselCardHolder.kt */
    public final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            xix xixVar;
            sq50 sq50Var = sq50.this;
            adz adzVar = sq50Var.w;
            wix wixVar = sq50Var.v;
            if (adzVar == null || wixVar == null || (xixVar = sq50Var.u) == null) {
                return;
            }
            xixVar.h(adzVar, wixVar);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            xix xixVar;
            sq50 sq50Var = sq50.this;
            wix wixVar = sq50Var.v;
            if (wixVar == null || (xixVar = sq50Var.u) == null) {
                return;
            }
            xixVar.c(wixVar);
        }
    }

    public sq50(lv0 lv0Var) {
        super(lv0Var);
        VkImage vkImage = (VkImage) lv0Var.findViewById(R.id.content_photo);
        this.n = vkImage;
        this.o = (VkText) lv0Var.findViewById(R.id.price);
        this.p = (VkText) lv0Var.findViewById(R.id.title);
        this.q = (VkText) lv0Var.findViewById(R.id.old_price);
        this.r = (VkButton) lv0Var.findViewById(R.id.button);
        this.w = new adz(lv0Var, 7);
        dek0.b(vkImage, null, null, 14);
        lv0Var.addOnAttachStateChangeListener(new a());
    }

    @Override // xsna.vif0
    public final void i6(lp50 lp50Var) {
        ArrayList arrayList;
        ImageSize imageSize;
        lp50 lp50Var2 = lp50Var;
        String str = lp50Var2.b;
        String str2 = lp50Var2.i;
        this.v = lp50Var2.a;
        this.itemView.setOnClickListener(new hkc(2, this, lp50Var2));
        ikc ikcVar = new ikc(1, this, lp50Var2);
        VkButton vkButton = this.r;
        vkButton.setOnClickListener(ikcVar);
        vkButton.setText(lp50Var2.d);
        SpannableString valueOf = SpannableString.valueOf("");
        Image image = lp50Var2.c;
        VkImage vkImage = this.n;
        if (image == null || (arrayList = image.b) == null || (imageSize = (ImageSize) j5g.a0(arrayList)) == null) {
            vkImage.clear();
        } else {
            vkImage.o0(imageSize.d.d, null);
        }
        String str3 = lp50Var2.h;
        if (str3 != null && !drm0.N(str3)) {
            valueOf = SpannableString.valueOf(str3);
            valueOf.setSpan(new StrikethroughSpan(), 0, str3.length(), 33);
        }
        this.q.setText(valueOf);
        boolean f = myc0.f(str2);
        VkText vkText = this.p;
        VkText vkText2 = this.o;
        if (f) {
            vkText.setText(str);
            vkText2.setEllipsize(null);
            vkText2.setText(str2);
        } else {
            vkText.setText(lp50Var2.f);
            vkText2.setEllipsize(TextUtils.TruncateAt.END);
            vkText2.setText(str);
        }
    }
}
