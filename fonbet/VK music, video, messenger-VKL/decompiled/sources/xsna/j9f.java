package xsna;

import android.graphics.Matrix;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import com.vk.dto.clips.VideoTransform;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.vik;
import xsna.y7f;

/* compiled from: ClipsTemplatesTransformHandlerImpl.kt */
/* loaded from: classes16.dex */
public final class j9f implements i9f {
    public final y7f.i a;
    public final m0e b;
    public final bpn0 c = new bpn0(new com.vk.movika.sdk.base.logic.interactor.b(this, 21));

    /* compiled from: ClipsTemplatesTransformHandlerImpl.kt */
    public final class a implements vik.a {
        public a() {
        }

        @Override // xsna.vik.a
        public final void a(int i, int i2, boolean z) {
            y7f.this.D(i, i2, z);
        }

        @Override // xsna.vik.a
        public final void b() {
            y7f.i iVar = j9f.this.a;
            y7f.this.e.d(false);
            z8d z8dVar = y7f.this.e;
            if (!z8dVar.c) {
                z8dVar.a.d(false);
            }
            iVar.b(true);
        }

        @Override // xsna.vik.a
        public final void c(VideoTransform videoTransform) {
            n7f b;
            y7f.i iVar = j9f.this.a;
            z8d z8dVar = y7f.this.e;
            if (!z8dVar.c) {
                z8dVar.a.d(true);
            }
            y7f.e eVar = y7f.this.j.c;
            a7f b2 = eVar.b();
            if (b2 != null && (b = b2.b()) != null) {
                List<n7f> list = b2.b;
                int i = b.a;
                ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem = b.c;
                ArrayList I = rdi.I(i, n7f.a(b, clipsTemplateEditorVideoItem != null ? ClipsTemplateEditorVideoItem.a(clipsTemplateEditorVideoItem, 0L, 0L, videoTransform, 767) : null, null, null, 27), list);
                a7f b3 = eVar.b();
                y7f.this.a.Jl(b3 != null ? a7f.a(b3, I, 0, 5) : null);
            }
            iVar.b(false);
        }
    }

    public j9f(y7f.i iVar, n0e n0eVar) {
        this.a = iVar;
        this.b = n0eVar;
    }

    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.i9f
    public final void a(Size size, VideoTransform videoTransform) {
        int width = size.getWidth();
        int height = size.getHeight();
        y7f.i iVar = this.a;
        y7f y7fVar = y7f.this;
        nal0 stickersInteractor = y7fVar.a.getStickersInteractor();
        if (width * height == 0 || stickersInteractor == null) {
            return;
        }
        float f = width;
        float f2 = height;
        float width2 = stickersInteractor.getWidth();
        float height2 = stickersInteractor.getHeight();
        if (videoTransform != null) {
            r8f a2 = iVar.a();
            if (a2 != null) {
                inf infVar = ((s8f) a2).a;
                infVar.w0(width2, height2);
                laf.a.getClass();
                Matrix matrix = new Matrix();
                Float f3 = videoTransform.f;
                float floatValue = f3 != null ? (f3.floatValue() * width2) / f : 1.0f;
                matrix.postScale(floatValue, floatValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Pair pair = new Pair(Float.valueOf((videoTransform.c * width2) + ((width2 / 2.0f) - ((pov.c(matrix) * f) / 2.0f))), Float.valueOf((videoTransform.d * height2) + ((height2 / 2.0f) - ((pov.d(matrix) * f2) / 2.0f))));
                matrix.postTranslate(((Number) pair.d()).floatValue(), ((Number) pair.g()).floatValue());
                Pair pair2 = new Pair(matrix, Float.valueOf(floatValue));
                Matrix matrix2 = (Matrix) pair2.d();
                float floatValue2 = ((Number) pair2.g()).floatValue();
                infVar.getCommons().l = floatValue2;
                infVar.getCommons().m = width2 / height2 < f / f2 ? width2 / f : height2 / f2;
                infVar.setStickerMatrix(matrix2);
                z2l0 commons = infVar.getCommons();
                float a3 = uq.a(floatValue2, f, 2.0f, pov.e(matrix2));
                float a4 = uq.a(floatValue2, f2, 2.0f, pov.f(matrix2));
                commons.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                commons.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                commons.y0(-videoTransform.b, a3, a4, true);
                infVar.getCommons().h(f, f2);
                infVar.requestLayout();
            }
        } else {
            r8f a5 = iVar.a();
            if (a5 != null) {
                inf infVar2 = ((s8f) a5).a;
                infVar2.w0(width2, height2);
                laf.a.getClass();
                float f4 = width2 / height2 < f / f2 ? width2 / f : height2 / f2;
                Matrix matrix3 = new Matrix();
                matrix3.postScale(f4, f4, f * 0.5f, 0.5f * f2);
                infVar2.getCommons().l = f4;
                infVar2.getCommons().m = f4;
                matrix3.postTranslate((width2 / 2.0f) - (f / 2.0f), (height2 / 2.0f) - (f2 / 2.0f));
                infVar2.setStickerMatrix(matrix3);
                z2l0 commons2 = infVar2.getCommons();
                commons2.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                commons2.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                commons2.y0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
                infVar2.getCommons().h(f, f2);
                infVar2.requestLayout();
            }
        }
        ?? r14 = y7fVar.m;
        y7fVar.D(((n0e) r14.getValue()).g(), (int) ((n0e) r14.getValue()).a.getStickerRotation(), ((n0e) r14.getValue()).j());
    }

    @Override // xsna.i9f
    public final vik d() {
        return (vik) this.c.getValue();
    }
}
