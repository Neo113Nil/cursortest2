package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.bhk;
import xsna.wfk;

/* compiled from: CropEditorReducer.kt */
/* loaded from: classes4.dex */
public final class xfk extends dm50<l7a0, wfk, bhk> {
    public final wj50<zgk> d;

    public xfk(bhk.b bVar, f4z f4zVar) {
        super(bVar);
        this.d = f4zVar;
    }

    @Override // xsna.dm50
    public final bhk c(bhk bhkVar, wfk wfkVar) {
        bhk bhkVar2 = bhkVar;
        wfk wfkVar2 = wfkVar;
        if (wfkVar2 instanceof wfk.c) {
            ImageLink h = bhkVar2.h();
            ImageCropArea m = bhkVar2.m();
            PostingPreviewRatio r = bhkVar2.r();
            ImageCropArea a = bhkVar2.a();
            boolean s = bhkVar2.s();
            boolean c = bhkVar2.c();
            boolean t = bhkVar2.t();
            return new bhk.a(h, r, a, m, bhkVar2.v(), s, bhkVar2.b(), c, bhkVar2.o(), t);
        }
        if (wfkVar2 instanceof wfk.b) {
            if (bhkVar2 instanceof bhk.a) {
                ((wfk.b) wfkVar2).getClass();
                return bhk.a.w((bhk.a) bhkVar2, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            }
            if (!(bhkVar2 instanceof bhk.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ((wfk.b) wfkVar2).getClass();
            return bhk.b.w((bhk.b) bhkVar2, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        }
        if (wfkVar2 instanceof wfk.a) {
            if (bhkVar2 instanceof bhk.a) {
                return bhk.a.w((bhk.a) bhkVar2, null, null, null, null, ((wfk.a) wfkVar2).b, 959);
            }
            if (bhkVar2 instanceof bhk.b) {
                return bhk.b.w((bhk.b) bhkVar2, null, null, null, null, ((wfk.a) wfkVar2).b, 959);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (wfkVar2 instanceof wfk.d) {
            if (bhkVar2 instanceof bhk.a) {
                ImageCropArea imageCropArea = ((wfk.d) wfkVar2).b;
                return bhk.a.w((bhk.a) bhkVar2, null, null, imageCropArea, imageCropArea, null, 1011);
            }
            if (!(bhkVar2 instanceof bhk.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ImageCropArea imageCropArea2 = ((wfk.d) wfkVar2).b;
            return bhk.b.w((bhk.b) bhkVar2, null, null, imageCropArea2, imageCropArea2, null, 1011);
        }
        if (wfkVar2 instanceof wfk.e) {
            if (bhkVar2 instanceof bhk.a) {
                return bhk.a.w((bhk.a) bhkVar2, null, null, ((wfk.e) wfkVar2).b, null, null, 1019);
            }
            if (bhkVar2 instanceof bhk.b) {
                return bhk.b.w((bhk.b) bhkVar2, null, null, ((wfk.e) wfkVar2).b, null, null, 1019);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (wfkVar2 instanceof wfk.f) {
            if (bhkVar2 instanceof bhk.a) {
                return bhk.a.w((bhk.a) bhkVar2, null, ((wfk.f) wfkVar2).b, null, null, null, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT);
            }
            if (bhkVar2 instanceof bhk.b) {
                return bhk.b.w((bhk.b) bhkVar2, null, ((wfk.f) wfkVar2).b, null, null, null, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(wfkVar2 instanceof wfk.g)) {
            return bhkVar2;
        }
        if (bhkVar2 instanceof bhk.a) {
            return bhk.a.w((bhk.a) bhkVar2, ((wfk.g) wfkVar2).b.a, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        }
        if (bhkVar2 instanceof bhk.b) {
            return bhk.b.w((bhk.b) bhkVar2, ((wfk.g) wfkVar2).b.a, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final l7a0 d() {
        return new l7a0(e(new xx0(26)), e(new d0k(3)));
    }

    @Override // xsna.dm50
    public final void h(bhk bhkVar, l7a0 l7a0Var) {
        bhk bhkVar2 = bhkVar;
        l7a0 l7a0Var2 = l7a0Var;
        if (bhkVar2 instanceof bhk.b) {
            f(l7a0Var2.a, bhkVar2);
        } else {
            if (!(bhkVar2 instanceof bhk.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(l7a0Var2.b, bhkVar2);
        }
    }
}
