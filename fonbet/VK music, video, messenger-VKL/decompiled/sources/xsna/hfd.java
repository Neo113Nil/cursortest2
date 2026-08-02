package xsna;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ClipVideoPreview.kt */
/* loaded from: classes16.dex */
public final class hfd extends LinearLayout {
    public static final Pair<Integer, Integer> i;
    public static final int j;
    public static final int k;
    public static final awf l = new awf(0.9f, 1.1f);
    public a b;
    public final FrameLayout c;
    public final VkText d;
    public vut0 e;
    public Integer f;
    public Integer g;
    public Integer h;

    /* compiled from: ClipVideoPreview.kt */
    public static final class a {
        public final C2992a a;
        public final int b;
        public final int c;

        /* compiled from: ClipVideoPreview.kt */
        /* renamed from: xsna.hfd$a$a, reason: collision with other inner class name */
        public static final class C2992a {
            public static final /* synthetic */ int i = 0;
            public final List<String> a;
            public final int b;
            public final int c;
            public final int d;
            public final int e;
            public final int f;
            public final int g;
            public final boolean h;

            static {
                EmptyList emptyList = EmptyList.b;
            }

            public C2992a(int i2, int i3, int i4, int i5, int i6, int i7, boolean z, List list) {
                this.a = list;
                this.b = i2;
                this.c = i3;
                this.d = i4;
                this.e = i5;
                this.f = i6;
                this.g = i7;
                this.h = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2992a)) {
                    return false;
                }
                C2992a c2992a = (C2992a) obj;
                return epx.f(this.a, c2992a.a) && this.b == c2992a.b && this.c == c2992a.c && this.d == c2992a.d && this.e == c2992a.e && this.f == c2992a.f && this.g == c2992a.g && this.h == c2992a.h;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.h) + shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TimelineThumbs(imageUrls=");
                sb.append(this.a);
                sb.append(", frameWidth=");
                sb.append(this.b);
                sb.append(", frameHeight=");
                sb.append(this.c);
                sb.append(", framesPerRow=");
                sb.append(this.d);
                sb.append(", framesPerImage=");
                sb.append(this.e);
                sb.append(", totalFrames=");
                sb.append(this.f);
                sb.append(", frameIntervalSec=");
                sb.append(this.g);
                sb.append(", isUnitedVideo=");
                return defpackage.q0.a(sb, this.h, ')');
            }
        }

        static {
            int i = C2992a.i;
        }

        public a(C2992a c2992a, int i, int i2) {
            this.a = c2992a;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config(timelineThumbs=");
            sb.append(this.a);
            sb.append(", positionSeconds=");
            sb.append(this.b);
            sb.append(", durationSeconds=");
            return vu5.b(sb, this.c, ')');
        }
    }

    static {
        float f = 120;
        i = new Pair<>(Integer.valueOf(iah0.a(f)), Integer.valueOf(iah0.a(f)));
        float f2 = 160;
        j = iah0.a(f2);
        k = iah0.a(f2);
    }

    public hfd(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.clip_rectangle_seek_preview, (ViewGroup) this, true);
        setOrientation(1);
        this.c = (FrameLayout) findViewById(R.id.preview_container);
        this.d = (VkText) findViewById(R.id.preview_time);
    }

    public static double a(a aVar) {
        int i2;
        int i3 = aVar.c;
        int i4 = aVar.b;
        if (i3 == 0) {
            return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        }
        a.C2992a c2992a = aVar.a;
        return (!c2992a.h || (i2 = c2992a.g) <= 0) ? Math.min(Math.max(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, Math.floor((c2992a.f * (i4 / i3)) - 0.5d)), r5 - 1) : Math.min(i4 / i2, r5 - 1);
    }

    private final void setCurrentImageIndex(Integer num) {
        a aVar;
        Integer num2;
        String str;
        vut0 vut0Var;
        if (epx.f(this.h, num) || (aVar = this.b) == null) {
            return;
        }
        a.C2992a c2992a = aVar.a;
        if (num != null) {
            int intValue = num.intValue();
            int h = e43.h(c2992a.a);
            if (intValue > h) {
                intValue = h;
            }
            num2 = Integer.valueOf(intValue);
        } else {
            num2 = null;
        }
        this.h = num2;
        a aVar2 = this.b;
        if (aVar2 != null) {
            a.C2992a c2992a2 = aVar2.a;
            if (num2 == null || (str = (String) j5g.b0(num2.intValue(), c2992a2.a)) == null || (vut0Var = this.e) == null) {
                return;
            }
            vut0Var.c(new jfd(str));
        }
    }

    private final void setupAppearance(ImageView imageView) {
        imageView.setBackgroundResource(R.color.vk_black);
        float f = 6;
        gcd0.d(imageView, 6, iah0.a(f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(iah0.a(f));
        gradientDrawable.setStroke((int) iah0.b(0.5f), krv0.m(R.attr.vk_ui_stroke_contrast, imageView.getContext()));
        imageView.setForeground(gradientDrawable);
    }

    private final void setupPreviewView(ImageView imageView) {
        imageView.setLayoutParams(cpy.a(-1, -1, 0, 0, 0, 0, 60));
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        setupAppearance(imageView);
    }

    public final void b() {
        a aVar;
        int i2;
        vut0 vut0Var = this.e;
        Matrix matrix = null;
        View view = vut0Var != null ? vut0Var.getView() : null;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView == null || (aVar = this.b) == null) {
            return;
        }
        a.C2992a c2992a = aVar.a;
        int i3 = c2992a.b;
        int i4 = c2992a.f;
        int i5 = c2992a.d;
        int i6 = c2992a.c;
        int i7 = c2992a.e;
        if (i3 <= 0 || i6 <= 0 || imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            return;
        }
        if ((this.f == null || this.g == null) && imageView.getDrawable() != null) {
            int ceil = (c2992a.a.size() == 1 ? (int) Math.ceil(i4 / i5) : i7 / i5) * i6;
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Integer valueOf = Integer.valueOf(intrinsicHeight);
                if (intrinsicHeight <= 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i2 = valueOf.intValue();
                    float f = ceil / i2;
                    this.f = Integer.valueOf((int) (i3 / f));
                    this.g = Integer.valueOf((int) (i6 / f));
                }
            }
            i2 = ceil;
            float f2 = ceil / i2;
            this.f = Integer.valueOf((int) (i3 / f2));
            this.g = Integer.valueOf((int) (i6 / f2));
        }
        double a2 = a(aVar);
        Integer num = this.h;
        if (num != null) {
            int intValue = num.intValue();
            if (a2 < (intValue + 1) * i7 && a2 >= intValue * i7) {
                Integer num2 = this.f;
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    Integer num3 = this.g;
                    if (num3 != null) {
                        int intValue3 = num3.intValue();
                        double d = a2 % i7;
                        int min = Math.min(i5, i4);
                        float f3 = intValue2;
                        float width = imageView.getWidth() / f3;
                        float f4 = intValue3;
                        float height = imageView.getHeight() / f4;
                        double d2 = min;
                        int floor = (int) Math.floor(d % d2);
                        int floor2 = (int) Math.floor(d / d2);
                        Matrix matrix2 = new Matrix();
                        matrix2.setScale(width, height);
                        matrix2.postTranslate((-width) * f3 * floor, (-height) * f4 * floor2);
                        matrix = matrix2;
                    }
                }
                if (matrix != null) {
                    imageView.setImageMatrix(matrix);
                    return;
                }
                return;
            }
        }
        setCurrentImageIndex(Integer.valueOf((int) (a(aVar) / c2992a.e)));
    }

    public final a getConfig() {
        return this.b;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        b();
    }

    public final void setConfig(a aVar) {
        View view;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        this.b = aVar;
        if (aVar == null) {
            vut0 vut0Var = this.e;
            if (vut0Var != null) {
                vut0Var.c(ifd.a);
                return;
            }
            return;
        }
        a.C2992a c2992a = aVar.a;
        int i3 = aVar.b;
        this.d.setText(i3 < 3600 ? String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3 / 60), Integer.valueOf(i3 % 60)}, 2)) : String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3 / 3600), Integer.valueOf((i3 / 60) % 60), Integer.valueOf(i3 % 60)}, 3)));
        int i4 = c2992a.b;
        Pair<Integer, Integer> pair = i;
        if (i4 > 0 && (i2 = c2992a.c) > 0) {
            float f = i4 / i2;
            Float valueOf = Float.valueOf(f);
            awf awfVar = l;
            if (!awfVar.b(valueOf)) {
                if (f < awfVar.b) {
                    int i5 = k;
                    pair = new Pair<>(Integer.valueOf((int) (i5 * f)), Integer.valueOf(i5));
                } else {
                    int i6 = j;
                    pair = new Pair<>(Integer.valueOf(i6), Integer.valueOf((int) (i6 / f)));
                }
            }
        }
        int intValue = pair.d().intValue();
        int intValue2 = pair.g().intValue();
        vut0 vut0Var2 = this.e;
        if (vut0Var2 != null && (view = vut0Var2.getView()) != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.width = intValue;
            layoutParams.height = intValue2;
        }
        setCurrentImageIndex(Integer.valueOf((int) (a(aVar) / c2992a.e)));
        b();
    }

    public final void setPreviewControllerFactory(wut0 wut0Var) {
        vut0 create;
        FrameLayout frameLayout = this.c;
        frameLayout.removeAllViews();
        this.e = null;
        if (wut0Var == null || (create = wut0Var.create(getContext())) == null) {
            return;
        }
        this.e = create;
        View view = create.getView();
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView == null) {
            throw new IllegalArgumentException("Expected ImageView but got ".concat(create.getView().getClass().getSimpleName()).toString());
        }
        setupPreviewView(imageView);
        frameLayout.addView(create.getView());
    }
}
