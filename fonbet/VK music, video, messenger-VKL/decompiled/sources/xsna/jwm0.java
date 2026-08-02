package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.SocialButtonType;
import com.vkontakte.android.data.FriendsUtils;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class jwm0 implements izs {
    public final /* synthetic */ izs b;
    public final /* synthetic */ UserId c;
    public final /* synthetic */ kwm0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ SocialButtonType g;

    public /* synthetic */ jwm0(izs izsVar, UserId userId, kwm0 kwm0Var, boolean z, Context context, SocialButtonType socialButtonType) {
        this.b = izsVar;
        this.c = userId;
        this.d = kwm0Var;
        this.e = z;
        this.f = context;
        this.g = socialButtonType;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        Integer num = (Integer) obj;
        izs izsVar = this.b;
        UserId userId = this.c;
        if (izsVar != null) {
            izsVar.invoke(userId);
        }
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                i = 3;
            } else if (intValue != 4) {
                i = 0;
            }
            FriendsUtils.d(i, userId);
            if (this.e && i == 1) {
                zvm0.k(this.d, this.f, null, this.g != SocialButtonType.FOLLOW, false, 10);
            }
            return s3q0.a;
        }
        i = 1;
        FriendsUtils.d(i, userId);
        if (this.e) {
            zvm0.k(this.d, this.f, null, this.g != SocialButtonType.FOLLOW, false, 10);
        }
        return s3q0.a;
    }
}
