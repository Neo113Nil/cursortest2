package xsna;

import android.util.Size;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.view.PreviewView;
import java.util.Objects;
import xsna.zjn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class v5d0 implements zjn0.h {
    public final /* synthetic */ PreviewView.a a;
    public final /* synthetic */ CameraInternal b;
    public final /* synthetic */ zjn0 c;

    public /* synthetic */ v5d0(PreviewView.a aVar, CameraInternal cameraInternal, zjn0 zjn0Var) {
        this.a = aVar;
        this.b = cameraInternal;
        this.c = zjn0Var;
    }

    public final void a(zjn0.g gVar) {
        PreviewView previewView = PreviewView.this;
        Objects.toString(gVar);
        boolean z = this.b.c().b().intValue() == 0;
        androidx.camera.view.c cVar = previewView.d;
        Size size = this.c.a;
        cVar.getClass();
        Objects.toString(gVar);
        Objects.toString(size);
        cVar.b = gVar.a();
        cVar.c = gVar.b();
        cVar.d = gVar.c();
        cVar.a = size;
        cVar.e = z;
        previewView.a();
    }
}
