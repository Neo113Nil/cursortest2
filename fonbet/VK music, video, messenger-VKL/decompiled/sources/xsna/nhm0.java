package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class nhm0 implements izs {
    public final /* synthetic */ ohm0 b;
    public final /* synthetic */ UserId c;
    public final /* synthetic */ int d;
    public final /* synthetic */ v3u0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ nhm0(ohm0 ohm0Var, UserId userId, int i, v3u0 v3u0Var, int i2, int i3, int i4, int i5) {
        this.b = ohm0Var;
        this.c = userId;
        this.d = i;
        this.e = v3u0Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ohm0 ohm0Var = this.b;
        phm0 phm0Var = ohm0Var.a;
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            StoryUserProfile storyUserProfile = (StoryUserProfile) next;
            UserId userId = storyUserProfile.c;
            ohm0Var.d.getClass();
            UserId userId2 = storyUserProfile.c;
            String str = storyUserProfile.e;
            String str2 = storyUserProfile.d;
            Image image = storyUserProfile.O;
            String str3 = storyUserProfile.h;
            boolean d = storyUserProfile.d();
            Iterator it2 = it;
            boolean z = storyUserProfile.h0;
            Integer num = storyUserProfile.i0;
            VerifyInfo verifyInfo = storyUserProfile.B;
            arrayList.add(new shm0(i, this.c, this.d, userId, new rhm0(userId2, str, str2, image, str3, d, z, num, verifyInfo.b, verifyInfo.c, verifyInfo.d)));
            i = i2;
            it = it2;
        }
        io.reactivex.rxjava3.internal.operators.completable.e a = phm0Var.a(arrayList);
        zhm0 zhm0Var = ohm0Var.b;
        v3u0 v3u0Var = this.e;
        return io.reactivex.rxjava3.core.a.n(a, zhm0Var.c(new bim0(v3u0Var.a, v3u0Var.b, this.f, this.g, this.h, this.i)));
    }
}
