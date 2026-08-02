package xsna;

import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.dto.common.VideoFile;
import java.util.HashSet;

/* compiled from: CompositeDynamicLibListener.kt */
/* loaded from: classes11.dex */
public final class bti implements vpo, zxf0 {
    public final Object a;

    public bti(vpo... vpoVarArr) {
        this.a = vpoVarArr;
    }

    @Override // xsna.vpo
    public void a(DynamicTask dynamicTask, int i, long j) {
        vpo[] vpoVarArr = (vpo[]) this.a;
        for (int i2 = 0; i2 < 2; i2++) {
            vpoVarArr[i2].a(dynamicTask, i, j);
        }
    }

    @Override // xsna.vpo
    public void b(DynamicTask dynamicTask, int i, long j) {
        vpo[] vpoVarArr = (vpo[]) this.a;
        for (int i2 = 0; i2 < 2; i2++) {
            vpoVarArr[i2].b(dynamicTask, i, j);
        }
    }

    @Override // xsna.vpo
    public void c(DynamicTask dynamicTask, int i) {
        vpo[] vpoVarArr = (vpo[]) this.a;
        for (int i2 = 0; i2 < 2; i2++) {
            vpoVarArr[i2].c(dynamicTask, i);
        }
    }

    @Override // xsna.vpo
    public void d(DynamicTask dynamicTask, int i, long j) {
        vpo[] vpoVarArr = (vpo[]) this.a;
        for (int i2 = 0; i2 < 2; i2++) {
            vpoVarArr[i2].d(dynamicTask, i, j);
        }
    }

    @Override // xsna.zxf0
    public boolean e(VideoFile videoFile) {
        return videoFile != null && ((HashSet) this.a).contains(Integer.valueOf(videoFile.o0()));
    }

    public bti() {
        this.a = new HashSet();
    }
}
