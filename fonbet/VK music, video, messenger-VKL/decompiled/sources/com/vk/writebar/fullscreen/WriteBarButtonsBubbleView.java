package com.vk.writebar.fullscreen;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.b6f0;
import xsna.d3j0;
import xsna.dhr0;
import xsna.i6m0;
import xsna.iah0;
import xsna.ipq0;
import xsna.msy;
import xsna.v0y0;
import xsna.wfu0;

/* compiled from: WriteBarButtonsBubbleView.kt */
/* loaded from: classes7.dex */
public final class WriteBarButtonsBubbleView extends LinearLayout {
    public static final /* synthetic */ int h = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public WriteBarButtonsBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        d3j0 d3j0Var = new d3j0(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, d3j0Var);
        this.c = msy.a(lazyThreadSafetyMode, new ipq0(this, 17));
        this.d = msy.a(lazyThreadSafetyMode, new b6f0(this, 24));
        this.e = msy.a(lazyThreadSafetyMode, new wfu0(this, 6));
        this.f = msy.a(lazyThreadSafetyMode, new i6m0(this, 19));
        this.g = msy.a(lazyThreadSafetyMode, new v0y0(this, 0));
        View.inflate(context, R.layout.write_bar_buttons_bubble_view, this);
        setTranslationY(getHeight());
        setBackground(dhr0.t.a(R.drawable.background_contrast_themed_16dp));
        float f = 2;
        setElevation(iah0.a(f));
        setClipToPadding(false);
        float f2 = 6;
        setPadding(iah0.a(f2), iah0.a(f), iah0.a(f2), iah0.a(f));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ImageView getButtonCollapse() {
        return (ImageView) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ImageView getButtonSend() {
        return (ImageView) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ImageView getButtonSettings() {
        return (ImageView) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final View getButtonSettingsNewDot() {
        return (View) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final View getWriteBarAttach() {
        return (View) this.b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final View getWritebarAttachNewDot() {
        return (View) this.c.getValue();
    }
}
