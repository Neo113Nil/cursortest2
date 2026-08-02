package ru.ok.gl.objects;

import xsna.ro2;

/* loaded from: classes9.dex */
public class SimpleGLProgram extends AbstractGLProgram {
    private static final String FRAGMENT_SOURCE = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float texAlpha;\nvoid main() {\n   vec4 tempColor = texture2D(sTexture, vTextureCoord);\n   tempColor *= texAlpha;\n   gl_FragColor = tempColor;\n}";

    public SimpleGLProgram() {
        super(FRAGMENT_SOURCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$copyTexture$0(FrameBuffer frameBuffer) {
        setTextureId(frameBuffer.getTextureId());
    }

    public void copyTexture(FrameBuffer frameBuffer, FrameBuffer frameBuffer2) {
        frameBuffer2.render(this, new ro2(4, this, frameBuffer));
    }

    @Override // ru.ok.gl.objects.GLProgram
    public int getTarget() {
        return 3553;
    }

    public SimpleGLProgram(String str) {
        super(str);
    }

    public SimpleGLProgram(String str, String str2) {
        super(str, str2);
    }
}
