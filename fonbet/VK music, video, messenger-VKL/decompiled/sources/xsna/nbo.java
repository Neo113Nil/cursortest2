package xsna;

import com.vk.catalog.mvi.block.BlockId;
import java.util.ArrayList;

/* compiled from: DownloadedSliderView.kt */
/* loaded from: classes.dex */
public final class nbo implements r2a {
    public final String b;
    public final String c;
    public final ArrayList d;
    public final xvy e;
    public final boolean f;

    public nbo() {
        throw null;
    }

    public nbo(String str, String str2, ArrayList arrayList, xvy xvyVar, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = xvyVar;
        this.f = z;
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return BlockId.Simple.a(this.b);
    }
}
