package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import defpackage.fuz0;
import defpackage.iog0;
import defpackage.q9s0;
import defpackage.qw;
import defpackage.sw;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes10.dex */
public class ActionMenuPresenter$OverflowMenuButton extends AppCompatImageView implements sw {
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionMenuPresenter$OverflowMenuButton(final d dVar, Context context) {
        super(context, null, iog0.actionOverflowButtonStyle);
        this.this$0 = dVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        fuz0.a(this, getContentDescription());
        setOnTouchListener(new ForwardingListener(this) { // from class: androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton.1
            @Override // androidx.appcompat.widget.ForwardingListener
            public q9s0 getPopup() {
                qw qwVar = ActionMenuPresenter$OverflowMenuButton.this.this$0.M;
                if (qwVar == null) {
                    return null;
                }
                return qwVar.b();
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public boolean onForwardingStarted() {
                ActionMenuPresenter$OverflowMenuButton.this.this$0.e();
                return true;
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public boolean onForwardingStopped() {
                d dVar2 = ActionMenuPresenter$OverflowMenuButton.this.this$0;
                if (dVar2.O != null) {
                    return false;
                }
                dVar2.b();
                return true;
            }
        });
    }

    @Override // defpackage.sw
    public boolean needsDividerAfter() {
        return false;
    }

    @Override // defpackage.sw
    public boolean needsDividerBefore() {
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.this$0.e();
        return true;
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
