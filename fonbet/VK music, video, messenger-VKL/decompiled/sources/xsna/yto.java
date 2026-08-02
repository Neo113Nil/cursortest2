package xsna;

import android.graphics.RuntimeShader;
import java.security.spec.NamedParameterSpec;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class yto {
    public static /* synthetic */ RuntimeShader a() {
        return new RuntimeShader("uniform vec2 u_Resolution;\nuniform float u_Time;\nuniform vec2 u_dotSize;\n\nvec2 hash2(vec2 p) {\n    p = vec2(dot(p, vec2(127.1, 311.7)), dot(p, vec2(269.5, 183.3)));\n    return -1.0 + 2.0 * fract(sin(p) * 43758.5453123);\n}\n\nfloat random(vec2 seed) {\n    return fract(sin(dot(seed, vec2(12.9898, 78.233))) * 43758.5453123);\n}\n\nfloat randRange(vec2 co, float minVal, float maxVal) {\n    return minVal + (maxVal - minVal) * random(co);\n}\n\n\nvec4 main(vec2 fragCoord) {\n        \n    float multiplier = 0.04;\n    vec2 grid_uv = fragCoord.xy * multiplier;\n\n    // Split into cells\n    vec2 i_cell = floor(grid_uv);\n    vec2 f_cell = fract(grid_uv);\n\n    // Background color\n    vec3 color = vec3(0.0, 0.0, 0.0);\n\n    float min_dist = 1.0;\n\n    // Check adjacent cells for continuous dots\n    for (int y = -1; y <= 1; y++) {\n        for (int x = -1; x <= 1; x++) {\n            vec2 neighbor = vec2(float(x), float(y));\n\n            // Random point within the neighbor cell\n            vec2 point = hash2(i_cell + neighbor);\n\n            // Animate point: sine and cosine for orbital/random movement over time\n            point = 0.5 + 0.5 * sin(u_Time + 6.2831 * point);\n\n            // Vector from pixel to the animated point\n            vec2 diff = neighbor + point - f_cell;\n\n            // Calculate distance to this dot\n            float dist = length(diff);\n\n            // Keep track of the closest distance\n            min_dist = min(min_dist, dist);\n        }\n    }\n\n    // Draw dots based on distance field and smooth out the edges\n    float dot_size = randRange(fragCoord.xy + u_Time, u_dotSize.x, u_dotSize.y);\n    float dot_shape = smoothstep(dot_size, dot_size / 2, min_dist);\n\n    float singleColor = random(i_cell);\n\n    // Assign uniform random colors per block\n    vec3 colorVector = vec3(\n            singleColor,\n            singleColor,\n            singleColor);\n\n\n    color = mix(color, colorVector, dot_shape);\n\n    return vec4(color, 0.0);\n}");
    }

    public static /* synthetic */ NamedParameterSpec d(String str) {
        return new NamedParameterSpec(str);
    }
}
