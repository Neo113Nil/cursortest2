package xsna;

import android.graphics.PointF;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageCropResult;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.crop_editor.domain.model.RemoteImageLink;
import com.vk.newsfeed.posting.crop_editor.presentation.domain.model.RectPoints;
import com.vk.newsfeed.posting.impl.domain.model.CropFitContainerMode;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import kotlin.NoWhenBranchMatchedException;
import xsna.ofk;
import xsna.wfk;
import xsna.zgk;

/* compiled from: CropEditorFeature.kt */
/* loaded from: classes4.dex */
public final class rfk extends wk50<l7a0, bhk, ofk, wfk> {
    public final wj50<zgk> f;
    public final ibc0 g;
    public final sq90 h;
    public final ur10 i;
    public final String j;

    public rfk(xfk xfkVar, f4z f4zVar, ibc0 ibc0Var) {
        super(ofk.d.b, xfkVar);
        this.f = f4zVar;
        this.g = ibc0Var;
        this.h = new sq90(1);
        this.i = new ur10();
        this.j = i5s.a(new StringBuilder("https://"), a0a.d, "/@authors-chto-vazhno-uchest-avtoram-vkontakte-pri-sozdanii-postov?anchor=kak-publikovat-izobrazhenia");
    }

    @Override // xsna.wk50
    public final void N(bhk bhkVar, ofk ofkVar) {
        bhk bhkVar2 = bhkVar;
        ofk ofkVar2 = ofkVar;
        if (ofkVar2 instanceof ofk.d) {
            T(wfk.c.b);
            return;
        }
        boolean z = ofkVar2 instanceof ofk.a;
        ibc0 ibc0Var = this.g;
        wj50<zgk> wj50Var = this.f;
        if (z) {
            ibc0Var.j().c();
            wj50Var.b(zgk.a.a);
            return;
        }
        if (ofkVar2 instanceof ofk.i) {
            T(new wfk.f(((ofk.i) ofkVar2).b));
            return;
        }
        if (ofkVar2 instanceof ofk.b) {
            wj50Var.b(new zgk.b(new ImageCropResult(bhkVar2.h(), bhkVar2.r(), bhkVar2.a(), bhkVar2.o(), bhkVar2.t(), bhkVar2.b() == CropFitContainerMode.FIT)));
            return;
        }
        if (ofkVar2 instanceof ofk.f) {
            ibc0Var.j().d();
            wj50Var.b(new zgk.d(bhkVar2.h(), bhkVar2.c()));
            return;
        }
        if (ofkVar2 instanceof ofk.h) {
            ImageLink h = bhkVar2.h();
            RectPoints rectPoints = ((ofk.h) ofkVar2).b;
            float f = rectPoints.c.x;
            PointF pointF = rectPoints.b;
            float f2 = f - pointF.x;
            float f3 = rectPoints.d.y - pointF.y;
            String str = h instanceof RemoteImageLink ? ((RemoteImageLink) h).b : "";
            Uri uri = h.getUri();
            int width = h.getWidth();
            int height = h.getHeight();
            int g = swe0.g((int) Math.floor(pointF.x), 0, width);
            int g2 = swe0.g((int) Math.floor(pointF.y), 0, height);
            int f4 = agc0.f(g, (int) Math.floor(f2), width);
            int f5 = agc0.f(g2, (int) Math.floor(f3), height);
            ImageCropArea imageCropArea = (f4 <= 0 || f5 <= 0) ? null : new ImageCropArea(str, uri, g, g2, f4, f5, null, null, PsExtractor.AUDIO_STREAM, null);
            if (imageCropArea != null) {
                T(new wfk.e(imageCropArea));
                return;
            }
            return;
        }
        if (ofkVar2 instanceof ofk.k) {
            Uri uri2 = ((ofk.k) ofkVar2).b;
            this.i.getClass();
            this.e.b(ur10.a(uri2).subscribe(new w00(new he3(17, this, bhkVar2), 17)));
            return;
        }
        if (ofkVar2 instanceof ofk.c) {
            ((ofk.c) ofkVar2).getClass();
            T(new wfk.b());
            return;
        }
        if (ofkVar2 instanceof ofk.j) {
            CropFitContainerMode cropFitContainerMode = ((ofk.j) ofkVar2).b;
            if (cropFitContainerMode != CropFitContainerMode.CROP_ONLY) {
                T(new wfk.a(cropFitContainerMode));
                return;
            }
            return;
        }
        if (ofkVar2 instanceof ofk.g) {
            ImageLink h2 = bhkVar2.h();
            T(new wfk.d(new ImageCropArea(null, h2.getUri(), 0, 0, h2.getWidth(), h2.getHeight(), null, null, 193, null)));
        } else {
            if (!(ofkVar2 instanceof ofk.e)) {
                throw new NoWhenBranchMatchedException();
            }
            ibc0Var.j().a();
            wj50Var.b(new zgk.c(this.j.toString()));
        }
    }
}
