package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.drawable.IndeterminateHorizontalProgressDrawable;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.progress.VkProgress;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: VkFeedAudioAttachView.kt */
/* loaded from: classes18.dex */
public final class utu0 extends ViewGroup implements View.OnClickListener, too0 {
    public final VkText b;
    public final VkText c;
    public final VkText d;
    public final VkImageSimple e;
    public final VkImageSimple f;
    public final VkImageSimple g;
    public final VkProgress h;
    public b i;

    /* compiled from: VkFeedAudioAttachView.kt */
    public static final class a extends LayerDrawable implements Animatable {
        public final Drawable[] b;
        public final int c;

        public a(Drawable[] drawableArr) {
            super(drawableArr);
            this.b = drawableArr;
            this.c = 1;
        }

        @Override // android.graphics.drawable.Animatable
        public final boolean isRunning() {
            return ((Animatable) getDrawable(this.c)).isRunning();
        }

        @Override // android.graphics.drawable.Animatable
        public final void start() {
            ((Animatable) getDrawable(this.c)).start();
        }

        @Override // android.graphics.drawable.Animatable
        public final void stop() {
            ((Animatable) getDrawable(this.c)).stop();
        }
    }

    /* compiled from: VkFeedAudioAttachView.kt */
    public interface b {
        void a();

        void b();

        void c(View view);

        void onAttachedToWindow();

        void onDetachedFromWindow();
    }

    /* compiled from: VkFeedAudioAttachView.kt */
    public static final class c {
        public final tlo0.h a;
        public final tlo0.h b;
        public final tlo0.h c;
        public final boolean d;
        public final boolean e;
        public final tlo0.h f;

        public c(tlo0.h hVar, tlo0.h hVar2, tlo0.h hVar3, boolean z, boolean z2, tlo0.h hVar4) {
            this.a = hVar;
            this.b = hVar2;
            this.c = hVar3;
            this.d = z;
            this.e = z2;
            this.f = hVar4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b) && this.c.equals(cVar.c) && this.d == cVar.d && this.e == cVar.e && this.f.equals(cVar.f);
        }

        public final int hashCode() {
            return this.f.a.hashCode() + qoy.b(qoy.b(u11.c(u11.c(this.a.a.hashCode() * 31, 31, this.b.a), 31, this.c.a), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewData(titleSource=");
            sb.append(this.a);
            sb.append(", artistSource=");
            sb.append(this.b);
            sb.append(", timeSource=");
            sb.append(this.c);
            sb.append(", hasIllegalNoticeType=");
            sb.append(this.d);
            sb.append(", isRestricted=");
            sb.append(this.e);
            sb.append(", talkbackSource=");
            return jq.c(sb, this.f, ')');
        }
    }

    public utu0(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        LayoutInflater.from(context).inflate(R.layout.pds_audio_attach, this);
        this.b = (VkText) findViewById(R.id.pds_audio_attach_title);
        this.c = (VkText) findViewById(R.id.pds_audio_attach_artist);
        this.d = (VkText) findViewById(R.id.pds_audio_attach_time);
        this.f = (VkImageSimple) findViewById(R.id.pds_audio_attach_play);
        this.e = (VkImageSimple) findViewById(R.id.pds_audio_attach_explicit);
        this.g = (VkImageSimple) findViewById(R.id.pds_audio_attach_remove);
        VkProgress vkProgress = (VkProgress) findViewById(R.id.pds_audio_attach_progress);
        this.h = vkProgress;
        IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable = new IndeterminateHorizontalProgressDrawable();
        indeterminateHorizontalProgressDrawable.setColorFilter(new PorterDuffColorFilter(getContext().getColor(R.color.vk_orange), PorterDuff.Mode.SRC_IN));
        a aVar = new a(new Drawable[]{dhr0.t.b(R.drawable.progress_audio_attach, R.attr.vk_ui_separator_primary_alpha), indeterminateHorizontalProgressDrawable});
        vkProgress.setLayerType(1, null);
        vkProgress.setIndeterminateDrawable(aVar);
    }

    @Override // xsna.too0
    public final void Ng() {
        LayerDrawable layerDrawable = (LayerDrawable) this.h.getIndeterminateDrawable();
        Drawable drawable = layerDrawable.getDrawable(0);
        int l = krv0.l(R.attr.vk_ui_separator_primary_alpha);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(l, mode);
        layerDrawable.getDrawable(1).setColorFilter(getContext().getColor(R.color.vk_orange), mode);
    }

    public final float getArtistTextSize() {
        return this.c.getTextSize();
    }

    public final float getTitleTextSize() {
        return this.b.getTextSize();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.i;
        if (bVar != null) {
            bVar.onAttachedToWindow();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        int id = view.getId();
        if (id == R.id.pds_audio_attach_remove) {
            b bVar = this.i;
            if (bVar != null) {
                bVar.c(view);
                return;
            }
            return;
        }
        if (id == R.id.pds_audio_attach_play) {
            b bVar2 = this.i;
            if (bVar2 != null) {
                bVar2.a();
                return;
            }
            return;
        }
        b bVar3 = this.i;
        if (bVar3 != null) {
            bVar3.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b bVar = this.i;
        if (bVar != null) {
            bVar.onDetachedFromWindow();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int a2 = iah0.a(3.0f);
        int a3 = iah0.a(6.0f);
        int a4 = iah0.a(7.0f);
        int a5 = iah0.a(9.0f);
        int a6 = iah0.a(12.0f);
        int paddingLeft = getPaddingLeft();
        VkText vkText = this.b;
        int measuredHeight = vkText.getMeasuredHeight();
        int measuredWidth = vkText.getMeasuredWidth();
        VkText vkText2 = this.d;
        int measuredHeight2 = vkText2.getMeasuredHeight();
        int measuredWidth2 = vkText2.getMeasuredWidth();
        VkImageSimple vkImageSimple = this.f;
        int measuredWidth3 = vkImageSimple.getMeasuredWidth();
        VkImageSimple vkImageSimple2 = this.e;
        int measuredHeight3 = vkImageSimple2.getMeasuredHeight();
        VkImageSimple vkImageSimple3 = this.g;
        int i7 = vkImageSimple3.getVisibility() == 0 ? paddingLeft + measuredWidth3 + a6 + measuredWidth + a2 : (((i3 - i) - paddingLeft) - measuredWidth2) - measuredHeight3;
        int i8 = vkImageSimple3.getVisibility() == 0 ? paddingLeft + measuredWidth3 + a6 + measuredWidth + measuredHeight3 : (((i3 - i) - paddingLeft) - measuredWidth2) - a2;
        if (vkImageSimple3.getVisibility() == 0) {
            i5 = measuredWidth2;
            i6 = a4;
        } else {
            i5 = measuredWidth2;
            i6 = a4 + measuredHeight + a2;
        }
        int a7 = vkImageSimple3.getVisibility() == 0 ? a4 + measuredHeight : lr.a(a4, measuredHeight, a2, measuredHeight2);
        int measuredHeight4 = ((i4 - i2) - vkImageSimple3.getMeasuredHeight()) / 2;
        int i9 = measuredWidth3 + paddingLeft;
        vkImageSimple.layout(paddingLeft, a3, i9, vkImageSimple.getMeasuredHeight() + a3);
        int i10 = i9 + a6;
        int i11 = a4 + measuredHeight;
        int i12 = i11 + a2;
        vkText.layout(i10, a4, i10 + measuredWidth, i12);
        vkImageSimple2.layout(i7, i6, i8, a7);
        VkText vkText3 = this.c;
        vkText3.layout(i10, i12, vkText3.getMeasuredWidth() + i10, vkText3.getMeasuredHeight() + i12 + a2);
        int i13 = i3 - i;
        int i14 = i13 - paddingLeft;
        vkText2.layout(i14 - i5, i6, i14, a7);
        vkImageSimple3.layout(i14 - vkImageSimple3.getMeasuredWidth(), measuredHeight4, i13 - getPaddingRight(), vkImageSimple3.getMeasuredHeight() + measuredHeight4);
        int i15 = i11 + a5;
        VkProgress vkProgress = this.h;
        vkProgress.layout(i10, i15, vkProgress.getMeasuredWidth() + i10, vkProgress.getMeasuredHeight() + i15);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iah0.a(16.0f), Integer.MIN_VALUE);
        VkText vkText = this.d;
        vkText.measure(makeMeasureSpec, makeMeasureSpec2);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iah0.a(16.0f), 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iah0.a(16.0f), 1073741824);
        VkImageSimple vkImageSimple = this.e;
        vkImageSimple.measure(makeMeasureSpec3, makeMeasureSpec4);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.post_attach_common_remove_button_size);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
        VkImageSimple vkImageSimple2 = this.g;
        vkImageSimple2.measure(makeMeasureSpec5, makeMeasureSpec6);
        int a2 = iah0.a(12.0f);
        int a3 = iah0.a(7.0f);
        int a4 = iah0.a(3.0f);
        int a5 = iah0.a(4.0f);
        int a6 = iah0.a(6.0f);
        int measuredWidth = vkImageSimple.getMeasuredWidth() + vkText.getMeasuredWidth() + a5 + a5;
        int measuredWidth2 = vkImageSimple.getMeasuredWidth() + vkImageSimple2.getMeasuredWidth() + a6;
        int i3 = vkImageSimple2.getVisibility() == 0 ? measuredWidth2 : 0;
        if (vkImageSimple2.getVisibility() == 0) {
            measuredWidth = measuredWidth2;
        }
        int makeMeasureSpec7 = View.MeasureSpec.makeMeasureSpec(iah0.a(36.0f), 1073741824);
        int makeMeasureSpec8 = View.MeasureSpec.makeMeasureSpec(iah0.a(36.0f), 1073741824);
        VkImageSimple vkImageSimple3 = this.f;
        vkImageSimple3.measure(makeMeasureSpec7, makeMeasureSpec8);
        int makeMeasureSpec9 = View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i) - vkImageSimple3.getMeasuredWidth()) - i3) - a2, Integer.MIN_VALUE);
        int makeMeasureSpec10 = View.MeasureSpec.makeMeasureSpec(iah0.a(20.0f), Integer.MIN_VALUE);
        VkText vkText2 = this.b;
        vkText2.measure(makeMeasureSpec9, makeMeasureSpec10);
        int makeMeasureSpec11 = View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i) - vkImageSimple3.getMeasuredWidth()) - measuredWidth) - a2, 1073741824);
        int makeMeasureSpec12 = View.MeasureSpec.makeMeasureSpec(iah0.a(20.0f), Integer.MIN_VALUE);
        VkText vkText3 = this.c;
        vkText3.measure(makeMeasureSpec11, makeMeasureSpec12);
        this.h.measure(View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i) - vkImageSimple3.getMeasuredWidth()) - i3) - a2, 1073741824), View.MeasureSpec.makeMeasureSpec(iah0.a(2.0f), 1073741824));
        int measuredHeight = vkText3.getMeasuredHeight() + vkText2.getMeasuredHeight() + a3 + a4 + a3;
        int measuredHeight2 = vkImageSimple3.getMeasuredHeight() + a3 + a3;
        int size = View.MeasureSpec.getSize(i);
        if (measuredHeight2 > measuredHeight) {
            measuredHeight = measuredHeight2;
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(measuredHeight));
    }

    public final void setAudioViewListener(b bVar) {
        this.i = bVar;
    }

    public final void setData(c cVar) {
        this.b.setText(tlo0.b.a(cVar.a, getContext()));
        CharSequence a2 = tlo0.b.a(cVar.b, getContext());
        VkText vkText = this.c;
        vkText.setText(a2);
        vkText.setVisibility(0);
        VkProgress vkProgress = this.h;
        vkProgress.setVisibility(8);
        vkProgress.setIndeterminate(true);
        this.e.setVisibility(cVar.d ? 0 : 8);
        this.d.setText(tlo0.b.a(cVar.c, getContext()));
        setContentDescription(tlo0.b.a(cVar.f, getContext()));
        setAlpha(cVar.e ? 0.5f : 1.0f);
    }

    public final void setIsArtistTextVisible(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public final void setIsExplicitVisible(boolean z) {
        this.e.setVisibility(z ? 0 : 8);
    }

    public final void setIsProgressBarVisible(boolean z) {
        this.h.setVisibility(z ? 0 : 8);
    }

    public final void setIsRemoveButtonVisible(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
    }

    public final void setIsTimeTextVisible(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
    }

    public final void setPlayButtonContentDescription(tlo0 tlo0Var) {
        this.f.setContentDescription(tlo0Var.a(getContext()));
    }

    public final void setPlayButtonDrawable(dko dkoVar) {
        this.f.setImageDrawable(dkoVar.a(getContext()));
    }

    public final void setTitleText(tlo0 tlo0Var) {
        this.b.setText(tlo0Var.a(getContext()));
    }

    public final void setUpOnClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
        this.f.setOnClickListener(onClickListener);
        this.g.setOnClickListener(onClickListener);
    }
}
