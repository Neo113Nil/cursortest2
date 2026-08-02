package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.dto.common.ImageSize;
import com.vk.dto.push.FriendRequestInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class d870 implements izs {
    public final /* synthetic */ ImageSize b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Bitmap d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ int f;
    public final /* synthetic */ float g;
    public final /* synthetic */ Map h;
    public final /* synthetic */ FriendRequestInfo i;

    public /* synthetic */ d870(ImageSize imageSize, ArrayList arrayList, Bitmap bitmap, Context context, int i, float f, Map map, FriendRequestInfo friendRequestInfo) {
        this.b = imageSize;
        this.c = arrayList;
        this.d = bitmap;
        this.e = context;
        this.f = i;
        this.g = f;
        this.h = map;
        this.i = friendRequestInfo;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        Bitmap bitmap;
        Object[] objArr = (Object[]) obj;
        ArrayList arrayList = new ArrayList();
        ImageSize imageSize = this.b;
        Bitmap bitmap2 = this.d;
        if (imageSize != null) {
            Object O = rl3.O(objArr);
            Bitmap bitmap3 = O instanceof Bitmap ? (Bitmap) O : null;
            if (bitmap3 == bitmap2) {
                bitmap3 = null;
            }
            i = 1;
            bitmap = bitmap3;
        } else {
            i = 0;
            bitmap = null;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (((ImageSize) it.next()) == null) {
                arrayList.add(bitmap2);
            } else {
                if (i >= objArr.length) {
                    break;
                }
                Object obj2 = objArr[i];
                Bitmap bitmap4 = obj2 instanceof Bitmap ? (Bitmap) obj2 : null;
                if (bitmap4 == null) {
                    bitmap4 = bitmap2;
                }
                arrayList.add(bitmap4);
                i++;
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        Context context = this.e;
        return new djs(context, this.h, bitmap, isEmpty ? null : z4g.d().N(context, this.f, arrayList, this.g), this.i);
    }
}
