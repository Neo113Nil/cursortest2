package xsna;

import android.graphics.Rect;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import xsna.ol60;

/* compiled from: AbstractVideoViewHolder.java */
/* loaded from: classes4.dex */
public abstract class fi<T extends ol60, N extends VideoAttachment> extends eq6<T, N> implements View.OnAttachStateChangeListener, io2 {
    public final int[] F;
    public WeakReference<View> G;
    public WeakReference<ViewGroup> H;
    public boolean I;
    public boolean J;

    public fi(View view, ViewGroup viewGroup) {
        super(view, viewGroup);
        this.F = new int[2];
        this.G = new WeakReference<>(null);
        this.H = new WeakReference<>(null);
        this.J = false;
        this.itemView.addOnAttachStateChangeListener(this);
    }

    @Override // xsna.io2
    public final boolean G() {
        if (this.I) {
            View f7 = f7();
            int[] iArr = this.F;
            f7.getLocationOnScreen(iArr);
            if (iArr[0] != 0 || iArr[1] != 0) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public ktc0 d7() {
        return null;
    }

    public final ArrayList e7(VideoAttachment videoAttachment) {
        VideoFile videoFile = videoAttachment.k;
        if (!this.t) {
            sr10 sr10Var = dy2.a;
            if (!(sr10Var != null ? sr10Var.c() : true)) {
                return videoFile.getImage().b;
            }
        }
        Image image = videoFile.getImage();
        return image.Db() ? image.c : image.b;
    }

    @Override // xsna.io2
    public final boolean f0() {
        return true;
    }

    @NonNull
    public abstract View f7();

    @Override // xsna.io2
    public final Rect g0() {
        return w11.d(f7());
    }

    @Deprecated
    public VideoResizer.VideoFitType getContentScaleType() {
        return VideoResizer.VideoFitType.CROP;
    }

    public float i0() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void onViewAttachedToWindow(View view) {
        try {
            Trace.beginSection("AbstractVideoViewHolder.onViewAttachedToWindow");
            this.I = true;
            if (!this.J) {
                if (this.H.get() == null) {
                    qcy<Object>[] qcyVarArr = bwt0.a;
                    Trace.beginSection(ndp0.f("ViewExt.findViewByIdFromBottom"));
                    try {
                        View r = bwt0.r(view.getParent(), R.id.list);
                        Trace.endSection();
                        this.H = new WeakReference<>((ViewGroup) r);
                    } finally {
                    }
                }
                if (this.H.get() == null) {
                    qcy<Object>[] qcyVarArr2 = bwt0.a;
                    Trace.beginSection(ndp0.f("ViewExt.findViewByIdFromBottom"));
                    try {
                        View r2 = bwt0.r(view.getParent(), R.id.recycle);
                        Trace.endSection();
                        this.H = new WeakReference<>((ViewGroup) r2);
                    } finally {
                    }
                }
            }
            if (this.G.get() == null) {
                this.G = new WeakReference<>(view.getRootView().findViewById(R.id.viewpager));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void onViewDetachedFromWindow(View view) {
        this.I = false;
    }

    @Override // xsna.io2
    public final Rect t0() {
        View f7 = f7();
        int[] iArr = this.F;
        f7.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], f7.getWidth() + i, f7.getHeight() + iArr[1]);
    }

    public fi(ViewGroup viewGroup) {
        super(R.layout.attach_video, viewGroup);
        this.F = new int[2];
        this.G = new WeakReference<>(null);
        this.H = new WeakReference<>(null);
        this.J = false;
        this.itemView.addOnAttachStateChangeListener(this);
    }

    public void C() {
    }

    public void D0() {
    }

    public void J() {
    }

    public void e0() {
    }
}
