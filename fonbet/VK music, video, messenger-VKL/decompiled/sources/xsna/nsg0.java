package xsna;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import xsna.uwe0;

/* compiled from: RustoreSeamlessInstallService.kt */
/* loaded from: classes15.dex */
public final class nsg0 implements ServiceConnection {
    public final /* synthetic */ osg0 b;
    public final /* synthetic */ l1i c;
    public final /* synthetic */ bjk d;

    /* compiled from: RustoreSeamlessInstallService.kt */
    public static final class a extends fnv {
        public final /* synthetic */ osg0 b;
        public final /* synthetic */ l1i e;
        public final /* synthetic */ bjk f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(osg0 osg0Var, l1i l1iVar, bjk bjkVar) {
            super(1);
            this.b = osg0Var;
            this.e = l1iVar;
            this.f = bjkVar;
            attachInterface(this, "ru.vk.provider.install.rapid.RapidTokenCallback");
        }
    }

    public nsg0(osg0 osg0Var, l1i l1iVar, bjk bjkVar) {
        this.b = osg0Var;
        this.c = l1iVar;
        this.d = bjkVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        uwe0 uwe0Var;
        par0.a.getClass();
        par0.a("DefaultClientSeamlessInstallFlow On service connected");
        bjk bjkVar = this.d;
        osg0 osg0Var = this.b;
        l1i l1iVar = this.c;
        a aVar = new a(osg0Var, l1iVar, bjkVar);
        int i = uwe0.a.a;
        if (iBinder == null) {
            uwe0Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.provider.install.rapid.RapidTokenProvider");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof uwe0)) {
                uwe0.a.C3840a c3840a = new uwe0.a.C3840a();
                c3840a.a = iBinder;
                uwe0Var = c3840a;
            } else {
                uwe0Var = (uwe0) queryLocalInterface;
            }
        }
        try {
            uwe0Var.c0(aVar);
        } catch (Throwable th) {
            par0 par0Var = par0.a;
            String str = "DefaultClientSeamlessInstallFlow Rustore provider.get failed: " + th.getMessage();
            par0Var.getClass();
            par0.a(str);
            osg0Var.b.i();
            osg0Var.a();
            l1iVar.invoke();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        par0.a.getClass();
        par0.a("DefaultClientSeamlessInstallFlow On service disconnected");
    }
}
