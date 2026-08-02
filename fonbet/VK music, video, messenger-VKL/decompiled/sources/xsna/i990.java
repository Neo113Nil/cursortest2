package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.Image;

/* compiled from: PageItem.kt */
/* loaded from: classes5.dex */
public final class i990 {
    public final String a;
    public final FragmentImpl b;
    public final int c;
    public String d;
    public Image e;

    public i990(String str, FragmentImpl fragmentImpl, int i, String str2, Image image) {
        this.a = str;
        this.b = fragmentImpl;
        this.c = i;
        this.d = str2;
        this.e = image;
    }

    public final FragmentImpl a() {
        return this.b;
    }

    public final void b(Image image) {
        this.e = image;
    }

    public final void c(String str) {
        this.d = str;
    }

    public /* synthetic */ i990(String str, FragmentImpl fragmentImpl, int i) {
        this(str, fragmentImpl, i, "", null);
    }
}
