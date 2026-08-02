package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.ajx;
import defpackage.ia30;
import defpackage.rug;
import defpackage.shx;
import defpackage.ta30;
import defpackage.z3i0;
import java.util.HashMap;

/* loaded from: classes10.dex */
public class MotionEffect extends MotionHelper {
    public static final int AUTO = -1;
    public static final int EAST = 2;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final String TAG = "FadeMove";
    private static final int UNSET = -1;
    public static final int WEST = 3;
    private int mFadeMove;
    private float mMotionEffectAlpha;
    private int mMotionEffectEnd;
    private int mMotionEffectStart;
    private boolean mMotionEffectStrictMove;
    private int mMotionEffectTranslationX;
    private int mMotionEffectTranslationY;
    private int mViewTransitionId;

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMotionEffectAlpha = 0.1f;
        this.mMotionEffectStart = 49;
        this.mMotionEffectEnd = 50;
        this.mMotionEffectTranslationX = 0;
        this.mMotionEffectTranslationY = 0;
        this.mMotionEffectStrictMove = true;
        this.mViewTransitionId = -1;
        this.mFadeMove = -1;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3i0.MotionEffect);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == z3i0.MotionEffect_motionEffect_start) {
                    int i2 = obtainStyledAttributes.getInt(index, this.mMotionEffectStart);
                    this.mMotionEffectStart = i2;
                    this.mMotionEffectStart = Math.max(Math.min(i2, 99), 0);
                } else if (index == z3i0.MotionEffect_motionEffect_end) {
                    int i3 = obtainStyledAttributes.getInt(index, this.mMotionEffectEnd);
                    this.mMotionEffectEnd = i3;
                    this.mMotionEffectEnd = Math.max(Math.min(i3, 99), 0);
                } else if (index == z3i0.MotionEffect_motionEffect_translationX) {
                    this.mMotionEffectTranslationX = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMotionEffectTranslationX);
                } else if (index == z3i0.MotionEffect_motionEffect_translationY) {
                    this.mMotionEffectTranslationY = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMotionEffectTranslationY);
                } else if (index == z3i0.MotionEffect_motionEffect_alpha) {
                    this.mMotionEffectAlpha = obtainStyledAttributes.getFloat(index, this.mMotionEffectAlpha);
                } else if (index == z3i0.MotionEffect_motionEffect_move) {
                    this.mFadeMove = obtainStyledAttributes.getInt(index, this.mFadeMove);
                } else if (index == z3i0.MotionEffect_motionEffect_strict) {
                    this.mMotionEffectStrictMove = obtainStyledAttributes.getBoolean(index, this.mMotionEffectStrictMove);
                } else if (index == z3i0.MotionEffect_motionEffect_viewTransition) {
                    this.mViewTransitionId = obtainStyledAttributes.getResourceId(index, this.mViewTransitionId);
                }
            }
            int i4 = this.mMotionEffectStart;
            int i5 = this.mMotionEffectEnd;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.mMotionEffectStart = i4 - 1;
                } else {
                    this.mMotionEffectEnd = i5 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    public boolean isDecorator() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b1, code lost:
    
        if (r2 == 0.0f) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016e, code lost:
    
        if (r15 == 0.0f) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0189, code lost:
    
        if (r15 == 0.0f) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01de  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPreSetup(MotionLayout motionLayout, HashMap<View, ia30> hashMap) {
        shx shxVar;
        shx shxVar2;
        shx shxVar3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        HashMap<View, ia30> hashMap2 = hashMap;
        int i8 = 1;
        View[] views = getViews((ConstraintLayout) getParent());
        if (views == null) {
            rug.a();
            return;
        }
        shx shxVar4 = new shx();
        shx shxVar5 = new shx();
        shxVar4.h(Float.valueOf(this.mMotionEffectAlpha), CaretView.ALPHA_PROPERTY);
        shxVar5.h(Float.valueOf(this.mMotionEffectAlpha), CaretView.ALPHA_PROPERTY);
        shxVar4.a = this.mMotionEffectStart;
        shxVar5.a = this.mMotionEffectEnd;
        ajx ajxVar = new ajx();
        ajxVar.a = this.mMotionEffectStart;
        ajxVar.o = 0;
        ajxVar.h(0, "percentX");
        ajxVar.h(0, "percentY");
        ajx ajxVar2 = new ajx();
        ajxVar2.a = this.mMotionEffectEnd;
        ajxVar2.o = 0;
        ajxVar2.h(1, "percentX");
        ajxVar2.h(1, "percentY");
        shx shxVar6 = null;
        if (this.mMotionEffectTranslationX > 0) {
            shxVar = new shx();
            shxVar2 = new shx();
            shxVar.h(Integer.valueOf(this.mMotionEffectTranslationX), "translationX");
            shxVar.a = this.mMotionEffectEnd;
            shxVar2.h(0, "translationX");
            shxVar2.a = this.mMotionEffectEnd - 1;
        } else {
            shxVar = null;
            shxVar2 = null;
        }
        if (this.mMotionEffectTranslationY > 0) {
            shxVar6 = new shx();
            shxVar3 = new shx();
            shxVar6.h(Integer.valueOf(this.mMotionEffectTranslationY), "translationY");
            shxVar6.a = this.mMotionEffectEnd;
            shxVar3.h(0, "translationY");
            shxVar3.a = this.mMotionEffectEnd - 1;
        } else {
            shxVar3 = null;
        }
        int i9 = this.mFadeMove;
        if (i9 == -1) {
            int[] iArr2 = new int[4];
            int i10 = 0;
            i2 = 3;
            i3 = 2;
            while (i10 < views.length) {
                ia30 ia30Var = hashMap2.get(views[i10]);
                if (ia30Var == null) {
                    iArr = iArr2;
                    i7 = i8;
                } else {
                    i7 = i8;
                    ta30 ta30Var = ia30Var.g;
                    float f = ta30Var.x;
                    ta30 ta30Var2 = ia30Var.f;
                    iArr = iArr2;
                    float f2 = f - ta30Var2.x;
                    float f3 = ta30Var.y - ta30Var2.y;
                    if (f3 < 0.0f) {
                        iArr[i7] = iArr[i7] + 1;
                    }
                    if (f3 > 0.0f) {
                        iArr[0] = iArr[0] + 1;
                    }
                    if (f2 > 0.0f) {
                        iArr[3] = iArr[3] + 1;
                    }
                    if (f2 < 0.0f) {
                        iArr[2] = iArr[2] + 1;
                    }
                }
                i10++;
                i8 = i7;
                iArr2 = iArr;
            }
            int[] iArr3 = iArr2;
            i = i8;
            int i11 = iArr3[0];
            i9 = 0;
            while (i8 < 4) {
                int i12 = iArr3[i8];
                if (i11 < i12) {
                    i9 = i8;
                    i11 = i12;
                }
                i8++;
            }
        } else {
            i = 1;
            i2 = 3;
            i3 = 2;
        }
        int i13 = 0;
        while (i13 < views.length) {
            ia30 ia30Var2 = hashMap2.get(views[i13]);
            if (ia30Var2 == null) {
                i4 = i13;
                i5 = i3;
            } else {
                ta30 ta30Var3 = ia30Var2.g;
                float f4 = ta30Var3.x;
                ta30 ta30Var4 = ia30Var2.f;
                i4 = i13;
                float f5 = f4 - ta30Var4.x;
                float f6 = ta30Var3.y - ta30Var4.y;
                if (i9 == 0) {
                    if (f6 > 0.0f) {
                        if (this.mMotionEffectStrictMove) {
                        }
                        i5 = i3;
                    }
                    i5 = i3;
                    i6 = this.mViewTransitionId;
                    if (i6 != -1) {
                        ia30Var2.a(shxVar4);
                        ia30Var2.a(shxVar5);
                        ia30Var2.a(ajxVar);
                        ia30Var2.a(ajxVar2);
                        if (this.mMotionEffectTranslationX > 0) {
                            ia30Var2.a(shxVar);
                            ia30Var2.a(shxVar2);
                        }
                        if (this.mMotionEffectTranslationY > 0) {
                            ia30Var2.a(shxVar6);
                            ia30Var2.a(shxVar3);
                        }
                    } else {
                        motionLayout.applyViewTransition(i6, ia30Var2);
                    }
                    i13 = i4 + 1;
                    hashMap2 = hashMap;
                    i3 = i5;
                    i2 = 3;
                    i = 1;
                } else if (i9 == i) {
                    if (f6 < 0.0f) {
                        if (this.mMotionEffectStrictMove) {
                        }
                        i5 = i3;
                    }
                    i5 = i3;
                    i6 = this.mViewTransitionId;
                    if (i6 != -1) {
                    }
                    i13 = i4 + 1;
                    hashMap2 = hashMap;
                    i3 = i5;
                    i2 = 3;
                    i = 1;
                } else {
                    i5 = i3;
                    if (i9 != i5) {
                        if (i9 == i2) {
                            if (f5 > 0.0f) {
                                if (this.mMotionEffectStrictMove) {
                                }
                            }
                        }
                        i6 = this.mViewTransitionId;
                        if (i6 != -1) {
                        }
                        i13 = i4 + 1;
                        hashMap2 = hashMap;
                        i3 = i5;
                        i2 = 3;
                        i = 1;
                    } else if (f5 >= 0.0f || (this.mMotionEffectStrictMove && f6 != 0.0f)) {
                        i6 = this.mViewTransitionId;
                        if (i6 != -1) {
                        }
                        i13 = i4 + 1;
                        hashMap2 = hashMap;
                        i3 = i5;
                        i2 = 3;
                        i = 1;
                    }
                }
            }
            i13 = i4 + 1;
            hashMap2 = hashMap;
            i3 = i5;
            i2 = 3;
            i = 1;
        }
    }

    public MotionEffect(Context context) {
        super(context);
        this.mMotionEffectAlpha = 0.1f;
        this.mMotionEffectStart = 49;
        this.mMotionEffectEnd = 50;
        this.mMotionEffectTranslationX = 0;
        this.mMotionEffectTranslationY = 0;
        this.mMotionEffectStrictMove = true;
        this.mViewTransitionId = -1;
        this.mFadeMove = -1;
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMotionEffectAlpha = 0.1f;
        this.mMotionEffectStart = 49;
        this.mMotionEffectEnd = 50;
        this.mMotionEffectTranslationX = 0;
        this.mMotionEffectTranslationY = 0;
        this.mMotionEffectStrictMove = true;
        this.mViewTransitionId = -1;
        this.mFadeMove = -1;
        init(context, attributeSet);
    }
}
