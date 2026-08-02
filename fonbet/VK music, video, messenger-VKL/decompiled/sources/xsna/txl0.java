package xsna;

import java.io.File;

/* compiled from: StoryAudioData.kt */
/* loaded from: classes3.dex */
public final class txl0 {
    public final String a;
    public final String b;
    public File c;
    public int d;
    public int e;
    public int f;
    public float g;
    public boolean h;

    public txl0() {
        this(null, null, 255);
    }

    public txl0(String str, String str2, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 1.0f;
        this.h = true;
    }
}
