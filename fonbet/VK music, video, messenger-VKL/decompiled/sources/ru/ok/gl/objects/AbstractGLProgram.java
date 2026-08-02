package ru.ok.gl.objects;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public abstract class AbstractGLProgram extends GLProgram {
    private static final String VERTEX_SOURCE = "precision mediump float;\nuniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute vec4 aVertexCoord;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = mvpMatrix * aVertexCoord;\n   vTextureCoord = (texMatrix * aTextureCoord).xy;\n}\n";

    public AbstractGLProgram(@NonNull String str) {
        super(VERTEX_SOURCE, str, true);
    }

    public AbstractGLProgram(@NonNull String str, @NonNull String str2) {
        super(str, str2, true);
    }

    public AbstractGLProgram(@NonNull String str, boolean z) {
        super(VERTEX_SOURCE, str, z);
    }
}
