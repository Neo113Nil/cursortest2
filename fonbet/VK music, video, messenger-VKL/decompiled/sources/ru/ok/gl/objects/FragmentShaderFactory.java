package ru.ok.gl.objects;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface FragmentShaderFactory {
    public static final int TRIVIAL_FRAGMENT_SHADER_ID = 0;

    public static class Default implements FragmentShaderFactory {
        @Override // ru.ok.gl.objects.FragmentShaderFactory
        public FragmentShader createFragmentShader(int i, boolean z) {
            return new TrivialFragmentShader(0, z);
        }
    }

    @NonNull
    FragmentShader createFragmentShader(int i, boolean z);
}
