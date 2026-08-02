package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.emoji.EmojiRecyclerView;
import com.vk.emoji.FastScroller;
import com.vk.stickers.keyboard.StickersView;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;

/* compiled from: StickerEmojiPage.kt */
/* loaded from: classes6.dex */
public final class e4l0 implements wdl0 {
    public final dj60 a;
    public sdp b = sdp.m7;
    public com.vk.emoji.b c;
    public ObjectAnimator d;
    public RecyclerView.t e;
    public boolean f;

    /* compiled from: StickerEmojiPage.kt */
    public static final class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            e4l0.this.d = null;
        }
    }

    public e4l0(dj60 dj60Var) {
        this.a = dj60Var;
    }

    @Override // xsna.wdl0
    public final View a(Context context) {
        com.vk.emoji.b bVar = this.c;
        if (bVar == null) {
            bVar = new com.vk.emoji.b(context);
            dj60 dj60Var = this.a;
            if (((Boolean) dj60Var.invoke()).booleanValue()) {
                int applyDimension = (int) TypedValue.applyDimension(1, 46.0f, bVar.getResources().getDisplayMetrics());
                EmojiRecyclerView emojiRecyclerView = bVar.c;
                emojiRecyclerView.setPadding(0, applyDimension, 0, 0);
                emojiRecyclerView.setClipToPadding(false);
            }
            Typeface a2 = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context);
            TextSizeUnit textSizeUnit = TextSizeUnit.SP;
            bVar.setHeadersTypeface(a2);
            bVar.setOnScrollListener(this.e);
            abg0 abg0Var = dhr0.t;
            bVar.setFastScrollBarColor(abg0Var.c(R.attr.vk_ui_icon_tertiary));
            bVar.setFastScrollHandleColor(abg0Var.c(R.attr.vk_ui_text_accent));
            boolean booleanValue = ((Boolean) dj60Var.invoke()).booleanValue();
            FastScroller fastScroller = bVar.b;
            if (booleanValue) {
                fastScroller.setPadding(0, this.f ? iah0.a(45) : 0, 0, 0);
            } else {
                fastScroller.setPadding(0, 0, 0, this.f ? iah0.a(45) : 0);
            }
            this.c = bVar;
        }
        bVar.setEmojiKeyboardListener(this.b);
        com.vk.emoji.a aVar = bVar.d;
        if (aVar != null) {
            aVar.A0();
        }
        return bVar;
    }

    @Override // xsna.wdl0
    public final void b(boolean z) {
        ObjectAnimator ofInt;
        this.f = z;
        com.vk.emoji.b bVar = this.c;
        if (bVar != null) {
            ObjectAnimator objectAnimator = this.d;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            FastScroller fastScroller = bVar.getFastScroller();
            if (((Boolean) this.a.invoke()).booleanValue()) {
                ofInt = ObjectAnimator.ofInt(fastScroller, FastScroller.v, this.f ? iah0.a(45) : 0);
            } else {
                ofInt = ObjectAnimator.ofInt(fastScroller, FastScroller.u, this.f ? iah0.a(45) : 0);
            }
            ofInt.setInterpolator(StickersView.O);
            ofInt.setDuration(200L);
            ofInt.addListener(new a());
            ofInt.start();
            this.d = ofInt;
        }
    }

    @Override // xsna.wdl0
    public final void onConfigurationChanged(Configuration configuration) {
        com.vk.emoji.b bVar = this.c;
        if (bVar != null) {
            bVar.dispatchConfigurationChanged(configuration);
        }
    }
}
