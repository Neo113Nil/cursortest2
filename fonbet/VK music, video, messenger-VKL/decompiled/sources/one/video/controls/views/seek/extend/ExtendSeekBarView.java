package one.video.controls.views.seek.extend;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import one.video.controls.views.seek.extend.a;
import xsna.akw;
import xsna.an10;
import xsna.epx;
import xsna.ozl;
import xsna.zwo0;

/* compiled from: ExtendSeekBarView.kt */
@ozl
/* loaded from: classes8.dex */
public final class ExtendSeekBarView extends FrameLayout {
    public final one.video.controls.views.seek.extend.a b;
    public final int c;
    public Float d;
    public boolean e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public zwo0 j;
    public final RecyclerView k;
    public a l;

    /* compiled from: ExtendSeekBarView.kt */
    public interface a {
        void a(long j);

        void b();
    }

    /* compiled from: ExtendSeekBarView.kt */
    public final class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            a aVar;
            if (i != 0 || (aVar = ExtendSeekBarView.this.l) == null) {
                return;
            }
            aVar.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3;
            ExtendSeekBarView extendSeekBarView = ExtendSeekBarView.this;
            int computeHorizontalScrollOffset = extendSeekBarView.k.computeHorizontalScrollOffset();
            if (computeHorizontalScrollOffset != 0) {
                extendSeekBarView.f = computeHorizontalScrollOffset;
            }
            Float f = extendSeekBarView.d;
            if (f != null) {
                float floatValue = f.floatValue();
                if (extendSeekBarView.e || (i3 = extendSeekBarView.c) == 0) {
                    return;
                }
                long c = an10.c(extendSeekBarView.getPositionS() + ((floatValue / i3) * i));
                a aVar = extendSeekBarView.l;
                if (aVar != null) {
                    aVar.a(c);
                }
            }
        }
    }

    /* compiled from: View.kt */
    public static final class c implements View.OnLayoutChangeListener {
        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            ExtendSeekBarView extendSeekBarView = ExtendSeekBarView.this;
            ExtendSeekBarView.a(extendSeekBarView);
            extendSeekBarView.b(extendSeekBarView.getPositionS());
        }
    }

    public ExtendSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        one.video.controls.views.seek.extend.a aVar = new one.video.controls.views.seek.extend.a();
        aVar.c = EmptyList.b;
        this.b = aVar;
        this.c = (int) getResources().getDimension(R.dimen.one_video_extend_seek_height);
        this.g = true;
        this.h = -1;
        this.i = -1;
        LayoutInflater.from(context).inflate(R.layout.one_video_extend_seek_view, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.frames_recycler);
        recyclerView.setClipToPadding(false);
        recyclerView.setAdapter(aVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.addOnScrollListener(new b());
        this.k = recyclerView;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public static final void a(ExtendSeekBarView extendSeekBarView) {
        extendSeekBarView.e = true;
        try {
            extendSeekBarView.k.scrollBy((-extendSeekBarView.b.c.size()) * extendSeekBarView.c, 0);
        } finally {
            extendSeekBarView.e = false;
        }
    }

    public final void b(int i) {
        if (i < 0) {
            i = 0;
        }
        Float f = this.d;
        if (f != null) {
            if (f.floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = null;
            }
            if (f != null) {
                int floatValue = (int) ((this.c / f.floatValue()) * i);
                this.e = true;
                try {
                    this.k.scrollBy(floatValue - this.f, 0);
                } finally {
                    this.e = false;
                }
            }
        }
    }

    public final void c() {
        zwo0 zwo0Var;
        if (this.k.isComputingLayout() || (zwo0Var = this.j) == null) {
            return;
        }
        if (zwo0Var.a() <= 0) {
            zwo0Var = null;
        }
        if (zwo0Var == null) {
            return;
        }
        int i = this.i;
        Integer valueOf = i > 0 ? Integer.valueOf(i) : null;
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            float a2 = intValue / zwo0Var.a();
            this.d = Float.valueOf(a2);
            one.video.controls.views.seek.extend.a aVar = this.b;
            Integer num = aVar.e;
            if (num != null && intValue == num.intValue() && zwo0Var.equals(aVar.d)) {
                return;
            }
            int a3 = zwo0Var.a();
            ArrayList arrayList = new ArrayList(a3);
            for (int i2 = 0; i2 < a3; i2++) {
                arrayList.add(new a.C2178a((int) (i2 * a2), intValue, zwo0Var));
            }
            aVar.c = arrayList;
            aVar.d = zwo0Var;
            aVar.e = valueOf;
            aVar.notifyDataSetChanged();
        }
    }

    public final int getDurationS() {
        return this.i;
    }

    public final akw getImageLoader() {
        return this.b.f;
    }

    public final int getPositionS() {
        return this.h;
    }

    public final zwo0 getTimelineThumbs() {
        return this.j;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.k.setPadding(getMeasuredWidth() / 2, 0, getMeasuredWidth() / 2, 0);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (getVisibility() != 0 || !this.g) {
            this.g = !(getVisibility() == 0);
            return;
        }
        this.g = false;
        this.f = 0;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new c());
        } else {
            a(this);
            b(getPositionS());
        }
    }

    public final void setDurationS(int i) {
        if (this.i != i) {
            this.i = i;
            c();
        }
    }

    public final void setImageLoader(akw akwVar) {
        this.b.f = akwVar;
    }

    public final void setListener(a aVar) {
        this.l = aVar;
    }

    public final void setPositionS(int i) {
        if (this.h != i) {
            this.h = i;
            if (getVisibility() == 0) {
                b(i);
            }
        }
    }

    public final void setTimelineThumbs(zwo0 zwo0Var) {
        if (epx.f(this.j, zwo0Var)) {
            return;
        }
        this.j = zwo0Var;
        c();
    }
}
