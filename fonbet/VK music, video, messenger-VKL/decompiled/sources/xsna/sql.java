package xsna;

import com.vk.api.generated.uxpolls.dto.UxpollsAnswerDto;
import com.vk.stat.scheme.CommonUxpollsStat$TypeUxpollsEvent;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;

/* compiled from: DefaultVideoDynamicPollStatDelegate.kt */
/* loaded from: classes16.dex */
public final class sql implements mis0 {
    public final Lazy<b25> a;
    public final String b = "video";
    public final String c = "vk_video";
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();

    public sql(Lazy lazy) {
        this.a = lazy;
    }

    @Override // xsna.mis0
    public final void a(String str, jis0 jis0Var) {
        long j = this.a.getValue().c().b;
        List m = e43.m(str);
        ufx ufxVar = new ufx("uxpolls.get", new zzq0(2), new jgj0(6));
        ufxVar.e = "no-cache";
        ufx.l(ufxVar, "ext_user_id", j, 8);
        ufxVar.h("triggers", m);
        String str2 = this.b;
        if (str2 != null) {
            ufx.n(ufxVar, "project", str2, 0, 12);
        }
        String str3 = this.c;
        if (str3 != null) {
            ufx.n(ufxVar, "notifier", str3, 0, 12);
        }
        this.d.b(rsg0.D0(yfb.x(ufxVar)).subscribe(new rx0(new nw6(jis0Var, 6), 18)));
    }

    @Override // xsna.mis0
    public final void b(String str, String str2, Integer num, ikr0 ikr0Var) {
        xy2 d;
        a6r0 a6r0Var = new a6r0();
        long j = this.a.getValue().c().b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        d = a6r0Var.d(j, str3, "ANSWER", this.b, (r29 & 16) != 0 ? null : this.c, num, (r29 & 64) != 0 ? null : null, null, null, null, null, (r29 & 2048) != 0 ? null : str, (r29 & 4096) != 0 ? null : Collections.singletonList(new UxpollsAnswerDto(ikr0Var.b.intValue(), Collections.singletonList(ikr0Var.a), ikr0Var.d)));
        this.d.b(yfb.x(d).p());
    }

    @Override // xsna.mis0
    public final void c(CommonUxpollsStat$TypeUxpollsEvent.EventType eventType, Integer num, String str, String str2) {
        xy2 d;
        d = new a6r0().d(this.a.getValue().c().b, str2 == null ? "" : str2, eventType.name(), this.b, (r29 & 16) != 0 ? null : this.c, num, (r29 & 64) != 0 ? null : null, null, null, null, null, (r29 & 2048) != 0 ? null : str, (r29 & 4096) != 0 ? null : null);
        this.d.b(yfb.x(d).p());
    }

    @Override // xsna.mis0
    public final void destroy() {
        this.d.dispose();
    }
}
