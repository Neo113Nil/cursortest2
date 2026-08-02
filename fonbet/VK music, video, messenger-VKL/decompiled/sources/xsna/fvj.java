package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.mvi.binder.BinderLifecycleMode;
import com.vkontakte.android.R;
import com.vkontakte.android.sdk.SDKInviteActivity;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.h7u0;

/* compiled from: CoroutineBinder.kt */
/* loaded from: classes3.dex */
public final class fvj implements hx2 {
    public final Object b;
    public final Object c;

    public fvj(hvj hvjVar, yzs yzsVar) {
        this.b = hvjVar;
        this.c = yzsVar;
    }

    public void a(BinderLifecycleMode binderLifecycleMode, Object obj, Object obj2) {
        hvj hvjVar = (hvj) this.b;
        ArrayList arrayList = hvjVar.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((eyx) it.next()).b(null);
        }
        arrayList.clear();
        hvjVar.b = binderLifecycleMode;
        ((yzs) this.c).invoke(hvjVar, obj, obj2);
    }

    @Override // xsna.hx2
    public void b(Object obj) {
        SDKInviteActivity sDKInviteActivity = (SDKInviteActivity) this.c;
        sDKInviteActivity.w = true;
        zxg0 zxg0Var = new zxg0(sDKInviteActivity, ((Integer) obj).intValue(), (UserId) this.b);
        h7u0.a aVar = new h7u0.a(sDKInviteActivity);
        aVar.g0(R.string.sdk_invite_success_title);
        aVar.U(R.string.sdk_invite_success_message);
        aVar.W(R.string.sdk_invite_success_negative, zxg0Var);
        aVar.m();
    }

    @Override // xsna.hx2
    public void e(VKApiExecutionException vKApiExecutionException) {
        SDKInviteActivity sDKInviteActivity = (SDKInviteActivity) this.c;
        int i = SDKInviteActivity.C;
        yxg0 yxg0Var = new yxg0(sDKInviteActivity);
        h7u0.a aVar = new h7u0.a(sDKInviteActivity);
        aVar.g0(R.string.error);
        aVar.U(R.string.sdk_invite_error_message);
        aVar.c0(R.string.ok, yxg0Var);
        aVar.W(R.string.cancel, yxg0Var);
        aVar.m();
    }

    public fvj(SDKInviteActivity sDKInviteActivity, UserId userId) {
        this.c = sDKInviteActivity;
        this.b = userId;
    }
}
