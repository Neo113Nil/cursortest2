package xsna;

import android.graphics.Rect;
import android.view.ViewGroup;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.hfz;

/* compiled from: FoldersShowVhBase.kt */
/* loaded from: classes18.dex */
public abstract class o2s<T extends hfz> extends vfz<Object> implements usx0 {
    public o2s(int i, ViewGroup viewGroup) {
        super(tf3.b(viewGroup, i, viewGroup, false));
    }

    @Override // xsna.jsx0
    public final boolean H4() {
        return true;
    }

    @Override // xsna.usx0
    public boolean M1() {
        return this instanceof azr;
    }

    public List<Rect> V3() {
        return EmptyList.b;
    }

    public List<Rect> p2() {
        return EmptyList.b;
    }
}
