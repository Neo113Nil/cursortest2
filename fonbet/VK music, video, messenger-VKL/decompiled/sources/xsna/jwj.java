package xsna;

import android.opengl.GLES20;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.filters.model.Correction;
import java.util.Random;

/* compiled from: CorrectionFilter.kt */
/* loaded from: classes12.dex */
public final class jwj extends e0u {
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public final float F;
    public final float G;
    public Correction q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public jwj() {
        super("uniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute highp vec4 aPosition;\nattribute highp vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = mvpMatrix * aPosition;   vTextureCoord = (texMatrix * aTextureCoord).xy;}\n", "\n%s\nprecision highp float;\n\nvarying vec2 vTextureCoord;\n\nuniform %s sTexture;\nuniform float paramExposure;\nuniform float paramBrightness;\nuniform float paramContrast;\nuniform float paramSaturation;\nuniform float paramTemperature;\nuniform float paramShadow;\nuniform float paramHighlight;\nuniform float paramSharpness;\nuniform float paramGrain;\n\nuniform float stepSizeX;\nuniform float stepSizeY;\nuniform vec2 seed;\n\nconst mediump vec3 luminanceSaturation = vec3(0.3086, 0.6094, 0.0820);\n\nvec4 exposure(vec4 color, float intensity) {\n    return vec4(color.rgb * pow(2.0, intensity), color.a);\n}\nmat4 brightnessMatrix(float brightness)\n{\n    return mat4(1, 0, 0, 0,\n                0, 1, 0, 0,\n                0, 0, 1, 0,\n                brightness, brightness, brightness, 1);\n}\n\nmat4 contrastMatrix(float contrast)\n{\n    float t = (1.0 - contrast) / 2.0;\n\n    return mat4(contrast, 0, 0, 0,\n                0, contrast, 0, 0,\n                0, 0, contrast, 0,\n                t, t, t, 1);\n}\n\nmat4 saturationMatrix(float saturation)\n{\n    float oneMinusSat = 1.0 - saturation;\n\n    vec3 red = vec3(luminanceSaturation.x * oneMinusSat);\n    red+= vec3(saturation, 0, 0);\n\n    vec3 green = vec3(luminanceSaturation.y * oneMinusSat);\n    green += vec3(0, saturation, 0);\n\n    vec3 blue = vec3(luminanceSaturation.z * oneMinusSat);\n    blue += vec3(0, 0, saturation);\n\n    return mat4(red, 0,\n                green, 0,\n                blue, 0,\n                0, 0, 0, 1);\n}\n\nvec4 temperature(vec4 color, float intensity) {\n    vec3 new_color = color.rgb;\n    new_color.r = color.r + color.r * ( 1.0 - color.r) * intensity;\n    new_color.b = color.b - color.b * ( 1.0 - color.b) * intensity;\n    if (intensity > 0.0) {\n        new_color.g = color.g + color.g * ( 1.0 - color.g) * intensity * 0.25;\n    }\n    return vec4(new_color, color.a);\n}\n\nvec4 limit_color(vec4 color) {\n    vec3 new_color = color.rgb;\n    float max_value = max(color.r, max(color.g, color.b));\n    if (max_value > 1.0) {\n        new_color /= max_value;\n    }\n    return vec4(new_color, color.a);\n}\n\nvec4 sharpness(vec4 color, float intensity) {\n    vec3 nbr_color = vec3(0.0, 0.0, 0.0);\n    vec2 coord;\n    coord.x = vTextureCoord.x - 0.5 * stepSizeX;\n    coord.y = vTextureCoord.y - stepSizeY;\n    nbr_color += texture2D(sTexture, coord).rgb - color.rgb;\n    coord.x = vTextureCoord.x - stepSizeX;\n    coord.y = vTextureCoord.y + 0.5 * stepSizeY;\n    nbr_color += texture2D(sTexture, coord).rgb - color.rgb;\n    coord.x = vTextureCoord.x + stepSizeX;\n    coord.y = vTextureCoord.y - 0.5 * stepSizeY;\n    nbr_color += texture2D(sTexture, coord).rgb - color.rgb;\n    coord.x = vTextureCoord.x + stepSizeX;\n    coord.y = vTextureCoord.y + 0.5 * stepSizeY;\n    nbr_color += texture2D(sTexture, coord).rgb - color.rgb;\n    return vec4(color.rgb - intensity * nbr_color, color.a);\n}\n\nfloat rand(vec2 loc, float intensity) {\n    float theta1 = dot(loc, vec2(0.9898, 0.233));\n    float theta2 = dot(loc, vec2(12.0, 78.0));\n    float value = cos(theta1) * sin(theta2) + sin(theta1) * cos(theta2);\n    // keep value of part1 in range: (2^-14 to 2^14).\n    float temp = mod(197.0 * value, 1.0) + value;\n    float part1 = mod(220.0 * temp, 1.0) + temp;\n    float part2 = value * 0.5453;\n    float part3 = cos(theta1 + theta2) * 0.43758;\n    float sum = (part1 + part2 + part3);\n    return fract(sum) * intensity;\n}\n\nvec4 grain(vec4 color, float intensity) {\n    float energy = 0.33333 * color.r + 0.33333 * color.g + 0.33333 * color.b;\n    float mask = (1.0 - sqrt(energy));\n    float weight = 1.0 - 1.333 * mask * intensity;\n    return vec4(color.rgb * weight, color.a) + vec4(rand(vTextureCoord + seed, intensity), rand(vTextureCoord + seed, intensity), rand(vTextureCoord + seed, intensity),1);\n}\n\nvec4 highlightShadow(vec4 col, float highlights, float shadows) {\n\n    float h = -0.3 * clamp(highlights,0.0,1.0);\n    float s = clamp(shadows,0.0,1.0) * 0.3;\n    float shad = s;\n    float darks = s * 0.3;\n    vec4 lightValues;\n    vec4 paramWeights;\n    float lum = (col.r + col.g + col.b) / 3.0;\n    lightValues.x = lum;\n    lightValues.y = lum;\n    lightValues.z = 1.0 - lum;\n    lightValues.w = 1.0 - lum;\n    lightValues.xz = (lightValues.xz - 0.25)*1.3333334;\n    lightValues.yw = 2.0*(lightValues.yw - 0.5);\n    lightValues = max(lightValues,0.0)*1.5;\n    lightValues = (3.0 - 2.0*lightValues)*lightValues*lightValues;\n    paramWeights.x = 0.0;\n    paramWeights.y = h;\n    paramWeights.z = shad;\n    paramWeights.w = darks;\n    float sum =  abs(paramWeights.y) + abs(paramWeights.z) + abs(paramWeights.w) + 1.0;\n    col.rgb += dot(lightValues,paramWeights)/sum;\n    return col;\n}\n\nvoid main() {\n    vec4 textureColor = texture2D(sTexture, vTextureCoord);\n    vec4 outputColor = textureColor;\n    \n    if (paramSharpness != 0.0) {\n        outputColor = sharpness(outputColor, paramSharpness);\n    }\n    \n    if (paramHighlight != 0.0 || paramShadow != 0.0) {\n        outputColor = highlightShadow(outputColor, paramHighlight, paramShadow);\n    }\n    if (paramExposure != 0.0) {\n        outputColor = exposure(outputColor, paramExposure);\n    }\n    if (paramBrightness != 0.0) {\n        outputColor = brightnessMatrix(paramBrightness) * outputColor;\n    }\n    if (paramContrast != 1.0) {\n        outputColor = contrastMatrix(paramContrast) * outputColor;\n    }\n    if (paramSaturation != 1.0) {\n        outputColor = saturationMatrix(paramSaturation) * outputColor;\n    }\n    if (paramTemperature != 0.0) {\n        outputColor = temperature(outputColor, paramTemperature);\n    }\n\n    if (paramGrain != 0.0) {\n        outputColor = grain(outputColor, paramGrain);\n    }\n\n    if (outputColor != textureColor) {\n        outputColor = limit_color(outputColor);\n    }\n \n    gl_FragColor = outputColor;\n}\n");
        this.q = new Correction(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.F = new Random().nextFloat();
        this.G = new Random().nextFloat();
    }

    @Override // xsna.e0u, xsna.umv
    public final void a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.D = 1.0f / i;
        this.E = 1.0f / i2;
    }

    @Override // xsna.e0u, xsna.umv
    public final void init() {
        super.init();
        this.r = f("paramExposure");
        this.s = f("paramBrightness");
        this.t = f("paramContrast");
        this.u = f("paramSaturation");
        this.v = f("paramTemperature");
        this.w = f("paramShadow");
        this.x = f("paramHighlight");
        this.y = f("paramSharpness");
        this.z = f("stepSizeX");
        this.A = f("stepSizeY");
        this.B = f("paramGrain");
        this.C = f("paramSeed");
    }

    @Override // xsna.e0u, xsna.umv
    public final void onDraw() {
        float f = this.q.b;
        int i = this.r;
        if (i != -1) {
            GLES20.glUniform1f(i, f - 0.5f);
        }
        float f2 = this.q.c;
        int i2 = this.s;
        if (i2 != -1) {
            GLES20.glUniform1f(i2, f2 - 0.5f);
        }
        float f3 = this.q.d;
        int i3 = this.t;
        if (i3 != -1) {
            float f4 = f3 + 0.5f;
            if (f4 < 1.0f) {
                f4 = 1.0f - ((1.0f - f4) * 0.65f);
            }
            GLES20.glUniform1f(i3, f4);
        }
        float f5 = this.q.e;
        int i4 = this.u;
        if (i4 != -1) {
            GLES20.glUniform1f(i4, f5 * 2.0f);
        }
        float f6 = this.q.f;
        int i5 = this.v;
        if (i5 != -1) {
            GLES20.glUniform1f(i5, f6 - 0.5f);
        }
        float f7 = this.q.g;
        int i6 = this.w;
        if (i6 != -1) {
            GLES20.glUniform1f(i6, f7 * 2.0f);
        }
        float f8 = this.q.h;
        int i7 = this.x;
        if (i7 != -1) {
            GLES20.glUniform1f(i7, f8 * 2.0f);
        }
        float f9 = this.q.j;
        int i8 = this.B;
        if (i8 != -1) {
            GLES20.glUniform1f(i8, f9 * 0.6f);
        }
        float f10 = this.q.i;
        int i9 = this.y;
        if (i9 != -1) {
            GLES20.glUniform1f(i9, (f10 - 0.5f) * 2.0f);
        }
        int i10 = this.z;
        if (i10 != -1) {
            GLES20.glUniform1f(i10, this.D);
        }
        int i11 = this.A;
        if (i11 != -1) {
            GLES20.glUniform1f(i11, this.E);
        }
        GLES20.glUniform2f(this.C, this.F, this.G);
    }
}
