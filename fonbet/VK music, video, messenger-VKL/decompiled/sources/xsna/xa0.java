package xsna;

import android.graphics.RuntimeShader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class xa0 {
    public static /* synthetic */ RuntimeShader b() {
        return new RuntimeShader("uniform shader u_input;\nuniform vec2 u_resolution;\nuniform vec2 u_direction;\nuniform float u_sigma;\nuniform float u_flipGradient;  // 0.0 = сверху вниз, 1.0 = снизу вверх\n\nhalf4 main(vec2 fragCoord) {\n    vec2 maxCoord = u_resolution - vec2(1.0);\n\n    float t = fragCoord.y / u_resolution.y;\n    float effectiveSigma = u_sigma * mix(t, 1.0 - t, u_flipGradient);\n\n    // При sigma < 0.5px блюр незаметен и возникает деление на 0 — возвращаем оригинал.\n    if (effectiveSigma < 0.5) {\n        return u_input.eval(clamp(fragCoord, vec2(0.0), maxCoord));\n    }\n\n    float twoSigmaSq = 2.0 * effectiveSigma * effectiveSigma;\n    int radius = int(effectiveSigma);\n\n    half4 color = half4(0.0);\n    float totalWeight = 0.0;\n\n    // AGSL требует константные границы цикла; динамический выход — через break.\n    for (int i = 0; i <= 400; i++) {\n        if (i > 2 * radius) break;\n        float offset = float(i - radius);\n        float w = exp(-offset * offset / twoSigmaSq);\n        vec2 coord = clamp(fragCoord + u_direction * offset, vec2(0.0), maxCoord);\n        color += u_input.eval(coord) * half(w);\n        totalWeight += w;\n    }\n\n    return color * half(1.0 / totalWeight);\n}");
    }
}
