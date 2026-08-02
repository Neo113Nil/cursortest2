package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes5.dex */
public abstract class hkf0 {
    public static final i3y a;
    public static final i3y b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        a = a.b(lazyThreadSafetyMode, new v8f0(23));
        b = a.b(lazyThreadSafetyMode, new v8f0(24));
    }

    public static String a(boolean z) {
        return unr0.p("\n    const half maxRadius = 150.0;\n\n    uniform shader content;\n    uniform vec4 contentBounds;\n\n    uniform float radius;\n    uniform shader mask;\n\n    float gaussian(float x, float invertedDoubleSigmaSquare) {\n      return exp(x * x * invertedDoubleSigmaSquare);\n    }\n\n    vec4 blur(vec2 coord, float radius) {\n      half r = floor(radius);\n\n      float sigma = max(radius / 2.0, 1.0);\n      float invertedDoubleSigmaSquare = -1.0 / (2.0 * sigma * sigma);\n      float weightSum = 1.0;\n      vec4 result = content.eval(coord);\n\n      for (half i = 1.0; i < maxRadius; i += 2.0) {\n        if (i >= r) { break; }\n\n        float weightL = gaussian(i, invertedDoubleSigmaSquare);\n        float weightH = gaussian(i + 1.0, invertedDoubleSigmaSquare);\n        float weight = weightL + weightH;\n        vec2 offset = ", z ? "vec2(0.0, i + weightH / weight)" : "vec2(i + weightH / weight, 0.0)", ";\n\n        vec2 newCoord = coord - offset;\n        if (newCoord.x >= contentBounds[0] && newCoord.y >= contentBounds[1]) {\n          result += weight * content.eval(newCoord);\n          weightSum += weight;\n        }\n\n        newCoord = coord + offset;\n        if (newCoord.x < contentBounds[2] && newCoord.y < contentBounds[3]) {\n          result += weight * content.eval(newCoord);\n          weightSum += weight;\n        }\n      }\n\n      if (r < maxRadius && mod(r, 2.0) == 1.0) {\n        float weight = gaussian(r, invertedDoubleSigmaSquare);\n        vec2 offset = ", z ? "vec2(0.0, r)" : "vec2(r, 0.0)", ";\n\n        vec2 newCoord = coord - offset;\n        if (newCoord.x >= contentBounds[0] && newCoord.y >= contentBounds[1]) {\n          result += weight * content.eval(newCoord);\n          weightSum += weight;\n        }\n\n        newCoord = coord + offset;\n        if (newCoord.x < contentBounds[2] && newCoord.y < contentBounds[3]) {\n          result += weight * content.eval(newCoord);\n          weightSum += weight;\n        }\n      }\n\n      return result / weightSum;\n    }\n\n    vec4 main(vec2 coord) {\n      vec2 maskCoord = max(coord - contentBounds.xy, vec2(0.0, 0.0));\n      float intensity = mask.eval(maskCoord).a;\n\n      return blur(coord, mix(0.0, radius, intensity));\n    }\n  ");
    }
}
