package com.yandex.messaging.input.util;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import defpackage.nkx;
import defpackage.ny61;
import defpackage.z83;
import defpackage.zq60;
import java.util.ArrayList;

/* loaded from: classes15.dex */
class Keyboarder$OnGlobalLayoutListener implements ViewTreeObserver.OnGlobalLayoutListener {
    static final long STATE_UPDATES_THRESHOLD_MS = 300;
    private final Runnable mActionRunnable;
    private Boolean mLastKeyboardWillBeVisible;
    private final View mLayoutRoot;
    private final nkx mScreenVisibleAreas;
    private final Rect mViewVisibleRect;
    final /* synthetic */ c this$0;

    private Keyboarder$OnGlobalLayoutListener(c cVar, View view) {
        this.this$0 = cVar;
        this.mLastKeyboardWillBeVisible = null;
        this.mActionRunnable = new Runnable() { // from class: com.yandex.messaging.input.util.b
            @Override // java.lang.Runnable
            public final void run() {
                Keyboarder$OnGlobalLayoutListener.this.actOnGlobalLayout();
            }
        };
        this.mViewVisibleRect = new Rect();
        this.mScreenVisibleAreas = new nkx();
        this.mLayoutRoot = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void actOnGlobalLayout() {
        boolean z;
        boolean z2;
        View view = this.this$0.d;
        if (view != null && view.findFocus() == this.this$0.c) {
            boolean booleanValue = this.mLastKeyboardWillBeVisible.booleanValue();
            c cVar = this.this$0;
            int i = 0;
            boolean z3 = true;
            if (!booleanValue) {
                if (cVar.b == Keyboarder$KeyboardState.OPEN) {
                    cVar.b = Keyboarder$KeyboardState.CLOSED;
                    EditText editText = cVar.c;
                    if (editText == null) {
                        z83.j("mTextInput is null");
                    } else {
                        editText.clearFocus();
                        cVar.a.hideSoftInputFromWindow(cVar.c.getWindowToken(), 0);
                    }
                    zq60 zq60Var = cVar.e;
                    zq60Var.getClass();
                    ArrayList arrayList = zq60Var.a;
                    zq60Var.b++;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size && arrayList.get(i2) == null) {
                        i2++;
                    }
                    if (i2 < size) {
                        z = false;
                    } else {
                        zq60.a(zq60Var);
                        z = true;
                        z3 = false;
                    }
                    if (z3) {
                        while (i < size && arrayList.get(i) == null) {
                            i++;
                        }
                        if (i < size) {
                            arrayList.get(i).getClass();
                            ny61.u();
                            return;
                        } else {
                            if (!z) {
                                zq60.a(zq60Var);
                            }
                            ny61.p();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            int i3 = this.mScreenVisibleAreas.b;
            if (cVar.b == Keyboarder$KeyboardState.CLOSED) {
                cVar.b = Keyboarder$KeyboardState.OPEN;
                EditText editText2 = cVar.c;
                if (editText2 == null) {
                    z83.j("mTextInput is null");
                } else {
                    editText2.requestFocus();
                    cVar.a.showSoftInput(cVar.c, 1);
                }
                zq60 zq60Var2 = cVar.e;
                zq60Var2.getClass();
                ArrayList arrayList2 = zq60Var2.a;
                zq60Var2.b++;
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2 && arrayList2.get(i4) == null) {
                    i4++;
                }
                if (i4 < size2) {
                    z2 = false;
                } else {
                    zq60.a(zq60Var2);
                    z2 = true;
                    z3 = false;
                }
                if (z3) {
                    while (i < size2 && arrayList2.get(i) == null) {
                        i++;
                    }
                    if (i < size2) {
                        arrayList2.get(i).getClass();
                        ny61.u();
                    } else {
                        if (!z2) {
                            zq60.a(zq60Var2);
                        }
                        ny61.p();
                    }
                }
            }
        }
    }

    public void destroy() {
        this.mLayoutRoot.removeCallbacks(this.mActionRunnable);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        c cVar = this.this$0;
        if (cVar.h) {
            return;
        }
        int i = cVar.d.getContext().getResources().getDisplayMetrics().heightPixels;
        int i2 = cVar.d.getContext().getApplicationContext().getResources().getDisplayMetrics().heightPixels;
        View view = this.mLayoutRoot;
        Rect rect = this.mViewVisibleRect;
        nkx nkxVar = this.mScreenVisibleAreas;
        view.getWindowVisibleDisplayFrame(rect);
        int height = view.getRootView().getHeight();
        if (height != 0) {
            nkxVar.a = height;
            nkxVar.b = height - rect.bottom;
        }
        boolean z = ((double) nkxVar.b) > ((double) nkxVar.a) * 0.15d;
        Boolean bool = this.mLastKeyboardWillBeVisible;
        if (bool == null || bool.booleanValue() != z) {
            this.mLastKeyboardWillBeVisible = Boolean.valueOf(z);
            this.mLayoutRoot.removeCallbacks(this.mActionRunnable);
            this.mLayoutRoot.postDelayed(this.mActionRunnable, 300L);
        }
    }

    public /* synthetic */ Keyboarder$OnGlobalLayoutListener(c cVar, View view, int i) {
        this(cVar, view);
    }
}
