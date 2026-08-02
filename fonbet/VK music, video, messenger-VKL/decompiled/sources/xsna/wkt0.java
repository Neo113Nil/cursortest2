package xsna;

import android.view.View;
import android.widget.CheckBox;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.tooltips.VideoTooltip;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.c99;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wkt0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wkt0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                VideoTooltip videoTooltip = (VideoTooltip) this.c;
                VideoTooltip.b bVar = (VideoTooltip.b) this.d;
                videoTooltip.getClass();
                return VideoTooltip.a((View) obj, bVar);
            case 1:
                String str = (String) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                qyg0 V0 = ((hyg0) obj).V0(str);
                try {
                    Iterator it = arrayList.iterator();
                    int i = 1;
                    while (it.hasNext()) {
                        V0.bindLong(i, ((UserId) it.next()).b);
                        i++;
                    }
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            default:
                wmw0 wmw0Var = (wmw0) this.c;
                CheckBox checkBox = (CheckBox) this.d;
                m99 m99Var = wmw0Var.g1;
                if (m99Var != null) {
                    m99Var.b(new c99.o(checkBox.isChecked()));
                }
                wmw0Var.dismiss();
                return s3q0.a;
        }
    }

    public /* synthetic */ wkt0(String str, ArrayList arrayList, w8w0 w8w0Var) {
        this.b = 1;
        this.c = str;
        this.d = arrayList;
    }
}
