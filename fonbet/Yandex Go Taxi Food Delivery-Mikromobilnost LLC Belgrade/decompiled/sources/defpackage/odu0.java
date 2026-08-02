package defpackage;

import android.content.Context;
import com.yandex.messaging.core.net.entities.StickerPacksData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.a;

/* loaded from: classes15.dex */
public final class odu0 {
    public final at2 a;
    public final Context b;
    public final i3y c;
    public final i3y d;
    public final zq60 e = new zq60();

    public odu0(at2 at2Var, Context context) {
        this.a = at2Var;
        this.b = context;
        final int i = 0;
        this.c = a.a(new sls(this) { // from class: ndu0
            public final /* synthetic */ odu0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                odu0 odu0Var = this.b;
                switch (i2) {
                    case 0:
                        return odu0Var.a.Z();
                    default:
                        return odu0Var.a.u();
                }
            }
        });
        final int i2 = 1;
        this.d = a.a(new sls(this) { // from class: ndu0
            public final /* synthetic */ odu0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                odu0 odu0Var = this.b;
                switch (i22) {
                    case 0:
                        return odu0Var.a.Z();
                    default:
                        return odu0Var.a.u();
                }
            }
        });
    }

    public final StickerPacksData.PackData a(String str) {
        gcu0 e = b().e(str);
        if (e == null) {
            return null;
        }
        List g = b().g(str);
        if (g.isEmpty()) {
            return null;
        }
        StickerPacksData.PackData packData = new StickerPacksData.PackData();
        packData.title = e.d;
        packData.description = e.e;
        packData.coverId = e.c;
        packData.packId = e.b;
        List<ubu0> list = g;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (ubu0 ubu0Var : list) {
            StickerPacksData.StickerData stickerData = new StickerPacksData.StickerData();
            stickerData.stickerId = ubu0Var.a;
            stickerData.text = ubu0Var.d;
            arrayList.add(stickerData);
        }
        packData.stickers = (StickerPacksData.StickerData[]) arrayList.toArray(new StickerPacksData.StickerData[0]);
        return packData;
    }

    public final gdu0 b() {
        return (gdu0) this.c.getValue();
    }

    public final vcu0 c() {
        i3y i3yVar = this.d;
        return new vcu0(((rdu0) i3yVar.getValue()).d(), ((rdu0) i3yVar.getValue()).c(), this.b);
    }

    public final void d(String[] strArr) {
        boolean z;
        String[] h = b().h();
        if (!Arrays.equals(strArr, h)) {
            this.a.P(new lxo0(21, h, this, strArr));
        }
        ((rdu0) this.d.getValue()).i(strArr);
        zq60 zq60Var = this.e;
        zq60Var.getClass();
        ArrayList arrayList = zq60Var.a;
        zq60Var.b++;
        int size = arrayList.size();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                return;
            }
            while (i < size && arrayList.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            } else {
                ((x6f0) ((qdt) arrayList.get(i)).a).d(zy11.a);
                i++;
            }
        }
    }
}
