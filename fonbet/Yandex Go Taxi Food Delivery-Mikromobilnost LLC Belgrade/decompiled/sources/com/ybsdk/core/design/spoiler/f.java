package com.ybsdk.core.design.spoiler;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.ybsdk.core.design.spoiler.Spoiler;
import defpackage.jl40;
import defpackage.ovt0;
import defpackage.rje;
import defpackage.t3i0;
import defpackage.vvb1;
import defpackage.w511;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class f {
    public static Spoiler a(TypedArray typedArray) {
        float v = com.ybsdk.core.utils.ext.view.b.v(typedArray, t3i0.YbSdkSpoilers_ybsdk_spoiler_width, 0.0f);
        float v2 = com.ybsdk.core.utils.ext.view.b.v(typedArray, t3i0.YbSdkSpoilers_ybsdk_spoiler_height, 0.0f);
        int i = t3i0.YbSdkSpoilers_ybsdk_spoiler_horizontal_gravity;
        Spoiler.Gravity gravity = Spoiler.Gravity.START;
        return new Spoiler(new Spoiler.a(a.a(v, typedArray.getInteger(i, gravity.getValue())), a.a(v2, typedArray.getInteger(t3i0.YbSdkSpoilers_ybsdk_spoiler_vertical_gravity, gravity.getValue()))), rje.e(typedArray, t3i0.YbSdkSpoilers_ybsdk_spoiler_color_attr, Spoiler.e), 9);
    }

    public static int b(ovt0 ovt0Var, int i, View view) {
        int i2;
        return (!(ovt0Var instanceof b) || (i2 = ((b) ovt0Var).a) <= (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom()) ? i : View.MeasureSpec.makeMeasureSpec(view.getPaddingBottom() + view.getPaddingTop() + i2, 1073741824);
    }

    public static int c(ovt0 ovt0Var, int i, View view) {
        int i2;
        return (!(ovt0Var instanceof b) || (i2 = ((b) ovt0Var).a) <= (view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight()) ? i : View.MeasureSpec.makeMeasureSpec(view.getPaddingRight() + view.getPaddingLeft() + i2, 1073741824);
    }

    public static void d(Context context, SpoilerEffect spoilerEffect, View view, Spoiler spoiler) {
        Pair pair;
        Pair pair2;
        vvb1 vvb1Var = vvb1.Q;
        int measuredWidth = (view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int measuredHeight = (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom();
        Spoiler.a aVar = spoiler.b;
        ovt0 ovt0Var = aVar.a;
        ovt0 ovt0Var2 = aVar.b;
        if (ovt0Var instanceof b) {
            measuredWidth = Math.min(((b) ovt0Var).a, measuredWidth);
        } else if (!jl40.l(ovt0Var, vvb1Var)) {
            w511.b();
            return;
        }
        boolean z = ovt0Var2 instanceof b;
        if (z) {
            measuredHeight = Math.min(((b) ovt0Var2).a, measuredHeight);
        } else if (!jl40.l(ovt0Var2, vvb1Var)) {
            w511.b();
            return;
        }
        ovt0 ovt0Var3 = aVar.a;
        if (jl40.l(ovt0Var3, vvb1Var)) {
            pair = new Pair(Integer.valueOf(view.getPaddingLeft()), Integer.valueOf(view.getMeasuredWidth() - view.getPaddingRight()));
        } else {
            if (!(ovt0Var3 instanceof b)) {
                w511.b();
                return;
            }
            int i = e.a[((b) ovt0Var3).b.ordinal()];
            if (i == 1) {
                pair = new Pair(Integer.valueOf(view.getPaddingLeft()), Integer.valueOf(view.getPaddingLeft() + measuredWidth));
            } else if (i == 2) {
                pair = new Pair(Integer.valueOf(view.getMeasuredWidth() - measuredWidth), Integer.valueOf(view.getMeasuredWidth()));
            } else if (i != 3) {
                w511.b();
                return;
            } else {
                int measuredWidth2 = (view.getMeasuredWidth() - measuredWidth) / 2;
                pair = new Pair(Integer.valueOf(measuredWidth2), Integer.valueOf(view.getMeasuredWidth() - measuredWidth2));
            }
        }
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        if (jl40.l(ovt0Var2, vvb1Var)) {
            pair2 = new Pair(Integer.valueOf(view.getPaddingTop()), Integer.valueOf(view.getMeasuredHeight() - view.getPaddingBottom()));
        } else {
            if (!z) {
                w511.b();
                return;
            }
            int i2 = e.a[((b) ovt0Var2).b.ordinal()];
            if (i2 == 1) {
                pair2 = new Pair(Integer.valueOf(view.getPaddingTop()), Integer.valueOf(measuredHeight));
            } else if (i2 == 2) {
                pair2 = new Pair(Integer.valueOf((view.getMeasuredHeight() - view.getPaddingBottom()) - measuredHeight), Integer.valueOf(view.getMeasuredHeight() - view.getPaddingBottom()));
            } else if (i2 != 3) {
                w511.b();
                return;
            } else {
                int measuredHeight2 = (view.getMeasuredHeight() - measuredHeight) / 2;
                pair2 = new Pair(Integer.valueOf(measuredHeight2), Integer.valueOf(view.getMeasuredHeight() - measuredHeight2));
            }
        }
        int intValue3 = ((Number) pair2.getFirst()).intValue();
        int intValue4 = ((Number) pair2.getSecond()).intValue();
        spoilerEffect.setColor(spoiler.c.get(context));
        spoilerEffect.setBounds(intValue, intValue3, intValue2, intValue4);
        spoilerEffect.updateMaxParticles();
    }
}
