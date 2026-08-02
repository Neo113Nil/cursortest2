package xsna;

import android.graphics.Matrix;
import android.graphics.Point;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.clickable.ClickableReaction;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.stories.design.view.ReactionView;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ReactionStickerDelegate.kt */
/* loaded from: classes6.dex */
public final class e2f0 {
    public final uov a;
    public final f0q0 b;
    public final ViewGroup c;
    public StoryEntry f;
    public iz8 g;
    public io.reactivex.rxjava3.disposables.c d = EmptyDisposable.INSTANCE;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new lo10(this, 27));
    public final bpn0 h = new bpn0(new rme0(this, 2));
    public final bpn0 i = new bpn0(new wt30(this, 13));

    /* compiled from: View.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ ArrayList c;

        public a(ArrayList arrayList) {
            this.c = arrayList;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            e2f0.this.d(this.c);
        }
    }

    public e2f0(uov uovVar, f0q0 f0q0Var, FrameLayout frameLayout) {
        this.a = uovVar;
        this.b = f0q0Var;
        this.c = frameLayout;
    }

    public final ClickableReaction a() {
        ClickableStickers clickableStickers;
        List<ClickableSticker> list;
        StoryEntry storyEntry = this.f;
        if (storyEntry == null || (clickableStickers = storyEntry.X) == null || (list = clickableStickers.d) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ClickableReaction) {
                arrayList.add(obj);
            }
        }
        return (ClickableReaction) j5g.a0(arrayList);
    }

    public final ReactionView b() {
        return (ReactionView) this.h.getValue();
    }

    public final void c() {
        ClickableStickers clickableStickers;
        ClickableReaction a2;
        StoryEntry storyEntry = this.f;
        iz8 iz8Var = this.g;
        if (storyEntry == null || iz8Var == null || (clickableStickers = storyEntry.X) == null || (a2 = a()) == null) {
            return;
        }
        List<WebClickablePoint> list = a2.c;
        Point point = new Point(clickableStickers.b, clickableStickers.c);
        SizeF sizeF = new SizeF(iz8Var.a, iz8Var.b);
        VideoFile videoFile = storyEntry.n;
        boolean z = (videoFile == null || videoFile.getWidth() == 0 || (videoFile.getWidth() < videoFile.getHeight() && !storyEntry.Lb())) ? false : true;
        Matrix matrix = new Matrix();
        xx1.g(matrix, sizeF, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new SizeF(point.x, point.y), z);
        int size = list.size();
        float[] fArr = new float[size * 2];
        for (int i = 0; i < size; i++) {
            int i2 = i * 2;
            fArr[i2] = list.get(i).b;
            fArr[i2 + 1] = list.get(i).c;
        }
        matrix.mapPoints(fArr);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = i3 * 2;
            arrayList.add(new WebClickablePoint((int) Math.ceil(fArr[i4]), (int) Math.ceil(fArr[i4 + 1])));
        }
        d(arrayList);
        b().addOnLayoutChangeListener(new a(arrayList));
    }

    public final void d(ArrayList arrayList) {
        iz8 iz8Var = this.g;
        if (iz8Var == null) {
            return;
        }
        int measuredWidth = b().getMeasuredWidth();
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int i = ((WebClickablePoint) next).b;
            do {
                Object next2 = it.next();
                int i2 = ((WebClickablePoint) next2).b;
                if (i > i2) {
                    next = next2;
                    i = i2;
                }
            } while (it.hasNext());
        }
        int i3 = ((WebClickablePoint) next).b;
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next3 = it2.next();
        if (it2.hasNext()) {
            int i4 = ((WebClickablePoint) next3).b;
            do {
                Object next4 = it2.next();
                int i5 = ((WebClickablePoint) next4).b;
                if (i4 < i5) {
                    next3 = next4;
                    i4 = i5;
                }
            } while (it2.hasNext());
        }
        int i6 = ((WebClickablePoint) next3).b;
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next5 = it3.next();
        if (it3.hasNext()) {
            int i7 = ((WebClickablePoint) next5).c;
            do {
                Object next6 = it3.next();
                int i8 = ((WebClickablePoint) next6).c;
                if (i7 < i8) {
                    next5 = next6;
                    i7 = i8;
                }
            } while (it3.hasNext());
        }
        ((WebClickablePoint) next5).getClass();
        Iterator it4 = arrayList.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next7 = it4.next();
        if (it4.hasNext()) {
            int i9 = ((WebClickablePoint) next7).c;
            do {
                Object next8 = it4.next();
                int i10 = ((WebClickablePoint) next8).c;
                if (i9 > i10) {
                    next7 = next8;
                    i9 = i10;
                }
            } while (it4.hasNext());
        }
        b().setTranslationY(((WebClickablePoint) next7).c + iz8Var.c);
        b().setTranslationX((((i6 - i3) - measuredWidth) / 2.0f) + i3);
    }
}
