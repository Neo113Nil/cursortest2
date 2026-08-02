package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import defpackage.xa30;
import defpackage.z3i0;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public class MotionScene$Transition$TransitionOnClick implements View.OnClickListener {
    public static final int ANIM_TOGGLE = 17;
    public static final int ANIM_TO_END = 1;
    public static final int ANIM_TO_START = 16;
    public static final int JUMP_TO_END = 256;
    public static final int JUMP_TO_START = 4096;
    int mMode;
    int mTargetId;
    private final xa30 mTransition;

    public MotionScene$Transition$TransitionOnClick(Context context, xa30 xa30Var, XmlPullParser xmlPullParser) {
        this.mTargetId = -1;
        this.mMode = 17;
        this.mTransition = xa30Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), z3i0.OnClick);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == z3i0.OnClick_targetId) {
                this.mTargetId = obtainStyledAttributes.getResourceId(index, this.mTargetId);
            } else if (index == z3i0.OnClick_clickAction) {
                this.mMode = obtainStyledAttributes.getInt(index, this.mMode);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View] */
    public void addOnClickListeners(MotionLayout motionLayout, int i, xa30 xa30Var) {
        int i2 = this.mTargetId;
        MotionLayout motionLayout2 = motionLayout;
        if (i2 != -1) {
            motionLayout2 = motionLayout.findViewById(i2);
        }
        if (motionLayout2 == null) {
            Log.e("MotionScene", "OnClick could not find id " + this.mTargetId);
            return;
        }
        int i3 = xa30Var.d;
        int i4 = xa30Var.c;
        if (i3 == -1) {
            motionLayout2.setOnClickListener(this);
            return;
        }
        int i5 = this.mMode;
        boolean z = false;
        boolean z2 = ((i5 & 1) != 0 && i == i3) | ((i5 & 1) != 0 && i == i3) | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
        if ((i5 & 4096) != 0 && i == i4) {
            z = true;
        }
        if (z2 || z) {
            motionLayout2.setOnClickListener(this);
        }
    }

    public boolean isTransitionViable(xa30 xa30Var, MotionLayout motionLayout) {
        xa30 xa30Var2 = this.mTransition;
        if (xa30Var2 == xa30Var) {
            return true;
        }
        int i = xa30Var2.c;
        int i2 = xa30Var2.d;
        if (i2 == -1) {
            return motionLayout.mCurrentState != i;
        }
        int i3 = motionLayout.mCurrentState;
        return i3 == i2 || i3 == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onClick(View view) {
        MotionLayout motionLayout = this.mTransition.j.a;
        if (!motionLayout.isInteractionEnabled()) {
            return;
        }
        xa30 xa30Var = this.mTransition;
        if (xa30Var.d == -1) {
            int currentState = motionLayout.getCurrentState();
            xa30 xa30Var2 = this.mTransition;
            if (currentState == -1) {
                motionLayout.transitionToState(xa30Var2.c);
                return;
            }
            xa30 xa30Var3 = new xa30(xa30Var2.j, xa30Var2);
            xa30Var3.d = currentState;
            xa30Var3.c = this.mTransition.c;
            motionLayout.setTransition(xa30Var3);
            motionLayout.transitionToEnd();
            return;
        }
        xa30 xa30Var4 = xa30Var.j.c;
        int i = this.mMode;
        boolean z = false;
        boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
        boolean z3 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
        if (z2 && z3) {
            if (xa30Var4 != xa30Var) {
                motionLayout.setTransition(xa30Var);
            }
            if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                z3 = false;
            }
            if (isTransitionViable(xa30Var4, motionLayout)) {
                return;
            }
            if (z && (this.mMode & 1) != 0) {
                motionLayout.setTransition(this.mTransition);
                motionLayout.transitionToEnd();
                return;
            }
            if (z3 && (this.mMode & 16) != 0) {
                motionLayout.setTransition(this.mTransition);
                motionLayout.transitionToStart();
                return;
            } else if (z && (this.mMode & 256) != 0) {
                motionLayout.setTransition(this.mTransition);
                motionLayout.setProgress(1.0f);
                return;
            } else {
                if (!z3 || (this.mMode & 4096) == 0) {
                    return;
                }
                motionLayout.setTransition(this.mTransition);
                motionLayout.setProgress(0.0f);
                return;
            }
        }
        z = z2;
        if (isTransitionViable(xa30Var4, motionLayout)) {
        }
    }

    public void removeOnClickListeners(MotionLayout motionLayout) {
        int i = this.mTargetId;
        if (i == -1) {
            return;
        }
        View findViewById = motionLayout.findViewById(i);
        if (findViewById != null) {
            findViewById.setOnClickListener(null);
            return;
        }
        Log.e("MotionScene", " (*)  could not find id " + this.mTargetId);
    }

    public MotionScene$Transition$TransitionOnClick(xa30 xa30Var, int i, int i2) {
        this.mTransition = xa30Var;
        this.mTargetId = i;
        this.mMode = i2;
    }
}
