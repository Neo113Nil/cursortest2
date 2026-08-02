package defpackage;

import androidx.camera.view.PreviewView;
import androidx.camera.view.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class bye0 implements aa3, ims {
    public final /* synthetic */ a a;

    public /* synthetic */ bye0(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.aa3
    public euy apply(Object obj) {
        return this.a.d.h();
    }

    @Override // defpackage.ims
    /* renamed from: apply, reason: collision with other method in class */
    public Object mo104apply(Object obj) {
        this.a.b(PreviewView.StreamState.STREAMING);
        return null;
    }
}
