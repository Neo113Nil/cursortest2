package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.movika.sdk.base.ui.i0;
import com.vk.movika.sdk.player.base.model.PlayerItemVariant;
import java.util.ArrayList;
import java.util.Collection;
import ru.ok.android.commons.http.Http;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ovm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ovm0(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
        this.f = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        sht0 sht0Var;
        switch (this.b) {
            case 0:
                ClipsAuthor clipsAuthor = (ClipsAuthor) this.d;
                uvm0 uvm0Var = (uvm0) this.e;
                Long l = (Long) this.f;
                AdminLeaveAction adminLeaveAction = (AdminLeaveAction) obj;
                clipsAuthor.f = 0;
                uvm0Var.f(clipsAuthor);
                uvm0.a(clipsAuthor);
                uvm0Var.b(false);
                io.reactivex.rxjava3.disposables.b bVar = uvm0Var.e;
                io.reactivex.rxjava3.core.q m = hg1.m(o0r0.e(xwk.e(), clipsAuthor.b.b, null, null, adminLeaveAction, 6).a0(io.reactivex.rxjava3.android.schedulers.a.b()), uvm0Var.a, 0L, false, 62);
                int i = this.c;
                bVar.b(m.subscribe(new t6m0(new eqm(i, 1, uvm0Var, clipsAuthor, l), 1), new eiy(new pvm0(uvm0Var, clipsAuthor, i, l), 20)));
                break;
            default:
                opt0 opt0Var = (opt0) this.d;
                com.vk.movika.sdk.player.base.model.a aVar = (com.vk.movika.sdk.player.base.model.a) this.e;
                i0.c cVar = (i0.c) this.f;
                VideoFile videoFile = (VideoFile) obj;
                String str = opt0Var.a;
                if (videoFile == null) {
                    cVar.b(aVar, new NullPointerException("Can not resolve VideoFile"));
                } else {
                    opt0Var.b.put(String.valueOf(videoFile.o0()), videoFile);
                    m7q e = gpt0.e(gpt0.a, videoFile, -4, str, false, true, null, videoFile.r(), false, Http.StatusCode.RANGE_NOT_SATISFIABLE);
                    ArrayList arrayList = new ArrayList(aVar.d);
                    arrayList.set(this.c, new PlayerItemVariant(String.valueOf((e == null || (sht0Var = e.e) == null) ? null : sht0Var.b), opt0.g, null, null, null));
                    String str2 = aVar.a;
                    String str3 = aVar.b;
                    com.vk.movika.sdk.player.base.model.a aVar2 = new com.vk.movika.sdk.player.base.model.a(str2, str3, aVar.c, arrayList);
                    lpt0 lpt0Var = new lpt0(str3, videoFile.Y6(), videoFile.a1());
                    opt0Var.f = j5g.v0(lpt0Var, (Collection) opt0Var.f);
                    qr0 qr0Var = opt0Var.e;
                    if (qr0Var != null) {
                        qr0Var.invoke(lpt0Var);
                    }
                    cVar.a(aVar2);
                }
                break;
        }
        return s3q0.a;
    }
}
