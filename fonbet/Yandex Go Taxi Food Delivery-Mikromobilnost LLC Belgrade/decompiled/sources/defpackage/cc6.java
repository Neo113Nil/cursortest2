package defpackage;

import android.view.ViewGroup;

/* loaded from: classes12.dex */
public final /* synthetic */ class cc6 implements g18 {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ cc6(ViewGroup viewGroup, boolean z, boolean z2) {
        this.a = viewGroup;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.g18
    public final void cancel() {
        ViewGroup viewGroup = this.a;
        viewGroup.setClipChildren(this.b);
        viewGroup.setClipToPadding(this.c);
    }
}
