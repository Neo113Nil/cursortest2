package com.yandex.passport.internal.ui.autologin;

import com.yandex.passport.internal.ui.domik.common.BaseSmsFragment;
import com.yandex.passport.internal.ui.social.gimap.GimapIdentifierFragment;
import com.yandex.passport.internal.ui.util.j;
import defpackage.pq60;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements pq60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pq60
    public final void a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((AutoLoginRetryActivity) obj2).onError(((Boolean) obj).booleanValue());
                break;
            case 1:
                ((BaseSmsFragment) obj2).lambda$onViewCreated$3((Boolean) obj);
                break;
            case 2:
                ((GimapIdentifierFragment) obj2).lambda$onCreateView$1((GimapIdentifierFragment.State) obj);
                break;
            default:
                j jVar = (j) obj2;
                if (obj != null) {
                    jVar.a(obj);
                    break;
                }
                break;
        }
    }
}
