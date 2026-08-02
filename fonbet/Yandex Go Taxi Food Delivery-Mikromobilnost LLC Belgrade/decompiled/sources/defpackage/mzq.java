package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class mzq extends i93 {
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mzq(AssetManager assetManager, String str, int i) {
        super(0, str, assetManager);
        this.x = i;
    }

    @Override // defpackage.gog
    public final Class a() {
        switch (this.x) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.i93
    public final void f(Object obj) {
        switch (this.x) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // defpackage.i93
    public final Object h(AssetManager assetManager, String str) {
        switch (this.x) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
