package xsna;

import android.content.res.ColorStateList;
import android.widget.ImageView;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.clips_grid_block.domain.RetryLimitExceededException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.jbe;
import xsna.lgj0;
import xsna.r1r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class hbe implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hbe(int i, String str) {
        this.b = 4;
        this.c = i;
        this.d = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                jbe jbeVar = (jbe) this.d;
                io.reactivex.rxjava3.subjects.d<jbe.a> dVar = jbeVar.b;
                jbe.a aVar = (jbe.a) obj;
                List<SdkClipVideoFile> list = aVar.a;
                boolean z = aVar.c;
                String str = aVar.b;
                if (list.size() >= 4) {
                    List<SdkClipVideoFile> list2 = list;
                    List H0 = j5g.H0(list2, 4);
                    dVar.onNext(new jbe.a(j5g.S(list2, 4), str, z));
                    return io.reactivex.rxjava3.core.x.k(H0);
                }
                int i = this.c;
                if (i >= 3) {
                    return io.reactivex.rxjava3.core.x.i(new RetryLimitExceededException(0));
                }
                if (z) {
                    dVar.onNext(new jbe.a(EmptyList.b, null, false));
                    return jbeVar.a(i);
                }
                wbe wbeVar = jbeVar.a;
                return new io.reactivex.rxjava3.internal.operators.single.r(wbeVar.a.a(lgj0.a.i(new ogj0(), 12, str, wbeVar.c, null, null, null, wbeVar.d, null, null, null, null, 32696)).l(new ux0(new td5(wbeVar.b, 6), 16)), new y34(new ibe(jbeVar, aVar, i), 12));
            case 1:
                ((wzs) this.d).invoke(Integer.valueOf(this.c), (izs) obj);
                return s3q0.a;
            case 2:
                ((ImageView) obj).setImageTintList(ColorStateList.valueOf(((kkm) this.d).f(this.c)));
                return s3q0.a;
            case 3:
                yi50 yi50Var = (yi50) this.d;
                List list3 = (List) obj;
                ArrayList arrayList = yi50Var.i;
                int h = e43.h(list3);
                int i2 = this.c;
                if (i2 > h) {
                    return io.reactivex.rxjava3.core.x.k(new jks(null, EmptyList.b, false));
                }
                int i3 = i2 + 30;
                int size = list3.size();
                if (i3 > size) {
                    i3 = size;
                }
                return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.w0(yfb.x(r1r0.a.b(yi50Var.d, list3.subList(i2, i3), arrayList, null, null, 58))), new m40(new mgz(yi50Var, 13), 29));
            case 4:
                int i4 = this.c;
                String str2 = (String) this.d;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE playlist SET downloading_state = ? WHERE pid = ?");
                try {
                    V0.bindLong(1, i4);
                    V0.D3(2, str2);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            default:
                ((i8l0) this.d).d(this.c, (List) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ hbe(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
