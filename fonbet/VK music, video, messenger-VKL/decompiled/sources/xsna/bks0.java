package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.dto.common.VideoFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class bks0 implements izs {
    public final /* synthetic */ dks0 b;
    public final /* synthetic */ VideoFile c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ bks0(dks0 dks0Var, VideoFile videoFile, String str, boolean z) {
        this.b = dks0Var;
        this.c = videoFile;
        this.d = str;
        this.e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[LOOP:1: B:26:0x0054->B:40:?, LOOP_END, SYNTHETIC] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean booleanValue;
        UIBlockList uIBlockList = (UIBlockList) obj;
        VideoFile videoFile = this.c;
        String str = this.d;
        boolean z = false;
        izs yjs0Var = videoFile == null ? new yjs0(0) : new bks0(this.b, videoFile, str, z);
        if (this.e) {
            List<String> list = uIBlockList.h;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (epx.f((String) it.next(), str)) {
                        break;
                    }
                }
            }
        }
        ArrayList<UIBlock> arrayList = uIBlockList.y;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator<T> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                UIBlock uIBlock = (UIBlock) it2.next();
                if (uIBlock instanceof UIBlockVideo) {
                    if (str != null) {
                        List<String> list2 = uIBlock.h;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it3 = list2.iterator();
                            while (it3.hasNext()) {
                                if (epx.f((String) it3.next(), str)) {
                                }
                            }
                        }
                        booleanValue = false;
                        if (booleanValue) {
                            z = true;
                            break;
                        }
                    }
                    if (epx.f(((UIBlockVideo) uIBlock).B.a1(), videoFile.a1())) {
                        booleanValue = true;
                        if (booleanValue) {
                        }
                    }
                    booleanValue = false;
                    if (booleanValue) {
                    }
                } else {
                    if (uIBlock instanceof UIBlockList) {
                        booleanValue = ((Boolean) yjs0Var.invoke(uIBlock)).booleanValue();
                        if (booleanValue) {
                        }
                    }
                    booleanValue = false;
                    if (booleanValue) {
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
