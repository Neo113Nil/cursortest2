package one.video.controls.view.seekbar;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import one.video.controls.view.seekbar.OneVideoSeekBarView;
import xsna.e43;
import xsna.gzs;
import xsna.jn80;
import xsna.kn80;
import xsna.m33;
import xsna.s3q0;
import xsna.sox;
import xsna.uox;
import xsna.vox;
import xsna.wjo;
import xsna.zsm0;

/* compiled from: Binder.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes8.dex */
public final class b {
    public final OneVideoSeekBarView a;
    public final zsm0 b;
    public gzs<s3q0> c;
    public kn80 d;
    public jn80 e;
    public sox f;
    public boolean g;
    public final a h;

    public b(OneVideoSeekBarView oneVideoSeekBarView, zsm0 zsm0Var, OneVideoSeekBarView.b bVar) {
        this.a = oneVideoSeekBarView;
        this.b = zsm0Var;
        if (oneVideoSeekBarView.isInEditMode()) {
            kn80.a(LayoutInflater.from(oneVideoSeekBarView.getContext()), oneVideoSeekBarView);
        }
        this.h = new a(bVar, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r13 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sox soxVar) {
        List singletonList;
        zsm0 zsm0Var = this.b;
        float f = zsm0Var.f;
        int i = zsm0Var.a;
        if (soxVar != null) {
            if (soxVar.a.isEmpty() || soxVar.b <= 0) {
                soxVar = null;
            }
            if (soxVar != null) {
                ListBuilder e = e43.e();
                Iterator it = soxVar.a.iterator();
                while (it.hasNext()) {
                    float f2 = ((sox.a) it.next()).a;
                    float f3 = soxVar.b;
                    e.add(new wjo(f2 / f3, r6.b / f3));
                }
                singletonList = e.g();
            }
        }
        singletonList = Collections.singletonList(new wjo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        List list = singletonList;
        kn80 kn80Var = this.d;
        if (kn80Var != null) {
            CompositeSeekBarView compositeSeekBarView = kn80Var.b;
            int i2 = vox.i;
            compositeSeekBarView.setProgressDrawable(new vox(list, new uox(i, f), new uox(zsm0Var.c, f), new uox(zsm0Var.b, f), compositeSeekBarView.getContext().getResources().getDimension(R.dimen.one_video_seek_view_progress_interval_min_width), compositeSeekBarView.getContext().getResources().getDimension(R.dimen.one_video_seek_view_progress_interval_margin)));
        }
        jn80 jn80Var = this.e;
        if (jn80Var != null) {
            CompositeSeekBarView compositeSeekBarView2 = jn80Var.d;
            Drawable a = m33.a(R.drawable.one_video_seekbar_live_progress_drawable, this.a.getContext());
            LayerDrawable layerDrawable = a instanceof LayerDrawable ? (LayerDrawable) a : null;
            if (layerDrawable != null) {
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                GradientDrawable gradientDrawable = findDrawableByLayerId instanceof GradientDrawable ? (GradientDrawable) findDrawableByLayerId : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(i);
                }
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(android.R.id.progress);
                ClipDrawable clipDrawable = findDrawableByLayerId2 instanceof ClipDrawable ? (ClipDrawable) findDrawableByLayerId2 : null;
                if (clipDrawable != null) {
                    Drawable drawable = clipDrawable.getDrawable();
                    GradientDrawable gradientDrawable2 = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
                    if (gradientDrawable2 != null) {
                        gradientDrawable2.setColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_activated}, new int[0]}, new int[]{zsm0Var.d, zsm0Var.e}));
                    }
                }
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    layerDrawable.setLayerGravity(i3, 16);
                    layerDrawable.setLayerHeight(i3, (int) f);
                }
                compositeSeekBarView2.setProgressDrawable(layerDrawable);
            }
        }
    }
}
