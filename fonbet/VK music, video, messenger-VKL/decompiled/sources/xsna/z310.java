package xsna;

import android.media.MediaMetadataRetriever;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.MarketItemType;
import com.vk.media.MediaUtils;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.p410;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class z310 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z310(long j, Object obj, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
        this.e = obj2;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [T, android.graphics.Bitmap] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                a410 a410Var = (a410) this.d;
                UserId userId = (UserId) this.e;
                p410.d dVar = (p410.d) obj;
                mzp0 mzp0Var = a410Var.i;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                if (dVar.n == MarketItemType.OZON && !dVar.i.isEmpty()) {
                    a410Var.h.a(this.c, userId.b);
                }
                a410Var.T(dVar);
                break;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                MediaUtils.d dVar2 = (MediaUtils.d) this.e;
                ref$ObjectRef.element = MediaUtils.a.i(this.c, (MediaMetadataRetriever) obj, dVar2);
                break;
        }
        return s3q0.a;
    }
}
