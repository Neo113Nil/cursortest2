package xsna;

import android.graphics.RuntimeShader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh4 {
    public static /* synthetic */ RuntimeShader a() {
        return new RuntimeShader("uniform vec2 resolution;\nlayout(color) uniform vec4 bg_TopLeft;\nlayout(color) uniform vec4 bg_TopRight;\nlayout(color) uniform vec4 bg_BottomLeft;\nlayout(color) uniform vec4 bg_BottomRight;\n\nvec3 grad(vec4 c1, vec4 c2, vec4 c3, vec4 c4, vec2 uv) {\n    vec3 top = mix(c1.rgb, c2.rgb, smoothstep(0.0, 1.0, uv.x));\n    vec3 bottom = mix(c3.rgb, c4.rgb, smoothstep(0.0, 1.0, uv.x));\n    return mix(top, bottom, smoothstep(0.0, 1.0, uv.y));\n}\n\nhalf4 main(vec2 fragCoord) {\n    vec2 uv = fragCoord/resolution;\n    vec3 bg = grad(bg_TopLeft, bg_TopRight, bg_BottomLeft, bg_BottomRight, uv);\n    return half4(bg, 1.0);\n}");
    }
}
