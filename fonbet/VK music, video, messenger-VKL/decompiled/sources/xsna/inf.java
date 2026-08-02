package xsna;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.editor.templates.impl.player.VideoSourceType;
import com.vk.clips.editor.templates.impl.player.a;
import com.vk.dto.clips.ClipItemFilterType;
import com.vk.dto.clips.filters.FilterInfo;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.EmptyList;
import xsna.inf;
import xsna.nov;

/* compiled from: ClipsVideoSticker.kt */
@ozl
@SuppressLint({"ViewConstructor"})
/* loaded from: classes16.dex */
public final class inf extends ViewGroup implements nov, oin0, omv {
    public List<yds0> b;
    public final mbl0 c;
    public final int d;
    public final gzs<cgr> e;
    public final boolean f;
    public final z2l0 g;
    public gzs<s3q0> h;
    public Animator i;
    public final bpn0 j;
    public final com.vk.clips.editor.templates.impl.player.a k;
    public Bitmap l;
    public int m;
    public int n;
    public Object o;
    public Object p;
    public final CopyOnWriteArraySet<a> q;
    public final CopyOnWriteArraySet<a.k> r;
    public Float s;
    public Float t;
    public boolean u;

    /* compiled from: ClipsVideoSticker.kt */
    public interface a {
        void a(int i);
    }

    public inf() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inf(Context context, List list, mbl0 mbl0Var, int i, gzs gzsVar, int i2) {
        super(context);
        com.vk.clips.editor.templates.impl.player.a aVar;
        boolean z = (i2 & 256) == 0;
        gzsVar = (i2 & 1024) != 0 ? null : gzsVar;
        boolean z2 = (i2 & 4096) == 0;
        this.b = list;
        this.c = mbl0Var;
        this.d = i;
        this.e = gzsVar;
        this.f = z2;
        this.g = new z2l0(this);
        this.j = new bpn0(new defpackage.h(this, 28));
        this.m = -1;
        this.n = z2 ? -1 : 0;
        EmptyList emptyList = EmptyList.b;
        this.o = emptyList;
        this.p = emptyList;
        new defpackage.i(this, 28);
        new defpackage.j(this, 23);
        new defpackage.k(this, 19);
        this.q = new CopyOnWriteArraySet<>();
        this.r = new CopyOnWriteArraySet<>();
        getCommons().h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (z) {
            aVar = null;
        } else {
            aVar = new com.vk.clips.editor.templates.impl.player.a(context);
            aVar.setOnPreparedListener(null);
            aVar.setOnErrorListener(null);
            aVar.setLoop(true);
            aVar.setPlayWhenReady(true);
            addView(aVar);
        }
        this.k = aVar;
        if (aVar != null) {
            aVar.setLoop(false);
            aVar.setOnEndListener(null);
            aVar.setAudioProcessor(null);
            aVar.setFiltersRenderer(gzsVar != null ? (cgr) gzsVar.invoke() : null);
            aVar.setOnPositionChangedListener(new a.k() { // from class: xsna.gnf
                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
                @Override // com.vk.clips.editor.templates.impl.player.a.k
                public final void c(long j) {
                    int b;
                    inf infVar = inf.this;
                    b = e43.b(r1.size(), infVar.o, new hnf(j, 0));
                    if (b < 0) {
                        b = 0;
                    }
                    Iterator<a.k> it = infVar.r.iterator();
                    while (it.hasNext()) {
                        it.next().c(j);
                    }
                    if (b < 0 || infVar.n == b) {
                        return;
                    }
                    infVar.n = b;
                    Iterator<inf.a> it2 = infVar.q.iterator();
                    while (it2.hasNext()) {
                        it2.next().a(b);
                    }
                }
            });
        }
    }

    private final tfr getFiltersBridge() {
        return (tfr) this.j.getValue();
    }

    public static yds0 i(ArrayList arrayList) {
        Uri uri = ((yds0) j5g.Y(arrayList)).a;
        ocr ocrVar = ((yds0) j5g.Y(arrayList)).b;
        int i = ((yds0) j5g.Y(arrayList)).c;
        int i2 = ((yds0) j5g.Y(arrayList)).d;
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((yds0) it.next()).e;
        }
        return new yds0(uri, ocrVar, i, i2, j, ((yds0) j5g.Y(arrayList)).f, ((yds0) j5g.i0(arrayList)).g, 896);
    }

    @Override // xsna.nov
    public final boolean A0(float f, float f2) {
        return nov.a.e(this, f, f2);
    }

    @Override // xsna.nov
    public final nov C0() {
        inf infVar = new inf(getContext(), this.b, this.c, this.d, null, 7920);
        h(infVar);
        infVar.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        infVar.layout(0, 0, infVar.getMeasuredWidth(), infVar.getMeasuredHeight());
        nov.a.b(this, infVar);
        return infVar;
    }

    @Override // xsna.nov
    public final nov E0(nov novVar) {
        inf infVar = new inf(getContext(), j(this.b), this.c, this.d, this.e, 7152);
        h(infVar);
        infVar.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        infVar.layout(0, 0, infVar.getMeasuredWidth(), infVar.getMeasuredHeight());
        nov.a.b(this, infVar);
        return infVar;
    }

    @Override // xsna.nov
    public final void F0(Canvas canvas, boolean z) {
        com.vk.clips.editor.templates.impl.player.a aVar = this.k;
        if (aVar != null) {
            if (i0q0.b()) {
                awt0.u(aVar, !z);
            } else {
                i0q0.f(new fnf(aVar, z));
            }
        }
        nov.a.a(this, canvas, z);
    }

    @Override // xsna.nov
    public final void G0(Canvas canvas) {
        int i = this.m;
        if (i == -1) {
            draw(canvas);
            return;
        }
        Bitmap bitmap = i == 1 ? this.l : null;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
        } else {
            L.l("You try use preview mode without pre cache bitmaps!");
        }
    }

    @Override // xsna.nov
    public final boolean H0() {
        return getCommons().isVisible();
    }

    @Override // xsna.nov
    public final void a(float f, float f2, float f3) {
        nov.a.f(this, f, f2, f3);
    }

    @Override // xsna.omv
    public final void b() {
        com.vk.clips.editor.templates.impl.player.a aVar = this.k;
        if (aVar != null) {
            aVar.v(new q7f(1, 0L, aVar));
        }
    }

    @Override // xsna.nov
    public final nov copy() {
        return E0(null);
    }

    @Override // xsna.nov
    public final boolean d() {
        return getCommons().d();
    }

    @Override // xsna.nov
    public final void e(float f, float f2) {
        nov.a.i(this, f, f2);
    }

    public final boolean equals(Object obj) {
        List list;
        inf infVar = obj instanceof inf ? (inf) obj : null;
        if (infVar == null || (list = infVar.b) == null) {
            list = EmptyList.b;
        }
        if (this.b.size() != list.size()) {
            return false;
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (!epx.f(this.b.get(i), (yds0) list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.nov
    public String getAccessibilityText() {
        return "";
    }

    public final rt4 getAudioProcessor() {
        return null;
    }

    @Override // android.view.View, xsna.nov
    public float getBottom() {
        return getCommons().getBottom();
    }

    @Override // xsna.nov
    public Animator getBounceAnimator() {
        return this.i;
    }

    @Override // xsna.nov
    public boolean getCanRotate() {
        return true;
    }

    @Override // xsna.nov
    public boolean getCanScale() {
        return true;
    }

    @Override // xsna.nov
    public boolean getCanStickToSafeZoneGuideLines() {
        return false;
    }

    @Override // xsna.nov
    public boolean getCanTranslateX() {
        return true;
    }

    @Override // xsna.nov
    public boolean getCanTranslateY() {
        return true;
    }

    @Override // xsna.nov
    public float getCenterX() {
        return getCommons().getCenterX();
    }

    @Override // xsna.nov
    public float getCenterY() {
        return getCommons().getCenterY();
    }

    @Override // xsna.omv
    public long getCurrentPosition() {
        com.vk.clips.editor.templates.impl.player.a aVar = this.k;
        if (aVar != null) {
            return aVar.getCurrentPosition();
        }
        return 0L;
    }

    public final long getDuration() {
        Iterator<T> it = this.b.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((yds0) it.next()).b();
        }
        return j;
    }

    @Override // xsna.nov
    public PointF[] getFillPoints() {
        return getCommons().getFillPoints();
    }

    @Override // xsna.nov
    public boolean getInDraggingMode() {
        return getCommons().getInDraggingMode();
    }

    @Override // xsna.nov
    public boolean getInEditMode() {
        return getCommons().getInEditMode();
    }

    @Override // xsna.nov
    public gzs<s3q0> getInvalidator() {
        return this.h;
    }

    public final Bitmap getLastFrameBitmap() {
        return this.l;
    }

    @Override // android.view.View, xsna.nov
    public float getLeft() {
        return getCommons().getLeft();
    }

    public final int getMaxDurationMs() {
        return this.d;
    }

    @Override // xsna.nov
    public float getMaxScaleLimit() {
        return 7.0f;
    }

    @Override // xsna.nov
    public float getMinScaleLimit() {
        return 0.3f;
    }

    @Override // xsna.nov
    public int getMovePointersCount() {
        return 2;
    }

    public final a.h getOnErrorListener() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 == null) goto L9;
     */
    @Override // xsna.nov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getOriginalHeight() {
        Number number;
        yds0 yds0Var = (yds0) j5g.b0(this.n, this.b);
        if (yds0Var != null) {
            number = Integer.valueOf(yds0Var.d);
            if (number.intValue() <= 0) {
                number = null;
            }
        }
        number = this.t;
        if (number == null) {
            number = Integer.valueOf(iah0.f().widthPixels);
        }
        return number.floatValue();
    }

    @Override // xsna.nov
    public float getOriginalStickerScale() {
        return getCommons().k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 == null) goto L9;
     */
    @Override // xsna.nov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getOriginalWidth() {
        Number number;
        yds0 yds0Var = (yds0) j5g.b0(this.n, this.b);
        if (yds0Var != null) {
            number = Integer.valueOf(yds0Var.c);
            if (number.intValue() <= 0) {
                number = null;
            }
        }
        number = this.s;
        if (number == null) {
            number = Integer.valueOf(iah0.f().widthPixels);
        }
        return number.floatValue();
    }

    public final a.l getPreparedListener() {
        return null;
    }

    public final int getPrevMode() {
        return this.m;
    }

    @Override // xsna.nov
    public float getRealHeight() {
        return nov.a.c(this);
    }

    @Override // xsna.nov
    public float getRealWidth() {
        return nov.a.d(this);
    }

    @Override // android.view.View, xsna.nov
    public float getRight() {
        return getCommons().getRight();
    }

    public final long getStartMs() {
        return 0L;
    }

    @Override // xsna.nov
    public int getStickerAlpha() {
        return an10.b(getAlpha() * 255);
    }

    @Override // xsna.nov
    public int getStickerLayerType() {
        return 1;
    }

    @Override // xsna.nov
    public Matrix getStickerMatrix() {
        return getCommons().getTransformMatrix();
    }

    @Override // xsna.nov
    public float getStickerRotation() {
        return pov.b(getStickerMatrix());
    }

    @Override // xsna.nov
    public float getStickerScale() {
        return getCommons().c();
    }

    @Override // xsna.nov
    public float getStickerTranslationX() {
        return pov.e(getStickerMatrix());
    }

    @Override // xsna.nov
    public float getStickerTranslationY() {
        return pov.f(getStickerMatrix());
    }

    @Override // android.view.View, xsna.nov
    public float getTop() {
        return getCommons().getTop();
    }

    public final yds0 getVideoData() {
        return (yds0) j5g.b0(0, this.b);
    }

    public final List<yds0> getVideoDataList() {
        return this.b;
    }

    public final a.g getVideoEndListener() {
        return null;
    }

    public final com.vk.clips.editor.templates.impl.player.a getVideoView() {
        return this.k;
    }

    public final void h(inf infVar) {
        List<yds0> videoDataList;
        com.vk.clips.editor.templates.impl.player.a aVar = infVar.k;
        if (aVar != null) {
            com.vk.clips.editor.templates.impl.player.a aVar2 = this.k;
            aVar.x((aVar2 == null || (videoDataList = aVar2.getVideoDataList()) == null) ? null : j(videoDataList), true, 0L, true);
        }
        infVar.l = this.l;
        infVar.m(null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b);
    }

    public final ArrayList j(List list) {
        List<yds0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (yds0 yds0Var : list2) {
            arrayList.add(yds0.a(yds0Var, new ocr(yds0Var.b.a, getFiltersBridge().c(yds0Var.b.a.b, getContext())), 0L, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT));
        }
        return arrayList;
    }

    public final void k(Long l, List list) {
        this.b = list;
        m(l != null ? Long.valueOf(l.longValue()) : null);
        if (this.f) {
            this.n = -1;
        }
    }

    public final void m(Long l) {
        long j;
        long j2;
        Long valueOf;
        List<yds0> list;
        List<yds0> list2 = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (true) {
            j = 1;
            j2 = 0;
            if (!it.hasNext()) {
                break;
            }
            yds0 yds0Var = (yds0) it.next();
            q500 q500Var = (q500) j5g.k0(arrayList);
            valueOf = q500Var != null ? Long.valueOf(q500Var.c) : null;
            long longValue = valueOf != null ? valueOf.longValue() + 1 : 0L;
            if (valueOf != null) {
                j2 = valueOf.longValue();
            }
            arrayList.add(new q500(longValue, yds0Var.b() + j2));
        }
        this.o = arrayList;
        List<yds0> list3 = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (yds0 yds0Var2 : list3) {
            q500 q500Var2 = (q500) j5g.k0(arrayList2);
            Long valueOf2 = q500Var2 != null ? Long.valueOf(q500Var2.c) : null;
            arrayList2.add(new q500(valueOf2 != null ? valueOf2.longValue() + j : 0L, (valueOf2 != null ? valueOf2.longValue() : 0L) + ((long) (yds0Var2.b() / yds0Var2.i))));
            j = 1;
        }
        this.p = arrayList2;
        com.vk.clips.editor.templates.impl.player.a aVar = this.k;
        if (l != null) {
            j2 = l.longValue();
        } else {
            valueOf = aVar != null ? Long.valueOf(aVar.getCurrentPosition()) : null;
            if (valueOf != null) {
                j2 = valueOf.longValue();
            }
        }
        long j3 = j2;
        List<yds0> list4 = this.b;
        if (list4.isEmpty()) {
            list = list4;
        } else {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (yds0 yds0Var3 : list4) {
                if (arrayList4.isEmpty()) {
                    arrayList4.add(yds0Var3);
                } else {
                    yds0 yds0Var4 = (yds0) j5g.i0(arrayList4);
                    if (epx.f(yds0Var4.a, yds0Var3.a) && Math.abs(yds0Var4.g - yds0Var3.f) <= 2 && epx.f(yds0Var4.b, yds0Var3.b)) {
                        arrayList4.add(yds0Var3);
                    } else {
                        arrayList3.add(i(arrayList4));
                        arrayList4.clear();
                        arrayList4.add(yds0Var3);
                    }
                }
            }
            arrayList3.add(i(arrayList4));
            list = arrayList3;
        }
        if (list.isEmpty()) {
            return;
        }
        if (aVar != null) {
            aVar.setVideoSourceType(VideoSourceType.MP4);
        }
        if (aVar != null) {
            aVar.x(list, true, j3, true);
        }
        getVideoDataList().isEmpty();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.vk.clips.editor.templates.impl.player.a aVar = this.k;
        if (aVar != null) {
            aVar.layout(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(an10.b(getOriginalWidth()), an10.b(getOriginalHeight()));
    }

    @Override // xsna.nov
    public void setBounceAnimator(Animator animator) {
        this.i = animator;
    }

    public void setInDraggingMode(boolean z) {
        getCommons().n(z);
    }

    @Override // xsna.nov
    public void setInEditMode(boolean z) {
        getCommons().setInEditMode(z);
    }

    @Override // xsna.nov
    public void setInvalidator(gzs<s3q0> gzsVar) {
        this.h = gzsVar;
    }

    public final void setLastFrameBitmap(Bitmap bitmap) {
        this.l = bitmap;
    }

    @Override // xsna.omv
    public void setMute(boolean z) {
        com.vk.clips.editor.templates.impl.player.a aVar;
        if ((!this.u || z) && (aVar = this.k) != null) {
            aVar.setMute(z);
        }
    }

    @Override // xsna.omv
    public void setNeedRequestAudioFocus(boolean z) {
        com.vk.clips.editor.templates.impl.player.a aVar = this.k;
        if (aVar != null) {
            aVar.setNeedRequestAudioFocus(z);
        }
    }

    public void setOriginalStickerScale(float f) {
        getCommons().g(f);
    }

    public final void setPermanentMute(boolean z) {
        this.u = z;
        com.vk.clips.editor.templates.impl.player.a aVar = this.k;
        if (aVar != null) {
            aVar.setMute(true);
        }
    }

    public final void setPrevMode(int i) {
        this.m = i;
    }

    public final void setPreviewFilterInfo(FilterInfo filterInfo) {
        cgr filtersRender;
        com.vk.clips.editor.templates.impl.player.a aVar = this.k;
        if (aVar == null || (filtersRender = aVar.getFiltersRender()) == null) {
            return;
        }
        if (filterInfo == null) {
            filtersRender.f();
            return;
        }
        ClipItemFilterType clipItemFilterType = filterInfo.b;
        ocr c = filtersRender.c();
        new ocr(filterInfo.d(), (c == null || !epx.f(c.a.b.name(), clipItemFilterType.name())) ? getFiltersBridge().c(clipItemFilterType.i(), getContext()) : c.b);
        filtersRender.f();
    }

    @Override // xsna.oin0
    public void setPreviewMode(int i) {
        this.m = i;
    }

    @Override // xsna.nov
    public void setRemovable(boolean z) {
        getCommons().setRemovable(z);
    }

    @Override // xsna.nov
    public void setStatic(boolean z) {
        getCommons().setStatic(z);
    }

    @Override // xsna.nov
    public void setStickerAlpha(int i) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha(i);
        }
        float f = i / 255;
        setAlpha(f);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).setAlpha(f);
        }
    }

    @Override // xsna.nov
    public void setStickerMatrix(Matrix matrix) {
        getCommons().getTransformMatrix().set(matrix);
    }

    public void setStickerRotation(float f) {
        nov.a.g(f, this);
    }

    public void setStickerScale(float f) {
        nov.a.h(f, this);
    }

    @Override // xsna.nov
    public void setStickerTranslationX(float f) {
        getStickerMatrix().setTranslate(f, getStickerTranslationY());
    }

    @Override // xsna.nov
    public void setStickerTranslationY(float f) {
        getStickerMatrix().setTranslate(getStickerTranslationX(), f);
    }

    @Override // xsna.nov
    public void setStickerVisible(boolean z) {
        awt0.u(this, z);
        getCommons().setVisible(z);
    }

    @Override // xsna.omv
    public void setVolume(float f) {
        com.vk.clips.editor.templates.impl.player.a aVar;
        if (this.u || (aVar = this.k) == null) {
            return;
        }
        aVar.setSoundVolume(f);
    }

    @Override // xsna.nov
    public final void stopEncoding() {
        com.vk.clips.editor.templates.impl.player.a aVar = this.k;
        if (aVar != null) {
            aVar.v(new o93(aVar, 7));
        }
    }

    @Override // xsna.nov
    public final void t0() {
        nov.a.j(this);
    }

    @Override // xsna.nov
    public final boolean v0() {
        return getCommons().v0();
    }

    @Override // xsna.nov
    public final void w0(float f, float f2) {
        getCommons().w0(f, f2);
    }

    @Override // xsna.nov
    public final void x0(RectF rectF, float f, float f2) {
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
    }

    @Override // xsna.nov
    public final void y0(float f, float f2, float f3, boolean z) {
        getCommons().y0(f, f2, f3, z);
    }

    @Override // xsna.nov
    public final boolean z0() {
        return false;
    }

    @Override // xsna.nov
    public z2l0 getCommons() {
        return this.g;
    }

    public static /* synthetic */ void getPrevMode$annotations() {
    }

    @Override // xsna.nov
    public final void startEncoding() {
    }

    @Override // xsna.nov
    public void setStickerAccessibilityListener(o1l0 o1l0Var) {
    }

    @Override // xsna.nov
    public void setTimestampMsValue(int i) {
    }

    public final void setVideoPlaybackSpeed(float f) {
    }
}
