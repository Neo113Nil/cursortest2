package ru.ok.gl.objects;

import xsna.i5s;

/* loaded from: classes9.dex */
public final class TrivialFragmentShader extends FragmentShader {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TrivialFragmentShader(int i, boolean z) {
        super(i, i5s.a(r0, z ? "samplerExternalOES" : "sampler2D", " sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"), true);
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "#extension GL_OES_EGL_image_external : require\n" : "");
        sb.append("precision mediump float;\nvarying vec2 vTextureCoord;\nuniform ");
    }
}
