package com.yandex.go.blur.view.internal.rendereffect;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.yandex.go.blur.core.BlurEffect$Progressive$Easing;
import defpackage.b64;
import defpackage.f76;
import defpackage.fjy;
import defpackage.g8e;
import defpackage.hkf0;
import defpackage.i3y;
import defpackage.il1;
import defpackage.rzo;
import defpackage.scv;
import defpackage.sf;
import defpackage.tje;
import defpackage.vng;
import defpackage.w511;
import defpackage.y66;
import defpackage.y6i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes12.dex */
public final class a extends b {
    public final int l;
    public final LinkedHashMap m;
    public final RectF n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, f76 f76Var) {
        super(context, 2, 128, 64, false, false);
        int i = f76Var.a;
        this.l = i;
        this.m = new LinkedHashMap();
        this.n = new RectF();
    }

    @Override // com.yandex.go.blur.view.internal.rendereffect.b, defpackage.v66
    public final String a() {
        return "blur/agsl_render_effect";
    }

    @Override // defpackage.cy4, defpackage.v66
    public final void b(View view) {
        super.b(view);
        this.n.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // com.yandex.go.blur.view.internal.rendereffect.b
    public final RenderEffect i(String str, y66 y66Var, View view) {
        Shader.TileMode tileMode;
        RenderEffect createRuntimeShaderEffect;
        RenderEffect createRuntimeShaderEffect2;
        RenderEffect createChainEffect;
        RectF rectF = this.n;
        if (rectF.isEmpty()) {
            rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
        if (!(y66Var instanceof y66)) {
            w511.b();
            return null;
        }
        RectF P = vng.P(y66Var, new AgslRenderEffectBlurDelegate$createProgressiveBlurEffect$maskShader$1(view, rzo.class, "absoluteCoordinates", "getAbsoluteCoordinates(Landroid/view/View;)J", 1));
        BlurEffect$Progressive$Easing blurEffect$Progressive$Easing = y66Var.g;
        PathInterpolator pathInterpolator = new PathInterpolator(blurEffect$Progressive$Easing.getStartControlX(), blurEffect$Progressive$Easing.getStartControlY(), blurEffect$Progressive$Easing.getEndControlX(), blurEffect$Progressive$Easing.getEndControlY());
        int max = Math.max(this.l, 2);
        float f = P.left;
        float f2 = P.top;
        float f3 = P.right;
        float f4 = P.bottom;
        int[] iArr = new int[max];
        for (int i = 0; i < max; i++) {
            float f5 = y66Var.d;
            iArr[i] = ((int) ((y6i0.c(g8e.b(y66Var.f, f5, pathInterpolator.getInterpolation(i / (max - 1.0f)), f5), 0.0f, 1.0f) * 255.0f) + 0.5f)) << 24;
        }
        int i2 = fjy.a[y66Var.h.ordinal()];
        if (i2 == 1) {
            tileMode = Shader.TileMode.CLAMP;
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            tileMode = Build.VERSION.SDK_INT >= 31 ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP;
        }
        LinearGradient linearGradient = new LinearGradient(f, f2, f3, f4, iArr, (float[]) null, tileMode);
        LinkedHashMap linkedHashMap = this.m;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new il1();
            linkedHashMap.put(str, obj);
        }
        i3y i3yVar = ((il1) obj).a;
        float w = tje.w(y66Var.a, this.e);
        i3y i3yVar2 = hkf0.a;
        Pair pair = (Pair) i3yVar.getValue();
        RuntimeShader e = scv.e(pair.c());
        e.setFloatUniform("contentBounds", rectF.left, rectF.top, rectF.right, rectF.bottom);
        e.setFloatUniform("radius", w);
        e.setInputShader("mask", linearGradient);
        RuntimeShader e2 = scv.e(pair.f());
        e2.setFloatUniform("contentBounds", rectF.left, rectF.top, rectF.right, rectF.bottom);
        e2.setFloatUniform("radius", w);
        e2.setInputShader("mask", linearGradient);
        createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(scv.e(((Pair) i3yVar.getValue()).c()), "content");
        createRuntimeShaderEffect2 = RenderEffect.createRuntimeShaderEffect(scv.e(((Pair) i3yVar.getValue()).f()), "content");
        createChainEffect = RenderEffect.createChainEffect(createRuntimeShaderEffect, createRuntimeShaderEffect2);
        return createChainEffect;
    }

    @Override // com.yandex.go.blur.view.internal.rendereffect.b
    public final RenderEffect j(String str, ArrayList arrayList, View view) {
        RenderEffect createRuntimeShaderEffect;
        LinkedHashMap linkedHashMap = this.m;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new il1();
            linkedHashMap.put(str, obj);
        }
        int size = arrayList.size();
        LinkedHashMap linkedHashMap2 = ((il1) obj).b;
        Integer valueOf = Integer.valueOf(size);
        Object obj2 = linkedHashMap2.get(valueOf);
        if (obj2 == null) {
            sf.t();
            obj2 = sf.A("\n      uniform shader content;\n\n      uniform half4 contentBounds[" + size + "];\n      uniform half4 contentCornerRadii[" + size + "]; \n\n      float rectAlpha(\n        half4 bounds,\n        half4 radii,\n        float2 coord\n      ) {\n          float2 rectCenter = coord - (bounds.xy + bounds.zw) / 2.0;\n\n          float nearestTopCornerRadius = mix(radii.x, radii.y, step(0.0, rectCenter.x));\n          float nearestBottomCornerRadius = mix(radii.w, radii.z, step(0.0, rectCenter.x));\n          float nearestCornerRadius = mix(nearestTopCornerRadius, nearestBottomCornerRadius, step(0.0, rectCenter.y));\n\n          float2 distanceVector = abs(rectCenter) - (bounds.zw - bounds.xy) / 2.0 + nearestCornerRadius;\n          float rectDistance = length(max(distanceVector, 0.0)) - nearestCornerRadius;\n\n          return 1.0 - smoothstep(0.0, 0.5, rectDistance);\n      }\n\n      half4 main(float2 coord) {\n          float alpha = 0.0;\n          for (int rectIndex = 0; rectIndex < " + size + "; rectIndex += 1) {\n              alpha = max(\n                rectAlpha(\n                  contentBounds[rectIndex],\n                  contentCornerRadii[rectIndex],\n                  coord\n                ),\n                alpha\n              );\n          }\n          return half4(alpha, alpha, alpha, alpha);\n      }\n    ");
            linkedHashMap2.put(valueOf, obj2);
        }
        RuntimeShader g = sf.g(obj2);
        float[] fArr = new float[arrayList.size() * 4];
        float[] fArr2 = new float[arrayList.size() * 4];
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            g.setFloatUniform("contentBounds", fArr);
            g.setFloatUniform("contentCornerRadii", fArr2);
            createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(g, "content");
            return createRuntimeShaderEffect;
        }
        Pair pair = (Pair) it.next();
        RectF rectF = (RectF) pair.getFirst();
        b64.D(pair.getSecond());
        fArr[0] = rectF.left;
        fArr[1] = rectF.top;
        fArr[2] = rectF.right;
        fArr[3] = rectF.bottom;
        throw null;
    }
}
