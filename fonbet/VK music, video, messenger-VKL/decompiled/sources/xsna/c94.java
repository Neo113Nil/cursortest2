package xsna;

import com.vk.dto.photo.ImageCropData;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$PrimaryModeEvent;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import xsna.ghc0;
import xsna.qik;
import xsna.z84;

/* compiled from: AttachmentsPostingViewController.kt */
/* loaded from: classes4.dex */
public final class c94 implements qik.a {
    public final /* synthetic */ b94 a;

    public c94(b94 b94Var) {
        this.a = b94Var;
    }

    @Override // xsna.qik.a
    public final void a(PhotoAttachment photoAttachment) {
        b94 b94Var = this.a;
        y4 y4Var = new y4(3, b94Var, photoAttachment);
        if (!ify.e(ify.c)) {
            y4Var.invoke();
        } else {
            mhy.b(b94Var.b);
            ify.a(new e94(y4Var));
        }
    }

    @Override // xsna.qik.a
    public final void b(ImageCropData imageCropData) {
        lu9 lu9Var;
        z84 z84Var = this.a.t;
        if (z84Var == null || (lu9Var = z84Var.p) == null || epx.f(imageCropData.b(), "")) {
            return;
        }
        ArrayList arrayList = (ArrayList) lu9Var.f.a;
        Integer g = i7o0.g(arrayList, new bjk(imageCropData, 0));
        if (g == null || ((ImageCropData) arrayList.set(g.intValue(), imageCropData)) == null) {
            arrayList.add(imageCropData);
        }
        lu9Var.d();
    }

    @Override // xsna.qik.a
    public final void c(String str) {
        b94 b94Var = this.a;
        LinkedHashSet linkedHashSet = b94Var.l;
        int i = ify.a;
        if (ify.e(ify.c)) {
            mhy.b(b94Var.b);
        }
        if (linkedHashSet.contains(str)) {
            return;
        }
        linkedHashSet.add(str);
        ghc0.i d = b94Var.g.d();
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint = b94Var.h;
        d.getClass();
        ghc0.i.a(d, MobileOfficialAppsConPostingStat$PrimaryModeEvent.PrimaryModeEventType.ZOOM, postingMetricsCreationEntryPoint);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qik.a
    public final void d(String str) {
        z84 z84Var = this.a.t;
        if (z84Var != null) {
            z84.a aVar = (z84.a) ((Map) z84Var.k.getValue()).get(str);
            if (aVar != null) {
                aVar.b = true;
            }
            z84Var.b.Ca();
        }
    }
}
