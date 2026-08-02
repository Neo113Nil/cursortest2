package xsna;

import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.impl.domain.model.CropFitContainerMode;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import xsna.bhk;

/* compiled from: CropEditorViewState.kt */
/* loaded from: classes4.dex */
public final class v6a0 implements fm50<bhk.a> {
    public final yzt0<ImageLink> a;
    public final yzt0<PostingPreviewRatio> b;
    public final yzt0<ImageCropArea> c;
    public final yzt0<Boolean> d;
    public final yzt0<Boolean> e;
    public final yzt0<CropFitContainerMode> f;

    public v6a0(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6) {
        this.a = h0u0Var;
        this.b = h0u0Var2;
        this.c = h0u0Var3;
        this.d = h0u0Var4;
        this.e = h0u0Var5;
        this.f = h0u0Var6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6a0)) {
            return false;
        }
        v6a0 v6a0Var = (v6a0) obj;
        return epx.f(this.a, v6a0Var.a) && epx.f(this.b, v6a0Var.b) && epx.f(this.c, v6a0Var.c) && epx.f(this.d, v6a0Var.d) && epx.f(this.e, v6a0Var.e) && epx.f(this.f, v6a0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(image=");
        sb.append(this.a);
        sb.append(", ratio=");
        sb.append(this.b);
        sb.append(", initialCropData=");
        sb.append(this.c);
        sb.append(", isPhotoVk=");
        sb.append(this.d);
        sb.append(", isEditEnabled=");
        sb.append(this.e);
        sb.append(", fitContainerMode=");
        return tr.c(sb, this.f, ')');
    }
}
