package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: VideoAutoPlaySeekBarProgressDrawable.kt */
/* loaded from: classes2.dex */
public final class b4s0 extends LayerDrawable {
    public List<wjo> b;
    public final ArrayList c;
    public final b d;

    /* compiled from: VideoAutoPlaySeekBarProgressDrawable.kt */
    public static final class b {
        public final Object a;
        public final Object b;

        public b(Context context) {
            z5f z5fVar = new z5f(context, 2);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.a = msy.a(lazyThreadSafetyMode, z5fVar);
            this.b = msy.a(lazyThreadSafetyMode, new e9h(context, 5));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b4s0(Context context) {
        super(new Drawable[]{new LayerDrawable(new Drawable[]{context.getDrawable(R.drawable.video_autoplay_seekbar_progress_bg), new a(e3m.f(R.attr.vk_ui_background_contrast_secondary_alpha, context), r0)}), new ClipDrawable(new a(context.getColor(R.color.vk_white_alpha40), r0), 8388611, 1), new ClipDrawable(new a(e3m.f(R.attr.vk_ui_accent_azure, context), r0), 8388611, 1)});
        float dimension = context.getResources().getDimension(R.dimen.video_autoplay_seekbar_progress_height);
        this.b = EmptyList.b;
        this.c = new ArrayList();
        this.d = new b(context);
        setId(0, android.R.id.background);
        setId(1, android.R.id.secondaryProgress);
        setId(2, android.R.id.progress);
        a(getBounds());
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
    
        if ((r5.c <= r8.c ? 65535 : 1) <= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cc, code lost:
    
        r8 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c9, code lost:
    
        if (r5 == null) goto L38;
     */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Rect rect) {
        List<wjo> list = this.b;
        if (list.isEmpty()) {
            list = Collections.singletonList(new wjo(rect.left, rect.right));
        }
        List<wjo> list2 = list;
        if (list2.isEmpty() || rect.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        int width = rect.width();
        List<wjo> list3 = list2;
        ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
        Iterator<T> it = list3.iterator();
        int i = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            b bVar = this.d;
            if (!hasNext) {
                ArrayList arrayList3 = new ArrayList(arrayList2);
                int i2 = 0;
                do {
                    wjo wjoVar = (wjo) arrayList3.get(i2);
                    int i3 = i2 - 1;
                    wjo wjoVar2 = (wjo) j5g.b0(i3, arrayList3);
                    int i4 = i2 + 1;
                    wjo wjoVar3 = (wjo) j5g.b0(i4, arrayList3);
                    if (wjoVar2 == null || wjoVar3 == null) {
                    }
                    if (wjoVar.c >= ((Number) bVar.b.getValue()).intValue() || wjoVar3 == null) {
                        i2 = i4;
                    } else {
                        if (!wjoVar3.equals(wjoVar2)) {
                            i3 = i2;
                        }
                        arrayList3.remove(i3);
                        arrayList3.remove(i3);
                        arrayList3.add(i3, new wjo(Math.min(wjoVar.a, wjoVar3.a), Math.max(wjoVar.b, wjoVar3.b)));
                    }
                } while (i2 <= e43.h(arrayList3));
                arrayList.addAll(arrayList3);
                a aVar = (a) ((LayerDrawable) getDrawable(0)).getDrawable(1);
                aVar.b = arrayList;
                aVar.invalidateSelf();
                a aVar2 = (a) ((ClipDrawable) getDrawable(1)).getDrawable();
                aVar2.b = arrayList;
                aVar2.invalidateSelf();
                a aVar3 = (a) ((ClipDrawable) getDrawable(2)).getDrawable();
                aVar3.b = arrayList;
                aVar3.invalidateSelf();
                return;
            }
            Object next = it.next();
            int i5 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            wjo wjoVar4 = (wjo) next;
            float f = width;
            float f2 = wjoVar4.a * f;
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float intValue = f2 + (i > 0 ? ((Number) bVar.a.getValue()).intValue() / 2.0f : 0.0f);
            float f4 = wjoVar4.b * f;
            if (i < e43.h(list2)) {
                f3 = ((Number) bVar.a.getValue()).intValue() / 2.0f;
            }
            arrayList2.add(new wjo(intValue, f4 - f3));
            i = i5;
        }
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        a(rect);
        super.onBoundsChange(rect);
    }

    /* compiled from: VideoAutoPlaySeekBarProgressDrawable.kt */
    public static final class a extends Drawable {
        public final float a;
        public List<wjo> b = EmptyList.b;
        public final Paint c;

        public a(int i, float f) {
            this.a = f;
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(i);
            this.c = paint;
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                float f = this.b.get(i).a;
                float f2 = this.b.get(i).b;
                float f3 = getBounds().bottom;
                canvas.drawRect(f, f3 - this.a, f2, f3, this.c);
            }
        }

        @Override // android.graphics.drawable.Drawable
        @ozl
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
