package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.feature.music.ui.holder.MusicFeedPlaceholderVh;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.view.TargetSendActionView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class rk40 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rk40(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                MusicFeedPlaceholderVh musicFeedPlaceholderVh = (MusicFeedPlaceholderVh) this.c;
                com.vk.catalog2.common.ui.mvp.util.a.e(musicFeedPlaceholderVh.c, (Context) this.d, (UIBlock) this.e, (UIBlockAction) this.f, musicFeedPlaceholderVh.d, 48);
                break;
            default:
                pq9 pq9Var = (pq9) this.c;
                Target target = (Target) this.d;
                com.vk.sharing.core.view.j jVar = (com.vk.sharing.core.view.j) this.e;
                a4o0 a4o0Var = (a4o0) this.f;
                Integer num = jVar.f;
                pq9Var.getClass();
                cvk.r(new defpackage.d0(pq9Var, target, num, 2));
                jVar.o = pq9Var.e.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new fv70(new waf0(jVar, 15), 19));
                jVar.m.b(a4o0Var, TargetSendActionView.State.CANCEL, pq9Var);
                break;
        }
        return s3q0.a;
    }
}
