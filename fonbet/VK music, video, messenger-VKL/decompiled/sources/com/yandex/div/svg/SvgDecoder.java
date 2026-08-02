package com.yandex.div.svg;

import android.graphics.RectF;
import android.graphics.drawable.PictureDrawable;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;
import com.unity3d.services.UnityAdsConstants;
import java.io.InputStream;
import xsna.zcl;

/* compiled from: SvgDecoder.kt */
/* loaded from: classes7.dex */
public final class SvgDecoder {
    private final boolean useViewBoundsAsIntrinsicSize;

    public SvgDecoder(boolean z) {
        this.useViewBoundsAsIntrinsicSize = z;
    }

    public final PictureDrawable decode(InputStream inputStream) {
        float f;
        float f2;
        try {
            SVG c = SVG.c(inputStream);
            SVG.e0 e0Var = c.a;
            if (e0Var == null) {
                throw new IllegalArgumentException("SVG document is empty");
            }
            SVG.b bVar = e0Var.o;
            RectF rectF = bVar == null ? null : new RectF(bVar.a, bVar.b, bVar.a(), bVar.b());
            if (this.useViewBoundsAsIntrinsicSize && rectF != null) {
                f = rectF.width();
                f2 = rectF.height();
            } else {
                if (c.a == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                f = c.a().c;
                if (c.a == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                f2 = c.a().d;
            }
            if (rectF == null && f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                SVG.e0 e0Var2 = c.a;
                if (e0Var2 == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                e0Var2.o = new SVG.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
            }
            return new PictureDrawable(c.d());
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public /* synthetic */ SvgDecoder(boolean z, int i, zcl zclVar) {
        this((i & 1) != 0 ? true : z);
    }
}
