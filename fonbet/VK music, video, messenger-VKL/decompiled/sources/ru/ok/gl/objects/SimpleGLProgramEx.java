package ru.ok.gl.objects;

/* loaded from: classes9.dex */
public class SimpleGLProgramEx extends AbstractGLProgram {
    private static final String FRAGMENT_SOURCE = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}";

    public SimpleGLProgramEx() {
        super(FRAGMENT_SOURCE);
    }

    @Override // ru.ok.gl.objects.GLProgram
    public int getTarget() {
        return 36197;
    }
}
