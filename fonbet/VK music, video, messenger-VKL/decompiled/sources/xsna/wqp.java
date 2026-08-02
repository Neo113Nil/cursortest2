package xsna;

import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class wqp implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ UserId c;

    public /* synthetic */ wqp(UserId userId, int i) {
        this.b = i;
        this.c = userId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (xsna.epx.f(r1 != null ? r1.b : null, r2) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (xsna.epx.f(r5 != null ? r5.b : null, r2) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        if (xsna.epx.f((r1 == null || (r1 = r1.o) == null) ? null : r1.b, r2) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
    
        if (xsna.epx.f(r5 != null ? r5.h : null, r2) != false) goto L45;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                u1c0 u1c0Var = (u1c0) obj;
                Parcelable parcelable = u1c0Var.b;
                boolean z2 = parcelable instanceof l490;
                UserId userId = this.c;
                if (z2) {
                    Owner s = ((l490) parcelable).s();
                    break;
                }
                Parcelable parcelable2 = u1c0Var.a;
                if (parcelable2 instanceof l490) {
                    Owner s2 = ((l490) parcelable2).s();
                    break;
                }
                boolean z3 = parcelable instanceof Post;
                if (!z3 || !epx.f(((Post) parcelable).m, userId)) {
                    if (z3) {
                        Post post = ((Post) parcelable).D;
                        break;
                    }
                    if (z3) {
                        Caption caption = ((Post) parcelable).x;
                        break;
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                z = true;
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(epx.f(((kym0) obj).b, this.c));
        }
    }
}
