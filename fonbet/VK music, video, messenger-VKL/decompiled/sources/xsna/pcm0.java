package xsna;

import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: StorySendMessageDialog.kt */
/* loaded from: classes6.dex */
public final class pcm0 extends rno0 {
    public final /* synthetic */ tcm0 b;

    public pcm0(tcm0 tcm0Var) {
        this.b = tcm0Var;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        tcm0 tcm0Var = this.b;
        View view = tcm0Var.c;
        VkInputSelect vkInputSelect = tcm0Var.d;
        ucp ucpVar = ucp.a;
        ucp.i(editable);
        if (editable.length() == 0) {
            f4m.r(cn70.b(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE), vkInputSelect);
            zmp0.a((ViewGroup) view, null);
        } else {
            f4m.r(cn70.b(58), vkInputSelect);
            zmp0.a((ViewGroup) view, null);
        }
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ycm0 ycm0Var = this.b.m;
        if (ycm0Var == null || ycm0Var.k) {
            return;
        }
        mcm0 mcm0Var = ycm0Var.h;
        if (mcm0Var == null) {
            mcm0Var = null;
        }
        boolean z = drm0.p0(charSequence).length() > 0;
        ImageView imageView = ((tcm0) mcm0Var).e;
        imageView.setEnabled(z);
        imageView.setAlpha(z ? 1.0f : 0.4f);
        boolean z2 = charSequence.length() == 0;
        if (z2 == ycm0Var.j) {
            return;
        }
        zb90 zb90Var = ycm0Var.f;
        if (zb90Var == null) {
            zb90Var = null;
        }
        zb90Var.b(!z2);
        zb90 zb90Var2 = ycm0Var.f;
        if (zb90Var2 == null) {
            zb90Var2 = null;
        }
        zb90.d(zb90Var2, (ImageView) zb90Var2.f, z2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
        if (ycm0Var.l) {
            zb90 zb90Var3 = ycm0Var.f;
            if (zb90Var3 == null) {
                zb90Var3 = null;
            }
            zb90Var3.a(z2);
        }
        mcm0 mcm0Var2 = ycm0Var.h;
        ((tcm0) (mcm0Var2 != null ? mcm0Var2 : null)).f.setEnabled(z2);
        ycm0Var.j = z2;
    }
}
