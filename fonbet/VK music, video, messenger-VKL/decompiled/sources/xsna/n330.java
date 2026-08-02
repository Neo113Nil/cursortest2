package xsna;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.fragments.debug.NetworkImagesStatTestFragment;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n330 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n330(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
        this.f = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        lj30 lj30Var;
        RecyclerView recyclerView;
        switch (this.b) {
            case 0:
                ((com.vk.ml.b) this.d).b((LinkedList) this.e, (List) obj, this.c, (izs) this.f);
                return s3q0.a;
            case 1:
                String str = (String) this.d;
                String[] strArr = (String[]) this.e;
                String str2 = (String) this.f;
                e0w e0wVar = (e0w) obj;
                Cursor d = e0wVar.d(str, strArr);
                ArrayList arrayList = new ArrayList(d.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (d.moveToFirst()) {
                            while (!d.isAfterLast()) {
                                arrayList.add(com.vk.im.engine.internal.storage.delegates.messages.a.a(d));
                                d.moveToNext();
                            }
                        }
                        Trace.endSection();
                        d = e0wVar.d(str2, strArr);
                        ArrayList arrayList2 = new ArrayList(d.getCount());
                        Trace.beginSection(ndp0.f("Cursor.forEach"));
                        try {
                            try {
                                if (d.moveToFirst()) {
                                    while (!d.isAfterLast()) {
                                        arrayList2.add(com.vk.im.engine.internal.storage.delegates.messages.a.a(d));
                                        d.moveToNext();
                                    }
                                }
                                Trace.endSection();
                                boolean isEmpty = arrayList.isEmpty();
                                int i = this.c;
                                lj30 lj30Var2 = null;
                                if (isEmpty) {
                                    lj30Var = null;
                                } else {
                                    lj30Var = (lj30) arrayList.get(0);
                                    lj30 lj30Var3 = (lj30) j5g.b0(1, arrayList);
                                    if (i == lj30Var.d) {
                                        lj30Var = lj30Var3;
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                    lj30 lj30Var4 = (lj30) arrayList2.get(0);
                                    lj30Var2 = i == lj30Var4.d ? (lj30) j5g.b0(1, arrayList2) : lj30Var4;
                                }
                                return new uz50(lj30Var, lj30Var2);
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            default:
                NetworkImagesStatTestFragment.a aVar = (NetworkImagesStatTestFragment.a) this.d;
                NetworkImagesStatTestFragment.c cVar = (NetworkImagesStatTestFragment.c) this.e;
                NetworkImagesStatTestFragment networkImagesStatTestFragment = (NetworkImagesStatTestFragment) this.f;
                Bitmap bitmap = (Bitmap) obj;
                aVar.l.setAdjustViewBounds(true);
                aVar.l.setImageBitmap(bitmap);
                boolean[] zArr = cVar.c;
                int i2 = this.c;
                zArr[i2] = true;
                int[] iArr = cVar.d;
                iArr[i2] = bitmap.getHeight();
                int i3 = cVar.e;
                if (i3 == i2 - 1 || i3 == i2) {
                    cVar.e = i2;
                    int i4 = 0;
                    while (cVar.e < NetworkImagesStatTestFragment.P.size()) {
                        boolean[] zArr2 = cVar.c;
                        int i5 = cVar.e;
                        if (zArr2[i5]) {
                            cVar.e = i5 + 1;
                            i4 += iArr[i5] + 40;
                        } else {
                            recyclerView = networkImagesStatTestFragment.N;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            recyclerView.scrollBy(0, i4);
                        }
                    }
                    recyclerView = networkImagesStatTestFragment.N;
                    if (recyclerView == null) {
                    }
                    recyclerView.scrollBy(0, i4);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ n330(String str, int i, String str2, String[] strArr) {
        this.b = 1;
        this.d = str;
        this.e = strArr;
        this.f = str2;
        this.c = i;
    }
}
