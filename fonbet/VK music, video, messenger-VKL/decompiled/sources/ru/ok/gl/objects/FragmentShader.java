package ru.ok.gl.objects;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class FragmentShader extends AbstractGLProgram {
    private String fragmentSource;
    private int height;
    public final int id;
    private int width;

    public FragmentShader(int i, @NonNull String str, boolean z) {
        super(str, z);
        this.fragmentSource = str;
        this.id = i;
    }

    public final int getHeight() {
        return this.height;
    }

    public String getSource() {
        return this.fragmentSource;
    }

    @Override // ru.ok.gl.objects.GLProgram
    public int getTarget() {
        return 3553;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setSize(int i, int i2) {
        if (i == this.width && i2 == this.height) {
            return;
        }
        this.height = i2;
        this.width = i;
        updateLocations(i, i2);
    }

    public void usePart() {
    }

    public void initPart(int i) {
    }

    public void prepareTextures(Context context) {
    }

    public void updateLocations(int i, int i2) {
    }
}
