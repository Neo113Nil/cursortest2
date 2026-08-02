package xsna;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRouter2;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.mediarouter.R$styleable;
import java.util.Iterator;
import xsna.a5p0;
import xsna.arn0;
import xsna.fx10;

/* compiled from: MediaRouteButton.java */
/* loaded from: classes12.dex */
public class nw10 extends View {
    public static final SparseArray<Drawable.ConstantState> q = new SparseArray<>(2);
    public static final int[] r = {R.attr.state_checked};
    public static final int[] s = {R.attr.state_checkable};
    public final fx10 b;
    public final a c;
    public ex10 d;
    public ww10 e;
    public boolean f;
    public boolean g;
    public b h;
    public Drawable i;
    public int j;
    public int k;
    public int l;
    public final ColorStateList m;
    public final int n;
    public final int o;
    public boolean p;

    /* compiled from: MediaRouteButton.java */
    public final class a extends fx10.a {
        public a() {
        }

        @Override // xsna.fx10.a
        public final void onProviderAdded(@NonNull fx10 fx10Var, @NonNull fx10.g gVar) {
            nw10.this.b();
        }

        @Override // xsna.fx10.a
        public final void onProviderChanged(@NonNull fx10 fx10Var, @NonNull fx10.g gVar) {
            nw10.this.b();
        }

        @Override // xsna.fx10.a
        public final void onProviderRemoved(@NonNull fx10 fx10Var, @NonNull fx10.g gVar) {
            nw10.this.b();
        }

        @Override // xsna.fx10.a
        public final void onRouteAdded(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            nw10.this.b();
        }

        @Override // xsna.fx10.a
        public final void onRouteChanged(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            nw10.this.b();
        }

        @Override // xsna.fx10.a
        public final void onRouteRemoved(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            nw10.this.b();
        }

        @Override // xsna.fx10.a
        public final void onRouteSelected(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            nw10.this.b();
        }

        @Override // xsna.fx10.a
        public final void onRouteUnselected(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            nw10.this.b();
        }

        @Override // xsna.fx10.a
        public final void onRouterParamsChanged(@NonNull fx10 fx10Var, rx10 rx10Var) {
            boolean z = rx10Var != null ? rx10Var.e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
            nw10 nw10Var = nw10.this;
            if (nw10Var.g != z) {
                nw10Var.g = z;
                nw10Var.refreshDrawableState();
            }
        }
    }

    /* compiled from: MediaRouteButton.java */
    public final class b extends AsyncTask<Void, Void, Drawable> {
        public final int a;
        public final Context b;

        public b(int i, Context context) {
            this.a = i;
            this.b = context;
        }

        @Override // android.os.AsyncTask
        public final Drawable doInBackground(Void[] voidArr) {
            SparseArray<Drawable.ConstantState> sparseArray = nw10.q;
            int i = this.a;
            if (sparseArray.get(i) == null) {
                return m33.a(i, this.b);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Drawable drawable) {
            Drawable drawable2 = drawable;
            if (drawable2 != null) {
                nw10.q.put(this.a, drawable2.getConstantState());
            }
            nw10.this.h = null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Drawable drawable) {
            Drawable drawable2 = drawable;
            int i = this.a;
            nw10 nw10Var = nw10.this;
            if (drawable2 != null) {
                nw10.q.put(i, drawable2.getConstantState());
                nw10Var.h = null;
            } else {
                Drawable.ConstantState constantState = nw10.q.get(i);
                if (constantState != null) {
                    drawable2 = constantState.newDrawable();
                }
                nw10Var.h = null;
            }
            nw10Var.setRemoteIndicatorDrawableInternal(drawable2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nw10(@NonNull Context context) {
        super(r8 != 0 ? new ContextThemeWrapper(r0, r8) : r0, null, com.vkontakte.android.R.attr.mediaRouteButtonStyle);
        Drawable.ConstantState constantState;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, sx10.e(context));
        int g = sx10.g(com.vkontakte.android.R.attr.mediaRouteTheme, contextThemeWrapper);
        this.d = ex10.c;
        this.e = ww10.a;
        Context context2 = getContext();
        int[] iArr = R$styleable.a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, com.vkontakte.android.R.attr.mediaRouteButtonStyle, 0);
        iut0.p(this, context2, iArr, null, obtainStyledAttributes, com.vkontakte.android.R.attr.mediaRouteButtonStyle);
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.i = m33.a(obtainStyledAttributes.getResourceId(3, 0), context2);
            return;
        }
        this.b = fx10.d(context2);
        this.c = new a();
        fx10.h f = fx10.f();
        int i = !f.d() ? f.i : 0;
        this.l = i;
        this.k = i;
        this.m = obtainStyledAttributes.getColorStateList(4);
        this.n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.o = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        this.j = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
        int i2 = this.j;
        SparseArray<Drawable.ConstantState> sparseArray = q;
        if (i2 != 0 && (constantState = sparseArray.get(i2)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.i == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = sparseArray.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    b bVar = new b(resourceId, getContext());
                    this.h = bVar;
                    bVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                a();
            }
        }
        e();
        setClickable(true);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private FragmentManager getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof FragmentActivity) {
            return ((FragmentActivity) activity).getSupportFragmentManager();
        }
        return null;
    }

    public final void a() {
        if (this.j > 0) {
            b bVar = this.h;
            if (bVar != null) {
                bVar.cancel(false);
            }
            b bVar2 = new b(this.j, getContext());
            this.h = bVar2;
            this.j = 0;
            bVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void b() {
        this.b.getClass();
        fx10.h f = fx10.f();
        int i = !f.d() ? f.i : 0;
        if (this.l != i) {
            this.l = i;
            e();
            refreshDrawableState();
        }
        if (i == 1) {
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0092, code lost:
    
        if (xsna.arn0.a(r0) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0145, code lost:
    
        if (r0 != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        boolean a2;
        ApplicationInfo applicationInfo;
        boolean z;
        boolean z2;
        ApplicationInfo applicationInfo2;
        boolean z3 = false;
        if (!this.f) {
            return false;
        }
        this.b.getClass();
        fx10.b();
        rx10 rx10Var = fx10.c().v;
        if (rx10Var == null) {
            return d();
        }
        if (rx10Var.b) {
            if (fx10.c == null ? false : fx10.c().i()) {
                Context context = getContext();
                int i = Build.VERSION.SDK_INT;
                if (i >= 34) {
                    if (i >= 30) {
                        MediaRouter2 a3 = arn0.a.a(context);
                        if (i >= 34) {
                            a2 = arn0.b.a(a3);
                            if (!a2) {
                                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                    Intent putExtra = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra("EXTRA_CONNECTION_ONLY", true).putExtra("android.bluetooth.devicepicker.extra.FILTER_TYPE", 1);
                                    for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) context.getSystemService(AudioManager.class)).getDevices(2)) {
                                        int type = audioDeviceInfo.getType();
                                        if (type == 3 || type == 4 || type == 5 || type == 6 || type == 8 || type == 11 || type == 30 || type == 22 || type == 23 || type == 26 || type == 27) {
                                            z = true;
                                            break;
                                        }
                                    }
                                    z = false;
                                    Intent putExtra2 = putExtra.putExtra("EXTRA_CLOSE_ON_CONNECT", !z);
                                    Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra2, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z2 = false;
                                            break;
                                        }
                                        ActivityInfo activityInfo = it.next().activityInfo;
                                        if (activityInfo != null && (applicationInfo2 = activityInfo.applicationInfo) != null && (applicationInfo2.flags & 129) != 0) {
                                            putExtra2.setPackage(applicationInfo2.packageName);
                                            context.startActivity(putExtra2);
                                            z2 = true;
                                            break;
                                        }
                                    }
                                }
                                if (z3) {
                                    return true;
                                }
                            }
                            z3 = true;
                            if (z3) {
                            }
                        }
                    }
                    a2 = false;
                    if (!a2) {
                    }
                    z3 = true;
                    if (z3) {
                    }
                } else if (i >= 31) {
                    Intent putExtra3 = new Intent().setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG").setPackage("com.android.systemui").putExtra("package_name", context.getPackageName());
                    Iterator<ResolveInfo> it2 = context.getPackageManager().queryBroadcastReceivers(putExtra3, 0).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ActivityInfo activityInfo2 = it2.next().activityInfo;
                            if (activityInfo2 != null && (applicationInfo = activityInfo2.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                                context.sendBroadcast(putExtra3);
                                break;
                            }
                        }
                    }
                    a2 = true;
                    if (!a2) {
                    }
                    z3 = true;
                    if (z3) {
                    }
                } else {
                    if (i == 30) {
                        a2 = arn0.a(context);
                        if (!a2) {
                        }
                        z3 = true;
                        if (z3) {
                        }
                    }
                    a2 = false;
                    if (!a2) {
                    }
                    z3 = true;
                    if (z3) {
                    }
                }
            }
        }
        return d();
    }

    public final boolean d() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        this.b.getClass();
        if (fx10.f().d()) {
            if (fragmentManager.H("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") == null) {
                this.e.getClass();
                qw10 qw10Var = new qw10();
                ex10 ex10Var = this.d;
                if (ex10Var == null) {
                    throw new IllegalArgumentException("selector must not be null");
                }
                qw10Var.Dn();
                if (!qw10Var.z.equals(ex10Var)) {
                    qw10Var.z = ex10Var;
                    Bundle arguments = qw10Var.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                    }
                    arguments.putBundle("selector", ex10Var.a);
                    qw10Var.setArguments(arguments);
                    b33 b33Var = qw10Var.y;
                    if (b33Var != null) {
                        if (qw10Var.x) {
                            ((zw10) b33Var).o(ex10Var);
                        } else {
                            ((pw10) b33Var).p(ex10Var);
                        }
                    }
                }
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                aVar.f(0, qw10Var, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
                aVar.k(true);
                return true;
            }
        } else if (fragmentManager.H("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") == null) {
            this.e.getClass();
            uw10 uw10Var = new uw10();
            ex10 ex10Var2 = this.d;
            if (ex10Var2 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            if (uw10Var.z == null) {
                Bundle arguments2 = uw10Var.getArguments();
                if (arguments2 != null) {
                    uw10Var.z = ex10.b(arguments2.getBundle("selector"));
                }
                if (uw10Var.z == null) {
                    uw10Var.z = ex10.c;
                }
            }
            if (!uw10Var.z.equals(ex10Var2)) {
                uw10Var.z = ex10Var2;
                Bundle arguments3 = uw10Var.getArguments();
                if (arguments3 == null) {
                    arguments3 = new Bundle();
                }
                arguments3.putBundle("selector", ex10Var2.a);
                uw10Var.setArguments(arguments3);
                b33 b33Var2 = uw10Var.y;
                if (b33Var2 != null && uw10Var.x) {
                    ((androidx.mediarouter.app.e) b33Var2).q(ex10Var2);
                }
            }
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
            aVar2.f(0, uw10Var, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
            aVar2.k(true);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.i != null) {
            this.i.setState(getDrawableState());
            if (this.i.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.i.getCurrent();
                int i = this.l;
                if (i == 1 || this.k != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.k = this.l;
    }

    public final void e() {
        int i = this.l;
        String string = getContext().getString(i != 1 ? i != 2 ? com.vkontakte.android.R.string.mr_cast_button_disconnected : com.vkontakte.android.R.string.mr_cast_button_connected : com.vkontakte.android.R.string.mr_cast_button_connecting);
        setContentDescription(string);
        if (!this.p || TextUtils.isEmpty(string)) {
            string = null;
        }
        a5p0.a.a(this, string);
    }

    @NonNull
    public ww10 getDialogFactory() {
        return this.e;
    }

    @NonNull
    public ex10 getRouteSelector() {
        return this.d;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.f = true;
        if (!this.d.d()) {
            this.b.a(this.d, this.c, 0);
        }
        b();
    }

    @Override // android.view.View
    @NonNull
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.b != null && !this.g) {
            int i2 = this.l;
            if (i2 == 1) {
                View.mergeDrawableStates(onCreateDrawableState, s);
                return onCreateDrawableState;
            }
            if (i2 == 2) {
                View.mergeDrawableStates(onCreateDrawableState, r);
                return onCreateDrawableState;
            }
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f = false;
            if (!this.d.d()) {
                this.b.h(this.c);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.i != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.i.getIntrinsicWidth();
            int intrinsicHeight = this.i.getIntrinsicHeight();
            int a2 = defpackage.j0.a(width, paddingLeft, intrinsicWidth, 2, paddingLeft);
            int a3 = defpackage.j0.a(height, paddingTop, intrinsicHeight, 2, paddingTop);
            this.i.setBounds(a2, a3, intrinsicWidth + a2, intrinsicHeight + a3);
            this.i.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Drawable drawable = this.i;
        int i4 = 0;
        if (drawable != null) {
            i3 = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            i3 = 0;
        }
        int max = Math.max(this.n, i3);
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            i4 = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int max2 = Math.max(this.o, i4);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        a();
        return c() || performClick;
    }

    public void setCheatSheetEnabled(boolean z) {
        if (z != this.p) {
            this.p = z;
            e();
        }
    }

    public void setDialogFactory(@NonNull ww10 ww10Var) {
        if (ww10Var == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.e = ww10Var;
    }

    public void setRemoteIndicatorDrawable(@Nullable Drawable drawable) {
        this.j = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        b bVar = this.h;
        if (bVar != null) {
            bVar.cancel(false);
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.i);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.m;
            if (colorStateList != null) {
                drawable = drawable.mutate();
                drawable.setTintList(colorStateList);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.i = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(@NonNull ex10 ex10Var) {
        if (ex10Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.d.equals(ex10Var)) {
            return;
        }
        if (this.f) {
            boolean d = this.d.d();
            a aVar = this.c;
            fx10 fx10Var = this.b;
            if (!d) {
                fx10Var.h(aVar);
            }
            if (!ex10Var.d()) {
                fx10Var.a(ex10Var, aVar, 0);
            }
        }
        this.d = ex10Var;
        b();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.i;
    }

    @Deprecated
    public void setAlwaysVisible(boolean z) {
    }
}
