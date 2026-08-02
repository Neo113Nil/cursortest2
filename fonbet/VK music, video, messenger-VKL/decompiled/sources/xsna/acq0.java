package xsna;

import com.vk.catalog.mvi.block.BlockId;
import java.util.ArrayList;

/* compiled from: UploadListView.kt */
/* loaded from: classes.dex */
public final class acq0 implements r2a {
    public final String b;
    public final ArrayList c;

    public acq0() {
        throw null;
    }

    public acq0(String str, ArrayList arrayList) {
        this.b = str;
        this.c = arrayList;
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return BlockId.Simple.a(this.b);
    }
}
