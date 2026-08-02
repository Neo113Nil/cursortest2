package xsna;

import android.text.Layout;
import com.vk.stories.design.view.text.TextStickerFrameLayout;

/* compiled from: TextStickerDialogImpl.kt */
/* loaded from: classes16.dex */
public final class gmo0 implements TextStickerFrameLayout.b {
    public final /* synthetic */ cmo0 a;

    public gmo0(cmo0 cmo0Var) {
        this.a = cmo0Var;
    }

    @Override // com.vk.stories.design.view.text.TextStickerFrameLayout.b
    public final boolean a() {
        xpk<Layout.Alignment, Integer> xpkVar = this.a.t;
        xpk<Layout.Alignment, Integer> xpkVar2 = xpkVar == null ? null : xpkVar;
        int i = xpkVar2.d;
        Layout.Alignment alignment = i != -1 ? xpkVar2.a[i] : null;
        if (alignment == Layout.Alignment.ALIGN_NORMAL) {
            if (xpkVar == null) {
                xpkVar = null;
            }
            xpkVar.b(Layout.Alignment.ALIGN_CENTER);
            return true;
        }
        if (alignment != Layout.Alignment.ALIGN_CENTER) {
            return false;
        }
        if (xpkVar == null) {
            xpkVar = null;
        }
        xpkVar.b(Layout.Alignment.ALIGN_OPPOSITE);
        return true;
    }

    @Override // com.vk.stories.design.view.text.TextStickerFrameLayout.b
    public final boolean b() {
        xpk<Layout.Alignment, Integer> xpkVar = this.a.t;
        xpk<Layout.Alignment, Integer> xpkVar2 = xpkVar == null ? null : xpkVar;
        int i = xpkVar2.d;
        Layout.Alignment alignment = i != -1 ? xpkVar2.a[i] : null;
        if (alignment == Layout.Alignment.ALIGN_OPPOSITE) {
            if (xpkVar == null) {
                xpkVar = null;
            }
            xpkVar.b(Layout.Alignment.ALIGN_CENTER);
            return true;
        }
        if (alignment != Layout.Alignment.ALIGN_CENTER) {
            return false;
        }
        if (xpkVar == null) {
            xpkVar = null;
        }
        xpkVar.b(Layout.Alignment.ALIGN_NORMAL);
        return true;
    }
}
