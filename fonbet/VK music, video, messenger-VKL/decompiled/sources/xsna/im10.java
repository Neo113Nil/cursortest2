package xsna;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$id;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* compiled from: MaterialContainerTransformSharedElementCallback.java */
/* loaded from: classes13.dex */
public final class im10 extends SharedElementCallback {

    @Nullable
    public static WeakReference<View> e;

    @Nullable
    public Rect c;
    public boolean a = true;
    public boolean b = true;

    @Nullable
    public final a d = new a();

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    public static class a {
    }

    public final void a() {
        this.b = true;
    }

    @Override // android.app.SharedElementCallback
    @Nullable
    public final Parcelable onCaptureSharedElementSnapshot(@NonNull View view, @NonNull Matrix matrix, @NonNull RectF rectF) {
        e = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @Nullable
    public final View onCreateSnapshotView(@NonNull Context context, @Nullable Parcelable parcelable) {
        WeakReference<View> weakReference;
        KeyEvent.Callback callback;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (onCreateSnapshotView != null && (weakReference = e) != null && this.d != null && (callback = (View) weakReference.get()) != null) {
            com.google.android.material.shape.a shapeAppearanceModel = callback instanceof l6j0 ? ((l6j0) callback).getShapeAppearanceModel() : null;
            if (shapeAppearanceModel != null) {
                onCreateSnapshotView.setTag(R$id.mtrl_motion_snapshot_view, shapeAppearanceModel);
            }
        }
        return onCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public final void onMapSharedElements(@NonNull List<String> list, @NonNull Map<String, View> map) {
        View view;
        Activity activity;
        if (list.isEmpty() || map.isEmpty() || (view = map.get(list.get(0))) == null) {
            return;
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            Window window = activity.getWindow();
            if (this.a) {
                Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
                if (sharedElementEnterTransition instanceof em10) {
                    em10 em10Var = (em10) sharedElementEnterTransition;
                    window.setSharedElementReenterTransition(null);
                    if (this.b) {
                        if (em10Var.getDuration() >= 0) {
                            window.setTransitionBackgroundFadeDuration(em10Var.getDuration());
                        }
                        em10Var.addListener(new fm10(window));
                        return;
                    }
                    return;
                }
                return;
            }
            Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
            if (sharedElementReturnTransition instanceof em10) {
                em10 em10Var2 = (em10) sharedElementReturnTransition;
                em10Var2.b = true;
                em10Var2.addListener(new gm10(activity));
                if (this.b) {
                    if (em10Var2.getDuration() >= 0) {
                        window.setTransitionBackgroundFadeDuration(em10Var2.getDuration());
                    }
                    em10Var2.addListener(new hm10(window));
                }
            }
        }
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementEnd(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty() && (list2.get(0).getTag(R$id.mtrl_motion_snapshot_view) instanceof View)) {
            list2.get(0).setTag(R$id.mtrl_motion_snapshot_view, null);
        }
        if (!this.a && !list2.isEmpty()) {
            View view = list2.get(0);
            RectF rectF = fnp0.a;
            this.c = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        this.a = false;
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementStart(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(R$id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (this.a || list2.isEmpty() || this.c == null) {
            return;
        }
        View view = list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.c.height(), 1073741824));
        Rect rect = this.c;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }
}
